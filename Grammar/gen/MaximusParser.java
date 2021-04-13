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
		MUL_OPS=18, ASSIGNER=19, COMPARATORS=20, LOGICALS=21, DECLARATION=22, 
		INT_TYPE=23, STRING_TYPE=24, BOOLEAN_TYPE=25, DOUBLE_TYPE=26, ARRAY_TYPE=27, 
		OBJECT_INITIALIZER=28, INT=29, STRING=30, BOOLEAN=31, DOUBLE=32, IDENTIFIER=33, 
		WS=34, COMMENT=35;
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
			null, "'BEGIN'", "'('", "')'", "'{'", "'result '", "'}'", "'$'", "','", 
			"'['", "']'", "'show('", "'ask()'", "'doOn('", "'loop['", "']times'", 
			"'condition('", null, null, "'is'", null, null, null, "'num'", "'charCollection'", 
			"'booly'", "'numnum'", "'arr'", "'create'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "OPERATORS", "MUL_OPS", "ASSIGNER", "COMPARATORS", 
			"LOGICALS", "DECLARATION", "INT_TYPE", "STRING_TYPE", "BOOLEAN_TYPE", 
			"DOUBLE_TYPE", "ARRAY_TYPE", "OBJECT_INITIALIZER", "INT", "STRING", "BOOLEAN", 
			"DOUBLE", "IDENTIFIER", "WS", "COMMENT"
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
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << DECLARATION) | (1L << ARRAY_TYPE) | (1L << INT) | (1L << STRING) | (1L << BOOLEAN) | (1L << DOUBLE) | (1L << IDENTIFIER))) != 0)) {
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
	public static class ArrayGetContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(MaximusParser.IDENTIFIER, 0); }
		public TerminalNode INT() { return getToken(MaximusParser.INT, 0); }
		public ArrayGetContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).enterArrayGet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).exitArrayGet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaximusVisitor ) return ((MaximusVisitor<? extends T>)visitor).visitArrayGet(this);
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
	public static class ArrayPutContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(MaximusParser.IDENTIFIER, 0); }
		public TerminalNode INT() { return getToken(MaximusParser.INT, 0); }
		public TerminalNode ASSIGNER() { return getToken(MaximusParser.ASSIGNER, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ArrayPutContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).enterArrayPut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).exitArrayPut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaximusVisitor ) return ((MaximusVisitor<? extends T>)visitor).visitArrayPut(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayDeclarationContext extends ExpressionContext {
		public Token mainId;
		public TerminalNode ARRAY_TYPE() { return getToken(MaximusParser.ARRAY_TYPE, 0); }
		public TerminalNode INT() { return getToken(MaximusParser.INT, 0); }
		public TerminalNode DECLARATION() { return getToken(MaximusParser.DECLARATION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MaximusParser.IDENTIFIER, 0); }
		public ArrayDeclarationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).enterArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaximusListener ) ((MaximusListener)listener).exitArrayDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaximusVisitor ) return ((MaximusVisitor<? extends T>)visitor).visitArrayDeclaration(this);
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
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
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
				((ExCompareExContext)_localctx).right = expression(12);
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
				_localctx = new ArrayDeclarationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				match(ARRAY_TYPE);
				setState(88);
				((ArrayDeclarationContext)_localctx).mainId = match(IDENTIFIER);
				setState(89);
				match(T__3);
				setState(90);
				match(INT);
				setState(91);
				match(T__7);
				setState(92);
				match(DECLARATION);
				setState(93);
				match(T__5);
				}
				break;
			case 12:
				{
				_localctx = new ArrayPutContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(94);
				match(IDENTIFIER);
				setState(95);
				match(T__8);
				setState(96);
				match(INT);
				setState(97);
				match(T__9);
				setState(98);
				match(ASSIGNER);
				setState(99);
				value();
				}
				break;
			case 13:
				{
				_localctx = new ArrayGetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100);
				match(IDENTIFIER);
				setState(101);
				match(T__8);
				setState(102);
				match(INT);
				setState(103);
				match(T__9);
				}
				break;
			case 14:
				{
				_localctx = new ExPrintContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(104);
				match(T__10);
				setState(105);
				expression(0);
				setState(106);
				match(T__2);
				}
				break;
			case 15:
				{
				_localctx = new ExScanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				scan();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(120);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExMulContext(new ExpressionContext(_parentctx, _parentState));
						((ExMulContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(111);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(112);
						match(MUL_OPS);
						setState(113);
						((ExMulContext)_localctx).right = expression(16);
						}
						break;
					case 2:
						{
						_localctx = new ExAddContext(new ExpressionContext(_parentctx, _parentState));
						((ExAddContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(114);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(115);
						match(OPERATORS);
						setState(116);
						((ExAddContext)_localctx).right = expression(15);
						}
						break;
					case 3:
						{
						_localctx = new MultiCompareContext(new ExpressionContext(_parentctx, _parentState));
						((MultiCompareContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(117);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(118);
						match(LOGICALS);
						setState(119);
						((MultiCompareContext)_localctx).right = expression(7);
						}
						break;
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
			setState(125);
			match(T__11);
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
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(127);
				expression(0);
				}
				break;
			case 2:
				{
				setState(128);
				declaredFunction();
				}
				break;
			case 3:
				{
				setState(129);
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
			setState(132);
			match(T__12);
			setState(133);
			expression(0);
			setState(134);
			match(T__2);
			setState(135);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__13);
			setState(138);
			match(INT);
			setState(139);
			match(T__14);
			setState(140);
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
			setState(143); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(142);
					condition();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(145); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__15);
			setState(148);
			expression(0);
			setState(149);
			match(T__2);
			setState(150);
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
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARATION) {
				{
				setState(152);
				((FunctionContext)_localctx).mainDec = match(DECLARATION);
				}
			}

			setState(155);
			((FunctionContext)_localctx).mainId = match(IDENTIFIER);
			setState(156);
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
			setState(158);
			((DeclaredFunctionContext)_localctx).mainId = match(IDENTIFIER);
			setState(159);
			match(T__1);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DECLARATION) {
				{
				{
				setState(160);
				parameter();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
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
			setState(168);
			match(DECLARATION);
			setState(169);
			match(IDENTIFIER);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(170);
				match(T__7);
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
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00b0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\3\3\3\7\3#\n\3\f\3\16"+
		"\3&\13\3\3\3\3\3\3\3\3\3\7\3,\n\3\f\3\16\3/\13\3\3\3\3\3\5\3\63\n\3\3"+
		"\3\5\3\66\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4?\n\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5M\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5p\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\7\5{\n\5\f\5\16\5~\13\5\3\6\3\6\3\7\3\7\3\7\5\7\u0085\n\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\6\n\u0092\n\n\r\n\16\n\u0093\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\5\f\u009c\n\f\3\f\3\f\3\f\3\r\3\r\3\r\7\r"+
		"\u00a4\n\r\f\r\16\r\u00a7\13\r\3\r\3\r\3\16\3\16\3\16\5\16\u00ae\n\16"+
		"\3\16\2\3\b\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\2\2\u00c2\2\34\3\2\2"+
		"\2\4\65\3\2\2\2\6>\3\2\2\2\bo\3\2\2\2\n\177\3\2\2\2\f\u0084\3\2\2\2\16"+
		"\u0086\3\2\2\2\20\u008b\3\2\2\2\22\u0091\3\2\2\2\24\u0095\3\2\2\2\26\u009b"+
		"\3\2\2\2\30\u00a0\3\2\2\2\32\u00aa\3\2\2\2\34\35\7\3\2\2\35\36\5\4\3\2"+
		"\36\37\7\2\2\3\37\3\3\2\2\2 $\7\4\2\2!#\5\32\16\2\"!\3\2\2\2#&\3\2\2\2"+
		"$\"\3\2\2\2$%\3\2\2\2%\'\3\2\2\2&$\3\2\2\2\'(\7\5\2\2(\66\5\4\3\2)-\7"+
		"\6\2\2*,\5\6\4\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\62\3\2\2\2/"+
		"-\3\2\2\2\60\61\7\7\2\2\61\63\5\b\5\2\62\60\3\2\2\2\62\63\3\2\2\2\63\64"+
		"\3\2\2\2\64\66\7\b\2\2\65 \3\2\2\2\65)\3\2\2\2\66\5\3\2\2\2\678\5\b\5"+
		"\289\7\t\2\29?\3\2\2\2:?\5\22\n\2;?\5\16\b\2<?\5\20\t\2=?\5\26\f\2>\67"+
		"\3\2\2\2>:\3\2\2\2>;\3\2\2\2><\3\2\2\2>=\3\2\2\2?\7\3\2\2\2@A\b\5\1\2"+
		"AB\7\4\2\2BC\5\b\5\2CD\7\5\2\2Dp\3\2\2\2EF\7#\2\2FG\7\25\2\2Gp\5\f\7\2"+
		"HI\7\30\2\2IL\7#\2\2JK\7\25\2\2KM\5\f\7\2LJ\3\2\2\2LM\3\2\2\2Mp\3\2\2"+
		"\2NO\7#\2\2OP\7\26\2\2Pp\7#\2\2QR\7#\2\2RS\7\26\2\2Sp\5\b\5\16Tp\7\37"+
		"\2\2Up\7 \2\2Vp\7!\2\2Wp\7\"\2\2Xp\7#\2\2YZ\7\35\2\2Z[\7#\2\2[\\\7\6\2"+
		"\2\\]\7\37\2\2]^\7\n\2\2^_\7\30\2\2_p\7\b\2\2`a\7#\2\2ab\7\13\2\2bc\7"+
		"\37\2\2cd\7\f\2\2de\7\25\2\2ep\5\f\7\2fg\7#\2\2gh\7\13\2\2hi\7\37\2\2"+
		"ip\7\f\2\2jk\7\r\2\2kl\5\b\5\2lm\7\5\2\2mp\3\2\2\2np\5\n\6\2o@\3\2\2\2"+
		"oE\3\2\2\2oH\3\2\2\2oN\3\2\2\2oQ\3\2\2\2oT\3\2\2\2oU\3\2\2\2oV\3\2\2\2"+
		"oW\3\2\2\2oX\3\2\2\2oY\3\2\2\2o`\3\2\2\2of\3\2\2\2oj\3\2\2\2on\3\2\2\2"+
		"p|\3\2\2\2qr\f\21\2\2rs\7\24\2\2s{\5\b\5\22tu\f\20\2\2uv\7\23\2\2v{\5"+
		"\b\5\21wx\f\b\2\2xy\7\27\2\2y{\5\b\5\tzq\3\2\2\2zt\3\2\2\2zw\3\2\2\2{"+
		"~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\t\3\2\2\2~|\3\2\2\2\177\u0080\7\16\2\2"+
		"\u0080\13\3\2\2\2\u0081\u0085\5\b\5\2\u0082\u0085\5\30\r\2\u0083\u0085"+
		"\5\n\6\2\u0084\u0081\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085"+
		"\r\3\2\2\2\u0086\u0087\7\17\2\2\u0087\u0088\5\b\5\2\u0088\u0089\7\5\2"+
		"\2\u0089\u008a\5\4\3\2\u008a\17\3\2\2\2\u008b\u008c\7\20\2\2\u008c\u008d"+
		"\7\37\2\2\u008d\u008e\7\21\2\2\u008e\u008f\5\4\3\2\u008f\21\3\2\2\2\u0090"+
		"\u0092\5\24\13\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3"+
		"\2\2\2\u0093\u0094\3\2\2\2\u0094\23\3\2\2\2\u0095\u0096\7\22\2\2\u0096"+
		"\u0097\5\b\5\2\u0097\u0098\7\5\2\2\u0098\u0099\5\4\3\2\u0099\25\3\2\2"+
		"\2\u009a\u009c\7\30\2\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009e\7#\2\2\u009e\u009f\5\4\3\2\u009f\27\3\2\2\2"+
		"\u00a0\u00a1\7#\2\2\u00a1\u00a5\7\4\2\2\u00a2\u00a4\5\32\16\2\u00a3\u00a2"+
		"\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\7\5\2\2\u00a9\31\3\2\2"+
		"\2\u00aa\u00ab\7\30\2\2\u00ab\u00ad\7#\2\2\u00ac\u00ae\7\n\2\2\u00ad\u00ac"+
		"\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\33\3\2\2\2\20$-\62\65>Loz|\u0084\u0093"+
		"\u009b\u00a5\u00ad";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}