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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		IDENTIFIER=18, NUMBER=19, STRING=20, WHITESPACE=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"DIGIT", "IDENTIFIER", "NUMBER", "STRING", "WHITESPACE"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27y\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\6\24Y\n\24\r\24\16\24Z\3\25\6\25^\n\25\r\25\16\25"+
		"_\3\25\3\25\6\25d\n\25\r\25\16\25e\5\25h\n\25\3\26\3\26\7\26l\n\26\f\26"+
		"\16\26o\13\26\3\26\3\26\3\27\6\27t\n\27\r\27\16\27u\3\27\3\27\2\2\30\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\2\'\24)\25+\26-\27\3\2\7\3\2\62;\6\2&&C\\aac|\4\2$$))\3\2"+
		"$$\5\2\13\f\17\17\"\"}\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\3/\3\2\2\2\5\61\3\2\2\2\7\63\3\2\2\2\t8\3\2\2\2\13:\3\2\2\2\r<\3\2"+
		"\2\2\17>\3\2\2\2\21@\3\2\2\2\23B\3\2\2\2\25D\3\2\2\2\27F\3\2\2\2\31H\3"+
		"\2\2\2\33J\3\2\2\2\35L\3\2\2\2\37O\3\2\2\2!Q\3\2\2\2#S\3\2\2\2%U\3\2\2"+
		"\2\'X\3\2\2\2)]\3\2\2\2+i\3\2\2\2-s\3\2\2\2/\60\7=\2\2\60\4\3\2\2\2\61"+
		"\62\7\f\2\2\62\6\3\2\2\2\63\64\7h\2\2\64\65\7w\2\2\65\66\7p\2\2\66\67"+
		"\7e\2\2\67\b\3\2\2\289\7*\2\29\n\3\2\2\2:;\7+\2\2;\f\3\2\2\2<=\7?\2\2"+
		"=\16\3\2\2\2>?\7\'\2\2?\20\3\2\2\2@A\7,\2\2A\22\3\2\2\2BC\7\61\2\2C\24"+
		"\3\2\2\2DE\7-\2\2E\26\3\2\2\2FG\7/\2\2G\30\3\2\2\2HI\7]\2\2I\32\3\2\2"+
		"\2JK\7_\2\2K\34\3\2\2\2LM\7/\2\2MN\7@\2\2N\36\3\2\2\2OP\7}\2\2P \3\2\2"+
		"\2QR\7\177\2\2R\"\3\2\2\2ST\7.\2\2T$\3\2\2\2UV\t\2\2\2V&\3\2\2\2WY\t\3"+
		"\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[(\3\2\2\2\\^\5%\23\2]\\\3"+
		"\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`g\3\2\2\2ac\7\60\2\2bd\5%\23\2cb"+
		"\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ga\3\2\2\2gh\3\2\2\2h"+
		"*\3\2\2\2im\t\4\2\2jl\n\5\2\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2"+
		"np\3\2\2\2om\3\2\2\2pq\t\4\2\2q,\3\2\2\2rt\t\6\2\2sr\3\2\2\2tu\3\2\2\2"+
		"us\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\b\27\2\2x.\3\2\2\2\t\2Z_egmu\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}