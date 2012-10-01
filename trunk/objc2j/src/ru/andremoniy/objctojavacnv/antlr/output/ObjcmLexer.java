// $ANTLR 3.4 Objcm.g 2012-10-01 20:33:51

package ru.andremoniy.objctojavacnv.antlr.output;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ObjcmLexer extends Lexer {
    public static final int EOF=-1;
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
    public static final int T__166=166;
    public static final int T__167=167;
    public static final int T__168=168;
    public static final int T__169=169;
    public static final int T__170=170;
    public static final int T__171=171;
    public static final int T__172=172;
    public static final int T__173=173;
    public static final int T__174=174;
    public static final int T__175=175;
    public static final int T__176=176;
    public static final int T__177=177;
    public static final int T__178=178;
    public static final int T__179=179;
    public static final int T__180=180;
    public static final int T__181=181;
    public static final int T__182=182;
    public static final int T__183=183;
    public static final int T__184=184;
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
    public static final int CLASSICAL_EXPR_2=14;
    public static final int COLON=15;
    public static final int COMMA=16;
    public static final int CONST_PREFIX=17;
    public static final int DEFAULT_BODY=18;
    public static final int DEFAULT_STMT=19;
    public static final int DIGIT=20;
    public static final int DOT=21;
    public static final int ENCODE=22;
    public static final int ENUM=23;
    public static final int ENUM_PREFIX=24;
    public static final int ESC=25;
    public static final int EXPR=26;
    public static final int EXPR_ADD=27;
    public static final int EXPR_AND=28;
    public static final int EXPR_AND_AND=29;
    public static final int EXPR_ASSIGN=30;
    public static final int EXPR_COND=31;
    public static final int EXPR_EQ=32;
    public static final int EXPR_FULL=33;
    public static final int EXPR_MOV=34;
    public static final int EXPR_MULT=35;
    public static final int EXPR_NOT=36;
    public static final int EXPR_OR=37;
    public static final int EXPR_OR_OR=38;
    public static final int EXPR_QUESTION=39;
    public static final int EXPR_TYPE=40;
    public static final int EXPR_XOR=41;
    public static final int EXTERN=42;
    public static final int FIELD=43;
    public static final int FIELD_ACCESS=44;
    public static final int FIELD_TYPE_STARTED=45;
    public static final int FOR_IN_STMT=46;
    public static final int FUNCTION=47;
    public static final int GENERIC=48;
    public static final int ID=49;
    public static final int IF_BLOCK=50;
    public static final int IF_EXPR=51;
    public static final int IF_STMT=52;
    public static final int IMPLEMENTATION=53;
    public static final int INCOMPLETE_PREFIX=54;
    public static final int INTERFACE=55;
    public static final int LETTER=56;
    public static final int L_AND=57;
    public static final int L_AND_AND=58;
    public static final int L_AND_EQ=59;
    public static final int L_BR=60;
    public static final int L_DIV=61;
    public static final int L_DIV_EQ=62;
    public static final int L_EQ=63;
    public static final int L_EQ_EQ=64;
    public static final int L_FBR=65;
    public static final int L_KBR=66;
    public static final int L_LEFT=67;
    public static final int L_LEFT_EQ=68;
    public static final int L_LESS=69;
    public static final int L_LESS_EQ=70;
    public static final int L_MINUS=71;
    public static final int L_MINUS_EQ=72;
    public static final int L_MINUS_MINUS=73;
    public static final int L_MORE=74;
    public static final int L_MORE_EQ=75;
    public static final int L_MULT_EQ=76;
    public static final int L_NEQ=77;
    public static final int L_NOT=78;
    public static final int L_OR=79;
    public static final int L_OR_EQ=80;
    public static final int L_OR_OR=81;
    public static final int L_PERC=82;
    public static final int L_PERC_EQ=83;
    public static final int L_PLUS=84;
    public static final int L_PLUS_EQ=85;
    public static final int L_PLUS_PLUS=86;
    public static final int L_QUESTION=87;
    public static final int L_RIGHT=88;
    public static final int L_RIGHT_EQ=89;
    public static final int L_TILDA=90;
    public static final int L_XOR=91;
    public static final int L_XOR_EQ=92;
    public static final int MESSAGE=93;
    public static final int METHOD=94;
    public static final int METHOD_CALL=95;
    public static final int METHOD_MSG=96;
    public static final int METHOD_NAME=97;
    public static final int MODIFIER=98;
    public static final int MSG_LIST=99;
    public static final int MULTI_COMMENT=100;
    public static final int M_IMPORT=101;
    public static final int M_TYPE_START=102;
    public static final int NAME=103;
    public static final int NOT=104;
    public static final int NUMBER=105;
    public static final int OBJECT=106;
    public static final int OP=107;
    public static final int OPER=108;
    public static final int OPERATOR=109;
    public static final int PARAM=110;
    public static final int PREFIX=111;
    public static final int PREPROCESSOR_DECLARATION=112;
    public static final int RETURN_STMT=113;
    public static final int R_BR=114;
    public static final int R_FBR=115;
    public static final int R_KBR=116;
    public static final int SELECTOR=117;
    public static final int SELECTOR_VALUE=118;
    public static final int SEMICOLON=119;
    public static final int SIMPLE_EXPR=120;
    public static final int SINGLE_COMMENT=121;
    public static final int SINGLE_OP=122;
    public static final int SIZEOF=123;
    public static final int STATIC=124;
    public static final int STATIC_METHOD=125;
    public static final int STATIC_PREFIX=126;
    public static final int STATIC_START=127;
    public static final int STRING_LITERAL=128;
    public static final int STRING_LITERAL2=129;
    public static final int STRING_LITERAL3=130;
    public static final int STRUCT_FIELD=131;
    public static final int STRUCT_PREFIX=132;
    public static final int SUPER_CLASS=133;
    public static final int SWITCH=134;
    public static final int SWITCH_BODY=135;
    public static final int SWITCH_EXPRESSION=136;
    public static final int TYPE=137;
    public static final int TYPEDEF=138;
    public static final int TYPEDEF_ELEMENT=139;
    public static final int TYPEDEF_STRUCT=140;
    public static final int TYPE_CONVERTION=141;
    public static final int TYPE_CONVERTION_MAY_BE=142;
    public static final int TYPE_CONVERTION_TRUE=143;
    public static final int VALUE=144;
    public static final int VA_ARGS=145;
    public static final int VOID=146;
    public static final int WHILE_EXPR=147;
    public static final int WHILE_STMT=148;
    public static final int WS=149;

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

    // $ANTLR start "T__150"
    public final void mT__150() throws RecognitionException {
        try {
            int _type = T__150;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:6:8: ( '\"C\"' )
            // Objcm.g:6:10: '\"C\"'
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
    // $ANTLR end "T__150"

    // $ANTLR start "T__151"
    public final void mT__151() throws RecognitionException {
        try {
            int _type = T__151;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:7:8: ( '->' )
            // Objcm.g:7:10: '->'
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
    // $ANTLR end "T__151"

    // $ANTLR start "T__152"
    public final void mT__152() throws RecognitionException {
        try {
            int _type = T__152;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:8:8: ( '...' )
            // Objcm.g:8:10: '...'
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
    // $ANTLR end "T__152"

    // $ANTLR start "T__153"
    public final void mT__153() throws RecognitionException {
        try {
            int _type = T__153;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:9:8: ( '@catch' )
            // Objcm.g:9:10: '@catch'
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
    // $ANTLR end "T__153"

    // $ANTLR start "T__154"
    public final void mT__154() throws RecognitionException {
        try {
            int _type = T__154;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:10:8: ( '@encode' )
            // Objcm.g:10:10: '@encode'
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
    // $ANTLR end "T__154"

    // $ANTLR start "T__155"
    public final void mT__155() throws RecognitionException {
        try {
            int _type = T__155;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:11:8: ( '@end' )
            // Objcm.g:11:10: '@end'
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
    // $ANTLR end "T__155"

    // $ANTLR start "T__156"
    public final void mT__156() throws RecognitionException {
        try {
            int _type = T__156;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:12:8: ( '@finally' )
            // Objcm.g:12:10: '@finally'
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
    // $ANTLR end "T__156"

    // $ANTLR start "T__157"
    public final void mT__157() throws RecognitionException {
        try {
            int _type = T__157;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:13:8: ( '@implementation' )
            // Objcm.g:13:10: '@implementation'
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
    // $ANTLR end "T__157"

    // $ANTLR start "T__158"
    public final void mT__158() throws RecognitionException {
        try {
            int _type = T__158;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:14:8: ( '@interface' )
            // Objcm.g:14:10: '@interface'
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
    // $ANTLR end "T__158"

    // $ANTLR start "T__159"
    public final void mT__159() throws RecognitionException {
        try {
            int _type = T__159;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:15:8: ( '@private' )
            // Objcm.g:15:10: '@private'
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
    // $ANTLR end "T__159"

    // $ANTLR start "T__160"
    public final void mT__160() throws RecognitionException {
        try {
            int _type = T__160;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:16:8: ( '@public' )
            // Objcm.g:16:10: '@public'
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
    // $ANTLR end "T__160"

    // $ANTLR start "T__161"
    public final void mT__161() throws RecognitionException {
        try {
            int _type = T__161;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:17:8: ( '@selector' )
            // Objcm.g:17:10: '@selector'
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
    // $ANTLR end "T__161"

    // $ANTLR start "T__162"
    public final void mT__162() throws RecognitionException {
        try {
            int _type = T__162;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:18:8: ( '@synthesize' )
            // Objcm.g:18:10: '@synthesize'
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
    // $ANTLR end "T__162"

    // $ANTLR start "T__163"
    public final void mT__163() throws RecognitionException {
        try {
            int _type = T__163;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:19:8: ( '@throw' )
            // Objcm.g:19:10: '@throw'
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
    // $ANTLR end "T__163"

    // $ANTLR start "T__164"
    public final void mT__164() throws RecognitionException {
        try {
            int _type = T__164;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:20:8: ( '@try' )
            // Objcm.g:20:10: '@try'
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
    // $ANTLR end "T__164"

    // $ANTLR start "T__165"
    public final void mT__165() throws RecognitionException {
        try {
            int _type = T__165;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:21:8: ( 'Nil' )
            // Objcm.g:21:10: 'Nil'
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
    // $ANTLR end "T__165"

    // $ANTLR start "T__166"
    public final void mT__166() throws RecognitionException {
        try {
            int _type = T__166;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:22:8: ( '__attribute__' )
            // Objcm.g:22:10: '__attribute__'
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
    // $ANTLR end "T__166"

    // $ANTLR start "T__167"
    public final void mT__167() throws RecognitionException {
        try {
            int _type = T__167;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:23:8: ( '__typeof__' )
            // Objcm.g:23:10: '__typeof__'
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
    // $ANTLR end "T__167"

    // $ANTLR start "T__168"
    public final void mT__168() throws RecognitionException {
        try {
            int _type = T__168;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:24:8: ( 'case' )
            // Objcm.g:24:10: 'case'
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
    // $ANTLR end "T__168"

    // $ANTLR start "T__169"
    public final void mT__169() throws RecognitionException {
        try {
            int _type = T__169;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:25:8: ( 'constructor' )
            // Objcm.g:25:10: 'constructor'
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
    // $ANTLR end "T__169"

    // $ANTLR start "T__170"
    public final void mT__170() throws RecognitionException {
        try {
            int _type = T__170;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:26:8: ( 'default' )
            // Objcm.g:26:10: 'default'
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
    // $ANTLR end "T__170"

    // $ANTLR start "T__171"
    public final void mT__171() throws RecognitionException {
        try {
            int _type = T__171;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:27:8: ( 'do' )
            // Objcm.g:27:10: 'do'
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
    // $ANTLR end "T__171"

    // $ANTLR start "T__172"
    public final void mT__172() throws RecognitionException {
        try {
            int _type = T__172;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:28:8: ( 'else' )
            // Objcm.g:28:10: 'else'
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
    // $ANTLR end "T__172"

    // $ANTLR start "T__173"
    public final void mT__173() throws RecognitionException {
        try {
            int _type = T__173;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:29:8: ( 'extern' )
            // Objcm.g:29:10: 'extern'
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
    // $ANTLR end "T__173"

    // $ANTLR start "T__174"
    public final void mT__174() throws RecognitionException {
        try {
            int _type = T__174;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:30:8: ( 'for' )
            // Objcm.g:30:10: 'for'
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
    // $ANTLR end "T__174"

    // $ANTLR start "T__175"
    public final void mT__175() throws RecognitionException {
        try {
            int _type = T__175;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:31:8: ( 'if' )
            // Objcm.g:31:10: 'if'
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
    // $ANTLR end "T__175"

    // $ANTLR start "T__176"
    public final void mT__176() throws RecognitionException {
        try {
            int _type = T__176;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:32:8: ( 'in' )
            // Objcm.g:32:10: 'in'
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
    // $ANTLR end "T__176"

    // $ANTLR start "T__177"
    public final void mT__177() throws RecognitionException {
        try {
            int _type = T__177;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:33:8: ( 'inline' )
            // Objcm.g:33:10: 'inline'
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
    // $ANTLR end "T__177"

    // $ANTLR start "T__178"
    public final void mT__178() throws RecognitionException {
        try {
            int _type = T__178;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:34:8: ( 'nil' )
            // Objcm.g:34:10: 'nil'
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
    // $ANTLR end "T__178"

    // $ANTLR start "T__179"
    public final void mT__179() throws RecognitionException {
        try {
            int _type = T__179;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:35:8: ( 'return' )
            // Objcm.g:35:10: 'return'
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
    // $ANTLR end "T__179"

    // $ANTLR start "T__180"
    public final void mT__180() throws RecognitionException {
        try {
            int _type = T__180;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:36:8: ( 'switch' )
            // Objcm.g:36:10: 'switch'
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
    // $ANTLR end "T__180"

    // $ANTLR start "T__181"
    public final void mT__181() throws RecognitionException {
        try {
            int _type = T__181;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:37:8: ( 'typedef' )
            // Objcm.g:37:10: 'typedef'
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
    // $ANTLR end "T__181"

    // $ANTLR start "T__182"
    public final void mT__182() throws RecognitionException {
        try {
            int _type = T__182;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:38:8: ( 'union' )
            // Objcm.g:38:10: 'union'
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
    // $ANTLR end "T__182"

    // $ANTLR start "T__183"
    public final void mT__183() throws RecognitionException {
        try {
            int _type = T__183;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:39:8: ( 'unsigned' )
            // Objcm.g:39:10: 'unsigned'
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
    // $ANTLR end "T__183"

    // $ANTLR start "T__184"
    public final void mT__184() throws RecognitionException {
        try {
            int _type = T__184;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:40:8: ( 'while' )
            // Objcm.g:40:10: 'while'
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
    // $ANTLR end "T__184"

    // $ANTLR start "L_FBR"
    public final void mL_FBR() throws RecognitionException {
        try {
            int _type = L_FBR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1065:7: ( '{' )
            // Objcm.g:1065:9: '{'
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
            // Objcm.g:1066:7: ( '}' )
            // Objcm.g:1066:9: '}'
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
            // Objcm.g:1067:7: ( '(' )
            // Objcm.g:1067:9: '('
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
            // Objcm.g:1068:7: ( ')' )
            // Objcm.g:1068:9: ')'
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
            // Objcm.g:1069:7: ( '[' )
            // Objcm.g:1069:9: '['
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
            // Objcm.g:1070:7: ( ']' )
            // Objcm.g:1070:9: ']'
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
            // Objcm.g:1072:2: ( ';' )
            // Objcm.g:1072:4: ';'
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
            // Objcm.g:1073:7: ( ':' )
            // Objcm.g:1073:9: ':'
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

    // $ANTLR start "L_LEFT_EQ"
    public final void mL_LEFT_EQ() throws RecognitionException {
        try {
            int _type = L_LEFT_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1075:11: ( '<<=' )
            // Objcm.g:1075:13: '<<='
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
    // $ANTLR end "L_LEFT_EQ"

    // $ANTLR start "L_RIGHT_EQ"
    public final void mL_RIGHT_EQ() throws RecognitionException {
        try {
            int _type = L_RIGHT_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1076:12: ( '>>=' )
            // Objcm.g:1076:14: '>>='
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
    // $ANTLR end "L_RIGHT_EQ"

    // $ANTLR start "L_LESS_EQ"
    public final void mL_LESS_EQ() throws RecognitionException {
        try {
            int _type = L_LESS_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1079:2: ( '<=' )
            // Objcm.g:1079:4: '<='
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
    // $ANTLR end "L_LESS_EQ"

    // $ANTLR start "L_MORE_EQ"
    public final void mL_MORE_EQ() throws RecognitionException {
        try {
            int _type = L_MORE_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1081:2: ( '>=' )
            // Objcm.g:1081:4: '>='
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
    // $ANTLR end "L_MORE_EQ"

    // $ANTLR start "L_LEFT"
    public final void mL_LEFT() throws RecognitionException {
        try {
            int _type = L_LEFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1083:8: ( '<<' )
            // Objcm.g:1083:10: '<<'
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
    // $ANTLR end "L_LEFT"

    // $ANTLR start "L_RIGHT"
    public final void mL_RIGHT() throws RecognitionException {
        try {
            int _type = L_RIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1084:9: ( '>>' )
            // Objcm.g:1084:11: '>>'
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
    // $ANTLR end "L_RIGHT"

    // $ANTLR start "L_LESS"
    public final void mL_LESS() throws RecognitionException {
        try {
            int _type = L_LESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1085:8: ( '<' )
            // Objcm.g:1085:10: '<'
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
    // $ANTLR end "L_LESS"

    // $ANTLR start "L_MORE"
    public final void mL_MORE() throws RecognitionException {
        try {
            int _type = L_MORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1086:8: ( '>' )
            // Objcm.g:1086:10: '>'
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
    // $ANTLR end "L_MORE"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1087:5: ( '.' )
            // Objcm.g:1087:7: '.'
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
            // Objcm.g:1088:7: ( ',' )
            // Objcm.g:1088:9: ','
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

    // $ANTLR start "L_NEQ"
    public final void mL_NEQ() throws RecognitionException {
        try {
            int _type = L_NEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1089:7: ( '!=' )
            // Objcm.g:1089:9: '!='
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
    // $ANTLR end "L_NEQ"

    // $ANTLR start "L_NOT"
    public final void mL_NOT() throws RecognitionException {
        try {
            int _type = L_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1090:7: ( '!' )
            // Objcm.g:1090:9: '!'
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
    // $ANTLR end "L_NOT"

    // $ANTLR start "L_EQ_EQ"
    public final void mL_EQ_EQ() throws RecognitionException {
        try {
            int _type = L_EQ_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1091:9: ( '==' )
            // Objcm.g:1091:11: '=='
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
    // $ANTLR end "L_EQ_EQ"

    // $ANTLR start "L_PLUS_EQ"
    public final void mL_PLUS_EQ() throws RecognitionException {
        try {
            int _type = L_PLUS_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1093:11: ( '+=' )
            // Objcm.g:1093:13: '+='
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
    // $ANTLR end "L_PLUS_EQ"

    // $ANTLR start "L_MINUS_EQ"
    public final void mL_MINUS_EQ() throws RecognitionException {
        try {
            int _type = L_MINUS_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1094:12: ( '-=' )
            // Objcm.g:1094:14: '-='
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
    // $ANTLR end "L_MINUS_EQ"

    // $ANTLR start "L_MULT_EQ"
    public final void mL_MULT_EQ() throws RecognitionException {
        try {
            int _type = L_MULT_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1095:11: ( '*=' )
            // Objcm.g:1095:13: '*='
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
    // $ANTLR end "L_MULT_EQ"

    // $ANTLR start "L_DIV_EQ"
    public final void mL_DIV_EQ() throws RecognitionException {
        try {
            int _type = L_DIV_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1096:10: ( '/=' )
            // Objcm.g:1096:12: '/='
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
    // $ANTLR end "L_DIV_EQ"

    // $ANTLR start "L_PERC_EQ"
    public final void mL_PERC_EQ() throws RecognitionException {
        try {
            int _type = L_PERC_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1097:11: ( '%=' )
            // Objcm.g:1097:13: '%='
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
    // $ANTLR end "L_PERC_EQ"

    // $ANTLR start "L_AND_EQ"
    public final void mL_AND_EQ() throws RecognitionException {
        try {
            int _type = L_AND_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1098:10: ( '&=' )
            // Objcm.g:1098:12: '&='
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
    // $ANTLR end "L_AND_EQ"

    // $ANTLR start "L_XOR_EQ"
    public final void mL_XOR_EQ() throws RecognitionException {
        try {
            int _type = L_XOR_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1099:10: ( '^=' )
            // Objcm.g:1099:12: '^='
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
    // $ANTLR end "L_XOR_EQ"

    // $ANTLR start "L_OR_EQ"
    public final void mL_OR_EQ() throws RecognitionException {
        try {
            int _type = L_OR_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1100:10: ( '|=' )
            // Objcm.g:1100:12: '|='
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
    // $ANTLR end "L_OR_EQ"

    // $ANTLR start "L_EQ"
    public final void mL_EQ() throws RecognitionException {
        try {
            int _type = L_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1102:7: ( '=' )
            // Objcm.g:1102:9: '='
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
            // Objcm.g:1104:2: ( '*' )
            // Objcm.g:1104:4: '*'
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

    // $ANTLR start "L_DIV"
    public final void mL_DIV() throws RecognitionException {
        try {
            int _type = L_DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1105:7: ( '/' )
            // Objcm.g:1105:9: '/'
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
    // $ANTLR end "L_DIV"

    // $ANTLR start "L_PERC"
    public final void mL_PERC() throws RecognitionException {
        try {
            int _type = L_PERC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1106:8: ( '%' )
            // Objcm.g:1106:10: '%'
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
    // $ANTLR end "L_PERC"

    // $ANTLR start "L_PLUS_PLUS"
    public final void mL_PLUS_PLUS() throws RecognitionException {
        try {
            int _type = L_PLUS_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1108:2: ( '++' )
            // Objcm.g:1108:4: '++'
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
            // Objcm.g:1110:2: ( '--' )
            // Objcm.g:1110:4: '--'
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

    // $ANTLR start "L_PLUS"
    public final void mL_PLUS() throws RecognitionException {
        try {
            int _type = L_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1111:8: ( '+' )
            // Objcm.g:1111:10: '+'
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
    // $ANTLR end "L_PLUS"

    // $ANTLR start "L_MINUS"
    public final void mL_MINUS() throws RecognitionException {
        try {
            int _type = L_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1112:9: ( '-' )
            // Objcm.g:1112:11: '-'
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
    // $ANTLR end "L_MINUS"

    // $ANTLR start "L_OR_OR"
    public final void mL_OR_OR() throws RecognitionException {
        try {
            int _type = L_OR_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1114:9: ( '||' )
            // Objcm.g:1114:11: '||'
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
    // $ANTLR end "L_OR_OR"

    // $ANTLR start "L_AND_AND"
    public final void mL_AND_AND() throws RecognitionException {
        try {
            int _type = L_AND_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1116:2: ( '&&' )
            // Objcm.g:1116:4: '&&'
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
    // $ANTLR end "L_AND_AND"

    // $ANTLR start "L_OR"
    public final void mL_OR() throws RecognitionException {
        try {
            int _type = L_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1117:6: ( '|' )
            // Objcm.g:1117:8: '|'
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
    // $ANTLR end "L_OR"

    // $ANTLR start "L_AND"
    public final void mL_AND() throws RecognitionException {
        try {
            int _type = L_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1118:7: ( '&' )
            // Objcm.g:1118:9: '&'
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
    // $ANTLR end "L_AND"

    // $ANTLR start "L_XOR"
    public final void mL_XOR() throws RecognitionException {
        try {
            int _type = L_XOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1119:7: ( '^' )
            // Objcm.g:1119:9: '^'
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
    // $ANTLR end "L_XOR"

    // $ANTLR start "L_TILDA"
    public final void mL_TILDA() throws RecognitionException {
        try {
            int _type = L_TILDA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1120:9: ( '~' )
            // Objcm.g:1120:11: '~'
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
    // $ANTLR end "L_TILDA"

    // $ANTLR start "SIZEOF"
    public final void mSIZEOF() throws RecognitionException {
        try {
            int _type = SIZEOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1121:8: ( 'sizeof' )
            // Objcm.g:1121:10: 'sizeof'
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
    // $ANTLR end "SIZEOF"

    // $ANTLR start "L_QUESTION"
    public final void mL_QUESTION() throws RecognitionException {
        try {
            int _type = L_QUESTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1123:2: ( '?' )
            // Objcm.g:1123:4: '?'
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
    // $ANTLR end "L_QUESTION"

    // $ANTLR start "CONST_PREFIX"
    public final void mCONST_PREFIX() throws RecognitionException {
        try {
            int _type = CONST_PREFIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Objcm.g:1126:3: ( 'const' )
            // Objcm.g:1126:5: 'const'
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
            // Objcm.g:1129:2: ( 'enum' )
            // Objcm.g:1129:4: 'enum'
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
            // Objcm.g:1132:2: ( 'struct' )
            // Objcm.g:1132:4: 'struct'
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
            // Objcm.g:1135:2: ( 'static' )
            // Objcm.g:1135:4: 'static'
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
            // Objcm.g:1138:2: ( '//' (~ ( '\\r' | '\\n' ) )* ( ( '\\r' )? '\\n' )+ )
            // Objcm.g:1138:4: '//' (~ ( '\\r' | '\\n' ) )* ( ( '\\r' )? '\\n' )+
            {
            match("//"); 



            // Objcm.g:1138:9: (~ ( '\\r' | '\\n' ) )*
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


            // Objcm.g:1138:25: ( ( '\\r' )? '\\n' )+
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
            	    // Objcm.g:1138:26: ( '\\r' )? '\\n'
            	    {
            	    // Objcm.g:1138:26: ( '\\r' )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0=='\r') ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // Objcm.g:1138:26: '\\r'
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
            // Objcm.g:1141:3: ( '/*' ( . )* '*/' ( ( '\\r' )? '\\n' )? )
            // Objcm.g:1141:5: '/*' ( . )* '*/' ( ( '\\r' )? '\\n' )?
            {
            match("/*"); 



            // Objcm.g:1141:10: ( . )*
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
            	    // Objcm.g:1141:10: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match("*/"); 



            // Objcm.g:1141:18: ( ( '\\r' )? '\\n' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\n'||LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // Objcm.g:1141:19: ( '\\r' )? '\\n'
                    {
                    // Objcm.g:1141:19: ( '\\r' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\r') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // Objcm.g:1141:19: '\\r'
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
            // Objcm.g:1144:2: ( '#' (~ ( '\\\\' | '\\r' | '\\n' ) )* ( '\\\\' ( '\\r' | '\\n' )+ (~ ( '\\\\' | '\\r' | '\\n' ) )+ )* ( '\\r' | '\\n' )+ )
            // Objcm.g:1144:5: '#' (~ ( '\\\\' | '\\r' | '\\n' ) )* ( '\\\\' ( '\\r' | '\\n' )+ (~ ( '\\\\' | '\\r' | '\\n' ) )+ )* ( '\\r' | '\\n' )+
            {
            match('#'); 

            // Objcm.g:1144:9: (~ ( '\\\\' | '\\r' | '\\n' ) )*
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


            // Objcm.g:1144:32: ( '\\\\' ( '\\r' | '\\n' )+ (~ ( '\\\\' | '\\r' | '\\n' ) )+ )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\\') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Objcm.g:1144:33: '\\\\' ( '\\r' | '\\n' )+ (~ ( '\\\\' | '\\r' | '\\n' ) )+
            	    {
            	    match('\\'); 

            	    // Objcm.g:1144:38: ( '\\r' | '\\n' )+
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


            	    // Objcm.g:1144:53: (~ ( '\\\\' | '\\r' | '\\n' ) )+
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


            // Objcm.g:1144:78: ( '\\r' | '\\n' )+
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
            // Objcm.g:1146:9: ( ( DIGIT )+ ( 'u' | 'U' )? | ( DIGIT )+ DOT ( DIGIT )* ( 'f' | 'F' )? | ( DIGIT )* DOT ( DIGIT )+ ( 'f' | 'F' )? | ( '0x' ( DIGIT | 'A' .. 'F' )* ( DOT ( DIGIT )+ )? )? | ( DIGIT )+ ( DOT ( DIGIT )+ )? 'e' ( '-' | '+' )? ( DIGIT )+ )
            int alt29=5;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // Objcm.g:1146:11: ( DIGIT )+ ( 'u' | 'U' )?
                    {
                    // Objcm.g:1146:11: ( DIGIT )+
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


                    // Objcm.g:1146:18: ( 'u' | 'U' )?
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
                    // Objcm.g:1147:4: ( DIGIT )+ DOT ( DIGIT )* ( 'f' | 'F' )?
                    {
                    // Objcm.g:1147:4: ( DIGIT )+
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


                    // Objcm.g:1147:15: ( DIGIT )*
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


                    // Objcm.g:1147:22: ( 'f' | 'F' )?
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
                    // Objcm.g:1148:4: ( DIGIT )* DOT ( DIGIT )+ ( 'f' | 'F' )?
                    {
                    // Objcm.g:1148:4: ( DIGIT )*
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


                    // Objcm.g:1148:15: ( DIGIT )+
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


                    // Objcm.g:1148:22: ( 'f' | 'F' )?
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
                    // Objcm.g:1149:4: ( '0x' ( DIGIT | 'A' .. 'F' )* ( DOT ( DIGIT )+ )? )?
                    {
                    // Objcm.g:1149:4: ( '0x' ( DIGIT | 'A' .. 'F' )* ( DOT ( DIGIT )+ )? )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0=='0') ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // Objcm.g:1149:5: '0x' ( DIGIT | 'A' .. 'F' )* ( DOT ( DIGIT )+ )?
                            {
                            match("0x"); 



                            // Objcm.g:1149:11: ( DIGIT | 'A' .. 'F' )*
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


                            // Objcm.g:1149:28: ( DOT ( DIGIT )+ )?
                            int alt22=2;
                            int LA22_0 = input.LA(1);

                            if ( (LA22_0=='.') ) {
                                alt22=1;
                            }
                            switch (alt22) {
                                case 1 :
                                    // Objcm.g:1149:29: DOT ( DIGIT )+
                                    {
                                    mDOT(); 


                                    // Objcm.g:1149:33: ( DIGIT )+
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
                    // Objcm.g:1150:4: ( DIGIT )+ ( DOT ( DIGIT )+ )? 'e' ( '-' | '+' )? ( DIGIT )+
                    {
                    // Objcm.g:1150:4: ( DIGIT )+
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


                    // Objcm.g:1150:11: ( DOT ( DIGIT )+ )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0=='.') ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // Objcm.g:1150:12: DOT ( DIGIT )+
                            {
                            mDOT(); 


                            // Objcm.g:1150:16: ( DIGIT )+
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

                    // Objcm.g:1150:29: ( '-' | '+' )?
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


                    // Objcm.g:1150:40: ( DIGIT )+
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
            // Objcm.g:1152:4: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // Objcm.g:1152:6: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // Objcm.g:1152:6: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
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
            // Objcm.g:1155:2: ( 'continue' SEMICOLON )
            // Objcm.g:1155:4: 'continue' SEMICOLON
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
            // Objcm.g:1159:2: ( 'break' )
            // Objcm.g:1159:4: 'break'
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
            // Objcm.g:1161:6: ( 'void' )
            // Objcm.g:1161:8: 'void'
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
            // Objcm.g:1163:4: ( LETTER ( DIGIT | LETTER )* )
            // Objcm.g:1163:6: LETTER ( DIGIT | LETTER )*
            {
            mLETTER(); 


            // Objcm.g:1163:13: ( DIGIT | LETTER )*
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
            // Objcm.g:1169:2: ( '\"' ( WS | ESC |~ ( '\\r' | '\\n' | '\"' ) )* '\"' )
            // Objcm.g:1169:4: '\"' ( WS | ESC |~ ( '\\r' | '\\n' | '\"' ) )* '\"'
            {
            match('\"'); 

            // Objcm.g:1169:8: ( WS | ESC |~ ( '\\r' | '\\n' | '\"' ) )*
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
            	    // Objcm.g:1169:9: WS
            	    {
            	    mWS(); 


            	    }
            	    break;
            	case 2 :
            	    // Objcm.g:1169:14: ESC
            	    {
            	    mESC(); 


            	    }
            	    break;
            	case 3 :
            	    // Objcm.g:1169:20: ~ ( '\\r' | '\\n' | '\"' )
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
            // Objcm.g:1172:2: ( '\\'' ( WS | ESC |~ ( '\\r' | '\\n' | '\\'' ) )* '\\'' )
            // Objcm.g:1172:4: '\\'' ( WS | ESC |~ ( '\\r' | '\\n' | '\\'' ) )* '\\''
            {
            match('\''); 

            // Objcm.g:1172:9: ( WS | ESC |~ ( '\\r' | '\\n' | '\\'' ) )*
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
            	    // Objcm.g:1172:10: WS
            	    {
            	    mWS(); 


            	    }
            	    break;
            	case 2 :
            	    // Objcm.g:1172:15: ESC
            	    {
            	    mESC(); 


            	    }
            	    break;
            	case 3 :
            	    // Objcm.g:1172:21: ~ ( '\\r' | '\\n' | '\\'' )
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
            // Objcm.g:1174:16: ( ( '`' )? '@' STRING_LITERAL2 )
            // Objcm.g:1174:18: ( '`' )? '@' STRING_LITERAL2
            {
            // Objcm.g:1174:18: ( '`' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0=='`') ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // Objcm.g:1174:18: '`'
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
            // Objcm.g:1176:17: ( '0' .. '9' )
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
            // Objcm.g:1177:17: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
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
            // Objcm.g:1179:2: ( '\\\\' '\"' )
            // Objcm.g:1179:4: '\\\\' '\"'
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
        // Objcm.g:1:8: ( T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | T__177 | T__178 | T__179 | T__180 | T__181 | T__182 | T__183 | T__184 | L_FBR | R_FBR | L_BR | R_BR | L_KBR | R_KBR | SEMICOLON | COLON | L_LEFT_EQ | L_RIGHT_EQ | L_LESS_EQ | L_MORE_EQ | L_LEFT | L_RIGHT | L_LESS | L_MORE | DOT | COMMA | L_NEQ | L_NOT | L_EQ_EQ | L_PLUS_EQ | L_MINUS_EQ | L_MULT_EQ | L_DIV_EQ | L_PERC_EQ | L_AND_EQ | L_XOR_EQ | L_OR_EQ | L_EQ | ASTERISK | L_DIV | L_PERC | L_PLUS_PLUS | L_MINUS_MINUS | L_PLUS | L_MINUS | L_OR_OR | L_AND_AND | L_OR | L_AND | L_XOR | L_TILDA | SIZEOF | L_QUESTION | CONST_PREFIX | ENUM_PREFIX | STRUCT_PREFIX | STATIC_PREFIX | SINGLE_COMMENT | MULTI_COMMENT | PREPROCESSOR_DECLARATION | NUMBER | WS | SINGLE_OP | BREAK_WORD | VOID | ID | STRING_LITERAL2 | STRING_LITERAL3 | STRING_LITERAL )
        int alt35=96;
        alt35 = dfa35.predict(input);
        switch (alt35) {
            case 1 :
                // Objcm.g:1:10: T__150
                {
                mT__150(); 


                }
                break;
            case 2 :
                // Objcm.g:1:17: T__151
                {
                mT__151(); 


                }
                break;
            case 3 :
                // Objcm.g:1:24: T__152
                {
                mT__152(); 


                }
                break;
            case 4 :
                // Objcm.g:1:31: T__153
                {
                mT__153(); 


                }
                break;
            case 5 :
                // Objcm.g:1:38: T__154
                {
                mT__154(); 


                }
                break;
            case 6 :
                // Objcm.g:1:45: T__155
                {
                mT__155(); 


                }
                break;
            case 7 :
                // Objcm.g:1:52: T__156
                {
                mT__156(); 


                }
                break;
            case 8 :
                // Objcm.g:1:59: T__157
                {
                mT__157(); 


                }
                break;
            case 9 :
                // Objcm.g:1:66: T__158
                {
                mT__158(); 


                }
                break;
            case 10 :
                // Objcm.g:1:73: T__159
                {
                mT__159(); 


                }
                break;
            case 11 :
                // Objcm.g:1:80: T__160
                {
                mT__160(); 


                }
                break;
            case 12 :
                // Objcm.g:1:87: T__161
                {
                mT__161(); 


                }
                break;
            case 13 :
                // Objcm.g:1:94: T__162
                {
                mT__162(); 


                }
                break;
            case 14 :
                // Objcm.g:1:101: T__163
                {
                mT__163(); 


                }
                break;
            case 15 :
                // Objcm.g:1:108: T__164
                {
                mT__164(); 


                }
                break;
            case 16 :
                // Objcm.g:1:115: T__165
                {
                mT__165(); 


                }
                break;
            case 17 :
                // Objcm.g:1:122: T__166
                {
                mT__166(); 


                }
                break;
            case 18 :
                // Objcm.g:1:129: T__167
                {
                mT__167(); 


                }
                break;
            case 19 :
                // Objcm.g:1:136: T__168
                {
                mT__168(); 


                }
                break;
            case 20 :
                // Objcm.g:1:143: T__169
                {
                mT__169(); 


                }
                break;
            case 21 :
                // Objcm.g:1:150: T__170
                {
                mT__170(); 


                }
                break;
            case 22 :
                // Objcm.g:1:157: T__171
                {
                mT__171(); 


                }
                break;
            case 23 :
                // Objcm.g:1:164: T__172
                {
                mT__172(); 


                }
                break;
            case 24 :
                // Objcm.g:1:171: T__173
                {
                mT__173(); 


                }
                break;
            case 25 :
                // Objcm.g:1:178: T__174
                {
                mT__174(); 


                }
                break;
            case 26 :
                // Objcm.g:1:185: T__175
                {
                mT__175(); 


                }
                break;
            case 27 :
                // Objcm.g:1:192: T__176
                {
                mT__176(); 


                }
                break;
            case 28 :
                // Objcm.g:1:199: T__177
                {
                mT__177(); 


                }
                break;
            case 29 :
                // Objcm.g:1:206: T__178
                {
                mT__178(); 


                }
                break;
            case 30 :
                // Objcm.g:1:213: T__179
                {
                mT__179(); 


                }
                break;
            case 31 :
                // Objcm.g:1:220: T__180
                {
                mT__180(); 


                }
                break;
            case 32 :
                // Objcm.g:1:227: T__181
                {
                mT__181(); 


                }
                break;
            case 33 :
                // Objcm.g:1:234: T__182
                {
                mT__182(); 


                }
                break;
            case 34 :
                // Objcm.g:1:241: T__183
                {
                mT__183(); 


                }
                break;
            case 35 :
                // Objcm.g:1:248: T__184
                {
                mT__184(); 


                }
                break;
            case 36 :
                // Objcm.g:1:255: L_FBR
                {
                mL_FBR(); 


                }
                break;
            case 37 :
                // Objcm.g:1:261: R_FBR
                {
                mR_FBR(); 


                }
                break;
            case 38 :
                // Objcm.g:1:267: L_BR
                {
                mL_BR(); 


                }
                break;
            case 39 :
                // Objcm.g:1:272: R_BR
                {
                mR_BR(); 


                }
                break;
            case 40 :
                // Objcm.g:1:277: L_KBR
                {
                mL_KBR(); 


                }
                break;
            case 41 :
                // Objcm.g:1:283: R_KBR
                {
                mR_KBR(); 


                }
                break;
            case 42 :
                // Objcm.g:1:289: SEMICOLON
                {
                mSEMICOLON(); 


                }
                break;
            case 43 :
                // Objcm.g:1:299: COLON
                {
                mCOLON(); 


                }
                break;
            case 44 :
                // Objcm.g:1:305: L_LEFT_EQ
                {
                mL_LEFT_EQ(); 


                }
                break;
            case 45 :
                // Objcm.g:1:315: L_RIGHT_EQ
                {
                mL_RIGHT_EQ(); 


                }
                break;
            case 46 :
                // Objcm.g:1:326: L_LESS_EQ
                {
                mL_LESS_EQ(); 


                }
                break;
            case 47 :
                // Objcm.g:1:336: L_MORE_EQ
                {
                mL_MORE_EQ(); 


                }
                break;
            case 48 :
                // Objcm.g:1:346: L_LEFT
                {
                mL_LEFT(); 


                }
                break;
            case 49 :
                // Objcm.g:1:353: L_RIGHT
                {
                mL_RIGHT(); 


                }
                break;
            case 50 :
                // Objcm.g:1:361: L_LESS
                {
                mL_LESS(); 


                }
                break;
            case 51 :
                // Objcm.g:1:368: L_MORE
                {
                mL_MORE(); 


                }
                break;
            case 52 :
                // Objcm.g:1:375: DOT
                {
                mDOT(); 


                }
                break;
            case 53 :
                // Objcm.g:1:379: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 54 :
                // Objcm.g:1:385: L_NEQ
                {
                mL_NEQ(); 


                }
                break;
            case 55 :
                // Objcm.g:1:391: L_NOT
                {
                mL_NOT(); 


                }
                break;
            case 56 :
                // Objcm.g:1:397: L_EQ_EQ
                {
                mL_EQ_EQ(); 


                }
                break;
            case 57 :
                // Objcm.g:1:405: L_PLUS_EQ
                {
                mL_PLUS_EQ(); 


                }
                break;
            case 58 :
                // Objcm.g:1:415: L_MINUS_EQ
                {
                mL_MINUS_EQ(); 


                }
                break;
            case 59 :
                // Objcm.g:1:426: L_MULT_EQ
                {
                mL_MULT_EQ(); 


                }
                break;
            case 60 :
                // Objcm.g:1:436: L_DIV_EQ
                {
                mL_DIV_EQ(); 


                }
                break;
            case 61 :
                // Objcm.g:1:445: L_PERC_EQ
                {
                mL_PERC_EQ(); 


                }
                break;
            case 62 :
                // Objcm.g:1:455: L_AND_EQ
                {
                mL_AND_EQ(); 


                }
                break;
            case 63 :
                // Objcm.g:1:464: L_XOR_EQ
                {
                mL_XOR_EQ(); 


                }
                break;
            case 64 :
                // Objcm.g:1:473: L_OR_EQ
                {
                mL_OR_EQ(); 


                }
                break;
            case 65 :
                // Objcm.g:1:481: L_EQ
                {
                mL_EQ(); 


                }
                break;
            case 66 :
                // Objcm.g:1:486: ASTERISK
                {
                mASTERISK(); 


                }
                break;
            case 67 :
                // Objcm.g:1:495: L_DIV
                {
                mL_DIV(); 


                }
                break;
            case 68 :
                // Objcm.g:1:501: L_PERC
                {
                mL_PERC(); 


                }
                break;
            case 69 :
                // Objcm.g:1:508: L_PLUS_PLUS
                {
                mL_PLUS_PLUS(); 


                }
                break;
            case 70 :
                // Objcm.g:1:520: L_MINUS_MINUS
                {
                mL_MINUS_MINUS(); 


                }
                break;
            case 71 :
                // Objcm.g:1:534: L_PLUS
                {
                mL_PLUS(); 


                }
                break;
            case 72 :
                // Objcm.g:1:541: L_MINUS
                {
                mL_MINUS(); 


                }
                break;
            case 73 :
                // Objcm.g:1:549: L_OR_OR
                {
                mL_OR_OR(); 


                }
                break;
            case 74 :
                // Objcm.g:1:557: L_AND_AND
                {
                mL_AND_AND(); 


                }
                break;
            case 75 :
                // Objcm.g:1:567: L_OR
                {
                mL_OR(); 


                }
                break;
            case 76 :
                // Objcm.g:1:572: L_AND
                {
                mL_AND(); 


                }
                break;
            case 77 :
                // Objcm.g:1:578: L_XOR
                {
                mL_XOR(); 


                }
                break;
            case 78 :
                // Objcm.g:1:584: L_TILDA
                {
                mL_TILDA(); 


                }
                break;
            case 79 :
                // Objcm.g:1:592: SIZEOF
                {
                mSIZEOF(); 


                }
                break;
            case 80 :
                // Objcm.g:1:599: L_QUESTION
                {
                mL_QUESTION(); 


                }
                break;
            case 81 :
                // Objcm.g:1:610: CONST_PREFIX
                {
                mCONST_PREFIX(); 


                }
                break;
            case 82 :
                // Objcm.g:1:623: ENUM_PREFIX
                {
                mENUM_PREFIX(); 


                }
                break;
            case 83 :
                // Objcm.g:1:635: STRUCT_PREFIX
                {
                mSTRUCT_PREFIX(); 


                }
                break;
            case 84 :
                // Objcm.g:1:649: STATIC_PREFIX
                {
                mSTATIC_PREFIX(); 


                }
                break;
            case 85 :
                // Objcm.g:1:663: SINGLE_COMMENT
                {
                mSINGLE_COMMENT(); 


                }
                break;
            case 86 :
                // Objcm.g:1:678: MULTI_COMMENT
                {
                mMULTI_COMMENT(); 


                }
                break;
            case 87 :
                // Objcm.g:1:692: PREPROCESSOR_DECLARATION
                {
                mPREPROCESSOR_DECLARATION(); 


                }
                break;
            case 88 :
                // Objcm.g:1:717: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 89 :
                // Objcm.g:1:724: WS
                {
                mWS(); 


                }
                break;
            case 90 :
                // Objcm.g:1:727: SINGLE_OP
                {
                mSINGLE_OP(); 


                }
                break;
            case 91 :
                // Objcm.g:1:737: BREAK_WORD
                {
                mBREAK_WORD(); 


                }
                break;
            case 92 :
                // Objcm.g:1:748: VOID
                {
                mVOID(); 


                }
                break;
            case 93 :
                // Objcm.g:1:753: ID
                {
                mID(); 


                }
                break;
            case 94 :
                // Objcm.g:1:756: STRING_LITERAL2
                {
                mSTRING_LITERAL2(); 


                }
                break;
            case 95 :
                // Objcm.g:1:772: STRING_LITERAL3
                {
                mSTRING_LITERAL3(); 


                }
                break;
            case 96 :
                // Objcm.g:1:788: STRING_LITERAL
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
            return "1146:1: NUMBER : ( ( DIGIT )+ ( 'u' | 'U' )? | ( DIGIT )+ DOT ( DIGIT )* ( 'f' | 'F' )? | ( DIGIT )* DOT ( DIGIT )+ ( 'f' | 'F' )? | ( '0x' ( DIGIT | 'A' .. 'F' )* ( DOT ( DIGIT )+ )? )? | ( DIGIT )+ ( DOT ( DIGIT )+ )? 'e' ( '-' | '+' )? ( DIGIT )+ );";
        }
    }
    static final String DFA35_eotS =
        "\1\51\1\uffff\1\65\1\67\1\uffff\15\55\10\uffff\1\125\1\130\1\uffff"+
        "\1\132\1\134\1\137\1\141\1\145\1\147\1\152\1\154\1\157\5\uffff\2"+
        "\55\22\uffff\5\55\1\u0082\4\55\1\u0087\1\u0089\10\55\1\u0095\2\uffff"+
        "\1\u0097\31\uffff\2\55\12\uffff\1\u009d\5\55\1\uffff\3\55\1\u00a7"+
        "\1\uffff\1\55\1\uffff\1\u00a9\11\55\4\uffff\2\55\4\uffff\2\55\1"+
        "\u00b7\3\55\1\u00bb\1\55\1\u00bd\1\uffff\1\55\1\uffff\12\55\1\u00c9"+
        "\2\55\1\uffff\1\u00cd\2\55\1\uffff\1\55\1\uffff\7\55\1\u00d8\1\55"+
        "\1\u00da\1\u00db\1\uffff\3\55\1\uffff\2\55\1\u00e1\1\u00e2\1\u00e3"+
        "\1\u00e4\1\u00e5\1\u00e6\1\u00e7\1\55\1\uffff\1\55\2\uffff\4\55"+
        "\1\u00ee\7\uffff\1\u00ef\5\55\2\uffff\1\u00f5\3\55\2\uffff\1\55"+
        "\1\u00fa\2\55\1\uffff\1\u00fd\1\55\1\uffff\1\u00ff\1\uffff";
    static final String DFA35_eofS =
        "\u0100\uffff";
    static final String DFA35_minS =
        "\1\11\1\0\1\55\1\56\1\42\1\151\1\137\1\141\1\145\1\154\1\157\1\146"+
        "\1\151\1\145\1\151\1\171\1\156\1\150\10\uffff\1\74\1\75\1\uffff"+
        "\2\75\1\53\1\75\1\52\1\75\1\46\2\75\5\uffff\1\162\1\157\3\uffff"+
        "\1\0\10\uffff\1\156\1\uffff\1\155\1\162\1\145\1\150\1\154\1\141"+
        "\1\163\1\156\1\146\1\60\1\163\1\164\1\165\1\162\2\60\1\154\1\164"+
        "\1\151\1\172\1\141\1\160\2\151\1\75\2\uffff\1\75\31\uffff\1\145"+
        "\1\151\1\uffff\1\143\10\uffff\1\60\1\164\1\171\1\145\1\163\1\141"+
        "\1\uffff\2\145\1\155\1\60\1\uffff\1\151\1\uffff\1\60\1\165\1\164"+
        "\1\145\1\165\1\164\1\145\1\157\1\151\1\154\4\uffff\1\141\1\144\4"+
        "\uffff\1\164\1\160\1\60\1\164\1\151\1\165\1\60\1\162\1\60\1\uffff"+
        "\1\156\1\uffff\1\162\1\143\1\157\1\143\1\151\1\144\1\156\1\147\1"+
        "\145\1\153\1\60\1\162\1\145\1\uffff\1\60\1\156\1\154\1\uffff\1\156"+
        "\1\uffff\1\145\1\156\1\150\1\146\1\164\1\143\1\145\1\60\1\156\2"+
        "\60\1\uffff\1\151\1\157\1\165\1\uffff\1\165\1\164\7\60\1\146\1\uffff"+
        "\1\145\2\uffff\1\142\1\146\1\143\1\145\1\60\7\uffff\1\60\1\144\1"+
        "\165\1\137\1\164\1\73\2\uffff\1\60\1\164\1\137\1\157\2\uffff\1\145"+
        "\1\60\1\162\1\137\1\uffff\1\60\1\137\1\uffff\1\60\1\uffff";
    static final String DFA35_maxS =
        "\1\176\1\uffff\1\76\1\71\1\164\1\151\1\137\2\157\1\170\1\157\1\156"+
        "\1\151\1\145\1\167\1\171\1\156\1\150\10\uffff\1\75\1\76\1\uffff"+
        "\10\75\1\174\5\uffff\1\162\1\157\3\uffff\1\uffff\10\uffff\1\156"+
        "\1\uffff\1\156\1\165\1\171\1\162\1\154\1\164\1\163\1\156\1\146\1"+
        "\172\1\163\1\164\1\165\1\162\2\172\1\154\1\164\1\151\1\172\1\162"+
        "\1\160\1\163\1\151\1\75\2\uffff\1\75\31\uffff\1\145\1\151\1\uffff"+
        "\1\144\10\uffff\1\172\1\164\1\171\1\145\1\164\1\141\1\uffff\2\145"+
        "\1\155\1\172\1\uffff\1\151\1\uffff\1\172\1\165\1\164\1\145\1\165"+
        "\1\164\1\145\1\157\1\151\1\154\4\uffff\1\141\1\144\4\uffff\1\164"+
        "\1\160\1\172\1\164\1\151\1\165\1\172\1\162\1\172\1\uffff\1\156\1"+
        "\uffff\1\162\1\143\1\157\1\143\1\151\1\144\1\156\1\147\1\145\1\153"+
        "\1\172\1\162\1\145\1\uffff\1\172\1\156\1\154\1\uffff\1\156\1\uffff"+
        "\1\145\1\156\1\150\1\146\1\164\1\143\1\145\1\172\1\156\2\172\1\uffff"+
        "\1\151\1\157\1\165\1\uffff\1\165\1\164\7\172\1\146\1\uffff\1\145"+
        "\2\uffff\1\142\1\146\1\143\1\145\1\172\7\uffff\1\172\1\144\1\165"+
        "\1\137\1\164\1\73\2\uffff\1\172\1\164\1\137\1\157\2\uffff\1\145"+
        "\1\172\1\162\1\137\1\uffff\1\172\1\137\1\uffff\1\172\1\uffff";
    static final String DFA35_acceptS =
        "\22\uffff\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\2\uffff\1\65\11"+
        "\uffff\1\116\1\120\1\127\1\130\1\131\2\uffff\1\135\1\137\1\140\1"+
        "\uffff\1\136\1\2\1\72\1\106\1\110\1\3\1\64\1\4\1\uffff\1\7\31\uffff"+
        "\1\56\1\62\1\uffff\1\57\1\63\1\66\1\67\1\70\1\101\1\71\1\105\1\107"+
        "\1\73\1\102\1\74\1\125\1\126\1\103\1\75\1\104\1\76\1\112\1\114\1"+
        "\77\1\115\1\100\1\111\1\113\2\uffff\1\1\1\uffff\1\10\1\11\1\12\1"+
        "\13\1\14\1\15\1\16\1\17\6\uffff\1\26\4\uffff\1\32\1\uffff\1\33\12"+
        "\uffff\1\54\1\60\1\55\1\61\2\uffff\1\1\1\5\1\6\1\20\11\uffff\1\31"+
        "\1\uffff\1\35\15\uffff\1\23\3\uffff\1\27\1\uffff\1\122\13\uffff"+
        "\1\134\3\uffff\1\121\12\uffff\1\41\1\uffff\1\43\1\133\5\uffff\1"+
        "\30\1\34\1\36\1\37\1\117\1\123\1\124\6\uffff\1\25\1\40\4\uffff\1"+
        "\132\1\42\4\uffff\1\22\2\uffff\1\24\1\uffff\1\21";
    static final String DFA35_specialS =
        "\1\uffff\1\1\56\uffff\1\0\u00cf\uffff}>";
    static final String[] DFA35_transitionS = {
            "\2\52\1\uffff\2\52\22\uffff\1\52\1\35\1\1\1\50\1\uffff\1\42"+
            "\1\43\1\56\1\24\1\25\1\40\1\37\1\34\1\2\1\3\1\41\12\uffff\1"+
            "\31\1\30\1\32\1\36\1\33\1\47\1\4\15\55\1\5\14\55\1\26\1\uffff"+
            "\1\27\1\44\1\6\1\57\1\55\1\53\1\7\1\10\1\11\1\12\2\55\1\13\4"+
            "\55\1\14\3\55\1\15\1\16\1\17\1\20\1\54\1\21\3\55\1\22\1\45\1"+
            "\23\1\46",
            "\103\61\1\60\uffbc\61",
            "\1\64\17\uffff\1\63\1\62",
            "\1\66\1\uffff\12\51",
            "\1\57\100\uffff\1\70\1\uffff\1\71\1\72\2\uffff\1\73\6\uffff"+
            "\1\74\2\uffff\1\75\1\76",
            "\1\77",
            "\1\100",
            "\1\101\15\uffff\1\102",
            "\1\103\11\uffff\1\104",
            "\1\105\1\uffff\1\107\11\uffff\1\106",
            "\1\110",
            "\1\111\7\uffff\1\112",
            "\1\113",
            "\1\114",
            "\1\116\12\uffff\1\117\2\uffff\1\115",
            "\1\120",
            "\1\121",
            "\1\122",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\123\1\124",
            "\1\127\1\126",
            "",
            "\1\131",
            "\1\133",
            "\1\136\21\uffff\1\135",
            "\1\140",
            "\1\144\4\uffff\1\143\15\uffff\1\142",
            "\1\146",
            "\1\151\26\uffff\1\150",
            "\1\153",
            "\1\155\76\uffff\1\156",
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
            "\42\61\1\162\uffdd\61",
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
            "\1\164\1\165",
            "\1\166\2\uffff\1\167",
            "\1\170\23\uffff\1\171",
            "\1\172\11\uffff\1\173",
            "\1\174",
            "\1\175\22\uffff\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\13\55\1\u0088\16"+
            "\55",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008f\20\uffff\1\u008e",
            "\1\u0090",
            "\1\u0091\11\uffff\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "",
            "",
            "\1\u0096",
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
            "",
            "",
            "",
            "",
            "\1\u0098",
            "\1\u0099",
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
            "",
            "",
            "",
            "",
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
            return "1:1: Tokens : ( T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | T__177 | T__178 | T__179 | T__180 | T__181 | T__182 | T__183 | T__184 | L_FBR | R_FBR | L_BR | R_BR | L_KBR | R_KBR | SEMICOLON | COLON | L_LEFT_EQ | L_RIGHT_EQ | L_LESS_EQ | L_MORE_EQ | L_LEFT | L_RIGHT | L_LESS | L_MORE | DOT | COMMA | L_NEQ | L_NOT | L_EQ_EQ | L_PLUS_EQ | L_MINUS_EQ | L_MULT_EQ | L_DIV_EQ | L_PERC_EQ | L_AND_EQ | L_XOR_EQ | L_OR_EQ | L_EQ | ASTERISK | L_DIV | L_PERC | L_PLUS_PLUS | L_MINUS_MINUS | L_PLUS | L_MINUS | L_OR_OR | L_AND_AND | L_OR | L_AND | L_XOR | L_TILDA | SIZEOF | L_QUESTION | CONST_PREFIX | ENUM_PREFIX | STRUCT_PREFIX | STATIC_PREFIX | SINGLE_COMMENT | MULTI_COMMENT | PREPROCESSOR_DECLARATION | NUMBER | WS | SINGLE_OP | BREAK_WORD | VOID | ID | STRING_LITERAL2 | STRING_LITERAL3 | STRING_LITERAL );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_48 = input.LA(1);

                        s = -1;
                        if ( (LA35_48=='\"') ) {s = 114;}

                        else if ( ((LA35_48 >= '\u0000' && LA35_48 <= '!')||(LA35_48 >= '#' && LA35_48 <= '\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA35_1 = input.LA(1);

                        s = -1;
                        if ( (LA35_1=='C') ) {s = 48;}

                        else if ( ((LA35_1 >= '\u0000' && LA35_1 <= 'B')||(LA35_1 >= 'D' && LA35_1 <= '\uFFFF')) ) {s = 49;}

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