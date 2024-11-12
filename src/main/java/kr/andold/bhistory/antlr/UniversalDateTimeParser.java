// Generated from C:\src\eclipse-workspace\big-history\src\main\resources\UniversalDateTime.g4 by ANTLR 4.10.1
package kr.andold.bhistory.antlr;

import java.util.Calendar;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.andold.utils.Utility;
import kr.andold.bhistory.domain.UniversalDateTime;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UniversalDateTimeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BLANK=1, BLANK_LINE=2, BIGBANG=3, BRACKET_LEFT=4, BRACKET_RIGHT=5, COLON=6, 
		DAY=7, DOT=8, EXPONENT_MARK=9, INTEGER=10, KING=11, LUNAR=12, MINUS=13, 
		MONTH=14, NUMBER1E1=15, NUMBER1E2=16, NUMBER1E3=17, NUMBER1E4=18, NUMBER1E8=19, 
		PLUS=20, SECOND=21, YEAR=22;
	public static final int
		RULE_universalDateTime = 0, RULE_sign = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"universalDateTime", "sign"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'('", "')'", "':'", "'\\uC77C'", "'.'", null, 
			null, "'\\uC120\\uC870'", "'\\uC74C\\uB825'", "'-'", "'\\uC6D4'", "'\\uC2ED'", 
			"'\\uBC31'", "'\\uCC9C'", "'\\uB9CC'", "'\\uC5B5'", "'+'", "'\\uCD08'", 
			"'\\uB144'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANK", "BLANK_LINE", "BIGBANG", "BRACKET_LEFT", "BRACKET_RIGHT", 
			"COLON", "DAY", "DOT", "EXPONENT_MARK", "INTEGER", "KING", "LUNAR", "MINUS", 
			"MONTH", "NUMBER1E1", "NUMBER1E2", "NUMBER1E3", "NUMBER1E4", "NUMBER1E8", 
			"PLUS", "SECOND", "YEAR"
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
	public String getGrammarFileName() { return "UniversalDateTime.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		private final Logger log = LoggerFactory.getLogger(getClass());


	public UniversalDateTimeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class UniversalDateTimeContext extends ParserRuleContext {
		public UniversalDateTime value;
		public Token base;
		public Token EXPONENT_MARK;
		public SignContext sign;
		public Token exponent;
		public Token head;
		public Token DOT;
		public Token tail;
		public Token year;
		public Token month;
		public Token day;
		public TerminalNode SECOND() { return getToken(UniversalDateTimeParser.SECOND, 0); }
		public TerminalNode BIGBANG() { return getToken(UniversalDateTimeParser.BIGBANG, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(UniversalDateTimeParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(UniversalDateTimeParser.INTEGER, i);
		}
		public TerminalNode EXPONENT_MARK() { return getToken(UniversalDateTimeParser.EXPONENT_MARK, 0); }
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public TerminalNode YEAR() { return getToken(UniversalDateTimeParser.YEAR, 0); }
		public TerminalNode DOT() { return getToken(UniversalDateTimeParser.DOT, 0); }
		public TerminalNode NUMBER1E4() { return getToken(UniversalDateTimeParser.NUMBER1E4, 0); }
		public TerminalNode NUMBER1E8() { return getToken(UniversalDateTimeParser.NUMBER1E8, 0); }
		public List<TerminalNode> BRACKET_LEFT() { return getTokens(UniversalDateTimeParser.BRACKET_LEFT); }
		public TerminalNode BRACKET_LEFT(int i) {
			return getToken(UniversalDateTimeParser.BRACKET_LEFT, i);
		}
		public TerminalNode KING() { return getToken(UniversalDateTimeParser.KING, 0); }
		public List<TerminalNode> BRACKET_RIGHT() { return getTokens(UniversalDateTimeParser.BRACKET_RIGHT); }
		public TerminalNode BRACKET_RIGHT(int i) {
			return getToken(UniversalDateTimeParser.BRACKET_RIGHT, i);
		}
		public List<TerminalNode> MONTH() { return getTokens(UniversalDateTimeParser.MONTH); }
		public TerminalNode MONTH(int i) {
			return getToken(UniversalDateTimeParser.MONTH, i);
		}
		public List<TerminalNode> DAY() { return getTokens(UniversalDateTimeParser.DAY); }
		public TerminalNode DAY(int i) {
			return getToken(UniversalDateTimeParser.DAY, i);
		}
		public TerminalNode LUNAR() { return getToken(UniversalDateTimeParser.LUNAR, 0); }
		public UniversalDateTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_universalDateTime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UniversalDateTimeListener ) ((UniversalDateTimeListener)listener).enterUniversalDateTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UniversalDateTimeListener ) ((UniversalDateTimeListener)listener).exitUniversalDateTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UniversalDateTimeVisitor ) return ((UniversalDateTimeVisitor<? extends T>)visitor).visitUniversalDateTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UniversalDateTimeContext universalDateTime() throws RecognitionException {
		UniversalDateTimeContext _localctx = new UniversalDateTimeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_universalDateTime);
		int _la;
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(4);
				((UniversalDateTimeContext)_localctx).base = match(INTEGER);
				setState(10);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXPONENT_MARK) {
					{
					setState(5);
					((UniversalDateTimeContext)_localctx).EXPONENT_MARK = match(EXPONENT_MARK);
					setState(7);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==MINUS || _la==PLUS) {
						{
						setState(6);
						((UniversalDateTimeContext)_localctx).sign = sign();
						}
					}

					setState(9);
					((UniversalDateTimeContext)_localctx).exponent = match(INTEGER);
					}
				}

				setState(12);
				match(SECOND);
				setState(13);
				match(BIGBANG);

					((UniversalDateTimeContext)_localctx).value =  new UniversalDateTime(UniversalDateTime.UniversalDateTimeOrigin.BIGBANG, 0.0, (((UniversalDateTimeContext)_localctx).base!=null?((UniversalDateTimeContext)_localctx).base.getText():null), (((UniversalDateTimeContext)_localctx).EXPONENT_MARK!=null?((UniversalDateTimeContext)_localctx).EXPONENT_MARK.getText():null), (((UniversalDateTimeContext)_localctx).sign!=null?_input.getText(((UniversalDateTimeContext)_localctx).sign.start,((UniversalDateTimeContext)_localctx).sign.stop):null), (((UniversalDateTimeContext)_localctx).exponent!=null?((UniversalDateTimeContext)_localctx).exponent.getText():null));

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(15);
				((UniversalDateTimeContext)_localctx).head = match(INTEGER);
				setState(18);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(16);
					((UniversalDateTimeContext)_localctx).DOT = match(DOT);
					setState(17);
					((UniversalDateTimeContext)_localctx).tail = match(INTEGER);
					}
				}

				setState(20);
				match(YEAR);
				setState(21);
				match(BIGBANG);

					((UniversalDateTimeContext)_localctx).value =  new UniversalDateTime(UniversalDateTime.UniversalDateTimeOrigin.BIGBANG, (((UniversalDateTimeContext)_localctx).head!=null?((UniversalDateTimeContext)_localctx).head.getText():null), (((UniversalDateTimeContext)_localctx).DOT!=null?((UniversalDateTimeContext)_localctx).DOT.getText():null), (((UniversalDateTimeContext)_localctx).tail!=null?((UniversalDateTimeContext)_localctx).tail.getText():null));

				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(23);
				((UniversalDateTimeContext)_localctx).head = match(INTEGER);
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(24);
					((UniversalDateTimeContext)_localctx).DOT = match(DOT);
					setState(25);
					((UniversalDateTimeContext)_localctx).tail = match(INTEGER);
					}
				}

				setState(28);
				match(NUMBER1E4);
				setState(29);
				match(YEAR);
				setState(30);
				match(BIGBANG);

					((UniversalDateTimeContext)_localctx).value =  new UniversalDateTime(UniversalDateTime.UniversalDateTimeOrigin.BIGBANG, (((UniversalDateTimeContext)_localctx).head!=null?((UniversalDateTimeContext)_localctx).head.getText():null), (((UniversalDateTimeContext)_localctx).DOT!=null?((UniversalDateTimeContext)_localctx).DOT.getText():null), (((UniversalDateTimeContext)_localctx).tail!=null?((UniversalDateTimeContext)_localctx).tail.getText():null), 10000L);

				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(32);
				((UniversalDateTimeContext)_localctx).head = match(INTEGER);
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(33);
					((UniversalDateTimeContext)_localctx).DOT = match(DOT);
					setState(34);
					((UniversalDateTimeContext)_localctx).tail = match(INTEGER);
					}
				}

				setState(37);
				match(NUMBER1E8);
				setState(38);
				match(YEAR);
				setState(39);
				match(BIGBANG);

					((UniversalDateTimeContext)_localctx).value =  new UniversalDateTime(UniversalDateTime.UniversalDateTimeOrigin.BIGBANG, (((UniversalDateTimeContext)_localctx).head!=null?((UniversalDateTimeContext)_localctx).head.getText():null), (((UniversalDateTimeContext)_localctx).DOT!=null?((UniversalDateTimeContext)_localctx).DOT.getText():null), (((UniversalDateTimeContext)_localctx).tail!=null?((UniversalDateTimeContext)_localctx).tail.getText():null), 100000000L);

				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(41);
				((UniversalDateTimeContext)_localctx).year = match(INTEGER);
				setState(42);
				match(YEAR);
				setState(43);
				match(BRACKET_LEFT);
				setState(44);
				match(KING);
				setState(45);
				match(BRACKET_RIGHT);
				setState(46);
				match(INTEGER);
				setState(47);
				match(MONTH);
				setState(48);
				match(INTEGER);
				setState(49);
				match(DAY);
				setState(50);
				match(BRACKET_LEFT);
				setState(51);
				match(LUNAR);
				setState(52);
				((UniversalDateTimeContext)_localctx).month = match(INTEGER);
				setState(53);
				match(MONTH);
				setState(54);
				((UniversalDateTimeContext)_localctx).day = match(INTEGER);
				setState(55);
				match(DAY);
				setState(56);
				match(BRACKET_RIGHT);

					((UniversalDateTimeContext)_localctx).value =  new UniversalDateTime(UniversalDateTime.UniversalDateTimeOrigin.KOREAN_LUNAR, (((UniversalDateTimeContext)_localctx).year!=null?((UniversalDateTimeContext)_localctx).year.getText():null), (((UniversalDateTimeContext)_localctx).month!=null?((UniversalDateTimeContext)_localctx).month.getText():null), (((UniversalDateTimeContext)_localctx).day!=null?((UniversalDateTimeContext)_localctx).day.getText():null));

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
		public TerminalNode PLUS() { return getToken(UniversalDateTimeParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(UniversalDateTimeParser.MINUS, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UniversalDateTimeListener ) ((UniversalDateTimeListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UniversalDateTimeListener ) ((UniversalDateTimeListener)listener).exitSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UniversalDateTimeVisitor ) return ((UniversalDateTimeVisitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
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
		"\u0004\u0001\u0016?\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0003\u0000\b\b\u0000\u0001\u0000\u0003"+
		"\u0000\u000b\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000\u0013\b\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u001b\b\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000$\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003"+
		"\u0000;\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0002"+
		"\u0000\u0002\u0000\u0001\u0002\u0000\r\r\u0014\u0014E\u0000:\u0001\u0000"+
		"\u0000\u0000\u0002<\u0001\u0000\u0000\u0000\u0004\n\u0005\n\u0000\u0000"+
		"\u0005\u0007\u0005\t\u0000\u0000\u0006\b\u0003\u0002\u0001\u0000\u0007"+
		"\u0006\u0001\u0000\u0000\u0000\u0007\b\u0001\u0000\u0000\u0000\b\t\u0001"+
		"\u0000\u0000\u0000\t\u000b\u0005\n\u0000\u0000\n\u0005\u0001\u0000\u0000"+
		"\u0000\n\u000b\u0001\u0000\u0000\u0000\u000b\f\u0001\u0000\u0000\u0000"+
		"\f\r\u0005\u0015\u0000\u0000\r\u000e\u0005\u0003\u0000\u0000\u000e;\u0006"+
		"\u0000\uffff\uffff\u0000\u000f\u0012\u0005\n\u0000\u0000\u0010\u0011\u0005"+
		"\b\u0000\u0000\u0011\u0013\u0005\n\u0000\u0000\u0012\u0010\u0001\u0000"+
		"\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000"+
		"\u0000\u0000\u0014\u0015\u0005\u0016\u0000\u0000\u0015\u0016\u0005\u0003"+
		"\u0000\u0000\u0016;\u0006\u0000\uffff\uffff\u0000\u0017\u001a\u0005\n"+
		"\u0000\u0000\u0018\u0019\u0005\b\u0000\u0000\u0019\u001b\u0005\n\u0000"+
		"\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000"+
		"\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001d\u0005\u0012\u0000"+
		"\u0000\u001d\u001e\u0005\u0016\u0000\u0000\u001e\u001f\u0005\u0003\u0000"+
		"\u0000\u001f;\u0006\u0000\uffff\uffff\u0000 #\u0005\n\u0000\u0000!\"\u0005"+
		"\b\u0000\u0000\"$\u0005\n\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001"+
		"\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%&\u0005\u0013\u0000\u0000"+
		"&\'\u0005\u0016\u0000\u0000\'(\u0005\u0003\u0000\u0000(;\u0006\u0000\uffff"+
		"\uffff\u0000)*\u0005\n\u0000\u0000*+\u0005\u0016\u0000\u0000+,\u0005\u0004"+
		"\u0000\u0000,-\u0005\u000b\u0000\u0000-.\u0005\u0005\u0000\u0000./\u0005"+
		"\n\u0000\u0000/0\u0005\u000e\u0000\u000001\u0005\n\u0000\u000012\u0005"+
		"\u0007\u0000\u000023\u0005\u0004\u0000\u000034\u0005\f\u0000\u000045\u0005"+
		"\n\u0000\u000056\u0005\u000e\u0000\u000067\u0005\n\u0000\u000078\u0005"+
		"\u0007\u0000\u000089\u0005\u0005\u0000\u00009;\u0006\u0000\uffff\uffff"+
		"\u0000:\u0004\u0001\u0000\u0000\u0000:\u000f\u0001\u0000\u0000\u0000:"+
		"\u0017\u0001\u0000\u0000\u0000: \u0001\u0000\u0000\u0000:)\u0001\u0000"+
		"\u0000\u0000;\u0001\u0001\u0000\u0000\u0000<=\u0007\u0000\u0000\u0000"+
		"=\u0003\u0001\u0000\u0000\u0000\u0006\u0007\n\u0012\u001a#:";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}