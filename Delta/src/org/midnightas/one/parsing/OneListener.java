// Generated from One.g4 by ANTLR 4.5.3
package org.midnightas.one.parsing;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OneParser}.
 */
public interface OneListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OneParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(OneParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link OneParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(OneParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link OneParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(OneParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OneParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(OneParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OneParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void enterFuncDecl(OneParser.FuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link OneParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void exitFuncDecl(OneParser.FuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprStatement}
	 * labeled alternative in {@link OneParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExprStatement(OneParser.ExprStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprStatement}
	 * labeled alternative in {@link OneParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExprStatement(OneParser.ExprStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setVarStatement}
	 * labeled alternative in {@link OneParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetVarStatement(OneParser.SetVarStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setVarStatement}
	 * labeled alternative in {@link OneParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetVarStatement(OneParser.SetVarStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link OneParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(OneParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link OneParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(OneParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link OneParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(OneParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link OneParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(OneParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link OneParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(OneParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link OneParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(OneParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleExpr}
	 * labeled alternative in {@link OneParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpr(OneParser.SimpleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleExpr}
	 * labeled alternative in {@link OneParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpr(OneParser.SimpleExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opExpr}
	 * labeled alternative in {@link OneParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOpExpr(OneParser.OpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opExpr}
	 * labeled alternative in {@link OneParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOpExpr(OneParser.OpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcDeclExpr}
	 * labeled alternative in {@link OneParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncDeclExpr(OneParser.FuncDeclExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcDeclExpr}
	 * labeled alternative in {@link OneParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncDeclExpr(OneParser.FuncDeclExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link OneParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(OneParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link OneParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(OneParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayIndexSugar}
	 * labeled alternative in {@link OneParser#exprAtomSugar}.
	 * @param ctx the parse tree
	 */
	void enterArrayIndexSugar(OneParser.ArrayIndexSugarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayIndexSugar}
	 * labeled alternative in {@link OneParser#exprAtomSugar}.
	 * @param ctx the parse tree
	 */
	void exitArrayIndexSugar(OneParser.ArrayIndexSugarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcCallSugar}
	 * labeled alternative in {@link OneParser#exprAtomSugar}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallSugar(OneParser.FuncCallSugarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcCallSugar}
	 * labeled alternative in {@link OneParser#exprAtomSugar}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallSugar(OneParser.FuncCallSugarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link OneParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(OneParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link OneParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(OneParser.NumberAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAtom}
	 * labeled alternative in {@link OneParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterArrayAtom(OneParser.ArrayAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAtom}
	 * labeled alternative in {@link OneParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitArrayAtom(OneParser.ArrayAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierAtom}
	 * labeled alternative in {@link OneParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierAtom(OneParser.IdentifierAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierAtom}
	 * labeled alternative in {@link OneParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierAtom(OneParser.IdentifierAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link OneParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(OneParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link OneParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(OneParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lambdaAtom}
	 * labeled alternative in {@link OneParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterLambdaAtom(OneParser.LambdaAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lambdaAtom}
	 * labeled alternative in {@link OneParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitLambdaAtom(OneParser.LambdaAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link OneParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(OneParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link OneParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(OneParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link OneParser#funcCallArgs}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallArgs(OneParser.FuncCallArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OneParser#funcCallArgs}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallArgs(OneParser.FuncCallArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OneParser#funcDeclArgs}.
	 * @param ctx the parse tree
	 */
	void enterFuncDeclArgs(OneParser.FuncDeclArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OneParser#funcDeclArgs}.
	 * @param ctx the parse tree
	 */
	void exitFuncDeclArgs(OneParser.FuncDeclArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OneParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(OneParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link OneParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(OneParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link OneParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(OneParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OneParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(OneParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link OneParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(OneParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link OneParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(OneParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link OneParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(OneParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link OneParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(OneParser.NumberContext ctx);
}