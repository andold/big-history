// Generated from C:\src\eclipse-workspace\big-history\src\main\resources\DateTime.g4 by ANTLR 4.10.1
package kr.andold.bhistory.antlr;

import java.util.Calendar;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.andold.utils.Utility;
import kr.andold.bhistory.domain.BigBang;
import kr.andold.bhistory.domain.AnnoDomini;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DateTimeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DateTimeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DateTimeParser#dateString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateString(DateTimeParser.DateStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateTimeParser#ad}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAd(DateTimeParser.AdContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateTimeParser#bigbang}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBigbang(DateTimeParser.BigbangContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateTimeParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(DateTimeParser.SignContext ctx);
}