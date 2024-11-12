// Generated from C:\src\eclipse-workspace\big-history\src\main\resources\UniversalDateTime.g4 by ANTLR 4.10.1
package kr.andold.bhistory.antlr;

import java.util.Calendar;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.andold.utils.Utility;
import kr.andold.bhistory.domain.UniversalDateTime;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UniversalDateTimeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BLANK=1, BLANK_LINE=2, BIGBANG=3, BRACKET_LEFT=4, BRACKET_RIGHT=5, COLON=6, 
		DAY=7, DOT=8, EXPONENT_MARK=9, INTEGER=10, KING=11, LUNAR=12, MINUS=13, 
		MONTH=14, NUMBER1E1=15, NUMBER1E2=16, NUMBER1E3=17, NUMBER1E4=18, NUMBER1E8=19, 
		PLUS=20, SECOND=21, YEAR=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DIGIT", "NEWLINE", "BLANK", "BLANK_LINE", "BIGBANG", "BRACKET_LEFT", 
			"BRACKET_RIGHT", "COLON", "DAY", "DOT", "EXPONENT_MARK", "INTEGER", "KING", 
			"LUNAR", "MINUS", "MONTH", "NUMBER1E1", "NUMBER1E2", "NUMBER1E3", "NUMBER1E4", 
			"NUMBER1E8", "PLUS", "SECOND", "YEAR"
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


		private final Logger log = LoggerFactory.getLogger(getClass());



	public UniversalDateTimeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "UniversalDateTime.g4"; }

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
		case 3:
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
		"\u0004\u0000\u0016z\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0003\u00015\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0005\u0003?\b\u0003\n\u0003\f\u0003B\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004N\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0004\u000b]\b\u000b\u000b"+
		"\u000b\f\u000b^\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0000\u0000\u0018\u0001\u0000\u0003\u0000\u0005\u0001"+
		"\u0007\u0002\t\u0003\u000b\u0004\r\u0005\u000f\u0006\u0011\u0007\u0013"+
		"\b\u0015\t\u0017\n\u0019\u000b\u001b\f\u001d\r\u001f\u000e!\u000f#\u0010"+
		"%\u0011\'\u0012)\u0013+\u0014-\u0015/\u0016\u0001\u0000\u0003\u0001\u0000"+
		"09\u0003\u0000\u000b\r  \u00a0\u00a0\u0002\u0000EEee|\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000"+
		"\u00011\u0001\u0000\u0000\u0000\u00034\u0001\u0000\u0000\u0000\u00058"+
		"\u0001\u0000\u0000\u0000\u0007<\u0001\u0000\u0000\u0000\tG\u0001\u0000"+
		"\u0000\u0000\u000bO\u0001\u0000\u0000\u0000\rQ\u0001\u0000\u0000\u0000"+
		"\u000fS\u0001\u0000\u0000\u0000\u0011U\u0001\u0000\u0000\u0000\u0013W"+
		"\u0001\u0000\u0000\u0000\u0015Y\u0001\u0000\u0000\u0000\u0017\\\u0001"+
		"\u0000\u0000\u0000\u0019`\u0001\u0000\u0000\u0000\u001bc\u0001\u0000\u0000"+
		"\u0000\u001df\u0001\u0000\u0000\u0000\u001fh\u0001\u0000\u0000\u0000!"+
		"j\u0001\u0000\u0000\u0000#l\u0001\u0000\u0000\u0000%n\u0001\u0000\u0000"+
		"\u0000\'p\u0001\u0000\u0000\u0000)r\u0001\u0000\u0000\u0000+t\u0001\u0000"+
		"\u0000\u0000-v\u0001\u0000\u0000\u0000/x\u0001\u0000\u0000\u000012\u0007"+
		"\u0000\u0000\u00002\u0002\u0001\u0000\u0000\u000035\u0005\r\u0000\u0000"+
		"43\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000056\u0001\u0000\u0000"+
		"\u000067\u0005\n\u0000\u00007\u0004\u0001\u0000\u0000\u000089\u0007\u0001"+
		"\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0006\u0002\u0000\u0000;\u0006"+
		"\u0001\u0000\u0000\u0000<@\u0004\u0003\u0000\u0000=?\u0007\u0001\u0000"+
		"\u0000>=\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000"+
		"\u0000\u0000@A\u0001\u0000\u0000\u0000AC\u0001\u0000\u0000\u0000B@\u0001"+
		"\u0000\u0000\u0000CD\u0003\u0003\u0001\u0000DE\u0001\u0000\u0000\u0000"+
		"EF\u0006\u0003\u0000\u0000F\b\u0001\u0000\u0000\u0000GH\u0005\u8000\ube45"+
		"\u0000\u0000HI\u0005\u8000\ubc45\u0000\u0000IM\u0001\u0000\u0000\u0000"+
		"JK\u0005\u8000\uc9c1\u0000\u0000KN\u0005\u8000\ud6c4\u0000\u0000LN\u0005"+
		"\u8000\ud6c4\u0000\u0000MJ\u0001\u0000\u0000\u0000ML\u0001\u0000\u0000"+
		"\u0000MN\u0001\u0000\u0000\u0000N\n\u0001\u0000\u0000\u0000OP\u0005(\u0000"+
		"\u0000P\f\u0001\u0000\u0000\u0000QR\u0005)\u0000\u0000R\u000e\u0001\u0000"+
		"\u0000\u0000ST\u0005:\u0000\u0000T\u0010\u0001\u0000\u0000\u0000UV\u0005"+
		"\u8000\uc77c\u0000\u0000V\u0012\u0001\u0000\u0000\u0000WX\u0005.\u0000"+
		"\u0000X\u0014\u0001\u0000\u0000\u0000YZ\u0007\u0002\u0000\u0000Z\u0016"+
		"\u0001\u0000\u0000\u0000[]\u0003\u0001\u0000\u0000\\[\u0001\u0000\u0000"+
		"\u0000]^\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000"+
		"\u0000\u0000_\u0018\u0001\u0000\u0000\u0000`a\u0005\u8000\uc120\u0000"+
		"\u0000ab\u0005\u8000\uc870\u0000\u0000b\u001a\u0001\u0000\u0000\u0000"+
		"cd\u0005\u8000\uc74c\u0000\u0000de\u0005\u8000\ub825\u0000\u0000e\u001c"+
		"\u0001\u0000\u0000\u0000fg\u0005-\u0000\u0000g\u001e\u0001\u0000\u0000"+
		"\u0000hi\u0005\u8000\uc6d4\u0000\u0000i \u0001\u0000\u0000\u0000jk\u0005"+
		"\u8000\uc2ed\u0000\u0000k\"\u0001\u0000\u0000\u0000lm\u0005\u8000\ubc31"+
		"\u0000\u0000m$\u0001\u0000\u0000\u0000no\u0005\u8000\ucc9c\u0000\u0000"+
		"o&\u0001\u0000\u0000\u0000pq\u0005\u8000\ub9cc\u0000\u0000q(\u0001\u0000"+
		"\u0000\u0000rs\u0005\u8000\uc5b5\u0000\u0000s*\u0001\u0000\u0000\u0000"+
		"tu\u0005+\u0000\u0000u,\u0001\u0000\u0000\u0000vw\u0005\u8000\ucd08\u0000"+
		"\u0000w.\u0001\u0000\u0000\u0000xy\u0005\u8000\ub144\u0000\u0000y0\u0001"+
		"\u0000\u0000\u0000\u0005\u00004@M^\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}