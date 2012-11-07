// $ANTLR 3.4 C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g 2012-11-07 20:19:52

package ru.andremoniy.objctojavacnv.antlr.output;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ObjchParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARCHIVE_DECLARATION", "CATEGORY", "DIGIT", "ENUM", "EXTERN", "FIELD", "FIELDS", "FIELD_NAME", "FILE_NAME", "GROUP_MODIFIER", "ID", "INIT_DECLARATION", "INTERFACE", "INTERFACE_NAME", "LETTER", "METHOD", "METHOD_NAME", "METHOD_PARAM", "METHOD_PARAMS", "METHOD_TYPE", "MODIFIER", "MULTI_COMMENT", "NAME", "NUMBER", "OLD_NAME", "PARAM_NAME", "PARAM_PREFIX", "PREPROCESSOR_DECLARATION", "PROTOCOL", "SINGLE_COMMENT", "STATIC_METHOD", "STRUCT", "SUPERCLASS_NAME", "TYPE", "TYPEDEF", "TYPEDEF_ELEMENT", "TYPEDEF_NAME", "T_STATIC", "UNION", "VALUE", "WHITESPACE", "'&'", "'&~'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'...'", "':'", "';'", "'<'", "'<<'", "'='", "'>'", "'>>'", "'@class'", "'@end'", "'@interface'", "'@optional'", "'@private'", "'@property'", "'@protected'", "'@protocol'", "'@public'", "'NS_INLINE'", "'['", "']'", "'_NSWINDOWS_DLL_GOOP'", "'__attribute__'", "'__declspec'", "'__weak'", "'assign'", "'const'", "'copy'", "'dllimport'", "'enum'", "'extern'", "'format'", "'inline'", "'int'", "'long'", "'nonatomic'", "'readonly'", "'readwrite'", "'retain'", "'static'", "'struct'", "'typedef'", "'union'", "'unsigned'", "'{'", "'|'", "'}'"
    };

    public static final int EOF=-1;
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
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int ARCHIVE_DECLARATION=4;
    public static final int CATEGORY=5;
    public static final int DIGIT=6;
    public static final int ENUM=7;
    public static final int EXTERN=8;
    public static final int FIELD=9;
    public static final int FIELDS=10;
    public static final int FIELD_NAME=11;
    public static final int FILE_NAME=12;
    public static final int GROUP_MODIFIER=13;
    public static final int ID=14;
    public static final int INIT_DECLARATION=15;
    public static final int INTERFACE=16;
    public static final int INTERFACE_NAME=17;
    public static final int LETTER=18;
    public static final int METHOD=19;
    public static final int METHOD_NAME=20;
    public static final int METHOD_PARAM=21;
    public static final int METHOD_PARAMS=22;
    public static final int METHOD_TYPE=23;
    public static final int MODIFIER=24;
    public static final int MULTI_COMMENT=25;
    public static final int NAME=26;
    public static final int NUMBER=27;
    public static final int OLD_NAME=28;
    public static final int PARAM_NAME=29;
    public static final int PARAM_PREFIX=30;
    public static final int PREPROCESSOR_DECLARATION=31;
    public static final int PROTOCOL=32;
    public static final int SINGLE_COMMENT=33;
    public static final int STATIC_METHOD=34;
    public static final int STRUCT=35;
    public static final int SUPERCLASS_NAME=36;
    public static final int TYPE=37;
    public static final int TYPEDEF=38;
    public static final int TYPEDEF_ELEMENT=39;
    public static final int TYPEDEF_NAME=40;
    public static final int T_STATIC=41;
    public static final int UNION=42;
    public static final int VALUE=43;
    public static final int WHITESPACE=44;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public ObjchParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ObjchParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return ObjchParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g"; }


    public static class code_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "code"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:55:1: code : ( code_internal )* ;
    public final ObjchParser.code_return code() throws RecognitionException {
        ObjchParser.code_return retval = new ObjchParser.code_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.code_internal_return code_internal1 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:55:6: ( ( code_internal )* )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:56:3: ( code_internal )*
            {
            root_0 = (Object)adaptor.nil();


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:56:3: ( code_internal )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID||LA1_0==50||LA1_0==52||LA1_0==61||(LA1_0 >= 63 && LA1_0 <= 64)||LA1_0==66||LA1_0==68||LA1_0==70||LA1_0==73||(LA1_0 >= 75 && LA1_0 <= 76)||LA1_0==78||(LA1_0 >= 81 && LA1_0 <= 82)||(LA1_0 >= 84 && LA1_0 <= 86)||(LA1_0 >= 91 && LA1_0 <= 93)||LA1_0==95) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:56:3: code_internal
            	    {
            	    pushFollow(FOLLOW_code_internal_in_code186);
            	    code_internal1=code_internal();

            	    state._fsp--;

            	    adaptor.addChild(root_0, code_internal1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "code"


    public static class code_internal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "code_internal"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:59:1: code_internal : ( class_declaration | typedef_declaration_wrapper | enum_wrapper | protocol_declaration_wrapper | interface_declaration_wrapper | extern_declarations | typedef_struct | declarations | garbage );
    public final ObjchParser.code_internal_return code_internal() throws RecognitionException {
        ObjchParser.code_internal_return retval = new ObjchParser.code_internal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.class_declaration_return class_declaration2 =null;

        ObjchParser.typedef_declaration_wrapper_return typedef_declaration_wrapper3 =null;

        ObjchParser.enum_wrapper_return enum_wrapper4 =null;

        ObjchParser.protocol_declaration_wrapper_return protocol_declaration_wrapper5 =null;

        ObjchParser.interface_declaration_wrapper_return interface_declaration_wrapper6 =null;

        ObjchParser.extern_declarations_return extern_declarations7 =null;

        ObjchParser.typedef_struct_return typedef_struct8 =null;

        ObjchParser.declarations_return declarations9 =null;

        ObjchParser.garbage_return garbage10 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:60:2: ( class_declaration | typedef_declaration_wrapper | enum_wrapper | protocol_declaration_wrapper | interface_declaration_wrapper | extern_declarations | typedef_struct | declarations | garbage )
            int alt2=9;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:60:4: class_declaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_class_declaration_in_code_internal199);
                    class_declaration2=class_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, class_declaration2.getTree());

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:61:5: typedef_declaration_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedef_declaration_wrapper_in_code_internal206);
                    typedef_declaration_wrapper3=typedef_declaration_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef_declaration_wrapper3.getTree());

                    }
                    break;
                case 3 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:62:5: enum_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_enum_wrapper_in_code_internal213);
                    enum_wrapper4=enum_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, enum_wrapper4.getTree());

                    }
                    break;
                case 4 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:63:4: protocol_declaration_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_protocol_declaration_wrapper_in_code_internal218);
                    protocol_declaration_wrapper5=protocol_declaration_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, protocol_declaration_wrapper5.getTree());

                    }
                    break;
                case 5 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:64:4: interface_declaration_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_interface_declaration_wrapper_in_code_internal224);
                    interface_declaration_wrapper6=interface_declaration_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, interface_declaration_wrapper6.getTree());

                    }
                    break;
                case 6 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:65:4: extern_declarations
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_extern_declarations_in_code_internal230);
                    extern_declarations7=extern_declarations();

                    state._fsp--;

                    adaptor.addChild(root_0, extern_declarations7.getTree());

                    }
                    break;
                case 7 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:66:4: typedef_struct
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedef_struct_in_code_internal235);
                    typedef_struct8=typedef_struct();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef_struct8.getTree());

                    }
                    break;
                case 8 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:67:4: declarations
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declarations_in_code_internal240);
                    declarations9=declarations();

                    state._fsp--;

                    adaptor.addChild(root_0, declarations9.getTree());

                    }
                    break;
                case 9 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:68:4: garbage
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_garbage_in_code_internal245);
                    garbage10=garbage();

                    state._fsp--;

                    adaptor.addChild(root_0, garbage10.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "code_internal"


    public static class garbage_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "garbage"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:71:1: garbage : ( '_NSWINDOWS_DLL_GOOP' | '__declspec' '(' 'dllimport' ')' );
    public final ObjchParser.garbage_return garbage() throws RecognitionException {
        ObjchParser.garbage_return retval = new ObjchParser.garbage_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal11=null;
        Token string_literal12=null;
        Token char_literal13=null;
        Token string_literal14=null;
        Token char_literal15=null;

        Object string_literal11_tree=null;
        Object string_literal12_tree=null;
        Object char_literal13_tree=null;
        Object string_literal14_tree=null;
        Object char_literal15_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:71:9: ( '_NSWINDOWS_DLL_GOOP' | '__declspec' '(' 'dllimport' ')' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==73) ) {
                alt3=1;
            }
            else if ( (LA3_0==75) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:71:11: '_NSWINDOWS_DLL_GOOP'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal11=(Token)match(input,73,FOLLOW_73_in_garbage257); 
                    string_literal11_tree = 
                    (Object)adaptor.create(string_literal11)
                    ;
                    adaptor.addChild(root_0, string_literal11_tree);


                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:72:4: '__declspec' '(' 'dllimport' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal12=(Token)match(input,75,FOLLOW_75_in_garbage262); 
                    string_literal12_tree = 
                    (Object)adaptor.create(string_literal12)
                    ;
                    adaptor.addChild(root_0, string_literal12_tree);


                    char_literal13=(Token)match(input,47,FOLLOW_47_in_garbage264); 
                    char_literal13_tree = 
                    (Object)adaptor.create(char_literal13)
                    ;
                    adaptor.addChild(root_0, char_literal13_tree);


                    string_literal14=(Token)match(input,80,FOLLOW_80_in_garbage266); 
                    string_literal14_tree = 
                    (Object)adaptor.create(string_literal14)
                    ;
                    adaptor.addChild(root_0, string_literal14_tree);


                    char_literal15=(Token)match(input,48,FOLLOW_48_in_garbage268); 
                    char_literal15_tree = 
                    (Object)adaptor.create(char_literal15)
                    ;
                    adaptor.addChild(root_0, char_literal15_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "garbage"


    public static class enum_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enum_wrapper"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:75:1: enum_wrapper : enum_declaration ';' -> ^( ENUM enum_declaration ) ;
    public final ObjchParser.enum_wrapper_return enum_wrapper() throws RecognitionException {
        ObjchParser.enum_wrapper_return retval = new ObjchParser.enum_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal17=null;
        ObjchParser.enum_declaration_return enum_declaration16 =null;


        Object char_literal17_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleSubtreeStream stream_enum_declaration=new RewriteRuleSubtreeStream(adaptor,"rule enum_declaration");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:76:2: ( enum_declaration ';' -> ^( ENUM enum_declaration ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:76:4: enum_declaration ';'
            {
            pushFollow(FOLLOW_enum_declaration_in_enum_wrapper282);
            enum_declaration16=enum_declaration();

            state._fsp--;

            stream_enum_declaration.add(enum_declaration16.getTree());

            char_literal17=(Token)match(input,55,FOLLOW_55_in_enum_wrapper284);  
            stream_55.add(char_literal17);


            // AST REWRITE
            // elements: enum_declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 76:25: -> ^( ENUM enum_declaration )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:76:28: ^( ENUM enum_declaration )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ENUM, "ENUM")
                , root_1);

                adaptor.addChild(root_1, stream_enum_declaration.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "enum_wrapper"


    public static class extern_declarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "extern_declarations"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:78:1: extern_declarations : ( extern_declatation )+ -> ( ^( EXTERN extern_declatation ) )+ ;
    public final ObjchParser.extern_declarations_return extern_declarations() throws RecognitionException {
        ObjchParser.extern_declarations_return retval = new ObjchParser.extern_declarations_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.extern_declatation_return extern_declatation18 =null;


        RewriteRuleSubtreeStream stream_extern_declatation=new RewriteRuleSubtreeStream(adaptor,"rule extern_declatation");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:79:2: ( ( extern_declatation )+ -> ( ^( EXTERN extern_declatation ) )+ )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:79:4: ( extern_declatation )+
            {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:79:4: ( extern_declatation )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==82) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:79:4: extern_declatation
            	    {
            	    pushFollow(FOLLOW_extern_declatation_in_extern_declarations304);
            	    extern_declatation18=extern_declatation();

            	    state._fsp--;

            	    stream_extern_declatation.add(extern_declatation18.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            // AST REWRITE
            // elements: extern_declatation
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 79:24: -> ( ^( EXTERN extern_declatation ) )+
            {
                if ( !(stream_extern_declatation.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_extern_declatation.hasNext() ) {
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:79:27: ^( EXTERN extern_declatation )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot(
                    (Object)adaptor.create(EXTERN, "EXTERN")
                    , root_1);

                    adaptor.addChild(root_1, stream_extern_declatation.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_extern_declatation.reset();

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "extern_declarations"


    public static class declarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declarations"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:81:1: declarations : ( ( optional_prefix )? method_declaration_wrapper | ( property_prefix )? ( optional_prefix )? field_declaration_wrapper | ns_inline (~ '{' )+ (~ '}' )+ '}' );
    public final ObjchParser.declarations_return declarations() throws RecognitionException {
        ObjchParser.declarations_return retval = new ObjchParser.declarations_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set25=null;
        Token set26=null;
        Token char_literal27=null;
        ObjchParser.optional_prefix_return optional_prefix19 =null;

        ObjchParser.method_declaration_wrapper_return method_declaration_wrapper20 =null;

        ObjchParser.property_prefix_return property_prefix21 =null;

        ObjchParser.optional_prefix_return optional_prefix22 =null;

        ObjchParser.field_declaration_wrapper_return field_declaration_wrapper23 =null;

        ObjchParser.ns_inline_return ns_inline24 =null;


        Object set25_tree=null;
        Object set26_tree=null;
        Object char_literal27_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:82:2: ( ( optional_prefix )? method_declaration_wrapper | ( property_prefix )? ( optional_prefix )? field_declaration_wrapper | ns_inline (~ '{' )+ (~ '}' )+ '}' )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==50||LA10_1==52) ) {
                    alt10=1;
                }
                else if ( (LA10_1==ID||LA10_1==76||LA10_1==78||LA10_1==81||(LA10_1 >= 84 && LA10_1 <= 86)||(LA10_1 >= 91 && LA10_1 <= 93)||LA10_1==95) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;

                }
                }
                break;
            case 50:
            case 52:
                {
                alt10=1;
                }
                break;
            case ID:
            case 66:
            case 76:
            case 78:
            case 81:
            case 84:
            case 85:
            case 86:
            case 91:
            case 92:
            case 93:
            case 95:
                {
                alt10=2;
                }
                break;
            case 70:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:82:4: ( optional_prefix )? method_declaration_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:82:4: ( optional_prefix )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==64) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:82:4: optional_prefix
                            {
                            pushFollow(FOLLOW_optional_prefix_in_declarations325);
                            optional_prefix19=optional_prefix();

                            state._fsp--;

                            adaptor.addChild(root_0, optional_prefix19.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_method_declaration_wrapper_in_declarations328);
                    method_declaration_wrapper20=method_declaration_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, method_declaration_wrapper20.getTree());

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:83:4: ( property_prefix )? ( optional_prefix )? field_declaration_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:83:4: ( property_prefix )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==66) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:83:4: property_prefix
                            {
                            pushFollow(FOLLOW_property_prefix_in_declarations333);
                            property_prefix21=property_prefix();

                            state._fsp--;

                            adaptor.addChild(root_0, property_prefix21.getTree());

                            }
                            break;

                    }


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:83:21: ( optional_prefix )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==64) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:83:21: optional_prefix
                            {
                            pushFollow(FOLLOW_optional_prefix_in_declarations336);
                            optional_prefix22=optional_prefix();

                            state._fsp--;

                            adaptor.addChild(root_0, optional_prefix22.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_field_declaration_wrapper_in_declarations339);
                    field_declaration_wrapper23=field_declaration_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, field_declaration_wrapper23.getTree());

                    }
                    break;
                case 3 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:84:4: ns_inline (~ '{' )+ (~ '}' )+ '}'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ns_inline_in_declarations344);
                    ns_inline24=ns_inline();

                    state._fsp--;

                    adaptor.addChild(root_0, ns_inline24.getTree());

                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:84:14: (~ '{' )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0 >= ARCHIVE_DECLARATION && LA8_0 <= 95)||(LA8_0 >= 97 && LA8_0 <= 98)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:
                    	    {
                    	    set25=(Token)input.LT(1);

                    	    if ( (input.LA(1) >= ARCHIVE_DECLARATION && input.LA(1) <= 95)||(input.LA(1) >= 97 && input.LA(1) <= 98) ) {
                    	        input.consume();
                    	        adaptor.addChild(root_0, 
                    	        (Object)adaptor.create(set25)
                    	        );
                    	        state.errorRecovery=false;
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
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


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:84:20: (~ '}' )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0 >= ARCHIVE_DECLARATION && LA9_0 <= 97)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:
                    	    {
                    	    set26=(Token)input.LT(1);

                    	    if ( (input.LA(1) >= ARCHIVE_DECLARATION && input.LA(1) <= 97) ) {
                    	        input.consume();
                    	        adaptor.addChild(root_0, 
                    	        (Object)adaptor.create(set26)
                    	        );
                    	        state.errorRecovery=false;
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
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


                    char_literal27=(Token)match(input,98,FOLLOW_98_in_declarations354); 
                    char_literal27_tree = 
                    (Object)adaptor.create(char_literal27)
                    ;
                    adaptor.addChild(root_0, char_literal27_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declarations"


    public static class static_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "static_prefix"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:87:1: static_prefix : 'static' -> ^( T_STATIC 'static' ) ;
    public final ObjchParser.static_prefix_return static_prefix() throws RecognitionException {
        ObjchParser.static_prefix_return retval = new ObjchParser.static_prefix_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal28=null;

        Object string_literal28_tree=null;
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:88:2: ( 'static' -> ^( T_STATIC 'static' ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:88:4: 'static'
            {
            string_literal28=(Token)match(input,91,FOLLOW_91_in_static_prefix367);  
            stream_91.add(string_literal28);


            // AST REWRITE
            // elements: 91
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 88:13: -> ^( T_STATIC 'static' )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:88:16: ^( T_STATIC 'static' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_STATIC, "T_STATIC")
                , root_1);

                adaptor.addChild(root_1, 
                stream_91.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "static_prefix"


    public static class method_declaration_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "method_declaration_wrapper"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:90:1: method_declaration_wrapper : method_declaration -> ^( METHOD method_declaration ) ;
    public final ObjchParser.method_declaration_wrapper_return method_declaration_wrapper() throws RecognitionException {
        ObjchParser.method_declaration_wrapper_return retval = new ObjchParser.method_declaration_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.method_declaration_return method_declaration29 =null;


        RewriteRuleSubtreeStream stream_method_declaration=new RewriteRuleSubtreeStream(adaptor,"rule method_declaration");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:91:2: ( method_declaration -> ^( METHOD method_declaration ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:91:4: method_declaration
            {
            pushFollow(FOLLOW_method_declaration_in_method_declaration_wrapper386);
            method_declaration29=method_declaration();

            state._fsp--;

            stream_method_declaration.add(method_declaration29.getTree());

            // AST REWRITE
            // elements: method_declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 91:23: -> ^( METHOD method_declaration )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:91:26: ^( METHOD method_declaration )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(METHOD, "METHOD")
                , root_1);

                adaptor.addChild(root_1, stream_method_declaration.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "method_declaration_wrapper"


    public static class field_declaration_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "field_declaration_wrapper"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:93:1: field_declaration_wrapper : field_declaration -> ^( FIELD field_declaration ) ;
    public final ObjchParser.field_declaration_wrapper_return field_declaration_wrapper() throws RecognitionException {
        ObjchParser.field_declaration_wrapper_return retval = new ObjchParser.field_declaration_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.field_declaration_return field_declaration30 =null;


        RewriteRuleSubtreeStream stream_field_declaration=new RewriteRuleSubtreeStream(adaptor,"rule field_declaration");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:94:2: ( field_declaration -> ^( FIELD field_declaration ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:94:4: field_declaration
            {
            pushFollow(FOLLOW_field_declaration_in_field_declaration_wrapper404);
            field_declaration30=field_declaration();

            state._fsp--;

            stream_field_declaration.add(field_declaration30.getTree());

            // AST REWRITE
            // elements: field_declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 94:22: -> ^( FIELD field_declaration )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:94:25: ^( FIELD field_declaration )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FIELD, "FIELD")
                , root_1);

                adaptor.addChild(root_1, stream_field_declaration.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "field_declaration_wrapper"


    public static class property_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "property_prefix"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:96:1: property_prefix : '@property' '(' property_prefix_param ( ',' property_prefix_param )* ')' ;
    public final ObjchParser.property_prefix_return property_prefix() throws RecognitionException {
        ObjchParser.property_prefix_return retval = new ObjchParser.property_prefix_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal31=null;
        Token char_literal32=null;
        Token char_literal34=null;
        Token char_literal36=null;
        ObjchParser.property_prefix_param_return property_prefix_param33 =null;

        ObjchParser.property_prefix_param_return property_prefix_param35 =null;


        Object string_literal31_tree=null;
        Object char_literal32_tree=null;
        Object char_literal34_tree=null;
        Object char_literal36_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:97:2: ( '@property' '(' property_prefix_param ( ',' property_prefix_param )* ')' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:97:4: '@property' '(' property_prefix_param ( ',' property_prefix_param )* ')'
            {
            root_0 = (Object)adaptor.nil();


            string_literal31=(Token)match(input,66,FOLLOW_66_in_property_prefix422); 
            string_literal31_tree = 
            (Object)adaptor.create(string_literal31)
            ;
            adaptor.addChild(root_0, string_literal31_tree);


            char_literal32=(Token)match(input,47,FOLLOW_47_in_property_prefix424); 
            char_literal32_tree = 
            (Object)adaptor.create(char_literal32)
            ;
            adaptor.addChild(root_0, char_literal32_tree);


            pushFollow(FOLLOW_property_prefix_param_in_property_prefix426);
            property_prefix_param33=property_prefix_param();

            state._fsp--;

            adaptor.addChild(root_0, property_prefix_param33.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:97:42: ( ',' property_prefix_param )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==51) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:97:43: ',' property_prefix_param
            	    {
            	    char_literal34=(Token)match(input,51,FOLLOW_51_in_property_prefix429); 
            	    char_literal34_tree = 
            	    (Object)adaptor.create(char_literal34)
            	    ;
            	    adaptor.addChild(root_0, char_literal34_tree);


            	    pushFollow(FOLLOW_property_prefix_param_in_property_prefix431);
            	    property_prefix_param35=property_prefix_param();

            	    state._fsp--;

            	    adaptor.addChild(root_0, property_prefix_param35.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            char_literal36=(Token)match(input,48,FOLLOW_48_in_property_prefix435); 
            char_literal36_tree = 
            (Object)adaptor.create(char_literal36)
            ;
            adaptor.addChild(root_0, char_literal36_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "property_prefix"


    public static class optional_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "optional_prefix"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:99:1: optional_prefix : '@optional' ;
    public final ObjchParser.optional_prefix_return optional_prefix() throws RecognitionException {
        ObjchParser.optional_prefix_return retval = new ObjchParser.optional_prefix_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal37=null;

        Object string_literal37_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:100:2: ( '@optional' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:100:4: '@optional'
            {
            root_0 = (Object)adaptor.nil();


            string_literal37=(Token)match(input,64,FOLLOW_64_in_optional_prefix446); 
            string_literal37_tree = 
            (Object)adaptor.create(string_literal37)
            ;
            adaptor.addChild(root_0, string_literal37_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "optional_prefix"


    public static class ns_inline_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ns_inline"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:102:1: ns_inline : 'NS_INLINE' ;
    public final ObjchParser.ns_inline_return ns_inline() throws RecognitionException {
        ObjchParser.ns_inline_return retval = new ObjchParser.ns_inline_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal38=null;

        Object string_literal38_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:103:2: ( 'NS_INLINE' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:103:4: 'NS_INLINE'
            {
            root_0 = (Object)adaptor.nil();


            string_literal38=(Token)match(input,70,FOLLOW_70_in_ns_inline456); 
            string_literal38_tree = 
            (Object)adaptor.create(string_literal38)
            ;
            adaptor.addChild(root_0, string_literal38_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ns_inline"


    public static class property_prefix_param_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "property_prefix_param"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:105:1: property_prefix_param : ( 'retain' | 'readwrite' | 'readonly' | 'nonatomic' | 'assign' | 'copy' );
    public final ObjchParser.property_prefix_param_return property_prefix_param() throws RecognitionException {
        ObjchParser.property_prefix_param_return retval = new ObjchParser.property_prefix_param_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set39=null;

        Object set39_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:106:2: ( 'retain' | 'readwrite' | 'readonly' | 'nonatomic' | 'assign' | 'copy' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:
            {
            root_0 = (Object)adaptor.nil();


            set39=(Token)input.LT(1);

            if ( input.LA(1)==77||input.LA(1)==79||(input.LA(1) >= 87 && input.LA(1) <= 90) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set39)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "property_prefix_param"


    public static class interface_declaration_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interface_declaration_wrapper"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:114:1: interface_declaration_wrapper : interface_declaration -> ^( INTERFACE interface_declaration ) ;
    public final ObjchParser.interface_declaration_wrapper_return interface_declaration_wrapper() throws RecognitionException {
        ObjchParser.interface_declaration_wrapper_return retval = new ObjchParser.interface_declaration_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.interface_declaration_return interface_declaration40 =null;


        RewriteRuleSubtreeStream stream_interface_declaration=new RewriteRuleSubtreeStream(adaptor,"rule interface_declaration");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:115:2: ( interface_declaration -> ^( INTERFACE interface_declaration ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:115:4: interface_declaration
            {
            pushFollow(FOLLOW_interface_declaration_in_interface_declaration_wrapper504);
            interface_declaration40=interface_declaration();

            state._fsp--;

            stream_interface_declaration.add(interface_declaration40.getTree());

            // AST REWRITE
            // elements: interface_declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 115:26: -> ^( INTERFACE interface_declaration )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:115:29: ^( INTERFACE interface_declaration )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INTERFACE, "INTERFACE")
                , root_1);

                adaptor.addChild(root_1, stream_interface_declaration.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "interface_declaration_wrapper"


    public static class protocol_declaration_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "protocol_declaration_wrapper"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:117:1: protocol_declaration_wrapper : protocol_declaration -> ^( PROTOCOL protocol_declaration ) ;
    public final ObjchParser.protocol_declaration_wrapper_return protocol_declaration_wrapper() throws RecognitionException {
        ObjchParser.protocol_declaration_wrapper_return retval = new ObjchParser.protocol_declaration_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.protocol_declaration_return protocol_declaration41 =null;


        RewriteRuleSubtreeStream stream_protocol_declaration=new RewriteRuleSubtreeStream(adaptor,"rule protocol_declaration");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:118:2: ( protocol_declaration -> ^( PROTOCOL protocol_declaration ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:118:4: protocol_declaration
            {
            pushFollow(FOLLOW_protocol_declaration_in_protocol_declaration_wrapper522);
            protocol_declaration41=protocol_declaration();

            state._fsp--;

            stream_protocol_declaration.add(protocol_declaration41.getTree());

            // AST REWRITE
            // elements: protocol_declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 118:25: -> ^( PROTOCOL protocol_declaration )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:118:28: ^( PROTOCOL protocol_declaration )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PROTOCOL, "PROTOCOL")
                , root_1);

                adaptor.addChild(root_1, stream_protocol_declaration.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "protocol_declaration_wrapper"


    public static class typedef_declaration_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typedef_declaration_wrapper"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:120:1: typedef_declaration_wrapper : typedef_declaration -> ^( TYPEDEF typedef_declaration ) ;
    public final ObjchParser.typedef_declaration_wrapper_return typedef_declaration_wrapper() throws RecognitionException {
        ObjchParser.typedef_declaration_wrapper_return retval = new ObjchParser.typedef_declaration_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.typedef_declaration_return typedef_declaration42 =null;


        RewriteRuleSubtreeStream stream_typedef_declaration=new RewriteRuleSubtreeStream(adaptor,"rule typedef_declaration");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:121:2: ( typedef_declaration -> ^( TYPEDEF typedef_declaration ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:121:4: typedef_declaration
            {
            pushFollow(FOLLOW_typedef_declaration_in_typedef_declaration_wrapper539);
            typedef_declaration42=typedef_declaration();

            state._fsp--;

            stream_typedef_declaration.add(typedef_declaration42.getTree());

            // AST REWRITE
            // elements: typedef_declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 121:24: -> ^( TYPEDEF typedef_declaration )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:121:27: ^( TYPEDEF typedef_declaration )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TYPEDEF, "TYPEDEF")
                , root_1);

                adaptor.addChild(root_1, stream_typedef_declaration.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typedef_declaration_wrapper"


    public static class typedef_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typedef_declaration"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:123:1: typedef_declaration : 'typedef' typedef_internal ( typedef_name | func_pointer )? ( ';' )? ;
    public final ObjchParser.typedef_declaration_return typedef_declaration() throws RecognitionException {
        ObjchParser.typedef_declaration_return retval = new ObjchParser.typedef_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal43=null;
        Token char_literal47=null;
        ObjchParser.typedef_internal_return typedef_internal44 =null;

        ObjchParser.typedef_name_return typedef_name45 =null;

        ObjchParser.func_pointer_return func_pointer46 =null;


        Object string_literal43_tree=null;
        Object char_literal47_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:124:2: ( 'typedef' typedef_internal ( typedef_name | func_pointer )? ( ';' )? )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:124:4: 'typedef' typedef_internal ( typedef_name | func_pointer )? ( ';' )?
            {
            root_0 = (Object)adaptor.nil();


            string_literal43=(Token)match(input,93,FOLLOW_93_in_typedef_declaration556); 
            string_literal43_tree = 
            (Object)adaptor.create(string_literal43)
            ;
            adaptor.addChild(root_0, string_literal43_tree);


            pushFollow(FOLLOW_typedef_internal_in_typedef_declaration558);
            typedef_internal44=typedef_internal();

            state._fsp--;

            adaptor.addChild(root_0, typedef_internal44.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:124:31: ( typedef_name | func_pointer )?
            int alt12=3;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:124:32: typedef_name
                    {
                    pushFollow(FOLLOW_typedef_name_in_typedef_declaration561);
                    typedef_name45=typedef_name();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef_name45.getTree());

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:124:47: func_pointer
                    {
                    pushFollow(FOLLOW_func_pointer_in_typedef_declaration565);
                    func_pointer46=func_pointer();

                    state._fsp--;

                    adaptor.addChild(root_0, func_pointer46.getTree());

                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:124:62: ( ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==55) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:124:62: ';'
                    {
                    char_literal47=(Token)match(input,55,FOLLOW_55_in_typedef_declaration569); 
                    char_literal47_tree = 
                    (Object)adaptor.create(char_literal47)
                    ;
                    adaptor.addChild(root_0, char_literal47_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typedef_declaration"


    public static class func_pointer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "func_pointer"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:126:1: func_pointer : '(' ( '*' )* ID ')' '(' ( ID ( ( '*' )+ ID )? ( ',' ( ( ID ( ( '*' )+ ID )? ) | '...' ) )* )? ')' ;
    public final ObjchParser.func_pointer_return func_pointer() throws RecognitionException {
        ObjchParser.func_pointer_return retval = new ObjchParser.func_pointer_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal48=null;
        Token char_literal49=null;
        Token ID50=null;
        Token char_literal51=null;
        Token char_literal52=null;
        Token ID53=null;
        Token char_literal54=null;
        Token ID55=null;
        Token char_literal56=null;
        Token ID57=null;
        Token char_literal58=null;
        Token ID59=null;
        Token string_literal60=null;
        Token char_literal61=null;

        Object char_literal48_tree=null;
        Object char_literal49_tree=null;
        Object ID50_tree=null;
        Object char_literal51_tree=null;
        Object char_literal52_tree=null;
        Object ID53_tree=null;
        Object char_literal54_tree=null;
        Object ID55_tree=null;
        Object char_literal56_tree=null;
        Object ID57_tree=null;
        Object char_literal58_tree=null;
        Object ID59_tree=null;
        Object string_literal60_tree=null;
        Object char_literal61_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:127:2: ( '(' ( '*' )* ID ')' '(' ( ID ( ( '*' )+ ID )? ( ',' ( ( ID ( ( '*' )+ ID )? ) | '...' ) )* )? ')' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:127:4: '(' ( '*' )* ID ')' '(' ( ID ( ( '*' )+ ID )? ( ',' ( ( ID ( ( '*' )+ ID )? ) | '...' ) )* )? ')'
            {
            root_0 = (Object)adaptor.nil();


            char_literal48=(Token)match(input,47,FOLLOW_47_in_func_pointer580); 
            char_literal48_tree = 
            (Object)adaptor.create(char_literal48)
            ;
            adaptor.addChild(root_0, char_literal48_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:127:8: ( '*' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==49) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:127:8: '*'
            	    {
            	    char_literal49=(Token)match(input,49,FOLLOW_49_in_func_pointer582); 
            	    char_literal49_tree = 
            	    (Object)adaptor.create(char_literal49)
            	    ;
            	    adaptor.addChild(root_0, char_literal49_tree);


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            ID50=(Token)match(input,ID,FOLLOW_ID_in_func_pointer585); 
            ID50_tree = 
            (Object)adaptor.create(ID50)
            ;
            adaptor.addChild(root_0, ID50_tree);


            char_literal51=(Token)match(input,48,FOLLOW_48_in_func_pointer587); 
            char_literal51_tree = 
            (Object)adaptor.create(char_literal51)
            ;
            adaptor.addChild(root_0, char_literal51_tree);


            char_literal52=(Token)match(input,47,FOLLOW_47_in_func_pointer589); 
            char_literal52_tree = 
            (Object)adaptor.create(char_literal52)
            ;
            adaptor.addChild(root_0, char_literal52_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:127:24: ( ID ( ( '*' )+ ID )? ( ',' ( ( ID ( ( '*' )+ ID )? ) | '...' ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:127:25: ID ( ( '*' )+ ID )? ( ',' ( ( ID ( ( '*' )+ ID )? ) | '...' ) )*
                    {
                    ID53=(Token)match(input,ID,FOLLOW_ID_in_func_pointer592); 
                    ID53_tree = 
                    (Object)adaptor.create(ID53)
                    ;
                    adaptor.addChild(root_0, ID53_tree);


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:127:28: ( ( '*' )+ ID )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==49) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:127:29: ( '*' )+ ID
                            {
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:127:29: ( '*' )+
                            int cnt15=0;
                            loop15:
                            do {
                                int alt15=2;
                                int LA15_0 = input.LA(1);

                                if ( (LA15_0==49) ) {
                                    alt15=1;
                                }


                                switch (alt15) {
                            	case 1 :
                            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:127:29: '*'
                            	    {
                            	    char_literal54=(Token)match(input,49,FOLLOW_49_in_func_pointer595); 
                            	    char_literal54_tree = 
                            	    (Object)adaptor.create(char_literal54)
                            	    ;
                            	    adaptor.addChild(root_0, char_literal54_tree);


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt15 >= 1 ) break loop15;
                                        EarlyExitException eee =
                                            new EarlyExitException(15, input);
                                        throw eee;
                                }
                                cnt15++;
                            } while (true);


                            ID55=(Token)match(input,ID,FOLLOW_ID_in_func_pointer598); 
                            ID55_tree = 
                            (Object)adaptor.create(ID55)
                            ;
                            adaptor.addChild(root_0, ID55_tree);


                            }
                            break;

                    }


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:127:39: ( ',' ( ( ID ( ( '*' )+ ID )? ) | '...' ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==51) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:127:40: ',' ( ( ID ( ( '*' )+ ID )? ) | '...' )
                    	    {
                    	    char_literal56=(Token)match(input,51,FOLLOW_51_in_func_pointer603); 
                    	    char_literal56_tree = 
                    	    (Object)adaptor.create(char_literal56)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal56_tree);


                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:127:44: ( ( ID ( ( '*' )+ ID )? ) | '...' )
                    	    int alt19=2;
                    	    int LA19_0 = input.LA(1);

                    	    if ( (LA19_0==ID) ) {
                    	        alt19=1;
                    	    }
                    	    else if ( (LA19_0==53) ) {
                    	        alt19=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 19, 0, input);

                    	        throw nvae;

                    	    }
                    	    switch (alt19) {
                    	        case 1 :
                    	            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:127:45: ( ID ( ( '*' )+ ID )? )
                    	            {
                    	            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:127:45: ( ID ( ( '*' )+ ID )? )
                    	            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:127:46: ID ( ( '*' )+ ID )?
                    	            {
                    	            ID57=(Token)match(input,ID,FOLLOW_ID_in_func_pointer607); 
                    	            ID57_tree = 
                    	            (Object)adaptor.create(ID57)
                    	            ;
                    	            adaptor.addChild(root_0, ID57_tree);


                    	            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:127:49: ( ( '*' )+ ID )?
                    	            int alt18=2;
                    	            int LA18_0 = input.LA(1);

                    	            if ( (LA18_0==49) ) {
                    	                alt18=1;
                    	            }
                    	            switch (alt18) {
                    	                case 1 :
                    	                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:127:50: ( '*' )+ ID
                    	                    {
                    	                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:127:50: ( '*' )+
                    	                    int cnt17=0;
                    	                    loop17:
                    	                    do {
                    	                        int alt17=2;
                    	                        int LA17_0 = input.LA(1);

                    	                        if ( (LA17_0==49) ) {
                    	                            alt17=1;
                    	                        }


                    	                        switch (alt17) {
                    	                    	case 1 :
                    	                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:127:50: '*'
                    	                    	    {
                    	                    	    char_literal58=(Token)match(input,49,FOLLOW_49_in_func_pointer610); 
                    	                    	    char_literal58_tree = 
                    	                    	    (Object)adaptor.create(char_literal58)
                    	                    	    ;
                    	                    	    adaptor.addChild(root_0, char_literal58_tree);


                    	                    	    }
                    	                    	    break;

                    	                    	default :
                    	                    	    if ( cnt17 >= 1 ) break loop17;
                    	                                EarlyExitException eee =
                    	                                    new EarlyExitException(17, input);
                    	                                throw eee;
                    	                        }
                    	                        cnt17++;
                    	                    } while (true);


                    	                    ID59=(Token)match(input,ID,FOLLOW_ID_in_func_pointer613); 
                    	                    ID59_tree = 
                    	                    (Object)adaptor.create(ID59)
                    	                    ;
                    	                    adaptor.addChild(root_0, ID59_tree);


                    	                    }
                    	                    break;

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:127:63: '...'
                    	            {
                    	            string_literal60=(Token)match(input,53,FOLLOW_53_in_func_pointer620); 
                    	            string_literal60_tree = 
                    	            (Object)adaptor.create(string_literal60)
                    	            ;
                    	            adaptor.addChild(root_0, string_literal60_tree);


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }


            char_literal61=(Token)match(input,48,FOLLOW_48_in_func_pointer628); 
            char_literal61_tree = 
            (Object)adaptor.create(char_literal61)
            ;
            adaptor.addChild(root_0, char_literal61_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "func_pointer"


    public static class typedef_internal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typedef_internal"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:130:1: typedef_internal : ( typedef_enum_wrapper2 | typedef_rename | typedef_struct_wrapper | union_declaration_wrapper );
    public final ObjchParser.typedef_internal_return typedef_internal() throws RecognitionException {
        ObjchParser.typedef_internal_return retval = new ObjchParser.typedef_internal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.typedef_enum_wrapper2_return typedef_enum_wrapper262 =null;

        ObjchParser.typedef_rename_return typedef_rename63 =null;

        ObjchParser.typedef_struct_wrapper_return typedef_struct_wrapper64 =null;

        ObjchParser.union_declaration_wrapper_return union_declaration_wrapper65 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:131:2: ( typedef_enum_wrapper2 | typedef_rename | typedef_struct_wrapper | union_declaration_wrapper )
            int alt22=4;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt22=1;
                }
                break;
            case ID:
                {
                alt22=2;
                }
                break;
            case 92:
                {
                alt22=3;
                }
                break;
            case 94:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:131:4: typedef_enum_wrapper2
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedef_enum_wrapper2_in_typedef_internal640);
                    typedef_enum_wrapper262=typedef_enum_wrapper2();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef_enum_wrapper262.getTree());

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:132:5: typedef_rename
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedef_rename_in_typedef_internal647);
                    typedef_rename63=typedef_rename();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef_rename63.getTree());

                    }
                    break;
                case 3 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:133:5: typedef_struct_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedef_struct_wrapper_in_typedef_internal654);
                    typedef_struct_wrapper64=typedef_struct_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef_struct_wrapper64.getTree());

                    }
                    break;
                case 4 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:134:4: union_declaration_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_union_declaration_wrapper_in_typedef_internal659);
                    union_declaration_wrapper65=union_declaration_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, union_declaration_wrapper65.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typedef_internal"


    public static class union_declaration_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "union_declaration_wrapper"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:137:1: union_declaration_wrapper : union_declaration -> ^( UNION union_declaration ) ;
    public final ObjchParser.union_declaration_wrapper_return union_declaration_wrapper() throws RecognitionException {
        ObjchParser.union_declaration_wrapper_return retval = new ObjchParser.union_declaration_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.union_declaration_return union_declaration66 =null;


        RewriteRuleSubtreeStream stream_union_declaration=new RewriteRuleSubtreeStream(adaptor,"rule union_declaration");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:138:2: ( union_declaration -> ^( UNION union_declaration ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:138:4: union_declaration
            {
            pushFollow(FOLLOW_union_declaration_in_union_declaration_wrapper671);
            union_declaration66=union_declaration();

            state._fsp--;

            stream_union_declaration.add(union_declaration66.getTree());

            // AST REWRITE
            // elements: union_declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 138:22: -> ^( UNION union_declaration )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:138:25: ^( UNION union_declaration )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNION, "UNION")
                , root_1);

                adaptor.addChild(root_1, stream_union_declaration.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "union_declaration_wrapper"


    public static class union_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "union_declaration"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:140:1: union_declaration : 'union' '{' ( typedef_struct )+ '}' ( union_name )? ;
    public final ObjchParser.union_declaration_return union_declaration() throws RecognitionException {
        ObjchParser.union_declaration_return retval = new ObjchParser.union_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal67=null;
        Token char_literal68=null;
        Token char_literal70=null;
        ObjchParser.typedef_struct_return typedef_struct69 =null;

        ObjchParser.union_name_return union_name71 =null;


        Object string_literal67_tree=null;
        Object char_literal68_tree=null;
        Object char_literal70_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:141:2: ( 'union' '{' ( typedef_struct )+ '}' ( union_name )? )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:141:4: 'union' '{' ( typedef_struct )+ '}' ( union_name )?
            {
            root_0 = (Object)adaptor.nil();


            string_literal67=(Token)match(input,94,FOLLOW_94_in_union_declaration690); 
            string_literal67_tree = 
            (Object)adaptor.create(string_literal67)
            ;
            adaptor.addChild(root_0, string_literal67_tree);


            char_literal68=(Token)match(input,96,FOLLOW_96_in_union_declaration695); 
            char_literal68_tree = 
            (Object)adaptor.create(char_literal68)
            ;
            adaptor.addChild(root_0, char_literal68_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:143:4: ( typedef_struct )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==92) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:143:4: typedef_struct
            	    {
            	    pushFollow(FOLLOW_typedef_struct_in_union_declaration700);
            	    typedef_struct69=typedef_struct();

            	    state._fsp--;

            	    adaptor.addChild(root_0, typedef_struct69.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);


            char_literal70=(Token)match(input,98,FOLLOW_98_in_union_declaration705); 
            char_literal70_tree = 
            (Object)adaptor.create(char_literal70)
            ;
            adaptor.addChild(root_0, char_literal70_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:144:7: ( union_name )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:144:7: union_name
                    {
                    pushFollow(FOLLOW_union_name_in_union_declaration707);
                    union_name71=union_name();

                    state._fsp--;

                    adaptor.addChild(root_0, union_name71.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "union_declaration"


    public static class union_internal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "union_internal"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:147:1: union_internal : ( field_declaration_wrapper | typedef_struct_wrapper );
    public final ObjchParser.union_internal_return union_internal() throws RecognitionException {
        ObjchParser.union_internal_return retval = new ObjchParser.union_internal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.field_declaration_wrapper_return field_declaration_wrapper72 =null;

        ObjchParser.typedef_struct_wrapper_return typedef_struct_wrapper73 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:148:2: ( field_declaration_wrapper | typedef_struct_wrapper )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==ID||LA25_0==76||LA25_0==78||LA25_0==81||(LA25_0 >= 84 && LA25_0 <= 86)||LA25_0==91||LA25_0==93||LA25_0==95) ) {
                alt25=1;
            }
            else if ( (LA25_0==92) ) {
                switch ( input.LA(2) ) {
                case 85:
                case 86:
                case 95:
                    {
                    alt25=1;
                    }
                    break;
                case ID:
                    {
                    int LA25_15 = input.LA(3);

                    if ( (LA25_15==ID||LA25_15==47||LA25_15==49||LA25_15==56||LA25_15==71||LA25_15==78) ) {
                        alt25=1;
                    }
                    else if ( (LA25_15==96) ) {
                        alt25=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 15, input);

                        throw nvae;

                    }
                    }
                    break;
                case 96:
                    {
                    alt25=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 7, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:148:4: field_declaration_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_field_declaration_wrapper_in_union_internal721);
                    field_declaration_wrapper72=field_declaration_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, field_declaration_wrapper72.getTree());

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:149:4: typedef_struct_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedef_struct_wrapper_in_union_internal726);
                    typedef_struct_wrapper73=typedef_struct_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef_struct_wrapper73.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "union_internal"


    public static class typedef_rename_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typedef_rename"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:151:1: typedef_rename : ID ( '*' )* -> ^( OLD_NAME ID ) ;
    public final ObjchParser.typedef_rename_return typedef_rename() throws RecognitionException {
        ObjchParser.typedef_rename_return retval = new ObjchParser.typedef_rename_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID74=null;
        Token char_literal75=null;

        Object ID74_tree=null;
        Object char_literal75_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:152:2: ( ID ( '*' )* -> ^( OLD_NAME ID ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:152:4: ID ( '*' )*
            {
            ID74=(Token)match(input,ID,FOLLOW_ID_in_typedef_rename737);  
            stream_ID.add(ID74);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:152:7: ( '*' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==49) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:152:7: '*'
            	    {
            	    char_literal75=(Token)match(input,49,FOLLOW_49_in_typedef_rename739);  
            	    stream_49.add(char_literal75);


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 152:12: -> ^( OLD_NAME ID )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:152:15: ^( OLD_NAME ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(OLD_NAME, "OLD_NAME")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typedef_rename"


    public static class typedef_enum_wrapper2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typedef_enum_wrapper2"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:155:1: typedef_enum_wrapper2 : enum_declaration -> ^( ENUM enum_declaration ) ;
    public final ObjchParser.typedef_enum_wrapper2_return typedef_enum_wrapper2() throws RecognitionException {
        ObjchParser.typedef_enum_wrapper2_return retval = new ObjchParser.typedef_enum_wrapper2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.enum_declaration_return enum_declaration76 =null;


        RewriteRuleSubtreeStream stream_enum_declaration=new RewriteRuleSubtreeStream(adaptor,"rule enum_declaration");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:156:2: ( enum_declaration -> ^( ENUM enum_declaration ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:156:4: enum_declaration
            {
            pushFollow(FOLLOW_enum_declaration_in_typedef_enum_wrapper2762);
            enum_declaration76=enum_declaration();

            state._fsp--;

            stream_enum_declaration.add(enum_declaration76.getTree());

            // AST REWRITE
            // elements: enum_declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 156:21: -> ^( ENUM enum_declaration )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:156:24: ^( ENUM enum_declaration )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ENUM, "ENUM")
                , root_1);

                adaptor.addChild(root_1, stream_enum_declaration.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typedef_enum_wrapper2"


    public static class enum_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enum_declaration"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:158:1: enum_declaration : 'enum' ( struct_name )? '{' typedef_declaration_element_wrapper ( ',' typedef_declaration_element_wrapper )* ( ',' )? '}' ;
    public final ObjchParser.enum_declaration_return enum_declaration() throws RecognitionException {
        ObjchParser.enum_declaration_return retval = new ObjchParser.enum_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal77=null;
        Token char_literal79=null;
        Token char_literal81=null;
        Token char_literal83=null;
        Token char_literal84=null;
        ObjchParser.struct_name_return struct_name78 =null;

        ObjchParser.typedef_declaration_element_wrapper_return typedef_declaration_element_wrapper80 =null;

        ObjchParser.typedef_declaration_element_wrapper_return typedef_declaration_element_wrapper82 =null;


        Object string_literal77_tree=null;
        Object char_literal79_tree=null;
        Object char_literal81_tree=null;
        Object char_literal83_tree=null;
        Object char_literal84_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:159:2: ( 'enum' ( struct_name )? '{' typedef_declaration_element_wrapper ( ',' typedef_declaration_element_wrapper )* ( ',' )? '}' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:159:4: 'enum' ( struct_name )? '{' typedef_declaration_element_wrapper ( ',' typedef_declaration_element_wrapper )* ( ',' )? '}'
            {
            root_0 = (Object)adaptor.nil();


            string_literal77=(Token)match(input,81,FOLLOW_81_in_enum_declaration782); 
            string_literal77_tree = 
            (Object)adaptor.create(string_literal77)
            ;
            adaptor.addChild(root_0, string_literal77_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:159:11: ( struct_name )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:159:11: struct_name
                    {
                    pushFollow(FOLLOW_struct_name_in_enum_declaration784);
                    struct_name78=struct_name();

                    state._fsp--;

                    adaptor.addChild(root_0, struct_name78.getTree());

                    }
                    break;

            }


            char_literal79=(Token)match(input,96,FOLLOW_96_in_enum_declaration787); 
            char_literal79_tree = 
            (Object)adaptor.create(char_literal79)
            ;
            adaptor.addChild(root_0, char_literal79_tree);


            pushFollow(FOLLOW_typedef_declaration_element_wrapper_in_enum_declaration789);
            typedef_declaration_element_wrapper80=typedef_declaration_element_wrapper();

            state._fsp--;

            adaptor.addChild(root_0, typedef_declaration_element_wrapper80.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:159:64: ( ',' typedef_declaration_element_wrapper )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==51) ) {
                    int LA28_1 = input.LA(2);

                    if ( (LA28_1==ID||LA28_1==NUMBER||LA28_1==47) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:159:65: ',' typedef_declaration_element_wrapper
            	    {
            	    char_literal81=(Token)match(input,51,FOLLOW_51_in_enum_declaration792); 
            	    char_literal81_tree = 
            	    (Object)adaptor.create(char_literal81)
            	    ;
            	    adaptor.addChild(root_0, char_literal81_tree);


            	    pushFollow(FOLLOW_typedef_declaration_element_wrapper_in_enum_declaration794);
            	    typedef_declaration_element_wrapper82=typedef_declaration_element_wrapper();

            	    state._fsp--;

            	    adaptor.addChild(root_0, typedef_declaration_element_wrapper82.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:159:107: ( ',' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==51) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:159:107: ','
                    {
                    char_literal83=(Token)match(input,51,FOLLOW_51_in_enum_declaration798); 
                    char_literal83_tree = 
                    (Object)adaptor.create(char_literal83)
                    ;
                    adaptor.addChild(root_0, char_literal83_tree);


                    }
                    break;

            }


            char_literal84=(Token)match(input,98,FOLLOW_98_in_enum_declaration801); 
            char_literal84_tree = 
            (Object)adaptor.create(char_literal84)
            ;
            adaptor.addChild(root_0, char_literal84_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "enum_declaration"


    public static class typedef_struct_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typedef_struct_wrapper"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:161:1: typedef_struct_wrapper : typedef_struct -> ^( STRUCT typedef_struct ) ;
    public final ObjchParser.typedef_struct_wrapper_return typedef_struct_wrapper() throws RecognitionException {
        ObjchParser.typedef_struct_wrapper_return retval = new ObjchParser.typedef_struct_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.typedef_struct_return typedef_struct85 =null;


        RewriteRuleSubtreeStream stream_typedef_struct=new RewriteRuleSubtreeStream(adaptor,"rule typedef_struct");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:162:2: ( typedef_struct -> ^( STRUCT typedef_struct ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:162:4: typedef_struct
            {
            pushFollow(FOLLOW_typedef_struct_in_typedef_struct_wrapper812);
            typedef_struct85=typedef_struct();

            state._fsp--;

            stream_typedef_struct.add(typedef_struct85.getTree());

            // AST REWRITE
            // elements: typedef_struct
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 162:19: -> ^( STRUCT typedef_struct )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:162:22: ^( STRUCT typedef_struct )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(STRUCT, "STRUCT")
                , root_1);

                adaptor.addChild(root_1, stream_typedef_struct.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typedef_struct_wrapper"


    public static class typedef_struct_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typedef_struct"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:164:1: typedef_struct : 'struct' ( typedef_name )? '{' ( struct_field_wrapper )+ '}' ( struct_name ( ',' struct_name )* )? ( ';' )? ;
    public final ObjchParser.typedef_struct_return typedef_struct() throws RecognitionException {
        ObjchParser.typedef_struct_return retval = new ObjchParser.typedef_struct_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal86=null;
        Token char_literal88=null;
        Token char_literal90=null;
        Token char_literal92=null;
        Token char_literal94=null;
        ObjchParser.typedef_name_return typedef_name87 =null;

        ObjchParser.struct_field_wrapper_return struct_field_wrapper89 =null;

        ObjchParser.struct_name_return struct_name91 =null;

        ObjchParser.struct_name_return struct_name93 =null;


        Object string_literal86_tree=null;
        Object char_literal88_tree=null;
        Object char_literal90_tree=null;
        Object char_literal92_tree=null;
        Object char_literal94_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:165:2: ( 'struct' ( typedef_name )? '{' ( struct_field_wrapper )+ '}' ( struct_name ( ',' struct_name )* )? ( ';' )? )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:165:4: 'struct' ( typedef_name )? '{' ( struct_field_wrapper )+ '}' ( struct_name ( ',' struct_name )* )? ( ';' )?
            {
            root_0 = (Object)adaptor.nil();


            string_literal86=(Token)match(input,92,FOLLOW_92_in_typedef_struct830); 
            string_literal86_tree = 
            (Object)adaptor.create(string_literal86)
            ;
            adaptor.addChild(root_0, string_literal86_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:165:13: ( typedef_name )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:165:13: typedef_name
                    {
                    pushFollow(FOLLOW_typedef_name_in_typedef_struct832);
                    typedef_name87=typedef_name();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef_name87.getTree());

                    }
                    break;

            }


            char_literal88=(Token)match(input,96,FOLLOW_96_in_typedef_struct837); 
            char_literal88_tree = 
            (Object)adaptor.create(char_literal88)
            ;
            adaptor.addChild(root_0, char_literal88_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:167:4: ( struct_field_wrapper )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==ID||LA31_0==78||LA31_0==81||(LA31_0 >= 85 && LA31_0 <= 86)||(LA31_0 >= 92 && LA31_0 <= 93)||LA31_0==95) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:167:4: struct_field_wrapper
            	    {
            	    pushFollow(FOLLOW_struct_field_wrapper_in_typedef_struct842);
            	    struct_field_wrapper89=struct_field_wrapper();

            	    state._fsp--;

            	    adaptor.addChild(root_0, struct_field_wrapper89.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);


            char_literal90=(Token)match(input,98,FOLLOW_98_in_typedef_struct847); 
            char_literal90_tree = 
            (Object)adaptor.create(char_literal90)
            ;
            adaptor.addChild(root_0, char_literal90_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:168:7: ( struct_name ( ',' struct_name )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==ID) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:168:8: struct_name ( ',' struct_name )*
                    {
                    pushFollow(FOLLOW_struct_name_in_typedef_struct850);
                    struct_name91=struct_name();

                    state._fsp--;

                    adaptor.addChild(root_0, struct_name91.getTree());

                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:168:20: ( ',' struct_name )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==51) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:168:21: ',' struct_name
                    	    {
                    	    char_literal92=(Token)match(input,51,FOLLOW_51_in_typedef_struct853); 
                    	    char_literal92_tree = 
                    	    (Object)adaptor.create(char_literal92)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal92_tree);


                    	    pushFollow(FOLLOW_struct_name_in_typedef_struct855);
                    	    struct_name93=struct_name();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, struct_name93.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:168:41: ( ';' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==55) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:168:41: ';'
                    {
                    char_literal94=(Token)match(input,55,FOLLOW_55_in_typedef_struct861); 
                    char_literal94_tree = 
                    (Object)adaptor.create(char_literal94)
                    ;
                    adaptor.addChild(root_0, char_literal94_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typedef_struct"


    public static class struct_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "struct_name"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:171:1: struct_name : ID -> ^( NAME ID ) ;
    public final ObjchParser.struct_name_return struct_name() throws RecognitionException {
        ObjchParser.struct_name_return retval = new ObjchParser.struct_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID95=null;

        Object ID95_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:172:2: ( ID -> ^( NAME ID ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:172:4: ID
            {
            ID95=(Token)match(input,ID,FOLLOW_ID_in_struct_name874);  
            stream_ID.add(ID95);


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 172:7: -> ^( NAME ID )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:172:10: ^( NAME ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(NAME, "NAME")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "struct_name"


    public static class struct_field_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "struct_field_wrapper"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:174:1: struct_field_wrapper : struct_field -> ^( FIELD struct_field ) ;
    public final ObjchParser.struct_field_wrapper_return struct_field_wrapper() throws RecognitionException {
        ObjchParser.struct_field_wrapper_return retval = new ObjchParser.struct_field_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.struct_field_return struct_field96 =null;


        RewriteRuleSubtreeStream stream_struct_field=new RewriteRuleSubtreeStream(adaptor,"rule struct_field");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:175:2: ( struct_field -> ^( FIELD struct_field ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:175:4: struct_field
            {
            pushFollow(FOLLOW_struct_field_in_struct_field_wrapper892);
            struct_field96=struct_field();

            state._fsp--;

            stream_struct_field.add(struct_field96.getTree());

            // AST REWRITE
            // elements: struct_field
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 175:17: -> ^( FIELD struct_field )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:175:20: ^( FIELD struct_field )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FIELD, "FIELD")
                , root_1);

                adaptor.addChild(root_1, stream_struct_field.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "struct_field_wrapper"


    public static class struct_field_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "struct_field"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:177:1: struct_field : ( struct_field1 | struct_field2 );
    public final ObjchParser.struct_field_return struct_field() throws RecognitionException {
        ObjchParser.struct_field_return retval = new ObjchParser.struct_field_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.struct_field1_return struct_field197 =null;

        ObjchParser.struct_field2_return struct_field298 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:178:2: ( struct_field1 | struct_field2 )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==ID||LA35_0==78||LA35_0==81||(LA35_0 >= 85 && LA35_0 <= 86)||LA35_0==93||LA35_0==95) ) {
                alt35=1;
            }
            else if ( (LA35_0==92) ) {
                switch ( input.LA(2) ) {
                case 85:
                case 86:
                case 95:
                    {
                    alt35=1;
                    }
                    break;
                case ID:
                    {
                    int LA35_12 = input.LA(3);

                    if ( (LA35_12==ID||LA35_12==49||LA35_12==56||LA35_12==71||LA35_12==78) ) {
                        alt35=1;
                    }
                    else if ( (LA35_12==96) ) {
                        alt35=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 12, input);

                        throw nvae;

                    }
                    }
                    break;
                case 96:
                    {
                    alt35=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 4, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }
            switch (alt35) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:178:4: struct_field1
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_struct_field1_in_struct_field910);
                    struct_field197=struct_field1();

                    state._fsp--;

                    adaptor.addChild(root_0, struct_field197.getTree());

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:179:4: struct_field2
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_struct_field2_in_struct_field915);
                    struct_field298=struct_field2();

                    state._fsp--;

                    adaptor.addChild(root_0, struct_field298.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "struct_field"


    public static class struct_field1_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "struct_field1"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:182:1: struct_field1 : type_declaration field_name ( ',' field_name )* ';' ;
    public final ObjchParser.struct_field1_return struct_field1() throws RecognitionException {
        ObjchParser.struct_field1_return retval = new ObjchParser.struct_field1_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal101=null;
        Token char_literal103=null;
        ObjchParser.type_declaration_return type_declaration99 =null;

        ObjchParser.field_name_return field_name100 =null;

        ObjchParser.field_name_return field_name102 =null;


        Object char_literal101_tree=null;
        Object char_literal103_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:183:2: ( type_declaration field_name ( ',' field_name )* ';' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:183:4: type_declaration field_name ( ',' field_name )* ';'
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_declaration_in_struct_field1927);
            type_declaration99=type_declaration();

            state._fsp--;

            adaptor.addChild(root_0, type_declaration99.getTree());

            pushFollow(FOLLOW_field_name_in_struct_field1929);
            field_name100=field_name();

            state._fsp--;

            adaptor.addChild(root_0, field_name100.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:183:32: ( ',' field_name )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==51) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:183:33: ',' field_name
            	    {
            	    char_literal101=(Token)match(input,51,FOLLOW_51_in_struct_field1932); 
            	    char_literal101_tree = 
            	    (Object)adaptor.create(char_literal101)
            	    ;
            	    adaptor.addChild(root_0, char_literal101_tree);


            	    pushFollow(FOLLOW_field_name_in_struct_field1934);
            	    field_name102=field_name();

            	    state._fsp--;

            	    adaptor.addChild(root_0, field_name102.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            char_literal103=(Token)match(input,55,FOLLOW_55_in_struct_field1938); 
            char_literal103_tree = 
            (Object)adaptor.create(char_literal103)
            ;
            adaptor.addChild(root_0, char_literal103_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "struct_field1"


    public static class struct_field2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "struct_field2"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:185:1: struct_field2 : typedef_struct ;
    public final ObjchParser.struct_field2_return struct_field2() throws RecognitionException {
        ObjchParser.struct_field2_return retval = new ObjchParser.struct_field2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.typedef_struct_return typedef_struct104 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:186:2: ( typedef_struct )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:186:4: typedef_struct
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_typedef_struct_in_struct_field2948);
            typedef_struct104=typedef_struct();

            state._fsp--;

            adaptor.addChild(root_0, typedef_struct104.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "struct_field2"


    public static class typedef_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typedef_name"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:188:1: typedef_name : ID -> ^( TYPEDEF_NAME ID ) ;
    public final ObjchParser.typedef_name_return typedef_name() throws RecognitionException {
        ObjchParser.typedef_name_return retval = new ObjchParser.typedef_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID105=null;

        Object ID105_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:189:2: ( ID -> ^( TYPEDEF_NAME ID ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:189:4: ID
            {
            ID105=(Token)match(input,ID,FOLLOW_ID_in_typedef_name959);  
            stream_ID.add(ID105);


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 189:7: -> ^( TYPEDEF_NAME ID )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:189:10: ^( TYPEDEF_NAME ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TYPEDEF_NAME, "TYPEDEF_NAME")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typedef_name"


    public static class typedef_declaration_element_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typedef_declaration_element_wrapper"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:191:1: typedef_declaration_element_wrapper : typedef_declaration_element -> ^( TYPEDEF_ELEMENT typedef_declaration_element ) ;
    public final ObjchParser.typedef_declaration_element_wrapper_return typedef_declaration_element_wrapper() throws RecognitionException {
        ObjchParser.typedef_declaration_element_wrapper_return retval = new ObjchParser.typedef_declaration_element_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.typedef_declaration_element_return typedef_declaration_element106 =null;


        RewriteRuleSubtreeStream stream_typedef_declaration_element=new RewriteRuleSubtreeStream(adaptor,"rule typedef_declaration_element");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:192:2: ( typedef_declaration_element -> ^( TYPEDEF_ELEMENT typedef_declaration_element ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:192:4: typedef_declaration_element
            {
            pushFollow(FOLLOW_typedef_declaration_element_in_typedef_declaration_element_wrapper976);
            typedef_declaration_element106=typedef_declaration_element();

            state._fsp--;

            stream_typedef_declaration_element.add(typedef_declaration_element106.getTree());

            // AST REWRITE
            // elements: typedef_declaration_element
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 192:32: -> ^( TYPEDEF_ELEMENT typedef_declaration_element )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:192:35: ^( TYPEDEF_ELEMENT typedef_declaration_element )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TYPEDEF_ELEMENT, "TYPEDEF_ELEMENT")
                , root_1);

                adaptor.addChild(root_1, stream_typedef_declaration_element.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typedef_declaration_element_wrapper"


    public static class typedef_declaration_element_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typedef_declaration_element"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:195:1: typedef_declaration_element : ( ID ( '=' element_value )? | element_value ( '=' element_value )? );
    public final ObjchParser.typedef_declaration_element_return typedef_declaration_element() throws RecognitionException {
        ObjchParser.typedef_declaration_element_return retval = new ObjchParser.typedef_declaration_element_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID107=null;
        Token char_literal108=null;
        Token char_literal111=null;
        ObjchParser.element_value_return element_value109 =null;

        ObjchParser.element_value_return element_value110 =null;

        ObjchParser.element_value_return element_value112 =null;


        Object ID107_tree=null;
        Object char_literal108_tree=null;
        Object char_literal111_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:196:2: ( ID ( '=' element_value )? | element_value ( '=' element_value )? )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==ID) ) {
                alt39=1;
            }
            else if ( (LA39_0==NUMBER||LA39_0==47) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }
            switch (alt39) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:196:4: ID ( '=' element_value )?
                    {
                    root_0 = (Object)adaptor.nil();


                    ID107=(Token)match(input,ID,FOLLOW_ID_in_typedef_declaration_element996); 
                    ID107_tree = 
                    (Object)adaptor.create(ID107)
                    ;
                    adaptor.addChild(root_0, ID107_tree);


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:196:7: ( '=' element_value )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==58) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:196:8: '=' element_value
                            {
                            char_literal108=(Token)match(input,58,FOLLOW_58_in_typedef_declaration_element999); 
                            char_literal108_tree = 
                            (Object)adaptor.create(char_literal108)
                            ;
                            adaptor.addChild(root_0, char_literal108_tree);


                            pushFollow(FOLLOW_element_value_in_typedef_declaration_element1001);
                            element_value109=element_value();

                            state._fsp--;

                            adaptor.addChild(root_0, element_value109.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:197:4: element_value ( '=' element_value )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_element_value_in_typedef_declaration_element1008);
                    element_value110=element_value();

                    state._fsp--;

                    adaptor.addChild(root_0, element_value110.getTree());

                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:197:18: ( '=' element_value )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==58) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:197:19: '=' element_value
                            {
                            char_literal111=(Token)match(input,58,FOLLOW_58_in_typedef_declaration_element1011); 
                            char_literal111_tree = 
                            (Object)adaptor.create(char_literal111)
                            ;
                            adaptor.addChild(root_0, char_literal111_tree);


                            pushFollow(FOLLOW_element_value_in_typedef_declaration_element1013);
                            element_value112=element_value();

                            state._fsp--;

                            adaptor.addChild(root_0, element_value112.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typedef_declaration_element"


    public static class element_value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "element_value"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:200:1: element_value : simple_expression -> ^( VALUE simple_expression ) ;
    public final ObjchParser.element_value_return element_value() throws RecognitionException {
        ObjchParser.element_value_return retval = new ObjchParser.element_value_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.simple_expression_return simple_expression113 =null;


        RewriteRuleSubtreeStream stream_simple_expression=new RewriteRuleSubtreeStream(adaptor,"rule simple_expression");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:201:2: ( simple_expression -> ^( VALUE simple_expression ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:201:4: simple_expression
            {
            pushFollow(FOLLOW_simple_expression_in_element_value1027);
            simple_expression113=simple_expression();

            state._fsp--;

            stream_simple_expression.add(simple_expression113.getTree());

            // AST REWRITE
            // elements: simple_expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 201:22: -> ^( VALUE simple_expression )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:201:25: ^( VALUE simple_expression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VALUE, "VALUE")
                , root_1);

                adaptor.addChild(root_1, stream_simple_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "element_value"


    public static class simple_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simple_expression"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:204:1: simple_expression : simple_expression2 ( op2 simple_expression2 )* ;
    public final ObjchParser.simple_expression_return simple_expression() throws RecognitionException {
        ObjchParser.simple_expression_return retval = new ObjchParser.simple_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.simple_expression2_return simple_expression2114 =null;

        ObjchParser.op2_return op2115 =null;

        ObjchParser.simple_expression2_return simple_expression2116 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:205:2: ( simple_expression2 ( op2 simple_expression2 )* )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:205:4: simple_expression2 ( op2 simple_expression2 )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_simple_expression2_in_simple_expression1048);
            simple_expression2114=simple_expression2();

            state._fsp--;

            adaptor.addChild(root_0, simple_expression2114.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:205:23: ( op2 simple_expression2 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0 >= 45 && LA40_0 <= 46)||LA40_0==57||LA40_0==60||LA40_0==97) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:205:25: op2 simple_expression2
            	    {
            	    pushFollow(FOLLOW_op2_in_simple_expression1052);
            	    op2115=op2();

            	    state._fsp--;

            	    adaptor.addChild(root_0, op2115.getTree());

            	    pushFollow(FOLLOW_simple_expression2_in_simple_expression1054);
            	    simple_expression2116=simple_expression2();

            	    state._fsp--;

            	    adaptor.addChild(root_0, simple_expression2116.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "simple_expression"


    public static class simple_expression2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simple_expression2"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:208:1: simple_expression2 : ( ID | NUMBER | '(' simple_expression ')' );
    public final ObjchParser.simple_expression2_return simple_expression2() throws RecognitionException {
        ObjchParser.simple_expression2_return retval = new ObjchParser.simple_expression2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID117=null;
        Token NUMBER118=null;
        Token char_literal119=null;
        Token char_literal121=null;
        ObjchParser.simple_expression_return simple_expression120 =null;


        Object ID117_tree=null;
        Object NUMBER118_tree=null;
        Object char_literal119_tree=null;
        Object char_literal121_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:209:2: ( ID | NUMBER | '(' simple_expression ')' )
            int alt41=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt41=1;
                }
                break;
            case NUMBER:
                {
                alt41=2;
                }
                break;
            case 47:
                {
                alt41=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;

            }

            switch (alt41) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:209:4: ID
                    {
                    root_0 = (Object)adaptor.nil();


                    ID117=(Token)match(input,ID,FOLLOW_ID_in_simple_expression21068); 
                    ID117_tree = 
                    (Object)adaptor.create(ID117)
                    ;
                    adaptor.addChild(root_0, ID117_tree);


                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:210:4: NUMBER
                    {
                    root_0 = (Object)adaptor.nil();


                    NUMBER118=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_simple_expression21073); 
                    NUMBER118_tree = 
                    (Object)adaptor.create(NUMBER118)
                    ;
                    adaptor.addChild(root_0, NUMBER118_tree);


                    }
                    break;
                case 3 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:211:4: '(' simple_expression ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal119=(Token)match(input,47,FOLLOW_47_in_simple_expression21078); 
                    char_literal119_tree = 
                    (Object)adaptor.create(char_literal119)
                    ;
                    adaptor.addChild(root_0, char_literal119_tree);


                    pushFollow(FOLLOW_simple_expression_in_simple_expression21080);
                    simple_expression120=simple_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, simple_expression120.getTree());

                    char_literal121=(Token)match(input,48,FOLLOW_48_in_simple_expression21082); 
                    char_literal121_tree = 
                    (Object)adaptor.create(char_literal121)
                    ;
                    adaptor.addChild(root_0, char_literal121_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "simple_expression2"


    public static class op2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "op2"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:213:1: op2 : ( '|' | '&~' | '&' | '<<' | '>>' );
    public final ObjchParser.op2_return op2() throws RecognitionException {
        ObjchParser.op2_return retval = new ObjchParser.op2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set122=null;

        Object set122_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:213:5: ( '|' | '&~' | '&' | '<<' | '>>' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:
            {
            root_0 = (Object)adaptor.nil();


            set122=(Token)input.LT(1);

            if ( (input.LA(1) >= 45 && input.LA(1) <= 46)||input.LA(1)==57||input.LA(1)==60||input.LA(1)==97 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set122)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "op2"


    public static class class_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "class_declaration"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:215:1: class_declaration : '@class' ID ( ',' ID )* ';' ;
    public final ObjchParser.class_declaration_return class_declaration() throws RecognitionException {
        ObjchParser.class_declaration_return retval = new ObjchParser.class_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal123=null;
        Token ID124=null;
        Token char_literal125=null;
        Token ID126=null;
        Token char_literal127=null;

        Object string_literal123_tree=null;
        Object ID124_tree=null;
        Object char_literal125_tree=null;
        Object ID126_tree=null;
        Object char_literal127_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:216:2: ( '@class' ID ( ',' ID )* ';' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:216:4: '@class' ID ( ',' ID )* ';'
            {
            root_0 = (Object)adaptor.nil();


            string_literal123=(Token)match(input,61,FOLLOW_61_in_class_declaration1117); 
            string_literal123_tree = 
            (Object)adaptor.create(string_literal123)
            ;
            adaptor.addChild(root_0, string_literal123_tree);


            ID124=(Token)match(input,ID,FOLLOW_ID_in_class_declaration1119); 
            ID124_tree = 
            (Object)adaptor.create(ID124)
            ;
            adaptor.addChild(root_0, ID124_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:216:16: ( ',' ID )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==51) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:216:17: ',' ID
            	    {
            	    char_literal125=(Token)match(input,51,FOLLOW_51_in_class_declaration1122); 
            	    char_literal125_tree = 
            	    (Object)adaptor.create(char_literal125)
            	    ;
            	    adaptor.addChild(root_0, char_literal125_tree);


            	    ID126=(Token)match(input,ID,FOLLOW_ID_in_class_declaration1124); 
            	    ID126_tree = 
            	    (Object)adaptor.create(ID126)
            	    ;
            	    adaptor.addChild(root_0, ID126_tree);


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            char_literal127=(Token)match(input,55,FOLLOW_55_in_class_declaration1128); 
            char_literal127_tree = 
            (Object)adaptor.create(char_literal127)
            ;
            adaptor.addChild(root_0, char_literal127_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "class_declaration"


    public static class protocol_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "protocol_declaration"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:218:1: protocol_declaration : '@protocol' protocol_name ( generic )? protocol_end ;
    public final ObjchParser.protocol_declaration_return protocol_declaration() throws RecognitionException {
        ObjchParser.protocol_declaration_return retval = new ObjchParser.protocol_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal128=null;
        ObjchParser.protocol_name_return protocol_name129 =null;

        ObjchParser.generic_return generic130 =null;

        ObjchParser.protocol_end_return protocol_end131 =null;


        Object string_literal128_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:219:2: ( '@protocol' protocol_name ( generic )? protocol_end )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:219:4: '@protocol' protocol_name ( generic )? protocol_end
            {
            root_0 = (Object)adaptor.nil();


            string_literal128=(Token)match(input,68,FOLLOW_68_in_protocol_declaration1138); 
            string_literal128_tree = 
            (Object)adaptor.create(string_literal128)
            ;
            adaptor.addChild(root_0, string_literal128_tree);


            pushFollow(FOLLOW_protocol_name_in_protocol_declaration1140);
            protocol_name129=protocol_name();

            state._fsp--;

            adaptor.addChild(root_0, protocol_name129.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:219:30: ( generic )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==56) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:219:30: generic
                    {
                    pushFollow(FOLLOW_generic_in_protocol_declaration1142);
                    generic130=generic();

                    state._fsp--;

                    adaptor.addChild(root_0, generic130.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_protocol_end_in_protocol_declaration1148);
            protocol_end131=protocol_end();

            state._fsp--;

            adaptor.addChild(root_0, protocol_end131.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "protocol_declaration"


    public static class protocol_end_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "protocol_end"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:223:1: protocol_end : ( protocol_end1 | protocol_end2 );
    public final ObjchParser.protocol_end_return protocol_end() throws RecognitionException {
        ObjchParser.protocol_end_return retval = new ObjchParser.protocol_end_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.protocol_end1_return protocol_end1132 =null;

        ObjchParser.protocol_end2_return protocol_end2133 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:224:2: ( protocol_end1 | protocol_end2 )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==ID||LA44_0==50||LA44_0==52||LA44_0==62||LA44_0==64||LA44_0==66||LA44_0==70||LA44_0==76||LA44_0==78||LA44_0==81||(LA44_0 >= 84 && LA44_0 <= 86)||(LA44_0 >= 91 && LA44_0 <= 93)||LA44_0==95) ) {
                alt44=1;
            }
            else if ( (LA44_0==55) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;

            }
            switch (alt44) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:224:4: protocol_end1
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_protocol_end1_in_protocol_end1160);
                    protocol_end1132=protocol_end1();

                    state._fsp--;

                    adaptor.addChild(root_0, protocol_end1132.getTree());

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:225:4: protocol_end2
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_protocol_end2_in_protocol_end1165);
                    protocol_end2133=protocol_end2();

                    state._fsp--;

                    adaptor.addChild(root_0, protocol_end2133.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "protocol_end"


    public static class protocol_end1_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "protocol_end1"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:227:1: protocol_end1 : ( declarations )* '@end' ;
    public final ObjchParser.protocol_end1_return protocol_end1() throws RecognitionException {
        ObjchParser.protocol_end1_return retval = new ObjchParser.protocol_end1_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal135=null;
        ObjchParser.declarations_return declarations134 =null;


        Object string_literal135_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:228:2: ( ( declarations )* '@end' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:228:4: ( declarations )* '@end'
            {
            root_0 = (Object)adaptor.nil();


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:228:4: ( declarations )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==ID||LA45_0==50||LA45_0==52||LA45_0==64||LA45_0==66||LA45_0==70||LA45_0==76||LA45_0==78||LA45_0==81||(LA45_0 >= 84 && LA45_0 <= 86)||(LA45_0 >= 91 && LA45_0 <= 93)||LA45_0==95) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:228:4: declarations
            	    {
            	    pushFollow(FOLLOW_declarations_in_protocol_end11174);
            	    declarations134=declarations();

            	    state._fsp--;

            	    adaptor.addChild(root_0, declarations134.getTree());

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            string_literal135=(Token)match(input,62,FOLLOW_62_in_protocol_end11179); 
            string_literal135_tree = 
            (Object)adaptor.create(string_literal135)
            ;
            adaptor.addChild(root_0, string_literal135_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "protocol_end1"


    public static class protocol_end2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "protocol_end2"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:232:1: protocol_end2 : ';' ;
    public final ObjchParser.protocol_end2_return protocol_end2() throws RecognitionException {
        ObjchParser.protocol_end2_return retval = new ObjchParser.protocol_end2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal136=null;

        Object char_literal136_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:233:2: ( ';' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:233:4: ';'
            {
            root_0 = (Object)adaptor.nil();


            char_literal136=(Token)match(input,55,FOLLOW_55_in_protocol_end21191); 
            char_literal136_tree = 
            (Object)adaptor.create(char_literal136)
            ;
            adaptor.addChild(root_0, char_literal136_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "protocol_end2"


    public static class generic_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "generic"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:237:1: generic : '<' generic_internal '>' ;
    public final ObjchParser.generic_return generic() throws RecognitionException {
        ObjchParser.generic_return retval = new ObjchParser.generic_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal137=null;
        Token char_literal139=null;
        ObjchParser.generic_internal_return generic_internal138 =null;


        Object char_literal137_tree=null;
        Object char_literal139_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:237:9: ( '<' generic_internal '>' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:237:11: '<' generic_internal '>'
            {
            root_0 = (Object)adaptor.nil();


            char_literal137=(Token)match(input,56,FOLLOW_56_in_generic1204); 
            char_literal137_tree = 
            (Object)adaptor.create(char_literal137)
            ;
            adaptor.addChild(root_0, char_literal137_tree);


            pushFollow(FOLLOW_generic_internal_in_generic1206);
            generic_internal138=generic_internal();

            state._fsp--;

            adaptor.addChild(root_0, generic_internal138.getTree());

            char_literal139=(Token)match(input,59,FOLLOW_59_in_generic1208); 
            char_literal139_tree = 
            (Object)adaptor.create(char_literal139)
            ;
            adaptor.addChild(root_0, char_literal139_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "generic"


    public static class generic_internal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "generic_internal"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:239:1: generic_internal : type_declaration ( ',' type_declaration )* ;
    public final ObjchParser.generic_internal_return generic_internal() throws RecognitionException {
        ObjchParser.generic_internal_return retval = new ObjchParser.generic_internal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal141=null;
        ObjchParser.type_declaration_return type_declaration140 =null;

        ObjchParser.type_declaration_return type_declaration142 =null;


        Object char_literal141_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:240:2: ( type_declaration ( ',' type_declaration )* )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:240:4: type_declaration ( ',' type_declaration )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_declaration_in_generic_internal1217);
            type_declaration140=type_declaration();

            state._fsp--;

            adaptor.addChild(root_0, type_declaration140.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:240:21: ( ',' type_declaration )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==51) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:240:22: ',' type_declaration
            	    {
            	    char_literal141=(Token)match(input,51,FOLLOW_51_in_generic_internal1220); 
            	    char_literal141_tree = 
            	    (Object)adaptor.create(char_literal141)
            	    ;
            	    adaptor.addChild(root_0, char_literal141_tree);


            	    pushFollow(FOLLOW_type_declaration_in_generic_internal1222);
            	    type_declaration142=type_declaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, type_declaration142.getTree());

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "generic_internal"


    public static class protocol_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "protocol_name"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:242:1: protocol_name : ID -> ^( NAME ID ) ;
    public final ObjchParser.protocol_name_return protocol_name() throws RecognitionException {
        ObjchParser.protocol_name_return retval = new ObjchParser.protocol_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID143=null;

        Object ID143_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:243:2: ( ID -> ^( NAME ID ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:243:4: ID
            {
            ID143=(Token)match(input,ID,FOLLOW_ID_in_protocol_name1234);  
            stream_ID.add(ID143);


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 243:7: -> ^( NAME ID )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:243:10: ^( NAME ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(NAME, "NAME")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "protocol_name"


    public static class interface_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interface_declaration"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:245:1: interface_declaration : '@interface' interface_name ( ':' superclass_name )? ( interface_body )? ( declarations )* '@end' ;
    public final ObjchParser.interface_declaration_return interface_declaration() throws RecognitionException {
        ObjchParser.interface_declaration_return retval = new ObjchParser.interface_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal144=null;
        Token char_literal146=null;
        Token string_literal150=null;
        ObjchParser.interface_name_return interface_name145 =null;

        ObjchParser.superclass_name_return superclass_name147 =null;

        ObjchParser.interface_body_return interface_body148 =null;

        ObjchParser.declarations_return declarations149 =null;


        Object string_literal144_tree=null;
        Object char_literal146_tree=null;
        Object string_literal150_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:246:2: ( '@interface' interface_name ( ':' superclass_name )? ( interface_body )? ( declarations )* '@end' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:246:4: '@interface' interface_name ( ':' superclass_name )? ( interface_body )? ( declarations )* '@end'
            {
            root_0 = (Object)adaptor.nil();


            string_literal144=(Token)match(input,63,FOLLOW_63_in_interface_declaration1254); 
            string_literal144_tree = 
            (Object)adaptor.create(string_literal144)
            ;
            adaptor.addChild(root_0, string_literal144_tree);


            pushFollow(FOLLOW_interface_name_in_interface_declaration1256);
            interface_name145=interface_name();

            state._fsp--;

            adaptor.addChild(root_0, interface_name145.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:246:32: ( ':' superclass_name )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==54) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:246:33: ':' superclass_name
                    {
                    char_literal146=(Token)match(input,54,FOLLOW_54_in_interface_declaration1259); 
                    char_literal146_tree = 
                    (Object)adaptor.create(char_literal146)
                    ;
                    adaptor.addChild(root_0, char_literal146_tree);


                    pushFollow(FOLLOW_superclass_name_in_interface_declaration1261);
                    superclass_name147=superclass_name();

                    state._fsp--;

                    adaptor.addChild(root_0, superclass_name147.getTree());

                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:247:2: ( interface_body )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==96) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:247:2: interface_body
                    {
                    pushFollow(FOLLOW_interface_body_in_interface_declaration1266);
                    interface_body148=interface_body();

                    state._fsp--;

                    adaptor.addChild(root_0, interface_body148.getTree());

                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:248:2: ( declarations )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==ID||LA49_0==50||LA49_0==52||LA49_0==64||LA49_0==66||LA49_0==70||LA49_0==76||LA49_0==78||LA49_0==81||(LA49_0 >= 84 && LA49_0 <= 86)||(LA49_0 >= 91 && LA49_0 <= 93)||LA49_0==95) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:248:2: declarations
            	    {
            	    pushFollow(FOLLOW_declarations_in_interface_declaration1270);
            	    declarations149=declarations();

            	    state._fsp--;

            	    adaptor.addChild(root_0, declarations149.getTree());

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            string_literal150=(Token)match(input,62,FOLLOW_62_in_interface_declaration1274); 
            string_literal150_tree = 
            (Object)adaptor.create(string_literal150)
            ;
            adaptor.addChild(root_0, string_literal150_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "interface_declaration"


    public static class interface_body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interface_body"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:252:1: interface_body : '{' ( interface_body_item )* '}' ;
    public final ObjchParser.interface_body_return interface_body() throws RecognitionException {
        ObjchParser.interface_body_return retval = new ObjchParser.interface_body_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal151=null;
        Token char_literal153=null;
        ObjchParser.interface_body_item_return interface_body_item152 =null;


        Object char_literal151_tree=null;
        Object char_literal153_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:253:2: ( '{' ( interface_body_item )* '}' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:254:2: '{' ( interface_body_item )* '}'
            {
            root_0 = (Object)adaptor.nil();


            char_literal151=(Token)match(input,96,FOLLOW_96_in_interface_body1287); 
            char_literal151_tree = 
            (Object)adaptor.create(char_literal151)
            ;
            adaptor.addChild(root_0, char_literal151_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:255:3: ( interface_body_item )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==ID||LA50_0==65||LA50_0==67||LA50_0==69||LA50_0==76||LA50_0==78||LA50_0==81||(LA50_0 >= 84 && LA50_0 <= 86)||(LA50_0 >= 91 && LA50_0 <= 95)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:255:3: interface_body_item
            	    {
            	    pushFollow(FOLLOW_interface_body_item_in_interface_body1291);
            	    interface_body_item152=interface_body_item();

            	    state._fsp--;

            	    adaptor.addChild(root_0, interface_body_item152.getTree());

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            char_literal153=(Token)match(input,98,FOLLOW_98_in_interface_body1295); 
            char_literal153_tree = 
            (Object)adaptor.create(char_literal153)
            ;
            adaptor.addChild(root_0, char_literal153_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "interface_body"


    public static class interface_body_item_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interface_body_item"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:259:1: interface_body_item : ( group_modifier_wrapper ( simple_fields_declaration )? | simple_fields_declaration | union_declaration_wrapper ';' );
    public final ObjchParser.interface_body_item_return interface_body_item() throws RecognitionException {
        ObjchParser.interface_body_item_return retval = new ObjchParser.interface_body_item_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal158=null;
        ObjchParser.group_modifier_wrapper_return group_modifier_wrapper154 =null;

        ObjchParser.simple_fields_declaration_return simple_fields_declaration155 =null;

        ObjchParser.simple_fields_declaration_return simple_fields_declaration156 =null;

        ObjchParser.union_declaration_wrapper_return union_declaration_wrapper157 =null;


        Object char_literal158_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:260:2: ( group_modifier_wrapper ( simple_fields_declaration )? | simple_fields_declaration | union_declaration_wrapper ';' )
            int alt52=3;
            switch ( input.LA(1) ) {
            case 65:
            case 67:
            case 69:
                {
                alt52=1;
                }
                break;
            case ID:
            case 76:
            case 78:
            case 81:
            case 84:
            case 85:
            case 86:
            case 91:
            case 92:
            case 93:
            case 95:
                {
                alt52=2;
                }
                break;
            case 94:
                {
                alt52=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;

            }

            switch (alt52) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:260:4: group_modifier_wrapper ( simple_fields_declaration )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_group_modifier_wrapper_in_interface_body_item1307);
                    group_modifier_wrapper154=group_modifier_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, group_modifier_wrapper154.getTree());

                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:260:27: ( simple_fields_declaration )?
                    int alt51=2;
                    alt51 = dfa51.predict(input);
                    switch (alt51) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:260:27: simple_fields_declaration
                            {
                            pushFollow(FOLLOW_simple_fields_declaration_in_interface_body_item1309);
                            simple_fields_declaration155=simple_fields_declaration();

                            state._fsp--;

                            adaptor.addChild(root_0, simple_fields_declaration155.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:261:4: simple_fields_declaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_simple_fields_declaration_in_interface_body_item1315);
                    simple_fields_declaration156=simple_fields_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, simple_fields_declaration156.getTree());

                    }
                    break;
                case 3 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:262:4: union_declaration_wrapper ';'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_union_declaration_wrapper_in_interface_body_item1320);
                    union_declaration_wrapper157=union_declaration_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, union_declaration_wrapper157.getTree());

                    char_literal158=(Token)match(input,55,FOLLOW_55_in_interface_body_item1322); 
                    char_literal158_tree = 
                    (Object)adaptor.create(char_literal158)
                    ;
                    adaptor.addChild(root_0, char_literal158_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "interface_body_item"


    public static class union_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "union_name"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:265:1: union_name : ID -> ^( NAME ID ) ;
    public final ObjchParser.union_name_return union_name() throws RecognitionException {
        ObjchParser.union_name_return retval = new ObjchParser.union_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID159=null;

        Object ID159_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:266:2: ( ID -> ^( NAME ID ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:266:4: ID
            {
            ID159=(Token)match(input,ID,FOLLOW_ID_in_union_name1333);  
            stream_ID.add(ID159);


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 266:7: -> ^( NAME ID )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:266:10: ^( NAME ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(NAME, "NAME")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "union_name"


    public static class group_modifier_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "group_modifier_wrapper"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:268:1: group_modifier_wrapper : group_modifier -> ^( GROUP_MODIFIER group_modifier ) ;
    public final ObjchParser.group_modifier_wrapper_return group_modifier_wrapper() throws RecognitionException {
        ObjchParser.group_modifier_wrapper_return retval = new ObjchParser.group_modifier_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.group_modifier_return group_modifier160 =null;


        RewriteRuleSubtreeStream stream_group_modifier=new RewriteRuleSubtreeStream(adaptor,"rule group_modifier");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:269:2: ( group_modifier -> ^( GROUP_MODIFIER group_modifier ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:269:4: group_modifier
            {
            pushFollow(FOLLOW_group_modifier_in_group_modifier_wrapper1352);
            group_modifier160=group_modifier();

            state._fsp--;

            stream_group_modifier.add(group_modifier160.getTree());

            // AST REWRITE
            // elements: group_modifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 269:19: -> ^( GROUP_MODIFIER group_modifier )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:269:22: ^( GROUP_MODIFIER group_modifier )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(GROUP_MODIFIER, "GROUP_MODIFIER")
                , root_1);

                adaptor.addChild(root_1, stream_group_modifier.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "group_modifier_wrapper"


    public static class group_modifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "group_modifier"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:271:1: group_modifier : ( '@private' | '@protected' | '@public' );
    public final ObjchParser.group_modifier_return group_modifier() throws RecognitionException {
        ObjchParser.group_modifier_return retval = new ObjchParser.group_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set161=null;

        Object set161_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:272:2: ( '@private' | '@protected' | '@public' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:
            {
            root_0 = (Object)adaptor.nil();


            set161=(Token)input.LT(1);

            if ( input.LA(1)==65||input.LA(1)==67||input.LA(1)==69 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set161)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "group_modifier"


    public static class interface_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interface_name"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:274:1: interface_name : ID ( category )? -> ^( INTERFACE_NAME ID ( category )? ) ;
    public final ObjchParser.interface_name_return interface_name() throws RecognitionException {
        ObjchParser.interface_name_return retval = new ObjchParser.interface_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID162=null;
        ObjchParser.category_return category163 =null;


        Object ID162_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_category=new RewriteRuleSubtreeStream(adaptor,"rule category");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:275:2: ( ID ( category )? -> ^( INTERFACE_NAME ID ( category )? ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:275:4: ID ( category )?
            {
            ID162=(Token)match(input,ID,FOLLOW_ID_in_interface_name1391);  
            stream_ID.add(ID162);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:275:7: ( category )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==47) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:275:7: category
                    {
                    pushFollow(FOLLOW_category_in_interface_name1393);
                    category163=category();

                    state._fsp--;

                    stream_category.add(category163.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: category, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 275:17: -> ^( INTERFACE_NAME ID ( category )? )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:275:20: ^( INTERFACE_NAME ID ( category )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INTERFACE_NAME, "INTERFACE_NAME")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:275:40: ( category )?
                if ( stream_category.hasNext() ) {
                    adaptor.addChild(root_1, stream_category.nextTree());

                }
                stream_category.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "interface_name"


    public static class category_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "category"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:277:1: category : '(' ID ')' -> ^( CATEGORY ID ) ;
    public final ObjchParser.category_return category() throws RecognitionException {
        ObjchParser.category_return retval = new ObjchParser.category_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal164=null;
        Token ID165=null;
        Token char_literal166=null;

        Object char_literal164_tree=null;
        Object ID165_tree=null;
        Object char_literal166_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:277:9: ( '(' ID ')' -> ^( CATEGORY ID ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:277:11: '(' ID ')'
            {
            char_literal164=(Token)match(input,47,FOLLOW_47_in_category1412);  
            stream_47.add(char_literal164);


            ID165=(Token)match(input,ID,FOLLOW_ID_in_category1414);  
            stream_ID.add(ID165);


            char_literal166=(Token)match(input,48,FOLLOW_48_in_category1416);  
            stream_48.add(char_literal166);


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 277:22: -> ^( CATEGORY ID )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:277:25: ^( CATEGORY ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CATEGORY, "CATEGORY")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "category"


    public static class superclass_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "superclass_name"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:279:1: superclass_name : ID ( generic )? -> ^( SUPERCLASS_NAME ID ( generic )? ) ;
    public final ObjchParser.superclass_name_return superclass_name() throws RecognitionException {
        ObjchParser.superclass_name_return retval = new ObjchParser.superclass_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID167=null;
        ObjchParser.generic_return generic168 =null;


        Object ID167_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_generic=new RewriteRuleSubtreeStream(adaptor,"rule generic");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:280:2: ( ID ( generic )? -> ^( SUPERCLASS_NAME ID ( generic )? ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:280:4: ID ( generic )?
            {
            ID167=(Token)match(input,ID,FOLLOW_ID_in_superclass_name1433);  
            stream_ID.add(ID167);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:280:7: ( generic )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==56) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:280:7: generic
                    {
                    pushFollow(FOLLOW_generic_in_superclass_name1435);
                    generic168=generic();

                    state._fsp--;

                    stream_generic.add(generic168.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: ID, generic
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 280:16: -> ^( SUPERCLASS_NAME ID ( generic )? )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:280:19: ^( SUPERCLASS_NAME ID ( generic )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SUPERCLASS_NAME, "SUPERCLASS_NAME")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:280:40: ( generic )?
                if ( stream_generic.hasNext() ) {
                    adaptor.addChild(root_1, stream_generic.nextTree());

                }
                stream_generic.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "superclass_name"


    public static class simple_fields_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simple_fields_declaration"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:282:1: simple_fields_declaration : ( field_declaration_wrapper )+ -> ^( FIELDS ( field_declaration_wrapper )+ ) ;
    public final ObjchParser.simple_fields_declaration_return simple_fields_declaration() throws RecognitionException {
        ObjchParser.simple_fields_declaration_return retval = new ObjchParser.simple_fields_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.field_declaration_wrapper_return field_declaration_wrapper169 =null;


        RewriteRuleSubtreeStream stream_field_declaration_wrapper=new RewriteRuleSubtreeStream(adaptor,"rule field_declaration_wrapper");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:283:2: ( ( field_declaration_wrapper )+ -> ^( FIELDS ( field_declaration_wrapper )+ ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:283:4: ( field_declaration_wrapper )+
            {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:283:4: ( field_declaration_wrapper )+
            int cnt55=0;
            loop55:
            do {
                int alt55=2;
                switch ( input.LA(1) ) {
                case 76:
                    {
                    alt55=1;
                    }
                    break;
                case 91:
                    {
                    alt55=1;
                    }
                    break;
                case 84:
                    {
                    alt55=1;
                    }
                    break;
                case 78:
                    {
                    alt55=1;
                    }
                    break;
                case 81:
                    {
                    alt55=1;
                    }
                    break;
                case 93:
                    {
                    alt55=1;
                    }
                    break;
                case 92:
                    {
                    alt55=1;
                    }
                    break;
                case 95:
                    {
                    alt55=1;
                    }
                    break;
                case 85:
                    {
                    alt55=1;
                    }
                    break;
                case 86:
                    {
                    alt55=1;
                    }
                    break;
                case ID:
                    {
                    alt55=1;
                    }
                    break;

                }

                switch (alt55) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:283:4: field_declaration_wrapper
            	    {
            	    pushFollow(FOLLOW_field_declaration_wrapper_in_simple_fields_declaration1457);
            	    field_declaration_wrapper169=field_declaration_wrapper();

            	    state._fsp--;

            	    stream_field_declaration_wrapper.add(field_declaration_wrapper169.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt55 >= 1 ) break loop55;
                        EarlyExitException eee =
                            new EarlyExitException(55, input);
                        throw eee;
                }
                cnt55++;
            } while (true);


            // AST REWRITE
            // elements: field_declaration_wrapper
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 283:31: -> ^( FIELDS ( field_declaration_wrapper )+ )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:283:34: ^( FIELDS ( field_declaration_wrapper )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FIELDS, "FIELDS")
                , root_1);

                if ( !(stream_field_declaration_wrapper.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_field_declaration_wrapper.hasNext() ) {
                    adaptor.addChild(root_1, stream_field_declaration_wrapper.nextTree());

                }
                stream_field_declaration_wrapper.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "simple_fields_declaration"


    public static class field_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "field_declaration"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:285:1: field_declaration : ( '__weak' )? ( static_prefix )? ( 'inline' )? type_declaration ( ( field_name ( classical_method_params | ( ',' field_name )* ) ) | func_pointer ) ';' ;
    public final ObjchParser.field_declaration_return field_declaration() throws RecognitionException {
        ObjchParser.field_declaration_return retval = new ObjchParser.field_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal170=null;
        Token string_literal172=null;
        Token char_literal176=null;
        Token char_literal179=null;
        ObjchParser.static_prefix_return static_prefix171 =null;

        ObjchParser.type_declaration_return type_declaration173 =null;

        ObjchParser.field_name_return field_name174 =null;

        ObjchParser.classical_method_params_return classical_method_params175 =null;

        ObjchParser.field_name_return field_name177 =null;

        ObjchParser.func_pointer_return func_pointer178 =null;


        Object string_literal170_tree=null;
        Object string_literal172_tree=null;
        Object char_literal176_tree=null;
        Object char_literal179_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:286:2: ( ( '__weak' )? ( static_prefix )? ( 'inline' )? type_declaration ( ( field_name ( classical_method_params | ( ',' field_name )* ) ) | func_pointer ) ';' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:286:4: ( '__weak' )? ( static_prefix )? ( 'inline' )? type_declaration ( ( field_name ( classical_method_params | ( ',' field_name )* ) ) | func_pointer ) ';'
            {
            root_0 = (Object)adaptor.nil();


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:286:4: ( '__weak' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==76) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:286:4: '__weak'
                    {
                    string_literal170=(Token)match(input,76,FOLLOW_76_in_field_declaration1477); 
                    string_literal170_tree = 
                    (Object)adaptor.create(string_literal170)
                    ;
                    adaptor.addChild(root_0, string_literal170_tree);


                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:286:14: ( static_prefix )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==91) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:286:14: static_prefix
                    {
                    pushFollow(FOLLOW_static_prefix_in_field_declaration1480);
                    static_prefix171=static_prefix();

                    state._fsp--;

                    adaptor.addChild(root_0, static_prefix171.getTree());

                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:286:29: ( 'inline' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==84) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:286:29: 'inline'
                    {
                    string_literal172=(Token)match(input,84,FOLLOW_84_in_field_declaration1483); 
                    string_literal172_tree = 
                    (Object)adaptor.create(string_literal172)
                    ;
                    adaptor.addChild(root_0, string_literal172_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_type_declaration_in_field_declaration1486);
            type_declaration173=type_declaration();

            state._fsp--;

            adaptor.addChild(root_0, type_declaration173.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:286:56: ( ( field_name ( classical_method_params | ( ',' field_name )* ) ) | func_pointer )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==ID) ) {
                alt61=1;
            }
            else if ( (LA61_0==47) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;

            }
            switch (alt61) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:286:57: ( field_name ( classical_method_params | ( ',' field_name )* ) )
                    {
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:286:57: ( field_name ( classical_method_params | ( ',' field_name )* ) )
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:286:58: field_name ( classical_method_params | ( ',' field_name )* )
                    {
                    pushFollow(FOLLOW_field_name_in_field_declaration1490);
                    field_name174=field_name();

                    state._fsp--;

                    adaptor.addChild(root_0, field_name174.getTree());

                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:286:69: ( classical_method_params | ( ',' field_name )* )
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==47) ) {
                        alt60=1;
                    }
                    else if ( (LA60_0==51||LA60_0==55) ) {
                        alt60=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 60, 0, input);

                        throw nvae;

                    }
                    switch (alt60) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:286:70: classical_method_params
                            {
                            pushFollow(FOLLOW_classical_method_params_in_field_declaration1493);
                            classical_method_params175=classical_method_params();

                            state._fsp--;

                            adaptor.addChild(root_0, classical_method_params175.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:286:96: ( ',' field_name )*
                            {
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:286:96: ( ',' field_name )*
                            loop59:
                            do {
                                int alt59=2;
                                int LA59_0 = input.LA(1);

                                if ( (LA59_0==51) ) {
                                    alt59=1;
                                }


                                switch (alt59) {
                            	case 1 :
                            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:286:97: ',' field_name
                            	    {
                            	    char_literal176=(Token)match(input,51,FOLLOW_51_in_field_declaration1498); 
                            	    char_literal176_tree = 
                            	    (Object)adaptor.create(char_literal176)
                            	    ;
                            	    adaptor.addChild(root_0, char_literal176_tree);


                            	    pushFollow(FOLLOW_field_name_in_field_declaration1500);
                            	    field_name177=field_name();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, field_name177.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop59;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:286:118: func_pointer
                    {
                    pushFollow(FOLLOW_func_pointer_in_field_declaration1508);
                    func_pointer178=func_pointer();

                    state._fsp--;

                    adaptor.addChild(root_0, func_pointer178.getTree());

                    }
                    break;

            }


            char_literal179=(Token)match(input,55,FOLLOW_55_in_field_declaration1511); 
            char_literal179_tree = 
            (Object)adaptor.create(char_literal179)
            ;
            adaptor.addChild(root_0, char_literal179_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "field_declaration"


    public static class classical_method_params_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classical_method_params"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:288:1: classical_method_params : '(' ( classical_param ( ',' classical_param )* )? ')' ( attribute )? ;
    public final ObjchParser.classical_method_params_return classical_method_params() throws RecognitionException {
        ObjchParser.classical_method_params_return retval = new ObjchParser.classical_method_params_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal180=null;
        Token char_literal182=null;
        Token char_literal184=null;
        ObjchParser.classical_param_return classical_param181 =null;

        ObjchParser.classical_param_return classical_param183 =null;

        ObjchParser.attribute_return attribute185 =null;


        Object char_literal180_tree=null;
        Object char_literal182_tree=null;
        Object char_literal184_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:289:2: ( '(' ( classical_param ( ',' classical_param )* )? ')' ( attribute )? )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:289:4: '(' ( classical_param ( ',' classical_param )* )? ')' ( attribute )?
            {
            root_0 = (Object)adaptor.nil();


            char_literal180=(Token)match(input,47,FOLLOW_47_in_classical_method_params1521); 
            char_literal180_tree = 
            (Object)adaptor.create(char_literal180)
            ;
            adaptor.addChild(root_0, char_literal180_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:289:8: ( classical_param ( ',' classical_param )* )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==ID||LA63_0==53||LA63_0==78||LA63_0==81||(LA63_0 >= 85 && LA63_0 <= 86)||(LA63_0 >= 92 && LA63_0 <= 93)||LA63_0==95) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:289:9: classical_param ( ',' classical_param )*
                    {
                    pushFollow(FOLLOW_classical_param_in_classical_method_params1524);
                    classical_param181=classical_param();

                    state._fsp--;

                    adaptor.addChild(root_0, classical_param181.getTree());

                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:289:25: ( ',' classical_param )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==51) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:289:26: ',' classical_param
                    	    {
                    	    char_literal182=(Token)match(input,51,FOLLOW_51_in_classical_method_params1527); 
                    	    char_literal182_tree = 
                    	    (Object)adaptor.create(char_literal182)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal182_tree);


                    	    pushFollow(FOLLOW_classical_param_in_classical_method_params1529);
                    	    classical_param183=classical_param();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, classical_param183.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);


                    }
                    break;

            }


            char_literal184=(Token)match(input,48,FOLLOW_48_in_classical_method_params1535); 
            char_literal184_tree = 
            (Object)adaptor.create(char_literal184)
            ;
            adaptor.addChild(root_0, char_literal184_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:289:54: ( attribute )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==74) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:289:54: attribute
                    {
                    pushFollow(FOLLOW_attribute_in_classical_method_params1537);
                    attribute185=attribute();

                    state._fsp--;

                    adaptor.addChild(root_0, attribute185.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "classical_method_params"


    public static class attribute_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attribute"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:292:1: attribute : '__attribute__' '(' attribute_internal ')' ;
    public final ObjchParser.attribute_return attribute() throws RecognitionException {
        ObjchParser.attribute_return retval = new ObjchParser.attribute_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal186=null;
        Token char_literal187=null;
        Token char_literal189=null;
        ObjchParser.attribute_internal_return attribute_internal188 =null;


        Object string_literal186_tree=null;
        Object char_literal187_tree=null;
        Object char_literal189_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:293:2: ( '__attribute__' '(' attribute_internal ')' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:293:4: '__attribute__' '(' attribute_internal ')'
            {
            root_0 = (Object)adaptor.nil();


            string_literal186=(Token)match(input,74,FOLLOW_74_in_attribute1551); 
            string_literal186_tree = 
            (Object)adaptor.create(string_literal186)
            ;
            adaptor.addChild(root_0, string_literal186_tree);


            char_literal187=(Token)match(input,47,FOLLOW_47_in_attribute1553); 
            char_literal187_tree = 
            (Object)adaptor.create(char_literal187)
            ;
            adaptor.addChild(root_0, char_literal187_tree);


            pushFollow(FOLLOW_attribute_internal_in_attribute1555);
            attribute_internal188=attribute_internal();

            state._fsp--;

            adaptor.addChild(root_0, attribute_internal188.getTree());

            char_literal189=(Token)match(input,48,FOLLOW_48_in_attribute1557); 
            char_literal189_tree = 
            (Object)adaptor.create(char_literal189)
            ;
            adaptor.addChild(root_0, char_literal189_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "attribute"


    public static class attribute_internal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attribute_internal"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:295:1: attribute_internal : attribute_internal1 ;
    public final ObjchParser.attribute_internal_return attribute_internal() throws RecognitionException {
        ObjchParser.attribute_internal_return retval = new ObjchParser.attribute_internal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.attribute_internal1_return attribute_internal1190 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:296:2: ( attribute_internal1 )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:296:4: attribute_internal1
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_attribute_internal1_in_attribute_internal1568);
            attribute_internal1190=attribute_internal1();

            state._fsp--;

            adaptor.addChild(root_0, attribute_internal1190.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "attribute_internal"


    public static class attribute_internal1_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attribute_internal1"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:298:1: attribute_internal1 : '(' 'format' '(' ( format_item ( ',' format_item )* )? ')' ')' ;
    public final ObjchParser.attribute_internal1_return attribute_internal1() throws RecognitionException {
        ObjchParser.attribute_internal1_return retval = new ObjchParser.attribute_internal1_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal191=null;
        Token string_literal192=null;
        Token char_literal193=null;
        Token char_literal195=null;
        Token char_literal197=null;
        Token char_literal198=null;
        ObjchParser.format_item_return format_item194 =null;

        ObjchParser.format_item_return format_item196 =null;


        Object char_literal191_tree=null;
        Object string_literal192_tree=null;
        Object char_literal193_tree=null;
        Object char_literal195_tree=null;
        Object char_literal197_tree=null;
        Object char_literal198_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:299:2: ( '(' 'format' '(' ( format_item ( ',' format_item )* )? ')' ')' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:299:4: '(' 'format' '(' ( format_item ( ',' format_item )* )? ')' ')'
            {
            root_0 = (Object)adaptor.nil();


            char_literal191=(Token)match(input,47,FOLLOW_47_in_attribute_internal11578); 
            char_literal191_tree = 
            (Object)adaptor.create(char_literal191)
            ;
            adaptor.addChild(root_0, char_literal191_tree);


            string_literal192=(Token)match(input,83,FOLLOW_83_in_attribute_internal11580); 
            string_literal192_tree = 
            (Object)adaptor.create(string_literal192)
            ;
            adaptor.addChild(root_0, string_literal192_tree);


            char_literal193=(Token)match(input,47,FOLLOW_47_in_attribute_internal11582); 
            char_literal193_tree = 
            (Object)adaptor.create(char_literal193)
            ;
            adaptor.addChild(root_0, char_literal193_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:299:21: ( format_item ( ',' format_item )* )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==ID||LA66_0==NUMBER) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:299:23: format_item ( ',' format_item )*
                    {
                    pushFollow(FOLLOW_format_item_in_attribute_internal11585);
                    format_item194=format_item();

                    state._fsp--;

                    adaptor.addChild(root_0, format_item194.getTree());

                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:299:35: ( ',' format_item )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==51) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:299:36: ',' format_item
                    	    {
                    	    char_literal195=(Token)match(input,51,FOLLOW_51_in_attribute_internal11588); 
                    	    char_literal195_tree = 
                    	    (Object)adaptor.create(char_literal195)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal195_tree);


                    	    pushFollow(FOLLOW_format_item_in_attribute_internal11590);
                    	    format_item196=format_item();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, format_item196.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);


                    }
                    break;

            }


            char_literal197=(Token)match(input,48,FOLLOW_48_in_attribute_internal11596); 
            char_literal197_tree = 
            (Object)adaptor.create(char_literal197)
            ;
            adaptor.addChild(root_0, char_literal197_tree);


            char_literal198=(Token)match(input,48,FOLLOW_48_in_attribute_internal11598); 
            char_literal198_tree = 
            (Object)adaptor.create(char_literal198)
            ;
            adaptor.addChild(root_0, char_literal198_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "attribute_internal1"


    public static class format_item_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "format_item"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:301:2: format_item : ( ID | NUMBER );
    public final ObjchParser.format_item_return format_item() throws RecognitionException {
        ObjchParser.format_item_return retval = new ObjchParser.format_item_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set199=null;

        Object set199_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:302:2: ( ID | NUMBER )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:
            {
            root_0 = (Object)adaptor.nil();


            set199=(Token)input.LT(1);

            if ( input.LA(1)==ID||input.LA(1)==NUMBER ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set199)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "format_item"


    public static class classical_param_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classical_param"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:304:1: classical_param : ( type_declaration ID ( '[' ( NUMBER )? ']' )* | '...' );
    public final ObjchParser.classical_param_return classical_param() throws RecognitionException {
        ObjchParser.classical_param_return retval = new ObjchParser.classical_param_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID201=null;
        Token char_literal202=null;
        Token NUMBER203=null;
        Token char_literal204=null;
        Token string_literal205=null;
        ObjchParser.type_declaration_return type_declaration200 =null;


        Object ID201_tree=null;
        Object char_literal202_tree=null;
        Object NUMBER203_tree=null;
        Object char_literal204_tree=null;
        Object string_literal205_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:305:2: ( type_declaration ID ( '[' ( NUMBER )? ']' )* | '...' )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==ID||LA69_0==78||LA69_0==81||(LA69_0 >= 85 && LA69_0 <= 86)||(LA69_0 >= 92 && LA69_0 <= 93)||LA69_0==95) ) {
                alt69=1;
            }
            else if ( (LA69_0==53) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;

            }
            switch (alt69) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:305:4: type_declaration ID ( '[' ( NUMBER )? ']' )*
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_type_declaration_in_classical_param1623);
                    type_declaration200=type_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, type_declaration200.getTree());

                    ID201=(Token)match(input,ID,FOLLOW_ID_in_classical_param1625); 
                    ID201_tree = 
                    (Object)adaptor.create(ID201)
                    ;
                    adaptor.addChild(root_0, ID201_tree);


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:305:24: ( '[' ( NUMBER )? ']' )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==71) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:305:25: '[' ( NUMBER )? ']'
                    	    {
                    	    char_literal202=(Token)match(input,71,FOLLOW_71_in_classical_param1628); 
                    	    char_literal202_tree = 
                    	    (Object)adaptor.create(char_literal202)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal202_tree);


                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:305:29: ( NUMBER )?
                    	    int alt67=2;
                    	    int LA67_0 = input.LA(1);

                    	    if ( (LA67_0==NUMBER) ) {
                    	        alt67=1;
                    	    }
                    	    switch (alt67) {
                    	        case 1 :
                    	            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:305:29: NUMBER
                    	            {
                    	            NUMBER203=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_classical_param1630); 
                    	            NUMBER203_tree = 
                    	            (Object)adaptor.create(NUMBER203)
                    	            ;
                    	            adaptor.addChild(root_0, NUMBER203_tree);


                    	            }
                    	            break;

                    	    }


                    	    char_literal204=(Token)match(input,72,FOLLOW_72_in_classical_param1633); 
                    	    char_literal204_tree = 
                    	    (Object)adaptor.create(char_literal204)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal204_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop68;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:306:4: '...'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal205=(Token)match(input,53,FOLLOW_53_in_classical_param1640); 
                    string_literal205_tree = 
                    (Object)adaptor.create(string_literal205)
                    ;
                    adaptor.addChild(root_0, string_literal205_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "classical_param"


    public static class type_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_declaration"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:308:1: type_declaration : ( 'const' )? ( 'enum' )? ( 'typedef' )? ( 'struct' )? ( ( 'unsigned' ( type_dec )? ) | type_dec ) ( 'const' )? ( generic )? ( '*' )* -> ^( TYPE type_dec ( generic )? ) ;
    public final ObjchParser.type_declaration_return type_declaration() throws RecognitionException {
        ObjchParser.type_declaration_return retval = new ObjchParser.type_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal206=null;
        Token string_literal207=null;
        Token string_literal208=null;
        Token string_literal209=null;
        Token string_literal210=null;
        Token string_literal213=null;
        Token char_literal215=null;
        ObjchParser.type_dec_return type_dec211 =null;

        ObjchParser.type_dec_return type_dec212 =null;

        ObjchParser.generic_return generic214 =null;


        Object string_literal206_tree=null;
        Object string_literal207_tree=null;
        Object string_literal208_tree=null;
        Object string_literal209_tree=null;
        Object string_literal210_tree=null;
        Object string_literal213_tree=null;
        Object char_literal215_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleSubtreeStream stream_generic=new RewriteRuleSubtreeStream(adaptor,"rule generic");
        RewriteRuleSubtreeStream stream_type_dec=new RewriteRuleSubtreeStream(adaptor,"rule type_dec");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:309:2: ( ( 'const' )? ( 'enum' )? ( 'typedef' )? ( 'struct' )? ( ( 'unsigned' ( type_dec )? ) | type_dec ) ( 'const' )? ( generic )? ( '*' )* -> ^( TYPE type_dec ( generic )? ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:309:4: ( 'const' )? ( 'enum' )? ( 'typedef' )? ( 'struct' )? ( ( 'unsigned' ( type_dec )? ) | type_dec ) ( 'const' )? ( generic )? ( '*' )*
            {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:309:4: ( 'const' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==78) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:309:4: 'const'
                    {
                    string_literal206=(Token)match(input,78,FOLLOW_78_in_type_declaration1652);  
                    stream_78.add(string_literal206);


                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:309:13: ( 'enum' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==81) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:309:13: 'enum'
                    {
                    string_literal207=(Token)match(input,81,FOLLOW_81_in_type_declaration1655);  
                    stream_81.add(string_literal207);


                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:309:21: ( 'typedef' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==93) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:309:21: 'typedef'
                    {
                    string_literal208=(Token)match(input,93,FOLLOW_93_in_type_declaration1658);  
                    stream_93.add(string_literal208);


                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:309:32: ( 'struct' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==92) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:309:32: 'struct'
                    {
                    string_literal209=(Token)match(input,92,FOLLOW_92_in_type_declaration1661);  
                    stream_92.add(string_literal209);


                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:309:42: ( ( 'unsigned' ( type_dec )? ) | type_dec )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==95) ) {
                alt75=1;
            }
            else if ( (LA75_0==ID||(LA75_0 >= 85 && LA75_0 <= 86)) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;

            }
            switch (alt75) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:309:43: ( 'unsigned' ( type_dec )? )
                    {
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:309:43: ( 'unsigned' ( type_dec )? )
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:309:44: 'unsigned' ( type_dec )?
                    {
                    string_literal210=(Token)match(input,95,FOLLOW_95_in_type_declaration1666);  
                    stream_95.add(string_literal210);


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:309:55: ( type_dec )?
                    int alt74=2;
                    alt74 = dfa74.predict(input);
                    switch (alt74) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:309:55: type_dec
                            {
                            pushFollow(FOLLOW_type_dec_in_type_declaration1668);
                            type_dec211=type_dec();

                            state._fsp--;

                            stream_type_dec.add(type_dec211.getTree());

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:309:68: type_dec
                    {
                    pushFollow(FOLLOW_type_dec_in_type_declaration1674);
                    type_dec212=type_dec();

                    state._fsp--;

                    stream_type_dec.add(type_dec212.getTree());

                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:309:78: ( 'const' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==78) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:309:78: 'const'
                    {
                    string_literal213=(Token)match(input,78,FOLLOW_78_in_type_declaration1677);  
                    stream_78.add(string_literal213);


                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:309:87: ( generic )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==56) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:309:87: generic
                    {
                    pushFollow(FOLLOW_generic_in_type_declaration1680);
                    generic214=generic();

                    state._fsp--;

                    stream_generic.add(generic214.getTree());

                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:309:96: ( '*' )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==49) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:309:96: '*'
            	    {
            	    char_literal215=(Token)match(input,49,FOLLOW_49_in_type_declaration1683);  
            	    stream_49.add(char_literal215);


            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);


            // AST REWRITE
            // elements: type_dec, generic
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 309:101: -> ^( TYPE type_dec ( generic )? )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:309:104: ^( TYPE type_dec ( generic )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TYPE, "TYPE")
                , root_1);

                adaptor.addChild(root_1, stream_type_dec.nextTree());

                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:309:120: ( generic )?
                if ( stream_generic.hasNext() ) {
                    adaptor.addChild(root_1, stream_generic.nextTree());

                }
                stream_generic.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type_declaration"


    public static class type_dec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_dec"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:311:1: type_dec : type_dec_internal ( '[' ']' )* ;
    public final ObjchParser.type_dec_return type_dec() throws RecognitionException {
        ObjchParser.type_dec_return retval = new ObjchParser.type_dec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal217=null;
        Token char_literal218=null;
        ObjchParser.type_dec_internal_return type_dec_internal216 =null;


        Object char_literal217_tree=null;
        Object char_literal218_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:311:9: ( type_dec_internal ( '[' ']' )* )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:311:11: type_dec_internal ( '[' ']' )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_dec_internal_in_type_dec1703);
            type_dec_internal216=type_dec_internal();

            state._fsp--;

            adaptor.addChild(root_0, type_dec_internal216.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:311:29: ( '[' ']' )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==71) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:311:30: '[' ']'
            	    {
            	    char_literal217=(Token)match(input,71,FOLLOW_71_in_type_dec1706); 
            	    char_literal217_tree = 
            	    (Object)adaptor.create(char_literal217)
            	    ;
            	    adaptor.addChild(root_0, char_literal217_tree);


            	    char_literal218=(Token)match(input,72,FOLLOW_72_in_type_dec1708); 
            	    char_literal218_tree = 
            	    (Object)adaptor.create(char_literal218)
            	    ;
            	    adaptor.addChild(root_0, char_literal218_tree);


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type_dec"


    public static class type_dec_internal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_dec_internal"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:314:1: type_dec_internal : ( knownTypes | ID );
    public final ObjchParser.type_dec_internal_return type_dec_internal() throws RecognitionException {
        ObjchParser.type_dec_internal_return retval = new ObjchParser.type_dec_internal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID220=null;
        ObjchParser.knownTypes_return knownTypes219 =null;


        Object ID220_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:315:2: ( knownTypes | ID )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( ((LA80_0 >= 85 && LA80_0 <= 86)) ) {
                alt80=1;
            }
            else if ( (LA80_0==ID) ) {
                alt80=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;

            }
            switch (alt80) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:315:4: knownTypes
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_knownTypes_in_type_dec_internal1723);
                    knownTypes219=knownTypes();

                    state._fsp--;

                    adaptor.addChild(root_0, knownTypes219.getTree());

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:316:5: ID
                    {
                    root_0 = (Object)adaptor.nil();


                    ID220=(Token)match(input,ID,FOLLOW_ID_in_type_dec_internal1730); 
                    ID220_tree = 
                    (Object)adaptor.create(ID220)
                    ;
                    adaptor.addChild(root_0, ID220_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type_dec_internal"


    public static class knownTypes_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "knownTypes"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:319:1: knownTypes : ( 'int' | ( 'long' )+ ( 'int' )? );
    public final ObjchParser.knownTypes_return knownTypes() throws RecognitionException {
        ObjchParser.knownTypes_return retval = new ObjchParser.knownTypes_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal221=null;
        Token string_literal222=null;
        Token string_literal223=null;

        Object string_literal221_tree=null;
        Object string_literal222_tree=null;
        Object string_literal223_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:320:2: ( 'int' | ( 'long' )+ ( 'int' )? )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==85) ) {
                alt83=1;
            }
            else if ( (LA83_0==86) ) {
                alt83=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;

            }
            switch (alt83) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:320:4: 'int'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal221=(Token)match(input,85,FOLLOW_85_in_knownTypes1741); 
                    string_literal221_tree = 
                    (Object)adaptor.create(string_literal221)
                    ;
                    adaptor.addChild(root_0, string_literal221_tree);


                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:321:4: ( 'long' )+ ( 'int' )?
                    {
                    root_0 = (Object)adaptor.nil();


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:321:4: ( 'long' )+
                    int cnt81=0;
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==86) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:321:4: 'long'
                    	    {
                    	    string_literal222=(Token)match(input,86,FOLLOW_86_in_knownTypes1746); 
                    	    string_literal222_tree = 
                    	    (Object)adaptor.create(string_literal222)
                    	    ;
                    	    adaptor.addChild(root_0, string_literal222_tree);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt81 >= 1 ) break loop81;
                                EarlyExitException eee =
                                    new EarlyExitException(81, input);
                                throw eee;
                        }
                        cnt81++;
                    } while (true);


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:321:12: ( 'int' )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==85) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:321:12: 'int'
                            {
                            string_literal223=(Token)match(input,85,FOLLOW_85_in_knownTypes1749); 
                            string_literal223_tree = 
                            (Object)adaptor.create(string_literal223)
                            ;
                            adaptor.addChild(root_0, string_literal223_tree);


                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "knownTypes"


    public static class field_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "field_name"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:324:1: field_name : ID ( array_size )? ( field_crap )? -> ^( FIELD_NAME ID ( array_size )? ) ;
    public final ObjchParser.field_name_return field_name() throws RecognitionException {
        ObjchParser.field_name_return retval = new ObjchParser.field_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID224=null;
        ObjchParser.array_size_return array_size225 =null;

        ObjchParser.field_crap_return field_crap226 =null;


        Object ID224_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_array_size=new RewriteRuleSubtreeStream(adaptor,"rule array_size");
        RewriteRuleSubtreeStream stream_field_crap=new RewriteRuleSubtreeStream(adaptor,"rule field_crap");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:325:2: ( ID ( array_size )? ( field_crap )? -> ^( FIELD_NAME ID ( array_size )? ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:325:4: ID ( array_size )? ( field_crap )?
            {
            ID224=(Token)match(input,ID,FOLLOW_ID_in_field_name1762);  
            stream_ID.add(ID224);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:325:7: ( array_size )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==71) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:325:7: array_size
                    {
                    pushFollow(FOLLOW_array_size_in_field_name1764);
                    array_size225=array_size();

                    state._fsp--;

                    stream_array_size.add(array_size225.getTree());

                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:325:19: ( field_crap )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==54) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:325:20: field_crap
                    {
                    pushFollow(FOLLOW_field_crap_in_field_name1768);
                    field_crap226=field_crap();

                    state._fsp--;

                    stream_field_crap.add(field_crap226.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: array_size, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 325:33: -> ^( FIELD_NAME ID ( array_size )? )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:325:36: ^( FIELD_NAME ID ( array_size )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FIELD_NAME, "FIELD_NAME")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:325:52: ( array_size )?
                if ( stream_array_size.hasNext() ) {
                    adaptor.addChild(root_1, stream_array_size.nextTree());

                }
                stream_array_size.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "field_name"


    public static class array_size_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "array_size"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:327:1: array_size : '[' ( NUMBER )? ']' ;
    public final ObjchParser.array_size_return array_size() throws RecognitionException {
        ObjchParser.array_size_return retval = new ObjchParser.array_size_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal227=null;
        Token NUMBER228=null;
        Token char_literal229=null;

        Object char_literal227_tree=null;
        Object NUMBER228_tree=null;
        Object char_literal229_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:328:2: ( '[' ( NUMBER )? ']' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:328:4: '[' ( NUMBER )? ']'
            {
            root_0 = (Object)adaptor.nil();


            char_literal227=(Token)match(input,71,FOLLOW_71_in_array_size1793); 
            char_literal227_tree = 
            (Object)adaptor.create(char_literal227)
            ;
            adaptor.addChild(root_0, char_literal227_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:328:8: ( NUMBER )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==NUMBER) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:328:8: NUMBER
                    {
                    NUMBER228=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_array_size1795); 
                    NUMBER228_tree = 
                    (Object)adaptor.create(NUMBER228)
                    ;
                    adaptor.addChild(root_0, NUMBER228_tree);


                    }
                    break;

            }


            char_literal229=(Token)match(input,72,FOLLOW_72_in_array_size1798); 
            char_literal229_tree = 
            (Object)adaptor.create(char_literal229)
            ;
            adaptor.addChild(root_0, char_literal229_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "array_size"


    public static class field_crap_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "field_crap"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:330:1: field_crap : ':' NUMBER ;
    public final ObjchParser.field_crap_return field_crap() throws RecognitionException {
        ObjchParser.field_crap_return retval = new ObjchParser.field_crap_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal230=null;
        Token NUMBER231=null;

        Object char_literal230_tree=null;
        Object NUMBER231_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:331:2: ( ':' NUMBER )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:331:4: ':' NUMBER
            {
            root_0 = (Object)adaptor.nil();


            char_literal230=(Token)match(input,54,FOLLOW_54_in_field_crap1807); 
            char_literal230_tree = 
            (Object)adaptor.create(char_literal230)
            ;
            adaptor.addChild(root_0, char_literal230_tree);


            NUMBER231=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_field_crap1809); 
            NUMBER231_tree = 
            (Object)adaptor.create(NUMBER231)
            ;
            adaptor.addChild(root_0, NUMBER231_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "field_crap"


    public static class method_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "method_declaration"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:333:1: method_declaration : method_modifier_wrapper method_declaration_variants ;
    public final ObjchParser.method_declaration_return method_declaration() throws RecognitionException {
        ObjchParser.method_declaration_return retval = new ObjchParser.method_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.method_modifier_wrapper_return method_modifier_wrapper232 =null;

        ObjchParser.method_declaration_variants_return method_declaration_variants233 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:334:2: ( method_modifier_wrapper method_declaration_variants )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:334:4: method_modifier_wrapper method_declaration_variants
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_method_modifier_wrapper_in_method_declaration1819);
            method_modifier_wrapper232=method_modifier_wrapper();

            state._fsp--;

            adaptor.addChild(root_0, method_modifier_wrapper232.getTree());

            pushFollow(FOLLOW_method_declaration_variants_in_method_declaration1821);
            method_declaration_variants233=method_declaration_variants();

            state._fsp--;

            adaptor.addChild(root_0, method_declaration_variants233.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "method_declaration"


    public static class method_modifier_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "method_modifier_wrapper"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:336:1: method_modifier_wrapper : method_modifier -> ^( MODIFIER method_modifier ) ;
    public final ObjchParser.method_modifier_wrapper_return method_modifier_wrapper() throws RecognitionException {
        ObjchParser.method_modifier_wrapper_return retval = new ObjchParser.method_modifier_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.method_modifier_return method_modifier234 =null;


        RewriteRuleSubtreeStream stream_method_modifier=new RewriteRuleSubtreeStream(adaptor,"rule method_modifier");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:337:2: ( method_modifier -> ^( MODIFIER method_modifier ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:337:4: method_modifier
            {
            pushFollow(FOLLOW_method_modifier_in_method_modifier_wrapper1831);
            method_modifier234=method_modifier();

            state._fsp--;

            stream_method_modifier.add(method_modifier234.getTree());

            // AST REWRITE
            // elements: method_modifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 337:20: -> ^( MODIFIER method_modifier )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:337:23: ^( MODIFIER method_modifier )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(MODIFIER, "MODIFIER")
                , root_1);

                adaptor.addChild(root_1, stream_method_modifier.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "method_modifier_wrapper"


    public static class method_modifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "method_modifier"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:339:1: method_modifier : ( '+' | '-' );
    public final ObjchParser.method_modifier_return method_modifier() throws RecognitionException {
        ObjchParser.method_modifier_return retval = new ObjchParser.method_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set235=null;

        Object set235_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:340:2: ( '+' | '-' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:
            {
            root_0 = (Object)adaptor.nil();


            set235=(Token)input.LT(1);

            if ( input.LA(1)==50||input.LA(1)==52 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set235)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "method_modifier"


    public static class method_declaration_variants_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "method_declaration_variants"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:342:1: method_declaration_variants : method_declaration_common ;
    public final ObjchParser.method_declaration_variants_return method_declaration_variants() throws RecognitionException {
        ObjchParser.method_declaration_variants_return retval = new ObjchParser.method_declaration_variants_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.method_declaration_common_return method_declaration_common236 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:343:2: ( method_declaration_common )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:346:4: method_declaration_common
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_method_declaration_common_in_method_declaration_variants1869);
            method_declaration_common236=method_declaration_common();

            state._fsp--;

            adaptor.addChild(root_0, method_declaration_common236.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "method_declaration_variants"


    public static class method_declaration_common_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "method_declaration_common"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:348:1: method_declaration_common : ( '(' type_declaration ')' )? method_name ( method_params )? ';' ;
    public final ObjchParser.method_declaration_common_return method_declaration_common() throws RecognitionException {
        ObjchParser.method_declaration_common_return retval = new ObjchParser.method_declaration_common_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal237=null;
        Token char_literal239=null;
        Token char_literal242=null;
        ObjchParser.type_declaration_return type_declaration238 =null;

        ObjchParser.method_name_return method_name240 =null;

        ObjchParser.method_params_return method_params241 =null;


        Object char_literal237_tree=null;
        Object char_literal239_tree=null;
        Object char_literal242_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:349:2: ( ( '(' type_declaration ')' )? method_name ( method_params )? ';' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:349:4: ( '(' type_declaration ')' )? method_name ( method_params )? ';'
            {
            root_0 = (Object)adaptor.nil();


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:349:4: ( '(' type_declaration ')' )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==47) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:349:5: '(' type_declaration ')'
                    {
                    char_literal237=(Token)match(input,47,FOLLOW_47_in_method_declaration_common1880); 
                    char_literal237_tree = 
                    (Object)adaptor.create(char_literal237)
                    ;
                    adaptor.addChild(root_0, char_literal237_tree);


                    pushFollow(FOLLOW_type_declaration_in_method_declaration_common1882);
                    type_declaration238=type_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, type_declaration238.getTree());

                    char_literal239=(Token)match(input,48,FOLLOW_48_in_method_declaration_common1884); 
                    char_literal239_tree = 
                    (Object)adaptor.create(char_literal239)
                    ;
                    adaptor.addChild(root_0, char_literal239_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_method_name_in_method_declaration_common1888);
            method_name240=method_name();

            state._fsp--;

            adaptor.addChild(root_0, method_name240.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:349:44: ( method_params )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==ID||LA88_0==54) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:349:44: method_params
                    {
                    pushFollow(FOLLOW_method_params_in_method_declaration_common1890);
                    method_params241=method_params();

                    state._fsp--;

                    adaptor.addChild(root_0, method_params241.getTree());

                    }
                    break;

            }


            char_literal242=(Token)match(input,55,FOLLOW_55_in_method_declaration_common1893); 
            char_literal242_tree = 
            (Object)adaptor.create(char_literal242)
            ;
            adaptor.addChild(root_0, char_literal242_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "method_declaration_common"


    public static class method_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "method_name"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:388:1: method_name : ( ID -> ^( METHOD_NAME ID ) | property_prefix_param -> ^( METHOD_NAME property_prefix_param ) );
    public final ObjchParser.method_name_return method_name() throws RecognitionException {
        ObjchParser.method_name_return retval = new ObjchParser.method_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID243=null;
        ObjchParser.property_prefix_param_return property_prefix_param244 =null;


        Object ID243_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_property_prefix_param=new RewriteRuleSubtreeStream(adaptor,"rule property_prefix_param");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:389:2: ( ID -> ^( METHOD_NAME ID ) | property_prefix_param -> ^( METHOD_NAME property_prefix_param ) )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==ID) ) {
                alt89=1;
            }
            else if ( (LA89_0==77||LA89_0==79||(LA89_0 >= 87 && LA89_0 <= 90)) ) {
                alt89=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;

            }
            switch (alt89) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:389:4: ID
                    {
                    ID243=(Token)match(input,ID,FOLLOW_ID_in_method_name1907);  
                    stream_ID.add(ID243);


                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 389:7: -> ^( METHOD_NAME ID )
                    {
                        // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:389:10: ^( METHOD_NAME ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(METHOD_NAME, "METHOD_NAME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:391:4: property_prefix_param
                    {
                    pushFollow(FOLLOW_property_prefix_param_in_method_name1921);
                    property_prefix_param244=property_prefix_param();

                    state._fsp--;

                    stream_property_prefix_param.add(property_prefix_param244.getTree());

                    // AST REWRITE
                    // elements: property_prefix_param
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 391:26: -> ^( METHOD_NAME property_prefix_param )
                    {
                        // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:391:29: ^( METHOD_NAME property_prefix_param )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(METHOD_NAME, "METHOD_NAME")
                        , root_1);

                        adaptor.addChild(root_1, stream_property_prefix_param.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "method_name"


    public static class method_params_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "method_params"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:393:1: method_params : ( method_param )+ -> ^( METHOD_PARAMS ( method_param )+ ) ;
    public final ObjchParser.method_params_return method_params() throws RecognitionException {
        ObjchParser.method_params_return retval = new ObjchParser.method_params_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.method_param_return method_param245 =null;


        RewriteRuleSubtreeStream stream_method_param=new RewriteRuleSubtreeStream(adaptor,"rule method_param");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:394:2: ( ( method_param )+ -> ^( METHOD_PARAMS ( method_param )+ ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:394:4: ( method_param )+
            {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:394:4: ( method_param )+
            int cnt90=0;
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==ID||LA90_0==54) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:394:4: method_param
            	    {
            	    pushFollow(FOLLOW_method_param_in_method_params1940);
            	    method_param245=method_param();

            	    state._fsp--;

            	    stream_method_param.add(method_param245.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt90 >= 1 ) break loop90;
                        EarlyExitException eee =
                            new EarlyExitException(90, input);
                        throw eee;
                }
                cnt90++;
            } while (true);


            // AST REWRITE
            // elements: method_param
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 394:18: -> ^( METHOD_PARAMS ( method_param )+ )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:394:21: ^( METHOD_PARAMS ( method_param )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(METHOD_PARAMS, "METHOD_PARAMS")
                , root_1);

                if ( !(stream_method_param.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_method_param.hasNext() ) {
                    adaptor.addChild(root_1, stream_method_param.nextTree());

                }
                stream_method_param.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "method_params"


    public static class method_param_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "method_param"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:396:1: method_param : ( prefix )? ':' ( '(' type_declaration ')' )? param_name -> ^( METHOD_PARAM ( prefix )? ':' '(' type_declaration ')' param_name ) ;
    public final ObjchParser.method_param_return method_param() throws RecognitionException {
        ObjchParser.method_param_return retval = new ObjchParser.method_param_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal247=null;
        Token char_literal248=null;
        Token char_literal250=null;
        ObjchParser.prefix_return prefix246 =null;

        ObjchParser.type_declaration_return type_declaration249 =null;

        ObjchParser.param_name_return param_name251 =null;


        Object char_literal247_tree=null;
        Object char_literal248_tree=null;
        Object char_literal250_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_prefix=new RewriteRuleSubtreeStream(adaptor,"rule prefix");
        RewriteRuleSubtreeStream stream_param_name=new RewriteRuleSubtreeStream(adaptor,"rule param_name");
        RewriteRuleSubtreeStream stream_type_declaration=new RewriteRuleSubtreeStream(adaptor,"rule type_declaration");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:397:2: ( ( prefix )? ':' ( '(' type_declaration ')' )? param_name -> ^( METHOD_PARAM ( prefix )? ':' '(' type_declaration ')' param_name ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:397:4: ( prefix )? ':' ( '(' type_declaration ')' )? param_name
            {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:397:4: ( prefix )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==ID) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:397:4: prefix
                    {
                    pushFollow(FOLLOW_prefix_in_method_param1959);
                    prefix246=prefix();

                    state._fsp--;

                    stream_prefix.add(prefix246.getTree());

                    }
                    break;

            }


            char_literal247=(Token)match(input,54,FOLLOW_54_in_method_param1962);  
            stream_54.add(char_literal247);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:397:16: ( '(' type_declaration ')' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==47) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:397:17: '(' type_declaration ')'
                    {
                    char_literal248=(Token)match(input,47,FOLLOW_47_in_method_param1965);  
                    stream_47.add(char_literal248);


                    pushFollow(FOLLOW_type_declaration_in_method_param1967);
                    type_declaration249=type_declaration();

                    state._fsp--;

                    stream_type_declaration.add(type_declaration249.getTree());

                    char_literal250=(Token)match(input,48,FOLLOW_48_in_method_param1969);  
                    stream_48.add(char_literal250);


                    }
                    break;

            }


            pushFollow(FOLLOW_param_name_in_method_param1973);
            param_name251=param_name();

            state._fsp--;

            stream_param_name.add(param_name251.getTree());

            // AST REWRITE
            // elements: 47, param_name, type_declaration, 48, 54, prefix
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 397:55: -> ^( METHOD_PARAM ( prefix )? ':' '(' type_declaration ')' param_name )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:397:58: ^( METHOD_PARAM ( prefix )? ':' '(' type_declaration ')' param_name )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(METHOD_PARAM, "METHOD_PARAM")
                , root_1);

                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:397:73: ( prefix )?
                if ( stream_prefix.hasNext() ) {
                    adaptor.addChild(root_1, stream_prefix.nextTree());

                }
                stream_prefix.reset();

                adaptor.addChild(root_1, 
                stream_54.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_47.nextNode()
                );

                adaptor.addChild(root_1, stream_type_declaration.nextTree());

                adaptor.addChild(root_1, 
                stream_48.nextNode()
                );

                adaptor.addChild(root_1, stream_param_name.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "method_param"


    public static class param_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "param_name"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:399:1: param_name : ( ID -> ^( PARAM_NAME ID ) | 'format' -> ^( PARAM_NAME 'format' ) );
    public final ObjchParser.param_name_return param_name() throws RecognitionException {
        ObjchParser.param_name_return retval = new ObjchParser.param_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID252=null;
        Token string_literal253=null;

        Object ID252_tree=null;
        Object string_literal253_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:400:2: ( ID -> ^( PARAM_NAME ID ) | 'format' -> ^( PARAM_NAME 'format' ) )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==ID) ) {
                alt93=1;
            }
            else if ( (LA93_0==83) ) {
                alt93=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;

            }
            switch (alt93) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:400:4: ID
                    {
                    ID252=(Token)match(input,ID,FOLLOW_ID_in_param_name2003);  
                    stream_ID.add(ID252);


                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 400:7: -> ^( PARAM_NAME ID )
                    {
                        // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:400:10: ^( PARAM_NAME ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PARAM_NAME, "PARAM_NAME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:401:4: 'format'
                    {
                    string_literal253=(Token)match(input,83,FOLLOW_83_in_param_name2016);  
                    stream_83.add(string_literal253);


                    // AST REWRITE
                    // elements: 83
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 401:13: -> ^( PARAM_NAME 'format' )
                    {
                        // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:401:16: ^( PARAM_NAME 'format' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PARAM_NAME, "PARAM_NAME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_83.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "param_name"


    public static class prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prefix"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:403:1: prefix : ID -> ^( PARAM_PREFIX ID ) ;
    public final ObjchParser.prefix_return prefix() throws RecognitionException {
        ObjchParser.prefix_return retval = new ObjchParser.prefix_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID254=null;

        Object ID254_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:403:8: ( ID -> ^( PARAM_PREFIX ID ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:403:10: ID
            {
            ID254=(Token)match(input,ID,FOLLOW_ID_in_prefix2033);  
            stream_ID.add(ID254);


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 403:13: -> ^( PARAM_PREFIX ID )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:403:16: ^( PARAM_PREFIX ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PARAM_PREFIX, "PARAM_PREFIX")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prefix"


    public static class extern_declatation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "extern_declatation"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:405:1: extern_declatation : 'extern' field_declaration ;
    public final ObjchParser.extern_declatation_return extern_declatation() throws RecognitionException {
        ObjchParser.extern_declatation_return retval = new ObjchParser.extern_declatation_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal255=null;
        ObjchParser.field_declaration_return field_declaration256 =null;


        Object string_literal255_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:406:2: ( 'extern' field_declaration )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:406:4: 'extern' field_declaration
            {
            root_0 = (Object)adaptor.nil();


            string_literal255=(Token)match(input,82,FOLLOW_82_in_extern_declatation2050); 
            string_literal255_tree = 
            (Object)adaptor.create(string_literal255)
            ;
            adaptor.addChild(root_0, string_literal255_tree);


            pushFollow(FOLLOW_field_declaration_in_extern_declatation2052);
            field_declaration256=field_declaration();

            state._fsp--;

            adaptor.addChild(root_0, field_declaration256.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "extern_declatation"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA74 dfa74 = new DFA74(this);
    static final String DFA2_eotS =
        "\u00a0\uffff";
    static final String DFA2_eofS =
        "\27\uffff\1\26\21\uffff\1\26\1\160\165\uffff";
    static final String DFA2_minS =
        "\1\16\1\uffff\2\16\3\uffff\1\16\17\uffff\2\16\4\uffff\1\16\6\uffff"+
        "\1\16\4\uffff\3\16\17\uffff\1\16\10\uffff\1\16\133\uffff";
    static final String DFA2_maxS =
        "\1\137\1\uffff\1\137\1\140\3\uffff\1\140\17\uffff\1\137\1\140\4"+
        "\uffff\1\140\6\uffff\1\140\4\uffff\2\137\1\61\17\uffff\1\137\10"+
        "\uffff\1\140\133\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\2\uffff\1\4\1\5\1\6\1\uffff\1\10\13\uffff\1\11\1\uffff"+
        "\1\2\7\uffff\1\3\6\uffff\1\7\61\uffff\2\2\26\uffff\2\2\26\uffff"+
        "\1\2\2\uffff\1\2\2\uffff\2\2\6\uffff\1\2\12\uffff";
    static final String DFA2_specialS =
        "\u00a0\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\10\43\uffff\1\10\1\uffff\1\10\10\uffff\1\1\1\uffff\1\5\1"+
            "\10\1\uffff\1\10\1\uffff\1\4\1\uffff\1\10\2\uffff\1\24\1\uffff"+
            "\1\24\1\10\1\uffff\1\10\2\uffff\1\3\1\6\1\uffff\3\10\4\uffff"+
            "\1\10\1\7\1\2\1\uffff\1\10",
            "",
            "\1\27\102\uffff\1\26\3\uffff\2\10\5\uffff\1\30\1\uffff\1\26"+
            "\1\10",
            "\1\35\106\uffff\2\10\5\uffff\2\10\1\uffff\1\10\1\36",
            "",
            "",
            "",
            "\1\44\106\uffff\2\10\10\uffff\1\10\1\45",
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
            "\1\52\40\uffff\1\53\1\uffff\1\51\1\26\1\uffff\1\26\2\uffff"+
            "\1\26\1\10\4\uffff\1\26\1\uffff\2\26\1\uffff\1\26\1\uffff\1"+
            "\26\1\uffff\1\26\1\10\1\uffff\1\26\1\uffff\2\26\1\uffff\1\73"+
            "\2\uffff\2\26\1\uffff\3\26\4\uffff\3\26\1\uffff\1\26",
            "\1\104\106\uffff\2\10\10\uffff\1\10\1\26",
            "",
            "",
            "",
            "",
            "\1\10\40\uffff\1\10\1\uffff\1\10\6\uffff\1\10\16\uffff\1\10"+
            "\6\uffff\1\10\21\uffff\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\10\40\uffff\1\10\1\uffff\1\10\6\uffff\1\10\16\uffff\1\10"+
            "\6\uffff\1\10\21\uffff\1\45",
            "",
            "",
            "",
            "",
            "\1\127\40\uffff\1\130\1\uffff\1\157\1\26\1\uffff\1\26\2\uffff"+
            "\1\26\5\uffff\1\26\1\uffff\2\26\1\uffff\1\26\1\uffff\1\26\1"+
            "\uffff\1\26\2\uffff\1\26\1\uffff\2\26\1\uffff\1\26\2\uffff\2"+
            "\26\1\uffff\3\26\4\uffff\3\26\1\uffff\1\26",
            "\1\160\40\uffff\1\u008a\1\uffff\2\160\1\10\1\160\1\uffff\1"+
            "\10\2\160\4\uffff\1\160\1\uffff\2\160\1\uffff\1\160\1\uffff"+
            "\1\160\1\uffff\1\160\1\u0087\1\uffff\1\160\1\uffff\2\160\1\uffff"+
            "\1\160\2\uffff\2\160\1\uffff\3\160\4\uffff\3\160\1\uffff\1\160",
            "\1\u008e\42\uffff\1\u008d",
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
            "\1\u0095\40\uffff\1\10\1\uffff\1\10\6\uffff\1\10\30\uffff\1"+
            "\160\3\uffff\2\160\5\uffff\2\160\1\uffff\1\160",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\10\40\uffff\1\10\1\uffff\1\10\6\uffff\1\10\16\uffff\1\10"+
            "\6\uffff\1\10\21\uffff\1\160",
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
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "59:1: code_internal : ( class_declaration | typedef_declaration_wrapper | enum_wrapper | protocol_declaration_wrapper | interface_declaration_wrapper | extern_declarations | typedef_struct | declarations | garbage );";
        }
    }
    static final String DFA12_eotS =
        "\135\uffff";
    static final String DFA12_eofS =
        "\1\3\1\31\133\uffff";
    static final String DFA12_minS =
        "\2\16\46\uffff\1\16\3\uffff\1\16\15\uffff\1\16\3\uffff\1\33\4\uffff"+
        "\1\16\31\uffff";
    static final String DFA12_maxS =
        "\2\137\46\uffff\1\137\3\uffff\1\116\15\uffff\1\116\3\uffff\1\110"+
        "\4\uffff\1\137\31\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\3\25\uffff\1\1\55\uffff\1\1\4\uffff\1\1\3\uffff\1"+
        "\1\2\uffff\1\1\11\uffff";
    static final String DFA12_specialS =
        "\135\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1\40\uffff\1\2\2\uffff\1\3\1\uffff\1\3\2\uffff\1\3\5\uffff"+
            "\1\3\1\uffff\2\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\2\uffff"+
            "\1\3\1\uffff\2\3\1\uffff\1\3\2\uffff\2\3\1\uffff\3\3\4\uffff"+
            "\3\3\1\uffff\1\3",
            "\1\54\40\uffff\1\3\1\uffff\1\3\1\31\1\uffff\1\31\2\uffff\1"+
            "\31\1\3\4\uffff\1\31\1\uffff\2\31\1\uffff\1\31\1\uffff\1\31"+
            "\1\uffff\1\31\1\3\1\uffff\1\31\1\uffff\2\31\1\uffff\1\50\2\uffff"+
            "\2\31\1\uffff\3\31\4\uffff\3\31\1\uffff\1\31",
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
            "\1\72\40\uffff\1\3\1\uffff\1\3\6\uffff\1\3\30\uffff\1\31\3"+
            "\uffff\2\31\5\uffff\2\31\1\uffff\1\31",
            "",
            "",
            "",
            "\1\31\40\uffff\1\103\1\uffff\1\31\1\uffff\1\3\2\uffff\2\3\1"+
            "\31\16\uffff\1\76\6\uffff\1\31",
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
            "\1\31\40\uffff\1\114\1\uffff\1\31\1\uffff\1\3\2\uffff\2\3\1"+
            "\31\16\uffff\1\107\6\uffff\1\31",
            "",
            "",
            "",
            "\1\3\54\uffff\1\120",
            "",
            "",
            "",
            "",
            "\1\123\41\uffff\1\3\1\31\3\uffff\1\3\30\uffff\1\3\2\uffff\1"+
            "\3\3\uffff\2\3\5\uffff\2\3\1\uffff\1\3",
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
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "124:31: ( typedef_name | func_pointer )?";
        }
    }
    static final String DFA51_eotS =
        "\u0a68\uffff";
    static final String DFA51_eofS =
        "\u0a68\uffff";
    static final String DFA51_minS =
        "\14\16\3\uffff\70\16\1\110\3\16\1\57\2\16\1\110\3\16\1\57\2\16\1"+
        "\110\3\16\1\57\57\16\1\110\3\16\1\57\2\16\1\110\3\16\1\57\2\16\1"+
        "\110\3\16\1\57\46\16\1\110\3\16\1\57\2\16\1\110\3\16\1\57\2\16\1"+
        "\110\3\16\1\57\36\16\1\110\3\16\1\57\2\16\1\110\3\16\1\57\2\16\1"+
        "\110\3\16\1\57\27\16\1\110\3\16\1\57\2\16\1\110\3\16\1\57\2\16\1"+
        "\110\3\16\1\57\21\16\1\110\3\16\1\57\2\16\1\110\3\16\1\57\2\16\1"+
        "\110\3\16\1\57\14\16\1\110\3\16\1\57\2\16\1\110\3\16\1\57\2\16\1"+
        "\110\3\16\1\57\10\16\1\110\3\16\1\57\2\16\1\110\3\16\1\57\2\16\1"+
        "\110\3\16\1\57\1\16\1\110\3\16\1\57\2\16\1\110\3\16\1\57\2\16\1"+
        "\33\3\16\1\57\1\16\1\33\1\16\1\uffff\2\16\1\57\6\16\3\61\1\57\3"+
        "\16\1\60\3\16\1\57\6\16\3\61\1\57\2\16\2\33\2\16\1\uffff\1\16\1"+
        "\60\1\110\3\16\1\57\4\16\1\57\6\16\3\61\1\57\2\16\2\33\2\16\1\uffff"+
        "\1\16\1\60\1\16\1\110\3\16\1\57\5\16\1\57\6\16\3\61\1\57\2\16\2"+
        "\33\2\16\1\uffff\1\16\1\60\u085e\uffff";
    static final String DFA51_maxS =
        "\1\142\7\137\1\126\1\116\1\126\1\116\3\uffff\6\137\1\126\1\116\1"+
        "\126\1\116\5\137\1\126\1\116\1\126\1\116\4\137\1\126\1\116\1\126"+
        "\1\116\3\137\1\126\1\116\1\126\1\116\2\137\1\126\1\116\1\126\1\116"+
        "\1\137\1\126\1\116\1\126\1\116\1\126\1\116\1\126\2\116\1\126\1\116"+
        "\1\70\1\137\2\61\1\110\1\70\1\137\1\61\1\107\1\61\1\116\1\110\1"+
        "\70\1\137\1\61\1\107\1\61\1\126\1\110\1\70\1\137\1\61\1\107\1\61"+
        "\5\137\1\126\1\116\1\126\1\116\4\137\1\126\1\116\1\126\1\116\3\137"+
        "\1\126\1\116\1\126\1\116\2\137\1\126\1\116\1\126\1\116\1\137\1\126"+
        "\1\116\1\126\1\116\1\126\1\116\1\126\2\116\1\126\1\116\1\70\1\137"+
        "\2\61\1\110\1\70\1\137\1\61\1\107\1\61\1\116\1\110\1\70\1\137\1"+
        "\61\1\107\1\61\1\126\1\110\1\70\1\137\1\61\1\107\1\61\4\137\1\126"+
        "\1\116\1\126\1\116\3\137\1\126\1\116\1\126\1\116\2\137\1\126\1\116"+
        "\1\126\1\116\1\137\1\126\1\116\1\126\1\116\1\126\1\116\1\126\2\116"+
        "\1\126\1\116\1\70\1\137\2\61\1\110\1\70\1\137\1\61\1\107\1\61\1"+
        "\116\1\110\1\70\1\137\1\61\1\107\1\61\1\126\1\110\1\70\1\137\1\61"+
        "\1\107\1\61\3\137\1\126\1\116\1\126\1\116\2\137\1\126\1\116\1\126"+
        "\1\116\1\137\1\126\1\116\1\126\1\116\1\126\1\116\1\126\2\116\1\126"+
        "\1\116\1\70\1\137\2\61\1\110\1\70\1\137\1\61\1\107\1\61\1\116\1"+
        "\110\1\70\1\137\1\61\1\107\1\61\1\126\1\110\1\70\1\137\1\61\1\107"+
        "\1\61\2\137\1\126\1\116\1\126\1\116\1\137\1\126\1\116\1\126\1\116"+
        "\1\126\1\116\1\126\2\116\1\126\1\116\1\70\1\137\2\61\1\110\1\70"+
        "\1\137\1\61\1\107\1\61\1\116\1\110\1\70\1\137\1\61\1\107\1\61\1"+
        "\126\1\110\1\70\1\137\1\61\1\107\1\61\1\137\1\126\1\116\1\126\1"+
        "\116\1\126\1\116\1\126\2\116\1\126\1\116\1\70\1\137\2\61\1\110\1"+
        "\70\1\137\1\61\1\107\1\61\1\116\1\110\1\70\1\137\1\61\1\107\1\61"+
        "\1\126\1\110\1\70\1\137\1\61\1\107\1\61\1\126\1\116\1\126\2\116"+
        "\1\126\1\116\1\70\1\137\2\61\1\110\1\70\1\137\1\61\1\107\1\61\1"+
        "\116\1\110\1\70\1\137\1\61\1\107\1\61\1\126\1\110\1\70\1\137\1\61"+
        "\1\107\1\61\1\116\1\126\1\116\1\70\1\137\2\61\1\110\1\70\1\137\1"+
        "\61\1\107\1\61\1\116\1\110\1\70\1\137\1\61\1\107\1\61\1\126\1\110"+
        "\1\70\1\137\1\61\1\107\1\61\1\110\1\70\1\137\1\61\1\107\1\61\1\116"+
        "\1\110\1\70\1\137\1\61\1\107\1\61\1\126\1\110\1\70\1\137\1\61\1"+
        "\107\1\137\1\33\1\16\1\uffff\1\137\1\61\1\107\1\61\4\137\1\126\1"+
        "\116\1\126\1\116\1\107\3\61\1\60\1\116\1\137\1\61\1\107\1\61\4\137"+
        "\1\126\1\116\1\126\1\116\1\107\2\61\1\110\1\33\1\137\1\16\1\uffff"+
        "\1\61\1\60\1\110\1\70\1\137\1\61\1\107\1\61\1\116\1\137\1\61\1\107"+
        "\1\61\4\137\1\126\1\116\1\126\1\116\1\107\2\61\1\110\1\33\1\137"+
        "\1\16\1\uffff\1\61\1\60\1\116\1\110\1\70\1\137\1\61\1\107\1\61\1"+
        "\126\1\116\1\137\1\61\1\107\1\61\4\137\1\126\1\116\1\126\1\116\1"+
        "\107\2\61\1\110\1\33\1\137\1\16\1\uffff\1\61\1\60\u085e\uffff";
    static final String DFA51_acceptS =
        "\14\uffff\1\2\u0198\uffff\1\1\45\uffff\1\1\34\uffff\1\1\36\uffff"+
        "\1\1\2\uffff\u085e\1";
    static final String DFA51_specialS =
        "\u0a68\uffff}>";
    static final String[] DFA51_transitionS = {
            "\1\13\62\uffff\1\14\1\uffff\1\14\1\uffff\1\14\6\uffff\1\1\1"+
            "\uffff\1\4\2\uffff\1\5\2\uffff\1\3\1\11\1\12\4\uffff\1\2\1\7"+
            "\1\6\1\14\1\10\2\uffff\1\14",
            "\1\30\77\uffff\1\21\2\uffff\1\22\2\uffff\1\20\1\26\1\27\4\uffff"+
            "\1\17\1\24\1\23\1\uffff\1\25",
            "\1\41\77\uffff\1\32\2\uffff\1\33\2\uffff\1\31\1\37\1\40\5\uffff"+
            "\1\35\1\34\1\uffff\1\36",
            "\1\51\77\uffff\1\42\2\uffff\1\43\3\uffff\1\47\1\50\5\uffff"+
            "\1\45\1\44\1\uffff\1\46",
            "\1\60\102\uffff\1\52\3\uffff\1\56\1\57\5\uffff\1\54\1\53\1"+
            "\uffff\1\55",
            "\1\66\106\uffff\1\64\1\65\5\uffff\1\62\1\61\1\uffff\1\63",
            "\1\73\106\uffff\1\71\1\72\5\uffff\1\67\2\uffff\1\70",
            "\1\77\106\uffff\1\75\1\76\10\uffff\1\74",
            "\1\102\40\uffff\1\106\1\uffff\1\105\6\uffff\1\104\25\uffff"+
            "\1\103\6\uffff\1\100\1\101",
            "\1\113\40\uffff\1\114\1\uffff\1\112\6\uffff\1\111\16\uffff"+
            "\1\107\6\uffff\1\110",
            "\1\122\40\uffff\1\123\1\uffff\1\121\6\uffff\1\120\16\uffff"+
            "\1\116\6\uffff\1\117\6\uffff\1\115\1\124",
            "\1\131\40\uffff\1\132\1\uffff\1\130\6\uffff\1\127\16\uffff"+
            "\1\125\6\uffff\1\126",
            "",
            "",
            "",
            "\1\143\77\uffff\1\134\2\uffff\1\135\2\uffff\1\133\1\141\1\142"+
            "\5\uffff\1\137\1\136\1\uffff\1\140",
            "\1\153\77\uffff\1\144\2\uffff\1\145\3\uffff\1\151\1\152\5\uffff"+
            "\1\147\1\146\1\uffff\1\150",
            "\1\162\102\uffff\1\154\3\uffff\1\160\1\161\5\uffff\1\156\1"+
            "\155\1\uffff\1\157",
            "\1\170\106\uffff\1\166\1\167\5\uffff\1\164\1\163\1\uffff\1"+
            "\165",
            "\1\175\106\uffff\1\173\1\174\5\uffff\1\171\2\uffff\1\172",
            "\1\u0081\106\uffff\1\177\1\u0080\10\uffff\1\176",
            "\1\u0084\40\uffff\1\u0088\1\uffff\1\u0087\6\uffff\1\u0086\25"+
            "\uffff\1\u0085\6\uffff\1\u0082\1\u0083",
            "\1\u008d\40\uffff\1\u008e\1\uffff\1\u008c\6\uffff\1\u008b\16"+
            "\uffff\1\u0089\6\uffff\1\u008a",
            "\1\u0094\40\uffff\1\u0095\1\uffff\1\u0093\6\uffff\1\u0092\16"+
            "\uffff\1\u0090\6\uffff\1\u0091\6\uffff\1\u008f\1\u0096",
            "\1\u009b\40\uffff\1\u009c\1\uffff\1\u009a\6\uffff\1\u0099\16"+
            "\uffff\1\u0097\6\uffff\1\u0098",
            "\1\u00a4\77\uffff\1\u009d\2\uffff\1\u009e\3\uffff\1\u00a2\1"+
            "\u00a3\5\uffff\1\u00a0\1\u009f\1\uffff\1\u00a1",
            "\1\u00ab\102\uffff\1\u00a5\3\uffff\1\u00a9\1\u00aa\5\uffff"+
            "\1\u00a7\1\u00a6\1\uffff\1\u00a8",
            "\1\u00b1\106\uffff\1\u00af\1\u00b0\5\uffff\1\u00ad\1\u00ac"+
            "\1\uffff\1\u00ae",
            "\1\u00b6\106\uffff\1\u00b4\1\u00b5\5\uffff\1\u00b2\2\uffff"+
            "\1\u00b3",
            "\1\u00ba\106\uffff\1\u00b8\1\u00b9\10\uffff\1\u00b7",
            "\1\u00bd\40\uffff\1\u00c1\1\uffff\1\u00c0\6\uffff\1\u00bf\25"+
            "\uffff\1\u00be\6\uffff\1\u00bb\1\u00bc",
            "\1\u00c6\40\uffff\1\u00c7\1\uffff\1\u00c5\6\uffff\1\u00c4\16"+
            "\uffff\1\u00c2\6\uffff\1\u00c3",
            "\1\u00cd\40\uffff\1\u00ce\1\uffff\1\u00cc\6\uffff\1\u00cb\16"+
            "\uffff\1\u00c9\6\uffff\1\u00ca\6\uffff\1\u00c8\1\u00cf",
            "\1\u00d4\40\uffff\1\u00d5\1\uffff\1\u00d3\6\uffff\1\u00d2\16"+
            "\uffff\1\u00d0\6\uffff\1\u00d1",
            "\1\u00dc\102\uffff\1\u00d6\3\uffff\1\u00da\1\u00db\5\uffff"+
            "\1\u00d8\1\u00d7\1\uffff\1\u00d9",
            "\1\u00e2\106\uffff\1\u00e0\1\u00e1\5\uffff\1\u00de\1\u00dd"+
            "\1\uffff\1\u00df",
            "\1\u00e7\106\uffff\1\u00e5\1\u00e6\5\uffff\1\u00e3\2\uffff"+
            "\1\u00e4",
            "\1\u00eb\106\uffff\1\u00e9\1\u00ea\10\uffff\1\u00e8",
            "\1\u00ee\40\uffff\1\u00f2\1\uffff\1\u00f1\6\uffff\1\u00f0\25"+
            "\uffff\1\u00ef\6\uffff\1\u00ec\1\u00ed",
            "\1\u00f7\40\uffff\1\u00f8\1\uffff\1\u00f6\6\uffff\1\u00f5\16"+
            "\uffff\1\u00f3\6\uffff\1\u00f4",
            "\1\u00fe\40\uffff\1\u00ff\1\uffff\1\u00fd\6\uffff\1\u00fc\16"+
            "\uffff\1\u00fa\6\uffff\1\u00fb\6\uffff\1\u00f9\1\u0100",
            "\1\u0105\40\uffff\1\u0106\1\uffff\1\u0104\6\uffff\1\u0103\16"+
            "\uffff\1\u0101\6\uffff\1\u0102",
            "\1\u010c\106\uffff\1\u010a\1\u010b\5\uffff\1\u0108\1\u0107"+
            "\1\uffff\1\u0109",
            "\1\u0111\106\uffff\1\u010f\1\u0110\5\uffff\1\u010d\2\uffff"+
            "\1\u010e",
            "\1\u0115\106\uffff\1\u0113\1\u0114\10\uffff\1\u0112",
            "\1\u0118\40\uffff\1\u011c\1\uffff\1\u011b\6\uffff\1\u011a\25"+
            "\uffff\1\u0119\6\uffff\1\u0116\1\u0117",
            "\1\u0121\40\uffff\1\u0122\1\uffff\1\u0120\6\uffff\1\u011f\16"+
            "\uffff\1\u011d\6\uffff\1\u011e",
            "\1\u0128\40\uffff\1\u0129\1\uffff\1\u0127\6\uffff\1\u0126\16"+
            "\uffff\1\u0124\6\uffff\1\u0125\6\uffff\1\u0123\1\u012a",
            "\1\u012f\40\uffff\1\u0130\1\uffff\1\u012e\6\uffff\1\u012d\16"+
            "\uffff\1\u012b\6\uffff\1\u012c",
            "\1\u0135\106\uffff\1\u0133\1\u0134\5\uffff\1\u0131\2\uffff"+
            "\1\u0132",
            "\1\u0139\106\uffff\1\u0137\1\u0138\10\uffff\1\u0136",
            "\1\u013c\40\uffff\1\u0140\1\uffff\1\u013f\6\uffff\1\u013e\25"+
            "\uffff\1\u013d\6\uffff\1\u013a\1\u013b",
            "\1\u0145\40\uffff\1\u0146\1\uffff\1\u0144\6\uffff\1\u0143\16"+
            "\uffff\1\u0141\6\uffff\1\u0142",
            "\1\u014c\40\uffff\1\u014d\1\uffff\1\u014b\6\uffff\1\u014a\16"+
            "\uffff\1\u0148\6\uffff\1\u0149\6\uffff\1\u0147\1\u014e",
            "\1\u0153\40\uffff\1\u0154\1\uffff\1\u0152\6\uffff\1\u0151\16"+
            "\uffff\1\u014f\6\uffff\1\u0150",
            "\1\u0158\106\uffff\1\u0156\1\u0157\10\uffff\1\u0155",
            "\1\u015b\40\uffff\1\u015f\1\uffff\1\u015e\6\uffff\1\u015d\25"+
            "\uffff\1\u015c\6\uffff\1\u0159\1\u015a",
            "\1\u0164\40\uffff\1\u0165\1\uffff\1\u0163\6\uffff\1\u0162\16"+
            "\uffff\1\u0160\6\uffff\1\u0161",
            "\1\u016b\40\uffff\1\u016c\1\uffff\1\u016a\6\uffff\1\u0169\16"+
            "\uffff\1\u0167\6\uffff\1\u0168\6\uffff\1\u0166\1\u016d",
            "\1\u0172\40\uffff\1\u0173\1\uffff\1\u0171\6\uffff\1\u0170\16"+
            "\uffff\1\u016e\6\uffff\1\u016f",
            "\1\u0176\40\uffff\1\u017a\1\uffff\1\u0179\6\uffff\1\u0178\25"+
            "\uffff\1\u0177\6\uffff\1\u0174\1\u0175",
            "\1\u017f\40\uffff\1\u0180\1\uffff\1\u017e\6\uffff\1\u017d\16"+
            "\uffff\1\u017b\6\uffff\1\u017c",
            "\1\u0186\40\uffff\1\u0187\1\uffff\1\u0185\6\uffff\1\u0184\16"+
            "\uffff\1\u0182\6\uffff\1\u0183\6\uffff\1\u0181\1\u0188",
            "\1\u018d\40\uffff\1\u018e\1\uffff\1\u018c\6\uffff\1\u018b\16"+
            "\uffff\1\u0189\6\uffff\1\u018a",
            "\1\u0193\40\uffff\1\u0194\1\uffff\1\u0192\6\uffff\1\u0191\16"+
            "\uffff\1\u018f\6\uffff\1\u0190",
            "\1\u019a\40\uffff\1\u019b\1\uffff\1\u0199\6\uffff\1\u0198\16"+
            "\uffff\1\u0196\6\uffff\1\u0197\6\uffff\1\u0195\1\u019c",
            "\1\u01a1\40\uffff\1\u01a2\1\uffff\1\u01a0\1\uffff\1\u01a4\2"+
            "\uffff\1\u01a3\1\u01a5\1\u019f\16\uffff\1\u019d\6\uffff\1\u019e",
            "\1\u01a8\40\uffff\1\u01a9\1\uffff\1\u01a7\6\uffff\1\u01a6",
            "\1\u01b1\77\uffff\1\u01aa\2\uffff\1\u01ab\3\uffff\1\u01af\1"+
            "\u01b0\5\uffff\1\u01ad\1\u01ac\1\uffff\1\u01ae",
            "\1\u01b2\40\uffff\1\u01b3\1\uffff\1\u01b4",
            "\1\u01b6\42\uffff\1\u01b5",
            "\1\u01b7",
            "\1\u01ba\40\uffff\1\u01bb\1\uffff\1\u01b9\6\uffff\1\u01b8",
            "\1\u01c3\77\uffff\1\u01bc\2\uffff\1\u01bd\3\uffff\1\u01c1\1"+
            "\u01c2\5\uffff\1\u01bf\1\u01be\1\uffff\1\u01c0",
            "\1\u01c4\40\uffff\1\u01c5\1\uffff\1\u01c6",
            "\1\u01c9\3\uffff\1\u01ca\2\uffff\1\u01c8\1\u01cb\17\uffff\1"+
            "\u01c7",
            "\1\u01cd\42\uffff\1\u01cc",
            "\1\u01d2\40\uffff\1\u01d3\1\uffff\1\u01d1\6\uffff\1\u01d0\16"+
            "\uffff\1\u01ce\6\uffff\1\u01cf",
            "\1\u01d4",
            "\1\u01d7\40\uffff\1\u01d8\1\uffff\1\u01d6\6\uffff\1\u01d5",
            "\1\u01e0\77\uffff\1\u01d9\2\uffff\1\u01da\3\uffff\1\u01de\1"+
            "\u01df\5\uffff\1\u01dc\1\u01db\1\uffff\1\u01dd",
            "\1\u01e1\40\uffff\1\u01e2\1\uffff\1\u01e3",
            "\1\u01e6\3\uffff\1\u01e7\2\uffff\1\u01e5\1\u01e8\17\uffff\1"+
            "\u01e4",
            "\1\u01ea\42\uffff\1\u01e9",
            "\1\u01f0\40\uffff\1\u01f1\1\uffff\1\u01ef\6\uffff\1\u01ee\16"+
            "\uffff\1\u01ec\6\uffff\1\u01ed\6\uffff\1\u01eb\1\u01f2",
            "\1\u01f3",
            "\1\u01f6\40\uffff\1\u01f7\1\uffff\1\u01f5\6\uffff\1\u01f4",
            "\1\u01ff\77\uffff\1\u01f8\2\uffff\1\u01f9\3\uffff\1\u01fd\1"+
            "\u01fe\5\uffff\1\u01fb\1\u01fa\1\uffff\1\u01fc",
            "\1\u0200\40\uffff\1\u0201\1\uffff\1\u0202",
            "\1\u0205\3\uffff\1\u0206\2\uffff\1\u0204\1\u0207\17\uffff\1"+
            "\u0203",
            "\1\u0209\42\uffff\1\u0208",
            "\1\u0211\77\uffff\1\u020a\2\uffff\1\u020b\3\uffff\1\u020f\1"+
            "\u0210\5\uffff\1\u020d\1\u020c\1\uffff\1\u020e",
            "\1\u0218\102\uffff\1\u0212\3\uffff\1\u0216\1\u0217\5\uffff"+
            "\1\u0214\1\u0213\1\uffff\1\u0215",
            "\1\u021e\106\uffff\1\u021c\1\u021d\5\uffff\1\u021a\1\u0219"+
            "\1\uffff\1\u021b",
            "\1\u0223\106\uffff\1\u0221\1\u0222\5\uffff\1\u021f\2\uffff"+
            "\1\u0220",
            "\1\u0227\106\uffff\1\u0225\1\u0226\10\uffff\1\u0224",
            "\1\u022a\40\uffff\1\u022e\1\uffff\1\u022d\6\uffff\1\u022c\25"+
            "\uffff\1\u022b\6\uffff\1\u0228\1\u0229",
            "\1\u0233\40\uffff\1\u0234\1\uffff\1\u0232\6\uffff\1\u0231\16"+
            "\uffff\1\u022f\6\uffff\1\u0230",
            "\1\u023a\40\uffff\1\u023b\1\uffff\1\u0239\6\uffff\1\u0238\16"+
            "\uffff\1\u0236\6\uffff\1\u0237\6\uffff\1\u0235\1\u023c",
            "\1\u0241\40\uffff\1\u0242\1\uffff\1\u0240\6\uffff\1\u023f\16"+
            "\uffff\1\u023d\6\uffff\1\u023e",
            "\1\u0249\102\uffff\1\u0243\3\uffff\1\u0247\1\u0248\5\uffff"+
            "\1\u0245\1\u0244\1\uffff\1\u0246",
            "\1\u024f\106\uffff\1\u024d\1\u024e\5\uffff\1\u024b\1\u024a"+
            "\1\uffff\1\u024c",
            "\1\u0254\106\uffff\1\u0252\1\u0253\5\uffff\1\u0250\2\uffff"+
            "\1\u0251",
            "\1\u0258\106\uffff\1\u0256\1\u0257\10\uffff\1\u0255",
            "\1\u025b\40\uffff\1\u025f\1\uffff\1\u025e\6\uffff\1\u025d\25"+
            "\uffff\1\u025c\6\uffff\1\u0259\1\u025a",
            "\1\u0264\40\uffff\1\u0265\1\uffff\1\u0263\6\uffff\1\u0262\16"+
            "\uffff\1\u0260\6\uffff\1\u0261",
            "\1\u026b\40\uffff\1\u026c\1\uffff\1\u026a\6\uffff\1\u0269\16"+
            "\uffff\1\u0267\6\uffff\1\u0268\6\uffff\1\u0266\1\u026d",
            "\1\u0272\40\uffff\1\u0273\1\uffff\1\u0271\6\uffff\1\u0270\16"+
            "\uffff\1\u026e\6\uffff\1\u026f",
            "\1\u0279\106\uffff\1\u0277\1\u0278\5\uffff\1\u0275\1\u0274"+
            "\1\uffff\1\u0276",
            "\1\u027e\106\uffff\1\u027c\1\u027d\5\uffff\1\u027a\2\uffff"+
            "\1\u027b",
            "\1\u0282\106\uffff\1\u0280\1\u0281\10\uffff\1\u027f",
            "\1\u0285\40\uffff\1\u0289\1\uffff\1\u0288\6\uffff\1\u0287\25"+
            "\uffff\1\u0286\6\uffff\1\u0283\1\u0284",
            "\1\u028e\40\uffff\1\u028f\1\uffff\1\u028d\6\uffff\1\u028c\16"+
            "\uffff\1\u028a\6\uffff\1\u028b",
            "\1\u0295\40\uffff\1\u0296\1\uffff\1\u0294\6\uffff\1\u0293\16"+
            "\uffff\1\u0291\6\uffff\1\u0292\6\uffff\1\u0290\1\u0297",
            "\1\u029c\40\uffff\1\u029d\1\uffff\1\u029b\6\uffff\1\u029a\16"+
            "\uffff\1\u0298\6\uffff\1\u0299",
            "\1\u02a2\106\uffff\1\u02a0\1\u02a1\5\uffff\1\u029e\2\uffff"+
            "\1\u029f",
            "\1\u02a6\106\uffff\1\u02a4\1\u02a5\10\uffff\1\u02a3",
            "\1\u02a9\40\uffff\1\u02ad\1\uffff\1\u02ac\6\uffff\1\u02ab\25"+
            "\uffff\1\u02aa\6\uffff\1\u02a7\1\u02a8",
            "\1\u02b2\40\uffff\1\u02b3\1\uffff\1\u02b1\6\uffff\1\u02b0\16"+
            "\uffff\1\u02ae\6\uffff\1\u02af",
            "\1\u02b9\40\uffff\1\u02ba\1\uffff\1\u02b8\6\uffff\1\u02b7\16"+
            "\uffff\1\u02b5\6\uffff\1\u02b6\6\uffff\1\u02b4\1\u02bb",
            "\1\u02c0\40\uffff\1\u02c1\1\uffff\1\u02bf\6\uffff\1\u02be\16"+
            "\uffff\1\u02bc\6\uffff\1\u02bd",
            "\1\u02c5\106\uffff\1\u02c3\1\u02c4\10\uffff\1\u02c2",
            "\1\u02c8\40\uffff\1\u02cc\1\uffff\1\u02cb\6\uffff\1\u02ca\25"+
            "\uffff\1\u02c9\6\uffff\1\u02c6\1\u02c7",
            "\1\u02d1\40\uffff\1\u02d2\1\uffff\1\u02d0\6\uffff\1\u02cf\16"+
            "\uffff\1\u02cd\6\uffff\1\u02ce",
            "\1\u02d8\40\uffff\1\u02d9\1\uffff\1\u02d7\6\uffff\1\u02d6\16"+
            "\uffff\1\u02d4\6\uffff\1\u02d5\6\uffff\1\u02d3\1\u02da",
            "\1\u02df\40\uffff\1\u02e0\1\uffff\1\u02de\6\uffff\1\u02dd\16"+
            "\uffff\1\u02db\6\uffff\1\u02dc",
            "\1\u02e3\40\uffff\1\u02e7\1\uffff\1\u02e6\6\uffff\1\u02e5\25"+
            "\uffff\1\u02e4\6\uffff\1\u02e1\1\u02e2",
            "\1\u02ec\40\uffff\1\u02ed\1\uffff\1\u02eb\6\uffff\1\u02ea\16"+
            "\uffff\1\u02e8\6\uffff\1\u02e9",
            "\1\u02f3\40\uffff\1\u02f4\1\uffff\1\u02f2\6\uffff\1\u02f1\16"+
            "\uffff\1\u02ef\6\uffff\1\u02f0\6\uffff\1\u02ee\1\u02f5",
            "\1\u02fa\40\uffff\1\u02fb\1\uffff\1\u02f9\6\uffff\1\u02f8\16"+
            "\uffff\1\u02f6\6\uffff\1\u02f7",
            "\1\u0300\40\uffff\1\u0301\1\uffff\1\u02ff\6\uffff\1\u02fe\16"+
            "\uffff\1\u02fc\6\uffff\1\u02fd",
            "\1\u0307\40\uffff\1\u0308\1\uffff\1\u0306\6\uffff\1\u0305\16"+
            "\uffff\1\u0303\6\uffff\1\u0304\6\uffff\1\u0302\1\u0309",
            "\1\u030e\40\uffff\1\u030f\1\uffff\1\u030d\1\uffff\1\u0311\2"+
            "\uffff\1\u0310\1\u0312\1\u030c\16\uffff\1\u030a\6\uffff\1\u030b",
            "\1\u0315\40\uffff\1\u0316\1\uffff\1\u0314\6\uffff\1\u0313",
            "\1\u031e\77\uffff\1\u0317\2\uffff\1\u0318\3\uffff\1\u031c\1"+
            "\u031d\5\uffff\1\u031a\1\u0319\1\uffff\1\u031b",
            "\1\u031f\40\uffff\1\u0320\1\uffff\1\u0321",
            "\1\u0323\42\uffff\1\u0322",
            "\1\u0324",
            "\1\u0327\40\uffff\1\u0328\1\uffff\1\u0326\6\uffff\1\u0325",
            "\1\u0330\77\uffff\1\u0329\2\uffff\1\u032a\3\uffff\1\u032e\1"+
            "\u032f\5\uffff\1\u032c\1\u032b\1\uffff\1\u032d",
            "\1\u0331\40\uffff\1\u0332\1\uffff\1\u0333",
            "\1\u0336\3\uffff\1\u0337\2\uffff\1\u0335\1\u0338\17\uffff\1"+
            "\u0334",
            "\1\u033a\42\uffff\1\u0339",
            "\1\u033f\40\uffff\1\u0340\1\uffff\1\u033e\6\uffff\1\u033d\16"+
            "\uffff\1\u033b\6\uffff\1\u033c",
            "\1\u0341",
            "\1\u0344\40\uffff\1\u0345\1\uffff\1\u0343\6\uffff\1\u0342",
            "\1\u034d\77\uffff\1\u0346\2\uffff\1\u0347\3\uffff\1\u034b\1"+
            "\u034c\5\uffff\1\u0349\1\u0348\1\uffff\1\u034a",
            "\1\u034e\40\uffff\1\u034f\1\uffff\1\u0350",
            "\1\u0353\3\uffff\1\u0354\2\uffff\1\u0352\1\u0355\17\uffff\1"+
            "\u0351",
            "\1\u0357\42\uffff\1\u0356",
            "\1\u035d\40\uffff\1\u035e\1\uffff\1\u035c\6\uffff\1\u035b\16"+
            "\uffff\1\u0359\6\uffff\1\u035a\6\uffff\1\u0358\1\u035f",
            "\1\u0360",
            "\1\u0363\40\uffff\1\u0364\1\uffff\1\u0362\6\uffff\1\u0361",
            "\1\u036c\77\uffff\1\u0365\2\uffff\1\u0366\3\uffff\1\u036a\1"+
            "\u036b\5\uffff\1\u0368\1\u0367\1\uffff\1\u0369",
            "\1\u036d\40\uffff\1\u036e\1\uffff\1\u036f",
            "\1\u0372\3\uffff\1\u0373\2\uffff\1\u0371\1\u0374\17\uffff\1"+
            "\u0370",
            "\1\u0376\42\uffff\1\u0375",
            "\1\u037d\102\uffff\1\u0377\3\uffff\1\u037b\1\u037c\5\uffff"+
            "\1\u0379\1\u0378\1\uffff\1\u037a",
            "\1\u0383\106\uffff\1\u0381\1\u0382\5\uffff\1\u037f\1\u037e"+
            "\1\uffff\1\u0380",
            "\1\u0388\106\uffff\1\u0386\1\u0387\5\uffff\1\u0384\2\uffff"+
            "\1\u0385",
            "\1\u038c\106\uffff\1\u038a\1\u038b\10\uffff\1\u0389",
            "\1\u038f\40\uffff\1\u0393\1\uffff\1\u0392\6\uffff\1\u0391\25"+
            "\uffff\1\u0390\6\uffff\1\u038d\1\u038e",
            "\1\u0398\40\uffff\1\u0399\1\uffff\1\u0397\6\uffff\1\u0396\16"+
            "\uffff\1\u0394\6\uffff\1\u0395",
            "\1\u039f\40\uffff\1\u03a0\1\uffff\1\u039e\6\uffff\1\u039d\16"+
            "\uffff\1\u039b\6\uffff\1\u039c\6\uffff\1\u039a\1\u03a1",
            "\1\u03a6\40\uffff\1\u03a7\1\uffff\1\u03a5\6\uffff\1\u03a4\16"+
            "\uffff\1\u03a2\6\uffff\1\u03a3",
            "\1\u03ad\106\uffff\1\u03ab\1\u03ac\5\uffff\1\u03a9\1\u03a8"+
            "\1\uffff\1\u03aa",
            "\1\u03b2\106\uffff\1\u03b0\1\u03b1\5\uffff\1\u03ae\2\uffff"+
            "\1\u03af",
            "\1\u03b6\106\uffff\1\u03b4\1\u03b5\10\uffff\1\u03b3",
            "\1\u03b9\40\uffff\1\u03bd\1\uffff\1\u03bc\6\uffff\1\u03bb\25"+
            "\uffff\1\u03ba\6\uffff\1\u03b7\1\u03b8",
            "\1\u03c2\40\uffff\1\u03c3\1\uffff\1\u03c1\6\uffff\1\u03c0\16"+
            "\uffff\1\u03be\6\uffff\1\u03bf",
            "\1\u03c9\40\uffff\1\u03ca\1\uffff\1\u03c8\6\uffff\1\u03c7\16"+
            "\uffff\1\u03c5\6\uffff\1\u03c6\6\uffff\1\u03c4\1\u03cb",
            "\1\u03d0\40\uffff\1\u03d1\1\uffff\1\u03cf\6\uffff\1\u03ce\16"+
            "\uffff\1\u03cc\6\uffff\1\u03cd",
            "\1\u03d6\106\uffff\1\u03d4\1\u03d5\5\uffff\1\u03d2\2\uffff"+
            "\1\u03d3",
            "\1\u03da\106\uffff\1\u03d8\1\u03d9\10\uffff\1\u03d7",
            "\1\u03dd\40\uffff\1\u03e1\1\uffff\1\u03e0\6\uffff\1\u03df\25"+
            "\uffff\1\u03de\6\uffff\1\u03db\1\u03dc",
            "\1\u03e6\40\uffff\1\u03e7\1\uffff\1\u03e5\6\uffff\1\u03e4\16"+
            "\uffff\1\u03e2\6\uffff\1\u03e3",
            "\1\u03ed\40\uffff\1\u03ee\1\uffff\1\u03ec\6\uffff\1\u03eb\16"+
            "\uffff\1\u03e9\6\uffff\1\u03ea\6\uffff\1\u03e8\1\u03ef",
            "\1\u03f4\40\uffff\1\u03f5\1\uffff\1\u03f3\6\uffff\1\u03f2\16"+
            "\uffff\1\u03f0\6\uffff\1\u03f1",
            "\1\u03f9\106\uffff\1\u03f7\1\u03f8\10\uffff\1\u03f6",
            "\1\u03fc\40\uffff\1\u0400\1\uffff\1\u03ff\6\uffff\1\u03fe\25"+
            "\uffff\1\u03fd\6\uffff\1\u03fa\1\u03fb",
            "\1\u0405\40\uffff\1\u0406\1\uffff\1\u0404\6\uffff\1\u0403\16"+
            "\uffff\1\u0401\6\uffff\1\u0402",
            "\1\u040c\40\uffff\1\u040d\1\uffff\1\u040b\6\uffff\1\u040a\16"+
            "\uffff\1\u0408\6\uffff\1\u0409\6\uffff\1\u0407\1\u040e",
            "\1\u0413\40\uffff\1\u0414\1\uffff\1\u0412\6\uffff\1\u0411\16"+
            "\uffff\1\u040f\6\uffff\1\u0410",
            "\1\u0417\40\uffff\1\u041b\1\uffff\1\u041a\6\uffff\1\u0419\25"+
            "\uffff\1\u0418\6\uffff\1\u0415\1\u0416",
            "\1\u0420\40\uffff\1\u0421\1\uffff\1\u041f\6\uffff\1\u041e\16"+
            "\uffff\1\u041c\6\uffff\1\u041d",
            "\1\u0427\40\uffff\1\u0428\1\uffff\1\u0426\6\uffff\1\u0425\16"+
            "\uffff\1\u0423\6\uffff\1\u0424\6\uffff\1\u0422\1\u0429",
            "\1\u042e\40\uffff\1\u042f\1\uffff\1\u042d\6\uffff\1\u042c\16"+
            "\uffff\1\u042a\6\uffff\1\u042b",
            "\1\u0434\40\uffff\1\u0435\1\uffff\1\u0433\6\uffff\1\u0432\16"+
            "\uffff\1\u0430\6\uffff\1\u0431",
            "\1\u043b\40\uffff\1\u043c\1\uffff\1\u043a\6\uffff\1\u0439\16"+
            "\uffff\1\u0437\6\uffff\1\u0438\6\uffff\1\u0436\1\u043d",
            "\1\u0442\40\uffff\1\u0443\1\uffff\1\u0441\1\uffff\1\u0445\2"+
            "\uffff\1\u0444\1\u0446\1\u0440\16\uffff\1\u043e\6\uffff\1\u043f",
            "\1\u0449\40\uffff\1\u044a\1\uffff\1\u0448\6\uffff\1\u0447",
            "\1\u0452\77\uffff\1\u044b\2\uffff\1\u044c\3\uffff\1\u0450\1"+
            "\u0451\5\uffff\1\u044e\1\u044d\1\uffff\1\u044f",
            "\1\u0453\40\uffff\1\u0454\1\uffff\1\u0455",
            "\1\u0457\42\uffff\1\u0456",
            "\1\u0458",
            "\1\u045b\40\uffff\1\u045c\1\uffff\1\u045a\6\uffff\1\u0459",
            "\1\u0464\77\uffff\1\u045d\2\uffff\1\u045e\3\uffff\1\u0462\1"+
            "\u0463\5\uffff\1\u0460\1\u045f\1\uffff\1\u0461",
            "\1\u0465\40\uffff\1\u0466\1\uffff\1\u0467",
            "\1\u046a\3\uffff\1\u046b\2\uffff\1\u0469\1\u046c\17\uffff\1"+
            "\u0468",
            "\1\u046e\42\uffff\1\u046d",
            "\1\u0473\40\uffff\1\u0474\1\uffff\1\u0472\6\uffff\1\u0471\16"+
            "\uffff\1\u046f\6\uffff\1\u0470",
            "\1\u0475",
            "\1\u0478\40\uffff\1\u0479\1\uffff\1\u0477\6\uffff\1\u0476",
            "\1\u0481\77\uffff\1\u047a\2\uffff\1\u047b\3\uffff\1\u047f\1"+
            "\u0480\5\uffff\1\u047d\1\u047c\1\uffff\1\u047e",
            "\1\u0482\40\uffff\1\u0483\1\uffff\1\u0484",
            "\1\u0487\3\uffff\1\u0488\2\uffff\1\u0486\1\u0489\17\uffff\1"+
            "\u0485",
            "\1\u048b\42\uffff\1\u048a",
            "\1\u0491\40\uffff\1\u0492\1\uffff\1\u0490\6\uffff\1\u048f\16"+
            "\uffff\1\u048d\6\uffff\1\u048e\6\uffff\1\u048c\1\u0493",
            "\1\u0494",
            "\1\u0497\40\uffff\1\u0498\1\uffff\1\u0496\6\uffff\1\u0495",
            "\1\u04a0\77\uffff\1\u0499\2\uffff\1\u049a\3\uffff\1\u049e\1"+
            "\u049f\5\uffff\1\u049c\1\u049b\1\uffff\1\u049d",
            "\1\u04a1\40\uffff\1\u04a2\1\uffff\1\u04a3",
            "\1\u04a6\3\uffff\1\u04a7\2\uffff\1\u04a5\1\u04a8\17\uffff\1"+
            "\u04a4",
            "\1\u04aa\42\uffff\1\u04a9",
            "\1\u04b0\106\uffff\1\u04ae\1\u04af\5\uffff\1\u04ac\1\u04ab"+
            "\1\uffff\1\u04ad",
            "\1\u04b5\106\uffff\1\u04b3\1\u04b4\5\uffff\1\u04b1\2\uffff"+
            "\1\u04b2",
            "\1\u04b9\106\uffff\1\u04b7\1\u04b8\10\uffff\1\u04b6",
            "\1\u04bc\40\uffff\1\u04c0\1\uffff\1\u04bf\6\uffff\1\u04be\25"+
            "\uffff\1\u04bd\6\uffff\1\u04ba\1\u04bb",
            "\1\u04c5\40\uffff\1\u04c6\1\uffff\1\u04c4\6\uffff\1\u04c3\16"+
            "\uffff\1\u04c1\6\uffff\1\u04c2",
            "\1\u04cc\40\uffff\1\u04cd\1\uffff\1\u04cb\6\uffff\1\u04ca\16"+
            "\uffff\1\u04c8\6\uffff\1\u04c9\6\uffff\1\u04c7\1\u04ce",
            "\1\u04d3\40\uffff\1\u04d4\1\uffff\1\u04d2\6\uffff\1\u04d1\16"+
            "\uffff\1\u04cf\6\uffff\1\u04d0",
            "\1\u04d9\106\uffff\1\u04d7\1\u04d8\5\uffff\1\u04d5\2\uffff"+
            "\1\u04d6",
            "\1\u04dd\106\uffff\1\u04db\1\u04dc\10\uffff\1\u04da",
            "\1\u04e0\40\uffff\1\u04e4\1\uffff\1\u04e3\6\uffff\1\u04e2\25"+
            "\uffff\1\u04e1\6\uffff\1\u04de\1\u04df",
            "\1\u04e9\40\uffff\1\u04ea\1\uffff\1\u04e8\6\uffff\1\u04e7\16"+
            "\uffff\1\u04e5\6\uffff\1\u04e6",
            "\1\u04f0\40\uffff\1\u04f1\1\uffff\1\u04ef\6\uffff\1\u04ee\16"+
            "\uffff\1\u04ec\6\uffff\1\u04ed\6\uffff\1\u04eb\1\u04f2",
            "\1\u04f7\40\uffff\1\u04f8\1\uffff\1\u04f6\6\uffff\1\u04f5\16"+
            "\uffff\1\u04f3\6\uffff\1\u04f4",
            "\1\u04fc\106\uffff\1\u04fa\1\u04fb\10\uffff\1\u04f9",
            "\1\u04ff\40\uffff\1\u0503\1\uffff\1\u0502\6\uffff\1\u0501\25"+
            "\uffff\1\u0500\6\uffff\1\u04fd\1\u04fe",
            "\1\u0508\40\uffff\1\u0509\1\uffff\1\u0507\6\uffff\1\u0506\16"+
            "\uffff\1\u0504\6\uffff\1\u0505",
            "\1\u050f\40\uffff\1\u0510\1\uffff\1\u050e\6\uffff\1\u050d\16"+
            "\uffff\1\u050b\6\uffff\1\u050c\6\uffff\1\u050a\1\u0511",
            "\1\u0516\40\uffff\1\u0517\1\uffff\1\u0515\6\uffff\1\u0514\16"+
            "\uffff\1\u0512\6\uffff\1\u0513",
            "\1\u051a\40\uffff\1\u051e\1\uffff\1\u051d\6\uffff\1\u051c\25"+
            "\uffff\1\u051b\6\uffff\1\u0518\1\u0519",
            "\1\u0523\40\uffff\1\u0524\1\uffff\1\u0522\6\uffff\1\u0521\16"+
            "\uffff\1\u051f\6\uffff\1\u0520",
            "\1\u052a\40\uffff\1\u052b\1\uffff\1\u0529\6\uffff\1\u0528\16"+
            "\uffff\1\u0526\6\uffff\1\u0527\6\uffff\1\u0525\1\u052c",
            "\1\u0531\40\uffff\1\u0532\1\uffff\1\u0530\6\uffff\1\u052f\16"+
            "\uffff\1\u052d\6\uffff\1\u052e",
            "\1\u0537\40\uffff\1\u0538\1\uffff\1\u0536\6\uffff\1\u0535\16"+
            "\uffff\1\u0533\6\uffff\1\u0534",
            "\1\u053e\40\uffff\1\u053f\1\uffff\1\u053d\6\uffff\1\u053c\16"+
            "\uffff\1\u053a\6\uffff\1\u053b\6\uffff\1\u0539\1\u0540",
            "\1\u0545\40\uffff\1\u0546\1\uffff\1\u0544\1\uffff\1\u0548\2"+
            "\uffff\1\u0547\1\u0549\1\u0543\16\uffff\1\u0541\6\uffff\1\u0542",
            "\1\u054c\40\uffff\1\u054d\1\uffff\1\u054b\6\uffff\1\u054a",
            "\1\u0555\77\uffff\1\u054e\2\uffff\1\u054f\3\uffff\1\u0553\1"+
            "\u0554\5\uffff\1\u0551\1\u0550\1\uffff\1\u0552",
            "\1\u0556\40\uffff\1\u0557\1\uffff\1\u0558",
            "\1\u055a\42\uffff\1\u0559",
            "\1\u055b",
            "\1\u055e\40\uffff\1\u055f\1\uffff\1\u055d\6\uffff\1\u055c",
            "\1\u0567\77\uffff\1\u0560\2\uffff\1\u0561\3\uffff\1\u0565\1"+
            "\u0566\5\uffff\1\u0563\1\u0562\1\uffff\1\u0564",
            "\1\u0568\40\uffff\1\u0569\1\uffff\1\u056a",
            "\1\u056d\3\uffff\1\u056e\2\uffff\1\u056c\1\u056f\17\uffff\1"+
            "\u056b",
            "\1\u0571\42\uffff\1\u0570",
            "\1\u0576\40\uffff\1\u0577\1\uffff\1\u0575\6\uffff\1\u0574\16"+
            "\uffff\1\u0572\6\uffff\1\u0573",
            "\1\u0578",
            "\1\u057b\40\uffff\1\u057c\1\uffff\1\u057a\6\uffff\1\u0579",
            "\1\u0584\77\uffff\1\u057d\2\uffff\1\u057e\3\uffff\1\u0582\1"+
            "\u0583\5\uffff\1\u0580\1\u057f\1\uffff\1\u0581",
            "\1\u0585\40\uffff\1\u0586\1\uffff\1\u0587",
            "\1\u058a\3\uffff\1\u058b\2\uffff\1\u0589\1\u058c\17\uffff\1"+
            "\u0588",
            "\1\u058e\42\uffff\1\u058d",
            "\1\u0594\40\uffff\1\u0595\1\uffff\1\u0593\6\uffff\1\u0592\16"+
            "\uffff\1\u0590\6\uffff\1\u0591\6\uffff\1\u058f\1\u0596",
            "\1\u0597",
            "\1\u059a\40\uffff\1\u059b\1\uffff\1\u0599\6\uffff\1\u0598",
            "\1\u05a3\77\uffff\1\u059c\2\uffff\1\u059d\3\uffff\1\u05a1\1"+
            "\u05a2\5\uffff\1\u059f\1\u059e\1\uffff\1\u05a0",
            "\1\u05a4\40\uffff\1\u05a5\1\uffff\1\u05a6",
            "\1\u05a9\3\uffff\1\u05aa\2\uffff\1\u05a8\1\u05ab\17\uffff\1"+
            "\u05a7",
            "\1\u05ad\42\uffff\1\u05ac",
            "\1\u05b2\106\uffff\1\u05b0\1\u05b1\5\uffff\1\u05ae\2\uffff"+
            "\1\u05af",
            "\1\u05b6\106\uffff\1\u05b4\1\u05b5\10\uffff\1\u05b3",
            "\1\u05b9\40\uffff\1\u05bd\1\uffff\1\u05bc\6\uffff\1\u05bb\25"+
            "\uffff\1\u05ba\6\uffff\1\u05b7\1\u05b8",
            "\1\u05c2\40\uffff\1\u05c3\1\uffff\1\u05c1\6\uffff\1\u05c0\16"+
            "\uffff\1\u05be\6\uffff\1\u05bf",
            "\1\u05c9\40\uffff\1\u05ca\1\uffff\1\u05c8\6\uffff\1\u05c7\16"+
            "\uffff\1\u05c5\6\uffff\1\u05c6\6\uffff\1\u05c4\1\u05cb",
            "\1\u05d0\40\uffff\1\u05d1\1\uffff\1\u05cf\6\uffff\1\u05ce\16"+
            "\uffff\1\u05cc\6\uffff\1\u05cd",
            "\1\u05d5\106\uffff\1\u05d3\1\u05d4\10\uffff\1\u05d2",
            "\1\u05d8\40\uffff\1\u05dc\1\uffff\1\u05db\6\uffff\1\u05da\25"+
            "\uffff\1\u05d9\6\uffff\1\u05d6\1\u05d7",
            "\1\u05e1\40\uffff\1\u05e2\1\uffff\1\u05e0\6\uffff\1\u05df\16"+
            "\uffff\1\u05dd\6\uffff\1\u05de",
            "\1\u05e8\40\uffff\1\u05e9\1\uffff\1\u05e7\6\uffff\1\u05e6\16"+
            "\uffff\1\u05e4\6\uffff\1\u05e5\6\uffff\1\u05e3\1\u05ea",
            "\1\u05ef\40\uffff\1\u05f0\1\uffff\1\u05ee\6\uffff\1\u05ed\16"+
            "\uffff\1\u05eb\6\uffff\1\u05ec",
            "\1\u05f3\40\uffff\1\u05f7\1\uffff\1\u05f6\6\uffff\1\u05f5\25"+
            "\uffff\1\u05f4\6\uffff\1\u05f1\1\u05f2",
            "\1\u05fc\40\uffff\1\u05fd\1\uffff\1\u05fb\6\uffff\1\u05fa\16"+
            "\uffff\1\u05f8\6\uffff\1\u05f9",
            "\1\u0603\40\uffff\1\u0604\1\uffff\1\u0602\6\uffff\1\u0601\16"+
            "\uffff\1\u05ff\6\uffff\1\u0600\6\uffff\1\u05fe\1\u0605",
            "\1\u060a\40\uffff\1\u060b\1\uffff\1\u0609\6\uffff\1\u0608\16"+
            "\uffff\1\u0606\6\uffff\1\u0607",
            "\1\u0610\40\uffff\1\u0611\1\uffff\1\u060f\6\uffff\1\u060e\16"+
            "\uffff\1\u060c\6\uffff\1\u060d",
            "\1\u0617\40\uffff\1\u0618\1\uffff\1\u0616\6\uffff\1\u0615\16"+
            "\uffff\1\u0613\6\uffff\1\u0614\6\uffff\1\u0612\1\u0619",
            "\1\u061e\40\uffff\1\u061f\1\uffff\1\u061d\1\uffff\1\u0621\2"+
            "\uffff\1\u0620\1\u0622\1\u061c\16\uffff\1\u061a\6\uffff\1\u061b",
            "\1\u0625\40\uffff\1\u0626\1\uffff\1\u0624\6\uffff\1\u0623",
            "\1\u062e\77\uffff\1\u0627\2\uffff\1\u0628\3\uffff\1\u062c\1"+
            "\u062d\5\uffff\1\u062a\1\u0629\1\uffff\1\u062b",
            "\1\u062f\40\uffff\1\u0630\1\uffff\1\u0631",
            "\1\u0633\42\uffff\1\u0632",
            "\1\u0634",
            "\1\u0637\40\uffff\1\u0638\1\uffff\1\u0636\6\uffff\1\u0635",
            "\1\u0640\77\uffff\1\u0639\2\uffff\1\u063a\3\uffff\1\u063e\1"+
            "\u063f\5\uffff\1\u063c\1\u063b\1\uffff\1\u063d",
            "\1\u0641\40\uffff\1\u0642\1\uffff\1\u0643",
            "\1\u0646\3\uffff\1\u0647\2\uffff\1\u0645\1\u0648\17\uffff\1"+
            "\u0644",
            "\1\u064a\42\uffff\1\u0649",
            "\1\u064f\40\uffff\1\u0650\1\uffff\1\u064e\6\uffff\1\u064d\16"+
            "\uffff\1\u064b\6\uffff\1\u064c",
            "\1\u0651",
            "\1\u0654\40\uffff\1\u0655\1\uffff\1\u0653\6\uffff\1\u0652",
            "\1\u065d\77\uffff\1\u0656\2\uffff\1\u0657\3\uffff\1\u065b\1"+
            "\u065c\5\uffff\1\u0659\1\u0658\1\uffff\1\u065a",
            "\1\u065e\40\uffff\1\u065f\1\uffff\1\u0660",
            "\1\u0663\3\uffff\1\u0664\2\uffff\1\u0662\1\u0665\17\uffff\1"+
            "\u0661",
            "\1\u0667\42\uffff\1\u0666",
            "\1\u066d\40\uffff\1\u066e\1\uffff\1\u066c\6\uffff\1\u066b\16"+
            "\uffff\1\u0669\6\uffff\1\u066a\6\uffff\1\u0668\1\u066f",
            "\1\u0670",
            "\1\u0673\40\uffff\1\u0674\1\uffff\1\u0672\6\uffff\1\u0671",
            "\1\u067c\77\uffff\1\u0675\2\uffff\1\u0676\3\uffff\1\u067a\1"+
            "\u067b\5\uffff\1\u0678\1\u0677\1\uffff\1\u0679",
            "\1\u067d\40\uffff\1\u067e\1\uffff\1\u067f",
            "\1\u0682\3\uffff\1\u0683\2\uffff\1\u0681\1\u0684\17\uffff\1"+
            "\u0680",
            "\1\u0686\42\uffff\1\u0685",
            "\1\u068a\106\uffff\1\u0688\1\u0689\10\uffff\1\u0687",
            "\1\u068d\40\uffff\1\u0691\1\uffff\1\u0690\6\uffff\1\u068f\25"+
            "\uffff\1\u068e\6\uffff\1\u068b\1\u068c",
            "\1\u0696\40\uffff\1\u0697\1\uffff\1\u0695\6\uffff\1\u0694\16"+
            "\uffff\1\u0692\6\uffff\1\u0693",
            "\1\u069d\40\uffff\1\u069e\1\uffff\1\u069c\6\uffff\1\u069b\16"+
            "\uffff\1\u0699\6\uffff\1\u069a\6\uffff\1\u0698\1\u069f",
            "\1\u06a4\40\uffff\1\u06a5\1\uffff\1\u06a3\6\uffff\1\u06a2\16"+
            "\uffff\1\u06a0\6\uffff\1\u06a1",
            "\1\u06a8\40\uffff\1\u06ac\1\uffff\1\u06ab\6\uffff\1\u06aa\25"+
            "\uffff\1\u06a9\6\uffff\1\u06a6\1\u06a7",
            "\1\u06b1\40\uffff\1\u06b2\1\uffff\1\u06b0\6\uffff\1\u06af\16"+
            "\uffff\1\u06ad\6\uffff\1\u06ae",
            "\1\u06b8\40\uffff\1\u06b9\1\uffff\1\u06b7\6\uffff\1\u06b6\16"+
            "\uffff\1\u06b4\6\uffff\1\u06b5\6\uffff\1\u06b3\1\u06ba",
            "\1\u06bf\40\uffff\1\u06c0\1\uffff\1\u06be\6\uffff\1\u06bd\16"+
            "\uffff\1\u06bb\6\uffff\1\u06bc",
            "\1\u06c5\40\uffff\1\u06c6\1\uffff\1\u06c4\6\uffff\1\u06c3\16"+
            "\uffff\1\u06c1\6\uffff\1\u06c2",
            "\1\u06cc\40\uffff\1\u06cd\1\uffff\1\u06cb\6\uffff\1\u06ca\16"+
            "\uffff\1\u06c8\6\uffff\1\u06c9\6\uffff\1\u06c7\1\u06ce",
            "\1\u06d3\40\uffff\1\u06d4\1\uffff\1\u06d2\1\uffff\1\u06d6\2"+
            "\uffff\1\u06d5\1\u06d7\1\u06d1\16\uffff\1\u06cf\6\uffff\1\u06d0",
            "\1\u06da\40\uffff\1\u06db\1\uffff\1\u06d9\6\uffff\1\u06d8",
            "\1\u06e3\77\uffff\1\u06dc\2\uffff\1\u06dd\3\uffff\1\u06e1\1"+
            "\u06e2\5\uffff\1\u06df\1\u06de\1\uffff\1\u06e0",
            "\1\u06e4\40\uffff\1\u06e5\1\uffff\1\u06e6",
            "\1\u06e8\42\uffff\1\u06e7",
            "\1\u06e9",
            "\1\u06ec\40\uffff\1\u06ed\1\uffff\1\u06eb\6\uffff\1\u06ea",
            "\1\u06f5\77\uffff\1\u06ee\2\uffff\1\u06ef\3\uffff\1\u06f3\1"+
            "\u06f4\5\uffff\1\u06f1\1\u06f0\1\uffff\1\u06f2",
            "\1\u06f6\40\uffff\1\u06f7\1\uffff\1\u06f8",
            "\1\u06fb\3\uffff\1\u06fc\2\uffff\1\u06fa\1\u06fd\17\uffff\1"+
            "\u06f9",
            "\1\u06ff\42\uffff\1\u06fe",
            "\1\u0704\40\uffff\1\u0705\1\uffff\1\u0703\6\uffff\1\u0702\16"+
            "\uffff\1\u0700\6\uffff\1\u0701",
            "\1\u0706",
            "\1\u0709\40\uffff\1\u070a\1\uffff\1\u0708\6\uffff\1\u0707",
            "\1\u0712\77\uffff\1\u070b\2\uffff\1\u070c\3\uffff\1\u0710\1"+
            "\u0711\5\uffff\1\u070e\1\u070d\1\uffff\1\u070f",
            "\1\u0713\40\uffff\1\u0714\1\uffff\1\u0715",
            "\1\u0718\3\uffff\1\u0719\2\uffff\1\u0717\1\u071a\17\uffff\1"+
            "\u0716",
            "\1\u071c\42\uffff\1\u071b",
            "\1\u0722\40\uffff\1\u0723\1\uffff\1\u0721\6\uffff\1\u0720\16"+
            "\uffff\1\u071e\6\uffff\1\u071f\6\uffff\1\u071d\1\u0724",
            "\1\u0725",
            "\1\u0728\40\uffff\1\u0729\1\uffff\1\u0727\6\uffff\1\u0726",
            "\1\u0731\77\uffff\1\u072a\2\uffff\1\u072b\3\uffff\1\u072f\1"+
            "\u0730\5\uffff\1\u072d\1\u072c\1\uffff\1\u072e",
            "\1\u0732\40\uffff\1\u0733\1\uffff\1\u0734",
            "\1\u0737\3\uffff\1\u0738\2\uffff\1\u0736\1\u0739\17\uffff\1"+
            "\u0735",
            "\1\u073b\42\uffff\1\u073a",
            "\1\u073e\40\uffff\1\u0742\1\uffff\1\u0741\6\uffff\1\u0740\25"+
            "\uffff\1\u073f\6\uffff\1\u073c\1\u073d",
            "\1\u0747\40\uffff\1\u0748\1\uffff\1\u0746\6\uffff\1\u0745\16"+
            "\uffff\1\u0743\6\uffff\1\u0744",
            "\1\u074e\40\uffff\1\u074f\1\uffff\1\u074d\6\uffff\1\u074c\16"+
            "\uffff\1\u074a\6\uffff\1\u074b\6\uffff\1\u0749\1\u0750",
            "\1\u0755\40\uffff\1\u0756\1\uffff\1\u0754\6\uffff\1\u0753\16"+
            "\uffff\1\u0751\6\uffff\1\u0752",
            "\1\u075b\40\uffff\1\u075c\1\uffff\1\u075a\6\uffff\1\u0759\16"+
            "\uffff\1\u0757\6\uffff\1\u0758",
            "\1\u0762\40\uffff\1\u0763\1\uffff\1\u0761\6\uffff\1\u0760\16"+
            "\uffff\1\u075e\6\uffff\1\u075f\6\uffff\1\u075d\1\u0764",
            "\1\u0769\40\uffff\1\u076a\1\uffff\1\u0768\1\uffff\1\u076c\2"+
            "\uffff\1\u076b\1\u076d\1\u0767\16\uffff\1\u0765\6\uffff\1\u0766",
            "\1\u0770\40\uffff\1\u0771\1\uffff\1\u076f\6\uffff\1\u076e",
            "\1\u0779\77\uffff\1\u0772\2\uffff\1\u0773\3\uffff\1\u0777\1"+
            "\u0778\5\uffff\1\u0775\1\u0774\1\uffff\1\u0776",
            "\1\u077a\40\uffff\1\u077b\1\uffff\1\u077c",
            "\1\u077e\42\uffff\1\u077d",
            "\1\u077f",
            "\1\u0782\40\uffff\1\u0783\1\uffff\1\u0781\6\uffff\1\u0780",
            "\1\u078b\77\uffff\1\u0784\2\uffff\1\u0785\3\uffff\1\u0789\1"+
            "\u078a\5\uffff\1\u0787\1\u0786\1\uffff\1\u0788",
            "\1\u078c\40\uffff\1\u078d\1\uffff\1\u078e",
            "\1\u0791\3\uffff\1\u0792\2\uffff\1\u0790\1\u0793\17\uffff\1"+
            "\u078f",
            "\1\u0795\42\uffff\1\u0794",
            "\1\u079a\40\uffff\1\u079b\1\uffff\1\u0799\6\uffff\1\u0798\16"+
            "\uffff\1\u0796\6\uffff\1\u0797",
            "\1\u079c",
            "\1\u079f\40\uffff\1\u07a0\1\uffff\1\u079e\6\uffff\1\u079d",
            "\1\u07a8\77\uffff\1\u07a1\2\uffff\1\u07a2\3\uffff\1\u07a6\1"+
            "\u07a7\5\uffff\1\u07a4\1\u07a3\1\uffff\1\u07a5",
            "\1\u07a9\40\uffff\1\u07aa\1\uffff\1\u07ab",
            "\1\u07ae\3\uffff\1\u07af\2\uffff\1\u07ad\1\u07b0\17\uffff\1"+
            "\u07ac",
            "\1\u07b2\42\uffff\1\u07b1",
            "\1\u07b8\40\uffff\1\u07b9\1\uffff\1\u07b7\6\uffff\1\u07b6\16"+
            "\uffff\1\u07b4\6\uffff\1\u07b5\6\uffff\1\u07b3\1\u07ba",
            "\1\u07bb",
            "\1\u07be\40\uffff\1\u07bf\1\uffff\1\u07bd\6\uffff\1\u07bc",
            "\1\u07c7\77\uffff\1\u07c0\2\uffff\1\u07c1\3\uffff\1\u07c5\1"+
            "\u07c6\5\uffff\1\u07c3\1\u07c2\1\uffff\1\u07c4",
            "\1\u07c8\40\uffff\1\u07c9\1\uffff\1\u07ca",
            "\1\u07cd\3\uffff\1\u07ce\2\uffff\1\u07cc\1\u07cf\17\uffff\1"+
            "\u07cb",
            "\1\u07d1\42\uffff\1\u07d0",
            "\1\u07d6\40\uffff\1\u07d7\1\uffff\1\u07d5\6\uffff\1\u07d4\16"+
            "\uffff\1\u07d2\6\uffff\1\u07d3",
            "\1\u07dd\40\uffff\1\u07de\1\uffff\1\u07dc\6\uffff\1\u07db\16"+
            "\uffff\1\u07d9\6\uffff\1\u07da\6\uffff\1\u07d8\1\u07df",
            "\1\u07e4\40\uffff\1\u07e5\1\uffff\1\u07e3\1\uffff\1\u07e7\2"+
            "\uffff\1\u07e6\1\u07e8\1\u07e2\16\uffff\1\u07e0\6\uffff\1\u07e1",
            "\1\u07eb\40\uffff\1\u07ec\1\uffff\1\u07ea\6\uffff\1\u07e9",
            "\1\u07f4\77\uffff\1\u07ed\2\uffff\1\u07ee\3\uffff\1\u07f2\1"+
            "\u07f3\5\uffff\1\u07f0\1\u07ef\1\uffff\1\u07f1",
            "\1\u07f5\40\uffff\1\u07f6\1\uffff\1\u07f7",
            "\1\u07f9\42\uffff\1\u07f8",
            "\1\u07fa",
            "\1\u07fd\40\uffff\1\u07fe\1\uffff\1\u07fc\6\uffff\1\u07fb",
            "\1\u0806\77\uffff\1\u07ff\2\uffff\1\u0800\3\uffff\1\u0804\1"+
            "\u0805\5\uffff\1\u0802\1\u0801\1\uffff\1\u0803",
            "\1\u0807\40\uffff\1\u0808\1\uffff\1\u0809",
            "\1\u080c\3\uffff\1\u080d\2\uffff\1\u080b\1\u080e\17\uffff\1"+
            "\u080a",
            "\1\u0810\42\uffff\1\u080f",
            "\1\u0815\40\uffff\1\u0816\1\uffff\1\u0814\6\uffff\1\u0813\16"+
            "\uffff\1\u0811\6\uffff\1\u0812",
            "\1\u0817",
            "\1\u081a\40\uffff\1\u081b\1\uffff\1\u0819\6\uffff\1\u0818",
            "\1\u0823\77\uffff\1\u081c\2\uffff\1\u081d\3\uffff\1\u0821\1"+
            "\u0822\5\uffff\1\u081f\1\u081e\1\uffff\1\u0820",
            "\1\u0824\40\uffff\1\u0825\1\uffff\1\u0826",
            "\1\u0829\3\uffff\1\u082a\2\uffff\1\u0828\1\u082b\17\uffff\1"+
            "\u0827",
            "\1\u082d\42\uffff\1\u082c",
            "\1\u0833\40\uffff\1\u0834\1\uffff\1\u0832\6\uffff\1\u0831\16"+
            "\uffff\1\u082f\6\uffff\1\u0830\6\uffff\1\u082e\1\u0835",
            "\1\u0836",
            "\1\u0839\40\uffff\1\u083a\1\uffff\1\u0838\6\uffff\1\u0837",
            "\1\u0842\77\uffff\1\u083b\2\uffff\1\u083c\3\uffff\1\u0840\1"+
            "\u0841\5\uffff\1\u083e\1\u083d\1\uffff\1\u083f",
            "\1\u0843\40\uffff\1\u0844\1\uffff\1\u0845",
            "\1\u0848\3\uffff\1\u0849\2\uffff\1\u0847\1\u084a\17\uffff\1"+
            "\u0846",
            "\1\u084c\42\uffff\1\u084b",
            "\1\u084d",
            "\1\u0850\40\uffff\1\u0851\1\uffff\1\u084f\6\uffff\1\u084e",
            "\1\u0859\77\uffff\1\u0852\2\uffff\1\u0853\3\uffff\1\u0857\1"+
            "\u0858\5\uffff\1\u0855\1\u0854\1\uffff\1\u0856",
            "\1\u085a\40\uffff\1\u085b\1\uffff\1\u085c",
            "\1\u085f\3\uffff\1\u0860\2\uffff\1\u085e\1\u0861\17\uffff\1"+
            "\u085d",
            "\1\u0863\42\uffff\1\u0862",
            "\1\u0868\40\uffff\1\u0869\1\uffff\1\u0867\6\uffff\1\u0866\16"+
            "\uffff\1\u0864\6\uffff\1\u0865",
            "\1\u086a",
            "\1\u086d\40\uffff\1\u086e\1\uffff\1\u086c\6\uffff\1\u086b",
            "\1\u0876\77\uffff\1\u086f\2\uffff\1\u0870\3\uffff\1\u0874\1"+
            "\u0875\5\uffff\1\u0872\1\u0871\1\uffff\1\u0873",
            "\1\u0877\40\uffff\1\u0878\1\uffff\1\u0879",
            "\1\u087c\3\uffff\1\u087d\2\uffff\1\u087b\1\u087e\17\uffff\1"+
            "\u087a",
            "\1\u0880\42\uffff\1\u087f",
            "\1\u0886\40\uffff\1\u0887\1\uffff\1\u0885\6\uffff\1\u0884\16"+
            "\uffff\1\u0882\6\uffff\1\u0883\6\uffff\1\u0881\1\u0888",
            "\1\u088a\54\uffff\1\u0889",
            "\1\u088d\40\uffff\1\u088e\1\uffff\1\u088c\6\uffff\1\u088b",
            "\1\u0896\77\uffff\1\u088f\2\uffff\1\u0890\3\uffff\1\u0894\1"+
            "\u0895\5\uffff\1\u0892\1\u0891\1\uffff\1\u0893",
            "\1\u0897\40\uffff\1\u0898\1\uffff\1\u0899",
            "\1\u089c\3\uffff\1\u089d\2\uffff\1\u089b\1\u089e\17\uffff\1"+
            "\u089a",
            "\1\u08a0\41\uffff\1\u08a9\1\u089f\3\uffff\1\u08a8\30\uffff"+
            "\1\u08a1\2\uffff\1\u08a2\3\uffff\1\u08a6\1\u08a7\5\uffff\1\u08a4"+
            "\1\u08a3\1\uffff\1\u08a5",
            "\1\u08aa",
            "\1\u08ab",
            "",
            "\1\u08b3\77\uffff\1\u08ac\2\uffff\1\u08ad\3\uffff\1\u08b1\1"+
            "\u08b2\5\uffff\1\u08af\1\u08ae\1\uffff\1\u08b0",
            "\1\u08b4\40\uffff\1\u08b5\1\uffff\1\u08b6",
            "\1\u08b9\3\uffff\1\u08ba\2\uffff\1\u08b8\1\u08bb\17\uffff\1"+
            "\u08b7",
            "\1\u08bd\42\uffff\1\u08bc",
            "\1\u08c4\102\uffff\1\u08be\3\uffff\1\u08c2\1\u08c3\5\uffff"+
            "\1\u08c0\1\u08bf\1\uffff\1\u08c1",
            "\1\u08ca\106\uffff\1\u08c8\1\u08c9\5\uffff\1\u08c6\1\u08c5"+
            "\1\uffff\1\u08c7",
            "\1\u08cf\106\uffff\1\u08cd\1\u08ce\5\uffff\1\u08cb\2\uffff"+
            "\1\u08cc",
            "\1\u08d3\106\uffff\1\u08d1\1\u08d2\10\uffff\1\u08d0",
            "\1\u08d6\42\uffff\1\u08d9\1\uffff\1\u08da\4\uffff\1\u08d8\2"+
            "\uffff\1\u08db\22\uffff\1\u08d7\6\uffff\1\u08d4\1\u08d5",
            "\1\u08df\1\uffff\1\u08e0\4\uffff\1\u08de\2\uffff\1\u08e1\13"+
            "\uffff\1\u08dc\6\uffff\1\u08dd",
            "\1\u08e6\1\uffff\1\u08e7\4\uffff\1\u08e5\2\uffff\1\u08e8\13"+
            "\uffff\1\u08e3\6\uffff\1\u08e4\6\uffff\1\u08e2\1\u08e9",
            "\1\u08ed\1\uffff\1\u08ee\4\uffff\1\u08ec\2\uffff\1\u08ef\13"+
            "\uffff\1\u08ea\6\uffff\1\u08eb",
            "\1\u08f2\3\uffff\1\u08f3\2\uffff\1\u08f1\1\u08f4\17\uffff\1"+
            "\u08f0",
            "\1\u08f6\42\uffff\1\u08f5",
            "\1\u08f7\40\uffff\1\u08f8\1\uffff\1\u08f9",
            "\1\u08fa\42\uffff\1\u08fb",
            "\1\u08fc",
            "\1\u0900\40\uffff\1\u0901\1\uffff\1\u08ff\6\uffff\1\u08fe\16"+
            "\uffff\1\u0902\6\uffff\1\u08fd",
            "\1\u090a\77\uffff\1\u0903\2\uffff\1\u0904\3\uffff\1\u0908\1"+
            "\u0909\5\uffff\1\u0906\1\u0905\1\uffff\1\u0907",
            "\1\u090b\40\uffff\1\u090c\1\uffff\1\u090d",
            "\1\u0910\3\uffff\1\u0911\2\uffff\1\u090f\1\u0912\17\uffff\1"+
            "\u090e",
            "\1\u0914\42\uffff\1\u0913",
            "\1\u091b\102\uffff\1\u0915\3\uffff\1\u0919\1\u091a\5\uffff"+
            "\1\u0917\1\u0916\1\uffff\1\u0918",
            "\1\u0921\106\uffff\1\u091f\1\u0920\5\uffff\1\u091d\1\u091c"+
            "\1\uffff\1\u091e",
            "\1\u0926\106\uffff\1\u0924\1\u0925\5\uffff\1\u0922\2\uffff"+
            "\1\u0923",
            "\1\u092a\106\uffff\1\u0928\1\u0929\10\uffff\1\u0927",
            "\1\u092d\42\uffff\1\u0930\1\uffff\1\u0931\4\uffff\1\u092f\2"+
            "\uffff\1\u0932\22\uffff\1\u092e\6\uffff\1\u092b\1\u092c",
            "\1\u0936\1\uffff\1\u0937\4\uffff\1\u0935\2\uffff\1\u0938\13"+
            "\uffff\1\u0933\6\uffff\1\u0934",
            "\1\u093d\1\uffff\1\u093e\4\uffff\1\u093c\2\uffff\1\u093f\13"+
            "\uffff\1\u093a\6\uffff\1\u093b\6\uffff\1\u0939\1\u0940",
            "\1\u0944\1\uffff\1\u0945\4\uffff\1\u0943\2\uffff\1\u0946\13"+
            "\uffff\1\u0941\6\uffff\1\u0942",
            "\1\u0949\3\uffff\1\u094a\2\uffff\1\u0948\1\u094b\17\uffff\1"+
            "\u0947",
            "\1\u094d\42\uffff\1\u094c",
            "\1\u094e\40\uffff\1\u094f\1\uffff\1\u0950",
            "\1\u0951\54\uffff\1\u0952",
            "\1\u0953",
            "\1\u095b\41\uffff\1\u095d\4\uffff\1\u095c\30\uffff\1\u0954"+
            "\2\uffff\1\u0955\3\uffff\1\u0959\1\u095a\5\uffff\1\u0957\1\u0956"+
            "\1\uffff\1\u0958",
            "\1\u095e",
            "",
            "\1\u095f\42\uffff\1\u0960",
            "\1\u0961",
            "\1\u0962",
            "\1\u0965\40\uffff\1\u0966\1\uffff\1\u0964\6\uffff\1\u0963",
            "\1\u096e\77\uffff\1\u0967\2\uffff\1\u0968\3\uffff\1\u096c\1"+
            "\u096d\5\uffff\1\u096a\1\u0969\1\uffff\1\u096b",
            "\1\u096f\40\uffff\1\u0970\1\uffff\1\u0971",
            "\1\u0974\3\uffff\1\u0975\2\uffff\1\u0973\1\u0976\17\uffff\1"+
            "\u0972",
            "\1\u0978\42\uffff\1\u0977",
            "\1\u097c\40\uffff\1\u097d\1\uffff\1\u097b\6\uffff\1\u097a\16"+
            "\uffff\1\u097e\6\uffff\1\u0979",
            "\1\u0986\77\uffff\1\u097f\2\uffff\1\u0980\3\uffff\1\u0984\1"+
            "\u0985\5\uffff\1\u0982\1\u0981\1\uffff\1\u0983",
            "\1\u0987\40\uffff\1\u0988\1\uffff\1\u0989",
            "\1\u098c\3\uffff\1\u098d\2\uffff\1\u098b\1\u098e\17\uffff\1"+
            "\u098a",
            "\1\u0990\42\uffff\1\u098f",
            "\1\u0997\102\uffff\1\u0991\3\uffff\1\u0995\1\u0996\5\uffff"+
            "\1\u0993\1\u0992\1\uffff\1\u0994",
            "\1\u099d\106\uffff\1\u099b\1\u099c\5\uffff\1\u0999\1\u0998"+
            "\1\uffff\1\u099a",
            "\1\u09a2\106\uffff\1\u09a0\1\u09a1\5\uffff\1\u099e\2\uffff"+
            "\1\u099f",
            "\1\u09a6\106\uffff\1\u09a4\1\u09a5\10\uffff\1\u09a3",
            "\1\u09a9\42\uffff\1\u09ac\1\uffff\1\u09ad\4\uffff\1\u09ab\2"+
            "\uffff\1\u09ae\22\uffff\1\u09aa\6\uffff\1\u09a7\1\u09a8",
            "\1\u09b2\1\uffff\1\u09b3\4\uffff\1\u09b1\2\uffff\1\u09b4\13"+
            "\uffff\1\u09af\6\uffff\1\u09b0",
            "\1\u09b9\1\uffff\1\u09ba\4\uffff\1\u09b8\2\uffff\1\u09bb\13"+
            "\uffff\1\u09b6\6\uffff\1\u09b7\6\uffff\1\u09b5\1\u09bc",
            "\1\u09c0\1\uffff\1\u09c1\4\uffff\1\u09bf\2\uffff\1\u09c2\13"+
            "\uffff\1\u09bd\6\uffff\1\u09be",
            "\1\u09c5\3\uffff\1\u09c6\2\uffff\1\u09c4\1\u09c7\17\uffff\1"+
            "\u09c3",
            "\1\u09c9\42\uffff\1\u09c8",
            "\1\u09ca\40\uffff\1\u09cb\1\uffff\1\u09cc",
            "\1\u09cd\54\uffff\1\u09ce",
            "\1\u09cf",
            "\1\u09d7\41\uffff\1\u09d9\4\uffff\1\u09d8\30\uffff\1\u09d0"+
            "\2\uffff\1\u09d1\3\uffff\1\u09d5\1\u09d6\5\uffff\1\u09d3\1\u09d2"+
            "\1\uffff\1\u09d4",
            "\1\u09da",
            "",
            "\1\u09db\42\uffff\1\u09dc",
            "\1\u09dd",
            "\1\u09e2\40\uffff\1\u09e3\1\uffff\1\u09e1\6\uffff\1\u09e0\16"+
            "\uffff\1\u09de\6\uffff\1\u09df",
            "\1\u09e4",
            "\1\u09e7\40\uffff\1\u09e8\1\uffff\1\u09e6\6\uffff\1\u09e5",
            "\1\u09f0\77\uffff\1\u09e9\2\uffff\1\u09ea\3\uffff\1\u09ee\1"+
            "\u09ef\5\uffff\1\u09ec\1\u09eb\1\uffff\1\u09ed",
            "\1\u09f1\40\uffff\1\u09f2\1\uffff\1\u09f3",
            "\1\u09f6\3\uffff\1\u09f7\2\uffff\1\u09f5\1\u09f8\17\uffff\1"+
            "\u09f4",
            "\1\u09fa\42\uffff\1\u09f9",
            "\1\u0a00\40\uffff\1\u0a01\1\uffff\1\u09ff\6\uffff\1\u09fe\16"+
            "\uffff\1\u09fc\6\uffff\1\u09fd\6\uffff\1\u09fb\1\u0a02",
            "\1\u0a06\40\uffff\1\u0a07\1\uffff\1\u0a05\6\uffff\1\u0a04\16"+
            "\uffff\1\u0a08\6\uffff\1\u0a03",
            "\1\u0a10\77\uffff\1\u0a09\2\uffff\1\u0a0a\3\uffff\1\u0a0e\1"+
            "\u0a0f\5\uffff\1\u0a0c\1\u0a0b\1\uffff\1\u0a0d",
            "\1\u0a11\40\uffff\1\u0a12\1\uffff\1\u0a13",
            "\1\u0a16\3\uffff\1\u0a17\2\uffff\1\u0a15\1\u0a18\17\uffff\1"+
            "\u0a14",
            "\1\u0a1a\42\uffff\1\u0a19",
            "\1\u0a21\102\uffff\1\u0a1b\3\uffff\1\u0a1f\1\u0a20\5\uffff"+
            "\1\u0a1d\1\u0a1c\1\uffff\1\u0a1e",
            "\1\u0a27\106\uffff\1\u0a25\1\u0a26\5\uffff\1\u0a23\1\u0a22"+
            "\1\uffff\1\u0a24",
            "\1\u0a2c\106\uffff\1\u0a2a\1\u0a2b\5\uffff\1\u0a28\2\uffff"+
            "\1\u0a29",
            "\1\u0a30\106\uffff\1\u0a2e\1\u0a2f\10\uffff\1\u0a2d",
            "\1\u0a33\42\uffff\1\u0a36\1\uffff\1\u0a37\4\uffff\1\u0a35\2"+
            "\uffff\1\u0a38\22\uffff\1\u0a34\6\uffff\1\u0a31\1\u0a32",
            "\1\u0a3c\1\uffff\1\u0a3d\4\uffff\1\u0a3b\2\uffff\1\u0a3e\13"+
            "\uffff\1\u0a39\6\uffff\1\u0a3a",
            "\1\u0a43\1\uffff\1\u0a44\4\uffff\1\u0a42\2\uffff\1\u0a45\13"+
            "\uffff\1\u0a40\6\uffff\1\u0a41\6\uffff\1\u0a3f\1\u0a46",
            "\1\u0a4a\1\uffff\1\u0a4b\4\uffff\1\u0a49\2\uffff\1\u0a4c\13"+
            "\uffff\1\u0a47\6\uffff\1\u0a48",
            "\1\u0a4f\3\uffff\1\u0a50\2\uffff\1\u0a4e\1\u0a51\17\uffff\1"+
            "\u0a4d",
            "\1\u0a53\42\uffff\1\u0a52",
            "\1\u0a54\40\uffff\1\u0a55\1\uffff\1\u0a56",
            "\1\u0a57\54\uffff\1\u0a58",
            "\1\u0a59",
            "\1\u0a61\41\uffff\1\u0a63\4\uffff\1\u0a62\30\uffff\1\u0a5a"+
            "\2\uffff\1\u0a5b\3\uffff\1\u0a5f\1\u0a60\5\uffff\1\u0a5d\1\u0a5c"+
            "\1\uffff\1\u0a5e",
            "\1\u0a64",
            "",
            "\1\u0a65\42\uffff\1\u0a66",
            "\1\u0a67",
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
            ""
    };

    static final short[] DFA51_eot = DFA.unpackEncodedString(DFA51_eotS);
    static final short[] DFA51_eof = DFA.unpackEncodedString(DFA51_eofS);
    static final char[] DFA51_min = DFA.unpackEncodedStringToUnsignedChars(DFA51_minS);
    static final char[] DFA51_max = DFA.unpackEncodedStringToUnsignedChars(DFA51_maxS);
    static final short[] DFA51_accept = DFA.unpackEncodedString(DFA51_acceptS);
    static final short[] DFA51_special = DFA.unpackEncodedString(DFA51_specialS);
    static final short[][] DFA51_transition;

    static {
        int numStates = DFA51_transitionS.length;
        DFA51_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA51_transition[i] = DFA.unpackEncodedString(DFA51_transitionS[i]);
        }
    }

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = DFA51_eot;
            this.eof = DFA51_eof;
            this.min = DFA51_min;
            this.max = DFA51_max;
            this.accept = DFA51_accept;
            this.special = DFA51_special;
            this.transition = DFA51_transition;
        }
        public String getDescription() {
            return "260:27: ( simple_fields_declaration )?";
        }
    }
    static final String DFA74_eotS =
        "\171\uffff";
    static final String DFA74_eofS =
        "\171\uffff";
    static final String DFA74_minS =
        "\1\16\2\uffff\1\16\7\uffff\1\33\4\uffff\1\16\1\uffff\2\16\2\uffff"+
        "\1\16\1\uffff\10\16\2\uffff\1\16\126\uffff";
    static final String DFA74_maxS =
        "\1\126\2\uffff\1\116\7\uffff\1\110\4\uffff\1\137\1\uffff\1\137\1"+
        "\132\2\uffff\1\116\1\uffff\4\137\1\126\1\116\1\126\1\116\2\uffff"+
        "\1\116\126\uffff";
    static final String DFA74_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\60\uffff\1\1\1\uffff\3\1\2\uffff\34\1\2"+
        "\uffff\4\1\3\uffff\5\1\2\uffff\1\1\1\uffff\4\1\1\uffff\1\1\11\uffff";
    static final String DFA74_specialS =
        "\171\uffff}>";
    static final String[] DFA74_transitionS = {
            "\1\3\40\uffff\3\4\1\uffff\1\4\4\uffff\1\4\2\uffff\1\4\22\uffff"+
            "\1\4\6\uffff\2\1",
            "",
            "",
            "\1\1\40\uffff\1\22\1\23\1\1\1\uffff\1\20\2\uffff\2\4\1\1\2"+
            "\uffff\1\1\13\uffff\1\13\6\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\4\54\uffff\1\26",
            "",
            "",
            "",
            "",
            "\1\37\46\uffff\1\4\30\uffff\1\30\2\uffff\1\31\3\uffff\1\35"+
            "\1\36\5\uffff\1\33\1\32\1\uffff\1\34",
            "",
            "\1\42\41\uffff\1\4\1\1\3\uffff\1\4\30\uffff\1\4\2\uffff\1\4"+
            "\3\uffff\2\4\5\uffff\2\4\1\uffff\1\4",
            "\1\1\50\uffff\1\4\22\uffff\1\4\2\uffff\1\1\1\uffff\1\1\3\uffff"+
            "\1\1\3\uffff\4\1",
            "",
            "",
            "\1\1\40\uffff\1\67\1\70\1\1\1\uffff\1\65\2\uffff\2\4\1\1\2"+
            "\uffff\1\1\13\uffff\1\71\6\uffff\1\1",
            "",
            "\1\102\102\uffff\1\74\3\uffff\1\100\1\101\5\uffff\1\76\1\75"+
            "\1\uffff\1\77",
            "\1\110\106\uffff\1\106\1\107\5\uffff\1\104\1\103\1\uffff\1"+
            "\105",
            "\1\115\106\uffff\1\113\1\114\5\uffff\1\111\2\uffff\1\112",
            "\1\121\106\uffff\1\117\1\120\10\uffff\1\116",
            "\1\124\42\uffff\1\127\1\uffff\1\1\4\uffff\1\126\2\uffff\1\1"+
            "\22\uffff\1\125\6\uffff\1\122\1\123",
            "\1\4\42\uffff\1\135\1\uffff\1\1\4\uffff\1\134\2\uffff\1\1\13"+
            "\uffff\1\132\6\uffff\1\133",
            "\1\4\42\uffff\1\145\1\uffff\1\1\4\uffff\1\144\2\uffff\1\1\13"+
            "\uffff\1\142\6\uffff\1\143\6\uffff\1\141\1\150",
            "\1\4\42\uffff\1\155\1\uffff\1\157\2\uffff\2\4\1\154\2\uffff"+
            "\1\1\13\uffff\1\152\6\uffff\1\153",
            "",
            "",
            "\1\4\41\uffff\1\1\1\4\6\uffff\1\4\16\uffff\1\4\6\uffff\1\4",
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
            ""
    };

    static final short[] DFA74_eot = DFA.unpackEncodedString(DFA74_eotS);
    static final short[] DFA74_eof = DFA.unpackEncodedString(DFA74_eofS);
    static final char[] DFA74_min = DFA.unpackEncodedStringToUnsignedChars(DFA74_minS);
    static final char[] DFA74_max = DFA.unpackEncodedStringToUnsignedChars(DFA74_maxS);
    static final short[] DFA74_accept = DFA.unpackEncodedString(DFA74_acceptS);
    static final short[] DFA74_special = DFA.unpackEncodedString(DFA74_specialS);
    static final short[][] DFA74_transition;

    static {
        int numStates = DFA74_transitionS.length;
        DFA74_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA74_transition[i] = DFA.unpackEncodedString(DFA74_transitionS[i]);
        }
    }

    class DFA74 extends DFA {

        public DFA74(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 74;
            this.eot = DFA74_eot;
            this.eof = DFA74_eof;
            this.min = DFA74_min;
            this.max = DFA74_max;
            this.accept = DFA74_accept;
            this.special = DFA74_special;
            this.transition = DFA74_transition;
        }
        public String getDescription() {
            return "309:55: ( type_dec )?";
        }
    }
 

    public static final BitSet FOLLOW_code_internal_in_code186 = new BitSet(new long[]{0xA014000000004002L,0x00000000B8765A55L});
    public static final BitSet FOLLOW_class_declaration_in_code_internal199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_declaration_wrapper_in_code_internal206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_wrapper_in_code_internal213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protocol_declaration_wrapper_in_code_internal218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interface_declaration_wrapper_in_code_internal224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extern_declarations_in_code_internal230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_struct_in_code_internal235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_code_internal240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_garbage_in_code_internal245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_garbage257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_garbage262 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_garbage264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_garbage266 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_garbage268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_declaration_in_enum_wrapper282 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_enum_wrapper284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extern_declatation_in_extern_declarations304 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_optional_prefix_in_declarations325 = new BitSet(new long[]{0x0014000000000000L});
    public static final BitSet FOLLOW_method_declaration_wrapper_in_declarations328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_prefix_in_declarations333 = new BitSet(new long[]{0x0000000000004000L,0x00000000B8725001L});
    public static final BitSet FOLLOW_optional_prefix_in_declarations336 = new BitSet(new long[]{0x0000000000004000L,0x00000000B8725000L});
    public static final BitSet FOLLOW_field_declaration_wrapper_in_declarations339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ns_inline_in_declarations344 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000006FFFFFFFFL});
    public static final BitSet FOLLOW_98_in_declarations354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_static_prefix367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_declaration_in_method_declaration_wrapper386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_declaration_in_field_declaration_wrapper404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_property_prefix422 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_property_prefix424 = new BitSet(new long[]{0x0000000000000000L,0x000000000780A000L});
    public static final BitSet FOLLOW_property_prefix_param_in_property_prefix426 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_51_in_property_prefix429 = new BitSet(new long[]{0x0000000000000000L,0x000000000780A000L});
    public static final BitSet FOLLOW_property_prefix_param_in_property_prefix431 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_48_in_property_prefix435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_optional_prefix446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ns_inline456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interface_declaration_in_interface_declaration_wrapper504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protocol_declaration_in_protocol_declaration_wrapper522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_declaration_in_typedef_declaration_wrapper539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_typedef_declaration556 = new BitSet(new long[]{0x0000000000004000L,0x0000000050020000L});
    public static final BitSet FOLLOW_typedef_internal_in_typedef_declaration558 = new BitSet(new long[]{0x0080800000004002L});
    public static final BitSet FOLLOW_typedef_name_in_typedef_declaration561 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_func_pointer_in_typedef_declaration565 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_typedef_declaration569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_func_pointer580 = new BitSet(new long[]{0x0002000000004000L});
    public static final BitSet FOLLOW_49_in_func_pointer582 = new BitSet(new long[]{0x0002000000004000L});
    public static final BitSet FOLLOW_ID_in_func_pointer585 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_func_pointer587 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_func_pointer589 = new BitSet(new long[]{0x0001000000004000L});
    public static final BitSet FOLLOW_ID_in_func_pointer592 = new BitSet(new long[]{0x000B000000000000L});
    public static final BitSet FOLLOW_49_in_func_pointer595 = new BitSet(new long[]{0x0002000000004000L});
    public static final BitSet FOLLOW_ID_in_func_pointer598 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_51_in_func_pointer603 = new BitSet(new long[]{0x0020000000004000L});
    public static final BitSet FOLLOW_ID_in_func_pointer607 = new BitSet(new long[]{0x000B000000000000L});
    public static final BitSet FOLLOW_49_in_func_pointer610 = new BitSet(new long[]{0x0002000000004000L});
    public static final BitSet FOLLOW_ID_in_func_pointer613 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_53_in_func_pointer620 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_48_in_func_pointer628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_enum_wrapper2_in_typedef_internal640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_rename_in_typedef_internal647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_struct_wrapper_in_typedef_internal654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_union_declaration_wrapper_in_typedef_internal659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_union_declaration_in_union_declaration_wrapper671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_union_declaration690 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_union_declaration695 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_typedef_struct_in_union_declaration700 = new BitSet(new long[]{0x0000000000000000L,0x0000000410000000L});
    public static final BitSet FOLLOW_98_in_union_declaration705 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_union_name_in_union_declaration707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_declaration_wrapper_in_union_internal721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_struct_wrapper_in_union_internal726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_typedef_rename737 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_typedef_rename739 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_enum_declaration_in_typedef_enum_wrapper2762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_enum_declaration782 = new BitSet(new long[]{0x0000000000004000L,0x0000000100000000L});
    public static final BitSet FOLLOW_struct_name_in_enum_declaration784 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_enum_declaration787 = new BitSet(new long[]{0x0000800008004000L});
    public static final BitSet FOLLOW_typedef_declaration_element_wrapper_in_enum_declaration789 = new BitSet(new long[]{0x0008000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_51_in_enum_declaration792 = new BitSet(new long[]{0x0000800008004000L});
    public static final BitSet FOLLOW_typedef_declaration_element_wrapper_in_enum_declaration794 = new BitSet(new long[]{0x0008000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_51_in_enum_declaration798 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_enum_declaration801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_struct_in_typedef_struct_wrapper812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_typedef_struct830 = new BitSet(new long[]{0x0000000000004000L,0x0000000100000000L});
    public static final BitSet FOLLOW_typedef_name_in_typedef_struct832 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_typedef_struct837 = new BitSet(new long[]{0x0000000000004000L,0x00000000B0624000L});
    public static final BitSet FOLLOW_struct_field_wrapper_in_typedef_struct842 = new BitSet(new long[]{0x0000000000004000L,0x00000004B0624000L});
    public static final BitSet FOLLOW_98_in_typedef_struct847 = new BitSet(new long[]{0x0080000000004002L});
    public static final BitSet FOLLOW_struct_name_in_typedef_struct850 = new BitSet(new long[]{0x0088000000000002L});
    public static final BitSet FOLLOW_51_in_typedef_struct853 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_struct_name_in_typedef_struct855 = new BitSet(new long[]{0x0088000000000002L});
    public static final BitSet FOLLOW_55_in_typedef_struct861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_struct_name874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_field_in_struct_field_wrapper892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_field1_in_struct_field910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_field2_in_struct_field915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_declaration_in_struct_field1927 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_field_name_in_struct_field1929 = new BitSet(new long[]{0x0088000000000000L});
    public static final BitSet FOLLOW_51_in_struct_field1932 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_field_name_in_struct_field1934 = new BitSet(new long[]{0x0088000000000000L});
    public static final BitSet FOLLOW_55_in_struct_field1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_struct_in_struct_field2948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_typedef_name959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_declaration_element_in_typedef_declaration_element_wrapper976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_typedef_declaration_element996 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_typedef_declaration_element999 = new BitSet(new long[]{0x0000800008004000L});
    public static final BitSet FOLLOW_element_value_in_typedef_declaration_element1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_element_value_in_typedef_declaration_element1008 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_typedef_declaration_element1011 = new BitSet(new long[]{0x0000800008004000L});
    public static final BitSet FOLLOW_element_value_in_typedef_declaration_element1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_expression_in_element_value1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_expression2_in_simple_expression1048 = new BitSet(new long[]{0x1200600000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_op2_in_simple_expression1052 = new BitSet(new long[]{0x0000800008004000L});
    public static final BitSet FOLLOW_simple_expression2_in_simple_expression1054 = new BitSet(new long[]{0x1200600000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_simple_expression21068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_simple_expression21073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_simple_expression21078 = new BitSet(new long[]{0x0000800008004000L});
    public static final BitSet FOLLOW_simple_expression_in_simple_expression21080 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_simple_expression21082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_class_declaration1117 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_class_declaration1119 = new BitSet(new long[]{0x0088000000000000L});
    public static final BitSet FOLLOW_51_in_class_declaration1122 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_class_declaration1124 = new BitSet(new long[]{0x0088000000000000L});
    public static final BitSet FOLLOW_55_in_class_declaration1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_protocol_declaration1138 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_protocol_name_in_protocol_declaration1140 = new BitSet(new long[]{0x4194000000004000L,0x00000000B8725045L});
    public static final BitSet FOLLOW_generic_in_protocol_declaration1142 = new BitSet(new long[]{0x4094000000004000L,0x00000000B8725045L});
    public static final BitSet FOLLOW_protocol_end_in_protocol_declaration1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protocol_end1_in_protocol_end1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protocol_end2_in_protocol_end1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_protocol_end11174 = new BitSet(new long[]{0x4014000000004000L,0x00000000B8725045L});
    public static final BitSet FOLLOW_62_in_protocol_end11179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_protocol_end21191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_generic1204 = new BitSet(new long[]{0x0000000000004000L,0x00000000B0624000L});
    public static final BitSet FOLLOW_generic_internal_in_generic1206 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_generic1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_declaration_in_generic_internal1217 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_generic_internal1220 = new BitSet(new long[]{0x0000000000004000L,0x00000000B0624000L});
    public static final BitSet FOLLOW_type_declaration_in_generic_internal1222 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ID_in_protocol_name1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_interface_declaration1254 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_interface_name_in_interface_declaration1256 = new BitSet(new long[]{0x4054000000004000L,0x00000001B8725045L});
    public static final BitSet FOLLOW_54_in_interface_declaration1259 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_superclass_name_in_interface_declaration1261 = new BitSet(new long[]{0x4014000000004000L,0x00000001B8725045L});
    public static final BitSet FOLLOW_interface_body_in_interface_declaration1266 = new BitSet(new long[]{0x4014000000004000L,0x00000000B8725045L});
    public static final BitSet FOLLOW_declarations_in_interface_declaration1270 = new BitSet(new long[]{0x4014000000004000L,0x00000000B8725045L});
    public static final BitSet FOLLOW_62_in_interface_declaration1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_interface_body1287 = new BitSet(new long[]{0x0000000000004000L,0x00000004F872502AL});
    public static final BitSet FOLLOW_interface_body_item_in_interface_body1291 = new BitSet(new long[]{0x0000000000004000L,0x00000004F872502AL});
    public static final BitSet FOLLOW_98_in_interface_body1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_group_modifier_wrapper_in_interface_body_item1307 = new BitSet(new long[]{0x0000000000004002L,0x00000000B8725000L});
    public static final BitSet FOLLOW_simple_fields_declaration_in_interface_body_item1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_fields_declaration_in_interface_body_item1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_union_declaration_wrapper_in_interface_body_item1320 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_interface_body_item1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_union_name1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_group_modifier_in_group_modifier_wrapper1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_interface_name1391 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_category_in_interface_name1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_category1412 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_category1414 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_category1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_superclass_name1433 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_generic_in_superclass_name1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_declaration_wrapper_in_simple_fields_declaration1457 = new BitSet(new long[]{0x0000000000004002L,0x00000000B8725000L});
    public static final BitSet FOLLOW_76_in_field_declaration1477 = new BitSet(new long[]{0x0000000000004000L,0x00000000B8724000L});
    public static final BitSet FOLLOW_static_prefix_in_field_declaration1480 = new BitSet(new long[]{0x0000000000004000L,0x00000000B0724000L});
    public static final BitSet FOLLOW_84_in_field_declaration1483 = new BitSet(new long[]{0x0000000000004000L,0x00000000B0624000L});
    public static final BitSet FOLLOW_type_declaration_in_field_declaration1486 = new BitSet(new long[]{0x0000800000004000L});
    public static final BitSet FOLLOW_field_name_in_field_declaration1490 = new BitSet(new long[]{0x0088800000000000L});
    public static final BitSet FOLLOW_classical_method_params_in_field_declaration1493 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_51_in_field_declaration1498 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_field_name_in_field_declaration1500 = new BitSet(new long[]{0x0088000000000000L});
    public static final BitSet FOLLOW_func_pointer_in_field_declaration1508 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_field_declaration1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_classical_method_params1521 = new BitSet(new long[]{0x0021000000004000L,0x00000000B0624000L});
    public static final BitSet FOLLOW_classical_param_in_classical_method_params1524 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_51_in_classical_method_params1527 = new BitSet(new long[]{0x0020000000004000L,0x00000000B0624000L});
    public static final BitSet FOLLOW_classical_param_in_classical_method_params1529 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_48_in_classical_method_params1535 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_attribute_in_classical_method_params1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_attribute1551 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_attribute1553 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_attribute_internal_in_attribute1555 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_attribute1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_internal1_in_attribute_internal1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_attribute_internal11578 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_attribute_internal11580 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_attribute_internal11582 = new BitSet(new long[]{0x0001000008004000L});
    public static final BitSet FOLLOW_format_item_in_attribute_internal11585 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_51_in_attribute_internal11588 = new BitSet(new long[]{0x0000000008004000L});
    public static final BitSet FOLLOW_format_item_in_attribute_internal11590 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_48_in_attribute_internal11596 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_attribute_internal11598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_declaration_in_classical_param1623 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_classical_param1625 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_classical_param1628 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_classical_param1630 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_classical_param1633 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_53_in_classical_param1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_type_declaration1652 = new BitSet(new long[]{0x0000000000004000L,0x00000000B0620000L});
    public static final BitSet FOLLOW_81_in_type_declaration1655 = new BitSet(new long[]{0x0000000000004000L,0x00000000B0600000L});
    public static final BitSet FOLLOW_93_in_type_declaration1658 = new BitSet(new long[]{0x0000000000004000L,0x0000000090600000L});
    public static final BitSet FOLLOW_92_in_type_declaration1661 = new BitSet(new long[]{0x0000000000004000L,0x0000000080600000L});
    public static final BitSet FOLLOW_95_in_type_declaration1666 = new BitSet(new long[]{0x0102000000004002L,0x0000000000604000L});
    public static final BitSet FOLLOW_type_dec_in_type_declaration1668 = new BitSet(new long[]{0x0102000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_type_dec_in_type_declaration1674 = new BitSet(new long[]{0x0102000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_type_declaration1677 = new BitSet(new long[]{0x0102000000000002L});
    public static final BitSet FOLLOW_generic_in_type_declaration1680 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_type_declaration1683 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_type_dec_internal_in_type_dec1703 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_type_dec1706 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_type_dec1708 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_knownTypes_in_type_dec_internal1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type_dec_internal1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_knownTypes1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_knownTypes1746 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_85_in_knownTypes1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_field_name1762 = new BitSet(new long[]{0x0040000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_array_size_in_field_name1764 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_field_crap_in_field_name1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_array_size1793 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_NUMBER_in_array_size1795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_array_size1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_field_crap1807 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_NUMBER_in_field_crap1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_modifier_wrapper_in_method_declaration1819 = new BitSet(new long[]{0x0000800000004000L,0x000000000780A000L});
    public static final BitSet FOLLOW_method_declaration_variants_in_method_declaration1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_modifier_in_method_modifier_wrapper1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_declaration_common_in_method_declaration_variants1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_method_declaration_common1880 = new BitSet(new long[]{0x0000000000004000L,0x00000000B0624000L});
    public static final BitSet FOLLOW_type_declaration_in_method_declaration_common1882 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_method_declaration_common1884 = new BitSet(new long[]{0x0000000000004000L,0x000000000780A000L});
    public static final BitSet FOLLOW_method_name_in_method_declaration_common1888 = new BitSet(new long[]{0x00C0000000004000L});
    public static final BitSet FOLLOW_method_params_in_method_declaration_common1890 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_method_declaration_common1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_method_name1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_prefix_param_in_method_name1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_param_in_method_params1940 = new BitSet(new long[]{0x0040000000004002L});
    public static final BitSet FOLLOW_prefix_in_method_param1959 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_method_param1962 = new BitSet(new long[]{0x0000800000004000L,0x0000000000080000L});
    public static final BitSet FOLLOW_47_in_method_param1965 = new BitSet(new long[]{0x0000000000004000L,0x00000000B0624000L});
    public static final BitSet FOLLOW_type_declaration_in_method_param1967 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_method_param1969 = new BitSet(new long[]{0x0000000000004000L,0x0000000000080000L});
    public static final BitSet FOLLOW_param_name_in_method_param1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param_name2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_param_name2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_prefix2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_extern_declatation2050 = new BitSet(new long[]{0x0000000000004000L,0x00000000B8725000L});
    public static final BitSet FOLLOW_field_declaration_in_extern_declatation2052 = new BitSet(new long[]{0x0000000000000002L});

}