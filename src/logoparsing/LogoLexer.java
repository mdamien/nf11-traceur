// Generated from Logo.g4 by ANTLR 4.5

  package logoparsing;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		INT=25, DECL_VAR=26, USE_VAR=27, BOOLEAN_OPERATOR=28, WS=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "INT", 
		"DECL_VAR", "USE_VAR", "BOOLEAN_OPERATOR", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'av'", "'td'", "'tg'", "'lc'", "'bc'", "'ve'", "'re'", "'fpos'", 
		"'['", "']'", "'fcc'", "'repete'", "'donne'", "'si'", "'tantque'", "'*'", 
		"'/'", "'+'", "'-'", "'hasard'", "'.'", "'loop'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "INT", "DECL_VAR", "USE_VAR", "BOOLEAN_OPERATOR", "WS"
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


	public LogoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Logo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\37\u00b9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\32\7\32\u0095\n\32\f\32\16\32\u0098\13"+
		"\32\5\32\u009a\n\32\3\33\3\33\6\33\u009e\n\33\r\33\16\33\u009f\3\34\3"+
		"\34\6\34\u00a4\n\34\r\34\16\34\u00a5\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u00b1\n\35\3\36\6\36\u00b4\n\36\r\36\16\36\u00b5\3\36"+
		"\3\36\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37\3\2\7\3\2\63;\3\2\62;\4\2aac|\4\2>>@@\5\2\13\f\17\17\""+
		"\"\u00c1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\3=\3\2\2\2\5@\3\2\2\2\7C\3\2\2\2\tF\3\2\2\2\13I\3\2\2"+
		"\2\rL\3\2\2\2\17O\3\2\2\2\21R\3\2\2\2\23W\3\2\2\2\25Y\3\2\2\2\27[\3\2"+
		"\2\2\31_\3\2\2\2\33f\3\2\2\2\35l\3\2\2\2\37o\3\2\2\2!w\3\2\2\2#y\3\2\2"+
		"\2%{\3\2\2\2\'}\3\2\2\2)\177\3\2\2\2+\u0086\3\2\2\2-\u0088\3\2\2\2/\u008d"+
		"\3\2\2\2\61\u008f\3\2\2\2\63\u0099\3\2\2\2\65\u009b\3\2\2\2\67\u00a1\3"+
		"\2\2\29\u00b0\3\2\2\2;\u00b3\3\2\2\2=>\7c\2\2>?\7x\2\2?\4\3\2\2\2@A\7"+
		"v\2\2AB\7f\2\2B\6\3\2\2\2CD\7v\2\2DE\7i\2\2E\b\3\2\2\2FG\7n\2\2GH\7e\2"+
		"\2H\n\3\2\2\2IJ\7d\2\2JK\7e\2\2K\f\3\2\2\2LM\7x\2\2MN\7g\2\2N\16\3\2\2"+
		"\2OP\7t\2\2PQ\7g\2\2Q\20\3\2\2\2RS\7h\2\2ST\7r\2\2TU\7q\2\2UV\7u\2\2V"+
		"\22\3\2\2\2WX\7]\2\2X\24\3\2\2\2YZ\7_\2\2Z\26\3\2\2\2[\\\7h\2\2\\]\7e"+
		"\2\2]^\7e\2\2^\30\3\2\2\2_`\7t\2\2`a\7g\2\2ab\7r\2\2bc\7g\2\2cd\7v\2\2"+
		"de\7g\2\2e\32\3\2\2\2fg\7f\2\2gh\7q\2\2hi\7p\2\2ij\7p\2\2jk\7g\2\2k\34"+
		"\3\2\2\2lm\7u\2\2mn\7k\2\2n\36\3\2\2\2op\7v\2\2pq\7c\2\2qr\7p\2\2rs\7"+
		"v\2\2st\7s\2\2tu\7w\2\2uv\7g\2\2v \3\2\2\2wx\7,\2\2x\"\3\2\2\2yz\7\61"+
		"\2\2z$\3\2\2\2{|\7-\2\2|&\3\2\2\2}~\7/\2\2~(\3\2\2\2\177\u0080\7j\2\2"+
		"\u0080\u0081\7c\2\2\u0081\u0082\7u\2\2\u0082\u0083\7c\2\2\u0083\u0084"+
		"\7t\2\2\u0084\u0085\7f\2\2\u0085*\3\2\2\2\u0086\u0087\7\60\2\2\u0087,"+
		"\3\2\2\2\u0088\u0089\7n\2\2\u0089\u008a\7q\2\2\u008a\u008b\7q\2\2\u008b"+
		"\u008c\7r\2\2\u008c.\3\2\2\2\u008d\u008e\7*\2\2\u008e\60\3\2\2\2\u008f"+
		"\u0090\7+\2\2\u0090\62\3\2\2\2\u0091\u009a\7\62\2\2\u0092\u0096\t\2\2"+
		"\2\u0093\u0095\t\3\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0099"+
		"\u0091\3\2\2\2\u0099\u0092\3\2\2\2\u009a\64\3\2\2\2\u009b\u009d\7$\2\2"+
		"\u009c\u009e\t\4\2\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d"+
		"\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\66\3\2\2\2\u00a1\u00a3\7<\2\2\u00a2"+
		"\u00a4\t\4\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a5\u00a6\3\2\2\2\u00a68\3\2\2\2\u00a7\u00b1\t\5\2\2\u00a8\u00a9"+
		"\7>\2\2\u00a9\u00b1\7?\2\2\u00aa\u00ab\7@\2\2\u00ab\u00b1\7?\2\2\u00ac"+
		"\u00ad\7?\2\2\u00ad\u00b1\7?\2\2\u00ae\u00af\7#\2\2\u00af\u00b1\7?\2\2"+
		"\u00b0\u00a7\3\2\2\2\u00b0\u00a8\3\2\2\2\u00b0\u00aa\3\2\2\2\u00b0\u00ac"+
		"\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1:\3\2\2\2\u00b2\u00b4\t\6\2\2\u00b3"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\b\36\2\2\u00b8<\3\2\2\2\t\2\u0096"+
		"\u0099\u009f\u00a5\u00b0\u00b5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}