package org.xtext.example.mydsl1.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl1.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_WS", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'open'", "'a'", "'browser'", "'window'", "'go'", "'to'", "'the'", "'url'", "'click'", "'on'", "'element'", "'fill'", "'field'", "'with'", "'select'", "'checkbox'", "'named'", "'verify'", "'that'", "'page'", "'contains'", "'string'", "'read'", "'text'", "'and'", "'store'", "'it'", "'in'", "'variable'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_commands_0_0= ruleCommand ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_commands_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_commands_0_0= ruleCommand ) )* )
            // InternalMyDsl.g:78:2: ( (lv_commands_0_0= ruleCommand ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_commands_0_0= ruleCommand ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==15||LA1_0==19||LA1_0==22||LA1_0==25||LA1_0==28||LA1_0==33) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_commands_0_0= ruleCommand )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_commands_0_0= ruleCommand )
            	    // InternalMyDsl.g:80:4: lv_commands_0_0= ruleCommand
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getCommandsCommandParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_commands_0_0=ruleCommand();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"commands",
            	    					lv_commands_0_0,
            	    					"org.xtext.example.mydsl1.MyDsl.Command");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCommand"
    // InternalMyDsl.g:100:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalMyDsl.g:100:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalMyDsl.g:101:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalMyDsl.g:107:1: ruleCommand returns [EObject current=null] : (this_OpenBrowserCommand_0= ruleOpenBrowserCommand | this_NavigateToCommand_1= ruleNavigateToCommand | this_ClickCommand_2= ruleClickCommand | this_FillCommand_3= ruleFillCommand | this_SelectCommand_4= ruleSelectCommand | this_VerifyCommand_5= ruleVerifyCommand | this_ReadCommand_6= ruleReadCommand ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_OpenBrowserCommand_0 = null;

        EObject this_NavigateToCommand_1 = null;

        EObject this_ClickCommand_2 = null;

        EObject this_FillCommand_3 = null;

        EObject this_SelectCommand_4 = null;

        EObject this_VerifyCommand_5 = null;

        EObject this_ReadCommand_6 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (this_OpenBrowserCommand_0= ruleOpenBrowserCommand | this_NavigateToCommand_1= ruleNavigateToCommand | this_ClickCommand_2= ruleClickCommand | this_FillCommand_3= ruleFillCommand | this_SelectCommand_4= ruleSelectCommand | this_VerifyCommand_5= ruleVerifyCommand | this_ReadCommand_6= ruleReadCommand ) )
            // InternalMyDsl.g:114:2: (this_OpenBrowserCommand_0= ruleOpenBrowserCommand | this_NavigateToCommand_1= ruleNavigateToCommand | this_ClickCommand_2= ruleClickCommand | this_FillCommand_3= ruleFillCommand | this_SelectCommand_4= ruleSelectCommand | this_VerifyCommand_5= ruleVerifyCommand | this_ReadCommand_6= ruleReadCommand )
            {
            // InternalMyDsl.g:114:2: (this_OpenBrowserCommand_0= ruleOpenBrowserCommand | this_NavigateToCommand_1= ruleNavigateToCommand | this_ClickCommand_2= ruleClickCommand | this_FillCommand_3= ruleFillCommand | this_SelectCommand_4= ruleSelectCommand | this_VerifyCommand_5= ruleVerifyCommand | this_ReadCommand_6= ruleReadCommand )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 19:
                {
                alt2=3;
                }
                break;
            case 22:
                {
                alt2=4;
                }
                break;
            case 25:
                {
                alt2=5;
                }
                break;
            case 28:
                {
                alt2=6;
                }
                break;
            case 33:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:115:3: this_OpenBrowserCommand_0= ruleOpenBrowserCommand
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getOpenBrowserCommandParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OpenBrowserCommand_0=ruleOpenBrowserCommand();

                    state._fsp--;


                    			current = this_OpenBrowserCommand_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:124:3: this_NavigateToCommand_1= ruleNavigateToCommand
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getNavigateToCommandParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NavigateToCommand_1=ruleNavigateToCommand();

                    state._fsp--;


                    			current = this_NavigateToCommand_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:133:3: this_ClickCommand_2= ruleClickCommand
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getClickCommandParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClickCommand_2=ruleClickCommand();

                    state._fsp--;


                    			current = this_ClickCommand_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:142:3: this_FillCommand_3= ruleFillCommand
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getFillCommandParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_FillCommand_3=ruleFillCommand();

                    state._fsp--;


                    			current = this_FillCommand_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:151:3: this_SelectCommand_4= ruleSelectCommand
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getSelectCommandParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_SelectCommand_4=ruleSelectCommand();

                    state._fsp--;


                    			current = this_SelectCommand_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:160:3: this_VerifyCommand_5= ruleVerifyCommand
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getVerifyCommandParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_VerifyCommand_5=ruleVerifyCommand();

                    state._fsp--;


                    			current = this_VerifyCommand_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:169:3: this_ReadCommand_6= ruleReadCommand
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getReadCommandParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReadCommand_6=ruleReadCommand();

                    state._fsp--;


                    			current = this_ReadCommand_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleOpenBrowserCommand"
    // InternalMyDsl.g:181:1: entryRuleOpenBrowserCommand returns [EObject current=null] : iv_ruleOpenBrowserCommand= ruleOpenBrowserCommand EOF ;
    public final EObject entryRuleOpenBrowserCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpenBrowserCommand = null;


        try {
            // InternalMyDsl.g:181:59: (iv_ruleOpenBrowserCommand= ruleOpenBrowserCommand EOF )
            // InternalMyDsl.g:182:2: iv_ruleOpenBrowserCommand= ruleOpenBrowserCommand EOF
            {
             newCompositeNode(grammarAccess.getOpenBrowserCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpenBrowserCommand=ruleOpenBrowserCommand();

            state._fsp--;

             current =iv_ruleOpenBrowserCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpenBrowserCommand"


    // $ANTLR start "ruleOpenBrowserCommand"
    // InternalMyDsl.g:188:1: ruleOpenBrowserCommand returns [EObject current=null] : ( () otherlv_1= 'open' otherlv_2= 'a' otherlv_3= 'browser' otherlv_4= 'window' ) ;
    public final EObject ruleOpenBrowserCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:194:2: ( ( () otherlv_1= 'open' otherlv_2= 'a' otherlv_3= 'browser' otherlv_4= 'window' ) )
            // InternalMyDsl.g:195:2: ( () otherlv_1= 'open' otherlv_2= 'a' otherlv_3= 'browser' otherlv_4= 'window' )
            {
            // InternalMyDsl.g:195:2: ( () otherlv_1= 'open' otherlv_2= 'a' otherlv_3= 'browser' otherlv_4= 'window' )
            // InternalMyDsl.g:196:3: () otherlv_1= 'open' otherlv_2= 'a' otherlv_3= 'browser' otherlv_4= 'window'
            {
            // InternalMyDsl.g:196:3: ()
            // InternalMyDsl.g:197:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOpenBrowserCommandAccess().getOpenBrowserAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getOpenBrowserCommandAccess().getOpenKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getOpenBrowserCommandAccess().getAKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getOpenBrowserCommandAccess().getBrowserKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getOpenBrowserCommandAccess().getWindowKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpenBrowserCommand"


    // $ANTLR start "entryRuleNavigateToCommand"
    // InternalMyDsl.g:223:1: entryRuleNavigateToCommand returns [EObject current=null] : iv_ruleNavigateToCommand= ruleNavigateToCommand EOF ;
    public final EObject entryRuleNavigateToCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigateToCommand = null;


        try {
            // InternalMyDsl.g:223:58: (iv_ruleNavigateToCommand= ruleNavigateToCommand EOF )
            // InternalMyDsl.g:224:2: iv_ruleNavigateToCommand= ruleNavigateToCommand EOF
            {
             newCompositeNode(grammarAccess.getNavigateToCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNavigateToCommand=ruleNavigateToCommand();

            state._fsp--;

             current =iv_ruleNavigateToCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNavigateToCommand"


    // $ANTLR start "ruleNavigateToCommand"
    // InternalMyDsl.g:230:1: ruleNavigateToCommand returns [EObject current=null] : (otherlv_0= 'go' otherlv_1= 'to' otherlv_2= 'the' otherlv_3= 'url' ( (lv_url_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleNavigateToCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_url_4_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:236:2: ( (otherlv_0= 'go' otherlv_1= 'to' otherlv_2= 'the' otherlv_3= 'url' ( (lv_url_4_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:237:2: (otherlv_0= 'go' otherlv_1= 'to' otherlv_2= 'the' otherlv_3= 'url' ( (lv_url_4_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:237:2: (otherlv_0= 'go' otherlv_1= 'to' otherlv_2= 'the' otherlv_3= 'url' ( (lv_url_4_0= RULE_STRING ) ) )
            // InternalMyDsl.g:238:3: otherlv_0= 'go' otherlv_1= 'to' otherlv_2= 'the' otherlv_3= 'url' ( (lv_url_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getNavigateToCommandAccess().getGoKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getNavigateToCommandAccess().getToKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getNavigateToCommandAccess().getTheKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getNavigateToCommandAccess().getUrlKeyword_3());
            		
            // InternalMyDsl.g:254:3: ( (lv_url_4_0= RULE_STRING ) )
            // InternalMyDsl.g:255:4: (lv_url_4_0= RULE_STRING )
            {
            // InternalMyDsl.g:255:4: (lv_url_4_0= RULE_STRING )
            // InternalMyDsl.g:256:5: lv_url_4_0= RULE_STRING
            {
            lv_url_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_url_4_0, grammarAccess.getNavigateToCommandAccess().getUrlSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNavigateToCommandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"url",
            						lv_url_4_0,
            						"org.xtext.example.mydsl1.MyDsl.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNavigateToCommand"


    // $ANTLR start "entryRuleClickCommand"
    // InternalMyDsl.g:276:1: entryRuleClickCommand returns [EObject current=null] : iv_ruleClickCommand= ruleClickCommand EOF ;
    public final EObject entryRuleClickCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClickCommand = null;


        try {
            // InternalMyDsl.g:276:53: (iv_ruleClickCommand= ruleClickCommand EOF )
            // InternalMyDsl.g:277:2: iv_ruleClickCommand= ruleClickCommand EOF
            {
             newCompositeNode(grammarAccess.getClickCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClickCommand=ruleClickCommand();

            state._fsp--;

             current =iv_ruleClickCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClickCommand"


    // $ANTLR start "ruleClickCommand"
    // InternalMyDsl.g:283:1: ruleClickCommand returns [EObject current=null] : (otherlv_0= 'click' otherlv_1= 'on' otherlv_2= 'the' otherlv_3= 'element' ( (lv_elementText_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleClickCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_elementText_4_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:289:2: ( (otherlv_0= 'click' otherlv_1= 'on' otherlv_2= 'the' otherlv_3= 'element' ( (lv_elementText_4_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:290:2: (otherlv_0= 'click' otherlv_1= 'on' otherlv_2= 'the' otherlv_3= 'element' ( (lv_elementText_4_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:290:2: (otherlv_0= 'click' otherlv_1= 'on' otherlv_2= 'the' otherlv_3= 'element' ( (lv_elementText_4_0= RULE_STRING ) ) )
            // InternalMyDsl.g:291:3: otherlv_0= 'click' otherlv_1= 'on' otherlv_2= 'the' otherlv_3= 'element' ( (lv_elementText_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getClickCommandAccess().getClickKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getClickCommandAccess().getOnKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getClickCommandAccess().getTheKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getClickCommandAccess().getElementKeyword_3());
            		
            // InternalMyDsl.g:307:3: ( (lv_elementText_4_0= RULE_STRING ) )
            // InternalMyDsl.g:308:4: (lv_elementText_4_0= RULE_STRING )
            {
            // InternalMyDsl.g:308:4: (lv_elementText_4_0= RULE_STRING )
            // InternalMyDsl.g:309:5: lv_elementText_4_0= RULE_STRING
            {
            lv_elementText_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_elementText_4_0, grammarAccess.getClickCommandAccess().getElementTextSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClickCommandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"elementText",
            						lv_elementText_4_0,
            						"org.xtext.example.mydsl1.MyDsl.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClickCommand"


    // $ANTLR start "entryRuleFillCommand"
    // InternalMyDsl.g:329:1: entryRuleFillCommand returns [EObject current=null] : iv_ruleFillCommand= ruleFillCommand EOF ;
    public final EObject entryRuleFillCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFillCommand = null;


        try {
            // InternalMyDsl.g:329:52: (iv_ruleFillCommand= ruleFillCommand EOF )
            // InternalMyDsl.g:330:2: iv_ruleFillCommand= ruleFillCommand EOF
            {
             newCompositeNode(grammarAccess.getFillCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFillCommand=ruleFillCommand();

            state._fsp--;

             current =iv_ruleFillCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFillCommand"


    // $ANTLR start "ruleFillCommand"
    // InternalMyDsl.g:336:1: ruleFillCommand returns [EObject current=null] : (otherlv_0= 'fill' otherlv_1= 'the' otherlv_2= 'field' ( (lv_fieldName_3_0= RULE_STRING ) ) otherlv_4= 'with' ( (lv_fieldValue_5_0= RULE_STRING ) ) ) ;
    public final EObject ruleFillCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_fieldName_3_0=null;
        Token otherlv_4=null;
        Token lv_fieldValue_5_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:342:2: ( (otherlv_0= 'fill' otherlv_1= 'the' otherlv_2= 'field' ( (lv_fieldName_3_0= RULE_STRING ) ) otherlv_4= 'with' ( (lv_fieldValue_5_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:343:2: (otherlv_0= 'fill' otherlv_1= 'the' otherlv_2= 'field' ( (lv_fieldName_3_0= RULE_STRING ) ) otherlv_4= 'with' ( (lv_fieldValue_5_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:343:2: (otherlv_0= 'fill' otherlv_1= 'the' otherlv_2= 'field' ( (lv_fieldName_3_0= RULE_STRING ) ) otherlv_4= 'with' ( (lv_fieldValue_5_0= RULE_STRING ) ) )
            // InternalMyDsl.g:344:3: otherlv_0= 'fill' otherlv_1= 'the' otherlv_2= 'field' ( (lv_fieldName_3_0= RULE_STRING ) ) otherlv_4= 'with' ( (lv_fieldValue_5_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getFillCommandAccess().getFillKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getFillCommandAccess().getTheKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getFillCommandAccess().getFieldKeyword_2());
            		
            // InternalMyDsl.g:356:3: ( (lv_fieldName_3_0= RULE_STRING ) )
            // InternalMyDsl.g:357:4: (lv_fieldName_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:357:4: (lv_fieldName_3_0= RULE_STRING )
            // InternalMyDsl.g:358:5: lv_fieldName_3_0= RULE_STRING
            {
            lv_fieldName_3_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_fieldName_3_0, grammarAccess.getFillCommandAccess().getFieldNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFillCommandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fieldName",
            						lv_fieldName_3_0,
            						"org.xtext.example.mydsl1.MyDsl.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getFillCommandAccess().getWithKeyword_4());
            		
            // InternalMyDsl.g:378:3: ( (lv_fieldValue_5_0= RULE_STRING ) )
            // InternalMyDsl.g:379:4: (lv_fieldValue_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:379:4: (lv_fieldValue_5_0= RULE_STRING )
            // InternalMyDsl.g:380:5: lv_fieldValue_5_0= RULE_STRING
            {
            lv_fieldValue_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_fieldValue_5_0, grammarAccess.getFillCommandAccess().getFieldValueSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFillCommandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fieldValue",
            						lv_fieldValue_5_0,
            						"org.xtext.example.mydsl1.MyDsl.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFillCommand"


    // $ANTLR start "entryRuleSelectCommand"
    // InternalMyDsl.g:400:1: entryRuleSelectCommand returns [EObject current=null] : iv_ruleSelectCommand= ruleSelectCommand EOF ;
    public final EObject entryRuleSelectCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectCommand = null;


        try {
            // InternalMyDsl.g:400:54: (iv_ruleSelectCommand= ruleSelectCommand EOF )
            // InternalMyDsl.g:401:2: iv_ruleSelectCommand= ruleSelectCommand EOF
            {
             newCompositeNode(grammarAccess.getSelectCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectCommand=ruleSelectCommand();

            state._fsp--;

             current =iv_ruleSelectCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectCommand"


    // $ANTLR start "ruleSelectCommand"
    // InternalMyDsl.g:407:1: ruleSelectCommand returns [EObject current=null] : (otherlv_0= 'select' otherlv_1= 'the' otherlv_2= 'checkbox' otherlv_3= 'named' ( (lv_checkboxName_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleSelectCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_checkboxName_4_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:413:2: ( (otherlv_0= 'select' otherlv_1= 'the' otherlv_2= 'checkbox' otherlv_3= 'named' ( (lv_checkboxName_4_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:414:2: (otherlv_0= 'select' otherlv_1= 'the' otherlv_2= 'checkbox' otherlv_3= 'named' ( (lv_checkboxName_4_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:414:2: (otherlv_0= 'select' otherlv_1= 'the' otherlv_2= 'checkbox' otherlv_3= 'named' ( (lv_checkboxName_4_0= RULE_STRING ) ) )
            // InternalMyDsl.g:415:3: otherlv_0= 'select' otherlv_1= 'the' otherlv_2= 'checkbox' otherlv_3= 'named' ( (lv_checkboxName_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectCommandAccess().getSelectKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getSelectCommandAccess().getTheKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getSelectCommandAccess().getCheckboxKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getSelectCommandAccess().getNamedKeyword_3());
            		
            // InternalMyDsl.g:431:3: ( (lv_checkboxName_4_0= RULE_STRING ) )
            // InternalMyDsl.g:432:4: (lv_checkboxName_4_0= RULE_STRING )
            {
            // InternalMyDsl.g:432:4: (lv_checkboxName_4_0= RULE_STRING )
            // InternalMyDsl.g:433:5: lv_checkboxName_4_0= RULE_STRING
            {
            lv_checkboxName_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_checkboxName_4_0, grammarAccess.getSelectCommandAccess().getCheckboxNameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectCommandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"checkboxName",
            						lv_checkboxName_4_0,
            						"org.xtext.example.mydsl1.MyDsl.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectCommand"


    // $ANTLR start "entryRuleVerifyCommand"
    // InternalMyDsl.g:453:1: entryRuleVerifyCommand returns [EObject current=null] : iv_ruleVerifyCommand= ruleVerifyCommand EOF ;
    public final EObject entryRuleVerifyCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerifyCommand = null;


        try {
            // InternalMyDsl.g:453:54: (iv_ruleVerifyCommand= ruleVerifyCommand EOF )
            // InternalMyDsl.g:454:2: iv_ruleVerifyCommand= ruleVerifyCommand EOF
            {
             newCompositeNode(grammarAccess.getVerifyCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVerifyCommand=ruleVerifyCommand();

            state._fsp--;

             current =iv_ruleVerifyCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVerifyCommand"


    // $ANTLR start "ruleVerifyCommand"
    // InternalMyDsl.g:460:1: ruleVerifyCommand returns [EObject current=null] : (otherlv_0= 'verify' otherlv_1= 'that' otherlv_2= 'the' otherlv_3= 'page' otherlv_4= 'contains' otherlv_5= 'the' otherlv_6= 'string' ( (lv_verifyString_7_0= RULE_STRING ) ) ) ;
    public final EObject ruleVerifyCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_verifyString_7_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:466:2: ( (otherlv_0= 'verify' otherlv_1= 'that' otherlv_2= 'the' otherlv_3= 'page' otherlv_4= 'contains' otherlv_5= 'the' otherlv_6= 'string' ( (lv_verifyString_7_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:467:2: (otherlv_0= 'verify' otherlv_1= 'that' otherlv_2= 'the' otherlv_3= 'page' otherlv_4= 'contains' otherlv_5= 'the' otherlv_6= 'string' ( (lv_verifyString_7_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:467:2: (otherlv_0= 'verify' otherlv_1= 'that' otherlv_2= 'the' otherlv_3= 'page' otherlv_4= 'contains' otherlv_5= 'the' otherlv_6= 'string' ( (lv_verifyString_7_0= RULE_STRING ) ) )
            // InternalMyDsl.g:468:3: otherlv_0= 'verify' otherlv_1= 'that' otherlv_2= 'the' otherlv_3= 'page' otherlv_4= 'contains' otherlv_5= 'the' otherlv_6= 'string' ( (lv_verifyString_7_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getVerifyCommandAccess().getVerifyKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getVerifyCommandAccess().getThatKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getVerifyCommandAccess().getTheKeyword_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getVerifyCommandAccess().getPageKeyword_3());
            		
            otherlv_4=(Token)match(input,31,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getVerifyCommandAccess().getContainsKeyword_4());
            		
            otherlv_5=(Token)match(input,17,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getVerifyCommandAccess().getTheKeyword_5());
            		
            otherlv_6=(Token)match(input,32,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getVerifyCommandAccess().getStringKeyword_6());
            		
            // InternalMyDsl.g:496:3: ( (lv_verifyString_7_0= RULE_STRING ) )
            // InternalMyDsl.g:497:4: (lv_verifyString_7_0= RULE_STRING )
            {
            // InternalMyDsl.g:497:4: (lv_verifyString_7_0= RULE_STRING )
            // InternalMyDsl.g:498:5: lv_verifyString_7_0= RULE_STRING
            {
            lv_verifyString_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_verifyString_7_0, grammarAccess.getVerifyCommandAccess().getVerifyStringSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVerifyCommandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"verifyString",
            						lv_verifyString_7_0,
            						"org.xtext.example.mydsl1.MyDsl.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVerifyCommand"


    // $ANTLR start "entryRuleReadCommand"
    // InternalMyDsl.g:518:1: entryRuleReadCommand returns [EObject current=null] : iv_ruleReadCommand= ruleReadCommand EOF ;
    public final EObject entryRuleReadCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadCommand = null;


        try {
            // InternalMyDsl.g:518:52: (iv_ruleReadCommand= ruleReadCommand EOF )
            // InternalMyDsl.g:519:2: iv_ruleReadCommand= ruleReadCommand EOF
            {
             newCompositeNode(grammarAccess.getReadCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReadCommand=ruleReadCommand();

            state._fsp--;

             current =iv_ruleReadCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReadCommand"


    // $ANTLR start "ruleReadCommand"
    // InternalMyDsl.g:525:1: ruleReadCommand returns [EObject current=null] : (otherlv_0= 'read' otherlv_1= 'the' otherlv_2= 'element' otherlv_3= 'with' otherlv_4= 'text' ( (lv_elementText_5_0= RULE_STRING ) ) otherlv_6= 'and' otherlv_7= 'store' otherlv_8= 'it' otherlv_9= 'in' otherlv_10= 'variable' ( (lv_variableName_11_0= RULE_ID ) ) ) ;
    public final EObject ruleReadCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_elementText_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_variableName_11_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:531:2: ( (otherlv_0= 'read' otherlv_1= 'the' otherlv_2= 'element' otherlv_3= 'with' otherlv_4= 'text' ( (lv_elementText_5_0= RULE_STRING ) ) otherlv_6= 'and' otherlv_7= 'store' otherlv_8= 'it' otherlv_9= 'in' otherlv_10= 'variable' ( (lv_variableName_11_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:532:2: (otherlv_0= 'read' otherlv_1= 'the' otherlv_2= 'element' otherlv_3= 'with' otherlv_4= 'text' ( (lv_elementText_5_0= RULE_STRING ) ) otherlv_6= 'and' otherlv_7= 'store' otherlv_8= 'it' otherlv_9= 'in' otherlv_10= 'variable' ( (lv_variableName_11_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:532:2: (otherlv_0= 'read' otherlv_1= 'the' otherlv_2= 'element' otherlv_3= 'with' otherlv_4= 'text' ( (lv_elementText_5_0= RULE_STRING ) ) otherlv_6= 'and' otherlv_7= 'store' otherlv_8= 'it' otherlv_9= 'in' otherlv_10= 'variable' ( (lv_variableName_11_0= RULE_ID ) ) )
            // InternalMyDsl.g:533:3: otherlv_0= 'read' otherlv_1= 'the' otherlv_2= 'element' otherlv_3= 'with' otherlv_4= 'text' ( (lv_elementText_5_0= RULE_STRING ) ) otherlv_6= 'and' otherlv_7= 'store' otherlv_8= 'it' otherlv_9= 'in' otherlv_10= 'variable' ( (lv_variableName_11_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getReadCommandAccess().getReadKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getReadCommandAccess().getTheKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getReadCommandAccess().getElementKeyword_2());
            		
            otherlv_3=(Token)match(input,24,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getReadCommandAccess().getWithKeyword_3());
            		
            otherlv_4=(Token)match(input,34,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getReadCommandAccess().getTextKeyword_4());
            		
            // InternalMyDsl.g:553:3: ( (lv_elementText_5_0= RULE_STRING ) )
            // InternalMyDsl.g:554:4: (lv_elementText_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:554:4: (lv_elementText_5_0= RULE_STRING )
            // InternalMyDsl.g:555:5: lv_elementText_5_0= RULE_STRING
            {
            lv_elementText_5_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_elementText_5_0, grammarAccess.getReadCommandAccess().getElementTextSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReadCommandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"elementText",
            						lv_elementText_5_0,
            						"org.xtext.example.mydsl1.MyDsl.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,35,FOLLOW_23); 

            			newLeafNode(otherlv_6, grammarAccess.getReadCommandAccess().getAndKeyword_6());
            		
            otherlv_7=(Token)match(input,36,FOLLOW_24); 

            			newLeafNode(otherlv_7, grammarAccess.getReadCommandAccess().getStoreKeyword_7());
            		
            otherlv_8=(Token)match(input,37,FOLLOW_25); 

            			newLeafNode(otherlv_8, grammarAccess.getReadCommandAccess().getItKeyword_8());
            		
            otherlv_9=(Token)match(input,38,FOLLOW_26); 

            			newLeafNode(otherlv_9, grammarAccess.getReadCommandAccess().getInKeyword_9());
            		
            otherlv_10=(Token)match(input,39,FOLLOW_27); 

            			newLeafNode(otherlv_10, grammarAccess.getReadCommandAccess().getVariableKeyword_10());
            		
            // InternalMyDsl.g:591:3: ( (lv_variableName_11_0= RULE_ID ) )
            // InternalMyDsl.g:592:4: (lv_variableName_11_0= RULE_ID )
            {
            // InternalMyDsl.g:592:4: (lv_variableName_11_0= RULE_ID )
            // InternalMyDsl.g:593:5: lv_variableName_11_0= RULE_ID
            {
            lv_variableName_11_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_variableName_11_0, grammarAccess.getReadCommandAccess().getVariableNameIDTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReadCommandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"variableName",
            						lv_variableName_11_0,
            						"org.xtext.example.mydsl1.MyDsl.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReadCommand"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000212488802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000020L});

}