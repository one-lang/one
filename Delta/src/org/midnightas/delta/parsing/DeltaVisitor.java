// Generated from Delta.g4 by ANTLR 4.5.3
package org.midnightas.delta.parsing;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DeltaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DeltaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DeltaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DeltaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeltaParser#funcDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDecl(DeltaParser.FuncDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprStatement}
	 * labeled alternative in {@link DeltaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStatement(DeltaParser.ExprStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setVarStatement}
	 * labeled alternative in {@link DeltaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetVarStatement(DeltaParser.SetVarStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleExpr}
	 * labeled alternative in {@link DeltaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpr(DeltaParser.SimpleExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opExpr}
	 * labeled alternative in {@link DeltaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpExpr(DeltaParser.OpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link DeltaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(DeltaParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayIndexSugar}
	 * labeled alternative in {@link DeltaParser#exprAtomSugar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayIndexSugar(DeltaParser.ArrayIndexSugarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcCallSugar}
	 * labeled alternative in {@link DeltaParser#exprAtomSugar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallSugar(DeltaParser.FuncCallSugarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link DeltaParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAtom(DeltaParser.NumberAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAtom}
	 * labeled alternative in {@link DeltaParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAtom(DeltaParser.ArrayAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierAtom}
	 * labeled alternative in {@link DeltaParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierAtom(DeltaParser.IdentifierAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link DeltaParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(DeltaParser.StringAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lambdaAtom}
	 * labeled alternative in {@link DeltaParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaAtom(DeltaParser.LambdaAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeltaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(DeltaParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeltaParser#funcCallArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallArgs(DeltaParser.FuncCallArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeltaParser#funcDeclArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDeclArgs(DeltaParser.FuncDeclArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeltaParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(DeltaParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeltaParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(DeltaParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeltaParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(DeltaParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeltaParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(DeltaParser.NumberContext ctx);
}