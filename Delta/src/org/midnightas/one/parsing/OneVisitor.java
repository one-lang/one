// Generated from One.g4 by ANTLR 4.5.3
package org.midnightas.one.parsing;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OneParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OneVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link OneParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(OneParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link OneParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(OneParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OneParser#funcDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDecl(OneParser.FuncDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprStatement}
	 * labeled alternative in {@link OneParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStatement(OneParser.ExprStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setVarStatement}
	 * labeled alternative in {@link OneParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetVarStatement(OneParser.SetVarStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link OneParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(OneParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link OneParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(OneParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link OneParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(OneParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleExpr}
	 * labeled alternative in {@link OneParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpr(OneParser.SimpleExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opExpr}
	 * labeled alternative in {@link OneParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpExpr(OneParser.OpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcDeclExpr}
	 * labeled alternative in {@link OneParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDeclExpr(OneParser.FuncDeclExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link OneParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(OneParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayIndexSugar}
	 * labeled alternative in {@link OneParser#exprAtomSugar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayIndexSugar(OneParser.ArrayIndexSugarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcCallSugar}
	 * labeled alternative in {@link OneParser#exprAtomSugar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallSugar(OneParser.FuncCallSugarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link OneParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAtom(OneParser.NumberAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAtom}
	 * labeled alternative in {@link OneParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAtom(OneParser.ArrayAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierAtom}
	 * labeled alternative in {@link OneParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierAtom(OneParser.IdentifierAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link OneParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(OneParser.StringAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lambdaAtom}
	 * labeled alternative in {@link OneParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaAtom(OneParser.LambdaAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link OneParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(OneParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link OneParser#funcCallArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallArgs(OneParser.FuncCallArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OneParser#funcDeclArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDeclArgs(OneParser.FuncDeclArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OneParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(OneParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link OneParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(OneParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link OneParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(OneParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link OneParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(OneParser.NumberContext ctx);
}