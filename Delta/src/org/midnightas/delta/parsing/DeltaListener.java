// Generated from Delta.g4 by ANTLR 4.5.3
package org.midnightas.delta.parsing;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DeltaParser}.
 */
public interface DeltaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DeltaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DeltaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeltaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DeltaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeltaParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void enterFuncDecl(DeltaParser.FuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeltaParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void exitFuncDecl(DeltaParser.FuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprStatement}
	 * labeled alternative in {@link DeltaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExprStatement(DeltaParser.ExprStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprStatement}
	 * labeled alternative in {@link DeltaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExprStatement(DeltaParser.ExprStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setVarStatement}
	 * labeled alternative in {@link DeltaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetVarStatement(DeltaParser.SetVarStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setVarStatement}
	 * labeled alternative in {@link DeltaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetVarStatement(DeltaParser.SetVarStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleExpr}
	 * labeled alternative in {@link DeltaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpr(DeltaParser.SimpleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleExpr}
	 * labeled alternative in {@link DeltaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpr(DeltaParser.SimpleExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opExpr}
	 * labeled alternative in {@link DeltaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOpExpr(DeltaParser.OpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opExpr}
	 * labeled alternative in {@link DeltaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOpExpr(DeltaParser.OpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link DeltaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(DeltaParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link DeltaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(DeltaParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayIndexSugar}
	 * labeled alternative in {@link DeltaParser#exprAtomSugar}.
	 * @param ctx the parse tree
	 */
	void enterArrayIndexSugar(DeltaParser.ArrayIndexSugarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayIndexSugar}
	 * labeled alternative in {@link DeltaParser#exprAtomSugar}.
	 * @param ctx the parse tree
	 */
	void exitArrayIndexSugar(DeltaParser.ArrayIndexSugarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcCallSugar}
	 * labeled alternative in {@link DeltaParser#exprAtomSugar}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallSugar(DeltaParser.FuncCallSugarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcCallSugar}
	 * labeled alternative in {@link DeltaParser#exprAtomSugar}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallSugar(DeltaParser.FuncCallSugarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link DeltaParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(DeltaParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link DeltaParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(DeltaParser.NumberAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAtom}
	 * labeled alternative in {@link DeltaParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterArrayAtom(DeltaParser.ArrayAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAtom}
	 * labeled alternative in {@link DeltaParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitArrayAtom(DeltaParser.ArrayAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierAtom}
	 * labeled alternative in {@link DeltaParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierAtom(DeltaParser.IdentifierAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierAtom}
	 * labeled alternative in {@link DeltaParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierAtom(DeltaParser.IdentifierAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link DeltaParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(DeltaParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link DeltaParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(DeltaParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lambdaAtom}
	 * labeled alternative in {@link DeltaParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterLambdaAtom(DeltaParser.LambdaAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lambdaAtom}
	 * labeled alternative in {@link DeltaParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitLambdaAtom(DeltaParser.LambdaAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeltaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(DeltaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeltaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(DeltaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeltaParser#funcCallArgs}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallArgs(DeltaParser.FuncCallArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeltaParser#funcCallArgs}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallArgs(DeltaParser.FuncCallArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeltaParser#funcDeclArgs}.
	 * @param ctx the parse tree
	 */
	void enterFuncDeclArgs(DeltaParser.FuncDeclArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeltaParser#funcDeclArgs}.
	 * @param ctx the parse tree
	 */
	void exitFuncDeclArgs(DeltaParser.FuncDeclArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeltaParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(DeltaParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeltaParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(DeltaParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeltaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(DeltaParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeltaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(DeltaParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeltaParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(DeltaParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeltaParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(DeltaParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeltaParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(DeltaParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeltaParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(DeltaParser.NumberContext ctx);
}