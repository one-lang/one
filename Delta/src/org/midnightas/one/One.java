package org.midnightas.one;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.io.FileUtils;
import org.midnightas.one.parsing.OneBaseVisitor;
import org.midnightas.one.parsing.OneLexer;
import org.midnightas.one.parsing.OneParser;
import org.midnightas.one.parsing.OneParser.ArrayContext;
import org.midnightas.one.parsing.OneParser.ArrayIndexSugarContext;
import org.midnightas.one.parsing.OneParser.BlockContext;
import org.midnightas.one.parsing.OneParser.ExprAtomSugarContext;
import org.midnightas.one.parsing.OneParser.ExprContext;
import org.midnightas.one.parsing.OneParser.ExprStatementContext;
import org.midnightas.one.parsing.OneParser.FuncCallSugarContext;
import org.midnightas.one.parsing.OneParser.FuncDeclContext;
import org.midnightas.one.parsing.OneParser.IdentifierContext;
import org.midnightas.one.parsing.OneParser.IfStatementContext;
import org.midnightas.one.parsing.OneParser.NumberContext;
import org.midnightas.one.parsing.OneParser.OpExprContext;
import org.midnightas.one.parsing.OneParser.ParenExprContext;
import org.midnightas.one.parsing.OneParser.ProgramContext;
import org.midnightas.one.parsing.OneParser.ReturnStatementContext;
import org.midnightas.one.parsing.OneParser.SetVarStatementContext;
import org.midnightas.one.parsing.OneParser.SimpleExprContext;
import org.midnightas.one.parsing.OneParser.StatementContext;
import org.midnightas.one.parsing.OneParser.StatementsContext;
import org.midnightas.one.parsing.OneParser.StringContext;

public class One {

	public static final String INTERNAL_VALUE_VAR = "$_value", TO_STRING_NAME = "visualise", EQUALS_NAME = "equals";

	public static List<OneInstance> EMPTY_ARGS = new ArrayList<OneInstance>();
	public static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	public static BigInteger TWO = BigInteger.valueOf(2);

	public static boolean codegolf = false;

	public List<Scope> scopes = new ArrayList<Scope>();
	public Visitor visitors = new Visitor(this);

	public One() {
		Scope scope = new Scope();
		scope.vars.put(codegolf ? "p" : "print", new Function() {
			@Override
			public Object call(List<OneInstance> args) {
				args.forEach(instance -> System.out.print(instance));
				System.out.println();
				return null;
			}
		});
		scope.vars.put(codegolf ? "P" : "print_chars", new Function() {
			@SuppressWarnings("unchecked")
			@Override
			public Object call(List<OneInstance> args) {
				for (OneInstance instance : args) {
					if (instance instanceof OneArray) {
						for (OneInstance number : (List<OneInstance>) instance.vars.get(INTERNAL_VALUE_VAR)) {
							System.out.print((char) ((BigInteger) number.vars.get(INTERNAL_VALUE_VAR)).intValue());
						}
					} else
						System.out.print((char) ((BigInteger) instance.vars.get(INTERNAL_VALUE_VAR)).intValue());
				}
				System.out.println();
				return null;
			}
		});
		scope.vars.put(codegolf ? "i" : "input", new Function() {
			@Override
			public Object call(List<OneInstance> args) {
				try {
					return stringToOneInstance(stdin.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
				return BigInteger.ZERO;
			}
		});
		scope.vars.put(codegolf ? "I" : "to_int", new Function() {
			@Override
			public Object call(List<OneInstance> args) {
				return bigIntegerToOneInstance(new BigInteger(oneArrayToString((OneArray) args.get(0))));
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
	
	public void read(String code) {
		OneParser parser = new OneParser(new CommonTokenStream(new OneLexer(new ANTLRInputStream(code.trim()))));
		parser.setBuildParseTree(true);
		visitors.visit(parser.program());
	}
	
	public static One create() {
		return new One();
	}

	public static class Visitor extends OneBaseVisitor<VarContainer> {

		public One one;

		public Visitor(One one) {
			this.one = one;
		}

		public VarContainer visitProgram(ProgramContext ctx) {
			return visit(ctx.statements());
		}

		public VarContainer visitStatements(StatementsContext ctx) {
			ctx.funcDecl().forEach(funcDecl -> visit(funcDecl));
			for (StatementContext stmt : ctx.statement())
				if (stmt instanceof ReturnStatementContext)
					return visit(stmt);
				else
					visit(stmt);
			return null;
		}

		public VarContainer visitExprStatement(ExprStatementContext ctx) {
			return visit(ctx.expr());
		}

		public VarContainer visitSetVarStatement(SetVarStatementContext ctx) {
			OneInstance setTo = (OneInstance) visit(ctx.expr());
			one.setVar(ctx.identifier().getText(), setTo);
			return setTo;
		}

		public VarContainer visitIfStatement(IfStatementContext ctx) {
			BigInteger result = ((BigInteger) visit(ctx.expr()).vars.get(INTERNAL_VALUE_VAR)).mod(One.TWO);
			if (result.compareTo(BigInteger.ONE) == 0)
				visit(ctx.yes);
			else if (ctx.no != null)
				visit(ctx.no);
			return null;
		}

		public VarContainer visitReturnStatement(ReturnStatementContext ctx) {
			return visit(ctx.expr());
		}

		public VarContainer visitBlock(BlockContext ctx) {
			return visit(ctx.statements());
		}

		public VarContainer visitFuncDecl(FuncDeclContext ctx) {
			Function f = new Function() {
				@Override
				public Object call(List<OneInstance> args) {
					Scope scope = new Scope();
					for (int i = 0; i < args.size(); i++)
						scope.vars.put(ctx.funcDeclArgs().identifier(i).getText(), args.get(i));
					one.scopes.add(0, scope);
					VarContainer toReturn = visit(ctx.block());
					one.scopes.remove(0);
					return toReturn;
				}
			};
			if (ctx.identifier() != null)
				one.setVar(ctx.identifier().getText(), f);
			return f;
		}

		public VarContainer visitOpExpr(OpExprContext ctx) {
			Object left = visit(ctx.left).vars.get(INTERNAL_VALUE_VAR);
			Object right = visit(ctx.right).vars.get(INTERNAL_VALUE_VAR);
			BigInteger result = null;
			switch (ctx.op.getText()) {
			case "+":
				result = ((BigInteger) left).add((BigInteger) right);
				break;
			case "-":
				result = ((BigInteger) left).subtract((BigInteger) right);
				break;
			case "*":
				result = ((BigInteger) left).multiply((BigInteger) right);
				break;
			case "/":
				result = ((BigInteger) left).divide((BigInteger) right);
				break;
			case "%":
				result = ((BigInteger) left).mod((BigInteger) right);
				break;
			case "==":
				result = One.equals(left, right) ? BigInteger.ONE : BigInteger.ZERO;
			}
			return bigIntegerToOneInstance(result);
		}

		public VarContainer visitParenExpr(ParenExprContext ctx) {
			return visit(ctx.expr());
		}

		@SuppressWarnings("unchecked")
		public VarContainer visitSimpleExpr(SimpleExprContext ctx) {
			VarContainer container = visit(ctx.exprAtom());
			for (ExprAtomSugarContext sugar : ctx.exprAtomSugar()) {
				if (sugar instanceof FuncCallSugarContext) {
					List<OneInstance> args = new ArrayList<OneInstance>();
					for (ExprContext expr : ((FuncCallSugarContext) sugar).funcCallArgs().expr()) {
						args.add((OneInstance) visit(expr));
					}
					container = (OneInstance) ((Function) container).call(args);
				} else if (sugar instanceof ArrayIndexSugarContext) {
					int index = ((BigInteger) ((OneInstance) visit(((ArrayIndexSugarContext) sugar).expr())).vars
							.get(INTERNAL_VALUE_VAR)).intValue() - 1;
					container = (OneInstance) ((List<OneInstance>) ((OneArray) container).vars
							.get(INTERNAL_VALUE_VAR)).get(index);
				}
			}
			return container;
		}

		public VarContainer visitIdentifier(IdentifierContext ctx) {
			return (VarContainer) one.getVar(ctx.getText());
		}

		public VarContainer visitNumber(NumberContext ctx) {
			return bigIntegerToOneInstance(ctx.value);
		}

		public VarContainer visitString(StringContext ctx) {
			return stringToOneInstance(ctx.value);
		}

		public VarContainer visitArray(ArrayContext ctx) {
			List<OneInstance> list = new ArrayList<OneInstance>();
			for (ExprContext expr : ctx.expr())
				list.add((OneInstance) visit(expr));
			return listToOneArray(list);
		}
	}

	public static OneArray listToOneArray(List<OneInstance> list) {
		OneArray array = new OneArray();
		array.vars.put(INTERNAL_VALUE_VAR, list);
		return array;
	}

	public static OneArray stringToOneInstance(String str) {
		List<OneInstance> list = new ArrayList<OneInstance>();
		OneArray array = new OneArray();
		for (char c : str.toCharArray())
			list.add(bigIntegerToOneInstance(BigInteger.valueOf(c)));
		array.vars.put(INTERNAL_VALUE_VAR, list);
		return array;
	}

	@SuppressWarnings("unchecked")
	public static String oneArrayToString(OneArray array) {
		List<OneInstance> list = (List<OneInstance>) array.vars.get(INTERNAL_VALUE_VAR);
		char[] chars = new char[list.size()];
		for (int i = 0; i < chars.length; i++)
			chars[i] = (char) ((BigInteger) list.get(i).vars.get(INTERNAL_VALUE_VAR)).intValue();
		return new String(chars);
	}

	public static OneInstance bigIntegerToOneInstance(BigInteger big) {
		OneInstance instance = new OneInstance(OneClasses.NUMBER);
		instance.vars.put(INTERNAL_VALUE_VAR, big);
		return instance;
	}

	@SuppressWarnings("unchecked")
	public static boolean equals(Object o, Object o2) {
		if (o instanceof BigInteger && o2 instanceof BigInteger)
			return ((BigInteger) o).compareTo((BigInteger) o2) == 0;
		else if (o instanceof OneInstance && o2 instanceof OneInstance) {
			OneInstance d = (OneInstance) o;
			OneInstance d2 = (OneInstance) o2;
			if (d.vars.containsKey(EQUALS_NAME))
				return (Boolean) ((Function) d.vars.get(EQUALS_NAME)).call(arrayToList(d2));
			else
				return equals(d.vars.get(INTERNAL_VALUE_VAR), d2.vars.get(INTERNAL_VALUE_VAR));
		} else if (o instanceof ArrayList && o2 instanceof ArrayList) {
			ArrayList<Object> l = (ArrayList<Object>) o;
			ArrayList<Object> l2 = (ArrayList<Object>) o2;
			if (l.size() != l2.size())
				return false;
			for (int i = 0; i < l.size(); i++)
				if (!equals(l.get(i), l2.get(i))) {
					return false;
				}
			return true;
		}
		return o.equals(o2);
	}

	@SafeVarargs
	public static <T> List<T> arrayToList(T... t) {
		return Arrays.asList(t);
	}

	public static final void main(String[] args) throws Exception {
		One one = One.create();
		
		Options options = new Options();
		options.addOption("f", "file", true, "The file to interpret.");
		options.addOption("g", "codegolf", false, "Code golf mode");
		CommandLine commandline = new DefaultParser().parse(options, args);
		if (commandline.hasOption("g"))
			codegolf = true;
		if (commandline.hasOption("f")) {
			one.read(FileUtils.readFileToString(new File(commandline.getOptionValue("f"))));
		} else if (stdin.ready()) {
			String code = "";
			int i = 0;
			while((i = stdin.read()) != -1)
				code += (char) i;
			System.out.println(code);
			one.read(code);
		}
	}

}
