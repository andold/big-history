// Generated from C:\src\eclipse-workspace\big-history\src\main\resources\UniversalDateTime.g4 by ANTLR 4.10.1
package kr.andold.bhistory.antlr;

import java.util.Calendar;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.andold.utils.Utility;
import kr.andold.bhistory.domain.UniversalDateTime;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link UniversalDateTimeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface UniversalDateTimeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link UniversalDateTimeParser#universalDateTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniversalDateTime(UniversalDateTimeParser.UniversalDateTimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UniversalDateTimeParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(UniversalDateTimeParser.SignContext ctx);
}