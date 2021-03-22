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
	 * Enter a parse tree produced by the {@code ExAssigner}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExAssigner(MaximusParser.ExAssignerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExAssigner}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExAssigner(MaximusParser.ExAssignerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExCompareId}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExCompareId(MaximusParser.ExCompareIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExCompareId}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExCompareId(MaximusParser.ExCompareIdContext ctx);
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
	 * Enter a parse tree produced by the {@code ExCompareEx}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExCompareEx(MaximusParser.ExCompareExContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExCompareEx}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExCompareEx(MaximusParser.ExCompareExContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExAdd}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExAdd(MaximusParser.ExAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExAdd}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExAdd(MaximusParser.ExAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExId}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExId(MaximusParser.ExIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExId}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExId(MaximusParser.ExIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExInc}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExInc(MaximusParser.ExIncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExInc}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExInc(MaximusParser.ExIncContext ctx);
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
	 * Enter a parse tree produced by the {@code ExMul}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExMul(MaximusParser.ExMulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExMul}
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
	 * Enter a parse tree produced by the {@code ExArray}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExArray(MaximusParser.ExArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExArray}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExArray(MaximusParser.ExArrayContext ctx);
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
	 * Enter a parse tree produced by {@link MaximusParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(MaximusParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaximusParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(MaximusParser.FunctionContext ctx);
}