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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_HTML_ATTRIBUTE", "RULE_INT", "RULE_ORDINAL_SUFFIX", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Test'", "'case'", "':'", "'***'", "'open'", "'a'", "'browser'", "'window'", "'go'", "'to'", "'click'", "'on'", "'select'", "'copy'", "'the'", "'property'", "'of'", "'as'", "'paste'", "'content'", "'clipboard'", "'in'", "'fill'", "'with'", "'properties'", "'associated'", "'label'", "'that'", "'is'", "'and'", "'saved'", "'not'", "'selected'", "'visible'", "'enabled'", "'all'", "'elements'", "'type'", "'last'", "'containing'", "'matching'", "'verify'"
    };
    public static final int T__50=50;
    public static final int RULE_HTML_ATTRIBUTE=5;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
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
    public static final int RULE_ORDINAL_SUFFIX=7;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
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
    // InternalSeleniumDsl.g:71:1: ruleBrowserDsl returns [EObject current=null] : ( (lv_cases_0_0= ruleTestCase ) )* ;
    public final EObject ruleBrowserDsl() throws RecognitionException {
        EObject current = null;

        EObject lv_cases_0_0 = null;



        	enterRule();

        try {
            // InternalSeleniumDsl.g:77:2: ( ( (lv_cases_0_0= ruleTestCase ) )* )
            // InternalSeleniumDsl.g:78:2: ( (lv_cases_0_0= ruleTestCase ) )*
            {
            // InternalSeleniumDsl.g:78:2: ( (lv_cases_0_0= ruleTestCase ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSeleniumDsl.g:79:3: (lv_cases_0_0= ruleTestCase )
            	    {
            	    // InternalSeleniumDsl.g:79:3: (lv_cases_0_0= ruleTestCase )
            	    // InternalSeleniumDsl.g:80:4: lv_cases_0_0= ruleTestCase
            	    {

            	    				newCompositeNode(grammarAccess.getBrowserDslAccess().getCasesTestCaseParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_cases_0_0=ruleTestCase();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getBrowserDslRule());
            	    				}
            	    				add(
            	    					current,
            	    					"cases",
            	    					lv_cases_0_0,
            	    					"www.imta.fr.browserautomation.SeleniumDsl.TestCase");
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


    // $ANTLR start "entryRuleTestCase"
    // InternalSeleniumDsl.g:100:1: entryRuleTestCase returns [EObject current=null] : iv_ruleTestCase= ruleTestCase EOF ;
    public final EObject entryRuleTestCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestCase = null;


        try {
            // InternalSeleniumDsl.g:100:49: (iv_ruleTestCase= ruleTestCase EOF )
            // InternalSeleniumDsl.g:101:2: iv_ruleTestCase= ruleTestCase EOF
            {
             newCompositeNode(grammarAccess.getTestCaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestCase=ruleTestCase();

            state._fsp--;

             current =iv_ruleTestCase; 
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
    // $ANTLR end "entryRuleTestCase"


    // $ANTLR start "ruleTestCase"
    // InternalSeleniumDsl.g:107:1: ruleTestCase returns [EObject current=null] : (otherlv_0= 'Test' otherlv_1= 'case' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '***' ( (lv_commands_5_0= ruleCommand ) )* otherlv_6= '***' ) ;
    public final EObject ruleTestCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_commands_5_0 = null;



        	enterRule();

        try {
            // InternalSeleniumDsl.g:113:2: ( (otherlv_0= 'Test' otherlv_1= 'case' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '***' ( (lv_commands_5_0= ruleCommand ) )* otherlv_6= '***' ) )
            // InternalSeleniumDsl.g:114:2: (otherlv_0= 'Test' otherlv_1= 'case' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '***' ( (lv_commands_5_0= ruleCommand ) )* otherlv_6= '***' )
            {
            // InternalSeleniumDsl.g:114:2: (otherlv_0= 'Test' otherlv_1= 'case' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '***' ( (lv_commands_5_0= ruleCommand ) )* otherlv_6= '***' )
            // InternalSeleniumDsl.g:115:3: otherlv_0= 'Test' otherlv_1= 'case' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '***' ( (lv_commands_5_0= ruleCommand ) )* otherlv_6= '***'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTestCaseAccess().getTestKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTestCaseAccess().getCaseKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getTestCaseAccess().getColonKeyword_2());
            		
            // InternalSeleniumDsl.g:127:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalSeleniumDsl.g:128:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalSeleniumDsl.g:128:4: (lv_name_3_0= RULE_STRING )
            // InternalSeleniumDsl.g:129:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_name_3_0, grammarAccess.getTestCaseAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestCaseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getTestCaseAccess().getAsteriskAsteriskAsteriskKeyword_4());
            		
            // InternalSeleniumDsl.g:149:3: ( (lv_commands_5_0= ruleCommand ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17||LA2_0==21||LA2_0==23||(LA2_0>=25 && LA2_0<=26)||LA2_0==31||LA2_0==35||LA2_0==54) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSeleniumDsl.g:150:4: (lv_commands_5_0= ruleCommand )
            	    {
            	    // InternalSeleniumDsl.g:150:4: (lv_commands_5_0= ruleCommand )
            	    // InternalSeleniumDsl.g:151:5: lv_commands_5_0= ruleCommand
            	    {

            	    					newCompositeNode(grammarAccess.getTestCaseAccess().getCommandsCommandParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_commands_5_0=ruleCommand();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTestCaseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"commands",
            	    						lv_commands_5_0,
            	    						"www.imta.fr.browserautomation.SeleniumDsl.Command");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTestCaseAccess().getAsteriskAsteriskAsteriskKeyword_6());
            		

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
    // $ANTLR end "ruleTestCase"


    // $ANTLR start "entryRuleCommand"
    // InternalSeleniumDsl.g:176:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalSeleniumDsl.g:176:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalSeleniumDsl.g:177:2: iv_ruleCommand= ruleCommand EOF
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
    // InternalSeleniumDsl.g:183:1: ruleCommand returns [EObject current=null] : (this_OpenBrowser_0= ruleOpenBrowser | this_GoTo_1= ruleGoTo | this_DOMCommand_2= ruleDOMCommand ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_OpenBrowser_0 = null;

        EObject this_GoTo_1 = null;

        EObject this_DOMCommand_2 = null;



        	enterRule();

        try {
            // InternalSeleniumDsl.g:189:2: ( (this_OpenBrowser_0= ruleOpenBrowser | this_GoTo_1= ruleGoTo | this_DOMCommand_2= ruleDOMCommand ) )
            // InternalSeleniumDsl.g:190:2: (this_OpenBrowser_0= ruleOpenBrowser | this_GoTo_1= ruleGoTo | this_DOMCommand_2= ruleDOMCommand )
            {
            // InternalSeleniumDsl.g:190:2: (this_OpenBrowser_0= ruleOpenBrowser | this_GoTo_1= ruleGoTo | this_DOMCommand_2= ruleDOMCommand )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt3=1;
                }
                break;
            case 21:
                {
                alt3=2;
                }
                break;
            case 23:
            case 25:
            case 26:
            case 31:
            case 35:
            case 54:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSeleniumDsl.g:191:3: this_OpenBrowser_0= ruleOpenBrowser
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
                    // InternalSeleniumDsl.g:200:3: this_GoTo_1= ruleGoTo
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
                    // InternalSeleniumDsl.g:209:3: this_DOMCommand_2= ruleDOMCommand
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
    // InternalSeleniumDsl.g:221:1: entryRuleOpenBrowser returns [EObject current=null] : iv_ruleOpenBrowser= ruleOpenBrowser EOF ;
    public final EObject entryRuleOpenBrowser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpenBrowser = null;


        try {
            // InternalSeleniumDsl.g:221:52: (iv_ruleOpenBrowser= ruleOpenBrowser EOF )
            // InternalSeleniumDsl.g:222:2: iv_ruleOpenBrowser= ruleOpenBrowser EOF
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
    // InternalSeleniumDsl.g:228:1: ruleOpenBrowser returns [EObject current=null] : ( () otherlv_1= 'open' otherlv_2= 'a' otherlv_3= 'browser' otherlv_4= 'window' ) ;
    public final EObject ruleOpenBrowser() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSeleniumDsl.g:234:2: ( ( () otherlv_1= 'open' otherlv_2= 'a' otherlv_3= 'browser' otherlv_4= 'window' ) )
            // InternalSeleniumDsl.g:235:2: ( () otherlv_1= 'open' otherlv_2= 'a' otherlv_3= 'browser' otherlv_4= 'window' )
            {
            // InternalSeleniumDsl.g:235:2: ( () otherlv_1= 'open' otherlv_2= 'a' otherlv_3= 'browser' otherlv_4= 'window' )
            // InternalSeleniumDsl.g:236:3: () otherlv_1= 'open' otherlv_2= 'a' otherlv_3= 'browser' otherlv_4= 'window'
            {
            // InternalSeleniumDsl.g:236:3: ()
            // InternalSeleniumDsl.g:237:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOpenBrowserAccess().getOpenBrowserAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getOpenBrowserAccess().getOpenKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getOpenBrowserAccess().getAKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getOpenBrowserAccess().getBrowserKeyword_3());
            		
            otherlv_4=(Token)match(input,20,FOLLOW_2); 

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
    // InternalSeleniumDsl.g:263:1: entryRuleDOMCommand returns [EObject current=null] : iv_ruleDOMCommand= ruleDOMCommand EOF ;
    public final EObject entryRuleDOMCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOMCommand = null;


        try {
            // InternalSeleniumDsl.g:263:51: (iv_ruleDOMCommand= ruleDOMCommand EOF )
            // InternalSeleniumDsl.g:264:2: iv_ruleDOMCommand= ruleDOMCommand EOF
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
    // InternalSeleniumDsl.g:270:1: ruleDOMCommand returns [EObject current=null] : (this_Click_0= ruleClick | this_Insert_1= ruleInsert | this_Copy_2= ruleCopy | this_Paste_3= rulePaste | this_Verify_4= ruleVerify ) ;
    public final EObject ruleDOMCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Click_0 = null;

        EObject this_Insert_1 = null;

        EObject this_Copy_2 = null;

        EObject this_Paste_3 = null;

        EObject this_Verify_4 = null;



        	enterRule();

        try {
            // InternalSeleniumDsl.g:276:2: ( (this_Click_0= ruleClick | this_Insert_1= ruleInsert | this_Copy_2= ruleCopy | this_Paste_3= rulePaste | this_Verify_4= ruleVerify ) )
            // InternalSeleniumDsl.g:277:2: (this_Click_0= ruleClick | this_Insert_1= ruleInsert | this_Copy_2= ruleCopy | this_Paste_3= rulePaste | this_Verify_4= ruleVerify )
            {
            // InternalSeleniumDsl.g:277:2: (this_Click_0= ruleClick | this_Insert_1= ruleInsert | this_Copy_2= ruleCopy | this_Paste_3= rulePaste | this_Verify_4= ruleVerify )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 23:
            case 25:
                {
                alt4=1;
                }
                break;
            case 35:
                {
                alt4=2;
                }
                break;
            case 26:
                {
                alt4=3;
                }
                break;
            case 31:
                {
                alt4=4;
                }
                break;
            case 54:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSeleniumDsl.g:278:3: this_Click_0= ruleClick
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
                    // InternalSeleniumDsl.g:287:3: this_Insert_1= ruleInsert
                    {

                    			newCompositeNode(grammarAccess.getDOMCommandAccess().getInsertParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Insert_1=ruleInsert();

                    state._fsp--;


                    			current = this_Insert_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSeleniumDsl.g:296:3: this_Copy_2= ruleCopy
                    {

                    			newCompositeNode(grammarAccess.getDOMCommandAccess().getCopyParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Copy_2=ruleCopy();

                    state._fsp--;


                    			current = this_Copy_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSeleniumDsl.g:305:3: this_Paste_3= rulePaste
                    {

                    			newCompositeNode(grammarAccess.getDOMCommandAccess().getPasteParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Paste_3=rulePaste();

                    state._fsp--;


                    			current = this_Paste_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSeleniumDsl.g:314:3: this_Verify_4= ruleVerify
                    {

                    			newCompositeNode(grammarAccess.getDOMCommandAccess().getVerifyParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Verify_4=ruleVerify();

                    state._fsp--;


                    			current = this_Verify_4;
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
    // InternalSeleniumDsl.g:326:1: entryRuleGoTo returns [EObject current=null] : iv_ruleGoTo= ruleGoTo EOF ;
    public final EObject entryRuleGoTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoTo = null;


        try {
            // InternalSeleniumDsl.g:326:45: (iv_ruleGoTo= ruleGoTo EOF )
            // InternalSeleniumDsl.g:327:2: iv_ruleGoTo= ruleGoTo EOF
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
    // InternalSeleniumDsl.g:333:1: ruleGoTo returns [EObject current=null] : (otherlv_0= 'go' otherlv_1= 'to' ( (lv_url_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleGoTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_url_2_0=null;


        	enterRule();

        try {
            // InternalSeleniumDsl.g:339:2: ( (otherlv_0= 'go' otherlv_1= 'to' ( (lv_url_2_0= RULE_STRING ) ) ) )
            // InternalSeleniumDsl.g:340:2: (otherlv_0= 'go' otherlv_1= 'to' ( (lv_url_2_0= RULE_STRING ) ) )
            {
            // InternalSeleniumDsl.g:340:2: (otherlv_0= 'go' otherlv_1= 'to' ( (lv_url_2_0= RULE_STRING ) ) )
            // InternalSeleniumDsl.g:341:3: otherlv_0= 'go' otherlv_1= 'to' ( (lv_url_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getGoToAccess().getGoKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getGoToAccess().getToKeyword_1());
            		
            // InternalSeleniumDsl.g:349:3: ( (lv_url_2_0= RULE_STRING ) )
            // InternalSeleniumDsl.g:350:4: (lv_url_2_0= RULE_STRING )
            {
            // InternalSeleniumDsl.g:350:4: (lv_url_2_0= RULE_STRING )
            // InternalSeleniumDsl.g:351:5: lv_url_2_0= RULE_STRING
            {
            lv_url_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_url_2_0, grammarAccess.getGoToAccess().getUrlSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGoToRule());
            					}
            					setWithLastConsumed(
            						current,
            						"url",
            						lv_url_2_0,
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
    // $ANTLR end "ruleGoTo"


    // $ANTLR start "entryRuleClick"
    // InternalSeleniumDsl.g:371:1: entryRuleClick returns [EObject current=null] : iv_ruleClick= ruleClick EOF ;
    public final EObject entryRuleClick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClick = null;


        try {
            // InternalSeleniumDsl.g:371:46: (iv_ruleClick= ruleClick EOF )
            // InternalSeleniumDsl.g:372:2: iv_ruleClick= ruleClick EOF
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
    // InternalSeleniumDsl.g:378:1: ruleClick returns [EObject current=null] : ( () ( (otherlv_1= 'click' otherlv_2= 'on' ) | otherlv_3= 'select' ) ( (lv_element_4_0= ruleSelector ) ) ) ;
    public final EObject ruleClick() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_element_4_0 = null;



        	enterRule();

        try {
            // InternalSeleniumDsl.g:384:2: ( ( () ( (otherlv_1= 'click' otherlv_2= 'on' ) | otherlv_3= 'select' ) ( (lv_element_4_0= ruleSelector ) ) ) )
            // InternalSeleniumDsl.g:385:2: ( () ( (otherlv_1= 'click' otherlv_2= 'on' ) | otherlv_3= 'select' ) ( (lv_element_4_0= ruleSelector ) ) )
            {
            // InternalSeleniumDsl.g:385:2: ( () ( (otherlv_1= 'click' otherlv_2= 'on' ) | otherlv_3= 'select' ) ( (lv_element_4_0= ruleSelector ) ) )
            // InternalSeleniumDsl.g:386:3: () ( (otherlv_1= 'click' otherlv_2= 'on' ) | otherlv_3= 'select' ) ( (lv_element_4_0= ruleSelector ) )
            {
            // InternalSeleniumDsl.g:386:3: ()
            // InternalSeleniumDsl.g:387:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClickAccess().getClickAction_0(),
            					current);
            			

            }

            // InternalSeleniumDsl.g:393:3: ( (otherlv_1= 'click' otherlv_2= 'on' ) | otherlv_3= 'select' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            else if ( (LA5_0==25) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSeleniumDsl.g:394:4: (otherlv_1= 'click' otherlv_2= 'on' )
                    {
                    // InternalSeleniumDsl.g:394:4: (otherlv_1= 'click' otherlv_2= 'on' )
                    // InternalSeleniumDsl.g:395:5: otherlv_1= 'click' otherlv_2= 'on'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_13); 

                    					newLeafNode(otherlv_1, grammarAccess.getClickAccess().getClickKeyword_1_0_0());
                    				
                    otherlv_2=(Token)match(input,24,FOLLOW_14); 

                    					newLeafNode(otherlv_2, grammarAccess.getClickAccess().getOnKeyword_1_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDsl.g:405:4: otherlv_3= 'select'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getClickAccess().getSelectKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalSeleniumDsl.g:410:3: ( (lv_element_4_0= ruleSelector ) )
            // InternalSeleniumDsl.g:411:4: (lv_element_4_0= ruleSelector )
            {
            // InternalSeleniumDsl.g:411:4: (lv_element_4_0= ruleSelector )
            // InternalSeleniumDsl.g:412:5: lv_element_4_0= ruleSelector
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
    // InternalSeleniumDsl.g:433:1: entryRuleCopy returns [EObject current=null] : iv_ruleCopy= ruleCopy EOF ;
    public final EObject entryRuleCopy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCopy = null;


        try {
            // InternalSeleniumDsl.g:433:45: (iv_ruleCopy= ruleCopy EOF )
            // InternalSeleniumDsl.g:434:2: iv_ruleCopy= ruleCopy EOF
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
    // InternalSeleniumDsl.g:440:1: ruleCopy returns [EObject current=null] : ( () otherlv_1= 'copy' otherlv_2= 'the' otherlv_3= 'property' ( (lv_property_4_0= RULE_HTML_ATTRIBUTE ) ) otherlv_5= 'of' ( (lv_element_6_0= ruleSelector ) ) otherlv_7= 'as' ( (lv_key_8_0= RULE_STRING ) ) ) ;
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
            // InternalSeleniumDsl.g:446:2: ( ( () otherlv_1= 'copy' otherlv_2= 'the' otherlv_3= 'property' ( (lv_property_4_0= RULE_HTML_ATTRIBUTE ) ) otherlv_5= 'of' ( (lv_element_6_0= ruleSelector ) ) otherlv_7= 'as' ( (lv_key_8_0= RULE_STRING ) ) ) )
            // InternalSeleniumDsl.g:447:2: ( () otherlv_1= 'copy' otherlv_2= 'the' otherlv_3= 'property' ( (lv_property_4_0= RULE_HTML_ATTRIBUTE ) ) otherlv_5= 'of' ( (lv_element_6_0= ruleSelector ) ) otherlv_7= 'as' ( (lv_key_8_0= RULE_STRING ) ) )
            {
            // InternalSeleniumDsl.g:447:2: ( () otherlv_1= 'copy' otherlv_2= 'the' otherlv_3= 'property' ( (lv_property_4_0= RULE_HTML_ATTRIBUTE ) ) otherlv_5= 'of' ( (lv_element_6_0= ruleSelector ) ) otherlv_7= 'as' ( (lv_key_8_0= RULE_STRING ) ) )
            // InternalSeleniumDsl.g:448:3: () otherlv_1= 'copy' otherlv_2= 'the' otherlv_3= 'property' ( (lv_property_4_0= RULE_HTML_ATTRIBUTE ) ) otherlv_5= 'of' ( (lv_element_6_0= ruleSelector ) ) otherlv_7= 'as' ( (lv_key_8_0= RULE_STRING ) )
            {
            // InternalSeleniumDsl.g:448:3: ()
            // InternalSeleniumDsl.g:449:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCopyAccess().getCopyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getCopyAccess().getCopyKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getCopyAccess().getTheKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getCopyAccess().getPropertyKeyword_3());
            		
            // InternalSeleniumDsl.g:467:3: ( (lv_property_4_0= RULE_HTML_ATTRIBUTE ) )
            // InternalSeleniumDsl.g:468:4: (lv_property_4_0= RULE_HTML_ATTRIBUTE )
            {
            // InternalSeleniumDsl.g:468:4: (lv_property_4_0= RULE_HTML_ATTRIBUTE )
            // InternalSeleniumDsl.g:469:5: lv_property_4_0= RULE_HTML_ATTRIBUTE
            {
            lv_property_4_0=(Token)match(input,RULE_HTML_ATTRIBUTE,FOLLOW_18); 

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

            otherlv_5=(Token)match(input,29,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getCopyAccess().getOfKeyword_5());
            		
            // InternalSeleniumDsl.g:489:3: ( (lv_element_6_0= ruleSelector ) )
            // InternalSeleniumDsl.g:490:4: (lv_element_6_0= ruleSelector )
            {
            // InternalSeleniumDsl.g:490:4: (lv_element_6_0= ruleSelector )
            // InternalSeleniumDsl.g:491:5: lv_element_6_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getCopyAccess().getElementSelectorParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_19);
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

            otherlv_7=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_7, grammarAccess.getCopyAccess().getAsKeyword_7());
            		
            // InternalSeleniumDsl.g:512:3: ( (lv_key_8_0= RULE_STRING ) )
            // InternalSeleniumDsl.g:513:4: (lv_key_8_0= RULE_STRING )
            {
            // InternalSeleniumDsl.g:513:4: (lv_key_8_0= RULE_STRING )
            // InternalSeleniumDsl.g:514:5: lv_key_8_0= RULE_STRING
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
    // InternalSeleniumDsl.g:534:1: entryRulePaste returns [EObject current=null] : iv_rulePaste= rulePaste EOF ;
    public final EObject entryRulePaste() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePaste = null;


        try {
            // InternalSeleniumDsl.g:534:46: (iv_rulePaste= rulePaste EOF )
            // InternalSeleniumDsl.g:535:2: iv_rulePaste= rulePaste EOF
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
    // InternalSeleniumDsl.g:541:1: rulePaste returns [EObject current=null] : (otherlv_0= 'paste' otherlv_1= 'the' otherlv_2= 'content' otherlv_3= 'of' otherlv_4= 'the' otherlv_5= 'clipboard' otherlv_6= 'in' ( (lv_element_7_0= ruleSelector ) ) ) ;
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
            // InternalSeleniumDsl.g:547:2: ( (otherlv_0= 'paste' otherlv_1= 'the' otherlv_2= 'content' otherlv_3= 'of' otherlv_4= 'the' otherlv_5= 'clipboard' otherlv_6= 'in' ( (lv_element_7_0= ruleSelector ) ) ) )
            // InternalSeleniumDsl.g:548:2: (otherlv_0= 'paste' otherlv_1= 'the' otherlv_2= 'content' otherlv_3= 'of' otherlv_4= 'the' otherlv_5= 'clipboard' otherlv_6= 'in' ( (lv_element_7_0= ruleSelector ) ) )
            {
            // InternalSeleniumDsl.g:548:2: (otherlv_0= 'paste' otherlv_1= 'the' otherlv_2= 'content' otherlv_3= 'of' otherlv_4= 'the' otherlv_5= 'clipboard' otherlv_6= 'in' ( (lv_element_7_0= ruleSelector ) ) )
            // InternalSeleniumDsl.g:549:3: otherlv_0= 'paste' otherlv_1= 'the' otherlv_2= 'content' otherlv_3= 'of' otherlv_4= 'the' otherlv_5= 'clipboard' otherlv_6= 'in' ( (lv_element_7_0= ruleSelector ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getPasteAccess().getPasteKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getPasteAccess().getTheKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getPasteAccess().getContentKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getPasteAccess().getOfKeyword_3());
            		
            otherlv_4=(Token)match(input,27,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getPasteAccess().getTheKeyword_4());
            		
            otherlv_5=(Token)match(input,33,FOLLOW_22); 

            			newLeafNode(otherlv_5, grammarAccess.getPasteAccess().getClipboardKeyword_5());
            		
            otherlv_6=(Token)match(input,34,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getPasteAccess().getInKeyword_6());
            		
            // InternalSeleniumDsl.g:577:3: ( (lv_element_7_0= ruleSelector ) )
            // InternalSeleniumDsl.g:578:4: (lv_element_7_0= ruleSelector )
            {
            // InternalSeleniumDsl.g:578:4: (lv_element_7_0= ruleSelector )
            // InternalSeleniumDsl.g:579:5: lv_element_7_0= ruleSelector
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
    // InternalSeleniumDsl.g:600:1: entryRuleInsert returns [EObject current=null] : iv_ruleInsert= ruleInsert EOF ;
    public final EObject entryRuleInsert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsert = null;


        try {
            // InternalSeleniumDsl.g:600:47: (iv_ruleInsert= ruleInsert EOF )
            // InternalSeleniumDsl.g:601:2: iv_ruleInsert= ruleInsert EOF
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
    // InternalSeleniumDsl.g:607:1: ruleInsert returns [EObject current=null] : (otherlv_0= 'fill' ( (lv_element_1_0= ruleSelector ) ) otherlv_2= 'with' ( (lv_content_3_0= ruleContent ) ) ) ;
    public final EObject ruleInsert() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_element_1_0 = null;

        EObject lv_content_3_0 = null;



        	enterRule();

        try {
            // InternalSeleniumDsl.g:613:2: ( (otherlv_0= 'fill' ( (lv_element_1_0= ruleSelector ) ) otherlv_2= 'with' ( (lv_content_3_0= ruleContent ) ) ) )
            // InternalSeleniumDsl.g:614:2: (otherlv_0= 'fill' ( (lv_element_1_0= ruleSelector ) ) otherlv_2= 'with' ( (lv_content_3_0= ruleContent ) ) )
            {
            // InternalSeleniumDsl.g:614:2: (otherlv_0= 'fill' ( (lv_element_1_0= ruleSelector ) ) otherlv_2= 'with' ( (lv_content_3_0= ruleContent ) ) )
            // InternalSeleniumDsl.g:615:3: otherlv_0= 'fill' ( (lv_element_1_0= ruleSelector ) ) otherlv_2= 'with' ( (lv_content_3_0= ruleContent ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getInsertAccess().getFillKeyword_0());
            		
            // InternalSeleniumDsl.g:619:3: ( (lv_element_1_0= ruleSelector ) )
            // InternalSeleniumDsl.g:620:4: (lv_element_1_0= ruleSelector )
            {
            // InternalSeleniumDsl.g:620:4: (lv_element_1_0= ruleSelector )
            // InternalSeleniumDsl.g:621:5: lv_element_1_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getInsertAccess().getElementSelectorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
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

            otherlv_2=(Token)match(input,36,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getInsertAccess().getWithKeyword_2());
            		
            // InternalSeleniumDsl.g:642:3: ( (lv_content_3_0= ruleContent ) )
            // InternalSeleniumDsl.g:643:4: (lv_content_3_0= ruleContent )
            {
            // InternalSeleniumDsl.g:643:4: (lv_content_3_0= ruleContent )
            // InternalSeleniumDsl.g:644:5: lv_content_3_0= ruleContent
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
    // InternalSeleniumDsl.g:665:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // InternalSeleniumDsl.g:665:49: (iv_ruleSelector= ruleSelector EOF )
            // InternalSeleniumDsl.g:666:2: iv_ruleSelector= ruleSelector EOF
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
    // InternalSeleniumDsl.g:672:1: ruleSelector returns [EObject current=null] : ( ( (lv_predicate_0_0= ruleSelectorPredicate ) ) ( (lv_domType_1_0= RULE_STRING ) ) (otherlv_2= 'with' otherlv_3= 'properties' ( (lv_attributes_4_0= ruleAttributes ) ) )? (otherlv_5= 'with' otherlv_6= 'associated' otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )? (otherlv_9= 'that' otherlv_10= 'is' ( (lv_properties_11_0= ruleProperties ) ) )? (otherlv_12= 'in' ( (lv_parent_13_0= ruleSelector ) ) )? ) ;
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
            // InternalSeleniumDsl.g:678:2: ( ( ( (lv_predicate_0_0= ruleSelectorPredicate ) ) ( (lv_domType_1_0= RULE_STRING ) ) (otherlv_2= 'with' otherlv_3= 'properties' ( (lv_attributes_4_0= ruleAttributes ) ) )? (otherlv_5= 'with' otherlv_6= 'associated' otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )? (otherlv_9= 'that' otherlv_10= 'is' ( (lv_properties_11_0= ruleProperties ) ) )? (otherlv_12= 'in' ( (lv_parent_13_0= ruleSelector ) ) )? ) )
            // InternalSeleniumDsl.g:679:2: ( ( (lv_predicate_0_0= ruleSelectorPredicate ) ) ( (lv_domType_1_0= RULE_STRING ) ) (otherlv_2= 'with' otherlv_3= 'properties' ( (lv_attributes_4_0= ruleAttributes ) ) )? (otherlv_5= 'with' otherlv_6= 'associated' otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )? (otherlv_9= 'that' otherlv_10= 'is' ( (lv_properties_11_0= ruleProperties ) ) )? (otherlv_12= 'in' ( (lv_parent_13_0= ruleSelector ) ) )? )
            {
            // InternalSeleniumDsl.g:679:2: ( ( (lv_predicate_0_0= ruleSelectorPredicate ) ) ( (lv_domType_1_0= RULE_STRING ) ) (otherlv_2= 'with' otherlv_3= 'properties' ( (lv_attributes_4_0= ruleAttributes ) ) )? (otherlv_5= 'with' otherlv_6= 'associated' otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )? (otherlv_9= 'that' otherlv_10= 'is' ( (lv_properties_11_0= ruleProperties ) ) )? (otherlv_12= 'in' ( (lv_parent_13_0= ruleSelector ) ) )? )
            // InternalSeleniumDsl.g:680:3: ( (lv_predicate_0_0= ruleSelectorPredicate ) ) ( (lv_domType_1_0= RULE_STRING ) ) (otherlv_2= 'with' otherlv_3= 'properties' ( (lv_attributes_4_0= ruleAttributes ) ) )? (otherlv_5= 'with' otherlv_6= 'associated' otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )? (otherlv_9= 'that' otherlv_10= 'is' ( (lv_properties_11_0= ruleProperties ) ) )? (otherlv_12= 'in' ( (lv_parent_13_0= ruleSelector ) ) )?
            {
            // InternalSeleniumDsl.g:680:3: ( (lv_predicate_0_0= ruleSelectorPredicate ) )
            // InternalSeleniumDsl.g:681:4: (lv_predicate_0_0= ruleSelectorPredicate )
            {
            // InternalSeleniumDsl.g:681:4: (lv_predicate_0_0= ruleSelectorPredicate )
            // InternalSeleniumDsl.g:682:5: lv_predicate_0_0= ruleSelectorPredicate
            {

            					newCompositeNode(grammarAccess.getSelectorAccess().getPredicateSelectorPredicateParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
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

            // InternalSeleniumDsl.g:699:3: ( (lv_domType_1_0= RULE_STRING ) )
            // InternalSeleniumDsl.g:700:4: (lv_domType_1_0= RULE_STRING )
            {
            // InternalSeleniumDsl.g:700:4: (lv_domType_1_0= RULE_STRING )
            // InternalSeleniumDsl.g:701:5: lv_domType_1_0= RULE_STRING
            {
            lv_domType_1_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

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

            // InternalSeleniumDsl.g:717:3: (otherlv_2= 'with' otherlv_3= 'properties' ( (lv_attributes_4_0= ruleAttributes ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==36) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==37) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // InternalSeleniumDsl.g:718:4: otherlv_2= 'with' otherlv_3= 'properties' ( (lv_attributes_4_0= ruleAttributes ) )
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_26); 

                    				newLeafNode(otherlv_2, grammarAccess.getSelectorAccess().getWithKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,37,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getSelectorAccess().getPropertiesKeyword_2_1());
                    			
                    // InternalSeleniumDsl.g:726:4: ( (lv_attributes_4_0= ruleAttributes ) )
                    // InternalSeleniumDsl.g:727:5: (lv_attributes_4_0= ruleAttributes )
                    {
                    // InternalSeleniumDsl.g:727:5: (lv_attributes_4_0= ruleAttributes )
                    // InternalSeleniumDsl.g:728:6: lv_attributes_4_0= ruleAttributes
                    {

                    						newCompositeNode(grammarAccess.getSelectorAccess().getAttributesAttributesParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_25);
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

            // InternalSeleniumDsl.g:746:3: (otherlv_5= 'with' otherlv_6= 'associated' otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==36) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==38) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // InternalSeleniumDsl.g:747:4: otherlv_5= 'with' otherlv_6= 'associated' otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,36,FOLLOW_27); 

                    				newLeafNode(otherlv_5, grammarAccess.getSelectorAccess().getWithKeyword_3_0());
                    			
                    otherlv_6=(Token)match(input,38,FOLLOW_28); 

                    				newLeafNode(otherlv_6, grammarAccess.getSelectorAccess().getAssociatedKeyword_3_1());
                    			
                    otherlv_7=(Token)match(input,39,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getSelectorAccess().getLabelKeyword_3_2());
                    			
                    // InternalSeleniumDsl.g:759:4: ( (lv_label_8_0= RULE_STRING ) )
                    // InternalSeleniumDsl.g:760:5: (lv_label_8_0= RULE_STRING )
                    {
                    // InternalSeleniumDsl.g:760:5: (lv_label_8_0= RULE_STRING )
                    // InternalSeleniumDsl.g:761:6: lv_label_8_0= RULE_STRING
                    {
                    lv_label_8_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

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

            // InternalSeleniumDsl.g:778:3: (otherlv_9= 'that' otherlv_10= 'is' ( (lv_properties_11_0= ruleProperties ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==40) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSeleniumDsl.g:779:4: otherlv_9= 'that' otherlv_10= 'is' ( (lv_properties_11_0= ruleProperties ) )
                    {
                    otherlv_9=(Token)match(input,40,FOLLOW_30); 

                    				newLeafNode(otherlv_9, grammarAccess.getSelectorAccess().getThatKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,41,FOLLOW_31); 

                    				newLeafNode(otherlv_10, grammarAccess.getSelectorAccess().getIsKeyword_4_1());
                    			
                    // InternalSeleniumDsl.g:787:4: ( (lv_properties_11_0= ruleProperties ) )
                    // InternalSeleniumDsl.g:788:5: (lv_properties_11_0= ruleProperties )
                    {
                    // InternalSeleniumDsl.g:788:5: (lv_properties_11_0= ruleProperties )
                    // InternalSeleniumDsl.g:789:6: lv_properties_11_0= ruleProperties
                    {

                    						newCompositeNode(grammarAccess.getSelectorAccess().getPropertiesPropertiesParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_32);
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

            // InternalSeleniumDsl.g:807:3: (otherlv_12= 'in' ( (lv_parent_13_0= ruleSelector ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==34) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSeleniumDsl.g:808:4: otherlv_12= 'in' ( (lv_parent_13_0= ruleSelector ) )
                    {
                    otherlv_12=(Token)match(input,34,FOLLOW_14); 

                    				newLeafNode(otherlv_12, grammarAccess.getSelectorAccess().getInKeyword_5_0());
                    			
                    // InternalSeleniumDsl.g:812:4: ( (lv_parent_13_0= ruleSelector ) )
                    // InternalSeleniumDsl.g:813:5: (lv_parent_13_0= ruleSelector )
                    {
                    // InternalSeleniumDsl.g:813:5: (lv_parent_13_0= ruleSelector )
                    // InternalSeleniumDsl.g:814:6: lv_parent_13_0= ruleSelector
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
    // InternalSeleniumDsl.g:836:1: entryRuleAttributes returns [EObject current=null] : iv_ruleAttributes= ruleAttributes EOF ;
    public final EObject entryRuleAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributes = null;


        try {
            // InternalSeleniumDsl.g:836:51: (iv_ruleAttributes= ruleAttributes EOF )
            // InternalSeleniumDsl.g:837:2: iv_ruleAttributes= ruleAttributes EOF
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
    // InternalSeleniumDsl.g:843:1: ruleAttributes returns [EObject current=null] : ( ( (lv_attributes_0_0= ruleElementAttribute ) ) (otherlv_1= 'and' ( (lv_properties_2_0= ruleElementAttribute ) ) )* ) ;
    public final EObject ruleAttributes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_attributes_0_0 = null;

        EObject lv_properties_2_0 = null;



        	enterRule();

        try {
            // InternalSeleniumDsl.g:849:2: ( ( ( (lv_attributes_0_0= ruleElementAttribute ) ) (otherlv_1= 'and' ( (lv_properties_2_0= ruleElementAttribute ) ) )* ) )
            // InternalSeleniumDsl.g:850:2: ( ( (lv_attributes_0_0= ruleElementAttribute ) ) (otherlv_1= 'and' ( (lv_properties_2_0= ruleElementAttribute ) ) )* )
            {
            // InternalSeleniumDsl.g:850:2: ( ( (lv_attributes_0_0= ruleElementAttribute ) ) (otherlv_1= 'and' ( (lv_properties_2_0= ruleElementAttribute ) ) )* )
            // InternalSeleniumDsl.g:851:3: ( (lv_attributes_0_0= ruleElementAttribute ) ) (otherlv_1= 'and' ( (lv_properties_2_0= ruleElementAttribute ) ) )*
            {
            // InternalSeleniumDsl.g:851:3: ( (lv_attributes_0_0= ruleElementAttribute ) )
            // InternalSeleniumDsl.g:852:4: (lv_attributes_0_0= ruleElementAttribute )
            {
            // InternalSeleniumDsl.g:852:4: (lv_attributes_0_0= ruleElementAttribute )
            // InternalSeleniumDsl.g:853:5: lv_attributes_0_0= ruleElementAttribute
            {

            					newCompositeNode(grammarAccess.getAttributesAccess().getAttributesElementAttributeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_33);
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

            // InternalSeleniumDsl.g:870:3: (otherlv_1= 'and' ( (lv_properties_2_0= ruleElementAttribute ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==42) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSeleniumDsl.g:871:4: otherlv_1= 'and' ( (lv_properties_2_0= ruleElementAttribute ) )
            	    {
            	    otherlv_1=(Token)match(input,42,FOLLOW_17); 

            	    				newLeafNode(otherlv_1, grammarAccess.getAttributesAccess().getAndKeyword_1_0());
            	    			
            	    // InternalSeleniumDsl.g:875:4: ( (lv_properties_2_0= ruleElementAttribute ) )
            	    // InternalSeleniumDsl.g:876:5: (lv_properties_2_0= ruleElementAttribute )
            	    {
            	    // InternalSeleniumDsl.g:876:5: (lv_properties_2_0= ruleElementAttribute )
            	    // InternalSeleniumDsl.g:877:6: lv_properties_2_0= ruleElementAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getAttributesAccess().getPropertiesElementAttributeParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    lv_properties_2_0=ruleElementAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAttributesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"properties",
            	    							lv_properties_2_0,
            	    							"www.imta.fr.browserautomation.SeleniumDsl.ElementAttribute");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "ruleAttributes"


    // $ANTLR start "entryRuleElementAttribute"
    // InternalSeleniumDsl.g:899:1: entryRuleElementAttribute returns [EObject current=null] : iv_ruleElementAttribute= ruleElementAttribute EOF ;
    public final EObject entryRuleElementAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementAttribute = null;


        try {
            // InternalSeleniumDsl.g:899:57: (iv_ruleElementAttribute= ruleElementAttribute EOF )
            // InternalSeleniumDsl.g:900:2: iv_ruleElementAttribute= ruleElementAttribute EOF
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
    // InternalSeleniumDsl.g:906:1: ruleElementAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_HTML_ATTRIBUTE ) ) ( (lv_matcher_1_0= ruleMatcher ) ) ( (lv_value_2_0= ruleContent ) ) ) ;
    public final EObject ruleElementAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        AntlrDatatypeRuleToken lv_matcher_1_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalSeleniumDsl.g:912:2: ( ( ( (lv_name_0_0= RULE_HTML_ATTRIBUTE ) ) ( (lv_matcher_1_0= ruleMatcher ) ) ( (lv_value_2_0= ruleContent ) ) ) )
            // InternalSeleniumDsl.g:913:2: ( ( (lv_name_0_0= RULE_HTML_ATTRIBUTE ) ) ( (lv_matcher_1_0= ruleMatcher ) ) ( (lv_value_2_0= ruleContent ) ) )
            {
            // InternalSeleniumDsl.g:913:2: ( ( (lv_name_0_0= RULE_HTML_ATTRIBUTE ) ) ( (lv_matcher_1_0= ruleMatcher ) ) ( (lv_value_2_0= ruleContent ) ) )
            // InternalSeleniumDsl.g:914:3: ( (lv_name_0_0= RULE_HTML_ATTRIBUTE ) ) ( (lv_matcher_1_0= ruleMatcher ) ) ( (lv_value_2_0= ruleContent ) )
            {
            // InternalSeleniumDsl.g:914:3: ( (lv_name_0_0= RULE_HTML_ATTRIBUTE ) )
            // InternalSeleniumDsl.g:915:4: (lv_name_0_0= RULE_HTML_ATTRIBUTE )
            {
            // InternalSeleniumDsl.g:915:4: (lv_name_0_0= RULE_HTML_ATTRIBUTE )
            // InternalSeleniumDsl.g:916:5: lv_name_0_0= RULE_HTML_ATTRIBUTE
            {
            lv_name_0_0=(Token)match(input,RULE_HTML_ATTRIBUTE,FOLLOW_34); 

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

            // InternalSeleniumDsl.g:932:3: ( (lv_matcher_1_0= ruleMatcher ) )
            // InternalSeleniumDsl.g:933:4: (lv_matcher_1_0= ruleMatcher )
            {
            // InternalSeleniumDsl.g:933:4: (lv_matcher_1_0= ruleMatcher )
            // InternalSeleniumDsl.g:934:5: lv_matcher_1_0= ruleMatcher
            {

            					newCompositeNode(grammarAccess.getElementAttributeAccess().getMatcherMatcherParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalSeleniumDsl.g:951:3: ( (lv_value_2_0= ruleContent ) )
            // InternalSeleniumDsl.g:952:4: (lv_value_2_0= ruleContent )
            {
            // InternalSeleniumDsl.g:952:4: (lv_value_2_0= ruleContent )
            // InternalSeleniumDsl.g:953:5: lv_value_2_0= ruleContent
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
    // InternalSeleniumDsl.g:974:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // InternalSeleniumDsl.g:974:48: (iv_ruleContent= ruleContent EOF )
            // InternalSeleniumDsl.g:975:2: iv_ruleContent= ruleContent EOF
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
    // InternalSeleniumDsl.g:981:1: ruleContent returns [EObject current=null] : (this_ClipboardContent_0= ruleClipboardContent | this_StringContent_1= ruleStringContent ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        EObject this_ClipboardContent_0 = null;

        EObject this_StringContent_1 = null;



        	enterRule();

        try {
            // InternalSeleniumDsl.g:987:2: ( (this_ClipboardContent_0= ruleClipboardContent | this_StringContent_1= ruleStringContent ) )
            // InternalSeleniumDsl.g:988:2: (this_ClipboardContent_0= ruleClipboardContent | this_StringContent_1= ruleStringContent )
            {
            // InternalSeleniumDsl.g:988:2: (this_ClipboardContent_0= ruleClipboardContent | this_StringContent_1= ruleStringContent )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
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
                    // InternalSeleniumDsl.g:989:3: this_ClipboardContent_0= ruleClipboardContent
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
                    // InternalSeleniumDsl.g:998:3: this_StringContent_1= ruleStringContent
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
    // InternalSeleniumDsl.g:1010:1: entryRuleClipboardContent returns [EObject current=null] : iv_ruleClipboardContent= ruleClipboardContent EOF ;
    public final EObject entryRuleClipboardContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClipboardContent = null;


        try {
            // InternalSeleniumDsl.g:1010:57: (iv_ruleClipboardContent= ruleClipboardContent EOF )
            // InternalSeleniumDsl.g:1011:2: iv_ruleClipboardContent= ruleClipboardContent EOF
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
    // InternalSeleniumDsl.g:1017:1: ruleClipboardContent returns [EObject current=null] : (otherlv_0= 'the' otherlv_1= 'saved' otherlv_2= 'content' ( (lv_key_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleClipboardContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_key_3_0=null;


        	enterRule();

        try {
            // InternalSeleniumDsl.g:1023:2: ( (otherlv_0= 'the' otherlv_1= 'saved' otherlv_2= 'content' ( (lv_key_3_0= RULE_STRING ) ) ) )
            // InternalSeleniumDsl.g:1024:2: (otherlv_0= 'the' otherlv_1= 'saved' otherlv_2= 'content' ( (lv_key_3_0= RULE_STRING ) ) )
            {
            // InternalSeleniumDsl.g:1024:2: (otherlv_0= 'the' otherlv_1= 'saved' otherlv_2= 'content' ( (lv_key_3_0= RULE_STRING ) ) )
            // InternalSeleniumDsl.g:1025:3: otherlv_0= 'the' otherlv_1= 'saved' otherlv_2= 'content' ( (lv_key_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getClipboardContentAccess().getTheKeyword_0());
            		
            otherlv_1=(Token)match(input,43,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getClipboardContentAccess().getSavedKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getClipboardContentAccess().getContentKeyword_2());
            		
            // InternalSeleniumDsl.g:1037:3: ( (lv_key_3_0= RULE_STRING ) )
            // InternalSeleniumDsl.g:1038:4: (lv_key_3_0= RULE_STRING )
            {
            // InternalSeleniumDsl.g:1038:4: (lv_key_3_0= RULE_STRING )
            // InternalSeleniumDsl.g:1039:5: lv_key_3_0= RULE_STRING
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
    // InternalSeleniumDsl.g:1059:1: entryRuleStringContent returns [EObject current=null] : iv_ruleStringContent= ruleStringContent EOF ;
    public final EObject entryRuleStringContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringContent = null;


        try {
            // InternalSeleniumDsl.g:1059:54: (iv_ruleStringContent= ruleStringContent EOF )
            // InternalSeleniumDsl.g:1060:2: iv_ruleStringContent= ruleStringContent EOF
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
    // InternalSeleniumDsl.g:1066:1: ruleStringContent returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringContent() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalSeleniumDsl.g:1072:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalSeleniumDsl.g:1073:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalSeleniumDsl.g:1073:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalSeleniumDsl.g:1074:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalSeleniumDsl.g:1074:3: (lv_value_0_0= RULE_STRING )
            // InternalSeleniumDsl.g:1075:4: lv_value_0_0= RULE_STRING
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
    // InternalSeleniumDsl.g:1094:1: entryRuleProperties returns [EObject current=null] : iv_ruleProperties= ruleProperties EOF ;
    public final EObject entryRuleProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperties = null;


        try {
            // InternalSeleniumDsl.g:1094:51: (iv_ruleProperties= ruleProperties EOF )
            // InternalSeleniumDsl.g:1095:2: iv_ruleProperties= ruleProperties EOF
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
    // InternalSeleniumDsl.g:1101:1: ruleProperties returns [EObject current=null] : ( ( (lv_properties_0_0= ruleElementProperty ) ) (otherlv_1= 'and' ( (lv_properties_2_0= ruleElementProperty ) ) )* ) ;
    public final EObject ruleProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_properties_0_0 = null;

        EObject lv_properties_2_0 = null;



        	enterRule();

        try {
            // InternalSeleniumDsl.g:1107:2: ( ( ( (lv_properties_0_0= ruleElementProperty ) ) (otherlv_1= 'and' ( (lv_properties_2_0= ruleElementProperty ) ) )* ) )
            // InternalSeleniumDsl.g:1108:2: ( ( (lv_properties_0_0= ruleElementProperty ) ) (otherlv_1= 'and' ( (lv_properties_2_0= ruleElementProperty ) ) )* )
            {
            // InternalSeleniumDsl.g:1108:2: ( ( (lv_properties_0_0= ruleElementProperty ) ) (otherlv_1= 'and' ( (lv_properties_2_0= ruleElementProperty ) ) )* )
            // InternalSeleniumDsl.g:1109:3: ( (lv_properties_0_0= ruleElementProperty ) ) (otherlv_1= 'and' ( (lv_properties_2_0= ruleElementProperty ) ) )*
            {
            // InternalSeleniumDsl.g:1109:3: ( (lv_properties_0_0= ruleElementProperty ) )
            // InternalSeleniumDsl.g:1110:4: (lv_properties_0_0= ruleElementProperty )
            {
            // InternalSeleniumDsl.g:1110:4: (lv_properties_0_0= ruleElementProperty )
            // InternalSeleniumDsl.g:1111:5: lv_properties_0_0= ruleElementProperty
            {

            					newCompositeNode(grammarAccess.getPropertiesAccess().getPropertiesElementPropertyParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_33);
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

            // InternalSeleniumDsl.g:1128:3: (otherlv_1= 'and' ( (lv_properties_2_0= ruleElementProperty ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==42) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSeleniumDsl.g:1129:4: otherlv_1= 'and' ( (lv_properties_2_0= ruleElementProperty ) )
            	    {
            	    otherlv_1=(Token)match(input,42,FOLLOW_31); 

            	    				newLeafNode(otherlv_1, grammarAccess.getPropertiesAccess().getAndKeyword_1_0());
            	    			
            	    // InternalSeleniumDsl.g:1133:4: ( (lv_properties_2_0= ruleElementProperty ) )
            	    // InternalSeleniumDsl.g:1134:5: (lv_properties_2_0= ruleElementProperty )
            	    {
            	    // InternalSeleniumDsl.g:1134:5: (lv_properties_2_0= ruleElementProperty )
            	    // InternalSeleniumDsl.g:1135:6: lv_properties_2_0= ruleElementProperty
            	    {

            	    						newCompositeNode(grammarAccess.getPropertiesAccess().getPropertiesElementPropertyParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
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

            	default :
            	    break loop12;
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
    // $ANTLR end "ruleProperties"


    // $ANTLR start "entryRuleElementProperty"
    // InternalSeleniumDsl.g:1157:1: entryRuleElementProperty returns [EObject current=null] : iv_ruleElementProperty= ruleElementProperty EOF ;
    public final EObject entryRuleElementProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementProperty = null;


        try {
            // InternalSeleniumDsl.g:1157:56: (iv_ruleElementProperty= ruleElementProperty EOF )
            // InternalSeleniumDsl.g:1158:2: iv_ruleElementProperty= ruleElementProperty EOF
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
    // InternalSeleniumDsl.g:1164:1: ruleElementProperty returns [EObject current=null] : ( ( (lv_negated_0_0= 'not' ) )? ( ( (lv_property_1_1= 'selected' | lv_property_1_2= 'visible' | lv_property_1_3= 'enabled' ) ) ) ) ;
    public final EObject ruleElementProperty() throws RecognitionException {
        EObject current = null;

        Token lv_negated_0_0=null;
        Token lv_property_1_1=null;
        Token lv_property_1_2=null;
        Token lv_property_1_3=null;


        	enterRule();

        try {
            // InternalSeleniumDsl.g:1170:2: ( ( ( (lv_negated_0_0= 'not' ) )? ( ( (lv_property_1_1= 'selected' | lv_property_1_2= 'visible' | lv_property_1_3= 'enabled' ) ) ) ) )
            // InternalSeleniumDsl.g:1171:2: ( ( (lv_negated_0_0= 'not' ) )? ( ( (lv_property_1_1= 'selected' | lv_property_1_2= 'visible' | lv_property_1_3= 'enabled' ) ) ) )
            {
            // InternalSeleniumDsl.g:1171:2: ( ( (lv_negated_0_0= 'not' ) )? ( ( (lv_property_1_1= 'selected' | lv_property_1_2= 'visible' | lv_property_1_3= 'enabled' ) ) ) )
            // InternalSeleniumDsl.g:1172:3: ( (lv_negated_0_0= 'not' ) )? ( ( (lv_property_1_1= 'selected' | lv_property_1_2= 'visible' | lv_property_1_3= 'enabled' ) ) )
            {
            // InternalSeleniumDsl.g:1172:3: ( (lv_negated_0_0= 'not' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==44) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSeleniumDsl.g:1173:4: (lv_negated_0_0= 'not' )
                    {
                    // InternalSeleniumDsl.g:1173:4: (lv_negated_0_0= 'not' )
                    // InternalSeleniumDsl.g:1174:5: lv_negated_0_0= 'not'
                    {
                    lv_negated_0_0=(Token)match(input,44,FOLLOW_36); 

                    					newLeafNode(lv_negated_0_0, grammarAccess.getElementPropertyAccess().getNegatedNotKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getElementPropertyRule());
                    					}
                    					setWithLastConsumed(current, "negated", lv_negated_0_0, "not");
                    				

                    }


                    }
                    break;

            }

            // InternalSeleniumDsl.g:1186:3: ( ( (lv_property_1_1= 'selected' | lv_property_1_2= 'visible' | lv_property_1_3= 'enabled' ) ) )
            // InternalSeleniumDsl.g:1187:4: ( (lv_property_1_1= 'selected' | lv_property_1_2= 'visible' | lv_property_1_3= 'enabled' ) )
            {
            // InternalSeleniumDsl.g:1187:4: ( (lv_property_1_1= 'selected' | lv_property_1_2= 'visible' | lv_property_1_3= 'enabled' ) )
            // InternalSeleniumDsl.g:1188:5: (lv_property_1_1= 'selected' | lv_property_1_2= 'visible' | lv_property_1_3= 'enabled' )
            {
            // InternalSeleniumDsl.g:1188:5: (lv_property_1_1= 'selected' | lv_property_1_2= 'visible' | lv_property_1_3= 'enabled' )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt14=1;
                }
                break;
            case 46:
                {
                alt14=2;
                }
                break;
            case 47:
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
                    // InternalSeleniumDsl.g:1189:6: lv_property_1_1= 'selected'
                    {
                    lv_property_1_1=(Token)match(input,45,FOLLOW_2); 

                    						newLeafNode(lv_property_1_1, grammarAccess.getElementPropertyAccess().getPropertySelectedKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getElementPropertyRule());
                    						}
                    						setWithLastConsumed(current, "property", lv_property_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSeleniumDsl.g:1200:6: lv_property_1_2= 'visible'
                    {
                    lv_property_1_2=(Token)match(input,46,FOLLOW_2); 

                    						newLeafNode(lv_property_1_2, grammarAccess.getElementPropertyAccess().getPropertyVisibleKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getElementPropertyRule());
                    						}
                    						setWithLastConsumed(current, "property", lv_property_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalSeleniumDsl.g:1211:6: lv_property_1_3= 'enabled'
                    {
                    lv_property_1_3=(Token)match(input,47,FOLLOW_2); 

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
    // InternalSeleniumDsl.g:1228:1: entryRuleSelectorPredicate returns [EObject current=null] : iv_ruleSelectorPredicate= ruleSelectorPredicate EOF ;
    public final EObject entryRuleSelectorPredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectorPredicate = null;


        try {
            // InternalSeleniumDsl.g:1228:58: (iv_ruleSelectorPredicate= ruleSelectorPredicate EOF )
            // InternalSeleniumDsl.g:1229:2: iv_ruleSelectorPredicate= ruleSelectorPredicate EOF
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
    // InternalSeleniumDsl.g:1235:1: ruleSelectorPredicate returns [EObject current=null] : (this_AllPredicate_0= ruleAllPredicate | this_OrdinalPredicate_1= ruleOrdinalPredicate | this_LastPredicate_2= ruleLastPredicate | this_DefaultFirstPredicate_3= ruleDefaultFirstPredicate ) ;
    public final EObject ruleSelectorPredicate() throws RecognitionException {
        EObject current = null;

        EObject this_AllPredicate_0 = null;

        EObject this_OrdinalPredicate_1 = null;

        EObject this_LastPredicate_2 = null;

        EObject this_DefaultFirstPredicate_3 = null;



        	enterRule();

        try {
            // InternalSeleniumDsl.g:1241:2: ( (this_AllPredicate_0= ruleAllPredicate | this_OrdinalPredicate_1= ruleOrdinalPredicate | this_LastPredicate_2= ruleLastPredicate | this_DefaultFirstPredicate_3= ruleDefaultFirstPredicate ) )
            // InternalSeleniumDsl.g:1242:2: (this_AllPredicate_0= ruleAllPredicate | this_OrdinalPredicate_1= ruleOrdinalPredicate | this_LastPredicate_2= ruleLastPredicate | this_DefaultFirstPredicate_3= ruleDefaultFirstPredicate )
            {
            // InternalSeleniumDsl.g:1242:2: (this_AllPredicate_0= ruleAllPredicate | this_OrdinalPredicate_1= ruleOrdinalPredicate | this_LastPredicate_2= ruleLastPredicate | this_DefaultFirstPredicate_3= ruleDefaultFirstPredicate )
            int alt15=4;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==48) ) {
                alt15=1;
            }
            else if ( (LA15_0==27) ) {
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
                case 51:
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
                    // InternalSeleniumDsl.g:1243:3: this_AllPredicate_0= ruleAllPredicate
                    {

                    			newCompositeNode(grammarAccess.getSelectorPredicateAccess().getAllPredicateParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AllPredicate_0=ruleAllPredicate();

                    state._fsp--;


                    			current = this_AllPredicate_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSeleniumDsl.g:1252:3: this_OrdinalPredicate_1= ruleOrdinalPredicate
                    {

                    			newCompositeNode(grammarAccess.getSelectorPredicateAccess().getOrdinalPredicateParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OrdinalPredicate_1=ruleOrdinalPredicate();

                    state._fsp--;


                    			current = this_OrdinalPredicate_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSeleniumDsl.g:1261:3: this_LastPredicate_2= ruleLastPredicate
                    {

                    			newCompositeNode(grammarAccess.getSelectorPredicateAccess().getLastPredicateParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LastPredicate_2=ruleLastPredicate();

                    state._fsp--;


                    			current = this_LastPredicate_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSeleniumDsl.g:1270:3: this_DefaultFirstPredicate_3= ruleDefaultFirstPredicate
                    {

                    			newCompositeNode(grammarAccess.getSelectorPredicateAccess().getDefaultFirstPredicateParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DefaultFirstPredicate_3=ruleDefaultFirstPredicate();

                    state._fsp--;


                    			current = this_DefaultFirstPredicate_3;
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


    // $ANTLR start "entryRuleAllPredicate"
    // InternalSeleniumDsl.g:1282:1: entryRuleAllPredicate returns [EObject current=null] : iv_ruleAllPredicate= ruleAllPredicate EOF ;
    public final EObject entryRuleAllPredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllPredicate = null;


        try {
            // InternalSeleniumDsl.g:1282:53: (iv_ruleAllPredicate= ruleAllPredicate EOF )
            // InternalSeleniumDsl.g:1283:2: iv_ruleAllPredicate= ruleAllPredicate EOF
            {
             newCompositeNode(grammarAccess.getAllPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllPredicate=ruleAllPredicate();

            state._fsp--;

             current =iv_ruleAllPredicate; 
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
    // $ANTLR end "entryRuleAllPredicate"


    // $ANTLR start "ruleAllPredicate"
    // InternalSeleniumDsl.g:1289:1: ruleAllPredicate returns [EObject current=null] : ( () otherlv_1= 'all' otherlv_2= 'elements' otherlv_3= 'of' otherlv_4= 'type' ) ;
    public final EObject ruleAllPredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSeleniumDsl.g:1295:2: ( ( () otherlv_1= 'all' otherlv_2= 'elements' otherlv_3= 'of' otherlv_4= 'type' ) )
            // InternalSeleniumDsl.g:1296:2: ( () otherlv_1= 'all' otherlv_2= 'elements' otherlv_3= 'of' otherlv_4= 'type' )
            {
            // InternalSeleniumDsl.g:1296:2: ( () otherlv_1= 'all' otherlv_2= 'elements' otherlv_3= 'of' otherlv_4= 'type' )
            // InternalSeleniumDsl.g:1297:3: () otherlv_1= 'all' otherlv_2= 'elements' otherlv_3= 'of' otherlv_4= 'type'
            {
            // InternalSeleniumDsl.g:1297:3: ()
            // InternalSeleniumDsl.g:1298:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAllPredicateAccess().getAllPredicateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getAllPredicateAccess().getAllKeyword_1());
            		
            otherlv_2=(Token)match(input,49,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getAllPredicateAccess().getElementsKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getAllPredicateAccess().getOfKeyword_3());
            		
            otherlv_4=(Token)match(input,50,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAllPredicateAccess().getTypeKeyword_4());
            		

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
    // $ANTLR end "ruleAllPredicate"


    // $ANTLR start "entryRuleOrdinalPredicate"
    // InternalSeleniumDsl.g:1324:1: entryRuleOrdinalPredicate returns [EObject current=null] : iv_ruleOrdinalPredicate= ruleOrdinalPredicate EOF ;
    public final EObject entryRuleOrdinalPredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrdinalPredicate = null;


        try {
            // InternalSeleniumDsl.g:1324:57: (iv_ruleOrdinalPredicate= ruleOrdinalPredicate EOF )
            // InternalSeleniumDsl.g:1325:2: iv_ruleOrdinalPredicate= ruleOrdinalPredicate EOF
            {
             newCompositeNode(grammarAccess.getOrdinalPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrdinalPredicate=ruleOrdinalPredicate();

            state._fsp--;

             current =iv_ruleOrdinalPredicate; 
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
    // $ANTLR end "entryRuleOrdinalPredicate"


    // $ANTLR start "ruleOrdinalPredicate"
    // InternalSeleniumDsl.g:1331:1: ruleOrdinalPredicate returns [EObject current=null] : (otherlv_0= 'the' ( (lv_ordinal_1_0= ruleOrdinalInteger ) ) ) ;
    public final EObject ruleOrdinalPredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ordinal_1_0 = null;



        	enterRule();

        try {
            // InternalSeleniumDsl.g:1337:2: ( (otherlv_0= 'the' ( (lv_ordinal_1_0= ruleOrdinalInteger ) ) ) )
            // InternalSeleniumDsl.g:1338:2: (otherlv_0= 'the' ( (lv_ordinal_1_0= ruleOrdinalInteger ) ) )
            {
            // InternalSeleniumDsl.g:1338:2: (otherlv_0= 'the' ( (lv_ordinal_1_0= ruleOrdinalInteger ) ) )
            // InternalSeleniumDsl.g:1339:3: otherlv_0= 'the' ( (lv_ordinal_1_0= ruleOrdinalInteger ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_39); 

            			newLeafNode(otherlv_0, grammarAccess.getOrdinalPredicateAccess().getTheKeyword_0());
            		
            // InternalSeleniumDsl.g:1343:3: ( (lv_ordinal_1_0= ruleOrdinalInteger ) )
            // InternalSeleniumDsl.g:1344:4: (lv_ordinal_1_0= ruleOrdinalInteger )
            {
            // InternalSeleniumDsl.g:1344:4: (lv_ordinal_1_0= ruleOrdinalInteger )
            // InternalSeleniumDsl.g:1345:5: lv_ordinal_1_0= ruleOrdinalInteger
            {

            					newCompositeNode(grammarAccess.getOrdinalPredicateAccess().getOrdinalOrdinalIntegerParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_ordinal_1_0=ruleOrdinalInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrdinalPredicateRule());
            					}
            					set(
            						current,
            						"ordinal",
            						lv_ordinal_1_0,
            						"www.imta.fr.browserautomation.SeleniumDsl.OrdinalInteger");
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
    // $ANTLR end "ruleOrdinalPredicate"


    // $ANTLR start "entryRuleLastPredicate"
    // InternalSeleniumDsl.g:1366:1: entryRuleLastPredicate returns [EObject current=null] : iv_ruleLastPredicate= ruleLastPredicate EOF ;
    public final EObject entryRuleLastPredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLastPredicate = null;


        try {
            // InternalSeleniumDsl.g:1366:54: (iv_ruleLastPredicate= ruleLastPredicate EOF )
            // InternalSeleniumDsl.g:1367:2: iv_ruleLastPredicate= ruleLastPredicate EOF
            {
             newCompositeNode(grammarAccess.getLastPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLastPredicate=ruleLastPredicate();

            state._fsp--;

             current =iv_ruleLastPredicate; 
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
    // $ANTLR end "entryRuleLastPredicate"


    // $ANTLR start "ruleLastPredicate"
    // InternalSeleniumDsl.g:1373:1: ruleLastPredicate returns [EObject current=null] : ( () otherlv_1= 'the' otherlv_2= 'last' ) ;
    public final EObject ruleLastPredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSeleniumDsl.g:1379:2: ( ( () otherlv_1= 'the' otherlv_2= 'last' ) )
            // InternalSeleniumDsl.g:1380:2: ( () otherlv_1= 'the' otherlv_2= 'last' )
            {
            // InternalSeleniumDsl.g:1380:2: ( () otherlv_1= 'the' otherlv_2= 'last' )
            // InternalSeleniumDsl.g:1381:3: () otherlv_1= 'the' otherlv_2= 'last'
            {
            // InternalSeleniumDsl.g:1381:3: ()
            // InternalSeleniumDsl.g:1382:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLastPredicateAccess().getLastPredicateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getLastPredicateAccess().getTheKeyword_1());
            		
            otherlv_2=(Token)match(input,51,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getLastPredicateAccess().getLastKeyword_2());
            		

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
    // $ANTLR end "ruleLastPredicate"


    // $ANTLR start "entryRuleDefaultFirstPredicate"
    // InternalSeleniumDsl.g:1400:1: entryRuleDefaultFirstPredicate returns [EObject current=null] : iv_ruleDefaultFirstPredicate= ruleDefaultFirstPredicate EOF ;
    public final EObject entryRuleDefaultFirstPredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultFirstPredicate = null;


        try {
            // InternalSeleniumDsl.g:1400:62: (iv_ruleDefaultFirstPredicate= ruleDefaultFirstPredicate EOF )
            // InternalSeleniumDsl.g:1401:2: iv_ruleDefaultFirstPredicate= ruleDefaultFirstPredicate EOF
            {
             newCompositeNode(grammarAccess.getDefaultFirstPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefaultFirstPredicate=ruleDefaultFirstPredicate();

            state._fsp--;

             current =iv_ruleDefaultFirstPredicate; 
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
    // $ANTLR end "entryRuleDefaultFirstPredicate"


    // $ANTLR start "ruleDefaultFirstPredicate"
    // InternalSeleniumDsl.g:1407:1: ruleDefaultFirstPredicate returns [EObject current=null] : ( () otherlv_1= 'the' ) ;
    public final EObject ruleDefaultFirstPredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSeleniumDsl.g:1413:2: ( ( () otherlv_1= 'the' ) )
            // InternalSeleniumDsl.g:1414:2: ( () otherlv_1= 'the' )
            {
            // InternalSeleniumDsl.g:1414:2: ( () otherlv_1= 'the' )
            // InternalSeleniumDsl.g:1415:3: () otherlv_1= 'the'
            {
            // InternalSeleniumDsl.g:1415:3: ()
            // InternalSeleniumDsl.g:1416:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDefaultFirstPredicateAccess().getDefaultFirstPredicateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getDefaultFirstPredicateAccess().getTheKeyword_1());
            		

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
    // $ANTLR end "ruleDefaultFirstPredicate"


    // $ANTLR start "entryRuleMatcher"
    // InternalSeleniumDsl.g:1430:1: entryRuleMatcher returns [String current=null] : iv_ruleMatcher= ruleMatcher EOF ;
    public final String entryRuleMatcher() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMatcher = null;


        try {
            // InternalSeleniumDsl.g:1430:47: (iv_ruleMatcher= ruleMatcher EOF )
            // InternalSeleniumDsl.g:1431:2: iv_ruleMatcher= ruleMatcher EOF
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
    // InternalSeleniumDsl.g:1437:1: ruleMatcher returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'containing' | kw= 'matching' ) ;
    public final AntlrDatatypeRuleToken ruleMatcher() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSeleniumDsl.g:1443:2: ( (kw= 'containing' | kw= 'matching' ) )
            // InternalSeleniumDsl.g:1444:2: (kw= 'containing' | kw= 'matching' )
            {
            // InternalSeleniumDsl.g:1444:2: (kw= 'containing' | kw= 'matching' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==52) ) {
                alt16=1;
            }
            else if ( (LA16_0==53) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalSeleniumDsl.g:1445:3: kw= 'containing'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMatcherAccess().getContainingKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSeleniumDsl.g:1451:3: kw= 'matching'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

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
    // InternalSeleniumDsl.g:1460:1: entryRuleVerify returns [EObject current=null] : iv_ruleVerify= ruleVerify EOF ;
    public final EObject entryRuleVerify() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerify = null;


        try {
            // InternalSeleniumDsl.g:1460:47: (iv_ruleVerify= ruleVerify EOF )
            // InternalSeleniumDsl.g:1461:2: iv_ruleVerify= ruleVerify EOF
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
    // InternalSeleniumDsl.g:1467:1: ruleVerify returns [EObject current=null] : (otherlv_0= 'verify' otherlv_1= 'that' ( (lv_selector_2_0= ruleSelector ) ) otherlv_3= 'is' ( (lv_properties_4_0= ruleElementProperty ) ) (otherlv_5= 'and' ( (lv_properties_6_0= ruleElementProperty ) ) )* ) ;
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
            // InternalSeleniumDsl.g:1473:2: ( (otherlv_0= 'verify' otherlv_1= 'that' ( (lv_selector_2_0= ruleSelector ) ) otherlv_3= 'is' ( (lv_properties_4_0= ruleElementProperty ) ) (otherlv_5= 'and' ( (lv_properties_6_0= ruleElementProperty ) ) )* ) )
            // InternalSeleniumDsl.g:1474:2: (otherlv_0= 'verify' otherlv_1= 'that' ( (lv_selector_2_0= ruleSelector ) ) otherlv_3= 'is' ( (lv_properties_4_0= ruleElementProperty ) ) (otherlv_5= 'and' ( (lv_properties_6_0= ruleElementProperty ) ) )* )
            {
            // InternalSeleniumDsl.g:1474:2: (otherlv_0= 'verify' otherlv_1= 'that' ( (lv_selector_2_0= ruleSelector ) ) otherlv_3= 'is' ( (lv_properties_4_0= ruleElementProperty ) ) (otherlv_5= 'and' ( (lv_properties_6_0= ruleElementProperty ) ) )* )
            // InternalSeleniumDsl.g:1475:3: otherlv_0= 'verify' otherlv_1= 'that' ( (lv_selector_2_0= ruleSelector ) ) otherlv_3= 'is' ( (lv_properties_4_0= ruleElementProperty ) ) (otherlv_5= 'and' ( (lv_properties_6_0= ruleElementProperty ) ) )*
            {
            otherlv_0=(Token)match(input,54,FOLLOW_41); 

            			newLeafNode(otherlv_0, grammarAccess.getVerifyAccess().getVerifyKeyword_0());
            		
            otherlv_1=(Token)match(input,40,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getVerifyAccess().getThatKeyword_1());
            		
            // InternalSeleniumDsl.g:1483:3: ( (lv_selector_2_0= ruleSelector ) )
            // InternalSeleniumDsl.g:1484:4: (lv_selector_2_0= ruleSelector )
            {
            // InternalSeleniumDsl.g:1484:4: (lv_selector_2_0= ruleSelector )
            // InternalSeleniumDsl.g:1485:5: lv_selector_2_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getVerifyAccess().getSelectorSelectorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
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

            otherlv_3=(Token)match(input,41,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getVerifyAccess().getIsKeyword_3());
            		
            // InternalSeleniumDsl.g:1506:3: ( (lv_properties_4_0= ruleElementProperty ) )
            // InternalSeleniumDsl.g:1507:4: (lv_properties_4_0= ruleElementProperty )
            {
            // InternalSeleniumDsl.g:1507:4: (lv_properties_4_0= ruleElementProperty )
            // InternalSeleniumDsl.g:1508:5: lv_properties_4_0= ruleElementProperty
            {

            					newCompositeNode(grammarAccess.getVerifyAccess().getPropertiesElementPropertyParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_33);
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

            // InternalSeleniumDsl.g:1525:3: (otherlv_5= 'and' ( (lv_properties_6_0= ruleElementProperty ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==42) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSeleniumDsl.g:1526:4: otherlv_5= 'and' ( (lv_properties_6_0= ruleElementProperty ) )
            	    {
            	    otherlv_5=(Token)match(input,42,FOLLOW_31); 

            	    				newLeafNode(otherlv_5, grammarAccess.getVerifyAccess().getAndKeyword_5_0());
            	    			
            	    // InternalSeleniumDsl.g:1530:4: ( (lv_properties_6_0= ruleElementProperty ) )
            	    // InternalSeleniumDsl.g:1531:5: (lv_properties_6_0= ruleElementProperty )
            	    {
            	    // InternalSeleniumDsl.g:1531:5: (lv_properties_6_0= ruleElementProperty )
            	    // InternalSeleniumDsl.g:1532:6: lv_properties_6_0= ruleElementProperty
            	    {

            	    						newCompositeNode(grammarAccess.getVerifyAccess().getPropertiesElementPropertyParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
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

            	default :
            	    break loop17;
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
    // $ANTLR end "ruleVerify"


    // $ANTLR start "entryRuleOrdinalInteger"
    // InternalSeleniumDsl.g:1554:1: entryRuleOrdinalInteger returns [EObject current=null] : iv_ruleOrdinalInteger= ruleOrdinalInteger EOF ;
    public final EObject entryRuleOrdinalInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrdinalInteger = null;


        try {
            // InternalSeleniumDsl.g:1554:55: (iv_ruleOrdinalInteger= ruleOrdinalInteger EOF )
            // InternalSeleniumDsl.g:1555:2: iv_ruleOrdinalInteger= ruleOrdinalInteger EOF
            {
             newCompositeNode(grammarAccess.getOrdinalIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrdinalInteger=ruleOrdinalInteger();

            state._fsp--;

             current =iv_ruleOrdinalInteger; 
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
    // $ANTLR end "entryRuleOrdinalInteger"


    // $ANTLR start "ruleOrdinalInteger"
    // InternalSeleniumDsl.g:1561:1: ruleOrdinalInteger returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) this_ORDINAL_SUFFIX_1= RULE_ORDINAL_SUFFIX ) ;
    public final EObject ruleOrdinalInteger() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token this_ORDINAL_SUFFIX_1=null;


        	enterRule();

        try {
            // InternalSeleniumDsl.g:1567:2: ( ( ( (lv_value_0_0= RULE_INT ) ) this_ORDINAL_SUFFIX_1= RULE_ORDINAL_SUFFIX ) )
            // InternalSeleniumDsl.g:1568:2: ( ( (lv_value_0_0= RULE_INT ) ) this_ORDINAL_SUFFIX_1= RULE_ORDINAL_SUFFIX )
            {
            // InternalSeleniumDsl.g:1568:2: ( ( (lv_value_0_0= RULE_INT ) ) this_ORDINAL_SUFFIX_1= RULE_ORDINAL_SUFFIX )
            // InternalSeleniumDsl.g:1569:3: ( (lv_value_0_0= RULE_INT ) ) this_ORDINAL_SUFFIX_1= RULE_ORDINAL_SUFFIX
            {
            // InternalSeleniumDsl.g:1569:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalSeleniumDsl.g:1570:4: (lv_value_0_0= RULE_INT )
            {
            // InternalSeleniumDsl.g:1570:4: (lv_value_0_0= RULE_INT )
            // InternalSeleniumDsl.g:1571:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_42); 

            					newLeafNode(lv_value_0_0, grammarAccess.getOrdinalIntegerAccess().getValueINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOrdinalIntegerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            this_ORDINAL_SUFFIX_1=(Token)match(input,RULE_ORDINAL_SUFFIX,FOLLOW_2); 

            			newLeafNode(this_ORDINAL_SUFFIX_1, grammarAccess.getOrdinalIntegerAccess().getORDINAL_SUFFIXTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleOrdinalInteger"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0040000886A30000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0001000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000011400000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010400000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000F00000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000E00000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000080L});

}