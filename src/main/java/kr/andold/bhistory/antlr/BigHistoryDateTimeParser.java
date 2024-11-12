// Generated from C:\src\eclipse-workspace\big-history\src\main\resources\BigHistoryDateTime.g4 by ANTLR 4.10.1
package kr.andold.bhistory.antlr;

import java.util.Calendar;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.andold.utils.Utility;
import kr.andold.bhistory.domain.BigHistoryDateTime;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BigHistoryDateTimeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, BLANK=8, BLANK_LINE=9, 
		BIGBANG=10, BRACKET_LEFT=11, BRACKET_RIGHT=12, COLON=13, DAY=14, DOT=15, 
		EXPONENT_MARK=16, INTEGER=17, KING=18, LUNAR=19, MINUS=20, MONTH=21, NUMBER1E1=22, 
		NUMBER1E2=23, NUMBER1E3=24, NUMBER1E4=25, NUMBER1E8=26, PLUS=27, SECOND=28, 
		YEAR=29;
	public static final int
		RULE_bigHistoryDateTime = 0, RULE_annoDomini = 1, RULE_bigbang = 2, RULE_timeUnitMark = 3, 
		RULE_yearMark = 4, RULE_monthMark = 5, RULE_dayMark = 6, RULE_minuteMark = 7, 
		RULE_secondMark = 8, RULE_numberFloat = 9, RULE_sign = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"bigHistoryDateTime", "annoDomini", "bigbang", "timeUnitMark", "yearMark", 
			"monthMark", "dayMark", "minuteMark", "secondMark", "numberFloat", "sign"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'AD'", "'year'", "'\\uBD84'", "'minute'", "'s'", "'sec'", "'ond'", 
			null, null, null, "'('", "')'", "':'", "'\\uC77C'", "'.'", null, null, 
			"'\\uC120\\uC870'", "'\\uC74C\\uB825'", "'-'", "'\\uC6D4'", "'\\uC2ED'", 
			"'\\uBC31'", "'\\uCC9C'", "'\\uB9CC'", "'\\uC5B5'", "'+'", "'\\uCD08'", 
			"'\\uB144'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "BLANK", "BLANK_LINE", 
			"BIGBANG", "BRACKET_LEFT", "BRACKET_RIGHT", "COLON", "DAY", "DOT", "EXPONENT_MARK", 
			"INTEGER", "KING", "LUNAR", "MINUS", "MONTH", "NUMBER1E1", "NUMBER1E2", 
			"NUMBER1E3", "NUMBER1E4", "NUMBER1E8", "PLUS", "SECOND", "YEAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "BigHistoryDateTime.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		private final Logger log = LoggerFactory.getLogger(getClass());


	public BigHistoryDateTimeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class BigHistoryDateTimeContext extends ParserRuleContext {
		public BigHistoryDateTime value;
		public BigbangContext bigbang;
		public AnnoDominiContext annoDomini;
		public BigbangContext bigbang() {
			return getRuleContext(BigbangContext.class,0);
		}
		public AnnoDominiContext annoDomini() {
			return getRuleContext(AnnoDominiContext.class,0);
		}
		public BigHistoryDateTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bigHistoryDateTime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BigHistoryDateTimeListener ) ((BigHistoryDateTimeListener)listener).enterBigHistoryDateTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BigHistoryDateTimeListener ) ((BigHistoryDateTimeListener)listener).exitBigHistoryDateTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BigHistoryDateTimeVisitor ) return ((BigHistoryDateTimeVisitor<? extends T>)visitor).visitBigHistoryDateTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BigHistoryDateTimeContext bigHistoryDateTime() throws RecognitionException {
		BigHistoryDateTimeContext _localctx = new BigHistoryDateTimeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_bigHistoryDateTime);
		try {
			setState(28);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				((BigHistoryDateTimeContext)_localctx).bigbang = bigbang();

					((BigHistoryDateTimeContext)_localctx).value =  BigHistoryDateTime.of(((BigHistoryDateTimeContext)_localctx).bigbang.value);

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				((BigHistoryDateTimeContext)_localctx).annoDomini = annoDomini();

					((BigHistoryDateTimeContext)_localctx).value =  BigHistoryDateTime.of(((BigHistoryDateTimeContext)_localctx).annoDomini.valueYear, ((BigHistoryDateTimeContext)_localctx).annoDomini.valueMonth, ((BigHistoryDateTimeContext)_localctx).annoDomini.valueDay);

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnoDominiContext extends ParserRuleContext {
		public Integer valueYear;
		public Integer valueMonth;
		public Integer valueDay;
		public Token year;
		public Token month;
		public Token day;
		public List<TerminalNode> INTEGER() { return getTokens(BigHistoryDateTimeParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(BigHistoryDateTimeParser.INTEGER, i);
		}
		public YearMarkContext yearMark() {
			return getRuleContext(YearMarkContext.class,0);
		}
		public List<TerminalNode> MINUS() { return getTokens(BigHistoryDateTimeParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(BigHistoryDateTimeParser.MINUS, i);
		}
		public MonthMarkContext monthMark() {
			return getRuleContext(MonthMarkContext.class,0);
		}
		public DayMarkContext dayMark() {
			return getRuleContext(DayMarkContext.class,0);
		}
		public AnnoDominiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annoDomini; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BigHistoryDateTimeListener ) ((BigHistoryDateTimeListener)listener).enterAnnoDomini(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BigHistoryDateTimeListener ) ((BigHistoryDateTimeListener)listener).exitAnnoDomini(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BigHistoryDateTimeVisitor ) return ((BigHistoryDateTimeVisitor<? extends T>)visitor).visitAnnoDomini(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnoDominiContext annoDomini() throws RecognitionException {
		AnnoDominiContext _localctx = new AnnoDominiContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_annoDomini);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(30);
				match(T__0);
				}
			}

			setState(33);
			((AnnoDominiContext)_localctx).year = match(INTEGER);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1 || _la==YEAR) {
				{
				setState(34);
				yearMark();
				}
			}

			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTEGER || _la==MINUS) {
				{
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(37);
					match(MINUS);
					}
				}

				setState(40);
				((AnnoDominiContext)_localctx).month = match(INTEGER);
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MONTH) {
					{
					setState(41);
					monthMark();
					}
				}

				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(44);
					match(MINUS);
					}
				}

				setState(47);
				((AnnoDominiContext)_localctx).day = match(INTEGER);
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DAY) {
					{
					setState(48);
					dayMark();
					}
				}

				}
			}


				((AnnoDominiContext)_localctx).valueYear =  Utility.parseInteger((((AnnoDominiContext)_localctx).year!=null?((AnnoDominiContext)_localctx).year.getText():null));
				((AnnoDominiContext)_localctx).valueMonth =  Utility.parseInteger((((AnnoDominiContext)_localctx).month!=null?((AnnoDominiContext)_localctx).month.getText():null));
				((AnnoDominiContext)_localctx).valueDay =  Utility.parseInteger((((AnnoDominiContext)_localctx).day!=null?((AnnoDominiContext)_localctx).day.getText():null));

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BigbangContext extends ParserRuleContext {
		public Double value;
		public NumberFloatContext numberFloat;
		public TimeUnitMarkContext timeUnitMark;
		public NumberFloatContext numberFloat() {
			return getRuleContext(NumberFloatContext.class,0);
		}
		public TimeUnitMarkContext timeUnitMark() {
			return getRuleContext(TimeUnitMarkContext.class,0);
		}
		public BigbangContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bigbang; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BigHistoryDateTimeListener ) ((BigHistoryDateTimeListener)listener).enterBigbang(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BigHistoryDateTimeListener ) ((BigHistoryDateTimeListener)listener).exitBigbang(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BigHistoryDateTimeVisitor ) return ((BigHistoryDateTimeVisitor<? extends T>)visitor).visitBigbang(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BigbangContext bigbang() throws RecognitionException {
		BigbangContext _localctx = new BigbangContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bigbang);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			((BigbangContext)_localctx).numberFloat = numberFloat();
			setState(56);
			((BigbangContext)_localctx).timeUnitMark = timeUnitMark();
				((BigbangContext)_localctx).value =  Utility.parseDouble((((BigbangContext)_localctx).numberFloat!=null?_input.getText(((BigbangContext)_localctx).numberFloat.start,((BigbangContext)_localctx).numberFloat.stop):null)) * ((BigbangContext)_localctx).timeUnitMark.value; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeUnitMarkContext extends ParserRuleContext {
		public Double value;
		public SecondMarkContext secondMark() {
			return getRuleContext(SecondMarkContext.class,0);
		}
		public MinuteMarkContext minuteMark() {
			return getRuleContext(MinuteMarkContext.class,0);
		}
		public YearMarkContext yearMark() {
			return getRuleContext(YearMarkContext.class,0);
		}
		public TimeUnitMarkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeUnitMark; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BigHistoryDateTimeListener ) ((BigHistoryDateTimeListener)listener).enterTimeUnitMark(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BigHistoryDateTimeListener ) ((BigHistoryDateTimeListener)listener).exitTimeUnitMark(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BigHistoryDateTimeVisitor ) return ((BigHistoryDateTimeVisitor<? extends T>)visitor).visitTimeUnitMark(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeUnitMarkContext timeUnitMark() throws RecognitionException {
		TimeUnitMarkContext _localctx = new TimeUnitMarkContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_timeUnitMark);
		int _la;
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__5:
			case SECOND:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5 || _la==SECOND) {
					{
					setState(59);
					secondMark();
					}
				}

					((TimeUnitMarkContext)_localctx).value =  1d;	
				}
				break;
			case T__2:
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				minuteMark();
					((TimeUnitMarkContext)_localctx).value =  60d;	
				}
				break;
			case T__1:
			case YEAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				yearMark();
					((TimeUnitMarkContext)_localctx).value =  3600d * 24d * 31556926.08d;	
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YearMarkContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(BigHistoryDateTimeParser.YEAR, 0); }
		public YearMarkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yearMark; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BigHistoryDateTimeListener ) ((BigHistoryDateTimeListener)listener).enterYearMark(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BigHistoryDateTimeListener ) ((BigHistoryDateTimeListener)listener).exitYearMark(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BigHistoryDateTimeVisitor ) return ((BigHistoryDateTimeVisitor<? extends T>)visitor).visitYearMark(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YearMarkContext yearMark() throws RecognitionException {
		YearMarkContext _localctx = new YearMarkContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_yearMark);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==YEAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MonthMarkContext extends ParserRuleContext {
		public TerminalNode MONTH() { return getToken(BigHistoryDateTimeParser.MONTH, 0); }
		public MonthMarkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_monthMark; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BigHistoryDateTimeListener ) ((BigHistoryDateTimeListener)listener).enterMonthMark(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BigHistoryDateTimeListener ) ((BigHistoryDateTimeListener)listener).exitMonthMark(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BigHistoryDateTimeVisitor ) return ((BigHistoryDateTimeVisitor<? extends T>)visitor).visitMonthMark(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MonthMarkContext monthMark() throws RecognitionException {
		MonthMarkContext _localctx = new MonthMarkContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_monthMark);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(MONTH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DayMarkContext extends ParserRuleContext {
		public TerminalNode DAY() { return getToken(BigHistoryDateTimeParser.DAY, 0); }
		public DayMarkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dayMark; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BigHistoryDateTimeListener ) ((BigHistoryDateTimeListener)listener).enterDayMark(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BigHistoryDateTimeListener ) ((BigHistoryDateTimeListener)listener).exitDayMark(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BigHistoryDateTimeVisitor ) return ((BigHistoryDateTimeVisitor<? extends T>)visitor).visitDayMark(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DayMarkContext dayMark() throws RecognitionException {
		DayMarkContext _localctx = new DayMarkContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dayMark);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(DAY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MinuteMarkContext extends ParserRuleContext {
		public MinuteMarkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minuteMark; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BigHistoryDateTimeListener ) ((BigHistoryDateTimeListener)listener).enterMinuteMark(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BigHistoryDateTimeListener ) ((BigHistoryDateTimeListener)listener).exitMinuteMark(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BigHistoryDateTimeVisitor ) return ((BigHistoryDateTimeVisitor<? extends T>)visitor).visitMinuteMark(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinuteMarkContext minuteMark() throws RecognitionException {
		MinuteMarkContext _localctx = new MinuteMarkContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_minuteMark);
		int _la;
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(T__2);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(T__3);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(79);
					match(T__4);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SecondMarkContext extends ParserRuleContext {
		public TerminalNode SECOND() { return getToken(BigHistoryDateTimeParser.SECOND, 0); }
		public SecondMarkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secondMark; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BigHistoryDateTimeListener ) ((BigHistoryDateTimeListener)listener).enterSecondMark(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BigHistoryDateTimeListener ) ((BigHistoryDateTimeListener)listener).exitSecondMark(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BigHistoryDateTimeVisitor ) return ((BigHistoryDateTimeVisitor<? extends T>)visitor).visitSecondMark(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecondMarkContext secondMark() throws RecognitionException {
		SecondMarkContext _localctx = new SecondMarkContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_secondMark);
		int _la;
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SECOND:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(SECOND);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(T__5);
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4 || _la==T__6) {
					{
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__6) {
						{
						setState(86);
						match(T__6);
						}
					}

					setState(89);
					match(T__4);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberFloatContext extends ParserRuleContext {
		public List<TerminalNode> INTEGER() { return getTokens(BigHistoryDateTimeParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(BigHistoryDateTimeParser.INTEGER, i);
		}
		public TerminalNode EXPONENT_MARK() { return getToken(BigHistoryDateTimeParser.EXPONENT_MARK, 0); }
		public TerminalNode DOT() { return getToken(BigHistoryDateTimeParser.DOT, 0); }
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public NumberFloatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberFloat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BigHistoryDateTimeListener ) ((BigHistoryDateTimeListener)listener).enterNumberFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BigHistoryDateTimeListener ) ((BigHistoryDateTimeListener)listener).exitNumberFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BigHistoryDateTimeVisitor ) return ((BigHistoryDateTimeVisitor<? extends T>)visitor).visitNumberFloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberFloatContext numberFloat() throws RecognitionException {
		NumberFloatContext _localctx = new NumberFloatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_numberFloat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(INTEGER);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(95);
				match(DOT);
				setState(96);
				match(INTEGER);
				}
			}

			setState(99);
			match(EXPONENT_MARK);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS || _la==PLUS) {
				{
				setState(100);
				sign();
				}
			}

			setState(103);
			match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(BigHistoryDateTimeParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(BigHistoryDateTimeParser.MINUS, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BigHistoryDateTimeListener ) ((BigHistoryDateTimeListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BigHistoryDateTimeListener ) ((BigHistoryDateTimeListener)listener).exitSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BigHistoryDateTimeVisitor ) return ((BigHistoryDateTimeVisitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_la = _input.LA(1);
			if ( !(_la==MINUS || _la==PLUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001dl\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u001d\b\u0000\u0001"+
		"\u0001\u0003\u0001 \b\u0001\u0001\u0001\u0001\u0001\u0003\u0001$\b\u0001"+
		"\u0001\u0001\u0003\u0001\'\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"+\b\u0001\u0001\u0001\u0003\u0001.\b\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u00012\b\u0001\u0003\u00014\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0003\u0003=\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003F\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007Q\b\u0007\u0003\u0007S\b\u0007\u0001\b\u0001\b\u0001\b\u0003"+
		"\bX\b\b\u0001\b\u0003\b[\b\b\u0003\b]\b\b\u0001\t\u0001\t\u0001\t\u0003"+
		"\tb\b\t\u0001\t\u0001\t\u0003\tf\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0000\u0000\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0000\u0002\u0002\u0000\u0002\u0002\u001d\u001d\u0002\u0000\u0014\u0014"+
		"\u001b\u001br\u0000\u001c\u0001\u0000\u0000\u0000\u0002\u001f\u0001\u0000"+
		"\u0000\u0000\u00047\u0001\u0000\u0000\u0000\u0006E\u0001\u0000\u0000\u0000"+
		"\bG\u0001\u0000\u0000\u0000\nI\u0001\u0000\u0000\u0000\fK\u0001\u0000"+
		"\u0000\u0000\u000eR\u0001\u0000\u0000\u0000\u0010\\\u0001\u0000\u0000"+
		"\u0000\u0012^\u0001\u0000\u0000\u0000\u0014i\u0001\u0000\u0000\u0000\u0016"+
		"\u0017\u0003\u0004\u0002\u0000\u0017\u0018\u0006\u0000\uffff\uffff\u0000"+
		"\u0018\u001d\u0001\u0000\u0000\u0000\u0019\u001a\u0003\u0002\u0001\u0000"+
		"\u001a\u001b\u0006\u0000\uffff\uffff\u0000\u001b\u001d\u0001\u0000\u0000"+
		"\u0000\u001c\u0016\u0001\u0000\u0000\u0000\u001c\u0019\u0001\u0000\u0000"+
		"\u0000\u001d\u0001\u0001\u0000\u0000\u0000\u001e \u0005\u0001\u0000\u0000"+
		"\u001f\u001e\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 !"+
		"\u0001\u0000\u0000\u0000!#\u0005\u0011\u0000\u0000\"$\u0003\b\u0004\u0000"+
		"#\"\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$3\u0001\u0000\u0000"+
		"\u0000%\'\u0005\u0014\u0000\u0000&%\u0001\u0000\u0000\u0000&\'\u0001\u0000"+
		"\u0000\u0000\'(\u0001\u0000\u0000\u0000(*\u0005\u0011\u0000\u0000)+\u0003"+
		"\n\u0005\u0000*)\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+-\u0001"+
		"\u0000\u0000\u0000,.\u0005\u0014\u0000\u0000-,\u0001\u0000\u0000\u0000"+
		"-.\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/1\u0005\u0011\u0000"+
		"\u000002\u0003\f\u0006\u000010\u0001\u0000\u0000\u000012\u0001\u0000\u0000"+
		"\u000024\u0001\u0000\u0000\u00003&\u0001\u0000\u0000\u000034\u0001\u0000"+
		"\u0000\u000045\u0001\u0000\u0000\u000056\u0006\u0001\uffff\uffff\u0000"+
		"6\u0003\u0001\u0000\u0000\u000078\u0003\u0012\t\u000089\u0003\u0006\u0003"+
		"\u00009:\u0006\u0002\uffff\uffff\u0000:\u0005\u0001\u0000\u0000\u0000"+
		";=\u0003\u0010\b\u0000<;\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000"+
		"=>\u0001\u0000\u0000\u0000>F\u0006\u0003\uffff\uffff\u0000?@\u0003\u000e"+
		"\u0007\u0000@A\u0006\u0003\uffff\uffff\u0000AF\u0001\u0000\u0000\u0000"+
		"BC\u0003\b\u0004\u0000CD\u0006\u0003\uffff\uffff\u0000DF\u0001\u0000\u0000"+
		"\u0000E<\u0001\u0000\u0000\u0000E?\u0001\u0000\u0000\u0000EB\u0001\u0000"+
		"\u0000\u0000F\u0007\u0001\u0000\u0000\u0000GH\u0007\u0000\u0000\u0000"+
		"H\t\u0001\u0000\u0000\u0000IJ\u0005\u0015\u0000\u0000J\u000b\u0001\u0000"+
		"\u0000\u0000KL\u0005\u000e\u0000\u0000L\r\u0001\u0000\u0000\u0000MS\u0005"+
		"\u0003\u0000\u0000NP\u0005\u0004\u0000\u0000OQ\u0005\u0005\u0000\u0000"+
		"PO\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QS\u0001\u0000\u0000"+
		"\u0000RM\u0001\u0000\u0000\u0000RN\u0001\u0000\u0000\u0000S\u000f\u0001"+
		"\u0000\u0000\u0000T]\u0005\u001c\u0000\u0000UZ\u0005\u0006\u0000\u0000"+
		"VX\u0005\u0007\u0000\u0000WV\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000"+
		"\u0000XY\u0001\u0000\u0000\u0000Y[\u0005\u0005\u0000\u0000ZW\u0001\u0000"+
		"\u0000\u0000Z[\u0001\u0000\u0000\u0000[]\u0001\u0000\u0000\u0000\\T\u0001"+
		"\u0000\u0000\u0000\\U\u0001\u0000\u0000\u0000]\u0011\u0001\u0000\u0000"+
		"\u0000^a\u0005\u0011\u0000\u0000_`\u0005\u000f\u0000\u0000`b\u0005\u0011"+
		"\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0001"+
		"\u0000\u0000\u0000ce\u0005\u0010\u0000\u0000df\u0003\u0014\n\u0000ed\u0001"+
		"\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000"+
		"gh\u0005\u0011\u0000\u0000h\u0013\u0001\u0000\u0000\u0000ij\u0007\u0001"+
		"\u0000\u0000j\u0015\u0001\u0000\u0000\u0000\u0011\u001c\u001f#&*-13<E"+
		"PRWZ\\ae";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}