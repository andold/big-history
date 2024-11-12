// Generated from C:\src\eclipse-workspace\big-history\src\main\resources\DateTime.g4 by ANTLR 4.10.1
package kr.andold.bhistory.antlr;

import java.util.Calendar;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.andold.utils.Utility;
import kr.andold.bhistory.domain.BigBang;
import kr.andold.bhistory.domain.AnnoDomini;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DateTimeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BLANK=1, BLANK_LINE=2, BIGBANG=3, COLON=4, DOT=5, EXPONENT_MARK=6, INTEGER=7, 
		MINUS=8, NUMBER1E1=9, NUMBER1E2=10, NUMBER1E3=11, NUMBER1E4=12, NUMBER1E8=13, 
		PLUS=14, SECOND=15, YEAR=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DIGIT", "NEWLINE", "BLANK", "BLANK_LINE", "BIGBANG", "COLON", "DOT", 
			"EXPONENT_MARK", "INTEGER", "MINUS", "NUMBER1E1", "NUMBER1E2", "NUMBER1E3", 
			"NUMBER1E4", "NUMBER1E8", "PLUS", "SECOND", "YEAR"
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


		public static Object OBJECT = null;

		private final Logger log = LoggerFactory.getLogger(getClass());



	public DateTimeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DateTime.g4"; }

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
		"\u0004\u0000\u0010`\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0003\u0001)\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0005\u00033\b\u0003\n\u0003\f\u00036\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004B\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0004\b"+
		"K\b\b\u000b\b\f\bL\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0000\u0000\u0012"+
		"\u0001\u0000\u0003\u0000\u0005\u0001\u0007\u0002\t\u0003\u000b\u0004\r"+
		"\u0005\u000f\u0006\u0011\u0007\u0013\b\u0015\t\u0017\n\u0019\u000b\u001b"+
		"\f\u001d\r\u001f\u000e!\u000f#\u0010\u0001\u0000\u0003\u0001\u000009\u0003"+
		"\u0000\u000b\r  \u00a0\u00a0\u0002\u0000EEeeb\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0001%\u0001\u0000\u0000\u0000\u0003(\u0001"+
		"\u0000\u0000\u0000\u0005,\u0001\u0000\u0000\u0000\u00070\u0001\u0000\u0000"+
		"\u0000\t;\u0001\u0000\u0000\u0000\u000bC\u0001\u0000\u0000\u0000\rE\u0001"+
		"\u0000\u0000\u0000\u000fG\u0001\u0000\u0000\u0000\u0011J\u0001\u0000\u0000"+
		"\u0000\u0013N\u0001\u0000\u0000\u0000\u0015P\u0001\u0000\u0000\u0000\u0017"+
		"R\u0001\u0000\u0000\u0000\u0019T\u0001\u0000\u0000\u0000\u001bV\u0001"+
		"\u0000\u0000\u0000\u001dX\u0001\u0000\u0000\u0000\u001fZ\u0001\u0000\u0000"+
		"\u0000!\\\u0001\u0000\u0000\u0000#^\u0001\u0000\u0000\u0000%&\u0007\u0000"+
		"\u0000\u0000&\u0002\u0001\u0000\u0000\u0000\')\u0005\r\u0000\u0000(\'"+
		"\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000"+
		"\u0000*+\u0005\n\u0000\u0000+\u0004\u0001\u0000\u0000\u0000,-\u0007\u0001"+
		"\u0000\u0000-.\u0001\u0000\u0000\u0000./\u0006\u0002\u0000\u0000/\u0006"+
		"\u0001\u0000\u0000\u000004\u0004\u0003\u0000\u000013\u0007\u0001\u0000"+
		"\u000021\u0001\u0000\u0000\u000036\u0001\u0000\u0000\u000042\u0001\u0000"+
		"\u0000\u000045\u0001\u0000\u0000\u000057\u0001\u0000\u0000\u000064\u0001"+
		"\u0000\u0000\u000078\u0003\u0003\u0001\u000089\u0001\u0000\u0000\u0000"+
		"9:\u0006\u0003\u0000\u0000:\b\u0001\u0000\u0000\u0000;<\u0005\u8000\ube45"+
		"\u0000\u0000<=\u0005\u8000\ubc45\u0000\u0000=A\u0001\u0000\u0000\u0000"+
		">?\u0005\u8000\uc9c1\u0000\u0000?B\u0005\u8000\ud6c4\u0000\u0000@B\u0005"+
		"\u8000\ud6c4\u0000\u0000A>\u0001\u0000\u0000\u0000A@\u0001\u0000\u0000"+
		"\u0000AB\u0001\u0000\u0000\u0000B\n\u0001\u0000\u0000\u0000CD\u0005:\u0000"+
		"\u0000D\f\u0001\u0000\u0000\u0000EF\u0005.\u0000\u0000F\u000e\u0001\u0000"+
		"\u0000\u0000GH\u0007\u0002\u0000\u0000H\u0010\u0001\u0000\u0000\u0000"+
		"IK\u0003\u0001\u0000\u0000JI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000"+
		"\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000M\u0012\u0001"+
		"\u0000\u0000\u0000NO\u0005-\u0000\u0000O\u0014\u0001\u0000\u0000\u0000"+
		"PQ\u0005\u8000\uc2ed\u0000\u0000Q\u0016\u0001\u0000\u0000\u0000RS\u0005"+
		"\u8000\ubc31\u0000\u0000S\u0018\u0001\u0000\u0000\u0000TU\u0005\u8000"+
		"\ucc9c\u0000\u0000U\u001a\u0001\u0000\u0000\u0000VW\u0005\u8000\ub9cc"+
		"\u0000\u0000W\u001c\u0001\u0000\u0000\u0000XY\u0005\u8000\uc5b5\u0000"+
		"\u0000Y\u001e\u0001\u0000\u0000\u0000Z[\u0005+\u0000\u0000[ \u0001\u0000"+
		"\u0000\u0000\\]\u0005\u8000\ucd08\u0000\u0000]\"\u0001\u0000\u0000\u0000"+
		"^_\u0005\u8000\ub144\u0000\u0000_$\u0001\u0000\u0000\u0000\u0005\u0000"+
		"(4AL\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}