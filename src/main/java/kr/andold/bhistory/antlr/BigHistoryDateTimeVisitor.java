// Generated from C:\src\eclipse-workspace\big-history\src\main\resources\BigHistoryDateTime.g4 by ANTLR 4.10.1
package kr.andold.bhistory.antlr;

import java.util.Calendar;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.andold.utils.Utility;
import kr.andold.bhistory.domain.BigHistoryDateTime;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BigHistoryDateTimeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BigHistoryDateTimeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BigHistoryDateTimeParser#bigHistoryDateTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBigHistoryDateTime(BigHistoryDateTimeParser.BigHistoryDateTimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BigHistoryDateTimeParser#annoDomini}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnoDomini(BigHistoryDateTimeParser.AnnoDominiContext ctx);
	/**
	 * Visit a parse tree produced by {@link BigHistoryDateTimeParser#bigbang}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBigbang(BigHistoryDateTimeParser.BigbangContext ctx);
	/**
	 * Visit a parse tree produced by {@link BigHistoryDateTimeParser#timeUnitMark}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeUnitMark(BigHistoryDateTimeParser.TimeUnitMarkContext ctx);
	/**
	 * Visit a parse tree produced by {@link BigHistoryDateTimeParser#yearMark}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYearMark(BigHistoryDateTimeParser.YearMarkContext ctx);
	/**
	 * Visit a parse tree produced by {@link BigHistoryDateTimeParser#monthMark}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonthMark(BigHistoryDateTimeParser.MonthMarkContext ctx);
	/**
	 * Visit a parse tree produced by {@link BigHistoryDateTimeParser#dayMark}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDayMark(BigHistoryDateTimeParser.DayMarkContext ctx);
	/**
	 * Visit a parse tree produced by {@link BigHistoryDateTimeParser#minuteMark}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinuteMark(BigHistoryDateTimeParser.MinuteMarkContext ctx);
	/**
	 * Visit a parse tree produced by {@link BigHistoryDateTimeParser#secondMark}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecondMark(BigHistoryDateTimeParser.SecondMarkContext ctx);
	/**
	 * Visit a parse tree produced by {@link BigHistoryDateTimeParser#numberFloat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberFloat(BigHistoryDateTimeParser.NumberFloatContext ctx);
	/**
	 * Visit a parse tree produced by {@link BigHistoryDateTimeParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(BigHistoryDateTimeParser.SignContext ctx);
}