// Generated from Delta.g4 by ANTLR 4.5.3
package org.midnightas.delta.parsing;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DeltaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		IDENTIFIER=18, NUMBER=19, STRING=20, WHITESPACE=21;
	public static final int
		RULE_program = 0, RULE_funcDecl = 1, RULE_statement = 2, RULE_expr = 3, 
		RULE_exprAtomSugar = 4, RULE_exprAtom = 5, RULE_block = 6, RULE_funcCallArgs = 7, 
		RULE_funcDeclArgs = 8, RULE_array = 9, RULE_identifier = 10, RULE_string = 11, 
		RULE_number = 12;
	public static final String[] ruleNames = {
		"program", "funcDecl", "statement", "expr", "exprAtomSugar", "exprAtom", 
		"block", "funcCallArgs", "funcDeclArgs", "array", "identifier", "string", 
		"number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'\n'", "'func'", "'('", "')'", "'='", "'%'", "'*'", "'/'", 
		"'+'", "'-'", "'['", "']'", "'->'", "'{'", "'}'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "IDENTIFIER", "NUMBER", "STRING", 
		"WHITESPACE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Delta.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DeltaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<TerminalNode> EOF() { return getTokens(DeltaParser.EOF); }
		public TerminalNode EOF(int i) {
			return getToken(DeltaParser.EOF, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<FuncDeclContext> funcDecl() {
			return getRuleContexts(FuncDeclContext.class);
		}
		public FuncDeclContext funcDecl(int i) {
			return getRuleContext(FuncDeclContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaListener ) ((DeltaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaListener ) ((DeltaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaVisitor ) return ((DeltaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__11) | (1L << IDENTIFIER) | (1L << NUMBER) | (1L << STRING))) != 0)) {
				{
				{
				setState(28);
				switch (_input.LA(1)) {
				case T__3:
				case T__11:
				case IDENTIFIER:
				case NUMBER:
				case STRING:
					{
					setState(26);
					statement();
					}
					break;
				case T__2:
					{
					setState(27);
					funcDecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(30);
				_la = _input.LA(1);
				if ( !(((((_la - -1)) & ~0x3f) == 0 && ((1L << (_la - -1)) & ((1L << (EOF - -1)) | (1L << (T__0 - -1)) | (1L << (T__1 - -1)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncDeclContext extends ParserRuleContext {
		public FuncDeclArgsContext funcDeclArgs() {
			return getRuleContext(FuncDeclArgsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FuncDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaListener ) ((DeltaListener)listener).enterFuncDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaListener ) ((DeltaListener)listener).exitFuncDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaVisitor ) return ((DeltaVisitor<? extends T>)visitor).visitFuncDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDeclContext funcDecl() throws RecognitionException {
		FuncDeclContext _localctx = new FuncDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(T__2);
			setState(39);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(38);
				identifier();
				}
			}

			setState(41);
			match(T__3);
			setState(42);
			funcDeclArgs();
			setState(43);
			match(T__4);
			setState(44);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprStatementContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaListener ) ((DeltaListener)listener).enterExprStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaListener ) ((DeltaListener)listener).exitExprStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaVisitor ) return ((DeltaVisitor<? extends T>)visitor).visitExprStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetVarStatementContext extends StatementContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SetVarStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaListener ) ((DeltaListener)listener).enterSetVarStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaListener ) ((DeltaListener)listener).exitSetVarStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaVisitor ) return ((DeltaVisitor<? extends T>)visitor).visitSetVarStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new ExprStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				expr(0);
				}
				break;
			case 2:
				_localctx = new SetVarStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				identifier();
				setState(48);
				match(T__5);
				setState(49);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleExprContext extends ExprContext {
		public ExprAtomContext exprAtom() {
			return getRuleContext(ExprAtomContext.class,0);
		}
		public List<ExprAtomSugarContext> exprAtomSugar() {
			return getRuleContexts(ExprAtomSugarContext.class);
		}
		public ExprAtomSugarContext exprAtomSugar(int i) {
			return getRuleContext(ExprAtomSugarContext.class,i);
		}
		public SimpleExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaListener ) ((DeltaListener)listener).enterSimpleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaListener ) ((DeltaListener)listener).exitSimpleExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaVisitor ) return ((DeltaVisitor<? extends T>)visitor).visitSimpleExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpExprContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OpExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaListener ) ((DeltaListener)listener).enterOpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaListener ) ((DeltaListener)listener).exitOpExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaVisitor ) return ((DeltaVisitor<? extends T>)visitor).visitOpExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaListener ) ((DeltaListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaListener ) ((DeltaListener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaVisitor ) return ((DeltaVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new SimpleExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(54);
				exprAtom();
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(55);
						exprAtomSugar();
						}
						} 
					}
					setState(60);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				}
				break;
			case 2:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				match(T__3);
				setState(62);
				expr(0);
				setState(63);
				match(T__4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(73);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new OpExprContext(new ExprContext(_parentctx, _parentState));
						((OpExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(67);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(68);
						((OpExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
							((OpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(69);
						((OpExprContext)_localctx).right = expr(5);
						}
						break;
					case 2:
						{
						_localctx = new OpExprContext(new ExprContext(_parentctx, _parentState));
						((OpExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(70);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(71);
						((OpExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__9 || _la==T__10) ) {
							((OpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(72);
						((OpExprContext)_localctx).right = expr(4);
						}
						break;
					}
					} 
				}
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprAtomSugarContext extends ParserRuleContext {
		public ExprAtomSugarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAtomSugar; }
	 
		public ExprAtomSugarContext() { }
		public void copyFrom(ExprAtomSugarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayIndexSugarContext extends ExprAtomSugarContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrayIndexSugarContext(ExprAtomSugarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaListener ) ((DeltaListener)listener).enterArrayIndexSugar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaListener ) ((DeltaListener)listener).exitArrayIndexSugar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaVisitor ) return ((DeltaVisitor<? extends T>)visitor).visitArrayIndexSugar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCallSugarContext extends ExprAtomSugarContext {
		public FuncCallArgsContext funcCallArgs() {
			return getRuleContext(FuncCallArgsContext.class,0);
		}
		public FuncCallSugarContext(ExprAtomSugarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaListener ) ((DeltaListener)listener).enterFuncCallSugar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaListener ) ((DeltaListener)listener).exitFuncCallSugar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaVisitor ) return ((DeltaVisitor<? extends T>)visitor).visitFuncCallSugar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAtomSugarContext exprAtomSugar() throws RecognitionException {
		ExprAtomSugarContext _localctx = new ExprAtomSugarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_exprAtomSugar);
		try {
			setState(86);
			switch (_input.LA(1)) {
			case T__11:
				_localctx = new ArrayIndexSugarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(T__11);
				setState(79);
				expr(0);
				setState(80);
				match(T__12);
				}
				break;
			case T__3:
				_localctx = new FuncCallSugarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(T__3);
				setState(83);
				funcCallArgs();
				setState(84);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprAtomContext extends ParserRuleContext {
		public ExprAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAtom; }
	 
		public ExprAtomContext() { }
		public void copyFrom(ExprAtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayAtomContext extends ExprAtomContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ArrayAtomContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaListener ) ((DeltaListener)listener).enterArrayAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaListener ) ((DeltaListener)listener).exitArrayAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaVisitor ) return ((DeltaVisitor<? extends T>)visitor).visitArrayAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierAtomContext extends ExprAtomContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierAtomContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaListener ) ((DeltaListener)listener).enterIdentifierAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaListener ) ((DeltaListener)listener).exitIdentifierAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaVisitor ) return ((DeltaVisitor<? extends T>)visitor).visitIdentifierAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringAtomContext extends ExprAtomContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public StringAtomContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaListener ) ((DeltaListener)listener).enterStringAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaListener ) ((DeltaListener)listener).exitStringAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaVisitor ) return ((DeltaVisitor<? extends T>)visitor).visitStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberAtomContext extends ExprAtomContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumberAtomContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaListener ) ((DeltaListener)listener).enterNumberAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaListener ) ((DeltaListener)listener).exitNumberAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaVisitor ) return ((DeltaVisitor<? extends T>)visitor).visitNumberAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaAtomContext extends ExprAtomContext {
		public FuncDeclArgsContext funcDeclArgs() {
			return getRuleContext(FuncDeclArgsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LambdaAtomContext(ExprAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaListener ) ((DeltaListener)listener).enterLambdaAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaListener ) ((DeltaListener)listener).exitLambdaAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaVisitor ) return ((DeltaVisitor<? extends T>)visitor).visitLambdaAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAtomContext exprAtom() throws RecognitionException {
		ExprAtomContext _localctx = new ExprAtomContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_exprAtom);
		try {
			setState(98);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new NumberAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				number();
				}
				break;
			case T__11:
				_localctx = new ArrayAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				array();
				}
				break;
			case IDENTIFIER:
				_localctx = new IdentifierAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				identifier();
				}
				break;
			case STRING:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				string();
				}
				break;
			case T__3:
				_localctx = new LambdaAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(92);
				match(T__3);
				setState(93);
				funcDeclArgs();
				setState(94);
				match(T__4);
				setState(95);
				match(T__13);
				setState(96);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaListener ) ((DeltaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaListener ) ((DeltaListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaVisitor ) return ((DeltaVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__14);
			setState(101);
			program();
			setState(102);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncCallArgsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FuncCallArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCallArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaListener ) ((DeltaListener)listener).enterFuncCallArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaListener ) ((DeltaListener)listener).exitFuncCallArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaVisitor ) return ((DeltaVisitor<? extends T>)visitor).visitFuncCallArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallArgsContext funcCallArgs() throws RecognitionException {
		FuncCallArgsContext _localctx = new FuncCallArgsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcCallArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__11) | (1L << IDENTIFIER) | (1L << NUMBER) | (1L << STRING))) != 0)) {
				{
				setState(104);
				expr(0);
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(105);
					match(T__16);
					setState(106);
					expr(0);
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncDeclArgsContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public FuncDeclArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDeclArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaListener ) ((DeltaListener)listener).enterFuncDeclArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaListener ) ((DeltaListener)listener).exitFuncDeclArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaVisitor ) return ((DeltaVisitor<? extends T>)visitor).visitFuncDeclArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDeclArgsContext funcDeclArgs() throws RecognitionException {
		FuncDeclArgsContext _localctx = new FuncDeclArgsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funcDeclArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(114);
				identifier();
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(115);
					match(T__16);
					setState(116);
					identifier();
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaListener ) ((DeltaListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaListener ) ((DeltaListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaVisitor ) return ((DeltaVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__11);
			setState(125);
			expr(0);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(126);
				match(T__16);
				setState(127);
				expr(0);
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DeltaParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaListener ) ((DeltaListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaListener ) ((DeltaListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaVisitor ) return ((DeltaVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public String value;
		public Token STRING;
		public TerminalNode STRING() { return getToken(DeltaParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaListener ) ((DeltaListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaListener ) ((DeltaListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaVisitor ) return ((DeltaVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			((StringContext)_localctx).STRING = match(STRING);
			 ((StringContext)_localctx).value =  ((StringContext)_localctx).STRING.getText().substring(1, ((StringContext)_localctx).STRING.getText().length() - 1); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public java.math.BigInteger value;
		public Token NUMBER;
		public TerminalNode NUMBER() { return getToken(DeltaParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaListener ) ((DeltaListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeltaListener ) ((DeltaListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeltaVisitor ) return ((DeltaVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			((NumberContext)_localctx).NUMBER = match(NUMBER);
			 ((NumberContext)_localctx).value =  new java.math.BigInteger(((NumberContext)_localctx).NUMBER.getText()); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\27\u0092\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\5\2\37\n\2\3\2\3\2\7\2#\n\2\f"+
		"\2\16\2&\13\2\3\3\3\3\5\3*\n\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\5\4\66\n\4\3\5\3\5\3\5\7\5;\n\5\f\5\16\5>\13\5\3\5\3\5\3\5\3\5\5\5D\n"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5L\n\5\f\5\16\5O\13\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6Y\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7e\n\7"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\tn\n\t\f\t\16\tq\13\t\5\ts\n\t\3\n\3\n"+
		"\3\n\7\nx\n\n\f\n\16\n{\13\n\5\n}\n\n\3\13\3\13\3\13\3\13\7\13\u0083\n"+
		"\13\f\13\16\13\u0086\13\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\2\3\b\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\5\3\3\3\4\3\2\t\13\3"+
		"\2\f\r\u0096\2$\3\2\2\2\4\'\3\2\2\2\6\65\3\2\2\2\bC\3\2\2\2\nX\3\2\2\2"+
		"\fd\3\2\2\2\16f\3\2\2\2\20r\3\2\2\2\22|\3\2\2\2\24~\3\2\2\2\26\u0089\3"+
		"\2\2\2\30\u008b\3\2\2\2\32\u008e\3\2\2\2\34\37\5\6\4\2\35\37\5\4\3\2\36"+
		"\34\3\2\2\2\36\35\3\2\2\2\37 \3\2\2\2 !\t\2\2\2!#\3\2\2\2\"\36\3\2\2\2"+
		"#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\3\3\2\2\2&$\3\2\2\2\')\7\5\2\2(*\5\26"+
		"\f\2)(\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\7\6\2\2,-\5\22\n\2-.\7\7\2\2./\5"+
		"\16\b\2/\5\3\2\2\2\60\66\5\b\5\2\61\62\5\26\f\2\62\63\7\b\2\2\63\64\5"+
		"\b\5\2\64\66\3\2\2\2\65\60\3\2\2\2\65\61\3\2\2\2\66\7\3\2\2\2\678\b\5"+
		"\1\28<\5\f\7\29;\5\n\6\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=D\3\2"+
		"\2\2><\3\2\2\2?@\7\6\2\2@A\5\b\5\2AB\7\7\2\2BD\3\2\2\2C\67\3\2\2\2C?\3"+
		"\2\2\2DM\3\2\2\2EF\f\6\2\2FG\t\3\2\2GL\5\b\5\7HI\f\5\2\2IJ\t\4\2\2JL\5"+
		"\b\5\6KE\3\2\2\2KH\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\t\3\2\2\2OM"+
		"\3\2\2\2PQ\7\16\2\2QR\5\b\5\2RS\7\17\2\2SY\3\2\2\2TU\7\6\2\2UV\5\20\t"+
		"\2VW\7\7\2\2WY\3\2\2\2XP\3\2\2\2XT\3\2\2\2Y\13\3\2\2\2Ze\5\32\16\2[e\5"+
		"\24\13\2\\e\5\26\f\2]e\5\30\r\2^_\7\6\2\2_`\5\22\n\2`a\7\7\2\2ab\7\20"+
		"\2\2bc\5\16\b\2ce\3\2\2\2dZ\3\2\2\2d[\3\2\2\2d\\\3\2\2\2d]\3\2\2\2d^\3"+
		"\2\2\2e\r\3\2\2\2fg\7\21\2\2gh\5\2\2\2hi\7\22\2\2i\17\3\2\2\2jo\5\b\5"+
		"\2kl\7\23\2\2ln\5\b\5\2mk\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2ps\3\2"+
		"\2\2qo\3\2\2\2rj\3\2\2\2rs\3\2\2\2s\21\3\2\2\2ty\5\26\f\2uv\7\23\2\2v"+
		"x\5\26\f\2wu\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z}\3\2\2\2{y\3\2\2\2"+
		"|t\3\2\2\2|}\3\2\2\2}\23\3\2\2\2~\177\7\16\2\2\177\u0084\5\b\5\2\u0080"+
		"\u0081\7\23\2\2\u0081\u0083\5\b\5\2\u0082\u0080\3\2\2\2\u0083\u0086\3"+
		"\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0087\u0088\7\17\2\2\u0088\25\3\2\2\2\u0089\u008a\7\24"+
		"\2\2\u008a\27\3\2\2\2\u008b\u008c\7\26\2\2\u008c\u008d\b\r\1\2\u008d\31"+
		"\3\2\2\2\u008e\u008f\7\25\2\2\u008f\u0090\b\16\1\2\u0090\33\3\2\2\2\21"+
		"\36$)\65<CKMXdory|\u0084";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}