// $ANTLR 3.4 C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g 2012-08-15 10:19:18

package ru.andremoniy.objctojavacnv.antlr.output;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class PreprocessorParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "DEFINE", "DIGIT", "ELIF", "ELSE", "ENDIF", "ID", "IF", "IFDEF", "IFNDEF", "IMPORT", "INCLUDE", "LETTER", "NUMBER", "SINGLE_COMMENT", "SPECIAL_CHARS", "STRING_LITERAL", "STRING_LITERAL2", "T_BACKSLASH", "T_BLOCK", "T_DEFINE", "T_EXPRESSION", "T_EX_AND", "T_EX_OR", "T_EX_SNGL", "T_ID", "T_IF_DEFINE", "T_IF_ELSE", "T_IF_MAIN", "T_IF_NOT_DEFINE", "T_IF_SIMPLE", "T_IMPORT", "T_INCLUDE", "T_IN_BRACKETS", "T_NAME", "T_PARAM", "T_PATH", "T_REPLACE", "WS", "'!'", "'&&'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'...'", "'/'", "'<'", "'<='", "'=='", "'>'", "'>='", "'L'", "'\\'#\\''", "'\\\\'", "'\\n'", "'\\r'", "'defined'", "'||'"
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public PreprocessorParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public PreprocessorParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return PreprocessorParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g"; }


    public static class code_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "code"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:38:1: code : ( code_fragment )+ EOF ;
    public final PreprocessorParser.code_return code() throws RecognitionException {
        PreprocessorParser.code_return retval = new PreprocessorParser.code_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EOF2=null;
        PreprocessorParser.code_fragment_return code_fragment1 =null;


        Object EOF2_tree=null;

        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:38:6: ( ( code_fragment )+ EOF )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:38:8: ( code_fragment )+ EOF
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:38:8: ( code_fragment )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= DEFINE && LA1_0 <= DIGIT)||(LA1_0 >= ID && LA1_0 <= 65)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:38:8: code_fragment
            	    {
            	    pushFollow(FOLLOW_code_fragment_in_code132);
            	    code_fragment1=code_fragment();

            	    state._fsp--;

            	    adaptor.addChild(root_0, code_fragment1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_code137); 
            EOF2_tree = 
            (Object)adaptor.create(EOF2)
            ;
            adaptor.addChild(root_0, EOF2_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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


    public static class smth_else_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "smth_else"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:42:1: smth_else : (~ ( DEFINE | WS | COMMENT | IMPORT | IF | ELSE | ENDIF | IFDEF | IFNDEF | ELIF ) )+ ;
    public final PreprocessorParser.smth_else_return smth_else() throws RecognitionException {
        PreprocessorParser.smth_else_return retval = new PreprocessorParser.smth_else_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set3=null;

        Object set3_tree=null;

        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:43:2: ( (~ ( DEFINE | WS | COMMENT | IMPORT | IF | ELSE | ENDIF | IFDEF | IFNDEF | ELIF ) )+ )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:43:4: (~ ( DEFINE | WS | COMMENT | IMPORT | IF | ELSE | ENDIF | IFDEF | IFNDEF | ELIF ) )+
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:43:4: (~ ( DEFINE | WS | COMMENT | IMPORT | IF | ELSE | ENDIF | IFDEF | IFNDEF | ELIF ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==INCLUDE) ) {
                    alt2=1;
                }
                else if ( (LA2_0==DIGIT||LA2_0==ID||(LA2_0 >= LETTER && LA2_0 <= T_REPLACE)||(LA2_0 >= 43 && LA2_0 <= 65)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:
            	    {
            	    set3=(Token)input.LT(1);

            	    if ( input.LA(1)==DIGIT||input.LA(1)==ID||(input.LA(1) >= INCLUDE && input.LA(1) <= T_REPLACE)||(input.LA(1) >= 43 && input.LA(1) <= 65) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set3)
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // $ANTLR end "smth_else"


    public static class code_fragment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "code_fragment"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:45:1: code_fragment : ( WS | define_directive | import_declaration | if_simple_check_wrapper | if_define_block_wrapper | if_not_define_block_wrapper | smth_else );
    public final PreprocessorParser.code_fragment_return code_fragment() throws RecognitionException {
        PreprocessorParser.code_fragment_return retval = new PreprocessorParser.code_fragment_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WS4=null;
        PreprocessorParser.define_directive_return define_directive5 =null;

        PreprocessorParser.import_declaration_return import_declaration6 =null;

        PreprocessorParser.if_simple_check_wrapper_return if_simple_check_wrapper7 =null;

        PreprocessorParser.if_define_block_wrapper_return if_define_block_wrapper8 =null;

        PreprocessorParser.if_not_define_block_wrapper_return if_not_define_block_wrapper9 =null;

        PreprocessorParser.smth_else_return smth_else10 =null;


        Object WS4_tree=null;

        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:46:2: ( WS | define_directive | import_declaration | if_simple_check_wrapper | if_define_block_wrapper | if_not_define_block_wrapper | smth_else )
            int alt3=7;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:46:4: WS
                    {
                    root_0 = (Object)adaptor.nil();


                    WS4=(Token)match(input,WS,FOLLOW_WS_in_code_fragment198); 
                    WS4_tree = 
                    (Object)adaptor.create(WS4)
                    ;
                    adaptor.addChild(root_0, WS4_tree);


                    }
                    break;
                case 2 :
                    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:47:4: define_directive
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_define_directive_in_code_fragment203);
                    define_directive5=define_directive();

                    state._fsp--;

                    adaptor.addChild(root_0, define_directive5.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:48:4: import_declaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_import_declaration_in_code_fragment208);
                    import_declaration6=import_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, import_declaration6.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:49:4: if_simple_check_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_if_simple_check_wrapper_in_code_fragment213);
                    if_simple_check_wrapper7=if_simple_check_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, if_simple_check_wrapper7.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:50:4: if_define_block_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_if_define_block_wrapper_in_code_fragment218);
                    if_define_block_wrapper8=if_define_block_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, if_define_block_wrapper8.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:51:4: if_not_define_block_wrapper
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_if_not_define_block_wrapper_in_code_fragment223);
                    if_not_define_block_wrapper9=if_not_define_block_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, if_not_define_block_wrapper9.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:52:4: smth_else
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_smth_else_in_code_fragment228);
                    smth_else10=smth_else();

                    state._fsp--;

                    adaptor.addChild(root_0, smth_else10.getTree());

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
    // $ANTLR end "code_fragment"


    public static class ret_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ret"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:55:1: ret : ( WS | '\\r' | '\\n' )+ ;
    public final PreprocessorParser.ret_return ret() throws RecognitionException {
        PreprocessorParser.ret_return retval = new PreprocessorParser.ret_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set11=null;

        Object set11_tree=null;

        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:55:5: ( ( WS | '\\r' | '\\n' )+ )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:55:7: ( WS | '\\r' | '\\n' )+
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:55:7: ( WS | '\\r' | '\\n' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==WS) ) {
                    alt4=1;
                }
                else if ( ((LA4_0 >= 62 && LA4_0 <= 63)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:
            	    {
            	    set11=(Token)input.LT(1);

            	    if ( input.LA(1)==WS||(input.LA(1) >= 62 && input.LA(1) <= 63) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set11)
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
    // $ANTLR end "ret"


    public static class if_not_define_block_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_not_define_block_wrapper"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:57:1: if_not_define_block_wrapper : if_not_define_block -> ^( T_IF_NOT_DEFINE if_not_define_block ) ;
    public final PreprocessorParser.if_not_define_block_wrapper_return if_not_define_block_wrapper() throws RecognitionException {
        PreprocessorParser.if_not_define_block_wrapper_return retval = new PreprocessorParser.if_not_define_block_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.if_not_define_block_return if_not_define_block12 =null;


        RewriteRuleSubtreeStream stream_if_not_define_block=new RewriteRuleSubtreeStream(adaptor,"rule if_not_define_block");
        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:58:2: ( if_not_define_block -> ^( T_IF_NOT_DEFINE if_not_define_block ) )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:58:4: if_not_define_block
            {
            pushFollow(FOLLOW_if_not_define_block_in_if_not_define_block_wrapper260);
            if_not_define_block12=if_not_define_block();

            state._fsp--;

            stream_if_not_define_block.add(if_not_define_block12.getTree());

            // AST REWRITE
            // elements: if_not_define_block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 58:24: -> ^( T_IF_NOT_DEFINE if_not_define_block )
            {
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:58:27: ^( T_IF_NOT_DEFINE if_not_define_block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_IF_NOT_DEFINE, "T_IF_NOT_DEFINE")
                , root_1);

                adaptor.addChild(root_1, stream_if_not_define_block.nextTree());

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
    // $ANTLR end "if_not_define_block_wrapper"


    public static class if_not_define_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_not_define_block"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:60:1: if_not_define_block : ( ifndef1 | ifndef2 ) ret main_code_block ( ELSE ret else_code_block )? ENDIF ;
    public final PreprocessorParser.if_not_define_block_return if_not_define_block() throws RecognitionException {
        PreprocessorParser.if_not_define_block_return retval = new PreprocessorParser.if_not_define_block_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ELSE17=null;
        Token ENDIF20=null;
        PreprocessorParser.ifndef1_return ifndef113 =null;

        PreprocessorParser.ifndef2_return ifndef214 =null;

        PreprocessorParser.ret_return ret15 =null;

        PreprocessorParser.main_code_block_return main_code_block16 =null;

        PreprocessorParser.ret_return ret18 =null;

        PreprocessorParser.else_code_block_return else_code_block19 =null;


        Object ELSE17_tree=null;
        Object ENDIF20_tree=null;

        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:61:2: ( ( ifndef1 | ifndef2 ) ret main_code_block ( ELSE ret else_code_block )? ENDIF )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:61:4: ( ifndef1 | ifndef2 ) ret main_code_block ( ELSE ret else_code_block )? ENDIF
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:61:4: ( ifndef1 | ifndef2 )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==IFNDEF) ) {
                alt5=1;
            }
            else if ( (LA5_0==IF) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:61:5: ifndef1
                    {
                    pushFollow(FOLLOW_ifndef1_in_if_not_define_block279);
                    ifndef113=ifndef1();

                    state._fsp--;

                    adaptor.addChild(root_0, ifndef113.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:61:15: ifndef2
                    {
                    pushFollow(FOLLOW_ifndef2_in_if_not_define_block283);
                    ifndef214=ifndef2();

                    state._fsp--;

                    adaptor.addChild(root_0, ifndef214.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_ret_in_if_not_define_block286);
            ret15=ret();

            state._fsp--;

            adaptor.addChild(root_0, ret15.getTree());

            pushFollow(FOLLOW_main_code_block_in_if_not_define_block290);
            main_code_block16=main_code_block();

            state._fsp--;

            adaptor.addChild(root_0, main_code_block16.getTree());

            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:63:3: ( ELSE ret else_code_block )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ELSE) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:63:4: ELSE ret else_code_block
                    {
                    ELSE17=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_not_define_block295); 
                    ELSE17_tree = 
                    (Object)adaptor.create(ELSE17)
                    ;
                    adaptor.addChild(root_0, ELSE17_tree);


                    pushFollow(FOLLOW_ret_in_if_not_define_block297);
                    ret18=ret();

                    state._fsp--;

                    adaptor.addChild(root_0, ret18.getTree());

                    pushFollow(FOLLOW_else_code_block_in_if_not_define_block302);
                    else_code_block19=else_code_block();

                    state._fsp--;

                    adaptor.addChild(root_0, else_code_block19.getTree());

                    }
                    break;

            }


            ENDIF20=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_if_not_define_block309); 
            ENDIF20_tree = 
            (Object)adaptor.create(ENDIF20)
            ;
            adaptor.addChild(root_0, ENDIF20_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "if_not_define_block"


    public static class ifndef1_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifndef1"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:68:1: ifndef1 : IFNDEF ( WS )+ name ;
    public final PreprocessorParser.ifndef1_return ifndef1() throws RecognitionException {
        PreprocessorParser.ifndef1_return retval = new PreprocessorParser.ifndef1_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IFNDEF21=null;
        Token WS22=null;
        PreprocessorParser.name_return name23 =null;


        Object IFNDEF21_tree=null;
        Object WS22_tree=null;

        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:68:9: ( IFNDEF ( WS )+ name )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:68:11: IFNDEF ( WS )+ name
            {
            root_0 = (Object)adaptor.nil();


            IFNDEF21=(Token)match(input,IFNDEF,FOLLOW_IFNDEF_in_ifndef1319); 
            IFNDEF21_tree = 
            (Object)adaptor.create(IFNDEF21)
            ;
            adaptor.addChild(root_0, IFNDEF21_tree);


            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:68:18: ( WS )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==WS) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:68:18: WS
            	    {
            	    WS22=(Token)match(input,WS,FOLLOW_WS_in_ifndef1321); 
            	    WS22_tree = 
            	    (Object)adaptor.create(WS22)
            	    ;
            	    adaptor.addChild(root_0, WS22_tree);


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


            pushFollow(FOLLOW_name_in_ifndef1324);
            name23=name();

            state._fsp--;

            adaptor.addChild(root_0, name23.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ifndef1"


    public static class ifndef2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifndef2"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:70:1: ifndef2 : IF ( WS )+ '!' ( WS )* 'defined' '(' ( WS )* name ( WS )* ')' ;
    public final PreprocessorParser.ifndef2_return ifndef2() throws RecognitionException {
        PreprocessorParser.ifndef2_return retval = new PreprocessorParser.ifndef2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IF24=null;
        Token WS25=null;
        Token char_literal26=null;
        Token WS27=null;
        Token string_literal28=null;
        Token char_literal29=null;
        Token WS30=null;
        Token WS32=null;
        Token char_literal33=null;
        PreprocessorParser.name_return name31 =null;


        Object IF24_tree=null;
        Object WS25_tree=null;
        Object char_literal26_tree=null;
        Object WS27_tree=null;
        Object string_literal28_tree=null;
        Object char_literal29_tree=null;
        Object WS30_tree=null;
        Object WS32_tree=null;
        Object char_literal33_tree=null;

        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:70:9: ( IF ( WS )+ '!' ( WS )* 'defined' '(' ( WS )* name ( WS )* ')' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:70:11: IF ( WS )+ '!' ( WS )* 'defined' '(' ( WS )* name ( WS )* ')'
            {
            root_0 = (Object)adaptor.nil();


            IF24=(Token)match(input,IF,FOLLOW_IF_in_ifndef2332); 
            IF24_tree = 
            (Object)adaptor.create(IF24)
            ;
            adaptor.addChild(root_0, IF24_tree);


            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:70:14: ( WS )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==WS) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:70:14: WS
            	    {
            	    WS25=(Token)match(input,WS,FOLLOW_WS_in_ifndef2334); 
            	    WS25_tree = 
            	    (Object)adaptor.create(WS25)
            	    ;
            	    adaptor.addChild(root_0, WS25_tree);


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


            char_literal26=(Token)match(input,43,FOLLOW_43_in_ifndef2337); 
            char_literal26_tree = 
            (Object)adaptor.create(char_literal26)
            ;
            adaptor.addChild(root_0, char_literal26_tree);


            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:70:22: ( WS )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==WS) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:70:22: WS
            	    {
            	    WS27=(Token)match(input,WS,FOLLOW_WS_in_ifndef2339); 
            	    WS27_tree = 
            	    (Object)adaptor.create(WS27)
            	    ;
            	    adaptor.addChild(root_0, WS27_tree);


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            string_literal28=(Token)match(input,64,FOLLOW_64_in_ifndef2342); 
            string_literal28_tree = 
            (Object)adaptor.create(string_literal28)
            ;
            adaptor.addChild(root_0, string_literal28_tree);


            char_literal29=(Token)match(input,45,FOLLOW_45_in_ifndef2344); 
            char_literal29_tree = 
            (Object)adaptor.create(char_literal29)
            ;
            adaptor.addChild(root_0, char_literal29_tree);


            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:70:40: ( WS )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==WS) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:70:40: WS
            	    {
            	    WS30=(Token)match(input,WS,FOLLOW_WS_in_ifndef2346); 
            	    WS30_tree = 
            	    (Object)adaptor.create(WS30)
            	    ;
            	    adaptor.addChild(root_0, WS30_tree);


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            pushFollow(FOLLOW_name_in_ifndef2349);
            name31=name();

            state._fsp--;

            adaptor.addChild(root_0, name31.getTree());

            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:70:49: ( WS )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==WS) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:70:49: WS
            	    {
            	    WS32=(Token)match(input,WS,FOLLOW_WS_in_ifndef2351); 
            	    WS32_tree = 
            	    (Object)adaptor.create(WS32)
            	    ;
            	    adaptor.addChild(root_0, WS32_tree);


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            char_literal33=(Token)match(input,46,FOLLOW_46_in_ifndef2355); 
            char_literal33_tree = 
            (Object)adaptor.create(char_literal33)
            ;
            adaptor.addChild(root_0, char_literal33_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ifndef2"


    public static class if_simple_check_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_simple_check_wrapper"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:72:1: if_simple_check_wrapper : if_simple_check -> ^( T_IF_SIMPLE if_simple_check ) ;
    public final PreprocessorParser.if_simple_check_wrapper_return if_simple_check_wrapper() throws RecognitionException {
        PreprocessorParser.if_simple_check_wrapper_return retval = new PreprocessorParser.if_simple_check_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.if_simple_check_return if_simple_check34 =null;


        RewriteRuleSubtreeStream stream_if_simple_check=new RewriteRuleSubtreeStream(adaptor,"rule if_simple_check");
        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:73:2: ( if_simple_check -> ^( T_IF_SIMPLE if_simple_check ) )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:73:4: if_simple_check
            {
            pushFollow(FOLLOW_if_simple_check_in_if_simple_check_wrapper364);
            if_simple_check34=if_simple_check();

            state._fsp--;

            stream_if_simple_check.add(if_simple_check34.getTree());

            // AST REWRITE
            // elements: if_simple_check
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 73:20: -> ^( T_IF_SIMPLE if_simple_check )
            {
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:73:23: ^( T_IF_SIMPLE if_simple_check )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_IF_SIMPLE, "T_IF_SIMPLE")
                , root_1);

                adaptor.addChild(root_1, stream_if_simple_check.nextTree());

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
    // $ANTLR end "if_simple_check_wrapper"


    public static class if_simple_check_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_simple_check"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:75:1: if_simple_check : IF ( WS )+ expression_wrapper ret main_code_block ( ELIF ( WS )+ expression_wrapper ret else_code_block )* ( ELSE ret else_code_block )? ENDIF ;
    public final PreprocessorParser.if_simple_check_return if_simple_check() throws RecognitionException {
        PreprocessorParser.if_simple_check_return retval = new PreprocessorParser.if_simple_check_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IF35=null;
        Token WS36=null;
        Token ELIF40=null;
        Token WS41=null;
        Token ELSE45=null;
        Token ENDIF48=null;
        PreprocessorParser.expression_wrapper_return expression_wrapper37 =null;

        PreprocessorParser.ret_return ret38 =null;

        PreprocessorParser.main_code_block_return main_code_block39 =null;

        PreprocessorParser.expression_wrapper_return expression_wrapper42 =null;

        PreprocessorParser.ret_return ret43 =null;

        PreprocessorParser.else_code_block_return else_code_block44 =null;

        PreprocessorParser.ret_return ret46 =null;

        PreprocessorParser.else_code_block_return else_code_block47 =null;


        Object IF35_tree=null;
        Object WS36_tree=null;
        Object ELIF40_tree=null;
        Object WS41_tree=null;
        Object ELSE45_tree=null;
        Object ENDIF48_tree=null;

        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:76:2: ( IF ( WS )+ expression_wrapper ret main_code_block ( ELIF ( WS )+ expression_wrapper ret else_code_block )* ( ELSE ret else_code_block )? ENDIF )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:76:4: IF ( WS )+ expression_wrapper ret main_code_block ( ELIF ( WS )+ expression_wrapper ret else_code_block )* ( ELSE ret else_code_block )? ENDIF
            {
            root_0 = (Object)adaptor.nil();


            IF35=(Token)match(input,IF,FOLLOW_IF_in_if_simple_check382); 
            IF35_tree = 
            (Object)adaptor.create(IF35)
            ;
            adaptor.addChild(root_0, IF35_tree);


            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:76:7: ( WS )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==WS) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:76:7: WS
            	    {
            	    WS36=(Token)match(input,WS,FOLLOW_WS_in_if_simple_check384); 
            	    WS36_tree = 
            	    (Object)adaptor.create(WS36)
            	    ;
            	    adaptor.addChild(root_0, WS36_tree);


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


            pushFollow(FOLLOW_expression_wrapper_in_if_simple_check387);
            expression_wrapper37=expression_wrapper();

            state._fsp--;

            adaptor.addChild(root_0, expression_wrapper37.getTree());

            pushFollow(FOLLOW_ret_in_if_simple_check389);
            ret38=ret();

            state._fsp--;

            adaptor.addChild(root_0, ret38.getTree());

            pushFollow(FOLLOW_main_code_block_in_if_simple_check393);
            main_code_block39=main_code_block();

            state._fsp--;

            adaptor.addChild(root_0, main_code_block39.getTree());

            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:78:3: ( ELIF ( WS )+ expression_wrapper ret else_code_block )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==ELIF) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:78:4: ELIF ( WS )+ expression_wrapper ret else_code_block
            	    {
            	    ELIF40=(Token)match(input,ELIF,FOLLOW_ELIF_in_if_simple_check398); 
            	    ELIF40_tree = 
            	    (Object)adaptor.create(ELIF40)
            	    ;
            	    adaptor.addChild(root_0, ELIF40_tree);


            	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:78:9: ( WS )+
            	    int cnt13=0;
            	    loop13:
            	    do {
            	        int alt13=2;
            	        int LA13_0 = input.LA(1);

            	        if ( (LA13_0==WS) ) {
            	            alt13=1;
            	        }


            	        switch (alt13) {
            	    	case 1 :
            	    	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:78:9: WS
            	    	    {
            	    	    WS41=(Token)match(input,WS,FOLLOW_WS_in_if_simple_check400); 
            	    	    WS41_tree = 
            	    	    (Object)adaptor.create(WS41)
            	    	    ;
            	    	    adaptor.addChild(root_0, WS41_tree);


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt13 >= 1 ) break loop13;
            	                EarlyExitException eee =
            	                    new EarlyExitException(13, input);
            	                throw eee;
            	        }
            	        cnt13++;
            	    } while (true);


            	    pushFollow(FOLLOW_expression_wrapper_in_if_simple_check403);
            	    expression_wrapper42=expression_wrapper();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression_wrapper42.getTree());

            	    pushFollow(FOLLOW_ret_in_if_simple_check405);
            	    ret43=ret();

            	    state._fsp--;

            	    adaptor.addChild(root_0, ret43.getTree());

            	    pushFollow(FOLLOW_else_code_block_in_if_simple_check409);
            	    else_code_block44=else_code_block();

            	    state._fsp--;

            	    adaptor.addChild(root_0, else_code_block44.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:80:3: ( ELSE ret else_code_block )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ELSE) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:80:4: ELSE ret else_code_block
                    {
                    ELSE45=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_simple_check416); 
                    ELSE45_tree = 
                    (Object)adaptor.create(ELSE45)
                    ;
                    adaptor.addChild(root_0, ELSE45_tree);


                    pushFollow(FOLLOW_ret_in_if_simple_check418);
                    ret46=ret();

                    state._fsp--;

                    adaptor.addChild(root_0, ret46.getTree());

                    pushFollow(FOLLOW_else_code_block_in_if_simple_check423);
                    else_code_block47=else_code_block();

                    state._fsp--;

                    adaptor.addChild(root_0, else_code_block47.getTree());

                    }
                    break;

            }


            ENDIF48=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_if_simple_check430); 
            ENDIF48_tree = 
            (Object)adaptor.create(ENDIF48)
            ;
            adaptor.addChild(root_0, ENDIF48_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "if_simple_check"


    public static class expression_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression_wrapper"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:85:1: expression_wrapper : expression -> ^( T_EXPRESSION expression ) ;
    public final PreprocessorParser.expression_wrapper_return expression_wrapper() throws RecognitionException {
        PreprocessorParser.expression_wrapper_return retval = new PreprocessorParser.expression_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.expression_return expression49 =null;


        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:86:2: ( expression -> ^( T_EXPRESSION expression ) )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:86:4: expression
            {
            pushFollow(FOLLOW_expression_in_expression_wrapper442);
            expression49=expression();

            state._fsp--;

            stream_expression.add(expression49.getTree());

            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 86:15: -> ^( T_EXPRESSION expression )
            {
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:86:18: ^( T_EXPRESSION expression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_EXPRESSION, "T_EXPRESSION")
                , root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());

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
    // $ANTLR end "expression_wrapper"


    public static class if_define_block_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_define_block_wrapper"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:88:1: if_define_block_wrapper : if_define_block -> ^( T_IF_DEFINE if_define_block ) ;
    public final PreprocessorParser.if_define_block_wrapper_return if_define_block_wrapper() throws RecognitionException {
        PreprocessorParser.if_define_block_wrapper_return retval = new PreprocessorParser.if_define_block_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.if_define_block_return if_define_block50 =null;


        RewriteRuleSubtreeStream stream_if_define_block=new RewriteRuleSubtreeStream(adaptor,"rule if_define_block");
        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:89:2: ( if_define_block -> ^( T_IF_DEFINE if_define_block ) )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:89:4: if_define_block
            {
            pushFollow(FOLLOW_if_define_block_in_if_define_block_wrapper461);
            if_define_block50=if_define_block();

            state._fsp--;

            stream_if_define_block.add(if_define_block50.getTree());

            // AST REWRITE
            // elements: if_define_block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 89:20: -> ^( T_IF_DEFINE if_define_block )
            {
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:89:23: ^( T_IF_DEFINE if_define_block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_IF_DEFINE, "T_IF_DEFINE")
                , root_1);

                adaptor.addChild(root_1, stream_if_define_block.nextTree());

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
    // $ANTLR end "if_define_block_wrapper"


    public static class if_define_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_define_block"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:91:1: if_define_block : ( ifdef1 | ifdef2 ) ret ( main_code_block )? ( ELSE ret else_code_block )? ENDIF ;
    public final PreprocessorParser.if_define_block_return if_define_block() throws RecognitionException {
        PreprocessorParser.if_define_block_return retval = new PreprocessorParser.if_define_block_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ELSE55=null;
        Token ENDIF58=null;
        PreprocessorParser.ifdef1_return ifdef151 =null;

        PreprocessorParser.ifdef2_return ifdef252 =null;

        PreprocessorParser.ret_return ret53 =null;

        PreprocessorParser.main_code_block_return main_code_block54 =null;

        PreprocessorParser.ret_return ret56 =null;

        PreprocessorParser.else_code_block_return else_code_block57 =null;


        Object ELSE55_tree=null;
        Object ENDIF58_tree=null;

        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:92:2: ( ( ifdef1 | ifdef2 ) ret ( main_code_block )? ( ELSE ret else_code_block )? ENDIF )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:92:4: ( ifdef1 | ifdef2 ) ret ( main_code_block )? ( ELSE ret else_code_block )? ENDIF
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:92:4: ( ifdef1 | ifdef2 )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==IF) ) {
                alt16=1;
            }
            else if ( (LA16_0==IFDEF) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:92:5: ifdef1
                    {
                    pushFollow(FOLLOW_ifdef1_in_if_define_block481);
                    ifdef151=ifdef1();

                    state._fsp--;

                    adaptor.addChild(root_0, ifdef151.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:92:14: ifdef2
                    {
                    pushFollow(FOLLOW_ifdef2_in_if_define_block485);
                    ifdef252=ifdef2();

                    state._fsp--;

                    adaptor.addChild(root_0, ifdef252.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_ret_in_if_define_block488);
            ret53=ret();

            state._fsp--;

            adaptor.addChild(root_0, ret53.getTree());

            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:93:3: ( main_code_block )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0 >= DEFINE && LA17_0 <= DIGIT)||(LA17_0 >= ID && LA17_0 <= 65)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:93:3: main_code_block
                    {
                    pushFollow(FOLLOW_main_code_block_in_if_define_block492);
                    main_code_block54=main_code_block();

                    state._fsp--;

                    adaptor.addChild(root_0, main_code_block54.getTree());

                    }
                    break;

            }


            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:94:3: ( ELSE ret else_code_block )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ELSE) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:94:4: ELSE ret else_code_block
                    {
                    ELSE55=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_define_block498); 
                    ELSE55_tree = 
                    (Object)adaptor.create(ELSE55)
                    ;
                    adaptor.addChild(root_0, ELSE55_tree);


                    pushFollow(FOLLOW_ret_in_if_define_block500);
                    ret56=ret();

                    state._fsp--;

                    adaptor.addChild(root_0, ret56.getTree());

                    pushFollow(FOLLOW_else_code_block_in_if_define_block505);
                    else_code_block57=else_code_block();

                    state._fsp--;

                    adaptor.addChild(root_0, else_code_block57.getTree());

                    }
                    break;

            }


            ENDIF58=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_if_define_block512); 
            ENDIF58_tree = 
            (Object)adaptor.create(ENDIF58)
            ;
            adaptor.addChild(root_0, ENDIF58_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "if_define_block"


    public static class ifdef1_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifdef1"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:99:1: ifdef1 : IF ( WS )+ 'defined' '(' name ')' ;
    public final PreprocessorParser.ifdef1_return ifdef1() throws RecognitionException {
        PreprocessorParser.ifdef1_return retval = new PreprocessorParser.ifdef1_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IF59=null;
        Token WS60=null;
        Token string_literal61=null;
        Token char_literal62=null;
        Token char_literal64=null;
        PreprocessorParser.name_return name63 =null;


        Object IF59_tree=null;
        Object WS60_tree=null;
        Object string_literal61_tree=null;
        Object char_literal62_tree=null;
        Object char_literal64_tree=null;

        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:99:8: ( IF ( WS )+ 'defined' '(' name ')' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:99:10: IF ( WS )+ 'defined' '(' name ')'
            {
            root_0 = (Object)adaptor.nil();


            IF59=(Token)match(input,IF,FOLLOW_IF_in_ifdef1522); 
            IF59_tree = 
            (Object)adaptor.create(IF59)
            ;
            adaptor.addChild(root_0, IF59_tree);


            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:99:13: ( WS )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==WS) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:99:13: WS
            	    {
            	    WS60=(Token)match(input,WS,FOLLOW_WS_in_ifdef1524); 
            	    WS60_tree = 
            	    (Object)adaptor.create(WS60)
            	    ;
            	    adaptor.addChild(root_0, WS60_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);


            string_literal61=(Token)match(input,64,FOLLOW_64_in_ifdef1527); 
            string_literal61_tree = 
            (Object)adaptor.create(string_literal61)
            ;
            adaptor.addChild(root_0, string_literal61_tree);


            char_literal62=(Token)match(input,45,FOLLOW_45_in_ifdef1529); 
            char_literal62_tree = 
            (Object)adaptor.create(char_literal62)
            ;
            adaptor.addChild(root_0, char_literal62_tree);


            pushFollow(FOLLOW_name_in_ifdef1531);
            name63=name();

            state._fsp--;

            adaptor.addChild(root_0, name63.getTree());

            char_literal64=(Token)match(input,46,FOLLOW_46_in_ifdef1533); 
            char_literal64_tree = 
            (Object)adaptor.create(char_literal64)
            ;
            adaptor.addChild(root_0, char_literal64_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ifdef1"


    public static class ifdef2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifdef2"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:101:1: ifdef2 : IFDEF ( WS )+ name ;
    public final PreprocessorParser.ifdef2_return ifdef2() throws RecognitionException {
        PreprocessorParser.ifdef2_return retval = new PreprocessorParser.ifdef2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IFDEF65=null;
        Token WS66=null;
        PreprocessorParser.name_return name67 =null;


        Object IFDEF65_tree=null;
        Object WS66_tree=null;

        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:101:8: ( IFDEF ( WS )+ name )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:101:10: IFDEF ( WS )+ name
            {
            root_0 = (Object)adaptor.nil();


            IFDEF65=(Token)match(input,IFDEF,FOLLOW_IFDEF_in_ifdef2541); 
            IFDEF65_tree = 
            (Object)adaptor.create(IFDEF65)
            ;
            adaptor.addChild(root_0, IFDEF65_tree);


            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:101:16: ( WS )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==WS) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:101:16: WS
            	    {
            	    WS66=(Token)match(input,WS,FOLLOW_WS_in_ifdef2543); 
            	    WS66_tree = 
            	    (Object)adaptor.create(WS66)
            	    ;
            	    adaptor.addChild(root_0, WS66_tree);


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


            pushFollow(FOLLOW_name_in_ifdef2546);
            name67=name();

            state._fsp--;

            adaptor.addChild(root_0, name67.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ifdef2"


    public static class main_code_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "main_code_block"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:103:1: main_code_block : code_block -> ^( T_IF_MAIN code_block ) ;
    public final PreprocessorParser.main_code_block_return main_code_block() throws RecognitionException {
        PreprocessorParser.main_code_block_return retval = new PreprocessorParser.main_code_block_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.code_block_return code_block68 =null;


        RewriteRuleSubtreeStream stream_code_block=new RewriteRuleSubtreeStream(adaptor,"rule code_block");
        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:104:2: ( code_block -> ^( T_IF_MAIN code_block ) )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:104:4: code_block
            {
            pushFollow(FOLLOW_code_block_in_main_code_block555);
            code_block68=code_block();

            state._fsp--;

            stream_code_block.add(code_block68.getTree());

            // AST REWRITE
            // elements: code_block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 104:15: -> ^( T_IF_MAIN code_block )
            {
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:104:18: ^( T_IF_MAIN code_block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_IF_MAIN, "T_IF_MAIN")
                , root_1);

                adaptor.addChild(root_1, stream_code_block.nextTree());

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
    // $ANTLR end "main_code_block"


    public static class else_code_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "else_code_block"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:106:1: else_code_block : code_block -> ^( T_IF_ELSE code_block ) ;
    public final PreprocessorParser.else_code_block_return else_code_block() throws RecognitionException {
        PreprocessorParser.else_code_block_return retval = new PreprocessorParser.else_code_block_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.code_block_return code_block69 =null;


        RewriteRuleSubtreeStream stream_code_block=new RewriteRuleSubtreeStream(adaptor,"rule code_block");
        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:107:2: ( code_block -> ^( T_IF_ELSE code_block ) )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:107:4: code_block
            {
            pushFollow(FOLLOW_code_block_in_else_code_block572);
            code_block69=code_block();

            state._fsp--;

            stream_code_block.add(code_block69.getTree());

            // AST REWRITE
            // elements: code_block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 107:15: -> ^( T_IF_ELSE code_block )
            {
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:107:18: ^( T_IF_ELSE code_block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_IF_ELSE, "T_IF_ELSE")
                , root_1);

                adaptor.addChild(root_1, stream_code_block.nextTree());

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
    // $ANTLR end "else_code_block"


    public static class code_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "code_block"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:109:1: code_block : ( code_fragment )+ -> ^( T_BLOCK ( code_fragment )+ ) ;
    public final PreprocessorParser.code_block_return code_block() throws RecognitionException {
        PreprocessorParser.code_block_return retval = new PreprocessorParser.code_block_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.code_fragment_return code_fragment70 =null;


        RewriteRuleSubtreeStream stream_code_fragment=new RewriteRuleSubtreeStream(adaptor,"rule code_fragment");
        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:110:2: ( ( code_fragment )+ -> ^( T_BLOCK ( code_fragment )+ ) )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:110:4: ( code_fragment )+
            {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:110:4: ( code_fragment )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0 >= DEFINE && LA21_0 <= DIGIT)||(LA21_0 >= ID && LA21_0 <= 65)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:110:4: code_fragment
            	    {
            	    pushFollow(FOLLOW_code_fragment_in_code_block589);
            	    code_fragment70=code_fragment();

            	    state._fsp--;

            	    stream_code_fragment.add(code_fragment70.getTree());

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


            // AST REWRITE
            // elements: code_fragment
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 110:19: -> ^( T_BLOCK ( code_fragment )+ )
            {
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:110:22: ^( T_BLOCK ( code_fragment )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_BLOCK, "T_BLOCK")
                , root_1);

                if ( !(stream_code_fragment.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_code_fragment.hasNext() ) {
                    adaptor.addChild(root_1, stream_code_fragment.nextTree());

                }
                stream_code_fragment.reset();

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
    // $ANTLR end "code_block"


    public static class inside_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inside_block"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:113:1: inside_block : (~ ( ELSE | ENDIF | ELIF ) )* ;
    public final PreprocessorParser.inside_block_return inside_block() throws RecognitionException {
        PreprocessorParser.inside_block_return retval = new PreprocessorParser.inside_block_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set71=null;

        Object set71_tree=null;

        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:114:2: ( (~ ( ELSE | ENDIF | ELIF ) )* )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:114:4: (~ ( ELSE | ENDIF | ELIF ) )*
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:114:4: (~ ( ELSE | ENDIF | ELIF ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0 >= COMMENT && LA22_0 <= DIGIT)||(LA22_0 >= ID && LA22_0 <= 65)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:
            	    {
            	    set71=(Token)input.LT(1);

            	    if ( (input.LA(1) >= COMMENT && input.LA(1) <= DIGIT)||(input.LA(1) >= ID && input.LA(1) <= 65) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set71)
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
            	    break loop22;
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
    // $ANTLR end "inside_block"


    public static class name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "name"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:116:1: name : ID -> ^( T_NAME ID ) ;
    public final PreprocessorParser.name_return name() throws RecognitionException {
        PreprocessorParser.name_return retval = new PreprocessorParser.name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID72=null;

        Object ID72_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:116:6: ( ID -> ^( T_NAME ID ) )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:116:8: ID
            {
            ID72=(Token)match(input,ID,FOLLOW_ID_in_name631);  
            stream_ID.add(ID72);


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
            // 116:11: -> ^( T_NAME ID )
            {
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:116:14: ^( T_NAME ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_NAME, "T_NAME")
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
    // $ANTLR end "name"


    public static class import_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "import_declaration"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:118:1: import_declaration : ( IMPORT | INCLUDE ) ( WS )* ( import_internal | import_external ) ;
    public final PreprocessorParser.import_declaration_return import_declaration() throws RecognitionException {
        PreprocessorParser.import_declaration_return retval = new PreprocessorParser.import_declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set73=null;
        Token WS74=null;
        PreprocessorParser.import_internal_return import_internal75 =null;

        PreprocessorParser.import_external_return import_external76 =null;


        Object set73_tree=null;
        Object WS74_tree=null;

        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:119:2: ( ( IMPORT | INCLUDE ) ( WS )* ( import_internal | import_external ) )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:119:4: ( IMPORT | INCLUDE ) ( WS )* ( import_internal | import_external )
            {
            root_0 = (Object)adaptor.nil();


            set73=(Token)input.LT(1);

            if ( (input.LA(1) >= IMPORT && input.LA(1) <= INCLUDE) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set73)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:119:23: ( WS )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==WS) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:119:23: WS
            	    {
            	    WS74=(Token)match(input,WS,FOLLOW_WS_in_import_declaration656); 
            	    WS74_tree = 
            	    (Object)adaptor.create(WS74)
            	    ;
            	    adaptor.addChild(root_0, WS74_tree);


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:119:27: ( import_internal | import_external )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==54) ) {
                alt24=1;
            }
            else if ( (LA24_0==STRING_LITERAL2) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:119:28: import_internal
                    {
                    pushFollow(FOLLOW_import_internal_in_import_declaration660);
                    import_internal75=import_internal();

                    state._fsp--;

                    adaptor.addChild(root_0, import_internal75.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:119:46: import_external
                    {
                    pushFollow(FOLLOW_import_external_in_import_declaration664);
                    import_external76=import_external();

                    state._fsp--;

                    adaptor.addChild(root_0, import_external76.getTree());

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
    // $ANTLR end "import_declaration"


    public static class import_internal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "import_internal"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:121:1: import_internal : import_internal_string -> ^( T_IMPORT import_internal_string ) ;
    public final PreprocessorParser.import_internal_return import_internal() throws RecognitionException {
        PreprocessorParser.import_internal_return retval = new PreprocessorParser.import_internal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.import_internal_string_return import_internal_string77 =null;


        RewriteRuleSubtreeStream stream_import_internal_string=new RewriteRuleSubtreeStream(adaptor,"rule import_internal_string");
        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:122:2: ( import_internal_string -> ^( T_IMPORT import_internal_string ) )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:122:4: import_internal_string
            {
            pushFollow(FOLLOW_import_internal_string_in_import_internal675);
            import_internal_string77=import_internal_string();

            state._fsp--;

            stream_import_internal_string.add(import_internal_string77.getTree());

            // AST REWRITE
            // elements: import_internal_string
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 122:27: -> ^( T_IMPORT import_internal_string )
            {
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:122:30: ^( T_IMPORT import_internal_string )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_IMPORT, "T_IMPORT")
                , root_1);

                adaptor.addChild(root_1, stream_import_internal_string.nextTree());

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
    // $ANTLR end "import_internal"


    public static class import_internal_string_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "import_internal_string"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:124:1: import_internal_string : '<' ( WS )* filename ( '/' filename )* ( WS )* '>' ;
    public final PreprocessorParser.import_internal_string_return import_internal_string() throws RecognitionException {
        PreprocessorParser.import_internal_string_return retval = new PreprocessorParser.import_internal_string_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal78=null;
        Token WS79=null;
        Token char_literal81=null;
        Token WS83=null;
        Token char_literal84=null;
        PreprocessorParser.filename_return filename80 =null;

        PreprocessorParser.filename_return filename82 =null;


        Object char_literal78_tree=null;
        Object WS79_tree=null;
        Object char_literal81_tree=null;
        Object WS83_tree=null;
        Object char_literal84_tree=null;

        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:125:2: ( '<' ( WS )* filename ( '/' filename )* ( WS )* '>' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:125:4: '<' ( WS )* filename ( '/' filename )* ( WS )* '>'
            {
            root_0 = (Object)adaptor.nil();


            char_literal78=(Token)match(input,54,FOLLOW_54_in_import_internal_string693); 
            char_literal78_tree = 
            (Object)adaptor.create(char_literal78)
            ;
            adaptor.addChild(root_0, char_literal78_tree);


            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:125:8: ( WS )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==WS) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:125:8: WS
            	    {
            	    WS79=(Token)match(input,WS,FOLLOW_WS_in_import_internal_string695); 
            	    WS79_tree = 
            	    (Object)adaptor.create(WS79)
            	    ;
            	    adaptor.addChild(root_0, WS79_tree);


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            pushFollow(FOLLOW_filename_in_import_internal_string698);
            filename80=filename();

            state._fsp--;

            adaptor.addChild(root_0, filename80.getTree());

            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:125:21: ( '/' filename )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==53) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:125:22: '/' filename
            	    {
            	    char_literal81=(Token)match(input,53,FOLLOW_53_in_import_internal_string701); 
            	    char_literal81_tree = 
            	    (Object)adaptor.create(char_literal81)
            	    ;
            	    adaptor.addChild(root_0, char_literal81_tree);


            	    pushFollow(FOLLOW_filename_in_import_internal_string703);
            	    filename82=filename();

            	    state._fsp--;

            	    adaptor.addChild(root_0, filename82.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:125:37: ( WS )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==WS) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:125:37: WS
            	    {
            	    WS83=(Token)match(input,WS,FOLLOW_WS_in_import_internal_string707); 
            	    WS83_tree = 
            	    (Object)adaptor.create(WS83)
            	    ;
            	    adaptor.addChild(root_0, WS83_tree);


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            char_literal84=(Token)match(input,57,FOLLOW_57_in_import_internal_string710); 
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
    // $ANTLR end "import_internal_string"


    public static class filename_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "filename"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:127:1: filename : ID ( '.' ID )? ;
    public final PreprocessorParser.filename_return filename() throws RecognitionException {
        PreprocessorParser.filename_return retval = new PreprocessorParser.filename_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID85=null;
        Token char_literal86=null;
        Token ID87=null;

        Object ID85_tree=null;
        Object char_literal86_tree=null;
        Object ID87_tree=null;

        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:127:9: ( ID ( '.' ID )? )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:127:11: ID ( '.' ID )?
            {
            root_0 = (Object)adaptor.nil();


            ID85=(Token)match(input,ID,FOLLOW_ID_in_filename718); 
            ID85_tree = 
            (Object)adaptor.create(ID85)
            ;
            adaptor.addChild(root_0, ID85_tree);


            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:127:14: ( '.' ID )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==51) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:127:15: '.' ID
                    {
                    char_literal86=(Token)match(input,51,FOLLOW_51_in_filename721); 
                    char_literal86_tree = 
                    (Object)adaptor.create(char_literal86)
                    ;
                    adaptor.addChild(root_0, char_literal86_tree);


                    ID87=(Token)match(input,ID,FOLLOW_ID_in_filename723); 
                    ID87_tree = 
                    (Object)adaptor.create(ID87)
                    ;
                    adaptor.addChild(root_0, ID87_tree);


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
    // $ANTLR end "filename"


    public static class import_external_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "import_external"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:129:1: import_external : import_external_string -> ^( T_INCLUDE import_external_string ) ;
    public final PreprocessorParser.import_external_return import_external() throws RecognitionException {
        PreprocessorParser.import_external_return retval = new PreprocessorParser.import_external_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.import_external_string_return import_external_string88 =null;


        RewriteRuleSubtreeStream stream_import_external_string=new RewriteRuleSubtreeStream(adaptor,"rule import_external_string");
        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:130:2: ( import_external_string -> ^( T_INCLUDE import_external_string ) )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:130:4: import_external_string
            {
            pushFollow(FOLLOW_import_external_string_in_import_external735);
            import_external_string88=import_external_string();

            state._fsp--;

            stream_import_external_string.add(import_external_string88.getTree());

            // AST REWRITE
            // elements: import_external_string
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 130:27: -> ^( T_INCLUDE import_external_string )
            {
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:130:30: ^( T_INCLUDE import_external_string )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_INCLUDE, "T_INCLUDE")
                , root_1);

                adaptor.addChild(root_1, stream_import_external_string.nextTree());

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
    // $ANTLR end "import_external"


    public static class import_external_string_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "import_external_string"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:132:1: import_external_string : STRING_LITERAL2 ;
    public final PreprocessorParser.import_external_string_return import_external_string() throws RecognitionException {
        PreprocessorParser.import_external_string_return retval = new PreprocessorParser.import_external_string_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING_LITERAL289=null;

        Object STRING_LITERAL289_tree=null;

        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:133:2: ( STRING_LITERAL2 )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:133:4: STRING_LITERAL2
            {
            root_0 = (Object)adaptor.nil();


            STRING_LITERAL289=(Token)match(input,STRING_LITERAL2,FOLLOW_STRING_LITERAL2_in_import_external_string752); 
            STRING_LITERAL289_tree = 
            (Object)adaptor.create(STRING_LITERAL289)
            ;
            adaptor.addChild(root_0, STRING_LITERAL289_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "import_external_string"


    public static class define_directive_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "define_directive"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:135:1: define_directive : DEFINE ( WS )+ id_wrapper ( WS )* ( mln_end )? ( replace_wrapper )? -> ^( T_DEFINE DEFINE ( WS )+ id_wrapper ( replace_wrapper )? ) ;
    public final PreprocessorParser.define_directive_return define_directive() throws RecognitionException {
        PreprocessorParser.define_directive_return retval = new PreprocessorParser.define_directive_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DEFINE90=null;
        Token WS91=null;
        Token WS93=null;
        PreprocessorParser.id_wrapper_return id_wrapper92 =null;

        PreprocessorParser.mln_end_return mln_end94 =null;

        PreprocessorParser.replace_wrapper_return replace_wrapper95 =null;


        Object DEFINE90_tree=null;
        Object WS91_tree=null;
        Object WS93_tree=null;
        RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
        RewriteRuleTokenStream stream_DEFINE=new RewriteRuleTokenStream(adaptor,"token DEFINE");
        RewriteRuleSubtreeStream stream_replace_wrapper=new RewriteRuleSubtreeStream(adaptor,"rule replace_wrapper");
        RewriteRuleSubtreeStream stream_id_wrapper=new RewriteRuleSubtreeStream(adaptor,"rule id_wrapper");
        RewriteRuleSubtreeStream stream_mln_end=new RewriteRuleSubtreeStream(adaptor,"rule mln_end");
        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:136:2: ( DEFINE ( WS )+ id_wrapper ( WS )* ( mln_end )? ( replace_wrapper )? -> ^( T_DEFINE DEFINE ( WS )+ id_wrapper ( replace_wrapper )? ) )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:136:4: DEFINE ( WS )+ id_wrapper ( WS )* ( mln_end )? ( replace_wrapper )?
            {
            DEFINE90=(Token)match(input,DEFINE,FOLLOW_DEFINE_in_define_directive762);  
            stream_DEFINE.add(DEFINE90);


            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:136:11: ( WS )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==WS) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:136:11: WS
            	    {
            	    WS91=(Token)match(input,WS,FOLLOW_WS_in_define_directive764);  
            	    stream_WS.add(WS91);


            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);


            pushFollow(FOLLOW_id_wrapper_in_define_directive767);
            id_wrapper92=id_wrapper();

            state._fsp--;

            stream_id_wrapper.add(id_wrapper92.getTree());

            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:136:26: ( WS )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==WS) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:136:26: WS
            	    {
            	    WS93=(Token)match(input,WS,FOLLOW_WS_in_define_directive769);  
            	    stream_WS.add(WS93);


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:136:30: ( mln_end )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==61) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==WS) ) {
                    int LA31_17 = input.LA(3);

                    if ( ((LA31_17 >= 62 && LA31_17 <= 63)) ) {
                        alt31=1;
                    }
                    else if ( (LA31_17==WS) ) {
                        int LA31_31 = input.LA(4);

                        if ( ((LA31_31 >= 62 && LA31_31 <= 63)) ) {
                            alt31=1;
                        }
                        else if ( (LA31_31==WS) ) {
                            alt31=1;
                        }
                    }
                }
                else if ( ((LA31_1 >= 62 && LA31_1 <= 63)) ) {
                    alt31=1;
                }
            }
            switch (alt31) {
                case 1 :
                    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:136:30: mln_end
                    {
                    pushFollow(FOLLOW_mln_end_in_define_directive772);
                    mln_end94=mln_end();

                    state._fsp--;

                    stream_mln_end.add(mln_end94.getTree());

                    }
                    break;

            }


            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:136:39: ( replace_wrapper )?
            int alt32=2;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:136:39: replace_wrapper
                    {
                    pushFollow(FOLLOW_replace_wrapper_in_define_directive775);
                    replace_wrapper95=replace_wrapper();

                    state._fsp--;

                    stream_replace_wrapper.add(replace_wrapper95.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: WS, DEFINE, replace_wrapper, id_wrapper
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 136:56: -> ^( T_DEFINE DEFINE ( WS )+ id_wrapper ( replace_wrapper )? )
            {
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:136:59: ^( T_DEFINE DEFINE ( WS )+ id_wrapper ( replace_wrapper )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_DEFINE, "T_DEFINE")
                , root_1);

                adaptor.addChild(root_1, 
                stream_DEFINE.nextNode()
                );

                if ( !(stream_WS.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_WS.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_WS.nextNode()
                    );

                }
                stream_WS.reset();

                adaptor.addChild(root_1, stream_id_wrapper.nextTree());

                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:136:92: ( replace_wrapper )?
                if ( stream_replace_wrapper.hasNext() ) {
                    adaptor.addChild(root_1, stream_replace_wrapper.nextTree());

                }
                stream_replace_wrapper.reset();

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
    // $ANTLR end "define_directive"


    public static class mln_end_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mln_end"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:139:1: mln_end : '\\\\' ( WS )* ( '\\r' | '\\n' )+ ;
    public final PreprocessorParser.mln_end_return mln_end() throws RecognitionException {
        PreprocessorParser.mln_end_return retval = new PreprocessorParser.mln_end_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal96=null;
        Token WS97=null;
        Token set98=null;

        Object char_literal96_tree=null;
        Object WS97_tree=null;
        Object set98_tree=null;

        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:139:9: ( '\\\\' ( WS )* ( '\\r' | '\\n' )+ )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:139:11: '\\\\' ( WS )* ( '\\r' | '\\n' )+
            {
            root_0 = (Object)adaptor.nil();


            char_literal96=(Token)match(input,61,FOLLOW_61_in_mln_end803); 
            char_literal96_tree = 
            (Object)adaptor.create(char_literal96)
            ;
            adaptor.addChild(root_0, char_literal96_tree);


            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:139:16: ( WS )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==WS) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:139:16: WS
            	    {
            	    WS97=(Token)match(input,WS,FOLLOW_WS_in_mln_end805); 
            	    WS97_tree = 
            	    (Object)adaptor.create(WS97)
            	    ;
            	    adaptor.addChild(root_0, WS97_tree);


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:139:20: ( '\\r' | '\\n' )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0 >= 62 && LA34_0 <= 63)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:
            	    {
            	    set98=(Token)input.LT(1);

            	    if ( (input.LA(1) >= 62 && input.LA(1) <= 63) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set98)
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
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
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
    // $ANTLR end "mln_end"


    public static class id_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "id_wrapper"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:142:1: id_wrapper : name_wrapper ( in_brackets_wrapper )? -> ^( T_ID name_wrapper ( in_brackets_wrapper )? ) ;
    public final PreprocessorParser.id_wrapper_return id_wrapper() throws RecognitionException {
        PreprocessorParser.id_wrapper_return retval = new PreprocessorParser.id_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.name_wrapper_return name_wrapper99 =null;

        PreprocessorParser.in_brackets_wrapper_return in_brackets_wrapper100 =null;


        RewriteRuleSubtreeStream stream_name_wrapper=new RewriteRuleSubtreeStream(adaptor,"rule name_wrapper");
        RewriteRuleSubtreeStream stream_in_brackets_wrapper=new RewriteRuleSubtreeStream(adaptor,"rule in_brackets_wrapper");
        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:143:2: ( name_wrapper ( in_brackets_wrapper )? -> ^( T_ID name_wrapper ( in_brackets_wrapper )? ) )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:143:4: name_wrapper ( in_brackets_wrapper )?
            {
            pushFollow(FOLLOW_name_wrapper_in_id_wrapper828);
            name_wrapper99=name_wrapper();

            state._fsp--;

            stream_name_wrapper.add(name_wrapper99.getTree());

            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:143:17: ( in_brackets_wrapper )?
            int alt35=2;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:143:17: in_brackets_wrapper
                    {
                    pushFollow(FOLLOW_in_brackets_wrapper_in_id_wrapper830);
                    in_brackets_wrapper100=in_brackets_wrapper();

                    state._fsp--;

                    stream_in_brackets_wrapper.add(in_brackets_wrapper100.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: in_brackets_wrapper, name_wrapper
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 143:38: -> ^( T_ID name_wrapper ( in_brackets_wrapper )? )
            {
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:143:41: ^( T_ID name_wrapper ( in_brackets_wrapper )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_ID, "T_ID")
                , root_1);

                adaptor.addChild(root_1, stream_name_wrapper.nextTree());

                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:143:61: ( in_brackets_wrapper )?
                if ( stream_in_brackets_wrapper.hasNext() ) {
                    adaptor.addChild(root_1, stream_in_brackets_wrapper.nextTree());

                }
                stream_in_brackets_wrapper.reset();

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
    // $ANTLR end "id_wrapper"


    public static class name_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "name_wrapper"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:145:1: name_wrapper : ID -> ^( T_NAME ID ) ;
    public final PreprocessorParser.name_wrapper_return name_wrapper() throws RecognitionException {
        PreprocessorParser.name_wrapper_return retval = new PreprocessorParser.name_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID101=null;

        Object ID101_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:146:2: ( ID -> ^( T_NAME ID ) )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:146:4: ID
            {
            ID101=(Token)match(input,ID,FOLLOW_ID_in_name_wrapper853);  
            stream_ID.add(ID101);


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
            // 146:7: -> ^( T_NAME ID )
            {
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:146:10: ^( T_NAME ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_NAME, "T_NAME")
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
    // $ANTLR end "name_wrapper"


    public static class in_brackets_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "in_brackets_wrapper"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:148:1: in_brackets_wrapper : in_brackets -> ^( T_IN_BRACKETS in_brackets ) ;
    public final PreprocessorParser.in_brackets_wrapper_return in_brackets_wrapper() throws RecognitionException {
        PreprocessorParser.in_brackets_wrapper_return retval = new PreprocessorParser.in_brackets_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.in_brackets_return in_brackets102 =null;


        RewriteRuleSubtreeStream stream_in_brackets=new RewriteRuleSubtreeStream(adaptor,"rule in_brackets");
        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:149:2: ( in_brackets -> ^( T_IN_BRACKETS in_brackets ) )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:149:4: in_brackets
            {
            pushFollow(FOLLOW_in_brackets_in_in_brackets_wrapper872);
            in_brackets102=in_brackets();

            state._fsp--;

            stream_in_brackets.add(in_brackets102.getTree());

            // AST REWRITE
            // elements: in_brackets
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 149:16: -> ^( T_IN_BRACKETS in_brackets )
            {
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:149:19: ^( T_IN_BRACKETS in_brackets )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_IN_BRACKETS, "T_IN_BRACKETS")
                , root_1);

                adaptor.addChild(root_1, stream_in_brackets.nextTree());

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
    // $ANTLR end "in_brackets_wrapper"


    public static class in_brackets_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "in_brackets"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:151:1: in_brackets : '(' ( WS )* param_wrapper ( ( WS )* ',' ( WS )* param_wrapper )* ( WS )* ')' ;
    public final PreprocessorParser.in_brackets_return in_brackets() throws RecognitionException {
        PreprocessorParser.in_brackets_return retval = new PreprocessorParser.in_brackets_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal103=null;
        Token WS104=null;
        Token WS106=null;
        Token char_literal107=null;
        Token WS108=null;
        Token WS110=null;
        Token char_literal111=null;
        PreprocessorParser.param_wrapper_return param_wrapper105 =null;

        PreprocessorParser.param_wrapper_return param_wrapper109 =null;


        Object char_literal103_tree=null;
        Object WS104_tree=null;
        Object WS106_tree=null;
        Object char_literal107_tree=null;
        Object WS108_tree=null;
        Object WS110_tree=null;
        Object char_literal111_tree=null;

        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:152:2: ( '(' ( WS )* param_wrapper ( ( WS )* ',' ( WS )* param_wrapper )* ( WS )* ')' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:152:4: '(' ( WS )* param_wrapper ( ( WS )* ',' ( WS )* param_wrapper )* ( WS )* ')'
            {
            root_0 = (Object)adaptor.nil();


            char_literal103=(Token)match(input,45,FOLLOW_45_in_in_brackets891); 
            char_literal103_tree = 
            (Object)adaptor.create(char_literal103)
            ;
            adaptor.addChild(root_0, char_literal103_tree);


            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:152:8: ( WS )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==WS) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:152:8: WS
            	    {
            	    WS104=(Token)match(input,WS,FOLLOW_WS_in_in_brackets893); 
            	    WS104_tree = 
            	    (Object)adaptor.create(WS104)
            	    ;
            	    adaptor.addChild(root_0, WS104_tree);


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            pushFollow(FOLLOW_param_wrapper_in_in_brackets896);
            param_wrapper105=param_wrapper();

            state._fsp--;

            adaptor.addChild(root_0, param_wrapper105.getTree());

            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:152:26: ( ( WS )* ',' ( WS )* param_wrapper )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==WS) ) {
                    int LA39_1 = input.LA(2);

                    if ( (LA39_1==WS) ) {
                        int LA39_5 = input.LA(3);

                        if ( (LA39_5==WS) ) {
                            int LA39_8 = input.LA(4);

                            if ( (LA39_8==WS) ) {
                                alt39=1;
                            }
                            else if ( (LA39_8==49) ) {
                                alt39=1;
                            }


                        }
                        else if ( (LA39_5==49) ) {
                            alt39=1;
                        }


                    }
                    else if ( (LA39_1==49) ) {
                        alt39=1;
                    }


                }
                else if ( (LA39_0==49) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:152:27: ( WS )* ',' ( WS )* param_wrapper
            	    {
            	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:152:27: ( WS )*
            	    loop37:
            	    do {
            	        int alt37=2;
            	        int LA37_0 = input.LA(1);

            	        if ( (LA37_0==WS) ) {
            	            alt37=1;
            	        }


            	        switch (alt37) {
            	    	case 1 :
            	    	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:152:27: WS
            	    	    {
            	    	    WS106=(Token)match(input,WS,FOLLOW_WS_in_in_brackets899); 
            	    	    WS106_tree = 
            	    	    (Object)adaptor.create(WS106)
            	    	    ;
            	    	    adaptor.addChild(root_0, WS106_tree);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop37;
            	        }
            	    } while (true);


            	    char_literal107=(Token)match(input,49,FOLLOW_49_in_in_brackets902); 
            	    char_literal107_tree = 
            	    (Object)adaptor.create(char_literal107)
            	    ;
            	    adaptor.addChild(root_0, char_literal107_tree);


            	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:152:35: ( WS )*
            	    loop38:
            	    do {
            	        int alt38=2;
            	        int LA38_0 = input.LA(1);

            	        if ( (LA38_0==WS) ) {
            	            alt38=1;
            	        }


            	        switch (alt38) {
            	    	case 1 :
            	    	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:152:35: WS
            	    	    {
            	    	    WS108=(Token)match(input,WS,FOLLOW_WS_in_in_brackets904); 
            	    	    WS108_tree = 
            	    	    (Object)adaptor.create(WS108)
            	    	    ;
            	    	    adaptor.addChild(root_0, WS108_tree);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop38;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_param_wrapper_in_in_brackets907);
            	    param_wrapper109=param_wrapper();

            	    state._fsp--;

            	    adaptor.addChild(root_0, param_wrapper109.getTree());

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:152:55: ( WS )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==WS) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:152:55: WS
            	    {
            	    WS110=(Token)match(input,WS,FOLLOW_WS_in_in_brackets911); 
            	    WS110_tree = 
            	    (Object)adaptor.create(WS110)
            	    ;
            	    adaptor.addChild(root_0, WS110_tree);


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            char_literal111=(Token)match(input,46,FOLLOW_46_in_in_brackets914); 
            char_literal111_tree = 
            (Object)adaptor.create(char_literal111)
            ;
            adaptor.addChild(root_0, char_literal111_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "in_brackets"


    public static class param_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "param_wrapper"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:155:1: param_wrapper : ( param_common | many_points );
    public final PreprocessorParser.param_wrapper_return param_wrapper() throws RecognitionException {
        PreprocessorParser.param_wrapper_return retval = new PreprocessorParser.param_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.param_common_return param_common112 =null;

        PreprocessorParser.many_points_return many_points113 =null;



        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:156:2: ( param_common | many_points )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==ID) ) {
                alt41=1;
            }
            else if ( (LA41_0==52) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;

            }
            switch (alt41) {
                case 1 :
                    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:156:4: param_common
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_param_common_in_param_wrapper927);
                    param_common112=param_common();

                    state._fsp--;

                    adaptor.addChild(root_0, param_common112.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:157:4: many_points
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_many_points_in_param_wrapper932);
                    many_points113=many_points();

                    state._fsp--;

                    adaptor.addChild(root_0, many_points113.getTree());

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
    // $ANTLR end "param_wrapper"


    public static class many_points_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "many_points"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:160:1: many_points : '...' ;
    public final PreprocessorParser.many_points_return many_points() throws RecognitionException {
        PreprocessorParser.many_points_return retval = new PreprocessorParser.many_points_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal114=null;

        Object string_literal114_tree=null;

        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:161:2: ( '...' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:161:4: '...'
            {
            root_0 = (Object)adaptor.nil();


            string_literal114=(Token)match(input,52,FOLLOW_52_in_many_points945); 
            string_literal114_tree = 
            (Object)adaptor.create(string_literal114)
            ;
            adaptor.addChild(root_0, string_literal114_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "many_points"


    public static class param_common_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "param_common"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:164:1: param_common : ID -> ^( T_PARAM ID ) ;
    public final PreprocessorParser.param_common_return param_common() throws RecognitionException {
        PreprocessorParser.param_common_return retval = new PreprocessorParser.param_common_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID115=null;

        Object ID115_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:165:2: ( ID -> ^( T_PARAM ID ) )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:165:4: ID
            {
            ID115=(Token)match(input,ID,FOLLOW_ID_in_param_common958);  
            stream_ID.add(ID115);


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
            // 165:7: -> ^( T_PARAM ID )
            {
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:165:10: ^( T_PARAM ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_PARAM, "T_PARAM")
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
    // $ANTLR end "param_common"


    public static class replace_wrapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "replace_wrapper"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:168:1: replace_wrapper : replace -> ^( T_REPLACE replace ) ;
    public final PreprocessorParser.replace_wrapper_return replace_wrapper() throws RecognitionException {
        PreprocessorParser.replace_wrapper_return retval = new PreprocessorParser.replace_wrapper_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.replace_return replace116 =null;


        RewriteRuleSubtreeStream stream_replace=new RewriteRuleSubtreeStream(adaptor,"rule replace");
        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:169:2: ( replace -> ^( T_REPLACE replace ) )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:169:4: replace
            {
            pushFollow(FOLLOW_replace_in_replace_wrapper979);
            replace116=replace();

            state._fsp--;

            stream_replace.add(replace116.getTree());

            // AST REWRITE
            // elements: replace
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 169:12: -> ^( T_REPLACE replace )
            {
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:169:15: ^( T_REPLACE replace )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_REPLACE, "T_REPLACE")
                , root_1);

                adaptor.addChild(root_1, stream_replace.nextTree());

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
    // $ANTLR end "replace_wrapper"


    public static class replace_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "replace"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:171:1: replace : replace_internal ( backslash ( '\\r' | '\\n' )+ replace_internal )* ;
    public final PreprocessorParser.replace_return replace() throws RecognitionException {
        PreprocessorParser.replace_return retval = new PreprocessorParser.replace_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set119=null;
        PreprocessorParser.replace_internal_return replace_internal117 =null;

        PreprocessorParser.backslash_return backslash118 =null;

        PreprocessorParser.replace_internal_return replace_internal120 =null;


        Object set119_tree=null;

        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:171:9: ( replace_internal ( backslash ( '\\r' | '\\n' )+ replace_internal )* )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:171:11: replace_internal ( backslash ( '\\r' | '\\n' )+ replace_internal )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_replace_internal_in_replace997);
            replace_internal117=replace_internal();

            state._fsp--;

            adaptor.addChild(root_0, replace_internal117.getTree());

            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:171:28: ( backslash ( '\\r' | '\\n' )+ replace_internal )*
            loop43:
            do {
                int alt43=2;
                alt43 = dfa43.predict(input);
                switch (alt43) {
            	case 1 :
            	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:171:29: backslash ( '\\r' | '\\n' )+ replace_internal
            	    {
            	    pushFollow(FOLLOW_backslash_in_replace1000);
            	    backslash118=backslash();

            	    state._fsp--;

            	    adaptor.addChild(root_0, backslash118.getTree());

            	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:171:39: ( '\\r' | '\\n' )+
            	    int cnt42=0;
            	    loop42:
            	    do {
            	        int alt42=2;
            	        int LA42_0 = input.LA(1);

            	        if ( ((LA42_0 >= 62 && LA42_0 <= 63)) ) {
            	            alt42=1;
            	        }


            	        switch (alt42) {
            	    	case 1 :
            	    	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:
            	    	    {
            	    	    set119=(Token)input.LT(1);

            	    	    if ( (input.LA(1) >= 62 && input.LA(1) <= 63) ) {
            	    	        input.consume();
            	    	        adaptor.addChild(root_0, 
            	    	        (Object)adaptor.create(set119)
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
            	    	    if ( cnt42 >= 1 ) break loop42;
            	                EarlyExitException eee =
            	                    new EarlyExitException(42, input);
            	                throw eee;
            	        }
            	        cnt42++;
            	    } while (true);


            	    pushFollow(FOLLOW_replace_internal_in_replace1011);
            	    replace_internal120=replace_internal();

            	    state._fsp--;

            	    adaptor.addChild(root_0, replace_internal120.getTree());

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
    // $ANTLR end "replace"


    public static class backslash_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "backslash"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:174:1: backslash : '\\\\' -> ^( T_BACKSLASH ) ;
    public final PreprocessorParser.backslash_return backslash() throws RecognitionException {
        PreprocessorParser.backslash_return retval = new PreprocessorParser.backslash_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal121=null;

        Object char_literal121_tree=null;
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");

        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:175:2: ( '\\\\' -> ^( T_BACKSLASH ) )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:175:4: '\\\\'
            {
            char_literal121=(Token)match(input,61,FOLLOW_61_in_backslash1025);  
            stream_61.add(char_literal121);


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
            // 175:9: -> ^( T_BACKSLASH )
            {
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:175:12: ^( T_BACKSLASH )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_BACKSLASH, "T_BACKSLASH")
                , root_1);

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
    // $ANTLR end "backslash"


    public static class replace_internal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "replace_internal"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:178:1: replace_internal : ( '\\'#\\'' | (~ ( '\\\\' | '\\r' | '\\n' | SINGLE_COMMENT ) )+ ) ;
    public final PreprocessorParser.replace_internal_return replace_internal() throws RecognitionException {
        PreprocessorParser.replace_internal_return retval = new PreprocessorParser.replace_internal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal122=null;
        Token set123=null;

        Object string_literal122_tree=null;
        Object set123_tree=null;

        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:179:2: ( ( '\\'#\\'' | (~ ( '\\\\' | '\\r' | '\\n' | SINGLE_COMMENT ) )+ ) )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:179:4: ( '\\'#\\'' | (~ ( '\\\\' | '\\r' | '\\n' | SINGLE_COMMENT ) )+ )
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:179:4: ( '\\'#\\'' | (~ ( '\\\\' | '\\r' | '\\n' | SINGLE_COMMENT ) )+ )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==60) ) {
                alt45=1;
            }
            else if ( ((LA45_0 >= COMMENT && LA45_0 <= NUMBER)||(LA45_0 >= SPECIAL_CHARS && LA45_0 <= 59)||(LA45_0 >= 64 && LA45_0 <= 65)) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;

            }
            switch (alt45) {
                case 1 :
                    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:179:5: '\\'#\\''
                    {
                    string_literal122=(Token)match(input,60,FOLLOW_60_in_replace_internal1045); 
                    string_literal122_tree = 
                    (Object)adaptor.create(string_literal122)
                    ;
                    adaptor.addChild(root_0, string_literal122_tree);


                    }
                    break;
                case 2 :
                    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:179:15: (~ ( '\\\\' | '\\r' | '\\n' | SINGLE_COMMENT ) )+
                    {
                    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:179:15: (~ ( '\\\\' | '\\r' | '\\n' | SINGLE_COMMENT ) )+
                    int cnt44=0;
                    loop44:
                    do {
                        int alt44=2;
                        alt44 = dfa44.predict(input);
                        switch (alt44) {
                    	case 1 :
                    	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:
                    	    {
                    	    set123=(Token)input.LT(1);

                    	    if ( (input.LA(1) >= COMMENT && input.LA(1) <= NUMBER)||(input.LA(1) >= SPECIAL_CHARS && input.LA(1) <= 60)||(input.LA(1) >= 64 && input.LA(1) <= 65) ) {
                    	        input.consume();
                    	        adaptor.addChild(root_0, 
                    	        (Object)adaptor.create(set123)
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
                    	    if ( cnt44 >= 1 ) break loop44;
                                EarlyExitException eee =
                                    new EarlyExitException(44, input);
                                throw eee;
                        }
                        cnt44++;
                    } while (true);


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
    // $ANTLR end "replace_internal"


    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:181:1: expression : ex_and_wrp ( ( WS )+ '&&' ( WS )+ ex_and_wrp )* ;
    public final PreprocessorParser.expression_return expression() throws RecognitionException {
        PreprocessorParser.expression_return retval = new PreprocessorParser.expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WS125=null;
        Token string_literal126=null;
        Token WS127=null;
        PreprocessorParser.ex_and_wrp_return ex_and_wrp124 =null;

        PreprocessorParser.ex_and_wrp_return ex_and_wrp128 =null;


        Object WS125_tree=null;
        Object string_literal126_tree=null;
        Object WS127_tree=null;

        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:182:2: ( ex_and_wrp ( ( WS )+ '&&' ( WS )+ ex_and_wrp )* )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:182:4: ex_and_wrp ( ( WS )+ '&&' ( WS )+ ex_and_wrp )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_ex_and_wrp_in_expression1077);
            ex_and_wrp124=ex_and_wrp();

            state._fsp--;

            adaptor.addChild(root_0, ex_and_wrp124.getTree());

            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:182:15: ( ( WS )+ '&&' ( WS )+ ex_and_wrp )*
            loop48:
            do {
                int alt48=2;
                alt48 = dfa48.predict(input);
                switch (alt48) {
            	case 1 :
            	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:182:16: ( WS )+ '&&' ( WS )+ ex_and_wrp
            	    {
            	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:182:16: ( WS )+
            	    int cnt46=0;
            	    loop46:
            	    do {
            	        int alt46=2;
            	        int LA46_0 = input.LA(1);

            	        if ( (LA46_0==WS) ) {
            	            alt46=1;
            	        }


            	        switch (alt46) {
            	    	case 1 :
            	    	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:182:16: WS
            	    	    {
            	    	    WS125=(Token)match(input,WS,FOLLOW_WS_in_expression1080); 
            	    	    WS125_tree = 
            	    	    (Object)adaptor.create(WS125)
            	    	    ;
            	    	    adaptor.addChild(root_0, WS125_tree);


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt46 >= 1 ) break loop46;
            	                EarlyExitException eee =
            	                    new EarlyExitException(46, input);
            	                throw eee;
            	        }
            	        cnt46++;
            	    } while (true);


            	    string_literal126=(Token)match(input,44,FOLLOW_44_in_expression1083); 
            	    string_literal126_tree = 
            	    (Object)adaptor.create(string_literal126)
            	    ;
            	    adaptor.addChild(root_0, string_literal126_tree);


            	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:182:25: ( WS )+
            	    int cnt47=0;
            	    loop47:
            	    do {
            	        int alt47=2;
            	        int LA47_0 = input.LA(1);

            	        if ( (LA47_0==WS) ) {
            	            alt47=1;
            	        }


            	        switch (alt47) {
            	    	case 1 :
            	    	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:182:25: WS
            	    	    {
            	    	    WS127=(Token)match(input,WS,FOLLOW_WS_in_expression1085); 
            	    	    WS127_tree = 
            	    	    (Object)adaptor.create(WS127)
            	    	    ;
            	    	    adaptor.addChild(root_0, WS127_tree);


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


            	    pushFollow(FOLLOW_ex_and_wrp_in_expression1088);
            	    ex_and_wrp128=ex_and_wrp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, ex_and_wrp128.getTree());

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
    // $ANTLR end "expression"


    public static class ex_and_wrp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ex_and_wrp"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:184:1: ex_and_wrp : ex_and -> ^( T_EX_AND ex_and ) ;
    public final PreprocessorParser.ex_and_wrp_return ex_and_wrp() throws RecognitionException {
        PreprocessorParser.ex_and_wrp_return retval = new PreprocessorParser.ex_and_wrp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.ex_and_return ex_and129 =null;


        RewriteRuleSubtreeStream stream_ex_and=new RewriteRuleSubtreeStream(adaptor,"rule ex_and");
        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:185:2: ( ex_and -> ^( T_EX_AND ex_and ) )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:185:4: ex_and
            {
            pushFollow(FOLLOW_ex_and_in_ex_and_wrp1100);
            ex_and129=ex_and();

            state._fsp--;

            stream_ex_and.add(ex_and129.getTree());

            // AST REWRITE
            // elements: ex_and
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 185:11: -> ^( T_EX_AND ex_and )
            {
                // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:185:14: ^( T_EX_AND ex_and )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(T_EX_AND, "T_EX_AND")
                , root_1);

                adaptor.addChild(root_1, stream_ex_and.nextTree());

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
    // $ANTLR end "ex_and_wrp"


    public static class ex_and_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ex_and"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:187:1: ex_and : ( '!' ( WS )* )? ex_and_not ;
    public final PreprocessorParser.ex_and_return ex_and() throws RecognitionException {
        PreprocessorParser.ex_and_return retval = new PreprocessorParser.ex_and_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal130=null;
        Token WS131=null;
        PreprocessorParser.ex_and_not_return ex_and_not132 =null;


        Object char_literal130_tree=null;
        Object WS131_tree=null;

        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:187:8: ( ( '!' ( WS )* )? ex_and_not )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:187:10: ( '!' ( WS )* )? ex_and_not
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:187:10: ( '!' ( WS )* )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==43) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:187:11: '!' ( WS )*
                    {
                    char_literal130=(Token)match(input,43,FOLLOW_43_in_ex_and1119); 
                    char_literal130_tree = 
                    (Object)adaptor.create(char_literal130)
                    ;
                    adaptor.addChild(root_0, char_literal130_tree);


                    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:187:15: ( WS )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==WS) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:187:15: WS
                    	    {
                    	    WS131=(Token)match(input,WS,FOLLOW_WS_in_ex_and1121); 
                    	    WS131_tree = 
                    	    (Object)adaptor.create(WS131)
                    	    ;
                    	    adaptor.addChild(root_0, WS131_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);


                    }
                    break;

            }


            pushFollow(FOLLOW_ex_and_not_in_ex_and1126);
            ex_and_not132=ex_and_not();

            state._fsp--;

            adaptor.addChild(root_0, ex_and_not132.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ex_and"


    public static class ex_and_not_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ex_and_not"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:189:1: ex_and_not : ( math_expr_wrp | ( 'defined' ( WS )* )? '(' ( WS )* expression_wrapper ( ( WS )+ '||' ( WS )+ expression_wrapper )* ')' );
    public final PreprocessorParser.ex_and_not_return ex_and_not() throws RecognitionException {
        PreprocessorParser.ex_and_not_return retval = new PreprocessorParser.ex_and_not_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal134=null;
        Token WS135=null;
        Token char_literal136=null;
        Token WS137=null;
        Token WS139=null;
        Token string_literal140=null;
        Token WS141=null;
        Token char_literal143=null;
        PreprocessorParser.math_expr_wrp_return math_expr_wrp133 =null;

        PreprocessorParser.expression_wrapper_return expression_wrapper138 =null;

        PreprocessorParser.expression_wrapper_return expression_wrapper142 =null;


        Object string_literal134_tree=null;
        Object WS135_tree=null;
        Object char_literal136_tree=null;
        Object WS137_tree=null;
        Object WS139_tree=null;
        Object string_literal140_tree=null;
        Object WS141_tree=null;
        Object char_literal143_tree=null;

        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:190:2: ( math_expr_wrp | ( 'defined' ( WS )* )? '(' ( WS )* expression_wrapper ( ( WS )+ '||' ( WS )+ expression_wrapper )* ')' )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==ID||LA57_0==NUMBER||LA57_0==48||LA57_0==50) ) {
                alt57=1;
            }
            else if ( (LA57_0==45||LA57_0==64) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;

            }
            switch (alt57) {
                case 1 :
                    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:190:4: math_expr_wrp
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_math_expr_wrp_in_ex_and_not1135);
                    math_expr_wrp133=math_expr_wrp();

                    state._fsp--;

                    adaptor.addChild(root_0, math_expr_wrp133.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:191:4: ( 'defined' ( WS )* )? '(' ( WS )* expression_wrapper ( ( WS )+ '||' ( WS )+ expression_wrapper )* ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:191:4: ( 'defined' ( WS )* )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==64) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:191:5: 'defined' ( WS )*
                            {
                            string_literal134=(Token)match(input,64,FOLLOW_64_in_ex_and_not1141); 
                            string_literal134_tree = 
                            (Object)adaptor.create(string_literal134)
                            ;
                            adaptor.addChild(root_0, string_literal134_tree);


                            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:191:15: ( WS )*
                            loop51:
                            do {
                                int alt51=2;
                                int LA51_0 = input.LA(1);

                                if ( (LA51_0==WS) ) {
                                    alt51=1;
                                }


                                switch (alt51) {
                            	case 1 :
                            	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:191:15: WS
                            	    {
                            	    WS135=(Token)match(input,WS,FOLLOW_WS_in_ex_and_not1143); 
                            	    WS135_tree = 
                            	    (Object)adaptor.create(WS135)
                            	    ;
                            	    adaptor.addChild(root_0, WS135_tree);


                            	    }
                            	    break;

                            	default :
                            	    break loop51;
                                }
                            } while (true);


                            }
                            break;

                    }


                    char_literal136=(Token)match(input,45,FOLLOW_45_in_ex_and_not1148); 
                    char_literal136_tree = 
                    (Object)adaptor.create(char_literal136)
                    ;
                    adaptor.addChild(root_0, char_literal136_tree);


                    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:191:25: ( WS )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==WS) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:191:25: WS
                    	    {
                    	    WS137=(Token)match(input,WS,FOLLOW_WS_in_ex_and_not1150); 
                    	    WS137_tree = 
                    	    (Object)adaptor.create(WS137)
                    	    ;
                    	    adaptor.addChild(root_0, WS137_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);


                    pushFollow(FOLLOW_expression_wrapper_in_ex_and_not1153);
                    expression_wrapper138=expression_wrapper();

                    state._fsp--;

                    adaptor.addChild(root_0, expression_wrapper138.getTree());

                    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:191:48: ( ( WS )+ '||' ( WS )+ expression_wrapper )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==WS) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:191:49: ( WS )+ '||' ( WS )+ expression_wrapper
                    	    {
                    	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:191:49: ( WS )+
                    	    int cnt54=0;
                    	    loop54:
                    	    do {
                    	        int alt54=2;
                    	        int LA54_0 = input.LA(1);

                    	        if ( (LA54_0==WS) ) {
                    	            alt54=1;
                    	        }


                    	        switch (alt54) {
                    	    	case 1 :
                    	    	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:191:49: WS
                    	    	    {
                    	    	    WS139=(Token)match(input,WS,FOLLOW_WS_in_ex_and_not1156); 
                    	    	    WS139_tree = 
                    	    	    (Object)adaptor.create(WS139)
                    	    	    ;
                    	    	    adaptor.addChild(root_0, WS139_tree);


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt54 >= 1 ) break loop54;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(54, input);
                    	                throw eee;
                    	        }
                    	        cnt54++;
                    	    } while (true);


                    	    string_literal140=(Token)match(input,65,FOLLOW_65_in_ex_and_not1159); 
                    	    string_literal140_tree = 
                    	    (Object)adaptor.create(string_literal140)
                    	    ;
                    	    adaptor.addChild(root_0, string_literal140_tree);


                    	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:191:58: ( WS )+
                    	    int cnt55=0;
                    	    loop55:
                    	    do {
                    	        int alt55=2;
                    	        int LA55_0 = input.LA(1);

                    	        if ( (LA55_0==WS) ) {
                    	            alt55=1;
                    	        }


                    	        switch (alt55) {
                    	    	case 1 :
                    	    	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:191:58: WS
                    	    	    {
                    	    	    WS141=(Token)match(input,WS,FOLLOW_WS_in_ex_and_not1161); 
                    	    	    WS141_tree = 
                    	    	    (Object)adaptor.create(WS141)
                    	    	    ;
                    	    	    adaptor.addChild(root_0, WS141_tree);


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


                    	    pushFollow(FOLLOW_expression_wrapper_in_ex_and_not1164);
                    	    expression_wrapper142=expression_wrapper();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expression_wrapper142.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);


                    char_literal143=(Token)match(input,46,FOLLOW_46_in_ex_and_not1168); 
                    char_literal143_tree = 
                    (Object)adaptor.create(char_literal143)
                    ;
                    adaptor.addChild(root_0, char_literal143_tree);


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
    // $ANTLR end "ex_and_not"


    public static class math_expr_wrp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "math_expr_wrp"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:194:1: math_expr_wrp : math_expr ;
    public final PreprocessorParser.math_expr_wrp_return math_expr_wrp() throws RecognitionException {
        PreprocessorParser.math_expr_wrp_return retval = new PreprocessorParser.math_expr_wrp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.math_expr_return math_expr144 =null;



        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:195:2: ( math_expr )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:195:4: math_expr
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_math_expr_in_math_expr_wrp1180);
            math_expr144=math_expr();

            state._fsp--;

            adaptor.addChild(root_0, math_expr144.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "math_expr_wrp"


    public static class math_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "math_expr"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:197:1: math_expr : single_expr ( ( WS )* op ( WS )* single_expr )* ;
    public final PreprocessorParser.math_expr_return math_expr() throws RecognitionException {
        PreprocessorParser.math_expr_return retval = new PreprocessorParser.math_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WS146=null;
        Token WS148=null;
        PreprocessorParser.single_expr_return single_expr145 =null;

        PreprocessorParser.op_return op147 =null;

        PreprocessorParser.single_expr_return single_expr149 =null;


        Object WS146_tree=null;
        Object WS148_tree=null;

        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:198:2: ( single_expr ( ( WS )* op ( WS )* single_expr )* )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:198:4: single_expr ( ( WS )* op ( WS )* single_expr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_single_expr_in_math_expr1192);
            single_expr145=single_expr();

            state._fsp--;

            adaptor.addChild(root_0, single_expr145.getTree());

            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:198:16: ( ( WS )* op ( WS )* single_expr )*
            loop60:
            do {
                int alt60=2;
                alt60 = dfa60.predict(input);
                switch (alt60) {
            	case 1 :
            	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:198:17: ( WS )* op ( WS )* single_expr
            	    {
            	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:198:17: ( WS )*
            	    loop58:
            	    do {
            	        int alt58=2;
            	        int LA58_0 = input.LA(1);

            	        if ( (LA58_0==WS) ) {
            	            alt58=1;
            	        }


            	        switch (alt58) {
            	    	case 1 :
            	    	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:198:17: WS
            	    	    {
            	    	    WS146=(Token)match(input,WS,FOLLOW_WS_in_math_expr1195); 
            	    	    WS146_tree = 
            	    	    (Object)adaptor.create(WS146)
            	    	    ;
            	    	    adaptor.addChild(root_0, WS146_tree);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop58;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_op_in_math_expr1198);
            	    op147=op();

            	    state._fsp--;

            	    adaptor.addChild(root_0, op147.getTree());

            	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:198:24: ( WS )*
            	    loop59:
            	    do {
            	        int alt59=2;
            	        int LA59_0 = input.LA(1);

            	        if ( (LA59_0==WS) ) {
            	            alt59=1;
            	        }


            	        switch (alt59) {
            	    	case 1 :
            	    	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:198:24: WS
            	    	    {
            	    	    WS148=(Token)match(input,WS,FOLLOW_WS_in_math_expr1200); 
            	    	    WS148_tree = 
            	    	    (Object)adaptor.create(WS148)
            	    	    ;
            	    	    adaptor.addChild(root_0, WS148_tree);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop59;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_single_expr_in_math_expr1203);
            	    single_expr149=single_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, single_expr149.getTree());

            	    }
            	    break;

            	default :
            	    break loop60;
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
    // $ANTLR end "math_expr"


    public static class op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "op"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:201:1: op : ( '==' | '>=' | '<=' | '>' | '<' | '*' | '+' | '-' );
    public final PreprocessorParser.op_return op() throws RecognitionException {
        PreprocessorParser.op_return retval = new PreprocessorParser.op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set150=null;

        Object set150_tree=null;

        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:201:4: ( '==' | '>=' | '<=' | '>' | '<' | '*' | '+' | '-' )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:
            {
            root_0 = (Object)adaptor.nil();


            set150=(Token)input.LT(1);

            if ( (input.LA(1) >= 47 && input.LA(1) <= 48)||input.LA(1)==50||(input.LA(1) >= 54 && input.LA(1) <= 58) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set150)
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
    // $ANTLR end "op"


    public static class single_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "single_expr"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:205:1: single_expr : ( ( '+' | '-' ) ( WS )* )? single_expr2 ;
    public final PreprocessorParser.single_expr_return single_expr() throws RecognitionException {
        PreprocessorParser.single_expr_return retval = new PreprocessorParser.single_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set151=null;
        Token WS152=null;
        PreprocessorParser.single_expr2_return single_expr2153 =null;


        Object set151_tree=null;
        Object WS152_tree=null;

        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:206:2: ( ( ( '+' | '-' ) ( WS )* )? single_expr2 )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:206:4: ( ( '+' | '-' ) ( WS )* )? single_expr2
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:206:4: ( ( '+' | '-' ) ( WS )* )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==48||LA62_0==50) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:206:5: ( '+' | '-' ) ( WS )*
                    {
                    set151=(Token)input.LT(1);

                    if ( input.LA(1)==48||input.LA(1)==50 ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set151)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:206:16: ( WS )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==WS) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:206:16: WS
                    	    {
                    	    WS152=(Token)match(input,WS,FOLLOW_WS_in_single_expr1267); 
                    	    WS152_tree = 
                    	    (Object)adaptor.create(WS152)
                    	    ;
                    	    adaptor.addChild(root_0, WS152_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);


                    }
                    break;

            }


            pushFollow(FOLLOW_single_expr2_in_single_expr1272);
            single_expr2153=single_expr2();

            state._fsp--;

            adaptor.addChild(root_0, single_expr2153.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "single_expr"


    public static class single_expr2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "single_expr2"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:208:1: single_expr2 : ( name | const_expr );
    public final PreprocessorParser.single_expr2_return single_expr2() throws RecognitionException {
        PreprocessorParser.single_expr2_return retval = new PreprocessorParser.single_expr2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PreprocessorParser.name_return name154 =null;

        PreprocessorParser.const_expr_return const_expr155 =null;



        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:209:2: ( name | const_expr )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==ID) ) {
                alt63=1;
            }
            else if ( (LA63_0==NUMBER) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;

            }
            switch (alt63) {
                case 1 :
                    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:209:4: name
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_name_in_single_expr21281);
                    name154=name();

                    state._fsp--;

                    adaptor.addChild(root_0, name154.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:210:4: const_expr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_const_expr_in_single_expr21286);
                    const_expr155=const_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, const_expr155.getTree());

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
    // $ANTLR end "single_expr2"


    public static class const_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "const_expr"
    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:215:1: const_expr : NUMBER ( 'L' )? ;
    public final PreprocessorParser.const_expr_return const_expr() throws RecognitionException {
        PreprocessorParser.const_expr_return retval = new PreprocessorParser.const_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NUMBER156=null;
        Token char_literal157=null;

        Object NUMBER156_tree=null;
        Object char_literal157_tree=null;

        try {
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:215:12: ( NUMBER ( 'L' )? )
            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:215:14: NUMBER ( 'L' )?
            {
            root_0 = (Object)adaptor.nil();


            NUMBER156=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_const_expr1300); 
            NUMBER156_tree = 
            (Object)adaptor.create(NUMBER156)
            ;
            adaptor.addChild(root_0, NUMBER156_tree);


            // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:215:21: ( 'L' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==59) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // C:\\Work\\ObjCtoJavaCnv\\src\\ru\\andremoniy\\objctojavacnv\\antlr\\Preprocessor.g:215:21: 'L'
                    {
                    char_literal157=(Token)match(input,59,FOLLOW_59_in_const_expr1302); 
                    char_literal157_tree = 
                    (Object)adaptor.create(char_literal157)
                    ;
                    adaptor.addChild(root_0, char_literal157_tree);


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
    // $ANTLR end "const_expr"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA48 dfa48 = new DFA48(this);
    protected DFA60 dfa60 = new DFA60(this);
    static final String DFA3_eotS =
        "\u0080\uffff";
    static final String DFA3_eofS =
        "\3\uffff\1\10\5\uffff\2\10\15\uffff\1\10\1\uffff\1\10\13\uffff\2"+
        "\10\130\uffff";
    static final String DFA3_minS =
        "\1\5\2\uffff\1\5\1\52\4\uffff\2\5\14\uffff\1\12\1\5\1\uffff\1\5"+
        "\13\uffff\2\5\13\uffff\1\12\3\uffff\1\52\1\uffff\1\12\106\uffff";
    static final String DFA3_maxS =
        "\1\101\2\uffff\1\101\1\52\4\uffff\2\101\14\uffff\1\100\1\101\1\uffff"+
        "\1\101\13\uffff\2\101\13\uffff\1\100\3\uffff\1\55\1\uffff\1\100"+
        "\106\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\2\2\uffff\1\5\1\6\1\3\1\7\2\uffff\1\3\15\uffff\1"+
        "\3\32\uffff\1\4\5\uffff\2\3\13\uffff\3\3\13\uffff\2\3\13\uffff\4"+
        "\3\13\uffff\1\4\3\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3\uffff\1\4"+
        "\1\uffff\1\4";
    static final String DFA3_specialS =
        "\u0080\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\2\1\10\3\uffff\1\10\1\4\1\5\1\6\1\7\1\3\32\10\1\1\27\10",
            "",
            "",
            "\20\10\1\13\24\10\1\11\13\10\1\12\13\10",
            "\1\27",
            "",
            "",
            "",
            "",
            "\20\10\1\31\24\10\1\32\13\10\1\30\13\10",
            "\5\10\1\47\37\10\1\46\27\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\64\6\uffff\1\64\30\uffff\1\71\1\63\1\uffff\1\64\2\uffff"+
            "\1\64\1\uffff\1\64\15\uffff\1\67",
            "\5\10\1\73\37\10\1\72\27\10",
            "",
            "\20\10\1\110\24\10\1\111\13\10\1\107\13\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\5\10\1\125\37\10\1\126\27\10",
            "\45\10\1\144\10\10\1\142\1\10\1\143\3\10\1\145\10\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\64\6\uffff\1\64\30\uffff\1\161\2\uffff\1\64\2\uffff\1\64"+
            "\1\uffff\1\64\15\uffff\1\165",
            "",
            "",
            "",
            "\1\64\2\uffff\1\167",
            "",
            "\1\64\6\uffff\1\64\30\uffff\1\177\1\171\1\uffff\1\64\2\uffff"+
            "\1\64\1\uffff\1\64\15\uffff\1\175",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "45:1: code_fragment : ( WS | define_directive | import_declaration | if_simple_check_wrapper | if_define_block_wrapper | if_not_define_block_wrapper | smth_else );";
        }
    }
    static final String DFA32_eotS =
        "\u028e\uffff";
    static final String DFA32_eofS =
        "\1\3\3\uffff\1\15\1\uffff\3\15\1\uffff\1\15\1\133\2\uffff\1\152"+
        "\3\uffff\1\152\16\uffff\1\u0088\16\uffff\1\u0088\16\uffff\1\u0088"+
        "\16\uffff\1\u0088\6\uffff\1\u00d0\31\uffff\1\u00d0\15\uffff\1\u00d0"+
        "\17\uffff\1\u0103\12\uffff\1\u0103\2\uffff\2\u0103\1\u014e\2\u015f"+
        "\2\uffff\1\u015f\12\uffff\1\u015f\4\uffff\1\u01a6\12\uffff\1\u01a6"+
        "\4\uffff\1\u01c6\12\uffff\1\u01d8\5\uffff\1\u01d8\12\uffff\1\u01d8"+
        "\4\uffff\1\u020a\12\uffff\1\u020a\2\uffff\2\u020a\1\u0253\2\u0264"+
        "\u0198\uffff";
    static final String DFA32_minS =
        "\1\4\3\uffff\1\4\1\uffff\3\4\1\uffff\2\4\2\uffff\1\4\3\uffff\1\4"+
        "\16\uffff\1\4\16\uffff\1\4\16\uffff\1\4\16\uffff\1\4\6\uffff\1\4"+
        "\31\uffff\1\4\15\uffff\1\4\17\uffff\1\4\12\uffff\1\4\2\uffff\5\4"+
        "\2\uffff\1\4\12\uffff\1\4\4\uffff\1\4\12\uffff\1\4\4\uffff\1\4\12"+
        "\uffff\1\4\5\uffff\1\4\12\uffff\1\4\4\uffff\1\4\12\uffff\1\4\2\uffff"+
        "\5\4\u0198\uffff";
    static final String DFA32_maxS =
        "\1\101\3\uffff\1\101\1\uffff\3\101\1\uffff\2\101\2\uffff\1\101\3"+
        "\uffff\1\101\16\uffff\1\101\16\uffff\1\101\16\uffff\1\101\16\uffff"+
        "\1\101\6\uffff\1\101\31\uffff\1\101\15\uffff\1\101\17\uffff\1\101"+
        "\12\uffff\1\101\2\uffff\5\101\2\uffff\1\101\12\uffff\1\101\4\uffff"+
        "\1\101\12\uffff\1\101\4\uffff\1\101\12\uffff\1\101\5\uffff\1\101"+
        "\12\uffff\1\101\4\uffff\1\101\12\uffff\1\101\2\uffff\5\101\u0198"+
        "\uffff";
    static final String DFA32_acceptS =
        "\1\uffff\2\1\1\2\1\uffff\1\1\3\uffff\1\1\3\uffff\1\1\115\uffff\1"+
        "\1\3\uffff\1\1\12\uffff\1\1\35\uffff\1\1\107\uffff\1\1\47\uffff"+
        "\1\1\12\uffff\1\1\4\uffff\1\1\12\uffff\1\1\2\uffff\5\1\2\uffff\1"+
        "\1\12\uffff\1\1\2\uffff\4\1\2\uffff\1\1\12\uffff\1\1\2\uffff\1\1"+
        "\2\uffff\1\1\12\uffff\2\1\4\uffff\1\1\12\uffff\2\1\1\uffff\1\1\2"+
        "\uffff\1\1\1\uffff\1\1\16\uffff\1\1\12\uffff\1\1\2\uffff\5\1\2\uffff"+
        "\1\1\12\uffff\1\1\4\uffff\1\1\13\uffff\1\1\3\uffff\1\1\12\uffff"+
        "\1\1\4\uffff\1\1\13\uffff\1\1\3\uffff\1\1\12\uffff\1\1\2\uffff\1"+
        "\1\2\uffff\1\1\12\uffff\1\1\4\uffff\1\1\12\uffff\1\1\4\uffff\1\1"+
        "\12\uffff\1\1\2\uffff\2\1\2\uffff\1\1\12\uffff\1\1\2\uffff\5\1\2"+
        "\uffff\1\1\12\uffff\1\1\2\uffff\4\1\2\uffff\1\1\12\uffff\1\1\2\uffff"+
        "\1\1\2\uffff\1\1\12\uffff\2\1\4\uffff\1\1\12\uffff\2\1\1\uffff\1"+
        "\1\3\uffff\1\1\12\uffff\1\1\4\uffff\1\1\12\uffff\1\1\2\uffff\5\1"+
        "\1\uffff";
    static final String DFA32_specialS =
        "\u028e\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\15\1\4\1\11\1\16\1\13\1\15\1\11\1\6\1\7\1\10\1\12\1\5\2\11"+
            "\1\3\27\11\1\2\21\11\1\1\3\3\2\11",
            "",
            "",
            "",
            "\46\15\1\22\27\15",
            "",
            "\46\15\1\41\27\15",
            "\46\15\1\60\27\15",
            "\46\15\1\77\27\15",
            "",
            "\2\15\1\133\3\15\1\133\5\15\2\133\1\15\27\133\1\116\13\133"+
            "\1\125\6\133\3\15\2\133",
            "\1\152\15\137\1\152\52\137\1\133\2\152\2\137",
            "",
            "",
            "\46\152\1\157\27\152",
            "",
            "",
            "",
            "\1\u0088\1\152\1\u0088\3\152\1\u0088\5\152\32\u0088\1\175\22"+
            "\u0088\1\152\4\u0088",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\6\u0088\1\u009c\6\u0088\1\u009d\30\u0088\1\u008d\1\u0098\1"+
            "\u0088\1\u009f\2\u0088\1\u009b\1\u0088\1\u009b\15\u0088\1\u009e"+
            "\1\u0088",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\6\u0088\1\u00ad\37\u0088\1\u00a2\27\u0088",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\6\u0088\1\u00bd\37\u0088\1\u00b2\27\u0088",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\u0088\1\u00d0\3\u0088\1\u00d0\5\u0088\2\u00d0\1\u0088\27"+
            "\u00d0\1\u00c2\13\u00d0\1\u00cd\6\u00d0\3\u0088\2\u00d0",
            "",
            "",
            "",
            "",
            "",
            "",
            "\6\u00d0\1\u00de\37\u00d0\1\u00d3\27\u00d0",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\6\u00d0\1\u00f2\6\u00d0\1\u00f3\30\u00d0\1\u00e3\1\u00ee\1"+
            "\u00d0\1\u00f5\2\u00d0\1\u00f1\1\u00d0\1\u00f1\15\u00d0\1\u00f4"+
            "\1\u00d0",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0103\1\u00d0\1\u0103\3\u00d0\1\u0103\5\u00d0\32\u0103\1"+
            "\u00f8\22\u0103\1\u00d0\4\u0103",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\6\u0103\1\u0117\6\u0103\1\u0118\30\u0103\1\u0108\1\u0113\1"+
            "\u0103\1\u011a\2\u0103\1\u0116\1\u0103\1\u0116\15\u0103\1\u0119"+
            "\1\u0103",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\6\u0103\1\u012b\6\u0103\1\u012c\30\u0103\1\u011d\2\u0103\1"+
            "\u012e\2\u0103\1\u0128\1\u0103\1\u0128\15\u0103\1\u012d\1\u0103",
            "",
            "",
            "\6\u0103\1\u013c\6\u0103\1\u013f\30\u0103\1\u0131\27\u0103",
            "\1\u014e\1\u0142\1\u014e\3\u0142\1\u014e\5\u0142\32\u014e\1"+
            "\u0142\4\u014e\2\u014d\1\u014e\1\u014d\3\u014e\5\u014d\2\u014e"+
            "\1\u0142\4\u014e",
            "\1\u015f\1\u0153\1\u015f\3\u0153\1\u015f\5\u0153\32\u015f\1"+
            "\u0153\4\u015f\2\u0161\1\u015f\1\u0161\3\u015f\5\u0161\1\u015e"+
            "\1\u015f\1\u0153\4\u015f",
            "\46\u015f\1\u0166\2\u015f\1\u0164\24\u015f",
            "\6\u015f\1\u0184\6\u015f\1\u0185\30\u015f\1\u0175\1\u0180\1"+
            "\u015f\1\u0187\2\u015f\1\u0183\1\u015f\1\u0183\15\u015f\1\u0186"+
            "\1\u015f",
            "",
            "",
            "\6\u015f\1\u0195\37\u015f\1\u018a\27\u015f",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u01a6\15\u019a\1\u01a6\53\u019a\2\u01a6\2\u019a",
            "",
            "",
            "",
            "",
            "\6\u01a6\1\u01b5\37\u01a6\1\u01aa\27\u01a6",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u01c6\15\u01ba\1\u01c6\53\u01ba\2\u01c6\2\u01ba",
            "",
            "",
            "",
            "",
            "\2\u01c6\1\u01d8\3\u01c6\1\u01d8\5\u01c6\2\u01d8\1\u01c6\27"+
            "\u01d8\1\u01ca\13\u01d8\1\u01d5\6\u01d8\3\u01c6\2\u01d8",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\6\u01d8\1\u01e6\37\u01d8\1\u01db\27\u01d8",
            "",
            "",
            "",
            "",
            "",
            "\6\u01d8\1\u01f6\37\u01d8\1\u01eb\27\u01d8",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\u01d8\1\u020a\3\u01d8\1\u020a\5\u01d8\2\u020a\1\u01d8\27"+
            "\u020a\1\u01fb\10\u020a\1\u0206\1\u020a\1\u0209\7\u020a\3\u01d8"+
            "\2\u020a",
            "",
            "",
            "",
            "",
            "\6\u020a\1\u021c\6\u020a\1\u021d\30\u020a\1\u020d\1\u0218\1"+
            "\u020a\1\u021f\2\u020a\1\u021b\1\u020a\1\u021b\15\u020a\1\u021e"+
            "\1\u020a",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\6\u020a\1\u0230\6\u020a\1\u0231\30\u020a\1\u0222\2\u020a\1"+
            "\u0233\2\u020a\1\u022d\1\u020a\1\u022d\15\u020a\1\u0232\1\u020a",
            "",
            "",
            "\6\u020a\1\u0241\6\u020a\1\u0244\30\u020a\1\u0236\27\u020a",
            "\1\u0253\1\u0247\1\u0253\3\u0247\1\u0253\5\u0247\32\u0253\1"+
            "\u0247\4\u0253\2\u0252\1\u0253\1\u0252\3\u0253\5\u0252\2\u0253"+
            "\1\u0247\4\u0253",
            "\1\u0264\1\u0258\1\u0264\3\u0258\1\u0264\5\u0258\32\u0264\1"+
            "\u0258\4\u0264\2\u0266\1\u0264\1\u0266\3\u0264\5\u0266\1\u0263"+
            "\1\u0264\1\u0258\4\u0264",
            "\46\u0264\1\u026a\2\u0264\1\u0275\24\u0264",
            "\6\u0264\1\u0289\6\u0264\1\u028a\30\u0264\1\u027a\1\u0285\1"+
            "\u0264\1\u028c\2\u0264\1\u0288\1\u0264\1\u0288\15\u0264\1\u028b"+
            "\1\u0264",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "136:39: ( replace_wrapper )?";
        }
    }
    static final String DFA35_eotS =
        "\u00cd\uffff";
    static final String DFA35_eofS =
        "\2\2\20\uffff\3\2\16\uffff\3\2\16\uffff\2\2\17\uffff\2\2\u0086\uffff";
    static final String DFA35_minS =
        "\2\4\20\uffff\3\4\16\uffff\3\4\16\uffff\2\4\17\uffff\2\4\u0086\uffff";
    static final String DFA35_maxS =
        "\2\101\20\uffff\3\101\16\uffff\3\101\16\uffff\2\101\17\uffff\2\101"+
        "\u0086\uffff";
    static final String DFA35_acceptS =
        "\2\uffff\1\2\63\uffff\1\1\20\uffff\1\1\16\uffff\3\1\16\uffff\3\1"+
        "\16\uffff\3\1\16\uffff\3\1\16\uffff\3\1\16\uffff\3\1\16\uffff\3"+
        "\1\16\uffff";
    static final String DFA35_specialS =
        "\u00cd\uffff}>";
    static final String[] DFA35_transitionS = {
            "\51\2\1\1\24\2",
            "\6\2\1\23\37\2\1\22\11\2\1\24\15\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\6\2\1\43\37\2\1\45\11\2\1\44\15\2",
            "\46\2\1\64\3\2\1\66\2\2\1\65\20\2",
            "\46\2\1\105\3\2\1\107\2\2\1\106\20\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\46\2\1\126\3\2\1\130\2\2\1\127\20\2",
            "\46\2\1\147\3\2\1\151\2\2\1\150\20\2",
            "\6\2\1\170\37\2\1\172\11\2\1\171\15\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\46\2\1\u008a\3\2\1\u008b\2\2\1\u0089\20\2",
            "\6\2\1\u009b\37\2\1\u009a\11\2\1\u009c\15\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\46\2\1\u00ac\3\2\1\u00ad\2\2\1\u00ab\20\2",
            "\6\2\1\u00bd\37\2\1\u00bc\11\2\1\u00be\15\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "143:17: ( in_brackets_wrapper )?";
        }
    }
    static final String DFA43_eotS =
        "\u00a7\uffff";
    static final String DFA43_eofS =
        "\1\1\10\uffff\1\1\14\uffff\1\1\6\uffff\1\47\1\uffff\3\47\1\151\1"+
        "\uffff\1\170\1\uffff\1\172\1\uffff\1\1\176\uffff";
    static final String DFA43_minS =
        "\1\5\10\uffff\1\5\14\uffff\1\4\6\uffff\1\4\1\uffff\4\4\1\uffff\1"+
        "\4\1\uffff\1\4\1\uffff\1\4\176\uffff";
    static final String DFA43_maxS =
        "\1\101\10\uffff\1\101\14\uffff\1\101\6\uffff\1\101\1\uffff\4\101"+
        "\1\uffff\1\101\1\uffff\1\101\1\uffff\1\101\176\uffff";
    static final String DFA43_acceptS =
        "\1\uffff\1\2\32\uffff\1\1\1\uffff\1\1\4\uffff\1\1\1\uffff\1\1\1"+
        "\uffff\1\1\3\uffff\1\1\16\uffff\1\1\16\uffff\1\1\16\uffff\1\1\16"+
        "\uffff\3\1\16\uffff\1\1\1\uffff\1\1\15\uffff\1\1\17\uffff\15\1\2"+
        "\uffff";
    static final String DFA43_specialS =
        "\u00a7\uffff}>";
    static final String[] DFA43_transitionS = {
            "\70\1\1\11\4\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\71\1\2\26\2\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\47\1\35\1\47\1\46\1\44\1\45\1\47\1\37\1\40\1\41\1\42\1\36"+
            "\2\47\1\1\27\47\1\34\21\47\1\43\1\1\2\50\2\47",
            "",
            "",
            "",
            "",
            "",
            "",
            "\46\47\1\53\27\47",
            "",
            "\46\47\1\72\27\47",
            "\46\47\1\111\27\47",
            "\46\47\1\130\27\47",
            "\46\151\1\147\13\151\1\150\13\151",
            "",
            "\46\172\1\170\27\172",
            "",
            "\46\172\1\u0088\27\172",
            "",
            "\1\u00a3\1\u0099\1\u00a3\1\u00a2\1\u00a0\1\u00a1\1\u00a3\1"+
            "\u009b\1\u009c\1\u009d\1\u009e\1\u009a\2\u00a3\1\1\27\u00a3"+
            "\1\u0098\21\u00a3\1\u009f\1\1\2\u00a4\2\u00a3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "()* loopback of 171:28: ( backslash ( '\\r' | '\\n' )+ replace_internal )*";
        }
    }
    static final String DFA44_eotS =
        "\u028e\uffff";
    static final String DFA44_eofS =
        "\1\1\3\uffff\1\14\1\uffff\3\14\1\116\1\uffff\1\135\1\uffff\1\140"+
        "\2\uffff\1\174\16\uffff\1\174\16\uffff\1\174\16\uffff\1\174\16\uffff"+
        "\2\u00c2\37\uffff\1\u00c2\17\uffff\1\u00f7\16\uffff\2\u00f7\1\u012e"+
        "\4\u0140\16\uffff\1\u0189\1\u018b\16\uffff\1\u01a9\1\u01ab\16\uffff"+
        "\1\u01ab\1\uffff\1\u01da\16\uffff\1\u01da\1\u01fd\16\uffff\2\u01fd"+
        "\1\u0233\4\u0245\u01a5\uffff";
    static final String DFA44_minS =
        "\1\4\3\uffff\1\4\1\uffff\4\4\1\uffff\1\4\1\uffff\1\4\2\uffff\1\4"+
        "\16\uffff\1\4\16\uffff\1\4\16\uffff\1\4\16\uffff\2\4\37\uffff\1"+
        "\4\17\uffff\1\4\16\uffff\7\4\16\uffff\2\4\16\uffff\2\4\16\uffff"+
        "\1\4\1\uffff\1\4\16\uffff\2\4\16\uffff\7\4\u01a5\uffff";
    static final String DFA44_maxS =
        "\1\101\3\uffff\1\101\1\uffff\4\101\1\uffff\1\101\1\uffff\1\101\2"+
        "\uffff\1\101\16\uffff\1\101\16\uffff\1\101\16\uffff\1\101\16\uffff"+
        "\2\101\37\uffff\1\101\17\uffff\1\101\16\uffff\7\101\16\uffff\2\101"+
        "\16\uffff\2\101\16\uffff\1\101\1\uffff\1\101\16\uffff\2\101\16\uffff"+
        "\7\101\u01a5\uffff";
    static final String DFA44_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\1\uffff\1\1\4\uffff\1\1\1\uffff\1\1\101"+
        "\uffff\1\1\16\uffff\1\1\2\uffff\1\1\33\uffff\1\1\105\uffff\1\1\64"+
        "\uffff\2\1\16\uffff\6\1\16\uffff\3\1\16\uffff\3\1\16\uffff\4\1\16"+
        "\uffff\2\1\16\uffff\7\1\16\uffff\7\1\16\uffff\1\1\1\uffff\1\1\15"+
        "\uffff\2\1\16\uffff\1\1\1\uffff\1\1\15\uffff\2\1\16\uffff\2\1\16"+
        "\uffff\3\1\16\uffff\2\1\16\uffff\4\1\16\uffff\6\1\16\uffff\3\1\16"+
        "\uffff\3\1\16\uffff\4\1\16\uffff\2\1\16\uffff\7\1\16\uffff\7\1\16"+
        "\uffff";
    static final String DFA44_specialS =
        "\u028e\uffff}>";
    static final String[] DFA44_transitionS = {
            "\1\14\1\4\1\12\1\15\1\13\1\14\1\12\1\6\1\7\1\10\1\11\1\5\2\12"+
            "\1\1\27\12\1\3\22\12\3\1\2\12",
            "",
            "",
            "",
            "\46\14\1\20\27\14",
            "",
            "\46\14\1\37\27\14",
            "\46\14\1\56\27\14",
            "\46\14\1\75\27\14",
            "\46\116\1\114\13\116\1\115\13\116",
            "",
            "\46\140\1\135\22\140\1\135\4\140",
            "",
            "\46\140\1\155\27\140",
            "",
            "",
            "\46\174\1\175\27\174",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\6\174\1\u008e\6\174\1\u008f\30\174\1\u0092\1\u008c\1\174\1"+
            "\u0091\2\174\1\u008d\1\174\1\u008d\15\174\1\u0090\1\174",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\6\174\1\u00a1\37\174\1\u00a2\27\174",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\6\174\1\u00b1\37\174\1\u00b2\27\174",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\46\u00c2\1\u00c3\13\u00c2\1\u00c1\13\u00c2",
            "\6\u00c2\1\u00d3\37\u00c2\1\u00d2\27\u00c2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\6\u00c2\1\u00e4\6\u00c2\1\u00e5\30\u00c2\1\u00e8\1\u00e2\1"+
            "\u00c2\1\u00e7\2\u00c2\1\u00e3\1\u00c2\1\u00e3\15\u00c2\1\u00e6"+
            "\1\u00c2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\46\u00f7\1\u00f8\27\u00f7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\6\u00f7\1\u0109\6\u00f7\1\u010a\30\u00f7\1\u0107\2\u00f7\1"+
            "\u010c\2\u00f7\1\u0108\1\u00f7\1\u0108\15\u00f7\1\u010b\1\u00f7",
            "\6\u00f7\1\u011c\6\u00f7\1\u011d\30\u00f7\1\u011b\27\u00f7",
            "\46\u012e\1\u012c\4\u012e\2\u012d\1\u012e\1\u012d\3\u012e\5"+
            "\u012d\7\u012e",
            "\46\u0140\1\u013e\4\u0140\2\u013f\1\u0140\1\u013f\3\u0140\5"+
            "\u013f\1\u013d\6\u0140",
            "\46\u0140\1\u0150\2\u0140\1\u014f\24\u0140",
            "\6\u0140\1\u0162\6\u0140\1\u0163\30\u0140\1\u015f\1\u0160\1"+
            "\u0140\1\u0165\2\u0140\1\u0161\1\u0140\1\u0161\15\u0140\1\u0164"+
            "\1\u0140",
            "\6\u0140\1\u0176\6\u0140\1\u0177\30\u0140\1\u017a\1\u0174\1"+
            "\u0140\1\u0179\2\u0140\1\u0175\1\u0140\1\u0175\15\u0140\1\u0178"+
            "\1\u0140",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\46\u018b\1\u0189\27\u018b",
            "\6\u018b\1\u0199\37\u018b\1\u019a\27\u018b",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\46\u01ab\1\u01a9\27\u01ab",
            "\6\u01ab\1\u01b9\37\u01ab\1\u01ba\27\u01ab",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\6\u01ab\1\u01ca\37\u01ab\1\u01c9\27\u01ab",
            "",
            "\46\u01da\1\u01db\13\u01da\1\u01d9\13\u01da",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\6\u01da\1\u01ea\37\u01da\1\u01eb\27\u01da",
            "\46\u01fd\1\u01fc\10\u01fd\1\u01fa\1\u01fd\1\u01fb\14\u01fd",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\6\u01fd\1\u020e\6\u01fd\1\u020f\30\u01fd\1\u020c\2\u01fd\1"+
            "\u0211\2\u01fd\1\u020d\1\u01fd\1\u020d\15\u01fd\1\u0210\1\u01fd",
            "\6\u01fd\1\u0221\6\u01fd\1\u0222\30\u01fd\1\u0220\27\u01fd",
            "\46\u0233\1\u0231\4\u0233\2\u0232\1\u0233\1\u0232\3\u0233\5"+
            "\u0232\7\u0233",
            "\46\u0245\1\u0243\4\u0245\2\u0244\1\u0245\1\u0244\3\u0245\5"+
            "\u0244\1\u0242\6\u0245",
            "\46\u0245\1\u0254\2\u0245\1\u0255\24\u0245",
            "\6\u0245\1\u0267\6\u0245\1\u0268\30\u0245\1\u0264\1\u0265\1"+
            "\u0245\1\u026a\2\u0245\1\u0266\1\u0245\1\u0266\15\u0245\1\u0269"+
            "\1\u0245",
            "\6\u0245\1\u027b\6\u0245\1\u027c\30\u0245\1\u027f\1\u0279\1"+
            "\u0245\1\u027e\2\u0245\1\u027a\1\u0245\1\u027a\15\u0245\1\u027d"+
            "\1\u0245",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "()+ loopback of 179:15: (~ ( '\\\\' | '\\r' | '\\n' | SINGLE_COMMENT ) )+";
        }
    }
    static final String DFA48_eotS =
        "\122\uffff";
    static final String DFA48_eofS =
        "\122\uffff";
    static final String DFA48_minS =
        "\1\52\1\5\2\uffff\1\5\10\uffff\1\5\4\uffff\1\5\10\uffff\1\5\4\uffff"+
        "\1\5\61\uffff";
    static final String DFA48_maxS =
        "\1\77\1\101\2\uffff\1\101\10\uffff\1\101\4\uffff\1\101\10\uffff"+
        "\1\101\4\uffff\1\101\61\uffff";
    static final String DFA48_acceptS =
        "\2\uffff\1\2\50\uffff\1\1\10\uffff\1\1\4\uffff\1\1\12\uffff\1\1"+
        "\6\uffff\6\1\1\uffff";
    static final String DFA48_specialS =
        "\122\uffff}>";
    static final String[] DFA48_transitionS = {
            "\1\1\3\uffff\1\2\17\uffff\2\2",
            "\2\2\3\uffff\40\2\1\4\1\2\1\15\25\2",
            "",
            "",
            "\45\2\1\22\1\2\1\33\25\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\45\2\1\40\27\2",
            "",
            "",
            "",
            "",
            "\45\2\1\53\1\2\1\64\25\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\45\2\1\71\27\2",
            "",
            "",
            "",
            "",
            "\5\2\1\115\6\2\1\116\30\2\1\104\1\113\1\2\1\120\2\2\1\114\1"+
            "\2\1\114\15\2\1\117\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 182:15: ( ( WS )+ '&&' ( WS )+ ex_and_wrp )*";
        }
    }
    static final String DFA60_eotS =
        "\u0083\uffff";
    static final String DFA60_eofS =
        "\u0083\uffff";
    static final String DFA60_minS =
        "\1\52\1\5\4\uffff\1\5\10\uffff\1\5\2\uffff\1\5\13\uffff\1\5\4\uffff"+
        "\1\5\6\uffff\3\5\126\uffff";
    static final String DFA60_maxS =
        "\1\77\1\101\4\uffff\1\101\10\uffff\1\101\2\uffff\1\101\13\uffff"+
        "\1\101\4\uffff\1\101\6\uffff\3\101\126\uffff";
    static final String DFA60_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\52\uffff\1\1\13\uffff\1\1\4\uffff\1\1\6"+
        "\uffff\3\1\4\uffff\1\1\6\uffff\3\1\4\uffff\1\1\6\uffff\2\1\4\uffff"+
        "\1\1\6\uffff\3\1\4\uffff\1\1\6\uffff\4\1\1\uffff";
    static final String DFA60_specialS =
        "\u0083\uffff}>";
    static final String[] DFA60_transitionS = {
            "\1\1\3\uffff\1\2\2\4\1\uffff\1\4\3\uffff\5\4\3\uffff\2\2",
            "\2\2\3\uffff\40\2\1\6\4\2\2\17\1\2\1\17\3\2\5\17\7\2",
            "",
            "",
            "",
            "",
            "\45\2\1\22\4\2\2\36\1\2\1\36\3\2\5\36\7\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\5\2\1\53\6\2\1\54\30\2\1\43\5\2\1\52\1\2\1\52\17\2",
            "",
            "",
            "\45\2\1\57\4\2\2\73\1\2\1\73\3\2\5\73\7\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\5\2\1\110\6\2\1\111\30\2\1\100\5\2\1\107\1\2\1\107\17\2",
            "",
            "",
            "",
            "",
            "\5\2\1\126\6\2\1\127\30\2\1\116\5\2\1\125\1\2\1\125\17\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "\5\2\1\143\6\2\1\144\30\2\1\134\27\2",
            "\45\2\1\151\3\2\1\161\2\162\1\2\1\162\3\2\5\162\3\2\2\160\2"+
            "\2",
            "\45\2\1\167\3\2\1\u0080\2\u0081\1\2\1\u0081\3\2\5\u0081\1\176"+
            "\2\2\2\177\2\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
    static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
    static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
    static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
    static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
    static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
    static final short[][] DFA60_transition;

    static {
        int numStates = DFA60_transitionS.length;
        DFA60_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
        }
    }

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = DFA60_eot;
            this.eof = DFA60_eof;
            this.min = DFA60_min;
            this.max = DFA60_max;
            this.accept = DFA60_accept;
            this.special = DFA60_special;
            this.transition = DFA60_transition;
        }
        public String getDescription() {
            return "()* loopback of 198:16: ( ( WS )* op ( WS )* single_expr )*";
        }
    }
 

    public static final BitSet FOLLOW_code_fragment_in_code132 = new BitSet(new long[]{0xFFFFFFFFFFFFFC60L,0x0000000000000003L});
    public static final BitSet FOLLOW_EOF_in_code137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_code_fragment198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_define_directive_in_code_fragment203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_import_declaration_in_code_fragment208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_simple_check_wrapper_in_code_fragment213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_define_block_wrapper_in_code_fragment218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_not_define_block_wrapper_in_code_fragment223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_smth_else_in_code_fragment228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_not_define_block_in_if_not_define_block_wrapper260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifndef1_in_if_not_define_block279 = new BitSet(new long[]{0xC000040000000000L});
    public static final BitSet FOLLOW_ifndef2_in_if_not_define_block283 = new BitSet(new long[]{0xC000040000000000L});
    public static final BitSet FOLLOW_ret_in_if_not_define_block286 = new BitSet(new long[]{0xFFFFFFFFFFFFFC60L,0x0000000000000003L});
    public static final BitSet FOLLOW_main_code_block_in_if_not_define_block290 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_ELSE_in_if_not_define_block295 = new BitSet(new long[]{0xC000040000000000L});
    public static final BitSet FOLLOW_ret_in_if_not_define_block297 = new BitSet(new long[]{0xFFFFFFFFFFFFFC60L,0x0000000000000003L});
    public static final BitSet FOLLOW_else_code_block_in_if_not_define_block302 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ENDIF_in_if_not_define_block309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IFNDEF_in_ifndef1319 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_WS_in_ifndef1321 = new BitSet(new long[]{0x0000040000000400L});
    public static final BitSet FOLLOW_name_in_ifndef1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifndef2332 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_WS_in_ifndef2334 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_43_in_ifndef2337 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_WS_in_ifndef2339 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ifndef2342 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ifndef2344 = new BitSet(new long[]{0x0000040000000400L});
    public static final BitSet FOLLOW_WS_in_ifndef2346 = new BitSet(new long[]{0x0000040000000400L});
    public static final BitSet FOLLOW_name_in_ifndef2349 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_WS_in_ifndef2351 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_46_in_ifndef2355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_simple_check_in_if_simple_check_wrapper364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_simple_check382 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_WS_in_if_simple_check384 = new BitSet(new long[]{0x00052C0000020400L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_wrapper_in_if_simple_check387 = new BitSet(new long[]{0xC000040000000000L});
    public static final BitSet FOLLOW_ret_in_if_simple_check389 = new BitSet(new long[]{0xFFFFFFFFFFFFFC60L,0x0000000000000003L});
    public static final BitSet FOLLOW_main_code_block_in_if_simple_check393 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_ELIF_in_if_simple_check398 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_WS_in_if_simple_check400 = new BitSet(new long[]{0x00052C0000020400L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_wrapper_in_if_simple_check403 = new BitSet(new long[]{0xC000040000000000L});
    public static final BitSet FOLLOW_ret_in_if_simple_check405 = new BitSet(new long[]{0xFFFFFFFFFFFFFC60L,0x0000000000000003L});
    public static final BitSet FOLLOW_else_code_block_in_if_simple_check409 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_ELSE_in_if_simple_check416 = new BitSet(new long[]{0xC000040000000000L});
    public static final BitSet FOLLOW_ret_in_if_simple_check418 = new BitSet(new long[]{0xFFFFFFFFFFFFFC60L,0x0000000000000003L});
    public static final BitSet FOLLOW_else_code_block_in_if_simple_check423 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ENDIF_in_if_simple_check430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_wrapper442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_define_block_in_if_define_block_wrapper461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifdef1_in_if_define_block481 = new BitSet(new long[]{0xC000040000000000L});
    public static final BitSet FOLLOW_ifdef2_in_if_define_block485 = new BitSet(new long[]{0xC000040000000000L});
    public static final BitSet FOLLOW_ret_in_if_define_block488 = new BitSet(new long[]{0xFFFFFFFFFFFFFF60L,0x0000000000000003L});
    public static final BitSet FOLLOW_main_code_block_in_if_define_block492 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_ELSE_in_if_define_block498 = new BitSet(new long[]{0xC000040000000000L});
    public static final BitSet FOLLOW_ret_in_if_define_block500 = new BitSet(new long[]{0xFFFFFFFFFFFFFC60L,0x0000000000000003L});
    public static final BitSet FOLLOW_else_code_block_in_if_define_block505 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ENDIF_in_if_define_block512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifdef1522 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_WS_in_ifdef1524 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ifdef1527 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ifdef1529 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_name_in_ifdef1531 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ifdef1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IFDEF_in_ifdef2541 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_WS_in_ifdef2543 = new BitSet(new long[]{0x0000040000000400L});
    public static final BitSet FOLLOW_name_in_ifdef2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_code_block_in_main_code_block555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_code_block_in_else_code_block572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_code_fragment_in_code_block589 = new BitSet(new long[]{0xFFFFFFFFFFFFFC62L,0x0000000000000003L});
    public static final BitSet FOLLOW_ID_in_name631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_import_declaration648 = new BitSet(new long[]{0x0040040000200000L});
    public static final BitSet FOLLOW_WS_in_import_declaration656 = new BitSet(new long[]{0x0040040000200000L});
    public static final BitSet FOLLOW_import_internal_in_import_declaration660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_import_external_in_import_declaration664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_import_internal_string_in_import_internal675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_import_internal_string693 = new BitSet(new long[]{0x0000040000000400L});
    public static final BitSet FOLLOW_WS_in_import_internal_string695 = new BitSet(new long[]{0x0000040000000400L});
    public static final BitSet FOLLOW_filename_in_import_internal_string698 = new BitSet(new long[]{0x0220040000000000L});
    public static final BitSet FOLLOW_53_in_import_internal_string701 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_filename_in_import_internal_string703 = new BitSet(new long[]{0x0220040000000000L});
    public static final BitSet FOLLOW_WS_in_import_internal_string707 = new BitSet(new long[]{0x0200040000000000L});
    public static final BitSet FOLLOW_57_in_import_internal_string710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_filename718 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_filename721 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_filename723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_import_external_string_in_import_external735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL2_in_import_external_string752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFINE_in_define_directive762 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_WS_in_define_directive764 = new BitSet(new long[]{0x0000040000000400L});
    public static final BitSet FOLLOW_id_wrapper_in_define_directive767 = new BitSet(new long[]{0x3FFFFFFFFFFBFFF2L,0x0000000000000003L});
    public static final BitSet FOLLOW_WS_in_define_directive769 = new BitSet(new long[]{0x3FFFFFFFFFFBFFF2L,0x0000000000000003L});
    public static final BitSet FOLLOW_mln_end_in_define_directive772 = new BitSet(new long[]{0x1FFFFFFFFFFBFFF2L,0x0000000000000003L});
    public static final BitSet FOLLOW_replace_wrapper_in_define_directive775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_mln_end803 = new BitSet(new long[]{0xC000040000000000L});
    public static final BitSet FOLLOW_WS_in_mln_end805 = new BitSet(new long[]{0xC000040000000000L});
    public static final BitSet FOLLOW_name_wrapper_in_id_wrapper828 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_in_brackets_wrapper_in_id_wrapper830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_name_wrapper853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_in_brackets_in_in_brackets_wrapper872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_in_brackets891 = new BitSet(new long[]{0x0010040000000400L});
    public static final BitSet FOLLOW_WS_in_in_brackets893 = new BitSet(new long[]{0x0010040000000400L});
    public static final BitSet FOLLOW_param_wrapper_in_in_brackets896 = new BitSet(new long[]{0x0002440000000000L});
    public static final BitSet FOLLOW_WS_in_in_brackets899 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_49_in_in_brackets902 = new BitSet(new long[]{0x0010040000000400L});
    public static final BitSet FOLLOW_WS_in_in_brackets904 = new BitSet(new long[]{0x0010040000000400L});
    public static final BitSet FOLLOW_param_wrapper_in_in_brackets907 = new BitSet(new long[]{0x0002440000000000L});
    public static final BitSet FOLLOW_WS_in_in_brackets911 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_46_in_in_brackets914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_common_in_param_wrapper927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_many_points_in_param_wrapper932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_many_points945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param_common958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_replace_in_replace_wrapper979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_replace_internal_in_replace997 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_backslash_in_replace1000 = new BitSet(new long[]{0xC000000000000000L});
    public static final BitSet FOLLOW_replace_internal_in_replace1011 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_backslash1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_replace_internal1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ex_and_wrp_in_expression1077 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_WS_in_expression1080 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_44_in_expression1083 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_WS_in_expression1085 = new BitSet(new long[]{0x00052C0000020400L,0x0000000000000001L});
    public static final BitSet FOLLOW_ex_and_wrp_in_expression1088 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ex_and_in_ex_and_wrp1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ex_and1119 = new BitSet(new long[]{0x0005240000020400L,0x0000000000000001L});
    public static final BitSet FOLLOW_WS_in_ex_and1121 = new BitSet(new long[]{0x0005240000020400L,0x0000000000000001L});
    public static final BitSet FOLLOW_ex_and_not_in_ex_and1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_math_expr_wrp_in_ex_and_not1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ex_and_not1141 = new BitSet(new long[]{0x0000240000000000L});
    public static final BitSet FOLLOW_WS_in_ex_and_not1143 = new BitSet(new long[]{0x0000240000000000L});
    public static final BitSet FOLLOW_45_in_ex_and_not1148 = new BitSet(new long[]{0x00052C0000020400L,0x0000000000000001L});
    public static final BitSet FOLLOW_WS_in_ex_and_not1150 = new BitSet(new long[]{0x00052C0000020400L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_wrapper_in_ex_and_not1153 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_WS_in_ex_and_not1156 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ex_and_not1159 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_WS_in_ex_and_not1161 = new BitSet(new long[]{0x00052C0000020400L,0x0000000000000001L});
    public static final BitSet FOLLOW_expression_wrapper_in_ex_and_not1164 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_46_in_ex_and_not1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_math_expr_in_math_expr_wrp1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_expr_in_math_expr1192 = new BitSet(new long[]{0x07C5840000000002L});
    public static final BitSet FOLLOW_WS_in_math_expr1195 = new BitSet(new long[]{0x07C5840000000000L});
    public static final BitSet FOLLOW_op_in_math_expr1198 = new BitSet(new long[]{0x0005040000020400L});
    public static final BitSet FOLLOW_WS_in_math_expr1200 = new BitSet(new long[]{0x0005040000020400L});
    public static final BitSet FOLLOW_single_expr_in_math_expr1203 = new BitSet(new long[]{0x07C5840000000002L});
    public static final BitSet FOLLOW_set_in_single_expr1260 = new BitSet(new long[]{0x0000040000020400L});
    public static final BitSet FOLLOW_WS_in_single_expr1267 = new BitSet(new long[]{0x0000040000020400L});
    public static final BitSet FOLLOW_single_expr2_in_single_expr1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_single_expr21281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_const_expr_in_single_expr21286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_const_expr1300 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_const_expr1302 = new BitSet(new long[]{0x0000000000000002L});

}