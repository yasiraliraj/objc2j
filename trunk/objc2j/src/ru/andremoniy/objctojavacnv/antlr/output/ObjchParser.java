// $ANTLR 3.4 C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g 2012-09-18 20:12:26

package ru.andremoniy.objctojavacnv.antlr.output;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ObjchParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CATEGORY", "DIGIT", "ENUM", "EXTERN", "FIELD", "FIELDS", "FIELD_NAME", "FILE_NAME", "GROUP_MODIFIER", "ID", "INIT_DECLARATION", "INTERFACE", "INTERFACE_NAME", "LETTER", "METHOD", "METHOD_NAME", "METHOD_PARAM", "METHOD_PARAMS", "METHOD_TYPE", "MODIFIER", "MULTI_COMMENT", "NAME", "NUMBER", "OLD_NAME", "PARAM_NAME", "PARAM_PREFIX", "PREPROCESSOR_DECLARATION", "PROTOCOL", "SINGLE_COMMENT", "STATIC_METHOD", "STRUCT", "SUPERCLASS_NAME", "TYPE", "TYPEDEF", "TYPEDEF_ELEMENT", "TYPEDEF_NAME", "VALUE", "WHITESPACE", "'&'", "'&~'", "'('", "')'", "'*'", "'+'", "','", "'-'", "':'", "';'", "'<'", "'<<'", "'='", "'>'", "'>>'", "'@class'", "'@end'", "'@interface'", "'@optional'", "'@private'", "'@property'", "'@protected'", "'@protocol'", "'@public'", "'['", "']'", "'const'", "'enum'", "'extern'", "'initWithType'", "'int'", "'long'", "'nonatomic'", "'readonly'", "'readwrite'", "'retain'", "'struct'", "'typedef'", "'union'", "'unsigned'", "'{'", "'|'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__42=42;
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
    public static final int VALUE=40;
    public static final int WHITESPACE=41;

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
    public String getGrammarFileName() { return "C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g"; }


    public static class code_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "code"
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:52:1: code : ( code_internal )* ;
    public final ObjchParser.code_return code() throws RecognitionException {
        ObjchParser.code_return retval = new ObjchParser.code_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.code_internal_return code_internal1 =null;



        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:52:6: ( ( code_internal )* )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:53:3: ( code_internal )*
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:53:3: ( code_internal )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID||LA1_0==47||LA1_0==49||LA1_0==57||(LA1_0 >= 59 && LA1_0 <= 60)||LA1_0==62||LA1_0==64||(LA1_0 >= 68 && LA1_0 <= 70)||(LA1_0 >= 72 && LA1_0 <= 73)||(LA1_0 >= 78 && LA1_0 <= 79)||LA1_0==81) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:53:3: code_internal
            	    {
            	    pushFollow(FOLLOW_code_internal_in_code174);
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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:56:1: code_internal : ( class_declaration | typedef_declaration_wrapper | enum_wrapper | protocol_declaration_wrapper | interface_declaration_wrapper | extern_declarations | typedef_struct | declarations );
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
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:57:2: ( class_declaration | typedef_declaration_wrapper | enum_wrapper | protocol_declaration_wrapper | interface_declaration_wrapper | extern_declarations | typedef_struct | declarations )
            int alt2=8;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:57:4: class_declaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_class_declaration_in_code_internal187);
                    class_declaration2=class_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, class_declaration2.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:58:5: typedef_declaration_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedef_declaration_wrapper_in_code_internal194);
                    typedef_declaration_wrapper3=typedef_declaration_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef_declaration_wrapper3.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:59:5: enum_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_enum_wrapper_in_code_internal201);
                    enum_wrapper4=enum_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, enum_wrapper4.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:60:4: protocol_declaration_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_protocol_declaration_wrapper_in_code_internal206);
                    protocol_declaration_wrapper5=protocol_declaration_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, protocol_declaration_wrapper5.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:61:4: interface_declaration_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_interface_declaration_wrapper_in_code_internal212);
                    interface_declaration_wrapper6=interface_declaration_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, interface_declaration_wrapper6.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:62:4: extern_declarations
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_extern_declarations_in_code_internal218);
                    extern_declarations7=extern_declarations();

                    state._fsp--;

                    adaptor.addChild(root_0, extern_declarations7.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:63:4: typedef_struct
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedef_struct_in_code_internal223);
                    typedef_struct8=typedef_struct();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef_struct8.getTree());

                    }
                    break;
                case 8 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:64:4: declarations
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_declarations_in_code_internal228);
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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:67:1: enum_wrapper : enum_declaration ';' -> ^( ENUM enum_declaration ) ;
    public final ObjchParser.enum_wrapper_return enum_wrapper() throws RecognitionException {
        ObjchParser.enum_wrapper_return retval = new ObjchParser.enum_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal11=null;
        ObjchParser.enum_declaration_return enum_declaration10 =null;


        Object char_literal11_tree=null;
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleSubtreeStream stream_enum_declaration=new RewriteRuleSubtreeStream(adaptor,"rule enum_declaration");
        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:68:2: ( enum_declaration ';' -> ^( ENUM enum_declaration ) )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:68:4: enum_declaration ';'
            {
            pushFollow(FOLLOW_enum_declaration_in_enum_wrapper242);
            enum_declaration10=enum_declaration();

            state._fsp--;

            stream_enum_declaration.add(enum_declaration10.getTree());

            char_literal11=(Token)match(input,51,FOLLOW_51_in_enum_wrapper244);  
            stream_51.add(char_literal11);


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
            // 68:25: -> ^( ENUM enum_declaration )
            {
                // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:68:28: ^( ENUM enum_declaration )
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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:70:1: extern_declarations : ( extern_declatation )+ -> ( ^( EXTERN extern_declatation ) )+ ;
    public final ObjchParser.extern_declarations_return extern_declarations() throws RecognitionException {
        ObjchParser.extern_declarations_return retval = new ObjchParser.extern_declarations_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.extern_declatation_return extern_declatation12 =null;


        RewriteRuleSubtreeStream stream_extern_declatation=new RewriteRuleSubtreeStream(adaptor,"rule extern_declatation");
        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:71:2: ( ( extern_declatation )+ -> ( ^( EXTERN extern_declatation ) )+ )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:71:4: ( extern_declatation )+
            {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:71:4: ( extern_declatation )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==70) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:71:4: extern_declatation
            	    {
            	    pushFollow(FOLLOW_extern_declatation_in_extern_declarations264);
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
            // 71:24: -> ( ^( EXTERN extern_declatation ) )+
            {
                if ( !(stream_extern_declatation.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_extern_declatation.hasNext() ) {
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:71:27: ^( EXTERN extern_declatation )
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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:73:1: declarations : ( ( optional_prefix )? method_declaration_wrapper | ( property_prefix )? ( optional_prefix )? field_declaration_wrapper );
    public final ObjchParser.declarations_return declarations() throws RecognitionException {
        ObjchParser.declarations_return retval = new ObjchParser.declarations_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.optional_prefix_return optional_prefix13 =null;

        ObjchParser.method_declaration_wrapper_return method_declaration_wrapper14 =null;

        ObjchParser.property_prefix_return property_prefix15 =null;

        ObjchParser.optional_prefix_return optional_prefix16 =null;

        ObjchParser.field_declaration_wrapper_return field_declaration_wrapper17 =null;



        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:74:2: ( ( optional_prefix )? method_declaration_wrapper | ( property_prefix )? ( optional_prefix )? field_declaration_wrapper )
            int alt7=2;
            switch ( input.LA(1) ) {
            case 60:
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==47||LA7_1==49) ) {
                    alt7=1;
                }
                else if ( (LA7_1==ID||(LA7_1 >= 68 && LA7_1 <= 69)||(LA7_1 >= 72 && LA7_1 <= 73)||(LA7_1 >= 78 && LA7_1 <= 79)||LA7_1==81) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }
                }
                break;
            case 47:
            case 49:
                {
                alt7=1;
                }
                break;
            case ID:
            case 62:
            case 68:
            case 69:
            case 72:
            case 73:
            case 78:
            case 79:
            case 81:
                {
                alt7=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:74:4: ( optional_prefix )? method_declaration_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:74:4: ( optional_prefix )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==60) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:74:4: optional_prefix
                            {
                            pushFollow(FOLLOW_optional_prefix_in_declarations285);
                            optional_prefix13=optional_prefix();

                            state._fsp--;

                            adaptor.addChild(root_0, optional_prefix13.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_method_declaration_wrapper_in_declarations288);
                    method_declaration_wrapper14=method_declaration_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, method_declaration_wrapper14.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:75:4: ( property_prefix )? ( optional_prefix )? field_declaration_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:75:4: ( property_prefix )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==62) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:75:4: property_prefix
                            {
                            pushFollow(FOLLOW_property_prefix_in_declarations293);
                            property_prefix15=property_prefix();

                            state._fsp--;

                            adaptor.addChild(root_0, property_prefix15.getTree());

                            }
                            break;

                    }


                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:75:21: ( optional_prefix )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==60) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:75:21: optional_prefix
                            {
                            pushFollow(FOLLOW_optional_prefix_in_declarations296);
                            optional_prefix16=optional_prefix();

                            state._fsp--;

                            adaptor.addChild(root_0, optional_prefix16.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_field_declaration_wrapper_in_declarations299);
                    field_declaration_wrapper17=field_declaration_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, field_declaration_wrapper17.getTree());

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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:78:1: method_declaration_wrapper : method_declaration -> ^( METHOD method_declaration ) ;
    public final ObjchParser.method_declaration_wrapper_return method_declaration_wrapper() throws RecognitionException {
        ObjchParser.method_declaration_wrapper_return retval = new ObjchParser.method_declaration_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.method_declaration_return method_declaration18 =null;


        RewriteRuleSubtreeStream stream_method_declaration=new RewriteRuleSubtreeStream(adaptor,"rule method_declaration");
        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:79:2: ( method_declaration -> ^( METHOD method_declaration ) )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:79:4: method_declaration
            {
            pushFollow(FOLLOW_method_declaration_in_method_declaration_wrapper311);
            method_declaration18=method_declaration();

            state._fsp--;

            stream_method_declaration.add(method_declaration18.getTree());

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
            // 79:23: -> ^( METHOD method_declaration )
            {
                // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:79:26: ^( METHOD method_declaration )
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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:81:1: field_declaration_wrapper : field_declaration -> ^( FIELD field_declaration ) ;
    public final ObjchParser.field_declaration_wrapper_return field_declaration_wrapper() throws RecognitionException {
        ObjchParser.field_declaration_wrapper_return retval = new ObjchParser.field_declaration_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.field_declaration_return field_declaration19 =null;


        RewriteRuleSubtreeStream stream_field_declaration=new RewriteRuleSubtreeStream(adaptor,"rule field_declaration");
        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:82:2: ( field_declaration -> ^( FIELD field_declaration ) )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:82:4: field_declaration
            {
            pushFollow(FOLLOW_field_declaration_in_field_declaration_wrapper329);
            field_declaration19=field_declaration();

            state._fsp--;

            stream_field_declaration.add(field_declaration19.getTree());

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
            // 82:22: -> ^( FIELD field_declaration )
            {
                // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:82:25: ^( FIELD field_declaration )
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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:84:1: property_prefix : '@property' '(' property_prefix_param ( ',' property_prefix_param )* ')' ;
    public final ObjchParser.property_prefix_return property_prefix() throws RecognitionException {
        ObjchParser.property_prefix_return retval = new ObjchParser.property_prefix_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal20=null;
        Token char_literal21=null;
        Token char_literal23=null;
        Token char_literal25=null;
        ObjchParser.property_prefix_param_return property_prefix_param22 =null;

        ObjchParser.property_prefix_param_return property_prefix_param24 =null;


        Object string_literal20_tree=null;
        Object char_literal21_tree=null;
        Object char_literal23_tree=null;
        Object char_literal25_tree=null;

        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:85:2: ( '@property' '(' property_prefix_param ( ',' property_prefix_param )* ')' )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:85:4: '@property' '(' property_prefix_param ( ',' property_prefix_param )* ')'
            {
            root_0 = (Object)adaptor.nil();


            string_literal20=(Token)match(input,62,FOLLOW_62_in_property_prefix347); 
            string_literal20_tree = 
            (Object)adaptor.create(string_literal20)
            ;
            adaptor.addChild(root_0, string_literal20_tree);


            char_literal21=(Token)match(input,44,FOLLOW_44_in_property_prefix349); 
            char_literal21_tree = 
            (Object)adaptor.create(char_literal21)
            ;
            adaptor.addChild(root_0, char_literal21_tree);


            pushFollow(FOLLOW_property_prefix_param_in_property_prefix351);
            property_prefix_param22=property_prefix_param();

            state._fsp--;

            adaptor.addChild(root_0, property_prefix_param22.getTree());

            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:85:42: ( ',' property_prefix_param )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==48) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:85:43: ',' property_prefix_param
            	    {
            	    char_literal23=(Token)match(input,48,FOLLOW_48_in_property_prefix354); 
            	    char_literal23_tree = 
            	    (Object)adaptor.create(char_literal23)
            	    ;
            	    adaptor.addChild(root_0, char_literal23_tree);


            	    pushFollow(FOLLOW_property_prefix_param_in_property_prefix356);
            	    property_prefix_param24=property_prefix_param();

            	    state._fsp--;

            	    adaptor.addChild(root_0, property_prefix_param24.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            char_literal25=(Token)match(input,45,FOLLOW_45_in_property_prefix360); 
            char_literal25_tree = 
            (Object)adaptor.create(char_literal25)
            ;
            adaptor.addChild(root_0, char_literal25_tree);


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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:87:1: optional_prefix : '@optional' ;
    public final ObjchParser.optional_prefix_return optional_prefix() throws RecognitionException {
        ObjchParser.optional_prefix_return retval = new ObjchParser.optional_prefix_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal26=null;

        Object string_literal26_tree=null;

        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:88:2: ( '@optional' )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:88:4: '@optional'
            {
            root_0 = (Object)adaptor.nil();


            string_literal26=(Token)match(input,60,FOLLOW_60_in_optional_prefix371); 
            string_literal26_tree = 
            (Object)adaptor.create(string_literal26)
            ;
            adaptor.addChild(root_0, string_literal26_tree);


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


    public static class property_prefix_param_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "property_prefix_param"
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:90:1: property_prefix_param : ( 'retain' | 'readwrite' | 'readonly' | 'nonatomic' );
    public final ObjchParser.property_prefix_param_return property_prefix_param() throws RecognitionException {
        ObjchParser.property_prefix_param_return retval = new ObjchParser.property_prefix_param_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set27=null;

        Object set27_tree=null;

        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:91:2: ( 'retain' | 'readwrite' | 'readonly' | 'nonatomic' )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:
            {
            root_0 = (Object)adaptor.nil();


            set27=(Token)input.LT(1);

            if ( (input.LA(1) >= 74 && input.LA(1) <= 77) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set27)
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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:96:1: interface_declaration_wrapper : interface_declaration -> ^( INTERFACE interface_declaration ) ;
    public final ObjchParser.interface_declaration_wrapper_return interface_declaration_wrapper() throws RecognitionException {
        ObjchParser.interface_declaration_wrapper_return retval = new ObjchParser.interface_declaration_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.interface_declaration_return interface_declaration28 =null;


        RewriteRuleSubtreeStream stream_interface_declaration=new RewriteRuleSubtreeStream(adaptor,"rule interface_declaration");
        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:97:2: ( interface_declaration -> ^( INTERFACE interface_declaration ) )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:97:4: interface_declaration
            {
            pushFollow(FOLLOW_interface_declaration_in_interface_declaration_wrapper406);
            interface_declaration28=interface_declaration();

            state._fsp--;

            stream_interface_declaration.add(interface_declaration28.getTree());

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
            // 97:26: -> ^( INTERFACE interface_declaration )
            {
                // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:97:29: ^( INTERFACE interface_declaration )
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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:99:1: protocol_declaration_wrapper : protocol_declaration -> ^( PROTOCOL protocol_declaration ) ;
    public final ObjchParser.protocol_declaration_wrapper_return protocol_declaration_wrapper() throws RecognitionException {
        ObjchParser.protocol_declaration_wrapper_return retval = new ObjchParser.protocol_declaration_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.protocol_declaration_return protocol_declaration29 =null;


        RewriteRuleSubtreeStream stream_protocol_declaration=new RewriteRuleSubtreeStream(adaptor,"rule protocol_declaration");
        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:100:2: ( protocol_declaration -> ^( PROTOCOL protocol_declaration ) )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:100:4: protocol_declaration
            {
            pushFollow(FOLLOW_protocol_declaration_in_protocol_declaration_wrapper424);
            protocol_declaration29=protocol_declaration();

            state._fsp--;

            stream_protocol_declaration.add(protocol_declaration29.getTree());

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
            // 100:25: -> ^( PROTOCOL protocol_declaration )
            {
                // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:100:28: ^( PROTOCOL protocol_declaration )
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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:102:1: typedef_declaration_wrapper : typedef_declaration -> ^( TYPEDEF typedef_declaration ) ;
    public final ObjchParser.typedef_declaration_wrapper_return typedef_declaration_wrapper() throws RecognitionException {
        ObjchParser.typedef_declaration_wrapper_return retval = new ObjchParser.typedef_declaration_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.typedef_declaration_return typedef_declaration30 =null;


        RewriteRuleSubtreeStream stream_typedef_declaration=new RewriteRuleSubtreeStream(adaptor,"rule typedef_declaration");
        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:103:2: ( typedef_declaration -> ^( TYPEDEF typedef_declaration ) )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:103:4: typedef_declaration
            {
            pushFollow(FOLLOW_typedef_declaration_in_typedef_declaration_wrapper441);
            typedef_declaration30=typedef_declaration();

            state._fsp--;

            stream_typedef_declaration.add(typedef_declaration30.getTree());

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
            // 103:24: -> ^( TYPEDEF typedef_declaration )
            {
                // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:103:27: ^( TYPEDEF typedef_declaration )
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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:105:1: typedef_declaration : 'typedef' typedef_internal ( typedef_name | func_pointer )? ( ';' )? ;
    public final ObjchParser.typedef_declaration_return typedef_declaration() throws RecognitionException {
        ObjchParser.typedef_declaration_return retval = new ObjchParser.typedef_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal31=null;
        Token char_literal35=null;
        ObjchParser.typedef_internal_return typedef_internal32 =null;

        ObjchParser.typedef_name_return typedef_name33 =null;

        ObjchParser.func_pointer_return func_pointer34 =null;


        Object string_literal31_tree=null;
        Object char_literal35_tree=null;

        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:106:2: ( 'typedef' typedef_internal ( typedef_name | func_pointer )? ( ';' )? )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:106:4: 'typedef' typedef_internal ( typedef_name | func_pointer )? ( ';' )?
            {
            root_0 = (Object)adaptor.nil();


            string_literal31=(Token)match(input,79,FOLLOW_79_in_typedef_declaration458); 
            string_literal31_tree = 
            (Object)adaptor.create(string_literal31)
            ;
            adaptor.addChild(root_0, string_literal31_tree);


            pushFollow(FOLLOW_typedef_internal_in_typedef_declaration460);
            typedef_internal32=typedef_internal();

            state._fsp--;

            adaptor.addChild(root_0, typedef_internal32.getTree());

            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:106:31: ( typedef_name | func_pointer )?
            int alt9=3;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:106:32: typedef_name
                    {
                    pushFollow(FOLLOW_typedef_name_in_typedef_declaration463);
                    typedef_name33=typedef_name();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef_name33.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:106:47: func_pointer
                    {
                    pushFollow(FOLLOW_func_pointer_in_typedef_declaration467);
                    func_pointer34=func_pointer();

                    state._fsp--;

                    adaptor.addChild(root_0, func_pointer34.getTree());

                    }
                    break;

            }


            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:106:62: ( ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==51) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:106:62: ';'
                    {
                    char_literal35=(Token)match(input,51,FOLLOW_51_in_typedef_declaration471); 
                    char_literal35_tree = 
                    (Object)adaptor.create(char_literal35)
                    ;
                    adaptor.addChild(root_0, char_literal35_tree);


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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:108:1: func_pointer : '(' ( '*' )? ID ')' '(' ( ID ( ',' ID )* )? ')' ;
    public final ObjchParser.func_pointer_return func_pointer() throws RecognitionException {
        ObjchParser.func_pointer_return retval = new ObjchParser.func_pointer_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal36=null;
        Token char_literal37=null;
        Token ID38=null;
        Token char_literal39=null;
        Token char_literal40=null;
        Token ID41=null;
        Token char_literal42=null;
        Token ID43=null;
        Token char_literal44=null;

        Object char_literal36_tree=null;
        Object char_literal37_tree=null;
        Object ID38_tree=null;
        Object char_literal39_tree=null;
        Object char_literal40_tree=null;
        Object ID41_tree=null;
        Object char_literal42_tree=null;
        Object ID43_tree=null;
        Object char_literal44_tree=null;

        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:109:2: ( '(' ( '*' )? ID ')' '(' ( ID ( ',' ID )* )? ')' )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:109:4: '(' ( '*' )? ID ')' '(' ( ID ( ',' ID )* )? ')'
            {
            root_0 = (Object)adaptor.nil();


            char_literal36=(Token)match(input,44,FOLLOW_44_in_func_pointer482); 
            char_literal36_tree = 
            (Object)adaptor.create(char_literal36)
            ;
            adaptor.addChild(root_0, char_literal36_tree);


            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:109:8: ( '*' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==46) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:109:8: '*'
                    {
                    char_literal37=(Token)match(input,46,FOLLOW_46_in_func_pointer484); 
                    char_literal37_tree = 
                    (Object)adaptor.create(char_literal37)
                    ;
                    adaptor.addChild(root_0, char_literal37_tree);


                    }
                    break;

            }


            ID38=(Token)match(input,ID,FOLLOW_ID_in_func_pointer487); 
            ID38_tree = 
            (Object)adaptor.create(ID38)
            ;
            adaptor.addChild(root_0, ID38_tree);


            char_literal39=(Token)match(input,45,FOLLOW_45_in_func_pointer489); 
            char_literal39_tree = 
            (Object)adaptor.create(char_literal39)
            ;
            adaptor.addChild(root_0, char_literal39_tree);


            char_literal40=(Token)match(input,44,FOLLOW_44_in_func_pointer491); 
            char_literal40_tree = 
            (Object)adaptor.create(char_literal40)
            ;
            adaptor.addChild(root_0, char_literal40_tree);


            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:109:24: ( ID ( ',' ID )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:109:25: ID ( ',' ID )*
                    {
                    ID41=(Token)match(input,ID,FOLLOW_ID_in_func_pointer494); 
                    ID41_tree = 
                    (Object)adaptor.create(ID41)
                    ;
                    adaptor.addChild(root_0, ID41_tree);


                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:109:28: ( ',' ID )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==48) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:109:29: ',' ID
                    	    {
                    	    char_literal42=(Token)match(input,48,FOLLOW_48_in_func_pointer497); 
                    	    char_literal42_tree = 
                    	    (Object)adaptor.create(char_literal42)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal42_tree);


                    	    ID43=(Token)match(input,ID,FOLLOW_ID_in_func_pointer499); 
                    	    ID43_tree = 
                    	    (Object)adaptor.create(ID43)
                    	    ;
                    	    adaptor.addChild(root_0, ID43_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }


            char_literal44=(Token)match(input,45,FOLLOW_45_in_func_pointer505); 
            char_literal44_tree = 
            (Object)adaptor.create(char_literal44)
            ;
            adaptor.addChild(root_0, char_literal44_tree);


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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:112:1: typedef_internal : ( typedef_enum_wrapper2 | typedef_rename | typedef_struct_wrapper | union_declaration );
    public final ObjchParser.typedef_internal_return typedef_internal() throws RecognitionException {
        ObjchParser.typedef_internal_return retval = new ObjchParser.typedef_internal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.typedef_enum_wrapper2_return typedef_enum_wrapper245 =null;

        ObjchParser.typedef_rename_return typedef_rename46 =null;

        ObjchParser.typedef_struct_wrapper_return typedef_struct_wrapper47 =null;

        ObjchParser.union_declaration_return union_declaration48 =null;



        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:113:2: ( typedef_enum_wrapper2 | typedef_rename | typedef_struct_wrapper | union_declaration )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt14=1;
                }
                break;
            case ID:
                {
                alt14=2;
                }
                break;
            case 78:
                {
                alt14=3;
                }
                break;
            case 80:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:113:4: typedef_enum_wrapper2
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedef_enum_wrapper2_in_typedef_internal517);
                    typedef_enum_wrapper245=typedef_enum_wrapper2();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef_enum_wrapper245.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:114:5: typedef_rename
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedef_rename_in_typedef_internal524);
                    typedef_rename46=typedef_rename();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef_rename46.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:115:5: typedef_struct_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedef_struct_wrapper_in_typedef_internal531);
                    typedef_struct_wrapper47=typedef_struct_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef_struct_wrapper47.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:116:4: union_declaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_union_declaration_in_typedef_internal536);
                    union_declaration48=union_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, union_declaration48.getTree());

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


    public static class union_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "union_declaration"
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:118:1: union_declaration : 'union' '{' ( union_internal )+ '}' ;
    public final ObjchParser.union_declaration_return union_declaration() throws RecognitionException {
        ObjchParser.union_declaration_return retval = new ObjchParser.union_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal49=null;
        Token char_literal50=null;
        Token char_literal52=null;
        ObjchParser.union_internal_return union_internal51 =null;


        Object string_literal49_tree=null;
        Object char_literal50_tree=null;
        Object char_literal52_tree=null;

        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:119:2: ( 'union' '{' ( union_internal )+ '}' )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:119:4: 'union' '{' ( union_internal )+ '}'
            {
            root_0 = (Object)adaptor.nil();


            string_literal49=(Token)match(input,80,FOLLOW_80_in_union_declaration546); 
            string_literal49_tree = 
            (Object)adaptor.create(string_literal49)
            ;
            adaptor.addChild(root_0, string_literal49_tree);


            char_literal50=(Token)match(input,82,FOLLOW_82_in_union_declaration551); 
            char_literal50_tree = 
            (Object)adaptor.create(char_literal50)
            ;
            adaptor.addChild(root_0, char_literal50_tree);


            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:121:4: ( union_internal )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==ID||(LA15_0 >= 68 && LA15_0 <= 69)||(LA15_0 >= 72 && LA15_0 <= 73)||(LA15_0 >= 78 && LA15_0 <= 79)||LA15_0==81) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:121:4: union_internal
            	    {
            	    pushFollow(FOLLOW_union_internal_in_union_declaration556);
            	    union_internal51=union_internal();

            	    state._fsp--;

            	    adaptor.addChild(root_0, union_internal51.getTree());

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


            char_literal52=(Token)match(input,84,FOLLOW_84_in_union_declaration561); 
            char_literal52_tree = 
            (Object)adaptor.create(char_literal52)
            ;
            adaptor.addChild(root_0, char_literal52_tree);


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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:125:1: union_internal : ( field_declaration_wrapper | typedef_struct_wrapper );
    public final ObjchParser.union_internal_return union_internal() throws RecognitionException {
        ObjchParser.union_internal_return retval = new ObjchParser.union_internal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.field_declaration_wrapper_return field_declaration_wrapper53 =null;

        ObjchParser.typedef_struct_wrapper_return typedef_struct_wrapper54 =null;



        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:126:2: ( field_declaration_wrapper | typedef_struct_wrapper )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ID||(LA16_0 >= 68 && LA16_0 <= 69)||(LA16_0 >= 72 && LA16_0 <= 73)||LA16_0==79||LA16_0==81) ) {
                alt16=1;
            }
            else if ( (LA16_0==78) ) {
                switch ( input.LA(2) ) {
                case 72:
                case 73:
                case 81:
                    {
                    alt16=1;
                    }
                    break;
                case ID:
                    {
                    int LA16_12 = input.LA(3);

                    if ( (LA16_12==ID||LA16_12==46||LA16_12==52||LA16_12==66||LA16_12==68) ) {
                        alt16=1;
                    }
                    else if ( (LA16_12==82) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 12, input);

                        throw nvae;

                    }
                    }
                    break;
                case 82:
                    {
                    alt16=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 4, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:126:4: field_declaration_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_field_declaration_wrapper_in_union_internal574);
                    field_declaration_wrapper53=field_declaration_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, field_declaration_wrapper53.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:127:4: typedef_struct_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedef_struct_wrapper_in_union_internal579);
                    typedef_struct_wrapper54=typedef_struct_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef_struct_wrapper54.getTree());

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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:129:1: typedef_rename : ID ( '*' )? -> ^( OLD_NAME ID ) ;
    public final ObjchParser.typedef_rename_return typedef_rename() throws RecognitionException {
        ObjchParser.typedef_rename_return retval = new ObjchParser.typedef_rename_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID55=null;
        Token char_literal56=null;

        Object ID55_tree=null;
        Object char_literal56_tree=null;
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:130:2: ( ID ( '*' )? -> ^( OLD_NAME ID ) )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:130:4: ID ( '*' )?
            {
            ID55=(Token)match(input,ID,FOLLOW_ID_in_typedef_rename590);  
            stream_ID.add(ID55);


            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:130:7: ( '*' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==46) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:130:7: '*'
                    {
                    char_literal56=(Token)match(input,46,FOLLOW_46_in_typedef_rename592);  
                    stream_46.add(char_literal56);


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
            // 130:12: -> ^( OLD_NAME ID )
            {
                // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:130:15: ^( OLD_NAME ID )
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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:133:1: typedef_enum_wrapper2 : enum_declaration -> ^( ENUM enum_declaration ) ;
    public final ObjchParser.typedef_enum_wrapper2_return typedef_enum_wrapper2() throws RecognitionException {
        ObjchParser.typedef_enum_wrapper2_return retval = new ObjchParser.typedef_enum_wrapper2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.enum_declaration_return enum_declaration57 =null;


        RewriteRuleSubtreeStream stream_enum_declaration=new RewriteRuleSubtreeStream(adaptor,"rule enum_declaration");
        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:134:2: ( enum_declaration -> ^( ENUM enum_declaration ) )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:134:4: enum_declaration
            {
            pushFollow(FOLLOW_enum_declaration_in_typedef_enum_wrapper2615);
            enum_declaration57=enum_declaration();

            state._fsp--;

            stream_enum_declaration.add(enum_declaration57.getTree());

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
            // 134:21: -> ^( ENUM enum_declaration )
            {
                // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:134:24: ^( ENUM enum_declaration )
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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:136:1: enum_declaration : 'enum' ( struct_name )? '{' typedef_declaration_element_wrapper ( ',' typedef_declaration_element_wrapper )* ( ',' )? '}' ;
    public final ObjchParser.enum_declaration_return enum_declaration() throws RecognitionException {
        ObjchParser.enum_declaration_return retval = new ObjchParser.enum_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal58=null;
        Token char_literal60=null;
        Token char_literal62=null;
        Token char_literal64=null;
        Token char_literal65=null;
        ObjchParser.struct_name_return struct_name59 =null;

        ObjchParser.typedef_declaration_element_wrapper_return typedef_declaration_element_wrapper61 =null;

        ObjchParser.typedef_declaration_element_wrapper_return typedef_declaration_element_wrapper63 =null;


        Object string_literal58_tree=null;
        Object char_literal60_tree=null;
        Object char_literal62_tree=null;
        Object char_literal64_tree=null;
        Object char_literal65_tree=null;

        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:137:2: ( 'enum' ( struct_name )? '{' typedef_declaration_element_wrapper ( ',' typedef_declaration_element_wrapper )* ( ',' )? '}' )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:137:4: 'enum' ( struct_name )? '{' typedef_declaration_element_wrapper ( ',' typedef_declaration_element_wrapper )* ( ',' )? '}'
            {
            root_0 = (Object)adaptor.nil();


            string_literal58=(Token)match(input,69,FOLLOW_69_in_enum_declaration635); 
            string_literal58_tree = 
            (Object)adaptor.create(string_literal58)
            ;
            adaptor.addChild(root_0, string_literal58_tree);


            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:137:11: ( struct_name )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:137:11: struct_name
                    {
                    pushFollow(FOLLOW_struct_name_in_enum_declaration637);
                    struct_name59=struct_name();

                    state._fsp--;

                    adaptor.addChild(root_0, struct_name59.getTree());

                    }
                    break;

            }


            char_literal60=(Token)match(input,82,FOLLOW_82_in_enum_declaration640); 
            char_literal60_tree = 
            (Object)adaptor.create(char_literal60)
            ;
            adaptor.addChild(root_0, char_literal60_tree);


            pushFollow(FOLLOW_typedef_declaration_element_wrapper_in_enum_declaration642);
            typedef_declaration_element_wrapper61=typedef_declaration_element_wrapper();

            state._fsp--;

            adaptor.addChild(root_0, typedef_declaration_element_wrapper61.getTree());

            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:137:64: ( ',' typedef_declaration_element_wrapper )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==48) ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1==ID) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:137:65: ',' typedef_declaration_element_wrapper
            	    {
            	    char_literal62=(Token)match(input,48,FOLLOW_48_in_enum_declaration645); 
            	    char_literal62_tree = 
            	    (Object)adaptor.create(char_literal62)
            	    ;
            	    adaptor.addChild(root_0, char_literal62_tree);


            	    pushFollow(FOLLOW_typedef_declaration_element_wrapper_in_enum_declaration647);
            	    typedef_declaration_element_wrapper63=typedef_declaration_element_wrapper();

            	    state._fsp--;

            	    adaptor.addChild(root_0, typedef_declaration_element_wrapper63.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:137:107: ( ',' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==48) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:137:107: ','
                    {
                    char_literal64=(Token)match(input,48,FOLLOW_48_in_enum_declaration651); 
                    char_literal64_tree = 
                    (Object)adaptor.create(char_literal64)
                    ;
                    adaptor.addChild(root_0, char_literal64_tree);


                    }
                    break;

            }


            char_literal65=(Token)match(input,84,FOLLOW_84_in_enum_declaration654); 
            char_literal65_tree = 
            (Object)adaptor.create(char_literal65)
            ;
            adaptor.addChild(root_0, char_literal65_tree);


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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:139:1: typedef_struct_wrapper : typedef_struct -> ^( STRUCT typedef_struct ) ;
    public final ObjchParser.typedef_struct_wrapper_return typedef_struct_wrapper() throws RecognitionException {
        ObjchParser.typedef_struct_wrapper_return retval = new ObjchParser.typedef_struct_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.typedef_struct_return typedef_struct66 =null;


        RewriteRuleSubtreeStream stream_typedef_struct=new RewriteRuleSubtreeStream(adaptor,"rule typedef_struct");
        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:140:2: ( typedef_struct -> ^( STRUCT typedef_struct ) )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:140:4: typedef_struct
            {
            pushFollow(FOLLOW_typedef_struct_in_typedef_struct_wrapper665);
            typedef_struct66=typedef_struct();

            state._fsp--;

            stream_typedef_struct.add(typedef_struct66.getTree());

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
            // 140:19: -> ^( STRUCT typedef_struct )
            {
                // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:140:22: ^( STRUCT typedef_struct )
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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:142:1: typedef_struct : 'struct' ( typedef_name )? '{' ( struct_field_wrapper )+ '}' ( struct_name ( ',' struct_name )* )? ( ';' )? ;
    public final ObjchParser.typedef_struct_return typedef_struct() throws RecognitionException {
        ObjchParser.typedef_struct_return retval = new ObjchParser.typedef_struct_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal67=null;
        Token char_literal69=null;
        Token char_literal71=null;
        Token char_literal73=null;
        Token char_literal75=null;
        ObjchParser.typedef_name_return typedef_name68 =null;

        ObjchParser.struct_field_wrapper_return struct_field_wrapper70 =null;

        ObjchParser.struct_name_return struct_name72 =null;

        ObjchParser.struct_name_return struct_name74 =null;


        Object string_literal67_tree=null;
        Object char_literal69_tree=null;
        Object char_literal71_tree=null;
        Object char_literal73_tree=null;
        Object char_literal75_tree=null;

        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:143:2: ( 'struct' ( typedef_name )? '{' ( struct_field_wrapper )+ '}' ( struct_name ( ',' struct_name )* )? ( ';' )? )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:143:4: 'struct' ( typedef_name )? '{' ( struct_field_wrapper )+ '}' ( struct_name ( ',' struct_name )* )? ( ';' )?
            {
            root_0 = (Object)adaptor.nil();


            string_literal67=(Token)match(input,78,FOLLOW_78_in_typedef_struct683); 
            string_literal67_tree = 
            (Object)adaptor.create(string_literal67)
            ;
            adaptor.addChild(root_0, string_literal67_tree);


            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:143:13: ( typedef_name )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:143:13: typedef_name
                    {
                    pushFollow(FOLLOW_typedef_name_in_typedef_struct685);
                    typedef_name68=typedef_name();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef_name68.getTree());

                    }
                    break;

            }


            char_literal69=(Token)match(input,82,FOLLOW_82_in_typedef_struct690); 
            char_literal69_tree = 
            (Object)adaptor.create(char_literal69)
            ;
            adaptor.addChild(root_0, char_literal69_tree);


            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:145:4: ( struct_field_wrapper )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==ID||(LA22_0 >= 68 && LA22_0 <= 69)||(LA22_0 >= 72 && LA22_0 <= 73)||(LA22_0 >= 78 && LA22_0 <= 79)||LA22_0==81) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:145:4: struct_field_wrapper
            	    {
            	    pushFollow(FOLLOW_struct_field_wrapper_in_typedef_struct695);
            	    struct_field_wrapper70=struct_field_wrapper();

            	    state._fsp--;

            	    adaptor.addChild(root_0, struct_field_wrapper70.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            char_literal71=(Token)match(input,84,FOLLOW_84_in_typedef_struct700); 
            char_literal71_tree = 
            (Object)adaptor.create(char_literal71)
            ;
            adaptor.addChild(root_0, char_literal71_tree);


            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:146:7: ( struct_name ( ',' struct_name )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:146:8: struct_name ( ',' struct_name )*
                    {
                    pushFollow(FOLLOW_struct_name_in_typedef_struct703);
                    struct_name72=struct_name();

                    state._fsp--;

                    adaptor.addChild(root_0, struct_name72.getTree());

                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:146:20: ( ',' struct_name )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==48) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:146:21: ',' struct_name
                    	    {
                    	    char_literal73=(Token)match(input,48,FOLLOW_48_in_typedef_struct706); 
                    	    char_literal73_tree = 
                    	    (Object)adaptor.create(char_literal73)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal73_tree);


                    	    pushFollow(FOLLOW_struct_name_in_typedef_struct708);
                    	    struct_name74=struct_name();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, struct_name74.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }


            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:146:41: ( ';' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==51) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:146:41: ';'
                    {
                    char_literal75=(Token)match(input,51,FOLLOW_51_in_typedef_struct714); 
                    char_literal75_tree = 
                    (Object)adaptor.create(char_literal75)
                    ;
                    adaptor.addChild(root_0, char_literal75_tree);


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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:149:1: struct_name : ID -> ^( NAME ID ) ;
    public final ObjchParser.struct_name_return struct_name() throws RecognitionException {
        ObjchParser.struct_name_return retval = new ObjchParser.struct_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID76=null;

        Object ID76_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:150:2: ( ID -> ^( NAME ID ) )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:150:4: ID
            {
            ID76=(Token)match(input,ID,FOLLOW_ID_in_struct_name727);  
            stream_ID.add(ID76);


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
            // 150:7: -> ^( NAME ID )
            {
                // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:150:10: ^( NAME ID )
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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:152:1: struct_field_wrapper : struct_field -> ^( FIELD struct_field ) ;
    public final ObjchParser.struct_field_wrapper_return struct_field_wrapper() throws RecognitionException {
        ObjchParser.struct_field_wrapper_return retval = new ObjchParser.struct_field_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.struct_field_return struct_field77 =null;


        RewriteRuleSubtreeStream stream_struct_field=new RewriteRuleSubtreeStream(adaptor,"rule struct_field");
        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:153:2: ( struct_field -> ^( FIELD struct_field ) )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:153:4: struct_field
            {
            pushFollow(FOLLOW_struct_field_in_struct_field_wrapper745);
            struct_field77=struct_field();

            state._fsp--;

            stream_struct_field.add(struct_field77.getTree());

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
            // 153:17: -> ^( FIELD struct_field )
            {
                // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:153:20: ^( FIELD struct_field )
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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:155:1: struct_field : ( struct_field1 | struct_field2 );
    public final ObjchParser.struct_field_return struct_field() throws RecognitionException {
        ObjchParser.struct_field_return retval = new ObjchParser.struct_field_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.struct_field1_return struct_field178 =null;

        ObjchParser.struct_field2_return struct_field279 =null;



        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:156:2: ( struct_field1 | struct_field2 )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==ID||(LA26_0 >= 68 && LA26_0 <= 69)||(LA26_0 >= 72 && LA26_0 <= 73)||LA26_0==79||LA26_0==81) ) {
                alt26=1;
            }
            else if ( (LA26_0==78) ) {
                switch ( input.LA(2) ) {
                case 72:
                case 73:
                case 81:
                    {
                    alt26=1;
                    }
                    break;
                case ID:
                    {
                    int LA26_12 = input.LA(3);

                    if ( (LA26_12==ID||LA26_12==46||LA26_12==52||LA26_12==66||LA26_12==68) ) {
                        alt26=1;
                    }
                    else if ( (LA26_12==82) ) {
                        alt26=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 12, input);

                        throw nvae;

                    }
                    }
                    break;
                case 82:
                    {
                    alt26=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 4, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:156:4: struct_field1
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_struct_field1_in_struct_field763);
                    struct_field178=struct_field1();

                    state._fsp--;

                    adaptor.addChild(root_0, struct_field178.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:157:4: struct_field2
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_struct_field2_in_struct_field768);
                    struct_field279=struct_field2();

                    state._fsp--;

                    adaptor.addChild(root_0, struct_field279.getTree());

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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:160:1: struct_field1 : type_declaration field_name ( ',' field_name )* ';' ;
    public final ObjchParser.struct_field1_return struct_field1() throws RecognitionException {
        ObjchParser.struct_field1_return retval = new ObjchParser.struct_field1_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal82=null;
        Token char_literal84=null;
        ObjchParser.type_declaration_return type_declaration80 =null;

        ObjchParser.field_name_return field_name81 =null;

        ObjchParser.field_name_return field_name83 =null;


        Object char_literal82_tree=null;
        Object char_literal84_tree=null;

        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:161:2: ( type_declaration field_name ( ',' field_name )* ';' )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:161:4: type_declaration field_name ( ',' field_name )* ';'
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_declaration_in_struct_field1780);
            type_declaration80=type_declaration();

            state._fsp--;

            adaptor.addChild(root_0, type_declaration80.getTree());

            pushFollow(FOLLOW_field_name_in_struct_field1782);
            field_name81=field_name();

            state._fsp--;

            adaptor.addChild(root_0, field_name81.getTree());

            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:161:32: ( ',' field_name )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==48) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:161:33: ',' field_name
            	    {
            	    char_literal82=(Token)match(input,48,FOLLOW_48_in_struct_field1785); 
            	    char_literal82_tree = 
            	    (Object)adaptor.create(char_literal82)
            	    ;
            	    adaptor.addChild(root_0, char_literal82_tree);


            	    pushFollow(FOLLOW_field_name_in_struct_field1787);
            	    field_name83=field_name();

            	    state._fsp--;

            	    adaptor.addChild(root_0, field_name83.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            char_literal84=(Token)match(input,51,FOLLOW_51_in_struct_field1791); 
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
    // $ANTLR end "struct_field1"


    public static class struct_field2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "struct_field2"
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:163:1: struct_field2 : typedef_struct ;
    public final ObjchParser.struct_field2_return struct_field2() throws RecognitionException {
        ObjchParser.struct_field2_return retval = new ObjchParser.struct_field2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.typedef_struct_return typedef_struct85 =null;



        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:164:2: ( typedef_struct )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:164:4: typedef_struct
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_typedef_struct_in_struct_field2801);
            typedef_struct85=typedef_struct();

            state._fsp--;

            adaptor.addChild(root_0, typedef_struct85.getTree());

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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:166:1: typedef_name : ID -> ^( TYPEDEF_NAME ID ) ;
    public final ObjchParser.typedef_name_return typedef_name() throws RecognitionException {
        ObjchParser.typedef_name_return retval = new ObjchParser.typedef_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID86=null;

        Object ID86_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:167:2: ( ID -> ^( TYPEDEF_NAME ID ) )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:167:4: ID
            {
            ID86=(Token)match(input,ID,FOLLOW_ID_in_typedef_name812);  
            stream_ID.add(ID86);


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
            // 167:7: -> ^( TYPEDEF_NAME ID )
            {
                // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:167:10: ^( TYPEDEF_NAME ID )
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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:169:1: typedef_declaration_element_wrapper : typedef_declaration_element -> ^( TYPEDEF_ELEMENT typedef_declaration_element ) ;
    public final ObjchParser.typedef_declaration_element_wrapper_return typedef_declaration_element_wrapper() throws RecognitionException {
        ObjchParser.typedef_declaration_element_wrapper_return retval = new ObjchParser.typedef_declaration_element_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.typedef_declaration_element_return typedef_declaration_element87 =null;


        RewriteRuleSubtreeStream stream_typedef_declaration_element=new RewriteRuleSubtreeStream(adaptor,"rule typedef_declaration_element");
        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:170:2: ( typedef_declaration_element -> ^( TYPEDEF_ELEMENT typedef_declaration_element ) )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:170:4: typedef_declaration_element
            {
            pushFollow(FOLLOW_typedef_declaration_element_in_typedef_declaration_element_wrapper829);
            typedef_declaration_element87=typedef_declaration_element();

            state._fsp--;

            stream_typedef_declaration_element.add(typedef_declaration_element87.getTree());

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
            // 170:32: -> ^( TYPEDEF_ELEMENT typedef_declaration_element )
            {
                // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:170:35: ^( TYPEDEF_ELEMENT typedef_declaration_element )
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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:173:1: typedef_declaration_element : ID ( '=' element_value )? ;
    public final ObjchParser.typedef_declaration_element_return typedef_declaration_element() throws RecognitionException {
        ObjchParser.typedef_declaration_element_return retval = new ObjchParser.typedef_declaration_element_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID88=null;
        Token char_literal89=null;
        ObjchParser.element_value_return element_value90 =null;


        Object ID88_tree=null;
        Object char_literal89_tree=null;

        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:174:2: ( ID ( '=' element_value )? )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:174:4: ID ( '=' element_value )?
            {
            root_0 = (Object)adaptor.nil();


            ID88=(Token)match(input,ID,FOLLOW_ID_in_typedef_declaration_element849); 
            ID88_tree = 
            (Object)adaptor.create(ID88)
            ;
            adaptor.addChild(root_0, ID88_tree);


            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:174:7: ( '=' element_value )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==54) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:174:8: '=' element_value
                    {
                    char_literal89=(Token)match(input,54,FOLLOW_54_in_typedef_declaration_element852); 
                    char_literal89_tree = 
                    (Object)adaptor.create(char_literal89)
                    ;
                    adaptor.addChild(root_0, char_literal89_tree);


                    pushFollow(FOLLOW_element_value_in_typedef_declaration_element854);
                    element_value90=element_value();

                    state._fsp--;

                    adaptor.addChild(root_0, element_value90.getTree());

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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:177:1: element_value : simple_expression -> ^( VALUE simple_expression ) ;
    public final ObjchParser.element_value_return element_value() throws RecognitionException {
        ObjchParser.element_value_return retval = new ObjchParser.element_value_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.simple_expression_return simple_expression91 =null;


        RewriteRuleSubtreeStream stream_simple_expression=new RewriteRuleSubtreeStream(adaptor,"rule simple_expression");
        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:178:2: ( simple_expression -> ^( VALUE simple_expression ) )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:178:4: simple_expression
            {
            pushFollow(FOLLOW_simple_expression_in_element_value868);
            simple_expression91=simple_expression();

            state._fsp--;

            stream_simple_expression.add(simple_expression91.getTree());

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
            // 178:22: -> ^( VALUE simple_expression )
            {
                // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:178:25: ^( VALUE simple_expression )
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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:181:1: simple_expression : simple_expression2 ( op2 simple_expression2 )* ;
    public final ObjchParser.simple_expression_return simple_expression() throws RecognitionException {
        ObjchParser.simple_expression_return retval = new ObjchParser.simple_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.simple_expression2_return simple_expression292 =null;

        ObjchParser.op2_return op293 =null;

        ObjchParser.simple_expression2_return simple_expression294 =null;



        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:182:2: ( simple_expression2 ( op2 simple_expression2 )* )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:182:4: simple_expression2 ( op2 simple_expression2 )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_simple_expression2_in_simple_expression889);
            simple_expression292=simple_expression2();

            state._fsp--;

            adaptor.addChild(root_0, simple_expression292.getTree());

            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:182:23: ( op2 simple_expression2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0 >= 42 && LA29_0 <= 43)||LA29_0==53||LA29_0==56||LA29_0==83) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:182:25: op2 simple_expression2
            	    {
            	    pushFollow(FOLLOW_op2_in_simple_expression893);
            	    op293=op2();

            	    state._fsp--;

            	    adaptor.addChild(root_0, op293.getTree());

            	    pushFollow(FOLLOW_simple_expression2_in_simple_expression895);
            	    simple_expression294=simple_expression2();

            	    state._fsp--;

            	    adaptor.addChild(root_0, simple_expression294.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:185:1: simple_expression2 : ( ID | NUMBER | '(' simple_expression ')' );
    public final ObjchParser.simple_expression2_return simple_expression2() throws RecognitionException {
        ObjchParser.simple_expression2_return retval = new ObjchParser.simple_expression2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID95=null;
        Token NUMBER96=null;
        Token char_literal97=null;
        Token char_literal99=null;
        ObjchParser.simple_expression_return simple_expression98 =null;


        Object ID95_tree=null;
        Object NUMBER96_tree=null;
        Object char_literal97_tree=null;
        Object char_literal99_tree=null;

        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:186:2: ( ID | NUMBER | '(' simple_expression ')' )
            int alt30=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt30=1;
                }
                break;
            case NUMBER:
                {
                alt30=2;
                }
                break;
            case 44:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }

            switch (alt30) {
                case 1 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:186:4: ID
                    {
                    root_0 = (Object)adaptor.nil();


                    ID95=(Token)match(input,ID,FOLLOW_ID_in_simple_expression2909); 
                    ID95_tree = 
                    (Object)adaptor.create(ID95)
                    ;
                    adaptor.addChild(root_0, ID95_tree);


                    }
                    break;
                case 2 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:187:4: NUMBER
                    {
                    root_0 = (Object)adaptor.nil();


                    NUMBER96=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_simple_expression2914); 
                    NUMBER96_tree = 
                    (Object)adaptor.create(NUMBER96)
                    ;
                    adaptor.addChild(root_0, NUMBER96_tree);


                    }
                    break;
                case 3 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:188:4: '(' simple_expression ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal97=(Token)match(input,44,FOLLOW_44_in_simple_expression2919); 
                    char_literal97_tree = 
                    (Object)adaptor.create(char_literal97)
                    ;
                    adaptor.addChild(root_0, char_literal97_tree);


                    pushFollow(FOLLOW_simple_expression_in_simple_expression2921);
                    simple_expression98=simple_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, simple_expression98.getTree());

                    char_literal99=(Token)match(input,45,FOLLOW_45_in_simple_expression2923); 
                    char_literal99_tree = 
                    (Object)adaptor.create(char_literal99)
                    ;
                    adaptor.addChild(root_0, char_literal99_tree);


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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:190:1: op2 : ( '|' | '&~' | '&' | '<<' | '>>' );
    public final ObjchParser.op2_return op2() throws RecognitionException {
        ObjchParser.op2_return retval = new ObjchParser.op2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set100=null;

        Object set100_tree=null;

        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:190:5: ( '|' | '&~' | '&' | '<<' | '>>' )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:
            {
            root_0 = (Object)adaptor.nil();


            set100=(Token)input.LT(1);

            if ( (input.LA(1) >= 42 && input.LA(1) <= 43)||input.LA(1)==53||input.LA(1)==56||input.LA(1)==83 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set100)
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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:192:1: class_declaration : '@class' ID ( ',' ID )* ';' ;
    public final ObjchParser.class_declaration_return class_declaration() throws RecognitionException {
        ObjchParser.class_declaration_return retval = new ObjchParser.class_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal101=null;
        Token ID102=null;
        Token char_literal103=null;
        Token ID104=null;
        Token char_literal105=null;

        Object string_literal101_tree=null;
        Object ID102_tree=null;
        Object char_literal103_tree=null;
        Object ID104_tree=null;
        Object char_literal105_tree=null;

        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:193:2: ( '@class' ID ( ',' ID )* ';' )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:193:4: '@class' ID ( ',' ID )* ';'
            {
            root_0 = (Object)adaptor.nil();


            string_literal101=(Token)match(input,57,FOLLOW_57_in_class_declaration958); 
            string_literal101_tree = 
            (Object)adaptor.create(string_literal101)
            ;
            adaptor.addChild(root_0, string_literal101_tree);


            ID102=(Token)match(input,ID,FOLLOW_ID_in_class_declaration960); 
            ID102_tree = 
            (Object)adaptor.create(ID102)
            ;
            adaptor.addChild(root_0, ID102_tree);


            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:193:16: ( ',' ID )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==48) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:193:17: ',' ID
            	    {
            	    char_literal103=(Token)match(input,48,FOLLOW_48_in_class_declaration963); 
            	    char_literal103_tree = 
            	    (Object)adaptor.create(char_literal103)
            	    ;
            	    adaptor.addChild(root_0, char_literal103_tree);


            	    ID104=(Token)match(input,ID,FOLLOW_ID_in_class_declaration965); 
            	    ID104_tree = 
            	    (Object)adaptor.create(ID104)
            	    ;
            	    adaptor.addChild(root_0, ID104_tree);


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            char_literal105=(Token)match(input,51,FOLLOW_51_in_class_declaration969); 
            char_literal105_tree = 
            (Object)adaptor.create(char_literal105)
            ;
            adaptor.addChild(root_0, char_literal105_tree);


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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:195:1: protocol_declaration : '@protocol' protocol_name ( generic )? protocol_end ;
    public final ObjchParser.protocol_declaration_return protocol_declaration() throws RecognitionException {
        ObjchParser.protocol_declaration_return retval = new ObjchParser.protocol_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal106=null;
        ObjchParser.protocol_name_return protocol_name107 =null;

        ObjchParser.generic_return generic108 =null;

        ObjchParser.protocol_end_return protocol_end109 =null;


        Object string_literal106_tree=null;

        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:196:2: ( '@protocol' protocol_name ( generic )? protocol_end )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:196:4: '@protocol' protocol_name ( generic )? protocol_end
            {
            root_0 = (Object)adaptor.nil();


            string_literal106=(Token)match(input,64,FOLLOW_64_in_protocol_declaration979); 
            string_literal106_tree = 
            (Object)adaptor.create(string_literal106)
            ;
            adaptor.addChild(root_0, string_literal106_tree);


            pushFollow(FOLLOW_protocol_name_in_protocol_declaration981);
            protocol_name107=protocol_name();

            state._fsp--;

            adaptor.addChild(root_0, protocol_name107.getTree());

            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:196:30: ( generic )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==52) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:196:30: generic
                    {
                    pushFollow(FOLLOW_generic_in_protocol_declaration983);
                    generic108=generic();

                    state._fsp--;

                    adaptor.addChild(root_0, generic108.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_protocol_end_in_protocol_declaration989);
            protocol_end109=protocol_end();

            state._fsp--;

            adaptor.addChild(root_0, protocol_end109.getTree());

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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:200:1: protocol_end : ( protocol_end1 | protocol_end2 );
    public final ObjchParser.protocol_end_return protocol_end() throws RecognitionException {
        ObjchParser.protocol_end_return retval = new ObjchParser.protocol_end_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.protocol_end1_return protocol_end1110 =null;

        ObjchParser.protocol_end2_return protocol_end2111 =null;



        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:201:2: ( protocol_end1 | protocol_end2 )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==ID||LA33_0==47||LA33_0==49||LA33_0==58||LA33_0==60||LA33_0==62||(LA33_0 >= 68 && LA33_0 <= 69)||(LA33_0 >= 72 && LA33_0 <= 73)||(LA33_0 >= 78 && LA33_0 <= 79)||LA33_0==81) ) {
                alt33=1;
            }
            else if ( (LA33_0==51) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }
            switch (alt33) {
                case 1 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:201:4: protocol_end1
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_protocol_end1_in_protocol_end1001);
                    protocol_end1110=protocol_end1();

                    state._fsp--;

                    adaptor.addChild(root_0, protocol_end1110.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:202:4: protocol_end2
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_protocol_end2_in_protocol_end1006);
                    protocol_end2111=protocol_end2();

                    state._fsp--;

                    adaptor.addChild(root_0, protocol_end2111.getTree());

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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:204:1: protocol_end1 : ( declarations )* '@end' ;
    public final ObjchParser.protocol_end1_return protocol_end1() throws RecognitionException {
        ObjchParser.protocol_end1_return retval = new ObjchParser.protocol_end1_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal113=null;
        ObjchParser.declarations_return declarations112 =null;


        Object string_literal113_tree=null;

        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:205:2: ( ( declarations )* '@end' )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:205:4: ( declarations )* '@end'
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:205:4: ( declarations )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==ID||LA34_0==47||LA34_0==49||LA34_0==60||LA34_0==62||(LA34_0 >= 68 && LA34_0 <= 69)||(LA34_0 >= 72 && LA34_0 <= 73)||(LA34_0 >= 78 && LA34_0 <= 79)||LA34_0==81) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:205:4: declarations
            	    {
            	    pushFollow(FOLLOW_declarations_in_protocol_end11015);
            	    declarations112=declarations();

            	    state._fsp--;

            	    adaptor.addChild(root_0, declarations112.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            string_literal113=(Token)match(input,58,FOLLOW_58_in_protocol_end11020); 
            string_literal113_tree = 
            (Object)adaptor.create(string_literal113)
            ;
            adaptor.addChild(root_0, string_literal113_tree);


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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:209:1: protocol_end2 : ';' ;
    public final ObjchParser.protocol_end2_return protocol_end2() throws RecognitionException {
        ObjchParser.protocol_end2_return retval = new ObjchParser.protocol_end2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal114=null;

        Object char_literal114_tree=null;

        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:210:2: ( ';' )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:210:4: ';'
            {
            root_0 = (Object)adaptor.nil();


            char_literal114=(Token)match(input,51,FOLLOW_51_in_protocol_end21032); 
            char_literal114_tree = 
            (Object)adaptor.create(char_literal114)
            ;
            adaptor.addChild(root_0, char_literal114_tree);


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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:214:1: generic : '<' generic_internal '>' ;
    public final ObjchParser.generic_return generic() throws RecognitionException {
        ObjchParser.generic_return retval = new ObjchParser.generic_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal115=null;
        Token char_literal117=null;
        ObjchParser.generic_internal_return generic_internal116 =null;


        Object char_literal115_tree=null;
        Object char_literal117_tree=null;

        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:214:9: ( '<' generic_internal '>' )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:214:11: '<' generic_internal '>'
            {
            root_0 = (Object)adaptor.nil();


            char_literal115=(Token)match(input,52,FOLLOW_52_in_generic1045); 
            char_literal115_tree = 
            (Object)adaptor.create(char_literal115)
            ;
            adaptor.addChild(root_0, char_literal115_tree);


            pushFollow(FOLLOW_generic_internal_in_generic1047);
            generic_internal116=generic_internal();

            state._fsp--;

            adaptor.addChild(root_0, generic_internal116.getTree());

            char_literal117=(Token)match(input,55,FOLLOW_55_in_generic1049); 
            char_literal117_tree = 
            (Object)adaptor.create(char_literal117)
            ;
            adaptor.addChild(root_0, char_literal117_tree);


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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:216:1: generic_internal : type_declaration ( ',' type_declaration )* ;
    public final ObjchParser.generic_internal_return generic_internal() throws RecognitionException {
        ObjchParser.generic_internal_return retval = new ObjchParser.generic_internal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal119=null;
        ObjchParser.type_declaration_return type_declaration118 =null;

        ObjchParser.type_declaration_return type_declaration120 =null;


        Object char_literal119_tree=null;

        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:217:2: ( type_declaration ( ',' type_declaration )* )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:217:4: type_declaration ( ',' type_declaration )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_declaration_in_generic_internal1058);
            type_declaration118=type_declaration();

            state._fsp--;

            adaptor.addChild(root_0, type_declaration118.getTree());

            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:217:21: ( ',' type_declaration )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==48) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:217:22: ',' type_declaration
            	    {
            	    char_literal119=(Token)match(input,48,FOLLOW_48_in_generic_internal1061); 
            	    char_literal119_tree = 
            	    (Object)adaptor.create(char_literal119)
            	    ;
            	    adaptor.addChild(root_0, char_literal119_tree);


            	    pushFollow(FOLLOW_type_declaration_in_generic_internal1063);
            	    type_declaration120=type_declaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, type_declaration120.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:219:1: protocol_name : ID -> ^( NAME ID ) ;
    public final ObjchParser.protocol_name_return protocol_name() throws RecognitionException {
        ObjchParser.protocol_name_return retval = new ObjchParser.protocol_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID121=null;

        Object ID121_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:220:2: ( ID -> ^( NAME ID ) )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:220:4: ID
            {
            ID121=(Token)match(input,ID,FOLLOW_ID_in_protocol_name1075);  
            stream_ID.add(ID121);


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
            // 220:7: -> ^( NAME ID )
            {
                // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:220:10: ^( NAME ID )
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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:222:1: interface_declaration : '@interface' interface_name ( ':' superclass_name )? ( interface_body )? ( declarations )* '@end' ;
    public final ObjchParser.interface_declaration_return interface_declaration() throws RecognitionException {
        ObjchParser.interface_declaration_return retval = new ObjchParser.interface_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal122=null;
        Token char_literal124=null;
        Token string_literal128=null;
        ObjchParser.interface_name_return interface_name123 =null;

        ObjchParser.superclass_name_return superclass_name125 =null;

        ObjchParser.interface_body_return interface_body126 =null;

        ObjchParser.declarations_return declarations127 =null;


        Object string_literal122_tree=null;
        Object char_literal124_tree=null;
        Object string_literal128_tree=null;

        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:223:2: ( '@interface' interface_name ( ':' superclass_name )? ( interface_body )? ( declarations )* '@end' )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:223:4: '@interface' interface_name ( ':' superclass_name )? ( interface_body )? ( declarations )* '@end'
            {
            root_0 = (Object)adaptor.nil();


            string_literal122=(Token)match(input,59,FOLLOW_59_in_interface_declaration1095); 
            string_literal122_tree = 
            (Object)adaptor.create(string_literal122)
            ;
            adaptor.addChild(root_0, string_literal122_tree);


            pushFollow(FOLLOW_interface_name_in_interface_declaration1097);
            interface_name123=interface_name();

            state._fsp--;

            adaptor.addChild(root_0, interface_name123.getTree());

            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:223:32: ( ':' superclass_name )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==50) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:223:33: ':' superclass_name
                    {
                    char_literal124=(Token)match(input,50,FOLLOW_50_in_interface_declaration1100); 
                    char_literal124_tree = 
                    (Object)adaptor.create(char_literal124)
                    ;
                    adaptor.addChild(root_0, char_literal124_tree);


                    pushFollow(FOLLOW_superclass_name_in_interface_declaration1102);
                    superclass_name125=superclass_name();

                    state._fsp--;

                    adaptor.addChild(root_0, superclass_name125.getTree());

                    }
                    break;

            }


            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:224:2: ( interface_body )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==82) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:224:2: interface_body
                    {
                    pushFollow(FOLLOW_interface_body_in_interface_declaration1107);
                    interface_body126=interface_body();

                    state._fsp--;

                    adaptor.addChild(root_0, interface_body126.getTree());

                    }
                    break;

            }


            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:225:2: ( declarations )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==ID||LA38_0==47||LA38_0==49||LA38_0==60||LA38_0==62||(LA38_0 >= 68 && LA38_0 <= 69)||(LA38_0 >= 72 && LA38_0 <= 73)||(LA38_0 >= 78 && LA38_0 <= 79)||LA38_0==81) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:225:2: declarations
            	    {
            	    pushFollow(FOLLOW_declarations_in_interface_declaration1111);
            	    declarations127=declarations();

            	    state._fsp--;

            	    adaptor.addChild(root_0, declarations127.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            string_literal128=(Token)match(input,58,FOLLOW_58_in_interface_declaration1115); 
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
    // $ANTLR end "interface_declaration"


    public static class interface_body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interface_body"
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:229:1: interface_body : '{' ( ( group_modifier_wrapper )? simple_fields_declaration )* '}' ;
    public final ObjchParser.interface_body_return interface_body() throws RecognitionException {
        ObjchParser.interface_body_return retval = new ObjchParser.interface_body_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal129=null;
        Token char_literal132=null;
        ObjchParser.group_modifier_wrapper_return group_modifier_wrapper130 =null;

        ObjchParser.simple_fields_declaration_return simple_fields_declaration131 =null;


        Object char_literal129_tree=null;
        Object char_literal132_tree=null;

        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:230:2: ( '{' ( ( group_modifier_wrapper )? simple_fields_declaration )* '}' )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:231:2: '{' ( ( group_modifier_wrapper )? simple_fields_declaration )* '}'
            {
            root_0 = (Object)adaptor.nil();


            char_literal129=(Token)match(input,82,FOLLOW_82_in_interface_body1128); 
            char_literal129_tree = 
            (Object)adaptor.create(char_literal129)
            ;
            adaptor.addChild(root_0, char_literal129_tree);


            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:232:3: ( ( group_modifier_wrapper )? simple_fields_declaration )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==ID||LA40_0==61||LA40_0==63||LA40_0==65||(LA40_0 >= 68 && LA40_0 <= 69)||(LA40_0 >= 72 && LA40_0 <= 73)||(LA40_0 >= 78 && LA40_0 <= 79)||LA40_0==81) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:232:4: ( group_modifier_wrapper )? simple_fields_declaration
            	    {
            	    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:232:4: ( group_modifier_wrapper )?
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==61||LA39_0==63||LA39_0==65) ) {
            	        alt39=1;
            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:232:4: group_modifier_wrapper
            	            {
            	            pushFollow(FOLLOW_group_modifier_wrapper_in_interface_body1133);
            	            group_modifier_wrapper130=group_modifier_wrapper();

            	            state._fsp--;

            	            adaptor.addChild(root_0, group_modifier_wrapper130.getTree());

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_simple_fields_declaration_in_interface_body1139);
            	    simple_fields_declaration131=simple_fields_declaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, simple_fields_declaration131.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            char_literal132=(Token)match(input,84,FOLLOW_84_in_interface_body1144); 
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
    // $ANTLR end "interface_body"


    public static class group_modifier_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "group_modifier_wrapper"
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:237:1: group_modifier_wrapper : group_modifier -> ^( GROUP_MODIFIER group_modifier ) ;
    public final ObjchParser.group_modifier_wrapper_return group_modifier_wrapper() throws RecognitionException {
        ObjchParser.group_modifier_wrapper_return retval = new ObjchParser.group_modifier_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.group_modifier_return group_modifier133 =null;


        RewriteRuleSubtreeStream stream_group_modifier=new RewriteRuleSubtreeStream(adaptor,"rule group_modifier");
        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:238:2: ( group_modifier -> ^( GROUP_MODIFIER group_modifier ) )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:238:4: group_modifier
            {
            pushFollow(FOLLOW_group_modifier_in_group_modifier_wrapper1156);
            group_modifier133=group_modifier();

            state._fsp--;

            stream_group_modifier.add(group_modifier133.getTree());

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
            // 238:19: -> ^( GROUP_MODIFIER group_modifier )
            {
                // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:238:22: ^( GROUP_MODIFIER group_modifier )
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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:240:1: group_modifier : ( '@private' | '@protected' | '@public' );
    public final ObjchParser.group_modifier_return group_modifier() throws RecognitionException {
        ObjchParser.group_modifier_return retval = new ObjchParser.group_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set134=null;

        Object set134_tree=null;

        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:241:2: ( '@private' | '@protected' | '@public' )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:
            {
            root_0 = (Object)adaptor.nil();


            set134=(Token)input.LT(1);

            if ( input.LA(1)==61||input.LA(1)==63||input.LA(1)==65 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set134)
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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:243:1: interface_name : ID ( category )? -> ^( INTERFACE_NAME ID ( category )? ) ;
    public final ObjchParser.interface_name_return interface_name() throws RecognitionException {
        ObjchParser.interface_name_return retval = new ObjchParser.interface_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID135=null;
        ObjchParser.category_return category136 =null;


        Object ID135_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_category=new RewriteRuleSubtreeStream(adaptor,"rule category");
        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:244:2: ( ID ( category )? -> ^( INTERFACE_NAME ID ( category )? ) )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:244:4: ID ( category )?
            {
            ID135=(Token)match(input,ID,FOLLOW_ID_in_interface_name1195);  
            stream_ID.add(ID135);


            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:244:7: ( category )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==44) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:244:7: category
                    {
                    pushFollow(FOLLOW_category_in_interface_name1197);
                    category136=category();

                    state._fsp--;

                    stream_category.add(category136.getTree());

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
            // 244:17: -> ^( INTERFACE_NAME ID ( category )? )
            {
                // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:244:20: ^( INTERFACE_NAME ID ( category )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INTERFACE_NAME, "INTERFACE_NAME")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:244:40: ( category )?
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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:246:1: category : '(' ID ')' -> ^( CATEGORY ID ) ;
    public final ObjchParser.category_return category() throws RecognitionException {
        ObjchParser.category_return retval = new ObjchParser.category_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal137=null;
        Token ID138=null;
        Token char_literal139=null;

        Object char_literal137_tree=null;
        Object ID138_tree=null;
        Object char_literal139_tree=null;
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:246:9: ( '(' ID ')' -> ^( CATEGORY ID ) )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:246:11: '(' ID ')'
            {
            char_literal137=(Token)match(input,44,FOLLOW_44_in_category1216);  
            stream_44.add(char_literal137);


            ID138=(Token)match(input,ID,FOLLOW_ID_in_category1218);  
            stream_ID.add(ID138);


            char_literal139=(Token)match(input,45,FOLLOW_45_in_category1220);  
            stream_45.add(char_literal139);


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
            // 246:22: -> ^( CATEGORY ID )
            {
                // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:246:25: ^( CATEGORY ID )
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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:248:1: superclass_name : ID ( generic )? -> ^( SUPERCLASS_NAME ID ( generic )? ) ;
    public final ObjchParser.superclass_name_return superclass_name() throws RecognitionException {
        ObjchParser.superclass_name_return retval = new ObjchParser.superclass_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID140=null;
        ObjchParser.generic_return generic141 =null;


        Object ID140_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_generic=new RewriteRuleSubtreeStream(adaptor,"rule generic");
        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:249:2: ( ID ( generic )? -> ^( SUPERCLASS_NAME ID ( generic )? ) )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:249:4: ID ( generic )?
            {
            ID140=(Token)match(input,ID,FOLLOW_ID_in_superclass_name1237);  
            stream_ID.add(ID140);


            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:249:7: ( generic )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==52) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:249:7: generic
                    {
                    pushFollow(FOLLOW_generic_in_superclass_name1239);
                    generic141=generic();

                    state._fsp--;

                    stream_generic.add(generic141.getTree());

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
            // 249:16: -> ^( SUPERCLASS_NAME ID ( generic )? )
            {
                // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:249:19: ^( SUPERCLASS_NAME ID ( generic )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SUPERCLASS_NAME, "SUPERCLASS_NAME")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:249:40: ( generic )?
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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:251:1: simple_fields_declaration : fields_declarations -> ^( FIELDS fields_declarations ) ;
    public final ObjchParser.simple_fields_declaration_return simple_fields_declaration() throws RecognitionException {
        ObjchParser.simple_fields_declaration_return retval = new ObjchParser.simple_fields_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.fields_declarations_return fields_declarations142 =null;


        RewriteRuleSubtreeStream stream_fields_declarations=new RewriteRuleSubtreeStream(adaptor,"rule fields_declarations");
        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:252:2: ( fields_declarations -> ^( FIELDS fields_declarations ) )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:252:4: fields_declarations
            {
            pushFollow(FOLLOW_fields_declarations_in_simple_fields_declaration1261);
            fields_declarations142=fields_declarations();

            state._fsp--;

            stream_fields_declarations.add(fields_declarations142.getTree());

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
            // 252:24: -> ^( FIELDS fields_declarations )
            {
                // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:252:27: ^( FIELDS fields_declarations )
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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:254:1: fields_declarations : ( field_declaration )+ -> ( ^( FIELD field_declaration ) )+ ;
    public final ObjchParser.fields_declarations_return fields_declarations() throws RecognitionException {
        ObjchParser.fields_declarations_return retval = new ObjchParser.fields_declarations_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.field_declaration_return field_declaration143 =null;


        RewriteRuleSubtreeStream stream_field_declaration=new RewriteRuleSubtreeStream(adaptor,"rule field_declaration");
        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:255:2: ( ( field_declaration )+ -> ( ^( FIELD field_declaration ) )+ )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:255:4: ( field_declaration )+
            {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:255:4: ( field_declaration )+
            int cnt43=0;
            loop43:
            do {
                int alt43=2;
                switch ( input.LA(1) ) {
                case 68:
                    {
                    alt43=1;
                    }
                    break;
                case 69:
                    {
                    alt43=1;
                    }
                    break;
                case 79:
                    {
                    alt43=1;
                    }
                    break;
                case 78:
                    {
                    alt43=1;
                    }
                    break;
                case 81:
                    {
                    alt43=1;
                    }
                    break;
                case 72:
                    {
                    alt43=1;
                    }
                    break;
                case 73:
                    {
                    alt43=1;
                    }
                    break;
                case ID:
                    {
                    alt43=1;
                    }
                    break;

                }

                switch (alt43) {
            	case 1 :
            	    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:255:4: field_declaration
            	    {
            	    pushFollow(FOLLOW_field_declaration_in_fields_declarations1279);
            	    field_declaration143=field_declaration();

            	    state._fsp--;

            	    stream_field_declaration.add(field_declaration143.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt43 >= 1 ) break loop43;
                        EarlyExitException eee =
                            new EarlyExitException(43, input);
                        throw eee;
                }
                cnt43++;
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
            // 255:23: -> ( ^( FIELD field_declaration ) )+
            {
                if ( !(stream_field_declaration.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_field_declaration.hasNext() ) {
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:255:26: ^( FIELD field_declaration )
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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:257:1: field_declaration : type_declaration field_name ( classical_method_params | ( ',' field_name )* ) ';' ;
    public final ObjchParser.field_declaration_return field_declaration() throws RecognitionException {
        ObjchParser.field_declaration_return retval = new ObjchParser.field_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal147=null;
        Token char_literal149=null;
        ObjchParser.type_declaration_return type_declaration144 =null;

        ObjchParser.field_name_return field_name145 =null;

        ObjchParser.classical_method_params_return classical_method_params146 =null;

        ObjchParser.field_name_return field_name148 =null;


        Object char_literal147_tree=null;
        Object char_literal149_tree=null;

        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:258:2: ( type_declaration field_name ( classical_method_params | ( ',' field_name )* ) ';' )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:258:4: type_declaration field_name ( classical_method_params | ( ',' field_name )* ) ';'
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_declaration_in_field_declaration1299);
            type_declaration144=type_declaration();

            state._fsp--;

            adaptor.addChild(root_0, type_declaration144.getTree());

            pushFollow(FOLLOW_field_name_in_field_declaration1301);
            field_name145=field_name();

            state._fsp--;

            adaptor.addChild(root_0, field_name145.getTree());

            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:258:32: ( classical_method_params | ( ',' field_name )* )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==44) ) {
                alt45=1;
            }
            else if ( (LA45_0==48||LA45_0==51) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;

            }
            switch (alt45) {
                case 1 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:258:33: classical_method_params
                    {
                    pushFollow(FOLLOW_classical_method_params_in_field_declaration1304);
                    classical_method_params146=classical_method_params();

                    state._fsp--;

                    adaptor.addChild(root_0, classical_method_params146.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:258:59: ( ',' field_name )*
                    {
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:258:59: ( ',' field_name )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==48) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:258:60: ',' field_name
                    	    {
                    	    char_literal147=(Token)match(input,48,FOLLOW_48_in_field_declaration1309); 
                    	    char_literal147_tree = 
                    	    (Object)adaptor.create(char_literal147)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal147_tree);


                    	    pushFollow(FOLLOW_field_name_in_field_declaration1311);
                    	    field_name148=field_name();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, field_name148.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);


                    }
                    break;

            }


            char_literal149=(Token)match(input,51,FOLLOW_51_in_field_declaration1316); 
            char_literal149_tree = 
            (Object)adaptor.create(char_literal149)
            ;
            adaptor.addChild(root_0, char_literal149_tree);


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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:260:1: classical_method_params : '(' classical_param ( ',' classical_param )* ')' ;
    public final ObjchParser.classical_method_params_return classical_method_params() throws RecognitionException {
        ObjchParser.classical_method_params_return retval = new ObjchParser.classical_method_params_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal150=null;
        Token char_literal152=null;
        Token char_literal154=null;
        ObjchParser.classical_param_return classical_param151 =null;

        ObjchParser.classical_param_return classical_param153 =null;


        Object char_literal150_tree=null;
        Object char_literal152_tree=null;
        Object char_literal154_tree=null;

        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:261:2: ( '(' classical_param ( ',' classical_param )* ')' )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:261:4: '(' classical_param ( ',' classical_param )* ')'
            {
            root_0 = (Object)adaptor.nil();


            char_literal150=(Token)match(input,44,FOLLOW_44_in_classical_method_params1326); 
            char_literal150_tree = 
            (Object)adaptor.create(char_literal150)
            ;
            adaptor.addChild(root_0, char_literal150_tree);


            pushFollow(FOLLOW_classical_param_in_classical_method_params1328);
            classical_param151=classical_param();

            state._fsp--;

            adaptor.addChild(root_0, classical_param151.getTree());

            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:261:24: ( ',' classical_param )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==48) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:261:25: ',' classical_param
            	    {
            	    char_literal152=(Token)match(input,48,FOLLOW_48_in_classical_method_params1331); 
            	    char_literal152_tree = 
            	    (Object)adaptor.create(char_literal152)
            	    ;
            	    adaptor.addChild(root_0, char_literal152_tree);


            	    pushFollow(FOLLOW_classical_param_in_classical_method_params1333);
            	    classical_param153=classical_param();

            	    state._fsp--;

            	    adaptor.addChild(root_0, classical_param153.getTree());

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            char_literal154=(Token)match(input,45,FOLLOW_45_in_classical_method_params1337); 
            char_literal154_tree = 
            (Object)adaptor.create(char_literal154)
            ;
            adaptor.addChild(root_0, char_literal154_tree);


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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:264:1: classical_param : type_declaration ID ( '[' ( NUMBER )? ']' )* ;
    public final ObjchParser.classical_param_return classical_param() throws RecognitionException {
        ObjchParser.classical_param_return retval = new ObjchParser.classical_param_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID156=null;
        Token char_literal157=null;
        Token NUMBER158=null;
        Token char_literal159=null;
        ObjchParser.type_declaration_return type_declaration155 =null;


        Object ID156_tree=null;
        Object char_literal157_tree=null;
        Object NUMBER158_tree=null;
        Object char_literal159_tree=null;

        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:265:2: ( type_declaration ID ( '[' ( NUMBER )? ']' )* )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:265:4: type_declaration ID ( '[' ( NUMBER )? ']' )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_declaration_in_classical_param1350);
            type_declaration155=type_declaration();

            state._fsp--;

            adaptor.addChild(root_0, type_declaration155.getTree());

            ID156=(Token)match(input,ID,FOLLOW_ID_in_classical_param1352); 
            ID156_tree = 
            (Object)adaptor.create(ID156)
            ;
            adaptor.addChild(root_0, ID156_tree);


            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:265:24: ( '[' ( NUMBER )? ']' )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==66) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:265:25: '[' ( NUMBER )? ']'
            	    {
            	    char_literal157=(Token)match(input,66,FOLLOW_66_in_classical_param1355); 
            	    char_literal157_tree = 
            	    (Object)adaptor.create(char_literal157)
            	    ;
            	    adaptor.addChild(root_0, char_literal157_tree);


            	    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:265:29: ( NUMBER )?
            	    int alt47=2;
            	    int LA47_0 = input.LA(1);

            	    if ( (LA47_0==NUMBER) ) {
            	        alt47=1;
            	    }
            	    switch (alt47) {
            	        case 1 :
            	            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:265:29: NUMBER
            	            {
            	            NUMBER158=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_classical_param1357); 
            	            NUMBER158_tree = 
            	            (Object)adaptor.create(NUMBER158)
            	            ;
            	            adaptor.addChild(root_0, NUMBER158_tree);


            	            }
            	            break;

            	    }


            	    char_literal159=(Token)match(input,67,FOLLOW_67_in_classical_param1360); 
            	    char_literal159_tree = 
            	    (Object)adaptor.create(char_literal159)
            	    ;
            	    adaptor.addChild(root_0, char_literal159_tree);


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:267:1: type_declaration : ( 'const' )? ( 'enum' )? ( 'typedef' )? ( 'struct' )? ( ( 'unsigned' ( type_dec )? ) | type_dec ) ( 'const' )? ( generic )? ( '*' )? -> ^( TYPE type_dec ( generic )? ( '*' )? ) ;
    public final ObjchParser.type_declaration_return type_declaration() throws RecognitionException {
        ObjchParser.type_declaration_return retval = new ObjchParser.type_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal160=null;
        Token string_literal161=null;
        Token string_literal162=null;
        Token string_literal163=null;
        Token string_literal164=null;
        Token string_literal167=null;
        Token char_literal169=null;
        ObjchParser.type_dec_return type_dec165 =null;

        ObjchParser.type_dec_return type_dec166 =null;

        ObjchParser.generic_return generic168 =null;


        Object string_literal160_tree=null;
        Object string_literal161_tree=null;
        Object string_literal162_tree=null;
        Object string_literal163_tree=null;
        Object string_literal164_tree=null;
        Object string_literal167_tree=null;
        Object char_literal169_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleSubtreeStream stream_generic=new RewriteRuleSubtreeStream(adaptor,"rule generic");
        RewriteRuleSubtreeStream stream_type_dec=new RewriteRuleSubtreeStream(adaptor,"rule type_dec");
        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:268:2: ( ( 'const' )? ( 'enum' )? ( 'typedef' )? ( 'struct' )? ( ( 'unsigned' ( type_dec )? ) | type_dec ) ( 'const' )? ( generic )? ( '*' )? -> ^( TYPE type_dec ( generic )? ( '*' )? ) )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:268:4: ( 'const' )? ( 'enum' )? ( 'typedef' )? ( 'struct' )? ( ( 'unsigned' ( type_dec )? ) | type_dec ) ( 'const' )? ( generic )? ( '*' )?
            {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:268:4: ( 'const' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==68) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:268:4: 'const'
                    {
                    string_literal160=(Token)match(input,68,FOLLOW_68_in_type_declaration1374);  
                    stream_68.add(string_literal160);


                    }
                    break;

            }


            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:268:13: ( 'enum' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==69) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:268:13: 'enum'
                    {
                    string_literal161=(Token)match(input,69,FOLLOW_69_in_type_declaration1377);  
                    stream_69.add(string_literal161);


                    }
                    break;

            }


            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:268:21: ( 'typedef' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==79) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:268:21: 'typedef'
                    {
                    string_literal162=(Token)match(input,79,FOLLOW_79_in_type_declaration1380);  
                    stream_79.add(string_literal162);


                    }
                    break;

            }


            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:268:32: ( 'struct' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==78) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:268:32: 'struct'
                    {
                    string_literal163=(Token)match(input,78,FOLLOW_78_in_type_declaration1383);  
                    stream_78.add(string_literal163);


                    }
                    break;

            }


            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:268:42: ( ( 'unsigned' ( type_dec )? ) | type_dec )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==81) ) {
                alt54=1;
            }
            else if ( (LA54_0==ID||(LA54_0 >= 72 && LA54_0 <= 73)) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;

            }
            switch (alt54) {
                case 1 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:268:43: ( 'unsigned' ( type_dec )? )
                    {
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:268:43: ( 'unsigned' ( type_dec )? )
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:268:44: 'unsigned' ( type_dec )?
                    {
                    string_literal164=(Token)match(input,81,FOLLOW_81_in_type_declaration1388);  
                    stream_81.add(string_literal164);


                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:268:55: ( type_dec )?
                    int alt53=2;
                    alt53 = dfa53.predict(input);
                    switch (alt53) {
                        case 1 :
                            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:268:55: type_dec
                            {
                            pushFollow(FOLLOW_type_dec_in_type_declaration1390);
                            type_dec165=type_dec();

                            state._fsp--;

                            stream_type_dec.add(type_dec165.getTree());

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:268:68: type_dec
                    {
                    pushFollow(FOLLOW_type_dec_in_type_declaration1396);
                    type_dec166=type_dec();

                    state._fsp--;

                    stream_type_dec.add(type_dec166.getTree());

                    }
                    break;

            }


            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:268:78: ( 'const' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==68) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:268:78: 'const'
                    {
                    string_literal167=(Token)match(input,68,FOLLOW_68_in_type_declaration1399);  
                    stream_68.add(string_literal167);


                    }
                    break;

            }


            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:268:87: ( generic )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==52) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:268:87: generic
                    {
                    pushFollow(FOLLOW_generic_in_type_declaration1402);
                    generic168=generic();

                    state._fsp--;

                    stream_generic.add(generic168.getTree());

                    }
                    break;

            }


            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:268:96: ( '*' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==46) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:268:96: '*'
                    {
                    char_literal169=(Token)match(input,46,FOLLOW_46_in_type_declaration1405);  
                    stream_46.add(char_literal169);


                    }
                    break;

            }


            // AST REWRITE
            // elements: generic, type_dec, 46
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 268:101: -> ^( TYPE type_dec ( generic )? ( '*' )? )
            {
                // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:268:104: ^( TYPE type_dec ( generic )? ( '*' )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TYPE, "TYPE")
                , root_1);

                adaptor.addChild(root_1, stream_type_dec.nextTree());

                // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:268:120: ( generic )?
                if ( stream_generic.hasNext() ) {
                    adaptor.addChild(root_1, stream_generic.nextTree());

                }
                stream_generic.reset();

                // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:268:129: ( '*' )?
                if ( stream_46.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_46.nextNode()
                    );

                }
                stream_46.reset();

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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:270:1: type_dec : type_dec_internal ( '[' ']' )* ;
    public final ObjchParser.type_dec_return type_dec() throws RecognitionException {
        ObjchParser.type_dec_return retval = new ObjchParser.type_dec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal171=null;
        Token char_literal172=null;
        ObjchParser.type_dec_internal_return type_dec_internal170 =null;


        Object char_literal171_tree=null;
        Object char_literal172_tree=null;

        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:270:9: ( type_dec_internal ( '[' ']' )* )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:270:11: type_dec_internal ( '[' ']' )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_dec_internal_in_type_dec1428);
            type_dec_internal170=type_dec_internal();

            state._fsp--;

            adaptor.addChild(root_0, type_dec_internal170.getTree());

            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:270:29: ( '[' ']' )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==66) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:270:30: '[' ']'
            	    {
            	    char_literal171=(Token)match(input,66,FOLLOW_66_in_type_dec1431); 
            	    char_literal171_tree = 
            	    (Object)adaptor.create(char_literal171)
            	    ;
            	    adaptor.addChild(root_0, char_literal171_tree);


            	    char_literal172=(Token)match(input,67,FOLLOW_67_in_type_dec1433); 
            	    char_literal172_tree = 
            	    (Object)adaptor.create(char_literal172)
            	    ;
            	    adaptor.addChild(root_0, char_literal172_tree);


            	    }
            	    break;

            	default :
            	    break loop58;
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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:273:1: type_dec_internal : ( knownTypes | ID );
    public final ObjchParser.type_dec_internal_return type_dec_internal() throws RecognitionException {
        ObjchParser.type_dec_internal_return retval = new ObjchParser.type_dec_internal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID174=null;
        ObjchParser.knownTypes_return knownTypes173 =null;


        Object ID174_tree=null;

        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:274:2: ( knownTypes | ID )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0 >= 72 && LA59_0 <= 73)) ) {
                alt59=1;
            }
            else if ( (LA59_0==ID) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;

            }
            switch (alt59) {
                case 1 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:274:4: knownTypes
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_knownTypes_in_type_dec_internal1447);
                    knownTypes173=knownTypes();

                    state._fsp--;

                    adaptor.addChild(root_0, knownTypes173.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:275:5: ID
                    {
                    root_0 = (Object)adaptor.nil();


                    ID174=(Token)match(input,ID,FOLLOW_ID_in_type_dec_internal1454); 
                    ID174_tree = 
                    (Object)adaptor.create(ID174)
                    ;
                    adaptor.addChild(root_0, ID174_tree);


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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:278:1: knownTypes : ( 'int' | ( 'long' )+ ( 'int' )? );
    public final ObjchParser.knownTypes_return knownTypes() throws RecognitionException {
        ObjchParser.knownTypes_return retval = new ObjchParser.knownTypes_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal175=null;
        Token string_literal176=null;
        Token string_literal177=null;

        Object string_literal175_tree=null;
        Object string_literal176_tree=null;
        Object string_literal177_tree=null;

        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:279:2: ( 'int' | ( 'long' )+ ( 'int' )? )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==72) ) {
                alt62=1;
            }
            else if ( (LA62_0==73) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;

            }
            switch (alt62) {
                case 1 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:279:4: 'int'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal175=(Token)match(input,72,FOLLOW_72_in_knownTypes1465); 
                    string_literal175_tree = 
                    (Object)adaptor.create(string_literal175)
                    ;
                    adaptor.addChild(root_0, string_literal175_tree);


                    }
                    break;
                case 2 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:280:4: ( 'long' )+ ( 'int' )?
                    {
                    root_0 = (Object)adaptor.nil();


                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:280:4: ( 'long' )+
                    int cnt60=0;
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==73) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:280:4: 'long'
                    	    {
                    	    string_literal176=(Token)match(input,73,FOLLOW_73_in_knownTypes1470); 
                    	    string_literal176_tree = 
                    	    (Object)adaptor.create(string_literal176)
                    	    ;
                    	    adaptor.addChild(root_0, string_literal176_tree);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt60 >= 1 ) break loop60;
                                EarlyExitException eee =
                                    new EarlyExitException(60, input);
                                throw eee;
                        }
                        cnt60++;
                    } while (true);


                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:280:12: ( 'int' )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==72) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:280:12: 'int'
                            {
                            string_literal177=(Token)match(input,72,FOLLOW_72_in_knownTypes1473); 
                            string_literal177_tree = 
                            (Object)adaptor.create(string_literal177)
                            ;
                            adaptor.addChild(root_0, string_literal177_tree);


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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:283:1: field_name : ID ( array_size )? ( field_crap )? -> ^( FIELD_NAME ID ( array_size )? ) ;
    public final ObjchParser.field_name_return field_name() throws RecognitionException {
        ObjchParser.field_name_return retval = new ObjchParser.field_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID178=null;
        ObjchParser.array_size_return array_size179 =null;

        ObjchParser.field_crap_return field_crap180 =null;


        Object ID178_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_array_size=new RewriteRuleSubtreeStream(adaptor,"rule array_size");
        RewriteRuleSubtreeStream stream_field_crap=new RewriteRuleSubtreeStream(adaptor,"rule field_crap");
        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:284:2: ( ID ( array_size )? ( field_crap )? -> ^( FIELD_NAME ID ( array_size )? ) )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:284:4: ID ( array_size )? ( field_crap )?
            {
            ID178=(Token)match(input,ID,FOLLOW_ID_in_field_name1486);  
            stream_ID.add(ID178);


            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:284:7: ( array_size )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==66) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:284:7: array_size
                    {
                    pushFollow(FOLLOW_array_size_in_field_name1488);
                    array_size179=array_size();

                    state._fsp--;

                    stream_array_size.add(array_size179.getTree());

                    }
                    break;

            }


            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:284:19: ( field_crap )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==50) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:284:20: field_crap
                    {
                    pushFollow(FOLLOW_field_crap_in_field_name1492);
                    field_crap180=field_crap();

                    state._fsp--;

                    stream_field_crap.add(field_crap180.getTree());

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
            // 284:33: -> ^( FIELD_NAME ID ( array_size )? )
            {
                // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:284:36: ^( FIELD_NAME ID ( array_size )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FIELD_NAME, "FIELD_NAME")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:284:52: ( array_size )?
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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:286:1: array_size : '[' ( NUMBER )? ']' ;
    public final ObjchParser.array_size_return array_size() throws RecognitionException {
        ObjchParser.array_size_return retval = new ObjchParser.array_size_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal181=null;
        Token NUMBER182=null;
        Token char_literal183=null;

        Object char_literal181_tree=null;
        Object NUMBER182_tree=null;
        Object char_literal183_tree=null;

        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:287:2: ( '[' ( NUMBER )? ']' )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:287:4: '[' ( NUMBER )? ']'
            {
            root_0 = (Object)adaptor.nil();


            char_literal181=(Token)match(input,66,FOLLOW_66_in_array_size1517); 
            char_literal181_tree = 
            (Object)adaptor.create(char_literal181)
            ;
            adaptor.addChild(root_0, char_literal181_tree);


            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:287:8: ( NUMBER )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==NUMBER) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:287:8: NUMBER
                    {
                    NUMBER182=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_array_size1519); 
                    NUMBER182_tree = 
                    (Object)adaptor.create(NUMBER182)
                    ;
                    adaptor.addChild(root_0, NUMBER182_tree);


                    }
                    break;

            }


            char_literal183=(Token)match(input,67,FOLLOW_67_in_array_size1522); 
            char_literal183_tree = 
            (Object)adaptor.create(char_literal183)
            ;
            adaptor.addChild(root_0, char_literal183_tree);


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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:289:1: field_crap : ':' NUMBER ;
    public final ObjchParser.field_crap_return field_crap() throws RecognitionException {
        ObjchParser.field_crap_return retval = new ObjchParser.field_crap_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal184=null;
        Token NUMBER185=null;

        Object char_literal184_tree=null;
        Object NUMBER185_tree=null;

        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:290:2: ( ':' NUMBER )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:290:4: ':' NUMBER
            {
            root_0 = (Object)adaptor.nil();


            char_literal184=(Token)match(input,50,FOLLOW_50_in_field_crap1531); 
            char_literal184_tree = 
            (Object)adaptor.create(char_literal184)
            ;
            adaptor.addChild(root_0, char_literal184_tree);


            NUMBER185=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_field_crap1533); 
            NUMBER185_tree = 
            (Object)adaptor.create(NUMBER185)
            ;
            adaptor.addChild(root_0, NUMBER185_tree);


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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:292:1: method_declaration : method_modifier_wrapper method_declaration_variants ;
    public final ObjchParser.method_declaration_return method_declaration() throws RecognitionException {
        ObjchParser.method_declaration_return retval = new ObjchParser.method_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.method_modifier_wrapper_return method_modifier_wrapper186 =null;

        ObjchParser.method_declaration_variants_return method_declaration_variants187 =null;



        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:293:2: ( method_modifier_wrapper method_declaration_variants )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:293:4: method_modifier_wrapper method_declaration_variants
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_method_modifier_wrapper_in_method_declaration1543);
            method_modifier_wrapper186=method_modifier_wrapper();

            state._fsp--;

            adaptor.addChild(root_0, method_modifier_wrapper186.getTree());

            pushFollow(FOLLOW_method_declaration_variants_in_method_declaration1545);
            method_declaration_variants187=method_declaration_variants();

            state._fsp--;

            adaptor.addChild(root_0, method_declaration_variants187.getTree());

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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:295:1: method_modifier_wrapper : method_modifier -> ^( MODIFIER method_modifier ) ;
    public final ObjchParser.method_modifier_wrapper_return method_modifier_wrapper() throws RecognitionException {
        ObjchParser.method_modifier_wrapper_return retval = new ObjchParser.method_modifier_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.method_modifier_return method_modifier188 =null;


        RewriteRuleSubtreeStream stream_method_modifier=new RewriteRuleSubtreeStream(adaptor,"rule method_modifier");
        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:296:2: ( method_modifier -> ^( MODIFIER method_modifier ) )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:296:4: method_modifier
            {
            pushFollow(FOLLOW_method_modifier_in_method_modifier_wrapper1555);
            method_modifier188=method_modifier();

            state._fsp--;

            stream_method_modifier.add(method_modifier188.getTree());

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
            // 296:20: -> ^( MODIFIER method_modifier )
            {
                // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:296:23: ^( MODIFIER method_modifier )
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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:298:1: method_modifier : ( '+' | '-' );
    public final ObjchParser.method_modifier_return method_modifier() throws RecognitionException {
        ObjchParser.method_modifier_return retval = new ObjchParser.method_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set189=null;

        Object set189_tree=null;

        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:299:2: ( '+' | '-' )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:
            {
            root_0 = (Object)adaptor.nil();


            set189=(Token)input.LT(1);

            if ( input.LA(1)==47||input.LA(1)==49 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set189)
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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:301:1: method_declaration_variants : ( init_declaration_wrapper | method_declaration_common );
    public final ObjchParser.method_declaration_variants_return method_declaration_variants() throws RecognitionException {
        ObjchParser.method_declaration_variants_return retval = new ObjchParser.method_declaration_variants_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.init_declaration_wrapper_return init_declaration_wrapper190 =null;

        ObjchParser.method_declaration_common_return method_declaration_common191 =null;



        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:302:2: ( init_declaration_wrapper | method_declaration_common )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==71) ) {
                alt66=1;
            }
            else if ( (LA66_0==44) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;

            }
            switch (alt66) {
                case 1 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:302:4: init_declaration_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_init_declaration_wrapper_in_method_declaration_variants1587);
                    init_declaration_wrapper190=init_declaration_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, init_declaration_wrapper190.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:303:5: method_declaration_common
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_method_declaration_common_in_method_declaration_variants1594);
                    method_declaration_common191=method_declaration_common();

                    state._fsp--;

                    adaptor.addChild(root_0, method_declaration_common191.getTree());

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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:305:1: method_declaration_common : '(' type_declaration ')' method_name ( method_params )? ';' ;
    public final ObjchParser.method_declaration_common_return method_declaration_common() throws RecognitionException {
        ObjchParser.method_declaration_common_return retval = new ObjchParser.method_declaration_common_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal192=null;
        Token char_literal194=null;
        Token char_literal197=null;
        ObjchParser.type_declaration_return type_declaration193 =null;

        ObjchParser.method_name_return method_name195 =null;

        ObjchParser.method_params_return method_params196 =null;


        Object char_literal192_tree=null;
        Object char_literal194_tree=null;
        Object char_literal197_tree=null;

        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:306:2: ( '(' type_declaration ')' method_name ( method_params )? ';' )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:306:4: '(' type_declaration ')' method_name ( method_params )? ';'
            {
            root_0 = (Object)adaptor.nil();


            char_literal192=(Token)match(input,44,FOLLOW_44_in_method_declaration_common1604); 
            char_literal192_tree = 
            (Object)adaptor.create(char_literal192)
            ;
            adaptor.addChild(root_0, char_literal192_tree);


            pushFollow(FOLLOW_type_declaration_in_method_declaration_common1606);
            type_declaration193=type_declaration();

            state._fsp--;

            adaptor.addChild(root_0, type_declaration193.getTree());

            char_literal194=(Token)match(input,45,FOLLOW_45_in_method_declaration_common1608); 
            char_literal194_tree = 
            (Object)adaptor.create(char_literal194)
            ;
            adaptor.addChild(root_0, char_literal194_tree);


            pushFollow(FOLLOW_method_name_in_method_declaration_common1610);
            method_name195=method_name();

            state._fsp--;

            adaptor.addChild(root_0, method_name195.getTree());

            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:306:41: ( method_params )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==ID||LA67_0==50) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:306:41: method_params
                    {
                    pushFollow(FOLLOW_method_params_in_method_declaration_common1612);
                    method_params196=method_params();

                    state._fsp--;

                    adaptor.addChild(root_0, method_params196.getTree());

                    }
                    break;

            }


            char_literal197=(Token)match(input,51,FOLLOW_51_in_method_declaration_common1615); 
            char_literal197_tree = 
            (Object)adaptor.create(char_literal197)
            ;
            adaptor.addChild(root_0, char_literal197_tree);


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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:308:1: init_declaration_wrapper : init_declaration -> ^( INIT_DECLARATION init_declaration ) ;
    public final ObjchParser.init_declaration_wrapper_return init_declaration_wrapper() throws RecognitionException {
        ObjchParser.init_declaration_wrapper_return retval = new ObjchParser.init_declaration_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.init_declaration_return init_declaration198 =null;


        RewriteRuleSubtreeStream stream_init_declaration=new RewriteRuleSubtreeStream(adaptor,"rule init_declaration");
        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:309:2: ( init_declaration -> ^( INIT_DECLARATION init_declaration ) )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:309:4: init_declaration
            {
            pushFollow(FOLLOW_init_declaration_in_init_declaration_wrapper1625);
            init_declaration198=init_declaration();

            state._fsp--;

            stream_init_declaration.add(init_declaration198.getTree());

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
            // 309:21: -> ^( INIT_DECLARATION init_declaration )
            {
                // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:309:24: ^( INIT_DECLARATION init_declaration )
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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:311:1: init_declaration : init_name ( method_params )? ';' ;
    public final ObjchParser.init_declaration_return init_declaration() throws RecognitionException {
        ObjchParser.init_declaration_return retval = new ObjchParser.init_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal201=null;
        ObjchParser.init_name_return init_name199 =null;

        ObjchParser.method_params_return method_params200 =null;


        Object char_literal201_tree=null;

        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:312:2: ( init_name ( method_params )? ';' )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:312:4: init_name ( method_params )? ';'
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_init_name_in_init_declaration1643);
            init_name199=init_name();

            state._fsp--;

            adaptor.addChild(root_0, init_name199.getTree());

            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:312:14: ( method_params )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==ID||LA68_0==50) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:312:14: method_params
                    {
                    pushFollow(FOLLOW_method_params_in_init_declaration1645);
                    method_params200=method_params();

                    state._fsp--;

                    adaptor.addChild(root_0, method_params200.getTree());

                    }
                    break;

            }


            char_literal201=(Token)match(input,51,FOLLOW_51_in_init_declaration1648); 
            char_literal201_tree = 
            (Object)adaptor.create(char_literal201)
            ;
            adaptor.addChild(root_0, char_literal201_tree);


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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:315:1: init_name : init_variants -> ^( METHOD_NAME init_variants ) ;
    public final ObjchParser.init_name_return init_name() throws RecognitionException {
        ObjchParser.init_name_return retval = new ObjchParser.init_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.init_variants_return init_variants202 =null;


        RewriteRuleSubtreeStream stream_init_variants=new RewriteRuleSubtreeStream(adaptor,"rule init_variants");
        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:316:2: ( init_variants -> ^( METHOD_NAME init_variants ) )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:316:4: init_variants
            {
            pushFollow(FOLLOW_init_variants_in_init_name1659);
            init_variants202=init_variants();

            state._fsp--;

            stream_init_variants.add(init_variants202.getTree());

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
            // 316:18: -> ^( METHOD_NAME init_variants )
            {
                // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:316:21: ^( METHOD_NAME init_variants )
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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:318:1: init_variants : 'initWithType' ;
    public final ObjchParser.init_variants_return init_variants() throws RecognitionException {
        ObjchParser.init_variants_return retval = new ObjchParser.init_variants_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal203=null;

        Object string_literal203_tree=null;

        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:319:2: ( 'initWithType' )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:319:4: 'initWithType'
            {
            root_0 = (Object)adaptor.nil();


            string_literal203=(Token)match(input,71,FOLLOW_71_in_init_variants1677); 
            string_literal203_tree = 
            (Object)adaptor.create(string_literal203)
            ;
            adaptor.addChild(root_0, string_literal203_tree);


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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:322:1: method_name : ( ID -> ^( METHOD_NAME ID ) | init_variants -> ^( METHOD_NAME ID ) );
    public final ObjchParser.method_name_return method_name() throws RecognitionException {
        ObjchParser.method_name_return retval = new ObjchParser.method_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID204=null;
        ObjchParser.init_variants_return init_variants205 =null;


        Object ID204_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_init_variants=new RewriteRuleSubtreeStream(adaptor,"rule init_variants");
        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:323:2: ( ID -> ^( METHOD_NAME ID ) | init_variants -> ^( METHOD_NAME ID ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==ID) ) {
                alt69=1;
            }
            else if ( (LA69_0==71) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;

            }
            switch (alt69) {
                case 1 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:323:4: ID
                    {
                    ID204=(Token)match(input,ID,FOLLOW_ID_in_method_name1690);  
                    stream_ID.add(ID204);


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
                    // 323:7: -> ^( METHOD_NAME ID )
                    {
                        // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:323:10: ^( METHOD_NAME ID )
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
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:324:4: init_variants
                    {
                    pushFollow(FOLLOW_init_variants_in_method_name1703);
                    init_variants205=init_variants();

                    state._fsp--;

                    stream_init_variants.add(init_variants205.getTree());

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
                    // 324:18: -> ^( METHOD_NAME ID )
                    {
                        // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:324:21: ^( METHOD_NAME ID )
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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:326:1: method_params : ( method_param )+ -> ^( METHOD_PARAMS ( method_param )+ ) ;
    public final ObjchParser.method_params_return method_params() throws RecognitionException {
        ObjchParser.method_params_return retval = new ObjchParser.method_params_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ObjchParser.method_param_return method_param206 =null;


        RewriteRuleSubtreeStream stream_method_param=new RewriteRuleSubtreeStream(adaptor,"rule method_param");
        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:327:2: ( ( method_param )+ -> ^( METHOD_PARAMS ( method_param )+ ) )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:327:4: ( method_param )+
            {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:327:4: ( method_param )+
            int cnt70=0;
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==ID||LA70_0==50) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:327:4: method_param
            	    {
            	    pushFollow(FOLLOW_method_param_in_method_params1721);
            	    method_param206=method_param();

            	    state._fsp--;

            	    stream_method_param.add(method_param206.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt70 >= 1 ) break loop70;
                        EarlyExitException eee =
                            new EarlyExitException(70, input);
                        throw eee;
                }
                cnt70++;
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
            // 327:18: -> ^( METHOD_PARAMS ( method_param )+ )
            {
                // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:327:21: ^( METHOD_PARAMS ( method_param )+ )
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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:329:1: method_param : ( prefix )? ':' ( '(' type_declaration ')' )? param_name -> ^( METHOD_PARAM ( prefix )? ':' '(' type_declaration ')' param_name ) ;
    public final ObjchParser.method_param_return method_param() throws RecognitionException {
        ObjchParser.method_param_return retval = new ObjchParser.method_param_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal208=null;
        Token char_literal209=null;
        Token char_literal211=null;
        ObjchParser.prefix_return prefix207 =null;

        ObjchParser.type_declaration_return type_declaration210 =null;

        ObjchParser.param_name_return param_name212 =null;


        Object char_literal208_tree=null;
        Object char_literal209_tree=null;
        Object char_literal211_tree=null;
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_prefix=new RewriteRuleSubtreeStream(adaptor,"rule prefix");
        RewriteRuleSubtreeStream stream_param_name=new RewriteRuleSubtreeStream(adaptor,"rule param_name");
        RewriteRuleSubtreeStream stream_type_declaration=new RewriteRuleSubtreeStream(adaptor,"rule type_declaration");
        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:330:2: ( ( prefix )? ':' ( '(' type_declaration ')' )? param_name -> ^( METHOD_PARAM ( prefix )? ':' '(' type_declaration ')' param_name ) )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:330:4: ( prefix )? ':' ( '(' type_declaration ')' )? param_name
            {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:330:4: ( prefix )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==ID) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:330:4: prefix
                    {
                    pushFollow(FOLLOW_prefix_in_method_param1740);
                    prefix207=prefix();

                    state._fsp--;

                    stream_prefix.add(prefix207.getTree());

                    }
                    break;

            }


            char_literal208=(Token)match(input,50,FOLLOW_50_in_method_param1743);  
            stream_50.add(char_literal208);


            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:330:16: ( '(' type_declaration ')' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==44) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:330:17: '(' type_declaration ')'
                    {
                    char_literal209=(Token)match(input,44,FOLLOW_44_in_method_param1746);  
                    stream_44.add(char_literal209);


                    pushFollow(FOLLOW_type_declaration_in_method_param1748);
                    type_declaration210=type_declaration();

                    state._fsp--;

                    stream_type_declaration.add(type_declaration210.getTree());

                    char_literal211=(Token)match(input,45,FOLLOW_45_in_method_param1750);  
                    stream_45.add(char_literal211);


                    }
                    break;

            }


            pushFollow(FOLLOW_param_name_in_method_param1754);
            param_name212=param_name();

            state._fsp--;

            stream_param_name.add(param_name212.getTree());

            // AST REWRITE
            // elements: param_name, 45, type_declaration, 44, prefix, 50
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 330:55: -> ^( METHOD_PARAM ( prefix )? ':' '(' type_declaration ')' param_name )
            {
                // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:330:58: ^( METHOD_PARAM ( prefix )? ':' '(' type_declaration ')' param_name )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(METHOD_PARAM, "METHOD_PARAM")
                , root_1);

                // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:330:73: ( prefix )?
                if ( stream_prefix.hasNext() ) {
                    adaptor.addChild(root_1, stream_prefix.nextTree());

                }
                stream_prefix.reset();

                adaptor.addChild(root_1, 
                stream_50.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_44.nextNode()
                );

                adaptor.addChild(root_1, stream_type_declaration.nextTree());

                adaptor.addChild(root_1, 
                stream_45.nextNode()
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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:332:1: param_name : ID -> ^( PARAM_NAME ID ) ;
    public final ObjchParser.param_name_return param_name() throws RecognitionException {
        ObjchParser.param_name_return retval = new ObjchParser.param_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID213=null;

        Object ID213_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:333:2: ( ID -> ^( PARAM_NAME ID ) )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:333:4: ID
            {
            ID213=(Token)match(input,ID,FOLLOW_ID_in_param_name1784);  
            stream_ID.add(ID213);


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
            // 333:7: -> ^( PARAM_NAME ID )
            {
                // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:333:10: ^( PARAM_NAME ID )
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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:335:1: prefix : ID -> ^( PARAM_PREFIX ID ) ;
    public final ObjchParser.prefix_return prefix() throws RecognitionException {
        ObjchParser.prefix_return retval = new ObjchParser.prefix_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID214=null;

        Object ID214_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:335:8: ( ID -> ^( PARAM_PREFIX ID ) )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:335:10: ID
            {
            ID214=(Token)match(input,ID,FOLLOW_ID_in_prefix1801);  
            stream_ID.add(ID214);


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
            // 335:13: -> ^( PARAM_PREFIX ID )
            {
                // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:335:16: ^( PARAM_PREFIX ID )
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
    // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:337:1: extern_declatation : 'extern' field_declaration ;
    public final ObjchParser.extern_declatation_return extern_declatation() throws RecognitionException {
        ObjchParser.extern_declatation_return retval = new ObjchParser.extern_declatation_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal215=null;
        ObjchParser.field_declaration_return field_declaration216 =null;


        Object string_literal215_tree=null;

        try {
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:338:2: ( 'extern' field_declaration )
            // C:\\Work\\ObjC2J\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Objch.g:338:4: 'extern' field_declaration
            {
            root_0 = (Object)adaptor.nil();


            string_literal215=(Token)match(input,70,FOLLOW_70_in_extern_declatation1818); 
            string_literal215_tree = 
            (Object)adaptor.create(string_literal215)
            ;
            adaptor.addChild(root_0, string_literal215_tree);


            pushFollow(FOLLOW_field_declaration_in_extern_declatation1820);
            field_declaration216=field_declaration();

            state._fsp--;

            adaptor.addChild(root_0, field_declaration216.getTree());

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
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA53 dfa53 = new DFA53(this);
    static final String DFA2_eotS =
        "\u0081\uffff";
    static final String DFA2_eofS =
        "\21\uffff\1\20\21\uffff\1\20\1\133\134\uffff";
    static final String DFA2_minS =
        "\1\15\1\uffff\2\15\3\uffff\1\15\11\uffff\2\15\4\uffff\1\15\6\uffff"+
        "\1\15\4\uffff\2\15\15\uffff\1\15\5\uffff\1\15\110\uffff";
    static final String DFA2_maxS =
        "\1\121\1\uffff\1\121\1\122\3\uffff\1\122\11\uffff\1\121\1\122\4"+
        "\uffff\1\122\6\uffff\1\122\4\uffff\2\121\15\uffff\1\121\5\uffff"+
        "\1\122\110\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\2\uffff\1\4\1\5\1\6\1\uffff\1\10\7\uffff\1\2\7\uffff"+
        "\1\3\6\uffff\1\7\51\uffff\1\2\21\uffff\1\2\20\uffff\1\2\13\uffff"+
        "\1\2\10\uffff";
    static final String DFA2_specialS =
        "\u0081\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\10\41\uffff\1\10\1\uffff\1\10\7\uffff\1\1\1\uffff\1\5\1\10"+
            "\1\uffff\1\10\1\uffff\1\4\3\uffff\1\10\1\3\1\6\1\uffff\2\10"+
            "\4\uffff\1\7\1\2\1\uffff\1\10",
            "",
            "\1\21\67\uffff\1\20\2\uffff\2\10\4\uffff\1\22\1\uffff\1\20"+
            "\1\10",
            "\1\27\72\uffff\2\10\4\uffff\2\10\1\uffff\1\10\1\30",
            "",
            "",
            "",
            "\1\36\72\uffff\2\10\7\uffff\1\10\1\37",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\44\36\uffff\1\20\1\uffff\1\43\1\20\1\uffff\1\20\1\uffff"+
            "\1\20\1\10\4\uffff\1\20\1\uffff\2\20\1\uffff\1\20\1\uffff\1"+
            "\20\1\uffff\1\10\1\uffff\1\62\2\20\1\uffff\2\20\4\uffff\2\20"+
            "\1\uffff\1\20",
            "\1\70\72\uffff\2\10\7\uffff\1\10\1\20",
            "",
            "",
            "",
            "",
            "\1\10\40\uffff\1\10\5\uffff\1\10\15\uffff\1\10\1\uffff\1\10"+
            "\15\uffff\1\30",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\10\40\uffff\1\10\5\uffff\1\10\15\uffff\1\10\1\uffff\1\10"+
            "\15\uffff\1\37",
            "",
            "",
            "",
            "",
            "\1\111\36\uffff\1\20\2\uffff\1\20\1\uffff\1\20\1\uffff\1\20"+
            "\5\uffff\1\20\1\uffff\2\20\1\uffff\1\20\1\uffff\1\20\3\uffff"+
            "\3\20\1\uffff\2\20\4\uffff\2\20\1\uffff\1\20",
            "\1\133\36\uffff\1\10\1\uffff\2\133\1\10\1\133\1\10\2\133\4"+
            "\uffff\1\133\1\uffff\2\133\1\uffff\1\133\1\uffff\1\133\1\uffff"+
            "\1\154\1\uffff\3\133\1\uffff\2\133\4\uffff\2\133\1\uffff\1\133",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\170\40\uffff\1\10\5\uffff\1\10\20\uffff\1\133\2\uffff\2"+
            "\133\4\uffff\2\133\1\uffff\1\133",
            "",
            "",
            "",
            "",
            "",
            "\1\10\40\uffff\1\10\5\uffff\1\10\15\uffff\1\10\1\uffff\1\10"+
            "\15\uffff\1\133",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "56:1: code_internal : ( class_declaration | typedef_declaration_wrapper | enum_wrapper | protocol_declaration_wrapper | interface_declaration_wrapper | extern_declarations | typedef_struct | declarations );";
        }
    }
    static final String DFA9_eotS =
        "\104\uffff";
    static final String DFA9_eofS =
        "\1\3\1\23\102\uffff";
    static final String DFA9_minS =
        "\2\15\35\uffff\1\15\3\uffff\1\15\11\uffff\1\15\2\uffff\1\32\23\uffff";
    static final String DFA9_maxS =
        "\2\121\35\uffff\1\121\3\uffff\1\104\11\uffff\1\104\2\uffff\1\103"+
        "\23\uffff";
    static final String DFA9_acceptS =
        "\2\uffff\1\2\1\3\17\uffff\1\1\45\uffff\1\1\10\uffff\1\1\1\uffff";
    static final String DFA9_specialS =
        "\104\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1\36\uffff\1\2\2\uffff\1\3\1\uffff\1\3\1\uffff\1\3\5\uffff"+
            "\1\3\1\uffff\2\3\1\uffff\1\3\1\uffff\1\3\3\uffff\3\3\1\uffff"+
            "\2\3\4\uffff\2\3\1\uffff\1\3",
            "\1\43\40\uffff\1\3\1\23\1\uffff\1\23\1\uffff\1\23\1\3\4\uffff"+
            "\1\23\1\uffff\2\23\1\uffff\1\23\1\uffff\1\23\1\uffff\1\3\1\uffff"+
            "\1\37\2\23\1\uffff\2\23\4\uffff\2\23\1\uffff\1\23",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\55\40\uffff\1\3\5\uffff\1\3\20\uffff\1\23\2\uffff\2\23\4"+
            "\uffff\2\23\1\uffff\1\23",
            "",
            "",
            "",
            "\1\23\36\uffff\1\3\1\uffff\1\23\1\uffff\1\3\1\uffff\2\3\1\23"+
            "\15\uffff\1\60\1\uffff\1\23",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\23\36\uffff\1\3\1\uffff\1\23\1\uffff\1\3\1\uffff\2\3\1\23"+
            "\15\uffff\1\71\1\uffff\1\23",
            "",
            "",
            "\1\3\50\uffff\1\102",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "106:31: ( typedef_name | func_pointer )?";
        }
    }
    static final String DFA53_eotS =
        "\144\uffff";
    static final String DFA53_eofS =
        "\144\uffff";
    static final String DFA53_minS =
        "\1\15\2\uffff\1\15\6\uffff\1\32\4\uffff\1\15\1\uffff\1\15\3\uffff"+
        "\1\15\1\uffff\10\15\105\uffff";
    static final String DFA53_maxS =
        "\1\111\2\uffff\1\104\6\uffff\1\103\4\uffff\1\121\1\uffff\1\107\3"+
        "\uffff\1\104\1\uffff\4\121\1\111\1\104\1\111\1\104\105\uffff";
    static final String DFA53_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\41\uffff\1\1\1\uffff\2\1\3\uffff\34\1\2"+
        "\uffff\4\1\3\uffff\5\1\2\uffff\1\1\1\uffff\4\1\1\uffff\1\1\3\uffff";
    static final String DFA53_specialS =
        "\144\uffff}>";
    static final String[] DFA53_transitionS = {
            "\1\3\37\uffff\2\4\1\uffff\1\4\3\uffff\1\4\2\uffff\1\4\14\uffff"+
            "\1\4\3\uffff\2\1",
            "",
            "",
            "\1\1\36\uffff\1\4\1\21\1\1\1\uffff\1\17\1\uffff\2\4\1\1\2\uffff"+
            "\1\1\12\uffff\1\12\1\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\4\50\uffff\1\25",
            "",
            "",
            "",
            "",
            "\1\36\66\uffff\1\27\1\30\2\uffff\1\34\1\35\4\uffff\1\32\1\31"+
            "\1\uffff\1\33",
            "",
            "\1\1\45\uffff\1\4\23\uffff\1\1",
            "",
            "",
            "",
            "\1\1\36\uffff\1\4\1\50\1\1\1\uffff\1\46\1\uffff\2\4\1\1\2\uffff"+
            "\1\1\12\uffff\1\51\1\uffff\1\1",
            "",
            "\1\63\67\uffff\1\55\2\uffff\1\61\1\62\4\uffff\1\57\1\56\1\uffff"+
            "\1\60",
            "\1\71\72\uffff\1\67\1\70\4\uffff\1\65\1\64\1\uffff\1\66",
            "\1\76\72\uffff\1\74\1\75\4\uffff\1\72\2\uffff\1\73",
            "\1\102\72\uffff\1\100\1\101\7\uffff\1\77",
            "\1\105\40\uffff\1\110\1\uffff\1\1\3\uffff\1\107\2\uffff\1\1"+
            "\14\uffff\1\106\3\uffff\1\103\1\104",
            "\1\4\40\uffff\1\116\1\uffff\1\1\3\uffff\1\115\2\uffff\1\1\12"+
            "\uffff\1\113\1\uffff\1\114",
            "\1\4\40\uffff\1\126\1\uffff\1\1\3\uffff\1\125\2\uffff\1\1\12"+
            "\uffff\1\123\1\uffff\1\124\3\uffff\1\122\1\131",
            "\1\4\40\uffff\1\136\1\uffff\1\140\1\uffff\2\4\1\135\2\uffff"+
            "\1\1\12\uffff\1\133\1\uffff\1\134",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "268:55: ( type_dec )?";
        }
    }
 

    public static final BitSet FOLLOW_code_internal_in_code174 = new BitSet(new long[]{0x5A02800000002002L,0x000000000002C371L});
    public static final BitSet FOLLOW_class_declaration_in_code_internal187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_declaration_wrapper_in_code_internal194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_wrapper_in_code_internal201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protocol_declaration_wrapper_in_code_internal206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interface_declaration_wrapper_in_code_internal212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extern_declarations_in_code_internal218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_struct_in_code_internal223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_code_internal228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_declaration_in_enum_wrapper242 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_enum_wrapper244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extern_declatation_in_extern_declarations264 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_optional_prefix_in_declarations285 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_method_declaration_wrapper_in_declarations288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_prefix_in_declarations293 = new BitSet(new long[]{0x1000000000002000L,0x000000000002C330L});
    public static final BitSet FOLLOW_optional_prefix_in_declarations296 = new BitSet(new long[]{0x0000000000002000L,0x000000000002C330L});
    public static final BitSet FOLLOW_field_declaration_wrapper_in_declarations299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_declaration_in_method_declaration_wrapper311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_declaration_in_field_declaration_wrapper329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_property_prefix347 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_property_prefix349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003C00L});
    public static final BitSet FOLLOW_property_prefix_param_in_property_prefix351 = new BitSet(new long[]{0x0001200000000000L});
    public static final BitSet FOLLOW_48_in_property_prefix354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003C00L});
    public static final BitSet FOLLOW_property_prefix_param_in_property_prefix356 = new BitSet(new long[]{0x0001200000000000L});
    public static final BitSet FOLLOW_45_in_property_prefix360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_optional_prefix371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interface_declaration_in_interface_declaration_wrapper406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protocol_declaration_in_protocol_declaration_wrapper424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_declaration_in_typedef_declaration_wrapper441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_typedef_declaration458 = new BitSet(new long[]{0x0000000000002000L,0x0000000000014020L});
    public static final BitSet FOLLOW_typedef_internal_in_typedef_declaration460 = new BitSet(new long[]{0x0008100000002002L});
    public static final BitSet FOLLOW_typedef_name_in_typedef_declaration463 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_func_pointer_in_typedef_declaration467 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_typedef_declaration471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_func_pointer482 = new BitSet(new long[]{0x0000400000002000L});
    public static final BitSet FOLLOW_46_in_func_pointer484 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_func_pointer487 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_func_pointer489 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_func_pointer491 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_ID_in_func_pointer494 = new BitSet(new long[]{0x0001200000000000L});
    public static final BitSet FOLLOW_48_in_func_pointer497 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_func_pointer499 = new BitSet(new long[]{0x0001200000000000L});
    public static final BitSet FOLLOW_45_in_func_pointer505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_enum_wrapper2_in_typedef_internal517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_rename_in_typedef_internal524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_struct_wrapper_in_typedef_internal531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_union_declaration_in_typedef_internal536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_union_declaration546 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_union_declaration551 = new BitSet(new long[]{0x0000000000002000L,0x000000000002C330L});
    public static final BitSet FOLLOW_union_internal_in_union_declaration556 = new BitSet(new long[]{0x0000000000002000L,0x000000000012C330L});
    public static final BitSet FOLLOW_84_in_union_declaration561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_declaration_wrapper_in_union_internal574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_struct_wrapper_in_union_internal579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_typedef_rename590 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_typedef_rename592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_declaration_in_typedef_enum_wrapper2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_enum_declaration635 = new BitSet(new long[]{0x0000000000002000L,0x0000000000040000L});
    public static final BitSet FOLLOW_struct_name_in_enum_declaration637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_enum_declaration640 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_typedef_declaration_element_wrapper_in_enum_declaration642 = new BitSet(new long[]{0x0001000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_48_in_enum_declaration645 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_typedef_declaration_element_wrapper_in_enum_declaration647 = new BitSet(new long[]{0x0001000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_48_in_enum_declaration651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_enum_declaration654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_struct_in_typedef_struct_wrapper665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_typedef_struct683 = new BitSet(new long[]{0x0000000000002000L,0x0000000000040000L});
    public static final BitSet FOLLOW_typedef_name_in_typedef_struct685 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_typedef_struct690 = new BitSet(new long[]{0x0000000000002000L,0x000000000002C330L});
    public static final BitSet FOLLOW_struct_field_wrapper_in_typedef_struct695 = new BitSet(new long[]{0x0000000000002000L,0x000000000012C330L});
    public static final BitSet FOLLOW_84_in_typedef_struct700 = new BitSet(new long[]{0x0008000000002002L});
    public static final BitSet FOLLOW_struct_name_in_typedef_struct703 = new BitSet(new long[]{0x0009000000000002L});
    public static final BitSet FOLLOW_48_in_typedef_struct706 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_struct_name_in_typedef_struct708 = new BitSet(new long[]{0x0009000000000002L});
    public static final BitSet FOLLOW_51_in_typedef_struct714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_struct_name727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_field_in_struct_field_wrapper745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_field1_in_struct_field763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_field2_in_struct_field768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_declaration_in_struct_field1780 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_field_name_in_struct_field1782 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_48_in_struct_field1785 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_field_name_in_struct_field1787 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_51_in_struct_field1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_struct_in_struct_field2801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_typedef_name812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_declaration_element_in_typedef_declaration_element_wrapper829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_typedef_declaration_element849 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_typedef_declaration_element852 = new BitSet(new long[]{0x0000100004002000L});
    public static final BitSet FOLLOW_element_value_in_typedef_declaration_element854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_expression_in_element_value868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_expression2_in_simple_expression889 = new BitSet(new long[]{0x01200C0000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_op2_in_simple_expression893 = new BitSet(new long[]{0x0000100004002000L});
    public static final BitSet FOLLOW_simple_expression2_in_simple_expression895 = new BitSet(new long[]{0x01200C0000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_simple_expression2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_simple_expression2914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_simple_expression2919 = new BitSet(new long[]{0x0000100004002000L});
    public static final BitSet FOLLOW_simple_expression_in_simple_expression2921 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_simple_expression2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_class_declaration958 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_class_declaration960 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_48_in_class_declaration963 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_class_declaration965 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_51_in_class_declaration969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_protocol_declaration979 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_protocol_name_in_protocol_declaration981 = new BitSet(new long[]{0x541A800000002000L,0x000000000002C330L});
    public static final BitSet FOLLOW_generic_in_protocol_declaration983 = new BitSet(new long[]{0x540A800000002000L,0x000000000002C330L});
    public static final BitSet FOLLOW_protocol_end_in_protocol_declaration989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protocol_end1_in_protocol_end1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protocol_end2_in_protocol_end1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_protocol_end11015 = new BitSet(new long[]{0x5402800000002000L,0x000000000002C330L});
    public static final BitSet FOLLOW_58_in_protocol_end11020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_protocol_end21032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_generic1045 = new BitSet(new long[]{0x0000000000002000L,0x000000000002C330L});
    public static final BitSet FOLLOW_generic_internal_in_generic1047 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_generic1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_declaration_in_generic_internal1058 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_generic_internal1061 = new BitSet(new long[]{0x0000000000002000L,0x000000000002C330L});
    public static final BitSet FOLLOW_type_declaration_in_generic_internal1063 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ID_in_protocol_name1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_interface_declaration1095 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_interface_name_in_interface_declaration1097 = new BitSet(new long[]{0x5406800000002000L,0x000000000006C330L});
    public static final BitSet FOLLOW_50_in_interface_declaration1100 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_superclass_name_in_interface_declaration1102 = new BitSet(new long[]{0x5402800000002000L,0x000000000006C330L});
    public static final BitSet FOLLOW_interface_body_in_interface_declaration1107 = new BitSet(new long[]{0x5402800000002000L,0x000000000002C330L});
    public static final BitSet FOLLOW_declarations_in_interface_declaration1111 = new BitSet(new long[]{0x5402800000002000L,0x000000000002C330L});
    public static final BitSet FOLLOW_58_in_interface_declaration1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_interface_body1128 = new BitSet(new long[]{0xA000000000002000L,0x000000000012C332L});
    public static final BitSet FOLLOW_group_modifier_wrapper_in_interface_body1133 = new BitSet(new long[]{0x0000000000002000L,0x000000000002C330L});
    public static final BitSet FOLLOW_simple_fields_declaration_in_interface_body1139 = new BitSet(new long[]{0xA000000000002000L,0x000000000012C332L});
    public static final BitSet FOLLOW_84_in_interface_body1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_group_modifier_in_group_modifier_wrapper1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_interface_name1195 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_category_in_interface_name1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_category1216 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_category1218 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_category1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_superclass_name1237 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_generic_in_superclass_name1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fields_declarations_in_simple_fields_declaration1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_declaration_in_fields_declarations1279 = new BitSet(new long[]{0x0000000000002002L,0x000000000002C330L});
    public static final BitSet FOLLOW_type_declaration_in_field_declaration1299 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_field_name_in_field_declaration1301 = new BitSet(new long[]{0x0009100000000000L});
    public static final BitSet FOLLOW_classical_method_params_in_field_declaration1304 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_48_in_field_declaration1309 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_field_name_in_field_declaration1311 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_51_in_field_declaration1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_classical_method_params1326 = new BitSet(new long[]{0x0000000000002000L,0x000000000002C330L});
    public static final BitSet FOLLOW_classical_param_in_classical_method_params1328 = new BitSet(new long[]{0x0001200000000000L});
    public static final BitSet FOLLOW_48_in_classical_method_params1331 = new BitSet(new long[]{0x0000000000002000L,0x000000000002C330L});
    public static final BitSet FOLLOW_classical_param_in_classical_method_params1333 = new BitSet(new long[]{0x0001200000000000L});
    public static final BitSet FOLLOW_45_in_classical_method_params1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_declaration_in_classical_param1350 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_classical_param1352 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_classical_param1355 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_NUMBER_in_classical_param1357 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_classical_param1360 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_68_in_type_declaration1374 = new BitSet(new long[]{0x0000000000002000L,0x000000000002C320L});
    public static final BitSet FOLLOW_69_in_type_declaration1377 = new BitSet(new long[]{0x0000000000002000L,0x000000000002C300L});
    public static final BitSet FOLLOW_79_in_type_declaration1380 = new BitSet(new long[]{0x0000000000002000L,0x0000000000024300L});
    public static final BitSet FOLLOW_78_in_type_declaration1383 = new BitSet(new long[]{0x0000000000002000L,0x0000000000020300L});
    public static final BitSet FOLLOW_81_in_type_declaration1388 = new BitSet(new long[]{0x0010400000002002L,0x0000000000000310L});
    public static final BitSet FOLLOW_type_dec_in_type_declaration1390 = new BitSet(new long[]{0x0010400000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_type_dec_in_type_declaration1396 = new BitSet(new long[]{0x0010400000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_type_declaration1399 = new BitSet(new long[]{0x0010400000000002L});
    public static final BitSet FOLLOW_generic_in_type_declaration1402 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_type_declaration1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_dec_internal_in_type_dec1428 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_type_dec1431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_type_dec1433 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_knownTypes_in_type_dec_internal1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type_dec_internal1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_knownTypes1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_knownTypes1470 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_72_in_knownTypes1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_field_name1486 = new BitSet(new long[]{0x0004000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_array_size_in_field_name1488 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_field_crap_in_field_name1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_array_size1517 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_NUMBER_in_array_size1519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_array_size1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_field_crap1531 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_NUMBER_in_field_crap1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_modifier_wrapper_in_method_declaration1543 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_method_declaration_variants_in_method_declaration1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_modifier_in_method_modifier_wrapper1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_init_declaration_wrapper_in_method_declaration_variants1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_declaration_common_in_method_declaration_variants1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_method_declaration_common1604 = new BitSet(new long[]{0x0000000000002000L,0x000000000002C330L});
    public static final BitSet FOLLOW_type_declaration_in_method_declaration_common1606 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_method_declaration_common1608 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000080L});
    public static final BitSet FOLLOW_method_name_in_method_declaration_common1610 = new BitSet(new long[]{0x000C000000002000L});
    public static final BitSet FOLLOW_method_params_in_method_declaration_common1612 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_method_declaration_common1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_init_declaration_in_init_declaration_wrapper1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_init_name_in_init_declaration1643 = new BitSet(new long[]{0x000C000000002000L});
    public static final BitSet FOLLOW_method_params_in_init_declaration1645 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_init_declaration1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_init_variants_in_init_name1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_init_variants1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_method_name1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_init_variants_in_method_name1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_param_in_method_params1721 = new BitSet(new long[]{0x0004000000002002L});
    public static final BitSet FOLLOW_prefix_in_method_param1740 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_method_param1743 = new BitSet(new long[]{0x0000100000002000L});
    public static final BitSet FOLLOW_44_in_method_param1746 = new BitSet(new long[]{0x0000000000002000L,0x000000000002C330L});
    public static final BitSet FOLLOW_type_declaration_in_method_param1748 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_method_param1750 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_param_name_in_method_param1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param_name1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_prefix1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_extern_declatation1818 = new BitSet(new long[]{0x0000000000002000L,0x000000000002C330L});
    public static final BitSet FOLLOW_field_declaration_in_extern_declatation1820 = new BitSet(new long[]{0x0000000000000002L});

}