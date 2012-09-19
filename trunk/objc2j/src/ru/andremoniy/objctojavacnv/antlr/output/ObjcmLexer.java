// $ANTLR 3.4 Objcm.g 2012-09-19 09:04:39

package ru.andremoniy.objctojavacnv.antlr.output;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ObjcmLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__102=102;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__110=110;
    public static final int T__111=111;
    public static final int T__112=112;
    public static final int T__113=113;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__120=120;
    public static final int T__121=121;
    public static final int T__122=122;
    public static final int T__123=123;
    public static final int T__124=124;
    public static final int T__125=125;
    public static final int T__126=126;
    public static final int T__127=127;
    public static final int T__128=128;
    public static final int T__129=129;
    public static final int T__130=130;
    public static final int T__131=131;
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int T__134=134;
    public static final int T__135=135;
    public static final int T__136=136;
    public static final int T__137=137;
    public static final int T__138=138;
    public static final int T__139=139;
    public static final int T__140=140;
    public static final int T__141=141;
    public static final int T__142=142;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int T__145=145;
    public static final int T__146=146;
    public static final int T__147=147;
    public static final int T__148=148;
    public static final int T__149=149;
    public static final int T__150=150;
    public static final int T__151=151;
    public static final int T__152=152;
    public static final int T__153=153;
    public static final int T__154=154;
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int T__157=157;
    public static final int T__158=158;
    public static final int T__159=159;
    public static final int T__160=160;
    public static final int T__161=161;
    public static final int T__162=162;
    public static final int T__163=163;
    public static final int T__164=164;
    public static final int T__165=165;
    public static final int ASTERISK=4;
    public static final int BLOCK=5;
    public static final int BREAK=6;
    public static final int BREAK_WORD=7;
    public static final int BR_STMT=8;
    public static final int CASE_BODY=9;
    public static final int CASE_EXPR=10;
    public static final int CASE_STMT=11;
    public static final int CATEGORY=12;
    public static final int CLASSICAL_EXPR=13;
    public static final int COLON=14;
    public static final int COMMA=15;
    public static final int CONST_PREFIX=16;
    public static final int DEFAULT_BODY=17;
    public static final int DEFAULT_STMT=18;
    public static final int DIGIT=19;
    public static final int DOT=20;
    public static final int ENUM=21;
    public static final int ENUM_PREFIX=22;
    public static final int ESC=23;
    public static final int EXPR=24;
    public static final int EXTERN=25;
    public static final int FIELD=26;
    public static final int FIELD_ACCESS=27;
    public static final int FIELD_TYPE_STARTED=28;
    public static final int FOR_IN_STMT=29;
    public static final int GENERIC=30;
    public static final int ID=31;
    public static final int IF_BLOCK=32;
    public static final int IF_EXPR=33;
    public static final int IF_STMT=34;
    public static final int IMPLEMENTATION=35;
    public static final int INTERFACE=36;
    public static final int LETTER=37;
    public static final int L_BR=38;
    public static final int L_EQ=39;
    public static final int L_FBR=40;
    public static final int L_KBR=41;
    public static final int L_MINUS_MINUS=42;
    public static final int L_PLUS_PLUS=43;
    public static final int L_UBR=44;
    public static final int MESSAGE=45;
    public static final int METHOD=46;
    public static final int METHOD_CALL=47;
    public static final int METHOD_MSG=48;
    public static final int METHOD_NAME=49;
    public static final int MODIFIER=50;
    public static final int MSG_LIST=51;
    public static final int MULTI_COMMENT=52;
    public static final int M_IMPORT=53;
    public static final int M_TYPE_START=54;
    public static final int NAME=55;
    public static final int NOT=56;
    public static final int NUMBER=57;
    public static final int OBJECT=58;
    public static final int OP=59;
    public static final int OPER=60;
    public static final int OPERATOR=61;
    public static final int PARAM=62;
    public static final int PREFIX=63;
    public static final int PREPROCESSOR_DECLARATION=64;
    public static final int RETURN_STMT=65;
    public static final int R_BR=66;
    public static final int R_FBR=67;
    public static final int R_KBR=68;
    public static final int R_UBR=69;
    public static final int SELECTOR=70;
    public static final int SELECTOR_VALUE=71;
    public static final int SEMICOLON=72;
    public static final int SET_INTERNAL=73;
    public static final int SINGLE_COMMENT=74;
    public static final int SINGLE_OP=75;
    public static final int STATIC=76;
    public static final int STATIC_METHOD=77;
    public static final int STATIC_PREFIX=78;
    public static final int STATIC_START=79;
    public static final int STRING_LITERAL=80;
    public static final int STRING_LITERAL2=81;
    public static final int STRING_LITERAL3=82;
    public static final int STRUCT_FIELD=83;
    public static final int STRUCT_PREFIX=84;
    public static final int SUPER_CLASS=85;
    public static final int SWITCH=86;
    public static final int SWITCH_BODY=87;
    public static final int SWITCH_EXPRESSION=88;
    public static final int TYPE=89;
    public static final int TYPEDEF=90;
    public static final int TYPEDEF_ELEMENT=91;
    public static final int TYPEDEF_STRUCT=92;
    public static final int TYPE_CONVERTION=93;
    public static final int TYPE_CONVERTION_MAY_BE=94;
    public static final int TYPE_CONVERTION_TRUE=95;
    public static final int VALUE=96;
    public static final int VA_ARGS=97;
    public static final int VOID=98;
    public static final int WHILE_EXPR=99;
    public static final int WHILE_STMT=100;
    public static final int WS=101;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public ObjcmLexer() {} 
    public ObjcmLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ObjcmLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "Objcm.g"; }

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:6:8: ( '!' )
            // Objcm.g:6:10: '!'
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
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:7:8: ( '!=' )
            // Objcm.g:7:10: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:8:8: ( '\"C\"' )
            // Objcm.g:8:10: '\"C\"'
            {
            match("\"C\""); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:9:8: ( '%' )
            // Objcm.g:9:10: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:10:8: ( '%=' )
            // Objcm.g:10:10: '%='
            {
            match("%="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:11:8: ( '&&' )
            // Objcm.g:11:10: '&&'
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
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:12:8: ( '&' )
            // Objcm.g:12:10: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:13:8: ( '&=' )
            // Objcm.g:13:10: '&='
            {
            match("&="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:14:8: ( '*=' )
            // Objcm.g:14:10: '*='
            {
            match("*="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:15:8: ( '+' )
            // Objcm.g:15:10: '+'
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
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:16:8: ( '+=' )
            // Objcm.g:16:10: '+='
            {
            match("+="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:17:8: ( '-' )
            // Objcm.g:17:10: '-'
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
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:18:8: ( '-=' )
            // Objcm.g:18:10: '-='
            {
            match("-="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:19:8: ( '->' )
            // Objcm.g:19:10: '->'
            {
            match("->"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:20:8: ( '...' )
            // Objcm.g:20:10: '...'
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
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:21:8: ( '/' )
            // Objcm.g:21:10: '/'
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
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:22:8: ( '/=' )
            // Objcm.g:22:10: '/='
            {
            match("/="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:23:8: ( '<<' )
            // Objcm.g:23:10: '<<'
            {
            match("<<"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:24:8: ( '<<=' )
            // Objcm.g:24:10: '<<='
            {
            match("<<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:25:8: ( '<=' )
            // Objcm.g:25:10: '<='
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
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:26:8: ( '==' )
            // Objcm.g:26:10: '=='
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
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:27:8: ( '>=' )
            // Objcm.g:27:10: '>='
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
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:28:8: ( '>>' )
            // Objcm.g:28:10: '>>'
            {
            match(">>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:29:8: ( '>>=' )
            // Objcm.g:29:10: '>>='
            {
            match(">>="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:30:8: ( '?' )
            // Objcm.g:30:10: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:31:8: ( '@catch' )
            // Objcm.g:31:10: '@catch'
            {
            match("@catch"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:32:8: ( '@encode' )
            // Objcm.g:32:10: '@encode'
            {
            match("@encode"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:33:8: ( '@end' )
            // Objcm.g:33:10: '@end'
            {
            match("@end"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "T__130"
    public final void mT__130() throws RecognitionException {
        try {
            int _type = T__130;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:34:8: ( '@finally' )
            // Objcm.g:34:10: '@finally'
            {
            match("@finally"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__130"

    // $ANTLR start "T__131"
    public final void mT__131() throws RecognitionException {
        try {
            int _type = T__131;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:35:8: ( '@implementation' )
            // Objcm.g:35:10: '@implementation'
            {
            match("@implementation"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__131"

    // $ANTLR start "T__132"
    public final void mT__132() throws RecognitionException {
        try {
            int _type = T__132;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:36:8: ( '@interface' )
            // Objcm.g:36:10: '@interface'
            {
            match("@interface"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__132"

    // $ANTLR start "T__133"
    public final void mT__133() throws RecognitionException {
        try {
            int _type = T__133;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:37:8: ( '@private' )
            // Objcm.g:37:10: '@private'
            {
            match("@private"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__133"

    // $ANTLR start "T__134"
    public final void mT__134() throws RecognitionException {
        try {
            int _type = T__134;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:38:8: ( '@public' )
            // Objcm.g:38:10: '@public'
            {
            match("@public"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__134"

    // $ANTLR start "T__135"
    public final void mT__135() throws RecognitionException {
        try {
            int _type = T__135;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:39:8: ( '@selector' )
            // Objcm.g:39:10: '@selector'
            {
            match("@selector"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__135"

    // $ANTLR start "T__136"
    public final void mT__136() throws RecognitionException {
        try {
            int _type = T__136;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:40:8: ( '@synthesize' )
            // Objcm.g:40:10: '@synthesize'
            {
            match("@synthesize"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__136"

    // $ANTLR start "T__137"
    public final void mT__137() throws RecognitionException {
        try {
            int _type = T__137;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:41:8: ( '@throw' )
            // Objcm.g:41:10: '@throw'
            {
            match("@throw"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__137"

    // $ANTLR start "T__138"
    public final void mT__138() throws RecognitionException {
        try {
            int _type = T__138;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:42:8: ( '@try' )
            // Objcm.g:42:10: '@try'
            {
            match("@try"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__138"

    // $ANTLR start "T__139"
    public final void mT__139() throws RecognitionException {
        try {
            int _type = T__139;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:43:8: ( 'Nil' )
            // Objcm.g:43:10: 'Nil'
            {
            match("Nil"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__139"

    // $ANTLR start "T__140"
    public final void mT__140() throws RecognitionException {
        try {
            int _type = T__140;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:44:8: ( '^' )
            // Objcm.g:44:10: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__140"

    // $ANTLR start "T__141"
    public final void mT__141() throws RecognitionException {
        try {
            int _type = T__141;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:45:8: ( '^=' )
            // Objcm.g:45:10: '^='
            {
            match("^="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__141"

    // $ANTLR start "T__142"
    public final void mT__142() throws RecognitionException {
        try {
            int _type = T__142;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:46:8: ( '__attribute__' )
            // Objcm.g:46:10: '__attribute__'
            {
            match("__attribute__"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__142"

    // $ANTLR start "T__143"
    public final void mT__143() throws RecognitionException {
        try {
            int _type = T__143;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:47:8: ( '__typeof__' )
            // Objcm.g:47:10: '__typeof__'
            {
            match("__typeof__"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__143"

    // $ANTLR start "T__144"
    public final void mT__144() throws RecognitionException {
        try {
            int _type = T__144;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:48:8: ( 'case' )
            // Objcm.g:48:10: 'case'
            {
            match("case"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__144"

    // $ANTLR start "T__145"
    public final void mT__145() throws RecognitionException {
        try {
            int _type = T__145;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:49:8: ( 'constructor' )
            // Objcm.g:49:10: 'constructor'
            {
            match("constructor"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__145"

    // $ANTLR start "T__146"
    public final void mT__146() throws RecognitionException {
        try {
            int _type = T__146;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:50:8: ( 'default' )
            // Objcm.g:50:10: 'default'
            {
            match("default"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__146"

    // $ANTLR start "T__147"
    public final void mT__147() throws RecognitionException {
        try {
            int _type = T__147;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:51:8: ( 'do' )
            // Objcm.g:51:10: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__147"

    // $ANTLR start "T__148"
    public final void mT__148() throws RecognitionException {
        try {
            int _type = T__148;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:52:8: ( 'else' )
            // Objcm.g:52:10: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__148"

    // $ANTLR start "T__149"
    public final void mT__149() throws RecognitionException {
        try {
            int _type = T__149;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:53:8: ( 'extern' )
            // Objcm.g:53:10: 'extern'
            {
            match("extern"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__149"

    // $ANTLR start "T__150"
    public final void mT__150() throws RecognitionException {
        try {
            int _type = T__150;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:54:8: ( 'for' )
            // Objcm.g:54:10: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__150"

    // $ANTLR start "T__151"
    public final void mT__151() throws RecognitionException {
        try {
            int _type = T__151;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:55:8: ( 'if' )
            // Objcm.g:55:10: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__151"

    // $ANTLR start "T__152"
    public final void mT__152() throws RecognitionException {
        try {
            int _type = T__152;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:56:8: ( 'in' )
            // Objcm.g:56:10: 'in'
            {
            match("in"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__152"

    // $ANTLR start "T__153"
    public final void mT__153() throws RecognitionException {
        try {
            int _type = T__153;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:57:8: ( 'inline' )
            // Objcm.g:57:10: 'inline'
            {
            match("inline"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__153"

    // $ANTLR start "T__154"
    public final void mT__154() throws RecognitionException {
        try {
            int _type = T__154;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:58:8: ( 'nil' )
            // Objcm.g:58:10: 'nil'
            {
            match("nil"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__154"

    // $ANTLR start "T__155"
    public final void mT__155() throws RecognitionException {
        try {
            int _type = T__155;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:59:8: ( 'return' )
            // Objcm.g:59:10: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__155"

    // $ANTLR start "T__156"
    public final void mT__156() throws RecognitionException {
        try {
            int _type = T__156;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:60:8: ( 'sizeof' )
            // Objcm.g:60:10: 'sizeof'
            {
            match("sizeof"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__156"

    // $ANTLR start "T__157"
    public final void mT__157() throws RecognitionException {
        try {
            int _type = T__157;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:61:8: ( 'switch' )
            // Objcm.g:61:10: 'switch'
            {
            match("switch"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__157"

    // $ANTLR start "T__158"
    public final void mT__158() throws RecognitionException {
        try {
            int _type = T__158;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:62:8: ( 'typedef' )
            // Objcm.g:62:10: 'typedef'
            {
            match("typedef"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__158"

    // $ANTLR start "T__159"
    public final void mT__159() throws RecognitionException {
        try {
            int _type = T__159;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:63:8: ( 'union' )
            // Objcm.g:63:10: 'union'
            {
            match("union"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__159"

    // $ANTLR start "T__160"
    public final void mT__160() throws RecognitionException {
        try {
            int _type = T__160;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:64:8: ( 'unsigned' )
            // Objcm.g:64:10: 'unsigned'
            {
            match("unsigned"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__160"

    // $ANTLR start "T__161"
    public final void mT__161() throws RecognitionException {
        try {
            int _type = T__161;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:65:8: ( 'while' )
            // Objcm.g:65:10: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__161"

    // $ANTLR start "T__162"
    public final void mT__162() throws RecognitionException {
        try {
            int _type = T__162;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:66:8: ( '|' )
            // Objcm.g:66:10: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__162"

    // $ANTLR start "T__163"
    public final void mT__163() throws RecognitionException {
        try {
            int _type = T__163;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:67:8: ( '|=' )
            // Objcm.g:67:10: '|='
            {
            match("|="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__163"

    // $ANTLR start "T__164"
    public final void mT__164() throws RecognitionException {
        try {
            int _type = T__164;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:68:8: ( '||' )
            // Objcm.g:68:10: '||'
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
    // $ANTLR end "T__164"

    // $ANTLR start "T__165"
    public final void mT__165() throws RecognitionException {
        try {
            int _type = T__165;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:69:8: ( '~' )
            // Objcm.g:69:10: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__165"

    // $ANTLR start "L_FBR"
    public final void mL_FBR() throws RecognitionException {
        try {
            int _type = L_FBR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1078:6: ( '{' )
            // Objcm.g:1078:8: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_FBR"

    // $ANTLR start "R_FBR"
    public final void mR_FBR() throws RecognitionException {
        try {
            int _type = R_FBR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1079:6: ( '}' )
            // Objcm.g:1079:8: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "R_FBR"

    // $ANTLR start "L_BR"
    public final void mL_BR() throws RecognitionException {
        try {
            int _type = L_BR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1080:6: ( '(' )
            // Objcm.g:1080:8: '('
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
    // $ANTLR end "L_BR"

    // $ANTLR start "R_BR"
    public final void mR_BR() throws RecognitionException {
        try {
            int _type = R_BR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1081:6: ( ')' )
            // Objcm.g:1081:8: ')'
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
    // $ANTLR end "R_BR"

    // $ANTLR start "L_KBR"
    public final void mL_KBR() throws RecognitionException {
        try {
            int _type = L_KBR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1082:6: ( '[' )
            // Objcm.g:1082:8: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_KBR"

    // $ANTLR start "R_KBR"
    public final void mR_KBR() throws RecognitionException {
        try {
            int _type = R_KBR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1083:6: ( ']' )
            // Objcm.g:1083:8: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "R_KBR"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1085:2: ( ';' )
            // Objcm.g:1085:4: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1086:6: ( ':' )
            // Objcm.g:1086:8: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "L_UBR"
    public final void mL_UBR() throws RecognitionException {
        try {
            int _type = L_UBR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1087:6: ( '<' )
            // Objcm.g:1087:8: '<'
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
    // $ANTLR end "L_UBR"

    // $ANTLR start "R_UBR"
    public final void mR_UBR() throws RecognitionException {
        try {
            int _type = R_UBR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1088:6: ( '>' )
            // Objcm.g:1088:8: '>'
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
    // $ANTLR end "R_UBR"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1089:4: ( '.' )
            // Objcm.g:1089:6: '.'
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
    // $ANTLR end "DOT"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1090:6: ( ',' )
            // Objcm.g:1090:8: ','
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
    // $ANTLR end "COMMA"

    // $ANTLR start "L_EQ"
    public final void mL_EQ() throws RecognitionException {
        try {
            int _type = L_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1091:6: ( '=' )
            // Objcm.g:1091:8: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_EQ"

    // $ANTLR start "ASTERISK"
    public final void mASTERISK() throws RecognitionException {
        try {
            int _type = ASTERISK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1093:2: ( '*' )
            // Objcm.g:1093:4: '*'
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
    // $ANTLR end "ASTERISK"

    // $ANTLR start "L_PLUS_PLUS"
    public final void mL_PLUS_PLUS() throws RecognitionException {
        try {
            int _type = L_PLUS_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1095:2: ( '++' )
            // Objcm.g:1095:4: '++'
            {
            match("++"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_PLUS_PLUS"

    // $ANTLR start "L_MINUS_MINUS"
    public final void mL_MINUS_MINUS() throws RecognitionException {
        try {
            int _type = L_MINUS_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1097:2: ( '--' )
            // Objcm.g:1097:4: '--'
            {
            match("--"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_MINUS_MINUS"

    // $ANTLR start "CONST_PREFIX"
    public final void mCONST_PREFIX() throws RecognitionException {
        try {
            int _type = CONST_PREFIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1100:3: ( 'const' )
            // Objcm.g:1100:5: 'const'
            {
            match("const"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONST_PREFIX"

    // $ANTLR start "ENUM_PREFIX"
    public final void mENUM_PREFIX() throws RecognitionException {
        try {
            int _type = ENUM_PREFIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1103:2: ( 'enum' )
            // Objcm.g:1103:4: 'enum'
            {
            match("enum"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENUM_PREFIX"

    // $ANTLR start "STRUCT_PREFIX"
    public final void mSTRUCT_PREFIX() throws RecognitionException {
        try {
            int _type = STRUCT_PREFIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1106:2: ( 'struct' )
            // Objcm.g:1106:4: 'struct'
            {
            match("struct"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRUCT_PREFIX"

    // $ANTLR start "STATIC_PREFIX"
    public final void mSTATIC_PREFIX() throws RecognitionException {
        try {
            int _type = STATIC_PREFIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1109:2: ( 'static' )
            // Objcm.g:1109:4: 'static'
            {
            match("static"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STATIC_PREFIX"

    // $ANTLR start "SINGLE_COMMENT"
    public final void mSINGLE_COMMENT() throws RecognitionException {
        try {
            int _type = SINGLE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1112:2: ( '//' (~ ( '\\r' | '\\n' ) )* ( ( '\\r' )? '\\n' )+ )
            // Objcm.g:1112:4: '//' (~ ( '\\r' | '\\n' ) )* ( ( '\\r' )? '\\n' )+
            {
            match("//"); 



            // Objcm.g:1112:9: (~ ( '\\r' | '\\n' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= '\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Objcm.g:
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
            	    break loop1;
                }
            } while (true);


            // Objcm.g:1112:25: ( ( '\\r' )? '\\n' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Objcm.g:1112:26: ( '\\r' )? '\\n'
            	    {
            	    // Objcm.g:1112:26: ( '\\r' )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0=='\r') ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // Objcm.g:1112:26: '\\r'
            	            {
            	            match('\r'); 

            	            }
            	            break;

            	    }


            	    match('\n'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SINGLE_COMMENT"

    // $ANTLR start "MULTI_COMMENT"
    public final void mMULTI_COMMENT() throws RecognitionException {
        try {
            int _type = MULTI_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1115:3: ( '/*' ( . )* '*/' ( ( '\\r' )? '\\n' )? )
            // Objcm.g:1115:5: '/*' ( . )* '*/' ( ( '\\r' )? '\\n' )?
            {
            match("/*"); 



            // Objcm.g:1115:10: ( . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='*') ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1=='/') ) {
                        alt4=2;
                    }
                    else if ( ((LA4_1 >= '\u0000' && LA4_1 <= '.')||(LA4_1 >= '0' && LA4_1 <= '\uFFFF')) ) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0 >= '\u0000' && LA4_0 <= ')')||(LA4_0 >= '+' && LA4_0 <= '\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Objcm.g:1115:10: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match("*/"); 



            // Objcm.g:1115:18: ( ( '\\r' )? '\\n' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\n'||LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // Objcm.g:1115:19: ( '\\r' )? '\\n'
                    {
                    // Objcm.g:1115:19: ( '\\r' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\r') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // Objcm.g:1115:19: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    }
                    break;

            }


             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MULTI_COMMENT"

    // $ANTLR start "PREPROCESSOR_DECLARATION"
    public final void mPREPROCESSOR_DECLARATION() throws RecognitionException {
        try {
            int _type = PREPROCESSOR_DECLARATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1118:2: ( '#' (~ ( '\\\\' | '\\r' | '\\n' ) )* ( '\\\\' ( '\\r' | '\\n' )+ (~ ( '\\\\' | '\\r' | '\\n' ) )+ )* ( '\\r' | '\\n' )+ )
            // Objcm.g:1118:5: '#' (~ ( '\\\\' | '\\r' | '\\n' ) )* ( '\\\\' ( '\\r' | '\\n' )+ (~ ( '\\\\' | '\\r' | '\\n' ) )+ )* ( '\\r' | '\\n' )+
            {
            match('#'); 

            // Objcm.g:1118:9: (~ ( '\\\\' | '\\r' | '\\n' ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\t')||(LA7_0 >= '\u000B' && LA7_0 <= '\f')||(LA7_0 >= '\u000E' && LA7_0 <= '[')||(LA7_0 >= ']' && LA7_0 <= '\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Objcm.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
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
            	    break loop7;
                }
            } while (true);


            // Objcm.g:1118:32: ( '\\\\' ( '\\r' | '\\n' )+ (~ ( '\\\\' | '\\r' | '\\n' ) )+ )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\\') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Objcm.g:1118:33: '\\\\' ( '\\r' | '\\n' )+ (~ ( '\\\\' | '\\r' | '\\n' ) )+
            	    {
            	    match('\\'); 

            	    // Objcm.g:1118:38: ( '\\r' | '\\n' )+
            	    int cnt8=0;
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0=='\n'||LA8_0=='\r') ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // Objcm.g:
            	    	    {
            	    	    if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
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
            	    	    if ( cnt8 >= 1 ) break loop8;
            	                EarlyExitException eee =
            	                    new EarlyExitException(8, input);
            	                throw eee;
            	        }
            	        cnt8++;
            	    } while (true);


            	    // Objcm.g:1118:53: (~ ( '\\\\' | '\\r' | '\\n' ) )+
            	    int cnt9=0;
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( ((LA9_0 >= '\u0000' && LA9_0 <= '\t')||(LA9_0 >= '\u000B' && LA9_0 <= '\f')||(LA9_0 >= '\u000E' && LA9_0 <= '[')||(LA9_0 >= ']' && LA9_0 <= '\uFFFF')) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // Objcm.g:
            	    	    {
            	    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
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
            	    	    if ( cnt9 >= 1 ) break loop9;
            	                EarlyExitException eee =
            	                    new EarlyExitException(9, input);
            	                throw eee;
            	        }
            	        cnt9++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            // Objcm.g:1118:78: ( '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Objcm.g:
            	    {
            	    if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PREPROCESSOR_DECLARATION"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1120:9: ( ( DIGIT )+ ( 'u' | 'U' )? | ( DIGIT )+ DOT ( DIGIT )* ( 'f' | 'F' )? | ( DIGIT )* DOT ( DIGIT )+ ( 'f' | 'F' )? | ( '0x' ( DIGIT | 'A' .. 'F' )* ( DOT ( DIGIT )+ )? )? | ( DIGIT )+ ( DOT ( DIGIT )+ )? 'e' ( '-' | '+' )? ( DIGIT )+ )
            int alt29=5;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // Objcm.g:1120:11: ( DIGIT )+ ( 'u' | 'U' )?
                    {
                    // Objcm.g:1120:11: ( DIGIT )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // Objcm.g:
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
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);


                    // Objcm.g:1120:18: ( 'u' | 'U' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='U'||LA13_0=='u') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // Objcm.g:
                            {
                            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                                input.consume();
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Objcm.g:1121:4: ( DIGIT )+ DOT ( DIGIT )* ( 'f' | 'F' )?
                    {
                    // Objcm.g:1121:4: ( DIGIT )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0 >= '0' && LA14_0 <= '9')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // Objcm.g:
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
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);


                    mDOT(); 


                    // Objcm.g:1121:15: ( DIGIT )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0 >= '0' && LA15_0 <= '9')) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // Objcm.g:
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
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    // Objcm.g:1121:22: ( 'f' | 'F' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='F'||LA16_0=='f') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // Objcm.g:
                            {
                            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                                input.consume();
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // Objcm.g:1122:4: ( DIGIT )* DOT ( DIGIT )+ ( 'f' | 'F' )?
                    {
                    // Objcm.g:1122:4: ( DIGIT )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0 >= '0' && LA17_0 <= '9')) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // Objcm.g:
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
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    mDOT(); 


                    // Objcm.g:1122:15: ( DIGIT )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( ((LA18_0 >= '0' && LA18_0 <= '9')) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // Objcm.g:
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
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);


                    // Objcm.g:1122:22: ( 'f' | 'F' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='F'||LA19_0=='f') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // Objcm.g:
                            {
                            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                                input.consume();
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // Objcm.g:1123:4: ( '0x' ( DIGIT | 'A' .. 'F' )* ( DOT ( DIGIT )+ )? )?
                    {
                    // Objcm.g:1123:4: ( '0x' ( DIGIT | 'A' .. 'F' )* ( DOT ( DIGIT )+ )? )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0=='0') ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // Objcm.g:1123:5: '0x' ( DIGIT | 'A' .. 'F' )* ( DOT ( DIGIT )+ )?
                            {
                            match("0x"); 



                            // Objcm.g:1123:11: ( DIGIT | 'A' .. 'F' )*
                            loop20:
                            do {
                                int alt20=2;
                                int LA20_0 = input.LA(1);

                                if ( ((LA20_0 >= '0' && LA20_0 <= '9')||(LA20_0 >= 'A' && LA20_0 <= 'F')) ) {
                                    alt20=1;
                                }


                                switch (alt20) {
                            	case 1 :
                            	    // Objcm.g:
                            	    {
                            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F') ) {
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
                            	    break loop20;
                                }
                            } while (true);


                            // Objcm.g:1123:28: ( DOT ( DIGIT )+ )?
                            int alt22=2;
                            int LA22_0 = input.LA(1);

                            if ( (LA22_0=='.') ) {
                                alt22=1;
                            }
                            switch (alt22) {
                                case 1 :
                                    // Objcm.g:1123:29: DOT ( DIGIT )+
                                    {
                                    mDOT(); 


                                    // Objcm.g:1123:33: ( DIGIT )+
                                    int cnt21=0;
                                    loop21:
                                    do {
                                        int alt21=2;
                                        int LA21_0 = input.LA(1);

                                        if ( ((LA21_0 >= '0' && LA21_0 <= '9')) ) {
                                            alt21=1;
                                        }


                                        switch (alt21) {
                                    	case 1 :
                                    	    // Objcm.g:
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
                                    	    break;

                                    	default :
                                    	    if ( cnt21 >= 1 ) break loop21;
                                                EarlyExitException eee =
                                                    new EarlyExitException(21, input);
                                                throw eee;
                                        }
                                        cnt21++;
                                    } while (true);


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // Objcm.g:1124:4: ( DIGIT )+ ( DOT ( DIGIT )+ )? 'e' ( '-' | '+' )? ( DIGIT )+
                    {
                    // Objcm.g:1124:4: ( DIGIT )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( ((LA24_0 >= '0' && LA24_0 <= '9')) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // Objcm.g:
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
                    	    break;

                    	default :
                    	    if ( cnt24 >= 1 ) break loop24;
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                throw eee;
                        }
                        cnt24++;
                    } while (true);


                    // Objcm.g:1124:11: ( DOT ( DIGIT )+ )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0=='.') ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // Objcm.g:1124:12: DOT ( DIGIT )+
                            {
                            mDOT(); 


                            // Objcm.g:1124:16: ( DIGIT )+
                            int cnt25=0;
                            loop25:
                            do {
                                int alt25=2;
                                int LA25_0 = input.LA(1);

                                if ( ((LA25_0 >= '0' && LA25_0 <= '9')) ) {
                                    alt25=1;
                                }


                                switch (alt25) {
                            	case 1 :
                            	    // Objcm.g:
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
                            	    break;

                            	default :
                            	    if ( cnt25 >= 1 ) break loop25;
                                        EarlyExitException eee =
                                            new EarlyExitException(25, input);
                                        throw eee;
                                }
                                cnt25++;
                            } while (true);


                            }
                            break;

                    }


                    match('e'); 

                    // Objcm.g:1124:29: ( '-' | '+' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0=='+'||LA27_0=='-') ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // Objcm.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    // Objcm.g:1124:40: ( DIGIT )+
                    int cnt28=0;
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( ((LA28_0 >= '0' && LA28_0 <= '9')) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // Objcm.g:
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
                    	    break;

                    	default :
                    	    if ( cnt28 >= 1 ) break loop28;
                                EarlyExitException eee =
                                    new EarlyExitException(28, input);
                                throw eee;
                        }
                        cnt28++;
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1126:4: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // Objcm.g:1126:6: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // Objcm.g:1126:6: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0 >= '\t' && LA30_0 <= '\n')||(LA30_0 >= '\f' && LA30_0 <= '\r')||LA30_0==' ') ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // Objcm.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
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
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);


             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "SINGLE_OP"
    public final void mSINGLE_OP() throws RecognitionException {
        try {
            int _type = SINGLE_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1129:2: ( 'continue' SEMICOLON )
            // Objcm.g:1129:4: 'continue' SEMICOLON
            {
            match("continue"); 



            mSEMICOLON(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SINGLE_OP"

    // $ANTLR start "BREAK_WORD"
    public final void mBREAK_WORD() throws RecognitionException {
        try {
            int _type = BREAK_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1133:2: ( 'break' )
            // Objcm.g:1133:4: 'break'
            {
            match("break"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BREAK_WORD"

    // $ANTLR start "VOID"
    public final void mVOID() throws RecognitionException {
        try {
            int _type = VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1135:6: ( 'void' )
            // Objcm.g:1135:8: 'void'
            {
            match("void"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VOID"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1137:4: ( LETTER ( DIGIT | LETTER )* )
            // Objcm.g:1137:6: LETTER ( DIGIT | LETTER )*
            {
            mLETTER(); 


            // Objcm.g:1137:13: ( DIGIT | LETTER )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0 >= '0' && LA31_0 <= '9')||(LA31_0 >= 'A' && LA31_0 <= 'Z')||LA31_0=='_'||(LA31_0 >= 'a' && LA31_0 <= 'z')) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // Objcm.g:
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
            	    break loop31;
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

    // $ANTLR start "STRING_LITERAL2"
    public final void mSTRING_LITERAL2() throws RecognitionException {
        try {
            int _type = STRING_LITERAL2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1143:2: ( '\"' ( WS | ESC |~ ( '\\r' | '\\n' | '\"' ) )* '\"' )
            // Objcm.g:1143:4: '\"' ( WS | ESC |~ ( '\\r' | '\\n' | '\"' ) )* '\"'
            {
            match('\"'); 

            // Objcm.g:1143:8: ( WS | ESC |~ ( '\\r' | '\\n' | '\"' ) )*
            loop32:
            do {
                int alt32=4;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0 >= '\t' && LA32_0 <= '\n')||(LA32_0 >= '\f' && LA32_0 <= '\r')||LA32_0==' ') ) {
                    alt32=1;
                }
                else if ( (LA32_0=='\\') ) {
                    int LA32_3 = input.LA(2);

                    if ( (LA32_3=='\"') ) {
                        int LA32_5 = input.LA(3);

                        if ( ((LA32_5 >= '\u0000' && LA32_5 <= '\uFFFF')) ) {
                            alt32=2;
                        }

                        else {
                            alt32=3;
                        }


                    }
                    else if ( ((LA32_3 >= '\u0000' && LA32_3 <= '!')||(LA32_3 >= '#' && LA32_3 <= '\uFFFF')) ) {
                        alt32=3;
                    }


                }
                else if ( ((LA32_0 >= '\u0000' && LA32_0 <= '\b')||LA32_0=='\u000B'||(LA32_0 >= '\u000E' && LA32_0 <= '\u001F')||LA32_0=='!'||(LA32_0 >= '#' && LA32_0 <= '[')||(LA32_0 >= ']' && LA32_0 <= '\uFFFF')) ) {
                    alt32=3;
                }


                switch (alt32) {
            	case 1 :
            	    // Objcm.g:1143:9: WS
            	    {
            	    mWS(); 


            	    }
            	    break;
            	case 2 :
            	    // Objcm.g:1143:14: ESC
            	    {
            	    mESC(); 


            	    }
            	    break;
            	case 3 :
            	    // Objcm.g:1143:20: ~ ( '\\r' | '\\n' | '\"' )
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
            	    break loop32;
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

    // $ANTLR start "STRING_LITERAL3"
    public final void mSTRING_LITERAL3() throws RecognitionException {
        try {
            int _type = STRING_LITERAL3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1146:2: ( '\\'' ( WS | ESC |~ ( '\\r' | '\\n' | '\\'' ) )* '\\'' )
            // Objcm.g:1146:4: '\\'' ( WS | ESC |~ ( '\\r' | '\\n' | '\\'' ) )* '\\''
            {
            match('\''); 

            // Objcm.g:1146:9: ( WS | ESC |~ ( '\\r' | '\\n' | '\\'' ) )*
            loop33:
            do {
                int alt33=4;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0 >= '\t' && LA33_0 <= '\n')||(LA33_0 >= '\f' && LA33_0 <= '\r')||LA33_0==' ') ) {
                    alt33=1;
                }
                else if ( (LA33_0=='\\') ) {
                    int LA33_3 = input.LA(2);

                    if ( (LA33_3=='\"') ) {
                        alt33=2;
                    }
                    else if ( ((LA33_3 >= '\u0000' && LA33_3 <= '!')||(LA33_3 >= '#' && LA33_3 <= '\uFFFF')) ) {
                        alt33=3;
                    }


                }
                else if ( ((LA33_0 >= '\u0000' && LA33_0 <= '\b')||LA33_0=='\u000B'||(LA33_0 >= '\u000E' && LA33_0 <= '\u001F')||(LA33_0 >= '!' && LA33_0 <= '&')||(LA33_0 >= '(' && LA33_0 <= '[')||(LA33_0 >= ']' && LA33_0 <= '\uFFFF')) ) {
                    alt33=3;
                }


                switch (alt33) {
            	case 1 :
            	    // Objcm.g:1146:10: WS
            	    {
            	    mWS(); 


            	    }
            	    break;
            	case 2 :
            	    // Objcm.g:1146:15: ESC
            	    {
            	    mESC(); 


            	    }
            	    break;
            	case 3 :
            	    // Objcm.g:1146:21: ~ ( '\\r' | '\\n' | '\\'' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
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
            	    break loop33;
                }
            } while (true);


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_LITERAL3"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1148:16: ( ( '`' )? '@' STRING_LITERAL2 )
            // Objcm.g:1148:18: ( '`' )? '@' STRING_LITERAL2
            {
            // Objcm.g:1148:18: ( '`' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0=='`') ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // Objcm.g:1148:18: '`'
                    {
                    match('`'); 

                    }
                    break;

            }


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

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // Objcm.g:1150:17: ( '0' .. '9' )
            // Objcm.g:
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
            // Objcm.g:1151:17: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
            // Objcm.g:
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

    // $ANTLR start "ESC"
    public final void mESC() throws RecognitionException {
        try {
            // Objcm.g:1153:2: ( '\\\\' '\"' )
            // Objcm.g:1153:4: '\\\\' '\"'
            {
            match('\\'); 

            match('\"'); 

             setText("\\\""); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC"

    public void mTokens() throws RecognitionException {
        // Objcm.g:1:8: ( T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | L_FBR | R_FBR | L_BR | R_BR | L_KBR | R_KBR | SEMICOLON | COLON | L_UBR | R_UBR | DOT | COMMA | L_EQ | ASTERISK | L_PLUS_PLUS | L_MINUS_MINUS | CONST_PREFIX | ENUM_PREFIX | STRUCT_PREFIX | STATIC_PREFIX | SINGLE_COMMENT | MULTI_COMMENT | PREPROCESSOR_DECLARATION | NUMBER | WS | SINGLE_OP | BREAK_WORD | VOID | ID | STRING_LITERAL2 | STRING_LITERAL3 | STRING_LITERAL )
        int alt35=96;
        alt35 = dfa35.predict(input);
        switch (alt35) {
            case 1 :
                // Objcm.g:1:10: T__102
                {
                mT__102(); 


                }
                break;
            case 2 :
                // Objcm.g:1:17: T__103
                {
                mT__103(); 


                }
                break;
            case 3 :
                // Objcm.g:1:24: T__104
                {
                mT__104(); 


                }
                break;
            case 4 :
                // Objcm.g:1:31: T__105
                {
                mT__105(); 


                }
                break;
            case 5 :
                // Objcm.g:1:38: T__106
                {
                mT__106(); 


                }
                break;
            case 6 :
                // Objcm.g:1:45: T__107
                {
                mT__107(); 


                }
                break;
            case 7 :
                // Objcm.g:1:52: T__108
                {
                mT__108(); 


                }
                break;
            case 8 :
                // Objcm.g:1:59: T__109
                {
                mT__109(); 


                }
                break;
            case 9 :
                // Objcm.g:1:66: T__110
                {
                mT__110(); 


                }
                break;
            case 10 :
                // Objcm.g:1:73: T__111
                {
                mT__111(); 


                }
                break;
            case 11 :
                // Objcm.g:1:80: T__112
                {
                mT__112(); 


                }
                break;
            case 12 :
                // Objcm.g:1:87: T__113
                {
                mT__113(); 


                }
                break;
            case 13 :
                // Objcm.g:1:94: T__114
                {
                mT__114(); 


                }
                break;
            case 14 :
                // Objcm.g:1:101: T__115
                {
                mT__115(); 


                }
                break;
            case 15 :
                // Objcm.g:1:108: T__116
                {
                mT__116(); 


                }
                break;
            case 16 :
                // Objcm.g:1:115: T__117
                {
                mT__117(); 


                }
                break;
            case 17 :
                // Objcm.g:1:122: T__118
                {
                mT__118(); 


                }
                break;
            case 18 :
                // Objcm.g:1:129: T__119
                {
                mT__119(); 


                }
                break;
            case 19 :
                // Objcm.g:1:136: T__120
                {
                mT__120(); 


                }
                break;
            case 20 :
                // Objcm.g:1:143: T__121
                {
                mT__121(); 


                }
                break;
            case 21 :
                // Objcm.g:1:150: T__122
                {
                mT__122(); 


                }
                break;
            case 22 :
                // Objcm.g:1:157: T__123
                {
                mT__123(); 


                }
                break;
            case 23 :
                // Objcm.g:1:164: T__124
                {
                mT__124(); 


                }
                break;
            case 24 :
                // Objcm.g:1:171: T__125
                {
                mT__125(); 


                }
                break;
            case 25 :
                // Objcm.g:1:178: T__126
                {
                mT__126(); 


                }
                break;
            case 26 :
                // Objcm.g:1:185: T__127
                {
                mT__127(); 


                }
                break;
            case 27 :
                // Objcm.g:1:192: T__128
                {
                mT__128(); 


                }
                break;
            case 28 :
                // Objcm.g:1:199: T__129
                {
                mT__129(); 


                }
                break;
            case 29 :
                // Objcm.g:1:206: T__130
                {
                mT__130(); 


                }
                break;
            case 30 :
                // Objcm.g:1:213: T__131
                {
                mT__131(); 


                }
                break;
            case 31 :
                // Objcm.g:1:220: T__132
                {
                mT__132(); 


                }
                break;
            case 32 :
                // Objcm.g:1:227: T__133
                {
                mT__133(); 


                }
                break;
            case 33 :
                // Objcm.g:1:234: T__134
                {
                mT__134(); 


                }
                break;
            case 34 :
                // Objcm.g:1:241: T__135
                {
                mT__135(); 


                }
                break;
            case 35 :
                // Objcm.g:1:248: T__136
                {
                mT__136(); 


                }
                break;
            case 36 :
                // Objcm.g:1:255: T__137
                {
                mT__137(); 


                }
                break;
            case 37 :
                // Objcm.g:1:262: T__138
                {
                mT__138(); 


                }
                break;
            case 38 :
                // Objcm.g:1:269: T__139
                {
                mT__139(); 


                }
                break;
            case 39 :
                // Objcm.g:1:276: T__140
                {
                mT__140(); 


                }
                break;
            case 40 :
                // Objcm.g:1:283: T__141
                {
                mT__141(); 


                }
                break;
            case 41 :
                // Objcm.g:1:290: T__142
                {
                mT__142(); 


                }
                break;
            case 42 :
                // Objcm.g:1:297: T__143
                {
                mT__143(); 


                }
                break;
            case 43 :
                // Objcm.g:1:304: T__144
                {
                mT__144(); 


                }
                break;
            case 44 :
                // Objcm.g:1:311: T__145
                {
                mT__145(); 


                }
                break;
            case 45 :
                // Objcm.g:1:318: T__146
                {
                mT__146(); 


                }
                break;
            case 46 :
                // Objcm.g:1:325: T__147
                {
                mT__147(); 


                }
                break;
            case 47 :
                // Objcm.g:1:332: T__148
                {
                mT__148(); 


                }
                break;
            case 48 :
                // Objcm.g:1:339: T__149
                {
                mT__149(); 


                }
                break;
            case 49 :
                // Objcm.g:1:346: T__150
                {
                mT__150(); 


                }
                break;
            case 50 :
                // Objcm.g:1:353: T__151
                {
                mT__151(); 


                }
                break;
            case 51 :
                // Objcm.g:1:360: T__152
                {
                mT__152(); 


                }
                break;
            case 52 :
                // Objcm.g:1:367: T__153
                {
                mT__153(); 


                }
                break;
            case 53 :
                // Objcm.g:1:374: T__154
                {
                mT__154(); 


                }
                break;
            case 54 :
                // Objcm.g:1:381: T__155
                {
                mT__155(); 


                }
                break;
            case 55 :
                // Objcm.g:1:388: T__156
                {
                mT__156(); 


                }
                break;
            case 56 :
                // Objcm.g:1:395: T__157
                {
                mT__157(); 


                }
                break;
            case 57 :
                // Objcm.g:1:402: T__158
                {
                mT__158(); 


                }
                break;
            case 58 :
                // Objcm.g:1:409: T__159
                {
                mT__159(); 


                }
                break;
            case 59 :
                // Objcm.g:1:416: T__160
                {
                mT__160(); 


                }
                break;
            case 60 :
                // Objcm.g:1:423: T__161
                {
                mT__161(); 


                }
                break;
            case 61 :
                // Objcm.g:1:430: T__162
                {
                mT__162(); 


                }
                break;
            case 62 :
                // Objcm.g:1:437: T__163
                {
                mT__163(); 


                }
                break;
            case 63 :
                // Objcm.g:1:444: T__164
                {
                mT__164(); 


                }
                break;
            case 64 :
                // Objcm.g:1:451: T__165
                {
                mT__165(); 


                }
                break;
            case 65 :
                // Objcm.g:1:458: L_FBR
                {
                mL_FBR(); 


                }
                break;
            case 66 :
                // Objcm.g:1:464: R_FBR
                {
                mR_FBR(); 


                }
                break;
            case 67 :
                // Objcm.g:1:470: L_BR
                {
                mL_BR(); 


                }
                break;
            case 68 :
                // Objcm.g:1:475: R_BR
                {
                mR_BR(); 


                }
                break;
            case 69 :
                // Objcm.g:1:480: L_KBR
                {
                mL_KBR(); 


                }
                break;
            case 70 :
                // Objcm.g:1:486: R_KBR
                {
                mR_KBR(); 


                }
                break;
            case 71 :
                // Objcm.g:1:492: SEMICOLON
                {
                mSEMICOLON(); 


                }
                break;
            case 72 :
                // Objcm.g:1:502: COLON
                {
                mCOLON(); 


                }
                break;
            case 73 :
                // Objcm.g:1:508: L_UBR
                {
                mL_UBR(); 


                }
                break;
            case 74 :
                // Objcm.g:1:514: R_UBR
                {
                mR_UBR(); 


                }
                break;
            case 75 :
                // Objcm.g:1:520: DOT
                {
                mDOT(); 


                }
                break;
            case 76 :
                // Objcm.g:1:524: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 77 :
                // Objcm.g:1:530: L_EQ
                {
                mL_EQ(); 


                }
                break;
            case 78 :
                // Objcm.g:1:535: ASTERISK
                {
                mASTERISK(); 


                }
                break;
            case 79 :
                // Objcm.g:1:544: L_PLUS_PLUS
                {
                mL_PLUS_PLUS(); 


                }
                break;
            case 80 :
                // Objcm.g:1:556: L_MINUS_MINUS
                {
                mL_MINUS_MINUS(); 


                }
                break;
            case 81 :
                // Objcm.g:1:570: CONST_PREFIX
                {
                mCONST_PREFIX(); 


                }
                break;
            case 82 :
                // Objcm.g:1:583: ENUM_PREFIX
                {
                mENUM_PREFIX(); 


                }
                break;
            case 83 :
                // Objcm.g:1:595: STRUCT_PREFIX
                {
                mSTRUCT_PREFIX(); 


                }
                break;
            case 84 :
                // Objcm.g:1:609: STATIC_PREFIX
                {
                mSTATIC_PREFIX(); 


                }
                break;
            case 85 :
                // Objcm.g:1:623: SINGLE_COMMENT
                {
                mSINGLE_COMMENT(); 


                }
                break;
            case 86 :
                // Objcm.g:1:638: MULTI_COMMENT
                {
                mMULTI_COMMENT(); 


                }
                break;
            case 87 :
                // Objcm.g:1:652: PREPROCESSOR_DECLARATION
                {
                mPREPROCESSOR_DECLARATION(); 


                }
                break;
            case 88 :
                // Objcm.g:1:677: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 89 :
                // Objcm.g:1:684: WS
                {
                mWS(); 


                }
                break;
            case 90 :
                // Objcm.g:1:687: SINGLE_OP
                {
                mSINGLE_OP(); 


                }
                break;
            case 91 :
                // Objcm.g:1:697: BREAK_WORD
                {
                mBREAK_WORD(); 


                }
                break;
            case 92 :
                // Objcm.g:1:708: VOID
                {
                mVOID(); 


                }
                break;
            case 93 :
                // Objcm.g:1:713: ID
                {
                mID(); 


                }
                break;
            case 94 :
                // Objcm.g:1:716: STRING_LITERAL2
                {
                mSTRING_LITERAL2(); 


                }
                break;
            case 95 :
                // Objcm.g:1:732: STRING_LITERAL3
                {
                mSTRING_LITERAL3(); 


                }
                break;
            case 96 :
                // Objcm.g:1:748: STRING_LITERAL
                {
                mSTRING_LITERAL(); 


                }
                break;

        }

    }


    protected DFA29 dfa29 = new DFA29(this);
    protected DFA35 dfa35 = new DFA35(this);
    static final String DFA29_eotS =
        "\1\4\1\5\1\uffff\1\5\2\uffff\1\10\2\uffff\2\10";
    static final String DFA29_eofS =
        "\13\uffff";
    static final String DFA29_minS =
        "\2\56\1\uffff\1\56\2\uffff\1\60\2\uffff\2\60";
    static final String DFA29_maxS =
        "\1\71\1\170\1\uffff\1\145\2\uffff\1\71\2\uffff\2\145";
    static final String DFA29_acceptS =
        "\2\uffff\1\3\1\uffff\1\4\1\1\1\uffff\1\5\1\2\2\uffff";
    static final String DFA29_specialS =
        "\13\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\2\1\uffff\1\1\11\3",
            "\1\6\1\uffff\12\3\53\uffff\1\7\22\uffff\1\4",
            "",
            "\1\6\1\uffff\12\3\53\uffff\1\7",
            "",
            "",
            "\12\11",
            "",
            "",
            "\12\12\53\uffff\1\7",
            "\12\12\53\uffff\1\7"
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "1120:1: NUMBER : ( ( DIGIT )+ ( 'u' | 'U' )? | ( DIGIT )+ DOT ( DIGIT )* ( 'f' | 'F' )? | ( DIGIT )* DOT ( DIGIT )+ ( 'f' | 'F' )? | ( '0x' ( DIGIT | 'A' .. 'F' )* ( DOT ( DIGIT )+ )? )? | ( DIGIT )+ ( DOT ( DIGIT )+ )? 'e' ( '-' | '+' )? ( DIGIT )+ );";
        }
    }
    static final String DFA35_eotS =
        "\1\51\1\61\1\uffff\1\65\1\70\1\72\1\75\1\101\1\103\1\107\1\112\1"+
        "\114\1\117\2\uffff\1\55\1\131\14\55\1\157\15\uffff\2\55\33\uffff"+
        "\1\164\5\uffff\1\166\10\uffff\1\55\2\uffff\4\55\1\u0086\4\55\1\u008b"+
        "\1\u008d\10\55\3\uffff\2\55\16\uffff\1\u009d\5\55\1\uffff\3\55\1"+
        "\u00a7\1\uffff\1\55\1\uffff\1\u00a9\13\55\4\uffff\2\55\1\u00b7\3"+
        "\55\1\u00bb\1\55\1\u00bd\1\uffff\1\55\1\uffff\12\55\1\u00c9\2\55"+
        "\1\uffff\1\u00cd\2\55\1\uffff\1\55\1\uffff\7\55\1\u00d8\1\55\1\u00da"+
        "\1\u00db\1\uffff\3\55\1\uffff\2\55\1\u00e1\1\u00e2\1\u00e3\1\u00e4"+
        "\1\u00e5\1\u00e6\1\u00e7\1\55\1\uffff\1\55\2\uffff\4\55\1\u00ee"+
        "\7\uffff\1\u00ef\5\55\2\uffff\1\u00f5\3\55\2\uffff\1\55\1\u00fa"+
        "\2\55\1\uffff\1\u00fd\1\55\1\uffff\1\u00ff\1\uffff";
    static final String DFA35_eofS =
        "\u0100\uffff";
    static final String DFA35_minS =
        "\1\11\1\75\1\0\1\75\1\46\1\75\1\53\1\55\1\56\1\52\1\74\2\75\1\uffff"+
        "\1\42\1\151\1\75\1\137\1\141\1\145\1\154\1\157\1\146\1\151\1\145"+
        "\1\151\1\171\1\156\1\150\1\75\15\uffff\1\162\1\157\5\uffff\1\0\25"+
        "\uffff\1\75\5\uffff\1\75\2\uffff\1\156\1\uffff\1\155\1\162\1\145"+
        "\1\150\1\154\2\uffff\1\141\1\163\1\156\1\146\1\60\1\163\1\164\1"+
        "\165\1\162\2\60\1\154\1\164\1\172\1\151\1\141\1\160\2\151\3\uffff"+
        "\1\145\1\151\5\uffff\1\143\10\uffff\1\60\1\164\1\171\1\145\1\163"+
        "\1\141\1\uffff\2\145\1\155\1\60\1\uffff\1\151\1\uffff\1\60\1\165"+
        "\1\145\1\164\1\165\1\164\1\145\1\157\1\151\1\154\1\141\1\144\4\uffff"+
        "\1\164\1\160\1\60\1\164\1\151\1\165\1\60\1\162\1\60\1\uffff\1\156"+
        "\1\uffff\1\162\1\157\2\143\1\151\1\144\1\156\1\147\1\145\1\153\1"+
        "\60\1\162\1\145\1\uffff\1\60\1\156\1\154\1\uffff\1\156\1\uffff\1"+
        "\145\1\156\1\146\1\150\1\164\1\143\1\145\1\60\1\156\2\60\1\uffff"+
        "\1\151\1\157\1\165\1\uffff\1\165\1\164\7\60\1\146\1\uffff\1\145"+
        "\2\uffff\1\142\1\146\1\143\1\145\1\60\7\uffff\1\60\1\144\1\165\1"+
        "\137\1\164\1\73\2\uffff\1\60\1\164\1\137\1\157\2\uffff\1\145\1\60"+
        "\1\162\1\137\1\uffff\1\60\1\137\1\uffff\1\60\1\uffff";
    static final String DFA35_maxS =
        "\1\176\1\75\1\uffff\4\75\1\76\1\71\3\75\1\76\1\uffff\1\164\1\151"+
        "\1\75\1\137\2\157\1\170\1\157\1\156\1\151\1\145\1\167\1\171\1\156"+
        "\1\150\1\174\15\uffff\1\162\1\157\5\uffff\1\uffff\25\uffff\1\75"+
        "\5\uffff\1\75\2\uffff\1\156\1\uffff\1\156\1\165\1\171\1\162\1\154"+
        "\2\uffff\1\164\1\163\1\156\1\146\1\172\1\163\1\164\1\165\1\162\2"+
        "\172\1\154\1\164\1\172\1\151\1\162\1\160\1\163\1\151\3\uffff\1\145"+
        "\1\151\5\uffff\1\144\10\uffff\1\172\1\164\1\171\1\145\1\164\1\141"+
        "\1\uffff\2\145\1\155\1\172\1\uffff\1\151\1\uffff\1\172\1\165\1\145"+
        "\1\164\1\165\1\164\1\145\1\157\1\151\1\154\1\141\1\144\4\uffff\1"+
        "\164\1\160\1\172\1\164\1\151\1\165\1\172\1\162\1\172\1\uffff\1\156"+
        "\1\uffff\1\162\1\157\2\143\1\151\1\144\1\156\1\147\1\145\1\153\1"+
        "\172\1\162\1\145\1\uffff\1\172\1\156\1\154\1\uffff\1\156\1\uffff"+
        "\1\145\1\156\1\146\1\150\1\164\1\143\1\145\1\172\1\156\2\172\1\uffff"+
        "\1\151\1\157\1\165\1\uffff\1\165\1\164\7\172\1\146\1\uffff\1\145"+
        "\2\uffff\1\142\1\146\1\143\1\145\1\172\7\uffff\1\172\1\144\1\165"+
        "\1\137\1\164\1\73\2\uffff\1\172\1\164\1\137\1\157\2\uffff\1\145"+
        "\1\172\1\162\1\137\1\uffff\1\172\1\137\1\uffff\1\172\1\uffff";
    static final String DFA35_acceptS =
        "\15\uffff\1\31\20\uffff\1\100\1\101\1\102\1\103\1\104\1\105\1\106"+
        "\1\107\1\110\1\114\1\127\1\130\1\131\2\uffff\1\135\1\137\1\140\1"+
        "\2\1\1\1\uffff\1\136\1\5\1\4\1\6\1\10\1\7\1\11\1\116\1\13\1\117"+
        "\1\12\1\15\1\16\1\120\1\14\1\17\1\113\1\21\1\125\1\126\1\20\1\uffff"+
        "\1\24\1\111\1\25\1\115\1\26\1\uffff\1\112\1\32\1\uffff\1\35\5\uffff"+
        "\1\50\1\47\23\uffff\1\76\1\77\1\75\2\uffff\1\3\1\23\1\22\1\30\1"+
        "\27\1\uffff\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\6\uffff\1\56"+
        "\4\uffff\1\62\1\uffff\1\63\14\uffff\1\3\1\33\1\34\1\46\11\uffff"+
        "\1\61\1\uffff\1\65\15\uffff\1\53\3\uffff\1\57\1\uffff\1\122\13\uffff"+
        "\1\134\3\uffff\1\121\12\uffff\1\72\1\uffff\1\74\1\133\5\uffff\1"+
        "\60\1\64\1\66\1\67\1\70\1\123\1\124\6\uffff\1\55\1\71\4\uffff\1"+
        "\132\1\73\4\uffff\1\52\2\uffff\1\54\1\uffff\1\51";
    static final String DFA35_specialS =
        "\2\uffff\1\1\57\uffff\1\0\u00cd\uffff}>";
    static final String[] DFA35_transitionS = {
            "\2\52\1\uffff\2\52\22\uffff\1\52\1\1\1\2\1\50\1\uffff\1\3\1"+
            "\4\1\56\1\41\1\42\1\5\1\6\1\47\1\7\1\10\1\11\12\uffff\1\46\1"+
            "\45\1\12\1\13\1\14\1\15\1\16\15\55\1\17\14\55\1\43\1\uffff\1"+
            "\44\1\20\1\21\1\57\1\55\1\53\1\22\1\23\1\24\1\25\2\55\1\26\4"+
            "\55\1\27\3\55\1\30\1\31\1\32\1\33\1\54\1\34\3\55\1\37\1\35\1"+
            "\40\1\36",
            "\1\60",
            "\103\63\1\62\uffbc\63",
            "\1\64",
            "\1\66\26\uffff\1\67",
            "\1\71",
            "\1\74\21\uffff\1\73",
            "\1\100\17\uffff\1\76\1\77",
            "\1\102\1\uffff\12\51",
            "\1\106\4\uffff\1\105\15\uffff\1\104",
            "\1\110\1\111",
            "\1\113",
            "\1\115\1\116",
            "",
            "\1\57\100\uffff\1\120\1\uffff\1\121\1\122\2\uffff\1\123\6\uffff"+
            "\1\124\2\uffff\1\125\1\126",
            "\1\127",
            "\1\130",
            "\1\132",
            "\1\133\15\uffff\1\134",
            "\1\135\11\uffff\1\136",
            "\1\137\1\uffff\1\141\11\uffff\1\140",
            "\1\142",
            "\1\143\7\uffff\1\144",
            "\1\145",
            "\1\146",
            "\1\147\12\uffff\1\151\2\uffff\1\150",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155\76\uffff\1\156",
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
            "\1\160",
            "\1\161",
            "",
            "",
            "",
            "",
            "",
            "\42\63\1\162\uffdd\63",
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
            "",
            "",
            "",
            "",
            "\1\163",
            "",
            "",
            "",
            "",
            "",
            "\1\165",
            "",
            "",
            "\1\167",
            "",
            "\1\170\1\171",
            "\1\172\2\uffff\1\173",
            "\1\174\23\uffff\1\175",
            "\1\176\11\uffff\1\177",
            "\1\u0080",
            "",
            "",
            "\1\u0081\22\uffff\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\13\55\1\u008c\16"+
            "\55",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0093\20\uffff\1\u0092",
            "\1\u0094",
            "\1\u0095\11\uffff\1\u0096",
            "\1\u0097",
            "",
            "",
            "",
            "\1\u0098",
            "\1\u0099",
            "",
            "",
            "",
            "",
            "",
            "\1\u009b\1\u009c",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1\1\u00a2",
            "\1\u00a3",
            "",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u00a8",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "",
            "",
            "",
            "",
            "\1\u00b5",
            "\1\u00b6",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00bc",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u00be",
            "",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00ca",
            "\1\u00cb",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\21\55\1\u00cc\10"+
            "\55",
            "\1\u00ce",
            "\1\u00cf",
            "",
            "\1\u00d0",
            "",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00d9",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "",
            "\1\u00df",
            "\1\u00e0",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00e8",
            "",
            "\1\u00e9",
            "",
            "",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "",
            "",
            "\1\u00f9",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00fb",
            "\1\u00fc",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00fe",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | L_FBR | R_FBR | L_BR | R_BR | L_KBR | R_KBR | SEMICOLON | COLON | L_UBR | R_UBR | DOT | COMMA | L_EQ | ASTERISK | L_PLUS_PLUS | L_MINUS_MINUS | CONST_PREFIX | ENUM_PREFIX | STRUCT_PREFIX | STATIC_PREFIX | SINGLE_COMMENT | MULTI_COMMENT | PREPROCESSOR_DECLARATION | NUMBER | WS | SINGLE_OP | BREAK_WORD | VOID | ID | STRING_LITERAL2 | STRING_LITERAL3 | STRING_LITERAL );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_50 = input.LA(1);

                        s = -1;
                        if ( (LA35_50=='\"') ) {s = 114;}

                        else if ( ((LA35_50 >= '\u0000' && LA35_50 <= '!')||(LA35_50 >= '#' && LA35_50 <= '\uFFFF')) ) {s = 51;}

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA35_2 = input.LA(1);

                        s = -1;
                        if ( (LA35_2=='C') ) {s = 50;}

                        else if ( ((LA35_2 >= '\u0000' && LA35_2 <= 'B')||(LA35_2 >= 'D' && LA35_2 <= '\uFFFF')) ) {s = 51;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 35, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}