// Generated from C:/Users/maxst/CNO-15/Grammar/src\Maximus.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MaximusParser}.
 */
public interface MaximusListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MaximusParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MaximusParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaximusParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MaximusParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaximusParser#scope}.
	 * @param ctx the parse tree
	 */
	void enterScope(MaximusParser.ScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaximusParser#scope}.
	 * @param ctx the parse tree
	 */
	void exitScope(MaximusParser.ScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaximusParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MaximusParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaximusParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MaximusParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exCompareEx}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExCompareEx(MaximusParser.ExCompareExContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exCompareEx}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExCompareEx(MaximusParser.ExCompareExContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exVariable}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExVariable(MaximusParser.ExVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exVariable}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExVariable(MaximusParser.ExVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExBool}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExBool(MaximusParser.ExBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExBool}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExBool(MaximusParser.ExBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exCompareId}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExCompareId(MaximusParser.ExCompareIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exCompareId}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExCompareId(MaximusParser.ExCompareIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exAdd}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExAdd(MaximusParser.ExAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exAdd}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExAdd(MaximusParser.ExAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exScan}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExScan(MaximusParser.ExScanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exScan}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExScan(MaximusParser.ExScanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiCompare}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiCompare(MaximusParser.MultiCompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiCompare}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiCompare(MaximusParser.MultiCompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exFunctionCall}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExFunctionCall(MaximusParser.ExFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exFunctionCall}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExFunctionCall(MaximusParser.ExFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayGet}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayGet(MaximusParser.ArrayGetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayGet}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayGet(MaximusParser.ArrayGetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExString}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExString(MaximusParser.ExStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExString}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExString(MaximusParser.ExStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exMul}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExMul(MaximusParser.ExMulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exMul}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExMul(MaximusParser.ExMulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExInt}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExInt(MaximusParser.ExIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExInt}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExInt(MaximusParser.ExIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExParentheses}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExParentheses(MaximusParser.ExParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExParentheses}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExParentheses(MaximusParser.ExParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExDouble}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExDouble(MaximusParser.ExDoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExDouble}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExDouble(MaximusParser.ExDoubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaximusParser#scan}.
	 * @param ctx the parse tree
	 */
	void enterScan(MaximusParser.ScanContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaximusParser#scan}.
	 * @param ctx the parse tree
	 */
	void exitScan(MaximusParser.ScanContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaximusParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(MaximusParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaximusParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(MaximusParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaximusParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MaximusParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaximusParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MaximusParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaximusParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclaration(MaximusParser.ArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaximusParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclaration(MaximusParser.ArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaximusParser#arrayAssignment}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssignment(MaximusParser.ArrayAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaximusParser#arrayAssignment}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssignment(MaximusParser.ArrayAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaximusParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(MaximusParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaximusParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(MaximusParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaximusParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(MaximusParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaximusParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(MaximusParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaximusParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(MaximusParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaximusParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(MaximusParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaximusParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(MaximusParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaximusParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(MaximusParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaximusParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(MaximusParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaximusParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(MaximusParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaximusParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(MaximusParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaximusParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(MaximusParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaximusParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(MaximusParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaximusParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(MaximusParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaximusParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(MaximusParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaximusParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(MaximusParser.PrintContext ctx);
}