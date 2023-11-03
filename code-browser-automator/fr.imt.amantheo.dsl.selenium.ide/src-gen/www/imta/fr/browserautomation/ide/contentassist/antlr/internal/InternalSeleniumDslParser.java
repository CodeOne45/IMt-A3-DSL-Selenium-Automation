package www.imta.fr.browserautomation.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import www.imta.fr.browserautomation.services.SeleniumDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSeleniumDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ORDINAL_SUFFIX", "RULE_STRING", "RULE_HTML_ATTRIBUTE", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'select'", "'selected'", "'visible'", "'enabled'", "'containing'", "'matching'", "'Test'", "'case'", "':'", "'***'", "'open'", "'a'", "'browser'", "'window'", "'go'", "'to'", "'click'", "'on'", "'copy'", "'the'", "'property'", "'of'", "'as'", "'paste'", "'content'", "'clipboard'", "'in'", "'fill'", "'with'", "'properties'", "'associated'", "'label'", "'that'", "'is'", "'and'", "'saved'", "'all'", "'elements'", "'type'", "'last'", "'verify'", "'not'"
    };
    public static final int T__50=50;
    public static final int RULE_HTML_ATTRIBUTE=6;
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
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_ORDINAL_SUFFIX=4;
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

    	public void setGrammarAccess(SeleniumDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleBrowserDsl"
    // InternalSeleniumDsl.g:53:1: entryRuleBrowserDsl : ruleBrowserDsl EOF ;
    public final void entryRuleBrowserDsl() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:54:1: ( ruleBrowserDsl EOF )
            // InternalSeleniumDsl.g:55:1: ruleBrowserDsl EOF
            {
             before(grammarAccess.getBrowserDslRule()); 
            pushFollow(FOLLOW_1);
            ruleBrowserDsl();

            state._fsp--;

             after(grammarAccess.getBrowserDslRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBrowserDsl"


    // $ANTLR start "ruleBrowserDsl"
    // InternalSeleniumDsl.g:62:1: ruleBrowserDsl : ( ( rule__BrowserDsl__CasesAssignment )* ) ;
    public final void ruleBrowserDsl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:66:2: ( ( ( rule__BrowserDsl__CasesAssignment )* ) )
            // InternalSeleniumDsl.g:67:2: ( ( rule__BrowserDsl__CasesAssignment )* )
            {
            // InternalSeleniumDsl.g:67:2: ( ( rule__BrowserDsl__CasesAssignment )* )
            // InternalSeleniumDsl.g:68:3: ( rule__BrowserDsl__CasesAssignment )*
            {
             before(grammarAccess.getBrowserDslAccess().getCasesAssignment()); 
            // InternalSeleniumDsl.g:69:3: ( rule__BrowserDsl__CasesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSeleniumDsl.g:69:4: rule__BrowserDsl__CasesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__BrowserDsl__CasesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getBrowserDslAccess().getCasesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBrowserDsl"


    // $ANTLR start "entryRuleTestCase"
    // InternalSeleniumDsl.g:78:1: entryRuleTestCase : ruleTestCase EOF ;
    public final void entryRuleTestCase() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:79:1: ( ruleTestCase EOF )
            // InternalSeleniumDsl.g:80:1: ruleTestCase EOF
            {
             before(grammarAccess.getTestCaseRule()); 
            pushFollow(FOLLOW_1);
            ruleTestCase();

            state._fsp--;

             after(grammarAccess.getTestCaseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTestCase"


    // $ANTLR start "ruleTestCase"
    // InternalSeleniumDsl.g:87:1: ruleTestCase : ( ( rule__TestCase__Group__0 ) ) ;
    public final void ruleTestCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:91:2: ( ( ( rule__TestCase__Group__0 ) ) )
            // InternalSeleniumDsl.g:92:2: ( ( rule__TestCase__Group__0 ) )
            {
            // InternalSeleniumDsl.g:92:2: ( ( rule__TestCase__Group__0 ) )
            // InternalSeleniumDsl.g:93:3: ( rule__TestCase__Group__0 )
            {
             before(grammarAccess.getTestCaseAccess().getGroup()); 
            // InternalSeleniumDsl.g:94:3: ( rule__TestCase__Group__0 )
            // InternalSeleniumDsl.g:94:4: rule__TestCase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TestCase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTestCaseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTestCase"


    // $ANTLR start "entryRuleCommand"
    // InternalSeleniumDsl.g:103:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:104:1: ( ruleCommand EOF )
            // InternalSeleniumDsl.g:105:1: ruleCommand EOF
            {
             before(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getCommandRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalSeleniumDsl.g:112:1: ruleCommand : ( ( rule__Command__Alternatives ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:116:2: ( ( ( rule__Command__Alternatives ) ) )
            // InternalSeleniumDsl.g:117:2: ( ( rule__Command__Alternatives ) )
            {
            // InternalSeleniumDsl.g:117:2: ( ( rule__Command__Alternatives ) )
            // InternalSeleniumDsl.g:118:3: ( rule__Command__Alternatives )
            {
             before(grammarAccess.getCommandAccess().getAlternatives()); 
            // InternalSeleniumDsl.g:119:3: ( rule__Command__Alternatives )
            // InternalSeleniumDsl.g:119:4: rule__Command__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Command__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleOpenBrowser"
    // InternalSeleniumDsl.g:128:1: entryRuleOpenBrowser : ruleOpenBrowser EOF ;
    public final void entryRuleOpenBrowser() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:129:1: ( ruleOpenBrowser EOF )
            // InternalSeleniumDsl.g:130:1: ruleOpenBrowser EOF
            {
             before(grammarAccess.getOpenBrowserRule()); 
            pushFollow(FOLLOW_1);
            ruleOpenBrowser();

            state._fsp--;

             after(grammarAccess.getOpenBrowserRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOpenBrowser"


    // $ANTLR start "ruleOpenBrowser"
    // InternalSeleniumDsl.g:137:1: ruleOpenBrowser : ( ( rule__OpenBrowser__Group__0 ) ) ;
    public final void ruleOpenBrowser() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:141:2: ( ( ( rule__OpenBrowser__Group__0 ) ) )
            // InternalSeleniumDsl.g:142:2: ( ( rule__OpenBrowser__Group__0 ) )
            {
            // InternalSeleniumDsl.g:142:2: ( ( rule__OpenBrowser__Group__0 ) )
            // InternalSeleniumDsl.g:143:3: ( rule__OpenBrowser__Group__0 )
            {
             before(grammarAccess.getOpenBrowserAccess().getGroup()); 
            // InternalSeleniumDsl.g:144:3: ( rule__OpenBrowser__Group__0 )
            // InternalSeleniumDsl.g:144:4: rule__OpenBrowser__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OpenBrowser__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOpenBrowserAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOpenBrowser"


    // $ANTLR start "entryRuleDOMCommand"
    // InternalSeleniumDsl.g:153:1: entryRuleDOMCommand : ruleDOMCommand EOF ;
    public final void entryRuleDOMCommand() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:154:1: ( ruleDOMCommand EOF )
            // InternalSeleniumDsl.g:155:1: ruleDOMCommand EOF
            {
             before(grammarAccess.getDOMCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleDOMCommand();

            state._fsp--;

             after(grammarAccess.getDOMCommandRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDOMCommand"


    // $ANTLR start "ruleDOMCommand"
    // InternalSeleniumDsl.g:162:1: ruleDOMCommand : ( ( rule__DOMCommand__Alternatives ) ) ;
    public final void ruleDOMCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:166:2: ( ( ( rule__DOMCommand__Alternatives ) ) )
            // InternalSeleniumDsl.g:167:2: ( ( rule__DOMCommand__Alternatives ) )
            {
            // InternalSeleniumDsl.g:167:2: ( ( rule__DOMCommand__Alternatives ) )
            // InternalSeleniumDsl.g:168:3: ( rule__DOMCommand__Alternatives )
            {
             before(grammarAccess.getDOMCommandAccess().getAlternatives()); 
            // InternalSeleniumDsl.g:169:3: ( rule__DOMCommand__Alternatives )
            // InternalSeleniumDsl.g:169:4: rule__DOMCommand__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DOMCommand__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDOMCommandAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDOMCommand"


    // $ANTLR start "entryRuleGoTo"
    // InternalSeleniumDsl.g:178:1: entryRuleGoTo : ruleGoTo EOF ;
    public final void entryRuleGoTo() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:179:1: ( ruleGoTo EOF )
            // InternalSeleniumDsl.g:180:1: ruleGoTo EOF
            {
             before(grammarAccess.getGoToRule()); 
            pushFollow(FOLLOW_1);
            ruleGoTo();

            state._fsp--;

             after(grammarAccess.getGoToRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGoTo"


    // $ANTLR start "ruleGoTo"
    // InternalSeleniumDsl.g:187:1: ruleGoTo : ( ( rule__GoTo__Group__0 ) ) ;
    public final void ruleGoTo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:191:2: ( ( ( rule__GoTo__Group__0 ) ) )
            // InternalSeleniumDsl.g:192:2: ( ( rule__GoTo__Group__0 ) )
            {
            // InternalSeleniumDsl.g:192:2: ( ( rule__GoTo__Group__0 ) )
            // InternalSeleniumDsl.g:193:3: ( rule__GoTo__Group__0 )
            {
             before(grammarAccess.getGoToAccess().getGroup()); 
            // InternalSeleniumDsl.g:194:3: ( rule__GoTo__Group__0 )
            // InternalSeleniumDsl.g:194:4: rule__GoTo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GoTo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGoToAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGoTo"


    // $ANTLR start "entryRuleClick"
    // InternalSeleniumDsl.g:203:1: entryRuleClick : ruleClick EOF ;
    public final void entryRuleClick() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:204:1: ( ruleClick EOF )
            // InternalSeleniumDsl.g:205:1: ruleClick EOF
            {
             before(grammarAccess.getClickRule()); 
            pushFollow(FOLLOW_1);
            ruleClick();

            state._fsp--;

             after(grammarAccess.getClickRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClick"


    // $ANTLR start "ruleClick"
    // InternalSeleniumDsl.g:212:1: ruleClick : ( ( rule__Click__Group__0 ) ) ;
    public final void ruleClick() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:216:2: ( ( ( rule__Click__Group__0 ) ) )
            // InternalSeleniumDsl.g:217:2: ( ( rule__Click__Group__0 ) )
            {
            // InternalSeleniumDsl.g:217:2: ( ( rule__Click__Group__0 ) )
            // InternalSeleniumDsl.g:218:3: ( rule__Click__Group__0 )
            {
             before(grammarAccess.getClickAccess().getGroup()); 
            // InternalSeleniumDsl.g:219:3: ( rule__Click__Group__0 )
            // InternalSeleniumDsl.g:219:4: rule__Click__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Click__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClickAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClick"


    // $ANTLR start "entryRuleCopy"
    // InternalSeleniumDsl.g:228:1: entryRuleCopy : ruleCopy EOF ;
    public final void entryRuleCopy() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:229:1: ( ruleCopy EOF )
            // InternalSeleniumDsl.g:230:1: ruleCopy EOF
            {
             before(grammarAccess.getCopyRule()); 
            pushFollow(FOLLOW_1);
            ruleCopy();

            state._fsp--;

             after(grammarAccess.getCopyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCopy"


    // $ANTLR start "ruleCopy"
    // InternalSeleniumDsl.g:237:1: ruleCopy : ( ( rule__Copy__Group__0 ) ) ;
    public final void ruleCopy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:241:2: ( ( ( rule__Copy__Group__0 ) ) )
            // InternalSeleniumDsl.g:242:2: ( ( rule__Copy__Group__0 ) )
            {
            // InternalSeleniumDsl.g:242:2: ( ( rule__Copy__Group__0 ) )
            // InternalSeleniumDsl.g:243:3: ( rule__Copy__Group__0 )
            {
             before(grammarAccess.getCopyAccess().getGroup()); 
            // InternalSeleniumDsl.g:244:3: ( rule__Copy__Group__0 )
            // InternalSeleniumDsl.g:244:4: rule__Copy__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Copy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCopyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCopy"


    // $ANTLR start "entryRulePaste"
    // InternalSeleniumDsl.g:253:1: entryRulePaste : rulePaste EOF ;
    public final void entryRulePaste() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:254:1: ( rulePaste EOF )
            // InternalSeleniumDsl.g:255:1: rulePaste EOF
            {
             before(grammarAccess.getPasteRule()); 
            pushFollow(FOLLOW_1);
            rulePaste();

            state._fsp--;

             after(grammarAccess.getPasteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePaste"


    // $ANTLR start "rulePaste"
    // InternalSeleniumDsl.g:262:1: rulePaste : ( ( rule__Paste__Group__0 ) ) ;
    public final void rulePaste() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:266:2: ( ( ( rule__Paste__Group__0 ) ) )
            // InternalSeleniumDsl.g:267:2: ( ( rule__Paste__Group__0 ) )
            {
            // InternalSeleniumDsl.g:267:2: ( ( rule__Paste__Group__0 ) )
            // InternalSeleniumDsl.g:268:3: ( rule__Paste__Group__0 )
            {
             before(grammarAccess.getPasteAccess().getGroup()); 
            // InternalSeleniumDsl.g:269:3: ( rule__Paste__Group__0 )
            // InternalSeleniumDsl.g:269:4: rule__Paste__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Paste__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPasteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePaste"


    // $ANTLR start "entryRuleInsert"
    // InternalSeleniumDsl.g:278:1: entryRuleInsert : ruleInsert EOF ;
    public final void entryRuleInsert() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:279:1: ( ruleInsert EOF )
            // InternalSeleniumDsl.g:280:1: ruleInsert EOF
            {
             before(grammarAccess.getInsertRule()); 
            pushFollow(FOLLOW_1);
            ruleInsert();

            state._fsp--;

             after(grammarAccess.getInsertRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInsert"


    // $ANTLR start "ruleInsert"
    // InternalSeleniumDsl.g:287:1: ruleInsert : ( ( rule__Insert__Group__0 ) ) ;
    public final void ruleInsert() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:291:2: ( ( ( rule__Insert__Group__0 ) ) )
            // InternalSeleniumDsl.g:292:2: ( ( rule__Insert__Group__0 ) )
            {
            // InternalSeleniumDsl.g:292:2: ( ( rule__Insert__Group__0 ) )
            // InternalSeleniumDsl.g:293:3: ( rule__Insert__Group__0 )
            {
             before(grammarAccess.getInsertAccess().getGroup()); 
            // InternalSeleniumDsl.g:294:3: ( rule__Insert__Group__0 )
            // InternalSeleniumDsl.g:294:4: rule__Insert__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Insert__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInsertAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInsert"


    // $ANTLR start "entryRuleSelector"
    // InternalSeleniumDsl.g:303:1: entryRuleSelector : ruleSelector EOF ;
    public final void entryRuleSelector() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:304:1: ( ruleSelector EOF )
            // InternalSeleniumDsl.g:305:1: ruleSelector EOF
            {
             before(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getSelectorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelector"


    // $ANTLR start "ruleSelector"
    // InternalSeleniumDsl.g:312:1: ruleSelector : ( ( rule__Selector__Group__0 ) ) ;
    public final void ruleSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:316:2: ( ( ( rule__Selector__Group__0 ) ) )
            // InternalSeleniumDsl.g:317:2: ( ( rule__Selector__Group__0 ) )
            {
            // InternalSeleniumDsl.g:317:2: ( ( rule__Selector__Group__0 ) )
            // InternalSeleniumDsl.g:318:3: ( rule__Selector__Group__0 )
            {
             before(grammarAccess.getSelectorAccess().getGroup()); 
            // InternalSeleniumDsl.g:319:3: ( rule__Selector__Group__0 )
            // InternalSeleniumDsl.g:319:4: rule__Selector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleAttributes"
    // InternalSeleniumDsl.g:328:1: entryRuleAttributes : ruleAttributes EOF ;
    public final void entryRuleAttributes() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:329:1: ( ruleAttributes EOF )
            // InternalSeleniumDsl.g:330:1: ruleAttributes EOF
            {
             before(grammarAccess.getAttributesRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributes();

            state._fsp--;

             after(grammarAccess.getAttributesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributes"


    // $ANTLR start "ruleAttributes"
    // InternalSeleniumDsl.g:337:1: ruleAttributes : ( ( rule__Attributes__Group__0 ) ) ;
    public final void ruleAttributes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:341:2: ( ( ( rule__Attributes__Group__0 ) ) )
            // InternalSeleniumDsl.g:342:2: ( ( rule__Attributes__Group__0 ) )
            {
            // InternalSeleniumDsl.g:342:2: ( ( rule__Attributes__Group__0 ) )
            // InternalSeleniumDsl.g:343:3: ( rule__Attributes__Group__0 )
            {
             before(grammarAccess.getAttributesAccess().getGroup()); 
            // InternalSeleniumDsl.g:344:3: ( rule__Attributes__Group__0 )
            // InternalSeleniumDsl.g:344:4: rule__Attributes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attributes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributes"


    // $ANTLR start "entryRuleElementAttribute"
    // InternalSeleniumDsl.g:353:1: entryRuleElementAttribute : ruleElementAttribute EOF ;
    public final void entryRuleElementAttribute() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:354:1: ( ruleElementAttribute EOF )
            // InternalSeleniumDsl.g:355:1: ruleElementAttribute EOF
            {
             before(grammarAccess.getElementAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleElementAttribute();

            state._fsp--;

             after(grammarAccess.getElementAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElementAttribute"


    // $ANTLR start "ruleElementAttribute"
    // InternalSeleniumDsl.g:362:1: ruleElementAttribute : ( ( rule__ElementAttribute__Group__0 ) ) ;
    public final void ruleElementAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:366:2: ( ( ( rule__ElementAttribute__Group__0 ) ) )
            // InternalSeleniumDsl.g:367:2: ( ( rule__ElementAttribute__Group__0 ) )
            {
            // InternalSeleniumDsl.g:367:2: ( ( rule__ElementAttribute__Group__0 ) )
            // InternalSeleniumDsl.g:368:3: ( rule__ElementAttribute__Group__0 )
            {
             before(grammarAccess.getElementAttributeAccess().getGroup()); 
            // InternalSeleniumDsl.g:369:3: ( rule__ElementAttribute__Group__0 )
            // InternalSeleniumDsl.g:369:4: rule__ElementAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ElementAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElementAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElementAttribute"


    // $ANTLR start "entryRuleContent"
    // InternalSeleniumDsl.g:378:1: entryRuleContent : ruleContent EOF ;
    public final void entryRuleContent() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:379:1: ( ruleContent EOF )
            // InternalSeleniumDsl.g:380:1: ruleContent EOF
            {
             before(grammarAccess.getContentRule()); 
            pushFollow(FOLLOW_1);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getContentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // InternalSeleniumDsl.g:387:1: ruleContent : ( ( rule__Content__Alternatives ) ) ;
    public final void ruleContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:391:2: ( ( ( rule__Content__Alternatives ) ) )
            // InternalSeleniumDsl.g:392:2: ( ( rule__Content__Alternatives ) )
            {
            // InternalSeleniumDsl.g:392:2: ( ( rule__Content__Alternatives ) )
            // InternalSeleniumDsl.g:393:3: ( rule__Content__Alternatives )
            {
             before(grammarAccess.getContentAccess().getAlternatives()); 
            // InternalSeleniumDsl.g:394:3: ( rule__Content__Alternatives )
            // InternalSeleniumDsl.g:394:4: rule__Content__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Content__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContent"


    // $ANTLR start "entryRuleClipboardContent"
    // InternalSeleniumDsl.g:403:1: entryRuleClipboardContent : ruleClipboardContent EOF ;
    public final void entryRuleClipboardContent() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:404:1: ( ruleClipboardContent EOF )
            // InternalSeleniumDsl.g:405:1: ruleClipboardContent EOF
            {
             before(grammarAccess.getClipboardContentRule()); 
            pushFollow(FOLLOW_1);
            ruleClipboardContent();

            state._fsp--;

             after(grammarAccess.getClipboardContentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClipboardContent"


    // $ANTLR start "ruleClipboardContent"
    // InternalSeleniumDsl.g:412:1: ruleClipboardContent : ( ( rule__ClipboardContent__Group__0 ) ) ;
    public final void ruleClipboardContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:416:2: ( ( ( rule__ClipboardContent__Group__0 ) ) )
            // InternalSeleniumDsl.g:417:2: ( ( rule__ClipboardContent__Group__0 ) )
            {
            // InternalSeleniumDsl.g:417:2: ( ( rule__ClipboardContent__Group__0 ) )
            // InternalSeleniumDsl.g:418:3: ( rule__ClipboardContent__Group__0 )
            {
             before(grammarAccess.getClipboardContentAccess().getGroup()); 
            // InternalSeleniumDsl.g:419:3: ( rule__ClipboardContent__Group__0 )
            // InternalSeleniumDsl.g:419:4: rule__ClipboardContent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClipboardContent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClipboardContentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClipboardContent"


    // $ANTLR start "entryRuleStringContent"
    // InternalSeleniumDsl.g:428:1: entryRuleStringContent : ruleStringContent EOF ;
    public final void entryRuleStringContent() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:429:1: ( ruleStringContent EOF )
            // InternalSeleniumDsl.g:430:1: ruleStringContent EOF
            {
             before(grammarAccess.getStringContentRule()); 
            pushFollow(FOLLOW_1);
            ruleStringContent();

            state._fsp--;

             after(grammarAccess.getStringContentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringContent"


    // $ANTLR start "ruleStringContent"
    // InternalSeleniumDsl.g:437:1: ruleStringContent : ( ( rule__StringContent__ValueAssignment ) ) ;
    public final void ruleStringContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:441:2: ( ( ( rule__StringContent__ValueAssignment ) ) )
            // InternalSeleniumDsl.g:442:2: ( ( rule__StringContent__ValueAssignment ) )
            {
            // InternalSeleniumDsl.g:442:2: ( ( rule__StringContent__ValueAssignment ) )
            // InternalSeleniumDsl.g:443:3: ( rule__StringContent__ValueAssignment )
            {
             before(grammarAccess.getStringContentAccess().getValueAssignment()); 
            // InternalSeleniumDsl.g:444:3: ( rule__StringContent__ValueAssignment )
            // InternalSeleniumDsl.g:444:4: rule__StringContent__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringContent__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringContentAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringContent"


    // $ANTLR start "entryRuleProperties"
    // InternalSeleniumDsl.g:453:1: entryRuleProperties : ruleProperties EOF ;
    public final void entryRuleProperties() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:454:1: ( ruleProperties EOF )
            // InternalSeleniumDsl.g:455:1: ruleProperties EOF
            {
             before(grammarAccess.getPropertiesRule()); 
            pushFollow(FOLLOW_1);
            ruleProperties();

            state._fsp--;

             after(grammarAccess.getPropertiesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProperties"


    // $ANTLR start "ruleProperties"
    // InternalSeleniumDsl.g:462:1: ruleProperties : ( ( rule__Properties__Group__0 ) ) ;
    public final void ruleProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:466:2: ( ( ( rule__Properties__Group__0 ) ) )
            // InternalSeleniumDsl.g:467:2: ( ( rule__Properties__Group__0 ) )
            {
            // InternalSeleniumDsl.g:467:2: ( ( rule__Properties__Group__0 ) )
            // InternalSeleniumDsl.g:468:3: ( rule__Properties__Group__0 )
            {
             before(grammarAccess.getPropertiesAccess().getGroup()); 
            // InternalSeleniumDsl.g:469:3: ( rule__Properties__Group__0 )
            // InternalSeleniumDsl.g:469:4: rule__Properties__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Properties__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertiesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperties"


    // $ANTLR start "entryRuleElementProperty"
    // InternalSeleniumDsl.g:478:1: entryRuleElementProperty : ruleElementProperty EOF ;
    public final void entryRuleElementProperty() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:479:1: ( ruleElementProperty EOF )
            // InternalSeleniumDsl.g:480:1: ruleElementProperty EOF
            {
             before(grammarAccess.getElementPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleElementProperty();

            state._fsp--;

             after(grammarAccess.getElementPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElementProperty"


    // $ANTLR start "ruleElementProperty"
    // InternalSeleniumDsl.g:487:1: ruleElementProperty : ( ( rule__ElementProperty__Group__0 ) ) ;
    public final void ruleElementProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:491:2: ( ( ( rule__ElementProperty__Group__0 ) ) )
            // InternalSeleniumDsl.g:492:2: ( ( rule__ElementProperty__Group__0 ) )
            {
            // InternalSeleniumDsl.g:492:2: ( ( rule__ElementProperty__Group__0 ) )
            // InternalSeleniumDsl.g:493:3: ( rule__ElementProperty__Group__0 )
            {
             before(grammarAccess.getElementPropertyAccess().getGroup()); 
            // InternalSeleniumDsl.g:494:3: ( rule__ElementProperty__Group__0 )
            // InternalSeleniumDsl.g:494:4: rule__ElementProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ElementProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElementPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElementProperty"


    // $ANTLR start "entryRuleSelectorPredicate"
    // InternalSeleniumDsl.g:503:1: entryRuleSelectorPredicate : ruleSelectorPredicate EOF ;
    public final void entryRuleSelectorPredicate() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:504:1: ( ruleSelectorPredicate EOF )
            // InternalSeleniumDsl.g:505:1: ruleSelectorPredicate EOF
            {
             before(grammarAccess.getSelectorPredicateRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectorPredicate();

            state._fsp--;

             after(grammarAccess.getSelectorPredicateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelectorPredicate"


    // $ANTLR start "ruleSelectorPredicate"
    // InternalSeleniumDsl.g:512:1: ruleSelectorPredicate : ( ( rule__SelectorPredicate__Alternatives ) ) ;
    public final void ruleSelectorPredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:516:2: ( ( ( rule__SelectorPredicate__Alternatives ) ) )
            // InternalSeleniumDsl.g:517:2: ( ( rule__SelectorPredicate__Alternatives ) )
            {
            // InternalSeleniumDsl.g:517:2: ( ( rule__SelectorPredicate__Alternatives ) )
            // InternalSeleniumDsl.g:518:3: ( rule__SelectorPredicate__Alternatives )
            {
             before(grammarAccess.getSelectorPredicateAccess().getAlternatives()); 
            // InternalSeleniumDsl.g:519:3: ( rule__SelectorPredicate__Alternatives )
            // InternalSeleniumDsl.g:519:4: rule__SelectorPredicate__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SelectorPredicate__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSelectorPredicateAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectorPredicate"


    // $ANTLR start "entryRuleAllPredicate"
    // InternalSeleniumDsl.g:528:1: entryRuleAllPredicate : ruleAllPredicate EOF ;
    public final void entryRuleAllPredicate() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:529:1: ( ruleAllPredicate EOF )
            // InternalSeleniumDsl.g:530:1: ruleAllPredicate EOF
            {
             before(grammarAccess.getAllPredicateRule()); 
            pushFollow(FOLLOW_1);
            ruleAllPredicate();

            state._fsp--;

             after(grammarAccess.getAllPredicateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAllPredicate"


    // $ANTLR start "ruleAllPredicate"
    // InternalSeleniumDsl.g:537:1: ruleAllPredicate : ( ( rule__AllPredicate__Group__0 ) ) ;
    public final void ruleAllPredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:541:2: ( ( ( rule__AllPredicate__Group__0 ) ) )
            // InternalSeleniumDsl.g:542:2: ( ( rule__AllPredicate__Group__0 ) )
            {
            // InternalSeleniumDsl.g:542:2: ( ( rule__AllPredicate__Group__0 ) )
            // InternalSeleniumDsl.g:543:3: ( rule__AllPredicate__Group__0 )
            {
             before(grammarAccess.getAllPredicateAccess().getGroup()); 
            // InternalSeleniumDsl.g:544:3: ( rule__AllPredicate__Group__0 )
            // InternalSeleniumDsl.g:544:4: rule__AllPredicate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AllPredicate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAllPredicateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAllPredicate"


    // $ANTLR start "entryRuleOrdinalPredicate"
    // InternalSeleniumDsl.g:553:1: entryRuleOrdinalPredicate : ruleOrdinalPredicate EOF ;
    public final void entryRuleOrdinalPredicate() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:554:1: ( ruleOrdinalPredicate EOF )
            // InternalSeleniumDsl.g:555:1: ruleOrdinalPredicate EOF
            {
             before(grammarAccess.getOrdinalPredicateRule()); 
            pushFollow(FOLLOW_1);
            ruleOrdinalPredicate();

            state._fsp--;

             after(grammarAccess.getOrdinalPredicateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrdinalPredicate"


    // $ANTLR start "ruleOrdinalPredicate"
    // InternalSeleniumDsl.g:562:1: ruleOrdinalPredicate : ( ( rule__OrdinalPredicate__Group__0 ) ) ;
    public final void ruleOrdinalPredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:566:2: ( ( ( rule__OrdinalPredicate__Group__0 ) ) )
            // InternalSeleniumDsl.g:567:2: ( ( rule__OrdinalPredicate__Group__0 ) )
            {
            // InternalSeleniumDsl.g:567:2: ( ( rule__OrdinalPredicate__Group__0 ) )
            // InternalSeleniumDsl.g:568:3: ( rule__OrdinalPredicate__Group__0 )
            {
             before(grammarAccess.getOrdinalPredicateAccess().getGroup()); 
            // InternalSeleniumDsl.g:569:3: ( rule__OrdinalPredicate__Group__0 )
            // InternalSeleniumDsl.g:569:4: rule__OrdinalPredicate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrdinalPredicate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrdinalPredicateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrdinalPredicate"


    // $ANTLR start "entryRuleLastPredicate"
    // InternalSeleniumDsl.g:578:1: entryRuleLastPredicate : ruleLastPredicate EOF ;
    public final void entryRuleLastPredicate() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:579:1: ( ruleLastPredicate EOF )
            // InternalSeleniumDsl.g:580:1: ruleLastPredicate EOF
            {
             before(grammarAccess.getLastPredicateRule()); 
            pushFollow(FOLLOW_1);
            ruleLastPredicate();

            state._fsp--;

             after(grammarAccess.getLastPredicateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLastPredicate"


    // $ANTLR start "ruleLastPredicate"
    // InternalSeleniumDsl.g:587:1: ruleLastPredicate : ( ( rule__LastPredicate__Group__0 ) ) ;
    public final void ruleLastPredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:591:2: ( ( ( rule__LastPredicate__Group__0 ) ) )
            // InternalSeleniumDsl.g:592:2: ( ( rule__LastPredicate__Group__0 ) )
            {
            // InternalSeleniumDsl.g:592:2: ( ( rule__LastPredicate__Group__0 ) )
            // InternalSeleniumDsl.g:593:3: ( rule__LastPredicate__Group__0 )
            {
             before(grammarAccess.getLastPredicateAccess().getGroup()); 
            // InternalSeleniumDsl.g:594:3: ( rule__LastPredicate__Group__0 )
            // InternalSeleniumDsl.g:594:4: rule__LastPredicate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LastPredicate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLastPredicateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLastPredicate"


    // $ANTLR start "entryRuleDefaultFirstPredicate"
    // InternalSeleniumDsl.g:603:1: entryRuleDefaultFirstPredicate : ruleDefaultFirstPredicate EOF ;
    public final void entryRuleDefaultFirstPredicate() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:604:1: ( ruleDefaultFirstPredicate EOF )
            // InternalSeleniumDsl.g:605:1: ruleDefaultFirstPredicate EOF
            {
             before(grammarAccess.getDefaultFirstPredicateRule()); 
            pushFollow(FOLLOW_1);
            ruleDefaultFirstPredicate();

            state._fsp--;

             after(grammarAccess.getDefaultFirstPredicateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefaultFirstPredicate"


    // $ANTLR start "ruleDefaultFirstPredicate"
    // InternalSeleniumDsl.g:612:1: ruleDefaultFirstPredicate : ( ( rule__DefaultFirstPredicate__Group__0 ) ) ;
    public final void ruleDefaultFirstPredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:616:2: ( ( ( rule__DefaultFirstPredicate__Group__0 ) ) )
            // InternalSeleniumDsl.g:617:2: ( ( rule__DefaultFirstPredicate__Group__0 ) )
            {
            // InternalSeleniumDsl.g:617:2: ( ( rule__DefaultFirstPredicate__Group__0 ) )
            // InternalSeleniumDsl.g:618:3: ( rule__DefaultFirstPredicate__Group__0 )
            {
             before(grammarAccess.getDefaultFirstPredicateAccess().getGroup()); 
            // InternalSeleniumDsl.g:619:3: ( rule__DefaultFirstPredicate__Group__0 )
            // InternalSeleniumDsl.g:619:4: rule__DefaultFirstPredicate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefaultFirstPredicate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefaultFirstPredicateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefaultFirstPredicate"


    // $ANTLR start "entryRuleMatcher"
    // InternalSeleniumDsl.g:628:1: entryRuleMatcher : ruleMatcher EOF ;
    public final void entryRuleMatcher() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:629:1: ( ruleMatcher EOF )
            // InternalSeleniumDsl.g:630:1: ruleMatcher EOF
            {
             before(grammarAccess.getMatcherRule()); 
            pushFollow(FOLLOW_1);
            ruleMatcher();

            state._fsp--;

             after(grammarAccess.getMatcherRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMatcher"


    // $ANTLR start "ruleMatcher"
    // InternalSeleniumDsl.g:637:1: ruleMatcher : ( ( rule__Matcher__Alternatives ) ) ;
    public final void ruleMatcher() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:641:2: ( ( ( rule__Matcher__Alternatives ) ) )
            // InternalSeleniumDsl.g:642:2: ( ( rule__Matcher__Alternatives ) )
            {
            // InternalSeleniumDsl.g:642:2: ( ( rule__Matcher__Alternatives ) )
            // InternalSeleniumDsl.g:643:3: ( rule__Matcher__Alternatives )
            {
             before(grammarAccess.getMatcherAccess().getAlternatives()); 
            // InternalSeleniumDsl.g:644:3: ( rule__Matcher__Alternatives )
            // InternalSeleniumDsl.g:644:4: rule__Matcher__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Matcher__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMatcherAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMatcher"


    // $ANTLR start "entryRuleVerify"
    // InternalSeleniumDsl.g:653:1: entryRuleVerify : ruleVerify EOF ;
    public final void entryRuleVerify() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:654:1: ( ruleVerify EOF )
            // InternalSeleniumDsl.g:655:1: ruleVerify EOF
            {
             before(grammarAccess.getVerifyRule()); 
            pushFollow(FOLLOW_1);
            ruleVerify();

            state._fsp--;

             after(grammarAccess.getVerifyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVerify"


    // $ANTLR start "ruleVerify"
    // InternalSeleniumDsl.g:662:1: ruleVerify : ( ( rule__Verify__Group__0 ) ) ;
    public final void ruleVerify() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:666:2: ( ( ( rule__Verify__Group__0 ) ) )
            // InternalSeleniumDsl.g:667:2: ( ( rule__Verify__Group__0 ) )
            {
            // InternalSeleniumDsl.g:667:2: ( ( rule__Verify__Group__0 ) )
            // InternalSeleniumDsl.g:668:3: ( rule__Verify__Group__0 )
            {
             before(grammarAccess.getVerifyAccess().getGroup()); 
            // InternalSeleniumDsl.g:669:3: ( rule__Verify__Group__0 )
            // InternalSeleniumDsl.g:669:4: rule__Verify__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Verify__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVerifyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVerify"


    // $ANTLR start "entryRuleOrdinalInteger"
    // InternalSeleniumDsl.g:678:1: entryRuleOrdinalInteger : ruleOrdinalInteger EOF ;
    public final void entryRuleOrdinalInteger() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:679:1: ( ruleOrdinalInteger EOF )
            // InternalSeleniumDsl.g:680:1: ruleOrdinalInteger EOF
            {
             before(grammarAccess.getOrdinalIntegerRule()); 
            pushFollow(FOLLOW_1);
            ruleOrdinalInteger();

            state._fsp--;

             after(grammarAccess.getOrdinalIntegerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrdinalInteger"


    // $ANTLR start "ruleOrdinalInteger"
    // InternalSeleniumDsl.g:687:1: ruleOrdinalInteger : ( ( rule__OrdinalInteger__Group__0 ) ) ;
    public final void ruleOrdinalInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:691:2: ( ( ( rule__OrdinalInteger__Group__0 ) ) )
            // InternalSeleniumDsl.g:692:2: ( ( rule__OrdinalInteger__Group__0 ) )
            {
            // InternalSeleniumDsl.g:692:2: ( ( rule__OrdinalInteger__Group__0 ) )
            // InternalSeleniumDsl.g:693:3: ( rule__OrdinalInteger__Group__0 )
            {
             before(grammarAccess.getOrdinalIntegerAccess().getGroup()); 
            // InternalSeleniumDsl.g:694:3: ( rule__OrdinalInteger__Group__0 )
            // InternalSeleniumDsl.g:694:4: rule__OrdinalInteger__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrdinalInteger__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrdinalIntegerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrdinalInteger"


    // $ANTLR start "rule__Command__Alternatives"
    // InternalSeleniumDsl.g:702:1: rule__Command__Alternatives : ( ( ruleOpenBrowser ) | ( ruleGoTo ) | ( ruleDOMCommand ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:706:1: ( ( ruleOpenBrowser ) | ( ruleGoTo ) | ( ruleDOMCommand ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt2=1;
                }
                break;
            case 27:
                {
                alt2=2;
                }
                break;
            case 13:
            case 29:
            case 31:
            case 36:
            case 40:
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
                    // InternalSeleniumDsl.g:707:2: ( ruleOpenBrowser )
                    {
                    // InternalSeleniumDsl.g:707:2: ( ruleOpenBrowser )
                    // InternalSeleniumDsl.g:708:3: ruleOpenBrowser
                    {
                     before(grammarAccess.getCommandAccess().getOpenBrowserParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOpenBrowser();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getOpenBrowserParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDsl.g:713:2: ( ruleGoTo )
                    {
                    // InternalSeleniumDsl.g:713:2: ( ruleGoTo )
                    // InternalSeleniumDsl.g:714:3: ruleGoTo
                    {
                     before(grammarAccess.getCommandAccess().getGoToParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGoTo();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getGoToParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSeleniumDsl.g:719:2: ( ruleDOMCommand )
                    {
                    // InternalSeleniumDsl.g:719:2: ( ruleDOMCommand )
                    // InternalSeleniumDsl.g:720:3: ruleDOMCommand
                    {
                     before(grammarAccess.getCommandAccess().getDOMCommandParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDOMCommand();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getDOMCommandParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Alternatives"


    // $ANTLR start "rule__DOMCommand__Alternatives"
    // InternalSeleniumDsl.g:729:1: rule__DOMCommand__Alternatives : ( ( ruleClick ) | ( ruleInsert ) | ( ruleCopy ) | ( rulePaste ) | ( ruleVerify ) );
    public final void rule__DOMCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:733:1: ( ( ruleClick ) | ( ruleInsert ) | ( ruleCopy ) | ( rulePaste ) | ( ruleVerify ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 13:
            case 29:
                {
                alt3=1;
                }
                break;
            case 40:
                {
                alt3=2;
                }
                break;
            case 31:
                {
                alt3=3;
                }
                break;
            case 36:
                {
                alt3=4;
                }
                break;
            case 53:
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
                    // InternalSeleniumDsl.g:734:2: ( ruleClick )
                    {
                    // InternalSeleniumDsl.g:734:2: ( ruleClick )
                    // InternalSeleniumDsl.g:735:3: ruleClick
                    {
                     before(grammarAccess.getDOMCommandAccess().getClickParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleClick();

                    state._fsp--;

                     after(grammarAccess.getDOMCommandAccess().getClickParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDsl.g:740:2: ( ruleInsert )
                    {
                    // InternalSeleniumDsl.g:740:2: ( ruleInsert )
                    // InternalSeleniumDsl.g:741:3: ruleInsert
                    {
                     before(grammarAccess.getDOMCommandAccess().getInsertParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInsert();

                    state._fsp--;

                     after(grammarAccess.getDOMCommandAccess().getInsertParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSeleniumDsl.g:746:2: ( ruleCopy )
                    {
                    // InternalSeleniumDsl.g:746:2: ( ruleCopy )
                    // InternalSeleniumDsl.g:747:3: ruleCopy
                    {
                     before(grammarAccess.getDOMCommandAccess().getCopyParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCopy();

                    state._fsp--;

                     after(grammarAccess.getDOMCommandAccess().getCopyParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSeleniumDsl.g:752:2: ( rulePaste )
                    {
                    // InternalSeleniumDsl.g:752:2: ( rulePaste )
                    // InternalSeleniumDsl.g:753:3: rulePaste
                    {
                     before(grammarAccess.getDOMCommandAccess().getPasteParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    rulePaste();

                    state._fsp--;

                     after(grammarAccess.getDOMCommandAccess().getPasteParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSeleniumDsl.g:758:2: ( ruleVerify )
                    {
                    // InternalSeleniumDsl.g:758:2: ( ruleVerify )
                    // InternalSeleniumDsl.g:759:3: ruleVerify
                    {
                     before(grammarAccess.getDOMCommandAccess().getVerifyParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleVerify();

                    state._fsp--;

                     after(grammarAccess.getDOMCommandAccess().getVerifyParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOMCommand__Alternatives"


    // $ANTLR start "rule__Click__Alternatives_1"
    // InternalSeleniumDsl.g:768:1: rule__Click__Alternatives_1 : ( ( ( rule__Click__Group_1_0__0 ) ) | ( 'select' ) );
    public final void rule__Click__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:772:1: ( ( ( rule__Click__Group_1_0__0 ) ) | ( 'select' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==29) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSeleniumDsl.g:773:2: ( ( rule__Click__Group_1_0__0 ) )
                    {
                    // InternalSeleniumDsl.g:773:2: ( ( rule__Click__Group_1_0__0 ) )
                    // InternalSeleniumDsl.g:774:3: ( rule__Click__Group_1_0__0 )
                    {
                     before(grammarAccess.getClickAccess().getGroup_1_0()); 
                    // InternalSeleniumDsl.g:775:3: ( rule__Click__Group_1_0__0 )
                    // InternalSeleniumDsl.g:775:4: rule__Click__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Click__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClickAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDsl.g:779:2: ( 'select' )
                    {
                    // InternalSeleniumDsl.g:779:2: ( 'select' )
                    // InternalSeleniumDsl.g:780:3: 'select'
                    {
                     before(grammarAccess.getClickAccess().getSelectKeyword_1_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getClickAccess().getSelectKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Alternatives_1"


    // $ANTLR start "rule__Content__Alternatives"
    // InternalSeleniumDsl.g:789:1: rule__Content__Alternatives : ( ( ruleClipboardContent ) | ( ruleStringContent ) );
    public final void rule__Content__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:793:1: ( ( ruleClipboardContent ) | ( ruleStringContent ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==32) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_STRING) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSeleniumDsl.g:794:2: ( ruleClipboardContent )
                    {
                    // InternalSeleniumDsl.g:794:2: ( ruleClipboardContent )
                    // InternalSeleniumDsl.g:795:3: ruleClipboardContent
                    {
                     before(grammarAccess.getContentAccess().getClipboardContentParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleClipboardContent();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getClipboardContentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDsl.g:800:2: ( ruleStringContent )
                    {
                    // InternalSeleniumDsl.g:800:2: ( ruleStringContent )
                    // InternalSeleniumDsl.g:801:3: ruleStringContent
                    {
                     before(grammarAccess.getContentAccess().getStringContentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStringContent();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getStringContentParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Alternatives"


    // $ANTLR start "rule__ElementProperty__PropertyAlternatives_1_0"
    // InternalSeleniumDsl.g:810:1: rule__ElementProperty__PropertyAlternatives_1_0 : ( ( 'selected' ) | ( 'visible' ) | ( 'enabled' ) );
    public final void rule__ElementProperty__PropertyAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:814:1: ( ( 'selected' ) | ( 'visible' ) | ( 'enabled' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt6=1;
                }
                break;
            case 15:
                {
                alt6=2;
                }
                break;
            case 16:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSeleniumDsl.g:815:2: ( 'selected' )
                    {
                    // InternalSeleniumDsl.g:815:2: ( 'selected' )
                    // InternalSeleniumDsl.g:816:3: 'selected'
                    {
                     before(grammarAccess.getElementPropertyAccess().getPropertySelectedKeyword_1_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getElementPropertyAccess().getPropertySelectedKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDsl.g:821:2: ( 'visible' )
                    {
                    // InternalSeleniumDsl.g:821:2: ( 'visible' )
                    // InternalSeleniumDsl.g:822:3: 'visible'
                    {
                     before(grammarAccess.getElementPropertyAccess().getPropertyVisibleKeyword_1_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getElementPropertyAccess().getPropertyVisibleKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSeleniumDsl.g:827:2: ( 'enabled' )
                    {
                    // InternalSeleniumDsl.g:827:2: ( 'enabled' )
                    // InternalSeleniumDsl.g:828:3: 'enabled'
                    {
                     before(grammarAccess.getElementPropertyAccess().getPropertyEnabledKeyword_1_0_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getElementPropertyAccess().getPropertyEnabledKeyword_1_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementProperty__PropertyAlternatives_1_0"


    // $ANTLR start "rule__SelectorPredicate__Alternatives"
    // InternalSeleniumDsl.g:837:1: rule__SelectorPredicate__Alternatives : ( ( ruleAllPredicate ) | ( ruleOrdinalPredicate ) | ( ruleLastPredicate ) | ( ruleDefaultFirstPredicate ) );
    public final void rule__SelectorPredicate__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:841:1: ( ( ruleAllPredicate ) | ( ruleOrdinalPredicate ) | ( ruleLastPredicate ) | ( ruleDefaultFirstPredicate ) )
            int alt7=4;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==49) ) {
                alt7=1;
            }
            else if ( (LA7_0==32) ) {
                switch ( input.LA(2) ) {
                case EOF:
                case RULE_STRING:
                    {
                    alt7=4;
                    }
                    break;
                case RULE_INT:
                    {
                    alt7=2;
                    }
                    break;
                case 52:
                    {
                    alt7=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSeleniumDsl.g:842:2: ( ruleAllPredicate )
                    {
                    // InternalSeleniumDsl.g:842:2: ( ruleAllPredicate )
                    // InternalSeleniumDsl.g:843:3: ruleAllPredicate
                    {
                     before(grammarAccess.getSelectorPredicateAccess().getAllPredicateParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAllPredicate();

                    state._fsp--;

                     after(grammarAccess.getSelectorPredicateAccess().getAllPredicateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDsl.g:848:2: ( ruleOrdinalPredicate )
                    {
                    // InternalSeleniumDsl.g:848:2: ( ruleOrdinalPredicate )
                    // InternalSeleniumDsl.g:849:3: ruleOrdinalPredicate
                    {
                     before(grammarAccess.getSelectorPredicateAccess().getOrdinalPredicateParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOrdinalPredicate();

                    state._fsp--;

                     after(grammarAccess.getSelectorPredicateAccess().getOrdinalPredicateParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSeleniumDsl.g:854:2: ( ruleLastPredicate )
                    {
                    // InternalSeleniumDsl.g:854:2: ( ruleLastPredicate )
                    // InternalSeleniumDsl.g:855:3: ruleLastPredicate
                    {
                     before(grammarAccess.getSelectorPredicateAccess().getLastPredicateParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLastPredicate();

                    state._fsp--;

                     after(grammarAccess.getSelectorPredicateAccess().getLastPredicateParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSeleniumDsl.g:860:2: ( ruleDefaultFirstPredicate )
                    {
                    // InternalSeleniumDsl.g:860:2: ( ruleDefaultFirstPredicate )
                    // InternalSeleniumDsl.g:861:3: ruleDefaultFirstPredicate
                    {
                     before(grammarAccess.getSelectorPredicateAccess().getDefaultFirstPredicateParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDefaultFirstPredicate();

                    state._fsp--;

                     after(grammarAccess.getSelectorPredicateAccess().getDefaultFirstPredicateParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorPredicate__Alternatives"


    // $ANTLR start "rule__Matcher__Alternatives"
    // InternalSeleniumDsl.g:870:1: rule__Matcher__Alternatives : ( ( 'containing' ) | ( 'matching' ) );
    public final void rule__Matcher__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:874:1: ( ( 'containing' ) | ( 'matching' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            else if ( (LA8_0==18) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSeleniumDsl.g:875:2: ( 'containing' )
                    {
                    // InternalSeleniumDsl.g:875:2: ( 'containing' )
                    // InternalSeleniumDsl.g:876:3: 'containing'
                    {
                     before(grammarAccess.getMatcherAccess().getContainingKeyword_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getMatcherAccess().getContainingKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDsl.g:881:2: ( 'matching' )
                    {
                    // InternalSeleniumDsl.g:881:2: ( 'matching' )
                    // InternalSeleniumDsl.g:882:3: 'matching'
                    {
                     before(grammarAccess.getMatcherAccess().getMatchingKeyword_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getMatcherAccess().getMatchingKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matcher__Alternatives"


    // $ANTLR start "rule__TestCase__Group__0"
    // InternalSeleniumDsl.g:891:1: rule__TestCase__Group__0 : rule__TestCase__Group__0__Impl rule__TestCase__Group__1 ;
    public final void rule__TestCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:895:1: ( rule__TestCase__Group__0__Impl rule__TestCase__Group__1 )
            // InternalSeleniumDsl.g:896:2: rule__TestCase__Group__0__Impl rule__TestCase__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TestCase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TestCase__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestCase__Group__0"


    // $ANTLR start "rule__TestCase__Group__0__Impl"
    // InternalSeleniumDsl.g:903:1: rule__TestCase__Group__0__Impl : ( 'Test' ) ;
    public final void rule__TestCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:907:1: ( ( 'Test' ) )
            // InternalSeleniumDsl.g:908:1: ( 'Test' )
            {
            // InternalSeleniumDsl.g:908:1: ( 'Test' )
            // InternalSeleniumDsl.g:909:2: 'Test'
            {
             before(grammarAccess.getTestCaseAccess().getTestKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTestCaseAccess().getTestKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestCase__Group__0__Impl"


    // $ANTLR start "rule__TestCase__Group__1"
    // InternalSeleniumDsl.g:918:1: rule__TestCase__Group__1 : rule__TestCase__Group__1__Impl rule__TestCase__Group__2 ;
    public final void rule__TestCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:922:1: ( rule__TestCase__Group__1__Impl rule__TestCase__Group__2 )
            // InternalSeleniumDsl.g:923:2: rule__TestCase__Group__1__Impl rule__TestCase__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__TestCase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TestCase__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestCase__Group__1"


    // $ANTLR start "rule__TestCase__Group__1__Impl"
    // InternalSeleniumDsl.g:930:1: rule__TestCase__Group__1__Impl : ( 'case' ) ;
    public final void rule__TestCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:934:1: ( ( 'case' ) )
            // InternalSeleniumDsl.g:935:1: ( 'case' )
            {
            // InternalSeleniumDsl.g:935:1: ( 'case' )
            // InternalSeleniumDsl.g:936:2: 'case'
            {
             before(grammarAccess.getTestCaseAccess().getCaseKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTestCaseAccess().getCaseKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestCase__Group__1__Impl"


    // $ANTLR start "rule__TestCase__Group__2"
    // InternalSeleniumDsl.g:945:1: rule__TestCase__Group__2 : rule__TestCase__Group__2__Impl rule__TestCase__Group__3 ;
    public final void rule__TestCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:949:1: ( rule__TestCase__Group__2__Impl rule__TestCase__Group__3 )
            // InternalSeleniumDsl.g:950:2: rule__TestCase__Group__2__Impl rule__TestCase__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__TestCase__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TestCase__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestCase__Group__2"


    // $ANTLR start "rule__TestCase__Group__2__Impl"
    // InternalSeleniumDsl.g:957:1: rule__TestCase__Group__2__Impl : ( ':' ) ;
    public final void rule__TestCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:961:1: ( ( ':' ) )
            // InternalSeleniumDsl.g:962:1: ( ':' )
            {
            // InternalSeleniumDsl.g:962:1: ( ':' )
            // InternalSeleniumDsl.g:963:2: ':'
            {
             before(grammarAccess.getTestCaseAccess().getColonKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTestCaseAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestCase__Group__2__Impl"


    // $ANTLR start "rule__TestCase__Group__3"
    // InternalSeleniumDsl.g:972:1: rule__TestCase__Group__3 : rule__TestCase__Group__3__Impl rule__TestCase__Group__4 ;
    public final void rule__TestCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:976:1: ( rule__TestCase__Group__3__Impl rule__TestCase__Group__4 )
            // InternalSeleniumDsl.g:977:2: rule__TestCase__Group__3__Impl rule__TestCase__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__TestCase__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TestCase__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestCase__Group__3"


    // $ANTLR start "rule__TestCase__Group__3__Impl"
    // InternalSeleniumDsl.g:984:1: rule__TestCase__Group__3__Impl : ( ( rule__TestCase__NameAssignment_3 ) ) ;
    public final void rule__TestCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:988:1: ( ( ( rule__TestCase__NameAssignment_3 ) ) )
            // InternalSeleniumDsl.g:989:1: ( ( rule__TestCase__NameAssignment_3 ) )
            {
            // InternalSeleniumDsl.g:989:1: ( ( rule__TestCase__NameAssignment_3 ) )
            // InternalSeleniumDsl.g:990:2: ( rule__TestCase__NameAssignment_3 )
            {
             before(grammarAccess.getTestCaseAccess().getNameAssignment_3()); 
            // InternalSeleniumDsl.g:991:2: ( rule__TestCase__NameAssignment_3 )
            // InternalSeleniumDsl.g:991:3: rule__TestCase__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TestCase__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTestCaseAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestCase__Group__3__Impl"


    // $ANTLR start "rule__TestCase__Group__4"
    // InternalSeleniumDsl.g:999:1: rule__TestCase__Group__4 : rule__TestCase__Group__4__Impl rule__TestCase__Group__5 ;
    public final void rule__TestCase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1003:1: ( rule__TestCase__Group__4__Impl rule__TestCase__Group__5 )
            // InternalSeleniumDsl.g:1004:2: rule__TestCase__Group__4__Impl rule__TestCase__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__TestCase__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TestCase__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestCase__Group__4"


    // $ANTLR start "rule__TestCase__Group__4__Impl"
    // InternalSeleniumDsl.g:1011:1: rule__TestCase__Group__4__Impl : ( '***' ) ;
    public final void rule__TestCase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1015:1: ( ( '***' ) )
            // InternalSeleniumDsl.g:1016:1: ( '***' )
            {
            // InternalSeleniumDsl.g:1016:1: ( '***' )
            // InternalSeleniumDsl.g:1017:2: '***'
            {
             before(grammarAccess.getTestCaseAccess().getAsteriskAsteriskAsteriskKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTestCaseAccess().getAsteriskAsteriskAsteriskKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestCase__Group__4__Impl"


    // $ANTLR start "rule__TestCase__Group__5"
    // InternalSeleniumDsl.g:1026:1: rule__TestCase__Group__5 : rule__TestCase__Group__5__Impl rule__TestCase__Group__6 ;
    public final void rule__TestCase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1030:1: ( rule__TestCase__Group__5__Impl rule__TestCase__Group__6 )
            // InternalSeleniumDsl.g:1031:2: rule__TestCase__Group__5__Impl rule__TestCase__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__TestCase__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TestCase__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestCase__Group__5"


    // $ANTLR start "rule__TestCase__Group__5__Impl"
    // InternalSeleniumDsl.g:1038:1: rule__TestCase__Group__5__Impl : ( ( rule__TestCase__CommandsAssignment_5 )* ) ;
    public final void rule__TestCase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1042:1: ( ( ( rule__TestCase__CommandsAssignment_5 )* ) )
            // InternalSeleniumDsl.g:1043:1: ( ( rule__TestCase__CommandsAssignment_5 )* )
            {
            // InternalSeleniumDsl.g:1043:1: ( ( rule__TestCase__CommandsAssignment_5 )* )
            // InternalSeleniumDsl.g:1044:2: ( rule__TestCase__CommandsAssignment_5 )*
            {
             before(grammarAccess.getTestCaseAccess().getCommandsAssignment_5()); 
            // InternalSeleniumDsl.g:1045:2: ( rule__TestCase__CommandsAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==13||LA9_0==23||LA9_0==27||LA9_0==29||LA9_0==31||LA9_0==36||LA9_0==40||LA9_0==53) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSeleniumDsl.g:1045:3: rule__TestCase__CommandsAssignment_5
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__TestCase__CommandsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getTestCaseAccess().getCommandsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestCase__Group__5__Impl"


    // $ANTLR start "rule__TestCase__Group__6"
    // InternalSeleniumDsl.g:1053:1: rule__TestCase__Group__6 : rule__TestCase__Group__6__Impl ;
    public final void rule__TestCase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1057:1: ( rule__TestCase__Group__6__Impl )
            // InternalSeleniumDsl.g:1058:2: rule__TestCase__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TestCase__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestCase__Group__6"


    // $ANTLR start "rule__TestCase__Group__6__Impl"
    // InternalSeleniumDsl.g:1064:1: rule__TestCase__Group__6__Impl : ( '***' ) ;
    public final void rule__TestCase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1068:1: ( ( '***' ) )
            // InternalSeleniumDsl.g:1069:1: ( '***' )
            {
            // InternalSeleniumDsl.g:1069:1: ( '***' )
            // InternalSeleniumDsl.g:1070:2: '***'
            {
             before(grammarAccess.getTestCaseAccess().getAsteriskAsteriskAsteriskKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTestCaseAccess().getAsteriskAsteriskAsteriskKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestCase__Group__6__Impl"


    // $ANTLR start "rule__OpenBrowser__Group__0"
    // InternalSeleniumDsl.g:1080:1: rule__OpenBrowser__Group__0 : rule__OpenBrowser__Group__0__Impl rule__OpenBrowser__Group__1 ;
    public final void rule__OpenBrowser__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1084:1: ( rule__OpenBrowser__Group__0__Impl rule__OpenBrowser__Group__1 )
            // InternalSeleniumDsl.g:1085:2: rule__OpenBrowser__Group__0__Impl rule__OpenBrowser__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__OpenBrowser__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpenBrowser__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenBrowser__Group__0"


    // $ANTLR start "rule__OpenBrowser__Group__0__Impl"
    // InternalSeleniumDsl.g:1092:1: rule__OpenBrowser__Group__0__Impl : ( () ) ;
    public final void rule__OpenBrowser__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1096:1: ( ( () ) )
            // InternalSeleniumDsl.g:1097:1: ( () )
            {
            // InternalSeleniumDsl.g:1097:1: ( () )
            // InternalSeleniumDsl.g:1098:2: ()
            {
             before(grammarAccess.getOpenBrowserAccess().getOpenBrowserAction_0()); 
            // InternalSeleniumDsl.g:1099:2: ()
            // InternalSeleniumDsl.g:1099:3: 
            {
            }

             after(grammarAccess.getOpenBrowserAccess().getOpenBrowserAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenBrowser__Group__0__Impl"


    // $ANTLR start "rule__OpenBrowser__Group__1"
    // InternalSeleniumDsl.g:1107:1: rule__OpenBrowser__Group__1 : rule__OpenBrowser__Group__1__Impl rule__OpenBrowser__Group__2 ;
    public final void rule__OpenBrowser__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1111:1: ( rule__OpenBrowser__Group__1__Impl rule__OpenBrowser__Group__2 )
            // InternalSeleniumDsl.g:1112:2: rule__OpenBrowser__Group__1__Impl rule__OpenBrowser__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__OpenBrowser__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpenBrowser__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenBrowser__Group__1"


    // $ANTLR start "rule__OpenBrowser__Group__1__Impl"
    // InternalSeleniumDsl.g:1119:1: rule__OpenBrowser__Group__1__Impl : ( 'open' ) ;
    public final void rule__OpenBrowser__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1123:1: ( ( 'open' ) )
            // InternalSeleniumDsl.g:1124:1: ( 'open' )
            {
            // InternalSeleniumDsl.g:1124:1: ( 'open' )
            // InternalSeleniumDsl.g:1125:2: 'open'
            {
             before(grammarAccess.getOpenBrowserAccess().getOpenKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getOpenBrowserAccess().getOpenKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenBrowser__Group__1__Impl"


    // $ANTLR start "rule__OpenBrowser__Group__2"
    // InternalSeleniumDsl.g:1134:1: rule__OpenBrowser__Group__2 : rule__OpenBrowser__Group__2__Impl rule__OpenBrowser__Group__3 ;
    public final void rule__OpenBrowser__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1138:1: ( rule__OpenBrowser__Group__2__Impl rule__OpenBrowser__Group__3 )
            // InternalSeleniumDsl.g:1139:2: rule__OpenBrowser__Group__2__Impl rule__OpenBrowser__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__OpenBrowser__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpenBrowser__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenBrowser__Group__2"


    // $ANTLR start "rule__OpenBrowser__Group__2__Impl"
    // InternalSeleniumDsl.g:1146:1: rule__OpenBrowser__Group__2__Impl : ( 'a' ) ;
    public final void rule__OpenBrowser__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1150:1: ( ( 'a' ) )
            // InternalSeleniumDsl.g:1151:1: ( 'a' )
            {
            // InternalSeleniumDsl.g:1151:1: ( 'a' )
            // InternalSeleniumDsl.g:1152:2: 'a'
            {
             before(grammarAccess.getOpenBrowserAccess().getAKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getOpenBrowserAccess().getAKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenBrowser__Group__2__Impl"


    // $ANTLR start "rule__OpenBrowser__Group__3"
    // InternalSeleniumDsl.g:1161:1: rule__OpenBrowser__Group__3 : rule__OpenBrowser__Group__3__Impl rule__OpenBrowser__Group__4 ;
    public final void rule__OpenBrowser__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1165:1: ( rule__OpenBrowser__Group__3__Impl rule__OpenBrowser__Group__4 )
            // InternalSeleniumDsl.g:1166:2: rule__OpenBrowser__Group__3__Impl rule__OpenBrowser__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__OpenBrowser__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpenBrowser__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenBrowser__Group__3"


    // $ANTLR start "rule__OpenBrowser__Group__3__Impl"
    // InternalSeleniumDsl.g:1173:1: rule__OpenBrowser__Group__3__Impl : ( 'browser' ) ;
    public final void rule__OpenBrowser__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1177:1: ( ( 'browser' ) )
            // InternalSeleniumDsl.g:1178:1: ( 'browser' )
            {
            // InternalSeleniumDsl.g:1178:1: ( 'browser' )
            // InternalSeleniumDsl.g:1179:2: 'browser'
            {
             before(grammarAccess.getOpenBrowserAccess().getBrowserKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getOpenBrowserAccess().getBrowserKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenBrowser__Group__3__Impl"


    // $ANTLR start "rule__OpenBrowser__Group__4"
    // InternalSeleniumDsl.g:1188:1: rule__OpenBrowser__Group__4 : rule__OpenBrowser__Group__4__Impl ;
    public final void rule__OpenBrowser__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1192:1: ( rule__OpenBrowser__Group__4__Impl )
            // InternalSeleniumDsl.g:1193:2: rule__OpenBrowser__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpenBrowser__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenBrowser__Group__4"


    // $ANTLR start "rule__OpenBrowser__Group__4__Impl"
    // InternalSeleniumDsl.g:1199:1: rule__OpenBrowser__Group__4__Impl : ( 'window' ) ;
    public final void rule__OpenBrowser__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1203:1: ( ( 'window' ) )
            // InternalSeleniumDsl.g:1204:1: ( 'window' )
            {
            // InternalSeleniumDsl.g:1204:1: ( 'window' )
            // InternalSeleniumDsl.g:1205:2: 'window'
            {
             before(grammarAccess.getOpenBrowserAccess().getWindowKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getOpenBrowserAccess().getWindowKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenBrowser__Group__4__Impl"


    // $ANTLR start "rule__GoTo__Group__0"
    // InternalSeleniumDsl.g:1215:1: rule__GoTo__Group__0 : rule__GoTo__Group__0__Impl rule__GoTo__Group__1 ;
    public final void rule__GoTo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1219:1: ( rule__GoTo__Group__0__Impl rule__GoTo__Group__1 )
            // InternalSeleniumDsl.g:1220:2: rule__GoTo__Group__0__Impl rule__GoTo__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__GoTo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoTo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__0"


    // $ANTLR start "rule__GoTo__Group__0__Impl"
    // InternalSeleniumDsl.g:1227:1: rule__GoTo__Group__0__Impl : ( 'go' ) ;
    public final void rule__GoTo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1231:1: ( ( 'go' ) )
            // InternalSeleniumDsl.g:1232:1: ( 'go' )
            {
            // InternalSeleniumDsl.g:1232:1: ( 'go' )
            // InternalSeleniumDsl.g:1233:2: 'go'
            {
             before(grammarAccess.getGoToAccess().getGoKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getGoToAccess().getGoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__0__Impl"


    // $ANTLR start "rule__GoTo__Group__1"
    // InternalSeleniumDsl.g:1242:1: rule__GoTo__Group__1 : rule__GoTo__Group__1__Impl rule__GoTo__Group__2 ;
    public final void rule__GoTo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1246:1: ( rule__GoTo__Group__1__Impl rule__GoTo__Group__2 )
            // InternalSeleniumDsl.g:1247:2: rule__GoTo__Group__1__Impl rule__GoTo__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__GoTo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoTo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__1"


    // $ANTLR start "rule__GoTo__Group__1__Impl"
    // InternalSeleniumDsl.g:1254:1: rule__GoTo__Group__1__Impl : ( 'to' ) ;
    public final void rule__GoTo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1258:1: ( ( 'to' ) )
            // InternalSeleniumDsl.g:1259:1: ( 'to' )
            {
            // InternalSeleniumDsl.g:1259:1: ( 'to' )
            // InternalSeleniumDsl.g:1260:2: 'to'
            {
             before(grammarAccess.getGoToAccess().getToKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getGoToAccess().getToKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__1__Impl"


    // $ANTLR start "rule__GoTo__Group__2"
    // InternalSeleniumDsl.g:1269:1: rule__GoTo__Group__2 : rule__GoTo__Group__2__Impl ;
    public final void rule__GoTo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1273:1: ( rule__GoTo__Group__2__Impl )
            // InternalSeleniumDsl.g:1274:2: rule__GoTo__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GoTo__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__2"


    // $ANTLR start "rule__GoTo__Group__2__Impl"
    // InternalSeleniumDsl.g:1280:1: rule__GoTo__Group__2__Impl : ( ( rule__GoTo__UrlAssignment_2 ) ) ;
    public final void rule__GoTo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1284:1: ( ( ( rule__GoTo__UrlAssignment_2 ) ) )
            // InternalSeleniumDsl.g:1285:1: ( ( rule__GoTo__UrlAssignment_2 ) )
            {
            // InternalSeleniumDsl.g:1285:1: ( ( rule__GoTo__UrlAssignment_2 ) )
            // InternalSeleniumDsl.g:1286:2: ( rule__GoTo__UrlAssignment_2 )
            {
             before(grammarAccess.getGoToAccess().getUrlAssignment_2()); 
            // InternalSeleniumDsl.g:1287:2: ( rule__GoTo__UrlAssignment_2 )
            // InternalSeleniumDsl.g:1287:3: rule__GoTo__UrlAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GoTo__UrlAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGoToAccess().getUrlAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__2__Impl"


    // $ANTLR start "rule__Click__Group__0"
    // InternalSeleniumDsl.g:1296:1: rule__Click__Group__0 : rule__Click__Group__0__Impl rule__Click__Group__1 ;
    public final void rule__Click__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1300:1: ( rule__Click__Group__0__Impl rule__Click__Group__1 )
            // InternalSeleniumDsl.g:1301:2: rule__Click__Group__0__Impl rule__Click__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Click__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Click__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__0"


    // $ANTLR start "rule__Click__Group__0__Impl"
    // InternalSeleniumDsl.g:1308:1: rule__Click__Group__0__Impl : ( () ) ;
    public final void rule__Click__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1312:1: ( ( () ) )
            // InternalSeleniumDsl.g:1313:1: ( () )
            {
            // InternalSeleniumDsl.g:1313:1: ( () )
            // InternalSeleniumDsl.g:1314:2: ()
            {
             before(grammarAccess.getClickAccess().getClickAction_0()); 
            // InternalSeleniumDsl.g:1315:2: ()
            // InternalSeleniumDsl.g:1315:3: 
            {
            }

             after(grammarAccess.getClickAccess().getClickAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__0__Impl"


    // $ANTLR start "rule__Click__Group__1"
    // InternalSeleniumDsl.g:1323:1: rule__Click__Group__1 : rule__Click__Group__1__Impl rule__Click__Group__2 ;
    public final void rule__Click__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1327:1: ( rule__Click__Group__1__Impl rule__Click__Group__2 )
            // InternalSeleniumDsl.g:1328:2: rule__Click__Group__1__Impl rule__Click__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Click__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Click__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__1"


    // $ANTLR start "rule__Click__Group__1__Impl"
    // InternalSeleniumDsl.g:1335:1: rule__Click__Group__1__Impl : ( ( rule__Click__Alternatives_1 ) ) ;
    public final void rule__Click__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1339:1: ( ( ( rule__Click__Alternatives_1 ) ) )
            // InternalSeleniumDsl.g:1340:1: ( ( rule__Click__Alternatives_1 ) )
            {
            // InternalSeleniumDsl.g:1340:1: ( ( rule__Click__Alternatives_1 ) )
            // InternalSeleniumDsl.g:1341:2: ( rule__Click__Alternatives_1 )
            {
             before(grammarAccess.getClickAccess().getAlternatives_1()); 
            // InternalSeleniumDsl.g:1342:2: ( rule__Click__Alternatives_1 )
            // InternalSeleniumDsl.g:1342:3: rule__Click__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Click__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getClickAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__1__Impl"


    // $ANTLR start "rule__Click__Group__2"
    // InternalSeleniumDsl.g:1350:1: rule__Click__Group__2 : rule__Click__Group__2__Impl ;
    public final void rule__Click__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1354:1: ( rule__Click__Group__2__Impl )
            // InternalSeleniumDsl.g:1355:2: rule__Click__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Click__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__2"


    // $ANTLR start "rule__Click__Group__2__Impl"
    // InternalSeleniumDsl.g:1361:1: rule__Click__Group__2__Impl : ( ( rule__Click__ElementAssignment_2 ) ) ;
    public final void rule__Click__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1365:1: ( ( ( rule__Click__ElementAssignment_2 ) ) )
            // InternalSeleniumDsl.g:1366:1: ( ( rule__Click__ElementAssignment_2 ) )
            {
            // InternalSeleniumDsl.g:1366:1: ( ( rule__Click__ElementAssignment_2 ) )
            // InternalSeleniumDsl.g:1367:2: ( rule__Click__ElementAssignment_2 )
            {
             before(grammarAccess.getClickAccess().getElementAssignment_2()); 
            // InternalSeleniumDsl.g:1368:2: ( rule__Click__ElementAssignment_2 )
            // InternalSeleniumDsl.g:1368:3: rule__Click__ElementAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Click__ElementAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClickAccess().getElementAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__2__Impl"


    // $ANTLR start "rule__Click__Group_1_0__0"
    // InternalSeleniumDsl.g:1377:1: rule__Click__Group_1_0__0 : rule__Click__Group_1_0__0__Impl rule__Click__Group_1_0__1 ;
    public final void rule__Click__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1381:1: ( rule__Click__Group_1_0__0__Impl rule__Click__Group_1_0__1 )
            // InternalSeleniumDsl.g:1382:2: rule__Click__Group_1_0__0__Impl rule__Click__Group_1_0__1
            {
            pushFollow(FOLLOW_17);
            rule__Click__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Click__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group_1_0__0"


    // $ANTLR start "rule__Click__Group_1_0__0__Impl"
    // InternalSeleniumDsl.g:1389:1: rule__Click__Group_1_0__0__Impl : ( 'click' ) ;
    public final void rule__Click__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1393:1: ( ( 'click' ) )
            // InternalSeleniumDsl.g:1394:1: ( 'click' )
            {
            // InternalSeleniumDsl.g:1394:1: ( 'click' )
            // InternalSeleniumDsl.g:1395:2: 'click'
            {
             before(grammarAccess.getClickAccess().getClickKeyword_1_0_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getClickAccess().getClickKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group_1_0__0__Impl"


    // $ANTLR start "rule__Click__Group_1_0__1"
    // InternalSeleniumDsl.g:1404:1: rule__Click__Group_1_0__1 : rule__Click__Group_1_0__1__Impl ;
    public final void rule__Click__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1408:1: ( rule__Click__Group_1_0__1__Impl )
            // InternalSeleniumDsl.g:1409:2: rule__Click__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Click__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group_1_0__1"


    // $ANTLR start "rule__Click__Group_1_0__1__Impl"
    // InternalSeleniumDsl.g:1415:1: rule__Click__Group_1_0__1__Impl : ( 'on' ) ;
    public final void rule__Click__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1419:1: ( ( 'on' ) )
            // InternalSeleniumDsl.g:1420:1: ( 'on' )
            {
            // InternalSeleniumDsl.g:1420:1: ( 'on' )
            // InternalSeleniumDsl.g:1421:2: 'on'
            {
             before(grammarAccess.getClickAccess().getOnKeyword_1_0_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getClickAccess().getOnKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group_1_0__1__Impl"


    // $ANTLR start "rule__Copy__Group__0"
    // InternalSeleniumDsl.g:1431:1: rule__Copy__Group__0 : rule__Copy__Group__0__Impl rule__Copy__Group__1 ;
    public final void rule__Copy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1435:1: ( rule__Copy__Group__0__Impl rule__Copy__Group__1 )
            // InternalSeleniumDsl.g:1436:2: rule__Copy__Group__0__Impl rule__Copy__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Copy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Copy__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__0"


    // $ANTLR start "rule__Copy__Group__0__Impl"
    // InternalSeleniumDsl.g:1443:1: rule__Copy__Group__0__Impl : ( () ) ;
    public final void rule__Copy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1447:1: ( ( () ) )
            // InternalSeleniumDsl.g:1448:1: ( () )
            {
            // InternalSeleniumDsl.g:1448:1: ( () )
            // InternalSeleniumDsl.g:1449:2: ()
            {
             before(grammarAccess.getCopyAccess().getCopyAction_0()); 
            // InternalSeleniumDsl.g:1450:2: ()
            // InternalSeleniumDsl.g:1450:3: 
            {
            }

             after(grammarAccess.getCopyAccess().getCopyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__0__Impl"


    // $ANTLR start "rule__Copy__Group__1"
    // InternalSeleniumDsl.g:1458:1: rule__Copy__Group__1 : rule__Copy__Group__1__Impl rule__Copy__Group__2 ;
    public final void rule__Copy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1462:1: ( rule__Copy__Group__1__Impl rule__Copy__Group__2 )
            // InternalSeleniumDsl.g:1463:2: rule__Copy__Group__1__Impl rule__Copy__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Copy__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Copy__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__1"


    // $ANTLR start "rule__Copy__Group__1__Impl"
    // InternalSeleniumDsl.g:1470:1: rule__Copy__Group__1__Impl : ( 'copy' ) ;
    public final void rule__Copy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1474:1: ( ( 'copy' ) )
            // InternalSeleniumDsl.g:1475:1: ( 'copy' )
            {
            // InternalSeleniumDsl.g:1475:1: ( 'copy' )
            // InternalSeleniumDsl.g:1476:2: 'copy'
            {
             before(grammarAccess.getCopyAccess().getCopyKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCopyAccess().getCopyKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__1__Impl"


    // $ANTLR start "rule__Copy__Group__2"
    // InternalSeleniumDsl.g:1485:1: rule__Copy__Group__2 : rule__Copy__Group__2__Impl rule__Copy__Group__3 ;
    public final void rule__Copy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1489:1: ( rule__Copy__Group__2__Impl rule__Copy__Group__3 )
            // InternalSeleniumDsl.g:1490:2: rule__Copy__Group__2__Impl rule__Copy__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Copy__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Copy__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__2"


    // $ANTLR start "rule__Copy__Group__2__Impl"
    // InternalSeleniumDsl.g:1497:1: rule__Copy__Group__2__Impl : ( 'the' ) ;
    public final void rule__Copy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1501:1: ( ( 'the' ) )
            // InternalSeleniumDsl.g:1502:1: ( 'the' )
            {
            // InternalSeleniumDsl.g:1502:1: ( 'the' )
            // InternalSeleniumDsl.g:1503:2: 'the'
            {
             before(grammarAccess.getCopyAccess().getTheKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCopyAccess().getTheKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__2__Impl"


    // $ANTLR start "rule__Copy__Group__3"
    // InternalSeleniumDsl.g:1512:1: rule__Copy__Group__3 : rule__Copy__Group__3__Impl rule__Copy__Group__4 ;
    public final void rule__Copy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1516:1: ( rule__Copy__Group__3__Impl rule__Copy__Group__4 )
            // InternalSeleniumDsl.g:1517:2: rule__Copy__Group__3__Impl rule__Copy__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Copy__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Copy__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__3"


    // $ANTLR start "rule__Copy__Group__3__Impl"
    // InternalSeleniumDsl.g:1524:1: rule__Copy__Group__3__Impl : ( 'property' ) ;
    public final void rule__Copy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1528:1: ( ( 'property' ) )
            // InternalSeleniumDsl.g:1529:1: ( 'property' )
            {
            // InternalSeleniumDsl.g:1529:1: ( 'property' )
            // InternalSeleniumDsl.g:1530:2: 'property'
            {
             before(grammarAccess.getCopyAccess().getPropertyKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCopyAccess().getPropertyKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__3__Impl"


    // $ANTLR start "rule__Copy__Group__4"
    // InternalSeleniumDsl.g:1539:1: rule__Copy__Group__4 : rule__Copy__Group__4__Impl rule__Copy__Group__5 ;
    public final void rule__Copy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1543:1: ( rule__Copy__Group__4__Impl rule__Copy__Group__5 )
            // InternalSeleniumDsl.g:1544:2: rule__Copy__Group__4__Impl rule__Copy__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Copy__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Copy__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__4"


    // $ANTLR start "rule__Copy__Group__4__Impl"
    // InternalSeleniumDsl.g:1551:1: rule__Copy__Group__4__Impl : ( ( rule__Copy__PropertyAssignment_4 ) ) ;
    public final void rule__Copy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1555:1: ( ( ( rule__Copy__PropertyAssignment_4 ) ) )
            // InternalSeleniumDsl.g:1556:1: ( ( rule__Copy__PropertyAssignment_4 ) )
            {
            // InternalSeleniumDsl.g:1556:1: ( ( rule__Copy__PropertyAssignment_4 ) )
            // InternalSeleniumDsl.g:1557:2: ( rule__Copy__PropertyAssignment_4 )
            {
             before(grammarAccess.getCopyAccess().getPropertyAssignment_4()); 
            // InternalSeleniumDsl.g:1558:2: ( rule__Copy__PropertyAssignment_4 )
            // InternalSeleniumDsl.g:1558:3: rule__Copy__PropertyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Copy__PropertyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCopyAccess().getPropertyAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__4__Impl"


    // $ANTLR start "rule__Copy__Group__5"
    // InternalSeleniumDsl.g:1566:1: rule__Copy__Group__5 : rule__Copy__Group__5__Impl rule__Copy__Group__6 ;
    public final void rule__Copy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1570:1: ( rule__Copy__Group__5__Impl rule__Copy__Group__6 )
            // InternalSeleniumDsl.g:1571:2: rule__Copy__Group__5__Impl rule__Copy__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Copy__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Copy__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__5"


    // $ANTLR start "rule__Copy__Group__5__Impl"
    // InternalSeleniumDsl.g:1578:1: rule__Copy__Group__5__Impl : ( 'of' ) ;
    public final void rule__Copy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1582:1: ( ( 'of' ) )
            // InternalSeleniumDsl.g:1583:1: ( 'of' )
            {
            // InternalSeleniumDsl.g:1583:1: ( 'of' )
            // InternalSeleniumDsl.g:1584:2: 'of'
            {
             before(grammarAccess.getCopyAccess().getOfKeyword_5()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCopyAccess().getOfKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__5__Impl"


    // $ANTLR start "rule__Copy__Group__6"
    // InternalSeleniumDsl.g:1593:1: rule__Copy__Group__6 : rule__Copy__Group__6__Impl rule__Copy__Group__7 ;
    public final void rule__Copy__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1597:1: ( rule__Copy__Group__6__Impl rule__Copy__Group__7 )
            // InternalSeleniumDsl.g:1598:2: rule__Copy__Group__6__Impl rule__Copy__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__Copy__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Copy__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__6"


    // $ANTLR start "rule__Copy__Group__6__Impl"
    // InternalSeleniumDsl.g:1605:1: rule__Copy__Group__6__Impl : ( ( rule__Copy__ElementAssignment_6 ) ) ;
    public final void rule__Copy__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1609:1: ( ( ( rule__Copy__ElementAssignment_6 ) ) )
            // InternalSeleniumDsl.g:1610:1: ( ( rule__Copy__ElementAssignment_6 ) )
            {
            // InternalSeleniumDsl.g:1610:1: ( ( rule__Copy__ElementAssignment_6 ) )
            // InternalSeleniumDsl.g:1611:2: ( rule__Copy__ElementAssignment_6 )
            {
             before(grammarAccess.getCopyAccess().getElementAssignment_6()); 
            // InternalSeleniumDsl.g:1612:2: ( rule__Copy__ElementAssignment_6 )
            // InternalSeleniumDsl.g:1612:3: rule__Copy__ElementAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Copy__ElementAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCopyAccess().getElementAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__6__Impl"


    // $ANTLR start "rule__Copy__Group__7"
    // InternalSeleniumDsl.g:1620:1: rule__Copy__Group__7 : rule__Copy__Group__7__Impl rule__Copy__Group__8 ;
    public final void rule__Copy__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1624:1: ( rule__Copy__Group__7__Impl rule__Copy__Group__8 )
            // InternalSeleniumDsl.g:1625:2: rule__Copy__Group__7__Impl rule__Copy__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__Copy__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Copy__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__7"


    // $ANTLR start "rule__Copy__Group__7__Impl"
    // InternalSeleniumDsl.g:1632:1: rule__Copy__Group__7__Impl : ( 'as' ) ;
    public final void rule__Copy__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1636:1: ( ( 'as' ) )
            // InternalSeleniumDsl.g:1637:1: ( 'as' )
            {
            // InternalSeleniumDsl.g:1637:1: ( 'as' )
            // InternalSeleniumDsl.g:1638:2: 'as'
            {
             before(grammarAccess.getCopyAccess().getAsKeyword_7()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCopyAccess().getAsKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__7__Impl"


    // $ANTLR start "rule__Copy__Group__8"
    // InternalSeleniumDsl.g:1647:1: rule__Copy__Group__8 : rule__Copy__Group__8__Impl ;
    public final void rule__Copy__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1651:1: ( rule__Copy__Group__8__Impl )
            // InternalSeleniumDsl.g:1652:2: rule__Copy__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Copy__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__8"


    // $ANTLR start "rule__Copy__Group__8__Impl"
    // InternalSeleniumDsl.g:1658:1: rule__Copy__Group__8__Impl : ( ( rule__Copy__KeyAssignment_8 ) ) ;
    public final void rule__Copy__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1662:1: ( ( ( rule__Copy__KeyAssignment_8 ) ) )
            // InternalSeleniumDsl.g:1663:1: ( ( rule__Copy__KeyAssignment_8 ) )
            {
            // InternalSeleniumDsl.g:1663:1: ( ( rule__Copy__KeyAssignment_8 ) )
            // InternalSeleniumDsl.g:1664:2: ( rule__Copy__KeyAssignment_8 )
            {
             before(grammarAccess.getCopyAccess().getKeyAssignment_8()); 
            // InternalSeleniumDsl.g:1665:2: ( rule__Copy__KeyAssignment_8 )
            // InternalSeleniumDsl.g:1665:3: rule__Copy__KeyAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Copy__KeyAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getCopyAccess().getKeyAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__8__Impl"


    // $ANTLR start "rule__Paste__Group__0"
    // InternalSeleniumDsl.g:1674:1: rule__Paste__Group__0 : rule__Paste__Group__0__Impl rule__Paste__Group__1 ;
    public final void rule__Paste__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1678:1: ( rule__Paste__Group__0__Impl rule__Paste__Group__1 )
            // InternalSeleniumDsl.g:1679:2: rule__Paste__Group__0__Impl rule__Paste__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Paste__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paste__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paste__Group__0"


    // $ANTLR start "rule__Paste__Group__0__Impl"
    // InternalSeleniumDsl.g:1686:1: rule__Paste__Group__0__Impl : ( 'paste' ) ;
    public final void rule__Paste__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1690:1: ( ( 'paste' ) )
            // InternalSeleniumDsl.g:1691:1: ( 'paste' )
            {
            // InternalSeleniumDsl.g:1691:1: ( 'paste' )
            // InternalSeleniumDsl.g:1692:2: 'paste'
            {
             before(grammarAccess.getPasteAccess().getPasteKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPasteAccess().getPasteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paste__Group__0__Impl"


    // $ANTLR start "rule__Paste__Group__1"
    // InternalSeleniumDsl.g:1701:1: rule__Paste__Group__1 : rule__Paste__Group__1__Impl rule__Paste__Group__2 ;
    public final void rule__Paste__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1705:1: ( rule__Paste__Group__1__Impl rule__Paste__Group__2 )
            // InternalSeleniumDsl.g:1706:2: rule__Paste__Group__1__Impl rule__Paste__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Paste__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paste__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paste__Group__1"


    // $ANTLR start "rule__Paste__Group__1__Impl"
    // InternalSeleniumDsl.g:1713:1: rule__Paste__Group__1__Impl : ( 'the' ) ;
    public final void rule__Paste__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1717:1: ( ( 'the' ) )
            // InternalSeleniumDsl.g:1718:1: ( 'the' )
            {
            // InternalSeleniumDsl.g:1718:1: ( 'the' )
            // InternalSeleniumDsl.g:1719:2: 'the'
            {
             before(grammarAccess.getPasteAccess().getTheKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPasteAccess().getTheKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paste__Group__1__Impl"


    // $ANTLR start "rule__Paste__Group__2"
    // InternalSeleniumDsl.g:1728:1: rule__Paste__Group__2 : rule__Paste__Group__2__Impl rule__Paste__Group__3 ;
    public final void rule__Paste__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1732:1: ( rule__Paste__Group__2__Impl rule__Paste__Group__3 )
            // InternalSeleniumDsl.g:1733:2: rule__Paste__Group__2__Impl rule__Paste__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Paste__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paste__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paste__Group__2"


    // $ANTLR start "rule__Paste__Group__2__Impl"
    // InternalSeleniumDsl.g:1740:1: rule__Paste__Group__2__Impl : ( 'content' ) ;
    public final void rule__Paste__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1744:1: ( ( 'content' ) )
            // InternalSeleniumDsl.g:1745:1: ( 'content' )
            {
            // InternalSeleniumDsl.g:1745:1: ( 'content' )
            // InternalSeleniumDsl.g:1746:2: 'content'
            {
             before(grammarAccess.getPasteAccess().getContentKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getPasteAccess().getContentKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paste__Group__2__Impl"


    // $ANTLR start "rule__Paste__Group__3"
    // InternalSeleniumDsl.g:1755:1: rule__Paste__Group__3 : rule__Paste__Group__3__Impl rule__Paste__Group__4 ;
    public final void rule__Paste__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1759:1: ( rule__Paste__Group__3__Impl rule__Paste__Group__4 )
            // InternalSeleniumDsl.g:1760:2: rule__Paste__Group__3__Impl rule__Paste__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Paste__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paste__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paste__Group__3"


    // $ANTLR start "rule__Paste__Group__3__Impl"
    // InternalSeleniumDsl.g:1767:1: rule__Paste__Group__3__Impl : ( 'of' ) ;
    public final void rule__Paste__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1771:1: ( ( 'of' ) )
            // InternalSeleniumDsl.g:1772:1: ( 'of' )
            {
            // InternalSeleniumDsl.g:1772:1: ( 'of' )
            // InternalSeleniumDsl.g:1773:2: 'of'
            {
             before(grammarAccess.getPasteAccess().getOfKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPasteAccess().getOfKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paste__Group__3__Impl"


    // $ANTLR start "rule__Paste__Group__4"
    // InternalSeleniumDsl.g:1782:1: rule__Paste__Group__4 : rule__Paste__Group__4__Impl rule__Paste__Group__5 ;
    public final void rule__Paste__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1786:1: ( rule__Paste__Group__4__Impl rule__Paste__Group__5 )
            // InternalSeleniumDsl.g:1787:2: rule__Paste__Group__4__Impl rule__Paste__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__Paste__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paste__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paste__Group__4"


    // $ANTLR start "rule__Paste__Group__4__Impl"
    // InternalSeleniumDsl.g:1794:1: rule__Paste__Group__4__Impl : ( 'the' ) ;
    public final void rule__Paste__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1798:1: ( ( 'the' ) )
            // InternalSeleniumDsl.g:1799:1: ( 'the' )
            {
            // InternalSeleniumDsl.g:1799:1: ( 'the' )
            // InternalSeleniumDsl.g:1800:2: 'the'
            {
             before(grammarAccess.getPasteAccess().getTheKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPasteAccess().getTheKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paste__Group__4__Impl"


    // $ANTLR start "rule__Paste__Group__5"
    // InternalSeleniumDsl.g:1809:1: rule__Paste__Group__5 : rule__Paste__Group__5__Impl rule__Paste__Group__6 ;
    public final void rule__Paste__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1813:1: ( rule__Paste__Group__5__Impl rule__Paste__Group__6 )
            // InternalSeleniumDsl.g:1814:2: rule__Paste__Group__5__Impl rule__Paste__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__Paste__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paste__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paste__Group__5"


    // $ANTLR start "rule__Paste__Group__5__Impl"
    // InternalSeleniumDsl.g:1821:1: rule__Paste__Group__5__Impl : ( 'clipboard' ) ;
    public final void rule__Paste__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1825:1: ( ( 'clipboard' ) )
            // InternalSeleniumDsl.g:1826:1: ( 'clipboard' )
            {
            // InternalSeleniumDsl.g:1826:1: ( 'clipboard' )
            // InternalSeleniumDsl.g:1827:2: 'clipboard'
            {
             before(grammarAccess.getPasteAccess().getClipboardKeyword_5()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPasteAccess().getClipboardKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paste__Group__5__Impl"


    // $ANTLR start "rule__Paste__Group__6"
    // InternalSeleniumDsl.g:1836:1: rule__Paste__Group__6 : rule__Paste__Group__6__Impl rule__Paste__Group__7 ;
    public final void rule__Paste__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1840:1: ( rule__Paste__Group__6__Impl rule__Paste__Group__7 )
            // InternalSeleniumDsl.g:1841:2: rule__Paste__Group__6__Impl rule__Paste__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Paste__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paste__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paste__Group__6"


    // $ANTLR start "rule__Paste__Group__6__Impl"
    // InternalSeleniumDsl.g:1848:1: rule__Paste__Group__6__Impl : ( 'in' ) ;
    public final void rule__Paste__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1852:1: ( ( 'in' ) )
            // InternalSeleniumDsl.g:1853:1: ( 'in' )
            {
            // InternalSeleniumDsl.g:1853:1: ( 'in' )
            // InternalSeleniumDsl.g:1854:2: 'in'
            {
             before(grammarAccess.getPasteAccess().getInKeyword_6()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getPasteAccess().getInKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paste__Group__6__Impl"


    // $ANTLR start "rule__Paste__Group__7"
    // InternalSeleniumDsl.g:1863:1: rule__Paste__Group__7 : rule__Paste__Group__7__Impl ;
    public final void rule__Paste__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1867:1: ( rule__Paste__Group__7__Impl )
            // InternalSeleniumDsl.g:1868:2: rule__Paste__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Paste__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paste__Group__7"


    // $ANTLR start "rule__Paste__Group__7__Impl"
    // InternalSeleniumDsl.g:1874:1: rule__Paste__Group__7__Impl : ( ( rule__Paste__ElementAssignment_7 ) ) ;
    public final void rule__Paste__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1878:1: ( ( ( rule__Paste__ElementAssignment_7 ) ) )
            // InternalSeleniumDsl.g:1879:1: ( ( rule__Paste__ElementAssignment_7 ) )
            {
            // InternalSeleniumDsl.g:1879:1: ( ( rule__Paste__ElementAssignment_7 ) )
            // InternalSeleniumDsl.g:1880:2: ( rule__Paste__ElementAssignment_7 )
            {
             before(grammarAccess.getPasteAccess().getElementAssignment_7()); 
            // InternalSeleniumDsl.g:1881:2: ( rule__Paste__ElementAssignment_7 )
            // InternalSeleniumDsl.g:1881:3: rule__Paste__ElementAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Paste__ElementAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getPasteAccess().getElementAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paste__Group__7__Impl"


    // $ANTLR start "rule__Insert__Group__0"
    // InternalSeleniumDsl.g:1890:1: rule__Insert__Group__0 : rule__Insert__Group__0__Impl rule__Insert__Group__1 ;
    public final void rule__Insert__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1894:1: ( rule__Insert__Group__0__Impl rule__Insert__Group__1 )
            // InternalSeleniumDsl.g:1895:2: rule__Insert__Group__0__Impl rule__Insert__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Insert__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insert__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__0"


    // $ANTLR start "rule__Insert__Group__0__Impl"
    // InternalSeleniumDsl.g:1902:1: rule__Insert__Group__0__Impl : ( 'fill' ) ;
    public final void rule__Insert__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1906:1: ( ( 'fill' ) )
            // InternalSeleniumDsl.g:1907:1: ( 'fill' )
            {
            // InternalSeleniumDsl.g:1907:1: ( 'fill' )
            // InternalSeleniumDsl.g:1908:2: 'fill'
            {
             before(grammarAccess.getInsertAccess().getFillKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getInsertAccess().getFillKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__0__Impl"


    // $ANTLR start "rule__Insert__Group__1"
    // InternalSeleniumDsl.g:1917:1: rule__Insert__Group__1 : rule__Insert__Group__1__Impl rule__Insert__Group__2 ;
    public final void rule__Insert__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1921:1: ( rule__Insert__Group__1__Impl rule__Insert__Group__2 )
            // InternalSeleniumDsl.g:1922:2: rule__Insert__Group__1__Impl rule__Insert__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__Insert__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insert__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__1"


    // $ANTLR start "rule__Insert__Group__1__Impl"
    // InternalSeleniumDsl.g:1929:1: rule__Insert__Group__1__Impl : ( ( rule__Insert__ElementAssignment_1 ) ) ;
    public final void rule__Insert__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1933:1: ( ( ( rule__Insert__ElementAssignment_1 ) ) )
            // InternalSeleniumDsl.g:1934:1: ( ( rule__Insert__ElementAssignment_1 ) )
            {
            // InternalSeleniumDsl.g:1934:1: ( ( rule__Insert__ElementAssignment_1 ) )
            // InternalSeleniumDsl.g:1935:2: ( rule__Insert__ElementAssignment_1 )
            {
             before(grammarAccess.getInsertAccess().getElementAssignment_1()); 
            // InternalSeleniumDsl.g:1936:2: ( rule__Insert__ElementAssignment_1 )
            // InternalSeleniumDsl.g:1936:3: rule__Insert__ElementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Insert__ElementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInsertAccess().getElementAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__1__Impl"


    // $ANTLR start "rule__Insert__Group__2"
    // InternalSeleniumDsl.g:1944:1: rule__Insert__Group__2 : rule__Insert__Group__2__Impl rule__Insert__Group__3 ;
    public final void rule__Insert__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1948:1: ( rule__Insert__Group__2__Impl rule__Insert__Group__3 )
            // InternalSeleniumDsl.g:1949:2: rule__Insert__Group__2__Impl rule__Insert__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Insert__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insert__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__2"


    // $ANTLR start "rule__Insert__Group__2__Impl"
    // InternalSeleniumDsl.g:1956:1: rule__Insert__Group__2__Impl : ( 'with' ) ;
    public final void rule__Insert__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1960:1: ( ( 'with' ) )
            // InternalSeleniumDsl.g:1961:1: ( 'with' )
            {
            // InternalSeleniumDsl.g:1961:1: ( 'with' )
            // InternalSeleniumDsl.g:1962:2: 'with'
            {
             before(grammarAccess.getInsertAccess().getWithKeyword_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getInsertAccess().getWithKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__2__Impl"


    // $ANTLR start "rule__Insert__Group__3"
    // InternalSeleniumDsl.g:1971:1: rule__Insert__Group__3 : rule__Insert__Group__3__Impl ;
    public final void rule__Insert__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1975:1: ( rule__Insert__Group__3__Impl )
            // InternalSeleniumDsl.g:1976:2: rule__Insert__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Insert__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__3"


    // $ANTLR start "rule__Insert__Group__3__Impl"
    // InternalSeleniumDsl.g:1982:1: rule__Insert__Group__3__Impl : ( ( rule__Insert__ContentAssignment_3 ) ) ;
    public final void rule__Insert__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1986:1: ( ( ( rule__Insert__ContentAssignment_3 ) ) )
            // InternalSeleniumDsl.g:1987:1: ( ( rule__Insert__ContentAssignment_3 ) )
            {
            // InternalSeleniumDsl.g:1987:1: ( ( rule__Insert__ContentAssignment_3 ) )
            // InternalSeleniumDsl.g:1988:2: ( rule__Insert__ContentAssignment_3 )
            {
             before(grammarAccess.getInsertAccess().getContentAssignment_3()); 
            // InternalSeleniumDsl.g:1989:2: ( rule__Insert__ContentAssignment_3 )
            // InternalSeleniumDsl.g:1989:3: rule__Insert__ContentAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Insert__ContentAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInsertAccess().getContentAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__3__Impl"


    // $ANTLR start "rule__Selector__Group__0"
    // InternalSeleniumDsl.g:1998:1: rule__Selector__Group__0 : rule__Selector__Group__0__Impl rule__Selector__Group__1 ;
    public final void rule__Selector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2002:1: ( rule__Selector__Group__0__Impl rule__Selector__Group__1 )
            // InternalSeleniumDsl.g:2003:2: rule__Selector__Group__0__Impl rule__Selector__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Selector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__0"


    // $ANTLR start "rule__Selector__Group__0__Impl"
    // InternalSeleniumDsl.g:2010:1: rule__Selector__Group__0__Impl : ( ( rule__Selector__PredicateAssignment_0 ) ) ;
    public final void rule__Selector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2014:1: ( ( ( rule__Selector__PredicateAssignment_0 ) ) )
            // InternalSeleniumDsl.g:2015:1: ( ( rule__Selector__PredicateAssignment_0 ) )
            {
            // InternalSeleniumDsl.g:2015:1: ( ( rule__Selector__PredicateAssignment_0 ) )
            // InternalSeleniumDsl.g:2016:2: ( rule__Selector__PredicateAssignment_0 )
            {
             before(grammarAccess.getSelectorAccess().getPredicateAssignment_0()); 
            // InternalSeleniumDsl.g:2017:2: ( rule__Selector__PredicateAssignment_0 )
            // InternalSeleniumDsl.g:2017:3: rule__Selector__PredicateAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Selector__PredicateAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getPredicateAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__0__Impl"


    // $ANTLR start "rule__Selector__Group__1"
    // InternalSeleniumDsl.g:2025:1: rule__Selector__Group__1 : rule__Selector__Group__1__Impl rule__Selector__Group__2 ;
    public final void rule__Selector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2029:1: ( rule__Selector__Group__1__Impl rule__Selector__Group__2 )
            // InternalSeleniumDsl.g:2030:2: rule__Selector__Group__1__Impl rule__Selector__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__Selector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__1"


    // $ANTLR start "rule__Selector__Group__1__Impl"
    // InternalSeleniumDsl.g:2037:1: rule__Selector__Group__1__Impl : ( ( rule__Selector__DomTypeAssignment_1 ) ) ;
    public final void rule__Selector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2041:1: ( ( ( rule__Selector__DomTypeAssignment_1 ) ) )
            // InternalSeleniumDsl.g:2042:1: ( ( rule__Selector__DomTypeAssignment_1 ) )
            {
            // InternalSeleniumDsl.g:2042:1: ( ( rule__Selector__DomTypeAssignment_1 ) )
            // InternalSeleniumDsl.g:2043:2: ( rule__Selector__DomTypeAssignment_1 )
            {
             before(grammarAccess.getSelectorAccess().getDomTypeAssignment_1()); 
            // InternalSeleniumDsl.g:2044:2: ( rule__Selector__DomTypeAssignment_1 )
            // InternalSeleniumDsl.g:2044:3: rule__Selector__DomTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Selector__DomTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getDomTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__1__Impl"


    // $ANTLR start "rule__Selector__Group__2"
    // InternalSeleniumDsl.g:2052:1: rule__Selector__Group__2 : rule__Selector__Group__2__Impl rule__Selector__Group__3 ;
    public final void rule__Selector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2056:1: ( rule__Selector__Group__2__Impl rule__Selector__Group__3 )
            // InternalSeleniumDsl.g:2057:2: rule__Selector__Group__2__Impl rule__Selector__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__Selector__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__2"


    // $ANTLR start "rule__Selector__Group__2__Impl"
    // InternalSeleniumDsl.g:2064:1: rule__Selector__Group__2__Impl : ( ( rule__Selector__Group_2__0 )? ) ;
    public final void rule__Selector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2068:1: ( ( ( rule__Selector__Group_2__0 )? ) )
            // InternalSeleniumDsl.g:2069:1: ( ( rule__Selector__Group_2__0 )? )
            {
            // InternalSeleniumDsl.g:2069:1: ( ( rule__Selector__Group_2__0 )? )
            // InternalSeleniumDsl.g:2070:2: ( rule__Selector__Group_2__0 )?
            {
             before(grammarAccess.getSelectorAccess().getGroup_2()); 
            // InternalSeleniumDsl.g:2071:2: ( rule__Selector__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==41) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==42) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // InternalSeleniumDsl.g:2071:3: rule__Selector__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selector__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectorAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__2__Impl"


    // $ANTLR start "rule__Selector__Group__3"
    // InternalSeleniumDsl.g:2079:1: rule__Selector__Group__3 : rule__Selector__Group__3__Impl rule__Selector__Group__4 ;
    public final void rule__Selector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2083:1: ( rule__Selector__Group__3__Impl rule__Selector__Group__4 )
            // InternalSeleniumDsl.g:2084:2: rule__Selector__Group__3__Impl rule__Selector__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__Selector__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__3"


    // $ANTLR start "rule__Selector__Group__3__Impl"
    // InternalSeleniumDsl.g:2091:1: rule__Selector__Group__3__Impl : ( ( rule__Selector__Group_3__0 )? ) ;
    public final void rule__Selector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2095:1: ( ( ( rule__Selector__Group_3__0 )? ) )
            // InternalSeleniumDsl.g:2096:1: ( ( rule__Selector__Group_3__0 )? )
            {
            // InternalSeleniumDsl.g:2096:1: ( ( rule__Selector__Group_3__0 )? )
            // InternalSeleniumDsl.g:2097:2: ( rule__Selector__Group_3__0 )?
            {
             before(grammarAccess.getSelectorAccess().getGroup_3()); 
            // InternalSeleniumDsl.g:2098:2: ( rule__Selector__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==41) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==43) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalSeleniumDsl.g:2098:3: rule__Selector__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selector__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectorAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__3__Impl"


    // $ANTLR start "rule__Selector__Group__4"
    // InternalSeleniumDsl.g:2106:1: rule__Selector__Group__4 : rule__Selector__Group__4__Impl rule__Selector__Group__5 ;
    public final void rule__Selector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2110:1: ( rule__Selector__Group__4__Impl rule__Selector__Group__5 )
            // InternalSeleniumDsl.g:2111:2: rule__Selector__Group__4__Impl rule__Selector__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__Selector__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__4"


    // $ANTLR start "rule__Selector__Group__4__Impl"
    // InternalSeleniumDsl.g:2118:1: rule__Selector__Group__4__Impl : ( ( rule__Selector__Group_4__0 )? ) ;
    public final void rule__Selector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2122:1: ( ( ( rule__Selector__Group_4__0 )? ) )
            // InternalSeleniumDsl.g:2123:1: ( ( rule__Selector__Group_4__0 )? )
            {
            // InternalSeleniumDsl.g:2123:1: ( ( rule__Selector__Group_4__0 )? )
            // InternalSeleniumDsl.g:2124:2: ( rule__Selector__Group_4__0 )?
            {
             before(grammarAccess.getSelectorAccess().getGroup_4()); 
            // InternalSeleniumDsl.g:2125:2: ( rule__Selector__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==45) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSeleniumDsl.g:2125:3: rule__Selector__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selector__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectorAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__4__Impl"


    // $ANTLR start "rule__Selector__Group__5"
    // InternalSeleniumDsl.g:2133:1: rule__Selector__Group__5 : rule__Selector__Group__5__Impl ;
    public final void rule__Selector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2137:1: ( rule__Selector__Group__5__Impl )
            // InternalSeleniumDsl.g:2138:2: rule__Selector__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__5"


    // $ANTLR start "rule__Selector__Group__5__Impl"
    // InternalSeleniumDsl.g:2144:1: rule__Selector__Group__5__Impl : ( ( rule__Selector__Group_5__0 )? ) ;
    public final void rule__Selector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2148:1: ( ( ( rule__Selector__Group_5__0 )? ) )
            // InternalSeleniumDsl.g:2149:1: ( ( rule__Selector__Group_5__0 )? )
            {
            // InternalSeleniumDsl.g:2149:1: ( ( rule__Selector__Group_5__0 )? )
            // InternalSeleniumDsl.g:2150:2: ( rule__Selector__Group_5__0 )?
            {
             before(grammarAccess.getSelectorAccess().getGroup_5()); 
            // InternalSeleniumDsl.g:2151:2: ( rule__Selector__Group_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==39) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSeleniumDsl.g:2151:3: rule__Selector__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selector__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectorAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__5__Impl"


    // $ANTLR start "rule__Selector__Group_2__0"
    // InternalSeleniumDsl.g:2160:1: rule__Selector__Group_2__0 : rule__Selector__Group_2__0__Impl rule__Selector__Group_2__1 ;
    public final void rule__Selector__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2164:1: ( rule__Selector__Group_2__0__Impl rule__Selector__Group_2__1 )
            // InternalSeleniumDsl.g:2165:2: rule__Selector__Group_2__0__Impl rule__Selector__Group_2__1
            {
            pushFollow(FOLLOW_30);
            rule__Selector__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_2__0"


    // $ANTLR start "rule__Selector__Group_2__0__Impl"
    // InternalSeleniumDsl.g:2172:1: rule__Selector__Group_2__0__Impl : ( 'with' ) ;
    public final void rule__Selector__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2176:1: ( ( 'with' ) )
            // InternalSeleniumDsl.g:2177:1: ( 'with' )
            {
            // InternalSeleniumDsl.g:2177:1: ( 'with' )
            // InternalSeleniumDsl.g:2178:2: 'with'
            {
             before(grammarAccess.getSelectorAccess().getWithKeyword_2_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getWithKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_2__0__Impl"


    // $ANTLR start "rule__Selector__Group_2__1"
    // InternalSeleniumDsl.g:2187:1: rule__Selector__Group_2__1 : rule__Selector__Group_2__1__Impl rule__Selector__Group_2__2 ;
    public final void rule__Selector__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2191:1: ( rule__Selector__Group_2__1__Impl rule__Selector__Group_2__2 )
            // InternalSeleniumDsl.g:2192:2: rule__Selector__Group_2__1__Impl rule__Selector__Group_2__2
            {
            pushFollow(FOLLOW_21);
            rule__Selector__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_2__1"


    // $ANTLR start "rule__Selector__Group_2__1__Impl"
    // InternalSeleniumDsl.g:2199:1: rule__Selector__Group_2__1__Impl : ( 'properties' ) ;
    public final void rule__Selector__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2203:1: ( ( 'properties' ) )
            // InternalSeleniumDsl.g:2204:1: ( 'properties' )
            {
            // InternalSeleniumDsl.g:2204:1: ( 'properties' )
            // InternalSeleniumDsl.g:2205:2: 'properties'
            {
             before(grammarAccess.getSelectorAccess().getPropertiesKeyword_2_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getPropertiesKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_2__1__Impl"


    // $ANTLR start "rule__Selector__Group_2__2"
    // InternalSeleniumDsl.g:2214:1: rule__Selector__Group_2__2 : rule__Selector__Group_2__2__Impl ;
    public final void rule__Selector__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2218:1: ( rule__Selector__Group_2__2__Impl )
            // InternalSeleniumDsl.g:2219:2: rule__Selector__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_2__2"


    // $ANTLR start "rule__Selector__Group_2__2__Impl"
    // InternalSeleniumDsl.g:2225:1: rule__Selector__Group_2__2__Impl : ( ( rule__Selector__AttributesAssignment_2_2 ) ) ;
    public final void rule__Selector__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2229:1: ( ( ( rule__Selector__AttributesAssignment_2_2 ) ) )
            // InternalSeleniumDsl.g:2230:1: ( ( rule__Selector__AttributesAssignment_2_2 ) )
            {
            // InternalSeleniumDsl.g:2230:1: ( ( rule__Selector__AttributesAssignment_2_2 ) )
            // InternalSeleniumDsl.g:2231:2: ( rule__Selector__AttributesAssignment_2_2 )
            {
             before(grammarAccess.getSelectorAccess().getAttributesAssignment_2_2()); 
            // InternalSeleniumDsl.g:2232:2: ( rule__Selector__AttributesAssignment_2_2 )
            // InternalSeleniumDsl.g:2232:3: rule__Selector__AttributesAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Selector__AttributesAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getAttributesAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_2__2__Impl"


    // $ANTLR start "rule__Selector__Group_3__0"
    // InternalSeleniumDsl.g:2241:1: rule__Selector__Group_3__0 : rule__Selector__Group_3__0__Impl rule__Selector__Group_3__1 ;
    public final void rule__Selector__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2245:1: ( rule__Selector__Group_3__0__Impl rule__Selector__Group_3__1 )
            // InternalSeleniumDsl.g:2246:2: rule__Selector__Group_3__0__Impl rule__Selector__Group_3__1
            {
            pushFollow(FOLLOW_31);
            rule__Selector__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_3__0"


    // $ANTLR start "rule__Selector__Group_3__0__Impl"
    // InternalSeleniumDsl.g:2253:1: rule__Selector__Group_3__0__Impl : ( 'with' ) ;
    public final void rule__Selector__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2257:1: ( ( 'with' ) )
            // InternalSeleniumDsl.g:2258:1: ( 'with' )
            {
            // InternalSeleniumDsl.g:2258:1: ( 'with' )
            // InternalSeleniumDsl.g:2259:2: 'with'
            {
             before(grammarAccess.getSelectorAccess().getWithKeyword_3_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getWithKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_3__0__Impl"


    // $ANTLR start "rule__Selector__Group_3__1"
    // InternalSeleniumDsl.g:2268:1: rule__Selector__Group_3__1 : rule__Selector__Group_3__1__Impl rule__Selector__Group_3__2 ;
    public final void rule__Selector__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2272:1: ( rule__Selector__Group_3__1__Impl rule__Selector__Group_3__2 )
            // InternalSeleniumDsl.g:2273:2: rule__Selector__Group_3__1__Impl rule__Selector__Group_3__2
            {
            pushFollow(FOLLOW_32);
            rule__Selector__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_3__1"


    // $ANTLR start "rule__Selector__Group_3__1__Impl"
    // InternalSeleniumDsl.g:2280:1: rule__Selector__Group_3__1__Impl : ( 'associated' ) ;
    public final void rule__Selector__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2284:1: ( ( 'associated' ) )
            // InternalSeleniumDsl.g:2285:1: ( 'associated' )
            {
            // InternalSeleniumDsl.g:2285:1: ( 'associated' )
            // InternalSeleniumDsl.g:2286:2: 'associated'
            {
             before(grammarAccess.getSelectorAccess().getAssociatedKeyword_3_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getAssociatedKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_3__1__Impl"


    // $ANTLR start "rule__Selector__Group_3__2"
    // InternalSeleniumDsl.g:2295:1: rule__Selector__Group_3__2 : rule__Selector__Group_3__2__Impl rule__Selector__Group_3__3 ;
    public final void rule__Selector__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2299:1: ( rule__Selector__Group_3__2__Impl rule__Selector__Group_3__3 )
            // InternalSeleniumDsl.g:2300:2: rule__Selector__Group_3__2__Impl rule__Selector__Group_3__3
            {
            pushFollow(FOLLOW_6);
            rule__Selector__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_3__2"


    // $ANTLR start "rule__Selector__Group_3__2__Impl"
    // InternalSeleniumDsl.g:2307:1: rule__Selector__Group_3__2__Impl : ( 'label' ) ;
    public final void rule__Selector__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2311:1: ( ( 'label' ) )
            // InternalSeleniumDsl.g:2312:1: ( 'label' )
            {
            // InternalSeleniumDsl.g:2312:1: ( 'label' )
            // InternalSeleniumDsl.g:2313:2: 'label'
            {
             before(grammarAccess.getSelectorAccess().getLabelKeyword_3_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getLabelKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_3__2__Impl"


    // $ANTLR start "rule__Selector__Group_3__3"
    // InternalSeleniumDsl.g:2322:1: rule__Selector__Group_3__3 : rule__Selector__Group_3__3__Impl ;
    public final void rule__Selector__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2326:1: ( rule__Selector__Group_3__3__Impl )
            // InternalSeleniumDsl.g:2327:2: rule__Selector__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_3__3"


    // $ANTLR start "rule__Selector__Group_3__3__Impl"
    // InternalSeleniumDsl.g:2333:1: rule__Selector__Group_3__3__Impl : ( ( rule__Selector__LabelAssignment_3_3 ) ) ;
    public final void rule__Selector__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2337:1: ( ( ( rule__Selector__LabelAssignment_3_3 ) ) )
            // InternalSeleniumDsl.g:2338:1: ( ( rule__Selector__LabelAssignment_3_3 ) )
            {
            // InternalSeleniumDsl.g:2338:1: ( ( rule__Selector__LabelAssignment_3_3 ) )
            // InternalSeleniumDsl.g:2339:2: ( rule__Selector__LabelAssignment_3_3 )
            {
             before(grammarAccess.getSelectorAccess().getLabelAssignment_3_3()); 
            // InternalSeleniumDsl.g:2340:2: ( rule__Selector__LabelAssignment_3_3 )
            // InternalSeleniumDsl.g:2340:3: rule__Selector__LabelAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__Selector__LabelAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getLabelAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_3__3__Impl"


    // $ANTLR start "rule__Selector__Group_4__0"
    // InternalSeleniumDsl.g:2349:1: rule__Selector__Group_4__0 : rule__Selector__Group_4__0__Impl rule__Selector__Group_4__1 ;
    public final void rule__Selector__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2353:1: ( rule__Selector__Group_4__0__Impl rule__Selector__Group_4__1 )
            // InternalSeleniumDsl.g:2354:2: rule__Selector__Group_4__0__Impl rule__Selector__Group_4__1
            {
            pushFollow(FOLLOW_33);
            rule__Selector__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_4__0"


    // $ANTLR start "rule__Selector__Group_4__0__Impl"
    // InternalSeleniumDsl.g:2361:1: rule__Selector__Group_4__0__Impl : ( 'that' ) ;
    public final void rule__Selector__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2365:1: ( ( 'that' ) )
            // InternalSeleniumDsl.g:2366:1: ( 'that' )
            {
            // InternalSeleniumDsl.g:2366:1: ( 'that' )
            // InternalSeleniumDsl.g:2367:2: 'that'
            {
             before(grammarAccess.getSelectorAccess().getThatKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getThatKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_4__0__Impl"


    // $ANTLR start "rule__Selector__Group_4__1"
    // InternalSeleniumDsl.g:2376:1: rule__Selector__Group_4__1 : rule__Selector__Group_4__1__Impl rule__Selector__Group_4__2 ;
    public final void rule__Selector__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2380:1: ( rule__Selector__Group_4__1__Impl rule__Selector__Group_4__2 )
            // InternalSeleniumDsl.g:2381:2: rule__Selector__Group_4__1__Impl rule__Selector__Group_4__2
            {
            pushFollow(FOLLOW_34);
            rule__Selector__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_4__1"


    // $ANTLR start "rule__Selector__Group_4__1__Impl"
    // InternalSeleniumDsl.g:2388:1: rule__Selector__Group_4__1__Impl : ( 'is' ) ;
    public final void rule__Selector__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2392:1: ( ( 'is' ) )
            // InternalSeleniumDsl.g:2393:1: ( 'is' )
            {
            // InternalSeleniumDsl.g:2393:1: ( 'is' )
            // InternalSeleniumDsl.g:2394:2: 'is'
            {
             before(grammarAccess.getSelectorAccess().getIsKeyword_4_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getIsKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_4__1__Impl"


    // $ANTLR start "rule__Selector__Group_4__2"
    // InternalSeleniumDsl.g:2403:1: rule__Selector__Group_4__2 : rule__Selector__Group_4__2__Impl ;
    public final void rule__Selector__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2407:1: ( rule__Selector__Group_4__2__Impl )
            // InternalSeleniumDsl.g:2408:2: rule__Selector__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_4__2"


    // $ANTLR start "rule__Selector__Group_4__2__Impl"
    // InternalSeleniumDsl.g:2414:1: rule__Selector__Group_4__2__Impl : ( ( rule__Selector__PropertiesAssignment_4_2 ) ) ;
    public final void rule__Selector__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2418:1: ( ( ( rule__Selector__PropertiesAssignment_4_2 ) ) )
            // InternalSeleniumDsl.g:2419:1: ( ( rule__Selector__PropertiesAssignment_4_2 ) )
            {
            // InternalSeleniumDsl.g:2419:1: ( ( rule__Selector__PropertiesAssignment_4_2 ) )
            // InternalSeleniumDsl.g:2420:2: ( rule__Selector__PropertiesAssignment_4_2 )
            {
             before(grammarAccess.getSelectorAccess().getPropertiesAssignment_4_2()); 
            // InternalSeleniumDsl.g:2421:2: ( rule__Selector__PropertiesAssignment_4_2 )
            // InternalSeleniumDsl.g:2421:3: rule__Selector__PropertiesAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Selector__PropertiesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getPropertiesAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_4__2__Impl"


    // $ANTLR start "rule__Selector__Group_5__0"
    // InternalSeleniumDsl.g:2430:1: rule__Selector__Group_5__0 : rule__Selector__Group_5__0__Impl rule__Selector__Group_5__1 ;
    public final void rule__Selector__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2434:1: ( rule__Selector__Group_5__0__Impl rule__Selector__Group_5__1 )
            // InternalSeleniumDsl.g:2435:2: rule__Selector__Group_5__0__Impl rule__Selector__Group_5__1
            {
            pushFollow(FOLLOW_16);
            rule__Selector__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_5__0"


    // $ANTLR start "rule__Selector__Group_5__0__Impl"
    // InternalSeleniumDsl.g:2442:1: rule__Selector__Group_5__0__Impl : ( 'in' ) ;
    public final void rule__Selector__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2446:1: ( ( 'in' ) )
            // InternalSeleniumDsl.g:2447:1: ( 'in' )
            {
            // InternalSeleniumDsl.g:2447:1: ( 'in' )
            // InternalSeleniumDsl.g:2448:2: 'in'
            {
             before(grammarAccess.getSelectorAccess().getInKeyword_5_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getInKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_5__0__Impl"


    // $ANTLR start "rule__Selector__Group_5__1"
    // InternalSeleniumDsl.g:2457:1: rule__Selector__Group_5__1 : rule__Selector__Group_5__1__Impl ;
    public final void rule__Selector__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2461:1: ( rule__Selector__Group_5__1__Impl )
            // InternalSeleniumDsl.g:2462:2: rule__Selector__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_5__1"


    // $ANTLR start "rule__Selector__Group_5__1__Impl"
    // InternalSeleniumDsl.g:2468:1: rule__Selector__Group_5__1__Impl : ( ( rule__Selector__ParentAssignment_5_1 ) ) ;
    public final void rule__Selector__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2472:1: ( ( ( rule__Selector__ParentAssignment_5_1 ) ) )
            // InternalSeleniumDsl.g:2473:1: ( ( rule__Selector__ParentAssignment_5_1 ) )
            {
            // InternalSeleniumDsl.g:2473:1: ( ( rule__Selector__ParentAssignment_5_1 ) )
            // InternalSeleniumDsl.g:2474:2: ( rule__Selector__ParentAssignment_5_1 )
            {
             before(grammarAccess.getSelectorAccess().getParentAssignment_5_1()); 
            // InternalSeleniumDsl.g:2475:2: ( rule__Selector__ParentAssignment_5_1 )
            // InternalSeleniumDsl.g:2475:3: rule__Selector__ParentAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Selector__ParentAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getParentAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_5__1__Impl"


    // $ANTLR start "rule__Attributes__Group__0"
    // InternalSeleniumDsl.g:2484:1: rule__Attributes__Group__0 : rule__Attributes__Group__0__Impl rule__Attributes__Group__1 ;
    public final void rule__Attributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2488:1: ( rule__Attributes__Group__0__Impl rule__Attributes__Group__1 )
            // InternalSeleniumDsl.g:2489:2: rule__Attributes__Group__0__Impl rule__Attributes__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__Attributes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attributes__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group__0"


    // $ANTLR start "rule__Attributes__Group__0__Impl"
    // InternalSeleniumDsl.g:2496:1: rule__Attributes__Group__0__Impl : ( ( rule__Attributes__AttributesAssignment_0 ) ) ;
    public final void rule__Attributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2500:1: ( ( ( rule__Attributes__AttributesAssignment_0 ) ) )
            // InternalSeleniumDsl.g:2501:1: ( ( rule__Attributes__AttributesAssignment_0 ) )
            {
            // InternalSeleniumDsl.g:2501:1: ( ( rule__Attributes__AttributesAssignment_0 ) )
            // InternalSeleniumDsl.g:2502:2: ( rule__Attributes__AttributesAssignment_0 )
            {
             before(grammarAccess.getAttributesAccess().getAttributesAssignment_0()); 
            // InternalSeleniumDsl.g:2503:2: ( rule__Attributes__AttributesAssignment_0 )
            // InternalSeleniumDsl.g:2503:3: rule__Attributes__AttributesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Attributes__AttributesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributesAccess().getAttributesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group__0__Impl"


    // $ANTLR start "rule__Attributes__Group__1"
    // InternalSeleniumDsl.g:2511:1: rule__Attributes__Group__1 : rule__Attributes__Group__1__Impl ;
    public final void rule__Attributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2515:1: ( rule__Attributes__Group__1__Impl )
            // InternalSeleniumDsl.g:2516:2: rule__Attributes__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attributes__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group__1"


    // $ANTLR start "rule__Attributes__Group__1__Impl"
    // InternalSeleniumDsl.g:2522:1: rule__Attributes__Group__1__Impl : ( ( rule__Attributes__Group_1__0 )* ) ;
    public final void rule__Attributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2526:1: ( ( ( rule__Attributes__Group_1__0 )* ) )
            // InternalSeleniumDsl.g:2527:1: ( ( rule__Attributes__Group_1__0 )* )
            {
            // InternalSeleniumDsl.g:2527:1: ( ( rule__Attributes__Group_1__0 )* )
            // InternalSeleniumDsl.g:2528:2: ( rule__Attributes__Group_1__0 )*
            {
             before(grammarAccess.getAttributesAccess().getGroup_1()); 
            // InternalSeleniumDsl.g:2529:2: ( rule__Attributes__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==47) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSeleniumDsl.g:2529:3: rule__Attributes__Group_1__0
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__Attributes__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getAttributesAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group__1__Impl"


    // $ANTLR start "rule__Attributes__Group_1__0"
    // InternalSeleniumDsl.g:2538:1: rule__Attributes__Group_1__0 : rule__Attributes__Group_1__0__Impl rule__Attributes__Group_1__1 ;
    public final void rule__Attributes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2542:1: ( rule__Attributes__Group_1__0__Impl rule__Attributes__Group_1__1 )
            // InternalSeleniumDsl.g:2543:2: rule__Attributes__Group_1__0__Impl rule__Attributes__Group_1__1
            {
            pushFollow(FOLLOW_21);
            rule__Attributes__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attributes__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group_1__0"


    // $ANTLR start "rule__Attributes__Group_1__0__Impl"
    // InternalSeleniumDsl.g:2550:1: rule__Attributes__Group_1__0__Impl : ( 'and' ) ;
    public final void rule__Attributes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2554:1: ( ( 'and' ) )
            // InternalSeleniumDsl.g:2555:1: ( 'and' )
            {
            // InternalSeleniumDsl.g:2555:1: ( 'and' )
            // InternalSeleniumDsl.g:2556:2: 'and'
            {
             before(grammarAccess.getAttributesAccess().getAndKeyword_1_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getAttributesAccess().getAndKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group_1__0__Impl"


    // $ANTLR start "rule__Attributes__Group_1__1"
    // InternalSeleniumDsl.g:2565:1: rule__Attributes__Group_1__1 : rule__Attributes__Group_1__1__Impl ;
    public final void rule__Attributes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2569:1: ( rule__Attributes__Group_1__1__Impl )
            // InternalSeleniumDsl.g:2570:2: rule__Attributes__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attributes__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group_1__1"


    // $ANTLR start "rule__Attributes__Group_1__1__Impl"
    // InternalSeleniumDsl.g:2576:1: rule__Attributes__Group_1__1__Impl : ( ( rule__Attributes__PropertiesAssignment_1_1 ) ) ;
    public final void rule__Attributes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2580:1: ( ( ( rule__Attributes__PropertiesAssignment_1_1 ) ) )
            // InternalSeleniumDsl.g:2581:1: ( ( rule__Attributes__PropertiesAssignment_1_1 ) )
            {
            // InternalSeleniumDsl.g:2581:1: ( ( rule__Attributes__PropertiesAssignment_1_1 ) )
            // InternalSeleniumDsl.g:2582:2: ( rule__Attributes__PropertiesAssignment_1_1 )
            {
             before(grammarAccess.getAttributesAccess().getPropertiesAssignment_1_1()); 
            // InternalSeleniumDsl.g:2583:2: ( rule__Attributes__PropertiesAssignment_1_1 )
            // InternalSeleniumDsl.g:2583:3: rule__Attributes__PropertiesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Attributes__PropertiesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributesAccess().getPropertiesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group_1__1__Impl"


    // $ANTLR start "rule__ElementAttribute__Group__0"
    // InternalSeleniumDsl.g:2592:1: rule__ElementAttribute__Group__0 : rule__ElementAttribute__Group__0__Impl rule__ElementAttribute__Group__1 ;
    public final void rule__ElementAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2596:1: ( rule__ElementAttribute__Group__0__Impl rule__ElementAttribute__Group__1 )
            // InternalSeleniumDsl.g:2597:2: rule__ElementAttribute__Group__0__Impl rule__ElementAttribute__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__ElementAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementAttribute__Group__0"


    // $ANTLR start "rule__ElementAttribute__Group__0__Impl"
    // InternalSeleniumDsl.g:2604:1: rule__ElementAttribute__Group__0__Impl : ( ( rule__ElementAttribute__NameAssignment_0 ) ) ;
    public final void rule__ElementAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2608:1: ( ( ( rule__ElementAttribute__NameAssignment_0 ) ) )
            // InternalSeleniumDsl.g:2609:1: ( ( rule__ElementAttribute__NameAssignment_0 ) )
            {
            // InternalSeleniumDsl.g:2609:1: ( ( rule__ElementAttribute__NameAssignment_0 ) )
            // InternalSeleniumDsl.g:2610:2: ( rule__ElementAttribute__NameAssignment_0 )
            {
             before(grammarAccess.getElementAttributeAccess().getNameAssignment_0()); 
            // InternalSeleniumDsl.g:2611:2: ( rule__ElementAttribute__NameAssignment_0 )
            // InternalSeleniumDsl.g:2611:3: rule__ElementAttribute__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ElementAttribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getElementAttributeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementAttribute__Group__0__Impl"


    // $ANTLR start "rule__ElementAttribute__Group__1"
    // InternalSeleniumDsl.g:2619:1: rule__ElementAttribute__Group__1 : rule__ElementAttribute__Group__1__Impl rule__ElementAttribute__Group__2 ;
    public final void rule__ElementAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2623:1: ( rule__ElementAttribute__Group__1__Impl rule__ElementAttribute__Group__2 )
            // InternalSeleniumDsl.g:2624:2: rule__ElementAttribute__Group__1__Impl rule__ElementAttribute__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__ElementAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementAttribute__Group__1"


    // $ANTLR start "rule__ElementAttribute__Group__1__Impl"
    // InternalSeleniumDsl.g:2631:1: rule__ElementAttribute__Group__1__Impl : ( ( rule__ElementAttribute__MatcherAssignment_1 ) ) ;
    public final void rule__ElementAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2635:1: ( ( ( rule__ElementAttribute__MatcherAssignment_1 ) ) )
            // InternalSeleniumDsl.g:2636:1: ( ( rule__ElementAttribute__MatcherAssignment_1 ) )
            {
            // InternalSeleniumDsl.g:2636:1: ( ( rule__ElementAttribute__MatcherAssignment_1 ) )
            // InternalSeleniumDsl.g:2637:2: ( rule__ElementAttribute__MatcherAssignment_1 )
            {
             before(grammarAccess.getElementAttributeAccess().getMatcherAssignment_1()); 
            // InternalSeleniumDsl.g:2638:2: ( rule__ElementAttribute__MatcherAssignment_1 )
            // InternalSeleniumDsl.g:2638:3: rule__ElementAttribute__MatcherAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ElementAttribute__MatcherAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getElementAttributeAccess().getMatcherAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementAttribute__Group__1__Impl"


    // $ANTLR start "rule__ElementAttribute__Group__2"
    // InternalSeleniumDsl.g:2646:1: rule__ElementAttribute__Group__2 : rule__ElementAttribute__Group__2__Impl ;
    public final void rule__ElementAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2650:1: ( rule__ElementAttribute__Group__2__Impl )
            // InternalSeleniumDsl.g:2651:2: rule__ElementAttribute__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementAttribute__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementAttribute__Group__2"


    // $ANTLR start "rule__ElementAttribute__Group__2__Impl"
    // InternalSeleniumDsl.g:2657:1: rule__ElementAttribute__Group__2__Impl : ( ( rule__ElementAttribute__ValueAssignment_2 ) ) ;
    public final void rule__ElementAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2661:1: ( ( ( rule__ElementAttribute__ValueAssignment_2 ) ) )
            // InternalSeleniumDsl.g:2662:1: ( ( rule__ElementAttribute__ValueAssignment_2 ) )
            {
            // InternalSeleniumDsl.g:2662:1: ( ( rule__ElementAttribute__ValueAssignment_2 ) )
            // InternalSeleniumDsl.g:2663:2: ( rule__ElementAttribute__ValueAssignment_2 )
            {
             before(grammarAccess.getElementAttributeAccess().getValueAssignment_2()); 
            // InternalSeleniumDsl.g:2664:2: ( rule__ElementAttribute__ValueAssignment_2 )
            // InternalSeleniumDsl.g:2664:3: rule__ElementAttribute__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ElementAttribute__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getElementAttributeAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementAttribute__Group__2__Impl"


    // $ANTLR start "rule__ClipboardContent__Group__0"
    // InternalSeleniumDsl.g:2673:1: rule__ClipboardContent__Group__0 : rule__ClipboardContent__Group__0__Impl rule__ClipboardContent__Group__1 ;
    public final void rule__ClipboardContent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2677:1: ( rule__ClipboardContent__Group__0__Impl rule__ClipboardContent__Group__1 )
            // InternalSeleniumDsl.g:2678:2: rule__ClipboardContent__Group__0__Impl rule__ClipboardContent__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__ClipboardContent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClipboardContent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClipboardContent__Group__0"


    // $ANTLR start "rule__ClipboardContent__Group__0__Impl"
    // InternalSeleniumDsl.g:2685:1: rule__ClipboardContent__Group__0__Impl : ( 'the' ) ;
    public final void rule__ClipboardContent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2689:1: ( ( 'the' ) )
            // InternalSeleniumDsl.g:2690:1: ( 'the' )
            {
            // InternalSeleniumDsl.g:2690:1: ( 'the' )
            // InternalSeleniumDsl.g:2691:2: 'the'
            {
             before(grammarAccess.getClipboardContentAccess().getTheKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getClipboardContentAccess().getTheKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClipboardContent__Group__0__Impl"


    // $ANTLR start "rule__ClipboardContent__Group__1"
    // InternalSeleniumDsl.g:2700:1: rule__ClipboardContent__Group__1 : rule__ClipboardContent__Group__1__Impl rule__ClipboardContent__Group__2 ;
    public final void rule__ClipboardContent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2704:1: ( rule__ClipboardContent__Group__1__Impl rule__ClipboardContent__Group__2 )
            // InternalSeleniumDsl.g:2705:2: rule__ClipboardContent__Group__1__Impl rule__ClipboardContent__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__ClipboardContent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClipboardContent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClipboardContent__Group__1"


    // $ANTLR start "rule__ClipboardContent__Group__1__Impl"
    // InternalSeleniumDsl.g:2712:1: rule__ClipboardContent__Group__1__Impl : ( 'saved' ) ;
    public final void rule__ClipboardContent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2716:1: ( ( 'saved' ) )
            // InternalSeleniumDsl.g:2717:1: ( 'saved' )
            {
            // InternalSeleniumDsl.g:2717:1: ( 'saved' )
            // InternalSeleniumDsl.g:2718:2: 'saved'
            {
             before(grammarAccess.getClipboardContentAccess().getSavedKeyword_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getClipboardContentAccess().getSavedKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClipboardContent__Group__1__Impl"


    // $ANTLR start "rule__ClipboardContent__Group__2"
    // InternalSeleniumDsl.g:2727:1: rule__ClipboardContent__Group__2 : rule__ClipboardContent__Group__2__Impl rule__ClipboardContent__Group__3 ;
    public final void rule__ClipboardContent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2731:1: ( rule__ClipboardContent__Group__2__Impl rule__ClipboardContent__Group__3 )
            // InternalSeleniumDsl.g:2732:2: rule__ClipboardContent__Group__2__Impl rule__ClipboardContent__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ClipboardContent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClipboardContent__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClipboardContent__Group__2"


    // $ANTLR start "rule__ClipboardContent__Group__2__Impl"
    // InternalSeleniumDsl.g:2739:1: rule__ClipboardContent__Group__2__Impl : ( 'content' ) ;
    public final void rule__ClipboardContent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2743:1: ( ( 'content' ) )
            // InternalSeleniumDsl.g:2744:1: ( 'content' )
            {
            // InternalSeleniumDsl.g:2744:1: ( 'content' )
            // InternalSeleniumDsl.g:2745:2: 'content'
            {
             before(grammarAccess.getClipboardContentAccess().getContentKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getClipboardContentAccess().getContentKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClipboardContent__Group__2__Impl"


    // $ANTLR start "rule__ClipboardContent__Group__3"
    // InternalSeleniumDsl.g:2754:1: rule__ClipboardContent__Group__3 : rule__ClipboardContent__Group__3__Impl ;
    public final void rule__ClipboardContent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2758:1: ( rule__ClipboardContent__Group__3__Impl )
            // InternalSeleniumDsl.g:2759:2: rule__ClipboardContent__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClipboardContent__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClipboardContent__Group__3"


    // $ANTLR start "rule__ClipboardContent__Group__3__Impl"
    // InternalSeleniumDsl.g:2765:1: rule__ClipboardContent__Group__3__Impl : ( ( rule__ClipboardContent__KeyAssignment_3 ) ) ;
    public final void rule__ClipboardContent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2769:1: ( ( ( rule__ClipboardContent__KeyAssignment_3 ) ) )
            // InternalSeleniumDsl.g:2770:1: ( ( rule__ClipboardContent__KeyAssignment_3 ) )
            {
            // InternalSeleniumDsl.g:2770:1: ( ( rule__ClipboardContent__KeyAssignment_3 ) )
            // InternalSeleniumDsl.g:2771:2: ( rule__ClipboardContent__KeyAssignment_3 )
            {
             before(grammarAccess.getClipboardContentAccess().getKeyAssignment_3()); 
            // InternalSeleniumDsl.g:2772:2: ( rule__ClipboardContent__KeyAssignment_3 )
            // InternalSeleniumDsl.g:2772:3: rule__ClipboardContent__KeyAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ClipboardContent__KeyAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getClipboardContentAccess().getKeyAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClipboardContent__Group__3__Impl"


    // $ANTLR start "rule__Properties__Group__0"
    // InternalSeleniumDsl.g:2781:1: rule__Properties__Group__0 : rule__Properties__Group__0__Impl rule__Properties__Group__1 ;
    public final void rule__Properties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2785:1: ( rule__Properties__Group__0__Impl rule__Properties__Group__1 )
            // InternalSeleniumDsl.g:2786:2: rule__Properties__Group__0__Impl rule__Properties__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__Properties__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Properties__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group__0"


    // $ANTLR start "rule__Properties__Group__0__Impl"
    // InternalSeleniumDsl.g:2793:1: rule__Properties__Group__0__Impl : ( ( rule__Properties__PropertiesAssignment_0 ) ) ;
    public final void rule__Properties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2797:1: ( ( ( rule__Properties__PropertiesAssignment_0 ) ) )
            // InternalSeleniumDsl.g:2798:1: ( ( rule__Properties__PropertiesAssignment_0 ) )
            {
            // InternalSeleniumDsl.g:2798:1: ( ( rule__Properties__PropertiesAssignment_0 ) )
            // InternalSeleniumDsl.g:2799:2: ( rule__Properties__PropertiesAssignment_0 )
            {
             before(grammarAccess.getPropertiesAccess().getPropertiesAssignment_0()); 
            // InternalSeleniumDsl.g:2800:2: ( rule__Properties__PropertiesAssignment_0 )
            // InternalSeleniumDsl.g:2800:3: rule__Properties__PropertiesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Properties__PropertiesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertiesAccess().getPropertiesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group__0__Impl"


    // $ANTLR start "rule__Properties__Group__1"
    // InternalSeleniumDsl.g:2808:1: rule__Properties__Group__1 : rule__Properties__Group__1__Impl ;
    public final void rule__Properties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2812:1: ( rule__Properties__Group__1__Impl )
            // InternalSeleniumDsl.g:2813:2: rule__Properties__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Properties__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group__1"


    // $ANTLR start "rule__Properties__Group__1__Impl"
    // InternalSeleniumDsl.g:2819:1: rule__Properties__Group__1__Impl : ( ( rule__Properties__Group_1__0 )* ) ;
    public final void rule__Properties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2823:1: ( ( ( rule__Properties__Group_1__0 )* ) )
            // InternalSeleniumDsl.g:2824:1: ( ( rule__Properties__Group_1__0 )* )
            {
            // InternalSeleniumDsl.g:2824:1: ( ( rule__Properties__Group_1__0 )* )
            // InternalSeleniumDsl.g:2825:2: ( rule__Properties__Group_1__0 )*
            {
             before(grammarAccess.getPropertiesAccess().getGroup_1()); 
            // InternalSeleniumDsl.g:2826:2: ( rule__Properties__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==47) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSeleniumDsl.g:2826:3: rule__Properties__Group_1__0
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__Properties__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getPropertiesAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group__1__Impl"


    // $ANTLR start "rule__Properties__Group_1__0"
    // InternalSeleniumDsl.g:2835:1: rule__Properties__Group_1__0 : rule__Properties__Group_1__0__Impl rule__Properties__Group_1__1 ;
    public final void rule__Properties__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2839:1: ( rule__Properties__Group_1__0__Impl rule__Properties__Group_1__1 )
            // InternalSeleniumDsl.g:2840:2: rule__Properties__Group_1__0__Impl rule__Properties__Group_1__1
            {
            pushFollow(FOLLOW_34);
            rule__Properties__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Properties__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group_1__0"


    // $ANTLR start "rule__Properties__Group_1__0__Impl"
    // InternalSeleniumDsl.g:2847:1: rule__Properties__Group_1__0__Impl : ( 'and' ) ;
    public final void rule__Properties__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2851:1: ( ( 'and' ) )
            // InternalSeleniumDsl.g:2852:1: ( 'and' )
            {
            // InternalSeleniumDsl.g:2852:1: ( 'and' )
            // InternalSeleniumDsl.g:2853:2: 'and'
            {
             before(grammarAccess.getPropertiesAccess().getAndKeyword_1_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getPropertiesAccess().getAndKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group_1__0__Impl"


    // $ANTLR start "rule__Properties__Group_1__1"
    // InternalSeleniumDsl.g:2862:1: rule__Properties__Group_1__1 : rule__Properties__Group_1__1__Impl ;
    public final void rule__Properties__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2866:1: ( rule__Properties__Group_1__1__Impl )
            // InternalSeleniumDsl.g:2867:2: rule__Properties__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Properties__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group_1__1"


    // $ANTLR start "rule__Properties__Group_1__1__Impl"
    // InternalSeleniumDsl.g:2873:1: rule__Properties__Group_1__1__Impl : ( ( rule__Properties__PropertiesAssignment_1_1 ) ) ;
    public final void rule__Properties__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2877:1: ( ( ( rule__Properties__PropertiesAssignment_1_1 ) ) )
            // InternalSeleniumDsl.g:2878:1: ( ( rule__Properties__PropertiesAssignment_1_1 ) )
            {
            // InternalSeleniumDsl.g:2878:1: ( ( rule__Properties__PropertiesAssignment_1_1 ) )
            // InternalSeleniumDsl.g:2879:2: ( rule__Properties__PropertiesAssignment_1_1 )
            {
             before(grammarAccess.getPropertiesAccess().getPropertiesAssignment_1_1()); 
            // InternalSeleniumDsl.g:2880:2: ( rule__Properties__PropertiesAssignment_1_1 )
            // InternalSeleniumDsl.g:2880:3: rule__Properties__PropertiesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Properties__PropertiesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertiesAccess().getPropertiesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group_1__1__Impl"


    // $ANTLR start "rule__ElementProperty__Group__0"
    // InternalSeleniumDsl.g:2889:1: rule__ElementProperty__Group__0 : rule__ElementProperty__Group__0__Impl rule__ElementProperty__Group__1 ;
    public final void rule__ElementProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2893:1: ( rule__ElementProperty__Group__0__Impl rule__ElementProperty__Group__1 )
            // InternalSeleniumDsl.g:2894:2: rule__ElementProperty__Group__0__Impl rule__ElementProperty__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__ElementProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementProperty__Group__0"


    // $ANTLR start "rule__ElementProperty__Group__0__Impl"
    // InternalSeleniumDsl.g:2901:1: rule__ElementProperty__Group__0__Impl : ( ( rule__ElementProperty__NegatedAssignment_0 )? ) ;
    public final void rule__ElementProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2905:1: ( ( ( rule__ElementProperty__NegatedAssignment_0 )? ) )
            // InternalSeleniumDsl.g:2906:1: ( ( rule__ElementProperty__NegatedAssignment_0 )? )
            {
            // InternalSeleniumDsl.g:2906:1: ( ( rule__ElementProperty__NegatedAssignment_0 )? )
            // InternalSeleniumDsl.g:2907:2: ( rule__ElementProperty__NegatedAssignment_0 )?
            {
             before(grammarAccess.getElementPropertyAccess().getNegatedAssignment_0()); 
            // InternalSeleniumDsl.g:2908:2: ( rule__ElementProperty__NegatedAssignment_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==54) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSeleniumDsl.g:2908:3: rule__ElementProperty__NegatedAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ElementProperty__NegatedAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElementPropertyAccess().getNegatedAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementProperty__Group__0__Impl"


    // $ANTLR start "rule__ElementProperty__Group__1"
    // InternalSeleniumDsl.g:2916:1: rule__ElementProperty__Group__1 : rule__ElementProperty__Group__1__Impl ;
    public final void rule__ElementProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2920:1: ( rule__ElementProperty__Group__1__Impl )
            // InternalSeleniumDsl.g:2921:2: rule__ElementProperty__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementProperty__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementProperty__Group__1"


    // $ANTLR start "rule__ElementProperty__Group__1__Impl"
    // InternalSeleniumDsl.g:2927:1: rule__ElementProperty__Group__1__Impl : ( ( rule__ElementProperty__PropertyAssignment_1 ) ) ;
    public final void rule__ElementProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2931:1: ( ( ( rule__ElementProperty__PropertyAssignment_1 ) ) )
            // InternalSeleniumDsl.g:2932:1: ( ( rule__ElementProperty__PropertyAssignment_1 ) )
            {
            // InternalSeleniumDsl.g:2932:1: ( ( rule__ElementProperty__PropertyAssignment_1 ) )
            // InternalSeleniumDsl.g:2933:2: ( rule__ElementProperty__PropertyAssignment_1 )
            {
             before(grammarAccess.getElementPropertyAccess().getPropertyAssignment_1()); 
            // InternalSeleniumDsl.g:2934:2: ( rule__ElementProperty__PropertyAssignment_1 )
            // InternalSeleniumDsl.g:2934:3: rule__ElementProperty__PropertyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ElementProperty__PropertyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getElementPropertyAccess().getPropertyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementProperty__Group__1__Impl"


    // $ANTLR start "rule__AllPredicate__Group__0"
    // InternalSeleniumDsl.g:2943:1: rule__AllPredicate__Group__0 : rule__AllPredicate__Group__0__Impl rule__AllPredicate__Group__1 ;
    public final void rule__AllPredicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2947:1: ( rule__AllPredicate__Group__0__Impl rule__AllPredicate__Group__1 )
            // InternalSeleniumDsl.g:2948:2: rule__AllPredicate__Group__0__Impl rule__AllPredicate__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__AllPredicate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllPredicate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllPredicate__Group__0"


    // $ANTLR start "rule__AllPredicate__Group__0__Impl"
    // InternalSeleniumDsl.g:2955:1: rule__AllPredicate__Group__0__Impl : ( () ) ;
    public final void rule__AllPredicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2959:1: ( ( () ) )
            // InternalSeleniumDsl.g:2960:1: ( () )
            {
            // InternalSeleniumDsl.g:2960:1: ( () )
            // InternalSeleniumDsl.g:2961:2: ()
            {
             before(grammarAccess.getAllPredicateAccess().getAllPredicateAction_0()); 
            // InternalSeleniumDsl.g:2962:2: ()
            // InternalSeleniumDsl.g:2962:3: 
            {
            }

             after(grammarAccess.getAllPredicateAccess().getAllPredicateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllPredicate__Group__0__Impl"


    // $ANTLR start "rule__AllPredicate__Group__1"
    // InternalSeleniumDsl.g:2970:1: rule__AllPredicate__Group__1 : rule__AllPredicate__Group__1__Impl rule__AllPredicate__Group__2 ;
    public final void rule__AllPredicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2974:1: ( rule__AllPredicate__Group__1__Impl rule__AllPredicate__Group__2 )
            // InternalSeleniumDsl.g:2975:2: rule__AllPredicate__Group__1__Impl rule__AllPredicate__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__AllPredicate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllPredicate__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllPredicate__Group__1"


    // $ANTLR start "rule__AllPredicate__Group__1__Impl"
    // InternalSeleniumDsl.g:2982:1: rule__AllPredicate__Group__1__Impl : ( 'all' ) ;
    public final void rule__AllPredicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2986:1: ( ( 'all' ) )
            // InternalSeleniumDsl.g:2987:1: ( 'all' )
            {
            // InternalSeleniumDsl.g:2987:1: ( 'all' )
            // InternalSeleniumDsl.g:2988:2: 'all'
            {
             before(grammarAccess.getAllPredicateAccess().getAllKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getAllPredicateAccess().getAllKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllPredicate__Group__1__Impl"


    // $ANTLR start "rule__AllPredicate__Group__2"
    // InternalSeleniumDsl.g:2997:1: rule__AllPredicate__Group__2 : rule__AllPredicate__Group__2__Impl rule__AllPredicate__Group__3 ;
    public final void rule__AllPredicate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3001:1: ( rule__AllPredicate__Group__2__Impl rule__AllPredicate__Group__3 )
            // InternalSeleniumDsl.g:3002:2: rule__AllPredicate__Group__2__Impl rule__AllPredicate__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__AllPredicate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllPredicate__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllPredicate__Group__2"


    // $ANTLR start "rule__AllPredicate__Group__2__Impl"
    // InternalSeleniumDsl.g:3009:1: rule__AllPredicate__Group__2__Impl : ( 'elements' ) ;
    public final void rule__AllPredicate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3013:1: ( ( 'elements' ) )
            // InternalSeleniumDsl.g:3014:1: ( 'elements' )
            {
            // InternalSeleniumDsl.g:3014:1: ( 'elements' )
            // InternalSeleniumDsl.g:3015:2: 'elements'
            {
             before(grammarAccess.getAllPredicateAccess().getElementsKeyword_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getAllPredicateAccess().getElementsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllPredicate__Group__2__Impl"


    // $ANTLR start "rule__AllPredicate__Group__3"
    // InternalSeleniumDsl.g:3024:1: rule__AllPredicate__Group__3 : rule__AllPredicate__Group__3__Impl rule__AllPredicate__Group__4 ;
    public final void rule__AllPredicate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3028:1: ( rule__AllPredicate__Group__3__Impl rule__AllPredicate__Group__4 )
            // InternalSeleniumDsl.g:3029:2: rule__AllPredicate__Group__3__Impl rule__AllPredicate__Group__4
            {
            pushFollow(FOLLOW_41);
            rule__AllPredicate__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllPredicate__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllPredicate__Group__3"


    // $ANTLR start "rule__AllPredicate__Group__3__Impl"
    // InternalSeleniumDsl.g:3036:1: rule__AllPredicate__Group__3__Impl : ( 'of' ) ;
    public final void rule__AllPredicate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3040:1: ( ( 'of' ) )
            // InternalSeleniumDsl.g:3041:1: ( 'of' )
            {
            // InternalSeleniumDsl.g:3041:1: ( 'of' )
            // InternalSeleniumDsl.g:3042:2: 'of'
            {
             before(grammarAccess.getAllPredicateAccess().getOfKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAllPredicateAccess().getOfKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllPredicate__Group__3__Impl"


    // $ANTLR start "rule__AllPredicate__Group__4"
    // InternalSeleniumDsl.g:3051:1: rule__AllPredicate__Group__4 : rule__AllPredicate__Group__4__Impl ;
    public final void rule__AllPredicate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3055:1: ( rule__AllPredicate__Group__4__Impl )
            // InternalSeleniumDsl.g:3056:2: rule__AllPredicate__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllPredicate__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllPredicate__Group__4"


    // $ANTLR start "rule__AllPredicate__Group__4__Impl"
    // InternalSeleniumDsl.g:3062:1: rule__AllPredicate__Group__4__Impl : ( 'type' ) ;
    public final void rule__AllPredicate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3066:1: ( ( 'type' ) )
            // InternalSeleniumDsl.g:3067:1: ( 'type' )
            {
            // InternalSeleniumDsl.g:3067:1: ( 'type' )
            // InternalSeleniumDsl.g:3068:2: 'type'
            {
             before(grammarAccess.getAllPredicateAccess().getTypeKeyword_4()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getAllPredicateAccess().getTypeKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllPredicate__Group__4__Impl"


    // $ANTLR start "rule__OrdinalPredicate__Group__0"
    // InternalSeleniumDsl.g:3078:1: rule__OrdinalPredicate__Group__0 : rule__OrdinalPredicate__Group__0__Impl rule__OrdinalPredicate__Group__1 ;
    public final void rule__OrdinalPredicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3082:1: ( rule__OrdinalPredicate__Group__0__Impl rule__OrdinalPredicate__Group__1 )
            // InternalSeleniumDsl.g:3083:2: rule__OrdinalPredicate__Group__0__Impl rule__OrdinalPredicate__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__OrdinalPredicate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrdinalPredicate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdinalPredicate__Group__0"


    // $ANTLR start "rule__OrdinalPredicate__Group__0__Impl"
    // InternalSeleniumDsl.g:3090:1: rule__OrdinalPredicate__Group__0__Impl : ( 'the' ) ;
    public final void rule__OrdinalPredicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3094:1: ( ( 'the' ) )
            // InternalSeleniumDsl.g:3095:1: ( 'the' )
            {
            // InternalSeleniumDsl.g:3095:1: ( 'the' )
            // InternalSeleniumDsl.g:3096:2: 'the'
            {
             before(grammarAccess.getOrdinalPredicateAccess().getTheKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getOrdinalPredicateAccess().getTheKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdinalPredicate__Group__0__Impl"


    // $ANTLR start "rule__OrdinalPredicate__Group__1"
    // InternalSeleniumDsl.g:3105:1: rule__OrdinalPredicate__Group__1 : rule__OrdinalPredicate__Group__1__Impl ;
    public final void rule__OrdinalPredicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3109:1: ( rule__OrdinalPredicate__Group__1__Impl )
            // InternalSeleniumDsl.g:3110:2: rule__OrdinalPredicate__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrdinalPredicate__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdinalPredicate__Group__1"


    // $ANTLR start "rule__OrdinalPredicate__Group__1__Impl"
    // InternalSeleniumDsl.g:3116:1: rule__OrdinalPredicate__Group__1__Impl : ( ( rule__OrdinalPredicate__OrdinalAssignment_1 ) ) ;
    public final void rule__OrdinalPredicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3120:1: ( ( ( rule__OrdinalPredicate__OrdinalAssignment_1 ) ) )
            // InternalSeleniumDsl.g:3121:1: ( ( rule__OrdinalPredicate__OrdinalAssignment_1 ) )
            {
            // InternalSeleniumDsl.g:3121:1: ( ( rule__OrdinalPredicate__OrdinalAssignment_1 ) )
            // InternalSeleniumDsl.g:3122:2: ( rule__OrdinalPredicate__OrdinalAssignment_1 )
            {
             before(grammarAccess.getOrdinalPredicateAccess().getOrdinalAssignment_1()); 
            // InternalSeleniumDsl.g:3123:2: ( rule__OrdinalPredicate__OrdinalAssignment_1 )
            // InternalSeleniumDsl.g:3123:3: rule__OrdinalPredicate__OrdinalAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OrdinalPredicate__OrdinalAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOrdinalPredicateAccess().getOrdinalAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdinalPredicate__Group__1__Impl"


    // $ANTLR start "rule__LastPredicate__Group__0"
    // InternalSeleniumDsl.g:3132:1: rule__LastPredicate__Group__0 : rule__LastPredicate__Group__0__Impl rule__LastPredicate__Group__1 ;
    public final void rule__LastPredicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3136:1: ( rule__LastPredicate__Group__0__Impl rule__LastPredicate__Group__1 )
            // InternalSeleniumDsl.g:3137:2: rule__LastPredicate__Group__0__Impl rule__LastPredicate__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__LastPredicate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LastPredicate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LastPredicate__Group__0"


    // $ANTLR start "rule__LastPredicate__Group__0__Impl"
    // InternalSeleniumDsl.g:3144:1: rule__LastPredicate__Group__0__Impl : ( () ) ;
    public final void rule__LastPredicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3148:1: ( ( () ) )
            // InternalSeleniumDsl.g:3149:1: ( () )
            {
            // InternalSeleniumDsl.g:3149:1: ( () )
            // InternalSeleniumDsl.g:3150:2: ()
            {
             before(grammarAccess.getLastPredicateAccess().getLastPredicateAction_0()); 
            // InternalSeleniumDsl.g:3151:2: ()
            // InternalSeleniumDsl.g:3151:3: 
            {
            }

             after(grammarAccess.getLastPredicateAccess().getLastPredicateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LastPredicate__Group__0__Impl"


    // $ANTLR start "rule__LastPredicate__Group__1"
    // InternalSeleniumDsl.g:3159:1: rule__LastPredicate__Group__1 : rule__LastPredicate__Group__1__Impl rule__LastPredicate__Group__2 ;
    public final void rule__LastPredicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3163:1: ( rule__LastPredicate__Group__1__Impl rule__LastPredicate__Group__2 )
            // InternalSeleniumDsl.g:3164:2: rule__LastPredicate__Group__1__Impl rule__LastPredicate__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__LastPredicate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LastPredicate__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LastPredicate__Group__1"


    // $ANTLR start "rule__LastPredicate__Group__1__Impl"
    // InternalSeleniumDsl.g:3171:1: rule__LastPredicate__Group__1__Impl : ( 'the' ) ;
    public final void rule__LastPredicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3175:1: ( ( 'the' ) )
            // InternalSeleniumDsl.g:3176:1: ( 'the' )
            {
            // InternalSeleniumDsl.g:3176:1: ( 'the' )
            // InternalSeleniumDsl.g:3177:2: 'the'
            {
             before(grammarAccess.getLastPredicateAccess().getTheKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLastPredicateAccess().getTheKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LastPredicate__Group__1__Impl"


    // $ANTLR start "rule__LastPredicate__Group__2"
    // InternalSeleniumDsl.g:3186:1: rule__LastPredicate__Group__2 : rule__LastPredicate__Group__2__Impl ;
    public final void rule__LastPredicate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3190:1: ( rule__LastPredicate__Group__2__Impl )
            // InternalSeleniumDsl.g:3191:2: rule__LastPredicate__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LastPredicate__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LastPredicate__Group__2"


    // $ANTLR start "rule__LastPredicate__Group__2__Impl"
    // InternalSeleniumDsl.g:3197:1: rule__LastPredicate__Group__2__Impl : ( 'last' ) ;
    public final void rule__LastPredicate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3201:1: ( ( 'last' ) )
            // InternalSeleniumDsl.g:3202:1: ( 'last' )
            {
            // InternalSeleniumDsl.g:3202:1: ( 'last' )
            // InternalSeleniumDsl.g:3203:2: 'last'
            {
             before(grammarAccess.getLastPredicateAccess().getLastKeyword_2()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getLastPredicateAccess().getLastKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LastPredicate__Group__2__Impl"


    // $ANTLR start "rule__DefaultFirstPredicate__Group__0"
    // InternalSeleniumDsl.g:3213:1: rule__DefaultFirstPredicate__Group__0 : rule__DefaultFirstPredicate__Group__0__Impl rule__DefaultFirstPredicate__Group__1 ;
    public final void rule__DefaultFirstPredicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3217:1: ( rule__DefaultFirstPredicate__Group__0__Impl rule__DefaultFirstPredicate__Group__1 )
            // InternalSeleniumDsl.g:3218:2: rule__DefaultFirstPredicate__Group__0__Impl rule__DefaultFirstPredicate__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__DefaultFirstPredicate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefaultFirstPredicate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultFirstPredicate__Group__0"


    // $ANTLR start "rule__DefaultFirstPredicate__Group__0__Impl"
    // InternalSeleniumDsl.g:3225:1: rule__DefaultFirstPredicate__Group__0__Impl : ( () ) ;
    public final void rule__DefaultFirstPredicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3229:1: ( ( () ) )
            // InternalSeleniumDsl.g:3230:1: ( () )
            {
            // InternalSeleniumDsl.g:3230:1: ( () )
            // InternalSeleniumDsl.g:3231:2: ()
            {
             before(grammarAccess.getDefaultFirstPredicateAccess().getDefaultFirstPredicateAction_0()); 
            // InternalSeleniumDsl.g:3232:2: ()
            // InternalSeleniumDsl.g:3232:3: 
            {
            }

             after(grammarAccess.getDefaultFirstPredicateAccess().getDefaultFirstPredicateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultFirstPredicate__Group__0__Impl"


    // $ANTLR start "rule__DefaultFirstPredicate__Group__1"
    // InternalSeleniumDsl.g:3240:1: rule__DefaultFirstPredicate__Group__1 : rule__DefaultFirstPredicate__Group__1__Impl ;
    public final void rule__DefaultFirstPredicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3244:1: ( rule__DefaultFirstPredicate__Group__1__Impl )
            // InternalSeleniumDsl.g:3245:2: rule__DefaultFirstPredicate__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefaultFirstPredicate__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultFirstPredicate__Group__1"


    // $ANTLR start "rule__DefaultFirstPredicate__Group__1__Impl"
    // InternalSeleniumDsl.g:3251:1: rule__DefaultFirstPredicate__Group__1__Impl : ( 'the' ) ;
    public final void rule__DefaultFirstPredicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3255:1: ( ( 'the' ) )
            // InternalSeleniumDsl.g:3256:1: ( 'the' )
            {
            // InternalSeleniumDsl.g:3256:1: ( 'the' )
            // InternalSeleniumDsl.g:3257:2: 'the'
            {
             before(grammarAccess.getDefaultFirstPredicateAccess().getTheKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDefaultFirstPredicateAccess().getTheKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultFirstPredicate__Group__1__Impl"


    // $ANTLR start "rule__Verify__Group__0"
    // InternalSeleniumDsl.g:3267:1: rule__Verify__Group__0 : rule__Verify__Group__0__Impl rule__Verify__Group__1 ;
    public final void rule__Verify__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3271:1: ( rule__Verify__Group__0__Impl rule__Verify__Group__1 )
            // InternalSeleniumDsl.g:3272:2: rule__Verify__Group__0__Impl rule__Verify__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__Verify__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Verify__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__0"


    // $ANTLR start "rule__Verify__Group__0__Impl"
    // InternalSeleniumDsl.g:3279:1: rule__Verify__Group__0__Impl : ( 'verify' ) ;
    public final void rule__Verify__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3283:1: ( ( 'verify' ) )
            // InternalSeleniumDsl.g:3284:1: ( 'verify' )
            {
            // InternalSeleniumDsl.g:3284:1: ( 'verify' )
            // InternalSeleniumDsl.g:3285:2: 'verify'
            {
             before(grammarAccess.getVerifyAccess().getVerifyKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getVerifyAccess().getVerifyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__0__Impl"


    // $ANTLR start "rule__Verify__Group__1"
    // InternalSeleniumDsl.g:3294:1: rule__Verify__Group__1 : rule__Verify__Group__1__Impl rule__Verify__Group__2 ;
    public final void rule__Verify__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3298:1: ( rule__Verify__Group__1__Impl rule__Verify__Group__2 )
            // InternalSeleniumDsl.g:3299:2: rule__Verify__Group__1__Impl rule__Verify__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Verify__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Verify__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__1"


    // $ANTLR start "rule__Verify__Group__1__Impl"
    // InternalSeleniumDsl.g:3306:1: rule__Verify__Group__1__Impl : ( 'that' ) ;
    public final void rule__Verify__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3310:1: ( ( 'that' ) )
            // InternalSeleniumDsl.g:3311:1: ( 'that' )
            {
            // InternalSeleniumDsl.g:3311:1: ( 'that' )
            // InternalSeleniumDsl.g:3312:2: 'that'
            {
             before(grammarAccess.getVerifyAccess().getThatKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getVerifyAccess().getThatKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__1__Impl"


    // $ANTLR start "rule__Verify__Group__2"
    // InternalSeleniumDsl.g:3321:1: rule__Verify__Group__2 : rule__Verify__Group__2__Impl rule__Verify__Group__3 ;
    public final void rule__Verify__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3325:1: ( rule__Verify__Group__2__Impl rule__Verify__Group__3 )
            // InternalSeleniumDsl.g:3326:2: rule__Verify__Group__2__Impl rule__Verify__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__Verify__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Verify__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__2"


    // $ANTLR start "rule__Verify__Group__2__Impl"
    // InternalSeleniumDsl.g:3333:1: rule__Verify__Group__2__Impl : ( ( rule__Verify__SelectorAssignment_2 ) ) ;
    public final void rule__Verify__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3337:1: ( ( ( rule__Verify__SelectorAssignment_2 ) ) )
            // InternalSeleniumDsl.g:3338:1: ( ( rule__Verify__SelectorAssignment_2 ) )
            {
            // InternalSeleniumDsl.g:3338:1: ( ( rule__Verify__SelectorAssignment_2 ) )
            // InternalSeleniumDsl.g:3339:2: ( rule__Verify__SelectorAssignment_2 )
            {
             before(grammarAccess.getVerifyAccess().getSelectorAssignment_2()); 
            // InternalSeleniumDsl.g:3340:2: ( rule__Verify__SelectorAssignment_2 )
            // InternalSeleniumDsl.g:3340:3: rule__Verify__SelectorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Verify__SelectorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVerifyAccess().getSelectorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__2__Impl"


    // $ANTLR start "rule__Verify__Group__3"
    // InternalSeleniumDsl.g:3348:1: rule__Verify__Group__3 : rule__Verify__Group__3__Impl rule__Verify__Group__4 ;
    public final void rule__Verify__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3352:1: ( rule__Verify__Group__3__Impl rule__Verify__Group__4 )
            // InternalSeleniumDsl.g:3353:2: rule__Verify__Group__3__Impl rule__Verify__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__Verify__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Verify__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__3"


    // $ANTLR start "rule__Verify__Group__3__Impl"
    // InternalSeleniumDsl.g:3360:1: rule__Verify__Group__3__Impl : ( 'is' ) ;
    public final void rule__Verify__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3364:1: ( ( 'is' ) )
            // InternalSeleniumDsl.g:3365:1: ( 'is' )
            {
            // InternalSeleniumDsl.g:3365:1: ( 'is' )
            // InternalSeleniumDsl.g:3366:2: 'is'
            {
             before(grammarAccess.getVerifyAccess().getIsKeyword_3()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getVerifyAccess().getIsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__3__Impl"


    // $ANTLR start "rule__Verify__Group__4"
    // InternalSeleniumDsl.g:3375:1: rule__Verify__Group__4 : rule__Verify__Group__4__Impl rule__Verify__Group__5 ;
    public final void rule__Verify__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3379:1: ( rule__Verify__Group__4__Impl rule__Verify__Group__5 )
            // InternalSeleniumDsl.g:3380:2: rule__Verify__Group__4__Impl rule__Verify__Group__5
            {
            pushFollow(FOLLOW_35);
            rule__Verify__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Verify__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__4"


    // $ANTLR start "rule__Verify__Group__4__Impl"
    // InternalSeleniumDsl.g:3387:1: rule__Verify__Group__4__Impl : ( ( rule__Verify__PropertiesAssignment_4 ) ) ;
    public final void rule__Verify__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3391:1: ( ( ( rule__Verify__PropertiesAssignment_4 ) ) )
            // InternalSeleniumDsl.g:3392:1: ( ( rule__Verify__PropertiesAssignment_4 ) )
            {
            // InternalSeleniumDsl.g:3392:1: ( ( rule__Verify__PropertiesAssignment_4 ) )
            // InternalSeleniumDsl.g:3393:2: ( rule__Verify__PropertiesAssignment_4 )
            {
             before(grammarAccess.getVerifyAccess().getPropertiesAssignment_4()); 
            // InternalSeleniumDsl.g:3394:2: ( rule__Verify__PropertiesAssignment_4 )
            // InternalSeleniumDsl.g:3394:3: rule__Verify__PropertiesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Verify__PropertiesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getVerifyAccess().getPropertiesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__4__Impl"


    // $ANTLR start "rule__Verify__Group__5"
    // InternalSeleniumDsl.g:3402:1: rule__Verify__Group__5 : rule__Verify__Group__5__Impl ;
    public final void rule__Verify__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3406:1: ( rule__Verify__Group__5__Impl )
            // InternalSeleniumDsl.g:3407:2: rule__Verify__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Verify__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__5"


    // $ANTLR start "rule__Verify__Group__5__Impl"
    // InternalSeleniumDsl.g:3413:1: rule__Verify__Group__5__Impl : ( ( rule__Verify__Group_5__0 )* ) ;
    public final void rule__Verify__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3417:1: ( ( ( rule__Verify__Group_5__0 )* ) )
            // InternalSeleniumDsl.g:3418:1: ( ( rule__Verify__Group_5__0 )* )
            {
            // InternalSeleniumDsl.g:3418:1: ( ( rule__Verify__Group_5__0 )* )
            // InternalSeleniumDsl.g:3419:2: ( rule__Verify__Group_5__0 )*
            {
             before(grammarAccess.getVerifyAccess().getGroup_5()); 
            // InternalSeleniumDsl.g:3420:2: ( rule__Verify__Group_5__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==47) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSeleniumDsl.g:3420:3: rule__Verify__Group_5__0
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__Verify__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getVerifyAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__5__Impl"


    // $ANTLR start "rule__Verify__Group_5__0"
    // InternalSeleniumDsl.g:3429:1: rule__Verify__Group_5__0 : rule__Verify__Group_5__0__Impl rule__Verify__Group_5__1 ;
    public final void rule__Verify__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3433:1: ( rule__Verify__Group_5__0__Impl rule__Verify__Group_5__1 )
            // InternalSeleniumDsl.g:3434:2: rule__Verify__Group_5__0__Impl rule__Verify__Group_5__1
            {
            pushFollow(FOLLOW_34);
            rule__Verify__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Verify__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group_5__0"


    // $ANTLR start "rule__Verify__Group_5__0__Impl"
    // InternalSeleniumDsl.g:3441:1: rule__Verify__Group_5__0__Impl : ( 'and' ) ;
    public final void rule__Verify__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3445:1: ( ( 'and' ) )
            // InternalSeleniumDsl.g:3446:1: ( 'and' )
            {
            // InternalSeleniumDsl.g:3446:1: ( 'and' )
            // InternalSeleniumDsl.g:3447:2: 'and'
            {
             before(grammarAccess.getVerifyAccess().getAndKeyword_5_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getVerifyAccess().getAndKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group_5__0__Impl"


    // $ANTLR start "rule__Verify__Group_5__1"
    // InternalSeleniumDsl.g:3456:1: rule__Verify__Group_5__1 : rule__Verify__Group_5__1__Impl ;
    public final void rule__Verify__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3460:1: ( rule__Verify__Group_5__1__Impl )
            // InternalSeleniumDsl.g:3461:2: rule__Verify__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Verify__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group_5__1"


    // $ANTLR start "rule__Verify__Group_5__1__Impl"
    // InternalSeleniumDsl.g:3467:1: rule__Verify__Group_5__1__Impl : ( ( rule__Verify__PropertiesAssignment_5_1 ) ) ;
    public final void rule__Verify__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3471:1: ( ( ( rule__Verify__PropertiesAssignment_5_1 ) ) )
            // InternalSeleniumDsl.g:3472:1: ( ( rule__Verify__PropertiesAssignment_5_1 ) )
            {
            // InternalSeleniumDsl.g:3472:1: ( ( rule__Verify__PropertiesAssignment_5_1 ) )
            // InternalSeleniumDsl.g:3473:2: ( rule__Verify__PropertiesAssignment_5_1 )
            {
             before(grammarAccess.getVerifyAccess().getPropertiesAssignment_5_1()); 
            // InternalSeleniumDsl.g:3474:2: ( rule__Verify__PropertiesAssignment_5_1 )
            // InternalSeleniumDsl.g:3474:3: rule__Verify__PropertiesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Verify__PropertiesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getVerifyAccess().getPropertiesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group_5__1__Impl"


    // $ANTLR start "rule__OrdinalInteger__Group__0"
    // InternalSeleniumDsl.g:3483:1: rule__OrdinalInteger__Group__0 : rule__OrdinalInteger__Group__0__Impl rule__OrdinalInteger__Group__1 ;
    public final void rule__OrdinalInteger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3487:1: ( rule__OrdinalInteger__Group__0__Impl rule__OrdinalInteger__Group__1 )
            // InternalSeleniumDsl.g:3488:2: rule__OrdinalInteger__Group__0__Impl rule__OrdinalInteger__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__OrdinalInteger__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrdinalInteger__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdinalInteger__Group__0"


    // $ANTLR start "rule__OrdinalInteger__Group__0__Impl"
    // InternalSeleniumDsl.g:3495:1: rule__OrdinalInteger__Group__0__Impl : ( ( rule__OrdinalInteger__ValueAssignment_0 ) ) ;
    public final void rule__OrdinalInteger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3499:1: ( ( ( rule__OrdinalInteger__ValueAssignment_0 ) ) )
            // InternalSeleniumDsl.g:3500:1: ( ( rule__OrdinalInteger__ValueAssignment_0 ) )
            {
            // InternalSeleniumDsl.g:3500:1: ( ( rule__OrdinalInteger__ValueAssignment_0 ) )
            // InternalSeleniumDsl.g:3501:2: ( rule__OrdinalInteger__ValueAssignment_0 )
            {
             before(grammarAccess.getOrdinalIntegerAccess().getValueAssignment_0()); 
            // InternalSeleniumDsl.g:3502:2: ( rule__OrdinalInteger__ValueAssignment_0 )
            // InternalSeleniumDsl.g:3502:3: rule__OrdinalInteger__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__OrdinalInteger__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOrdinalIntegerAccess().getValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdinalInteger__Group__0__Impl"


    // $ANTLR start "rule__OrdinalInteger__Group__1"
    // InternalSeleniumDsl.g:3510:1: rule__OrdinalInteger__Group__1 : rule__OrdinalInteger__Group__1__Impl ;
    public final void rule__OrdinalInteger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3514:1: ( rule__OrdinalInteger__Group__1__Impl )
            // InternalSeleniumDsl.g:3515:2: rule__OrdinalInteger__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrdinalInteger__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdinalInteger__Group__1"


    // $ANTLR start "rule__OrdinalInteger__Group__1__Impl"
    // InternalSeleniumDsl.g:3521:1: rule__OrdinalInteger__Group__1__Impl : ( RULE_ORDINAL_SUFFIX ) ;
    public final void rule__OrdinalInteger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3525:1: ( ( RULE_ORDINAL_SUFFIX ) )
            // InternalSeleniumDsl.g:3526:1: ( RULE_ORDINAL_SUFFIX )
            {
            // InternalSeleniumDsl.g:3526:1: ( RULE_ORDINAL_SUFFIX )
            // InternalSeleniumDsl.g:3527:2: RULE_ORDINAL_SUFFIX
            {
             before(grammarAccess.getOrdinalIntegerAccess().getORDINAL_SUFFIXTerminalRuleCall_1()); 
            match(input,RULE_ORDINAL_SUFFIX,FOLLOW_2); 
             after(grammarAccess.getOrdinalIntegerAccess().getORDINAL_SUFFIXTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdinalInteger__Group__1__Impl"


    // $ANTLR start "rule__BrowserDsl__CasesAssignment"
    // InternalSeleniumDsl.g:3537:1: rule__BrowserDsl__CasesAssignment : ( ruleTestCase ) ;
    public final void rule__BrowserDsl__CasesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3541:1: ( ( ruleTestCase ) )
            // InternalSeleniumDsl.g:3542:2: ( ruleTestCase )
            {
            // InternalSeleniumDsl.g:3542:2: ( ruleTestCase )
            // InternalSeleniumDsl.g:3543:3: ruleTestCase
            {
             before(grammarAccess.getBrowserDslAccess().getCasesTestCaseParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTestCase();

            state._fsp--;

             after(grammarAccess.getBrowserDslAccess().getCasesTestCaseParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BrowserDsl__CasesAssignment"


    // $ANTLR start "rule__TestCase__NameAssignment_3"
    // InternalSeleniumDsl.g:3552:1: rule__TestCase__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__TestCase__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3556:1: ( ( RULE_STRING ) )
            // InternalSeleniumDsl.g:3557:2: ( RULE_STRING )
            {
            // InternalSeleniumDsl.g:3557:2: ( RULE_STRING )
            // InternalSeleniumDsl.g:3558:3: RULE_STRING
            {
             before(grammarAccess.getTestCaseAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTestCaseAccess().getNameSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestCase__NameAssignment_3"


    // $ANTLR start "rule__TestCase__CommandsAssignment_5"
    // InternalSeleniumDsl.g:3567:1: rule__TestCase__CommandsAssignment_5 : ( ruleCommand ) ;
    public final void rule__TestCase__CommandsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3571:1: ( ( ruleCommand ) )
            // InternalSeleniumDsl.g:3572:2: ( ruleCommand )
            {
            // InternalSeleniumDsl.g:3572:2: ( ruleCommand )
            // InternalSeleniumDsl.g:3573:3: ruleCommand
            {
             before(grammarAccess.getTestCaseAccess().getCommandsCommandParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getTestCaseAccess().getCommandsCommandParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestCase__CommandsAssignment_5"


    // $ANTLR start "rule__GoTo__UrlAssignment_2"
    // InternalSeleniumDsl.g:3582:1: rule__GoTo__UrlAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GoTo__UrlAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3586:1: ( ( RULE_STRING ) )
            // InternalSeleniumDsl.g:3587:2: ( RULE_STRING )
            {
            // InternalSeleniumDsl.g:3587:2: ( RULE_STRING )
            // InternalSeleniumDsl.g:3588:3: RULE_STRING
            {
             before(grammarAccess.getGoToAccess().getUrlSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGoToAccess().getUrlSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__UrlAssignment_2"


    // $ANTLR start "rule__Click__ElementAssignment_2"
    // InternalSeleniumDsl.g:3597:1: rule__Click__ElementAssignment_2 : ( ruleSelector ) ;
    public final void rule__Click__ElementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3601:1: ( ( ruleSelector ) )
            // InternalSeleniumDsl.g:3602:2: ( ruleSelector )
            {
            // InternalSeleniumDsl.g:3602:2: ( ruleSelector )
            // InternalSeleniumDsl.g:3603:3: ruleSelector
            {
             before(grammarAccess.getClickAccess().getElementSelectorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getClickAccess().getElementSelectorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__ElementAssignment_2"


    // $ANTLR start "rule__Copy__PropertyAssignment_4"
    // InternalSeleniumDsl.g:3612:1: rule__Copy__PropertyAssignment_4 : ( RULE_HTML_ATTRIBUTE ) ;
    public final void rule__Copy__PropertyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3616:1: ( ( RULE_HTML_ATTRIBUTE ) )
            // InternalSeleniumDsl.g:3617:2: ( RULE_HTML_ATTRIBUTE )
            {
            // InternalSeleniumDsl.g:3617:2: ( RULE_HTML_ATTRIBUTE )
            // InternalSeleniumDsl.g:3618:3: RULE_HTML_ATTRIBUTE
            {
             before(grammarAccess.getCopyAccess().getPropertyHTML_ATTRIBUTETerminalRuleCall_4_0()); 
            match(input,RULE_HTML_ATTRIBUTE,FOLLOW_2); 
             after(grammarAccess.getCopyAccess().getPropertyHTML_ATTRIBUTETerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__PropertyAssignment_4"


    // $ANTLR start "rule__Copy__ElementAssignment_6"
    // InternalSeleniumDsl.g:3627:1: rule__Copy__ElementAssignment_6 : ( ruleSelector ) ;
    public final void rule__Copy__ElementAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3631:1: ( ( ruleSelector ) )
            // InternalSeleniumDsl.g:3632:2: ( ruleSelector )
            {
            // InternalSeleniumDsl.g:3632:2: ( ruleSelector )
            // InternalSeleniumDsl.g:3633:3: ruleSelector
            {
             before(grammarAccess.getCopyAccess().getElementSelectorParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getCopyAccess().getElementSelectorParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__ElementAssignment_6"


    // $ANTLR start "rule__Copy__KeyAssignment_8"
    // InternalSeleniumDsl.g:3642:1: rule__Copy__KeyAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Copy__KeyAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3646:1: ( ( RULE_STRING ) )
            // InternalSeleniumDsl.g:3647:2: ( RULE_STRING )
            {
            // InternalSeleniumDsl.g:3647:2: ( RULE_STRING )
            // InternalSeleniumDsl.g:3648:3: RULE_STRING
            {
             before(grammarAccess.getCopyAccess().getKeySTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCopyAccess().getKeySTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__KeyAssignment_8"


    // $ANTLR start "rule__Paste__ElementAssignment_7"
    // InternalSeleniumDsl.g:3657:1: rule__Paste__ElementAssignment_7 : ( ruleSelector ) ;
    public final void rule__Paste__ElementAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3661:1: ( ( ruleSelector ) )
            // InternalSeleniumDsl.g:3662:2: ( ruleSelector )
            {
            // InternalSeleniumDsl.g:3662:2: ( ruleSelector )
            // InternalSeleniumDsl.g:3663:3: ruleSelector
            {
             before(grammarAccess.getPasteAccess().getElementSelectorParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getPasteAccess().getElementSelectorParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paste__ElementAssignment_7"


    // $ANTLR start "rule__Insert__ElementAssignment_1"
    // InternalSeleniumDsl.g:3672:1: rule__Insert__ElementAssignment_1 : ( ruleSelector ) ;
    public final void rule__Insert__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3676:1: ( ( ruleSelector ) )
            // InternalSeleniumDsl.g:3677:2: ( ruleSelector )
            {
            // InternalSeleniumDsl.g:3677:2: ( ruleSelector )
            // InternalSeleniumDsl.g:3678:3: ruleSelector
            {
             before(grammarAccess.getInsertAccess().getElementSelectorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getInsertAccess().getElementSelectorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__ElementAssignment_1"


    // $ANTLR start "rule__Insert__ContentAssignment_3"
    // InternalSeleniumDsl.g:3687:1: rule__Insert__ContentAssignment_3 : ( ruleContent ) ;
    public final void rule__Insert__ContentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3691:1: ( ( ruleContent ) )
            // InternalSeleniumDsl.g:3692:2: ( ruleContent )
            {
            // InternalSeleniumDsl.g:3692:2: ( ruleContent )
            // InternalSeleniumDsl.g:3693:3: ruleContent
            {
             before(grammarAccess.getInsertAccess().getContentContentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getInsertAccess().getContentContentParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__ContentAssignment_3"


    // $ANTLR start "rule__Selector__PredicateAssignment_0"
    // InternalSeleniumDsl.g:3702:1: rule__Selector__PredicateAssignment_0 : ( ruleSelectorPredicate ) ;
    public final void rule__Selector__PredicateAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3706:1: ( ( ruleSelectorPredicate ) )
            // InternalSeleniumDsl.g:3707:2: ( ruleSelectorPredicate )
            {
            // InternalSeleniumDsl.g:3707:2: ( ruleSelectorPredicate )
            // InternalSeleniumDsl.g:3708:3: ruleSelectorPredicate
            {
             before(grammarAccess.getSelectorAccess().getPredicateSelectorPredicateParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSelectorPredicate();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getPredicateSelectorPredicateParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__PredicateAssignment_0"


    // $ANTLR start "rule__Selector__DomTypeAssignment_1"
    // InternalSeleniumDsl.g:3717:1: rule__Selector__DomTypeAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Selector__DomTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3721:1: ( ( RULE_STRING ) )
            // InternalSeleniumDsl.g:3722:2: ( RULE_STRING )
            {
            // InternalSeleniumDsl.g:3722:2: ( RULE_STRING )
            // InternalSeleniumDsl.g:3723:3: RULE_STRING
            {
             before(grammarAccess.getSelectorAccess().getDomTypeSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getDomTypeSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__DomTypeAssignment_1"


    // $ANTLR start "rule__Selector__AttributesAssignment_2_2"
    // InternalSeleniumDsl.g:3732:1: rule__Selector__AttributesAssignment_2_2 : ( ruleAttributes ) ;
    public final void rule__Selector__AttributesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3736:1: ( ( ruleAttributes ) )
            // InternalSeleniumDsl.g:3737:2: ( ruleAttributes )
            {
            // InternalSeleniumDsl.g:3737:2: ( ruleAttributes )
            // InternalSeleniumDsl.g:3738:3: ruleAttributes
            {
             before(grammarAccess.getSelectorAccess().getAttributesAttributesParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributes();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getAttributesAttributesParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__AttributesAssignment_2_2"


    // $ANTLR start "rule__Selector__LabelAssignment_3_3"
    // InternalSeleniumDsl.g:3747:1: rule__Selector__LabelAssignment_3_3 : ( RULE_STRING ) ;
    public final void rule__Selector__LabelAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3751:1: ( ( RULE_STRING ) )
            // InternalSeleniumDsl.g:3752:2: ( RULE_STRING )
            {
            // InternalSeleniumDsl.g:3752:2: ( RULE_STRING )
            // InternalSeleniumDsl.g:3753:3: RULE_STRING
            {
             before(grammarAccess.getSelectorAccess().getLabelSTRINGTerminalRuleCall_3_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getLabelSTRINGTerminalRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__LabelAssignment_3_3"


    // $ANTLR start "rule__Selector__PropertiesAssignment_4_2"
    // InternalSeleniumDsl.g:3762:1: rule__Selector__PropertiesAssignment_4_2 : ( ruleProperties ) ;
    public final void rule__Selector__PropertiesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3766:1: ( ( ruleProperties ) )
            // InternalSeleniumDsl.g:3767:2: ( ruleProperties )
            {
            // InternalSeleniumDsl.g:3767:2: ( ruleProperties )
            // InternalSeleniumDsl.g:3768:3: ruleProperties
            {
             before(grammarAccess.getSelectorAccess().getPropertiesPropertiesParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleProperties();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getPropertiesPropertiesParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__PropertiesAssignment_4_2"


    // $ANTLR start "rule__Selector__ParentAssignment_5_1"
    // InternalSeleniumDsl.g:3777:1: rule__Selector__ParentAssignment_5_1 : ( ruleSelector ) ;
    public final void rule__Selector__ParentAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3781:1: ( ( ruleSelector ) )
            // InternalSeleniumDsl.g:3782:2: ( ruleSelector )
            {
            // InternalSeleniumDsl.g:3782:2: ( ruleSelector )
            // InternalSeleniumDsl.g:3783:3: ruleSelector
            {
             before(grammarAccess.getSelectorAccess().getParentSelectorParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getParentSelectorParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__ParentAssignment_5_1"


    // $ANTLR start "rule__Attributes__AttributesAssignment_0"
    // InternalSeleniumDsl.g:3792:1: rule__Attributes__AttributesAssignment_0 : ( ruleElementAttribute ) ;
    public final void rule__Attributes__AttributesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3796:1: ( ( ruleElementAttribute ) )
            // InternalSeleniumDsl.g:3797:2: ( ruleElementAttribute )
            {
            // InternalSeleniumDsl.g:3797:2: ( ruleElementAttribute )
            // InternalSeleniumDsl.g:3798:3: ruleElementAttribute
            {
             before(grammarAccess.getAttributesAccess().getAttributesElementAttributeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleElementAttribute();

            state._fsp--;

             after(grammarAccess.getAttributesAccess().getAttributesElementAttributeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__AttributesAssignment_0"


    // $ANTLR start "rule__Attributes__PropertiesAssignment_1_1"
    // InternalSeleniumDsl.g:3807:1: rule__Attributes__PropertiesAssignment_1_1 : ( ruleElementAttribute ) ;
    public final void rule__Attributes__PropertiesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3811:1: ( ( ruleElementAttribute ) )
            // InternalSeleniumDsl.g:3812:2: ( ruleElementAttribute )
            {
            // InternalSeleniumDsl.g:3812:2: ( ruleElementAttribute )
            // InternalSeleniumDsl.g:3813:3: ruleElementAttribute
            {
             before(grammarAccess.getAttributesAccess().getPropertiesElementAttributeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElementAttribute();

            state._fsp--;

             after(grammarAccess.getAttributesAccess().getPropertiesElementAttributeParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__PropertiesAssignment_1_1"


    // $ANTLR start "rule__ElementAttribute__NameAssignment_0"
    // InternalSeleniumDsl.g:3822:1: rule__ElementAttribute__NameAssignment_0 : ( RULE_HTML_ATTRIBUTE ) ;
    public final void rule__ElementAttribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3826:1: ( ( RULE_HTML_ATTRIBUTE ) )
            // InternalSeleniumDsl.g:3827:2: ( RULE_HTML_ATTRIBUTE )
            {
            // InternalSeleniumDsl.g:3827:2: ( RULE_HTML_ATTRIBUTE )
            // InternalSeleniumDsl.g:3828:3: RULE_HTML_ATTRIBUTE
            {
             before(grammarAccess.getElementAttributeAccess().getNameHTML_ATTRIBUTETerminalRuleCall_0_0()); 
            match(input,RULE_HTML_ATTRIBUTE,FOLLOW_2); 
             after(grammarAccess.getElementAttributeAccess().getNameHTML_ATTRIBUTETerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementAttribute__NameAssignment_0"


    // $ANTLR start "rule__ElementAttribute__MatcherAssignment_1"
    // InternalSeleniumDsl.g:3837:1: rule__ElementAttribute__MatcherAssignment_1 : ( ruleMatcher ) ;
    public final void rule__ElementAttribute__MatcherAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3841:1: ( ( ruleMatcher ) )
            // InternalSeleniumDsl.g:3842:2: ( ruleMatcher )
            {
            // InternalSeleniumDsl.g:3842:2: ( ruleMatcher )
            // InternalSeleniumDsl.g:3843:3: ruleMatcher
            {
             before(grammarAccess.getElementAttributeAccess().getMatcherMatcherParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMatcher();

            state._fsp--;

             after(grammarAccess.getElementAttributeAccess().getMatcherMatcherParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementAttribute__MatcherAssignment_1"


    // $ANTLR start "rule__ElementAttribute__ValueAssignment_2"
    // InternalSeleniumDsl.g:3852:1: rule__ElementAttribute__ValueAssignment_2 : ( ruleContent ) ;
    public final void rule__ElementAttribute__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3856:1: ( ( ruleContent ) )
            // InternalSeleniumDsl.g:3857:2: ( ruleContent )
            {
            // InternalSeleniumDsl.g:3857:2: ( ruleContent )
            // InternalSeleniumDsl.g:3858:3: ruleContent
            {
             before(grammarAccess.getElementAttributeAccess().getValueContentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getElementAttributeAccess().getValueContentParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementAttribute__ValueAssignment_2"


    // $ANTLR start "rule__ClipboardContent__KeyAssignment_3"
    // InternalSeleniumDsl.g:3867:1: rule__ClipboardContent__KeyAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ClipboardContent__KeyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3871:1: ( ( RULE_STRING ) )
            // InternalSeleniumDsl.g:3872:2: ( RULE_STRING )
            {
            // InternalSeleniumDsl.g:3872:2: ( RULE_STRING )
            // InternalSeleniumDsl.g:3873:3: RULE_STRING
            {
             before(grammarAccess.getClipboardContentAccess().getKeySTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getClipboardContentAccess().getKeySTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClipboardContent__KeyAssignment_3"


    // $ANTLR start "rule__StringContent__ValueAssignment"
    // InternalSeleniumDsl.g:3882:1: rule__StringContent__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringContent__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3886:1: ( ( RULE_STRING ) )
            // InternalSeleniumDsl.g:3887:2: ( RULE_STRING )
            {
            // InternalSeleniumDsl.g:3887:2: ( RULE_STRING )
            // InternalSeleniumDsl.g:3888:3: RULE_STRING
            {
             before(grammarAccess.getStringContentAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringContentAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringContent__ValueAssignment"


    // $ANTLR start "rule__Properties__PropertiesAssignment_0"
    // InternalSeleniumDsl.g:3897:1: rule__Properties__PropertiesAssignment_0 : ( ruleElementProperty ) ;
    public final void rule__Properties__PropertiesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3901:1: ( ( ruleElementProperty ) )
            // InternalSeleniumDsl.g:3902:2: ( ruleElementProperty )
            {
            // InternalSeleniumDsl.g:3902:2: ( ruleElementProperty )
            // InternalSeleniumDsl.g:3903:3: ruleElementProperty
            {
             before(grammarAccess.getPropertiesAccess().getPropertiesElementPropertyParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleElementProperty();

            state._fsp--;

             after(grammarAccess.getPropertiesAccess().getPropertiesElementPropertyParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__PropertiesAssignment_0"


    // $ANTLR start "rule__Properties__PropertiesAssignment_1_1"
    // InternalSeleniumDsl.g:3912:1: rule__Properties__PropertiesAssignment_1_1 : ( ruleElementProperty ) ;
    public final void rule__Properties__PropertiesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3916:1: ( ( ruleElementProperty ) )
            // InternalSeleniumDsl.g:3917:2: ( ruleElementProperty )
            {
            // InternalSeleniumDsl.g:3917:2: ( ruleElementProperty )
            // InternalSeleniumDsl.g:3918:3: ruleElementProperty
            {
             before(grammarAccess.getPropertiesAccess().getPropertiesElementPropertyParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElementProperty();

            state._fsp--;

             after(grammarAccess.getPropertiesAccess().getPropertiesElementPropertyParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__PropertiesAssignment_1_1"


    // $ANTLR start "rule__ElementProperty__NegatedAssignment_0"
    // InternalSeleniumDsl.g:3927:1: rule__ElementProperty__NegatedAssignment_0 : ( ( 'not' ) ) ;
    public final void rule__ElementProperty__NegatedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3931:1: ( ( ( 'not' ) ) )
            // InternalSeleniumDsl.g:3932:2: ( ( 'not' ) )
            {
            // InternalSeleniumDsl.g:3932:2: ( ( 'not' ) )
            // InternalSeleniumDsl.g:3933:3: ( 'not' )
            {
             before(grammarAccess.getElementPropertyAccess().getNegatedNotKeyword_0_0()); 
            // InternalSeleniumDsl.g:3934:3: ( 'not' )
            // InternalSeleniumDsl.g:3935:4: 'not'
            {
             before(grammarAccess.getElementPropertyAccess().getNegatedNotKeyword_0_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getElementPropertyAccess().getNegatedNotKeyword_0_0()); 

            }

             after(grammarAccess.getElementPropertyAccess().getNegatedNotKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementProperty__NegatedAssignment_0"


    // $ANTLR start "rule__ElementProperty__PropertyAssignment_1"
    // InternalSeleniumDsl.g:3946:1: rule__ElementProperty__PropertyAssignment_1 : ( ( rule__ElementProperty__PropertyAlternatives_1_0 ) ) ;
    public final void rule__ElementProperty__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3950:1: ( ( ( rule__ElementProperty__PropertyAlternatives_1_0 ) ) )
            // InternalSeleniumDsl.g:3951:2: ( ( rule__ElementProperty__PropertyAlternatives_1_0 ) )
            {
            // InternalSeleniumDsl.g:3951:2: ( ( rule__ElementProperty__PropertyAlternatives_1_0 ) )
            // InternalSeleniumDsl.g:3952:3: ( rule__ElementProperty__PropertyAlternatives_1_0 )
            {
             before(grammarAccess.getElementPropertyAccess().getPropertyAlternatives_1_0()); 
            // InternalSeleniumDsl.g:3953:3: ( rule__ElementProperty__PropertyAlternatives_1_0 )
            // InternalSeleniumDsl.g:3953:4: rule__ElementProperty__PropertyAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ElementProperty__PropertyAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getElementPropertyAccess().getPropertyAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementProperty__PropertyAssignment_1"


    // $ANTLR start "rule__OrdinalPredicate__OrdinalAssignment_1"
    // InternalSeleniumDsl.g:3961:1: rule__OrdinalPredicate__OrdinalAssignment_1 : ( ruleOrdinalInteger ) ;
    public final void rule__OrdinalPredicate__OrdinalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3965:1: ( ( ruleOrdinalInteger ) )
            // InternalSeleniumDsl.g:3966:2: ( ruleOrdinalInteger )
            {
            // InternalSeleniumDsl.g:3966:2: ( ruleOrdinalInteger )
            // InternalSeleniumDsl.g:3967:3: ruleOrdinalInteger
            {
             before(grammarAccess.getOrdinalPredicateAccess().getOrdinalOrdinalIntegerParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrdinalInteger();

            state._fsp--;

             after(grammarAccess.getOrdinalPredicateAccess().getOrdinalOrdinalIntegerParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdinalPredicate__OrdinalAssignment_1"


    // $ANTLR start "rule__Verify__SelectorAssignment_2"
    // InternalSeleniumDsl.g:3976:1: rule__Verify__SelectorAssignment_2 : ( ruleSelector ) ;
    public final void rule__Verify__SelectorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3980:1: ( ( ruleSelector ) )
            // InternalSeleniumDsl.g:3981:2: ( ruleSelector )
            {
            // InternalSeleniumDsl.g:3981:2: ( ruleSelector )
            // InternalSeleniumDsl.g:3982:3: ruleSelector
            {
             before(grammarAccess.getVerifyAccess().getSelectorSelectorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getVerifyAccess().getSelectorSelectorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__SelectorAssignment_2"


    // $ANTLR start "rule__Verify__PropertiesAssignment_4"
    // InternalSeleniumDsl.g:3991:1: rule__Verify__PropertiesAssignment_4 : ( ruleElementProperty ) ;
    public final void rule__Verify__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3995:1: ( ( ruleElementProperty ) )
            // InternalSeleniumDsl.g:3996:2: ( ruleElementProperty )
            {
            // InternalSeleniumDsl.g:3996:2: ( ruleElementProperty )
            // InternalSeleniumDsl.g:3997:3: ruleElementProperty
            {
             before(grammarAccess.getVerifyAccess().getPropertiesElementPropertyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleElementProperty();

            state._fsp--;

             after(grammarAccess.getVerifyAccess().getPropertiesElementPropertyParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__PropertiesAssignment_4"


    // $ANTLR start "rule__Verify__PropertiesAssignment_5_1"
    // InternalSeleniumDsl.g:4006:1: rule__Verify__PropertiesAssignment_5_1 : ( ruleElementProperty ) ;
    public final void rule__Verify__PropertiesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:4010:1: ( ( ruleElementProperty ) )
            // InternalSeleniumDsl.g:4011:2: ( ruleElementProperty )
            {
            // InternalSeleniumDsl.g:4011:2: ( ruleElementProperty )
            // InternalSeleniumDsl.g:4012:3: ruleElementProperty
            {
             before(grammarAccess.getVerifyAccess().getPropertiesElementPropertyParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElementProperty();

            state._fsp--;

             after(grammarAccess.getVerifyAccess().getPropertiesElementPropertyParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__PropertiesAssignment_5_1"


    // $ANTLR start "rule__OrdinalInteger__ValueAssignment_0"
    // InternalSeleniumDsl.g:4021:1: rule__OrdinalInteger__ValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__OrdinalInteger__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:4025:1: ( ( RULE_INT ) )
            // InternalSeleniumDsl.g:4026:2: ( RULE_INT )
            {
            // InternalSeleniumDsl.g:4026:2: ( RULE_INT )
            // InternalSeleniumDsl.g:4027:3: RULE_INT
            {
             before(grammarAccess.getOrdinalIntegerAccess().getValueINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getOrdinalIntegerAccess().getValueINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdinalInteger__ValueAssignment_0"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00200110A8C02000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00200110A8802002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020002000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0002000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000228000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x004000000001C000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000010L});

}