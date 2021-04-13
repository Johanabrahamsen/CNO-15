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
		RULE_condition = 9, RULE_function = 10, RULE_declaredFunction = 11, RULE_parameter = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "scope", "statement", "expression", "scan", "value", "whileLoop", 
			"forLoop", "conditional", "condition", "function", "declaredFunction", 
			"parameter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'BEGIN'", "'('", "')'", "'{'", "'result '", "'}'", "'$'", "'arr{'", 
			"'show('", "'ask()'", "'doOn('", "'loop['", "']times'", "'condition('", 
			"'notMet'", "','", null, null, null, "'is'", null, null, null, "'num'", 
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
			setState(26);
			match(T__0);
			setState(27);
			scope();
			setState(28);
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
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				match(T__1);
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DECLARATION) {
					{
					{
					setState(31);
					parameter();
					}
					}
					setState(36);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(37);
				match(T__2);
				setState(38);
				scope();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				match(T__3);
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << DECLARATION) | (1L << ARRAY_TYPE) | (1L << INT) | (1L << STRING) | (1L << BOOLEAN) | (1L << DOUBLE) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(40);
					statement();
					}
					}
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(46);
					match(T__4);
					setState(47);
					expression(0);
					}
				}

				setState(50);
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
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				expression(0);
				setState(54);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				conditional();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				whileLoop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				forLoop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(59);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
	public static class MultiCompareContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode LOGICALS() { return getToken(MaximusParser.LOGICALS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultiCompareContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).enterMultiCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).exitMultiCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaximusVisitor ) return ((MaximusVisitor<? extends T>)visitor).visitMultiCompare(this);
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
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new ExParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(63);
				match(T__1);
				setState(64);
				expression(0);
				setState(65);
				match(T__2);
				}
				break;
			case 2:
				{
				_localctx = new AssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67);
				match(IDENTIFIER);
				setState(68);
				match(ASSIGNER);
				setState(69);
				value();
				}
				break;
			case 3:
				{
				_localctx = new DeclarationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				match(DECLARATION);
				setState(71);
				match(IDENTIFIER);
				setState(74);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(72);
					match(ASSIGNER);
					setState(73);
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
				setState(76);
				((ExCompareIdContext)_localctx).left = match(IDENTIFIER);
				setState(77);
				match(COMPARATORS);
				setState(78);
				((ExCompareIdContext)_localctx).right = match(IDENTIFIER);
				}
				break;
			case 5:
				{
				_localctx = new ExCompareExContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				((ExCompareExContext)_localctx).left = match(IDENTIFIER);
				setState(80);
				match(COMPARATORS);
				setState(81);
				((ExCompareExContext)_localctx).right = expression(10);
				}
				break;
			case 6:
				{
				_localctx = new ExIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				match(INT);
				}
				break;
			case 7:
				{
				_localctx = new ExStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				match(STRING);
				}
				break;
			case 8:
				{
				_localctx = new ExBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(84);
				match(BOOLEAN);
				}
				break;
			case 9:
				{
				_localctx = new ExDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85);
				match(DOUBLE);
				}
				break;
			case 10:
				{
				_localctx = new ExVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(86);
				match(IDENTIFIER);
				}
				break;
			case 11:
				{
				_localctx = new ExArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				match(ARRAY_TYPE);
				setState(88);
				((ExArrayContext)_localctx).mainId = match(IDENTIFIER);
				setState(89);
				match(ASSIGNER);
				setState(90);
				match(OBJECT_INITIALIZER);
				setState(95);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__7:
					{
					setState(91);
					match(T__7);
					setState(92);
					match(INT);
					setState(93);
					match(T__5);
					}
					break;
				case IDENTIFIER:
					{
					setState(94);
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
				setState(97);
				match(T__8);
				setState(98);
				expression(0);
				setState(99);
				match(T__2);
				}
				break;
			case 13:
				{
				_localctx = new ExScanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101);
				scan();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(115);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExMulContext(new ExpressionContext(_parentctx, _parentState));
						((ExMulContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(104);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(105);
						match(MUL_OPS);
						setState(106);
						((ExMulContext)_localctx).right = expression(15);
						}
						break;
					case 2:
						{
						_localctx = new ExAddContext(new ExpressionContext(_parentctx, _parentState));
						((ExAddContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(107);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(108);
						match(OPERATORS);
						setState(109);
						((ExAddContext)_localctx).right = expression(14);
						}
						break;
					case 3:
						{
						_localctx = new MultiCompareContext(new ExpressionContext(_parentctx, _parentState));
						((MultiCompareContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(110);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(111);
						match(LOGICALS);
						setState(112);
						((MultiCompareContext)_localctx).right = expression(5);
						}
						break;
					case 4:
						{
						_localctx = new ExIncContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(113);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(114);
						match(INC_OP);
						}
						break;
					}
					} 
				}
				setState(119);
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
			setState(120);
			match(T__9);
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
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(122);
				expression(0);
				}
				break;
			case 2:
				{
				setState(123);
				declaredFunction();
				}
				break;
			case 3:
				{
				setState(124);
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
			setState(127);
			match(T__10);
			setState(128);
			expression(0);
			setState(129);
			match(T__2);
			setState(130);
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
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(T__11);
				setState(133);
				match(INT);
				setState(134);
				match(T__12);
				setState(135);
				scope();
				}
				break;
			case DECLARATION:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
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
			setState(140); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(139);
					condition();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(142); 
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
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(T__13);
				setState(145);
				expression(0);
				setState(146);
				match(T__2);
				setState(147);
				scope();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(149);
				match(T__14);
				setState(150);
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
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARATION) {
				{
				setState(153);
				((FunctionContext)_localctx).mainDec = match(DECLARATION);
				}
			}

			setState(156);
			((FunctionContext)_localctx).mainId = match(IDENTIFIER);
			setState(157);
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
			setState(159);
			((DeclaredFunctionContext)_localctx).mainId = match(IDENTIFIER);
			setState(160);
			match(T__1);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DECLARATION) {
				{
				{
				setState(161);
				parameter();
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
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
			setState(169);
			match(DECLARATION);
			setState(170);
			match(IDENTIFIER);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(171);
				match(T__15);
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
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00b1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\3\3\3\7\3#\n\3\f\3\16"+
		"\3&\13\3\3\3\3\3\3\3\3\3\7\3,\n\3\f\3\16\3/\13\3\3\3\3\3\5\3\63\n\3\3"+
		"\3\5\3\66\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4?\n\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5M\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5b\n\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5i\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5v\n\5\f\5"+
		"\16\5y\13\5\3\6\3\6\3\7\3\7\3\7\5\7\u0080\n\7\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u008c\n\t\3\n\6\n\u008f\n\n\r\n\16\n\u0090\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13\u009a\n\13\3\f\5\f\u009d\n\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\7\r\u00a5\n\r\f\r\16\r\u00a8\13\r\3\r\3\r\3\16\3\16\3"+
		"\16\5\16\u00af\n\16\3\16\2\3\b\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\2"+
		"\2\u00c5\2\34\3\2\2\2\4\65\3\2\2\2\6>\3\2\2\2\bh\3\2\2\2\nz\3\2\2\2\f"+
		"\177\3\2\2\2\16\u0081\3\2\2\2\20\u008b\3\2\2\2\22\u008e\3\2\2\2\24\u0099"+
		"\3\2\2\2\26\u009c\3\2\2\2\30\u00a1\3\2\2\2\32\u00ab\3\2\2\2\34\35\7\3"+
		"\2\2\35\36\5\4\3\2\36\37\7\2\2\3\37\3\3\2\2\2 $\7\4\2\2!#\5\32\16\2\""+
		"!\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\'\3\2\2\2&$\3\2\2\2\'(\7\5\2"+
		"\2(\66\5\4\3\2)-\7\6\2\2*,\5\6\4\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2"+
		"\2\2.\62\3\2\2\2/-\3\2\2\2\60\61\7\7\2\2\61\63\5\b\5\2\62\60\3\2\2\2\62"+
		"\63\3\2\2\2\63\64\3\2\2\2\64\66\7\b\2\2\65 \3\2\2\2\65)\3\2\2\2\66\5\3"+
		"\2\2\2\678\5\b\5\289\7\t\2\29?\3\2\2\2:?\5\22\n\2;?\5\16\b\2<?\5\20\t"+
		"\2=?\5\26\f\2>\67\3\2\2\2>:\3\2\2\2>;\3\2\2\2><\3\2\2\2>=\3\2\2\2?\7\3"+
		"\2\2\2@A\b\5\1\2AB\7\4\2\2BC\5\b\5\2CD\7\5\2\2Di\3\2\2\2EF\7$\2\2FG\7"+
		"\26\2\2Gi\5\f\7\2HI\7\31\2\2IL\7$\2\2JK\7\26\2\2KM\5\f\7\2LJ\3\2\2\2L"+
		"M\3\2\2\2Mi\3\2\2\2NO\7$\2\2OP\7\27\2\2Pi\7$\2\2QR\7$\2\2RS\7\27\2\2S"+
		"i\5\b\5\fTi\7 \2\2Ui\7!\2\2Vi\7\"\2\2Wi\7#\2\2Xi\7$\2\2YZ\7\36\2\2Z[\7"+
		"$\2\2[\\\7\26\2\2\\a\7\37\2\2]^\7\n\2\2^_\7 \2\2_b\7\b\2\2`b\7$\2\2a]"+
		"\3\2\2\2a`\3\2\2\2bi\3\2\2\2cd\7\13\2\2de\5\b\5\2ef\7\5\2\2fi\3\2\2\2"+
		"gi\5\n\6\2h@\3\2\2\2hE\3\2\2\2hH\3\2\2\2hN\3\2\2\2hQ\3\2\2\2hT\3\2\2\2"+
		"hU\3\2\2\2hV\3\2\2\2hW\3\2\2\2hX\3\2\2\2hY\3\2\2\2hc\3\2\2\2hg\3\2\2\2"+
		"iw\3\2\2\2jk\f\20\2\2kl\7\24\2\2lv\5\b\5\21mn\f\17\2\2no\7\23\2\2ov\5"+
		"\b\5\20pq\f\6\2\2qr\7\30\2\2rv\5\b\5\7st\f\16\2\2tv\7\25\2\2uj\3\2\2\2"+
		"um\3\2\2\2up\3\2\2\2us\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\t\3\2\2"+
		"\2yw\3\2\2\2z{\7\f\2\2{\13\3\2\2\2|\u0080\5\b\5\2}\u0080\5\30\r\2~\u0080"+
		"\5\n\6\2\177|\3\2\2\2\177}\3\2\2\2\177~\3\2\2\2\u0080\r\3\2\2\2\u0081"+
		"\u0082\7\r\2\2\u0082\u0083\5\b\5\2\u0083\u0084\7\5\2\2\u0084\u0085\5\4"+
		"\3\2\u0085\17\3\2\2\2\u0086\u0087\7\16\2\2\u0087\u0088\7 \2\2\u0088\u0089"+
		"\7\17\2\2\u0089\u008c\5\4\3\2\u008a\u008c\5\26\f\2\u008b\u0086\3\2\2\2"+
		"\u008b\u008a\3\2\2\2\u008c\21\3\2\2\2\u008d\u008f\5\24\13\2\u008e\u008d"+
		"\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\23\3\2\2\2\u0092\u0093\7\20\2\2\u0093\u0094\5\b\5\2\u0094\u0095\7\5\2"+
		"\2\u0095\u0096\5\4\3\2\u0096\u009a\3\2\2\2\u0097\u0098\7\21\2\2\u0098"+
		"\u009a\5\4\3\2\u0099\u0092\3\2\2\2\u0099\u0097\3\2\2\2\u009a\25\3\2\2"+
		"\2\u009b\u009d\7\31\2\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009f\7$\2\2\u009f\u00a0\5\4\3\2\u00a0\27\3\2\2\2"+
		"\u00a1\u00a2\7$\2\2\u00a2\u00a6\7\4\2\2\u00a3\u00a5\5\32\16\2\u00a4\u00a3"+
		"\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7\5\2\2\u00aa\31\3\2\2"+
		"\2\u00ab\u00ac\7\31\2\2\u00ac\u00ae\7$\2\2\u00ad\u00af\7\22\2\2\u00ae"+
		"\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\33\3\2\2\2\23$-\62\65>Lahuw\177"+
		"\u008b\u0090\u0099\u009c\u00a6\u00ae";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}