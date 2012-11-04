// $ANTLR 3.4 C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g 2012-11-02 19:45:21

package ru.andremoniy.objctojavacnv.antlr.output;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ObjchParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARCHIVE_DECLARATION", "CATEGORY", "DIGIT", "ENUM", "EXTERN", "FIELD", "FIELDS", "FIELD_NAME", "FILE_NAME", "GROUP_MODIFIER", "ID", "INIT_DECLARATION", "INTERFACE", "INTERFACE_NAME", "LETTER", "METHOD", "METHOD_NAME", "METHOD_PARAM", "METHOD_PARAMS", "METHOD_TYPE", "MODIFIER", "MULTI_COMMENT", "NAME", "NUMBER", "OLD_NAME", "PARAM_NAME", "PARAM_PREFIX", "PREPROCESSOR_DECLARATION", "PROTOCOL", "SINGLE_COMMENT", "STATIC_METHOD", "STRUCT", "SUPERCLASS_NAME", "TYPE", "TYPEDEF", "TYPEDEF_ELEMENT", "TYPEDEF_NAME", "UNION", "VALUE", "WHITESPACE", "'&'", "'&~'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'...'", "':'", "';'", "'<'", "'<<'", "'='", "'>'", "'>>'", "'@class'", "'@end'", "'@interface'", "'@optional'", "'@private'", "'@property'", "'@protected'", "'@protocol'", "'@public'", "'NS_INLINE'", "'['", "']'", "'__attribute__'", "'__weak'", "'assign'", "'const'", "'copy'", "'enum'", "'extern'", "'format'", "'int'", "'long'", "'nonatomic'", "'readonly'", "'readwrite'", "'retain'", "'struct'", "'typedef'", "'union'", "'unsigned'", "'{'", "'|'", "'}'"
    };

    public static final int EOF=-1;
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
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
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
    public static final int UNION=41;
    public static final int VALUE=42;
    public static final int WHITESPACE=43;

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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:54:1: code : ( code_internal )* ;
    public final ObjchParser.code_return code() throws RecognitionException {
        ObjchParser.code_return retval = new ObjchParser.code_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.code_internal_return code_internal1 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:54:6: ( ( code_internal )* )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:55:3: ( code_internal )*
            {
            root_0 = (Object)adaptor.nil();


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:55:3: ( code_internal )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID||LA1_0==49||LA1_0==51||LA1_0==60||(LA1_0 >= 62 && LA1_0 <= 63)||LA1_0==65||LA1_0==67||LA1_0==69||LA1_0==73||LA1_0==75||(LA1_0 >= 77 && LA1_0 <= 78)||(LA1_0 >= 80 && LA1_0 <= 81)||(LA1_0 >= 86 && LA1_0 <= 87)||LA1_0==89) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:55:3: code_internal
            	    {
            	    pushFollow(FOLLOW_code_internal_in_code182);
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:58:1: code_internal : ( class_declaration | typedef_declaration_wrapper | enum_wrapper | protocol_declaration_wrapper | interface_declaration_wrapper | extern_declarations | typedef_struct | declarations );
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
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:59:2: ( class_declaration | typedef_declaration_wrapper | enum_wrapper | protocol_declaration_wrapper | interface_declaration_wrapper | extern_declarations | typedef_struct | declarations )
            int alt2=8;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:59:4: class_declaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_class_declaration_in_code_internal195);
                    class_declaration2=class_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, class_declaration2.getTree());

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:60:5: typedef_declaration_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedef_declaration_wrapper_in_code_internal202);
                    typedef_declaration_wrapper3=typedef_declaration_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef_declaration_wrapper3.getTree());

                    }
                    break;
                case 3 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:61:5: enum_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_enum_wrapper_in_code_internal209);
                    enum_wrapper4=enum_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, enum_wrapper4.getTree());

                    }
                    break;
                case 4 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:62:4: protocol_declaration_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_protocol_declaration_wrapper_in_code_internal214);
                    protocol_declaration_wrapper5=protocol_declaration_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, protocol_declaration_wrapper5.getTree());

                    }
                    break;
                case 5 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:63:4: interface_declaration_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_interface_declaration_wrapper_in_code_internal220);
                    interface_declaration_wrapper6=interface_declaration_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, interface_declaration_wrapper6.getTree());

                    }
                    break;
                case 6 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:64:4: extern_declarations
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_extern_declarations_in_code_internal226);
                    extern_declarations7=extern_declarations();

                    state._fsp--;

                    adaptor.addChild(root_0, extern_declarations7.getTree());

                    }
                    break;
                case 7 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:65:4: typedef_struct
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedef_struct_in_code_internal231);
                    typedef_struct8=typedef_struct();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef_struct8.getTree());

                    }
                    break;
                case 8 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:66:4: declarations
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declarations_in_code_internal236);
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:69:1: enum_wrapper : enum_declaration ';' -> ^( ENUM enum_declaration ) ;
    public final ObjchParser.enum_wrapper_return enum_wrapper() throws RecognitionException {
        ObjchParser.enum_wrapper_return retval = new ObjchParser.enum_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal11=null;
        ObjchParser.enum_declaration_return enum_declaration10 =null;


        Object char_literal11_tree=null;
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_enum_declaration=new RewriteRuleSubtreeStream(adaptor,"rule enum_declaration");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:70:2: ( enum_declaration ';' -> ^( ENUM enum_declaration ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:70:4: enum_declaration ';'
            {
            pushFollow(FOLLOW_enum_declaration_in_enum_wrapper250);
            enum_declaration10=enum_declaration();

            state._fsp--;

            stream_enum_declaration.add(enum_declaration10.getTree());

            char_literal11=(Token)match(input,54,FOLLOW_54_in_enum_wrapper252);  
            stream_54.add(char_literal11);


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
            // 70:25: -> ^( ENUM enum_declaration )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:70:28: ^( ENUM enum_declaration )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:72:1: extern_declarations : ( extern_declatation )+ -> ( ^( EXTERN extern_declatation ) )+ ;
    public final ObjchParser.extern_declarations_return extern_declarations() throws RecognitionException {
        ObjchParser.extern_declarations_return retval = new ObjchParser.extern_declarations_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.extern_declatation_return extern_declatation12 =null;


        RewriteRuleSubtreeStream stream_extern_declatation=new RewriteRuleSubtreeStream(adaptor,"rule extern_declatation");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:73:2: ( ( extern_declatation )+ -> ( ^( EXTERN extern_declatation ) )+ )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:73:4: ( extern_declatation )+
            {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:73:4: ( extern_declatation )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==78) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:73:4: extern_declatation
            	    {
            	    pushFollow(FOLLOW_extern_declatation_in_extern_declarations272);
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
            // 73:24: -> ( ^( EXTERN extern_declatation ) )+
            {
                if ( !(stream_extern_declatation.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_extern_declatation.hasNext() ) {
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:73:27: ^( EXTERN extern_declatation )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:75:1: declarations : ( ( optional_prefix )? method_declaration_wrapper | ( property_prefix )? ( optional_prefix )? field_declaration_wrapper | ns_inline (~ '{' )+ (~ '}' )+ '}' );
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
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:76:2: ( ( optional_prefix )? method_declaration_wrapper | ( property_prefix )? ( optional_prefix )? field_declaration_wrapper | ns_inline (~ '{' )+ (~ '}' )+ '}' )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 63:
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==49||LA9_1==51) ) {
                    alt9=1;
                }
                else if ( (LA9_1==ID||LA9_1==73||LA9_1==75||LA9_1==77||(LA9_1 >= 80 && LA9_1 <= 81)||(LA9_1 >= 86 && LA9_1 <= 87)||LA9_1==89) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;

                }
                }
                break;
            case 49:
            case 51:
                {
                alt9=1;
                }
                break;
            case ID:
            case 65:
            case 73:
            case 75:
            case 77:
            case 80:
            case 81:
            case 86:
            case 87:
            case 89:
                {
                alt9=2;
                }
                break;
            case 69:
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
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:76:4: ( optional_prefix )? method_declaration_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:76:4: ( optional_prefix )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==63) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:76:4: optional_prefix
                            {
                            pushFollow(FOLLOW_optional_prefix_in_declarations293);
                            optional_prefix13=optional_prefix();

                            state._fsp--;

                            adaptor.addChild(root_0, optional_prefix13.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_method_declaration_wrapper_in_declarations296);
                    method_declaration_wrapper14=method_declaration_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, method_declaration_wrapper14.getTree());

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:77:4: ( property_prefix )? ( optional_prefix )? field_declaration_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:77:4: ( property_prefix )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==65) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:77:4: property_prefix
                            {
                            pushFollow(FOLLOW_property_prefix_in_declarations301);
                            property_prefix15=property_prefix();

                            state._fsp--;

                            adaptor.addChild(root_0, property_prefix15.getTree());

                            }
                            break;

                    }


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:77:21: ( optional_prefix )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==63) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:77:21: optional_prefix
                            {
                            pushFollow(FOLLOW_optional_prefix_in_declarations304);
                            optional_prefix16=optional_prefix();

                            state._fsp--;

                            adaptor.addChild(root_0, optional_prefix16.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_field_declaration_wrapper_in_declarations307);
                    field_declaration_wrapper17=field_declaration_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, field_declaration_wrapper17.getTree());

                    }
                    break;
                case 3 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:78:4: ns_inline (~ '{' )+ (~ '}' )+ '}'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ns_inline_in_declarations312);
                    ns_inline18=ns_inline();

                    state._fsp--;

                    adaptor.addChild(root_0, ns_inline18.getTree());

                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:78:14: (~ '{' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0 >= ARCHIVE_DECLARATION && LA7_0 <= 89)||(LA7_0 >= 91 && LA7_0 <= 92)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:
                    	    {
                    	    set19=(Token)input.LT(1);

                    	    if ( (input.LA(1) >= ARCHIVE_DECLARATION && input.LA(1) <= 89)||(input.LA(1) >= 91 && input.LA(1) <= 92) ) {
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


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:78:20: (~ '}' )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0 >= ARCHIVE_DECLARATION && LA8_0 <= 91)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:
                    	    {
                    	    set20=(Token)input.LT(1);

                    	    if ( (input.LA(1) >= ARCHIVE_DECLARATION && input.LA(1) <= 91) ) {
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


                    char_literal21=(Token)match(input,92,FOLLOW_92_in_declarations322); 
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:81:1: method_declaration_wrapper : method_declaration -> ^( METHOD method_declaration ) ;
    public final ObjchParser.method_declaration_wrapper_return method_declaration_wrapper() throws RecognitionException {
        ObjchParser.method_declaration_wrapper_return retval = new ObjchParser.method_declaration_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.method_declaration_return method_declaration22 =null;


        RewriteRuleSubtreeStream stream_method_declaration=new RewriteRuleSubtreeStream(adaptor,"rule method_declaration");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:82:2: ( method_declaration -> ^( METHOD method_declaration ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:82:4: method_declaration
            {
            pushFollow(FOLLOW_method_declaration_in_method_declaration_wrapper335);
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
            // 82:23: -> ^( METHOD method_declaration )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:82:26: ^( METHOD method_declaration )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:84:1: field_declaration_wrapper : field_declaration -> ^( FIELD field_declaration ) ;
    public final ObjchParser.field_declaration_wrapper_return field_declaration_wrapper() throws RecognitionException {
        ObjchParser.field_declaration_wrapper_return retval = new ObjchParser.field_declaration_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.field_declaration_return field_declaration23 =null;


        RewriteRuleSubtreeStream stream_field_declaration=new RewriteRuleSubtreeStream(adaptor,"rule field_declaration");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:85:2: ( field_declaration -> ^( FIELD field_declaration ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:85:4: field_declaration
            {
            pushFollow(FOLLOW_field_declaration_in_field_declaration_wrapper353);
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
            // 85:22: -> ^( FIELD field_declaration )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:85:25: ^( FIELD field_declaration )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:87:1: property_prefix : '@property' '(' property_prefix_param ( ',' property_prefix_param )* ')' ;
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
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:88:2: ( '@property' '(' property_prefix_param ( ',' property_prefix_param )* ')' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:88:4: '@property' '(' property_prefix_param ( ',' property_prefix_param )* ')'
            {
            root_0 = (Object)adaptor.nil();


            string_literal24=(Token)match(input,65,FOLLOW_65_in_property_prefix371); 
            string_literal24_tree = 
            (Object)adaptor.create(string_literal24)
            ;
            adaptor.addChild(root_0, string_literal24_tree);


            char_literal25=(Token)match(input,46,FOLLOW_46_in_property_prefix373); 
            char_literal25_tree = 
            (Object)adaptor.create(char_literal25)
            ;
            adaptor.addChild(root_0, char_literal25_tree);


            pushFollow(FOLLOW_property_prefix_param_in_property_prefix375);
            property_prefix_param26=property_prefix_param();

            state._fsp--;

            adaptor.addChild(root_0, property_prefix_param26.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:88:42: ( ',' property_prefix_param )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==50) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:88:43: ',' property_prefix_param
            	    {
            	    char_literal27=(Token)match(input,50,FOLLOW_50_in_property_prefix378); 
            	    char_literal27_tree = 
            	    (Object)adaptor.create(char_literal27)
            	    ;
            	    adaptor.addChild(root_0, char_literal27_tree);


            	    pushFollow(FOLLOW_property_prefix_param_in_property_prefix380);
            	    property_prefix_param28=property_prefix_param();

            	    state._fsp--;

            	    adaptor.addChild(root_0, property_prefix_param28.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            char_literal29=(Token)match(input,47,FOLLOW_47_in_property_prefix384); 
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:90:1: optional_prefix : '@optional' ;
    public final ObjchParser.optional_prefix_return optional_prefix() throws RecognitionException {
        ObjchParser.optional_prefix_return retval = new ObjchParser.optional_prefix_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal30=null;

        Object string_literal30_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:91:2: ( '@optional' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:91:4: '@optional'
            {
            root_0 = (Object)adaptor.nil();


            string_literal30=(Token)match(input,63,FOLLOW_63_in_optional_prefix395); 
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:93:1: ns_inline : 'NS_INLINE' ;
    public final ObjchParser.ns_inline_return ns_inline() throws RecognitionException {
        ObjchParser.ns_inline_return retval = new ObjchParser.ns_inline_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal31=null;

        Object string_literal31_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:94:2: ( 'NS_INLINE' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:94:4: 'NS_INLINE'
            {
            root_0 = (Object)adaptor.nil();


            string_literal31=(Token)match(input,69,FOLLOW_69_in_ns_inline405); 
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:96:1: property_prefix_param : ( 'retain' | 'readwrite' | 'readonly' | 'nonatomic' | 'assign' | 'copy' );
    public final ObjchParser.property_prefix_param_return property_prefix_param() throws RecognitionException {
        ObjchParser.property_prefix_param_return retval = new ObjchParser.property_prefix_param_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set32=null;

        Object set32_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:97:2: ( 'retain' | 'readwrite' | 'readonly' | 'nonatomic' | 'assign' | 'copy' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:
            {
            root_0 = (Object)adaptor.nil();


            set32=(Token)input.LT(1);

            if ( input.LA(1)==74||input.LA(1)==76||(input.LA(1) >= 82 && input.LA(1) <= 85) ) {
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:105:1: interface_declaration_wrapper : interface_declaration -> ^( INTERFACE interface_declaration ) ;
    public final ObjchParser.interface_declaration_wrapper_return interface_declaration_wrapper() throws RecognitionException {
        ObjchParser.interface_declaration_wrapper_return retval = new ObjchParser.interface_declaration_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.interface_declaration_return interface_declaration33 =null;


        RewriteRuleSubtreeStream stream_interface_declaration=new RewriteRuleSubtreeStream(adaptor,"rule interface_declaration");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:106:2: ( interface_declaration -> ^( INTERFACE interface_declaration ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:106:4: interface_declaration
            {
            pushFollow(FOLLOW_interface_declaration_in_interface_declaration_wrapper453);
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
            // 106:26: -> ^( INTERFACE interface_declaration )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:106:29: ^( INTERFACE interface_declaration )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:108:1: protocol_declaration_wrapper : protocol_declaration -> ^( PROTOCOL protocol_declaration ) ;
    public final ObjchParser.protocol_declaration_wrapper_return protocol_declaration_wrapper() throws RecognitionException {
        ObjchParser.protocol_declaration_wrapper_return retval = new ObjchParser.protocol_declaration_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.protocol_declaration_return protocol_declaration34 =null;


        RewriteRuleSubtreeStream stream_protocol_declaration=new RewriteRuleSubtreeStream(adaptor,"rule protocol_declaration");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:109:2: ( protocol_declaration -> ^( PROTOCOL protocol_declaration ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:109:4: protocol_declaration
            {
            pushFollow(FOLLOW_protocol_declaration_in_protocol_declaration_wrapper471);
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
            // 109:25: -> ^( PROTOCOL protocol_declaration )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:109:28: ^( PROTOCOL protocol_declaration )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:111:1: typedef_declaration_wrapper : typedef_declaration -> ^( TYPEDEF typedef_declaration ) ;
    public final ObjchParser.typedef_declaration_wrapper_return typedef_declaration_wrapper() throws RecognitionException {
        ObjchParser.typedef_declaration_wrapper_return retval = new ObjchParser.typedef_declaration_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.typedef_declaration_return typedef_declaration35 =null;


        RewriteRuleSubtreeStream stream_typedef_declaration=new RewriteRuleSubtreeStream(adaptor,"rule typedef_declaration");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:112:2: ( typedef_declaration -> ^( TYPEDEF typedef_declaration ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:112:4: typedef_declaration
            {
            pushFollow(FOLLOW_typedef_declaration_in_typedef_declaration_wrapper488);
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
            // 112:24: -> ^( TYPEDEF typedef_declaration )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:112:27: ^( TYPEDEF typedef_declaration )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:114:1: typedef_declaration : 'typedef' typedef_internal ( typedef_name | func_pointer )? ( ';' )? ;
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
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:115:2: ( 'typedef' typedef_internal ( typedef_name | func_pointer )? ( ';' )? )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:115:4: 'typedef' typedef_internal ( typedef_name | func_pointer )? ( ';' )?
            {
            root_0 = (Object)adaptor.nil();


            string_literal36=(Token)match(input,87,FOLLOW_87_in_typedef_declaration505); 
            string_literal36_tree = 
            (Object)adaptor.create(string_literal36)
            ;
            adaptor.addChild(root_0, string_literal36_tree);


            pushFollow(FOLLOW_typedef_internal_in_typedef_declaration507);
            typedef_internal37=typedef_internal();

            state._fsp--;

            adaptor.addChild(root_0, typedef_internal37.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:115:31: ( typedef_name | func_pointer )?
            int alt11=3;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:115:32: typedef_name
                    {
                    pushFollow(FOLLOW_typedef_name_in_typedef_declaration510);
                    typedef_name38=typedef_name();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef_name38.getTree());

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:115:47: func_pointer
                    {
                    pushFollow(FOLLOW_func_pointer_in_typedef_declaration514);
                    func_pointer39=func_pointer();

                    state._fsp--;

                    adaptor.addChild(root_0, func_pointer39.getTree());

                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:115:62: ( ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==54) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:115:62: ';'
                    {
                    char_literal40=(Token)match(input,54,FOLLOW_54_in_typedef_declaration518); 
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:117:1: func_pointer : '(' ( '*' )? ID ')' '(' ( ID ( '*' ID )? ( ',' ( ( ID ( '*' ID )? ) | '...' ) )* )? ')' ;
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
        Token ID50=null;
        Token char_literal51=null;
        Token ID52=null;
        Token string_literal53=null;
        Token char_literal54=null;

        Object char_literal41_tree=null;
        Object char_literal42_tree=null;
        Object ID43_tree=null;
        Object char_literal44_tree=null;
        Object char_literal45_tree=null;
        Object ID46_tree=null;
        Object char_literal47_tree=null;
        Object ID48_tree=null;
        Object char_literal49_tree=null;
        Object ID50_tree=null;
        Object char_literal51_tree=null;
        Object ID52_tree=null;
        Object string_literal53_tree=null;
        Object char_literal54_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:118:2: ( '(' ( '*' )? ID ')' '(' ( ID ( '*' ID )? ( ',' ( ( ID ( '*' ID )? ) | '...' ) )* )? ')' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:118:4: '(' ( '*' )? ID ')' '(' ( ID ( '*' ID )? ( ',' ( ( ID ( '*' ID )? ) | '...' ) )* )? ')'
            {
            root_0 = (Object)adaptor.nil();


            char_literal41=(Token)match(input,46,FOLLOW_46_in_func_pointer529); 
            char_literal41_tree = 
            (Object)adaptor.create(char_literal41)
            ;
            adaptor.addChild(root_0, char_literal41_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:118:8: ( '*' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==48) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:118:8: '*'
                    {
                    char_literal42=(Token)match(input,48,FOLLOW_48_in_func_pointer531); 
                    char_literal42_tree = 
                    (Object)adaptor.create(char_literal42)
                    ;
                    adaptor.addChild(root_0, char_literal42_tree);


                    }
                    break;

            }


            ID43=(Token)match(input,ID,FOLLOW_ID_in_func_pointer534); 
            ID43_tree = 
            (Object)adaptor.create(ID43)
            ;
            adaptor.addChild(root_0, ID43_tree);


            char_literal44=(Token)match(input,47,FOLLOW_47_in_func_pointer536); 
            char_literal44_tree = 
            (Object)adaptor.create(char_literal44)
            ;
            adaptor.addChild(root_0, char_literal44_tree);


            char_literal45=(Token)match(input,46,FOLLOW_46_in_func_pointer538); 
            char_literal45_tree = 
            (Object)adaptor.create(char_literal45)
            ;
            adaptor.addChild(root_0, char_literal45_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:118:24: ( ID ( '*' ID )? ( ',' ( ( ID ( '*' ID )? ) | '...' ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:118:25: ID ( '*' ID )? ( ',' ( ( ID ( '*' ID )? ) | '...' ) )*
                    {
                    ID46=(Token)match(input,ID,FOLLOW_ID_in_func_pointer541); 
                    ID46_tree = 
                    (Object)adaptor.create(ID46)
                    ;
                    adaptor.addChild(root_0, ID46_tree);


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:118:28: ( '*' ID )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==48) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:118:29: '*' ID
                            {
                            char_literal47=(Token)match(input,48,FOLLOW_48_in_func_pointer544); 
                            char_literal47_tree = 
                            (Object)adaptor.create(char_literal47)
                            ;
                            adaptor.addChild(root_0, char_literal47_tree);


                            ID48=(Token)match(input,ID,FOLLOW_ID_in_func_pointer546); 
                            ID48_tree = 
                            (Object)adaptor.create(ID48)
                            ;
                            adaptor.addChild(root_0, ID48_tree);


                            }
                            break;

                    }


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:118:38: ( ',' ( ( ID ( '*' ID )? ) | '...' ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==50) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:118:39: ',' ( ( ID ( '*' ID )? ) | '...' )
                    	    {
                    	    char_literal49=(Token)match(input,50,FOLLOW_50_in_func_pointer551); 
                    	    char_literal49_tree = 
                    	    (Object)adaptor.create(char_literal49)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal49_tree);


                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:118:43: ( ( ID ( '*' ID )? ) | '...' )
                    	    int alt16=2;
                    	    int LA16_0 = input.LA(1);

                    	    if ( (LA16_0==ID) ) {
                    	        alt16=1;
                    	    }
                    	    else if ( (LA16_0==52) ) {
                    	        alt16=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 16, 0, input);

                    	        throw nvae;

                    	    }
                    	    switch (alt16) {
                    	        case 1 :
                    	            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:118:44: ( ID ( '*' ID )? )
                    	            {
                    	            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:118:44: ( ID ( '*' ID )? )
                    	            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:118:45: ID ( '*' ID )?
                    	            {
                    	            ID50=(Token)match(input,ID,FOLLOW_ID_in_func_pointer555); 
                    	            ID50_tree = 
                    	            (Object)adaptor.create(ID50)
                    	            ;
                    	            adaptor.addChild(root_0, ID50_tree);


                    	            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:118:48: ( '*' ID )?
                    	            int alt15=2;
                    	            int LA15_0 = input.LA(1);

                    	            if ( (LA15_0==48) ) {
                    	                alt15=1;
                    	            }
                    	            switch (alt15) {
                    	                case 1 :
                    	                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:118:49: '*' ID
                    	                    {
                    	                    char_literal51=(Token)match(input,48,FOLLOW_48_in_func_pointer558); 
                    	                    char_literal51_tree = 
                    	                    (Object)adaptor.create(char_literal51)
                    	                    ;
                    	                    adaptor.addChild(root_0, char_literal51_tree);


                    	                    ID52=(Token)match(input,ID,FOLLOW_ID_in_func_pointer560); 
                    	                    ID52_tree = 
                    	                    (Object)adaptor.create(ID52)
                    	                    ;
                    	                    adaptor.addChild(root_0, ID52_tree);


                    	                    }
                    	                    break;

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:118:61: '...'
                    	            {
                    	            string_literal53=(Token)match(input,52,FOLLOW_52_in_func_pointer567); 
                    	            string_literal53_tree = 
                    	            (Object)adaptor.create(string_literal53)
                    	            ;
                    	            adaptor.addChild(root_0, string_literal53_tree);


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }


            char_literal54=(Token)match(input,47,FOLLOW_47_in_func_pointer575); 
            char_literal54_tree = 
            (Object)adaptor.create(char_literal54)
            ;
            adaptor.addChild(root_0, char_literal54_tree);


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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:121:1: typedef_internal : ( typedef_enum_wrapper2 | typedef_rename | typedef_struct_wrapper | union_declaration_wrapper );
    public final ObjchParser.typedef_internal_return typedef_internal() throws RecognitionException {
        ObjchParser.typedef_internal_return retval = new ObjchParser.typedef_internal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.typedef_enum_wrapper2_return typedef_enum_wrapper255 =null;

        ObjchParser.typedef_rename_return typedef_rename56 =null;

        ObjchParser.typedef_struct_wrapper_return typedef_struct_wrapper57 =null;

        ObjchParser.union_declaration_wrapper_return union_declaration_wrapper58 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:122:2: ( typedef_enum_wrapper2 | typedef_rename | typedef_struct_wrapper | union_declaration_wrapper )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt19=1;
                }
                break;
            case ID:
                {
                alt19=2;
                }
                break;
            case 86:
                {
                alt19=3;
                }
                break;
            case 88:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:122:4: typedef_enum_wrapper2
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedef_enum_wrapper2_in_typedef_internal587);
                    typedef_enum_wrapper255=typedef_enum_wrapper2();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef_enum_wrapper255.getTree());

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:123:5: typedef_rename
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedef_rename_in_typedef_internal594);
                    typedef_rename56=typedef_rename();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef_rename56.getTree());

                    }
                    break;
                case 3 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:124:5: typedef_struct_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedef_struct_wrapper_in_typedef_internal601);
                    typedef_struct_wrapper57=typedef_struct_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef_struct_wrapper57.getTree());

                    }
                    break;
                case 4 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:125:4: union_declaration_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_union_declaration_wrapper_in_typedef_internal606);
                    union_declaration_wrapper58=union_declaration_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, union_declaration_wrapper58.getTree());

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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:128:1: union_declaration_wrapper : union_declaration -> ^( UNION union_declaration ) ;
    public final ObjchParser.union_declaration_wrapper_return union_declaration_wrapper() throws RecognitionException {
        ObjchParser.union_declaration_wrapper_return retval = new ObjchParser.union_declaration_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.union_declaration_return union_declaration59 =null;


        RewriteRuleSubtreeStream stream_union_declaration=new RewriteRuleSubtreeStream(adaptor,"rule union_declaration");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:129:2: ( union_declaration -> ^( UNION union_declaration ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:129:4: union_declaration
            {
            pushFollow(FOLLOW_union_declaration_in_union_declaration_wrapper618);
            union_declaration59=union_declaration();

            state._fsp--;

            stream_union_declaration.add(union_declaration59.getTree());

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
            // 129:22: -> ^( UNION union_declaration )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:129:25: ^( UNION union_declaration )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:131:1: union_declaration : 'union' '{' ( typedef_struct )+ '}' ( union_name )? ;
    public final ObjchParser.union_declaration_return union_declaration() throws RecognitionException {
        ObjchParser.union_declaration_return retval = new ObjchParser.union_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal60=null;
        Token char_literal61=null;
        Token char_literal63=null;
        ObjchParser.typedef_struct_return typedef_struct62 =null;

        ObjchParser.union_name_return union_name64 =null;


        Object string_literal60_tree=null;
        Object char_literal61_tree=null;
        Object char_literal63_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:132:2: ( 'union' '{' ( typedef_struct )+ '}' ( union_name )? )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:132:4: 'union' '{' ( typedef_struct )+ '}' ( union_name )?
            {
            root_0 = (Object)adaptor.nil();


            string_literal60=(Token)match(input,88,FOLLOW_88_in_union_declaration637); 
            string_literal60_tree = 
            (Object)adaptor.create(string_literal60)
            ;
            adaptor.addChild(root_0, string_literal60_tree);


            char_literal61=(Token)match(input,90,FOLLOW_90_in_union_declaration642); 
            char_literal61_tree = 
            (Object)adaptor.create(char_literal61)
            ;
            adaptor.addChild(root_0, char_literal61_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:134:4: ( typedef_struct )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==86) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:134:4: typedef_struct
            	    {
            	    pushFollow(FOLLOW_typedef_struct_in_union_declaration647);
            	    typedef_struct62=typedef_struct();

            	    state._fsp--;

            	    adaptor.addChild(root_0, typedef_struct62.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


            char_literal63=(Token)match(input,92,FOLLOW_92_in_union_declaration652); 
            char_literal63_tree = 
            (Object)adaptor.create(char_literal63)
            ;
            adaptor.addChild(root_0, char_literal63_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:135:7: ( union_name )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:135:7: union_name
                    {
                    pushFollow(FOLLOW_union_name_in_union_declaration654);
                    union_name64=union_name();

                    state._fsp--;

                    adaptor.addChild(root_0, union_name64.getTree());

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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:138:1: union_internal : ( field_declaration_wrapper | typedef_struct_wrapper );
    public final ObjchParser.union_internal_return union_internal() throws RecognitionException {
        ObjchParser.union_internal_return retval = new ObjchParser.union_internal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.field_declaration_wrapper_return field_declaration_wrapper65 =null;

        ObjchParser.typedef_struct_wrapper_return typedef_struct_wrapper66 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:139:2: ( field_declaration_wrapper | typedef_struct_wrapper )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==ID||LA22_0==73||LA22_0==75||LA22_0==77||(LA22_0 >= 80 && LA22_0 <= 81)||LA22_0==87||LA22_0==89) ) {
                alt22=1;
            }
            else if ( (LA22_0==86) ) {
                switch ( input.LA(2) ) {
                case 80:
                case 81:
                case 89:
                    {
                    alt22=1;
                    }
                    break;
                case ID:
                    {
                    int LA22_13 = input.LA(3);

                    if ( (LA22_13==ID||LA22_13==46||LA22_13==48||LA22_13==55||LA22_13==70||LA22_13==75) ) {
                        alt22=1;
                    }
                    else if ( (LA22_13==90) ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 13, input);

                        throw nvae;

                    }
                    }
                    break;
                case 90:
                    {
                    alt22=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 5, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:139:4: field_declaration_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_field_declaration_wrapper_in_union_internal668);
                    field_declaration_wrapper65=field_declaration_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, field_declaration_wrapper65.getTree());

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:140:4: typedef_struct_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedef_struct_wrapper_in_union_internal673);
                    typedef_struct_wrapper66=typedef_struct_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef_struct_wrapper66.getTree());

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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:142:1: typedef_rename : ID ( '*' )? -> ^( OLD_NAME ID ) ;
    public final ObjchParser.typedef_rename_return typedef_rename() throws RecognitionException {
        ObjchParser.typedef_rename_return retval = new ObjchParser.typedef_rename_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID67=null;
        Token char_literal68=null;

        Object ID67_tree=null;
        Object char_literal68_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:143:2: ( ID ( '*' )? -> ^( OLD_NAME ID ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:143:4: ID ( '*' )?
            {
            ID67=(Token)match(input,ID,FOLLOW_ID_in_typedef_rename684);  
            stream_ID.add(ID67);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:143:7: ( '*' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==48) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:143:7: '*'
                    {
                    char_literal68=(Token)match(input,48,FOLLOW_48_in_typedef_rename686);  
                    stream_48.add(char_literal68);


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
            // 143:12: -> ^( OLD_NAME ID )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:143:15: ^( OLD_NAME ID )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:146:1: typedef_enum_wrapper2 : enum_declaration -> ^( ENUM enum_declaration ) ;
    public final ObjchParser.typedef_enum_wrapper2_return typedef_enum_wrapper2() throws RecognitionException {
        ObjchParser.typedef_enum_wrapper2_return retval = new ObjchParser.typedef_enum_wrapper2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.enum_declaration_return enum_declaration69 =null;


        RewriteRuleSubtreeStream stream_enum_declaration=new RewriteRuleSubtreeStream(adaptor,"rule enum_declaration");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:147:2: ( enum_declaration -> ^( ENUM enum_declaration ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:147:4: enum_declaration
            {
            pushFollow(FOLLOW_enum_declaration_in_typedef_enum_wrapper2709);
            enum_declaration69=enum_declaration();

            state._fsp--;

            stream_enum_declaration.add(enum_declaration69.getTree());

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
            // 147:21: -> ^( ENUM enum_declaration )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:147:24: ^( ENUM enum_declaration )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:149:1: enum_declaration : 'enum' ( struct_name )? '{' typedef_declaration_element_wrapper ( ',' typedef_declaration_element_wrapper )* ( ',' )? '}' ;
    public final ObjchParser.enum_declaration_return enum_declaration() throws RecognitionException {
        ObjchParser.enum_declaration_return retval = new ObjchParser.enum_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal70=null;
        Token char_literal72=null;
        Token char_literal74=null;
        Token char_literal76=null;
        Token char_literal77=null;
        ObjchParser.struct_name_return struct_name71 =null;

        ObjchParser.typedef_declaration_element_wrapper_return typedef_declaration_element_wrapper73 =null;

        ObjchParser.typedef_declaration_element_wrapper_return typedef_declaration_element_wrapper75 =null;


        Object string_literal70_tree=null;
        Object char_literal72_tree=null;
        Object char_literal74_tree=null;
        Object char_literal76_tree=null;
        Object char_literal77_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:150:2: ( 'enum' ( struct_name )? '{' typedef_declaration_element_wrapper ( ',' typedef_declaration_element_wrapper )* ( ',' )? '}' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:150:4: 'enum' ( struct_name )? '{' typedef_declaration_element_wrapper ( ',' typedef_declaration_element_wrapper )* ( ',' )? '}'
            {
            root_0 = (Object)adaptor.nil();


            string_literal70=(Token)match(input,77,FOLLOW_77_in_enum_declaration729); 
            string_literal70_tree = 
            (Object)adaptor.create(string_literal70)
            ;
            adaptor.addChild(root_0, string_literal70_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:150:11: ( struct_name )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:150:11: struct_name
                    {
                    pushFollow(FOLLOW_struct_name_in_enum_declaration731);
                    struct_name71=struct_name();

                    state._fsp--;

                    adaptor.addChild(root_0, struct_name71.getTree());

                    }
                    break;

            }


            char_literal72=(Token)match(input,90,FOLLOW_90_in_enum_declaration734); 
            char_literal72_tree = 
            (Object)adaptor.create(char_literal72)
            ;
            adaptor.addChild(root_0, char_literal72_tree);


            pushFollow(FOLLOW_typedef_declaration_element_wrapper_in_enum_declaration736);
            typedef_declaration_element_wrapper73=typedef_declaration_element_wrapper();

            state._fsp--;

            adaptor.addChild(root_0, typedef_declaration_element_wrapper73.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:150:64: ( ',' typedef_declaration_element_wrapper )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==50) ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1==ID||LA25_1==NUMBER||LA25_1==46) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:150:65: ',' typedef_declaration_element_wrapper
            	    {
            	    char_literal74=(Token)match(input,50,FOLLOW_50_in_enum_declaration739); 
            	    char_literal74_tree = 
            	    (Object)adaptor.create(char_literal74)
            	    ;
            	    adaptor.addChild(root_0, char_literal74_tree);


            	    pushFollow(FOLLOW_typedef_declaration_element_wrapper_in_enum_declaration741);
            	    typedef_declaration_element_wrapper75=typedef_declaration_element_wrapper();

            	    state._fsp--;

            	    adaptor.addChild(root_0, typedef_declaration_element_wrapper75.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:150:107: ( ',' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==50) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:150:107: ','
                    {
                    char_literal76=(Token)match(input,50,FOLLOW_50_in_enum_declaration745); 
                    char_literal76_tree = 
                    (Object)adaptor.create(char_literal76)
                    ;
                    adaptor.addChild(root_0, char_literal76_tree);


                    }
                    break;

            }


            char_literal77=(Token)match(input,92,FOLLOW_92_in_enum_declaration748); 
            char_literal77_tree = 
            (Object)adaptor.create(char_literal77)
            ;
            adaptor.addChild(root_0, char_literal77_tree);


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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:152:1: typedef_struct_wrapper : typedef_struct -> ^( STRUCT typedef_struct ) ;
    public final ObjchParser.typedef_struct_wrapper_return typedef_struct_wrapper() throws RecognitionException {
        ObjchParser.typedef_struct_wrapper_return retval = new ObjchParser.typedef_struct_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.typedef_struct_return typedef_struct78 =null;


        RewriteRuleSubtreeStream stream_typedef_struct=new RewriteRuleSubtreeStream(adaptor,"rule typedef_struct");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:153:2: ( typedef_struct -> ^( STRUCT typedef_struct ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:153:4: typedef_struct
            {
            pushFollow(FOLLOW_typedef_struct_in_typedef_struct_wrapper759);
            typedef_struct78=typedef_struct();

            state._fsp--;

            stream_typedef_struct.add(typedef_struct78.getTree());

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
            // 153:19: -> ^( STRUCT typedef_struct )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:153:22: ^( STRUCT typedef_struct )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:155:1: typedef_struct : 'struct' ( typedef_name )? '{' ( struct_field_wrapper )+ '}' ( struct_name ( ',' struct_name )* )? ( ';' )? ;
    public final ObjchParser.typedef_struct_return typedef_struct() throws RecognitionException {
        ObjchParser.typedef_struct_return retval = new ObjchParser.typedef_struct_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal79=null;
        Token char_literal81=null;
        Token char_literal83=null;
        Token char_literal85=null;
        Token char_literal87=null;
        ObjchParser.typedef_name_return typedef_name80 =null;

        ObjchParser.struct_field_wrapper_return struct_field_wrapper82 =null;

        ObjchParser.struct_name_return struct_name84 =null;

        ObjchParser.struct_name_return struct_name86 =null;


        Object string_literal79_tree=null;
        Object char_literal81_tree=null;
        Object char_literal83_tree=null;
        Object char_literal85_tree=null;
        Object char_literal87_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:156:2: ( 'struct' ( typedef_name )? '{' ( struct_field_wrapper )+ '}' ( struct_name ( ',' struct_name )* )? ( ';' )? )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:156:4: 'struct' ( typedef_name )? '{' ( struct_field_wrapper )+ '}' ( struct_name ( ',' struct_name )* )? ( ';' )?
            {
            root_0 = (Object)adaptor.nil();


            string_literal79=(Token)match(input,86,FOLLOW_86_in_typedef_struct777); 
            string_literal79_tree = 
            (Object)adaptor.create(string_literal79)
            ;
            adaptor.addChild(root_0, string_literal79_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:156:13: ( typedef_name )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:156:13: typedef_name
                    {
                    pushFollow(FOLLOW_typedef_name_in_typedef_struct779);
                    typedef_name80=typedef_name();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef_name80.getTree());

                    }
                    break;

            }


            char_literal81=(Token)match(input,90,FOLLOW_90_in_typedef_struct784); 
            char_literal81_tree = 
            (Object)adaptor.create(char_literal81)
            ;
            adaptor.addChild(root_0, char_literal81_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:158:4: ( struct_field_wrapper )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==ID||LA28_0==75||LA28_0==77||(LA28_0 >= 80 && LA28_0 <= 81)||(LA28_0 >= 86 && LA28_0 <= 87)||LA28_0==89) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:158:4: struct_field_wrapper
            	    {
            	    pushFollow(FOLLOW_struct_field_wrapper_in_typedef_struct789);
            	    struct_field_wrapper82=struct_field_wrapper();

            	    state._fsp--;

            	    adaptor.addChild(root_0, struct_field_wrapper82.getTree());

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


            char_literal83=(Token)match(input,92,FOLLOW_92_in_typedef_struct794); 
            char_literal83_tree = 
            (Object)adaptor.create(char_literal83)
            ;
            adaptor.addChild(root_0, char_literal83_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:159:7: ( struct_name ( ',' struct_name )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:159:8: struct_name ( ',' struct_name )*
                    {
                    pushFollow(FOLLOW_struct_name_in_typedef_struct797);
                    struct_name84=struct_name();

                    state._fsp--;

                    adaptor.addChild(root_0, struct_name84.getTree());

                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:159:20: ( ',' struct_name )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==50) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:159:21: ',' struct_name
                    	    {
                    	    char_literal85=(Token)match(input,50,FOLLOW_50_in_typedef_struct800); 
                    	    char_literal85_tree = 
                    	    (Object)adaptor.create(char_literal85)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal85_tree);


                    	    pushFollow(FOLLOW_struct_name_in_typedef_struct802);
                    	    struct_name86=struct_name();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, struct_name86.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:159:41: ( ';' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==54) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:159:41: ';'
                    {
                    char_literal87=(Token)match(input,54,FOLLOW_54_in_typedef_struct808); 
                    char_literal87_tree = 
                    (Object)adaptor.create(char_literal87)
                    ;
                    adaptor.addChild(root_0, char_literal87_tree);


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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:162:1: struct_name : ID -> ^( NAME ID ) ;
    public final ObjchParser.struct_name_return struct_name() throws RecognitionException {
        ObjchParser.struct_name_return retval = new ObjchParser.struct_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID88=null;

        Object ID88_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:163:2: ( ID -> ^( NAME ID ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:163:4: ID
            {
            ID88=(Token)match(input,ID,FOLLOW_ID_in_struct_name821);  
            stream_ID.add(ID88);


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
            // 163:7: -> ^( NAME ID )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:163:10: ^( NAME ID )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:165:1: struct_field_wrapper : struct_field -> ^( FIELD struct_field ) ;
    public final ObjchParser.struct_field_wrapper_return struct_field_wrapper() throws RecognitionException {
        ObjchParser.struct_field_wrapper_return retval = new ObjchParser.struct_field_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.struct_field_return struct_field89 =null;


        RewriteRuleSubtreeStream stream_struct_field=new RewriteRuleSubtreeStream(adaptor,"rule struct_field");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:166:2: ( struct_field -> ^( FIELD struct_field ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:166:4: struct_field
            {
            pushFollow(FOLLOW_struct_field_in_struct_field_wrapper839);
            struct_field89=struct_field();

            state._fsp--;

            stream_struct_field.add(struct_field89.getTree());

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
            // 166:17: -> ^( FIELD struct_field )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:166:20: ^( FIELD struct_field )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:168:1: struct_field : ( struct_field1 | struct_field2 );
    public final ObjchParser.struct_field_return struct_field() throws RecognitionException {
        ObjchParser.struct_field_return retval = new ObjchParser.struct_field_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.struct_field1_return struct_field190 =null;

        ObjchParser.struct_field2_return struct_field291 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:169:2: ( struct_field1 | struct_field2 )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==ID||LA32_0==75||LA32_0==77||(LA32_0 >= 80 && LA32_0 <= 81)||LA32_0==87||LA32_0==89) ) {
                alt32=1;
            }
            else if ( (LA32_0==86) ) {
                switch ( input.LA(2) ) {
                case 80:
                case 81:
                case 89:
                    {
                    alt32=1;
                    }
                    break;
                case ID:
                    {
                    int LA32_12 = input.LA(3);

                    if ( (LA32_12==ID||LA32_12==48||LA32_12==55||LA32_12==70||LA32_12==75) ) {
                        alt32=1;
                    }
                    else if ( (LA32_12==90) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 12, input);

                        throw nvae;

                    }
                    }
                    break;
                case 90:
                    {
                    alt32=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 4, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:169:4: struct_field1
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_struct_field1_in_struct_field857);
                    struct_field190=struct_field1();

                    state._fsp--;

                    adaptor.addChild(root_0, struct_field190.getTree());

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:170:4: struct_field2
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_struct_field2_in_struct_field862);
                    struct_field291=struct_field2();

                    state._fsp--;

                    adaptor.addChild(root_0, struct_field291.getTree());

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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:173:1: struct_field1 : type_declaration field_name ( ',' field_name )* ';' ;
    public final ObjchParser.struct_field1_return struct_field1() throws RecognitionException {
        ObjchParser.struct_field1_return retval = new ObjchParser.struct_field1_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal94=null;
        Token char_literal96=null;
        ObjchParser.type_declaration_return type_declaration92 =null;

        ObjchParser.field_name_return field_name93 =null;

        ObjchParser.field_name_return field_name95 =null;


        Object char_literal94_tree=null;
        Object char_literal96_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:174:2: ( type_declaration field_name ( ',' field_name )* ';' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:174:4: type_declaration field_name ( ',' field_name )* ';'
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_declaration_in_struct_field1874);
            type_declaration92=type_declaration();

            state._fsp--;

            adaptor.addChild(root_0, type_declaration92.getTree());

            pushFollow(FOLLOW_field_name_in_struct_field1876);
            field_name93=field_name();

            state._fsp--;

            adaptor.addChild(root_0, field_name93.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:174:32: ( ',' field_name )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==50) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:174:33: ',' field_name
            	    {
            	    char_literal94=(Token)match(input,50,FOLLOW_50_in_struct_field1879); 
            	    char_literal94_tree = 
            	    (Object)adaptor.create(char_literal94)
            	    ;
            	    adaptor.addChild(root_0, char_literal94_tree);


            	    pushFollow(FOLLOW_field_name_in_struct_field1881);
            	    field_name95=field_name();

            	    state._fsp--;

            	    adaptor.addChild(root_0, field_name95.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            char_literal96=(Token)match(input,54,FOLLOW_54_in_struct_field1885); 
            char_literal96_tree = 
            (Object)adaptor.create(char_literal96)
            ;
            adaptor.addChild(root_0, char_literal96_tree);


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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:176:1: struct_field2 : typedef_struct ;
    public final ObjchParser.struct_field2_return struct_field2() throws RecognitionException {
        ObjchParser.struct_field2_return retval = new ObjchParser.struct_field2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.typedef_struct_return typedef_struct97 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:177:2: ( typedef_struct )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:177:4: typedef_struct
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_typedef_struct_in_struct_field2895);
            typedef_struct97=typedef_struct();

            state._fsp--;

            adaptor.addChild(root_0, typedef_struct97.getTree());

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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:179:1: typedef_name : ID -> ^( TYPEDEF_NAME ID ) ;
    public final ObjchParser.typedef_name_return typedef_name() throws RecognitionException {
        ObjchParser.typedef_name_return retval = new ObjchParser.typedef_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID98=null;

        Object ID98_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:180:2: ( ID -> ^( TYPEDEF_NAME ID ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:180:4: ID
            {
            ID98=(Token)match(input,ID,FOLLOW_ID_in_typedef_name906);  
            stream_ID.add(ID98);


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
            // 180:7: -> ^( TYPEDEF_NAME ID )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:180:10: ^( TYPEDEF_NAME ID )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:182:1: typedef_declaration_element_wrapper : typedef_declaration_element -> ^( TYPEDEF_ELEMENT typedef_declaration_element ) ;
    public final ObjchParser.typedef_declaration_element_wrapper_return typedef_declaration_element_wrapper() throws RecognitionException {
        ObjchParser.typedef_declaration_element_wrapper_return retval = new ObjchParser.typedef_declaration_element_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.typedef_declaration_element_return typedef_declaration_element99 =null;


        RewriteRuleSubtreeStream stream_typedef_declaration_element=new RewriteRuleSubtreeStream(adaptor,"rule typedef_declaration_element");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:183:2: ( typedef_declaration_element -> ^( TYPEDEF_ELEMENT typedef_declaration_element ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:183:4: typedef_declaration_element
            {
            pushFollow(FOLLOW_typedef_declaration_element_in_typedef_declaration_element_wrapper923);
            typedef_declaration_element99=typedef_declaration_element();

            state._fsp--;

            stream_typedef_declaration_element.add(typedef_declaration_element99.getTree());

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
            // 183:32: -> ^( TYPEDEF_ELEMENT typedef_declaration_element )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:183:35: ^( TYPEDEF_ELEMENT typedef_declaration_element )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:186:1: typedef_declaration_element : ( ID ( '=' element_value )? | element_value ( '=' element_value )? );
    public final ObjchParser.typedef_declaration_element_return typedef_declaration_element() throws RecognitionException {
        ObjchParser.typedef_declaration_element_return retval = new ObjchParser.typedef_declaration_element_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID100=null;
        Token char_literal101=null;
        Token char_literal104=null;
        ObjchParser.element_value_return element_value102 =null;

        ObjchParser.element_value_return element_value103 =null;

        ObjchParser.element_value_return element_value105 =null;


        Object ID100_tree=null;
        Object char_literal101_tree=null;
        Object char_literal104_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:187:2: ( ID ( '=' element_value )? | element_value ( '=' element_value )? )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==ID) ) {
                alt36=1;
            }
            else if ( (LA36_0==NUMBER||LA36_0==46) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }
            switch (alt36) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:187:4: ID ( '=' element_value )?
                    {
                    root_0 = (Object)adaptor.nil();


                    ID100=(Token)match(input,ID,FOLLOW_ID_in_typedef_declaration_element943); 
                    ID100_tree = 
                    (Object)adaptor.create(ID100)
                    ;
                    adaptor.addChild(root_0, ID100_tree);


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:187:7: ( '=' element_value )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==57) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:187:8: '=' element_value
                            {
                            char_literal101=(Token)match(input,57,FOLLOW_57_in_typedef_declaration_element946); 
                            char_literal101_tree = 
                            (Object)adaptor.create(char_literal101)
                            ;
                            adaptor.addChild(root_0, char_literal101_tree);


                            pushFollow(FOLLOW_element_value_in_typedef_declaration_element948);
                            element_value102=element_value();

                            state._fsp--;

                            adaptor.addChild(root_0, element_value102.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:188:4: element_value ( '=' element_value )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_element_value_in_typedef_declaration_element955);
                    element_value103=element_value();

                    state._fsp--;

                    adaptor.addChild(root_0, element_value103.getTree());

                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:188:18: ( '=' element_value )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==57) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:188:19: '=' element_value
                            {
                            char_literal104=(Token)match(input,57,FOLLOW_57_in_typedef_declaration_element958); 
                            char_literal104_tree = 
                            (Object)adaptor.create(char_literal104)
                            ;
                            adaptor.addChild(root_0, char_literal104_tree);


                            pushFollow(FOLLOW_element_value_in_typedef_declaration_element960);
                            element_value105=element_value();

                            state._fsp--;

                            adaptor.addChild(root_0, element_value105.getTree());

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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:191:1: element_value : simple_expression -> ^( VALUE simple_expression ) ;
    public final ObjchParser.element_value_return element_value() throws RecognitionException {
        ObjchParser.element_value_return retval = new ObjchParser.element_value_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.simple_expression_return simple_expression106 =null;


        RewriteRuleSubtreeStream stream_simple_expression=new RewriteRuleSubtreeStream(adaptor,"rule simple_expression");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:192:2: ( simple_expression -> ^( VALUE simple_expression ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:192:4: simple_expression
            {
            pushFollow(FOLLOW_simple_expression_in_element_value974);
            simple_expression106=simple_expression();

            state._fsp--;

            stream_simple_expression.add(simple_expression106.getTree());

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
            // 192:22: -> ^( VALUE simple_expression )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:192:25: ^( VALUE simple_expression )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:195:1: simple_expression : simple_expression2 ( op2 simple_expression2 )* ;
    public final ObjchParser.simple_expression_return simple_expression() throws RecognitionException {
        ObjchParser.simple_expression_return retval = new ObjchParser.simple_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.simple_expression2_return simple_expression2107 =null;

        ObjchParser.op2_return op2108 =null;

        ObjchParser.simple_expression2_return simple_expression2109 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:196:2: ( simple_expression2 ( op2 simple_expression2 )* )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:196:4: simple_expression2 ( op2 simple_expression2 )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_simple_expression2_in_simple_expression995);
            simple_expression2107=simple_expression2();

            state._fsp--;

            adaptor.addChild(root_0, simple_expression2107.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:196:23: ( op2 simple_expression2 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0 >= 44 && LA37_0 <= 45)||LA37_0==56||LA37_0==59||LA37_0==91) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:196:25: op2 simple_expression2
            	    {
            	    pushFollow(FOLLOW_op2_in_simple_expression999);
            	    op2108=op2();

            	    state._fsp--;

            	    adaptor.addChild(root_0, op2108.getTree());

            	    pushFollow(FOLLOW_simple_expression2_in_simple_expression1001);
            	    simple_expression2109=simple_expression2();

            	    state._fsp--;

            	    adaptor.addChild(root_0, simple_expression2109.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:199:1: simple_expression2 : ( ID | NUMBER | '(' simple_expression ')' );
    public final ObjchParser.simple_expression2_return simple_expression2() throws RecognitionException {
        ObjchParser.simple_expression2_return retval = new ObjchParser.simple_expression2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID110=null;
        Token NUMBER111=null;
        Token char_literal112=null;
        Token char_literal114=null;
        ObjchParser.simple_expression_return simple_expression113 =null;


        Object ID110_tree=null;
        Object NUMBER111_tree=null;
        Object char_literal112_tree=null;
        Object char_literal114_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:200:2: ( ID | NUMBER | '(' simple_expression ')' )
            int alt38=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt38=1;
                }
                break;
            case NUMBER:
                {
                alt38=2;
                }
                break;
            case 46:
                {
                alt38=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }

            switch (alt38) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:200:4: ID
                    {
                    root_0 = (Object)adaptor.nil();


                    ID110=(Token)match(input,ID,FOLLOW_ID_in_simple_expression21015); 
                    ID110_tree = 
                    (Object)adaptor.create(ID110)
                    ;
                    adaptor.addChild(root_0, ID110_tree);


                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:201:4: NUMBER
                    {
                    root_0 = (Object)adaptor.nil();


                    NUMBER111=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_simple_expression21020); 
                    NUMBER111_tree = 
                    (Object)adaptor.create(NUMBER111)
                    ;
                    adaptor.addChild(root_0, NUMBER111_tree);


                    }
                    break;
                case 3 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:202:4: '(' simple_expression ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal112=(Token)match(input,46,FOLLOW_46_in_simple_expression21025); 
                    char_literal112_tree = 
                    (Object)adaptor.create(char_literal112)
                    ;
                    adaptor.addChild(root_0, char_literal112_tree);


                    pushFollow(FOLLOW_simple_expression_in_simple_expression21027);
                    simple_expression113=simple_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, simple_expression113.getTree());

                    char_literal114=(Token)match(input,47,FOLLOW_47_in_simple_expression21029); 
                    char_literal114_tree = 
                    (Object)adaptor.create(char_literal114)
                    ;
                    adaptor.addChild(root_0, char_literal114_tree);


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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:204:1: op2 : ( '|' | '&~' | '&' | '<<' | '>>' );
    public final ObjchParser.op2_return op2() throws RecognitionException {
        ObjchParser.op2_return retval = new ObjchParser.op2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set115=null;

        Object set115_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:204:5: ( '|' | '&~' | '&' | '<<' | '>>' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:
            {
            root_0 = (Object)adaptor.nil();


            set115=(Token)input.LT(1);

            if ( (input.LA(1) >= 44 && input.LA(1) <= 45)||input.LA(1)==56||input.LA(1)==59||input.LA(1)==91 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set115)
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:206:1: class_declaration : '@class' ID ( ',' ID )* ';' ;
    public final ObjchParser.class_declaration_return class_declaration() throws RecognitionException {
        ObjchParser.class_declaration_return retval = new ObjchParser.class_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal116=null;
        Token ID117=null;
        Token char_literal118=null;
        Token ID119=null;
        Token char_literal120=null;

        Object string_literal116_tree=null;
        Object ID117_tree=null;
        Object char_literal118_tree=null;
        Object ID119_tree=null;
        Object char_literal120_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:207:2: ( '@class' ID ( ',' ID )* ';' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:207:4: '@class' ID ( ',' ID )* ';'
            {
            root_0 = (Object)adaptor.nil();


            string_literal116=(Token)match(input,60,FOLLOW_60_in_class_declaration1064); 
            string_literal116_tree = 
            (Object)adaptor.create(string_literal116)
            ;
            adaptor.addChild(root_0, string_literal116_tree);


            ID117=(Token)match(input,ID,FOLLOW_ID_in_class_declaration1066); 
            ID117_tree = 
            (Object)adaptor.create(ID117)
            ;
            adaptor.addChild(root_0, ID117_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:207:16: ( ',' ID )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==50) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:207:17: ',' ID
            	    {
            	    char_literal118=(Token)match(input,50,FOLLOW_50_in_class_declaration1069); 
            	    char_literal118_tree = 
            	    (Object)adaptor.create(char_literal118)
            	    ;
            	    adaptor.addChild(root_0, char_literal118_tree);


            	    ID119=(Token)match(input,ID,FOLLOW_ID_in_class_declaration1071); 
            	    ID119_tree = 
            	    (Object)adaptor.create(ID119)
            	    ;
            	    adaptor.addChild(root_0, ID119_tree);


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            char_literal120=(Token)match(input,54,FOLLOW_54_in_class_declaration1075); 
            char_literal120_tree = 
            (Object)adaptor.create(char_literal120)
            ;
            adaptor.addChild(root_0, char_literal120_tree);


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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:209:1: protocol_declaration : '@protocol' protocol_name ( generic )? protocol_end ;
    public final ObjchParser.protocol_declaration_return protocol_declaration() throws RecognitionException {
        ObjchParser.protocol_declaration_return retval = new ObjchParser.protocol_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal121=null;
        ObjchParser.protocol_name_return protocol_name122 =null;

        ObjchParser.generic_return generic123 =null;

        ObjchParser.protocol_end_return protocol_end124 =null;


        Object string_literal121_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:210:2: ( '@protocol' protocol_name ( generic )? protocol_end )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:210:4: '@protocol' protocol_name ( generic )? protocol_end
            {
            root_0 = (Object)adaptor.nil();


            string_literal121=(Token)match(input,67,FOLLOW_67_in_protocol_declaration1085); 
            string_literal121_tree = 
            (Object)adaptor.create(string_literal121)
            ;
            adaptor.addChild(root_0, string_literal121_tree);


            pushFollow(FOLLOW_protocol_name_in_protocol_declaration1087);
            protocol_name122=protocol_name();

            state._fsp--;

            adaptor.addChild(root_0, protocol_name122.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:210:30: ( generic )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==55) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:210:30: generic
                    {
                    pushFollow(FOLLOW_generic_in_protocol_declaration1089);
                    generic123=generic();

                    state._fsp--;

                    adaptor.addChild(root_0, generic123.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_protocol_end_in_protocol_declaration1095);
            protocol_end124=protocol_end();

            state._fsp--;

            adaptor.addChild(root_0, protocol_end124.getTree());

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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:214:1: protocol_end : ( protocol_end1 | protocol_end2 );
    public final ObjchParser.protocol_end_return protocol_end() throws RecognitionException {
        ObjchParser.protocol_end_return retval = new ObjchParser.protocol_end_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.protocol_end1_return protocol_end1125 =null;

        ObjchParser.protocol_end2_return protocol_end2126 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:215:2: ( protocol_end1 | protocol_end2 )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==ID||LA41_0==49||LA41_0==51||LA41_0==61||LA41_0==63||LA41_0==65||LA41_0==69||LA41_0==73||LA41_0==75||LA41_0==77||(LA41_0 >= 80 && LA41_0 <= 81)||(LA41_0 >= 86 && LA41_0 <= 87)||LA41_0==89) ) {
                alt41=1;
            }
            else if ( (LA41_0==54) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;

            }
            switch (alt41) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:215:4: protocol_end1
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_protocol_end1_in_protocol_end1107);
                    protocol_end1125=protocol_end1();

                    state._fsp--;

                    adaptor.addChild(root_0, protocol_end1125.getTree());

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:216:4: protocol_end2
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_protocol_end2_in_protocol_end1112);
                    protocol_end2126=protocol_end2();

                    state._fsp--;

                    adaptor.addChild(root_0, protocol_end2126.getTree());

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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:218:1: protocol_end1 : ( declarations )* '@end' ;
    public final ObjchParser.protocol_end1_return protocol_end1() throws RecognitionException {
        ObjchParser.protocol_end1_return retval = new ObjchParser.protocol_end1_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal128=null;
        ObjchParser.declarations_return declarations127 =null;


        Object string_literal128_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:219:2: ( ( declarations )* '@end' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:219:4: ( declarations )* '@end'
            {
            root_0 = (Object)adaptor.nil();


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:219:4: ( declarations )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==ID||LA42_0==49||LA42_0==51||LA42_0==63||LA42_0==65||LA42_0==69||LA42_0==73||LA42_0==75||LA42_0==77||(LA42_0 >= 80 && LA42_0 <= 81)||(LA42_0 >= 86 && LA42_0 <= 87)||LA42_0==89) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:219:4: declarations
            	    {
            	    pushFollow(FOLLOW_declarations_in_protocol_end11121);
            	    declarations127=declarations();

            	    state._fsp--;

            	    adaptor.addChild(root_0, declarations127.getTree());

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            string_literal128=(Token)match(input,61,FOLLOW_61_in_protocol_end11126); 
            string_literal128_tree = 
            (Object)adaptor.create(string_literal128)
            ;
            adaptor.addChild(root_0, string_literal128_tree);


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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:223:1: protocol_end2 : ';' ;
    public final ObjchParser.protocol_end2_return protocol_end2() throws RecognitionException {
        ObjchParser.protocol_end2_return retval = new ObjchParser.protocol_end2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal129=null;

        Object char_literal129_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:224:2: ( ';' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:224:4: ';'
            {
            root_0 = (Object)adaptor.nil();


            char_literal129=(Token)match(input,54,FOLLOW_54_in_protocol_end21138); 
            char_literal129_tree = 
            (Object)adaptor.create(char_literal129)
            ;
            adaptor.addChild(root_0, char_literal129_tree);


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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:228:1: generic : '<' generic_internal '>' ;
    public final ObjchParser.generic_return generic() throws RecognitionException {
        ObjchParser.generic_return retval = new ObjchParser.generic_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal130=null;
        Token char_literal132=null;
        ObjchParser.generic_internal_return generic_internal131 =null;


        Object char_literal130_tree=null;
        Object char_literal132_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:228:9: ( '<' generic_internal '>' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:228:11: '<' generic_internal '>'
            {
            root_0 = (Object)adaptor.nil();


            char_literal130=(Token)match(input,55,FOLLOW_55_in_generic1151); 
            char_literal130_tree = 
            (Object)adaptor.create(char_literal130)
            ;
            adaptor.addChild(root_0, char_literal130_tree);


            pushFollow(FOLLOW_generic_internal_in_generic1153);
            generic_internal131=generic_internal();

            state._fsp--;

            adaptor.addChild(root_0, generic_internal131.getTree());

            char_literal132=(Token)match(input,58,FOLLOW_58_in_generic1155); 
            char_literal132_tree = 
            (Object)adaptor.create(char_literal132)
            ;
            adaptor.addChild(root_0, char_literal132_tree);


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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:230:1: generic_internal : type_declaration ( ',' type_declaration )* ;
    public final ObjchParser.generic_internal_return generic_internal() throws RecognitionException {
        ObjchParser.generic_internal_return retval = new ObjchParser.generic_internal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal134=null;
        ObjchParser.type_declaration_return type_declaration133 =null;

        ObjchParser.type_declaration_return type_declaration135 =null;


        Object char_literal134_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:231:2: ( type_declaration ( ',' type_declaration )* )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:231:4: type_declaration ( ',' type_declaration )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_declaration_in_generic_internal1164);
            type_declaration133=type_declaration();

            state._fsp--;

            adaptor.addChild(root_0, type_declaration133.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:231:21: ( ',' type_declaration )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==50) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:231:22: ',' type_declaration
            	    {
            	    char_literal134=(Token)match(input,50,FOLLOW_50_in_generic_internal1167); 
            	    char_literal134_tree = 
            	    (Object)adaptor.create(char_literal134)
            	    ;
            	    adaptor.addChild(root_0, char_literal134_tree);


            	    pushFollow(FOLLOW_type_declaration_in_generic_internal1169);
            	    type_declaration135=type_declaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, type_declaration135.getTree());

            	    }
            	    break;

            	default :
            	    break loop43;
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:233:1: protocol_name : ID -> ^( NAME ID ) ;
    public final ObjchParser.protocol_name_return protocol_name() throws RecognitionException {
        ObjchParser.protocol_name_return retval = new ObjchParser.protocol_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID136=null;

        Object ID136_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:234:2: ( ID -> ^( NAME ID ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:234:4: ID
            {
            ID136=(Token)match(input,ID,FOLLOW_ID_in_protocol_name1181);  
            stream_ID.add(ID136);


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
            // 234:7: -> ^( NAME ID )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:234:10: ^( NAME ID )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:236:1: interface_declaration : '@interface' interface_name ( ':' superclass_name )? ( interface_body )? ( declarations )* '@end' ;
    public final ObjchParser.interface_declaration_return interface_declaration() throws RecognitionException {
        ObjchParser.interface_declaration_return retval = new ObjchParser.interface_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal137=null;
        Token char_literal139=null;
        Token string_literal143=null;
        ObjchParser.interface_name_return interface_name138 =null;

        ObjchParser.superclass_name_return superclass_name140 =null;

        ObjchParser.interface_body_return interface_body141 =null;

        ObjchParser.declarations_return declarations142 =null;


        Object string_literal137_tree=null;
        Object char_literal139_tree=null;
        Object string_literal143_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:237:2: ( '@interface' interface_name ( ':' superclass_name )? ( interface_body )? ( declarations )* '@end' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:237:4: '@interface' interface_name ( ':' superclass_name )? ( interface_body )? ( declarations )* '@end'
            {
            root_0 = (Object)adaptor.nil();


            string_literal137=(Token)match(input,62,FOLLOW_62_in_interface_declaration1201); 
            string_literal137_tree = 
            (Object)adaptor.create(string_literal137)
            ;
            adaptor.addChild(root_0, string_literal137_tree);


            pushFollow(FOLLOW_interface_name_in_interface_declaration1203);
            interface_name138=interface_name();

            state._fsp--;

            adaptor.addChild(root_0, interface_name138.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:237:32: ( ':' superclass_name )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==53) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:237:33: ':' superclass_name
                    {
                    char_literal139=(Token)match(input,53,FOLLOW_53_in_interface_declaration1206); 
                    char_literal139_tree = 
                    (Object)adaptor.create(char_literal139)
                    ;
                    adaptor.addChild(root_0, char_literal139_tree);


                    pushFollow(FOLLOW_superclass_name_in_interface_declaration1208);
                    superclass_name140=superclass_name();

                    state._fsp--;

                    adaptor.addChild(root_0, superclass_name140.getTree());

                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:238:2: ( interface_body )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==90) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:238:2: interface_body
                    {
                    pushFollow(FOLLOW_interface_body_in_interface_declaration1213);
                    interface_body141=interface_body();

                    state._fsp--;

                    adaptor.addChild(root_0, interface_body141.getTree());

                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:239:2: ( declarations )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==ID||LA46_0==49||LA46_0==51||LA46_0==63||LA46_0==65||LA46_0==69||LA46_0==73||LA46_0==75||LA46_0==77||(LA46_0 >= 80 && LA46_0 <= 81)||(LA46_0 >= 86 && LA46_0 <= 87)||LA46_0==89) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:239:2: declarations
            	    {
            	    pushFollow(FOLLOW_declarations_in_interface_declaration1217);
            	    declarations142=declarations();

            	    state._fsp--;

            	    adaptor.addChild(root_0, declarations142.getTree());

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            string_literal143=(Token)match(input,61,FOLLOW_61_in_interface_declaration1221); 
            string_literal143_tree = 
            (Object)adaptor.create(string_literal143)
            ;
            adaptor.addChild(root_0, string_literal143_tree);


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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:243:1: interface_body : '{' ( interface_body_item )* '}' ;
    public final ObjchParser.interface_body_return interface_body() throws RecognitionException {
        ObjchParser.interface_body_return retval = new ObjchParser.interface_body_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal144=null;
        Token char_literal146=null;
        ObjchParser.interface_body_item_return interface_body_item145 =null;


        Object char_literal144_tree=null;
        Object char_literal146_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:244:2: ( '{' ( interface_body_item )* '}' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:245:2: '{' ( interface_body_item )* '}'
            {
            root_0 = (Object)adaptor.nil();


            char_literal144=(Token)match(input,90,FOLLOW_90_in_interface_body1234); 
            char_literal144_tree = 
            (Object)adaptor.create(char_literal144)
            ;
            adaptor.addChild(root_0, char_literal144_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:246:3: ( interface_body_item )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==ID||LA47_0==64||LA47_0==66||LA47_0==68||LA47_0==73||LA47_0==75||LA47_0==77||(LA47_0 >= 80 && LA47_0 <= 81)||(LA47_0 >= 86 && LA47_0 <= 89)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:246:3: interface_body_item
            	    {
            	    pushFollow(FOLLOW_interface_body_item_in_interface_body1238);
            	    interface_body_item145=interface_body_item();

            	    state._fsp--;

            	    adaptor.addChild(root_0, interface_body_item145.getTree());

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            char_literal146=(Token)match(input,92,FOLLOW_92_in_interface_body1242); 
            char_literal146_tree = 
            (Object)adaptor.create(char_literal146)
            ;
            adaptor.addChild(root_0, char_literal146_tree);


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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:250:1: interface_body_item : ( group_modifier_wrapper ( simple_fields_declaration )? | simple_fields_declaration | union_declaration_wrapper ';' );
    public final ObjchParser.interface_body_item_return interface_body_item() throws RecognitionException {
        ObjchParser.interface_body_item_return retval = new ObjchParser.interface_body_item_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal151=null;
        ObjchParser.group_modifier_wrapper_return group_modifier_wrapper147 =null;

        ObjchParser.simple_fields_declaration_return simple_fields_declaration148 =null;

        ObjchParser.simple_fields_declaration_return simple_fields_declaration149 =null;

        ObjchParser.union_declaration_wrapper_return union_declaration_wrapper150 =null;


        Object char_literal151_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:251:2: ( group_modifier_wrapper ( simple_fields_declaration )? | simple_fields_declaration | union_declaration_wrapper ';' )
            int alt49=3;
            switch ( input.LA(1) ) {
            case 64:
            case 66:
            case 68:
                {
                alt49=1;
                }
                break;
            case ID:
            case 73:
            case 75:
            case 77:
            case 80:
            case 81:
            case 86:
            case 87:
            case 89:
                {
                alt49=2;
                }
                break;
            case 88:
                {
                alt49=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;

            }

            switch (alt49) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:251:4: group_modifier_wrapper ( simple_fields_declaration )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_group_modifier_wrapper_in_interface_body_item1254);
                    group_modifier_wrapper147=group_modifier_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, group_modifier_wrapper147.getTree());

                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:251:27: ( simple_fields_declaration )?
                    int alt48=2;
                    alt48 = dfa48.predict(input);
                    switch (alt48) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:251:27: simple_fields_declaration
                            {
                            pushFollow(FOLLOW_simple_fields_declaration_in_interface_body_item1256);
                            simple_fields_declaration148=simple_fields_declaration();

                            state._fsp--;

                            adaptor.addChild(root_0, simple_fields_declaration148.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:252:4: simple_fields_declaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_simple_fields_declaration_in_interface_body_item1262);
                    simple_fields_declaration149=simple_fields_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, simple_fields_declaration149.getTree());

                    }
                    break;
                case 3 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:253:4: union_declaration_wrapper ';'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_union_declaration_wrapper_in_interface_body_item1267);
                    union_declaration_wrapper150=union_declaration_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, union_declaration_wrapper150.getTree());

                    char_literal151=(Token)match(input,54,FOLLOW_54_in_interface_body_item1269); 
                    char_literal151_tree = 
                    (Object)adaptor.create(char_literal151)
                    ;
                    adaptor.addChild(root_0, char_literal151_tree);


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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:256:1: union_name : ID -> ^( NAME ID ) ;
    public final ObjchParser.union_name_return union_name() throws RecognitionException {
        ObjchParser.union_name_return retval = new ObjchParser.union_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID152=null;

        Object ID152_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:257:2: ( ID -> ^( NAME ID ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:257:4: ID
            {
            ID152=(Token)match(input,ID,FOLLOW_ID_in_union_name1280);  
            stream_ID.add(ID152);


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
            // 257:7: -> ^( NAME ID )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:257:10: ^( NAME ID )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:259:1: group_modifier_wrapper : group_modifier -> ^( GROUP_MODIFIER group_modifier ) ;
    public final ObjchParser.group_modifier_wrapper_return group_modifier_wrapper() throws RecognitionException {
        ObjchParser.group_modifier_wrapper_return retval = new ObjchParser.group_modifier_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.group_modifier_return group_modifier153 =null;


        RewriteRuleSubtreeStream stream_group_modifier=new RewriteRuleSubtreeStream(adaptor,"rule group_modifier");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:260:2: ( group_modifier -> ^( GROUP_MODIFIER group_modifier ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:260:4: group_modifier
            {
            pushFollow(FOLLOW_group_modifier_in_group_modifier_wrapper1299);
            group_modifier153=group_modifier();

            state._fsp--;

            stream_group_modifier.add(group_modifier153.getTree());

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
            // 260:19: -> ^( GROUP_MODIFIER group_modifier )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:260:22: ^( GROUP_MODIFIER group_modifier )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:262:1: group_modifier : ( '@private' | '@protected' | '@public' );
    public final ObjchParser.group_modifier_return group_modifier() throws RecognitionException {
        ObjchParser.group_modifier_return retval = new ObjchParser.group_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set154=null;

        Object set154_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:263:2: ( '@private' | '@protected' | '@public' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:
            {
            root_0 = (Object)adaptor.nil();


            set154=(Token)input.LT(1);

            if ( input.LA(1)==64||input.LA(1)==66||input.LA(1)==68 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set154)
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:265:1: interface_name : ID ( category )? -> ^( INTERFACE_NAME ID ( category )? ) ;
    public final ObjchParser.interface_name_return interface_name() throws RecognitionException {
        ObjchParser.interface_name_return retval = new ObjchParser.interface_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID155=null;
        ObjchParser.category_return category156 =null;


        Object ID155_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_category=new RewriteRuleSubtreeStream(adaptor,"rule category");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:266:2: ( ID ( category )? -> ^( INTERFACE_NAME ID ( category )? ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:266:4: ID ( category )?
            {
            ID155=(Token)match(input,ID,FOLLOW_ID_in_interface_name1338);  
            stream_ID.add(ID155);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:266:7: ( category )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==46) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:266:7: category
                    {
                    pushFollow(FOLLOW_category_in_interface_name1340);
                    category156=category();

                    state._fsp--;

                    stream_category.add(category156.getTree());

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
            // 266:17: -> ^( INTERFACE_NAME ID ( category )? )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:266:20: ^( INTERFACE_NAME ID ( category )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INTERFACE_NAME, "INTERFACE_NAME")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:266:40: ( category )?
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:268:1: category : '(' ID ')' -> ^( CATEGORY ID ) ;
    public final ObjchParser.category_return category() throws RecognitionException {
        ObjchParser.category_return retval = new ObjchParser.category_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal157=null;
        Token ID158=null;
        Token char_literal159=null;

        Object char_literal157_tree=null;
        Object ID158_tree=null;
        Object char_literal159_tree=null;
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:268:9: ( '(' ID ')' -> ^( CATEGORY ID ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:268:11: '(' ID ')'
            {
            char_literal157=(Token)match(input,46,FOLLOW_46_in_category1359);  
            stream_46.add(char_literal157);


            ID158=(Token)match(input,ID,FOLLOW_ID_in_category1361);  
            stream_ID.add(ID158);


            char_literal159=(Token)match(input,47,FOLLOW_47_in_category1363);  
            stream_47.add(char_literal159);


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
            // 268:22: -> ^( CATEGORY ID )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:268:25: ^( CATEGORY ID )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:270:1: superclass_name : ID ( generic )? -> ^( SUPERCLASS_NAME ID ( generic )? ) ;
    public final ObjchParser.superclass_name_return superclass_name() throws RecognitionException {
        ObjchParser.superclass_name_return retval = new ObjchParser.superclass_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID160=null;
        ObjchParser.generic_return generic161 =null;


        Object ID160_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_generic=new RewriteRuleSubtreeStream(adaptor,"rule generic");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:271:2: ( ID ( generic )? -> ^( SUPERCLASS_NAME ID ( generic )? ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:271:4: ID ( generic )?
            {
            ID160=(Token)match(input,ID,FOLLOW_ID_in_superclass_name1380);  
            stream_ID.add(ID160);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:271:7: ( generic )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==55) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:271:7: generic
                    {
                    pushFollow(FOLLOW_generic_in_superclass_name1382);
                    generic161=generic();

                    state._fsp--;

                    stream_generic.add(generic161.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: generic, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 271:16: -> ^( SUPERCLASS_NAME ID ( generic )? )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:271:19: ^( SUPERCLASS_NAME ID ( generic )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SUPERCLASS_NAME, "SUPERCLASS_NAME")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:271:40: ( generic )?
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:273:1: simple_fields_declaration : ( field_declaration_wrapper )+ -> ^( FIELDS ( field_declaration_wrapper )+ ) ;
    public final ObjchParser.simple_fields_declaration_return simple_fields_declaration() throws RecognitionException {
        ObjchParser.simple_fields_declaration_return retval = new ObjchParser.simple_fields_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.field_declaration_wrapper_return field_declaration_wrapper162 =null;


        RewriteRuleSubtreeStream stream_field_declaration_wrapper=new RewriteRuleSubtreeStream(adaptor,"rule field_declaration_wrapper");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:274:2: ( ( field_declaration_wrapper )+ -> ^( FIELDS ( field_declaration_wrapper )+ ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:274:4: ( field_declaration_wrapper )+
            {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:274:4: ( field_declaration_wrapper )+
            int cnt52=0;
            loop52:
            do {
                int alt52=2;
                switch ( input.LA(1) ) {
                case 73:
                    {
                    alt52=1;
                    }
                    break;
                case 75:
                    {
                    alt52=1;
                    }
                    break;
                case 77:
                    {
                    alt52=1;
                    }
                    break;
                case 87:
                    {
                    alt52=1;
                    }
                    break;
                case 86:
                    {
                    alt52=1;
                    }
                    break;
                case 89:
                    {
                    alt52=1;
                    }
                    break;
                case 80:
                    {
                    alt52=1;
                    }
                    break;
                case 81:
                    {
                    alt52=1;
                    }
                    break;
                case ID:
                    {
                    alt52=1;
                    }
                    break;

                }

                switch (alt52) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:274:4: field_declaration_wrapper
            	    {
            	    pushFollow(FOLLOW_field_declaration_wrapper_in_simple_fields_declaration1404);
            	    field_declaration_wrapper162=field_declaration_wrapper();

            	    state._fsp--;

            	    stream_field_declaration_wrapper.add(field_declaration_wrapper162.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt52 >= 1 ) break loop52;
                        EarlyExitException eee =
                            new EarlyExitException(52, input);
                        throw eee;
                }
                cnt52++;
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
            // 274:31: -> ^( FIELDS ( field_declaration_wrapper )+ )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:274:34: ^( FIELDS ( field_declaration_wrapper )+ )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:276:1: field_declaration : ( '__weak' )? type_declaration ( ( field_name ( classical_method_params | ( ',' field_name )* ) ) | func_pointer ) ';' ;
    public final ObjchParser.field_declaration_return field_declaration() throws RecognitionException {
        ObjchParser.field_declaration_return retval = new ObjchParser.field_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal163=null;
        Token char_literal167=null;
        Token char_literal170=null;
        ObjchParser.type_declaration_return type_declaration164 =null;

        ObjchParser.field_name_return field_name165 =null;

        ObjchParser.classical_method_params_return classical_method_params166 =null;

        ObjchParser.field_name_return field_name168 =null;

        ObjchParser.func_pointer_return func_pointer169 =null;


        Object string_literal163_tree=null;
        Object char_literal167_tree=null;
        Object char_literal170_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:277:2: ( ( '__weak' )? type_declaration ( ( field_name ( classical_method_params | ( ',' field_name )* ) ) | func_pointer ) ';' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:277:4: ( '__weak' )? type_declaration ( ( field_name ( classical_method_params | ( ',' field_name )* ) ) | func_pointer ) ';'
            {
            root_0 = (Object)adaptor.nil();


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:277:4: ( '__weak' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==73) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:277:4: '__weak'
                    {
                    string_literal163=(Token)match(input,73,FOLLOW_73_in_field_declaration1424); 
                    string_literal163_tree = 
                    (Object)adaptor.create(string_literal163)
                    ;
                    adaptor.addChild(root_0, string_literal163_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_type_declaration_in_field_declaration1427);
            type_declaration164=type_declaration();

            state._fsp--;

            adaptor.addChild(root_0, type_declaration164.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:277:31: ( ( field_name ( classical_method_params | ( ',' field_name )* ) ) | func_pointer )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==ID) ) {
                alt56=1;
            }
            else if ( (LA56_0==46) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;

            }
            switch (alt56) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:277:32: ( field_name ( classical_method_params | ( ',' field_name )* ) )
                    {
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:277:32: ( field_name ( classical_method_params | ( ',' field_name )* ) )
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:277:33: field_name ( classical_method_params | ( ',' field_name )* )
                    {
                    pushFollow(FOLLOW_field_name_in_field_declaration1431);
                    field_name165=field_name();

                    state._fsp--;

                    adaptor.addChild(root_0, field_name165.getTree());

                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:277:44: ( classical_method_params | ( ',' field_name )* )
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==46) ) {
                        alt55=1;
                    }
                    else if ( (LA55_0==50||LA55_0==54) ) {
                        alt55=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 0, input);

                        throw nvae;

                    }
                    switch (alt55) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:277:45: classical_method_params
                            {
                            pushFollow(FOLLOW_classical_method_params_in_field_declaration1434);
                            classical_method_params166=classical_method_params();

                            state._fsp--;

                            adaptor.addChild(root_0, classical_method_params166.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:277:71: ( ',' field_name )*
                            {
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:277:71: ( ',' field_name )*
                            loop54:
                            do {
                                int alt54=2;
                                int LA54_0 = input.LA(1);

                                if ( (LA54_0==50) ) {
                                    alt54=1;
                                }


                                switch (alt54) {
                            	case 1 :
                            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:277:72: ',' field_name
                            	    {
                            	    char_literal167=(Token)match(input,50,FOLLOW_50_in_field_declaration1439); 
                            	    char_literal167_tree = 
                            	    (Object)adaptor.create(char_literal167)
                            	    ;
                            	    adaptor.addChild(root_0, char_literal167_tree);


                            	    pushFollow(FOLLOW_field_name_in_field_declaration1441);
                            	    field_name168=field_name();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, field_name168.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop54;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:277:93: func_pointer
                    {
                    pushFollow(FOLLOW_func_pointer_in_field_declaration1449);
                    func_pointer169=func_pointer();

                    state._fsp--;

                    adaptor.addChild(root_0, func_pointer169.getTree());

                    }
                    break;

            }


            char_literal170=(Token)match(input,54,FOLLOW_54_in_field_declaration1452); 
            char_literal170_tree = 
            (Object)adaptor.create(char_literal170)
            ;
            adaptor.addChild(root_0, char_literal170_tree);


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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:279:1: classical_method_params : '(' ( classical_param ( ',' classical_param )* )? ')' ( attribute )? ;
    public final ObjchParser.classical_method_params_return classical_method_params() throws RecognitionException {
        ObjchParser.classical_method_params_return retval = new ObjchParser.classical_method_params_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal171=null;
        Token char_literal173=null;
        Token char_literal175=null;
        ObjchParser.classical_param_return classical_param172 =null;

        ObjchParser.classical_param_return classical_param174 =null;

        ObjchParser.attribute_return attribute176 =null;


        Object char_literal171_tree=null;
        Object char_literal173_tree=null;
        Object char_literal175_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:280:2: ( '(' ( classical_param ( ',' classical_param )* )? ')' ( attribute )? )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:280:4: '(' ( classical_param ( ',' classical_param )* )? ')' ( attribute )?
            {
            root_0 = (Object)adaptor.nil();


            char_literal171=(Token)match(input,46,FOLLOW_46_in_classical_method_params1462); 
            char_literal171_tree = 
            (Object)adaptor.create(char_literal171)
            ;
            adaptor.addChild(root_0, char_literal171_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:280:8: ( classical_param ( ',' classical_param )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==ID||LA58_0==52||LA58_0==75||LA58_0==77||(LA58_0 >= 80 && LA58_0 <= 81)||(LA58_0 >= 86 && LA58_0 <= 87)||LA58_0==89) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:280:9: classical_param ( ',' classical_param )*
                    {
                    pushFollow(FOLLOW_classical_param_in_classical_method_params1465);
                    classical_param172=classical_param();

                    state._fsp--;

                    adaptor.addChild(root_0, classical_param172.getTree());

                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:280:25: ( ',' classical_param )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==50) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:280:26: ',' classical_param
                    	    {
                    	    char_literal173=(Token)match(input,50,FOLLOW_50_in_classical_method_params1468); 
                    	    char_literal173_tree = 
                    	    (Object)adaptor.create(char_literal173)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal173_tree);


                    	    pushFollow(FOLLOW_classical_param_in_classical_method_params1470);
                    	    classical_param174=classical_param();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, classical_param174.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);


                    }
                    break;

            }


            char_literal175=(Token)match(input,47,FOLLOW_47_in_classical_method_params1476); 
            char_literal175_tree = 
            (Object)adaptor.create(char_literal175)
            ;
            adaptor.addChild(root_0, char_literal175_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:280:54: ( attribute )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==72) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:280:54: attribute
                    {
                    pushFollow(FOLLOW_attribute_in_classical_method_params1478);
                    attribute176=attribute();

                    state._fsp--;

                    adaptor.addChild(root_0, attribute176.getTree());

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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:283:1: attribute : '__attribute__' '(' attribute_internal ')' ;
    public final ObjchParser.attribute_return attribute() throws RecognitionException {
        ObjchParser.attribute_return retval = new ObjchParser.attribute_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal177=null;
        Token char_literal178=null;
        Token char_literal180=null;
        ObjchParser.attribute_internal_return attribute_internal179 =null;


        Object string_literal177_tree=null;
        Object char_literal178_tree=null;
        Object char_literal180_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:284:2: ( '__attribute__' '(' attribute_internal ')' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:284:4: '__attribute__' '(' attribute_internal ')'
            {
            root_0 = (Object)adaptor.nil();


            string_literal177=(Token)match(input,72,FOLLOW_72_in_attribute1492); 
            string_literal177_tree = 
            (Object)adaptor.create(string_literal177)
            ;
            adaptor.addChild(root_0, string_literal177_tree);


            char_literal178=(Token)match(input,46,FOLLOW_46_in_attribute1494); 
            char_literal178_tree = 
            (Object)adaptor.create(char_literal178)
            ;
            adaptor.addChild(root_0, char_literal178_tree);


            pushFollow(FOLLOW_attribute_internal_in_attribute1496);
            attribute_internal179=attribute_internal();

            state._fsp--;

            adaptor.addChild(root_0, attribute_internal179.getTree());

            char_literal180=(Token)match(input,47,FOLLOW_47_in_attribute1498); 
            char_literal180_tree = 
            (Object)adaptor.create(char_literal180)
            ;
            adaptor.addChild(root_0, char_literal180_tree);


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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:286:1: attribute_internal : attribute_internal1 ;
    public final ObjchParser.attribute_internal_return attribute_internal() throws RecognitionException {
        ObjchParser.attribute_internal_return retval = new ObjchParser.attribute_internal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.attribute_internal1_return attribute_internal1181 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:287:2: ( attribute_internal1 )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:287:4: attribute_internal1
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_attribute_internal1_in_attribute_internal1509);
            attribute_internal1181=attribute_internal1();

            state._fsp--;

            adaptor.addChild(root_0, attribute_internal1181.getTree());

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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:289:1: attribute_internal1 : '(' 'format' '(' ( format_item ( ',' format_item )* )? ')' ')' ;
    public final ObjchParser.attribute_internal1_return attribute_internal1() throws RecognitionException {
        ObjchParser.attribute_internal1_return retval = new ObjchParser.attribute_internal1_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal182=null;
        Token string_literal183=null;
        Token char_literal184=null;
        Token char_literal186=null;
        Token char_literal188=null;
        Token char_literal189=null;
        ObjchParser.format_item_return format_item185 =null;

        ObjchParser.format_item_return format_item187 =null;


        Object char_literal182_tree=null;
        Object string_literal183_tree=null;
        Object char_literal184_tree=null;
        Object char_literal186_tree=null;
        Object char_literal188_tree=null;
        Object char_literal189_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:290:2: ( '(' 'format' '(' ( format_item ( ',' format_item )* )? ')' ')' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:290:4: '(' 'format' '(' ( format_item ( ',' format_item )* )? ')' ')'
            {
            root_0 = (Object)adaptor.nil();


            char_literal182=(Token)match(input,46,FOLLOW_46_in_attribute_internal11519); 
            char_literal182_tree = 
            (Object)adaptor.create(char_literal182)
            ;
            adaptor.addChild(root_0, char_literal182_tree);


            string_literal183=(Token)match(input,79,FOLLOW_79_in_attribute_internal11521); 
            string_literal183_tree = 
            (Object)adaptor.create(string_literal183)
            ;
            adaptor.addChild(root_0, string_literal183_tree);


            char_literal184=(Token)match(input,46,FOLLOW_46_in_attribute_internal11523); 
            char_literal184_tree = 
            (Object)adaptor.create(char_literal184)
            ;
            adaptor.addChild(root_0, char_literal184_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:290:21: ( format_item ( ',' format_item )* )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==ID||LA61_0==NUMBER) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:290:23: format_item ( ',' format_item )*
                    {
                    pushFollow(FOLLOW_format_item_in_attribute_internal11526);
                    format_item185=format_item();

                    state._fsp--;

                    adaptor.addChild(root_0, format_item185.getTree());

                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:290:35: ( ',' format_item )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==50) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:290:36: ',' format_item
                    	    {
                    	    char_literal186=(Token)match(input,50,FOLLOW_50_in_attribute_internal11529); 
                    	    char_literal186_tree = 
                    	    (Object)adaptor.create(char_literal186)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal186_tree);


                    	    pushFollow(FOLLOW_format_item_in_attribute_internal11531);
                    	    format_item187=format_item();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, format_item187.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);


                    }
                    break;

            }


            char_literal188=(Token)match(input,47,FOLLOW_47_in_attribute_internal11537); 
            char_literal188_tree = 
            (Object)adaptor.create(char_literal188)
            ;
            adaptor.addChild(root_0, char_literal188_tree);


            char_literal189=(Token)match(input,47,FOLLOW_47_in_attribute_internal11539); 
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
    // $ANTLR end "attribute_internal1"


    public static class format_item_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "format_item"
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:292:2: format_item : ( ID | NUMBER );
    public final ObjchParser.format_item_return format_item() throws RecognitionException {
        ObjchParser.format_item_return retval = new ObjchParser.format_item_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set190=null;

        Object set190_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:293:2: ( ID | NUMBER )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:
            {
            root_0 = (Object)adaptor.nil();


            set190=(Token)input.LT(1);

            if ( input.LA(1)==ID||input.LA(1)==NUMBER ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set190)
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:295:1: classical_param : ( type_declaration ID ( '[' ( NUMBER )? ']' )* | '...' );
    public final ObjchParser.classical_param_return classical_param() throws RecognitionException {
        ObjchParser.classical_param_return retval = new ObjchParser.classical_param_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID192=null;
        Token char_literal193=null;
        Token NUMBER194=null;
        Token char_literal195=null;
        Token string_literal196=null;
        ObjchParser.type_declaration_return type_declaration191 =null;


        Object ID192_tree=null;
        Object char_literal193_tree=null;
        Object NUMBER194_tree=null;
        Object char_literal195_tree=null;
        Object string_literal196_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:296:2: ( type_declaration ID ( '[' ( NUMBER )? ']' )* | '...' )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==ID||LA64_0==75||LA64_0==77||(LA64_0 >= 80 && LA64_0 <= 81)||(LA64_0 >= 86 && LA64_0 <= 87)||LA64_0==89) ) {
                alt64=1;
            }
            else if ( (LA64_0==52) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;

            }
            switch (alt64) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:296:4: type_declaration ID ( '[' ( NUMBER )? ']' )*
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_type_declaration_in_classical_param1564);
                    type_declaration191=type_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, type_declaration191.getTree());

                    ID192=(Token)match(input,ID,FOLLOW_ID_in_classical_param1566); 
                    ID192_tree = 
                    (Object)adaptor.create(ID192)
                    ;
                    adaptor.addChild(root_0, ID192_tree);


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:296:24: ( '[' ( NUMBER )? ']' )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==70) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:296:25: '[' ( NUMBER )? ']'
                    	    {
                    	    char_literal193=(Token)match(input,70,FOLLOW_70_in_classical_param1569); 
                    	    char_literal193_tree = 
                    	    (Object)adaptor.create(char_literal193)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal193_tree);


                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:296:29: ( NUMBER )?
                    	    int alt62=2;
                    	    int LA62_0 = input.LA(1);

                    	    if ( (LA62_0==NUMBER) ) {
                    	        alt62=1;
                    	    }
                    	    switch (alt62) {
                    	        case 1 :
                    	            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:296:29: NUMBER
                    	            {
                    	            NUMBER194=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_classical_param1571); 
                    	            NUMBER194_tree = 
                    	            (Object)adaptor.create(NUMBER194)
                    	            ;
                    	            adaptor.addChild(root_0, NUMBER194_tree);


                    	            }
                    	            break;

                    	    }


                    	    char_literal195=(Token)match(input,71,FOLLOW_71_in_classical_param1574); 
                    	    char_literal195_tree = 
                    	    (Object)adaptor.create(char_literal195)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal195_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:297:4: '...'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal196=(Token)match(input,52,FOLLOW_52_in_classical_param1581); 
                    string_literal196_tree = 
                    (Object)adaptor.create(string_literal196)
                    ;
                    adaptor.addChild(root_0, string_literal196_tree);


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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:299:1: type_declaration : ( 'const' )? ( 'enum' )? ( 'typedef' )? ( 'struct' )? ( ( 'unsigned' ( type_dec )? ) | type_dec ) ( 'const' )? ( generic )? ( '*' )? -> ^( TYPE type_dec ( generic )? ( '*' )? ) ;
    public final ObjchParser.type_declaration_return type_declaration() throws RecognitionException {
        ObjchParser.type_declaration_return retval = new ObjchParser.type_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal197=null;
        Token string_literal198=null;
        Token string_literal199=null;
        Token string_literal200=null;
        Token string_literal201=null;
        Token string_literal204=null;
        Token char_literal206=null;
        ObjchParser.type_dec_return type_dec202 =null;

        ObjchParser.type_dec_return type_dec203 =null;

        ObjchParser.generic_return generic205 =null;


        Object string_literal197_tree=null;
        Object string_literal198_tree=null;
        Object string_literal199_tree=null;
        Object string_literal200_tree=null;
        Object string_literal201_tree=null;
        Object string_literal204_tree=null;
        Object char_literal206_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_generic=new RewriteRuleSubtreeStream(adaptor,"rule generic");
        RewriteRuleSubtreeStream stream_type_dec=new RewriteRuleSubtreeStream(adaptor,"rule type_dec");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:300:2: ( ( 'const' )? ( 'enum' )? ( 'typedef' )? ( 'struct' )? ( ( 'unsigned' ( type_dec )? ) | type_dec ) ( 'const' )? ( generic )? ( '*' )? -> ^( TYPE type_dec ( generic )? ( '*' )? ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:300:4: ( 'const' )? ( 'enum' )? ( 'typedef' )? ( 'struct' )? ( ( 'unsigned' ( type_dec )? ) | type_dec ) ( 'const' )? ( generic )? ( '*' )?
            {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:300:4: ( 'const' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==75) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:300:4: 'const'
                    {
                    string_literal197=(Token)match(input,75,FOLLOW_75_in_type_declaration1593);  
                    stream_75.add(string_literal197);


                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:300:13: ( 'enum' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==77) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:300:13: 'enum'
                    {
                    string_literal198=(Token)match(input,77,FOLLOW_77_in_type_declaration1596);  
                    stream_77.add(string_literal198);


                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:300:21: ( 'typedef' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==87) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:300:21: 'typedef'
                    {
                    string_literal199=(Token)match(input,87,FOLLOW_87_in_type_declaration1599);  
                    stream_87.add(string_literal199);


                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:300:32: ( 'struct' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==86) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:300:32: 'struct'
                    {
                    string_literal200=(Token)match(input,86,FOLLOW_86_in_type_declaration1602);  
                    stream_86.add(string_literal200);


                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:300:42: ( ( 'unsigned' ( type_dec )? ) | type_dec )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==89) ) {
                alt70=1;
            }
            else if ( (LA70_0==ID||(LA70_0 >= 80 && LA70_0 <= 81)) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;

            }
            switch (alt70) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:300:43: ( 'unsigned' ( type_dec )? )
                    {
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:300:43: ( 'unsigned' ( type_dec )? )
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:300:44: 'unsigned' ( type_dec )?
                    {
                    string_literal201=(Token)match(input,89,FOLLOW_89_in_type_declaration1607);  
                    stream_89.add(string_literal201);


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:300:55: ( type_dec )?
                    int alt69=2;
                    alt69 = dfa69.predict(input);
                    switch (alt69) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:300:55: type_dec
                            {
                            pushFollow(FOLLOW_type_dec_in_type_declaration1609);
                            type_dec202=type_dec();

                            state._fsp--;

                            stream_type_dec.add(type_dec202.getTree());

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:300:68: type_dec
                    {
                    pushFollow(FOLLOW_type_dec_in_type_declaration1615);
                    type_dec203=type_dec();

                    state._fsp--;

                    stream_type_dec.add(type_dec203.getTree());

                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:300:78: ( 'const' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==75) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:300:78: 'const'
                    {
                    string_literal204=(Token)match(input,75,FOLLOW_75_in_type_declaration1618);  
                    stream_75.add(string_literal204);


                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:300:87: ( generic )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==55) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:300:87: generic
                    {
                    pushFollow(FOLLOW_generic_in_type_declaration1621);
                    generic205=generic();

                    state._fsp--;

                    stream_generic.add(generic205.getTree());

                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:300:96: ( '*' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==48) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:300:96: '*'
                    {
                    char_literal206=(Token)match(input,48,FOLLOW_48_in_type_declaration1624);  
                    stream_48.add(char_literal206);


                    }
                    break;

            }


            // AST REWRITE
            // elements: 48, generic, type_dec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 300:101: -> ^( TYPE type_dec ( generic )? ( '*' )? )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:300:104: ^( TYPE type_dec ( generic )? ( '*' )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TYPE, "TYPE")
                , root_1);

                adaptor.addChild(root_1, stream_type_dec.nextTree());

                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:300:120: ( generic )?
                if ( stream_generic.hasNext() ) {
                    adaptor.addChild(root_1, stream_generic.nextTree());

                }
                stream_generic.reset();

                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:300:129: ( '*' )?
                if ( stream_48.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_48.nextNode()
                    );

                }
                stream_48.reset();

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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:302:1: type_dec : type_dec_internal ( '[' ']' )* ;
    public final ObjchParser.type_dec_return type_dec() throws RecognitionException {
        ObjchParser.type_dec_return retval = new ObjchParser.type_dec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal208=null;
        Token char_literal209=null;
        ObjchParser.type_dec_internal_return type_dec_internal207 =null;


        Object char_literal208_tree=null;
        Object char_literal209_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:302:9: ( type_dec_internal ( '[' ']' )* )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:302:11: type_dec_internal ( '[' ']' )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_dec_internal_in_type_dec1647);
            type_dec_internal207=type_dec_internal();

            state._fsp--;

            adaptor.addChild(root_0, type_dec_internal207.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:302:29: ( '[' ']' )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==70) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:302:30: '[' ']'
            	    {
            	    char_literal208=(Token)match(input,70,FOLLOW_70_in_type_dec1650); 
            	    char_literal208_tree = 
            	    (Object)adaptor.create(char_literal208)
            	    ;
            	    adaptor.addChild(root_0, char_literal208_tree);


            	    char_literal209=(Token)match(input,71,FOLLOW_71_in_type_dec1652); 
            	    char_literal209_tree = 
            	    (Object)adaptor.create(char_literal209)
            	    ;
            	    adaptor.addChild(root_0, char_literal209_tree);


            	    }
            	    break;

            	default :
            	    break loop74;
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:305:1: type_dec_internal : ( knownTypes | ID );
    public final ObjchParser.type_dec_internal_return type_dec_internal() throws RecognitionException {
        ObjchParser.type_dec_internal_return retval = new ObjchParser.type_dec_internal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID211=null;
        ObjchParser.knownTypes_return knownTypes210 =null;


        Object ID211_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:306:2: ( knownTypes | ID )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( ((LA75_0 >= 80 && LA75_0 <= 81)) ) {
                alt75=1;
            }
            else if ( (LA75_0==ID) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;

            }
            switch (alt75) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:306:4: knownTypes
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_knownTypes_in_type_dec_internal1667);
                    knownTypes210=knownTypes();

                    state._fsp--;

                    adaptor.addChild(root_0, knownTypes210.getTree());

                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:307:5: ID
                    {
                    root_0 = (Object)adaptor.nil();


                    ID211=(Token)match(input,ID,FOLLOW_ID_in_type_dec_internal1674); 
                    ID211_tree = 
                    (Object)adaptor.create(ID211)
                    ;
                    adaptor.addChild(root_0, ID211_tree);


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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:310:1: knownTypes : ( 'int' | ( 'long' )+ ( 'int' )? );
    public final ObjchParser.knownTypes_return knownTypes() throws RecognitionException {
        ObjchParser.knownTypes_return retval = new ObjchParser.knownTypes_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal212=null;
        Token string_literal213=null;
        Token string_literal214=null;

        Object string_literal212_tree=null;
        Object string_literal213_tree=null;
        Object string_literal214_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:311:2: ( 'int' | ( 'long' )+ ( 'int' )? )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==80) ) {
                alt78=1;
            }
            else if ( (LA78_0==81) ) {
                alt78=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;

            }
            switch (alt78) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:311:4: 'int'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal212=(Token)match(input,80,FOLLOW_80_in_knownTypes1685); 
                    string_literal212_tree = 
                    (Object)adaptor.create(string_literal212)
                    ;
                    adaptor.addChild(root_0, string_literal212_tree);


                    }
                    break;
                case 2 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:312:4: ( 'long' )+ ( 'int' )?
                    {
                    root_0 = (Object)adaptor.nil();


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:312:4: ( 'long' )+
                    int cnt76=0;
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==81) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:312:4: 'long'
                    	    {
                    	    string_literal213=(Token)match(input,81,FOLLOW_81_in_knownTypes1690); 
                    	    string_literal213_tree = 
                    	    (Object)adaptor.create(string_literal213)
                    	    ;
                    	    adaptor.addChild(root_0, string_literal213_tree);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt76 >= 1 ) break loop76;
                                EarlyExitException eee =
                                    new EarlyExitException(76, input);
                                throw eee;
                        }
                        cnt76++;
                    } while (true);


                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:312:12: ( 'int' )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==80) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:312:12: 'int'
                            {
                            string_literal214=(Token)match(input,80,FOLLOW_80_in_knownTypes1693); 
                            string_literal214_tree = 
                            (Object)adaptor.create(string_literal214)
                            ;
                            adaptor.addChild(root_0, string_literal214_tree);


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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:315:1: field_name : ID ( array_size )? ( field_crap )? -> ^( FIELD_NAME ID ( array_size )? ) ;
    public final ObjchParser.field_name_return field_name() throws RecognitionException {
        ObjchParser.field_name_return retval = new ObjchParser.field_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID215=null;
        ObjchParser.array_size_return array_size216 =null;

        ObjchParser.field_crap_return field_crap217 =null;


        Object ID215_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_array_size=new RewriteRuleSubtreeStream(adaptor,"rule array_size");
        RewriteRuleSubtreeStream stream_field_crap=new RewriteRuleSubtreeStream(adaptor,"rule field_crap");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:316:2: ( ID ( array_size )? ( field_crap )? -> ^( FIELD_NAME ID ( array_size )? ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:316:4: ID ( array_size )? ( field_crap )?
            {
            ID215=(Token)match(input,ID,FOLLOW_ID_in_field_name1706);  
            stream_ID.add(ID215);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:316:7: ( array_size )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==70) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:316:7: array_size
                    {
                    pushFollow(FOLLOW_array_size_in_field_name1708);
                    array_size216=array_size();

                    state._fsp--;

                    stream_array_size.add(array_size216.getTree());

                    }
                    break;

            }


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:316:19: ( field_crap )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==53) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:316:20: field_crap
                    {
                    pushFollow(FOLLOW_field_crap_in_field_name1712);
                    field_crap217=field_crap();

                    state._fsp--;

                    stream_field_crap.add(field_crap217.getTree());

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
            // 316:33: -> ^( FIELD_NAME ID ( array_size )? )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:316:36: ^( FIELD_NAME ID ( array_size )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FIELD_NAME, "FIELD_NAME")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:316:52: ( array_size )?
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:318:1: array_size : '[' ( NUMBER )? ']' ;
    public final ObjchParser.array_size_return array_size() throws RecognitionException {
        ObjchParser.array_size_return retval = new ObjchParser.array_size_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal218=null;
        Token NUMBER219=null;
        Token char_literal220=null;

        Object char_literal218_tree=null;
        Object NUMBER219_tree=null;
        Object char_literal220_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:319:2: ( '[' ( NUMBER )? ']' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:319:4: '[' ( NUMBER )? ']'
            {
            root_0 = (Object)adaptor.nil();


            char_literal218=(Token)match(input,70,FOLLOW_70_in_array_size1737); 
            char_literal218_tree = 
            (Object)adaptor.create(char_literal218)
            ;
            adaptor.addChild(root_0, char_literal218_tree);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:319:8: ( NUMBER )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==NUMBER) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:319:8: NUMBER
                    {
                    NUMBER219=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_array_size1739); 
                    NUMBER219_tree = 
                    (Object)adaptor.create(NUMBER219)
                    ;
                    adaptor.addChild(root_0, NUMBER219_tree);


                    }
                    break;

            }


            char_literal220=(Token)match(input,71,FOLLOW_71_in_array_size1742); 
            char_literal220_tree = 
            (Object)adaptor.create(char_literal220)
            ;
            adaptor.addChild(root_0, char_literal220_tree);


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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:321:1: field_crap : ':' NUMBER ;
    public final ObjchParser.field_crap_return field_crap() throws RecognitionException {
        ObjchParser.field_crap_return retval = new ObjchParser.field_crap_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal221=null;
        Token NUMBER222=null;

        Object char_literal221_tree=null;
        Object NUMBER222_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:322:2: ( ':' NUMBER )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:322:4: ':' NUMBER
            {
            root_0 = (Object)adaptor.nil();


            char_literal221=(Token)match(input,53,FOLLOW_53_in_field_crap1751); 
            char_literal221_tree = 
            (Object)adaptor.create(char_literal221)
            ;
            adaptor.addChild(root_0, char_literal221_tree);


            NUMBER222=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_field_crap1753); 
            NUMBER222_tree = 
            (Object)adaptor.create(NUMBER222)
            ;
            adaptor.addChild(root_0, NUMBER222_tree);


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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:324:1: method_declaration : method_modifier_wrapper method_declaration_variants ;
    public final ObjchParser.method_declaration_return method_declaration() throws RecognitionException {
        ObjchParser.method_declaration_return retval = new ObjchParser.method_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.method_modifier_wrapper_return method_modifier_wrapper223 =null;

        ObjchParser.method_declaration_variants_return method_declaration_variants224 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:325:2: ( method_modifier_wrapper method_declaration_variants )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:325:4: method_modifier_wrapper method_declaration_variants
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_method_modifier_wrapper_in_method_declaration1763);
            method_modifier_wrapper223=method_modifier_wrapper();

            state._fsp--;

            adaptor.addChild(root_0, method_modifier_wrapper223.getTree());

            pushFollow(FOLLOW_method_declaration_variants_in_method_declaration1765);
            method_declaration_variants224=method_declaration_variants();

            state._fsp--;

            adaptor.addChild(root_0, method_declaration_variants224.getTree());

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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:327:1: method_modifier_wrapper : method_modifier -> ^( MODIFIER method_modifier ) ;
    public final ObjchParser.method_modifier_wrapper_return method_modifier_wrapper() throws RecognitionException {
        ObjchParser.method_modifier_wrapper_return retval = new ObjchParser.method_modifier_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.method_modifier_return method_modifier225 =null;


        RewriteRuleSubtreeStream stream_method_modifier=new RewriteRuleSubtreeStream(adaptor,"rule method_modifier");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:328:2: ( method_modifier -> ^( MODIFIER method_modifier ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:328:4: method_modifier
            {
            pushFollow(FOLLOW_method_modifier_in_method_modifier_wrapper1775);
            method_modifier225=method_modifier();

            state._fsp--;

            stream_method_modifier.add(method_modifier225.getTree());

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
            // 328:20: -> ^( MODIFIER method_modifier )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:328:23: ^( MODIFIER method_modifier )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:330:1: method_modifier : ( '+' | '-' );
    public final ObjchParser.method_modifier_return method_modifier() throws RecognitionException {
        ObjchParser.method_modifier_return retval = new ObjchParser.method_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set226=null;

        Object set226_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:331:2: ( '+' | '-' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:
            {
            root_0 = (Object)adaptor.nil();


            set226=(Token)input.LT(1);

            if ( input.LA(1)==49||input.LA(1)==51 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set226)
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:333:1: method_declaration_variants : method_declaration_common ;
    public final ObjchParser.method_declaration_variants_return method_declaration_variants() throws RecognitionException {
        ObjchParser.method_declaration_variants_return retval = new ObjchParser.method_declaration_variants_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.method_declaration_common_return method_declaration_common227 =null;



        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:334:2: ( method_declaration_common )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:337:4: method_declaration_common
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_method_declaration_common_in_method_declaration_variants1813);
            method_declaration_common227=method_declaration_common();

            state._fsp--;

            adaptor.addChild(root_0, method_declaration_common227.getTree());

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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:339:1: method_declaration_common : ( '(' type_declaration ')' )? method_name ( method_params )? ';' ;
    public final ObjchParser.method_declaration_common_return method_declaration_common() throws RecognitionException {
        ObjchParser.method_declaration_common_return retval = new ObjchParser.method_declaration_common_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal228=null;
        Token char_literal230=null;
        Token char_literal233=null;
        ObjchParser.type_declaration_return type_declaration229 =null;

        ObjchParser.method_name_return method_name231 =null;

        ObjchParser.method_params_return method_params232 =null;


        Object char_literal228_tree=null;
        Object char_literal230_tree=null;
        Object char_literal233_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:340:2: ( ( '(' type_declaration ')' )? method_name ( method_params )? ';' )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:340:4: ( '(' type_declaration ')' )? method_name ( method_params )? ';'
            {
            root_0 = (Object)adaptor.nil();


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:340:4: ( '(' type_declaration ')' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==46) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:340:5: '(' type_declaration ')'
                    {
                    char_literal228=(Token)match(input,46,FOLLOW_46_in_method_declaration_common1824); 
                    char_literal228_tree = 
                    (Object)adaptor.create(char_literal228)
                    ;
                    adaptor.addChild(root_0, char_literal228_tree);


                    pushFollow(FOLLOW_type_declaration_in_method_declaration_common1826);
                    type_declaration229=type_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, type_declaration229.getTree());

                    char_literal230=(Token)match(input,47,FOLLOW_47_in_method_declaration_common1828); 
                    char_literal230_tree = 
                    (Object)adaptor.create(char_literal230)
                    ;
                    adaptor.addChild(root_0, char_literal230_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_method_name_in_method_declaration_common1832);
            method_name231=method_name();

            state._fsp--;

            adaptor.addChild(root_0, method_name231.getTree());

            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:340:44: ( method_params )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==ID||LA83_0==53) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:340:44: method_params
                    {
                    pushFollow(FOLLOW_method_params_in_method_declaration_common1834);
                    method_params232=method_params();

                    state._fsp--;

                    adaptor.addChild(root_0, method_params232.getTree());

                    }
                    break;

            }


            char_literal233=(Token)match(input,54,FOLLOW_54_in_method_declaration_common1837); 
            char_literal233_tree = 
            (Object)adaptor.create(char_literal233)
            ;
            adaptor.addChild(root_0, char_literal233_tree);


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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:379:1: method_name : ( ID -> ^( METHOD_NAME ID ) | property_prefix_param -> ^( METHOD_NAME property_prefix_param ) );
    public final ObjchParser.method_name_return method_name() throws RecognitionException {
        ObjchParser.method_name_return retval = new ObjchParser.method_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID234=null;
        ObjchParser.property_prefix_param_return property_prefix_param235 =null;


        Object ID234_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_property_prefix_param=new RewriteRuleSubtreeStream(adaptor,"rule property_prefix_param");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:380:2: ( ID -> ^( METHOD_NAME ID ) | property_prefix_param -> ^( METHOD_NAME property_prefix_param ) )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==ID) ) {
                alt84=1;
            }
            else if ( (LA84_0==74||LA84_0==76||(LA84_0 >= 82 && LA84_0 <= 85)) ) {
                alt84=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;

            }
            switch (alt84) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:380:4: ID
                    {
                    ID234=(Token)match(input,ID,FOLLOW_ID_in_method_name1851);  
                    stream_ID.add(ID234);


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
                    // 380:7: -> ^( METHOD_NAME ID )
                    {
                        // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:380:10: ^( METHOD_NAME ID )
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
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:382:4: property_prefix_param
                    {
                    pushFollow(FOLLOW_property_prefix_param_in_method_name1865);
                    property_prefix_param235=property_prefix_param();

                    state._fsp--;

                    stream_property_prefix_param.add(property_prefix_param235.getTree());

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
                    // 382:26: -> ^( METHOD_NAME property_prefix_param )
                    {
                        // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:382:29: ^( METHOD_NAME property_prefix_param )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:384:1: method_params : ( method_param )+ -> ^( METHOD_PARAMS ( method_param )+ ) ;
    public final ObjchParser.method_params_return method_params() throws RecognitionException {
        ObjchParser.method_params_return retval = new ObjchParser.method_params_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.method_param_return method_param236 =null;


        RewriteRuleSubtreeStream stream_method_param=new RewriteRuleSubtreeStream(adaptor,"rule method_param");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:385:2: ( ( method_param )+ -> ^( METHOD_PARAMS ( method_param )+ ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:385:4: ( method_param )+
            {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:385:4: ( method_param )+
            int cnt85=0;
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==ID||LA85_0==53) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:385:4: method_param
            	    {
            	    pushFollow(FOLLOW_method_param_in_method_params1884);
            	    method_param236=method_param();

            	    state._fsp--;

            	    stream_method_param.add(method_param236.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt85 >= 1 ) break loop85;
                        EarlyExitException eee =
                            new EarlyExitException(85, input);
                        throw eee;
                }
                cnt85++;
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
            // 385:18: -> ^( METHOD_PARAMS ( method_param )+ )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:385:21: ^( METHOD_PARAMS ( method_param )+ )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:387:1: method_param : ( prefix )? ':' ( '(' type_declaration ')' )? param_name -> ^( METHOD_PARAM ( prefix )? ':' '(' type_declaration ')' param_name ) ;
    public final ObjchParser.method_param_return method_param() throws RecognitionException {
        ObjchParser.method_param_return retval = new ObjchParser.method_param_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal238=null;
        Token char_literal239=null;
        Token char_literal241=null;
        ObjchParser.prefix_return prefix237 =null;

        ObjchParser.type_declaration_return type_declaration240 =null;

        ObjchParser.param_name_return param_name242 =null;


        Object char_literal238_tree=null;
        Object char_literal239_tree=null;
        Object char_literal241_tree=null;
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_prefix=new RewriteRuleSubtreeStream(adaptor,"rule prefix");
        RewriteRuleSubtreeStream stream_param_name=new RewriteRuleSubtreeStream(adaptor,"rule param_name");
        RewriteRuleSubtreeStream stream_type_declaration=new RewriteRuleSubtreeStream(adaptor,"rule type_declaration");
        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:388:2: ( ( prefix )? ':' ( '(' type_declaration ')' )? param_name -> ^( METHOD_PARAM ( prefix )? ':' '(' type_declaration ')' param_name ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:388:4: ( prefix )? ':' ( '(' type_declaration ')' )? param_name
            {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:388:4: ( prefix )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==ID) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:388:4: prefix
                    {
                    pushFollow(FOLLOW_prefix_in_method_param1903);
                    prefix237=prefix();

                    state._fsp--;

                    stream_prefix.add(prefix237.getTree());

                    }
                    break;

            }


            char_literal238=(Token)match(input,53,FOLLOW_53_in_method_param1906);  
            stream_53.add(char_literal238);


            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:388:16: ( '(' type_declaration ')' )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==46) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:388:17: '(' type_declaration ')'
                    {
                    char_literal239=(Token)match(input,46,FOLLOW_46_in_method_param1909);  
                    stream_46.add(char_literal239);


                    pushFollow(FOLLOW_type_declaration_in_method_param1911);
                    type_declaration240=type_declaration();

                    state._fsp--;

                    stream_type_declaration.add(type_declaration240.getTree());

                    char_literal241=(Token)match(input,47,FOLLOW_47_in_method_param1913);  
                    stream_47.add(char_literal241);


                    }
                    break;

            }


            pushFollow(FOLLOW_param_name_in_method_param1917);
            param_name242=param_name();

            state._fsp--;

            stream_param_name.add(param_name242.getTree());

            // AST REWRITE
            // elements: type_declaration, 47, param_name, 53, 46, prefix
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 388:55: -> ^( METHOD_PARAM ( prefix )? ':' '(' type_declaration ')' param_name )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:388:58: ^( METHOD_PARAM ( prefix )? ':' '(' type_declaration ')' param_name )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(METHOD_PARAM, "METHOD_PARAM")
                , root_1);

                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:388:73: ( prefix )?
                if ( stream_prefix.hasNext() ) {
                    adaptor.addChild(root_1, stream_prefix.nextTree());

                }
                stream_prefix.reset();

                adaptor.addChild(root_1, 
                stream_53.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_46.nextNode()
                );

                adaptor.addChild(root_1, stream_type_declaration.nextTree());

                adaptor.addChild(root_1, 
                stream_47.nextNode()
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:390:1: param_name : ( ID -> ^( PARAM_NAME ID ) | 'format' -> ^( PARAM_NAME 'format' ) );
    public final ObjchParser.param_name_return param_name() throws RecognitionException {
        ObjchParser.param_name_return retval = new ObjchParser.param_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID243=null;
        Token string_literal244=null;

        Object ID243_tree=null;
        Object string_literal244_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:391:2: ( ID -> ^( PARAM_NAME ID ) | 'format' -> ^( PARAM_NAME 'format' ) )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==ID) ) {
                alt88=1;
            }
            else if ( (LA88_0==79) ) {
                alt88=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;

            }
            switch (alt88) {
                case 1 :
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:391:4: ID
                    {
                    ID243=(Token)match(input,ID,FOLLOW_ID_in_param_name1947);  
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
                    // 391:7: -> ^( PARAM_NAME ID )
                    {
                        // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:391:10: ^( PARAM_NAME ID )
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
                    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:392:4: 'format'
                    {
                    string_literal244=(Token)match(input,79,FOLLOW_79_in_param_name1960);  
                    stream_79.add(string_literal244);


                    // AST REWRITE
                    // elements: 79
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 392:13: -> ^( PARAM_NAME 'format' )
                    {
                        // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:392:16: ^( PARAM_NAME 'format' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PARAM_NAME, "PARAM_NAME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_79.nextNode()
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:394:1: prefix : ID -> ^( PARAM_PREFIX ID ) ;
    public final ObjchParser.prefix_return prefix() throws RecognitionException {
        ObjchParser.prefix_return retval = new ObjchParser.prefix_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID245=null;

        Object ID245_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:394:8: ( ID -> ^( PARAM_PREFIX ID ) )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:394:10: ID
            {
            ID245=(Token)match(input,ID,FOLLOW_ID_in_prefix1977);  
            stream_ID.add(ID245);


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
            // 394:13: -> ^( PARAM_PREFIX ID )
            {
                // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:394:16: ^( PARAM_PREFIX ID )
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
    // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:396:1: extern_declatation : 'extern' field_declaration ;
    public final ObjchParser.extern_declatation_return extern_declatation() throws RecognitionException {
        ObjchParser.extern_declatation_return retval = new ObjchParser.extern_declatation_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal246=null;
        ObjchParser.field_declaration_return field_declaration247 =null;


        Object string_literal246_tree=null;

        try {
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:397:2: ( 'extern' field_declaration )
            // C:\\sandbox\\objc2j\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:397:4: 'extern' field_declaration
            {
            root_0 = (Object)adaptor.nil();


            string_literal246=(Token)match(input,78,FOLLOW_78_in_extern_declatation1994); 
            string_literal246_tree = 
            (Object)adaptor.create(string_literal246)
            ;
            adaptor.addChild(root_0, string_literal246_tree);


            pushFollow(FOLLOW_field_declaration_in_extern_declatation1996);
            field_declaration247=field_declaration();

            state._fsp--;

            adaptor.addChild(root_0, field_declaration247.getTree());

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
    protected DFA48 dfa48 = new DFA48(this);
    protected DFA69 dfa69 = new DFA69(this);
    static final String DFA2_eotS =
        "\u008f\uffff";
    static final String DFA2_eofS =
        "\23\uffff\1\22\21\uffff\1\22\1\143\150\uffff";
    static final String DFA2_minS =
        "\1\16\1\uffff\2\16\3\uffff\1\16\13\uffff\2\16\4\uffff\1\16\6\uffff"+
        "\1\16\4\uffff\3\16\15\uffff\1\16\6\uffff\1\16\122\uffff";
    static final String DFA2_maxS =
        "\1\131\1\uffff\1\131\1\132\3\uffff\1\132\13\uffff\1\131\1\132\4"+
        "\uffff\1\132\6\uffff\1\132\4\uffff\2\131\1\60\15\uffff\1\131\6\uffff"+
        "\1\132\122\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\2\uffff\1\4\1\5\1\6\1\uffff\1\10\11\uffff\1\2\7\uffff"+
        "\1\3\6\uffff\1\7\55\uffff\2\2\22\uffff\1\2\22\uffff\1\2\2\uffff"+
        "\1\2\2\uffff\2\2\6\uffff\1\2\12\uffff";
    static final String DFA2_specialS =
        "\u008f\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\10\42\uffff\1\10\1\uffff\1\10\10\uffff\1\1\1\uffff\1\5\1"+
            "\10\1\uffff\1\10\1\uffff\1\4\1\uffff\1\10\3\uffff\1\10\1\uffff"+
            "\1\10\1\uffff\1\3\1\6\1\uffff\2\10\4\uffff\1\7\1\2\1\uffff\1"+
            "\10",
            "",
            "\1\23\76\uffff\1\22\2\uffff\2\10\4\uffff\1\24\1\uffff\1\22"+
            "\1\10",
            "\1\31\101\uffff\2\10\4\uffff\2\10\1\uffff\1\10\1\32",
            "",
            "",
            "",
            "\1\40\101\uffff\2\10\7\uffff\1\10\1\41",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\46\37\uffff\1\47\1\uffff\1\45\1\22\1\uffff\1\22\2\uffff"+
            "\1\22\1\10\4\uffff\1\22\1\uffff\2\22\1\uffff\1\22\1\uffff\1"+
            "\22\1\uffff\1\22\1\10\2\uffff\1\22\1\uffff\1\65\1\uffff\2\22"+
            "\1\uffff\2\22\4\uffff\2\22\1\uffff\1\22",
            "\1\74\101\uffff\2\10\7\uffff\1\10\1\22",
            "",
            "",
            "",
            "",
            "\1\10\37\uffff\1\10\1\uffff\1\10\6\uffff\1\10\16\uffff\1\10"+
            "\4\uffff\1\10\16\uffff\1\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\10\37\uffff\1\10\1\uffff\1\10\6\uffff\1\10\16\uffff\1\10"+
            "\4\uffff\1\10\16\uffff\1\41",
            "",
            "",
            "",
            "",
            "\1\117\37\uffff\1\120\2\uffff\1\22\1\uffff\1\22\2\uffff\1\22"+
            "\5\uffff\1\22\1\uffff\2\22\1\uffff\1\22\1\uffff\1\22\1\uffff"+
            "\1\22\3\uffff\1\22\1\uffff\1\22\1\uffff\2\22\1\uffff\2\22\4"+
            "\uffff\2\22\1\uffff\1\22",
            "\1\143\37\uffff\1\171\1\uffff\2\143\1\10\1\143\1\uffff\1\10"+
            "\2\143\4\uffff\1\143\1\uffff\2\143\1\uffff\1\143\1\uffff\1\143"+
            "\1\uffff\1\143\1\166\2\uffff\1\143\1\uffff\1\143\1\uffff\2\143"+
            "\1\uffff\2\143\4\uffff\2\143\1\uffff\1\143",
            "\1\175\41\uffff\1\174",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0084\37\uffff\1\10\1\uffff\1\10\6\uffff\1\10\25\uffff\1"+
            "\143\2\uffff\2\143\4\uffff\2\143\1\uffff\1\143",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\10\37\uffff\1\10\1\uffff\1\10\6\uffff\1\10\16\uffff\1\10"+
            "\4\uffff\1\10\16\uffff\1\143",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "58:1: code_internal : ( class_declaration | typedef_declaration_wrapper | enum_wrapper | protocol_declaration_wrapper | interface_declaration_wrapper | extern_declarations | typedef_struct | declarations );";
        }
    }
    static final String DFA11_eotS =
        "\125\uffff";
    static final String DFA11_eofS =
        "\1\3\1\25\123\uffff";
    static final String DFA11_minS =
        "\2\16\40\uffff\1\16\3\uffff\1\16\13\uffff\1\16\3\uffff\1\33\4\uffff"+
        "\1\16\31\uffff";
    static final String DFA11_maxS =
        "\2\131\40\uffff\1\131\3\uffff\1\113\13\uffff\1\113\3\uffff\1\107"+
        "\4\uffff\1\131\31\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\2\1\3\21\uffff\1\1\51\uffff\1\1\4\uffff\1\1\3\uffff\1"+
        "\1\2\uffff\1\1\11\uffff";
    static final String DFA11_specialS =
        "\125\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\1\37\uffff\1\2\2\uffff\1\3\1\uffff\1\3\2\uffff\1\3\5\uffff"+
            "\1\3\1\uffff\2\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\3\uffff"+
            "\1\3\1\uffff\1\3\1\uffff\2\3\1\uffff\2\3\4\uffff\2\3\1\uffff"+
            "\1\3",
            "\1\46\37\uffff\1\3\1\uffff\1\3\1\25\1\uffff\1\25\2\uffff\1"+
            "\25\1\3\4\uffff\1\25\1\uffff\2\25\1\uffff\1\25\1\uffff\1\25"+
            "\1\uffff\1\25\1\3\2\uffff\1\25\1\uffff\1\42\1\uffff\2\25\1\uffff"+
            "\2\25\4\uffff\2\25\1\uffff\1\25",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\62\37\uffff\1\3\1\uffff\1\3\6\uffff\1\3\25\uffff\1\25\2"+
            "\uffff\2\25\4\uffff\2\25\1\uffff\1\25",
            "",
            "",
            "",
            "\1\25\37\uffff\1\73\1\uffff\1\25\1\uffff\1\3\2\uffff\2\3\1"+
            "\25\16\uffff\1\66\4\uffff\1\25",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\25\37\uffff\1\104\1\uffff\1\25\1\uffff\1\3\2\uffff\2\3\1"+
            "\25\16\uffff\1\77\4\uffff\1\25",
            "",
            "",
            "",
            "\1\3\53\uffff\1\110",
            "",
            "",
            "",
            "",
            "\1\113\40\uffff\1\3\1\25\3\uffff\1\3\26\uffff\1\3\1\uffff\1"+
            "\3\2\uffff\2\3\4\uffff\2\3\1\uffff\1\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "115:31: ( typedef_name | func_pointer )?";
        }
    }
    static final String DFA48_eotS =
        "\u0706\uffff";
    static final String DFA48_eofS =
        "\u0706\uffff";
    static final String DFA48_minS =
        "\12\16\3\uffff\45\16\1\107\3\16\1\56\2\16\1\107\3\16\1\56\2\16\1"+
        "\107\3\16\1\56\36\16\1\107\3\16\1\56\2\16\1\107\3\16\1\56\2\16\1"+
        "\107\3\16\1\56\27\16\1\107\3\16\1\56\2\16\1\107\3\16\1\56\2\16\1"+
        "\107\3\16\1\56\21\16\1\107\3\16\1\56\2\16\1\107\3\16\1\56\2\16\1"+
        "\107\3\16\1\56\14\16\1\107\3\16\1\56\2\16\1\107\3\16\1\56\2\16\1"+
        "\107\3\16\1\56\10\16\1\107\3\16\1\56\2\16\1\107\3\16\1\56\2\16\1"+
        "\107\3\16\1\56\1\16\1\107\3\16\1\56\2\16\1\107\3\16\1\56\2\16\1"+
        "\33\3\16\1\56\1\16\1\33\1\16\1\uffff\2\16\1\56\6\16\3\60\1\56\2"+
        "\16\1\57\3\16\1\56\6\16\3\60\1\56\1\16\2\33\2\16\1\uffff\1\16\1"+
        "\57\1\107\3\16\1\56\4\16\1\56\6\16\3\60\1\56\1\16\2\33\2\16\1\uffff"+
        "\1\16\1\57\1\16\1\107\3\16\1\56\5\16\1\56\6\16\3\60\1\56\1\16\2"+
        "\33\2\16\1\uffff\1\16\1\57\u0590\uffff";
    static final String DFA48_maxS =
        "\1\134\5\131\1\121\1\113\1\121\1\113\3\uffff\4\131\1\121\1\113\1"+
        "\121\1\113\3\131\1\121\1\113\1\121\1\113\2\131\1\121\1\113\1\121"+
        "\1\113\1\131\1\121\1\113\1\121\1\113\1\121\1\113\1\121\2\113\1\121"+
        "\1\113\1\67\1\131\1\56\1\60\1\107\1\67\1\131\1\56\1\106\1\60\1\113"+
        "\1\107\1\67\1\131\1\56\1\106\1\60\1\121\1\107\1\67\1\131\1\56\1"+
        "\106\1\60\3\131\1\121\1\113\1\121\1\113\2\131\1\121\1\113\1\121"+
        "\1\113\1\131\1\121\1\113\1\121\1\113\1\121\1\113\1\121\2\113\1\121"+
        "\1\113\1\67\1\131\1\56\1\60\1\107\1\67\1\131\1\56\1\106\1\60\1\113"+
        "\1\107\1\67\1\131\1\56\1\106\1\60\1\121\1\107\1\67\1\131\1\56\1"+
        "\106\1\60\2\131\1\121\1\113\1\121\1\113\1\131\1\121\1\113\1\121"+
        "\1\113\1\121\1\113\1\121\2\113\1\121\1\113\1\67\1\131\1\56\1\60"+
        "\1\107\1\67\1\131\1\56\1\106\1\60\1\113\1\107\1\67\1\131\1\56\1"+
        "\106\1\60\1\121\1\107\1\67\1\131\1\56\1\106\1\60\1\131\1\121\1\113"+
        "\1\121\1\113\1\121\1\113\1\121\2\113\1\121\1\113\1\67\1\131\1\56"+
        "\1\60\1\107\1\67\1\131\1\56\1\106\1\60\1\113\1\107\1\67\1\131\1"+
        "\56\1\106\1\60\1\121\1\107\1\67\1\131\1\56\1\106\1\60\1\121\1\113"+
        "\1\121\2\113\1\121\1\113\1\67\1\131\1\56\1\60\1\107\1\67\1\131\1"+
        "\56\1\106\1\60\1\113\1\107\1\67\1\131\1\56\1\106\1\60\1\121\1\107"+
        "\1\67\1\131\1\56\1\106\1\60\1\113\1\121\1\113\1\67\1\131\1\56\1"+
        "\60\1\107\1\67\1\131\1\56\1\106\1\60\1\113\1\107\1\67\1\131\1\56"+
        "\1\106\1\60\1\121\1\107\1\67\1\131\1\56\1\106\1\60\1\107\1\67\1"+
        "\131\1\56\1\106\1\60\1\113\1\107\1\67\1\131\1\56\1\106\1\60\1\121"+
        "\1\107\1\67\1\131\1\56\1\106\1\131\1\33\1\16\1\uffff\1\131\1\56"+
        "\1\106\1\60\4\131\1\121\1\113\1\121\1\113\1\106\1\60\1\16\1\57\1"+
        "\113\1\131\1\56\1\106\1\60\4\131\1\121\1\113\1\121\1\113\1\106\1"+
        "\60\1\107\1\33\1\131\1\16\1\uffff\1\16\1\57\1\107\1\67\1\131\1\56"+
        "\1\106\1\60\1\113\1\131\1\56\1\106\1\60\4\131\1\121\1\113\1\121"+
        "\1\113\1\106\1\60\1\107\1\33\1\131\1\16\1\uffff\1\16\1\57\1\113"+
        "\1\107\1\67\1\131\1\56\1\106\1\60\1\121\1\113\1\131\1\56\1\106\1"+
        "\60\4\131\1\121\1\113\1\121\1\113\1\106\1\60\1\107\1\33\1\131\1"+
        "\16\1\uffff\1\16\1\57\u0590\uffff";
    static final String DFA48_acceptS =
        "\12\uffff\1\2\u010a\uffff\1\1\43\uffff\1\1\33\uffff\1\1\35\uffff"+
        "\1\1\2\uffff\u0590\1";
    static final String DFA48_specialS =
        "\u0706\uffff}>";
    static final String[] DFA48_transitionS = {
            "\1\11\61\uffff\1\12\1\uffff\1\12\1\uffff\1\12\4\uffff\1\1\1"+
            "\uffff\1\2\1\uffff\1\3\2\uffff\1\7\1\10\4\uffff\1\5\1\4\1\12"+
            "\1\6\2\uffff\1\12",
            "\1\24\74\uffff\1\15\1\uffff\1\16\2\uffff\1\22\1\23\4\uffff"+
            "\1\20\1\17\1\uffff\1\21",
            "\1\33\76\uffff\1\25\2\uffff\1\31\1\32\4\uffff\1\27\1\26\1\uffff"+
            "\1\30",
            "\1\41\101\uffff\1\37\1\40\4\uffff\1\35\1\34\1\uffff\1\36",
            "\1\46\101\uffff\1\44\1\45\4\uffff\1\42\2\uffff\1\43",
            "\1\52\101\uffff\1\50\1\51\7\uffff\1\47",
            "\1\55\37\uffff\1\61\1\uffff\1\60\6\uffff\1\57\23\uffff\1\56"+
            "\4\uffff\1\53\1\54",
            "\1\66\37\uffff\1\67\1\uffff\1\65\6\uffff\1\64\16\uffff\1\62"+
            "\4\uffff\1\63",
            "\1\75\37\uffff\1\76\1\uffff\1\74\6\uffff\1\73\16\uffff\1\71"+
            "\4\uffff\1\72\4\uffff\1\70\1\77",
            "\1\104\37\uffff\1\105\1\uffff\1\103\6\uffff\1\102\16\uffff"+
            "\1\100\4\uffff\1\101",
            "",
            "",
            "",
            "\1\114\76\uffff\1\106\2\uffff\1\112\1\113\4\uffff\1\110\1\107"+
            "\1\uffff\1\111",
            "\1\122\101\uffff\1\120\1\121\4\uffff\1\116\1\115\1\uffff\1"+
            "\117",
            "\1\127\101\uffff\1\125\1\126\4\uffff\1\123\2\uffff\1\124",
            "\1\133\101\uffff\1\131\1\132\7\uffff\1\130",
            "\1\136\37\uffff\1\142\1\uffff\1\141\6\uffff\1\140\23\uffff"+
            "\1\137\4\uffff\1\134\1\135",
            "\1\147\37\uffff\1\150\1\uffff\1\146\6\uffff\1\145\16\uffff"+
            "\1\143\4\uffff\1\144",
            "\1\156\37\uffff\1\157\1\uffff\1\155\6\uffff\1\154\16\uffff"+
            "\1\152\4\uffff\1\153\4\uffff\1\151\1\160",
            "\1\165\37\uffff\1\166\1\uffff\1\164\6\uffff\1\163\16\uffff"+
            "\1\161\4\uffff\1\162",
            "\1\174\101\uffff\1\172\1\173\4\uffff\1\170\1\167\1\uffff\1"+
            "\171",
            "\1\u0081\101\uffff\1\177\1\u0080\4\uffff\1\175\2\uffff\1\176",
            "\1\u0085\101\uffff\1\u0083\1\u0084\7\uffff\1\u0082",
            "\1\u0088\37\uffff\1\u008c\1\uffff\1\u008b\6\uffff\1\u008a\23"+
            "\uffff\1\u0089\4\uffff\1\u0086\1\u0087",
            "\1\u0091\37\uffff\1\u0092\1\uffff\1\u0090\6\uffff\1\u008f\16"+
            "\uffff\1\u008d\4\uffff\1\u008e",
            "\1\u0098\37\uffff\1\u0099\1\uffff\1\u0097\6\uffff\1\u0096\16"+
            "\uffff\1\u0094\4\uffff\1\u0095\4\uffff\1\u0093\1\u009a",
            "\1\u009f\37\uffff\1\u00a0\1\uffff\1\u009e\6\uffff\1\u009d\16"+
            "\uffff\1\u009b\4\uffff\1\u009c",
            "\1\u00a5\101\uffff\1\u00a3\1\u00a4\4\uffff\1\u00a1\2\uffff"+
            "\1\u00a2",
            "\1\u00a9\101\uffff\1\u00a7\1\u00a8\7\uffff\1\u00a6",
            "\1\u00ac\37\uffff\1\u00b0\1\uffff\1\u00af\6\uffff\1\u00ae\23"+
            "\uffff\1\u00ad\4\uffff\1\u00aa\1\u00ab",
            "\1\u00b5\37\uffff\1\u00b6\1\uffff\1\u00b4\6\uffff\1\u00b3\16"+
            "\uffff\1\u00b1\4\uffff\1\u00b2",
            "\1\u00bc\37\uffff\1\u00bd\1\uffff\1\u00bb\6\uffff\1\u00ba\16"+
            "\uffff\1\u00b8\4\uffff\1\u00b9\4\uffff\1\u00b7\1\u00be",
            "\1\u00c3\37\uffff\1\u00c4\1\uffff\1\u00c2\6\uffff\1\u00c1\16"+
            "\uffff\1\u00bf\4\uffff\1\u00c0",
            "\1\u00c8\101\uffff\1\u00c6\1\u00c7\7\uffff\1\u00c5",
            "\1\u00cb\37\uffff\1\u00cf\1\uffff\1\u00ce\6\uffff\1\u00cd\23"+
            "\uffff\1\u00cc\4\uffff\1\u00c9\1\u00ca",
            "\1\u00d4\37\uffff\1\u00d5\1\uffff\1\u00d3\6\uffff\1\u00d2\16"+
            "\uffff\1\u00d0\4\uffff\1\u00d1",
            "\1\u00db\37\uffff\1\u00dc\1\uffff\1\u00da\6\uffff\1\u00d9\16"+
            "\uffff\1\u00d7\4\uffff\1\u00d8\4\uffff\1\u00d6\1\u00dd",
            "\1\u00e2\37\uffff\1\u00e3\1\uffff\1\u00e1\6\uffff\1\u00e0\16"+
            "\uffff\1\u00de\4\uffff\1\u00df",
            "\1\u00e6\37\uffff\1\u00ea\1\uffff\1\u00e9\6\uffff\1\u00e8\23"+
            "\uffff\1\u00e7\4\uffff\1\u00e4\1\u00e5",
            "\1\u00ef\37\uffff\1\u00f0\1\uffff\1\u00ee\6\uffff\1\u00ed\16"+
            "\uffff\1\u00eb\4\uffff\1\u00ec",
            "\1\u00f6\37\uffff\1\u00f7\1\uffff\1\u00f5\6\uffff\1\u00f4\16"+
            "\uffff\1\u00f2\4\uffff\1\u00f3\4\uffff\1\u00f1\1\u00f8",
            "\1\u00fd\37\uffff\1\u00fe\1\uffff\1\u00fc\6\uffff\1\u00fb\16"+
            "\uffff\1\u00f9\4\uffff\1\u00fa",
            "\1\u0103\37\uffff\1\u0104\1\uffff\1\u0102\6\uffff\1\u0101\16"+
            "\uffff\1\u00ff\4\uffff\1\u0100",
            "\1\u010a\37\uffff\1\u010b\1\uffff\1\u0109\6\uffff\1\u0108\16"+
            "\uffff\1\u0106\4\uffff\1\u0107\4\uffff\1\u0105\1\u010c",
            "\1\u0111\37\uffff\1\u0112\1\uffff\1\u0110\1\uffff\1\u0114\2"+
            "\uffff\1\u0113\1\u0115\1\u010f\16\uffff\1\u010d\4\uffff\1\u010e",
            "\1\u0118\37\uffff\1\u0119\1\uffff\1\u0117\6\uffff\1\u0116",
            "\1\u0121\74\uffff\1\u011a\1\uffff\1\u011b\2\uffff\1\u011f\1"+
            "\u0120\4\uffff\1\u011d\1\u011c\1\uffff\1\u011e",
            "\1\u0122\37\uffff\1\u0123",
            "\1\u0125\41\uffff\1\u0124",
            "\1\u0126",
            "\1\u0129\37\uffff\1\u012a\1\uffff\1\u0128\6\uffff\1\u0127",
            "\1\u0132\74\uffff\1\u012b\1\uffff\1\u012c\2\uffff\1\u0130\1"+
            "\u0131\4\uffff\1\u012e\1\u012d\1\uffff\1\u012f",
            "\1\u0133\37\uffff\1\u0134",
            "\1\u0137\3\uffff\1\u0138\2\uffff\1\u0136\1\u0139\17\uffff\1"+
            "\u0135",
            "\1\u013b\41\uffff\1\u013a",
            "\1\u0140\37\uffff\1\u0141\1\uffff\1\u013f\6\uffff\1\u013e\16"+
            "\uffff\1\u013c\4\uffff\1\u013d",
            "\1\u0142",
            "\1\u0145\37\uffff\1\u0146\1\uffff\1\u0144\6\uffff\1\u0143",
            "\1\u014e\74\uffff\1\u0147\1\uffff\1\u0148\2\uffff\1\u014c\1"+
            "\u014d\4\uffff\1\u014a\1\u0149\1\uffff\1\u014b",
            "\1\u014f\37\uffff\1\u0150",
            "\1\u0153\3\uffff\1\u0154\2\uffff\1\u0152\1\u0155\17\uffff\1"+
            "\u0151",
            "\1\u0157\41\uffff\1\u0156",
            "\1\u015d\37\uffff\1\u015e\1\uffff\1\u015c\6\uffff\1\u015b\16"+
            "\uffff\1\u0159\4\uffff\1\u015a\4\uffff\1\u0158\1\u015f",
            "\1\u0160",
            "\1\u0163\37\uffff\1\u0164\1\uffff\1\u0162\6\uffff\1\u0161",
            "\1\u016c\74\uffff\1\u0165\1\uffff\1\u0166\2\uffff\1\u016a\1"+
            "\u016b\4\uffff\1\u0168\1\u0167\1\uffff\1\u0169",
            "\1\u016d\37\uffff\1\u016e",
            "\1\u0171\3\uffff\1\u0172\2\uffff\1\u0170\1\u0173\17\uffff\1"+
            "\u016f",
            "\1\u0175\41\uffff\1\u0174",
            "\1\u017b\101\uffff\1\u0179\1\u017a\4\uffff\1\u0177\1\u0176"+
            "\1\uffff\1\u0178",
            "\1\u0180\101\uffff\1\u017e\1\u017f\4\uffff\1\u017c\2\uffff"+
            "\1\u017d",
            "\1\u0184\101\uffff\1\u0182\1\u0183\7\uffff\1\u0181",
            "\1\u0187\37\uffff\1\u018b\1\uffff\1\u018a\6\uffff\1\u0189\23"+
            "\uffff\1\u0188\4\uffff\1\u0185\1\u0186",
            "\1\u0190\37\uffff\1\u0191\1\uffff\1\u018f\6\uffff\1\u018e\16"+
            "\uffff\1\u018c\4\uffff\1\u018d",
            "\1\u0197\37\uffff\1\u0198\1\uffff\1\u0196\6\uffff\1\u0195\16"+
            "\uffff\1\u0193\4\uffff\1\u0194\4\uffff\1\u0192\1\u0199",
            "\1\u019e\37\uffff\1\u019f\1\uffff\1\u019d\6\uffff\1\u019c\16"+
            "\uffff\1\u019a\4\uffff\1\u019b",
            "\1\u01a4\101\uffff\1\u01a2\1\u01a3\4\uffff\1\u01a0\2\uffff"+
            "\1\u01a1",
            "\1\u01a8\101\uffff\1\u01a6\1\u01a7\7\uffff\1\u01a5",
            "\1\u01ab\37\uffff\1\u01af\1\uffff\1\u01ae\6\uffff\1\u01ad\23"+
            "\uffff\1\u01ac\4\uffff\1\u01a9\1\u01aa",
            "\1\u01b4\37\uffff\1\u01b5\1\uffff\1\u01b3\6\uffff\1\u01b2\16"+
            "\uffff\1\u01b0\4\uffff\1\u01b1",
            "\1\u01bb\37\uffff\1\u01bc\1\uffff\1\u01ba\6\uffff\1\u01b9\16"+
            "\uffff\1\u01b7\4\uffff\1\u01b8\4\uffff\1\u01b6\1\u01bd",
            "\1\u01c2\37\uffff\1\u01c3\1\uffff\1\u01c1\6\uffff\1\u01c0\16"+
            "\uffff\1\u01be\4\uffff\1\u01bf",
            "\1\u01c7\101\uffff\1\u01c5\1\u01c6\7\uffff\1\u01c4",
            "\1\u01ca\37\uffff\1\u01ce\1\uffff\1\u01cd\6\uffff\1\u01cc\23"+
            "\uffff\1\u01cb\4\uffff\1\u01c8\1\u01c9",
            "\1\u01d3\37\uffff\1\u01d4\1\uffff\1\u01d2\6\uffff\1\u01d1\16"+
            "\uffff\1\u01cf\4\uffff\1\u01d0",
            "\1\u01da\37\uffff\1\u01db\1\uffff\1\u01d9\6\uffff\1\u01d8\16"+
            "\uffff\1\u01d6\4\uffff\1\u01d7\4\uffff\1\u01d5\1\u01dc",
            "\1\u01e1\37\uffff\1\u01e2\1\uffff\1\u01e0\6\uffff\1\u01df\16"+
            "\uffff\1\u01dd\4\uffff\1\u01de",
            "\1\u01e5\37\uffff\1\u01e9\1\uffff\1\u01e8\6\uffff\1\u01e7\23"+
            "\uffff\1\u01e6\4\uffff\1\u01e3\1\u01e4",
            "\1\u01ee\37\uffff\1\u01ef\1\uffff\1\u01ed\6\uffff\1\u01ec\16"+
            "\uffff\1\u01ea\4\uffff\1\u01eb",
            "\1\u01f5\37\uffff\1\u01f6\1\uffff\1\u01f4\6\uffff\1\u01f3\16"+
            "\uffff\1\u01f1\4\uffff\1\u01f2\4\uffff\1\u01f0\1\u01f7",
            "\1\u01fc\37\uffff\1\u01fd\1\uffff\1\u01fb\6\uffff\1\u01fa\16"+
            "\uffff\1\u01f8\4\uffff\1\u01f9",
            "\1\u0202\37\uffff\1\u0203\1\uffff\1\u0201\6\uffff\1\u0200\16"+
            "\uffff\1\u01fe\4\uffff\1\u01ff",
            "\1\u0209\37\uffff\1\u020a\1\uffff\1\u0208\6\uffff\1\u0207\16"+
            "\uffff\1\u0205\4\uffff\1\u0206\4\uffff\1\u0204\1\u020b",
            "\1\u0210\37\uffff\1\u0211\1\uffff\1\u020f\1\uffff\1\u0213\2"+
            "\uffff\1\u0212\1\u0214\1\u020e\16\uffff\1\u020c\4\uffff\1\u020d",
            "\1\u0217\37\uffff\1\u0218\1\uffff\1\u0216\6\uffff\1\u0215",
            "\1\u0220\74\uffff\1\u0219\1\uffff\1\u021a\2\uffff\1\u021e\1"+
            "\u021f\4\uffff\1\u021c\1\u021b\1\uffff\1\u021d",
            "\1\u0221\37\uffff\1\u0222",
            "\1\u0224\41\uffff\1\u0223",
            "\1\u0225",
            "\1\u0228\37\uffff\1\u0229\1\uffff\1\u0227\6\uffff\1\u0226",
            "\1\u0231\74\uffff\1\u022a\1\uffff\1\u022b\2\uffff\1\u022f\1"+
            "\u0230\4\uffff\1\u022d\1\u022c\1\uffff\1\u022e",
            "\1\u0232\37\uffff\1\u0233",
            "\1\u0236\3\uffff\1\u0237\2\uffff\1\u0235\1\u0238\17\uffff\1"+
            "\u0234",
            "\1\u023a\41\uffff\1\u0239",
            "\1\u023f\37\uffff\1\u0240\1\uffff\1\u023e\6\uffff\1\u023d\16"+
            "\uffff\1\u023b\4\uffff\1\u023c",
            "\1\u0241",
            "\1\u0244\37\uffff\1\u0245\1\uffff\1\u0243\6\uffff\1\u0242",
            "\1\u024d\74\uffff\1\u0246\1\uffff\1\u0247\2\uffff\1\u024b\1"+
            "\u024c\4\uffff\1\u0249\1\u0248\1\uffff\1\u024a",
            "\1\u024e\37\uffff\1\u024f",
            "\1\u0252\3\uffff\1\u0253\2\uffff\1\u0251\1\u0254\17\uffff\1"+
            "\u0250",
            "\1\u0256\41\uffff\1\u0255",
            "\1\u025c\37\uffff\1\u025d\1\uffff\1\u025b\6\uffff\1\u025a\16"+
            "\uffff\1\u0258\4\uffff\1\u0259\4\uffff\1\u0257\1\u025e",
            "\1\u025f",
            "\1\u0262\37\uffff\1\u0263\1\uffff\1\u0261\6\uffff\1\u0260",
            "\1\u026b\74\uffff\1\u0264\1\uffff\1\u0265\2\uffff\1\u0269\1"+
            "\u026a\4\uffff\1\u0267\1\u0266\1\uffff\1\u0268",
            "\1\u026c\37\uffff\1\u026d",
            "\1\u0270\3\uffff\1\u0271\2\uffff\1\u026f\1\u0272\17\uffff\1"+
            "\u026e",
            "\1\u0274\41\uffff\1\u0273",
            "\1\u0279\101\uffff\1\u0277\1\u0278\4\uffff\1\u0275\2\uffff"+
            "\1\u0276",
            "\1\u027d\101\uffff\1\u027b\1\u027c\7\uffff\1\u027a",
            "\1\u0280\37\uffff\1\u0284\1\uffff\1\u0283\6\uffff\1\u0282\23"+
            "\uffff\1\u0281\4\uffff\1\u027e\1\u027f",
            "\1\u0289\37\uffff\1\u028a\1\uffff\1\u0288\6\uffff\1\u0287\16"+
            "\uffff\1\u0285\4\uffff\1\u0286",
            "\1\u0290\37\uffff\1\u0291\1\uffff\1\u028f\6\uffff\1\u028e\16"+
            "\uffff\1\u028c\4\uffff\1\u028d\4\uffff\1\u028b\1\u0292",
            "\1\u0297\37\uffff\1\u0298\1\uffff\1\u0296\6\uffff\1\u0295\16"+
            "\uffff\1\u0293\4\uffff\1\u0294",
            "\1\u029c\101\uffff\1\u029a\1\u029b\7\uffff\1\u0299",
            "\1\u029f\37\uffff\1\u02a3\1\uffff\1\u02a2\6\uffff\1\u02a1\23"+
            "\uffff\1\u02a0\4\uffff\1\u029d\1\u029e",
            "\1\u02a8\37\uffff\1\u02a9\1\uffff\1\u02a7\6\uffff\1\u02a6\16"+
            "\uffff\1\u02a4\4\uffff\1\u02a5",
            "\1\u02af\37\uffff\1\u02b0\1\uffff\1\u02ae\6\uffff\1\u02ad\16"+
            "\uffff\1\u02ab\4\uffff\1\u02ac\4\uffff\1\u02aa\1\u02b1",
            "\1\u02b6\37\uffff\1\u02b7\1\uffff\1\u02b5\6\uffff\1\u02b4\16"+
            "\uffff\1\u02b2\4\uffff\1\u02b3",
            "\1\u02ba\37\uffff\1\u02be\1\uffff\1\u02bd\6\uffff\1\u02bc\23"+
            "\uffff\1\u02bb\4\uffff\1\u02b8\1\u02b9",
            "\1\u02c3\37\uffff\1\u02c4\1\uffff\1\u02c2\6\uffff\1\u02c1\16"+
            "\uffff\1\u02bf\4\uffff\1\u02c0",
            "\1\u02ca\37\uffff\1\u02cb\1\uffff\1\u02c9\6\uffff\1\u02c8\16"+
            "\uffff\1\u02c6\4\uffff\1\u02c7\4\uffff\1\u02c5\1\u02cc",
            "\1\u02d1\37\uffff\1\u02d2\1\uffff\1\u02d0\6\uffff\1\u02cf\16"+
            "\uffff\1\u02cd\4\uffff\1\u02ce",
            "\1\u02d7\37\uffff\1\u02d8\1\uffff\1\u02d6\6\uffff\1\u02d5\16"+
            "\uffff\1\u02d3\4\uffff\1\u02d4",
            "\1\u02de\37\uffff\1\u02df\1\uffff\1\u02dd\6\uffff\1\u02dc\16"+
            "\uffff\1\u02da\4\uffff\1\u02db\4\uffff\1\u02d9\1\u02e0",
            "\1\u02e5\37\uffff\1\u02e6\1\uffff\1\u02e4\1\uffff\1\u02e8\2"+
            "\uffff\1\u02e7\1\u02e9\1\u02e3\16\uffff\1\u02e1\4\uffff\1\u02e2",
            "\1\u02ec\37\uffff\1\u02ed\1\uffff\1\u02eb\6\uffff\1\u02ea",
            "\1\u02f5\74\uffff\1\u02ee\1\uffff\1\u02ef\2\uffff\1\u02f3\1"+
            "\u02f4\4\uffff\1\u02f1\1\u02f0\1\uffff\1\u02f2",
            "\1\u02f6\37\uffff\1\u02f7",
            "\1\u02f9\41\uffff\1\u02f8",
            "\1\u02fa",
            "\1\u02fd\37\uffff\1\u02fe\1\uffff\1\u02fc\6\uffff\1\u02fb",
            "\1\u0306\74\uffff\1\u02ff\1\uffff\1\u0300\2\uffff\1\u0304\1"+
            "\u0305\4\uffff\1\u0302\1\u0301\1\uffff\1\u0303",
            "\1\u0307\37\uffff\1\u0308",
            "\1\u030b\3\uffff\1\u030c\2\uffff\1\u030a\1\u030d\17\uffff\1"+
            "\u0309",
            "\1\u030f\41\uffff\1\u030e",
            "\1\u0314\37\uffff\1\u0315\1\uffff\1\u0313\6\uffff\1\u0312\16"+
            "\uffff\1\u0310\4\uffff\1\u0311",
            "\1\u0316",
            "\1\u0319\37\uffff\1\u031a\1\uffff\1\u0318\6\uffff\1\u0317",
            "\1\u0322\74\uffff\1\u031b\1\uffff\1\u031c\2\uffff\1\u0320\1"+
            "\u0321\4\uffff\1\u031e\1\u031d\1\uffff\1\u031f",
            "\1\u0323\37\uffff\1\u0324",
            "\1\u0327\3\uffff\1\u0328\2\uffff\1\u0326\1\u0329\17\uffff\1"+
            "\u0325",
            "\1\u032b\41\uffff\1\u032a",
            "\1\u0331\37\uffff\1\u0332\1\uffff\1\u0330\6\uffff\1\u032f\16"+
            "\uffff\1\u032d\4\uffff\1\u032e\4\uffff\1\u032c\1\u0333",
            "\1\u0334",
            "\1\u0337\37\uffff\1\u0338\1\uffff\1\u0336\6\uffff\1\u0335",
            "\1\u0340\74\uffff\1\u0339\1\uffff\1\u033a\2\uffff\1\u033e\1"+
            "\u033f\4\uffff\1\u033c\1\u033b\1\uffff\1\u033d",
            "\1\u0341\37\uffff\1\u0342",
            "\1\u0345\3\uffff\1\u0346\2\uffff\1\u0344\1\u0347\17\uffff\1"+
            "\u0343",
            "\1\u0349\41\uffff\1\u0348",
            "\1\u034d\101\uffff\1\u034b\1\u034c\7\uffff\1\u034a",
            "\1\u0350\37\uffff\1\u0354\1\uffff\1\u0353\6\uffff\1\u0352\23"+
            "\uffff\1\u0351\4\uffff\1\u034e\1\u034f",
            "\1\u0359\37\uffff\1\u035a\1\uffff\1\u0358\6\uffff\1\u0357\16"+
            "\uffff\1\u0355\4\uffff\1\u0356",
            "\1\u0360\37\uffff\1\u0361\1\uffff\1\u035f\6\uffff\1\u035e\16"+
            "\uffff\1\u035c\4\uffff\1\u035d\4\uffff\1\u035b\1\u0362",
            "\1\u0367\37\uffff\1\u0368\1\uffff\1\u0366\6\uffff\1\u0365\16"+
            "\uffff\1\u0363\4\uffff\1\u0364",
            "\1\u036b\37\uffff\1\u036f\1\uffff\1\u036e\6\uffff\1\u036d\23"+
            "\uffff\1\u036c\4\uffff\1\u0369\1\u036a",
            "\1\u0374\37\uffff\1\u0375\1\uffff\1\u0373\6\uffff\1\u0372\16"+
            "\uffff\1\u0370\4\uffff\1\u0371",
            "\1\u037b\37\uffff\1\u037c\1\uffff\1\u037a\6\uffff\1\u0379\16"+
            "\uffff\1\u0377\4\uffff\1\u0378\4\uffff\1\u0376\1\u037d",
            "\1\u0382\37\uffff\1\u0383\1\uffff\1\u0381\6\uffff\1\u0380\16"+
            "\uffff\1\u037e\4\uffff\1\u037f",
            "\1\u0388\37\uffff\1\u0389\1\uffff\1\u0387\6\uffff\1\u0386\16"+
            "\uffff\1\u0384\4\uffff\1\u0385",
            "\1\u038f\37\uffff\1\u0390\1\uffff\1\u038e\6\uffff\1\u038d\16"+
            "\uffff\1\u038b\4\uffff\1\u038c\4\uffff\1\u038a\1\u0391",
            "\1\u0396\37\uffff\1\u0397\1\uffff\1\u0395\1\uffff\1\u0399\2"+
            "\uffff\1\u0398\1\u039a\1\u0394\16\uffff\1\u0392\4\uffff\1\u0393",
            "\1\u039d\37\uffff\1\u039e\1\uffff\1\u039c\6\uffff\1\u039b",
            "\1\u03a6\74\uffff\1\u039f\1\uffff\1\u03a0\2\uffff\1\u03a4\1"+
            "\u03a5\4\uffff\1\u03a2\1\u03a1\1\uffff\1\u03a3",
            "\1\u03a7\37\uffff\1\u03a8",
            "\1\u03aa\41\uffff\1\u03a9",
            "\1\u03ab",
            "\1\u03ae\37\uffff\1\u03af\1\uffff\1\u03ad\6\uffff\1\u03ac",
            "\1\u03b7\74\uffff\1\u03b0\1\uffff\1\u03b1\2\uffff\1\u03b5\1"+
            "\u03b6\4\uffff\1\u03b3\1\u03b2\1\uffff\1\u03b4",
            "\1\u03b8\37\uffff\1\u03b9",
            "\1\u03bc\3\uffff\1\u03bd\2\uffff\1\u03bb\1\u03be\17\uffff\1"+
            "\u03ba",
            "\1\u03c0\41\uffff\1\u03bf",
            "\1\u03c5\37\uffff\1\u03c6\1\uffff\1\u03c4\6\uffff\1\u03c3\16"+
            "\uffff\1\u03c1\4\uffff\1\u03c2",
            "\1\u03c7",
            "\1\u03ca\37\uffff\1\u03cb\1\uffff\1\u03c9\6\uffff\1\u03c8",
            "\1\u03d3\74\uffff\1\u03cc\1\uffff\1\u03cd\2\uffff\1\u03d1\1"+
            "\u03d2\4\uffff\1\u03cf\1\u03ce\1\uffff\1\u03d0",
            "\1\u03d4\37\uffff\1\u03d5",
            "\1\u03d8\3\uffff\1\u03d9\2\uffff\1\u03d7\1\u03da\17\uffff\1"+
            "\u03d6",
            "\1\u03dc\41\uffff\1\u03db",
            "\1\u03e2\37\uffff\1\u03e3\1\uffff\1\u03e1\6\uffff\1\u03e0\16"+
            "\uffff\1\u03de\4\uffff\1\u03df\4\uffff\1\u03dd\1\u03e4",
            "\1\u03e5",
            "\1\u03e8\37\uffff\1\u03e9\1\uffff\1\u03e7\6\uffff\1\u03e6",
            "\1\u03f1\74\uffff\1\u03ea\1\uffff\1\u03eb\2\uffff\1\u03ef\1"+
            "\u03f0\4\uffff\1\u03ed\1\u03ec\1\uffff\1\u03ee",
            "\1\u03f2\37\uffff\1\u03f3",
            "\1\u03f6\3\uffff\1\u03f7\2\uffff\1\u03f5\1\u03f8\17\uffff\1"+
            "\u03f4",
            "\1\u03fa\41\uffff\1\u03f9",
            "\1\u03fd\37\uffff\1\u0401\1\uffff\1\u0400\6\uffff\1\u03ff\23"+
            "\uffff\1\u03fe\4\uffff\1\u03fb\1\u03fc",
            "\1\u0406\37\uffff\1\u0407\1\uffff\1\u0405\6\uffff\1\u0404\16"+
            "\uffff\1\u0402\4\uffff\1\u0403",
            "\1\u040d\37\uffff\1\u040e\1\uffff\1\u040c\6\uffff\1\u040b\16"+
            "\uffff\1\u0409\4\uffff\1\u040a\4\uffff\1\u0408\1\u040f",
            "\1\u0414\37\uffff\1\u0415\1\uffff\1\u0413\6\uffff\1\u0412\16"+
            "\uffff\1\u0410\4\uffff\1\u0411",
            "\1\u041a\37\uffff\1\u041b\1\uffff\1\u0419\6\uffff\1\u0418\16"+
            "\uffff\1\u0416\4\uffff\1\u0417",
            "\1\u0421\37\uffff\1\u0422\1\uffff\1\u0420\6\uffff\1\u041f\16"+
            "\uffff\1\u041d\4\uffff\1\u041e\4\uffff\1\u041c\1\u0423",
            "\1\u0428\37\uffff\1\u0429\1\uffff\1\u0427\1\uffff\1\u042b\2"+
            "\uffff\1\u042a\1\u042c\1\u0426\16\uffff\1\u0424\4\uffff\1\u0425",
            "\1\u042f\37\uffff\1\u0430\1\uffff\1\u042e\6\uffff\1\u042d",
            "\1\u0438\74\uffff\1\u0431\1\uffff\1\u0432\2\uffff\1\u0436\1"+
            "\u0437\4\uffff\1\u0434\1\u0433\1\uffff\1\u0435",
            "\1\u0439\37\uffff\1\u043a",
            "\1\u043c\41\uffff\1\u043b",
            "\1\u043d",
            "\1\u0440\37\uffff\1\u0441\1\uffff\1\u043f\6\uffff\1\u043e",
            "\1\u0449\74\uffff\1\u0442\1\uffff\1\u0443\2\uffff\1\u0447\1"+
            "\u0448\4\uffff\1\u0445\1\u0444\1\uffff\1\u0446",
            "\1\u044a\37\uffff\1\u044b",
            "\1\u044e\3\uffff\1\u044f\2\uffff\1\u044d\1\u0450\17\uffff\1"+
            "\u044c",
            "\1\u0452\41\uffff\1\u0451",
            "\1\u0457\37\uffff\1\u0458\1\uffff\1\u0456\6\uffff\1\u0455\16"+
            "\uffff\1\u0453\4\uffff\1\u0454",
            "\1\u0459",
            "\1\u045c\37\uffff\1\u045d\1\uffff\1\u045b\6\uffff\1\u045a",
            "\1\u0465\74\uffff\1\u045e\1\uffff\1\u045f\2\uffff\1\u0463\1"+
            "\u0464\4\uffff\1\u0461\1\u0460\1\uffff\1\u0462",
            "\1\u0466\37\uffff\1\u0467",
            "\1\u046a\3\uffff\1\u046b\2\uffff\1\u0469\1\u046c\17\uffff\1"+
            "\u0468",
            "\1\u046e\41\uffff\1\u046d",
            "\1\u0474\37\uffff\1\u0475\1\uffff\1\u0473\6\uffff\1\u0472\16"+
            "\uffff\1\u0470\4\uffff\1\u0471\4\uffff\1\u046f\1\u0476",
            "\1\u0477",
            "\1\u047a\37\uffff\1\u047b\1\uffff\1\u0479\6\uffff\1\u0478",
            "\1\u0483\74\uffff\1\u047c\1\uffff\1\u047d\2\uffff\1\u0481\1"+
            "\u0482\4\uffff\1\u047f\1\u047e\1\uffff\1\u0480",
            "\1\u0484\37\uffff\1\u0485",
            "\1\u0488\3\uffff\1\u0489\2\uffff\1\u0487\1\u048a\17\uffff\1"+
            "\u0486",
            "\1\u048c\41\uffff\1\u048b",
            "\1\u0491\37\uffff\1\u0492\1\uffff\1\u0490\6\uffff\1\u048f\16"+
            "\uffff\1\u048d\4\uffff\1\u048e",
            "\1\u0498\37\uffff\1\u0499\1\uffff\1\u0497\6\uffff\1\u0496\16"+
            "\uffff\1\u0494\4\uffff\1\u0495\4\uffff\1\u0493\1\u049a",
            "\1\u049f\37\uffff\1\u04a0\1\uffff\1\u049e\1\uffff\1\u04a2\2"+
            "\uffff\1\u04a1\1\u04a3\1\u049d\16\uffff\1\u049b\4\uffff\1\u049c",
            "\1\u04a6\37\uffff\1\u04a7\1\uffff\1\u04a5\6\uffff\1\u04a4",
            "\1\u04af\74\uffff\1\u04a8\1\uffff\1\u04a9\2\uffff\1\u04ad\1"+
            "\u04ae\4\uffff\1\u04ab\1\u04aa\1\uffff\1\u04ac",
            "\1\u04b0\37\uffff\1\u04b1",
            "\1\u04b3\41\uffff\1\u04b2",
            "\1\u04b4",
            "\1\u04b7\37\uffff\1\u04b8\1\uffff\1\u04b6\6\uffff\1\u04b5",
            "\1\u04c0\74\uffff\1\u04b9\1\uffff\1\u04ba\2\uffff\1\u04be\1"+
            "\u04bf\4\uffff\1\u04bc\1\u04bb\1\uffff\1\u04bd",
            "\1\u04c1\37\uffff\1\u04c2",
            "\1\u04c5\3\uffff\1\u04c6\2\uffff\1\u04c4\1\u04c7\17\uffff\1"+
            "\u04c3",
            "\1\u04c9\41\uffff\1\u04c8",
            "\1\u04ce\37\uffff\1\u04cf\1\uffff\1\u04cd\6\uffff\1\u04cc\16"+
            "\uffff\1\u04ca\4\uffff\1\u04cb",
            "\1\u04d0",
            "\1\u04d3\37\uffff\1\u04d4\1\uffff\1\u04d2\6\uffff\1\u04d1",
            "\1\u04dc\74\uffff\1\u04d5\1\uffff\1\u04d6\2\uffff\1\u04da\1"+
            "\u04db\4\uffff\1\u04d8\1\u04d7\1\uffff\1\u04d9",
            "\1\u04dd\37\uffff\1\u04de",
            "\1\u04e1\3\uffff\1\u04e2\2\uffff\1\u04e0\1\u04e3\17\uffff\1"+
            "\u04df",
            "\1\u04e5\41\uffff\1\u04e4",
            "\1\u04eb\37\uffff\1\u04ec\1\uffff\1\u04ea\6\uffff\1\u04e9\16"+
            "\uffff\1\u04e7\4\uffff\1\u04e8\4\uffff\1\u04e6\1\u04ed",
            "\1\u04ee",
            "\1\u04f1\37\uffff\1\u04f2\1\uffff\1\u04f0\6\uffff\1\u04ef",
            "\1\u04fa\74\uffff\1\u04f3\1\uffff\1\u04f4\2\uffff\1\u04f8\1"+
            "\u04f9\4\uffff\1\u04f6\1\u04f5\1\uffff\1\u04f7",
            "\1\u04fb\37\uffff\1\u04fc",
            "\1\u04ff\3\uffff\1\u0500\2\uffff\1\u04fe\1\u0501\17\uffff\1"+
            "\u04fd",
            "\1\u0503\41\uffff\1\u0502",
            "\1\u0504",
            "\1\u0507\37\uffff\1\u0508\1\uffff\1\u0506\6\uffff\1\u0505",
            "\1\u0510\74\uffff\1\u0509\1\uffff\1\u050a\2\uffff\1\u050e\1"+
            "\u050f\4\uffff\1\u050c\1\u050b\1\uffff\1\u050d",
            "\1\u0511\37\uffff\1\u0512",
            "\1\u0515\3\uffff\1\u0516\2\uffff\1\u0514\1\u0517\17\uffff\1"+
            "\u0513",
            "\1\u0519\41\uffff\1\u0518",
            "\1\u051e\37\uffff\1\u051f\1\uffff\1\u051d\6\uffff\1\u051c\16"+
            "\uffff\1\u051a\4\uffff\1\u051b",
            "\1\u0520",
            "\1\u0523\37\uffff\1\u0524\1\uffff\1\u0522\6\uffff\1\u0521",
            "\1\u052c\74\uffff\1\u0525\1\uffff\1\u0526\2\uffff\1\u052a\1"+
            "\u052b\4\uffff\1\u0528\1\u0527\1\uffff\1\u0529",
            "\1\u052d\37\uffff\1\u052e",
            "\1\u0531\3\uffff\1\u0532\2\uffff\1\u0530\1\u0533\17\uffff\1"+
            "\u052f",
            "\1\u0535\41\uffff\1\u0534",
            "\1\u053b\37\uffff\1\u053c\1\uffff\1\u053a\6\uffff\1\u0539\16"+
            "\uffff\1\u0537\4\uffff\1\u0538\4\uffff\1\u0536\1\u053d",
            "\1\u053f\53\uffff\1\u053e",
            "\1\u0542\37\uffff\1\u0543\1\uffff\1\u0541\6\uffff\1\u0540",
            "\1\u054b\74\uffff\1\u0544\1\uffff\1\u0545\2\uffff\1\u0549\1"+
            "\u054a\4\uffff\1\u0547\1\u0546\1\uffff\1\u0548",
            "\1\u054c\37\uffff\1\u054d",
            "\1\u0550\3\uffff\1\u0551\2\uffff\1\u054f\1\u0552\17\uffff\1"+
            "\u054e",
            "\1\u0554\40\uffff\1\u055d\1\u0553\3\uffff\1\u055c\26\uffff"+
            "\1\u0555\1\uffff\1\u0556\2\uffff\1\u055a\1\u055b\4\uffff\1\u0558"+
            "\1\u0557\1\uffff\1\u0559",
            "\1\u055e",
            "\1\u055f",
            "",
            "\1\u0567\74\uffff\1\u0560\1\uffff\1\u0561\2\uffff\1\u0565\1"+
            "\u0566\4\uffff\1\u0563\1\u0562\1\uffff\1\u0564",
            "\1\u0568\37\uffff\1\u0569",
            "\1\u056c\3\uffff\1\u056d\2\uffff\1\u056b\1\u056e\17\uffff\1"+
            "\u056a",
            "\1\u0570\41\uffff\1\u056f",
            "\1\u0577\76\uffff\1\u0571\2\uffff\1\u0575\1\u0576\4\uffff\1"+
            "\u0573\1\u0572\1\uffff\1\u0574",
            "\1\u057d\101\uffff\1\u057b\1\u057c\4\uffff\1\u0579\1\u0578"+
            "\1\uffff\1\u057a",
            "\1\u0582\101\uffff\1\u0580\1\u0581\4\uffff\1\u057e\2\uffff"+
            "\1\u057f",
            "\1\u0586\101\uffff\1\u0584\1\u0585\7\uffff\1\u0583",
            "\1\u0589\41\uffff\1\u058c\1\uffff\1\u058d\4\uffff\1\u058b\2"+
            "\uffff\1\u058e\20\uffff\1\u058a\4\uffff\1\u0587\1\u0588",
            "\1\u0592\1\uffff\1\u0593\4\uffff\1\u0591\2\uffff\1\u0594\13"+
            "\uffff\1\u058f\4\uffff\1\u0590",
            "\1\u0599\1\uffff\1\u059a\4\uffff\1\u0598\2\uffff\1\u059b\13"+
            "\uffff\1\u0596\4\uffff\1\u0597\4\uffff\1\u0595\1\u059c",
            "\1\u05a0\1\uffff\1\u05a1\4\uffff\1\u059f\2\uffff\1\u05a2\13"+
            "\uffff\1\u059d\4\uffff\1\u059e",
            "\1\u05a5\3\uffff\1\u05a6\2\uffff\1\u05a4\1\u05a7\17\uffff\1"+
            "\u05a3",
            "\1\u05a9\41\uffff\1\u05a8",
            "\1\u05aa",
            "\1\u05ab",
            "\1\u05af\37\uffff\1\u05b0\1\uffff\1\u05ae\6\uffff\1\u05ad\16"+
            "\uffff\1\u05b1\4\uffff\1\u05ac",
            "\1\u05b9\74\uffff\1\u05b2\1\uffff\1\u05b3\2\uffff\1\u05b7\1"+
            "\u05b8\4\uffff\1\u05b5\1\u05b4\1\uffff\1\u05b6",
            "\1\u05ba\37\uffff\1\u05bb",
            "\1\u05be\3\uffff\1\u05bf\2\uffff\1\u05bd\1\u05c0\17\uffff\1"+
            "\u05bc",
            "\1\u05c2\41\uffff\1\u05c1",
            "\1\u05c9\76\uffff\1\u05c3\2\uffff\1\u05c7\1\u05c8\4\uffff\1"+
            "\u05c5\1\u05c4\1\uffff\1\u05c6",
            "\1\u05cf\101\uffff\1\u05cd\1\u05ce\4\uffff\1\u05cb\1\u05ca"+
            "\1\uffff\1\u05cc",
            "\1\u05d4\101\uffff\1\u05d2\1\u05d3\4\uffff\1\u05d0\2\uffff"+
            "\1\u05d1",
            "\1\u05d8\101\uffff\1\u05d6\1\u05d7\7\uffff\1\u05d5",
            "\1\u05db\41\uffff\1\u05de\1\uffff\1\u05df\4\uffff\1\u05dd\2"+
            "\uffff\1\u05e0\20\uffff\1\u05dc\4\uffff\1\u05d9\1\u05da",
            "\1\u05e4\1\uffff\1\u05e5\4\uffff\1\u05e3\2\uffff\1\u05e6\13"+
            "\uffff\1\u05e1\4\uffff\1\u05e2",
            "\1\u05eb\1\uffff\1\u05ec\4\uffff\1\u05ea\2\uffff\1\u05ed\13"+
            "\uffff\1\u05e8\4\uffff\1\u05e9\4\uffff\1\u05e7\1\u05ee",
            "\1\u05f2\1\uffff\1\u05f3\4\uffff\1\u05f1\2\uffff\1\u05f4\13"+
            "\uffff\1\u05ef\4\uffff\1\u05f0",
            "\1\u05f7\3\uffff\1\u05f8\2\uffff\1\u05f6\1\u05f9\17\uffff\1"+
            "\u05f5",
            "\1\u05fb\41\uffff\1\u05fa",
            "\1\u05fc\53\uffff\1\u05fd",
            "\1\u05fe",
            "\1\u0606\40\uffff\1\u0608\4\uffff\1\u0607\26\uffff\1\u05ff"+
            "\1\uffff\1\u0600\2\uffff\1\u0604\1\u0605\4\uffff\1\u0602\1\u0601"+
            "\1\uffff\1\u0603",
            "\1\u0609",
            "",
            "\1\u060a",
            "\1\u060b",
            "\1\u060c",
            "\1\u060f\37\uffff\1\u0610\1\uffff\1\u060e\6\uffff\1\u060d",
            "\1\u0618\74\uffff\1\u0611\1\uffff\1\u0612\2\uffff\1\u0616\1"+
            "\u0617\4\uffff\1\u0614\1\u0613\1\uffff\1\u0615",
            "\1\u0619\37\uffff\1\u061a",
            "\1\u061d\3\uffff\1\u061e\2\uffff\1\u061c\1\u061f\17\uffff\1"+
            "\u061b",
            "\1\u0621\41\uffff\1\u0620",
            "\1\u0625\37\uffff\1\u0626\1\uffff\1\u0624\6\uffff\1\u0623\16"+
            "\uffff\1\u0627\4\uffff\1\u0622",
            "\1\u062f\74\uffff\1\u0628\1\uffff\1\u0629\2\uffff\1\u062d\1"+
            "\u062e\4\uffff\1\u062b\1\u062a\1\uffff\1\u062c",
            "\1\u0630\37\uffff\1\u0631",
            "\1\u0634\3\uffff\1\u0635\2\uffff\1\u0633\1\u0636\17\uffff\1"+
            "\u0632",
            "\1\u0638\41\uffff\1\u0637",
            "\1\u063f\76\uffff\1\u0639\2\uffff\1\u063d\1\u063e\4\uffff\1"+
            "\u063b\1\u063a\1\uffff\1\u063c",
            "\1\u0645\101\uffff\1\u0643\1\u0644\4\uffff\1\u0641\1\u0640"+
            "\1\uffff\1\u0642",
            "\1\u064a\101\uffff\1\u0648\1\u0649\4\uffff\1\u0646\2\uffff"+
            "\1\u0647",
            "\1\u064e\101\uffff\1\u064c\1\u064d\7\uffff\1\u064b",
            "\1\u0651\41\uffff\1\u0654\1\uffff\1\u0655\4\uffff\1\u0653\2"+
            "\uffff\1\u0656\20\uffff\1\u0652\4\uffff\1\u064f\1\u0650",
            "\1\u065a\1\uffff\1\u065b\4\uffff\1\u0659\2\uffff\1\u065c\13"+
            "\uffff\1\u0657\4\uffff\1\u0658",
            "\1\u0661\1\uffff\1\u0662\4\uffff\1\u0660\2\uffff\1\u0663\13"+
            "\uffff\1\u065e\4\uffff\1\u065f\4\uffff\1\u065d\1\u0664",
            "\1\u0668\1\uffff\1\u0669\4\uffff\1\u0667\2\uffff\1\u066a\13"+
            "\uffff\1\u0665\4\uffff\1\u0666",
            "\1\u066d\3\uffff\1\u066e\2\uffff\1\u066c\1\u066f\17\uffff\1"+
            "\u066b",
            "\1\u0671\41\uffff\1\u0670",
            "\1\u0672\53\uffff\1\u0673",
            "\1\u0674",
            "\1\u067c\40\uffff\1\u067e\4\uffff\1\u067d\26\uffff\1\u0675"+
            "\1\uffff\1\u0676\2\uffff\1\u067a\1\u067b\4\uffff\1\u0678\1\u0677"+
            "\1\uffff\1\u0679",
            "\1\u067f",
            "",
            "\1\u0680",
            "\1\u0681",
            "\1\u0686\37\uffff\1\u0687\1\uffff\1\u0685\6\uffff\1\u0684\16"+
            "\uffff\1\u0682\4\uffff\1\u0683",
            "\1\u0688",
            "\1\u068b\37\uffff\1\u068c\1\uffff\1\u068a\6\uffff\1\u0689",
            "\1\u0694\74\uffff\1\u068d\1\uffff\1\u068e\2\uffff\1\u0692\1"+
            "\u0693\4\uffff\1\u0690\1\u068f\1\uffff\1\u0691",
            "\1\u0695\37\uffff\1\u0696",
            "\1\u0699\3\uffff\1\u069a\2\uffff\1\u0698\1\u069b\17\uffff\1"+
            "\u0697",
            "\1\u069d\41\uffff\1\u069c",
            "\1\u06a3\37\uffff\1\u06a4\1\uffff\1\u06a2\6\uffff\1\u06a1\16"+
            "\uffff\1\u069f\4\uffff\1\u06a0\4\uffff\1\u069e\1\u06a5",
            "\1\u06a9\37\uffff\1\u06aa\1\uffff\1\u06a8\6\uffff\1\u06a7\16"+
            "\uffff\1\u06ab\4\uffff\1\u06a6",
            "\1\u06b3\74\uffff\1\u06ac\1\uffff\1\u06ad\2\uffff\1\u06b1\1"+
            "\u06b2\4\uffff\1\u06af\1\u06ae\1\uffff\1\u06b0",
            "\1\u06b4\37\uffff\1\u06b5",
            "\1\u06b8\3\uffff\1\u06b9\2\uffff\1\u06b7\1\u06ba\17\uffff\1"+
            "\u06b6",
            "\1\u06bc\41\uffff\1\u06bb",
            "\1\u06c3\76\uffff\1\u06bd\2\uffff\1\u06c1\1\u06c2\4\uffff\1"+
            "\u06bf\1\u06be\1\uffff\1\u06c0",
            "\1\u06c9\101\uffff\1\u06c7\1\u06c8\4\uffff\1\u06c5\1\u06c4"+
            "\1\uffff\1\u06c6",
            "\1\u06ce\101\uffff\1\u06cc\1\u06cd\4\uffff\1\u06ca\2\uffff"+
            "\1\u06cb",
            "\1\u06d2\101\uffff\1\u06d0\1\u06d1\7\uffff\1\u06cf",
            "\1\u06d5\41\uffff\1\u06d8\1\uffff\1\u06d9\4\uffff\1\u06d7\2"+
            "\uffff\1\u06da\20\uffff\1\u06d6\4\uffff\1\u06d3\1\u06d4",
            "\1\u06de\1\uffff\1\u06df\4\uffff\1\u06dd\2\uffff\1\u06e0\13"+
            "\uffff\1\u06db\4\uffff\1\u06dc",
            "\1\u06e5\1\uffff\1\u06e6\4\uffff\1\u06e4\2\uffff\1\u06e7\13"+
            "\uffff\1\u06e2\4\uffff\1\u06e3\4\uffff\1\u06e1\1\u06e8",
            "\1\u06ec\1\uffff\1\u06ed\4\uffff\1\u06eb\2\uffff\1\u06ee\13"+
            "\uffff\1\u06e9\4\uffff\1\u06ea",
            "\1\u06f1\3\uffff\1\u06f2\2\uffff\1\u06f0\1\u06f3\17\uffff\1"+
            "\u06ef",
            "\1\u06f5\41\uffff\1\u06f4",
            "\1\u06f6\53\uffff\1\u06f7",
            "\1\u06f8",
            "\1\u0700\40\uffff\1\u0702\4\uffff\1\u0701\26\uffff\1\u06f9"+
            "\1\uffff\1\u06fa\2\uffff\1\u06fe\1\u06ff\4\uffff\1\u06fc\1\u06fb"+
            "\1\uffff\1\u06fd",
            "\1\u0703",
            "",
            "\1\u0704",
            "\1\u0705",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA48_eot = DFA.unpackEncodedString(DFA48_eotS);
    static final short[] DFA48_eof = DFA.unpackEncodedString(DFA48_eofS);
    static final char[] DFA48_min = DFA.unpackEncodedStringToUnsignedChars(DFA48_minS);
    static final char[] DFA48_max = DFA.unpackEncodedStringToUnsignedChars(DFA48_maxS);
    static final short[] DFA48_accept = DFA.unpackEncodedString(DFA48_acceptS);
    static final short[] DFA48_special = DFA.unpackEncodedString(DFA48_specialS);
    static final short[][] DFA48_transition;

    static {
        int numStates = DFA48_transitionS.length;
        DFA48_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA48_transition[i] = DFA.unpackEncodedString(DFA48_transitionS[i]);
        }
    }

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = DFA48_eot;
            this.eof = DFA48_eof;
            this.min = DFA48_min;
            this.max = DFA48_max;
            this.accept = DFA48_accept;
            this.special = DFA48_special;
            this.transition = DFA48_transition;
        }
        public String getDescription() {
            return "251:27: ( simple_fields_declaration )?";
        }
    }
    static final String DFA69_eotS =
        "\171\uffff";
    static final String DFA69_eofS =
        "\171\uffff";
    static final String DFA69_minS =
        "\1\16\2\uffff\1\16\7\uffff\1\33\4\uffff\1\16\1\uffff\2\16\2\uffff"+
        "\1\16\1\uffff\10\16\2\uffff\1\16\126\uffff";
    static final String DFA69_maxS =
        "\1\121\2\uffff\1\113\7\uffff\1\107\4\uffff\1\131\1\uffff\1\131\1"+
        "\125\2\uffff\1\113\1\uffff\4\131\1\121\1\113\1\121\1\113\2\uffff"+
        "\1\113\126\uffff";
    static final String DFA69_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\60\uffff\1\1\1\uffff\3\1\2\uffff\34\1\2"+
        "\uffff\4\1\3\uffff\5\1\2\uffff\1\1\1\uffff\4\1\1\uffff\1\1\11\uffff";
    static final String DFA69_specialS =
        "\171\uffff}>";
    static final String[] DFA69_transitionS = {
            "\1\3\37\uffff\3\4\1\uffff\1\4\4\uffff\1\4\2\uffff\1\4\20\uffff"+
            "\1\4\4\uffff\2\1",
            "",
            "",
            "\1\1\37\uffff\1\22\1\23\1\1\1\uffff\1\20\2\uffff\2\4\1\1\2"+
            "\uffff\1\1\13\uffff\1\13\4\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\4\53\uffff\1\26",
            "",
            "",
            "",
            "",
            "\1\37\45\uffff\1\4\26\uffff\1\30\1\uffff\1\31\2\uffff\1\35"+
            "\1\36\4\uffff\1\33\1\32\1\uffff\1\34",
            "",
            "\1\42\40\uffff\1\4\1\1\3\uffff\1\4\26\uffff\1\4\1\uffff\1\4"+
            "\2\uffff\2\4\4\uffff\2\4\1\uffff\1\4",
            "\1\1\47\uffff\1\4\21\uffff\1\4\1\uffff\1\1\1\uffff\1\1\2\uffff"+
            "\1\1\2\uffff\4\1",
            "",
            "",
            "\1\1\37\uffff\1\67\1\70\1\1\1\uffff\1\65\2\uffff\2\4\1\1\2"+
            "\uffff\1\1\13\uffff\1\71\4\uffff\1\1",
            "",
            "\1\102\76\uffff\1\74\2\uffff\1\100\1\101\4\uffff\1\76\1\75"+
            "\1\uffff\1\77",
            "\1\110\101\uffff\1\106\1\107\4\uffff\1\104\1\103\1\uffff\1"+
            "\105",
            "\1\115\101\uffff\1\113\1\114\4\uffff\1\111\2\uffff\1\112",
            "\1\121\101\uffff\1\117\1\120\7\uffff\1\116",
            "\1\124\41\uffff\1\127\1\uffff\1\1\4\uffff\1\126\2\uffff\1\1"+
            "\20\uffff\1\125\4\uffff\1\122\1\123",
            "\1\4\41\uffff\1\135\1\uffff\1\1\4\uffff\1\134\2\uffff\1\1\13"+
            "\uffff\1\132\4\uffff\1\133",
            "\1\4\41\uffff\1\145\1\uffff\1\1\4\uffff\1\144\2\uffff\1\1\13"+
            "\uffff\1\142\4\uffff\1\143\4\uffff\1\141\1\150",
            "\1\4\41\uffff\1\155\1\uffff\1\157\2\uffff\2\4\1\154\2\uffff"+
            "\1\1\13\uffff\1\152\4\uffff\1\153",
            "",
            "",
            "\1\4\40\uffff\1\1\1\4\6\uffff\1\4\16\uffff\1\4\4\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA69_eot = DFA.unpackEncodedString(DFA69_eotS);
    static final short[] DFA69_eof = DFA.unpackEncodedString(DFA69_eofS);
    static final char[] DFA69_min = DFA.unpackEncodedStringToUnsignedChars(DFA69_minS);
    static final char[] DFA69_max = DFA.unpackEncodedStringToUnsignedChars(DFA69_maxS);
    static final short[] DFA69_accept = DFA.unpackEncodedString(DFA69_acceptS);
    static final short[] DFA69_special = DFA.unpackEncodedString(DFA69_specialS);
    static final short[][] DFA69_transition;

    static {
        int numStates = DFA69_transitionS.length;
        DFA69_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA69_transition[i] = DFA.unpackEncodedString(DFA69_transitionS[i]);
        }
    }

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = DFA69_eot;
            this.eof = DFA69_eof;
            this.min = DFA69_min;
            this.max = DFA69_max;
            this.accept = DFA69_accept;
            this.special = DFA69_special;
            this.transition = DFA69_transition;
        }
        public String getDescription() {
            return "300:55: ( type_dec )?";
        }
    }
 

    public static final BitSet FOLLOW_code_internal_in_code182 = new BitSet(new long[]{0xD00A000000004002L,0x0000000002C36A2AL});
    public static final BitSet FOLLOW_class_declaration_in_code_internal195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_declaration_wrapper_in_code_internal202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_wrapper_in_code_internal209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protocol_declaration_wrapper_in_code_internal214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interface_declaration_wrapper_in_code_internal220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extern_declarations_in_code_internal226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_struct_in_code_internal231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_code_internal236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_declaration_in_enum_wrapper250 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_enum_wrapper252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extern_declatation_in_extern_declarations272 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_optional_prefix_in_declarations293 = new BitSet(new long[]{0x000A000000000000L});
    public static final BitSet FOLLOW_method_declaration_wrapper_in_declarations296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_prefix_in_declarations301 = new BitSet(new long[]{0x8000000000004000L,0x0000000002C32A00L});
    public static final BitSet FOLLOW_optional_prefix_in_declarations304 = new BitSet(new long[]{0x0000000000004000L,0x0000000002C32A00L});
    public static final BitSet FOLLOW_field_declaration_wrapper_in_declarations307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ns_inline_in_declarations312 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000001BFFFFFFL});
    public static final BitSet FOLLOW_92_in_declarations322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_declaration_in_method_declaration_wrapper335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_declaration_in_field_declaration_wrapper353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_property_prefix371 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_property_prefix373 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C1400L});
    public static final BitSet FOLLOW_property_prefix_param_in_property_prefix375 = new BitSet(new long[]{0x0004800000000000L});
    public static final BitSet FOLLOW_50_in_property_prefix378 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C1400L});
    public static final BitSet FOLLOW_property_prefix_param_in_property_prefix380 = new BitSet(new long[]{0x0004800000000000L});
    public static final BitSet FOLLOW_47_in_property_prefix384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_optional_prefix395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ns_inline405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interface_declaration_in_interface_declaration_wrapper453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protocol_declaration_in_protocol_declaration_wrapper471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_declaration_in_typedef_declaration_wrapper488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_typedef_declaration505 = new BitSet(new long[]{0x0000000000004000L,0x0000000001402000L});
    public static final BitSet FOLLOW_typedef_internal_in_typedef_declaration507 = new BitSet(new long[]{0x0040400000004002L});
    public static final BitSet FOLLOW_typedef_name_in_typedef_declaration510 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_func_pointer_in_typedef_declaration514 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_typedef_declaration518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_func_pointer529 = new BitSet(new long[]{0x0001000000004000L});
    public static final BitSet FOLLOW_48_in_func_pointer531 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_func_pointer534 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_func_pointer536 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_func_pointer538 = new BitSet(new long[]{0x0000800000004000L});
    public static final BitSet FOLLOW_ID_in_func_pointer541 = new BitSet(new long[]{0x0005800000000000L});
    public static final BitSet FOLLOW_48_in_func_pointer544 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_func_pointer546 = new BitSet(new long[]{0x0004800000000000L});
    public static final BitSet FOLLOW_50_in_func_pointer551 = new BitSet(new long[]{0x0010000000004000L});
    public static final BitSet FOLLOW_ID_in_func_pointer555 = new BitSet(new long[]{0x0005800000000000L});
    public static final BitSet FOLLOW_48_in_func_pointer558 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_func_pointer560 = new BitSet(new long[]{0x0004800000000000L});
    public static final BitSet FOLLOW_52_in_func_pointer567 = new BitSet(new long[]{0x0004800000000000L});
    public static final BitSet FOLLOW_47_in_func_pointer575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_enum_wrapper2_in_typedef_internal587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_rename_in_typedef_internal594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_struct_wrapper_in_typedef_internal601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_union_declaration_wrapper_in_typedef_internal606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_union_declaration_in_union_declaration_wrapper618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_union_declaration637 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_union_declaration642 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_typedef_struct_in_union_declaration647 = new BitSet(new long[]{0x0000000000000000L,0x0000000010400000L});
    public static final BitSet FOLLOW_92_in_union_declaration652 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_union_name_in_union_declaration654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_declaration_wrapper_in_union_internal668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_struct_wrapper_in_union_internal673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_typedef_rename684 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_typedef_rename686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_declaration_in_typedef_enum_wrapper2709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_enum_declaration729 = new BitSet(new long[]{0x0000000000004000L,0x0000000004000000L});
    public static final BitSet FOLLOW_struct_name_in_enum_declaration731 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_enum_declaration734 = new BitSet(new long[]{0x0000400008004000L});
    public static final BitSet FOLLOW_typedef_declaration_element_wrapper_in_enum_declaration736 = new BitSet(new long[]{0x0004000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_50_in_enum_declaration739 = new BitSet(new long[]{0x0000400008004000L});
    public static final BitSet FOLLOW_typedef_declaration_element_wrapper_in_enum_declaration741 = new BitSet(new long[]{0x0004000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_50_in_enum_declaration745 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_enum_declaration748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_struct_in_typedef_struct_wrapper759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_typedef_struct777 = new BitSet(new long[]{0x0000000000004000L,0x0000000004000000L});
    public static final BitSet FOLLOW_typedef_name_in_typedef_struct779 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_typedef_struct784 = new BitSet(new long[]{0x0000000000004000L,0x0000000002C32800L});
    public static final BitSet FOLLOW_struct_field_wrapper_in_typedef_struct789 = new BitSet(new long[]{0x0000000000004000L,0x0000000012C32800L});
    public static final BitSet FOLLOW_92_in_typedef_struct794 = new BitSet(new long[]{0x0040000000004002L});
    public static final BitSet FOLLOW_struct_name_in_typedef_struct797 = new BitSet(new long[]{0x0044000000000002L});
    public static final BitSet FOLLOW_50_in_typedef_struct800 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_struct_name_in_typedef_struct802 = new BitSet(new long[]{0x0044000000000002L});
    public static final BitSet FOLLOW_54_in_typedef_struct808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_struct_name821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_field_in_struct_field_wrapper839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_field1_in_struct_field857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_field2_in_struct_field862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_declaration_in_struct_field1874 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_field_name_in_struct_field1876 = new BitSet(new long[]{0x0044000000000000L});
    public static final BitSet FOLLOW_50_in_struct_field1879 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_field_name_in_struct_field1881 = new BitSet(new long[]{0x0044000000000000L});
    public static final BitSet FOLLOW_54_in_struct_field1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_struct_in_struct_field2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_typedef_name906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_declaration_element_in_typedef_declaration_element_wrapper923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_typedef_declaration_element943 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_typedef_declaration_element946 = new BitSet(new long[]{0x0000400008004000L});
    public static final BitSet FOLLOW_element_value_in_typedef_declaration_element948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_element_value_in_typedef_declaration_element955 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_typedef_declaration_element958 = new BitSet(new long[]{0x0000400008004000L});
    public static final BitSet FOLLOW_element_value_in_typedef_declaration_element960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_expression_in_element_value974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_expression2_in_simple_expression995 = new BitSet(new long[]{0x0900300000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_op2_in_simple_expression999 = new BitSet(new long[]{0x0000400008004000L});
    public static final BitSet FOLLOW_simple_expression2_in_simple_expression1001 = new BitSet(new long[]{0x0900300000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_ID_in_simple_expression21015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_simple_expression21020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_simple_expression21025 = new BitSet(new long[]{0x0000400008004000L});
    public static final BitSet FOLLOW_simple_expression_in_simple_expression21027 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_simple_expression21029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_class_declaration1064 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_class_declaration1066 = new BitSet(new long[]{0x0044000000000000L});
    public static final BitSet FOLLOW_50_in_class_declaration1069 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_class_declaration1071 = new BitSet(new long[]{0x0044000000000000L});
    public static final BitSet FOLLOW_54_in_class_declaration1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_protocol_declaration1085 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_protocol_name_in_protocol_declaration1087 = new BitSet(new long[]{0xA0CA000000004000L,0x0000000002C32A22L});
    public static final BitSet FOLLOW_generic_in_protocol_declaration1089 = new BitSet(new long[]{0xA04A000000004000L,0x0000000002C32A22L});
    public static final BitSet FOLLOW_protocol_end_in_protocol_declaration1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protocol_end1_in_protocol_end1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protocol_end2_in_protocol_end1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_protocol_end11121 = new BitSet(new long[]{0xA00A000000004000L,0x0000000002C32A22L});
    public static final BitSet FOLLOW_61_in_protocol_end11126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_protocol_end21138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_generic1151 = new BitSet(new long[]{0x0000000000004000L,0x0000000002C32800L});
    public static final BitSet FOLLOW_generic_internal_in_generic1153 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_generic1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_declaration_in_generic_internal1164 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_generic_internal1167 = new BitSet(new long[]{0x0000000000004000L,0x0000000002C32800L});
    public static final BitSet FOLLOW_type_declaration_in_generic_internal1169 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ID_in_protocol_name1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_interface_declaration1201 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_interface_name_in_interface_declaration1203 = new BitSet(new long[]{0xA02A000000004000L,0x0000000006C32A22L});
    public static final BitSet FOLLOW_53_in_interface_declaration1206 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_superclass_name_in_interface_declaration1208 = new BitSet(new long[]{0xA00A000000004000L,0x0000000006C32A22L});
    public static final BitSet FOLLOW_interface_body_in_interface_declaration1213 = new BitSet(new long[]{0xA00A000000004000L,0x0000000002C32A22L});
    public static final BitSet FOLLOW_declarations_in_interface_declaration1217 = new BitSet(new long[]{0xA00A000000004000L,0x0000000002C32A22L});
    public static final BitSet FOLLOW_61_in_interface_declaration1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_interface_body1234 = new BitSet(new long[]{0x0000000000004000L,0x0000000013C32A15L});
    public static final BitSet FOLLOW_interface_body_item_in_interface_body1238 = new BitSet(new long[]{0x0000000000004000L,0x0000000013C32A15L});
    public static final BitSet FOLLOW_92_in_interface_body1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_group_modifier_wrapper_in_interface_body_item1254 = new BitSet(new long[]{0x0000000000004002L,0x0000000002C32A00L});
    public static final BitSet FOLLOW_simple_fields_declaration_in_interface_body_item1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_fields_declaration_in_interface_body_item1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_union_declaration_wrapper_in_interface_body_item1267 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_interface_body_item1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_union_name1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_group_modifier_in_group_modifier_wrapper1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_interface_name1338 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_category_in_interface_name1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_category1359 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_category1361 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_category1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_superclass_name1380 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_generic_in_superclass_name1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_declaration_wrapper_in_simple_fields_declaration1404 = new BitSet(new long[]{0x0000000000004002L,0x0000000002C32A00L});
    public static final BitSet FOLLOW_73_in_field_declaration1424 = new BitSet(new long[]{0x0000000000004000L,0x0000000002C32800L});
    public static final BitSet FOLLOW_type_declaration_in_field_declaration1427 = new BitSet(new long[]{0x0000400000004000L});
    public static final BitSet FOLLOW_field_name_in_field_declaration1431 = new BitSet(new long[]{0x0044400000000000L});
    public static final BitSet FOLLOW_classical_method_params_in_field_declaration1434 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_50_in_field_declaration1439 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_field_name_in_field_declaration1441 = new BitSet(new long[]{0x0044000000000000L});
    public static final BitSet FOLLOW_func_pointer_in_field_declaration1449 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_field_declaration1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_classical_method_params1462 = new BitSet(new long[]{0x0010800000004000L,0x0000000002C32800L});
    public static final BitSet FOLLOW_classical_param_in_classical_method_params1465 = new BitSet(new long[]{0x0004800000000000L});
    public static final BitSet FOLLOW_50_in_classical_method_params1468 = new BitSet(new long[]{0x0010000000004000L,0x0000000002C32800L});
    public static final BitSet FOLLOW_classical_param_in_classical_method_params1470 = new BitSet(new long[]{0x0004800000000000L});
    public static final BitSet FOLLOW_47_in_classical_method_params1476 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_attribute_in_classical_method_params1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_attribute1492 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_attribute1494 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_attribute_internal_in_attribute1496 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_attribute1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_internal1_in_attribute_internal1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_attribute_internal11519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_attribute_internal11521 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_attribute_internal11523 = new BitSet(new long[]{0x0000800008004000L});
    public static final BitSet FOLLOW_format_item_in_attribute_internal11526 = new BitSet(new long[]{0x0004800000000000L});
    public static final BitSet FOLLOW_50_in_attribute_internal11529 = new BitSet(new long[]{0x0000000008004000L});
    public static final BitSet FOLLOW_format_item_in_attribute_internal11531 = new BitSet(new long[]{0x0004800000000000L});
    public static final BitSet FOLLOW_47_in_attribute_internal11537 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_attribute_internal11539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_declaration_in_classical_param1564 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_classical_param1566 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_classical_param1569 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_NUMBER_in_classical_param1571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_classical_param1574 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_52_in_classical_param1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_type_declaration1593 = new BitSet(new long[]{0x0000000000004000L,0x0000000002C32000L});
    public static final BitSet FOLLOW_77_in_type_declaration1596 = new BitSet(new long[]{0x0000000000004000L,0x0000000002C30000L});
    public static final BitSet FOLLOW_87_in_type_declaration1599 = new BitSet(new long[]{0x0000000000004000L,0x0000000002430000L});
    public static final BitSet FOLLOW_86_in_type_declaration1602 = new BitSet(new long[]{0x0000000000004000L,0x0000000002030000L});
    public static final BitSet FOLLOW_89_in_type_declaration1607 = new BitSet(new long[]{0x0081000000004002L,0x0000000000030800L});
    public static final BitSet FOLLOW_type_dec_in_type_declaration1609 = new BitSet(new long[]{0x0081000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_type_dec_in_type_declaration1615 = new BitSet(new long[]{0x0081000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_type_declaration1618 = new BitSet(new long[]{0x0081000000000002L});
    public static final BitSet FOLLOW_generic_in_type_declaration1621 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_type_declaration1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_dec_internal_in_type_dec1647 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_type_dec1650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_type_dec1652 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_knownTypes_in_type_dec_internal1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type_dec_internal1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_knownTypes1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_knownTypes1690 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_80_in_knownTypes1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_field_name1706 = new BitSet(new long[]{0x0020000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_array_size_in_field_name1708 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_field_crap_in_field_name1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_array_size1737 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_NUMBER_in_array_size1739 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_array_size1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_field_crap1751 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_NUMBER_in_field_crap1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_modifier_wrapper_in_method_declaration1763 = new BitSet(new long[]{0x0000400000004000L,0x00000000003C1400L});
    public static final BitSet FOLLOW_method_declaration_variants_in_method_declaration1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_modifier_in_method_modifier_wrapper1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_declaration_common_in_method_declaration_variants1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_method_declaration_common1824 = new BitSet(new long[]{0x0000000000004000L,0x0000000002C32800L});
    public static final BitSet FOLLOW_type_declaration_in_method_declaration_common1826 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_method_declaration_common1828 = new BitSet(new long[]{0x0000000000004000L,0x00000000003C1400L});
    public static final BitSet FOLLOW_method_name_in_method_declaration_common1832 = new BitSet(new long[]{0x0060000000004000L});
    public static final BitSet FOLLOW_method_params_in_method_declaration_common1834 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_method_declaration_common1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_method_name1851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_prefix_param_in_method_name1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_param_in_method_params1884 = new BitSet(new long[]{0x0020000000004002L});
    public static final BitSet FOLLOW_prefix_in_method_param1903 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_method_param1906 = new BitSet(new long[]{0x0000400000004000L,0x0000000000008000L});
    public static final BitSet FOLLOW_46_in_method_param1909 = new BitSet(new long[]{0x0000000000004000L,0x0000000002C32800L});
    public static final BitSet FOLLOW_type_declaration_in_method_param1911 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_method_param1913 = new BitSet(new long[]{0x0000000000004000L,0x0000000000008000L});
    public static final BitSet FOLLOW_param_name_in_method_param1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param_name1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_param_name1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_prefix1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_extern_declatation1994 = new BitSet(new long[]{0x0000000000004000L,0x0000000002C32A00L});
    public static final BitSet FOLLOW_field_declaration_in_extern_declatation1996 = new BitSet(new long[]{0x0000000000000002L});

}