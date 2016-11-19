package org.midnightas.delta;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.midnightas.delta.parsing.DeltaBaseVisitor;
import org.midnightas.delta.parsing.DeltaLexer;
import org.midnightas.delta.parsing.DeltaParser;
import org.midnightas.delta.parsing.DeltaParser.ArrayContext;
import org.midnightas.delta.parsing.DeltaParser.ArrayIndexSugarContext;
import org.midnightas.delta.parsing.DeltaParser.ExprAtomSugarContext;
import org.midnightas.delta.parsing.DeltaParser.ExprContext;
import org.midnightas.delta.parsing.DeltaParser.ExprStatementContext;
import org.midnightas.delta.parsing.DeltaParser.FuncCallSugarContext;
import org.midnightas.delta.parsing.DeltaParser.IdentifierContext;
import org.midnightas.delta.parsing.DeltaParser.NumberContext;
import org.midnightas.delta.parsing.DeltaParser.OpExprContext;
import org.midnightas.delta.parsing.DeltaParser.ParenExprContext;
import org.midnightas.delta.parsing.DeltaParser.ProgramContext;
import org.midnightas.delta.parsing.DeltaParser.SetVarStatementContext;
import org.midnightas.delta.parsing.DeltaParser.SimpleExprContext;
import org.midnightas.delta.parsing.DeltaParser.StringContext;

public class Delta {

	public static final String INTERNAL_VALUE_VAR = "$_value", TO_STRING_NAME = "visualise";

	public static List<DeltaInstance> EMPTY_ARGS = new ArrayList<DeltaInstance>();

	public List<Scope> scopes = new ArrayList<Scope>();

	public Delta() {
		Scope scope = new Scope();
		scope.vars.put("print", new Function() {
			@Override
			public Object call(List<DeltaInstance> args) {
				args.forEach(instance -> System.out.print(instance));
				System.out.println();
				return null;
			}
		});
		scope.vars.put("printChars", new Function() {
			@SuppressWarnings("unchecked")
			@Override
			public Object call(List<DeltaInstance> args) {
				for (DeltaInstance instance : args) {
					if (instance instanceof DeltaArray) {
						for (DeltaInstance number : (List<DeltaInstance>) instance.vars.get(INTERNAL_VALUE_VAR)) {
							System.out.print((char) ((BigInteger) number.vars.get(INTERNAL_VALUE_VAR)).intValue());
						}
					} else
						System.out.print((char) ((BigInteger) instance.vars.get(INTERNAL_VALUE_VAR)).intValue());
				}
				System.out.println();
				return null;
			}
		});
		scopes.add(scope);
	}

	public Object getVar(String name) {
		for (int i = 0; i < scopes.size(); i++)
			if (scopes.get(i).vars.containsKey(name))
				return scopes.get(i).vars.get(name);
		return null;
	}

	public void setVar(String name, Object o) {
		for (int i = 0; i < scopes.size(); i++)
			if (scopes.get(i).vars.containsKey(name)) {
				scopes.get(i).vars.put(name, o);
				return;
			}
		scopes.get(0).vars.put(name, o);
	}

	public static void read(String code) {
		DeltaParser parser = new DeltaParser(new CommonTokenStream(new DeltaLexer(new ANTLRInputStream(code))));
		parser.setBuildParseTree(true);
		new Visitor(new Delta()).visit(parser.program());
	}

	public static class Visitor extends DeltaBaseVisitor<VarContainer> {

		public Delta delta;

		public Visitor(Delta delta) {
			this.delta = delta;
		}

		public VarContainer visitProgram(ProgramContext ctx) {
			ctx.statement().forEach(stmt -> visit(stmt));
			return null;
		}

		public VarContainer visitExprStatement(ExprStatementContext ctx) {
			return visit(ctx.expr());
		}

		public VarContainer visitSetVarStatement(SetVarStatementContext ctx) {
			DeltaInstance setTo = (DeltaInstance) visit(ctx.expr());
			delta.setVar(ctx.identifier().getText(), setTo);
			return setTo;
		}

		public VarContainer visitOpExpr(OpExprContext ctx) {
			BigInteger left = (BigInteger) visit(ctx.left).vars.get(INTERNAL_VALUE_VAR);
			BigInteger right = (BigInteger) visit(ctx.right).vars.get(INTERNAL_VALUE_VAR);
			BigInteger result = null;
			switch (ctx.op.getText()) {
			case "+":
				result = left.add(right);
				break;
			case "-":
				result = left.subtract(right);
				break;
			case "*":
				result = left.multiply(right);
				break;
			case "/":
				result = left.divide(right);
				break;
			case "%":
				result = left.mod(right);
				break;
			}
			return bigIntegerToDeltaInstance(result);
		}

		public VarContainer visitParenExpr(ParenExprContext ctx) {
			return visit(ctx.expr());
		}

		@SuppressWarnings("unchecked")
		public VarContainer visitSimpleExpr(SimpleExprContext ctx) {
			VarContainer container = visit(ctx.exprAtom());
			for (ExprAtomSugarContext sugar : ctx.exprAtomSugar()) {
				if (sugar instanceof FuncCallSugarContext) {
					List<DeltaInstance> args = new ArrayList<DeltaInstance>();
					for (ExprContext expr : ((FuncCallSugarContext) sugar).funcCallArgs().expr()) {
						args.add((DeltaInstance) visit(expr));
					}
					container = (DeltaInstance) ((Function) container).call(args);
				} else if (sugar instanceof ArrayIndexSugarContext) {
					int index = ((BigInteger) ((DeltaInstance) visit(((ArrayIndexSugarContext) sugar).expr())).vars
							.get(INTERNAL_VALUE_VAR)).intValue() - 1;
					container = (DeltaInstance) ((List<DeltaInstance>) ((DeltaArray) container).vars
							.get(INTERNAL_VALUE_VAR)).get(index);
				}
			}
			return container;
		}

		public VarContainer visitIdentifier(IdentifierContext ctx) {
			return (VarContainer) delta.getVar(ctx.getText());
		}

		public VarContainer visitNumber(NumberContext ctx) {
			return bigIntegerToDeltaInstance(ctx.value);
		}

		public VarContainer visitString(StringContext ctx) {
			return stringToDeltaInstance(ctx.value);
		}

		public VarContainer visitArray(ArrayContext ctx) {
			List<DeltaInstance> list = new ArrayList<DeltaInstance>();
			for (ExprContext expr : ctx.expr())
				list.add((DeltaInstance) visit(expr));
			return listToDeltaArray(list);
		}
	}

	public static DeltaArray listToDeltaArray(List<DeltaInstance> list) {
		DeltaArray array = new DeltaArray();
		array.vars.put(INTERNAL_VALUE_VAR, list);
		return array;
	}

	public static DeltaArray stringToDeltaInstance(String str) {
		List<DeltaInstance> list = new ArrayList<DeltaInstance>();
		DeltaArray array = new DeltaArray();
		for (char c : str.toCharArray())
			list.add(bigIntegerToDeltaInstance(BigInteger.valueOf(c)));
		array.vars.put(INTERNAL_VALUE_VAR, list);
		return array;
	}

	public static DeltaInstance bigIntegerToDeltaInstance(BigInteger big) {
		DeltaInstance instance = new DeltaInstance(DeltaClasses.NUMBER);
		instance.vars.put(INTERNAL_VALUE_VAR, big);
		return instance;
	}

	public static final void main(String[] args) {
		Delta.read("someVar = 5\nprint(someVar + 2)");
	}

}
