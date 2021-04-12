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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, OPERATORS=17, 
		MUL_OPS=18, INC_OP=19, ASSIGNER=20, COMPARATORS=21, LOGICALS=22, DECLARATION=23, 
		INT_TYPE=24, STRING_TYPE=25, BOOLEAN_TYPE=26, DOUBLE_TYPE=27, ARRAY_TYPE=28, 
		OBJECT_INITIALIZER=29, INT=30, STRING=31, BOOLEAN=32, DOUBLE=33, IDENTIFIER=34, 
		WS=35, COMMENT=36;
	public static final int
		RULE_program = 0, RULE_scope = 1, RULE_statement = 2, RULE_expression = 3, 
		RULE_scan = 4, RULE_value = 5, RULE_whileLoop = 6, RULE_forLoop = 7, RULE_conditional = 8, 
		RULE_condition = 9, RULE_function = 10, RULE_declaredFunction = 11, RULE_parameter = 12, 
		RULE_print = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "scope", "statement", "expression", "scan", "value", "whileLoop", 
			"forLoop", "conditional", "condition", "function", "declaredFunction", 
			"parameter", "print"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'BEGIN'", "'('", "')'", "'{'", "'result '", "'}'", "'$'", "'arr{'", 
			"'ask()'", "'doOn('", "'loop['", "']times'", "'condition('", "'notMet'", 
			"','", "'show('", null, null, null, "'is'", null, null, null, "'num'", 
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
			"STRING", "BOOLEAN", "DOUBLE", "IDENTIFIER", "WS", "COMMENT"
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
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MaximusParser.EOF, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(T__0);
			setState(29);
			scope();
			setState(30);
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

	public static class ScopeContext extends ParserRuleContext {
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
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
		public ScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).enterScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).exitScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaximusVisitor ) return ((MaximusVisitor<? extends T>)visitor).visitScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScopeContext scope() throws RecognitionException {
		ScopeContext _localctx = new ScopeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_scope);
		int _la;
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(T__1);
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DECLARATION) {
					{
					{
					setState(33);
					parameter();
					}
					}
					setState(38);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(39);
				match(T__2);
				setState(40);
				scope();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				match(T__3);
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << DECLARATION) | (1L << ARRAY_TYPE) | (1L << INT) | (1L << STRING) | (1L << BOOLEAN) | (1L << DOUBLE) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(42);
					statement();
					}
					}
					setState(47);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(48);
					match(T__4);
					setState(49);
					expression(0);
					}
				}

				setState(52);
				match(T__5);
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

	public static class StatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
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
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				expression(0);
				setState(56);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				conditional();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				whileLoop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				forLoop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(61);
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
	public static class ExArrayContext extends ExpressionContext {
		public Token mainId;
		public TerminalNode ARRAY_TYPE() { return getToken(MaximusParser.ARRAY_TYPE, 0); }
		public TerminalNode ASSIGNER() { return getToken(MaximusParser.ASSIGNER, 0); }
		public TerminalNode OBJECT_INITIALIZER() { return getToken(MaximusParser.OBJECT_INITIALIZER, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(MaximusParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MaximusParser.IDENTIFIER, i);
		}
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
	public static class ExVariableContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(MaximusParser.IDENTIFIER, 0); }
		public ExVariableContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).enterExVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).exitExVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaximusVisitor ) return ((MaximusVisitor<? extends T>)visitor).visitExVariable(this);
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
	public static class AssignmentContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(MaximusParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNER() { return getToken(MaximusParser.ASSIGNER, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AssignmentContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaximusVisitor ) return ((MaximusVisitor<? extends T>)visitor).visitAssignment(this);
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
	public static class ExScanContext extends ExpressionContext {
		public ScanContext scan() {
			return getRuleContext(ScanContext.class,0);
		}
		public ExScanContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).enterExScan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).exitExScan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaximusVisitor ) return ((MaximusVisitor<? extends T>)visitor).visitExScan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclarationContext extends ExpressionContext {
		public TerminalNode DECLARATION() { return getToken(MaximusParser.DECLARATION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MaximusParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNER() { return getToken(MaximusParser.ASSIGNER, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public DeclarationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaximusVisitor ) return ((MaximusVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExPrintContext extends ExpressionContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ExPrintContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).enterExPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).exitExPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaximusVisitor ) return ((MaximusVisitor<? extends T>)visitor).visitExPrint(this);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new ExParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(65);
				match(T__1);
				setState(66);
				expression(0);
				setState(67);
				match(T__2);
				}
				break;
			case 2:
				{
				_localctx = new AssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(69);
				match(IDENTIFIER);
				setState(70);
				match(ASSIGNER);
				setState(71);
				value();
				}
				break;
			case 3:
				{
				_localctx = new DeclarationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72);
				match(DECLARATION);
				setState(73);
				match(IDENTIFIER);
				setState(76);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(74);
					match(ASSIGNER);
					setState(75);
					value();
					}
					break;
				}
				}
				break;
			case 4:
				{
				_localctx = new ExCompareIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(78);
				((ExCompareIdContext)_localctx).left = match(IDENTIFIER);
				setState(79);
				match(COMPARATORS);
				setState(80);
				((ExCompareIdContext)_localctx).right = match(IDENTIFIER);
				}
				break;
			case 5:
				{
				_localctx = new ExCompareExContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				((ExCompareExContext)_localctx).left = match(IDENTIFIER);
				setState(82);
				match(COMPARATORS);
				setState(83);
				((ExCompareExContext)_localctx).right = expression(9);
				}
				break;
			case 6:
				{
				_localctx = new ExIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(84);
				match(INT);
				}
				break;
			case 7:
				{
				_localctx = new ExStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85);
				match(STRING);
				}
				break;
			case 8:
				{
				_localctx = new ExBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(86);
				match(BOOLEAN);
				}
				break;
			case 9:
				{
				_localctx = new ExDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				match(DOUBLE);
				}
				break;
			case 10:
				{
				_localctx = new ExVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88);
				match(IDENTIFIER);
				}
				break;
			case 11:
				{
				_localctx = new ExArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89);
				match(ARRAY_TYPE);
				setState(90);
				((ExArrayContext)_localctx).mainId = match(IDENTIFIER);
				setState(91);
				match(ASSIGNER);
				setState(92);
				match(OBJECT_INITIALIZER);
				setState(97);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__7:
					{
					setState(93);
					match(T__7);
					setState(94);
					match(INT);
					setState(95);
					match(T__5);
					}
					break;
				case IDENTIFIER:
					{
					setState(96);
					match(IDENTIFIER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 12:
				{
				_localctx = new ExPrintContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				print();
				}
				break;
			case 13:
				{
				_localctx = new ExScanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100);
				scan();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(111);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExMulContext(new ExpressionContext(_parentctx, _parentState));
						((ExMulContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(103);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(104);
						match(MUL_OPS);
						setState(105);
						((ExMulContext)_localctx).right = expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExAddContext(new ExpressionContext(_parentctx, _parentState));
						((ExAddContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(106);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(107);
						match(OPERATORS);
						setState(108);
						((ExAddContext)_localctx).right = expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExIncContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(109);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(110);
						match(INC_OP);
						}
						break;
					}
					} 
				}
				setState(115);
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

	public static class ScanContext extends ParserRuleContext {
		public ScanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).enterScan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).exitScan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaximusVisitor ) return ((MaximusVisitor<? extends T>)visitor).visitScan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScanContext scan() throws RecognitionException {
		ScanContext _localctx = new ScanContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_scan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__8);
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

	public static class ValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclaredFunctionContext declaredFunction() {
			return getRuleContext(DeclaredFunctionContext.class,0);
		}
		public ScanContext scan() {
			return getRuleContext(ScanContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaximusVisitor ) return ((MaximusVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(118);
				expression(0);
				}
				break;
			case 2:
				{
				setState(119);
				declaredFunction();
				}
				break;
			case 3:
				{
				setState(120);
				scan();
				}
				break;
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

	public static class WhileLoopContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaximusVisitor ) return ((MaximusVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__9);
			setState(124);
			expression(0);
			setState(125);
			match(T__2);
			setState(126);
			scope();
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

	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MaximusParser.INT, 0); }
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaximusVisitor ) return ((MaximusVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forLoop);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(T__10);
				setState(129);
				match(INT);
				setState(130);
				match(T__11);
				setState(131);
				scope();
				}
				break;
			case DECLARATION:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				function();
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

	public static class ConditionalContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
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
		enterRule(_localctx, 16, RULE_conditional);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(136); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(135);
					condition();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(138); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaximusVisitor ) return ((MaximusVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_condition);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(T__12);
				setState(141);
				expression(0);
				setState(142);
				match(T__2);
				setState(143);
				scope();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(145);
				match(T__13);
				setState(146);
				scope();
				}
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

	public static class FunctionContext extends ParserRuleContext {
		public Token mainDec;
		public Token mainId;
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MaximusParser.IDENTIFIER, 0); }
		public TerminalNode DECLARATION() { return getToken(MaximusParser.DECLARATION, 0); }
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
		enterRule(_localctx, 20, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARATION) {
				{
				setState(149);
				((FunctionContext)_localctx).mainDec = match(DECLARATION);
				}
			}

			setState(152);
			((FunctionContext)_localctx).mainId = match(IDENTIFIER);
			setState(153);
			scope();
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

	public static class DeclaredFunctionContext extends ParserRuleContext {
		public Token mainId;
		public TerminalNode IDENTIFIER() { return getToken(MaximusParser.IDENTIFIER, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public DeclaredFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaredFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).enterDeclaredFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).exitDeclaredFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaximusVisitor ) return ((MaximusVisitor<? extends T>)visitor).visitDeclaredFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaredFunctionContext declaredFunction() throws RecognitionException {
		DeclaredFunctionContext _localctx = new DeclaredFunctionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declaredFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			((DeclaredFunctionContext)_localctx).mainId = match(IDENTIFIER);
			setState(156);
			match(T__1);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DECLARATION) {
				{
				{
				setState(157);
				parameter();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
			match(T__2);
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

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode DECLARATION() { return getToken(MaximusParser.DECLARATION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MaximusParser.IDENTIFIER, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaximusVisitor ) return ((MaximusVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(DECLARATION);
			setState(166);
			match(IDENTIFIER);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(167);
				match(T__14);
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

	public static class PrintContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaximusVisitor ) return ((MaximusVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__15);
			setState(171);
			expression(0);
			setState(172);
			match(T__2);
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
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00b1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\3\3\3\7\3%\n"+
		"\3\f\3\16\3(\13\3\3\3\3\3\3\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\3\3\3\3\5"+
		"\3\65\n\3\3\3\5\38\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4A\n\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5O\n\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5d\n\5\3\5\3"+
		"\5\5\5h\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5r\n\5\f\5\16\5u\13\5\3"+
		"\6\3\6\3\7\3\7\3\7\5\7|\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u0088\n\t\3\n\6\n\u008b\n\n\r\n\16\n\u008c\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u0096\n\13\3\f\5\f\u0099\n\f\3\f\3\f\3\f\3\r\3\r\3\r\7"+
		"\r\u00a1\n\r\f\r\16\r\u00a4\13\r\3\r\3\r\3\16\3\16\3\16\5\16\u00ab\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\2\3\b\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\2\2\2\u00c3\2\36\3\2\2\2\4\67\3\2\2\2\6@\3\2\2\2\bg\3\2\2\2\nv\3\2\2"+
		"\2\f{\3\2\2\2\16}\3\2\2\2\20\u0087\3\2\2\2\22\u008a\3\2\2\2\24\u0095\3"+
		"\2\2\2\26\u0098\3\2\2\2\30\u009d\3\2\2\2\32\u00a7\3\2\2\2\34\u00ac\3\2"+
		"\2\2\36\37\7\3\2\2\37 \5\4\3\2 !\7\2\2\3!\3\3\2\2\2\"&\7\4\2\2#%\5\32"+
		"\16\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\')\3\2\2\2(&\3\2\2\2)*"+
		"\7\5\2\2*8\5\4\3\2+/\7\6\2\2,.\5\6\4\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2"+
		"/\60\3\2\2\2\60\64\3\2\2\2\61/\3\2\2\2\62\63\7\7\2\2\63\65\5\b\5\2\64"+
		"\62\3\2\2\2\64\65\3\2\2\2\65\66\3\2\2\2\668\7\b\2\2\67\"\3\2\2\2\67+\3"+
		"\2\2\28\5\3\2\2\29:\5\b\5\2:;\7\t\2\2;A\3\2\2\2<A\5\22\n\2=A\5\16\b\2"+
		">A\5\20\t\2?A\5\26\f\2@9\3\2\2\2@<\3\2\2\2@=\3\2\2\2@>\3\2\2\2@?\3\2\2"+
		"\2A\7\3\2\2\2BC\b\5\1\2CD\7\4\2\2DE\5\b\5\2EF\7\5\2\2Fh\3\2\2\2GH\7$\2"+
		"\2HI\7\26\2\2Ih\5\f\7\2JK\7\31\2\2KN\7$\2\2LM\7\26\2\2MO\5\f\7\2NL\3\2"+
		"\2\2NO\3\2\2\2Oh\3\2\2\2PQ\7$\2\2QR\7\27\2\2Rh\7$\2\2ST\7$\2\2TU\7\27"+
		"\2\2Uh\5\b\5\13Vh\7 \2\2Wh\7!\2\2Xh\7\"\2\2Yh\7#\2\2Zh\7$\2\2[\\\7\36"+
		"\2\2\\]\7$\2\2]^\7\26\2\2^c\7\37\2\2_`\7\n\2\2`a\7 \2\2ad\7\b\2\2bd\7"+
		"$\2\2c_\3\2\2\2cb\3\2\2\2dh\3\2\2\2eh\5\34\17\2fh\5\n\6\2gB\3\2\2\2gG"+
		"\3\2\2\2gJ\3\2\2\2gP\3\2\2\2gS\3\2\2\2gV\3\2\2\2gW\3\2\2\2gX\3\2\2\2g"+
		"Y\3\2\2\2gZ\3\2\2\2g[\3\2\2\2ge\3\2\2\2gf\3\2\2\2hs\3\2\2\2ij\f\17\2\2"+
		"jk\7\24\2\2kr\5\b\5\20lm\f\16\2\2mn\7\23\2\2nr\5\b\5\17op\f\r\2\2pr\7"+
		"\25\2\2qi\3\2\2\2ql\3\2\2\2qo\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\t"+
		"\3\2\2\2us\3\2\2\2vw\7\13\2\2w\13\3\2\2\2x|\5\b\5\2y|\5\30\r\2z|\5\n\6"+
		"\2{x\3\2\2\2{y\3\2\2\2{z\3\2\2\2|\r\3\2\2\2}~\7\f\2\2~\177\5\b\5\2\177"+
		"\u0080\7\5\2\2\u0080\u0081\5\4\3\2\u0081\17\3\2\2\2\u0082\u0083\7\r\2"+
		"\2\u0083\u0084\7 \2\2\u0084\u0085\7\16\2\2\u0085\u0088\5\4\3\2\u0086\u0088"+
		"\5\26\f\2\u0087\u0082\3\2\2\2\u0087\u0086\3\2\2\2\u0088\21\3\2\2\2\u0089"+
		"\u008b\5\24\13\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3"+
		"\2\2\2\u008c\u008d\3\2\2\2\u008d\23\3\2\2\2\u008e\u008f\7\17\2\2\u008f"+
		"\u0090\5\b\5\2\u0090\u0091\7\5\2\2\u0091\u0092\5\4\3\2\u0092\u0096\3\2"+
		"\2\2\u0093\u0094\7\20\2\2\u0094\u0096\5\4\3\2\u0095\u008e\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0096\25\3\2\2\2\u0097\u0099\7\31\2\2\u0098\u0097\3\2\2"+
		"\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\7$\2\2\u009b\u009c"+
		"\5\4\3\2\u009c\27\3\2\2\2\u009d\u009e\7$\2\2\u009e\u00a2\7\4\2\2\u009f"+
		"\u00a1\5\32\16\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3"+
		"\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"\u00a6\7\5\2\2\u00a6\31\3\2\2\2\u00a7\u00a8\7\31\2\2\u00a8\u00aa\7$\2"+
		"\2\u00a9\u00ab\7\21\2\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\33\3\2\2\2\u00ac\u00ad\7\22\2\2\u00ad\u00ae\5\b\5\2\u00ae\u00af\7\5\2"+
		"\2\u00af\35\3\2\2\2\23&/\64\67@Ncgqs{\u0087\u008c\u0095\u0098\u00a2\u00aa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}