// Generated from C:/Users/maxst/CNO-15/Grammar/src\Maximus.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MaximusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, OPERATORS=13, MUL_OPS=14, INC_OP=15, ASSIGNER=16, 
		COMPARATORS=17, LOGICALS=18, DECLARATION=19, INT_TYPE=20, STRING_TYPE=21, 
		BOOLEAN_TYPE=22, DOUBLE_TYPE=23, ARRAY_TYPE=24, OBJECT_INITIALIZER=25, 
		INT=26, STRING=27, IDENTIFIER=28, BOOLEAN=29, DOUBLE=30, WS=31, COMMENT=32;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_expression = 2, RULE_conditional = 3, 
		RULE_function = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "expression", "conditional", "function"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'$'", "'doOn('", "'){'", "'}'", "'loop['", "']times{'", "'('", 
			"')'", "'arr{'", "'condition('", "'notMet{'", "'result '", null, null, 
			null, "'is'", null, null, null, "'num'", "'charCollection'", "'booly'", 
			"'numnum'", "'arr'", "'create'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "OPERATORS", "MUL_OPS", "INC_OP", "ASSIGNER", "COMPARATORS", "LOGICALS", 
			"DECLARATION", "INT_TYPE", "STRING_TYPE", "BOOLEAN_TYPE", "DOUBLE_TYPE", 
			"ARRAY_TYPE", "OBJECT_INITIALIZER", "INT", "STRING", "IDENTIFIER", "BOOLEAN", 
			"DOUBLE", "WS", "COMMENT"
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

	@Override
	public String getGrammarFileName() { return "Maximus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MaximusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MaximusParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaximusVisitor ) return ((MaximusVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__6) | (1L << T__9) | (1L << DECLARATION) | (1L << ARRAY_TYPE) | (1L << INT) | (1L << STRING) | (1L << IDENTIFIER) | (1L << BOOLEAN) | (1L << DOUBLE))) != 0)) {
				{
				{
				setState(10);
				statement();
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(16);
			match(EOF);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode INT() { return getToken(MaximusParser.INT, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaximusVisitor ) return ((MaximusVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				expression(0);
				setState(19);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				conditional();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(22);
				match(T__1);
				setState(23);
				expression(0);
				setState(24);
				match(T__2);
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__6) | (1L << T__9) | (1L << DECLARATION) | (1L << ARRAY_TYPE) | (1L << INT) | (1L << STRING) | (1L << IDENTIFIER) | (1L << BOOLEAN) | (1L << DOUBLE))) != 0)) {
					{
					{
					setState(25);
					statement();
					}
					}
					setState(30);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(31);
				match(T__3);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
				match(T__4);
				setState(34);
				match(INT);
				setState(35);
				match(T__5);
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__6) | (1L << T__9) | (1L << DECLARATION) | (1L << ARRAY_TYPE) | (1L << INT) | (1L << STRING) | (1L << IDENTIFIER) | (1L << BOOLEAN) | (1L << DOUBLE))) != 0)) {
					{
					{
					setState(36);
					statement();
					}
					}
					setState(41);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(42);
				match(T__3);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(43);
				function();
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExAssignerContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(MaximusParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNER() { return getToken(MaximusParser.ASSIGNER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TerminalNode DECLARATION() { return getToken(MaximusParser.DECLARATION, 0); }
		public ExAssignerContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).enterExAssigner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).exitExAssigner(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaximusVisitor ) return ((MaximusVisitor<? extends T>)visitor).visitExAssigner(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExCompareIdContext extends ExpressionContext {
		public Token left;
		public Token right;
		public TerminalNode COMPARATORS() { return getToken(MaximusParser.COMPARATORS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(MaximusParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MaximusParser.IDENTIFIER, i);
		}
		public ExCompareIdContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).enterExCompareId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).exitExCompareId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaximusVisitor ) return ((MaximusVisitor<? extends T>)visitor).visitExCompareId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExBoolContext extends ExpressionContext {
		public TerminalNode BOOLEAN() { return getToken(MaximusParser.BOOLEAN, 0); }
		public ExBoolContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).enterExBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).exitExBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaximusVisitor ) return ((MaximusVisitor<? extends T>)visitor).visitExBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExCompareExContext extends ExpressionContext {
		public Token left;
		public ExpressionContext right;
		public TerminalNode COMPARATORS() { return getToken(MaximusParser.COMPARATORS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MaximusParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExCompareExContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).enterExCompareEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).exitExCompareEx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaximusVisitor ) return ((MaximusVisitor<? extends T>)visitor).visitExCompareEx(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExAddContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode OPERATORS() { return getToken(MaximusParser.OPERATORS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExAddContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).enterExAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).exitExAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaximusVisitor ) return ((MaximusVisitor<? extends T>)visitor).visitExAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExIdContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(MaximusParser.IDENTIFIER, 0); }
		public ExIdContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).enterExId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).exitExId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaximusVisitor ) return ((MaximusVisitor<? extends T>)visitor).visitExId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExIncContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INC_OP() { return getToken(MaximusParser.INC_OP, 0); }
		public ExIncContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).enterExInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).exitExInc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaximusVisitor ) return ((MaximusVisitor<? extends T>)visitor).visitExInc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExStringContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(MaximusParser.STRING, 0); }
		public ExStringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).enterExString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).exitExString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaximusVisitor ) return ((MaximusVisitor<? extends T>)visitor).visitExString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExMulContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode MUL_OPS() { return getToken(MaximusParser.MUL_OPS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExMulContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).enterExMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).exitExMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaximusVisitor ) return ((MaximusVisitor<? extends T>)visitor).visitExMul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExIntContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(MaximusParser.INT, 0); }
		public ExIntContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).enterExInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).exitExInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaximusVisitor ) return ((MaximusVisitor<? extends T>)visitor).visitExInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExArrayContext extends ExpressionContext {
		public TerminalNode ARRAY_TYPE() { return getToken(MaximusParser.ARRAY_TYPE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(MaximusParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MaximusParser.IDENTIFIER, i);
		}
		public TerminalNode ASSIGNER() { return getToken(MaximusParser.ASSIGNER, 0); }
		public TerminalNode OBJECT_INITIALIZER() { return getToken(MaximusParser.OBJECT_INITIALIZER, 0); }
		public TerminalNode INT() { return getToken(MaximusParser.INT, 0); }
		public ExArrayContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).enterExArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).exitExArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaximusVisitor ) return ((MaximusVisitor<? extends T>)visitor).visitExArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExParenthesesContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExParenthesesContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).enterExParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).exitExParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaximusVisitor ) return ((MaximusVisitor<? extends T>)visitor).visitExParentheses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExDoubleContext extends ExpressionContext {
		public TerminalNode DOUBLE() { return getToken(MaximusParser.DOUBLE, 0); }
		public ExDoubleContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).enterExDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).exitExDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaximusVisitor ) return ((MaximusVisitor<? extends T>)visitor).visitExDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new ExParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(47);
				match(T__6);
				setState(48);
				expression(0);
				setState(49);
				match(T__7);
				}
				break;
			case 2:
				{
				_localctx = new ExAssignerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DECLARATION) {
					{
					setState(51);
					match(DECLARATION);
					}
				}

				setState(54);
				match(IDENTIFIER);
				setState(55);
				match(ASSIGNER);
				setState(58);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(56);
					expression(0);
					}
					break;
				case 2:
					{
					setState(57);
					function();
					}
					break;
				}
				}
				break;
			case 3:
				{
				_localctx = new ExCompareIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60);
				((ExCompareIdContext)_localctx).left = match(IDENTIFIER);
				setState(61);
				match(COMPARATORS);
				setState(62);
				((ExCompareIdContext)_localctx).right = match(IDENTIFIER);
				}
				break;
			case 4:
				{
				_localctx = new ExCompareExContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(63);
				((ExCompareExContext)_localctx).left = match(IDENTIFIER);
				setState(64);
				match(COMPARATORS);
				setState(65);
				((ExCompareExContext)_localctx).right = expression(7);
				}
				break;
			case 5:
				{
				_localctx = new ExIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				match(IDENTIFIER);
				}
				break;
			case 6:
				{
				_localctx = new ExIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67);
				match(INT);
				}
				break;
			case 7:
				{
				_localctx = new ExStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(68);
				match(STRING);
				}
				break;
			case 8:
				{
				_localctx = new ExBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(69);
				match(BOOLEAN);
				}
				break;
			case 9:
				{
				_localctx = new ExDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				match(DOUBLE);
				}
				break;
			case 10:
				{
				_localctx = new ExArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				match(ARRAY_TYPE);
				setState(72);
				match(IDENTIFIER);
				setState(73);
				match(ASSIGNER);
				setState(74);
				match(OBJECT_INITIALIZER);
				setState(79);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
					{
					setState(75);
					match(T__8);
					setState(76);
					match(INT);
					setState(77);
					match(T__3);
					}
					break;
				case IDENTIFIER:
					{
					setState(78);
					match(IDENTIFIER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(91);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExMulContext(new ExpressionContext(_parentctx, _parentState));
						((ExMulContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(83);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(84);
						match(MUL_OPS);
						setState(85);
						((ExMulContext)_localctx).right = expression(12);
						}
						break;
					case 2:
						{
						_localctx = new ExAddContext(new ExpressionContext(_parentctx, _parentState));
						((ExAddContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(86);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(87);
						match(OPERATORS);
						setState(88);
						((ExAddContext)_localctx).right = expression(11);
						}
						break;
					case 3:
						{
						_localctx = new ExIncContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(89);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(90);
						match(INC_OP);
						}
						break;
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class ConditionalContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaximusVisitor ) return ((MaximusVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_conditional);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(107); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(96);
					match(T__9);
					setState(97);
					expression(0);
					setState(98);
					match(T__2);
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__6) | (1L << T__9) | (1L << DECLARATION) | (1L << ARRAY_TYPE) | (1L << INT) | (1L << STRING) | (1L << IDENTIFIER) | (1L << BOOLEAN) | (1L << DOUBLE))) != 0)) {
						{
						{
						setState(99);
						statement();
						}
						}
						setState(104);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(105);
					match(T__3);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(109); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(111);
				match(T__10);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__6) | (1L << T__9) | (1L << DECLARATION) | (1L << ARRAY_TYPE) | (1L << INT) | (1L << STRING) | (1L << IDENTIFIER) | (1L << BOOLEAN) | (1L << DOUBLE))) != 0)) {
					{
					{
					setState(112);
					statement();
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(118);
				match(T__3);
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

	public static class FunctionContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(MaximusParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MaximusParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DECLARATION() { return getTokens(MaximusParser.DECLARATION); }
		public TerminalNode DECLARATION(int i) {
			return getToken(MaximusParser.DECLARATION, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaximusVisitor ) return ((MaximusVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARATION) {
				{
				setState(121);
				match(DECLARATION);
				}
			}

			setState(124);
			match(IDENTIFIER);
			setState(125);
			match(T__6);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DECLARATION) {
				{
				{
				setState(126);
				match(DECLARATION);
				setState(127);
				match(IDENTIFIER);
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			match(T__2);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__6) | (1L << T__9) | (1L << DECLARATION) | (1L << ARRAY_TYPE) | (1L << INT) | (1L << STRING) | (1L << IDENTIFIER) | (1L << BOOLEAN) | (1L << DOUBLE))) != 0)) {
				{
				{
				setState(134);
				statement();
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(140);
				match(T__11);
				setState(141);
				expression(0);
				}
			}

			setState(144);
			match(T__3);
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
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u0095\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\7\2\16\n\2\f\2\16\2\21\13\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\35\n\3\f\3\16\3 \13\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\7\3(\n\3\f\3\16\3+\13\3\3\3\3\3\5\3/\n\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4\67\n\4\3\4\3\4\3\4\3\4\5\4=\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4R\n\4\5\4T\n\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4^\n\4\f\4\16\4a\13\4\3\5\3\5\3\5\3\5"+
		"\7\5g\n\5\f\5\16\5j\13\5\3\5\3\5\6\5n\n\5\r\5\16\5o\3\5\3\5\7\5t\n\5\f"+
		"\5\16\5w\13\5\3\5\5\5z\n\5\3\6\5\6}\n\6\3\6\3\6\3\6\3\6\7\6\u0083\n\6"+
		"\f\6\16\6\u0086\13\6\3\6\3\6\7\6\u008a\n\6\f\6\16\6\u008d\13\6\3\6\3\6"+
		"\5\6\u0091\n\6\3\6\3\6\3\6\2\3\6\7\2\4\6\b\n\2\2\2\u00ad\2\17\3\2\2\2"+
		"\4.\3\2\2\2\6S\3\2\2\2\bm\3\2\2\2\n|\3\2\2\2\f\16\5\4\3\2\r\f\3\2\2\2"+
		"\16\21\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20\22\3\2\2\2\21\17\3\2\2\2"+
		"\22\23\7\2\2\3\23\3\3\2\2\2\24\25\5\6\4\2\25\26\7\3\2\2\26/\3\2\2\2\27"+
		"/\5\b\5\2\30\31\7\4\2\2\31\32\5\6\4\2\32\36\7\5\2\2\33\35\5\4\3\2\34\33"+
		"\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37!\3\2\2\2 \36\3\2\2"+
		"\2!\"\7\6\2\2\"/\3\2\2\2#$\7\7\2\2$%\7\34\2\2%)\7\b\2\2&(\5\4\3\2\'&\3"+
		"\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,/\7\6\2\2-/"+
		"\5\n\6\2.\24\3\2\2\2.\27\3\2\2\2.\30\3\2\2\2.#\3\2\2\2.-\3\2\2\2/\5\3"+
		"\2\2\2\60\61\b\4\1\2\61\62\7\t\2\2\62\63\5\6\4\2\63\64\7\n\2\2\64T\3\2"+
		"\2\2\65\67\7\25\2\2\66\65\3\2\2\2\66\67\3\2\2\2\678\3\2\2\289\7\36\2\2"+
		"9<\7\22\2\2:=\5\6\4\2;=\5\n\6\2<:\3\2\2\2<;\3\2\2\2=T\3\2\2\2>?\7\36\2"+
		"\2?@\7\23\2\2@T\7\36\2\2AB\7\36\2\2BC\7\23\2\2CT\5\6\4\tDT\7\36\2\2ET"+
		"\7\34\2\2FT\7\35\2\2GT\7\37\2\2HT\7 \2\2IJ\7\32\2\2JK\7\36\2\2KL\7\22"+
		"\2\2LQ\7\33\2\2MN\7\13\2\2NO\7\34\2\2OR\7\6\2\2PR\7\36\2\2QM\3\2\2\2Q"+
		"P\3\2\2\2RT\3\2\2\2S\60\3\2\2\2S\66\3\2\2\2S>\3\2\2\2SA\3\2\2\2SD\3\2"+
		"\2\2SE\3\2\2\2SF\3\2\2\2SG\3\2\2\2SH\3\2\2\2SI\3\2\2\2T_\3\2\2\2UV\f\r"+
		"\2\2VW\7\20\2\2W^\5\6\4\16XY\f\f\2\2YZ\7\17\2\2Z^\5\6\4\r[\\\f\13\2\2"+
		"\\^\7\21\2\2]U\3\2\2\2]X\3\2\2\2][\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2"+
		"\2`\7\3\2\2\2a_\3\2\2\2bc\7\f\2\2cd\5\6\4\2dh\7\5\2\2eg\5\4\3\2fe\3\2"+
		"\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\7\6\2\2ln\3\2"+
		"\2\2mb\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2py\3\2\2\2qu\7\r\2\2rt\5\4"+
		"\3\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2xz\7\6"+
		"\2\2yq\3\2\2\2yz\3\2\2\2z\t\3\2\2\2{}\7\25\2\2|{\3\2\2\2|}\3\2\2\2}~\3"+
		"\2\2\2~\177\7\36\2\2\177\u0084\7\t\2\2\u0080\u0081\7\25\2\2\u0081\u0083"+
		"\7\36\2\2\u0082\u0080\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2"+
		"\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u008b"+
		"\7\5\2\2\u0088\u008a\5\4\3\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u0090\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008e\u008f\7\16\2\2\u008f\u0091\5\6\4\2\u0090\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\7\6\2\2\u0093\13\3\2\2"+
		"\2\24\17\36).\66<QS]_houy|\u0084\u008b\u0090";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}