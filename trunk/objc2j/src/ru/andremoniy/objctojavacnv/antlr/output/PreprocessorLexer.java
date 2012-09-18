// $ANTLR 3.4 C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g 2012-08-15 10:19:18

package ru.andremoniy.objctojavacnv.antlr.output;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class PreprocessorLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int COMMENT=4;
    public static final int DEFINE=5;
    public static final int DIGIT=6;
    public static final int ELIF=7;
    public static final int ELSE=8;
    public static final int ENDIF=9;
    public static final int ID=10;
    public static final int IF=11;
    public static final int IFDEF=12;
    public static final int IFNDEF=13;
    public static final int IMPORT=14;
    public static final int INCLUDE=15;
    public static final int LETTER=16;
    public static final int NUMBER=17;
    public static final int SINGLE_COMMENT=18;
    public static final int SPECIAL_CHARS=19;
    public static final int STRING_LITERAL=20;
    public static final int STRING_LITERAL2=21;
    public static final int T_BACKSLASH=22;
    public static final int T_BLOCK=23;
    public static final int T_DEFINE=24;
    public static final int T_EXPRESSION=25;
    public static final int T_EX_AND=26;
    public static final int T_EX_OR=27;
    public static final int T_EX_SNGL=28;
    public static final int T_ID=29;
    public static final int T_IF_DEFINE=30;
    public static final int T_IF_ELSE=31;
    public static final int T_IF_MAIN=32;
    public static final int T_IF_NOT_DEFINE=33;
    public static final int T_IF_SIMPLE=34;
    public static final int T_IMPORT=35;
    public static final int T_INCLUDE=36;
    public static final int T_IN_BRACKETS=37;
    public static final int T_NAME=38;
    public static final int T_PARAM=39;
    public static final int T_PATH=40;
    public static final int T_REPLACE=41;
    public static final int WS=42;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public PreprocessorLexer() {} 
    public PreprocessorLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public PreprocessorLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g"; }

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:6:7: ( '!' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:6:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:7:7: ( '&&' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:7:9: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:8:7: ( '(' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:8:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:9:7: ( ')' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:9:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:10:7: ( '*' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:10:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:11:7: ( '+' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:11:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:12:7: ( ',' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:12:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:13:7: ( '-' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:13:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:14:7: ( '.' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:14:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:15:7: ( '...' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:15:9: '...'
            {
            match("..."); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:16:7: ( '/' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:16:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:17:7: ( '<' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:17:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:18:7: ( '<=' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:18:9: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:19:7: ( '==' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:19:9: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:20:7: ( '>' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:20:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:21:7: ( '>=' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:21:9: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:22:7: ( 'L' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:22:9: 'L'
            {
            match('L'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:23:7: ( '\\'#\\'' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:23:9: '\\'#\\''
            {
            match("'#'"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:24:7: ( '\\\\' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:24:9: '\\\\'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:25:7: ( '\\n' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:25:9: '\\n'
            {
            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:26:7: ( '\\r' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:26:9: '\\r'
            {
            match('\r'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:27:7: ( 'defined' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:27:9: 'defined'
            {
            match("defined"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:28:7: ( '||' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:28:9: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "IFNDEF"
    public final void mIFNDEF() throws RecognitionException {
        try {
            int _type = IFNDEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:217:8: ( '#ifndef' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:217:10: '#ifndef'
            {
            match("#ifndef"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IFNDEF"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:219:4: ( '#if' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:219:6: '#if'
            {
            match("#if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ELIF"
    public final void mELIF() throws RecognitionException {
        try {
            int _type = ELIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:221:6: ( '#elif' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:221:8: '#elif'
            {
            match("#elif"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELIF"

    // $ANTLR start "IFDEF"
    public final void mIFDEF() throws RecognitionException {
        try {
            int _type = IFDEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:223:7: ( '#ifdef' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:223:9: '#ifdef'
            {
            match("#ifdef"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IFDEF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:225:6: ( '#else' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:225:8: '#else'
            {
            match("#else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "ENDIF"
    public final void mENDIF() throws RecognitionException {
        try {
            int _type = ENDIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:227:7: ( '#endif' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:227:9: '#endif'
            {
            match("#endif"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDIF"

    // $ANTLR start "DEFINE"
    public final void mDEFINE() throws RecognitionException {
        try {
            int _type = DEFINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:229:8: ( '#define' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:229:10: '#define'
            {
            match("#define"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEFINE"

    // $ANTLR start "INCLUDE"
    public final void mINCLUDE() throws RecognitionException {
        try {
            int _type = INCLUDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:231:9: ( '#include' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:231:11: '#include'
            {
            match("#include"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INCLUDE"

    // $ANTLR start "IMPORT"
    public final void mIMPORT() throws RecognitionException {
        try {
            int _type = IMPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:233:8: ( '#import' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:233:10: '#import'
            {
            match("#import"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IMPORT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:235:4: ( LETTER ( DIGIT | LETTER )* )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:235:6: LETTER ( DIGIT | LETTER )*
            {
            mLETTER(); 


            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:235:13: ( DIGIT | LETTER )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:238:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:239:5: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 



            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:239:10: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='*') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='/') ) {
                        alt2=2;
                    }
                    else if ( ((LA2_1 >= '\u0000' && LA2_1 <= '.')||(LA2_1 >= '0' && LA2_1 <= '\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0 >= '\u0000' && LA2_0 <= ')')||(LA2_0 >= '+' && LA2_0 <= '\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:239:38: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match("*/"); 



             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "SINGLE_COMMENT"
    public final void mSINGLE_COMMENT() throws RecognitionException {
        try {
            int _type = SINGLE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:243:2: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:243:4: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 



            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:243:9: (~ ( '\\n' | '\\r' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:243:23: ( '\\r' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:243:23: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SINGLE_COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:245:6: ( ' ' | '\\t' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:249:9: ( DIGIT ( DIGIT | '.' )* )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:249:11: DIGIT ( DIGIT | '.' )*
            {
            mDIGIT(); 


            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:249:17: ( DIGIT | '.' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='.'||(LA5_0 >= '0' && LA5_0 <= '9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:
            	    {
            	    if ( input.LA(1)=='.'||(input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "STRING_LITERAL2"
    public final void mSTRING_LITERAL2() throws RecognitionException {
        try {
            int _type = STRING_LITERAL2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:252:2: ( '\"' (~ ( '\\r' | '\\n' | '\"' ) )* '\"' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:252:4: '\"' (~ ( '\\r' | '\\n' | '\"' ) )* '\"'
            {
            match('\"'); 

            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:252:8: (~ ( '\\r' | '\\n' | '\"' ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\t')||(LA6_0 >= '\u000B' && LA6_0 <= '\f')||(LA6_0 >= '\u000E' && LA6_0 <= '!')||(LA6_0 >= '#' && LA6_0 <= '\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_LITERAL2"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:254:16: ( '@' STRING_LITERAL2 )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:254:18: '@' STRING_LITERAL2
            {
            match('@'); 

            mSTRING_LITERAL2(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_LITERAL"

    // $ANTLR start "SPECIAL_CHARS"
    public final void mSPECIAL_CHARS() throws RecognitionException {
        try {
            int _type = SPECIAL_CHARS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:256:14: ( '!' | '%' | '?' | '|' | '&' | '.' | '*' | ';' | '[' | ']' | '{' | '}' | '@' | ':' | '+' | '-' | '/' | '#' | '<' | '>' | '=' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:
            {
            if ( input.LA(1)=='!'||input.LA(1)=='#'||(input.LA(1) >= '%' && input.LA(1) <= '&')||(input.LA(1) >= '*' && input.LA(1) <= '+')||(input.LA(1) >= '-' && input.LA(1) <= '/')||(input.LA(1) >= ':' && input.LA(1) <= '@')||input.LA(1)=='['||input.LA(1)==']'||(input.LA(1) >= '{' && input.LA(1) <= '}') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SPECIAL_CHARS"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:258:17: ( '0' .. '9' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:259:17: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER"

    public void mTokens() throws RecognitionException {
        // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:8: ( T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | IFNDEF | IF | ELIF | IFDEF | ELSE | ENDIF | DEFINE | INCLUDE | IMPORT | ID | COMMENT | SINGLE_COMMENT | WS | NUMBER | STRING_LITERAL2 | STRING_LITERAL | SPECIAL_CHARS )
        int alt7=40;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:10: T__43
                {
                mT__43(); 


                }
                break;
            case 2 :
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:16: T__44
                {
                mT__44(); 


                }
                break;
            case 3 :
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:22: T__45
                {
                mT__45(); 


                }
                break;
            case 4 :
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:28: T__46
                {
                mT__46(); 


                }
                break;
            case 5 :
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:34: T__47
                {
                mT__47(); 


                }
                break;
            case 6 :
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:40: T__48
                {
                mT__48(); 


                }
                break;
            case 7 :
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:46: T__49
                {
                mT__49(); 


                }
                break;
            case 8 :
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:52: T__50
                {
                mT__50(); 


                }
                break;
            case 9 :
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:58: T__51
                {
                mT__51(); 


                }
                break;
            case 10 :
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:64: T__52
                {
                mT__52(); 


                }
                break;
            case 11 :
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:70: T__53
                {
                mT__53(); 


                }
                break;
            case 12 :
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:76: T__54
                {
                mT__54(); 


                }
                break;
            case 13 :
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:82: T__55
                {
                mT__55(); 


                }
                break;
            case 14 :
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:88: T__56
                {
                mT__56(); 


                }
                break;
            case 15 :
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:94: T__57
                {
                mT__57(); 


                }
                break;
            case 16 :
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:100: T__58
                {
                mT__58(); 


                }
                break;
            case 17 :
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:106: T__59
                {
                mT__59(); 


                }
                break;
            case 18 :
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:112: T__60
                {
                mT__60(); 


                }
                break;
            case 19 :
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:118: T__61
                {
                mT__61(); 


                }
                break;
            case 20 :
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:124: T__62
                {
                mT__62(); 


                }
                break;
            case 21 :
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:130: T__63
                {
                mT__63(); 


                }
                break;
            case 22 :
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:136: T__64
                {
                mT__64(); 


                }
                break;
            case 23 :
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:142: T__65
                {
                mT__65(); 


                }
                break;
            case 24 :
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:148: IFNDEF
                {
                mIFNDEF(); 


                }
                break;
            case 25 :
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:155: IF
                {
                mIF(); 


                }
                break;
            case 26 :
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:158: ELIF
                {
                mELIF(); 


                }
                break;
            case 27 :
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:163: IFDEF
                {
                mIFDEF(); 


                }
                break;
            case 28 :
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:169: ELSE
                {
                mELSE(); 


                }
                break;
            case 29 :
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:174: ENDIF
                {
                mENDIF(); 


                }
                break;
            case 30 :
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:180: DEFINE
                {
                mDEFINE(); 


                }
                break;
            case 31 :
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:187: INCLUDE
                {
                mINCLUDE(); 


                }
                break;
            case 32 :
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:195: IMPORT
                {
                mIMPORT(); 


                }
                break;
            case 33 :
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:202: ID
                {
                mID(); 


                }
                break;
            case 34 :
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:205: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 35 :
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:213: SINGLE_COMMENT
                {
                mSINGLE_COMMENT(); 


                }
                break;
            case 36 :
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:228: WS
                {
                mWS(); 


                }
                break;
            case 37 :
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:231: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 38 :
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:238: STRING_LITERAL2
                {
                mSTRING_LITERAL2(); 


                }
                break;
            case 39 :
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:254: STRING_LITERAL
                {
                mSTRING_LITERAL(); 


                }
                break;
            case 40 :
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:1:269: SPECIAL_CHARS
                {
                mSPECIAL_CHARS(); 


                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\2\uffff\1\33\6\uffff\1\42\1\45\1\47\1\33\1\52\1\53\4\uffff\1\26"+
        "\2\33\4\uffff\1\33\21\uffff\1\26\5\uffff\1\26\1\73\4\uffff\1\26"+
        "\5\uffff\2\26\1\101\1\uffff";
    static final String DFA7_eofS =
        "\102\uffff";
    static final String DFA7_minS =
        "\1\11\1\uffff\1\46\6\uffff\1\56\1\52\3\75\1\60\4\uffff\1\145\1\174"+
        "\1\144\4\uffff\1\42\21\uffff\1\146\1\uffff\1\146\1\154\2\uffff\1"+
        "\151\1\144\2\uffff\1\151\1\uffff\1\156\5\uffff\1\145\1\144\1\60"+
        "\1\uffff";
    static final String DFA7_maxS =
        "\1\175\1\uffff\1\46\6\uffff\1\56\1\57\3\75\1\172\4\uffff\1\145\1"+
        "\174\1\151\4\uffff\1\42\21\uffff\1\146\1\uffff\2\156\2\uffff\1\151"+
        "\1\156\2\uffff\1\163\1\uffff\1\156\5\uffff\1\145\1\144\1\172\1\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\6\uffff\1\22\1\23"+
        "\1\24\1\25\3\uffff\1\41\1\44\1\45\1\46\1\uffff\1\50\1\1\1\2\1\5"+
        "\1\6\1\10\1\12\1\11\1\42\1\43\1\13\1\15\1\14\1\16\1\20\1\17\1\21"+
        "\1\uffff\1\27\2\uffff\1\36\1\47\2\uffff\1\37\1\40\1\uffff\1\35\1"+
        "\uffff\1\30\1\33\1\31\1\32\1\34\3\uffff\1\26";
    static final String DFA7_specialS =
        "\102\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\27\1\21\2\uffff\1\22\22\uffff\1\27\1\1\1\31\1\25\1\uffff"+
            "\1\33\1\2\1\17\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\12\30\2\33"+
            "\1\13\1\14\1\15\1\33\1\32\13\26\1\16\16\26\1\33\1\20\1\33\1"+
            "\uffff\1\26\1\uffff\3\26\1\23\26\26\1\33\1\24\1\33",
            "",
            "\1\35",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\41",
            "\1\43\4\uffff\1\44",
            "\1\46",
            "\1\50",
            "\1\51",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "",
            "",
            "\1\54",
            "\1\55",
            "\1\60\1\57\3\uffff\1\56",
            "",
            "",
            "",
            "",
            "\1\61",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\62",
            "",
            "\1\63\6\uffff\1\65\1\64",
            "\1\66\1\uffff\1\67",
            "",
            "",
            "\1\70",
            "\1\72\11\uffff\1\71",
            "",
            "",
            "\1\74\11\uffff\1\75",
            "",
            "\1\76",
            "",
            "",
            "",
            "",
            "",
            "\1\77",
            "\1\100",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | IFNDEF | IF | ELIF | IFDEF | ELSE | ENDIF | DEFINE | INCLUDE | IMPORT | ID | COMMENT | SINGLE_COMMENT | WS | NUMBER | STRING_LITERAL2 | STRING_LITERAL | SPECIAL_CHARS );";
        }
    }
 

}