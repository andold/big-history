// Generated from C:\src\eclipse-workspace\big-history\src\main\resources\DateTime.g4 by ANTLR 4.10.1
package kr.andold.bhistory.antlr;

import java.util.Calendar;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.andold.utils.Utility;
import kr.andold.bhistory.domain.BigBang;
import kr.andold.bhistory.domain.AnnoDomini;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DateTimeParser}.
 */
public interface DateTimeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DateTimeParser#dateString}.
	 * @param ctx the parse tree
	 */
	void enterDateString(DateTimeParser.DateStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateTimeParser#dateString}.
	 * @param ctx the parse tree
	 */
	void exitDateString(DateTimeParser.DateStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateTimeParser#ad}.
	 * @param ctx the parse tree
	 */
	void enterAd(DateTimeParser.AdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateTimeParser#ad}.
	 * @param ctx the parse tree
	 */
	void exitAd(DateTimeParser.AdContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateTimeParser#bigbang}.
	 * @param ctx the parse tree
	 */
	void enterBigbang(DateTimeParser.BigbangContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateTimeParser#bigbang}.
	 * @param ctx the parse tree
	 */
	void exitBigbang(DateTimeParser.BigbangContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateTimeParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(DateTimeParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateTimeParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(DateTimeParser.SignContext ctx);
}