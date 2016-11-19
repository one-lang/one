// Generated from Delta.g4 by ANTLR 4.5.3
package org.midnightas.delta.parsing;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DeltaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, IDENTIFIER=15, NUMBER=16, 
		STRING=17, WHITESPACE=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "DIGIT", "IDENTIFIER", "NUMBER", 
		"STRING", "WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'func'", "'('", "')'", "'%'", "'*'", "'/'", "'+'", "'-'", "'['", 
		"']'", "'->'", "'{'", "'}'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "IDENTIFIER", "NUMBER", "STRING", "WHITESPACE"
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


	public DeltaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Delta.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\24m\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\6\21M\n\21\r\21\16\21N\3\22\6\22R\n\22"+
		"\r\22\16\22S\3\22\3\22\6\22X\n\22\r\22\16\22Y\5\22\\\n\22\3\23\3\23\7"+
		"\23`\n\23\f\23\16\23c\13\23\3\23\3\23\3\24\6\24h\n\24\r\24\16\24i\3\24"+
		"\3\24\2\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\2!\21#\22%\23\'\24\3\2\7\3\2\62;\6\2&&C\\aac|\4\2$$))"+
		"\3\2$$\5\2\13\f\17\17\"\"q\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5.\3\2\2\2\7\60\3\2"+
		"\2\2\t\62\3\2\2\2\13\64\3\2\2\2\r\66\3\2\2\2\178\3\2\2\2\21:\3\2\2\2\23"+
		"<\3\2\2\2\25>\3\2\2\2\27@\3\2\2\2\31C\3\2\2\2\33E\3\2\2\2\35G\3\2\2\2"+
		"\37I\3\2\2\2!L\3\2\2\2#Q\3\2\2\2%]\3\2\2\2\'g\3\2\2\2)*\7h\2\2*+\7w\2"+
		"\2+,\7p\2\2,-\7e\2\2-\4\3\2\2\2./\7*\2\2/\6\3\2\2\2\60\61\7+\2\2\61\b"+
		"\3\2\2\2\62\63\7\'\2\2\63\n\3\2\2\2\64\65\7,\2\2\65\f\3\2\2\2\66\67\7"+
		"\61\2\2\67\16\3\2\2\289\7-\2\29\20\3\2\2\2:;\7/\2\2;\22\3\2\2\2<=\7]\2"+
		"\2=\24\3\2\2\2>?\7_\2\2?\26\3\2\2\2@A\7/\2\2AB\7@\2\2B\30\3\2\2\2CD\7"+
		"}\2\2D\32\3\2\2\2EF\7\177\2\2F\34\3\2\2\2GH\7.\2\2H\36\3\2\2\2IJ\t\2\2"+
		"\2J \3\2\2\2KM\t\3\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\"\3\2"+
		"\2\2PR\5\37\20\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T[\3\2\2\2UW\7"+
		"\60\2\2VX\5\37\20\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2"+
		"[U\3\2\2\2[\\\3\2\2\2\\$\3\2\2\2]a\t\4\2\2^`\n\5\2\2_^\3\2\2\2`c\3\2\2"+
		"\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\t\4\2\2e&\3\2\2\2fh\t\6\2"+
		"\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\b\24\2\2l(\3\2"+
		"\2\2\t\2NSY[ai\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}