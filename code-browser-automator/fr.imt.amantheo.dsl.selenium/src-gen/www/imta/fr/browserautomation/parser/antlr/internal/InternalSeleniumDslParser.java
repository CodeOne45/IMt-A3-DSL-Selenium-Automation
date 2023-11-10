package www.imta.fr.browserautomation.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import www.imta.fr.browserautomation.services.SeleniumDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSeleniumDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_URL", "RULE_DOMAIN", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'open'", "'a'", "'browser'", "'window'", "'go'", "'to'", "'url'", "'click'", "'on'", "'the'", "'link'", "'button'", "'image'", "'variable'", "'fill'", "'with'", "'text'", "'field'", "'checkboxes'", "'combobox'", "'option'", "'title'", "'check'", "','", "'verify'", "'that'", "'page'", "'contains'", "'string'", "'read'", "'of'", "'number'", "'uncheck'", "'all'", "'choose'", "'in'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int RULE_URL=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int RULE_DOMAIN=7;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSeleniumDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSeleniumDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSeleniumDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSeleniumDsl.g"; }



     	private SeleniumDslGrammarAccess grammarAccess;

        public InternalSeleniumDslParser(TokenStream input, SeleniumDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "BrowserDsl";
       	}

       	@Override
       	protected SeleniumDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleBrowserDsl"
    // InternalSeleniumDsl.g:64:1: entryRuleBrowserDsl returns [EObject current=null] : iv_ruleBrowserDsl= ruleBrowserDsl EOF ;
    public final EObject entryRuleBrowserDsl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrowserDsl = null;


        try {
            // InternalSeleniumDsl.g:64:51: (iv_ruleBrowserDsl= ruleBrowserDsl EOF )
            // InternalSeleniumDsl.g:65:2: iv_ruleBrowserDsl= ruleBrowserDsl EOF
            {
             newCompositeNode(grammarAccess.getBrowserDslRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBrowserDsl=ruleBrowserDsl();

            state._fsp--;

             current =iv_ruleBrowserDsl; 
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
    // $ANTLR end "entryRuleBrowserDsl"


    // $ANTLR start "ruleBrowserDsl"
    // InternalSeleniumDsl.g:71:1: ruleBrowserDsl returns [EObject current=null] : ( (lv_commands_0_0= ruleCommand ) )* ;
    public final EObject ruleBrowserDsl() throws RecognitionException {
        EObject current = null;

        EObject lv_commands_0_0 = null;



        	enterRule();

        try {
            // InternalSeleniumDsl.g:77:2: ( ( (lv_commands_0_0= ruleCommand ) )* )
            // InternalSeleniumDsl.g:78:2: ( (lv_commands_0_0= ruleCommand ) )*
            {
            // InternalSeleniumDsl.g:78:2: ( (lv_commands_0_0= ruleCommand ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||LA1_0==17||LA1_0==20||LA1_0==27||LA1_0==35||LA1_0==37||LA1_0==42||LA1_0==45||LA1_0==47) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSeleniumDsl.g:79:3: (lv_commands_0_0= ruleCommand )
            	    {
            	    // InternalSeleniumDsl.g:79:3: (lv_commands_0_0= ruleCommand )
            	    // InternalSeleniumDsl.g:80:4: lv_commands_0_0= ruleCommand
            	    {

            	    				newCompositeNode(grammarAccess.getBrowserDslAccess().getCommandsCommandParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_commands_0_0=ruleCommand();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getBrowserDslRule());
            	    				}
            	    				add(
            	    					current,
            	    					"commands",
            	    					lv_commands_0_0,
            	    					"www.imta.fr.browserautomation.SeleniumDsl.Command");
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
    // $ANTLR end "ruleBrowserDsl"


    // $ANTLR start "entryRuleCommand"
    // InternalSeleniumDsl.g:100:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalSeleniumDsl.g:100:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalSeleniumDsl.g:101:2: iv_ruleCommand= ruleCommand EOF
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
    // InternalSeleniumDsl.g:107:1: ruleCommand returns [EObject current=null] : (this_OpenBrowser_0= ruleOpenBrowser | this_GoTo_1= ruleGoTo | this_Click_2= ruleClick | this_Fill_3= ruleFill | this_Select_4= ruleSelect | this_Verify_5= ruleVerify | this_Read_6= ruleRead | this_Uncheck_7= ruleUncheck | this_Combobox_8= ruleCombobox ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_OpenBrowser_0 = null;

        EObject this_GoTo_1 = null;

        EObject this_Click_2 = null;

        EObject this_Fill_3 = null;

        EObject this_Select_4 = null;

        EObject this_Verify_5 = null;

        EObject this_Read_6 = null;

        EObject this_Uncheck_7 = null;

        EObject this_Combobox_8 = null;



        	enterRule();

        try {
            // InternalSeleniumDsl.g:113:2: ( (this_OpenBrowser_0= ruleOpenBrowser | this_GoTo_1= ruleGoTo | this_Click_2= ruleClick | this_Fill_3= ruleFill | this_Select_4= ruleSelect | this_Verify_5= ruleVerify | this_Read_6= ruleRead | this_Uncheck_7= ruleUncheck | this_Combobox_8= ruleCombobox ) )
            // InternalSeleniumDsl.g:114:2: (this_OpenBrowser_0= ruleOpenBrowser | this_GoTo_1= ruleGoTo | this_Click_2= ruleClick | this_Fill_3= ruleFill | this_Select_4= ruleSelect | this_Verify_5= ruleVerify | this_Read_6= ruleRead | this_Uncheck_7= ruleUncheck | this_Combobox_8= ruleCombobox )
            {
            // InternalSeleniumDsl.g:114:2: (this_OpenBrowser_0= ruleOpenBrowser | this_GoTo_1= ruleGoTo | this_Click_2= ruleClick | this_Fill_3= ruleFill | this_Select_4= ruleSelect | this_Verify_5= ruleVerify | this_Read_6= ruleRead | this_Uncheck_7= ruleUncheck | this_Combobox_8= ruleCombobox )
            int alt2=9;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 17:
                {
                alt2=2;
                }
                break;
            case 20:
                {
                alt2=3;
                }
                break;
            case 27:
                {
                alt2=4;
                }
                break;
            case 35:
                {
                alt2=5;
                }
                break;
            case 37:
                {
                alt2=6;
                }
                break;
            case 42:
                {
                alt2=7;
                }
                break;
            case 45:
                {
                alt2=8;
                }
                break;
            case 47:
                {
                alt2=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSeleniumDsl.g:115:3: this_OpenBrowser_0= ruleOpenBrowser
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getOpenBrowserParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OpenBrowser_0=ruleOpenBrowser();

                    state._fsp--;


                    			current = this_OpenBrowser_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSeleniumDsl.g:124:3: this_GoTo_1= ruleGoTo
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getGoToParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_GoTo_1=ruleGoTo();

                    state._fsp--;


                    			current = this_GoTo_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSeleniumDsl.g:133:3: this_Click_2= ruleClick
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getClickParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Click_2=ruleClick();

                    state._fsp--;


                    			current = this_Click_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSeleniumDsl.g:142:3: this_Fill_3= ruleFill
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getFillParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Fill_3=ruleFill();

                    state._fsp--;


                    			current = this_Fill_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSeleniumDsl.g:151:3: this_Select_4= ruleSelect
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getSelectParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Select_4=ruleSelect();

                    state._fsp--;


                    			current = this_Select_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSeleniumDsl.g:160:3: this_Verify_5= ruleVerify
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getVerifyParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Verify_5=ruleVerify();

                    state._fsp--;


                    			current = this_Verify_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalSeleniumDsl.g:169:3: this_Read_6= ruleRead
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getReadParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Read_6=ruleRead();

                    state._fsp--;


                    			current = this_Read_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalSeleniumDsl.g:178:3: this_Uncheck_7= ruleUncheck
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getUncheckParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Uncheck_7=ruleUncheck();

                    state._fsp--;


                    			current = this_Uncheck_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalSeleniumDsl.g:187:3: this_Combobox_8= ruleCombobox
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getComboboxParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Combobox_8=ruleCombobox();

                    state._fsp--;


                    			current = this_Combobox_8;
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


    // $ANTLR start "entryRuleOpenBrowser"
    // InternalSeleniumDsl.g:199:1: entryRuleOpenBrowser returns [EObject current=null] : iv_ruleOpenBrowser= ruleOpenBrowser EOF ;
    public final EObject entryRuleOpenBrowser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpenBrowser = null;


        try {
            // InternalSeleniumDsl.g:199:52: (iv_ruleOpenBrowser= ruleOpenBrowser EOF )
            // InternalSeleniumDsl.g:200:2: iv_ruleOpenBrowser= ruleOpenBrowser EOF
            {
             newCompositeNode(grammarAccess.getOpenBrowserRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpenBrowser=ruleOpenBrowser();

            state._fsp--;

             current =iv_ruleOpenBrowser; 
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
    // $ANTLR end "entryRuleOpenBrowser"


    // $ANTLR start "ruleOpenBrowser"
    // InternalSeleniumDsl.g:206:1: ruleOpenBrowser returns [EObject current=null] : ( () otherlv_1= 'open' otherlv_2= 'a' otherlv_3= 'browser' otherlv_4= 'window' ) ;
    public final EObject ruleOpenBrowser() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSeleniumDsl.g:212:2: ( ( () otherlv_1= 'open' otherlv_2= 'a' otherlv_3= 'browser' otherlv_4= 'window' ) )
            // InternalSeleniumDsl.g:213:2: ( () otherlv_1= 'open' otherlv_2= 'a' otherlv_3= 'browser' otherlv_4= 'window' )
            {
            // InternalSeleniumDsl.g:213:2: ( () otherlv_1= 'open' otherlv_2= 'a' otherlv_3= 'browser' otherlv_4= 'window' )
            // InternalSeleniumDsl.g:214:3: () otherlv_1= 'open' otherlv_2= 'a' otherlv_3= 'browser' otherlv_4= 'window'
            {
            // InternalSeleniumDsl.g:214:3: ()
            // InternalSeleniumDsl.g:215:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOpenBrowserAccess().getOpenBrowserAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getOpenBrowserAccess().getOpenKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getOpenBrowserAccess().getAKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getOpenBrowserAccess().getBrowserKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getOpenBrowserAccess().getWindowKeyword_4());
            		

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
    // $ANTLR end "ruleOpenBrowser"


    // $ANTLR start "entryRuleGoTo"
    // InternalSeleniumDsl.g:241:1: entryRuleGoTo returns [EObject current=null] : iv_ruleGoTo= ruleGoTo EOF ;
    public final EObject entryRuleGoTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoTo = null;


        try {
            // InternalSeleniumDsl.g:241:45: (iv_ruleGoTo= ruleGoTo EOF )
            // InternalSeleniumDsl.g:242:2: iv_ruleGoTo= ruleGoTo EOF
            {
             newCompositeNode(grammarAccess.getGoToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGoTo=ruleGoTo();

            state._fsp--;

             current =iv_ruleGoTo; 
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
    // $ANTLR end "entryRuleGoTo"


    // $ANTLR start "ruleGoTo"
    // InternalSeleniumDsl.g:248:1: ruleGoTo returns [EObject current=null] : (otherlv_0= 'go' otherlv_1= 'to' otherlv_2= 'url' ( (lv_url_3_0= ruleDynamicURL ) ) ) ;
    public final EObject ruleGoTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_url_3_0 = null;



        	enterRule();

        try {
            // InternalSeleniumDsl.g:254:2: ( (otherlv_0= 'go' otherlv_1= 'to' otherlv_2= 'url' ( (lv_url_3_0= ruleDynamicURL ) ) ) )
            // InternalSeleniumDsl.g:255:2: (otherlv_0= 'go' otherlv_1= 'to' otherlv_2= 'url' ( (lv_url_3_0= ruleDynamicURL ) ) )
            {
            // InternalSeleniumDsl.g:255:2: (otherlv_0= 'go' otherlv_1= 'to' otherlv_2= 'url' ( (lv_url_3_0= ruleDynamicURL ) ) )
            // InternalSeleniumDsl.g:256:3: otherlv_0= 'go' otherlv_1= 'to' otherlv_2= 'url' ( (lv_url_3_0= ruleDynamicURL ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getGoToAccess().getGoKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getGoToAccess().getToKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getGoToAccess().getUrlKeyword_2());
            		
            // InternalSeleniumDsl.g:268:3: ( (lv_url_3_0= ruleDynamicURL ) )
            // InternalSeleniumDsl.g:269:4: (lv_url_3_0= ruleDynamicURL )
            {
            // InternalSeleniumDsl.g:269:4: (lv_url_3_0= ruleDynamicURL )
            // InternalSeleniumDsl.g:270:5: lv_url_3_0= ruleDynamicURL
            {

            					newCompositeNode(grammarAccess.getGoToAccess().getUrlDynamicURLParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_url_3_0=ruleDynamicURL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGoToRule());
            					}
            					set(
            						current,
            						"url",
            						lv_url_3_0,
            						"www.imta.fr.browserautomation.SeleniumDsl.DynamicURL");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleGoTo"


    // $ANTLR start "entryRuleClick"
    // InternalSeleniumDsl.g:291:1: entryRuleClick returns [EObject current=null] : iv_ruleClick= ruleClick EOF ;
    public final EObject entryRuleClick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClick = null;


        try {
            // InternalSeleniumDsl.g:291:46: (iv_ruleClick= ruleClick EOF )
            // InternalSeleniumDsl.g:292:2: iv_ruleClick= ruleClick EOF
            {
             newCompositeNode(grammarAccess.getClickRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClick=ruleClick();

            state._fsp--;

             current =iv_ruleClick; 
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
    // $ANTLR end "entryRuleClick"


    // $ANTLR start "ruleClick"
    // InternalSeleniumDsl.g:298:1: ruleClick returns [EObject current=null] : ( () otherlv_1= 'click' otherlv_2= 'on' otherlv_3= 'the' ( (otherlv_4= 'link' ( (lv_linkText_5_0= RULE_STRING ) ) ) | (otherlv_6= 'button' ( (lv_buttonText_7_0= RULE_STRING ) ) ) | (otherlv_8= 'image' ( (lv_alt_9_0= RULE_STRING ) ) ) | (otherlv_10= 'variable' ( (lv_variable_11_0= ruleElementType ) ) ) ) ) ;
    public final EObject ruleClick() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_linkText_5_0=null;
        Token otherlv_6=null;
        Token lv_buttonText_7_0=null;
        Token otherlv_8=null;
        Token lv_alt_9_0=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_variable_11_0 = null;



        	enterRule();

        try {
            // InternalSeleniumDsl.g:304:2: ( ( () otherlv_1= 'click' otherlv_2= 'on' otherlv_3= 'the' ( (otherlv_4= 'link' ( (lv_linkText_5_0= RULE_STRING ) ) ) | (otherlv_6= 'button' ( (lv_buttonText_7_0= RULE_STRING ) ) ) | (otherlv_8= 'image' ( (lv_alt_9_0= RULE_STRING ) ) ) | (otherlv_10= 'variable' ( (lv_variable_11_0= ruleElementType ) ) ) ) ) )
            // InternalSeleniumDsl.g:305:2: ( () otherlv_1= 'click' otherlv_2= 'on' otherlv_3= 'the' ( (otherlv_4= 'link' ( (lv_linkText_5_0= RULE_STRING ) ) ) | (otherlv_6= 'button' ( (lv_buttonText_7_0= RULE_STRING ) ) ) | (otherlv_8= 'image' ( (lv_alt_9_0= RULE_STRING ) ) ) | (otherlv_10= 'variable' ( (lv_variable_11_0= ruleElementType ) ) ) ) )
            {
            // InternalSeleniumDsl.g:305:2: ( () otherlv_1= 'click' otherlv_2= 'on' otherlv_3= 'the' ( (otherlv_4= 'link' ( (lv_linkText_5_0= RULE_STRING ) ) ) | (otherlv_6= 'button' ( (lv_buttonText_7_0= RULE_STRING ) ) ) | (otherlv_8= 'image' ( (lv_alt_9_0= RULE_STRING ) ) ) | (otherlv_10= 'variable' ( (lv_variable_11_0= ruleElementType ) ) ) ) )
            // InternalSeleniumDsl.g:306:3: () otherlv_1= 'click' otherlv_2= 'on' otherlv_3= 'the' ( (otherlv_4= 'link' ( (lv_linkText_5_0= RULE_STRING ) ) ) | (otherlv_6= 'button' ( (lv_buttonText_7_0= RULE_STRING ) ) ) | (otherlv_8= 'image' ( (lv_alt_9_0= RULE_STRING ) ) ) | (otherlv_10= 'variable' ( (lv_variable_11_0= ruleElementType ) ) ) )
            {
            // InternalSeleniumDsl.g:306:3: ()
            // InternalSeleniumDsl.g:307:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClickAccess().getClickAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getClickAccess().getClickKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getClickAccess().getOnKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getClickAccess().getTheKeyword_3());
            		
            // InternalSeleniumDsl.g:325:3: ( (otherlv_4= 'link' ( (lv_linkText_5_0= RULE_STRING ) ) ) | (otherlv_6= 'button' ( (lv_buttonText_7_0= RULE_STRING ) ) ) | (otherlv_8= 'image' ( (lv_alt_9_0= RULE_STRING ) ) ) | (otherlv_10= 'variable' ( (lv_variable_11_0= ruleElementType ) ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt3=1;
                }
                break;
            case 24:
                {
                alt3=2;
                }
                break;
            case 25:
                {
                alt3=3;
                }
                break;
            case 26:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSeleniumDsl.g:326:4: (otherlv_4= 'link' ( (lv_linkText_5_0= RULE_STRING ) ) )
                    {
                    // InternalSeleniumDsl.g:326:4: (otherlv_4= 'link' ( (lv_linkText_5_0= RULE_STRING ) ) )
                    // InternalSeleniumDsl.g:327:5: otherlv_4= 'link' ( (lv_linkText_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_13); 

                    					newLeafNode(otherlv_4, grammarAccess.getClickAccess().getLinkKeyword_4_0_0());
                    				
                    // InternalSeleniumDsl.g:331:5: ( (lv_linkText_5_0= RULE_STRING ) )
                    // InternalSeleniumDsl.g:332:6: (lv_linkText_5_0= RULE_STRING )
                    {
                    // InternalSeleniumDsl.g:332:6: (lv_linkText_5_0= RULE_STRING )
                    // InternalSeleniumDsl.g:333:7: lv_linkText_5_0= RULE_STRING
                    {
                    lv_linkText_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    							newLeafNode(lv_linkText_5_0, grammarAccess.getClickAccess().getLinkTextSTRINGTerminalRuleCall_4_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getClickRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"linkText",
                    								lv_linkText_5_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDsl.g:351:4: (otherlv_6= 'button' ( (lv_buttonText_7_0= RULE_STRING ) ) )
                    {
                    // InternalSeleniumDsl.g:351:4: (otherlv_6= 'button' ( (lv_buttonText_7_0= RULE_STRING ) ) )
                    // InternalSeleniumDsl.g:352:5: otherlv_6= 'button' ( (lv_buttonText_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_13); 

                    					newLeafNode(otherlv_6, grammarAccess.getClickAccess().getButtonKeyword_4_1_0());
                    				
                    // InternalSeleniumDsl.g:356:5: ( (lv_buttonText_7_0= RULE_STRING ) )
                    // InternalSeleniumDsl.g:357:6: (lv_buttonText_7_0= RULE_STRING )
                    {
                    // InternalSeleniumDsl.g:357:6: (lv_buttonText_7_0= RULE_STRING )
                    // InternalSeleniumDsl.g:358:7: lv_buttonText_7_0= RULE_STRING
                    {
                    lv_buttonText_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    							newLeafNode(lv_buttonText_7_0, grammarAccess.getClickAccess().getButtonTextSTRINGTerminalRuleCall_4_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getClickRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"buttonText",
                    								lv_buttonText_7_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSeleniumDsl.g:376:4: (otherlv_8= 'image' ( (lv_alt_9_0= RULE_STRING ) ) )
                    {
                    // InternalSeleniumDsl.g:376:4: (otherlv_8= 'image' ( (lv_alt_9_0= RULE_STRING ) ) )
                    // InternalSeleniumDsl.g:377:5: otherlv_8= 'image' ( (lv_alt_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,25,FOLLOW_13); 

                    					newLeafNode(otherlv_8, grammarAccess.getClickAccess().getImageKeyword_4_2_0());
                    				
                    // InternalSeleniumDsl.g:381:5: ( (lv_alt_9_0= RULE_STRING ) )
                    // InternalSeleniumDsl.g:382:6: (lv_alt_9_0= RULE_STRING )
                    {
                    // InternalSeleniumDsl.g:382:6: (lv_alt_9_0= RULE_STRING )
                    // InternalSeleniumDsl.g:383:7: lv_alt_9_0= RULE_STRING
                    {
                    lv_alt_9_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    							newLeafNode(lv_alt_9_0, grammarAccess.getClickAccess().getAltSTRINGTerminalRuleCall_4_2_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getClickRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"alt",
                    								lv_alt_9_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSeleniumDsl.g:401:4: (otherlv_10= 'variable' ( (lv_variable_11_0= ruleElementType ) ) )
                    {
                    // InternalSeleniumDsl.g:401:4: (otherlv_10= 'variable' ( (lv_variable_11_0= ruleElementType ) ) )
                    // InternalSeleniumDsl.g:402:5: otherlv_10= 'variable' ( (lv_variable_11_0= ruleElementType ) )
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_14); 

                    					newLeafNode(otherlv_10, grammarAccess.getClickAccess().getVariableKeyword_4_3_0());
                    				
                    // InternalSeleniumDsl.g:406:5: ( (lv_variable_11_0= ruleElementType ) )
                    // InternalSeleniumDsl.g:407:6: (lv_variable_11_0= ruleElementType )
                    {
                    // InternalSeleniumDsl.g:407:6: (lv_variable_11_0= ruleElementType )
                    // InternalSeleniumDsl.g:408:7: lv_variable_11_0= ruleElementType
                    {

                    							newCompositeNode(grammarAccess.getClickAccess().getVariableElementTypeParserRuleCall_4_3_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_variable_11_0=ruleElementType();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getClickRule());
                    							}
                    							set(
                    								current,
                    								"variable",
                    								lv_variable_11_0,
                    								"www.imta.fr.browserautomation.SeleniumDsl.ElementType");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleClick"


    // $ANTLR start "entryRuleFill"
    // InternalSeleniumDsl.g:431:1: entryRuleFill returns [EObject current=null] : iv_ruleFill= ruleFill EOF ;
    public final EObject entryRuleFill() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFill = null;


        try {
            // InternalSeleniumDsl.g:431:45: (iv_ruleFill= ruleFill EOF )
            // InternalSeleniumDsl.g:432:2: iv_ruleFill= ruleFill EOF
            {
             newCompositeNode(grammarAccess.getFillRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFill=ruleFill();

            state._fsp--;

             current =iv_ruleFill; 
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
    // $ANTLR end "entryRuleFill"


    // $ANTLR start "ruleFill"
    // InternalSeleniumDsl.g:438:1: ruleFill returns [EObject current=null] : (otherlv_0= 'fill' ( (lv_element_1_0= ruleSelector ) ) ( (lv_fieldName_2_0= RULE_STRING ) ) otherlv_3= 'with' otherlv_4= 'the' ( (otherlv_5= 'text' ( (lv_textToFill_6_0= RULE_STRING ) ) ) | (otherlv_7= 'variable' ( (lv_variable_8_0= ruleElementType ) ) ) ) ) ;
    public final EObject ruleFill() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_fieldName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_textToFill_6_0=null;
        Token otherlv_7=null;
        EObject lv_element_1_0 = null;

        AntlrDatatypeRuleToken lv_variable_8_0 = null;



        	enterRule();

        try {
            // InternalSeleniumDsl.g:444:2: ( (otherlv_0= 'fill' ( (lv_element_1_0= ruleSelector ) ) ( (lv_fieldName_2_0= RULE_STRING ) ) otherlv_3= 'with' otherlv_4= 'the' ( (otherlv_5= 'text' ( (lv_textToFill_6_0= RULE_STRING ) ) ) | (otherlv_7= 'variable' ( (lv_variable_8_0= ruleElementType ) ) ) ) ) )
            // InternalSeleniumDsl.g:445:2: (otherlv_0= 'fill' ( (lv_element_1_0= ruleSelector ) ) ( (lv_fieldName_2_0= RULE_STRING ) ) otherlv_3= 'with' otherlv_4= 'the' ( (otherlv_5= 'text' ( (lv_textToFill_6_0= RULE_STRING ) ) ) | (otherlv_7= 'variable' ( (lv_variable_8_0= ruleElementType ) ) ) ) )
            {
            // InternalSeleniumDsl.g:445:2: (otherlv_0= 'fill' ( (lv_element_1_0= ruleSelector ) ) ( (lv_fieldName_2_0= RULE_STRING ) ) otherlv_3= 'with' otherlv_4= 'the' ( (otherlv_5= 'text' ( (lv_textToFill_6_0= RULE_STRING ) ) ) | (otherlv_7= 'variable' ( (lv_variable_8_0= ruleElementType ) ) ) ) )
            // InternalSeleniumDsl.g:446:3: otherlv_0= 'fill' ( (lv_element_1_0= ruleSelector ) ) ( (lv_fieldName_2_0= RULE_STRING ) ) otherlv_3= 'with' otherlv_4= 'the' ( (otherlv_5= 'text' ( (lv_textToFill_6_0= RULE_STRING ) ) ) | (otherlv_7= 'variable' ( (lv_variable_8_0= ruleElementType ) ) ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getFillAccess().getFillKeyword_0());
            		
            // InternalSeleniumDsl.g:450:3: ( (lv_element_1_0= ruleSelector ) )
            // InternalSeleniumDsl.g:451:4: (lv_element_1_0= ruleSelector )
            {
            // InternalSeleniumDsl.g:451:4: (lv_element_1_0= ruleSelector )
            // InternalSeleniumDsl.g:452:5: lv_element_1_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getFillAccess().getElementSelectorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_element_1_0=ruleSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFillRule());
            					}
            					set(
            						current,
            						"element",
            						lv_element_1_0,
            						"www.imta.fr.browserautomation.SeleniumDsl.Selector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSeleniumDsl.g:469:3: ( (lv_fieldName_2_0= RULE_STRING ) )
            // InternalSeleniumDsl.g:470:4: (lv_fieldName_2_0= RULE_STRING )
            {
            // InternalSeleniumDsl.g:470:4: (lv_fieldName_2_0= RULE_STRING )
            // InternalSeleniumDsl.g:471:5: lv_fieldName_2_0= RULE_STRING
            {
            lv_fieldName_2_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_fieldName_2_0, grammarAccess.getFillAccess().getFieldNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFillRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fieldName",
            						lv_fieldName_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getFillAccess().getWithKeyword_3());
            		
            otherlv_4=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getFillAccess().getTheKeyword_4());
            		
            // InternalSeleniumDsl.g:495:3: ( (otherlv_5= 'text' ( (lv_textToFill_6_0= RULE_STRING ) ) ) | (otherlv_7= 'variable' ( (lv_variable_8_0= ruleElementType ) ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==29) ) {
                alt4=1;
            }
            else if ( (LA4_0==26) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSeleniumDsl.g:496:4: (otherlv_5= 'text' ( (lv_textToFill_6_0= RULE_STRING ) ) )
                    {
                    // InternalSeleniumDsl.g:496:4: (otherlv_5= 'text' ( (lv_textToFill_6_0= RULE_STRING ) ) )
                    // InternalSeleniumDsl.g:497:5: otherlv_5= 'text' ( (lv_textToFill_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,29,FOLLOW_13); 

                    					newLeafNode(otherlv_5, grammarAccess.getFillAccess().getTextKeyword_5_0_0());
                    				
                    // InternalSeleniumDsl.g:501:5: ( (lv_textToFill_6_0= RULE_STRING ) )
                    // InternalSeleniumDsl.g:502:6: (lv_textToFill_6_0= RULE_STRING )
                    {
                    // InternalSeleniumDsl.g:502:6: (lv_textToFill_6_0= RULE_STRING )
                    // InternalSeleniumDsl.g:503:7: lv_textToFill_6_0= RULE_STRING
                    {
                    lv_textToFill_6_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    							newLeafNode(lv_textToFill_6_0, grammarAccess.getFillAccess().getTextToFillSTRINGTerminalRuleCall_5_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getFillRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"textToFill",
                    								lv_textToFill_6_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDsl.g:521:4: (otherlv_7= 'variable' ( (lv_variable_8_0= ruleElementType ) ) )
                    {
                    // InternalSeleniumDsl.g:521:4: (otherlv_7= 'variable' ( (lv_variable_8_0= ruleElementType ) ) )
                    // InternalSeleniumDsl.g:522:5: otherlv_7= 'variable' ( (lv_variable_8_0= ruleElementType ) )
                    {
                    otherlv_7=(Token)match(input,26,FOLLOW_14); 

                    					newLeafNode(otherlv_7, grammarAccess.getFillAccess().getVariableKeyword_5_1_0());
                    				
                    // InternalSeleniumDsl.g:526:5: ( (lv_variable_8_0= ruleElementType ) )
                    // InternalSeleniumDsl.g:527:6: (lv_variable_8_0= ruleElementType )
                    {
                    // InternalSeleniumDsl.g:527:6: (lv_variable_8_0= ruleElementType )
                    // InternalSeleniumDsl.g:528:7: lv_variable_8_0= ruleElementType
                    {

                    							newCompositeNode(grammarAccess.getFillAccess().getVariableElementTypeParserRuleCall_5_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_variable_8_0=ruleElementType();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getFillRule());
                    							}
                    							set(
                    								current,
                    								"variable",
                    								lv_variable_8_0,
                    								"www.imta.fr.browserautomation.SeleniumDsl.ElementType");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleFill"


    // $ANTLR start "entryRuleSelector"
    // InternalSeleniumDsl.g:551:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // InternalSeleniumDsl.g:551:49: (iv_ruleSelector= ruleSelector EOF )
            // InternalSeleniumDsl.g:552:2: iv_ruleSelector= ruleSelector EOF
            {
             newCompositeNode(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelector=ruleSelector();

            state._fsp--;

             current =iv_ruleSelector; 
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
    // $ANTLR end "entryRuleSelector"


    // $ANTLR start "ruleSelector"
    // InternalSeleniumDsl.g:558:1: ruleSelector returns [EObject current=null] : ( (otherlv_0= 'the' ( (lv_elementType_1_0= ruleElementType ) ) )? ( (lv_elementType_2_0= ruleElementType ) )? ) ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_elementType_1_0 = null;

        AntlrDatatypeRuleToken lv_elementType_2_0 = null;



        	enterRule();

        try {
            // InternalSeleniumDsl.g:564:2: ( ( (otherlv_0= 'the' ( (lv_elementType_1_0= ruleElementType ) ) )? ( (lv_elementType_2_0= ruleElementType ) )? ) )
            // InternalSeleniumDsl.g:565:2: ( (otherlv_0= 'the' ( (lv_elementType_1_0= ruleElementType ) ) )? ( (lv_elementType_2_0= ruleElementType ) )? )
            {
            // InternalSeleniumDsl.g:565:2: ( (otherlv_0= 'the' ( (lv_elementType_1_0= ruleElementType ) ) )? ( (lv_elementType_2_0= ruleElementType ) )? )
            // InternalSeleniumDsl.g:566:3: (otherlv_0= 'the' ( (lv_elementType_1_0= ruleElementType ) ) )? ( (lv_elementType_2_0= ruleElementType ) )?
            {
            // InternalSeleniumDsl.g:566:3: (otherlv_0= 'the' ( (lv_elementType_1_0= ruleElementType ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSeleniumDsl.g:567:4: otherlv_0= 'the' ( (lv_elementType_1_0= ruleElementType ) )
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_14); 

                    				newLeafNode(otherlv_0, grammarAccess.getSelectorAccess().getTheKeyword_0_0());
                    			
                    // InternalSeleniumDsl.g:571:4: ( (lv_elementType_1_0= ruleElementType ) )
                    // InternalSeleniumDsl.g:572:5: (lv_elementType_1_0= ruleElementType )
                    {
                    // InternalSeleniumDsl.g:572:5: (lv_elementType_1_0= ruleElementType )
                    // InternalSeleniumDsl.g:573:6: lv_elementType_1_0= ruleElementType
                    {

                    						newCompositeNode(grammarAccess.getSelectorAccess().getElementTypeElementTypeParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_elementType_1_0=ruleElementType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectorRule());
                    						}
                    						set(
                    							current,
                    							"elementType",
                    							lv_elementType_1_0,
                    							"www.imta.fr.browserautomation.SeleniumDsl.ElementType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSeleniumDsl.g:591:3: ( (lv_elementType_2_0= ruleElementType ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19||(LA6_0>=23 && LA6_0<=25)||LA6_0==29||(LA6_0>=31 && LA6_0<=34)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSeleniumDsl.g:592:4: (lv_elementType_2_0= ruleElementType )
                    {
                    // InternalSeleniumDsl.g:592:4: (lv_elementType_2_0= ruleElementType )
                    // InternalSeleniumDsl.g:593:5: lv_elementType_2_0= ruleElementType
                    {

                    					newCompositeNode(grammarAccess.getSelectorAccess().getElementTypeElementTypeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_elementType_2_0=ruleElementType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSelectorRule());
                    					}
                    					set(
                    						current,
                    						"elementType",
                    						lv_elementType_2_0,
                    						"www.imta.fr.browserautomation.SeleniumDsl.ElementType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleElementType"
    // InternalSeleniumDsl.g:614:1: entryRuleElementType returns [String current=null] : iv_ruleElementType= ruleElementType EOF ;
    public final String entryRuleElementType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleElementType = null;


        try {
            // InternalSeleniumDsl.g:614:51: (iv_ruleElementType= ruleElementType EOF )
            // InternalSeleniumDsl.g:615:2: iv_ruleElementType= ruleElementType EOF
            {
             newCompositeNode(grammarAccess.getElementTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementType=ruleElementType();

            state._fsp--;

             current =iv_ruleElementType.getText(); 
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
    // $ANTLR end "entryRuleElementType"


    // $ANTLR start "ruleElementType"
    // InternalSeleniumDsl.g:621:1: ruleElementType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'text' kw= 'field' ) | kw= 'checkboxes' | kw= 'combobox' | kw= 'option' | kw= 'link' | kw= 'button' | kw= 'image' | kw= 'url' | (kw= 'text' kw= 'link' ) | kw= 'title' ) ;
    public final AntlrDatatypeRuleToken ruleElementType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSeleniumDsl.g:627:2: ( ( (kw= 'text' kw= 'field' ) | kw= 'checkboxes' | kw= 'combobox' | kw= 'option' | kw= 'link' | kw= 'button' | kw= 'image' | kw= 'url' | (kw= 'text' kw= 'link' ) | kw= 'title' ) )
            // InternalSeleniumDsl.g:628:2: ( (kw= 'text' kw= 'field' ) | kw= 'checkboxes' | kw= 'combobox' | kw= 'option' | kw= 'link' | kw= 'button' | kw= 'image' | kw= 'url' | (kw= 'text' kw= 'link' ) | kw= 'title' )
            {
            // InternalSeleniumDsl.g:628:2: ( (kw= 'text' kw= 'field' ) | kw= 'checkboxes' | kw= 'combobox' | kw= 'option' | kw= 'link' | kw= 'button' | kw= 'image' | kw= 'url' | (kw= 'text' kw= 'link' ) | kw= 'title' )
            int alt7=10;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalSeleniumDsl.g:629:3: (kw= 'text' kw= 'field' )
                    {
                    // InternalSeleniumDsl.g:629:3: (kw= 'text' kw= 'field' )
                    // InternalSeleniumDsl.g:630:4: kw= 'text' kw= 'field'
                    {
                    kw=(Token)match(input,29,FOLLOW_19); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getElementTypeAccess().getTextKeyword_0_0());
                    			
                    kw=(Token)match(input,30,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getElementTypeAccess().getFieldKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDsl.g:642:3: kw= 'checkboxes'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementTypeAccess().getCheckboxesKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSeleniumDsl.g:648:3: kw= 'combobox'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementTypeAccess().getComboboxKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSeleniumDsl.g:654:3: kw= 'option'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementTypeAccess().getOptionKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSeleniumDsl.g:660:3: kw= 'link'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementTypeAccess().getLinkKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalSeleniumDsl.g:666:3: kw= 'button'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementTypeAccess().getButtonKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalSeleniumDsl.g:672:3: kw= 'image'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementTypeAccess().getImageKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalSeleniumDsl.g:678:3: kw= 'url'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementTypeAccess().getUrlKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalSeleniumDsl.g:684:3: (kw= 'text' kw= 'link' )
                    {
                    // InternalSeleniumDsl.g:684:3: (kw= 'text' kw= 'link' )
                    // InternalSeleniumDsl.g:685:4: kw= 'text' kw= 'link'
                    {
                    kw=(Token)match(input,29,FOLLOW_20); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getElementTypeAccess().getTextKeyword_8_0());
                    			
                    kw=(Token)match(input,23,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getElementTypeAccess().getLinkKeyword_8_1());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalSeleniumDsl.g:697:3: kw= 'title'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementTypeAccess().getTitleKeyword_9());
                    		

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
    // $ANTLR end "ruleElementType"


    // $ANTLR start "entryRuleSelect"
    // InternalSeleniumDsl.g:706:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // InternalSeleniumDsl.g:706:47: (iv_ruleSelect= ruleSelect EOF )
            // InternalSeleniumDsl.g:707:2: iv_ruleSelect= ruleSelect EOF
            {
             newCompositeNode(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelect=ruleSelect();

            state._fsp--;

             current =iv_ruleSelect; 
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
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // InternalSeleniumDsl.g:713:1: ruleSelect returns [EObject current=null] : ( () otherlv_1= 'check' ( (lv_elementType_2_0= ruleSelector ) ) ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_values_3_0=null;
        Token otherlv_4=null;
        Token lv_values_5_0=null;
        EObject lv_elementType_2_0 = null;



        	enterRule();

        try {
            // InternalSeleniumDsl.g:719:2: ( ( () otherlv_1= 'check' ( (lv_elementType_2_0= ruleSelector ) ) ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* ) )
            // InternalSeleniumDsl.g:720:2: ( () otherlv_1= 'check' ( (lv_elementType_2_0= ruleSelector ) ) ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* )
            {
            // InternalSeleniumDsl.g:720:2: ( () otherlv_1= 'check' ( (lv_elementType_2_0= ruleSelector ) ) ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* )
            // InternalSeleniumDsl.g:721:3: () otherlv_1= 'check' ( (lv_elementType_2_0= ruleSelector ) ) ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )*
            {
            // InternalSeleniumDsl.g:721:3: ()
            // InternalSeleniumDsl.g:722:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSelectAccess().getSelectAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getSelectAccess().getCheckKeyword_1());
            		
            // InternalSeleniumDsl.g:732:3: ( (lv_elementType_2_0= ruleSelector ) )
            // InternalSeleniumDsl.g:733:4: (lv_elementType_2_0= ruleSelector )
            {
            // InternalSeleniumDsl.g:733:4: (lv_elementType_2_0= ruleSelector )
            // InternalSeleniumDsl.g:734:5: lv_elementType_2_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getSelectAccess().getElementTypeSelectorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_elementType_2_0=ruleSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectRule());
            					}
            					set(
            						current,
            						"elementType",
            						lv_elementType_2_0,
            						"www.imta.fr.browserautomation.SeleniumDsl.Selector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSeleniumDsl.g:751:3: ( (lv_values_3_0= RULE_STRING ) )
            // InternalSeleniumDsl.g:752:4: (lv_values_3_0= RULE_STRING )
            {
            // InternalSeleniumDsl.g:752:4: (lv_values_3_0= RULE_STRING )
            // InternalSeleniumDsl.g:753:5: lv_values_3_0= RULE_STRING
            {
            lv_values_3_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            					newLeafNode(lv_values_3_0, grammarAccess.getSelectAccess().getValuesSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectRule());
            					}
            					addWithLastConsumed(
            						current,
            						"values",
            						lv_values_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalSeleniumDsl.g:769:3: (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==36) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSeleniumDsl.g:770:4: otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,36,FOLLOW_13); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSelectAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalSeleniumDsl.g:774:4: ( (lv_values_5_0= RULE_STRING ) )
            	    // InternalSeleniumDsl.g:775:5: (lv_values_5_0= RULE_STRING )
            	    {
            	    // InternalSeleniumDsl.g:775:5: (lv_values_5_0= RULE_STRING )
            	    // InternalSeleniumDsl.g:776:6: lv_values_5_0= RULE_STRING
            	    {
            	    lv_values_5_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            	    						newLeafNode(lv_values_5_0, grammarAccess.getSelectAccess().getValuesSTRINGTerminalRuleCall_4_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSelectRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"values",
            	    							lv_values_5_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


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
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleVerify"
    // InternalSeleniumDsl.g:797:1: entryRuleVerify returns [EObject current=null] : iv_ruleVerify= ruleVerify EOF ;
    public final EObject entryRuleVerify() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerify = null;


        try {
            // InternalSeleniumDsl.g:797:47: (iv_ruleVerify= ruleVerify EOF )
            // InternalSeleniumDsl.g:798:2: iv_ruleVerify= ruleVerify EOF
            {
             newCompositeNode(grammarAccess.getVerifyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVerify=ruleVerify();

            state._fsp--;

             current =iv_ruleVerify; 
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
    // $ANTLR end "entryRuleVerify"


    // $ANTLR start "ruleVerify"
    // InternalSeleniumDsl.g:804:1: ruleVerify returns [EObject current=null] : (otherlv_0= 'verify' otherlv_1= 'that' otherlv_2= 'the' otherlv_3= 'page' otherlv_4= 'contains' otherlv_5= 'the' ( (otherlv_6= 'string' ( (lv_textToVerify_7_0= RULE_STRING ) ) ) | (otherlv_8= 'link' ( (lv_linkToVerify_9_0= RULE_STRING ) ) ) | (otherlv_10= 'variable' ( (lv_variable_11_0= ruleElementType ) ) ) ) ) ;
    public final EObject ruleVerify() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_textToVerify_7_0=null;
        Token otherlv_8=null;
        Token lv_linkToVerify_9_0=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_variable_11_0 = null;



        	enterRule();

        try {
            // InternalSeleniumDsl.g:810:2: ( (otherlv_0= 'verify' otherlv_1= 'that' otherlv_2= 'the' otherlv_3= 'page' otherlv_4= 'contains' otherlv_5= 'the' ( (otherlv_6= 'string' ( (lv_textToVerify_7_0= RULE_STRING ) ) ) | (otherlv_8= 'link' ( (lv_linkToVerify_9_0= RULE_STRING ) ) ) | (otherlv_10= 'variable' ( (lv_variable_11_0= ruleElementType ) ) ) ) ) )
            // InternalSeleniumDsl.g:811:2: (otherlv_0= 'verify' otherlv_1= 'that' otherlv_2= 'the' otherlv_3= 'page' otherlv_4= 'contains' otherlv_5= 'the' ( (otherlv_6= 'string' ( (lv_textToVerify_7_0= RULE_STRING ) ) ) | (otherlv_8= 'link' ( (lv_linkToVerify_9_0= RULE_STRING ) ) ) | (otherlv_10= 'variable' ( (lv_variable_11_0= ruleElementType ) ) ) ) )
            {
            // InternalSeleniumDsl.g:811:2: (otherlv_0= 'verify' otherlv_1= 'that' otherlv_2= 'the' otherlv_3= 'page' otherlv_4= 'contains' otherlv_5= 'the' ( (otherlv_6= 'string' ( (lv_textToVerify_7_0= RULE_STRING ) ) ) | (otherlv_8= 'link' ( (lv_linkToVerify_9_0= RULE_STRING ) ) ) | (otherlv_10= 'variable' ( (lv_variable_11_0= ruleElementType ) ) ) ) )
            // InternalSeleniumDsl.g:812:3: otherlv_0= 'verify' otherlv_1= 'that' otherlv_2= 'the' otherlv_3= 'page' otherlv_4= 'contains' otherlv_5= 'the' ( (otherlv_6= 'string' ( (lv_textToVerify_7_0= RULE_STRING ) ) ) | (otherlv_8= 'link' ( (lv_linkToVerify_9_0= RULE_STRING ) ) ) | (otherlv_10= 'variable' ( (lv_variable_11_0= ruleElementType ) ) ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getVerifyAccess().getVerifyKeyword_0());
            		
            otherlv_1=(Token)match(input,38,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getVerifyAccess().getThatKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getVerifyAccess().getTheKeyword_2());
            		
            otherlv_3=(Token)match(input,39,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getVerifyAccess().getPageKeyword_3());
            		
            otherlv_4=(Token)match(input,40,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getVerifyAccess().getContainsKeyword_4());
            		
            otherlv_5=(Token)match(input,22,FOLLOW_25); 

            			newLeafNode(otherlv_5, grammarAccess.getVerifyAccess().getTheKeyword_5());
            		
            // InternalSeleniumDsl.g:836:3: ( (otherlv_6= 'string' ( (lv_textToVerify_7_0= RULE_STRING ) ) ) | (otherlv_8= 'link' ( (lv_linkToVerify_9_0= RULE_STRING ) ) ) | (otherlv_10= 'variable' ( (lv_variable_11_0= ruleElementType ) ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt9=1;
                }
                break;
            case 23:
                {
                alt9=2;
                }
                break;
            case 26:
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
                    // InternalSeleniumDsl.g:837:4: (otherlv_6= 'string' ( (lv_textToVerify_7_0= RULE_STRING ) ) )
                    {
                    // InternalSeleniumDsl.g:837:4: (otherlv_6= 'string' ( (lv_textToVerify_7_0= RULE_STRING ) ) )
                    // InternalSeleniumDsl.g:838:5: otherlv_6= 'string' ( (lv_textToVerify_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,41,FOLLOW_13); 

                    					newLeafNode(otherlv_6, grammarAccess.getVerifyAccess().getStringKeyword_6_0_0());
                    				
                    // InternalSeleniumDsl.g:842:5: ( (lv_textToVerify_7_0= RULE_STRING ) )
                    // InternalSeleniumDsl.g:843:6: (lv_textToVerify_7_0= RULE_STRING )
                    {
                    // InternalSeleniumDsl.g:843:6: (lv_textToVerify_7_0= RULE_STRING )
                    // InternalSeleniumDsl.g:844:7: lv_textToVerify_7_0= RULE_STRING
                    {
                    lv_textToVerify_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    							newLeafNode(lv_textToVerify_7_0, grammarAccess.getVerifyAccess().getTextToVerifySTRINGTerminalRuleCall_6_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getVerifyRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"textToVerify",
                    								lv_textToVerify_7_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDsl.g:862:4: (otherlv_8= 'link' ( (lv_linkToVerify_9_0= RULE_STRING ) ) )
                    {
                    // InternalSeleniumDsl.g:862:4: (otherlv_8= 'link' ( (lv_linkToVerify_9_0= RULE_STRING ) ) )
                    // InternalSeleniumDsl.g:863:5: otherlv_8= 'link' ( (lv_linkToVerify_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,23,FOLLOW_13); 

                    					newLeafNode(otherlv_8, grammarAccess.getVerifyAccess().getLinkKeyword_6_1_0());
                    				
                    // InternalSeleniumDsl.g:867:5: ( (lv_linkToVerify_9_0= RULE_STRING ) )
                    // InternalSeleniumDsl.g:868:6: (lv_linkToVerify_9_0= RULE_STRING )
                    {
                    // InternalSeleniumDsl.g:868:6: (lv_linkToVerify_9_0= RULE_STRING )
                    // InternalSeleniumDsl.g:869:7: lv_linkToVerify_9_0= RULE_STRING
                    {
                    lv_linkToVerify_9_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    							newLeafNode(lv_linkToVerify_9_0, grammarAccess.getVerifyAccess().getLinkToVerifySTRINGTerminalRuleCall_6_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getVerifyRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"linkToVerify",
                    								lv_linkToVerify_9_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSeleniumDsl.g:887:4: (otherlv_10= 'variable' ( (lv_variable_11_0= ruleElementType ) ) )
                    {
                    // InternalSeleniumDsl.g:887:4: (otherlv_10= 'variable' ( (lv_variable_11_0= ruleElementType ) ) )
                    // InternalSeleniumDsl.g:888:5: otherlv_10= 'variable' ( (lv_variable_11_0= ruleElementType ) )
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_14); 

                    					newLeafNode(otherlv_10, grammarAccess.getVerifyAccess().getVariableKeyword_6_2_0());
                    				
                    // InternalSeleniumDsl.g:892:5: ( (lv_variable_11_0= ruleElementType ) )
                    // InternalSeleniumDsl.g:893:6: (lv_variable_11_0= ruleElementType )
                    {
                    // InternalSeleniumDsl.g:893:6: (lv_variable_11_0= ruleElementType )
                    // InternalSeleniumDsl.g:894:7: lv_variable_11_0= ruleElementType
                    {

                    							newCompositeNode(grammarAccess.getVerifyAccess().getVariableElementTypeParserRuleCall_6_2_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_variable_11_0=ruleElementType();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getVerifyRule());
                    							}
                    							set(
                    								current,
                    								"variable",
                    								lv_variable_11_0,
                    								"www.imta.fr.browserautomation.SeleniumDsl.ElementType");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleVerify"


    // $ANTLR start "entryRuleRead"
    // InternalSeleniumDsl.g:917:1: entryRuleRead returns [EObject current=null] : iv_ruleRead= ruleRead EOF ;
    public final EObject entryRuleRead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRead = null;


        try {
            // InternalSeleniumDsl.g:917:45: (iv_ruleRead= ruleRead EOF )
            // InternalSeleniumDsl.g:918:2: iv_ruleRead= ruleRead EOF
            {
             newCompositeNode(grammarAccess.getReadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRead=ruleRead();

            state._fsp--;

             current =iv_ruleRead; 
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
    // $ANTLR end "entryRuleRead"


    // $ANTLR start "ruleRead"
    // InternalSeleniumDsl.g:924:1: ruleRead returns [EObject current=null] : (otherlv_0= 'read' otherlv_1= 'the' ( (lv_elements_2_0= ruleElementType ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleElementType ) ) )* otherlv_5= 'of' otherlv_6= 'the' otherlv_7= 'link' ( (lv_linkText_8_0= RULE_STRING ) ) otherlv_9= 'number' ( (lv_number_10_0= RULE_INT ) ) ) ;
    public final EObject ruleRead() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_linkText_8_0=null;
        Token otherlv_9=null;
        Token lv_number_10_0=null;
        AntlrDatatypeRuleToken lv_elements_2_0 = null;

        AntlrDatatypeRuleToken lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalSeleniumDsl.g:930:2: ( (otherlv_0= 'read' otherlv_1= 'the' ( (lv_elements_2_0= ruleElementType ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleElementType ) ) )* otherlv_5= 'of' otherlv_6= 'the' otherlv_7= 'link' ( (lv_linkText_8_0= RULE_STRING ) ) otherlv_9= 'number' ( (lv_number_10_0= RULE_INT ) ) ) )
            // InternalSeleniumDsl.g:931:2: (otherlv_0= 'read' otherlv_1= 'the' ( (lv_elements_2_0= ruleElementType ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleElementType ) ) )* otherlv_5= 'of' otherlv_6= 'the' otherlv_7= 'link' ( (lv_linkText_8_0= RULE_STRING ) ) otherlv_9= 'number' ( (lv_number_10_0= RULE_INT ) ) )
            {
            // InternalSeleniumDsl.g:931:2: (otherlv_0= 'read' otherlv_1= 'the' ( (lv_elements_2_0= ruleElementType ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleElementType ) ) )* otherlv_5= 'of' otherlv_6= 'the' otherlv_7= 'link' ( (lv_linkText_8_0= RULE_STRING ) ) otherlv_9= 'number' ( (lv_number_10_0= RULE_INT ) ) )
            // InternalSeleniumDsl.g:932:3: otherlv_0= 'read' otherlv_1= 'the' ( (lv_elements_2_0= ruleElementType ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleElementType ) ) )* otherlv_5= 'of' otherlv_6= 'the' otherlv_7= 'link' ( (lv_linkText_8_0= RULE_STRING ) ) otherlv_9= 'number' ( (lv_number_10_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getReadAccess().getReadKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getReadAccess().getTheKeyword_1());
            		
            // InternalSeleniumDsl.g:940:3: ( (lv_elements_2_0= ruleElementType ) )
            // InternalSeleniumDsl.g:941:4: (lv_elements_2_0= ruleElementType )
            {
            // InternalSeleniumDsl.g:941:4: (lv_elements_2_0= ruleElementType )
            // InternalSeleniumDsl.g:942:5: lv_elements_2_0= ruleElementType
            {

            					newCompositeNode(grammarAccess.getReadAccess().getElementsElementTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_26);
            lv_elements_2_0=ruleElementType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReadRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_2_0,
            						"www.imta.fr.browserautomation.SeleniumDsl.ElementType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSeleniumDsl.g:959:3: (otherlv_3= ',' ( (lv_elements_4_0= ruleElementType ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==36) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSeleniumDsl.g:960:4: otherlv_3= ',' ( (lv_elements_4_0= ruleElementType ) )
            	    {
            	    otherlv_3=(Token)match(input,36,FOLLOW_14); 

            	    				newLeafNode(otherlv_3, grammarAccess.getReadAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalSeleniumDsl.g:964:4: ( (lv_elements_4_0= ruleElementType ) )
            	    // InternalSeleniumDsl.g:965:5: (lv_elements_4_0= ruleElementType )
            	    {
            	    // InternalSeleniumDsl.g:965:5: (lv_elements_4_0= ruleElementType )
            	    // InternalSeleniumDsl.g:966:6: lv_elements_4_0= ruleElementType
            	    {

            	    						newCompositeNode(grammarAccess.getReadAccess().getElementsElementTypeParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_elements_4_0=ruleElementType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getReadRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elements",
            	    							lv_elements_4_0,
            	    							"www.imta.fr.browserautomation.SeleniumDsl.ElementType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_5=(Token)match(input,43,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getReadAccess().getOfKeyword_4());
            		
            otherlv_6=(Token)match(input,22,FOLLOW_20); 

            			newLeafNode(otherlv_6, grammarAccess.getReadAccess().getTheKeyword_5());
            		
            otherlv_7=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getReadAccess().getLinkKeyword_6());
            		
            // InternalSeleniumDsl.g:996:3: ( (lv_linkText_8_0= RULE_STRING ) )
            // InternalSeleniumDsl.g:997:4: (lv_linkText_8_0= RULE_STRING )
            {
            // InternalSeleniumDsl.g:997:4: (lv_linkText_8_0= RULE_STRING )
            // InternalSeleniumDsl.g:998:5: lv_linkText_8_0= RULE_STRING
            {
            lv_linkText_8_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(lv_linkText_8_0, grammarAccess.getReadAccess().getLinkTextSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReadRule());
            					}
            					setWithLastConsumed(
            						current,
            						"linkText",
            						lv_linkText_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,44,FOLLOW_28); 

            			newLeafNode(otherlv_9, grammarAccess.getReadAccess().getNumberKeyword_8());
            		
            // InternalSeleniumDsl.g:1018:3: ( (lv_number_10_0= RULE_INT ) )
            // InternalSeleniumDsl.g:1019:4: (lv_number_10_0= RULE_INT )
            {
            // InternalSeleniumDsl.g:1019:4: (lv_number_10_0= RULE_INT )
            // InternalSeleniumDsl.g:1020:5: lv_number_10_0= RULE_INT
            {
            lv_number_10_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_number_10_0, grammarAccess.getReadAccess().getNumberINTTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReadRule());
            					}
            					setWithLastConsumed(
            						current,
            						"number",
            						lv_number_10_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleRead"


    // $ANTLR start "entryRuleUncheck"
    // InternalSeleniumDsl.g:1040:1: entryRuleUncheck returns [EObject current=null] : iv_ruleUncheck= ruleUncheck EOF ;
    public final EObject entryRuleUncheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUncheck = null;


        try {
            // InternalSeleniumDsl.g:1040:48: (iv_ruleUncheck= ruleUncheck EOF )
            // InternalSeleniumDsl.g:1041:2: iv_ruleUncheck= ruleUncheck EOF
            {
             newCompositeNode(grammarAccess.getUncheckRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUncheck=ruleUncheck();

            state._fsp--;

             current =iv_ruleUncheck; 
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
    // $ANTLR end "entryRuleUncheck"


    // $ANTLR start "ruleUncheck"
    // InternalSeleniumDsl.g:1047:1: ruleUncheck returns [EObject current=null] : ( () otherlv_1= 'uncheck' otherlv_2= 'all' otherlv_3= 'checkboxes' ) ;
    public final EObject ruleUncheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSeleniumDsl.g:1053:2: ( ( () otherlv_1= 'uncheck' otherlv_2= 'all' otherlv_3= 'checkboxes' ) )
            // InternalSeleniumDsl.g:1054:2: ( () otherlv_1= 'uncheck' otherlv_2= 'all' otherlv_3= 'checkboxes' )
            {
            // InternalSeleniumDsl.g:1054:2: ( () otherlv_1= 'uncheck' otherlv_2= 'all' otherlv_3= 'checkboxes' )
            // InternalSeleniumDsl.g:1055:3: () otherlv_1= 'uncheck' otherlv_2= 'all' otherlv_3= 'checkboxes'
            {
            // InternalSeleniumDsl.g:1055:3: ()
            // InternalSeleniumDsl.g:1056:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUncheckAccess().getUncheckAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getUncheckAccess().getUncheckKeyword_1());
            		
            otherlv_2=(Token)match(input,46,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getUncheckAccess().getAllKeyword_2());
            		
            otherlv_3=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getUncheckAccess().getCheckboxesKeyword_3());
            		

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
    // $ANTLR end "ruleUncheck"


    // $ANTLR start "entryRuleCombobox"
    // InternalSeleniumDsl.g:1078:1: entryRuleCombobox returns [EObject current=null] : iv_ruleCombobox= ruleCombobox EOF ;
    public final EObject entryRuleCombobox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCombobox = null;


        try {
            // InternalSeleniumDsl.g:1078:49: (iv_ruleCombobox= ruleCombobox EOF )
            // InternalSeleniumDsl.g:1079:2: iv_ruleCombobox= ruleCombobox EOF
            {
             newCompositeNode(grammarAccess.getComboboxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCombobox=ruleCombobox();

            state._fsp--;

             current =iv_ruleCombobox; 
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
    // $ANTLR end "entryRuleCombobox"


    // $ANTLR start "ruleCombobox"
    // InternalSeleniumDsl.g:1085:1: ruleCombobox returns [EObject current=null] : (otherlv_0= 'choose' ( (lv_elements_1_0= ruleSelector ) ) ( (lv_option_2_0= RULE_STRING ) ) otherlv_3= 'in' ( (lv_elements_4_0= ruleSelector ) ) ( (lv_label_5_0= RULE_STRING ) ) ) ;
    public final EObject ruleCombobox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_option_2_0=null;
        Token otherlv_3=null;
        Token lv_label_5_0=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalSeleniumDsl.g:1091:2: ( (otherlv_0= 'choose' ( (lv_elements_1_0= ruleSelector ) ) ( (lv_option_2_0= RULE_STRING ) ) otherlv_3= 'in' ( (lv_elements_4_0= ruleSelector ) ) ( (lv_label_5_0= RULE_STRING ) ) ) )
            // InternalSeleniumDsl.g:1092:2: (otherlv_0= 'choose' ( (lv_elements_1_0= ruleSelector ) ) ( (lv_option_2_0= RULE_STRING ) ) otherlv_3= 'in' ( (lv_elements_4_0= ruleSelector ) ) ( (lv_label_5_0= RULE_STRING ) ) )
            {
            // InternalSeleniumDsl.g:1092:2: (otherlv_0= 'choose' ( (lv_elements_1_0= ruleSelector ) ) ( (lv_option_2_0= RULE_STRING ) ) otherlv_3= 'in' ( (lv_elements_4_0= ruleSelector ) ) ( (lv_label_5_0= RULE_STRING ) ) )
            // InternalSeleniumDsl.g:1093:3: otherlv_0= 'choose' ( (lv_elements_1_0= ruleSelector ) ) ( (lv_option_2_0= RULE_STRING ) ) otherlv_3= 'in' ( (lv_elements_4_0= ruleSelector ) ) ( (lv_label_5_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getComboboxAccess().getChooseKeyword_0());
            		
            // InternalSeleniumDsl.g:1097:3: ( (lv_elements_1_0= ruleSelector ) )
            // InternalSeleniumDsl.g:1098:4: (lv_elements_1_0= ruleSelector )
            {
            // InternalSeleniumDsl.g:1098:4: (lv_elements_1_0= ruleSelector )
            // InternalSeleniumDsl.g:1099:5: lv_elements_1_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getComboboxAccess().getElementsSelectorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_elements_1_0=ruleSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComboboxRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_1_0,
            						"www.imta.fr.browserautomation.SeleniumDsl.Selector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSeleniumDsl.g:1116:3: ( (lv_option_2_0= RULE_STRING ) )
            // InternalSeleniumDsl.g:1117:4: (lv_option_2_0= RULE_STRING )
            {
            // InternalSeleniumDsl.g:1117:4: (lv_option_2_0= RULE_STRING )
            // InternalSeleniumDsl.g:1118:5: lv_option_2_0= RULE_STRING
            {
            lv_option_2_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

            					newLeafNode(lv_option_2_0, grammarAccess.getComboboxAccess().getOptionSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComboboxRule());
            					}
            					setWithLastConsumed(
            						current,
            						"option",
            						lv_option_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,48,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getComboboxAccess().getInKeyword_3());
            		
            // InternalSeleniumDsl.g:1138:3: ( (lv_elements_4_0= ruleSelector ) )
            // InternalSeleniumDsl.g:1139:4: (lv_elements_4_0= ruleSelector )
            {
            // InternalSeleniumDsl.g:1139:4: (lv_elements_4_0= ruleSelector )
            // InternalSeleniumDsl.g:1140:5: lv_elements_4_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getComboboxAccess().getElementsSelectorParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_elements_4_0=ruleSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComboboxRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_4_0,
            						"www.imta.fr.browserautomation.SeleniumDsl.Selector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSeleniumDsl.g:1157:3: ( (lv_label_5_0= RULE_STRING ) )
            // InternalSeleniumDsl.g:1158:4: (lv_label_5_0= RULE_STRING )
            {
            // InternalSeleniumDsl.g:1158:4: (lv_label_5_0= RULE_STRING )
            // InternalSeleniumDsl.g:1159:5: lv_label_5_0= RULE_STRING
            {
            lv_label_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_label_5_0, grammarAccess.getComboboxAccess().getLabelSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComboboxRule());
            					}
            					setWithLastConsumed(
            						current,
            						"label",
            						lv_label_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleCombobox"


    // $ANTLR start "entryRuleDynamicURL"
    // InternalSeleniumDsl.g:1179:1: entryRuleDynamicURL returns [String current=null] : iv_ruleDynamicURL= ruleDynamicURL EOF ;
    public final String entryRuleDynamicURL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDynamicURL = null;


        try {
            // InternalSeleniumDsl.g:1179:50: (iv_ruleDynamicURL= ruleDynamicURL EOF )
            // InternalSeleniumDsl.g:1180:2: iv_ruleDynamicURL= ruleDynamicURL EOF
            {
             newCompositeNode(grammarAccess.getDynamicURLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDynamicURL=ruleDynamicURL();

            state._fsp--;

             current =iv_ruleDynamicURL.getText(); 
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
    // $ANTLR end "entryRuleDynamicURL"


    // $ANTLR start "ruleDynamicURL"
    // InternalSeleniumDsl.g:1186:1: ruleDynamicURL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_URL_0= RULE_URL | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleDynamicURL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_URL_0=null;
        Token this_STRING_1=null;


        	enterRule();

        try {
            // InternalSeleniumDsl.g:1192:2: ( (this_URL_0= RULE_URL | this_STRING_1= RULE_STRING ) )
            // InternalSeleniumDsl.g:1193:2: (this_URL_0= RULE_URL | this_STRING_1= RULE_STRING )
            {
            // InternalSeleniumDsl.g:1193:2: (this_URL_0= RULE_URL | this_STRING_1= RULE_STRING )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_URL) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_STRING) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSeleniumDsl.g:1194:3: this_URL_0= RULE_URL
                    {
                    this_URL_0=(Token)match(input,RULE_URL,FOLLOW_2); 

                    			current.merge(this_URL_0);
                    		

                    			newLeafNode(this_URL_0, grammarAccess.getDynamicURLAccess().getURLTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSeleniumDsl.g:1202:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_1);
                    		

                    			newLeafNode(this_STRING_1, grammarAccess.getDynamicURLAccess().getSTRINGTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleDynamicURL"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\23\1\27\12\uffff";
    static final String dfa_3s = "\1\42\1\36\12\uffff";
    static final String dfa_4s = "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\12\1\11\1\1";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\10\3\uffff\1\5\1\6\1\7\3\uffff\1\1\1\uffff\1\2\1\3\1\4\1\11",
            "\1\12\6\uffff\1\13",
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

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "628:2: ( (kw= 'text' kw= 'field' ) | kw= 'checkboxes' | kw= 'combobox' | kw= 'option' | kw= 'link' | kw= 'button' | kw= 'image' | kw= 'url' | (kw= 'text' kw= 'link' ) | kw= 'title' )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000A42808122002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000007A3880000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000007A3C80010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000007A3880002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000020004800000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000081000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0001000000000000L});

}