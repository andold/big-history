// Generated from C:\src\eclipse-workspace\big-history\src\main\resources\BigHistoryDateTime.g4 by ANTLR 4.10.1
package kr.andold.bhistory.antlr;

import java.util.Calendar;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.andold.utils.Utility;
import kr.andold.bhistory.domain.BigHistoryDateTime;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BigHistoryDateTimeLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "DIGIT", "NEWLINE", 
			"BLANK", "BLANK_LINE", "BIGBANG", "BRACKET_LEFT", "BRACKET_RIGHT", "COLON", 
			"DAY", "DOT", "EXPONENT_MARK", "INTEGER", "KING", "LUNAR", "MINUS", "MONTH", 
			"NUMBER1E1", "NUMBER1E2", "NUMBER1E3", "NUMBER1E4", "NUMBER1E8", "PLUS", 
			"SECOND", "YEAR"
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


		private final Logger log = LoggerFactory.getLogger(getClass());



	public BigHistoryDateTimeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BigHistoryDateTime.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return BLANK_LINE_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean BLANK_LINE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return getCharPositionInLine() == 0;
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0000\u001d\u00a3\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0002\u001e\u0007\u001e\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0003\b^\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0005\nh\b\n\n\n\f\nk\t\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000bw\b\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0004\u0012\u0086\b\u0012\u000b\u0012\f"+
		"\u0012\u0087\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0000\u0000\u001f\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\u0000"+
		"\u0011\u0000\u0013\b\u0015\t\u0017\n\u0019\u000b\u001b\f\u001d\r\u001f"+
		"\u000e!\u000f#\u0010%\u0011\'\u0012)\u0013+\u0014-\u0015/\u00161\u0017"+
		"3\u00185\u00197\u001a9\u001b;\u001c=\u001d\u0001\u0000\u0003\u0001\u0000"+
		"09\u0003\u0000\u000b\r  \u00a0\u00a0\u0002\u0000EEee\u00a5\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001"+
		"\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000"+
		"\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u0000"+
		"5\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001"+
		"\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000"+
		"\u0000\u0001?\u0001\u0000\u0000\u0000\u0003B\u0001\u0000\u0000\u0000\u0005"+
		"G\u0001\u0000\u0000\u0000\u0007I\u0001\u0000\u0000\u0000\tP\u0001\u0000"+
		"\u0000\u0000\u000bR\u0001\u0000\u0000\u0000\rV\u0001\u0000\u0000\u0000"+
		"\u000fZ\u0001\u0000\u0000\u0000\u0011]\u0001\u0000\u0000\u0000\u0013a"+
		"\u0001\u0000\u0000\u0000\u0015e\u0001\u0000\u0000\u0000\u0017p\u0001\u0000"+
		"\u0000\u0000\u0019x\u0001\u0000\u0000\u0000\u001bz\u0001\u0000\u0000\u0000"+
		"\u001d|\u0001\u0000\u0000\u0000\u001f~\u0001\u0000\u0000\u0000!\u0080"+
		"\u0001\u0000\u0000\u0000#\u0082\u0001\u0000\u0000\u0000%\u0085\u0001\u0000"+
		"\u0000\u0000\'\u0089\u0001\u0000\u0000\u0000)\u008c\u0001\u0000\u0000"+
		"\u0000+\u008f\u0001\u0000\u0000\u0000-\u0091\u0001\u0000\u0000\u0000/"+
		"\u0093\u0001\u0000\u0000\u00001\u0095\u0001\u0000\u0000\u00003\u0097\u0001"+
		"\u0000\u0000\u00005\u0099\u0001\u0000\u0000\u00007\u009b\u0001\u0000\u0000"+
		"\u00009\u009d\u0001\u0000\u0000\u0000;\u009f\u0001\u0000\u0000\u0000="+
		"\u00a1\u0001\u0000\u0000\u0000?@\u0005A\u0000\u0000@A\u0005D\u0000\u0000"+
		"A\u0002\u0001\u0000\u0000\u0000BC\u0005y\u0000\u0000CD\u0005e\u0000\u0000"+
		"DE\u0005a\u0000\u0000EF\u0005r\u0000\u0000F\u0004\u0001\u0000\u0000\u0000"+
		"GH\u0005\u8000\ubd84\u0000\u0000H\u0006\u0001\u0000\u0000\u0000IJ\u0005"+
		"m\u0000\u0000JK\u0005i\u0000\u0000KL\u0005n\u0000\u0000LM\u0005u\u0000"+
		"\u0000MN\u0005t\u0000\u0000NO\u0005e\u0000\u0000O\b\u0001\u0000\u0000"+
		"\u0000PQ\u0005s\u0000\u0000Q\n\u0001\u0000\u0000\u0000RS\u0005s\u0000"+
		"\u0000ST\u0005e\u0000\u0000TU\u0005c\u0000\u0000U\f\u0001\u0000\u0000"+
		"\u0000VW\u0005o\u0000\u0000WX\u0005n\u0000\u0000XY\u0005d\u0000\u0000"+
		"Y\u000e\u0001\u0000\u0000\u0000Z[\u0007\u0000\u0000\u0000[\u0010\u0001"+
		"\u0000\u0000\u0000\\^\u0005\r\u0000\u0000]\\\u0001\u0000\u0000\u0000]"+
		"^\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0005\n\u0000\u0000"+
		"`\u0012\u0001\u0000\u0000\u0000ab\u0007\u0001\u0000\u0000bc\u0001\u0000"+
		"\u0000\u0000cd\u0006\t\u0000\u0000d\u0014\u0001\u0000\u0000\u0000ei\u0004"+
		"\n\u0000\u0000fh\u0007\u0001\u0000\u0000gf\u0001\u0000\u0000\u0000hk\u0001"+
		"\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000"+
		"jl\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000lm\u0003\u0011\b\u0000"+
		"mn\u0001\u0000\u0000\u0000no\u0006\n\u0000\u0000o\u0016\u0001\u0000\u0000"+
		"\u0000pq\u0005\u8000\ube45\u0000\u0000qr\u0005\u8000\ubc45\u0000\u0000"+
		"rv\u0001\u0000\u0000\u0000st\u0005\u8000\uc9c1\u0000\u0000tw\u0005\u8000"+
		"\ud6c4\u0000\u0000uw\u0005\u8000\ud6c4\u0000\u0000vs\u0001\u0000\u0000"+
		"\u0000vu\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000w\u0018\u0001"+
		"\u0000\u0000\u0000xy\u0005(\u0000\u0000y\u001a\u0001\u0000\u0000\u0000"+
		"z{\u0005)\u0000\u0000{\u001c\u0001\u0000\u0000\u0000|}\u0005:\u0000\u0000"+
		"}\u001e\u0001\u0000\u0000\u0000~\u007f\u0005\u8000\uc77c\u0000\u0000\u007f"+
		" \u0001\u0000\u0000\u0000\u0080\u0081\u0005.\u0000\u0000\u0081\"\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0007\u0002\u0000\u0000\u0083$\u0001\u0000"+
		"\u0000\u0000\u0084\u0086\u0003\u000f\u0007\u0000\u0085\u0084\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088&\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0005\u8000\uc120\u0000\u0000\u008a\u008b\u0005\u8000"+
		"\uc870\u0000\u0000\u008b(\u0001\u0000\u0000\u0000\u008c\u008d\u0005\u8000"+
		"\uc74c\u0000\u0000\u008d\u008e\u0005\u8000\ub825\u0000\u0000\u008e*\u0001"+
		"\u0000\u0000\u0000\u008f\u0090\u0005-\u0000\u0000\u0090,\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0005\u8000\uc6d4\u0000\u0000\u0092.\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0005\u8000\uc2ed\u0000\u0000\u00940\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0005\u8000\ubc31\u0000\u0000\u00962\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0005\u8000\ucc9c\u0000\u0000\u00984\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0005\u8000\ub9cc\u0000\u0000\u009a6\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0005\u8000\uc5b5\u0000\u0000\u009c8\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0005+\u0000\u0000\u009e:\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0005\u8000\ucd08\u0000\u0000\u00a0<\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0005\u8000\ub144\u0000\u0000\u00a2>\u0001\u0000\u0000\u0000\u0005"+
		"\u0000]iv\u0087\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}