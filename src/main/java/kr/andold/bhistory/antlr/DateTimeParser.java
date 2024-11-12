// Generated from C:\src\eclipse-workspace\big-history\src\main\resources\DateTime.g4 by ANTLR 4.10.1
package kr.andold.bhistory.antlr;

import java.util.Calendar;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.andold.utils.Utility;
import kr.andold.bhistory.domain.BigBang;
import kr.andold.bhistory.domain.AnnoDomini;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DateTimeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BLANK=1, BLANK_LINE=2, BIGBANG=3, COLON=4, DOT=5, EXPONENT_MARK=6, INTEGER=7, 
		MINUS=8, NUMBER1E1=9, NUMBER1E2=10, NUMBER1E3=11, NUMBER1E4=12, NUMBER1E8=13, 
		PLUS=14, SECOND=15, YEAR=16;
	public static final int
		RULE_dateString = 0, RULE_ad = 1, RULE_bigbang = 2, RULE_sign = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"dateString", "ad", "bigbang", "sign"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "':'", "'.'", null, null, "'-'", "'\\uC2ED'", 
			"'\\uBC31'", "'\\uCC9C'", "'\\uB9CC'", "'\\uC5B5'", "'+'", "'\\uCD08'", 
			"'\\uB144'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANK", "BLANK_LINE", "BIGBANG", "COLON", "DOT", "EXPONENT_MARK", 
			"INTEGER", "MINUS", "NUMBER1E1", "NUMBER1E2", "NUMBER1E3", "NUMBER1E4", 
			"NUMBER1E8", "PLUS", "SECOND", "YEAR"
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
	public String getGrammarFileName() { return "DateTime.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		public static Object OBJECT = null;

		private final Logger log = LoggerFactory.getLogger(getClass());


	public DateTimeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class DateStringContext extends ParserRuleContext {
		public BigbangContext bigbang() {
			return getRuleContext(BigbangContext.class,0);
		}
		public AdContext ad() {
			return getRuleContext(AdContext.class,0);
		}
		public DateStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateTimeListener ) ((DateTimeListener)listener).enterDateString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateTimeListener ) ((DateTimeListener)listener).exitDateString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateTimeVisitor ) return ((DateTimeVisitor<? extends T>)visitor).visitDateString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateStringContext dateString() throws RecognitionException {
		DateStringContext _localctx = new DateStringContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_dateString);
		try {
			setState(10);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(8);
				bigbang();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(9);
				ad();
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

	public static class AdContext extends ParserRuleContext {
		public AnnoDomini value;
		public Token year;
		public Token month;
		public Token day;
		public Token hour;
		public Token minute;
		public Token second;
		public List<TerminalNode> MINUS() { return getTokens(DateTimeParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(DateTimeParser.MINUS, i);
		}
		public List<TerminalNode> COLON() { return getTokens(DateTimeParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(DateTimeParser.COLON, i);
		}
		public List<TerminalNode> INTEGER() { return getTokens(DateTimeParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(DateTimeParser.INTEGER, i);
		}
		public AdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ad; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateTimeListener ) ((DateTimeListener)listener).enterAd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateTimeListener ) ((DateTimeListener)listener).exitAd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateTimeVisitor ) return ((DateTimeVisitor<? extends T>)visitor).visitAd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdContext ad() throws RecognitionException {
		AdContext _localctx = new AdContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ad);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(12);
			((AdContext)_localctx).year = match(INTEGER);
			setState(13);
			match(MINUS);
			setState(14);
			((AdContext)_localctx).month = match(INTEGER);
			setState(15);
			match(MINUS);
			setState(16);
			((AdContext)_localctx).day = match(INTEGER);
			setState(17);
			((AdContext)_localctx).hour = match(INTEGER);
			setState(18);
			match(COLON);
			setState(19);
			((AdContext)_localctx).minute = match(INTEGER);
			setState(20);
			match(COLON);
			setState(21);
			((AdContext)_localctx).second = match(INTEGER);

				((AdContext)_localctx).value =  new AnnoDomini(Utility.parseLong((((AdContext)_localctx).year!=null?((AdContext)_localctx).year.getText():null)), Utility.parseLong((((AdContext)_localctx).month!=null?((AdContext)_localctx).month.getText():null)), Utility.parseLong((((AdContext)_localctx).day!=null?((AdContext)_localctx).day.getText():null))
					, Utility.parseLong((((AdContext)_localctx).hour!=null?((AdContext)_localctx).hour.getText():null)), Utility.parseLong((((AdContext)_localctx).minute!=null?((AdContext)_localctx).minute.getText():null)), Utility.parseLong((((AdContext)_localctx).second!=null?((AdContext)_localctx).second.getText():null)), null
				);	

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

	public static class BigbangContext extends ParserRuleContext {
		public BigBang value;
		public Token base;
		public Token EXPONENT_MARK;
		public SignContext sign;
		public Token exponent;
		public Token head;
		public Token DOT;
		public Token tail;
		public TerminalNode SECOND() { return getToken(DateTimeParser.SECOND, 0); }
		public TerminalNode BIGBANG() { return getToken(DateTimeParser.BIGBANG, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(DateTimeParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(DateTimeParser.INTEGER, i);
		}
		public TerminalNode EXPONENT_MARK() { return getToken(DateTimeParser.EXPONENT_MARK, 0); }
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public TerminalNode YEAR() { return getToken(DateTimeParser.YEAR, 0); }
		public TerminalNode DOT() { return getToken(DateTimeParser.DOT, 0); }
		public TerminalNode NUMBER1E4() { return getToken(DateTimeParser.NUMBER1E4, 0); }
		public TerminalNode NUMBER1E8() { return getToken(DateTimeParser.NUMBER1E8, 0); }
		public BigbangContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bigbang; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateTimeListener ) ((DateTimeListener)listener).enterBigbang(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateTimeListener ) ((DateTimeListener)listener).exitBigbang(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateTimeVisitor ) return ((DateTimeVisitor<? extends T>)visitor).visitBigbang(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BigbangContext bigbang() throws RecognitionException {
		BigbangContext _localctx = new BigbangContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bigbang);
		int _la;
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(24);
				((BigbangContext)_localctx).base = match(INTEGER);
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXPONENT_MARK) {
					{
					setState(25);
					((BigbangContext)_localctx).EXPONENT_MARK = match(EXPONENT_MARK);
					setState(27);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==MINUS || _la==PLUS) {
						{
						setState(26);
						((BigbangContext)_localctx).sign = sign();
						}
					}

					setState(29);
					((BigbangContext)_localctx).exponent = match(INTEGER);
					}
				}

				setState(32);
				match(SECOND);
				setState(33);
				match(BIGBANG);

					((BigbangContext)_localctx).value =  new BigBang(0.0, Utility.parseDouble((((BigbangContext)_localctx).base!=null?((BigbangContext)_localctx).base.getText():null), (((BigbangContext)_localctx).EXPONENT_MARK!=null?((BigbangContext)_localctx).EXPONENT_MARK.getText():null), (((BigbangContext)_localctx).sign!=null?_input.getText(((BigbangContext)_localctx).sign.start,((BigbangContext)_localctx).sign.stop):null), (((BigbangContext)_localctx).exponent!=null?((BigbangContext)_localctx).exponent.getText():null)));

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(35);
				((BigbangContext)_localctx).head = match(INTEGER);
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(36);
					((BigbangContext)_localctx).DOT = match(DOT);
					setState(37);
					((BigbangContext)_localctx).tail = match(INTEGER);
					}
				}

				setState(40);
				match(YEAR);
				setState(41);
				match(BIGBANG);

					((BigbangContext)_localctx).value =  new BigBang(Utility.parseDouble((((BigbangContext)_localctx).head!=null?((BigbangContext)_localctx).head.getText():null), (((BigbangContext)_localctx).DOT!=null?((BigbangContext)_localctx).DOT.getText():null), (((BigbangContext)_localctx).tail!=null?((BigbangContext)_localctx).tail.getText():null)), null);

				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(43);
				((BigbangContext)_localctx).head = match(INTEGER);
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(44);
					((BigbangContext)_localctx).DOT = match(DOT);
					setState(45);
					((BigbangContext)_localctx).tail = match(INTEGER);
					}
				}

				setState(48);
				match(NUMBER1E4);
				setState(49);
				match(YEAR);
				setState(50);
				match(BIGBANG);

					((BigbangContext)_localctx).value =  new BigBang(Utility.parseDouble((((BigbangContext)_localctx).head!=null?((BigbangContext)_localctx).head.getText():null), (((BigbangContext)_localctx).DOT!=null?((BigbangContext)_localctx).DOT.getText():null), (((BigbangContext)_localctx).tail!=null?((BigbangContext)_localctx).tail.getText():null)) * 10000.0, null);

				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(52);
				((BigbangContext)_localctx).head = match(INTEGER);
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(53);
					((BigbangContext)_localctx).DOT = match(DOT);
					setState(54);
					((BigbangContext)_localctx).tail = match(INTEGER);
					}
				}

				setState(57);
				match(NUMBER1E8);
				setState(58);
				match(YEAR);
				setState(59);
				match(BIGBANG);

					((BigbangContext)_localctx).value =  new BigBang(Utility.parseDouble((((BigbangContext)_localctx).head!=null?((BigbangContext)_localctx).head.getText():null), (((BigbangContext)_localctx).DOT!=null?((BigbangContext)_localctx).DOT.getText():null), (((BigbangContext)_localctx).tail!=null?((BigbangContext)_localctx).tail.getText():null)) * 100000000.0, null);

				}
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

	public static class SignContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(DateTimeParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(DateTimeParser.MINUS, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateTimeListener ) ((DateTimeListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateTimeListener ) ((DateTimeListener)listener).exitSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateTimeVisitor ) return ((DateTimeVisitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
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
		"\u0004\u0001\u0010B\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0003"+
		"\u0000\u000b\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u001c"+
		"\b\u0002\u0001\u0002\u0003\u0002\u001f\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\'\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002/\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00028\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002>\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0000\u0000\u0004\u0000\u0002\u0004\u0006\u0000"+
		"\u0001\u0002\u0000\b\b\u000e\u000eF\u0000\n\u0001\u0000\u0000\u0000\u0002"+
		"\f\u0001\u0000\u0000\u0000\u0004=\u0001\u0000\u0000\u0000\u0006?\u0001"+
		"\u0000\u0000\u0000\b\u000b\u0003\u0004\u0002\u0000\t\u000b\u0003\u0002"+
		"\u0001\u0000\n\b\u0001\u0000\u0000\u0000\n\t\u0001\u0000\u0000\u0000\u000b"+
		"\u0001\u0001\u0000\u0000\u0000\f\r\u0005\u0007\u0000\u0000\r\u000e\u0005"+
		"\b\u0000\u0000\u000e\u000f\u0005\u0007\u0000\u0000\u000f\u0010\u0005\b"+
		"\u0000\u0000\u0010\u0011\u0005\u0007\u0000\u0000\u0011\u0012\u0005\u0007"+
		"\u0000\u0000\u0012\u0013\u0005\u0004\u0000\u0000\u0013\u0014\u0005\u0007"+
		"\u0000\u0000\u0014\u0015\u0005\u0004\u0000\u0000\u0015\u0016\u0005\u0007"+
		"\u0000\u0000\u0016\u0017\u0006\u0001\uffff\uffff\u0000\u0017\u0003\u0001"+
		"\u0000\u0000\u0000\u0018\u001e\u0005\u0007\u0000\u0000\u0019\u001b\u0005"+
		"\u0006\u0000\u0000\u001a\u001c\u0003\u0006\u0003\u0000\u001b\u001a\u0001"+
		"\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001d\u0001"+
		"\u0000\u0000\u0000\u001d\u001f\u0005\u0007\u0000\u0000\u001e\u0019\u0001"+
		"\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f \u0001\u0000"+
		"\u0000\u0000 !\u0005\u000f\u0000\u0000!\"\u0005\u0003\u0000\u0000\">\u0006"+
		"\u0002\uffff\uffff\u0000#&\u0005\u0007\u0000\u0000$%\u0005\u0005\u0000"+
		"\u0000%\'\u0005\u0007\u0000\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000"+
		"\u0000\u0000\'(\u0001\u0000\u0000\u0000()\u0005\u0010\u0000\u0000)*\u0005"+
		"\u0003\u0000\u0000*>\u0006\u0002\uffff\uffff\u0000+.\u0005\u0007\u0000"+
		"\u0000,-\u0005\u0005\u0000\u0000-/\u0005\u0007\u0000\u0000.,\u0001\u0000"+
		"\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u000001\u0005"+
		"\f\u0000\u000012\u0005\u0010\u0000\u000023\u0005\u0003\u0000\u00003>\u0006"+
		"\u0002\uffff\uffff\u000047\u0005\u0007\u0000\u000056\u0005\u0005\u0000"+
		"\u000068\u0005\u0007\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000"+
		"\u0000\u000089\u0001\u0000\u0000\u00009:\u0005\r\u0000\u0000:;\u0005\u0010"+
		"\u0000\u0000;<\u0005\u0003\u0000\u0000<>\u0006\u0002\uffff\uffff\u0000"+
		"=\u0018\u0001\u0000\u0000\u0000=#\u0001\u0000\u0000\u0000=+\u0001\u0000"+
		"\u0000\u0000=4\u0001\u0000\u0000\u0000>\u0005\u0001\u0000\u0000\u0000"+
		"?@\u0007\u0000\u0000\u0000@\u0007\u0001\u0000\u0000\u0000\u0007\n\u001b"+
		"\u001e&.7=";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}