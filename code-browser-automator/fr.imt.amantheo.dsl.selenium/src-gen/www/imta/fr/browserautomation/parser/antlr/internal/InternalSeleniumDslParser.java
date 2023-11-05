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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_HTML_ATTRIBUTE", "RULE_STRING", "RULE_INT", "RULE_SUFFIX", "RULE_URL", "RULE_DOMAIN", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'open'", "'a'", "'browser'", "'window'", "'go'", "'to'", "'URL'", "'click'", "'on'", "'select'", "'copy'", "'the'", "'property'", "'of'", "'as'", "'paste'", "'content'", "'clipboard'", "'in'", "'fill'", "'with'", "'properties'", "'associated'", "'label'", "'that'", "'is'", "'and'", "'saved'", "'not'", "'selected'", "'visible'", "'enabled'", "'all'", "'elements'", "'type'", "'last'", "'containing'", "'matching'", "'verify'"
    };
    public static final int T__50=50;
    public static final int RULE_HTML_ATTRIBUTE=4;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_ID=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int RULE_URL=8;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=12;
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
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_SUFFIX=7;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int RULE_DOMAIN=9;
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

                if ( (LA1_0==15||LA1_0==19||LA1_0==22||(LA1_0>=24 && LA1_0<=25)||LA1_0==30||LA1_0==34||LA1_0==53) ) {
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
    // InternalSeleniumDsl.g:107:1: ruleCommand returns [EObject current=null] : (this_OpenBrowser_0= ruleOpenBrowser | this_GoTo_1= ruleGoTo | this_DOMCommand_2= ruleDOMCommand ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_OpenBrowser_0 = null;

        EObject this_GoTo_1 = null;

        EObject this_DOMCommand_2 = null;



        	enterRule();

        try {
            // InternalSeleniumDsl.g:113:2: ( (this_OpenBrowser_0= ruleOpenBrowser | this_GoTo_1= ruleGoTo | this_DOMCommand_2= ruleDOMCommand ) )
            // InternalSeleniumDsl.g:114:2: (this_OpenBrowser_0= ruleOpenBrowser | this_GoTo_1= ruleGoTo | this_DOMCommand_2= ruleDOMCommand )
            {
            // InternalSeleniumDsl.g:114:2: (this_OpenBrowser_0= ruleOpenBrowser | this_GoTo_1= ruleGoTo | this_DOMCommand_2= ruleDOMCommand )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 22:
            case 24:
            case 25:
            case 30:
            case 34:
            case 53:
                {
                alt2=3;
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
                    // InternalSeleniumDsl.g:133:3: this_DOMCommand_2= ruleDOMCommand
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getDOMCommandParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DOMCommand_2=ruleDOMCommand();

                    state._fsp--;


                    			current = this_DOMCommand_2;
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
    // InternalSeleniumDsl.g:145:1: entryRuleOpenBrowser returns [EObject current=null] : iv_ruleOpenBrowser= ruleOpenBrowser EOF ;
    public final EObject entryRuleOpenBrowser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpenBrowser = null;


        try {
            // InternalSeleniumDsl.g:145:52: (iv_ruleOpenBrowser= ruleOpenBrowser EOF )
            // InternalSeleniumDsl.g:146:2: iv_ruleOpenBrowser= ruleOpenBrowser EOF
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
    // InternalSeleniumDsl.g:152:1: ruleOpenBrowser returns [EObject current=null] : ( () otherlv_1= 'open' otherlv_2= 'a' otherlv_3= 'browser' otherlv_4= 'window' ) ;
    public final EObject ruleOpenBrowser() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSeleniumDsl.g:158:2: ( ( () otherlv_1= 'open' otherlv_2= 'a' otherlv_3= 'browser' otherlv_4= 'window' ) )
            // InternalSeleniumDsl.g:159:2: ( () otherlv_1= 'open' otherlv_2= 'a' otherlv_3= 'browser' otherlv_4= 'window' )
            {
            // InternalSeleniumDsl.g:159:2: ( () otherlv_1= 'open' otherlv_2= 'a' otherlv_3= 'browser' otherlv_4= 'window' )
            // InternalSeleniumDsl.g:160:3: () otherlv_1= 'open' otherlv_2= 'a' otherlv_3= 'browser' otherlv_4= 'window'
            {
            // InternalSeleniumDsl.g:160:3: ()
            // InternalSeleniumDsl.g:161:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOpenBrowserAccess().getOpenBrowserAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getOpenBrowserAccess().getOpenKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getOpenBrowserAccess().getAKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getOpenBrowserAccess().getBrowserKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_2); 

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


    // $ANTLR start "entryRuleDOMCommand"
    // InternalSeleniumDsl.g:187:1: entryRuleDOMCommand returns [EObject current=null] : iv_ruleDOMCommand= ruleDOMCommand EOF ;
    public final EObject entryRuleDOMCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOMCommand = null;


        try {
            // InternalSeleniumDsl.g:187:51: (iv_ruleDOMCommand= ruleDOMCommand EOF )
            // InternalSeleniumDsl.g:188:2: iv_ruleDOMCommand= ruleDOMCommand EOF
            {
             newCompositeNode(grammarAccess.getDOMCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDOMCommand=ruleDOMCommand();

            state._fsp--;

             current =iv_ruleDOMCommand; 
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
    // $ANTLR end "entryRuleDOMCommand"


    // $ANTLR start "ruleDOMCommand"
    // InternalSeleniumDsl.g:194:1: ruleDOMCommand returns [EObject current=null] : (this_Click_0= ruleClick | this_Copy_1= ruleCopy | this_Paste_2= rulePaste | this_Verify_3= ruleVerify | this_Insert_4= ruleInsert ) ;
    public final EObject ruleDOMCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Click_0 = null;

        EObject this_Copy_1 = null;

        EObject this_Paste_2 = null;

        EObject this_Verify_3 = null;

        EObject this_Insert_4 = null;



        	enterRule();

        try {
            // InternalSeleniumDsl.g:200:2: ( (this_Click_0= ruleClick | this_Copy_1= ruleCopy | this_Paste_2= rulePaste | this_Verify_3= ruleVerify | this_Insert_4= ruleInsert ) )
            // InternalSeleniumDsl.g:201:2: (this_Click_0= ruleClick | this_Copy_1= ruleCopy | this_Paste_2= rulePaste | this_Verify_3= ruleVerify | this_Insert_4= ruleInsert )
            {
            // InternalSeleniumDsl.g:201:2: (this_Click_0= ruleClick | this_Copy_1= ruleCopy | this_Paste_2= rulePaste | this_Verify_3= ruleVerify | this_Insert_4= ruleInsert )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 22:
            case 24:
                {
                alt3=1;
                }
                break;
            case 25:
                {
                alt3=2;
                }
                break;
            case 30:
                {
                alt3=3;
                }
                break;
            case 53:
                {
                alt3=4;
                }
                break;
            case 34:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSeleniumDsl.g:202:3: this_Click_0= ruleClick
                    {

                    			newCompositeNode(grammarAccess.getDOMCommandAccess().getClickParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Click_0=ruleClick();

                    state._fsp--;


                    			current = this_Click_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSeleniumDsl.g:211:3: this_Copy_1= ruleCopy
                    {

                    			newCompositeNode(grammarAccess.getDOMCommandAccess().getCopyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Copy_1=ruleCopy();

                    state._fsp--;


                    			current = this_Copy_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSeleniumDsl.g:220:3: this_Paste_2= rulePaste
                    {

                    			newCompositeNode(grammarAccess.getDOMCommandAccess().getPasteParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Paste_2=rulePaste();

                    state._fsp--;


                    			current = this_Paste_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSeleniumDsl.g:229:3: this_Verify_3= ruleVerify
                    {

                    			newCompositeNode(grammarAccess.getDOMCommandAccess().getVerifyParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Verify_3=ruleVerify();

                    state._fsp--;


                    			current = this_Verify_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSeleniumDsl.g:238:3: this_Insert_4= ruleInsert
                    {

                    			newCompositeNode(grammarAccess.getDOMCommandAccess().getInsertParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Insert_4=ruleInsert();

                    state._fsp--;


                    			current = this_Insert_4;
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
    // $ANTLR end "ruleDOMCommand"


    // $ANTLR start "entryRuleGoTo"
    // InternalSeleniumDsl.g:250:1: entryRuleGoTo returns [EObject current=null] : iv_ruleGoTo= ruleGoTo EOF ;
    public final EObject entryRuleGoTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoTo = null;


        try {
            // InternalSeleniumDsl.g:250:45: (iv_ruleGoTo= ruleGoTo EOF )
            // InternalSeleniumDsl.g:251:2: iv_ruleGoTo= ruleGoTo EOF
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
    // InternalSeleniumDsl.g:257:1: ruleGoTo returns [EObject current=null] : (otherlv_0= 'go' otherlv_1= 'to' ( ( (lv_url_2_0= ruleDynamicURL ) ) | otherlv_3= 'URL' )? ) ;
    public final EObject ruleGoTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_url_2_0 = null;



        	enterRule();

        try {
            // InternalSeleniumDsl.g:263:2: ( (otherlv_0= 'go' otherlv_1= 'to' ( ( (lv_url_2_0= ruleDynamicURL ) ) | otherlv_3= 'URL' )? ) )
            // InternalSeleniumDsl.g:264:2: (otherlv_0= 'go' otherlv_1= 'to' ( ( (lv_url_2_0= ruleDynamicURL ) ) | otherlv_3= 'URL' )? )
            {
            // InternalSeleniumDsl.g:264:2: (otherlv_0= 'go' otherlv_1= 'to' ( ( (lv_url_2_0= ruleDynamicURL ) ) | otherlv_3= 'URL' )? )
            // InternalSeleniumDsl.g:265:3: otherlv_0= 'go' otherlv_1= 'to' ( ( (lv_url_2_0= ruleDynamicURL ) ) | otherlv_3= 'URL' )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getGoToAccess().getGoKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getGoToAccess().getToKeyword_1());
            		
            // InternalSeleniumDsl.g:273:3: ( ( (lv_url_2_0= ruleDynamicURL ) ) | otherlv_3= 'URL' )?
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING||LA4_0==RULE_URL) ) {
                alt4=1;
            }
            else if ( (LA4_0==21) ) {
                alt4=2;
            }
            switch (alt4) {
                case 1 :
                    // InternalSeleniumDsl.g:274:4: ( (lv_url_2_0= ruleDynamicURL ) )
                    {
                    // InternalSeleniumDsl.g:274:4: ( (lv_url_2_0= ruleDynamicURL ) )
                    // InternalSeleniumDsl.g:275:5: (lv_url_2_0= ruleDynamicURL )
                    {
                    // InternalSeleniumDsl.g:275:5: (lv_url_2_0= ruleDynamicURL )
                    // InternalSeleniumDsl.g:276:6: lv_url_2_0= ruleDynamicURL
                    {

                    						newCompositeNode(grammarAccess.getGoToAccess().getUrlDynamicURLParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_url_2_0=ruleDynamicURL();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGoToRule());
                    						}
                    						set(
                    							current,
                    							"url",
                    							lv_url_2_0,
                    							"www.imta.fr.browserautomation.SeleniumDsl.DynamicURL");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDsl.g:294:4: otherlv_3= 'URL'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getGoToAccess().getURLKeyword_2_1());
                    			

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
    // $ANTLR end "ruleGoTo"


    // $ANTLR start "entryRuleClick"
    // InternalSeleniumDsl.g:303:1: entryRuleClick returns [EObject current=null] : iv_ruleClick= ruleClick EOF ;
    public final EObject entryRuleClick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClick = null;


        try {
            // InternalSeleniumDsl.g:303:46: (iv_ruleClick= ruleClick EOF )
            // InternalSeleniumDsl.g:304:2: iv_ruleClick= ruleClick EOF
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
    // InternalSeleniumDsl.g:310:1: ruleClick returns [EObject current=null] : ( () ( (otherlv_1= 'click' otherlv_2= 'on' ) | otherlv_3= 'select' ) ( (lv_element_4_0= ruleSelector ) ) ) ;
    public final EObject ruleClick() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_element_4_0 = null;



        	enterRule();

        try {
            // InternalSeleniumDsl.g:316:2: ( ( () ( (otherlv_1= 'click' otherlv_2= 'on' ) | otherlv_3= 'select' ) ( (lv_element_4_0= ruleSelector ) ) ) )
            // InternalSeleniumDsl.g:317:2: ( () ( (otherlv_1= 'click' otherlv_2= 'on' ) | otherlv_3= 'select' ) ( (lv_element_4_0= ruleSelector ) ) )
            {
            // InternalSeleniumDsl.g:317:2: ( () ( (otherlv_1= 'click' otherlv_2= 'on' ) | otherlv_3= 'select' ) ( (lv_element_4_0= ruleSelector ) ) )
            // InternalSeleniumDsl.g:318:3: () ( (otherlv_1= 'click' otherlv_2= 'on' ) | otherlv_3= 'select' ) ( (lv_element_4_0= ruleSelector ) )
            {
            // InternalSeleniumDsl.g:318:3: ()
            // InternalSeleniumDsl.g:319:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClickAccess().getClickAction_0(),
            					current);
            			

            }

            // InternalSeleniumDsl.g:325:3: ( (otherlv_1= 'click' otherlv_2= 'on' ) | otherlv_3= 'select' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            else if ( (LA5_0==24) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSeleniumDsl.g:326:4: (otherlv_1= 'click' otherlv_2= 'on' )
                    {
                    // InternalSeleniumDsl.g:326:4: (otherlv_1= 'click' otherlv_2= 'on' )
                    // InternalSeleniumDsl.g:327:5: otherlv_1= 'click' otherlv_2= 'on'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_9); 

                    					newLeafNode(otherlv_1, grammarAccess.getClickAccess().getClickKeyword_1_0_0());
                    				
                    otherlv_2=(Token)match(input,23,FOLLOW_10); 

                    					newLeafNode(otherlv_2, grammarAccess.getClickAccess().getOnKeyword_1_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDsl.g:337:4: otherlv_3= 'select'
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getClickAccess().getSelectKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalSeleniumDsl.g:342:3: ( (lv_element_4_0= ruleSelector ) )
            // InternalSeleniumDsl.g:343:4: (lv_element_4_0= ruleSelector )
            {
            // InternalSeleniumDsl.g:343:4: (lv_element_4_0= ruleSelector )
            // InternalSeleniumDsl.g:344:5: lv_element_4_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getClickAccess().getElementSelectorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_element_4_0=ruleSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClickRule());
            					}
            					set(
            						current,
            						"element",
            						lv_element_4_0,
            						"www.imta.fr.browserautomation.SeleniumDsl.Selector");
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
    // $ANTLR end "ruleClick"


    // $ANTLR start "entryRuleCopy"
    // InternalSeleniumDsl.g:365:1: entryRuleCopy returns [EObject current=null] : iv_ruleCopy= ruleCopy EOF ;
    public final EObject entryRuleCopy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCopy = null;


        try {
            // InternalSeleniumDsl.g:365:45: (iv_ruleCopy= ruleCopy EOF )
            // InternalSeleniumDsl.g:366:2: iv_ruleCopy= ruleCopy EOF
            {
             newCompositeNode(grammarAccess.getCopyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCopy=ruleCopy();

            state._fsp--;

             current =iv_ruleCopy; 
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
    // $ANTLR end "entryRuleCopy"


    // $ANTLR start "ruleCopy"
    // InternalSeleniumDsl.g:372:1: ruleCopy returns [EObject current=null] : ( () otherlv_1= 'copy' otherlv_2= 'the' otherlv_3= 'property' ( (lv_property_4_0= RULE_HTML_ATTRIBUTE ) ) otherlv_5= 'of' ( (lv_element_6_0= ruleSelector ) ) otherlv_7= 'as' ( (lv_key_8_0= RULE_STRING ) ) ) ;
    public final EObject ruleCopy() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_property_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_key_8_0=null;
        EObject lv_element_6_0 = null;



        	enterRule();

        try {
            // InternalSeleniumDsl.g:378:2: ( ( () otherlv_1= 'copy' otherlv_2= 'the' otherlv_3= 'property' ( (lv_property_4_0= RULE_HTML_ATTRIBUTE ) ) otherlv_5= 'of' ( (lv_element_6_0= ruleSelector ) ) otherlv_7= 'as' ( (lv_key_8_0= RULE_STRING ) ) ) )
            // InternalSeleniumDsl.g:379:2: ( () otherlv_1= 'copy' otherlv_2= 'the' otherlv_3= 'property' ( (lv_property_4_0= RULE_HTML_ATTRIBUTE ) ) otherlv_5= 'of' ( (lv_element_6_0= ruleSelector ) ) otherlv_7= 'as' ( (lv_key_8_0= RULE_STRING ) ) )
            {
            // InternalSeleniumDsl.g:379:2: ( () otherlv_1= 'copy' otherlv_2= 'the' otherlv_3= 'property' ( (lv_property_4_0= RULE_HTML_ATTRIBUTE ) ) otherlv_5= 'of' ( (lv_element_6_0= ruleSelector ) ) otherlv_7= 'as' ( (lv_key_8_0= RULE_STRING ) ) )
            // InternalSeleniumDsl.g:380:3: () otherlv_1= 'copy' otherlv_2= 'the' otherlv_3= 'property' ( (lv_property_4_0= RULE_HTML_ATTRIBUTE ) ) otherlv_5= 'of' ( (lv_element_6_0= ruleSelector ) ) otherlv_7= 'as' ( (lv_key_8_0= RULE_STRING ) )
            {
            // InternalSeleniumDsl.g:380:3: ()
            // InternalSeleniumDsl.g:381:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCopyAccess().getCopyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getCopyAccess().getCopyKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getCopyAccess().getTheKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getCopyAccess().getPropertyKeyword_3());
            		
            // InternalSeleniumDsl.g:399:3: ( (lv_property_4_0= RULE_HTML_ATTRIBUTE ) )
            // InternalSeleniumDsl.g:400:4: (lv_property_4_0= RULE_HTML_ATTRIBUTE )
            {
            // InternalSeleniumDsl.g:400:4: (lv_property_4_0= RULE_HTML_ATTRIBUTE )
            // InternalSeleniumDsl.g:401:5: lv_property_4_0= RULE_HTML_ATTRIBUTE
            {
            lv_property_4_0=(Token)match(input,RULE_HTML_ATTRIBUTE,FOLLOW_14); 

            					newLeafNode(lv_property_4_0, grammarAccess.getCopyAccess().getPropertyHTML_ATTRIBUTETerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCopyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"property",
            						lv_property_4_0,
            						"www.imta.fr.browserautomation.SeleniumDsl.HTML_ATTRIBUTE");
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getCopyAccess().getOfKeyword_5());
            		
            // InternalSeleniumDsl.g:421:3: ( (lv_element_6_0= ruleSelector ) )
            // InternalSeleniumDsl.g:422:4: (lv_element_6_0= ruleSelector )
            {
            // InternalSeleniumDsl.g:422:4: (lv_element_6_0= ruleSelector )
            // InternalSeleniumDsl.g:423:5: lv_element_6_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getCopyAccess().getElementSelectorParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_15);
            lv_element_6_0=ruleSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCopyRule());
            					}
            					set(
            						current,
            						"element",
            						lv_element_6_0,
            						"www.imta.fr.browserautomation.SeleniumDsl.Selector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,29,FOLLOW_16); 

            			newLeafNode(otherlv_7, grammarAccess.getCopyAccess().getAsKeyword_7());
            		
            // InternalSeleniumDsl.g:444:3: ( (lv_key_8_0= RULE_STRING ) )
            // InternalSeleniumDsl.g:445:4: (lv_key_8_0= RULE_STRING )
            {
            // InternalSeleniumDsl.g:445:4: (lv_key_8_0= RULE_STRING )
            // InternalSeleniumDsl.g:446:5: lv_key_8_0= RULE_STRING
            {
            lv_key_8_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_key_8_0, grammarAccess.getCopyAccess().getKeySTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCopyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_8_0,
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
    // $ANTLR end "ruleCopy"


    // $ANTLR start "entryRulePaste"
    // InternalSeleniumDsl.g:466:1: entryRulePaste returns [EObject current=null] : iv_rulePaste= rulePaste EOF ;
    public final EObject entryRulePaste() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePaste = null;


        try {
            // InternalSeleniumDsl.g:466:46: (iv_rulePaste= rulePaste EOF )
            // InternalSeleniumDsl.g:467:2: iv_rulePaste= rulePaste EOF
            {
             newCompositeNode(grammarAccess.getPasteRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePaste=rulePaste();

            state._fsp--;

             current =iv_rulePaste; 
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
    // $ANTLR end "entryRulePaste"


    // $ANTLR start "rulePaste"
    // InternalSeleniumDsl.g:473:1: rulePaste returns [EObject current=null] : (otherlv_0= 'paste' otherlv_1= 'the' otherlv_2= 'content' otherlv_3= 'of' otherlv_4= 'the' otherlv_5= 'clipboard' otherlv_6= 'in' ( (lv_element_7_0= ruleSelector ) ) ) ;
    public final EObject rulePaste() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_element_7_0 = null;



        	enterRule();

        try {
            // InternalSeleniumDsl.g:479:2: ( (otherlv_0= 'paste' otherlv_1= 'the' otherlv_2= 'content' otherlv_3= 'of' otherlv_4= 'the' otherlv_5= 'clipboard' otherlv_6= 'in' ( (lv_element_7_0= ruleSelector ) ) ) )
            // InternalSeleniumDsl.g:480:2: (otherlv_0= 'paste' otherlv_1= 'the' otherlv_2= 'content' otherlv_3= 'of' otherlv_4= 'the' otherlv_5= 'clipboard' otherlv_6= 'in' ( (lv_element_7_0= ruleSelector ) ) )
            {
            // InternalSeleniumDsl.g:480:2: (otherlv_0= 'paste' otherlv_1= 'the' otherlv_2= 'content' otherlv_3= 'of' otherlv_4= 'the' otherlv_5= 'clipboard' otherlv_6= 'in' ( (lv_element_7_0= ruleSelector ) ) )
            // InternalSeleniumDsl.g:481:3: otherlv_0= 'paste' otherlv_1= 'the' otherlv_2= 'content' otherlv_3= 'of' otherlv_4= 'the' otherlv_5= 'clipboard' otherlv_6= 'in' ( (lv_element_7_0= ruleSelector ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getPasteAccess().getPasteKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getPasteAccess().getTheKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getPasteAccess().getContentKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getPasteAccess().getOfKeyword_3());
            		
            otherlv_4=(Token)match(input,26,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getPasteAccess().getTheKeyword_4());
            		
            otherlv_5=(Token)match(input,32,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getPasteAccess().getClipboardKeyword_5());
            		
            otherlv_6=(Token)match(input,33,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getPasteAccess().getInKeyword_6());
            		
            // InternalSeleniumDsl.g:509:3: ( (lv_element_7_0= ruleSelector ) )
            // InternalSeleniumDsl.g:510:4: (lv_element_7_0= ruleSelector )
            {
            // InternalSeleniumDsl.g:510:4: (lv_element_7_0= ruleSelector )
            // InternalSeleniumDsl.g:511:5: lv_element_7_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getPasteAccess().getElementSelectorParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_element_7_0=ruleSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPasteRule());
            					}
            					set(
            						current,
            						"element",
            						lv_element_7_0,
            						"www.imta.fr.browserautomation.SeleniumDsl.Selector");
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
    // $ANTLR end "rulePaste"


    // $ANTLR start "entryRuleInsert"
    // InternalSeleniumDsl.g:532:1: entryRuleInsert returns [EObject current=null] : iv_ruleInsert= ruleInsert EOF ;
    public final EObject entryRuleInsert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsert = null;


        try {
            // InternalSeleniumDsl.g:532:47: (iv_ruleInsert= ruleInsert EOF )
            // InternalSeleniumDsl.g:533:2: iv_ruleInsert= ruleInsert EOF
            {
             newCompositeNode(grammarAccess.getInsertRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInsert=ruleInsert();

            state._fsp--;

             current =iv_ruleInsert; 
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
    // $ANTLR end "entryRuleInsert"


    // $ANTLR start "ruleInsert"
    // InternalSeleniumDsl.g:539:1: ruleInsert returns [EObject current=null] : (otherlv_0= 'fill' ( (lv_element_1_0= ruleSelector ) ) otherlv_2= 'with' ( (lv_content_3_0= ruleContent ) ) ) ;
    public final EObject ruleInsert() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_element_1_0 = null;

        EObject lv_content_3_0 = null;



        	enterRule();

        try {
            // InternalSeleniumDsl.g:545:2: ( (otherlv_0= 'fill' ( (lv_element_1_0= ruleSelector ) ) otherlv_2= 'with' ( (lv_content_3_0= ruleContent ) ) ) )
            // InternalSeleniumDsl.g:546:2: (otherlv_0= 'fill' ( (lv_element_1_0= ruleSelector ) ) otherlv_2= 'with' ( (lv_content_3_0= ruleContent ) ) )
            {
            // InternalSeleniumDsl.g:546:2: (otherlv_0= 'fill' ( (lv_element_1_0= ruleSelector ) ) otherlv_2= 'with' ( (lv_content_3_0= ruleContent ) ) )
            // InternalSeleniumDsl.g:547:3: otherlv_0= 'fill' ( (lv_element_1_0= ruleSelector ) ) otherlv_2= 'with' ( (lv_content_3_0= ruleContent ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getInsertAccess().getFillKeyword_0());
            		
            // InternalSeleniumDsl.g:551:3: ( (lv_element_1_0= ruleSelector ) )
            // InternalSeleniumDsl.g:552:4: (lv_element_1_0= ruleSelector )
            {
            // InternalSeleniumDsl.g:552:4: (lv_element_1_0= ruleSelector )
            // InternalSeleniumDsl.g:553:5: lv_element_1_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getInsertAccess().getElementSelectorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_element_1_0=ruleSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertRule());
            					}
            					set(
            						current,
            						"element",
            						lv_element_1_0,
            						"www.imta.fr.browserautomation.SeleniumDsl.Selector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getInsertAccess().getWithKeyword_2());
            		
            // InternalSeleniumDsl.g:574:3: ( (lv_content_3_0= ruleContent ) )
            // InternalSeleniumDsl.g:575:4: (lv_content_3_0= ruleContent )
            {
            // InternalSeleniumDsl.g:575:4: (lv_content_3_0= ruleContent )
            // InternalSeleniumDsl.g:576:5: lv_content_3_0= ruleContent
            {

            					newCompositeNode(grammarAccess.getInsertAccess().getContentContentParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_content_3_0=ruleContent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertRule());
            					}
            					set(
            						current,
            						"content",
            						lv_content_3_0,
            						"www.imta.fr.browserautomation.SeleniumDsl.Content");
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
    // $ANTLR end "ruleInsert"


    // $ANTLR start "entryRuleSelector"
    // InternalSeleniumDsl.g:597:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // InternalSeleniumDsl.g:597:49: (iv_ruleSelector= ruleSelector EOF )
            // InternalSeleniumDsl.g:598:2: iv_ruleSelector= ruleSelector EOF
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
    // InternalSeleniumDsl.g:604:1: ruleSelector returns [EObject current=null] : ( ( (lv_predicate_0_0= ruleSelectorPredicate ) ) ( (lv_domType_1_0= RULE_STRING ) ) (otherlv_2= 'with' otherlv_3= 'properties' ( (lv_attributes_4_0= ruleAttributes ) ) )? (otherlv_5= 'with' otherlv_6= 'associated' otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )? (otherlv_9= 'that' otherlv_10= 'is' ( (lv_properties_11_0= ruleProperties ) ) )? (otherlv_12= 'in' ( (lv_parent_13_0= ruleSelector ) ) )? ) ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        Token lv_domType_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_label_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_predicate_0_0 = null;

        EObject lv_attributes_4_0 = null;

        EObject lv_properties_11_0 = null;

        EObject lv_parent_13_0 = null;



        	enterRule();

        try {
            // InternalSeleniumDsl.g:610:2: ( ( ( (lv_predicate_0_0= ruleSelectorPredicate ) ) ( (lv_domType_1_0= RULE_STRING ) ) (otherlv_2= 'with' otherlv_3= 'properties' ( (lv_attributes_4_0= ruleAttributes ) ) )? (otherlv_5= 'with' otherlv_6= 'associated' otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )? (otherlv_9= 'that' otherlv_10= 'is' ( (lv_properties_11_0= ruleProperties ) ) )? (otherlv_12= 'in' ( (lv_parent_13_0= ruleSelector ) ) )? ) )
            // InternalSeleniumDsl.g:611:2: ( ( (lv_predicate_0_0= ruleSelectorPredicate ) ) ( (lv_domType_1_0= RULE_STRING ) ) (otherlv_2= 'with' otherlv_3= 'properties' ( (lv_attributes_4_0= ruleAttributes ) ) )? (otherlv_5= 'with' otherlv_6= 'associated' otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )? (otherlv_9= 'that' otherlv_10= 'is' ( (lv_properties_11_0= ruleProperties ) ) )? (otherlv_12= 'in' ( (lv_parent_13_0= ruleSelector ) ) )? )
            {
            // InternalSeleniumDsl.g:611:2: ( ( (lv_predicate_0_0= ruleSelectorPredicate ) ) ( (lv_domType_1_0= RULE_STRING ) ) (otherlv_2= 'with' otherlv_3= 'properties' ( (lv_attributes_4_0= ruleAttributes ) ) )? (otherlv_5= 'with' otherlv_6= 'associated' otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )? (otherlv_9= 'that' otherlv_10= 'is' ( (lv_properties_11_0= ruleProperties ) ) )? (otherlv_12= 'in' ( (lv_parent_13_0= ruleSelector ) ) )? )
            // InternalSeleniumDsl.g:612:3: ( (lv_predicate_0_0= ruleSelectorPredicate ) ) ( (lv_domType_1_0= RULE_STRING ) ) (otherlv_2= 'with' otherlv_3= 'properties' ( (lv_attributes_4_0= ruleAttributes ) ) )? (otherlv_5= 'with' otherlv_6= 'associated' otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )? (otherlv_9= 'that' otherlv_10= 'is' ( (lv_properties_11_0= ruleProperties ) ) )? (otherlv_12= 'in' ( (lv_parent_13_0= ruleSelector ) ) )?
            {
            // InternalSeleniumDsl.g:612:3: ( (lv_predicate_0_0= ruleSelectorPredicate ) )
            // InternalSeleniumDsl.g:613:4: (lv_predicate_0_0= ruleSelectorPredicate )
            {
            // InternalSeleniumDsl.g:613:4: (lv_predicate_0_0= ruleSelectorPredicate )
            // InternalSeleniumDsl.g:614:5: lv_predicate_0_0= ruleSelectorPredicate
            {

            					newCompositeNode(grammarAccess.getSelectorAccess().getPredicateSelectorPredicateParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
            lv_predicate_0_0=ruleSelectorPredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectorRule());
            					}
            					set(
            						current,
            						"predicate",
            						lv_predicate_0_0,
            						"www.imta.fr.browserautomation.SeleniumDsl.SelectorPredicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSeleniumDsl.g:631:3: ( (lv_domType_1_0= RULE_STRING ) )
            // InternalSeleniumDsl.g:632:4: (lv_domType_1_0= RULE_STRING )
            {
            // InternalSeleniumDsl.g:632:4: (lv_domType_1_0= RULE_STRING )
            // InternalSeleniumDsl.g:633:5: lv_domType_1_0= RULE_STRING
            {
            lv_domType_1_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_domType_1_0, grammarAccess.getSelectorAccess().getDomTypeSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"domType",
            						lv_domType_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalSeleniumDsl.g:649:3: (otherlv_2= 'with' otherlv_3= 'properties' ( (lv_attributes_4_0= ruleAttributes ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==35) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==36) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // InternalSeleniumDsl.g:650:4: otherlv_2= 'with' otherlv_3= 'properties' ( (lv_attributes_4_0= ruleAttributes ) )
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_23); 

                    				newLeafNode(otherlv_2, grammarAccess.getSelectorAccess().getWithKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,36,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getSelectorAccess().getPropertiesKeyword_2_1());
                    			
                    // InternalSeleniumDsl.g:658:4: ( (lv_attributes_4_0= ruleAttributes ) )
                    // InternalSeleniumDsl.g:659:5: (lv_attributes_4_0= ruleAttributes )
                    {
                    // InternalSeleniumDsl.g:659:5: (lv_attributes_4_0= ruleAttributes )
                    // InternalSeleniumDsl.g:660:6: lv_attributes_4_0= ruleAttributes
                    {

                    						newCompositeNode(grammarAccess.getSelectorAccess().getAttributesAttributesParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_attributes_4_0=ruleAttributes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectorRule());
                    						}
                    						set(
                    							current,
                    							"attributes",
                    							lv_attributes_4_0,
                    							"www.imta.fr.browserautomation.SeleniumDsl.Attributes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSeleniumDsl.g:678:3: (otherlv_5= 'with' otherlv_6= 'associated' otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==35) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==37) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // InternalSeleniumDsl.g:679:4: otherlv_5= 'with' otherlv_6= 'associated' otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,35,FOLLOW_24); 

                    				newLeafNode(otherlv_5, grammarAccess.getSelectorAccess().getWithKeyword_3_0());
                    			
                    otherlv_6=(Token)match(input,37,FOLLOW_25); 

                    				newLeafNode(otherlv_6, grammarAccess.getSelectorAccess().getAssociatedKeyword_3_1());
                    			
                    otherlv_7=(Token)match(input,38,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getSelectorAccess().getLabelKeyword_3_2());
                    			
                    // InternalSeleniumDsl.g:691:4: ( (lv_label_8_0= RULE_STRING ) )
                    // InternalSeleniumDsl.g:692:5: (lv_label_8_0= RULE_STRING )
                    {
                    // InternalSeleniumDsl.g:692:5: (lv_label_8_0= RULE_STRING )
                    // InternalSeleniumDsl.g:693:6: lv_label_8_0= RULE_STRING
                    {
                    lv_label_8_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

                    						newLeafNode(lv_label_8_0, grammarAccess.getSelectorAccess().getLabelSTRINGTerminalRuleCall_3_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSelectorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"label",
                    							lv_label_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSeleniumDsl.g:710:3: (otherlv_9= 'that' otherlv_10= 'is' ( (lv_properties_11_0= ruleProperties ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==39) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSeleniumDsl.g:711:4: otherlv_9= 'that' otherlv_10= 'is' ( (lv_properties_11_0= ruleProperties ) )
                    {
                    otherlv_9=(Token)match(input,39,FOLLOW_27); 

                    				newLeafNode(otherlv_9, grammarAccess.getSelectorAccess().getThatKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,40,FOLLOW_28); 

                    				newLeafNode(otherlv_10, grammarAccess.getSelectorAccess().getIsKeyword_4_1());
                    			
                    // InternalSeleniumDsl.g:719:4: ( (lv_properties_11_0= ruleProperties ) )
                    // InternalSeleniumDsl.g:720:5: (lv_properties_11_0= ruleProperties )
                    {
                    // InternalSeleniumDsl.g:720:5: (lv_properties_11_0= ruleProperties )
                    // InternalSeleniumDsl.g:721:6: lv_properties_11_0= ruleProperties
                    {

                    						newCompositeNode(grammarAccess.getSelectorAccess().getPropertiesPropertiesParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_properties_11_0=ruleProperties();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectorRule());
                    						}
                    						set(
                    							current,
                    							"properties",
                    							lv_properties_11_0,
                    							"www.imta.fr.browserautomation.SeleniumDsl.Properties");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSeleniumDsl.g:739:3: (otherlv_12= 'in' ( (lv_parent_13_0= ruleSelector ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==33) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSeleniumDsl.g:740:4: otherlv_12= 'in' ( (lv_parent_13_0= ruleSelector ) )
                    {
                    otherlv_12=(Token)match(input,33,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getSelectorAccess().getInKeyword_5_0());
                    			
                    // InternalSeleniumDsl.g:744:4: ( (lv_parent_13_0= ruleSelector ) )
                    // InternalSeleniumDsl.g:745:5: (lv_parent_13_0= ruleSelector )
                    {
                    // InternalSeleniumDsl.g:745:5: (lv_parent_13_0= ruleSelector )
                    // InternalSeleniumDsl.g:746:6: lv_parent_13_0= ruleSelector
                    {

                    						newCompositeNode(grammarAccess.getSelectorAccess().getParentSelectorParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_parent_13_0=ruleSelector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectorRule());
                    						}
                    						set(
                    							current,
                    							"parent",
                    							lv_parent_13_0,
                    							"www.imta.fr.browserautomation.SeleniumDsl.Selector");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleAttributes"
    // InternalSeleniumDsl.g:768:1: entryRuleAttributes returns [EObject current=null] : iv_ruleAttributes= ruleAttributes EOF ;
    public final EObject entryRuleAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributes = null;


        try {
            // InternalSeleniumDsl.g:768:51: (iv_ruleAttributes= ruleAttributes EOF )
            // InternalSeleniumDsl.g:769:2: iv_ruleAttributes= ruleAttributes EOF
            {
             newCompositeNode(grammarAccess.getAttributesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributes=ruleAttributes();

            state._fsp--;

             current =iv_ruleAttributes; 
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
    // $ANTLR end "entryRuleAttributes"


    // $ANTLR start "ruleAttributes"
    // InternalSeleniumDsl.g:775:1: ruleAttributes returns [EObject current=null] : ( ( (lv_attributes_0_0= ruleElementAttribute ) ) (otherlv_1= 'and' ( (lv_attributes_2_0= ruleElementAttribute ) ) )? ) ;
    public final EObject ruleAttributes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_attributes_0_0 = null;

        EObject lv_attributes_2_0 = null;



        	enterRule();

        try {
            // InternalSeleniumDsl.g:781:2: ( ( ( (lv_attributes_0_0= ruleElementAttribute ) ) (otherlv_1= 'and' ( (lv_attributes_2_0= ruleElementAttribute ) ) )? ) )
            // InternalSeleniumDsl.g:782:2: ( ( (lv_attributes_0_0= ruleElementAttribute ) ) (otherlv_1= 'and' ( (lv_attributes_2_0= ruleElementAttribute ) ) )? )
            {
            // InternalSeleniumDsl.g:782:2: ( ( (lv_attributes_0_0= ruleElementAttribute ) ) (otherlv_1= 'and' ( (lv_attributes_2_0= ruleElementAttribute ) ) )? )
            // InternalSeleniumDsl.g:783:3: ( (lv_attributes_0_0= ruleElementAttribute ) ) (otherlv_1= 'and' ( (lv_attributes_2_0= ruleElementAttribute ) ) )?
            {
            // InternalSeleniumDsl.g:783:3: ( (lv_attributes_0_0= ruleElementAttribute ) )
            // InternalSeleniumDsl.g:784:4: (lv_attributes_0_0= ruleElementAttribute )
            {
            // InternalSeleniumDsl.g:784:4: (lv_attributes_0_0= ruleElementAttribute )
            // InternalSeleniumDsl.g:785:5: lv_attributes_0_0= ruleElementAttribute
            {

            					newCompositeNode(grammarAccess.getAttributesAccess().getAttributesElementAttributeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_30);
            lv_attributes_0_0=ruleElementAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributesRule());
            					}
            					add(
            						current,
            						"attributes",
            						lv_attributes_0_0,
            						"www.imta.fr.browserautomation.SeleniumDsl.ElementAttribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSeleniumDsl.g:802:3: (otherlv_1= 'and' ( (lv_attributes_2_0= ruleElementAttribute ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==41) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSeleniumDsl.g:803:4: otherlv_1= 'and' ( (lv_attributes_2_0= ruleElementAttribute ) )
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getAttributesAccess().getAndKeyword_1_0());
                    			
                    // InternalSeleniumDsl.g:807:4: ( (lv_attributes_2_0= ruleElementAttribute ) )
                    // InternalSeleniumDsl.g:808:5: (lv_attributes_2_0= ruleElementAttribute )
                    {
                    // InternalSeleniumDsl.g:808:5: (lv_attributes_2_0= ruleElementAttribute )
                    // InternalSeleniumDsl.g:809:6: lv_attributes_2_0= ruleElementAttribute
                    {

                    						newCompositeNode(grammarAccess.getAttributesAccess().getAttributesElementAttributeParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_attributes_2_0=ruleElementAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributesRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_2_0,
                    							"www.imta.fr.browserautomation.SeleniumDsl.ElementAttribute");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleAttributes"


    // $ANTLR start "entryRuleElementAttribute"
    // InternalSeleniumDsl.g:831:1: entryRuleElementAttribute returns [EObject current=null] : iv_ruleElementAttribute= ruleElementAttribute EOF ;
    public final EObject entryRuleElementAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementAttribute = null;


        try {
            // InternalSeleniumDsl.g:831:57: (iv_ruleElementAttribute= ruleElementAttribute EOF )
            // InternalSeleniumDsl.g:832:2: iv_ruleElementAttribute= ruleElementAttribute EOF
            {
             newCompositeNode(grammarAccess.getElementAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementAttribute=ruleElementAttribute();

            state._fsp--;

             current =iv_ruleElementAttribute; 
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
    // $ANTLR end "entryRuleElementAttribute"


    // $ANTLR start "ruleElementAttribute"
    // InternalSeleniumDsl.g:838:1: ruleElementAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_HTML_ATTRIBUTE ) ) ( (lv_matcher_1_0= ruleMatcher ) ) ( (lv_value_2_0= ruleContent ) ) ) ;
    public final EObject ruleElementAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        AntlrDatatypeRuleToken lv_matcher_1_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalSeleniumDsl.g:844:2: ( ( ( (lv_name_0_0= RULE_HTML_ATTRIBUTE ) ) ( (lv_matcher_1_0= ruleMatcher ) ) ( (lv_value_2_0= ruleContent ) ) ) )
            // InternalSeleniumDsl.g:845:2: ( ( (lv_name_0_0= RULE_HTML_ATTRIBUTE ) ) ( (lv_matcher_1_0= ruleMatcher ) ) ( (lv_value_2_0= ruleContent ) ) )
            {
            // InternalSeleniumDsl.g:845:2: ( ( (lv_name_0_0= RULE_HTML_ATTRIBUTE ) ) ( (lv_matcher_1_0= ruleMatcher ) ) ( (lv_value_2_0= ruleContent ) ) )
            // InternalSeleniumDsl.g:846:3: ( (lv_name_0_0= RULE_HTML_ATTRIBUTE ) ) ( (lv_matcher_1_0= ruleMatcher ) ) ( (lv_value_2_0= ruleContent ) )
            {
            // InternalSeleniumDsl.g:846:3: ( (lv_name_0_0= RULE_HTML_ATTRIBUTE ) )
            // InternalSeleniumDsl.g:847:4: (lv_name_0_0= RULE_HTML_ATTRIBUTE )
            {
            // InternalSeleniumDsl.g:847:4: (lv_name_0_0= RULE_HTML_ATTRIBUTE )
            // InternalSeleniumDsl.g:848:5: lv_name_0_0= RULE_HTML_ATTRIBUTE
            {
            lv_name_0_0=(Token)match(input,RULE_HTML_ATTRIBUTE,FOLLOW_31); 

            					newLeafNode(lv_name_0_0, grammarAccess.getElementAttributeAccess().getNameHTML_ATTRIBUTETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getElementAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"www.imta.fr.browserautomation.SeleniumDsl.HTML_ATTRIBUTE");
            				

            }


            }

            // InternalSeleniumDsl.g:864:3: ( (lv_matcher_1_0= ruleMatcher ) )
            // InternalSeleniumDsl.g:865:4: (lv_matcher_1_0= ruleMatcher )
            {
            // InternalSeleniumDsl.g:865:4: (lv_matcher_1_0= ruleMatcher )
            // InternalSeleniumDsl.g:866:5: lv_matcher_1_0= ruleMatcher
            {

            					newCompositeNode(grammarAccess.getElementAttributeAccess().getMatcherMatcherParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
            lv_matcher_1_0=ruleMatcher();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElementAttributeRule());
            					}
            					set(
            						current,
            						"matcher",
            						lv_matcher_1_0,
            						"www.imta.fr.browserautomation.SeleniumDsl.Matcher");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSeleniumDsl.g:883:3: ( (lv_value_2_0= ruleContent ) )
            // InternalSeleniumDsl.g:884:4: (lv_value_2_0= ruleContent )
            {
            // InternalSeleniumDsl.g:884:4: (lv_value_2_0= ruleContent )
            // InternalSeleniumDsl.g:885:5: lv_value_2_0= ruleContent
            {

            					newCompositeNode(grammarAccess.getElementAttributeAccess().getValueContentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleContent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElementAttributeRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"www.imta.fr.browserautomation.SeleniumDsl.Content");
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
    // $ANTLR end "ruleElementAttribute"


    // $ANTLR start "entryRuleContent"
    // InternalSeleniumDsl.g:906:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // InternalSeleniumDsl.g:906:48: (iv_ruleContent= ruleContent EOF )
            // InternalSeleniumDsl.g:907:2: iv_ruleContent= ruleContent EOF
            {
             newCompositeNode(grammarAccess.getContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContent=ruleContent();

            state._fsp--;

             current =iv_ruleContent; 
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
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // InternalSeleniumDsl.g:913:1: ruleContent returns [EObject current=null] : (this_ClipboardContent_0= ruleClipboardContent | this_StringContent_1= ruleStringContent ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        EObject this_ClipboardContent_0 = null;

        EObject this_StringContent_1 = null;



        	enterRule();

        try {
            // InternalSeleniumDsl.g:919:2: ( (this_ClipboardContent_0= ruleClipboardContent | this_StringContent_1= ruleStringContent ) )
            // InternalSeleniumDsl.g:920:2: (this_ClipboardContent_0= ruleClipboardContent | this_StringContent_1= ruleStringContent )
            {
            // InternalSeleniumDsl.g:920:2: (this_ClipboardContent_0= ruleClipboardContent | this_StringContent_1= ruleStringContent )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
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
                    // InternalSeleniumDsl.g:921:3: this_ClipboardContent_0= ruleClipboardContent
                    {

                    			newCompositeNode(grammarAccess.getContentAccess().getClipboardContentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClipboardContent_0=ruleClipboardContent();

                    state._fsp--;


                    			current = this_ClipboardContent_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSeleniumDsl.g:930:3: this_StringContent_1= ruleStringContent
                    {

                    			newCompositeNode(grammarAccess.getContentAccess().getStringContentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringContent_1=ruleStringContent();

                    state._fsp--;


                    			current = this_StringContent_1;
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
    // $ANTLR end "ruleContent"


    // $ANTLR start "entryRuleClipboardContent"
    // InternalSeleniumDsl.g:942:1: entryRuleClipboardContent returns [EObject current=null] : iv_ruleClipboardContent= ruleClipboardContent EOF ;
    public final EObject entryRuleClipboardContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClipboardContent = null;


        try {
            // InternalSeleniumDsl.g:942:57: (iv_ruleClipboardContent= ruleClipboardContent EOF )
            // InternalSeleniumDsl.g:943:2: iv_ruleClipboardContent= ruleClipboardContent EOF
            {
             newCompositeNode(grammarAccess.getClipboardContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClipboardContent=ruleClipboardContent();

            state._fsp--;

             current =iv_ruleClipboardContent; 
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
    // $ANTLR end "entryRuleClipboardContent"


    // $ANTLR start "ruleClipboardContent"
    // InternalSeleniumDsl.g:949:1: ruleClipboardContent returns [EObject current=null] : (otherlv_0= 'the' otherlv_1= 'saved' otherlv_2= 'content' ( (lv_key_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleClipboardContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_key_3_0=null;


        	enterRule();

        try {
            // InternalSeleniumDsl.g:955:2: ( (otherlv_0= 'the' otherlv_1= 'saved' otherlv_2= 'content' ( (lv_key_3_0= RULE_STRING ) ) ) )
            // InternalSeleniumDsl.g:956:2: (otherlv_0= 'the' otherlv_1= 'saved' otherlv_2= 'content' ( (lv_key_3_0= RULE_STRING ) ) )
            {
            // InternalSeleniumDsl.g:956:2: (otherlv_0= 'the' otherlv_1= 'saved' otherlv_2= 'content' ( (lv_key_3_0= RULE_STRING ) ) )
            // InternalSeleniumDsl.g:957:3: otherlv_0= 'the' otherlv_1= 'saved' otherlv_2= 'content' ( (lv_key_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getClipboardContentAccess().getTheKeyword_0());
            		
            otherlv_1=(Token)match(input,42,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getClipboardContentAccess().getSavedKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getClipboardContentAccess().getContentKeyword_2());
            		
            // InternalSeleniumDsl.g:969:3: ( (lv_key_3_0= RULE_STRING ) )
            // InternalSeleniumDsl.g:970:4: (lv_key_3_0= RULE_STRING )
            {
            // InternalSeleniumDsl.g:970:4: (lv_key_3_0= RULE_STRING )
            // InternalSeleniumDsl.g:971:5: lv_key_3_0= RULE_STRING
            {
            lv_key_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_key_3_0, grammarAccess.getClipboardContentAccess().getKeySTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClipboardContentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_3_0,
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
    // $ANTLR end "ruleClipboardContent"


    // $ANTLR start "entryRuleStringContent"
    // InternalSeleniumDsl.g:991:1: entryRuleStringContent returns [EObject current=null] : iv_ruleStringContent= ruleStringContent EOF ;
    public final EObject entryRuleStringContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringContent = null;


        try {
            // InternalSeleniumDsl.g:991:54: (iv_ruleStringContent= ruleStringContent EOF )
            // InternalSeleniumDsl.g:992:2: iv_ruleStringContent= ruleStringContent EOF
            {
             newCompositeNode(grammarAccess.getStringContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringContent=ruleStringContent();

            state._fsp--;

             current =iv_ruleStringContent; 
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
    // $ANTLR end "entryRuleStringContent"


    // $ANTLR start "ruleStringContent"
    // InternalSeleniumDsl.g:998:1: ruleStringContent returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringContent() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalSeleniumDsl.g:1004:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalSeleniumDsl.g:1005:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalSeleniumDsl.g:1005:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalSeleniumDsl.g:1006:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalSeleniumDsl.g:1006:3: (lv_value_0_0= RULE_STRING )
            // InternalSeleniumDsl.g:1007:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringContentAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringContentRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleStringContent"


    // $ANTLR start "entryRuleProperties"
    // InternalSeleniumDsl.g:1026:1: entryRuleProperties returns [EObject current=null] : iv_ruleProperties= ruleProperties EOF ;
    public final EObject entryRuleProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperties = null;


        try {
            // InternalSeleniumDsl.g:1026:51: (iv_ruleProperties= ruleProperties EOF )
            // InternalSeleniumDsl.g:1027:2: iv_ruleProperties= ruleProperties EOF
            {
             newCompositeNode(grammarAccess.getPropertiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperties=ruleProperties();

            state._fsp--;

             current =iv_ruleProperties; 
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
    // $ANTLR end "entryRuleProperties"


    // $ANTLR start "ruleProperties"
    // InternalSeleniumDsl.g:1033:1: ruleProperties returns [EObject current=null] : ( ( (lv_properties_0_0= ruleElementProperty ) ) (otherlv_1= 'and' ( (lv_properties_2_0= ruleElementProperty ) ) )? ) ;
    public final EObject ruleProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_properties_0_0 = null;

        EObject lv_properties_2_0 = null;



        	enterRule();

        try {
            // InternalSeleniumDsl.g:1039:2: ( ( ( (lv_properties_0_0= ruleElementProperty ) ) (otherlv_1= 'and' ( (lv_properties_2_0= ruleElementProperty ) ) )? ) )
            // InternalSeleniumDsl.g:1040:2: ( ( (lv_properties_0_0= ruleElementProperty ) ) (otherlv_1= 'and' ( (lv_properties_2_0= ruleElementProperty ) ) )? )
            {
            // InternalSeleniumDsl.g:1040:2: ( ( (lv_properties_0_0= ruleElementProperty ) ) (otherlv_1= 'and' ( (lv_properties_2_0= ruleElementProperty ) ) )? )
            // InternalSeleniumDsl.g:1041:3: ( (lv_properties_0_0= ruleElementProperty ) ) (otherlv_1= 'and' ( (lv_properties_2_0= ruleElementProperty ) ) )?
            {
            // InternalSeleniumDsl.g:1041:3: ( (lv_properties_0_0= ruleElementProperty ) )
            // InternalSeleniumDsl.g:1042:4: (lv_properties_0_0= ruleElementProperty )
            {
            // InternalSeleniumDsl.g:1042:4: (lv_properties_0_0= ruleElementProperty )
            // InternalSeleniumDsl.g:1043:5: lv_properties_0_0= ruleElementProperty
            {

            					newCompositeNode(grammarAccess.getPropertiesAccess().getPropertiesElementPropertyParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_30);
            lv_properties_0_0=ruleElementProperty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertiesRule());
            					}
            					add(
            						current,
            						"properties",
            						lv_properties_0_0,
            						"www.imta.fr.browserautomation.SeleniumDsl.ElementProperty");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSeleniumDsl.g:1060:3: (otherlv_1= 'and' ( (lv_properties_2_0= ruleElementProperty ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==41) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSeleniumDsl.g:1061:4: otherlv_1= 'and' ( (lv_properties_2_0= ruleElementProperty ) )
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_28); 

                    				newLeafNode(otherlv_1, grammarAccess.getPropertiesAccess().getAndKeyword_1_0());
                    			
                    // InternalSeleniumDsl.g:1065:4: ( (lv_properties_2_0= ruleElementProperty ) )
                    // InternalSeleniumDsl.g:1066:5: (lv_properties_2_0= ruleElementProperty )
                    {
                    // InternalSeleniumDsl.g:1066:5: (lv_properties_2_0= ruleElementProperty )
                    // InternalSeleniumDsl.g:1067:6: lv_properties_2_0= ruleElementProperty
                    {

                    						newCompositeNode(grammarAccess.getPropertiesAccess().getPropertiesElementPropertyParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_properties_2_0=ruleElementProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertiesRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_2_0,
                    							"www.imta.fr.browserautomation.SeleniumDsl.ElementProperty");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleProperties"


    // $ANTLR start "entryRuleElementProperty"
    // InternalSeleniumDsl.g:1089:1: entryRuleElementProperty returns [EObject current=null] : iv_ruleElementProperty= ruleElementProperty EOF ;
    public final EObject entryRuleElementProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementProperty = null;


        try {
            // InternalSeleniumDsl.g:1089:56: (iv_ruleElementProperty= ruleElementProperty EOF )
            // InternalSeleniumDsl.g:1090:2: iv_ruleElementProperty= ruleElementProperty EOF
            {
             newCompositeNode(grammarAccess.getElementPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementProperty=ruleElementProperty();

            state._fsp--;

             current =iv_ruleElementProperty; 
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
    // $ANTLR end "entryRuleElementProperty"


    // $ANTLR start "ruleElementProperty"
    // InternalSeleniumDsl.g:1096:1: ruleElementProperty returns [EObject current=null] : ( ( (lv_negated_0_0= 'not' ) )? ( ( (lv_property_1_1= 'selected' | lv_property_1_2= 'visible' | lv_property_1_3= 'enabled' ) ) ) ) ;
    public final EObject ruleElementProperty() throws RecognitionException {
        EObject current = null;

        Token lv_negated_0_0=null;
        Token lv_property_1_1=null;
        Token lv_property_1_2=null;
        Token lv_property_1_3=null;


        	enterRule();

        try {
            // InternalSeleniumDsl.g:1102:2: ( ( ( (lv_negated_0_0= 'not' ) )? ( ( (lv_property_1_1= 'selected' | lv_property_1_2= 'visible' | lv_property_1_3= 'enabled' ) ) ) ) )
            // InternalSeleniumDsl.g:1103:2: ( ( (lv_negated_0_0= 'not' ) )? ( ( (lv_property_1_1= 'selected' | lv_property_1_2= 'visible' | lv_property_1_3= 'enabled' ) ) ) )
            {
            // InternalSeleniumDsl.g:1103:2: ( ( (lv_negated_0_0= 'not' ) )? ( ( (lv_property_1_1= 'selected' | lv_property_1_2= 'visible' | lv_property_1_3= 'enabled' ) ) ) )
            // InternalSeleniumDsl.g:1104:3: ( (lv_negated_0_0= 'not' ) )? ( ( (lv_property_1_1= 'selected' | lv_property_1_2= 'visible' | lv_property_1_3= 'enabled' ) ) )
            {
            // InternalSeleniumDsl.g:1104:3: ( (lv_negated_0_0= 'not' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==43) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSeleniumDsl.g:1105:4: (lv_negated_0_0= 'not' )
                    {
                    // InternalSeleniumDsl.g:1105:4: (lv_negated_0_0= 'not' )
                    // InternalSeleniumDsl.g:1106:5: lv_negated_0_0= 'not'
                    {
                    lv_negated_0_0=(Token)match(input,43,FOLLOW_33); 

                    					newLeafNode(lv_negated_0_0, grammarAccess.getElementPropertyAccess().getNegatedNotKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getElementPropertyRule());
                    					}
                    					setWithLastConsumed(current, "negated", lv_negated_0_0, "not");
                    				

                    }


                    }
                    break;

            }

            // InternalSeleniumDsl.g:1118:3: ( ( (lv_property_1_1= 'selected' | lv_property_1_2= 'visible' | lv_property_1_3= 'enabled' ) ) )
            // InternalSeleniumDsl.g:1119:4: ( (lv_property_1_1= 'selected' | lv_property_1_2= 'visible' | lv_property_1_3= 'enabled' ) )
            {
            // InternalSeleniumDsl.g:1119:4: ( (lv_property_1_1= 'selected' | lv_property_1_2= 'visible' | lv_property_1_3= 'enabled' ) )
            // InternalSeleniumDsl.g:1120:5: (lv_property_1_1= 'selected' | lv_property_1_2= 'visible' | lv_property_1_3= 'enabled' )
            {
            // InternalSeleniumDsl.g:1120:5: (lv_property_1_1= 'selected' | lv_property_1_2= 'visible' | lv_property_1_3= 'enabled' )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt14=1;
                }
                break;
            case 45:
                {
                alt14=2;
                }
                break;
            case 46:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalSeleniumDsl.g:1121:6: lv_property_1_1= 'selected'
                    {
                    lv_property_1_1=(Token)match(input,44,FOLLOW_2); 

                    						newLeafNode(lv_property_1_1, grammarAccess.getElementPropertyAccess().getPropertySelectedKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getElementPropertyRule());
                    						}
                    						setWithLastConsumed(current, "property", lv_property_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSeleniumDsl.g:1132:6: lv_property_1_2= 'visible'
                    {
                    lv_property_1_2=(Token)match(input,45,FOLLOW_2); 

                    						newLeafNode(lv_property_1_2, grammarAccess.getElementPropertyAccess().getPropertyVisibleKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getElementPropertyRule());
                    						}
                    						setWithLastConsumed(current, "property", lv_property_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalSeleniumDsl.g:1143:6: lv_property_1_3= 'enabled'
                    {
                    lv_property_1_3=(Token)match(input,46,FOLLOW_2); 

                    						newLeafNode(lv_property_1_3, grammarAccess.getElementPropertyAccess().getPropertyEnabledKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getElementPropertyRule());
                    						}
                    						setWithLastConsumed(current, "property", lv_property_1_3, null);
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleElementProperty"


    // $ANTLR start "entryRuleSelectorPredicate"
    // InternalSeleniumDsl.g:1160:1: entryRuleSelectorPredicate returns [EObject current=null] : iv_ruleSelectorPredicate= ruleSelectorPredicate EOF ;
    public final EObject entryRuleSelectorPredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectorPredicate = null;


        try {
            // InternalSeleniumDsl.g:1160:58: (iv_ruleSelectorPredicate= ruleSelectorPredicate EOF )
            // InternalSeleniumDsl.g:1161:2: iv_ruleSelectorPredicate= ruleSelectorPredicate EOF
            {
             newCompositeNode(grammarAccess.getSelectorPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectorPredicate=ruleSelectorPredicate();

            state._fsp--;

             current =iv_ruleSelectorPredicate; 
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
    // $ANTLR end "entryRuleSelectorPredicate"


    // $ANTLR start "ruleSelectorPredicate"
    // InternalSeleniumDsl.g:1167:1: ruleSelectorPredicate returns [EObject current=null] : (this_AllCondition_0= ruleAllCondition | this_OrdinalCondition_1= ruleOrdinalCondition | this_LastCondition_2= ruleLastCondition | this_FirstCondition_3= ruleFirstCondition ) ;
    public final EObject ruleSelectorPredicate() throws RecognitionException {
        EObject current = null;

        EObject this_AllCondition_0 = null;

        EObject this_OrdinalCondition_1 = null;

        EObject this_LastCondition_2 = null;

        EObject this_FirstCondition_3 = null;



        	enterRule();

        try {
            // InternalSeleniumDsl.g:1173:2: ( (this_AllCondition_0= ruleAllCondition | this_OrdinalCondition_1= ruleOrdinalCondition | this_LastCondition_2= ruleLastCondition | this_FirstCondition_3= ruleFirstCondition ) )
            // InternalSeleniumDsl.g:1174:2: (this_AllCondition_0= ruleAllCondition | this_OrdinalCondition_1= ruleOrdinalCondition | this_LastCondition_2= ruleLastCondition | this_FirstCondition_3= ruleFirstCondition )
            {
            // InternalSeleniumDsl.g:1174:2: (this_AllCondition_0= ruleAllCondition | this_OrdinalCondition_1= ruleOrdinalCondition | this_LastCondition_2= ruleLastCondition | this_FirstCondition_3= ruleFirstCondition )
            int alt15=4;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==47) ) {
                alt15=1;
            }
            else if ( (LA15_0==26) ) {
                switch ( input.LA(2) ) {
                case RULE_INT:
                    {
                    alt15=2;
                    }
                    break;
                case EOF:
                case RULE_STRING:
                    {
                    alt15=4;
                    }
                    break;
                case 50:
                    {
                    alt15=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalSeleniumDsl.g:1175:3: this_AllCondition_0= ruleAllCondition
                    {

                    			newCompositeNode(grammarAccess.getSelectorPredicateAccess().getAllConditionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AllCondition_0=ruleAllCondition();

                    state._fsp--;


                    			current = this_AllCondition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSeleniumDsl.g:1184:3: this_OrdinalCondition_1= ruleOrdinalCondition
                    {

                    			newCompositeNode(grammarAccess.getSelectorPredicateAccess().getOrdinalConditionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OrdinalCondition_1=ruleOrdinalCondition();

                    state._fsp--;


                    			current = this_OrdinalCondition_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSeleniumDsl.g:1193:3: this_LastCondition_2= ruleLastCondition
                    {

                    			newCompositeNode(grammarAccess.getSelectorPredicateAccess().getLastConditionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LastCondition_2=ruleLastCondition();

                    state._fsp--;


                    			current = this_LastCondition_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSeleniumDsl.g:1202:3: this_FirstCondition_3= ruleFirstCondition
                    {

                    			newCompositeNode(grammarAccess.getSelectorPredicateAccess().getFirstConditionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_FirstCondition_3=ruleFirstCondition();

                    state._fsp--;


                    			current = this_FirstCondition_3;
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
    // $ANTLR end "ruleSelectorPredicate"


    // $ANTLR start "entryRuleAllCondition"
    // InternalSeleniumDsl.g:1214:1: entryRuleAllCondition returns [EObject current=null] : iv_ruleAllCondition= ruleAllCondition EOF ;
    public final EObject entryRuleAllCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllCondition = null;


        try {
            // InternalSeleniumDsl.g:1214:53: (iv_ruleAllCondition= ruleAllCondition EOF )
            // InternalSeleniumDsl.g:1215:2: iv_ruleAllCondition= ruleAllCondition EOF
            {
             newCompositeNode(grammarAccess.getAllConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllCondition=ruleAllCondition();

            state._fsp--;

             current =iv_ruleAllCondition; 
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
    // $ANTLR end "entryRuleAllCondition"


    // $ANTLR start "ruleAllCondition"
    // InternalSeleniumDsl.g:1221:1: ruleAllCondition returns [EObject current=null] : ( () otherlv_1= 'all' otherlv_2= 'elements' otherlv_3= 'of' otherlv_4= 'type' ) ;
    public final EObject ruleAllCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSeleniumDsl.g:1227:2: ( ( () otherlv_1= 'all' otherlv_2= 'elements' otherlv_3= 'of' otherlv_4= 'type' ) )
            // InternalSeleniumDsl.g:1228:2: ( () otherlv_1= 'all' otherlv_2= 'elements' otherlv_3= 'of' otherlv_4= 'type' )
            {
            // InternalSeleniumDsl.g:1228:2: ( () otherlv_1= 'all' otherlv_2= 'elements' otherlv_3= 'of' otherlv_4= 'type' )
            // InternalSeleniumDsl.g:1229:3: () otherlv_1= 'all' otherlv_2= 'elements' otherlv_3= 'of' otherlv_4= 'type'
            {
            // InternalSeleniumDsl.g:1229:3: ()
            // InternalSeleniumDsl.g:1230:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAllConditionAccess().getAllConditionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getAllConditionAccess().getAllKeyword_1());
            		
            otherlv_2=(Token)match(input,48,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getAllConditionAccess().getElementsKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getAllConditionAccess().getOfKeyword_3());
            		
            otherlv_4=(Token)match(input,49,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAllConditionAccess().getTypeKeyword_4());
            		

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
    // $ANTLR end "ruleAllCondition"


    // $ANTLR start "entryRuleIntWithSuffix"
    // InternalSeleniumDsl.g:1256:1: entryRuleIntWithSuffix returns [EObject current=null] : iv_ruleIntWithSuffix= ruleIntWithSuffix EOF ;
    public final EObject entryRuleIntWithSuffix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntWithSuffix = null;


        try {
            // InternalSeleniumDsl.g:1256:54: (iv_ruleIntWithSuffix= ruleIntWithSuffix EOF )
            // InternalSeleniumDsl.g:1257:2: iv_ruleIntWithSuffix= ruleIntWithSuffix EOF
            {
             newCompositeNode(grammarAccess.getIntWithSuffixRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntWithSuffix=ruleIntWithSuffix();

            state._fsp--;

             current =iv_ruleIntWithSuffix; 
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
    // $ANTLR end "entryRuleIntWithSuffix"


    // $ANTLR start "ruleIntWithSuffix"
    // InternalSeleniumDsl.g:1263:1: ruleIntWithSuffix returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) this_Suffix_1= RULE_SUFFIX ) ;
    public final EObject ruleIntWithSuffix() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token this_Suffix_1=null;


        	enterRule();

        try {
            // InternalSeleniumDsl.g:1269:2: ( ( ( (lv_value_0_0= RULE_INT ) ) this_Suffix_1= RULE_SUFFIX ) )
            // InternalSeleniumDsl.g:1270:2: ( ( (lv_value_0_0= RULE_INT ) ) this_Suffix_1= RULE_SUFFIX )
            {
            // InternalSeleniumDsl.g:1270:2: ( ( (lv_value_0_0= RULE_INT ) ) this_Suffix_1= RULE_SUFFIX )
            // InternalSeleniumDsl.g:1271:3: ( (lv_value_0_0= RULE_INT ) ) this_Suffix_1= RULE_SUFFIX
            {
            // InternalSeleniumDsl.g:1271:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalSeleniumDsl.g:1272:4: (lv_value_0_0= RULE_INT )
            {
            // InternalSeleniumDsl.g:1272:4: (lv_value_0_0= RULE_INT )
            // InternalSeleniumDsl.g:1273:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_36); 

            					newLeafNode(lv_value_0_0, grammarAccess.getIntWithSuffixAccess().getValueINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntWithSuffixRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            this_Suffix_1=(Token)match(input,RULE_SUFFIX,FOLLOW_2); 

            			newLeafNode(this_Suffix_1, grammarAccess.getIntWithSuffixAccess().getSuffixTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleIntWithSuffix"


    // $ANTLR start "entryRuleOrdinalCondition"
    // InternalSeleniumDsl.g:1297:1: entryRuleOrdinalCondition returns [EObject current=null] : iv_ruleOrdinalCondition= ruleOrdinalCondition EOF ;
    public final EObject entryRuleOrdinalCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrdinalCondition = null;


        try {
            // InternalSeleniumDsl.g:1297:57: (iv_ruleOrdinalCondition= ruleOrdinalCondition EOF )
            // InternalSeleniumDsl.g:1298:2: iv_ruleOrdinalCondition= ruleOrdinalCondition EOF
            {
             newCompositeNode(grammarAccess.getOrdinalConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrdinalCondition=ruleOrdinalCondition();

            state._fsp--;

             current =iv_ruleOrdinalCondition; 
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
    // $ANTLR end "entryRuleOrdinalCondition"


    // $ANTLR start "ruleOrdinalCondition"
    // InternalSeleniumDsl.g:1304:1: ruleOrdinalCondition returns [EObject current=null] : (otherlv_0= 'the' ( (lv_ordinal_1_0= ruleIntWithSuffix ) ) ) ;
    public final EObject ruleOrdinalCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ordinal_1_0 = null;



        	enterRule();

        try {
            // InternalSeleniumDsl.g:1310:2: ( (otherlv_0= 'the' ( (lv_ordinal_1_0= ruleIntWithSuffix ) ) ) )
            // InternalSeleniumDsl.g:1311:2: (otherlv_0= 'the' ( (lv_ordinal_1_0= ruleIntWithSuffix ) ) )
            {
            // InternalSeleniumDsl.g:1311:2: (otherlv_0= 'the' ( (lv_ordinal_1_0= ruleIntWithSuffix ) ) )
            // InternalSeleniumDsl.g:1312:3: otherlv_0= 'the' ( (lv_ordinal_1_0= ruleIntWithSuffix ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getOrdinalConditionAccess().getTheKeyword_0());
            		
            // InternalSeleniumDsl.g:1316:3: ( (lv_ordinal_1_0= ruleIntWithSuffix ) )
            // InternalSeleniumDsl.g:1317:4: (lv_ordinal_1_0= ruleIntWithSuffix )
            {
            // InternalSeleniumDsl.g:1317:4: (lv_ordinal_1_0= ruleIntWithSuffix )
            // InternalSeleniumDsl.g:1318:5: lv_ordinal_1_0= ruleIntWithSuffix
            {

            					newCompositeNode(grammarAccess.getOrdinalConditionAccess().getOrdinalIntWithSuffixParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_ordinal_1_0=ruleIntWithSuffix();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrdinalConditionRule());
            					}
            					set(
            						current,
            						"ordinal",
            						lv_ordinal_1_0,
            						"www.imta.fr.browserautomation.SeleniumDsl.IntWithSuffix");
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
    // $ANTLR end "ruleOrdinalCondition"


    // $ANTLR start "entryRuleLastCondition"
    // InternalSeleniumDsl.g:1339:1: entryRuleLastCondition returns [EObject current=null] : iv_ruleLastCondition= ruleLastCondition EOF ;
    public final EObject entryRuleLastCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLastCondition = null;


        try {
            // InternalSeleniumDsl.g:1339:54: (iv_ruleLastCondition= ruleLastCondition EOF )
            // InternalSeleniumDsl.g:1340:2: iv_ruleLastCondition= ruleLastCondition EOF
            {
             newCompositeNode(grammarAccess.getLastConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLastCondition=ruleLastCondition();

            state._fsp--;

             current =iv_ruleLastCondition; 
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
    // $ANTLR end "entryRuleLastCondition"


    // $ANTLR start "ruleLastCondition"
    // InternalSeleniumDsl.g:1346:1: ruleLastCondition returns [EObject current=null] : ( () otherlv_1= 'the' otherlv_2= 'last' ) ;
    public final EObject ruleLastCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSeleniumDsl.g:1352:2: ( ( () otherlv_1= 'the' otherlv_2= 'last' ) )
            // InternalSeleniumDsl.g:1353:2: ( () otherlv_1= 'the' otherlv_2= 'last' )
            {
            // InternalSeleniumDsl.g:1353:2: ( () otherlv_1= 'the' otherlv_2= 'last' )
            // InternalSeleniumDsl.g:1354:3: () otherlv_1= 'the' otherlv_2= 'last'
            {
            // InternalSeleniumDsl.g:1354:3: ()
            // InternalSeleniumDsl.g:1355:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLastConditionAccess().getLastConditionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getLastConditionAccess().getTheKeyword_1());
            		
            otherlv_2=(Token)match(input,50,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getLastConditionAccess().getLastKeyword_2());
            		

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
    // $ANTLR end "ruleLastCondition"


    // $ANTLR start "entryRuleFirstCondition"
    // InternalSeleniumDsl.g:1373:1: entryRuleFirstCondition returns [EObject current=null] : iv_ruleFirstCondition= ruleFirstCondition EOF ;
    public final EObject entryRuleFirstCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFirstCondition = null;


        try {
            // InternalSeleniumDsl.g:1373:55: (iv_ruleFirstCondition= ruleFirstCondition EOF )
            // InternalSeleniumDsl.g:1374:2: iv_ruleFirstCondition= ruleFirstCondition EOF
            {
             newCompositeNode(grammarAccess.getFirstConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFirstCondition=ruleFirstCondition();

            state._fsp--;

             current =iv_ruleFirstCondition; 
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
    // $ANTLR end "entryRuleFirstCondition"


    // $ANTLR start "ruleFirstCondition"
    // InternalSeleniumDsl.g:1380:1: ruleFirstCondition returns [EObject current=null] : ( () otherlv_1= 'the' ) ;
    public final EObject ruleFirstCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSeleniumDsl.g:1386:2: ( ( () otherlv_1= 'the' ) )
            // InternalSeleniumDsl.g:1387:2: ( () otherlv_1= 'the' )
            {
            // InternalSeleniumDsl.g:1387:2: ( () otherlv_1= 'the' )
            // InternalSeleniumDsl.g:1388:3: () otherlv_1= 'the'
            {
            // InternalSeleniumDsl.g:1388:3: ()
            // InternalSeleniumDsl.g:1389:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFirstConditionAccess().getFirstConditionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getFirstConditionAccess().getTheKeyword_1());
            		

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
    // $ANTLR end "ruleFirstCondition"


    // $ANTLR start "entryRuleMatcher"
    // InternalSeleniumDsl.g:1403:1: entryRuleMatcher returns [String current=null] : iv_ruleMatcher= ruleMatcher EOF ;
    public final String entryRuleMatcher() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMatcher = null;


        try {
            // InternalSeleniumDsl.g:1403:47: (iv_ruleMatcher= ruleMatcher EOF )
            // InternalSeleniumDsl.g:1404:2: iv_ruleMatcher= ruleMatcher EOF
            {
             newCompositeNode(grammarAccess.getMatcherRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMatcher=ruleMatcher();

            state._fsp--;

             current =iv_ruleMatcher.getText(); 
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
    // $ANTLR end "entryRuleMatcher"


    // $ANTLR start "ruleMatcher"
    // InternalSeleniumDsl.g:1410:1: ruleMatcher returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'containing' | kw= 'matching' ) ;
    public final AntlrDatatypeRuleToken ruleMatcher() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSeleniumDsl.g:1416:2: ( (kw= 'containing' | kw= 'matching' ) )
            // InternalSeleniumDsl.g:1417:2: (kw= 'containing' | kw= 'matching' )
            {
            // InternalSeleniumDsl.g:1417:2: (kw= 'containing' | kw= 'matching' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==51) ) {
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
                    // InternalSeleniumDsl.g:1418:3: kw= 'containing'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMatcherAccess().getContainingKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSeleniumDsl.g:1424:3: kw= 'matching'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMatcherAccess().getMatchingKeyword_1());
                    		

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
    // $ANTLR end "ruleMatcher"


    // $ANTLR start "entryRuleVerify"
    // InternalSeleniumDsl.g:1433:1: entryRuleVerify returns [EObject current=null] : iv_ruleVerify= ruleVerify EOF ;
    public final EObject entryRuleVerify() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerify = null;


        try {
            // InternalSeleniumDsl.g:1433:47: (iv_ruleVerify= ruleVerify EOF )
            // InternalSeleniumDsl.g:1434:2: iv_ruleVerify= ruleVerify EOF
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
    // InternalSeleniumDsl.g:1440:1: ruleVerify returns [EObject current=null] : (otherlv_0= 'verify' otherlv_1= 'that' ( (lv_selector_2_0= ruleSelector ) ) otherlv_3= 'is' ( (lv_properties_4_0= ruleElementProperty ) ) (otherlv_5= 'and' ( (lv_properties_6_0= ruleElementProperty ) ) )? ) ;
    public final EObject ruleVerify() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_selector_2_0 = null;

        EObject lv_properties_4_0 = null;

        EObject lv_properties_6_0 = null;



        	enterRule();

        try {
            // InternalSeleniumDsl.g:1446:2: ( (otherlv_0= 'verify' otherlv_1= 'that' ( (lv_selector_2_0= ruleSelector ) ) otherlv_3= 'is' ( (lv_properties_4_0= ruleElementProperty ) ) (otherlv_5= 'and' ( (lv_properties_6_0= ruleElementProperty ) ) )? ) )
            // InternalSeleniumDsl.g:1447:2: (otherlv_0= 'verify' otherlv_1= 'that' ( (lv_selector_2_0= ruleSelector ) ) otherlv_3= 'is' ( (lv_properties_4_0= ruleElementProperty ) ) (otherlv_5= 'and' ( (lv_properties_6_0= ruleElementProperty ) ) )? )
            {
            // InternalSeleniumDsl.g:1447:2: (otherlv_0= 'verify' otherlv_1= 'that' ( (lv_selector_2_0= ruleSelector ) ) otherlv_3= 'is' ( (lv_properties_4_0= ruleElementProperty ) ) (otherlv_5= 'and' ( (lv_properties_6_0= ruleElementProperty ) ) )? )
            // InternalSeleniumDsl.g:1448:3: otherlv_0= 'verify' otherlv_1= 'that' ( (lv_selector_2_0= ruleSelector ) ) otherlv_3= 'is' ( (lv_properties_4_0= ruleElementProperty ) ) (otherlv_5= 'and' ( (lv_properties_6_0= ruleElementProperty ) ) )?
            {
            otherlv_0=(Token)match(input,53,FOLLOW_39); 

            			newLeafNode(otherlv_0, grammarAccess.getVerifyAccess().getVerifyKeyword_0());
            		
            otherlv_1=(Token)match(input,39,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getVerifyAccess().getThatKeyword_1());
            		
            // InternalSeleniumDsl.g:1456:3: ( (lv_selector_2_0= ruleSelector ) )
            // InternalSeleniumDsl.g:1457:4: (lv_selector_2_0= ruleSelector )
            {
            // InternalSeleniumDsl.g:1457:4: (lv_selector_2_0= ruleSelector )
            // InternalSeleniumDsl.g:1458:5: lv_selector_2_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getVerifyAccess().getSelectorSelectorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
            lv_selector_2_0=ruleSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVerifyRule());
            					}
            					set(
            						current,
            						"selector",
            						lv_selector_2_0,
            						"www.imta.fr.browserautomation.SeleniumDsl.Selector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,40,FOLLOW_28); 

            			newLeafNode(otherlv_3, grammarAccess.getVerifyAccess().getIsKeyword_3());
            		
            // InternalSeleniumDsl.g:1479:3: ( (lv_properties_4_0= ruleElementProperty ) )
            // InternalSeleniumDsl.g:1480:4: (lv_properties_4_0= ruleElementProperty )
            {
            // InternalSeleniumDsl.g:1480:4: (lv_properties_4_0= ruleElementProperty )
            // InternalSeleniumDsl.g:1481:5: lv_properties_4_0= ruleElementProperty
            {

            					newCompositeNode(grammarAccess.getVerifyAccess().getPropertiesElementPropertyParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_30);
            lv_properties_4_0=ruleElementProperty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVerifyRule());
            					}
            					add(
            						current,
            						"properties",
            						lv_properties_4_0,
            						"www.imta.fr.browserautomation.SeleniumDsl.ElementProperty");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSeleniumDsl.g:1498:3: (otherlv_5= 'and' ( (lv_properties_6_0= ruleElementProperty ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==41) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSeleniumDsl.g:1499:4: otherlv_5= 'and' ( (lv_properties_6_0= ruleElementProperty ) )
                    {
                    otherlv_5=(Token)match(input,41,FOLLOW_28); 

                    				newLeafNode(otherlv_5, grammarAccess.getVerifyAccess().getAndKeyword_5_0());
                    			
                    // InternalSeleniumDsl.g:1503:4: ( (lv_properties_6_0= ruleElementProperty ) )
                    // InternalSeleniumDsl.g:1504:5: (lv_properties_6_0= ruleElementProperty )
                    {
                    // InternalSeleniumDsl.g:1504:5: (lv_properties_6_0= ruleElementProperty )
                    // InternalSeleniumDsl.g:1505:6: lv_properties_6_0= ruleElementProperty
                    {

                    						newCompositeNode(grammarAccess.getVerifyAccess().getPropertiesElementPropertyParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_properties_6_0=ruleElementProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVerifyRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_6_0,
                    							"www.imta.fr.browserautomation.SeleniumDsl.ElementProperty");
                    						afterParserOrEnumRuleCall();
                    					

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


    // $ANTLR start "entryRuleDynamicURL"
    // InternalSeleniumDsl.g:1527:1: entryRuleDynamicURL returns [String current=null] : iv_ruleDynamicURL= ruleDynamicURL EOF ;
    public final String entryRuleDynamicURL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDynamicURL = null;


        try {
            // InternalSeleniumDsl.g:1527:50: (iv_ruleDynamicURL= ruleDynamicURL EOF )
            // InternalSeleniumDsl.g:1528:2: iv_ruleDynamicURL= ruleDynamicURL EOF
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
    // InternalSeleniumDsl.g:1534:1: ruleDynamicURL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_URL_0= RULE_URL | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleDynamicURL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_URL_0=null;
        Token this_STRING_1=null;


        	enterRule();

        try {
            // InternalSeleniumDsl.g:1540:2: ( (this_URL_0= RULE_URL | this_STRING_1= RULE_STRING ) )
            // InternalSeleniumDsl.g:1541:2: (this_URL_0= RULE_URL | this_STRING_1= RULE_STRING )
            {
            // InternalSeleniumDsl.g:1541:2: (this_URL_0= RULE_URL | this_STRING_1= RULE_STRING )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_URL) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_STRING) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalSeleniumDsl.g:1542:3: this_URL_0= RULE_URL
                    {
                    this_URL_0=(Token)match(input,RULE_URL,FOLLOW_2); 

                    			current.merge(this_URL_0);
                    		

                    			newLeafNode(this_URL_0, grammarAccess.getDynamicURLAccess().getURLTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSeleniumDsl.g:1550:3: this_STRING_1= RULE_STRING
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0020000443488002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200122L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000800004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008A00000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008200000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000780000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000700000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000008000000000L});

}