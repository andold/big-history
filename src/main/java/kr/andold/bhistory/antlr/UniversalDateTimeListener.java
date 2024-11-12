// Generated from C:\src\eclipse-workspace\big-history\src\main\resources\UniversalDateTime.g4 by ANTLR 4.10.1
package kr.andold.bhistory.antlr;

import java.util.Calendar;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.andold.utils.Utility;
import kr.andold.bhistory.domain.UniversalDateTime;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UniversalDateTimeParser}.
 */
public interface UniversalDateTimeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link UniversalDateTimeParser#universalDateTime}.
	 * @param ctx the parse tree
	 */
	void enterUniversalDateTime(UniversalDateTimeParser.UniversalDateTimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UniversalDateTimeParser#universalDateTime}.
	 * @param ctx the parse tree
	 */
	void exitUniversalDateTime(UniversalDateTimeParser.UniversalDateTimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UniversalDateTimeParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(UniversalDateTimeParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link UniversalDateTimeParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(UniversalDateTimeParser.SignContext ctx);
}