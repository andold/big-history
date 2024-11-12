// Generated from C:\src\eclipse-workspace\big-history\src\main\resources\BigHistoryDateTime.g4 by ANTLR 4.10.1
package kr.andold.bhistory.antlr;

import java.util.Calendar;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.andold.utils.Utility;
import kr.andold.bhistory.domain.BigHistoryDateTime;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BigHistoryDateTimeParser}.
 */
public interface BigHistoryDateTimeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BigHistoryDateTimeParser#bigHistoryDateTime}.
	 * @param ctx the parse tree
	 */
	void enterBigHistoryDateTime(BigHistoryDateTimeParser.BigHistoryDateTimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BigHistoryDateTimeParser#bigHistoryDateTime}.
	 * @param ctx the parse tree
	 */
	void exitBigHistoryDateTime(BigHistoryDateTimeParser.BigHistoryDateTimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BigHistoryDateTimeParser#annoDomini}.
	 * @param ctx the parse tree
	 */
	void enterAnnoDomini(BigHistoryDateTimeParser.AnnoDominiContext ctx);
	/**
	 * Exit a parse tree produced by {@link BigHistoryDateTimeParser#annoDomini}.
	 * @param ctx the parse tree
	 */
	void exitAnnoDomini(BigHistoryDateTimeParser.AnnoDominiContext ctx);
	/**
	 * Enter a parse tree produced by {@link BigHistoryDateTimeParser#bigbang}.
	 * @param ctx the parse tree
	 */
	void enterBigbang(BigHistoryDateTimeParser.BigbangContext ctx);
	/**
	 * Exit a parse tree produced by {@link BigHistoryDateTimeParser#bigbang}.
	 * @param ctx the parse tree
	 */
	void exitBigbang(BigHistoryDateTimeParser.BigbangContext ctx);
	/**
	 * Enter a parse tree produced by {@link BigHistoryDateTimeParser#timeUnitMark}.
	 * @param ctx the parse tree
	 */
	void enterTimeUnitMark(BigHistoryDateTimeParser.TimeUnitMarkContext ctx);
	/**
	 * Exit a parse tree produced by {@link BigHistoryDateTimeParser#timeUnitMark}.
	 * @param ctx the parse tree
	 */
	void exitTimeUnitMark(BigHistoryDateTimeParser.TimeUnitMarkContext ctx);
	/**
	 * Enter a parse tree produced by {@link BigHistoryDateTimeParser#yearMark}.
	 * @param ctx the parse tree
	 */
	void enterYearMark(BigHistoryDateTimeParser.YearMarkContext ctx);
	/**
	 * Exit a parse tree produced by {@link BigHistoryDateTimeParser#yearMark}.
	 * @param ctx the parse tree
	 */
	void exitYearMark(BigHistoryDateTimeParser.YearMarkContext ctx);
	/**
	 * Enter a parse tree produced by {@link BigHistoryDateTimeParser#monthMark}.
	 * @param ctx the parse tree
	 */
	void enterMonthMark(BigHistoryDateTimeParser.MonthMarkContext ctx);
	/**
	 * Exit a parse tree produced by {@link BigHistoryDateTimeParser#monthMark}.
	 * @param ctx the parse tree
	 */
	void exitMonthMark(BigHistoryDateTimeParser.MonthMarkContext ctx);
	/**
	 * Enter a parse tree produced by {@link BigHistoryDateTimeParser#dayMark}.
	 * @param ctx the parse tree
	 */
	void enterDayMark(BigHistoryDateTimeParser.DayMarkContext ctx);
	/**
	 * Exit a parse tree produced by {@link BigHistoryDateTimeParser#dayMark}.
	 * @param ctx the parse tree
	 */
	void exitDayMark(BigHistoryDateTimeParser.DayMarkContext ctx);
	/**
	 * Enter a parse tree produced by {@link BigHistoryDateTimeParser#minuteMark}.
	 * @param ctx the parse tree
	 */
	void enterMinuteMark(BigHistoryDateTimeParser.MinuteMarkContext ctx);
	/**
	 * Exit a parse tree produced by {@link BigHistoryDateTimeParser#minuteMark}.
	 * @param ctx the parse tree
	 */
	void exitMinuteMark(BigHistoryDateTimeParser.MinuteMarkContext ctx);
	/**
	 * Enter a parse tree produced by {@link BigHistoryDateTimeParser#secondMark}.
	 * @param ctx the parse tree
	 */
	void enterSecondMark(BigHistoryDateTimeParser.SecondMarkContext ctx);
	/**
	 * Exit a parse tree produced by {@link BigHistoryDateTimeParser#secondMark}.
	 * @param ctx the parse tree
	 */
	void exitSecondMark(BigHistoryDateTimeParser.SecondMarkContext ctx);
	/**
	 * Enter a parse tree produced by {@link BigHistoryDateTimeParser#numberFloat}.
	 * @param ctx the parse tree
	 */
	void enterNumberFloat(BigHistoryDateTimeParser.NumberFloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link BigHistoryDateTimeParser#numberFloat}.
	 * @param ctx the parse tree
	 */
	void exitNumberFloat(BigHistoryDateTimeParser.NumberFloatContext ctx);
	/**
	 * Enter a parse tree produced by {@link BigHistoryDateTimeParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(BigHistoryDateTimeParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link BigHistoryDateTimeParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(BigHistoryDateTimeParser.SignContext ctx);
}