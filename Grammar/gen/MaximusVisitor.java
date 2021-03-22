// Generated from C:/Users/maxst/CNO-15/Grammar/src\Maximus.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MaximusParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MaximusVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MaximusParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MaximusParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaximusParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MaximusParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExAssigner}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExAssigner(MaximusParser.ExAssignerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExCompareId}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExCompareId(MaximusParser.ExCompareIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExBool}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExBool(MaximusParser.ExBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExCompareEx}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExCompareEx(MaximusParser.ExCompareExContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExAdd}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExAdd(MaximusParser.ExAddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExId}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExId(MaximusParser.ExIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExInc}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExInc(MaximusParser.ExIncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExString}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExString(MaximusParser.ExStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExMul}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExMul(MaximusParser.ExMulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExInt}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExInt(MaximusParser.ExIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExArray}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExArray(MaximusParser.ExArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExParentheses}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExParentheses(MaximusParser.ExParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExDouble}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExDouble(MaximusParser.ExDoubleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaximusParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(MaximusParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaximusParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(MaximusParser.FunctionContext ctx);
}