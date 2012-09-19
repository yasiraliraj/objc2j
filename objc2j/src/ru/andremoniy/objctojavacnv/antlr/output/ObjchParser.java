// $ANTLR 3.4 C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g 2012-09-19 21:06:23

package ru.andremoniy.objctojavacnv.antlr.output;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ObjchParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CATEGORY", "DIGIT", "ENUM", "EXTERN", "FIELD", "FIELDS", "FIELD_NAME", "FILE_NAME", "GROUP_MODIFIER", "ID", "INIT_DECLARATION", "INTERFACE", "INTERFACE_NAME", "LETTER", "METHOD", "METHOD_NAME", "METHOD_PARAM", "METHOD_PARAMS", "METHOD_TYPE", "MODIFIER", "MULTI_COMMENT", "NAME", "NUMBER", "OLD_NAME", "PARAM_NAME", "PARAM_PREFIX", "PREPROCESSOR_DECLARATION", "PROTOCOL", "SINGLE_COMMENT", "STATIC_METHOD", "STRUCT", "SUPERCLASS_NAME", "TYPE", "TYPEDEF", "TYPEDEF_ELEMENT", "TYPEDEF_NAME", "UNION", "VALUE", "WHITESPACE", "'&'", "'&~'", "'('", "')'", "'*'", "'+'", "','", "'-'", "':'", "';'", "'<'", "'<<'", "'='", "'>'", "'>>'", "'@class'", "'@end'", "'@interface'", "'@optional'", "'@private'", "'@property'", "'@protected'", "'@protocol'", "'@public'", "'NS_INLINE'", "'['", "']'", "'const'", "'enum'", "'extern'", "'initWithType'", "'int'", "'long'", "'nonatomic'", "'readonly'", "'readwrite'", "'retain'", "'struct'", "'typedef'", "'union'", "'unsigned'", "'{'", "'|'", "'}'"
    };

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
    public static final int CATEGORY=4;
    public static final int DIGIT=5;
    public static final int ENUM=6;
    public static final int EXTERN=7;
    public static final int FIELD=8;
    public static final int FIELDS=9;
    public static final int FIELD_NAME=10;
    public static final int FILE_NAME=11;
    public static final int GROUP_MODIFIER=12;
    public static final int ID=13;
    public static final int INIT_DECLARATION=14;
    public static final int INTERFACE=15;
    public static final int INTERFACE_NAME=16;
    public static final int LETTER=17;
    public static final int METHOD=18;
    public static final int METHOD_NAME=19;
    public static final int METHOD_PARAM=20;
    public static final int METHOD_PARAMS=21;
    public static final int METHOD_TYPE=22;
    public static final int MODIFIER=23;
    public static final int MULTI_COMMENT=24;
    public static final int NAME=25;
    public static final int NUMBER=26;
    public static final int OLD_NAME=27;
    public static final int PARAM_NAME=28;
    public static final int PARAM_PREFIX=29;
    public static final int PREPROCESSOR_DECLARATION=30;
    public static final int PROTOCOL=31;
    public static final int SINGLE_COMMENT=32;
    public static final int STATIC_METHOD=33;
    public static final int STRUCT=34;
    public static final int SUPERCLASS_NAME=35;
    public static final int TYPE=36;
    public static final int TYPEDEF=37;
    public static final int TYPEDEF_ELEMENT=38;
    public static final int TYPEDEF_NAME=39;
    public static final int UNION=40;
    public static final int VALUE=41;
    public static final int WHITESPACE=42;

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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:53:1: code : ( code_internal )* ;
    public final ObjchParser.code_return code() throws RecognitionException {
        ObjchParser.code_return retval = new ObjchParser.code_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.code_internal_return code_internal1 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:53:6: ( ( code_internal )* )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:54:3: ( code_internal )*
            {
            root_0 = (Object)adaptor.nil();


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:54:3: ( code_internal )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID||LA1_0==48||LA1_0==50||LA1_0==58||(LA1_0 >= 60 && LA1_0 <= 61)||LA1_0==63||LA1_0==65||LA1_0==67||(LA1_0 >= 70 && LA1_0 <= 72)||(LA1_0 >= 74 && LA1_0 <= 75)||(LA1_0 >= 80 && LA1_0 <= 81)||LA1_0==83) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:54:3: code_internal
            	    {
            	    pushFollow(FOLLOW_code_internal_in_code178);
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:57:1: code_internal : ( class_declaration | typedef_declaration_wrapper | enum_wrapper | protocol_declaration_wrapper | interface_declaration_wrapper | extern_declarations | typedef_struct | declarations );
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



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:58:2: ( class_declaration | typedef_declaration_wrapper | enum_wrapper | protocol_declaration_wrapper | interface_declaration_wrapper | extern_declarations | typedef_struct | declarations )
            int alt2=8;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:58:4: class_declaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_class_declaration_in_code_internal191);
                    class_declaration2=class_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, class_declaration2.getTree());

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:59:5: typedef_declaration_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedef_declaration_wrapper_in_code_internal198);
                    typedef_declaration_wrapper3=typedef_declaration_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef_declaration_wrapper3.getTree());

                    }
                    break;
                case 3 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:60:5: enum_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_enum_wrapper_in_code_internal205);
                    enum_wrapper4=enum_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, enum_wrapper4.getTree());

                    }
                    break;
                case 4 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:61:4: protocol_declaration_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_protocol_declaration_wrapper_in_code_internal210);
                    protocol_declaration_wrapper5=protocol_declaration_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, protocol_declaration_wrapper5.getTree());

                    }
                    break;
                case 5 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:62:4: interface_declaration_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_interface_declaration_wrapper_in_code_internal216);
                    interface_declaration_wrapper6=interface_declaration_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, interface_declaration_wrapper6.getTree());

                    }
                    break;
                case 6 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:63:4: extern_declarations
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_extern_declarations_in_code_internal222);
                    extern_declarations7=extern_declarations();

                    state._fsp--;

                    adaptor.addChild(root_0, extern_declarations7.getTree());

                    }
                    break;
                case 7 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:64:4: typedef_struct
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedef_struct_in_code_internal227);
                    typedef_struct8=typedef_struct();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef_struct8.getTree());

                    }
                    break;
                case 8 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:65:4: declarations
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declarations_in_code_internal232);
                    declarations9=declarations();

                    state._fsp--;

                    adaptor.addChild(root_0, declarations9.getTree());

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


    public static class enum_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enum_wrapper"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:68:1: enum_wrapper : enum_declaration ';' -> ^( ENUM enum_declaration ) ;
    public final ObjchParser.enum_wrapper_return enum_wrapper() throws RecognitionException {
        ObjchParser.enum_wrapper_return retval = new ObjchParser.enum_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal11=null;
        ObjchParser.enum_declaration_return enum_declaration10 =null;


        Object char_literal11_tree=null;
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_enum_declaration=new RewriteRuleSubtreeStream(adaptor,"rule enum_declaration");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:69:2: ( enum_declaration ';' -> ^( ENUM enum_declaration ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:69:4: enum_declaration ';'
            {
            pushFollow(FOLLOW_enum_declaration_in_enum_wrapper246);
            enum_declaration10=enum_declaration();

            state._fsp--;

            stream_enum_declaration.add(enum_declaration10.getTree());

            char_literal11=(Token)match(input,52,FOLLOW_52_in_enum_wrapper248);  
            stream_52.add(char_literal11);


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
            // 69:25: -> ^( ENUM enum_declaration )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:69:28: ^( ENUM enum_declaration )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:71:1: extern_declarations : ( extern_declatation )+ -> ( ^( EXTERN extern_declatation ) )+ ;
    public final ObjchParser.extern_declarations_return extern_declarations() throws RecognitionException {
        ObjchParser.extern_declarations_return retval = new ObjchParser.extern_declarations_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.extern_declatation_return extern_declatation12 =null;


        RewriteRuleSubtreeStream stream_extern_declatation=new RewriteRuleSubtreeStream(adaptor,"rule extern_declatation");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:72:2: ( ( extern_declatation )+ -> ( ^( EXTERN extern_declatation ) )+ )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:72:4: ( extern_declatation )+
            {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:72:4: ( extern_declatation )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==72) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:72:4: extern_declatation
            	    {
            	    pushFollow(FOLLOW_extern_declatation_in_extern_declarations268);
            	    extern_declatation12=extern_declatation();

            	    state._fsp--;

            	    stream_extern_declatation.add(extern_declatation12.getTree());

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
            // 72:24: -> ( ^( EXTERN extern_declatation ) )+
            {
                if ( !(stream_extern_declatation.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_extern_declatation.hasNext() ) {
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:72:27: ^( EXTERN extern_declatation )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:74:1: declarations : ( ( optional_prefix )? method_declaration_wrapper | ( property_prefix )? ( optional_prefix )? field_declaration_wrapper | ns_inline (~ '{' )+ (~ '}' )+ '}' );
    public final ObjchParser.declarations_return declarations() throws RecognitionException {
        ObjchParser.declarations_return retval = new ObjchParser.declarations_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set19=null;
        Token set20=null;
        Token char_literal21=null;
        ObjchParser.optional_prefix_return optional_prefix13 =null;

        ObjchParser.method_declaration_wrapper_return method_declaration_wrapper14 =null;

        ObjchParser.property_prefix_return property_prefix15 =null;

        ObjchParser.optional_prefix_return optional_prefix16 =null;

        ObjchParser.field_declaration_wrapper_return field_declaration_wrapper17 =null;

        ObjchParser.ns_inline_return ns_inline18 =null;


        Object set19_tree=null;
        Object set20_tree=null;
        Object char_literal21_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:75:2: ( ( optional_prefix )? method_declaration_wrapper | ( property_prefix )? ( optional_prefix )? field_declaration_wrapper | ns_inline (~ '{' )+ (~ '}' )+ '}' )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 61:
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==48||LA9_1==50) ) {
                    alt9=1;
                }
                else if ( (LA9_1==ID||(LA9_1 >= 70 && LA9_1 <= 71)||(LA9_1 >= 74 && LA9_1 <= 75)||(LA9_1 >= 80 && LA9_1 <= 81)||LA9_1==83) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;

                }
                }
                break;
            case 48:
            case 50:
                {
                alt9=1;
                }
                break;
            case ID:
            case 63:
            case 70:
            case 71:
            case 74:
            case 75:
            case 80:
            case 81:
            case 83:
                {
                alt9=2;
                }
                break;
            case 67:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:75:4: ( optional_prefix )? method_declaration_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:75:4: ( optional_prefix )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==61) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:75:4: optional_prefix
                            {
                            pushFollow(FOLLOW_optional_prefix_in_declarations289);
                            optional_prefix13=optional_prefix();

                            state._fsp--;

                            adaptor.addChild(root_0, optional_prefix13.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_method_declaration_wrapper_in_declarations292);
                    method_declaration_wrapper14=method_declaration_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, method_declaration_wrapper14.getTree());

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:76:4: ( property_prefix )? ( optional_prefix )? field_declaration_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:76:4: ( property_prefix )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==63) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:76:4: property_prefix
                            {
                            pushFollow(FOLLOW_property_prefix_in_declarations297);
                            property_prefix15=property_prefix();

                            state._fsp--;

                            adaptor.addChild(root_0, property_prefix15.getTree());

                            }
                            break;

                    }


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:76:21: ( optional_prefix )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==61) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:76:21: optional_prefix
                            {
                            pushFollow(FOLLOW_optional_prefix_in_declarations300);
                            optional_prefix16=optional_prefix();

                            state._fsp--;

                            adaptor.addChild(root_0, optional_prefix16.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_field_declaration_wrapper_in_declarations303);
                    field_declaration_wrapper17=field_declaration_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, field_declaration_wrapper17.getTree());

                    }
                    break;
                case 3 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:77:4: ns_inline (~ '{' )+ (~ '}' )+ '}'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ns_inline_in_declarations308);
                    ns_inline18=ns_inline();

                    state._fsp--;

                    adaptor.addChild(root_0, ns_inline18.getTree());

                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:77:14: (~ '{' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0 >= CATEGORY && LA7_0 <= 83)||(LA7_0 >= 85 && LA7_0 <= 86)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:
                    	    {
                    	    set19=(Token)input.LT(1);

                    	    if ( (input.LA(1) >= CATEGORY && input.LA(1) <= 83)||(input.LA(1) >= 85 && input.LA(1) <= 86) ) {
                    	        input.consume();
                    	        adaptor.addChild(root_0, 
                    	        (Object)adaptor.create(set19)
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
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:77:20: (~ '}' )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0 >= CATEGORY && LA8_0 <= 85)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:
                    	    {
                    	    set20=(Token)input.LT(1);

                    	    if ( (input.LA(1) >= CATEGORY && input.LA(1) <= 85) ) {
                    	        input.consume();
                    	        adaptor.addChild(root_0, 
                    	        (Object)adaptor.create(set20)
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


                    char_literal21=(Token)match(input,86,FOLLOW_86_in_declarations318); 
                    char_literal21_tree = 
                    (Object)adaptor.create(char_literal21)
                    ;
                    adaptor.addChild(root_0, char_literal21_tree);


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


    public static class method_declaration_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "method_declaration_wrapper"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:80:1: method_declaration_wrapper : method_declaration -> ^( METHOD method_declaration ) ;
    public final ObjchParser.method_declaration_wrapper_return method_declaration_wrapper() throws RecognitionException {
        ObjchParser.method_declaration_wrapper_return retval = new ObjchParser.method_declaration_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.method_declaration_return method_declaration22 =null;


        RewriteRuleSubtreeStream stream_method_declaration=new RewriteRuleSubtreeStream(adaptor,"rule method_declaration");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:81:2: ( method_declaration -> ^( METHOD method_declaration ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:81:4: method_declaration
            {
            pushFollow(FOLLOW_method_declaration_in_method_declaration_wrapper331);
            method_declaration22=method_declaration();

            state._fsp--;

            stream_method_declaration.add(method_declaration22.getTree());

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
            // 81:23: -> ^( METHOD method_declaration )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:81:26: ^( METHOD method_declaration )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:83:1: field_declaration_wrapper : field_declaration -> ^( FIELD field_declaration ) ;
    public final ObjchParser.field_declaration_wrapper_return field_declaration_wrapper() throws RecognitionException {
        ObjchParser.field_declaration_wrapper_return retval = new ObjchParser.field_declaration_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.field_declaration_return field_declaration23 =null;


        RewriteRuleSubtreeStream stream_field_declaration=new RewriteRuleSubtreeStream(adaptor,"rule field_declaration");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:84:2: ( field_declaration -> ^( FIELD field_declaration ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:84:4: field_declaration
            {
            pushFollow(FOLLOW_field_declaration_in_field_declaration_wrapper349);
            field_declaration23=field_declaration();

            state._fsp--;

            stream_field_declaration.add(field_declaration23.getTree());

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
            // 84:22: -> ^( FIELD field_declaration )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:84:25: ^( FIELD field_declaration )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:86:1: property_prefix : '@property' '(' property_prefix_param ( ',' property_prefix_param )* ')' ;
    public final ObjchParser.property_prefix_return property_prefix() throws RecognitionException {
        ObjchParser.property_prefix_return retval = new ObjchParser.property_prefix_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal24=null;
        Token char_literal25=null;
        Token char_literal27=null;
        Token char_literal29=null;
        ObjchParser.property_prefix_param_return property_prefix_param26 =null;

        ObjchParser.property_prefix_param_return property_prefix_param28 =null;


        Object string_literal24_tree=null;
        Object char_literal25_tree=null;
        Object char_literal27_tree=null;
        Object char_literal29_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:87:2: ( '@property' '(' property_prefix_param ( ',' property_prefix_param )* ')' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:87:4: '@property' '(' property_prefix_param ( ',' property_prefix_param )* ')'
            {
            root_0 = (Object)adaptor.nil();


            string_literal24=(Token)match(input,63,FOLLOW_63_in_property_prefix367); 
            string_literal24_tree = 
            (Object)adaptor.create(string_literal24)
            ;
            adaptor.addChild(root_0, string_literal24_tree);


            char_literal25=(Token)match(input,45,FOLLOW_45_in_property_prefix369); 
            char_literal25_tree = 
            (Object)adaptor.create(char_literal25)
            ;
            adaptor.addChild(root_0, char_literal25_tree);


            pushFollow(FOLLOW_property_prefix_param_in_property_prefix371);
            property_prefix_param26=property_prefix_param();

            state._fsp--;

            adaptor.addChild(root_0, property_prefix_param26.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:87:42: ( ',' property_prefix_param )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==49) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:87:43: ',' property_prefix_param
            	    {
            	    char_literal27=(Token)match(input,49,FOLLOW_49_in_property_prefix374); 
            	    char_literal27_tree = 
            	    (Object)adaptor.create(char_literal27)
            	    ;
            	    adaptor.addChild(root_0, char_literal27_tree);


            	    pushFollow(FOLLOW_property_prefix_param_in_property_prefix376);
            	    property_prefix_param28=property_prefix_param();

            	    state._fsp--;

            	    adaptor.addChild(root_0, property_prefix_param28.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            char_literal29=(Token)match(input,46,FOLLOW_46_in_property_prefix380); 
            char_literal29_tree = 
            (Object)adaptor.create(char_literal29)
            ;
            adaptor.addChild(root_0, char_literal29_tree);


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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:89:1: optional_prefix : '@optional' ;
    public final ObjchParser.optional_prefix_return optional_prefix() throws RecognitionException {
        ObjchParser.optional_prefix_return retval = new ObjchParser.optional_prefix_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal30=null;

        Object string_literal30_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:90:2: ( '@optional' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:90:4: '@optional'
            {
            root_0 = (Object)adaptor.nil();


            string_literal30=(Token)match(input,61,FOLLOW_61_in_optional_prefix391); 
            string_literal30_tree = 
            (Object)adaptor.create(string_literal30)
            ;
            adaptor.addChild(root_0, string_literal30_tree);


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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:92:1: ns_inline : 'NS_INLINE' ;
    public final ObjchParser.ns_inline_return ns_inline() throws RecognitionException {
        ObjchParser.ns_inline_return retval = new ObjchParser.ns_inline_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal31=null;

        Object string_literal31_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:93:2: ( 'NS_INLINE' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:93:4: 'NS_INLINE'
            {
            root_0 = (Object)adaptor.nil();


            string_literal31=(Token)match(input,67,FOLLOW_67_in_ns_inline401); 
            string_literal31_tree = 
            (Object)adaptor.create(string_literal31)
            ;
            adaptor.addChild(root_0, string_literal31_tree);


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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:95:1: property_prefix_param : ( 'retain' | 'readwrite' | 'readonly' | 'nonatomic' );
    public final ObjchParser.property_prefix_param_return property_prefix_param() throws RecognitionException {
        ObjchParser.property_prefix_param_return retval = new ObjchParser.property_prefix_param_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set32=null;

        Object set32_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:96:2: ( 'retain' | 'readwrite' | 'readonly' | 'nonatomic' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:
            {
            root_0 = (Object)adaptor.nil();


            set32=(Token)input.LT(1);

            if ( (input.LA(1) >= 76 && input.LA(1) <= 79) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set32)
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:101:1: interface_declaration_wrapper : interface_declaration -> ^( INTERFACE interface_declaration ) ;
    public final ObjchParser.interface_declaration_wrapper_return interface_declaration_wrapper() throws RecognitionException {
        ObjchParser.interface_declaration_wrapper_return retval = new ObjchParser.interface_declaration_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.interface_declaration_return interface_declaration33 =null;


        RewriteRuleSubtreeStream stream_interface_declaration=new RewriteRuleSubtreeStream(adaptor,"rule interface_declaration");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:102:2: ( interface_declaration -> ^( INTERFACE interface_declaration ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:102:4: interface_declaration
            {
            pushFollow(FOLLOW_interface_declaration_in_interface_declaration_wrapper437);
            interface_declaration33=interface_declaration();

            state._fsp--;

            stream_interface_declaration.add(interface_declaration33.getTree());

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
            // 102:26: -> ^( INTERFACE interface_declaration )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:102:29: ^( INTERFACE interface_declaration )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:104:1: protocol_declaration_wrapper : protocol_declaration -> ^( PROTOCOL protocol_declaration ) ;
    public final ObjchParser.protocol_declaration_wrapper_return protocol_declaration_wrapper() throws RecognitionException {
        ObjchParser.protocol_declaration_wrapper_return retval = new ObjchParser.protocol_declaration_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.protocol_declaration_return protocol_declaration34 =null;


        RewriteRuleSubtreeStream stream_protocol_declaration=new RewriteRuleSubtreeStream(adaptor,"rule protocol_declaration");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:105:2: ( protocol_declaration -> ^( PROTOCOL protocol_declaration ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:105:4: protocol_declaration
            {
            pushFollow(FOLLOW_protocol_declaration_in_protocol_declaration_wrapper455);
            protocol_declaration34=protocol_declaration();

            state._fsp--;

            stream_protocol_declaration.add(protocol_declaration34.getTree());

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
            // 105:25: -> ^( PROTOCOL protocol_declaration )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:105:28: ^( PROTOCOL protocol_declaration )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:107:1: typedef_declaration_wrapper : typedef_declaration -> ^( TYPEDEF typedef_declaration ) ;
    public final ObjchParser.typedef_declaration_wrapper_return typedef_declaration_wrapper() throws RecognitionException {
        ObjchParser.typedef_declaration_wrapper_return retval = new ObjchParser.typedef_declaration_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.typedef_declaration_return typedef_declaration35 =null;


        RewriteRuleSubtreeStream stream_typedef_declaration=new RewriteRuleSubtreeStream(adaptor,"rule typedef_declaration");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:108:2: ( typedef_declaration -> ^( TYPEDEF typedef_declaration ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:108:4: typedef_declaration
            {
            pushFollow(FOLLOW_typedef_declaration_in_typedef_declaration_wrapper472);
            typedef_declaration35=typedef_declaration();

            state._fsp--;

            stream_typedef_declaration.add(typedef_declaration35.getTree());

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
            // 108:24: -> ^( TYPEDEF typedef_declaration )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:108:27: ^( TYPEDEF typedef_declaration )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:110:1: typedef_declaration : 'typedef' typedef_internal ( typedef_name | func_pointer )? ( ';' )? ;
    public final ObjchParser.typedef_declaration_return typedef_declaration() throws RecognitionException {
        ObjchParser.typedef_declaration_return retval = new ObjchParser.typedef_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal36=null;
        Token char_literal40=null;
        ObjchParser.typedef_internal_return typedef_internal37 =null;

        ObjchParser.typedef_name_return typedef_name38 =null;

        ObjchParser.func_pointer_return func_pointer39 =null;


        Object string_literal36_tree=null;
        Object char_literal40_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:111:2: ( 'typedef' typedef_internal ( typedef_name | func_pointer )? ( ';' )? )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:111:4: 'typedef' typedef_internal ( typedef_name | func_pointer )? ( ';' )?
            {
            root_0 = (Object)adaptor.nil();


            string_literal36=(Token)match(input,81,FOLLOW_81_in_typedef_declaration489); 
            string_literal36_tree = 
            (Object)adaptor.create(string_literal36)
            ;
            adaptor.addChild(root_0, string_literal36_tree);


            pushFollow(FOLLOW_typedef_internal_in_typedef_declaration491);
            typedef_internal37=typedef_internal();

            state._fsp--;

            adaptor.addChild(root_0, typedef_internal37.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:111:31: ( typedef_name | func_pointer )?
            int alt11=3;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:111:32: typedef_name
                    {
                    pushFollow(FOLLOW_typedef_name_in_typedef_declaration494);
                    typedef_name38=typedef_name();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef_name38.getTree());

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:111:47: func_pointer
                    {
                    pushFollow(FOLLOW_func_pointer_in_typedef_declaration498);
                    func_pointer39=func_pointer();

                    state._fsp--;

                    adaptor.addChild(root_0, func_pointer39.getTree());

                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:111:62: ( ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==52) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:111:62: ';'
                    {
                    char_literal40=(Token)match(input,52,FOLLOW_52_in_typedef_declaration502); 
                    char_literal40_tree = 
                    (Object)adaptor.create(char_literal40)
                    ;
                    adaptor.addChild(root_0, char_literal40_tree);


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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:113:1: func_pointer : '(' ( '*' )? ID ')' '(' ( ID ( ',' ID )* )? ')' ;
    public final ObjchParser.func_pointer_return func_pointer() throws RecognitionException {
        ObjchParser.func_pointer_return retval = new ObjchParser.func_pointer_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal41=null;
        Token char_literal42=null;
        Token ID43=null;
        Token char_literal44=null;
        Token char_literal45=null;
        Token ID46=null;
        Token char_literal47=null;
        Token ID48=null;
        Token char_literal49=null;

        Object char_literal41_tree=null;
        Object char_literal42_tree=null;
        Object ID43_tree=null;
        Object char_literal44_tree=null;
        Object char_literal45_tree=null;
        Object ID46_tree=null;
        Object char_literal47_tree=null;
        Object ID48_tree=null;
        Object char_literal49_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:114:2: ( '(' ( '*' )? ID ')' '(' ( ID ( ',' ID )* )? ')' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:114:4: '(' ( '*' )? ID ')' '(' ( ID ( ',' ID )* )? ')'
            {
            root_0 = (Object)adaptor.nil();


            char_literal41=(Token)match(input,45,FOLLOW_45_in_func_pointer513); 
            char_literal41_tree = 
            (Object)adaptor.create(char_literal41)
            ;
            adaptor.addChild(root_0, char_literal41_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:114:8: ( '*' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==47) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:114:8: '*'
                    {
                    char_literal42=(Token)match(input,47,FOLLOW_47_in_func_pointer515); 
                    char_literal42_tree = 
                    (Object)adaptor.create(char_literal42)
                    ;
                    adaptor.addChild(root_0, char_literal42_tree);


                    }
                    break;

            }


            ID43=(Token)match(input,ID,FOLLOW_ID_in_func_pointer518); 
            ID43_tree = 
            (Object)adaptor.create(ID43)
            ;
            adaptor.addChild(root_0, ID43_tree);


            char_literal44=(Token)match(input,46,FOLLOW_46_in_func_pointer520); 
            char_literal44_tree = 
            (Object)adaptor.create(char_literal44)
            ;
            adaptor.addChild(root_0, char_literal44_tree);


            char_literal45=(Token)match(input,45,FOLLOW_45_in_func_pointer522); 
            char_literal45_tree = 
            (Object)adaptor.create(char_literal45)
            ;
            adaptor.addChild(root_0, char_literal45_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:114:24: ( ID ( ',' ID )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:114:25: ID ( ',' ID )*
                    {
                    ID46=(Token)match(input,ID,FOLLOW_ID_in_func_pointer525); 
                    ID46_tree = 
                    (Object)adaptor.create(ID46)
                    ;
                    adaptor.addChild(root_0, ID46_tree);


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:114:28: ( ',' ID )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==49) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:114:29: ',' ID
                    	    {
                    	    char_literal47=(Token)match(input,49,FOLLOW_49_in_func_pointer528); 
                    	    char_literal47_tree = 
                    	    (Object)adaptor.create(char_literal47)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal47_tree);


                    	    ID48=(Token)match(input,ID,FOLLOW_ID_in_func_pointer530); 
                    	    ID48_tree = 
                    	    (Object)adaptor.create(ID48)
                    	    ;
                    	    adaptor.addChild(root_0, ID48_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }


            char_literal49=(Token)match(input,46,FOLLOW_46_in_func_pointer536); 
            char_literal49_tree = 
            (Object)adaptor.create(char_literal49)
            ;
            adaptor.addChild(root_0, char_literal49_tree);


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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:117:1: typedef_internal : ( typedef_enum_wrapper2 | typedef_rename | typedef_struct_wrapper | union_declaration_wrapper );
    public final ObjchParser.typedef_internal_return typedef_internal() throws RecognitionException {
        ObjchParser.typedef_internal_return retval = new ObjchParser.typedef_internal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.typedef_enum_wrapper2_return typedef_enum_wrapper250 =null;

        ObjchParser.typedef_rename_return typedef_rename51 =null;

        ObjchParser.typedef_struct_wrapper_return typedef_struct_wrapper52 =null;

        ObjchParser.union_declaration_wrapper_return union_declaration_wrapper53 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:118:2: ( typedef_enum_wrapper2 | typedef_rename | typedef_struct_wrapper | union_declaration_wrapper )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt16=1;
                }
                break;
            case ID:
                {
                alt16=2;
                }
                break;
            case 80:
                {
                alt16=3;
                }
                break;
            case 82:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:118:4: typedef_enum_wrapper2
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedef_enum_wrapper2_in_typedef_internal548);
                    typedef_enum_wrapper250=typedef_enum_wrapper2();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef_enum_wrapper250.getTree());

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:119:5: typedef_rename
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedef_rename_in_typedef_internal555);
                    typedef_rename51=typedef_rename();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef_rename51.getTree());

                    }
                    break;
                case 3 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:120:5: typedef_struct_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedef_struct_wrapper_in_typedef_internal562);
                    typedef_struct_wrapper52=typedef_struct_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef_struct_wrapper52.getTree());

                    }
                    break;
                case 4 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:121:4: union_declaration_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_union_declaration_wrapper_in_typedef_internal567);
                    union_declaration_wrapper53=union_declaration_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, union_declaration_wrapper53.getTree());

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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:124:1: union_declaration_wrapper : union_declaration -> ^( UNION union_declaration ) ;
    public final ObjchParser.union_declaration_wrapper_return union_declaration_wrapper() throws RecognitionException {
        ObjchParser.union_declaration_wrapper_return retval = new ObjchParser.union_declaration_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.union_declaration_return union_declaration54 =null;


        RewriteRuleSubtreeStream stream_union_declaration=new RewriteRuleSubtreeStream(adaptor,"rule union_declaration");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:125:2: ( union_declaration -> ^( UNION union_declaration ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:125:4: union_declaration
            {
            pushFollow(FOLLOW_union_declaration_in_union_declaration_wrapper579);
            union_declaration54=union_declaration();

            state._fsp--;

            stream_union_declaration.add(union_declaration54.getTree());

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
            // 125:22: -> ^( UNION union_declaration )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:125:25: ^( UNION union_declaration )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:127:1: union_declaration : 'union' '{' ( typedef_struct )+ '}' ( union_name )? ;
    public final ObjchParser.union_declaration_return union_declaration() throws RecognitionException {
        ObjchParser.union_declaration_return retval = new ObjchParser.union_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal55=null;
        Token char_literal56=null;
        Token char_literal58=null;
        ObjchParser.typedef_struct_return typedef_struct57 =null;

        ObjchParser.union_name_return union_name59 =null;


        Object string_literal55_tree=null;
        Object char_literal56_tree=null;
        Object char_literal58_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:128:2: ( 'union' '{' ( typedef_struct )+ '}' ( union_name )? )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:128:4: 'union' '{' ( typedef_struct )+ '}' ( union_name )?
            {
            root_0 = (Object)adaptor.nil();


            string_literal55=(Token)match(input,82,FOLLOW_82_in_union_declaration598); 
            string_literal55_tree = 
            (Object)adaptor.create(string_literal55)
            ;
            adaptor.addChild(root_0, string_literal55_tree);


            char_literal56=(Token)match(input,84,FOLLOW_84_in_union_declaration603); 
            char_literal56_tree = 
            (Object)adaptor.create(char_literal56)
            ;
            adaptor.addChild(root_0, char_literal56_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:130:4: ( typedef_struct )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==80) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:130:4: typedef_struct
            	    {
            	    pushFollow(FOLLOW_typedef_struct_in_union_declaration608);
            	    typedef_struct57=typedef_struct();

            	    state._fsp--;

            	    adaptor.addChild(root_0, typedef_struct57.getTree());

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


            char_literal58=(Token)match(input,86,FOLLOW_86_in_union_declaration613); 
            char_literal58_tree = 
            (Object)adaptor.create(char_literal58)
            ;
            adaptor.addChild(root_0, char_literal58_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:131:7: ( union_name )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:131:7: union_name
                    {
                    pushFollow(FOLLOW_union_name_in_union_declaration615);
                    union_name59=union_name();

                    state._fsp--;

                    adaptor.addChild(root_0, union_name59.getTree());

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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:134:1: union_internal : ( field_declaration_wrapper | typedef_struct_wrapper );
    public final ObjchParser.union_internal_return union_internal() throws RecognitionException {
        ObjchParser.union_internal_return retval = new ObjchParser.union_internal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.field_declaration_wrapper_return field_declaration_wrapper60 =null;

        ObjchParser.typedef_struct_wrapper_return typedef_struct_wrapper61 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:135:2: ( field_declaration_wrapper | typedef_struct_wrapper )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ID||(LA19_0 >= 70 && LA19_0 <= 71)||(LA19_0 >= 74 && LA19_0 <= 75)||LA19_0==81||LA19_0==83) ) {
                alt19=1;
            }
            else if ( (LA19_0==80) ) {
                switch ( input.LA(2) ) {
                case 74:
                case 75:
                case 83:
                    {
                    alt19=1;
                    }
                    break;
                case ID:
                    {
                    int LA19_12 = input.LA(3);

                    if ( (LA19_12==ID||LA19_12==47||LA19_12==53||LA19_12==68||LA19_12==70) ) {
                        alt19=1;
                    }
                    else if ( (LA19_12==84) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 12, input);

                        throw nvae;

                    }
                    }
                    break;
                case 84:
                    {
                    alt19=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 4, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:135:4: field_declaration_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_field_declaration_wrapper_in_union_internal629);
                    field_declaration_wrapper60=field_declaration_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, field_declaration_wrapper60.getTree());

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:136:4: typedef_struct_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedef_struct_wrapper_in_union_internal634);
                    typedef_struct_wrapper61=typedef_struct_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef_struct_wrapper61.getTree());

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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:138:1: typedef_rename : ID ( '*' )? -> ^( OLD_NAME ID ) ;
    public final ObjchParser.typedef_rename_return typedef_rename() throws RecognitionException {
        ObjchParser.typedef_rename_return retval = new ObjchParser.typedef_rename_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID62=null;
        Token char_literal63=null;

        Object ID62_tree=null;
        Object char_literal63_tree=null;
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:139:2: ( ID ( '*' )? -> ^( OLD_NAME ID ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:139:4: ID ( '*' )?
            {
            ID62=(Token)match(input,ID,FOLLOW_ID_in_typedef_rename645);  
            stream_ID.add(ID62);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:139:7: ( '*' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==47) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:139:7: '*'
                    {
                    char_literal63=(Token)match(input,47,FOLLOW_47_in_typedef_rename647);  
                    stream_47.add(char_literal63);


                    }
                    break;

            }


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
            // 139:12: -> ^( OLD_NAME ID )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:139:15: ^( OLD_NAME ID )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:142:1: typedef_enum_wrapper2 : enum_declaration -> ^( ENUM enum_declaration ) ;
    public final ObjchParser.typedef_enum_wrapper2_return typedef_enum_wrapper2() throws RecognitionException {
        ObjchParser.typedef_enum_wrapper2_return retval = new ObjchParser.typedef_enum_wrapper2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.enum_declaration_return enum_declaration64 =null;


        RewriteRuleSubtreeStream stream_enum_declaration=new RewriteRuleSubtreeStream(adaptor,"rule enum_declaration");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:143:2: ( enum_declaration -> ^( ENUM enum_declaration ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:143:4: enum_declaration
            {
            pushFollow(FOLLOW_enum_declaration_in_typedef_enum_wrapper2670);
            enum_declaration64=enum_declaration();

            state._fsp--;

            stream_enum_declaration.add(enum_declaration64.getTree());

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
            // 143:21: -> ^( ENUM enum_declaration )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:143:24: ^( ENUM enum_declaration )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:145:1: enum_declaration : 'enum' ( struct_name )? '{' typedef_declaration_element_wrapper ( ',' typedef_declaration_element_wrapper )* ( ',' )? '}' ;
    public final ObjchParser.enum_declaration_return enum_declaration() throws RecognitionException {
        ObjchParser.enum_declaration_return retval = new ObjchParser.enum_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal65=null;
        Token char_literal67=null;
        Token char_literal69=null;
        Token char_literal71=null;
        Token char_literal72=null;
        ObjchParser.struct_name_return struct_name66 =null;

        ObjchParser.typedef_declaration_element_wrapper_return typedef_declaration_element_wrapper68 =null;

        ObjchParser.typedef_declaration_element_wrapper_return typedef_declaration_element_wrapper70 =null;


        Object string_literal65_tree=null;
        Object char_literal67_tree=null;
        Object char_literal69_tree=null;
        Object char_literal71_tree=null;
        Object char_literal72_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:146:2: ( 'enum' ( struct_name )? '{' typedef_declaration_element_wrapper ( ',' typedef_declaration_element_wrapper )* ( ',' )? '}' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:146:4: 'enum' ( struct_name )? '{' typedef_declaration_element_wrapper ( ',' typedef_declaration_element_wrapper )* ( ',' )? '}'
            {
            root_0 = (Object)adaptor.nil();


            string_literal65=(Token)match(input,71,FOLLOW_71_in_enum_declaration690); 
            string_literal65_tree = 
            (Object)adaptor.create(string_literal65)
            ;
            adaptor.addChild(root_0, string_literal65_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:146:11: ( struct_name )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:146:11: struct_name
                    {
                    pushFollow(FOLLOW_struct_name_in_enum_declaration692);
                    struct_name66=struct_name();

                    state._fsp--;

                    adaptor.addChild(root_0, struct_name66.getTree());

                    }
                    break;

            }


            char_literal67=(Token)match(input,84,FOLLOW_84_in_enum_declaration695); 
            char_literal67_tree = 
            (Object)adaptor.create(char_literal67)
            ;
            adaptor.addChild(root_0, char_literal67_tree);


            pushFollow(FOLLOW_typedef_declaration_element_wrapper_in_enum_declaration697);
            typedef_declaration_element_wrapper68=typedef_declaration_element_wrapper();

            state._fsp--;

            adaptor.addChild(root_0, typedef_declaration_element_wrapper68.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:146:64: ( ',' typedef_declaration_element_wrapper )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==49) ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1==ID) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:146:65: ',' typedef_declaration_element_wrapper
            	    {
            	    char_literal69=(Token)match(input,49,FOLLOW_49_in_enum_declaration700); 
            	    char_literal69_tree = 
            	    (Object)adaptor.create(char_literal69)
            	    ;
            	    adaptor.addChild(root_0, char_literal69_tree);


            	    pushFollow(FOLLOW_typedef_declaration_element_wrapper_in_enum_declaration702);
            	    typedef_declaration_element_wrapper70=typedef_declaration_element_wrapper();

            	    state._fsp--;

            	    adaptor.addChild(root_0, typedef_declaration_element_wrapper70.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:146:107: ( ',' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==49) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:146:107: ','
                    {
                    char_literal71=(Token)match(input,49,FOLLOW_49_in_enum_declaration706); 
                    char_literal71_tree = 
                    (Object)adaptor.create(char_literal71)
                    ;
                    adaptor.addChild(root_0, char_literal71_tree);


                    }
                    break;

            }


            char_literal72=(Token)match(input,86,FOLLOW_86_in_enum_declaration709); 
            char_literal72_tree = 
            (Object)adaptor.create(char_literal72)
            ;
            adaptor.addChild(root_0, char_literal72_tree);


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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:148:1: typedef_struct_wrapper : typedef_struct -> ^( STRUCT typedef_struct ) ;
    public final ObjchParser.typedef_struct_wrapper_return typedef_struct_wrapper() throws RecognitionException {
        ObjchParser.typedef_struct_wrapper_return retval = new ObjchParser.typedef_struct_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.typedef_struct_return typedef_struct73 =null;


        RewriteRuleSubtreeStream stream_typedef_struct=new RewriteRuleSubtreeStream(adaptor,"rule typedef_struct");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:149:2: ( typedef_struct -> ^( STRUCT typedef_struct ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:149:4: typedef_struct
            {
            pushFollow(FOLLOW_typedef_struct_in_typedef_struct_wrapper720);
            typedef_struct73=typedef_struct();

            state._fsp--;

            stream_typedef_struct.add(typedef_struct73.getTree());

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
            // 149:19: -> ^( STRUCT typedef_struct )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:149:22: ^( STRUCT typedef_struct )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:151:1: typedef_struct : 'struct' ( typedef_name )? '{' ( struct_field_wrapper )+ '}' ( struct_name ( ',' struct_name )* )? ( ';' )? ;
    public final ObjchParser.typedef_struct_return typedef_struct() throws RecognitionException {
        ObjchParser.typedef_struct_return retval = new ObjchParser.typedef_struct_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal74=null;
        Token char_literal76=null;
        Token char_literal78=null;
        Token char_literal80=null;
        Token char_literal82=null;
        ObjchParser.typedef_name_return typedef_name75 =null;

        ObjchParser.struct_field_wrapper_return struct_field_wrapper77 =null;

        ObjchParser.struct_name_return struct_name79 =null;

        ObjchParser.struct_name_return struct_name81 =null;


        Object string_literal74_tree=null;
        Object char_literal76_tree=null;
        Object char_literal78_tree=null;
        Object char_literal80_tree=null;
        Object char_literal82_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:152:2: ( 'struct' ( typedef_name )? '{' ( struct_field_wrapper )+ '}' ( struct_name ( ',' struct_name )* )? ( ';' )? )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:152:4: 'struct' ( typedef_name )? '{' ( struct_field_wrapper )+ '}' ( struct_name ( ',' struct_name )* )? ( ';' )?
            {
            root_0 = (Object)adaptor.nil();


            string_literal74=(Token)match(input,80,FOLLOW_80_in_typedef_struct738); 
            string_literal74_tree = 
            (Object)adaptor.create(string_literal74)
            ;
            adaptor.addChild(root_0, string_literal74_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:152:13: ( typedef_name )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:152:13: typedef_name
                    {
                    pushFollow(FOLLOW_typedef_name_in_typedef_struct740);
                    typedef_name75=typedef_name();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef_name75.getTree());

                    }
                    break;

            }


            char_literal76=(Token)match(input,84,FOLLOW_84_in_typedef_struct745); 
            char_literal76_tree = 
            (Object)adaptor.create(char_literal76)
            ;
            adaptor.addChild(root_0, char_literal76_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:154:4: ( struct_field_wrapper )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==ID||(LA25_0 >= 70 && LA25_0 <= 71)||(LA25_0 >= 74 && LA25_0 <= 75)||(LA25_0 >= 80 && LA25_0 <= 81)||LA25_0==83) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:154:4: struct_field_wrapper
            	    {
            	    pushFollow(FOLLOW_struct_field_wrapper_in_typedef_struct750);
            	    struct_field_wrapper77=struct_field_wrapper();

            	    state._fsp--;

            	    adaptor.addChild(root_0, struct_field_wrapper77.getTree());

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


            char_literal78=(Token)match(input,86,FOLLOW_86_in_typedef_struct755); 
            char_literal78_tree = 
            (Object)adaptor.create(char_literal78)
            ;
            adaptor.addChild(root_0, char_literal78_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:155:7: ( struct_name ( ',' struct_name )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:155:8: struct_name ( ',' struct_name )*
                    {
                    pushFollow(FOLLOW_struct_name_in_typedef_struct758);
                    struct_name79=struct_name();

                    state._fsp--;

                    adaptor.addChild(root_0, struct_name79.getTree());

                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:155:20: ( ',' struct_name )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==49) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:155:21: ',' struct_name
                    	    {
                    	    char_literal80=(Token)match(input,49,FOLLOW_49_in_typedef_struct761); 
                    	    char_literal80_tree = 
                    	    (Object)adaptor.create(char_literal80)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal80_tree);


                    	    pushFollow(FOLLOW_struct_name_in_typedef_struct763);
                    	    struct_name81=struct_name();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, struct_name81.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:155:41: ( ';' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==52) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:155:41: ';'
                    {
                    char_literal82=(Token)match(input,52,FOLLOW_52_in_typedef_struct769); 
                    char_literal82_tree = 
                    (Object)adaptor.create(char_literal82)
                    ;
                    adaptor.addChild(root_0, char_literal82_tree);


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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:158:1: struct_name : ID -> ^( NAME ID ) ;
    public final ObjchParser.struct_name_return struct_name() throws RecognitionException {
        ObjchParser.struct_name_return retval = new ObjchParser.struct_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID83=null;

        Object ID83_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:159:2: ( ID -> ^( NAME ID ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:159:4: ID
            {
            ID83=(Token)match(input,ID,FOLLOW_ID_in_struct_name782);  
            stream_ID.add(ID83);


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
            // 159:7: -> ^( NAME ID )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:159:10: ^( NAME ID )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:161:1: struct_field_wrapper : struct_field -> ^( FIELD struct_field ) ;
    public final ObjchParser.struct_field_wrapper_return struct_field_wrapper() throws RecognitionException {
        ObjchParser.struct_field_wrapper_return retval = new ObjchParser.struct_field_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.struct_field_return struct_field84 =null;


        RewriteRuleSubtreeStream stream_struct_field=new RewriteRuleSubtreeStream(adaptor,"rule struct_field");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:162:2: ( struct_field -> ^( FIELD struct_field ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:162:4: struct_field
            {
            pushFollow(FOLLOW_struct_field_in_struct_field_wrapper800);
            struct_field84=struct_field();

            state._fsp--;

            stream_struct_field.add(struct_field84.getTree());

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
            // 162:17: -> ^( FIELD struct_field )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:162:20: ^( FIELD struct_field )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:164:1: struct_field : ( struct_field1 | struct_field2 );
    public final ObjchParser.struct_field_return struct_field() throws RecognitionException {
        ObjchParser.struct_field_return retval = new ObjchParser.struct_field_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.struct_field1_return struct_field185 =null;

        ObjchParser.struct_field2_return struct_field286 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:165:2: ( struct_field1 | struct_field2 )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==ID||(LA29_0 >= 70 && LA29_0 <= 71)||(LA29_0 >= 74 && LA29_0 <= 75)||LA29_0==81||LA29_0==83) ) {
                alt29=1;
            }
            else if ( (LA29_0==80) ) {
                switch ( input.LA(2) ) {
                case 74:
                case 75:
                case 83:
                    {
                    alt29=1;
                    }
                    break;
                case ID:
                    {
                    int LA29_12 = input.LA(3);

                    if ( (LA29_12==ID||LA29_12==47||LA29_12==53||LA29_12==68||LA29_12==70) ) {
                        alt29=1;
                    }
                    else if ( (LA29_12==84) ) {
                        alt29=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 12, input);

                        throw nvae;

                    }
                    }
                    break;
                case 84:
                    {
                    alt29=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 4, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:165:4: struct_field1
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_struct_field1_in_struct_field818);
                    struct_field185=struct_field1();

                    state._fsp--;

                    adaptor.addChild(root_0, struct_field185.getTree());

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:166:4: struct_field2
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_struct_field2_in_struct_field823);
                    struct_field286=struct_field2();

                    state._fsp--;

                    adaptor.addChild(root_0, struct_field286.getTree());

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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:169:1: struct_field1 : type_declaration field_name ( ',' field_name )* ';' ;
    public final ObjchParser.struct_field1_return struct_field1() throws RecognitionException {
        ObjchParser.struct_field1_return retval = new ObjchParser.struct_field1_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal89=null;
        Token char_literal91=null;
        ObjchParser.type_declaration_return type_declaration87 =null;

        ObjchParser.field_name_return field_name88 =null;

        ObjchParser.field_name_return field_name90 =null;


        Object char_literal89_tree=null;
        Object char_literal91_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:170:2: ( type_declaration field_name ( ',' field_name )* ';' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:170:4: type_declaration field_name ( ',' field_name )* ';'
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_declaration_in_struct_field1835);
            type_declaration87=type_declaration();

            state._fsp--;

            adaptor.addChild(root_0, type_declaration87.getTree());

            pushFollow(FOLLOW_field_name_in_struct_field1837);
            field_name88=field_name();

            state._fsp--;

            adaptor.addChild(root_0, field_name88.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:170:32: ( ',' field_name )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==49) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:170:33: ',' field_name
            	    {
            	    char_literal89=(Token)match(input,49,FOLLOW_49_in_struct_field1840); 
            	    char_literal89_tree = 
            	    (Object)adaptor.create(char_literal89)
            	    ;
            	    adaptor.addChild(root_0, char_literal89_tree);


            	    pushFollow(FOLLOW_field_name_in_struct_field1842);
            	    field_name90=field_name();

            	    state._fsp--;

            	    adaptor.addChild(root_0, field_name90.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            char_literal91=(Token)match(input,52,FOLLOW_52_in_struct_field1846); 
            char_literal91_tree = 
            (Object)adaptor.create(char_literal91)
            ;
            adaptor.addChild(root_0, char_literal91_tree);


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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:172:1: struct_field2 : typedef_struct ;
    public final ObjchParser.struct_field2_return struct_field2() throws RecognitionException {
        ObjchParser.struct_field2_return retval = new ObjchParser.struct_field2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.typedef_struct_return typedef_struct92 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:173:2: ( typedef_struct )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:173:4: typedef_struct
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_typedef_struct_in_struct_field2856);
            typedef_struct92=typedef_struct();

            state._fsp--;

            adaptor.addChild(root_0, typedef_struct92.getTree());

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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:175:1: typedef_name : ID -> ^( TYPEDEF_NAME ID ) ;
    public final ObjchParser.typedef_name_return typedef_name() throws RecognitionException {
        ObjchParser.typedef_name_return retval = new ObjchParser.typedef_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID93=null;

        Object ID93_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:176:2: ( ID -> ^( TYPEDEF_NAME ID ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:176:4: ID
            {
            ID93=(Token)match(input,ID,FOLLOW_ID_in_typedef_name867);  
            stream_ID.add(ID93);


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
            // 176:7: -> ^( TYPEDEF_NAME ID )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:176:10: ^( TYPEDEF_NAME ID )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:178:1: typedef_declaration_element_wrapper : typedef_declaration_element -> ^( TYPEDEF_ELEMENT typedef_declaration_element ) ;
    public final ObjchParser.typedef_declaration_element_wrapper_return typedef_declaration_element_wrapper() throws RecognitionException {
        ObjchParser.typedef_declaration_element_wrapper_return retval = new ObjchParser.typedef_declaration_element_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.typedef_declaration_element_return typedef_declaration_element94 =null;


        RewriteRuleSubtreeStream stream_typedef_declaration_element=new RewriteRuleSubtreeStream(adaptor,"rule typedef_declaration_element");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:179:2: ( typedef_declaration_element -> ^( TYPEDEF_ELEMENT typedef_declaration_element ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:179:4: typedef_declaration_element
            {
            pushFollow(FOLLOW_typedef_declaration_element_in_typedef_declaration_element_wrapper884);
            typedef_declaration_element94=typedef_declaration_element();

            state._fsp--;

            stream_typedef_declaration_element.add(typedef_declaration_element94.getTree());

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
            // 179:32: -> ^( TYPEDEF_ELEMENT typedef_declaration_element )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:179:35: ^( TYPEDEF_ELEMENT typedef_declaration_element )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:182:1: typedef_declaration_element : ID ( '=' element_value )? ;
    public final ObjchParser.typedef_declaration_element_return typedef_declaration_element() throws RecognitionException {
        ObjchParser.typedef_declaration_element_return retval = new ObjchParser.typedef_declaration_element_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID95=null;
        Token char_literal96=null;
        ObjchParser.element_value_return element_value97 =null;


        Object ID95_tree=null;
        Object char_literal96_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:183:2: ( ID ( '=' element_value )? )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:183:4: ID ( '=' element_value )?
            {
            root_0 = (Object)adaptor.nil();


            ID95=(Token)match(input,ID,FOLLOW_ID_in_typedef_declaration_element904); 
            ID95_tree = 
            (Object)adaptor.create(ID95)
            ;
            adaptor.addChild(root_0, ID95_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:183:7: ( '=' element_value )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==55) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:183:8: '=' element_value
                    {
                    char_literal96=(Token)match(input,55,FOLLOW_55_in_typedef_declaration_element907); 
                    char_literal96_tree = 
                    (Object)adaptor.create(char_literal96)
                    ;
                    adaptor.addChild(root_0, char_literal96_tree);


                    pushFollow(FOLLOW_element_value_in_typedef_declaration_element909);
                    element_value97=element_value();

                    state._fsp--;

                    adaptor.addChild(root_0, element_value97.getTree());

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
    // $ANTLR end "typedef_declaration_element"


    public static class element_value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "element_value"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:186:1: element_value : simple_expression -> ^( VALUE simple_expression ) ;
    public final ObjchParser.element_value_return element_value() throws RecognitionException {
        ObjchParser.element_value_return retval = new ObjchParser.element_value_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.simple_expression_return simple_expression98 =null;


        RewriteRuleSubtreeStream stream_simple_expression=new RewriteRuleSubtreeStream(adaptor,"rule simple_expression");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:187:2: ( simple_expression -> ^( VALUE simple_expression ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:187:4: simple_expression
            {
            pushFollow(FOLLOW_simple_expression_in_element_value923);
            simple_expression98=simple_expression();

            state._fsp--;

            stream_simple_expression.add(simple_expression98.getTree());

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
            // 187:22: -> ^( VALUE simple_expression )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:187:25: ^( VALUE simple_expression )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:190:1: simple_expression : simple_expression2 ( op2 simple_expression2 )* ;
    public final ObjchParser.simple_expression_return simple_expression() throws RecognitionException {
        ObjchParser.simple_expression_return retval = new ObjchParser.simple_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.simple_expression2_return simple_expression299 =null;

        ObjchParser.op2_return op2100 =null;

        ObjchParser.simple_expression2_return simple_expression2101 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:191:2: ( simple_expression2 ( op2 simple_expression2 )* )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:191:4: simple_expression2 ( op2 simple_expression2 )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_simple_expression2_in_simple_expression944);
            simple_expression299=simple_expression2();

            state._fsp--;

            adaptor.addChild(root_0, simple_expression299.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:191:23: ( op2 simple_expression2 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0 >= 43 && LA32_0 <= 44)||LA32_0==54||LA32_0==57||LA32_0==85) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:191:25: op2 simple_expression2
            	    {
            	    pushFollow(FOLLOW_op2_in_simple_expression948);
            	    op2100=op2();

            	    state._fsp--;

            	    adaptor.addChild(root_0, op2100.getTree());

            	    pushFollow(FOLLOW_simple_expression2_in_simple_expression950);
            	    simple_expression2101=simple_expression2();

            	    state._fsp--;

            	    adaptor.addChild(root_0, simple_expression2101.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:194:1: simple_expression2 : ( ID | NUMBER | '(' simple_expression ')' );
    public final ObjchParser.simple_expression2_return simple_expression2() throws RecognitionException {
        ObjchParser.simple_expression2_return retval = new ObjchParser.simple_expression2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID102=null;
        Token NUMBER103=null;
        Token char_literal104=null;
        Token char_literal106=null;
        ObjchParser.simple_expression_return simple_expression105 =null;


        Object ID102_tree=null;
        Object NUMBER103_tree=null;
        Object char_literal104_tree=null;
        Object char_literal106_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:195:2: ( ID | NUMBER | '(' simple_expression ')' )
            int alt33=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt33=1;
                }
                break;
            case NUMBER:
                {
                alt33=2;
                }
                break;
            case 45:
                {
                alt33=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }

            switch (alt33) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:195:4: ID
                    {
                    root_0 = (Object)adaptor.nil();


                    ID102=(Token)match(input,ID,FOLLOW_ID_in_simple_expression2964); 
                    ID102_tree = 
                    (Object)adaptor.create(ID102)
                    ;
                    adaptor.addChild(root_0, ID102_tree);


                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:196:4: NUMBER
                    {
                    root_0 = (Object)adaptor.nil();


                    NUMBER103=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_simple_expression2969); 
                    NUMBER103_tree = 
                    (Object)adaptor.create(NUMBER103)
                    ;
                    adaptor.addChild(root_0, NUMBER103_tree);


                    }
                    break;
                case 3 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:197:4: '(' simple_expression ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal104=(Token)match(input,45,FOLLOW_45_in_simple_expression2974); 
                    char_literal104_tree = 
                    (Object)adaptor.create(char_literal104)
                    ;
                    adaptor.addChild(root_0, char_literal104_tree);


                    pushFollow(FOLLOW_simple_expression_in_simple_expression2976);
                    simple_expression105=simple_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, simple_expression105.getTree());

                    char_literal106=(Token)match(input,46,FOLLOW_46_in_simple_expression2978); 
                    char_literal106_tree = 
                    (Object)adaptor.create(char_literal106)
                    ;
                    adaptor.addChild(root_0, char_literal106_tree);


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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:199:1: op2 : ( '|' | '&~' | '&' | '<<' | '>>' );
    public final ObjchParser.op2_return op2() throws RecognitionException {
        ObjchParser.op2_return retval = new ObjchParser.op2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set107=null;

        Object set107_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:199:5: ( '|' | '&~' | '&' | '<<' | '>>' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:
            {
            root_0 = (Object)adaptor.nil();


            set107=(Token)input.LT(1);

            if ( (input.LA(1) >= 43 && input.LA(1) <= 44)||input.LA(1)==54||input.LA(1)==57||input.LA(1)==85 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set107)
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:201:1: class_declaration : '@class' ID ( ',' ID )* ';' ;
    public final ObjchParser.class_declaration_return class_declaration() throws RecognitionException {
        ObjchParser.class_declaration_return retval = new ObjchParser.class_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal108=null;
        Token ID109=null;
        Token char_literal110=null;
        Token ID111=null;
        Token char_literal112=null;

        Object string_literal108_tree=null;
        Object ID109_tree=null;
        Object char_literal110_tree=null;
        Object ID111_tree=null;
        Object char_literal112_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:202:2: ( '@class' ID ( ',' ID )* ';' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:202:4: '@class' ID ( ',' ID )* ';'
            {
            root_0 = (Object)adaptor.nil();


            string_literal108=(Token)match(input,58,FOLLOW_58_in_class_declaration1013); 
            string_literal108_tree = 
            (Object)adaptor.create(string_literal108)
            ;
            adaptor.addChild(root_0, string_literal108_tree);


            ID109=(Token)match(input,ID,FOLLOW_ID_in_class_declaration1015); 
            ID109_tree = 
            (Object)adaptor.create(ID109)
            ;
            adaptor.addChild(root_0, ID109_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:202:16: ( ',' ID )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==49) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:202:17: ',' ID
            	    {
            	    char_literal110=(Token)match(input,49,FOLLOW_49_in_class_declaration1018); 
            	    char_literal110_tree = 
            	    (Object)adaptor.create(char_literal110)
            	    ;
            	    adaptor.addChild(root_0, char_literal110_tree);


            	    ID111=(Token)match(input,ID,FOLLOW_ID_in_class_declaration1020); 
            	    ID111_tree = 
            	    (Object)adaptor.create(ID111)
            	    ;
            	    adaptor.addChild(root_0, ID111_tree);


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            char_literal112=(Token)match(input,52,FOLLOW_52_in_class_declaration1024); 
            char_literal112_tree = 
            (Object)adaptor.create(char_literal112)
            ;
            adaptor.addChild(root_0, char_literal112_tree);


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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:204:1: protocol_declaration : '@protocol' protocol_name ( generic )? protocol_end ;
    public final ObjchParser.protocol_declaration_return protocol_declaration() throws RecognitionException {
        ObjchParser.protocol_declaration_return retval = new ObjchParser.protocol_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal113=null;
        ObjchParser.protocol_name_return protocol_name114 =null;

        ObjchParser.generic_return generic115 =null;

        ObjchParser.protocol_end_return protocol_end116 =null;


        Object string_literal113_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:205:2: ( '@protocol' protocol_name ( generic )? protocol_end )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:205:4: '@protocol' protocol_name ( generic )? protocol_end
            {
            root_0 = (Object)adaptor.nil();


            string_literal113=(Token)match(input,65,FOLLOW_65_in_protocol_declaration1034); 
            string_literal113_tree = 
            (Object)adaptor.create(string_literal113)
            ;
            adaptor.addChild(root_0, string_literal113_tree);


            pushFollow(FOLLOW_protocol_name_in_protocol_declaration1036);
            protocol_name114=protocol_name();

            state._fsp--;

            adaptor.addChild(root_0, protocol_name114.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:205:30: ( generic )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==53) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:205:30: generic
                    {
                    pushFollow(FOLLOW_generic_in_protocol_declaration1038);
                    generic115=generic();

                    state._fsp--;

                    adaptor.addChild(root_0, generic115.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_protocol_end_in_protocol_declaration1044);
            protocol_end116=protocol_end();

            state._fsp--;

            adaptor.addChild(root_0, protocol_end116.getTree());

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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:209:1: protocol_end : ( protocol_end1 | protocol_end2 );
    public final ObjchParser.protocol_end_return protocol_end() throws RecognitionException {
        ObjchParser.protocol_end_return retval = new ObjchParser.protocol_end_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.protocol_end1_return protocol_end1117 =null;

        ObjchParser.protocol_end2_return protocol_end2118 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:210:2: ( protocol_end1 | protocol_end2 )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==ID||LA36_0==48||LA36_0==50||LA36_0==59||LA36_0==61||LA36_0==63||LA36_0==67||(LA36_0 >= 70 && LA36_0 <= 71)||(LA36_0 >= 74 && LA36_0 <= 75)||(LA36_0 >= 80 && LA36_0 <= 81)||LA36_0==83) ) {
                alt36=1;
            }
            else if ( (LA36_0==52) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }
            switch (alt36) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:210:4: protocol_end1
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_protocol_end1_in_protocol_end1056);
                    protocol_end1117=protocol_end1();

                    state._fsp--;

                    adaptor.addChild(root_0, protocol_end1117.getTree());

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:211:4: protocol_end2
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_protocol_end2_in_protocol_end1061);
                    protocol_end2118=protocol_end2();

                    state._fsp--;

                    adaptor.addChild(root_0, protocol_end2118.getTree());

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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:213:1: protocol_end1 : ( declarations )* '@end' ;
    public final ObjchParser.protocol_end1_return protocol_end1() throws RecognitionException {
        ObjchParser.protocol_end1_return retval = new ObjchParser.protocol_end1_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal120=null;
        ObjchParser.declarations_return declarations119 =null;


        Object string_literal120_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:214:2: ( ( declarations )* '@end' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:214:4: ( declarations )* '@end'
            {
            root_0 = (Object)adaptor.nil();


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:214:4: ( declarations )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==ID||LA37_0==48||LA37_0==50||LA37_0==61||LA37_0==63||LA37_0==67||(LA37_0 >= 70 && LA37_0 <= 71)||(LA37_0 >= 74 && LA37_0 <= 75)||(LA37_0 >= 80 && LA37_0 <= 81)||LA37_0==83) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:214:4: declarations
            	    {
            	    pushFollow(FOLLOW_declarations_in_protocol_end11070);
            	    declarations119=declarations();

            	    state._fsp--;

            	    adaptor.addChild(root_0, declarations119.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            string_literal120=(Token)match(input,59,FOLLOW_59_in_protocol_end11075); 
            string_literal120_tree = 
            (Object)adaptor.create(string_literal120)
            ;
            adaptor.addChild(root_0, string_literal120_tree);


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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:218:1: protocol_end2 : ';' ;
    public final ObjchParser.protocol_end2_return protocol_end2() throws RecognitionException {
        ObjchParser.protocol_end2_return retval = new ObjchParser.protocol_end2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal121=null;

        Object char_literal121_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:219:2: ( ';' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:219:4: ';'
            {
            root_0 = (Object)adaptor.nil();


            char_literal121=(Token)match(input,52,FOLLOW_52_in_protocol_end21087); 
            char_literal121_tree = 
            (Object)adaptor.create(char_literal121)
            ;
            adaptor.addChild(root_0, char_literal121_tree);


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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:223:1: generic : '<' generic_internal '>' ;
    public final ObjchParser.generic_return generic() throws RecognitionException {
        ObjchParser.generic_return retval = new ObjchParser.generic_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal122=null;
        Token char_literal124=null;
        ObjchParser.generic_internal_return generic_internal123 =null;


        Object char_literal122_tree=null;
        Object char_literal124_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:223:9: ( '<' generic_internal '>' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:223:11: '<' generic_internal '>'
            {
            root_0 = (Object)adaptor.nil();


            char_literal122=(Token)match(input,53,FOLLOW_53_in_generic1100); 
            char_literal122_tree = 
            (Object)adaptor.create(char_literal122)
            ;
            adaptor.addChild(root_0, char_literal122_tree);


            pushFollow(FOLLOW_generic_internal_in_generic1102);
            generic_internal123=generic_internal();

            state._fsp--;

            adaptor.addChild(root_0, generic_internal123.getTree());

            char_literal124=(Token)match(input,56,FOLLOW_56_in_generic1104); 
            char_literal124_tree = 
            (Object)adaptor.create(char_literal124)
            ;
            adaptor.addChild(root_0, char_literal124_tree);


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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:225:1: generic_internal : type_declaration ( ',' type_declaration )* ;
    public final ObjchParser.generic_internal_return generic_internal() throws RecognitionException {
        ObjchParser.generic_internal_return retval = new ObjchParser.generic_internal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal126=null;
        ObjchParser.type_declaration_return type_declaration125 =null;

        ObjchParser.type_declaration_return type_declaration127 =null;


        Object char_literal126_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:226:2: ( type_declaration ( ',' type_declaration )* )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:226:4: type_declaration ( ',' type_declaration )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_declaration_in_generic_internal1113);
            type_declaration125=type_declaration();

            state._fsp--;

            adaptor.addChild(root_0, type_declaration125.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:226:21: ( ',' type_declaration )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==49) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:226:22: ',' type_declaration
            	    {
            	    char_literal126=(Token)match(input,49,FOLLOW_49_in_generic_internal1116); 
            	    char_literal126_tree = 
            	    (Object)adaptor.create(char_literal126)
            	    ;
            	    adaptor.addChild(root_0, char_literal126_tree);


            	    pushFollow(FOLLOW_type_declaration_in_generic_internal1118);
            	    type_declaration127=type_declaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, type_declaration127.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:228:1: protocol_name : ID -> ^( NAME ID ) ;
    public final ObjchParser.protocol_name_return protocol_name() throws RecognitionException {
        ObjchParser.protocol_name_return retval = new ObjchParser.protocol_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID128=null;

        Object ID128_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:229:2: ( ID -> ^( NAME ID ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:229:4: ID
            {
            ID128=(Token)match(input,ID,FOLLOW_ID_in_protocol_name1130);  
            stream_ID.add(ID128);


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
            // 229:7: -> ^( NAME ID )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:229:10: ^( NAME ID )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:231:1: interface_declaration : '@interface' interface_name ( ':' superclass_name )? ( interface_body )? ( declarations )* '@end' ;
    public final ObjchParser.interface_declaration_return interface_declaration() throws RecognitionException {
        ObjchParser.interface_declaration_return retval = new ObjchParser.interface_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal129=null;
        Token char_literal131=null;
        Token string_literal135=null;
        ObjchParser.interface_name_return interface_name130 =null;

        ObjchParser.superclass_name_return superclass_name132 =null;

        ObjchParser.interface_body_return interface_body133 =null;

        ObjchParser.declarations_return declarations134 =null;


        Object string_literal129_tree=null;
        Object char_literal131_tree=null;
        Object string_literal135_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:232:2: ( '@interface' interface_name ( ':' superclass_name )? ( interface_body )? ( declarations )* '@end' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:232:4: '@interface' interface_name ( ':' superclass_name )? ( interface_body )? ( declarations )* '@end'
            {
            root_0 = (Object)adaptor.nil();


            string_literal129=(Token)match(input,60,FOLLOW_60_in_interface_declaration1150); 
            string_literal129_tree = 
            (Object)adaptor.create(string_literal129)
            ;
            adaptor.addChild(root_0, string_literal129_tree);


            pushFollow(FOLLOW_interface_name_in_interface_declaration1152);
            interface_name130=interface_name();

            state._fsp--;

            adaptor.addChild(root_0, interface_name130.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:232:32: ( ':' superclass_name )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==51) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:232:33: ':' superclass_name
                    {
                    char_literal131=(Token)match(input,51,FOLLOW_51_in_interface_declaration1155); 
                    char_literal131_tree = 
                    (Object)adaptor.create(char_literal131)
                    ;
                    adaptor.addChild(root_0, char_literal131_tree);


                    pushFollow(FOLLOW_superclass_name_in_interface_declaration1157);
                    superclass_name132=superclass_name();

                    state._fsp--;

                    adaptor.addChild(root_0, superclass_name132.getTree());

                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:233:2: ( interface_body )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==84) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:233:2: interface_body
                    {
                    pushFollow(FOLLOW_interface_body_in_interface_declaration1162);
                    interface_body133=interface_body();

                    state._fsp--;

                    adaptor.addChild(root_0, interface_body133.getTree());

                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:234:2: ( declarations )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==ID||LA41_0==48||LA41_0==50||LA41_0==61||LA41_0==63||LA41_0==67||(LA41_0 >= 70 && LA41_0 <= 71)||(LA41_0 >= 74 && LA41_0 <= 75)||(LA41_0 >= 80 && LA41_0 <= 81)||LA41_0==83) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:234:2: declarations
            	    {
            	    pushFollow(FOLLOW_declarations_in_interface_declaration1166);
            	    declarations134=declarations();

            	    state._fsp--;

            	    adaptor.addChild(root_0, declarations134.getTree());

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            string_literal135=(Token)match(input,59,FOLLOW_59_in_interface_declaration1170); 
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
    // $ANTLR end "interface_declaration"


    public static class interface_body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interface_body"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:238:1: interface_body : '{' ( interface_body_item )* '}' ;
    public final ObjchParser.interface_body_return interface_body() throws RecognitionException {
        ObjchParser.interface_body_return retval = new ObjchParser.interface_body_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal136=null;
        Token char_literal138=null;
        ObjchParser.interface_body_item_return interface_body_item137 =null;


        Object char_literal136_tree=null;
        Object char_literal138_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:239:2: ( '{' ( interface_body_item )* '}' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:240:2: '{' ( interface_body_item )* '}'
            {
            root_0 = (Object)adaptor.nil();


            char_literal136=(Token)match(input,84,FOLLOW_84_in_interface_body1183); 
            char_literal136_tree = 
            (Object)adaptor.create(char_literal136)
            ;
            adaptor.addChild(root_0, char_literal136_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:241:3: ( interface_body_item )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==ID||LA42_0==62||LA42_0==64||LA42_0==66||(LA42_0 >= 70 && LA42_0 <= 71)||(LA42_0 >= 74 && LA42_0 <= 75)||(LA42_0 >= 80 && LA42_0 <= 83)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:241:3: interface_body_item
            	    {
            	    pushFollow(FOLLOW_interface_body_item_in_interface_body1187);
            	    interface_body_item137=interface_body_item();

            	    state._fsp--;

            	    adaptor.addChild(root_0, interface_body_item137.getTree());

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            char_literal138=(Token)match(input,86,FOLLOW_86_in_interface_body1191); 
            char_literal138_tree = 
            (Object)adaptor.create(char_literal138)
            ;
            adaptor.addChild(root_0, char_literal138_tree);


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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:245:1: interface_body_item : ( ( group_modifier_wrapper )? simple_fields_declaration | union_declaration_wrapper ';' );
    public final ObjchParser.interface_body_item_return interface_body_item() throws RecognitionException {
        ObjchParser.interface_body_item_return retval = new ObjchParser.interface_body_item_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal142=null;
        ObjchParser.group_modifier_wrapper_return group_modifier_wrapper139 =null;

        ObjchParser.simple_fields_declaration_return simple_fields_declaration140 =null;

        ObjchParser.union_declaration_wrapper_return union_declaration_wrapper141 =null;


        Object char_literal142_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:246:2: ( ( group_modifier_wrapper )? simple_fields_declaration | union_declaration_wrapper ';' )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==ID||LA44_0==62||LA44_0==64||LA44_0==66||(LA44_0 >= 70 && LA44_0 <= 71)||(LA44_0 >= 74 && LA44_0 <= 75)||(LA44_0 >= 80 && LA44_0 <= 81)||LA44_0==83) ) {
                alt44=1;
            }
            else if ( (LA44_0==82) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;

            }
            switch (alt44) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:246:4: ( group_modifier_wrapper )? simple_fields_declaration
                    {
                    root_0 = (Object)adaptor.nil();


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:246:4: ( group_modifier_wrapper )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==62||LA43_0==64||LA43_0==66) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:246:4: group_modifier_wrapper
                            {
                            pushFollow(FOLLOW_group_modifier_wrapper_in_interface_body_item1203);
                            group_modifier_wrapper139=group_modifier_wrapper();

                            state._fsp--;

                            adaptor.addChild(root_0, group_modifier_wrapper139.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_simple_fields_declaration_in_interface_body_item1206);
                    simple_fields_declaration140=simple_fields_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, simple_fields_declaration140.getTree());

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:247:4: union_declaration_wrapper ';'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_union_declaration_wrapper_in_interface_body_item1211);
                    union_declaration_wrapper141=union_declaration_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, union_declaration_wrapper141.getTree());

                    char_literal142=(Token)match(input,52,FOLLOW_52_in_interface_body_item1213); 
                    char_literal142_tree = 
                    (Object)adaptor.create(char_literal142)
                    ;
                    adaptor.addChild(root_0, char_literal142_tree);


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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:250:1: union_name : ID -> ^( NAME ID ) ;
    public final ObjchParser.union_name_return union_name() throws RecognitionException {
        ObjchParser.union_name_return retval = new ObjchParser.union_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID143=null;

        Object ID143_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:251:2: ( ID -> ^( NAME ID ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:251:4: ID
            {
            ID143=(Token)match(input,ID,FOLLOW_ID_in_union_name1224);  
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
            // 251:7: -> ^( NAME ID )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:251:10: ^( NAME ID )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:253:1: group_modifier_wrapper : group_modifier -> ^( GROUP_MODIFIER group_modifier ) ;
    public final ObjchParser.group_modifier_wrapper_return group_modifier_wrapper() throws RecognitionException {
        ObjchParser.group_modifier_wrapper_return retval = new ObjchParser.group_modifier_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.group_modifier_return group_modifier144 =null;


        RewriteRuleSubtreeStream stream_group_modifier=new RewriteRuleSubtreeStream(adaptor,"rule group_modifier");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:254:2: ( group_modifier -> ^( GROUP_MODIFIER group_modifier ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:254:4: group_modifier
            {
            pushFollow(FOLLOW_group_modifier_in_group_modifier_wrapper1243);
            group_modifier144=group_modifier();

            state._fsp--;

            stream_group_modifier.add(group_modifier144.getTree());

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
            // 254:19: -> ^( GROUP_MODIFIER group_modifier )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:254:22: ^( GROUP_MODIFIER group_modifier )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:256:1: group_modifier : ( '@private' | '@protected' | '@public' );
    public final ObjchParser.group_modifier_return group_modifier() throws RecognitionException {
        ObjchParser.group_modifier_return retval = new ObjchParser.group_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set145=null;

        Object set145_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:257:2: ( '@private' | '@protected' | '@public' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:
            {
            root_0 = (Object)adaptor.nil();


            set145=(Token)input.LT(1);

            if ( input.LA(1)==62||input.LA(1)==64||input.LA(1)==66 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set145)
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:259:1: interface_name : ID ( category )? -> ^( INTERFACE_NAME ID ( category )? ) ;
    public final ObjchParser.interface_name_return interface_name() throws RecognitionException {
        ObjchParser.interface_name_return retval = new ObjchParser.interface_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID146=null;
        ObjchParser.category_return category147 =null;


        Object ID146_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_category=new RewriteRuleSubtreeStream(adaptor,"rule category");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:260:2: ( ID ( category )? -> ^( INTERFACE_NAME ID ( category )? ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:260:4: ID ( category )?
            {
            ID146=(Token)match(input,ID,FOLLOW_ID_in_interface_name1282);  
            stream_ID.add(ID146);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:260:7: ( category )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==45) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:260:7: category
                    {
                    pushFollow(FOLLOW_category_in_interface_name1284);
                    category147=category();

                    state._fsp--;

                    stream_category.add(category147.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: ID, category
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 260:17: -> ^( INTERFACE_NAME ID ( category )? )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:260:20: ^( INTERFACE_NAME ID ( category )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INTERFACE_NAME, "INTERFACE_NAME")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:260:40: ( category )?
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:262:1: category : '(' ID ')' -> ^( CATEGORY ID ) ;
    public final ObjchParser.category_return category() throws RecognitionException {
        ObjchParser.category_return retval = new ObjchParser.category_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal148=null;
        Token ID149=null;
        Token char_literal150=null;

        Object char_literal148_tree=null;
        Object ID149_tree=null;
        Object char_literal150_tree=null;
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:262:9: ( '(' ID ')' -> ^( CATEGORY ID ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:262:11: '(' ID ')'
            {
            char_literal148=(Token)match(input,45,FOLLOW_45_in_category1303);  
            stream_45.add(char_literal148);


            ID149=(Token)match(input,ID,FOLLOW_ID_in_category1305);  
            stream_ID.add(ID149);


            char_literal150=(Token)match(input,46,FOLLOW_46_in_category1307);  
            stream_46.add(char_literal150);


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
            // 262:22: -> ^( CATEGORY ID )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:262:25: ^( CATEGORY ID )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:264:1: superclass_name : ID ( generic )? -> ^( SUPERCLASS_NAME ID ( generic )? ) ;
    public final ObjchParser.superclass_name_return superclass_name() throws RecognitionException {
        ObjchParser.superclass_name_return retval = new ObjchParser.superclass_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID151=null;
        ObjchParser.generic_return generic152 =null;


        Object ID151_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_generic=new RewriteRuleSubtreeStream(adaptor,"rule generic");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:265:2: ( ID ( generic )? -> ^( SUPERCLASS_NAME ID ( generic )? ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:265:4: ID ( generic )?
            {
            ID151=(Token)match(input,ID,FOLLOW_ID_in_superclass_name1324);  
            stream_ID.add(ID151);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:265:7: ( generic )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==53) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:265:7: generic
                    {
                    pushFollow(FOLLOW_generic_in_superclass_name1326);
                    generic152=generic();

                    state._fsp--;

                    stream_generic.add(generic152.getTree());

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
            // 265:16: -> ^( SUPERCLASS_NAME ID ( generic )? )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:265:19: ^( SUPERCLASS_NAME ID ( generic )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SUPERCLASS_NAME, "SUPERCLASS_NAME")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:265:40: ( generic )?
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:267:1: simple_fields_declaration : fields_declarations -> ^( FIELDS fields_declarations ) ;
    public final ObjchParser.simple_fields_declaration_return simple_fields_declaration() throws RecognitionException {
        ObjchParser.simple_fields_declaration_return retval = new ObjchParser.simple_fields_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.fields_declarations_return fields_declarations153 =null;


        RewriteRuleSubtreeStream stream_fields_declarations=new RewriteRuleSubtreeStream(adaptor,"rule fields_declarations");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:268:2: ( fields_declarations -> ^( FIELDS fields_declarations ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:268:4: fields_declarations
            {
            pushFollow(FOLLOW_fields_declarations_in_simple_fields_declaration1348);
            fields_declarations153=fields_declarations();

            state._fsp--;

            stream_fields_declarations.add(fields_declarations153.getTree());

            // AST REWRITE
            // elements: fields_declarations
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 268:24: -> ^( FIELDS fields_declarations )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:268:27: ^( FIELDS fields_declarations )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FIELDS, "FIELDS")
                , root_1);

                adaptor.addChild(root_1, stream_fields_declarations.nextTree());

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


    public static class fields_declarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fields_declarations"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:270:1: fields_declarations : ( field_declaration )+ -> ( ^( FIELD field_declaration ) )+ ;
    public final ObjchParser.fields_declarations_return fields_declarations() throws RecognitionException {
        ObjchParser.fields_declarations_return retval = new ObjchParser.fields_declarations_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.field_declaration_return field_declaration154 =null;


        RewriteRuleSubtreeStream stream_field_declaration=new RewriteRuleSubtreeStream(adaptor,"rule field_declaration");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:271:2: ( ( field_declaration )+ -> ( ^( FIELD field_declaration ) )+ )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:271:4: ( field_declaration )+
            {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:271:4: ( field_declaration )+
            int cnt47=0;
            loop47:
            do {
                int alt47=2;
                switch ( input.LA(1) ) {
                case 70:
                    {
                    alt47=1;
                    }
                    break;
                case 71:
                    {
                    alt47=1;
                    }
                    break;
                case 81:
                    {
                    alt47=1;
                    }
                    break;
                case 80:
                    {
                    alt47=1;
                    }
                    break;
                case 83:
                    {
                    alt47=1;
                    }
                    break;
                case 74:
                    {
                    alt47=1;
                    }
                    break;
                case 75:
                    {
                    alt47=1;
                    }
                    break;
                case ID:
                    {
                    alt47=1;
                    }
                    break;

                }

                switch (alt47) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:271:4: field_declaration
            	    {
            	    pushFollow(FOLLOW_field_declaration_in_fields_declarations1366);
            	    field_declaration154=field_declaration();

            	    state._fsp--;

            	    stream_field_declaration.add(field_declaration154.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt47 >= 1 ) break loop47;
                        EarlyExitException eee =
                            new EarlyExitException(47, input);
                        throw eee;
                }
                cnt47++;
            } while (true);


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
            // 271:23: -> ( ^( FIELD field_declaration ) )+
            {
                if ( !(stream_field_declaration.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_field_declaration.hasNext() ) {
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:271:26: ^( FIELD field_declaration )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot(
                    (Object)adaptor.create(FIELD, "FIELD")
                    , root_1);

                    adaptor.addChild(root_1, stream_field_declaration.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_field_declaration.reset();

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
    // $ANTLR end "fields_declarations"


    public static class field_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "field_declaration"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:273:1: field_declaration : type_declaration field_name ( classical_method_params | ( ',' field_name )* ) ';' ;
    public final ObjchParser.field_declaration_return field_declaration() throws RecognitionException {
        ObjchParser.field_declaration_return retval = new ObjchParser.field_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal158=null;
        Token char_literal160=null;
        ObjchParser.type_declaration_return type_declaration155 =null;

        ObjchParser.field_name_return field_name156 =null;

        ObjchParser.classical_method_params_return classical_method_params157 =null;

        ObjchParser.field_name_return field_name159 =null;


        Object char_literal158_tree=null;
        Object char_literal160_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:274:2: ( type_declaration field_name ( classical_method_params | ( ',' field_name )* ) ';' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:274:4: type_declaration field_name ( classical_method_params | ( ',' field_name )* ) ';'
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_declaration_in_field_declaration1386);
            type_declaration155=type_declaration();

            state._fsp--;

            adaptor.addChild(root_0, type_declaration155.getTree());

            pushFollow(FOLLOW_field_name_in_field_declaration1388);
            field_name156=field_name();

            state._fsp--;

            adaptor.addChild(root_0, field_name156.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:274:32: ( classical_method_params | ( ',' field_name )* )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==45) ) {
                alt49=1;
            }
            else if ( (LA49_0==49||LA49_0==52) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;

            }
            switch (alt49) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:274:33: classical_method_params
                    {
                    pushFollow(FOLLOW_classical_method_params_in_field_declaration1391);
                    classical_method_params157=classical_method_params();

                    state._fsp--;

                    adaptor.addChild(root_0, classical_method_params157.getTree());

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:274:59: ( ',' field_name )*
                    {
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:274:59: ( ',' field_name )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==49) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:274:60: ',' field_name
                    	    {
                    	    char_literal158=(Token)match(input,49,FOLLOW_49_in_field_declaration1396); 
                    	    char_literal158_tree = 
                    	    (Object)adaptor.create(char_literal158)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal158_tree);


                    	    pushFollow(FOLLOW_field_name_in_field_declaration1398);
                    	    field_name159=field_name();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, field_name159.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);


                    }
                    break;

            }


            char_literal160=(Token)match(input,52,FOLLOW_52_in_field_declaration1403); 
            char_literal160_tree = 
            (Object)adaptor.create(char_literal160)
            ;
            adaptor.addChild(root_0, char_literal160_tree);


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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:276:1: classical_method_params : '(' classical_param ( ',' classical_param )* ')' ;
    public final ObjchParser.classical_method_params_return classical_method_params() throws RecognitionException {
        ObjchParser.classical_method_params_return retval = new ObjchParser.classical_method_params_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal161=null;
        Token char_literal163=null;
        Token char_literal165=null;
        ObjchParser.classical_param_return classical_param162 =null;

        ObjchParser.classical_param_return classical_param164 =null;


        Object char_literal161_tree=null;
        Object char_literal163_tree=null;
        Object char_literal165_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:277:2: ( '(' classical_param ( ',' classical_param )* ')' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:277:4: '(' classical_param ( ',' classical_param )* ')'
            {
            root_0 = (Object)adaptor.nil();


            char_literal161=(Token)match(input,45,FOLLOW_45_in_classical_method_params1413); 
            char_literal161_tree = 
            (Object)adaptor.create(char_literal161)
            ;
            adaptor.addChild(root_0, char_literal161_tree);


            pushFollow(FOLLOW_classical_param_in_classical_method_params1415);
            classical_param162=classical_param();

            state._fsp--;

            adaptor.addChild(root_0, classical_param162.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:277:24: ( ',' classical_param )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==49) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:277:25: ',' classical_param
            	    {
            	    char_literal163=(Token)match(input,49,FOLLOW_49_in_classical_method_params1418); 
            	    char_literal163_tree = 
            	    (Object)adaptor.create(char_literal163)
            	    ;
            	    adaptor.addChild(root_0, char_literal163_tree);


            	    pushFollow(FOLLOW_classical_param_in_classical_method_params1420);
            	    classical_param164=classical_param();

            	    state._fsp--;

            	    adaptor.addChild(root_0, classical_param164.getTree());

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            char_literal165=(Token)match(input,46,FOLLOW_46_in_classical_method_params1424); 
            char_literal165_tree = 
            (Object)adaptor.create(char_literal165)
            ;
            adaptor.addChild(root_0, char_literal165_tree);


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


    public static class classical_param_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classical_param"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:280:1: classical_param : type_declaration ID ( '[' ( NUMBER )? ']' )* ;
    public final ObjchParser.classical_param_return classical_param() throws RecognitionException {
        ObjchParser.classical_param_return retval = new ObjchParser.classical_param_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID167=null;
        Token char_literal168=null;
        Token NUMBER169=null;
        Token char_literal170=null;
        ObjchParser.type_declaration_return type_declaration166 =null;


        Object ID167_tree=null;
        Object char_literal168_tree=null;
        Object NUMBER169_tree=null;
        Object char_literal170_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:281:2: ( type_declaration ID ( '[' ( NUMBER )? ']' )* )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:281:4: type_declaration ID ( '[' ( NUMBER )? ']' )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_declaration_in_classical_param1437);
            type_declaration166=type_declaration();

            state._fsp--;

            adaptor.addChild(root_0, type_declaration166.getTree());

            ID167=(Token)match(input,ID,FOLLOW_ID_in_classical_param1439); 
            ID167_tree = 
            (Object)adaptor.create(ID167)
            ;
            adaptor.addChild(root_0, ID167_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:281:24: ( '[' ( NUMBER )? ']' )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==68) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:281:25: '[' ( NUMBER )? ']'
            	    {
            	    char_literal168=(Token)match(input,68,FOLLOW_68_in_classical_param1442); 
            	    char_literal168_tree = 
            	    (Object)adaptor.create(char_literal168)
            	    ;
            	    adaptor.addChild(root_0, char_literal168_tree);


            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:281:29: ( NUMBER )?
            	    int alt51=2;
            	    int LA51_0 = input.LA(1);

            	    if ( (LA51_0==NUMBER) ) {
            	        alt51=1;
            	    }
            	    switch (alt51) {
            	        case 1 :
            	            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:281:29: NUMBER
            	            {
            	            NUMBER169=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_classical_param1444); 
            	            NUMBER169_tree = 
            	            (Object)adaptor.create(NUMBER169)
            	            ;
            	            adaptor.addChild(root_0, NUMBER169_tree);


            	            }
            	            break;

            	    }


            	    char_literal170=(Token)match(input,69,FOLLOW_69_in_classical_param1447); 
            	    char_literal170_tree = 
            	    (Object)adaptor.create(char_literal170)
            	    ;
            	    adaptor.addChild(root_0, char_literal170_tree);


            	    }
            	    break;

            	default :
            	    break loop52;
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
    // $ANTLR end "classical_param"


    public static class type_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_declaration"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:283:1: type_declaration : ( 'const' )? ( 'enum' )? ( 'typedef' )? ( 'struct' )? ( ( 'unsigned' ( type_dec )? ) | type_dec ) ( 'const' )? ( generic )? ( '*' )? -> ^( TYPE type_dec ( generic )? ( '*' )? ) ;
    public final ObjchParser.type_declaration_return type_declaration() throws RecognitionException {
        ObjchParser.type_declaration_return retval = new ObjchParser.type_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal171=null;
        Token string_literal172=null;
        Token string_literal173=null;
        Token string_literal174=null;
        Token string_literal175=null;
        Token string_literal178=null;
        Token char_literal180=null;
        ObjchParser.type_dec_return type_dec176 =null;

        ObjchParser.type_dec_return type_dec177 =null;

        ObjchParser.generic_return generic179 =null;


        Object string_literal171_tree=null;
        Object string_literal172_tree=null;
        Object string_literal173_tree=null;
        Object string_literal174_tree=null;
        Object string_literal175_tree=null;
        Object string_literal178_tree=null;
        Object char_literal180_tree=null;
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleSubtreeStream stream_generic=new RewriteRuleSubtreeStream(adaptor,"rule generic");
        RewriteRuleSubtreeStream stream_type_dec=new RewriteRuleSubtreeStream(adaptor,"rule type_dec");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:284:2: ( ( 'const' )? ( 'enum' )? ( 'typedef' )? ( 'struct' )? ( ( 'unsigned' ( type_dec )? ) | type_dec ) ( 'const' )? ( generic )? ( '*' )? -> ^( TYPE type_dec ( generic )? ( '*' )? ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:284:4: ( 'const' )? ( 'enum' )? ( 'typedef' )? ( 'struct' )? ( ( 'unsigned' ( type_dec )? ) | type_dec ) ( 'const' )? ( generic )? ( '*' )?
            {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:284:4: ( 'const' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==70) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:284:4: 'const'
                    {
                    string_literal171=(Token)match(input,70,FOLLOW_70_in_type_declaration1461);  
                    stream_70.add(string_literal171);


                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:284:13: ( 'enum' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==71) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:284:13: 'enum'
                    {
                    string_literal172=(Token)match(input,71,FOLLOW_71_in_type_declaration1464);  
                    stream_71.add(string_literal172);


                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:284:21: ( 'typedef' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==81) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:284:21: 'typedef'
                    {
                    string_literal173=(Token)match(input,81,FOLLOW_81_in_type_declaration1467);  
                    stream_81.add(string_literal173);


                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:284:32: ( 'struct' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==80) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:284:32: 'struct'
                    {
                    string_literal174=(Token)match(input,80,FOLLOW_80_in_type_declaration1470);  
                    stream_80.add(string_literal174);


                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:284:42: ( ( 'unsigned' ( type_dec )? ) | type_dec )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==83) ) {
                alt58=1;
            }
            else if ( (LA58_0==ID||(LA58_0 >= 74 && LA58_0 <= 75)) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;

            }
            switch (alt58) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:284:43: ( 'unsigned' ( type_dec )? )
                    {
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:284:43: ( 'unsigned' ( type_dec )? )
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:284:44: 'unsigned' ( type_dec )?
                    {
                    string_literal175=(Token)match(input,83,FOLLOW_83_in_type_declaration1475);  
                    stream_83.add(string_literal175);


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:284:55: ( type_dec )?
                    int alt57=2;
                    alt57 = dfa57.predict(input);
                    switch (alt57) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:284:55: type_dec
                            {
                            pushFollow(FOLLOW_type_dec_in_type_declaration1477);
                            type_dec176=type_dec();

                            state._fsp--;

                            stream_type_dec.add(type_dec176.getTree());

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:284:68: type_dec
                    {
                    pushFollow(FOLLOW_type_dec_in_type_declaration1483);
                    type_dec177=type_dec();

                    state._fsp--;

                    stream_type_dec.add(type_dec177.getTree());

                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:284:78: ( 'const' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==70) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:284:78: 'const'
                    {
                    string_literal178=(Token)match(input,70,FOLLOW_70_in_type_declaration1486);  
                    stream_70.add(string_literal178);


                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:284:87: ( generic )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==53) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:284:87: generic
                    {
                    pushFollow(FOLLOW_generic_in_type_declaration1489);
                    generic179=generic();

                    state._fsp--;

                    stream_generic.add(generic179.getTree());

                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:284:96: ( '*' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==47) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:284:96: '*'
                    {
                    char_literal180=(Token)match(input,47,FOLLOW_47_in_type_declaration1492);  
                    stream_47.add(char_literal180);


                    }
                    break;

            }


            // AST REWRITE
            // elements: generic, type_dec, 47
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 284:101: -> ^( TYPE type_dec ( generic )? ( '*' )? )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:284:104: ^( TYPE type_dec ( generic )? ( '*' )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TYPE, "TYPE")
                , root_1);

                adaptor.addChild(root_1, stream_type_dec.nextTree());

                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:284:120: ( generic )?
                if ( stream_generic.hasNext() ) {
                    adaptor.addChild(root_1, stream_generic.nextTree());

                }
                stream_generic.reset();

                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:284:129: ( '*' )?
                if ( stream_47.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_47.nextNode()
                    );

                }
                stream_47.reset();

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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:286:1: type_dec : type_dec_internal ( '[' ']' )* ;
    public final ObjchParser.type_dec_return type_dec() throws RecognitionException {
        ObjchParser.type_dec_return retval = new ObjchParser.type_dec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal182=null;
        Token char_literal183=null;
        ObjchParser.type_dec_internal_return type_dec_internal181 =null;


        Object char_literal182_tree=null;
        Object char_literal183_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:286:9: ( type_dec_internal ( '[' ']' )* )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:286:11: type_dec_internal ( '[' ']' )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_dec_internal_in_type_dec1515);
            type_dec_internal181=type_dec_internal();

            state._fsp--;

            adaptor.addChild(root_0, type_dec_internal181.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:286:29: ( '[' ']' )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==68) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:286:30: '[' ']'
            	    {
            	    char_literal182=(Token)match(input,68,FOLLOW_68_in_type_dec1518); 
            	    char_literal182_tree = 
            	    (Object)adaptor.create(char_literal182)
            	    ;
            	    adaptor.addChild(root_0, char_literal182_tree);


            	    char_literal183=(Token)match(input,69,FOLLOW_69_in_type_dec1520); 
            	    char_literal183_tree = 
            	    (Object)adaptor.create(char_literal183)
            	    ;
            	    adaptor.addChild(root_0, char_literal183_tree);


            	    }
            	    break;

            	default :
            	    break loop62;
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:289:1: type_dec_internal : ( knownTypes | ID );
    public final ObjchParser.type_dec_internal_return type_dec_internal() throws RecognitionException {
        ObjchParser.type_dec_internal_return retval = new ObjchParser.type_dec_internal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID185=null;
        ObjchParser.knownTypes_return knownTypes184 =null;


        Object ID185_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:290:2: ( knownTypes | ID )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0 >= 74 && LA63_0 <= 75)) ) {
                alt63=1;
            }
            else if ( (LA63_0==ID) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;

            }
            switch (alt63) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:290:4: knownTypes
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_knownTypes_in_type_dec_internal1534);
                    knownTypes184=knownTypes();

                    state._fsp--;

                    adaptor.addChild(root_0, knownTypes184.getTree());

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:291:5: ID
                    {
                    root_0 = (Object)adaptor.nil();


                    ID185=(Token)match(input,ID,FOLLOW_ID_in_type_dec_internal1541); 
                    ID185_tree = 
                    (Object)adaptor.create(ID185)
                    ;
                    adaptor.addChild(root_0, ID185_tree);


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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:294:1: knownTypes : ( 'int' | ( 'long' )+ ( 'int' )? );
    public final ObjchParser.knownTypes_return knownTypes() throws RecognitionException {
        ObjchParser.knownTypes_return retval = new ObjchParser.knownTypes_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal186=null;
        Token string_literal187=null;
        Token string_literal188=null;

        Object string_literal186_tree=null;
        Object string_literal187_tree=null;
        Object string_literal188_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:295:2: ( 'int' | ( 'long' )+ ( 'int' )? )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==74) ) {
                alt66=1;
            }
            else if ( (LA66_0==75) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;

            }
            switch (alt66) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:295:4: 'int'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal186=(Token)match(input,74,FOLLOW_74_in_knownTypes1552); 
                    string_literal186_tree = 
                    (Object)adaptor.create(string_literal186)
                    ;
                    adaptor.addChild(root_0, string_literal186_tree);


                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:296:4: ( 'long' )+ ( 'int' )?
                    {
                    root_0 = (Object)adaptor.nil();


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:296:4: ( 'long' )+
                    int cnt64=0;
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==75) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:296:4: 'long'
                    	    {
                    	    string_literal187=(Token)match(input,75,FOLLOW_75_in_knownTypes1557); 
                    	    string_literal187_tree = 
                    	    (Object)adaptor.create(string_literal187)
                    	    ;
                    	    adaptor.addChild(root_0, string_literal187_tree);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt64 >= 1 ) break loop64;
                                EarlyExitException eee =
                                    new EarlyExitException(64, input);
                                throw eee;
                        }
                        cnt64++;
                    } while (true);


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:296:12: ( 'int' )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==74) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:296:12: 'int'
                            {
                            string_literal188=(Token)match(input,74,FOLLOW_74_in_knownTypes1560); 
                            string_literal188_tree = 
                            (Object)adaptor.create(string_literal188)
                            ;
                            adaptor.addChild(root_0, string_literal188_tree);


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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:299:1: field_name : ID ( array_size )? ( field_crap )? -> ^( FIELD_NAME ID ( array_size )? ) ;
    public final ObjchParser.field_name_return field_name() throws RecognitionException {
        ObjchParser.field_name_return retval = new ObjchParser.field_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID189=null;
        ObjchParser.array_size_return array_size190 =null;

        ObjchParser.field_crap_return field_crap191 =null;


        Object ID189_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_array_size=new RewriteRuleSubtreeStream(adaptor,"rule array_size");
        RewriteRuleSubtreeStream stream_field_crap=new RewriteRuleSubtreeStream(adaptor,"rule field_crap");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:300:2: ( ID ( array_size )? ( field_crap )? -> ^( FIELD_NAME ID ( array_size )? ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:300:4: ID ( array_size )? ( field_crap )?
            {
            ID189=(Token)match(input,ID,FOLLOW_ID_in_field_name1573);  
            stream_ID.add(ID189);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:300:7: ( array_size )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==68) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:300:7: array_size
                    {
                    pushFollow(FOLLOW_array_size_in_field_name1575);
                    array_size190=array_size();

                    state._fsp--;

                    stream_array_size.add(array_size190.getTree());

                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:300:19: ( field_crap )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==51) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:300:20: field_crap
                    {
                    pushFollow(FOLLOW_field_crap_in_field_name1579);
                    field_crap191=field_crap();

                    state._fsp--;

                    stream_field_crap.add(field_crap191.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: ID, array_size
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 300:33: -> ^( FIELD_NAME ID ( array_size )? )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:300:36: ^( FIELD_NAME ID ( array_size )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FIELD_NAME, "FIELD_NAME")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:300:52: ( array_size )?
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:302:1: array_size : '[' ( NUMBER )? ']' ;
    public final ObjchParser.array_size_return array_size() throws RecognitionException {
        ObjchParser.array_size_return retval = new ObjchParser.array_size_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal192=null;
        Token NUMBER193=null;
        Token char_literal194=null;

        Object char_literal192_tree=null;
        Object NUMBER193_tree=null;
        Object char_literal194_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:303:2: ( '[' ( NUMBER )? ']' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:303:4: '[' ( NUMBER )? ']'
            {
            root_0 = (Object)adaptor.nil();


            char_literal192=(Token)match(input,68,FOLLOW_68_in_array_size1604); 
            char_literal192_tree = 
            (Object)adaptor.create(char_literal192)
            ;
            adaptor.addChild(root_0, char_literal192_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:303:8: ( NUMBER )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==NUMBER) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:303:8: NUMBER
                    {
                    NUMBER193=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_array_size1606); 
                    NUMBER193_tree = 
                    (Object)adaptor.create(NUMBER193)
                    ;
                    adaptor.addChild(root_0, NUMBER193_tree);


                    }
                    break;

            }


            char_literal194=(Token)match(input,69,FOLLOW_69_in_array_size1609); 
            char_literal194_tree = 
            (Object)adaptor.create(char_literal194)
            ;
            adaptor.addChild(root_0, char_literal194_tree);


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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:305:1: field_crap : ':' NUMBER ;
    public final ObjchParser.field_crap_return field_crap() throws RecognitionException {
        ObjchParser.field_crap_return retval = new ObjchParser.field_crap_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal195=null;
        Token NUMBER196=null;

        Object char_literal195_tree=null;
        Object NUMBER196_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:306:2: ( ':' NUMBER )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:306:4: ':' NUMBER
            {
            root_0 = (Object)adaptor.nil();


            char_literal195=(Token)match(input,51,FOLLOW_51_in_field_crap1618); 
            char_literal195_tree = 
            (Object)adaptor.create(char_literal195)
            ;
            adaptor.addChild(root_0, char_literal195_tree);


            NUMBER196=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_field_crap1620); 
            NUMBER196_tree = 
            (Object)adaptor.create(NUMBER196)
            ;
            adaptor.addChild(root_0, NUMBER196_tree);


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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:308:1: method_declaration : method_modifier_wrapper method_declaration_variants ;
    public final ObjchParser.method_declaration_return method_declaration() throws RecognitionException {
        ObjchParser.method_declaration_return retval = new ObjchParser.method_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.method_modifier_wrapper_return method_modifier_wrapper197 =null;

        ObjchParser.method_declaration_variants_return method_declaration_variants198 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:309:2: ( method_modifier_wrapper method_declaration_variants )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:309:4: method_modifier_wrapper method_declaration_variants
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_method_modifier_wrapper_in_method_declaration1630);
            method_modifier_wrapper197=method_modifier_wrapper();

            state._fsp--;

            adaptor.addChild(root_0, method_modifier_wrapper197.getTree());

            pushFollow(FOLLOW_method_declaration_variants_in_method_declaration1632);
            method_declaration_variants198=method_declaration_variants();

            state._fsp--;

            adaptor.addChild(root_0, method_declaration_variants198.getTree());

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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:311:1: method_modifier_wrapper : method_modifier -> ^( MODIFIER method_modifier ) ;
    public final ObjchParser.method_modifier_wrapper_return method_modifier_wrapper() throws RecognitionException {
        ObjchParser.method_modifier_wrapper_return retval = new ObjchParser.method_modifier_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.method_modifier_return method_modifier199 =null;


        RewriteRuleSubtreeStream stream_method_modifier=new RewriteRuleSubtreeStream(adaptor,"rule method_modifier");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:312:2: ( method_modifier -> ^( MODIFIER method_modifier ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:312:4: method_modifier
            {
            pushFollow(FOLLOW_method_modifier_in_method_modifier_wrapper1642);
            method_modifier199=method_modifier();

            state._fsp--;

            stream_method_modifier.add(method_modifier199.getTree());

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
            // 312:20: -> ^( MODIFIER method_modifier )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:312:23: ^( MODIFIER method_modifier )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:314:1: method_modifier : ( '+' | '-' );
    public final ObjchParser.method_modifier_return method_modifier() throws RecognitionException {
        ObjchParser.method_modifier_return retval = new ObjchParser.method_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set200=null;

        Object set200_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:315:2: ( '+' | '-' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:
            {
            root_0 = (Object)adaptor.nil();


            set200=(Token)input.LT(1);

            if ( input.LA(1)==48||input.LA(1)==50 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set200)
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:317:1: method_declaration_variants : ( init_declaration_wrapper | method_declaration_common );
    public final ObjchParser.method_declaration_variants_return method_declaration_variants() throws RecognitionException {
        ObjchParser.method_declaration_variants_return retval = new ObjchParser.method_declaration_variants_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.init_declaration_wrapper_return init_declaration_wrapper201 =null;

        ObjchParser.method_declaration_common_return method_declaration_common202 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:318:2: ( init_declaration_wrapper | method_declaration_common )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==73) ) {
                alt70=1;
            }
            else if ( (LA70_0==45) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;

            }
            switch (alt70) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:318:4: init_declaration_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_init_declaration_wrapper_in_method_declaration_variants1674);
                    init_declaration_wrapper201=init_declaration_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, init_declaration_wrapper201.getTree());

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:319:5: method_declaration_common
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_method_declaration_common_in_method_declaration_variants1681);
                    method_declaration_common202=method_declaration_common();

                    state._fsp--;

                    adaptor.addChild(root_0, method_declaration_common202.getTree());

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
    // $ANTLR end "method_declaration_variants"


    public static class method_declaration_common_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "method_declaration_common"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:321:1: method_declaration_common : '(' type_declaration ')' method_name ( method_params )? ';' ;
    public final ObjchParser.method_declaration_common_return method_declaration_common() throws RecognitionException {
        ObjchParser.method_declaration_common_return retval = new ObjchParser.method_declaration_common_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal203=null;
        Token char_literal205=null;
        Token char_literal208=null;
        ObjchParser.type_declaration_return type_declaration204 =null;

        ObjchParser.method_name_return method_name206 =null;

        ObjchParser.method_params_return method_params207 =null;


        Object char_literal203_tree=null;
        Object char_literal205_tree=null;
        Object char_literal208_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:322:2: ( '(' type_declaration ')' method_name ( method_params )? ';' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:322:4: '(' type_declaration ')' method_name ( method_params )? ';'
            {
            root_0 = (Object)adaptor.nil();


            char_literal203=(Token)match(input,45,FOLLOW_45_in_method_declaration_common1691); 
            char_literal203_tree = 
            (Object)adaptor.create(char_literal203)
            ;
            adaptor.addChild(root_0, char_literal203_tree);


            pushFollow(FOLLOW_type_declaration_in_method_declaration_common1693);
            type_declaration204=type_declaration();

            state._fsp--;

            adaptor.addChild(root_0, type_declaration204.getTree());

            char_literal205=(Token)match(input,46,FOLLOW_46_in_method_declaration_common1695); 
            char_literal205_tree = 
            (Object)adaptor.create(char_literal205)
            ;
            adaptor.addChild(root_0, char_literal205_tree);


            pushFollow(FOLLOW_method_name_in_method_declaration_common1697);
            method_name206=method_name();

            state._fsp--;

            adaptor.addChild(root_0, method_name206.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:322:41: ( method_params )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==ID||LA71_0==51) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:322:41: method_params
                    {
                    pushFollow(FOLLOW_method_params_in_method_declaration_common1699);
                    method_params207=method_params();

                    state._fsp--;

                    adaptor.addChild(root_0, method_params207.getTree());

                    }
                    break;

            }


            char_literal208=(Token)match(input,52,FOLLOW_52_in_method_declaration_common1702); 
            char_literal208_tree = 
            (Object)adaptor.create(char_literal208)
            ;
            adaptor.addChild(root_0, char_literal208_tree);


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


    public static class init_declaration_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "init_declaration_wrapper"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:324:1: init_declaration_wrapper : init_declaration -> ^( INIT_DECLARATION init_declaration ) ;
    public final ObjchParser.init_declaration_wrapper_return init_declaration_wrapper() throws RecognitionException {
        ObjchParser.init_declaration_wrapper_return retval = new ObjchParser.init_declaration_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.init_declaration_return init_declaration209 =null;


        RewriteRuleSubtreeStream stream_init_declaration=new RewriteRuleSubtreeStream(adaptor,"rule init_declaration");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:325:2: ( init_declaration -> ^( INIT_DECLARATION init_declaration ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:325:4: init_declaration
            {
            pushFollow(FOLLOW_init_declaration_in_init_declaration_wrapper1712);
            init_declaration209=init_declaration();

            state._fsp--;

            stream_init_declaration.add(init_declaration209.getTree());

            // AST REWRITE
            // elements: init_declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 325:21: -> ^( INIT_DECLARATION init_declaration )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:325:24: ^( INIT_DECLARATION init_declaration )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INIT_DECLARATION, "INIT_DECLARATION")
                , root_1);

                adaptor.addChild(root_1, stream_init_declaration.nextTree());

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
    // $ANTLR end "init_declaration_wrapper"


    public static class init_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "init_declaration"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:327:1: init_declaration : init_name ( method_params )? ';' ;
    public final ObjchParser.init_declaration_return init_declaration() throws RecognitionException {
        ObjchParser.init_declaration_return retval = new ObjchParser.init_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal212=null;
        ObjchParser.init_name_return init_name210 =null;

        ObjchParser.method_params_return method_params211 =null;


        Object char_literal212_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:328:2: ( init_name ( method_params )? ';' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:328:4: init_name ( method_params )? ';'
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_init_name_in_init_declaration1730);
            init_name210=init_name();

            state._fsp--;

            adaptor.addChild(root_0, init_name210.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:328:14: ( method_params )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==ID||LA72_0==51) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:328:14: method_params
                    {
                    pushFollow(FOLLOW_method_params_in_init_declaration1732);
                    method_params211=method_params();

                    state._fsp--;

                    adaptor.addChild(root_0, method_params211.getTree());

                    }
                    break;

            }


            char_literal212=(Token)match(input,52,FOLLOW_52_in_init_declaration1735); 
            char_literal212_tree = 
            (Object)adaptor.create(char_literal212)
            ;
            adaptor.addChild(root_0, char_literal212_tree);


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
    // $ANTLR end "init_declaration"


    public static class init_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "init_name"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:331:1: init_name : init_variants -> ^( METHOD_NAME init_variants ) ;
    public final ObjchParser.init_name_return init_name() throws RecognitionException {
        ObjchParser.init_name_return retval = new ObjchParser.init_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.init_variants_return init_variants213 =null;


        RewriteRuleSubtreeStream stream_init_variants=new RewriteRuleSubtreeStream(adaptor,"rule init_variants");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:332:2: ( init_variants -> ^( METHOD_NAME init_variants ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:332:4: init_variants
            {
            pushFollow(FOLLOW_init_variants_in_init_name1746);
            init_variants213=init_variants();

            state._fsp--;

            stream_init_variants.add(init_variants213.getTree());

            // AST REWRITE
            // elements: init_variants
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 332:18: -> ^( METHOD_NAME init_variants )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:332:21: ^( METHOD_NAME init_variants )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(METHOD_NAME, "METHOD_NAME")
                , root_1);

                adaptor.addChild(root_1, stream_init_variants.nextTree());

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
    // $ANTLR end "init_name"


    public static class init_variants_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "init_variants"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:334:1: init_variants : 'initWithType' ;
    public final ObjchParser.init_variants_return init_variants() throws RecognitionException {
        ObjchParser.init_variants_return retval = new ObjchParser.init_variants_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal214=null;

        Object string_literal214_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:335:2: ( 'initWithType' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:335:4: 'initWithType'
            {
            root_0 = (Object)adaptor.nil();


            string_literal214=(Token)match(input,73,FOLLOW_73_in_init_variants1764); 
            string_literal214_tree = 
            (Object)adaptor.create(string_literal214)
            ;
            adaptor.addChild(root_0, string_literal214_tree);


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
    // $ANTLR end "init_variants"


    public static class method_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "method_name"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:338:1: method_name : ( ID -> ^( METHOD_NAME ID ) | init_variants -> ^( METHOD_NAME ID ) );
    public final ObjchParser.method_name_return method_name() throws RecognitionException {
        ObjchParser.method_name_return retval = new ObjchParser.method_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID215=null;
        ObjchParser.init_variants_return init_variants216 =null;


        Object ID215_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_init_variants=new RewriteRuleSubtreeStream(adaptor,"rule init_variants");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:339:2: ( ID -> ^( METHOD_NAME ID ) | init_variants -> ^( METHOD_NAME ID ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==ID) ) {
                alt73=1;
            }
            else if ( (LA73_0==73) ) {
                alt73=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;

            }
            switch (alt73) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:339:4: ID
                    {
                    ID215=(Token)match(input,ID,FOLLOW_ID_in_method_name1777);  
                    stream_ID.add(ID215);


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
                    // 339:7: -> ^( METHOD_NAME ID )
                    {
                        // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:339:10: ^( METHOD_NAME ID )
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
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:340:4: init_variants
                    {
                    pushFollow(FOLLOW_init_variants_in_method_name1790);
                    init_variants216=init_variants();

                    state._fsp--;

                    stream_init_variants.add(init_variants216.getTree());

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 340:18: -> ^( METHOD_NAME ID )
                    {
                        // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:340:21: ^( METHOD_NAME ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(METHOD_NAME, "METHOD_NAME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        (Object)adaptor.create(ID, "ID")
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
    // $ANTLR end "method_name"


    public static class method_params_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "method_params"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:342:1: method_params : ( method_param )+ -> ^( METHOD_PARAMS ( method_param )+ ) ;
    public final ObjchParser.method_params_return method_params() throws RecognitionException {
        ObjchParser.method_params_return retval = new ObjchParser.method_params_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.method_param_return method_param217 =null;


        RewriteRuleSubtreeStream stream_method_param=new RewriteRuleSubtreeStream(adaptor,"rule method_param");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:343:2: ( ( method_param )+ -> ^( METHOD_PARAMS ( method_param )+ ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:343:4: ( method_param )+
            {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:343:4: ( method_param )+
            int cnt74=0;
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==ID||LA74_0==51) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:343:4: method_param
            	    {
            	    pushFollow(FOLLOW_method_param_in_method_params1808);
            	    method_param217=method_param();

            	    state._fsp--;

            	    stream_method_param.add(method_param217.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt74 >= 1 ) break loop74;
                        EarlyExitException eee =
                            new EarlyExitException(74, input);
                        throw eee;
                }
                cnt74++;
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
            // 343:18: -> ^( METHOD_PARAMS ( method_param )+ )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:343:21: ^( METHOD_PARAMS ( method_param )+ )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:345:1: method_param : ( prefix )? ':' ( '(' type_declaration ')' )? param_name -> ^( METHOD_PARAM ( prefix )? ':' '(' type_declaration ')' param_name ) ;
    public final ObjchParser.method_param_return method_param() throws RecognitionException {
        ObjchParser.method_param_return retval = new ObjchParser.method_param_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal219=null;
        Token char_literal220=null;
        Token char_literal222=null;
        ObjchParser.prefix_return prefix218 =null;

        ObjchParser.type_declaration_return type_declaration221 =null;

        ObjchParser.param_name_return param_name223 =null;


        Object char_literal219_tree=null;
        Object char_literal220_tree=null;
        Object char_literal222_tree=null;
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleSubtreeStream stream_prefix=new RewriteRuleSubtreeStream(adaptor,"rule prefix");
        RewriteRuleSubtreeStream stream_param_name=new RewriteRuleSubtreeStream(adaptor,"rule param_name");
        RewriteRuleSubtreeStream stream_type_declaration=new RewriteRuleSubtreeStream(adaptor,"rule type_declaration");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:346:2: ( ( prefix )? ':' ( '(' type_declaration ')' )? param_name -> ^( METHOD_PARAM ( prefix )? ':' '(' type_declaration ')' param_name ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:346:4: ( prefix )? ':' ( '(' type_declaration ')' )? param_name
            {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:346:4: ( prefix )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==ID) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:346:4: prefix
                    {
                    pushFollow(FOLLOW_prefix_in_method_param1827);
                    prefix218=prefix();

                    state._fsp--;

                    stream_prefix.add(prefix218.getTree());

                    }
                    break;

            }


            char_literal219=(Token)match(input,51,FOLLOW_51_in_method_param1830);  
            stream_51.add(char_literal219);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:346:16: ( '(' type_declaration ')' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==45) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:346:17: '(' type_declaration ')'
                    {
                    char_literal220=(Token)match(input,45,FOLLOW_45_in_method_param1833);  
                    stream_45.add(char_literal220);


                    pushFollow(FOLLOW_type_declaration_in_method_param1835);
                    type_declaration221=type_declaration();

                    state._fsp--;

                    stream_type_declaration.add(type_declaration221.getTree());

                    char_literal222=(Token)match(input,46,FOLLOW_46_in_method_param1837);  
                    stream_46.add(char_literal222);


                    }
                    break;

            }


            pushFollow(FOLLOW_param_name_in_method_param1841);
            param_name223=param_name();

            state._fsp--;

            stream_param_name.add(param_name223.getTree());

            // AST REWRITE
            // elements: 51, param_name, type_declaration, 45, 46, prefix
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 346:55: -> ^( METHOD_PARAM ( prefix )? ':' '(' type_declaration ')' param_name )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:346:58: ^( METHOD_PARAM ( prefix )? ':' '(' type_declaration ')' param_name )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(METHOD_PARAM, "METHOD_PARAM")
                , root_1);

                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:346:73: ( prefix )?
                if ( stream_prefix.hasNext() ) {
                    adaptor.addChild(root_1, stream_prefix.nextTree());

                }
                stream_prefix.reset();

                adaptor.addChild(root_1, 
                stream_51.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_45.nextNode()
                );

                adaptor.addChild(root_1, stream_type_declaration.nextTree());

                adaptor.addChild(root_1, 
                stream_46.nextNode()
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:348:1: param_name : ID -> ^( PARAM_NAME ID ) ;
    public final ObjchParser.param_name_return param_name() throws RecognitionException {
        ObjchParser.param_name_return retval = new ObjchParser.param_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID224=null;

        Object ID224_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:349:2: ( ID -> ^( PARAM_NAME ID ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:349:4: ID
            {
            ID224=(Token)match(input,ID,FOLLOW_ID_in_param_name1871);  
            stream_ID.add(ID224);


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
            // 349:7: -> ^( PARAM_NAME ID )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:349:10: ^( PARAM_NAME ID )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:351:1: prefix : ID -> ^( PARAM_PREFIX ID ) ;
    public final ObjchParser.prefix_return prefix() throws RecognitionException {
        ObjchParser.prefix_return retval = new ObjchParser.prefix_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID225=null;

        Object ID225_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:351:8: ( ID -> ^( PARAM_PREFIX ID ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:351:10: ID
            {
            ID225=(Token)match(input,ID,FOLLOW_ID_in_prefix1888);  
            stream_ID.add(ID225);


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
            // 351:13: -> ^( PARAM_PREFIX ID )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:351:16: ^( PARAM_PREFIX ID )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:353:1: extern_declatation : 'extern' field_declaration ;
    public final ObjchParser.extern_declatation_return extern_declatation() throws RecognitionException {
        ObjchParser.extern_declatation_return retval = new ObjchParser.extern_declatation_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal226=null;
        ObjchParser.field_declaration_return field_declaration227 =null;


        Object string_literal226_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:354:2: ( 'extern' field_declaration )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:354:4: 'extern' field_declaration
            {
            root_0 = (Object)adaptor.nil();


            string_literal226=(Token)match(input,72,FOLLOW_72_in_extern_declatation1905); 
            string_literal226_tree = 
            (Object)adaptor.create(string_literal226)
            ;
            adaptor.addChild(root_0, string_literal226_tree);


            pushFollow(FOLLOW_field_declaration_in_extern_declatation1907);
            field_declaration227=field_declaration();

            state._fsp--;

            adaptor.addChild(root_0, field_declaration227.getTree());

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
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA57 dfa57 = new DFA57(this);
    static final String DFA2_eotS =
        "\u0085\uffff";
    static final String DFA2_eofS =
        "\22\uffff\1\21\21\uffff\1\21\1\136\137\uffff";
    static final String DFA2_minS =
        "\1\15\1\uffff\2\15\3\uffff\1\15\12\uffff\2\15\4\uffff\1\15\6\uffff"+
        "\1\15\4\uffff\2\15\15\uffff\1\15\6\uffff\1\15\112\uffff";
    static final String DFA2_maxS =
        "\1\123\1\uffff\1\123\1\124\3\uffff\1\124\12\uffff\1\123\1\124\4"+
        "\uffff\1\124\6\uffff\1\124\4\uffff\2\123\15\uffff\1\123\6\uffff"+
        "\1\124\112\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\2\uffff\1\4\1\5\1\6\1\uffff\1\10\10\uffff\1\2\7\uffff"+
        "\1\3\6\uffff\1\7\52\uffff\1\2\22\uffff\1\2\21\uffff\1\2\13\uffff"+
        "\1\2\10\uffff";
    static final String DFA2_specialS =
        "\u0085\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\10\42\uffff\1\10\1\uffff\1\10\7\uffff\1\1\1\uffff\1\5\1\10"+
            "\1\uffff\1\10\1\uffff\1\4\1\uffff\1\10\2\uffff\1\10\1\3\1\6"+
            "\1\uffff\2\10\4\uffff\1\7\1\2\1\uffff\1\10",
            "",
            "\1\22\71\uffff\1\21\2\uffff\2\10\4\uffff\1\23\1\uffff\1\21"+
            "\1\10",
            "\1\30\74\uffff\2\10\4\uffff\2\10\1\uffff\1\10\1\31",
            "",
            "",
            "",
            "\1\37\74\uffff\2\10\7\uffff\1\10\1\40",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\45\37\uffff\1\21\1\uffff\1\44\1\21\1\uffff\1\21\1\uffff"+
            "\1\21\1\10\4\uffff\1\21\1\uffff\2\21\1\uffff\1\21\1\uffff\1"+
            "\21\1\uffff\1\21\1\10\1\uffff\1\63\2\21\1\uffff\2\21\4\uffff"+
            "\2\21\1\uffff\1\21",
            "\1\72\74\uffff\2\10\7\uffff\1\10\1\21",
            "",
            "",
            "",
            "",
            "\1\10\41\uffff\1\10\5\uffff\1\10\16\uffff\1\10\1\uffff\1\10"+
            "\15\uffff\1\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\10\41\uffff\1\10\5\uffff\1\10\16\uffff\1\10\1\uffff\1\10"+
            "\15\uffff\1\40",
            "",
            "",
            "",
            "",
            "\1\113\37\uffff\1\21\2\uffff\1\21\1\uffff\1\21\1\uffff\1\21"+
            "\5\uffff\1\21\1\uffff\2\21\1\uffff\1\21\1\uffff\1\21\1\uffff"+
            "\1\21\2\uffff\3\21\1\uffff\2\21\4\uffff\2\21\1\uffff\1\21",
            "\1\136\37\uffff\1\10\1\uffff\2\136\1\10\1\136\1\10\2\136\4"+
            "\uffff\1\136\1\uffff\2\136\1\uffff\1\136\1\uffff\1\136\1\uffff"+
            "\1\136\1\160\1\uffff\3\136\1\uffff\2\136\4\uffff\2\136\1\uffff"+
            "\1\136",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\174\41\uffff\1\10\5\uffff\1\10\21\uffff\1\136\2\uffff\2"+
            "\136\4\uffff\2\136\1\uffff\1\136",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\10\41\uffff\1\10\5\uffff\1\10\16\uffff\1\10\1\uffff\1\10"+
            "\15\uffff\1\136",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "57:1: code_internal : ( class_declaration | typedef_declaration_wrapper | enum_wrapper | protocol_declaration_wrapper | interface_declaration_wrapper | extern_declarations | typedef_struct | declarations );";
        }
    }
    static final String DFA11_eotS =
        "\106\uffff";
    static final String DFA11_eofS =
        "\1\3\1\24\104\uffff";
    static final String DFA11_minS =
        "\2\15\36\uffff\1\15\3\uffff\1\15\12\uffff\1\15\2\uffff\1\32\23\uffff";
    static final String DFA11_maxS =
        "\2\123\36\uffff\1\123\3\uffff\1\106\12\uffff\1\106\2\uffff\1\105"+
        "\23\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\2\1\3\20\uffff\1\1\46\uffff\1\1\10\uffff\1\1\1\uffff";
    static final String DFA11_specialS =
        "\106\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\1\37\uffff\1\2\2\uffff\1\3\1\uffff\1\3\1\uffff\1\3\5\uffff"+
            "\1\3\1\uffff\2\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\2\uffff"+
            "\3\3\1\uffff\2\3\4\uffff\2\3\1\uffff\1\3",
            "\1\44\41\uffff\1\3\1\24\1\uffff\1\24\1\uffff\1\24\1\3\4\uffff"+
            "\1\24\1\uffff\2\24\1\uffff\1\24\1\uffff\1\24\1\uffff\1\24\1"+
            "\3\1\uffff\1\40\2\24\1\uffff\2\24\4\uffff\2\24\1\uffff\1\24",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\57\41\uffff\1\3\5\uffff\1\3\21\uffff\1\24\2\uffff\2\24\4"+
            "\uffff\2\24\1\uffff\1\24",
            "",
            "",
            "",
            "\1\24\37\uffff\1\3\1\uffff\1\24\1\uffff\1\3\1\uffff\2\3\1\24"+
            "\16\uffff\1\62\1\uffff\1\24",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\24\37\uffff\1\3\1\uffff\1\24\1\uffff\1\3\1\uffff\2\3\1\24"+
            "\16\uffff\1\73\1\uffff\1\24",
            "",
            "",
            "\1\3\52\uffff\1\104",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "111:31: ( typedef_name | func_pointer )?";
        }
    }
    static final String DFA57_eotS =
        "\144\uffff";
    static final String DFA57_eofS =
        "\144\uffff";
    static final String DFA57_minS =
        "\1\15\2\uffff\1\15\6\uffff\1\32\4\uffff\1\15\1\uffff\1\15\3\uffff"+
        "\1\15\1\uffff\10\15\105\uffff";
    static final String DFA57_maxS =
        "\1\113\2\uffff\1\106\6\uffff\1\105\4\uffff\1\123\1\uffff\1\111\3"+
        "\uffff\1\106\1\uffff\4\123\1\113\1\106\1\113\1\106\105\uffff";
    static final String DFA57_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\41\uffff\1\1\1\uffff\2\1\3\uffff\34\1\2"+
        "\uffff\4\1\3\uffff\5\1\2\uffff\1\1\1\uffff\4\1\1\uffff\1\1\3\uffff";
    static final String DFA57_specialS =
        "\144\uffff}>";
    static final String[] DFA57_transitionS = {
            "\1\3\40\uffff\2\4\1\uffff\1\4\3\uffff\1\4\2\uffff\1\4\15\uffff"+
            "\1\4\3\uffff\2\1",
            "",
            "",
            "\1\1\37\uffff\1\4\1\21\1\1\1\uffff\1\17\1\uffff\2\4\1\1\2\uffff"+
            "\1\1\13\uffff\1\12\1\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\4\52\uffff\1\25",
            "",
            "",
            "",
            "",
            "\1\36\70\uffff\1\27\1\30\2\uffff\1\34\1\35\4\uffff\1\32\1\31"+
            "\1\uffff\1\33",
            "",
            "\1\1\46\uffff\1\4\24\uffff\1\1",
            "",
            "",
            "",
            "\1\1\37\uffff\1\4\1\50\1\1\1\uffff\1\46\1\uffff\2\4\1\1\2\uffff"+
            "\1\1\13\uffff\1\51\1\uffff\1\1",
            "",
            "\1\63\71\uffff\1\55\2\uffff\1\61\1\62\4\uffff\1\57\1\56\1\uffff"+
            "\1\60",
            "\1\71\74\uffff\1\67\1\70\4\uffff\1\65\1\64\1\uffff\1\66",
            "\1\76\74\uffff\1\74\1\75\4\uffff\1\72\2\uffff\1\73",
            "\1\102\74\uffff\1\100\1\101\7\uffff\1\77",
            "\1\105\41\uffff\1\110\1\uffff\1\1\3\uffff\1\107\2\uffff\1\1"+
            "\15\uffff\1\106\3\uffff\1\103\1\104",
            "\1\4\41\uffff\1\116\1\uffff\1\1\3\uffff\1\115\2\uffff\1\1\13"+
            "\uffff\1\113\1\uffff\1\114",
            "\1\4\41\uffff\1\126\1\uffff\1\1\3\uffff\1\125\2\uffff\1\1\13"+
            "\uffff\1\123\1\uffff\1\124\3\uffff\1\122\1\131",
            "\1\4\41\uffff\1\136\1\uffff\1\140\1\uffff\2\4\1\135\2\uffff"+
            "\1\1\13\uffff\1\133\1\uffff\1\134",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
    static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
    static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars(DFA57_minS);
    static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars(DFA57_maxS);
    static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
    static final short[] DFA57_special = DFA.unpackEncodedString(DFA57_specialS);
    static final short[][] DFA57_transition;

    static {
        int numStates = DFA57_transitionS.length;
        DFA57_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
        }
    }

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = DFA57_eot;
            this.eof = DFA57_eof;
            this.min = DFA57_min;
            this.max = DFA57_max;
            this.accept = DFA57_accept;
            this.special = DFA57_special;
            this.transition = DFA57_transition;
        }
        public String getDescription() {
            return "284:55: ( type_dec )?";
        }
    }
 

    public static final BitSet FOLLOW_code_internal_in_code178 = new BitSet(new long[]{0xB405000000002002L,0x00000000000B0DCAL});
    public static final BitSet FOLLOW_class_declaration_in_code_internal191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_declaration_wrapper_in_code_internal198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_wrapper_in_code_internal205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protocol_declaration_wrapper_in_code_internal210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interface_declaration_wrapper_in_code_internal216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extern_declarations_in_code_internal222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_struct_in_code_internal227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_code_internal232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_declaration_in_enum_wrapper246 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_enum_wrapper248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extern_declatation_in_extern_declarations268 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_optional_prefix_in_declarations289 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_method_declaration_wrapper_in_declarations292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_prefix_in_declarations297 = new BitSet(new long[]{0x2000000000002000L,0x00000000000B0CC0L});
    public static final BitSet FOLLOW_optional_prefix_in_declarations300 = new BitSet(new long[]{0x0000000000002000L,0x00000000000B0CC0L});
    public static final BitSet FOLLOW_field_declaration_wrapper_in_declarations303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ns_inline_in_declarations308 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000000006FFFFFL});
    public static final BitSet FOLLOW_86_in_declarations318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_declaration_in_method_declaration_wrapper331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_declaration_in_field_declaration_wrapper349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_property_prefix367 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_property_prefix369 = new BitSet(new long[]{0x0000000000000000L,0x000000000000F000L});
    public static final BitSet FOLLOW_property_prefix_param_in_property_prefix371 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_49_in_property_prefix374 = new BitSet(new long[]{0x0000000000000000L,0x000000000000F000L});
    public static final BitSet FOLLOW_property_prefix_param_in_property_prefix376 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_property_prefix380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_optional_prefix391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ns_inline401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interface_declaration_in_interface_declaration_wrapper437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protocol_declaration_in_protocol_declaration_wrapper455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_declaration_in_typedef_declaration_wrapper472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_typedef_declaration489 = new BitSet(new long[]{0x0000000000002000L,0x0000000000050080L});
    public static final BitSet FOLLOW_typedef_internal_in_typedef_declaration491 = new BitSet(new long[]{0x0010200000002002L});
    public static final BitSet FOLLOW_typedef_name_in_typedef_declaration494 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_func_pointer_in_typedef_declaration498 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_typedef_declaration502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_func_pointer513 = new BitSet(new long[]{0x0000800000002000L});
    public static final BitSet FOLLOW_47_in_func_pointer515 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_func_pointer518 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_func_pointer520 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_func_pointer522 = new BitSet(new long[]{0x0000400000002000L});
    public static final BitSet FOLLOW_ID_in_func_pointer525 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_49_in_func_pointer528 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_func_pointer530 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_func_pointer536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_enum_wrapper2_in_typedef_internal548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_rename_in_typedef_internal555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_struct_wrapper_in_typedef_internal562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_union_declaration_wrapper_in_typedef_internal567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_union_declaration_in_union_declaration_wrapper579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_union_declaration598 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_union_declaration603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_typedef_struct_in_union_declaration608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000410000L});
    public static final BitSet FOLLOW_86_in_union_declaration613 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_union_name_in_union_declaration615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_declaration_wrapper_in_union_internal629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_struct_wrapper_in_union_internal634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_typedef_rename645 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_typedef_rename647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_declaration_in_typedef_enum_wrapper2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_enum_declaration690 = new BitSet(new long[]{0x0000000000002000L,0x0000000000100000L});
    public static final BitSet FOLLOW_struct_name_in_enum_declaration692 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_enum_declaration695 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_typedef_declaration_element_wrapper_in_enum_declaration697 = new BitSet(new long[]{0x0002000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_49_in_enum_declaration700 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_typedef_declaration_element_wrapper_in_enum_declaration702 = new BitSet(new long[]{0x0002000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_49_in_enum_declaration706 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_enum_declaration709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_struct_in_typedef_struct_wrapper720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_typedef_struct738 = new BitSet(new long[]{0x0000000000002000L,0x0000000000100000L});
    public static final BitSet FOLLOW_typedef_name_in_typedef_struct740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_typedef_struct745 = new BitSet(new long[]{0x0000000000002000L,0x00000000000B0CC0L});
    public static final BitSet FOLLOW_struct_field_wrapper_in_typedef_struct750 = new BitSet(new long[]{0x0000000000002000L,0x00000000004B0CC0L});
    public static final BitSet FOLLOW_86_in_typedef_struct755 = new BitSet(new long[]{0x0010000000002002L});
    public static final BitSet FOLLOW_struct_name_in_typedef_struct758 = new BitSet(new long[]{0x0012000000000002L});
    public static final BitSet FOLLOW_49_in_typedef_struct761 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_struct_name_in_typedef_struct763 = new BitSet(new long[]{0x0012000000000002L});
    public static final BitSet FOLLOW_52_in_typedef_struct769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_struct_name782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_field_in_struct_field_wrapper800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_field1_in_struct_field818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_field2_in_struct_field823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_declaration_in_struct_field1835 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_field_name_in_struct_field1837 = new BitSet(new long[]{0x0012000000000000L});
    public static final BitSet FOLLOW_49_in_struct_field1840 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_field_name_in_struct_field1842 = new BitSet(new long[]{0x0012000000000000L});
    public static final BitSet FOLLOW_52_in_struct_field1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_struct_in_struct_field2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_typedef_name867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_declaration_element_in_typedef_declaration_element_wrapper884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_typedef_declaration_element904 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_typedef_declaration_element907 = new BitSet(new long[]{0x0000200004002000L});
    public static final BitSet FOLLOW_element_value_in_typedef_declaration_element909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_expression_in_element_value923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_expression2_in_simple_expression944 = new BitSet(new long[]{0x0240180000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_op2_in_simple_expression948 = new BitSet(new long[]{0x0000200004002000L});
    public static final BitSet FOLLOW_simple_expression2_in_simple_expression950 = new BitSet(new long[]{0x0240180000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_simple_expression2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_simple_expression2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_simple_expression2974 = new BitSet(new long[]{0x0000200004002000L});
    public static final BitSet FOLLOW_simple_expression_in_simple_expression2976 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_simple_expression2978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_class_declaration1013 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_class_declaration1015 = new BitSet(new long[]{0x0012000000000000L});
    public static final BitSet FOLLOW_49_in_class_declaration1018 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_class_declaration1020 = new BitSet(new long[]{0x0012000000000000L});
    public static final BitSet FOLLOW_52_in_class_declaration1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_protocol_declaration1034 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_protocol_name_in_protocol_declaration1036 = new BitSet(new long[]{0xA835000000002000L,0x00000000000B0CC8L});
    public static final BitSet FOLLOW_generic_in_protocol_declaration1038 = new BitSet(new long[]{0xA815000000002000L,0x00000000000B0CC8L});
    public static final BitSet FOLLOW_protocol_end_in_protocol_declaration1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protocol_end1_in_protocol_end1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protocol_end2_in_protocol_end1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_protocol_end11070 = new BitSet(new long[]{0xA805000000002000L,0x00000000000B0CC8L});
    public static final BitSet FOLLOW_59_in_protocol_end11075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_protocol_end21087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_generic1100 = new BitSet(new long[]{0x0000000000002000L,0x00000000000B0CC0L});
    public static final BitSet FOLLOW_generic_internal_in_generic1102 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_generic1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_declaration_in_generic_internal1113 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_generic_internal1116 = new BitSet(new long[]{0x0000000000002000L,0x00000000000B0CC0L});
    public static final BitSet FOLLOW_type_declaration_in_generic_internal1118 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ID_in_protocol_name1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_interface_declaration1150 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_interface_name_in_interface_declaration1152 = new BitSet(new long[]{0xA80D000000002000L,0x00000000001B0CC8L});
    public static final BitSet FOLLOW_51_in_interface_declaration1155 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_superclass_name_in_interface_declaration1157 = new BitSet(new long[]{0xA805000000002000L,0x00000000001B0CC8L});
    public static final BitSet FOLLOW_interface_body_in_interface_declaration1162 = new BitSet(new long[]{0xA805000000002000L,0x00000000000B0CC8L});
    public static final BitSet FOLLOW_declarations_in_interface_declaration1166 = new BitSet(new long[]{0xA805000000002000L,0x00000000000B0CC8L});
    public static final BitSet FOLLOW_59_in_interface_declaration1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_interface_body1183 = new BitSet(new long[]{0x4000000000002000L,0x00000000004F0CC5L});
    public static final BitSet FOLLOW_interface_body_item_in_interface_body1187 = new BitSet(new long[]{0x4000000000002000L,0x00000000004F0CC5L});
    public static final BitSet FOLLOW_86_in_interface_body1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_group_modifier_wrapper_in_interface_body_item1203 = new BitSet(new long[]{0x0000000000002000L,0x00000000000B0CC0L});
    public static final BitSet FOLLOW_simple_fields_declaration_in_interface_body_item1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_union_declaration_wrapper_in_interface_body_item1211 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_interface_body_item1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_union_name1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_group_modifier_in_group_modifier_wrapper1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_interface_name1282 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_category_in_interface_name1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_category1303 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_category1305 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_category1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_superclass_name1324 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_generic_in_superclass_name1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fields_declarations_in_simple_fields_declaration1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_declaration_in_fields_declarations1366 = new BitSet(new long[]{0x0000000000002002L,0x00000000000B0CC0L});
    public static final BitSet FOLLOW_type_declaration_in_field_declaration1386 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_field_name_in_field_declaration1388 = new BitSet(new long[]{0x0012200000000000L});
    public static final BitSet FOLLOW_classical_method_params_in_field_declaration1391 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_49_in_field_declaration1396 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_field_name_in_field_declaration1398 = new BitSet(new long[]{0x0012000000000000L});
    public static final BitSet FOLLOW_52_in_field_declaration1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_classical_method_params1413 = new BitSet(new long[]{0x0000000000002000L,0x00000000000B0CC0L});
    public static final BitSet FOLLOW_classical_param_in_classical_method_params1415 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_49_in_classical_method_params1418 = new BitSet(new long[]{0x0000000000002000L,0x00000000000B0CC0L});
    public static final BitSet FOLLOW_classical_param_in_classical_method_params1420 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_46_in_classical_method_params1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_declaration_in_classical_param1437 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_classical_param1439 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_classical_param1442 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NUMBER_in_classical_param1444 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_classical_param1447 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_70_in_type_declaration1461 = new BitSet(new long[]{0x0000000000002000L,0x00000000000B0C80L});
    public static final BitSet FOLLOW_71_in_type_declaration1464 = new BitSet(new long[]{0x0000000000002000L,0x00000000000B0C00L});
    public static final BitSet FOLLOW_81_in_type_declaration1467 = new BitSet(new long[]{0x0000000000002000L,0x0000000000090C00L});
    public static final BitSet FOLLOW_80_in_type_declaration1470 = new BitSet(new long[]{0x0000000000002000L,0x0000000000080C00L});
    public static final BitSet FOLLOW_83_in_type_declaration1475 = new BitSet(new long[]{0x0020800000002002L,0x0000000000000C40L});
    public static final BitSet FOLLOW_type_dec_in_type_declaration1477 = new BitSet(new long[]{0x0020800000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_type_dec_in_type_declaration1483 = new BitSet(new long[]{0x0020800000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_type_declaration1486 = new BitSet(new long[]{0x0020800000000002L});
    public static final BitSet FOLLOW_generic_in_type_declaration1489 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_type_declaration1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_dec_internal_in_type_dec1515 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_type_dec1518 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_type_dec1520 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_knownTypes_in_type_dec_internal1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type_dec_internal1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_knownTypes1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_knownTypes1557 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_74_in_knownTypes1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_field_name1573 = new BitSet(new long[]{0x0008000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_array_size_in_field_name1575 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_field_crap_in_field_name1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_array_size1604 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NUMBER_in_array_size1606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_array_size1609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_field_crap1618 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_NUMBER_in_field_crap1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_modifier_wrapper_in_method_declaration1630 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_method_declaration_variants_in_method_declaration1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_modifier_in_method_modifier_wrapper1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_init_declaration_wrapper_in_method_declaration_variants1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_declaration_common_in_method_declaration_variants1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_method_declaration_common1691 = new BitSet(new long[]{0x0000000000002000L,0x00000000000B0CC0L});
    public static final BitSet FOLLOW_type_declaration_in_method_declaration_common1693 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_method_declaration_common1695 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000200L});
    public static final BitSet FOLLOW_method_name_in_method_declaration_common1697 = new BitSet(new long[]{0x0018000000002000L});
    public static final BitSet FOLLOW_method_params_in_method_declaration_common1699 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_method_declaration_common1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_init_declaration_in_init_declaration_wrapper1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_init_name_in_init_declaration1730 = new BitSet(new long[]{0x0018000000002000L});
    public static final BitSet FOLLOW_method_params_in_init_declaration1732 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_init_declaration1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_init_variants_in_init_name1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_init_variants1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_method_name1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_init_variants_in_method_name1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_param_in_method_params1808 = new BitSet(new long[]{0x0008000000002002L});
    public static final BitSet FOLLOW_prefix_in_method_param1827 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_method_param1830 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_45_in_method_param1833 = new BitSet(new long[]{0x0000000000002000L,0x00000000000B0CC0L});
    public static final BitSet FOLLOW_type_declaration_in_method_param1835 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_method_param1837 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_param_name_in_method_param1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param_name1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_prefix1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_extern_declatation1905 = new BitSet(new long[]{0x0000000000002000L,0x00000000000B0CC0L});
    public static final BitSet FOLLOW_field_declaration_in_extern_declatation1907 = new BitSet(new long[]{0x0000000000000002L});

}