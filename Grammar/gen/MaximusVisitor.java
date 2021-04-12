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
	 * Visit a parse tree produced by {@link MaximusParser#scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScope(MaximusParser.ScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaximusParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MaximusParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exCompareEx}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExCompareEx(MaximusParser.ExCompareExContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exArray}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExArray(MaximusParser.ExArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exVariable}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExVariable(MaximusParser.ExVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExBool}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExBool(MaximusParser.ExBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(MaximusParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exCompareId}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExCompareId(MaximusParser.ExCompareIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exAdd}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExAdd(MaximusParser.ExAddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exScan}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExScan(MaximusParser.ExScanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaration}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(MaximusParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exPrint}
	 * labeled alternative in {@link MaximusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExPrint(MaximusParser.ExPrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exInc}
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
	 * Visit a parse tree produced by the {@code exMul}
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
	 * Visit a parse tree produced by {@link MaximusParser#scan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScan(MaximusParser.ScanContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaximusParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(MaximusParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaximusParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(MaximusParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaximusParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(MaximusParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaximusParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(MaximusParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaximusParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(MaximusParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaximusParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(MaximusParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaximusParser#declaredFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaredFunction(MaximusParser.DeclaredFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MaximusParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(MaximusParser.ParameterContext ctx);
}