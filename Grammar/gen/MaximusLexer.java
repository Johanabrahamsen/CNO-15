// Generated from C:/Users/maxst/CNO-15/Grammar/src\Maximus.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MaximusLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, OPERATORS=17, 
		MUL_OPS=18, INC_OP=19, ASSIGNER=20, COMPARATORS=21, LOGICALS=22, DECLARATION=23, 
		INT_TYPE=24, STRING_TYPE=25, BOOLEAN_TYPE=26, DOUBLE_TYPE=27, ARRAY_TYPE=28, 
		OBJECT_INITIALIZER=29, INT=30, STRING=31, IDENTIFIER=32, BOOLEAN=33, DOUBLE=34, 
		WS=35, COMMENT=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "OPERATORS", 
			"MUL_OPS", "INC_OP", "ASSIGNER", "COMPARATORS", "LOGICALS", "DECLARATION", 
			"INT_TYPE", "STRING_TYPE", "BOOLEAN_TYPE", "DOUBLE_TYPE", "ARRAY_TYPE", 
			"OBJECT_INITIALIZER", "INT", "STRING", "IDENTIFIER", "BOOLEAN", "DOUBLE", 
			"WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'BEGIN'", "'('", "')'", "'{'", "'result '", "'}'", "'$'", "'arr{'", 
			"'ask()'", "'doOn('", "'loop['", "']times'", "'condition('", "'notMet'", 
			"','", "'showString('", null, null, null, "'is'", null, null, null, "'num'", 
			"'charCollection'", "'booly'", "'numnum'", "'arr'", "'create'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "OPERATORS", "MUL_OPS", "INC_OP", "ASSIGNER", 
			"COMPARATORS", "LOGICALS", "DECLARATION", "INT_TYPE", "STRING_TYPE", 
			"BOOLEAN_TYPE", "DOUBLE_TYPE", "ARRAY_TYPE", "OBJECT_INITIALIZER", "INT", 
			"STRING", "IDENTIFIER", "BOOLEAN", "DOUBLE", "WS", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public MaximusLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Maximus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u0170\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00aa\n\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u00b4\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u00c2\n\24\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00e4"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\5\27\u00eb\n\27\3\30\3\30\3\30\3\30\5\30"+
		"\u00f1\n\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\5\37\u0120\n\37\3\37\3\37\7\37\u0124\n\37\f"+
		"\37\16\37\u0127\13\37\5\37\u0129\n\37\3 \3 \7 \u012d\n \f \16 \u0130\13"+
		" \3 \3 \3!\3!\7!\u0136\n!\f!\16!\u0139\13!\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\5\"\u0147\n\"\3#\5#\u014a\n#\3#\3#\7#\u014e\n#\f"+
		"#\16#\u0151\13#\3#\3#\7#\u0155\n#\f#\16#\u0158\13#\3$\6$\u015b\n$\r$\16"+
		"$\u015c\3$\3$\3%\3%\3%\3%\7%\u0165\n%\f%\16%\u0168\13%\3%\6%\u016b\n%"+
		"\r%\16%\u016c\3%\3%\3\u0166\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&\3\2\b\3\2\63;\3\2\62;\4\2"+
		"\f\f\17\17\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u0185\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\3K\3\2\2\2\5Q\3\2\2\2\7S\3\2\2\2\tU\3\2\2\2\13W\3\2\2\2\r_\3\2"+
		"\2\2\17a\3\2\2\2\21c\3\2\2\2\23h\3\2\2\2\25n\3\2\2\2\27t\3\2\2\2\31z\3"+
		"\2\2\2\33\u0081\3\2\2\2\35\u008c\3\2\2\2\37\u0093\3\2\2\2!\u0095\3\2\2"+
		"\2#\u00a9\3\2\2\2%\u00b3\3\2\2\2\'\u00c1\3\2\2\2)\u00c3\3\2\2\2+\u00e3"+
		"\3\2\2\2-\u00ea\3\2\2\2/\u00f0\3\2\2\2\61\u00f2\3\2\2\2\63\u00f6\3\2\2"+
		"\2\65\u0105\3\2\2\2\67\u010b\3\2\2\29\u0112\3\2\2\2;\u0116\3\2\2\2=\u0128"+
		"\3\2\2\2?\u012a\3\2\2\2A\u0133\3\2\2\2C\u0146\3\2\2\2E\u0149\3\2\2\2G"+
		"\u015a\3\2\2\2I\u0160\3\2\2\2KL\7D\2\2LM\7G\2\2MN\7I\2\2NO\7K\2\2OP\7"+
		"P\2\2P\4\3\2\2\2QR\7*\2\2R\6\3\2\2\2ST\7+\2\2T\b\3\2\2\2UV\7}\2\2V\n\3"+
		"\2\2\2WX\7t\2\2XY\7g\2\2YZ\7u\2\2Z[\7w\2\2[\\\7n\2\2\\]\7v\2\2]^\7\"\2"+
		"\2^\f\3\2\2\2_`\7\177\2\2`\16\3\2\2\2ab\7&\2\2b\20\3\2\2\2cd\7c\2\2de"+
		"\7t\2\2ef\7t\2\2fg\7}\2\2g\22\3\2\2\2hi\7c\2\2ij\7u\2\2jk\7m\2\2kl\7*"+
		"\2\2lm\7+\2\2m\24\3\2\2\2no\7f\2\2op\7q\2\2pq\7Q\2\2qr\7p\2\2rs\7*\2\2"+
		"s\26\3\2\2\2tu\7n\2\2uv\7q\2\2vw\7q\2\2wx\7r\2\2xy\7]\2\2y\30\3\2\2\2"+
		"z{\7_\2\2{|\7v\2\2|}\7k\2\2}~\7o\2\2~\177\7g\2\2\177\u0080\7u\2\2\u0080"+
		"\32\3\2\2\2\u0081\u0082\7e\2\2\u0082\u0083\7q\2\2\u0083\u0084\7p\2\2\u0084"+
		"\u0085\7f\2\2\u0085\u0086\7k\2\2\u0086\u0087\7v\2\2\u0087\u0088\7k\2\2"+
		"\u0088\u0089\7q\2\2\u0089\u008a\7p\2\2\u008a\u008b\7*\2\2\u008b\34\3\2"+
		"\2\2\u008c\u008d\7p\2\2\u008d\u008e\7q\2\2\u008e\u008f\7v\2\2\u008f\u0090"+
		"\7O\2\2\u0090\u0091\7g\2\2\u0091\u0092\7v\2\2\u0092\36\3\2\2\2\u0093\u0094"+
		"\7.\2\2\u0094 \3\2\2\2\u0095\u0096\7u\2\2\u0096\u0097\7j\2\2\u0097\u0098"+
		"\7q\2\2\u0098\u0099\7y\2\2\u0099\u009a\7U\2\2\u009a\u009b\7v\2\2\u009b"+
		"\u009c\7t\2\2\u009c\u009d\7k\2\2\u009d\u009e\7p\2\2\u009e\u009f\7i\2\2"+
		"\u009f\u00a0\7*\2\2\u00a0\"\3\2\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7f"+
		"\2\2\u00a3\u00aa\7f\2\2\u00a4\u00a5\7o\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7"+
		"\7p\2\2\u00a7\u00a8\7w\2\2\u00a8\u00aa\7u\2\2\u00a9\u00a1\3\2\2\2\u00a9"+
		"\u00a4\3\2\2\2\u00aa$\3\2\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad\7k\2\2\u00ad"+
		"\u00ae\7o\2\2\u00ae\u00af\7g\2\2\u00af\u00b4\7u\2\2\u00b0\u00b1\7f\2\2"+
		"\u00b1\u00b2\7k\2\2\u00b2\u00b4\7x\2\2\u00b3\u00ab\3\2\2\2\u00b3\u00b0"+
		"\3\2\2\2\u00b4&\3\2\2\2\u00b5\u00b6\7k\2\2\u00b6\u00b7\7p\2\2\u00b7\u00b8"+
		"\7e\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7g\2\2\u00ba\u00c2\7o\2\2\u00bb"+
		"\u00bc\7f\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7e\2\2\u00be\u00bf\7t\2\2"+
		"\u00bf\u00c0\7g\2\2\u00c0\u00c2\7o\2\2\u00c1\u00b5\3\2\2\2\u00c1\u00bb"+
		"\3\2\2\2\u00c2(\3\2\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7u\2\2\u00c5*\3"+
		"\2\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7s\2\2\u00c8\u00c9\7w\2\2\u00c9"+
		"\u00ca\7c\2\2\u00ca\u00cb\7n\2\2\u00cb\u00e4\7u\2\2\u00cc\u00cd\7p\2\2"+
		"\u00cd\u00ce\7q\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7a\2\2\u00d0\u00d1"+
		"\7g\2\2\u00d1\u00d2\7s\2\2\u00d2\u00d3\7w\2\2\u00d3\u00d4\7c\2\2\u00d4"+
		"\u00d5\7n\2\2\u00d5\u00e4\7u\2\2\u00d6\u00d7\7d\2\2\u00d7\u00d8\7k\2\2"+
		"\u00d8\u00d9\7i\2\2\u00d9\u00da\7i\2\2\u00da\u00db\7g\2\2\u00db\u00e4"+
		"\7t\2\2\u00dc\u00dd\7u\2\2\u00dd\u00de\7o\2\2\u00de\u00df\7c\2\2\u00df"+
		"\u00e0\7n\2\2\u00e0\u00e1\7n\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e4\7t\2\2"+
		"\u00e3\u00c6\3\2\2\2\u00e3\u00cc\3\2\2\2\u00e3\u00d6\3\2\2\2\u00e3\u00dc"+
		"\3\2\2\2\u00e4,\3\2\2\2\u00e5\u00e6\7c\2\2\u00e6\u00e7\7p\2\2\u00e7\u00eb"+
		"\7f\2\2\u00e8\u00e9\7q\2\2\u00e9\u00eb\7t\2\2\u00ea\u00e5\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00eb.\3\2\2\2\u00ec\u00f1\5\61\31\2\u00ed\u00f1\5\63\32"+
		"\2\u00ee\u00f1\5\65\33\2\u00ef\u00f1\5\67\34\2\u00f0\u00ec\3\2\2\2\u00f0"+
		"\u00ed\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1\60\3\2\2"+
		"\2\u00f2\u00f3\7p\2\2\u00f3\u00f4\7w\2\2\u00f4\u00f5\7o\2\2\u00f5\62\3"+
		"\2\2\2\u00f6\u00f7\7e\2\2\u00f7\u00f8\7j\2\2\u00f8\u00f9\7c\2\2\u00f9"+
		"\u00fa\7t\2\2\u00fa\u00fb\7E\2\2\u00fb\u00fc\7q\2\2\u00fc\u00fd\7n\2\2"+
		"\u00fd\u00fe\7n\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100\7e\2\2\u0100\u0101"+
		"\7v\2\2\u0101\u0102\7k\2\2\u0102\u0103\7q\2\2\u0103\u0104\7p\2\2\u0104"+
		"\64\3\2\2\2\u0105\u0106\7d\2\2\u0106\u0107\7q\2\2\u0107\u0108\7q\2\2\u0108"+
		"\u0109\7n\2\2\u0109\u010a\7{\2\2\u010a\66\3\2\2\2\u010b\u010c\7p\2\2\u010c"+
		"\u010d\7w\2\2\u010d\u010e\7o\2\2\u010e\u010f\7p\2\2\u010f\u0110\7w\2\2"+
		"\u0110\u0111\7o\2\2\u01118\3\2\2\2\u0112\u0113\7c\2\2\u0113\u0114\7t\2"+
		"\2\u0114\u0115\7t\2\2\u0115:\3\2\2\2\u0116\u0117\7e\2\2\u0117\u0118\7"+
		"t\2\2\u0118\u0119\7g\2\2\u0119\u011a\7c\2\2\u011a\u011b\7v\2\2\u011b\u011c"+
		"\7g\2\2\u011c<\3\2\2\2\u011d\u0129\7\62\2\2\u011e\u0120\7/\2\2\u011f\u011e"+
		"\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0125\t\2\2\2\u0122"+
		"\u0124\t\3\2\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2"+
		"\2\2\u0125\u0126\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0128"+
		"\u011d\3\2\2\2\u0128\u011f\3\2\2\2\u0129>\3\2\2\2\u012a\u012e\7$\2\2\u012b"+
		"\u012d\n\4\2\2\u012c\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2"+
		"\2\2\u012e\u012f\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u012e\3\2\2\2\u0131"+
		"\u0132\7$\2\2\u0132@\3\2\2\2\u0133\u0137\t\5\2\2\u0134\u0136\t\6\2\2\u0135"+
		"\u0134\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2"+
		"\2\2\u0138B\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013b\7x\2\2\u013b\u013c"+
		"\7c\2\2\u013c\u013d\7n\2\2\u013d\u013e\7k\2\2\u013e\u0147\7f\2\2\u013f"+
		"\u0140\7k\2\2\u0140\u0141\7p\2\2\u0141\u0142\7x\2\2\u0142\u0143\7c\2\2"+
		"\u0143\u0144\7n\2\2\u0144\u0145\7k\2\2\u0145\u0147\7f\2\2\u0146\u013a"+
		"\3\2\2\2\u0146\u013f\3\2\2\2\u0147D\3\2\2\2\u0148\u014a\7/\2\2\u0149\u0148"+
		"\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014f\t\2\2\2\u014c"+
		"\u014e\t\3\2\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2"+
		"\2\2\u014f\u0150\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152"+
		"\u0156\7\60\2\2\u0153\u0155\t\3\2\2\u0154\u0153\3\2\2\2\u0155\u0158\3"+
		"\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157F\3\2\2\2\u0158\u0156"+
		"\3\2\2\2\u0159\u015b\t\7\2\2\u015a\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c"+
		"\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\b$"+
		"\2\2\u015fH\3\2\2\2\u0160\u0161\7#\2\2\u0161\u0162\7#\2\2\u0162\u0166"+
		"\3\2\2\2\u0163\u0165\13\2\2\2\u0164\u0163\3\2\2\2\u0165\u0168\3\2\2\2"+
		"\u0166\u0167\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166"+
		"\3\2\2\2\u0169\u016b\t\4\2\2\u016a\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\b%"+
		"\2\2\u016fJ\3\2\2\2\25\2\u00a9\u00b3\u00c1\u00e3\u00ea\u00f0\u011f\u0125"+
		"\u0128\u012e\u0137\u0146\u0149\u014f\u0156\u015c\u0166\u016c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}