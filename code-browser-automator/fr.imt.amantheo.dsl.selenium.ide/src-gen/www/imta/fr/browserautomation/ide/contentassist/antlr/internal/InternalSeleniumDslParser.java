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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_URL", "RULE_STRING", "RULE_SUFFIX", "RULE_HTML_ATTRIBUTE", "RULE_INT", "RULE_DOMAIN", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'URL'", "'select'", "'selected'", "'visible'", "'enabled'", "'containing'", "'matching'", "'open'", "'a'", "'browser'", "'window'", "'go'", "'to'", "'click'", "'on'", "'copy'", "'the'", "'property'", "'of'", "'as'", "'paste'", "'content'", "'clipboard'", "'in'", "'fill'", "'with'", "'properties'", "'associated'", "'label'", "'that'", "'is'", "'and'", "'saved'", "'all'", "'elements'", "'type'", "'last'", "'verify'", "'not'"
    };
    public static final int T__50=50;
    public static final int RULE_HTML_ATTRIBUTE=7;
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
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int RULE_URL=4;
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
    public static final int RULE_SUFFIX=6;
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
    // InternalSeleniumDsl.g:62:1: ruleBrowserDsl : ( ( rule__BrowserDsl__CommandsAssignment )* ) ;
    public final void ruleBrowserDsl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:66:2: ( ( ( rule__BrowserDsl__CommandsAssignment )* ) )
            // InternalSeleniumDsl.g:67:2: ( ( rule__BrowserDsl__CommandsAssignment )* )
            {
            // InternalSeleniumDsl.g:67:2: ( ( rule__BrowserDsl__CommandsAssignment )* )
            // InternalSeleniumDsl.g:68:3: ( rule__BrowserDsl__CommandsAssignment )*
            {
             before(grammarAccess.getBrowserDslAccess().getCommandsAssignment()); 
            // InternalSeleniumDsl.g:69:3: ( rule__BrowserDsl__CommandsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16||LA1_0==22||LA1_0==26||LA1_0==28||LA1_0==30||LA1_0==35||LA1_0==39||LA1_0==52) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSeleniumDsl.g:69:4: rule__BrowserDsl__CommandsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__BrowserDsl__CommandsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getBrowserDslAccess().getCommandsAssignment()); 

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


    // $ANTLR start "entryRuleCommand"
    // InternalSeleniumDsl.g:78:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:79:1: ( ruleCommand EOF )
            // InternalSeleniumDsl.g:80:1: ruleCommand EOF
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
    // InternalSeleniumDsl.g:87:1: ruleCommand : ( ( rule__Command__Alternatives ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:91:2: ( ( ( rule__Command__Alternatives ) ) )
            // InternalSeleniumDsl.g:92:2: ( ( rule__Command__Alternatives ) )
            {
            // InternalSeleniumDsl.g:92:2: ( ( rule__Command__Alternatives ) )
            // InternalSeleniumDsl.g:93:3: ( rule__Command__Alternatives )
            {
             before(grammarAccess.getCommandAccess().getAlternatives()); 
            // InternalSeleniumDsl.g:94:3: ( rule__Command__Alternatives )
            // InternalSeleniumDsl.g:94:4: rule__Command__Alternatives
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
    // InternalSeleniumDsl.g:103:1: entryRuleOpenBrowser : ruleOpenBrowser EOF ;
    public final void entryRuleOpenBrowser() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:104:1: ( ruleOpenBrowser EOF )
            // InternalSeleniumDsl.g:105:1: ruleOpenBrowser EOF
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
    // InternalSeleniumDsl.g:112:1: ruleOpenBrowser : ( ( rule__OpenBrowser__Group__0 ) ) ;
    public final void ruleOpenBrowser() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:116:2: ( ( ( rule__OpenBrowser__Group__0 ) ) )
            // InternalSeleniumDsl.g:117:2: ( ( rule__OpenBrowser__Group__0 ) )
            {
            // InternalSeleniumDsl.g:117:2: ( ( rule__OpenBrowser__Group__0 ) )
            // InternalSeleniumDsl.g:118:3: ( rule__OpenBrowser__Group__0 )
            {
             before(grammarAccess.getOpenBrowserAccess().getGroup()); 
            // InternalSeleniumDsl.g:119:3: ( rule__OpenBrowser__Group__0 )
            // InternalSeleniumDsl.g:119:4: rule__OpenBrowser__Group__0
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
    // InternalSeleniumDsl.g:128:1: entryRuleDOMCommand : ruleDOMCommand EOF ;
    public final void entryRuleDOMCommand() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:129:1: ( ruleDOMCommand EOF )
            // InternalSeleniumDsl.g:130:1: ruleDOMCommand EOF
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
    // InternalSeleniumDsl.g:137:1: ruleDOMCommand : ( ( rule__DOMCommand__Alternatives ) ) ;
    public final void ruleDOMCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:141:2: ( ( ( rule__DOMCommand__Alternatives ) ) )
            // InternalSeleniumDsl.g:142:2: ( ( rule__DOMCommand__Alternatives ) )
            {
            // InternalSeleniumDsl.g:142:2: ( ( rule__DOMCommand__Alternatives ) )
            // InternalSeleniumDsl.g:143:3: ( rule__DOMCommand__Alternatives )
            {
             before(grammarAccess.getDOMCommandAccess().getAlternatives()); 
            // InternalSeleniumDsl.g:144:3: ( rule__DOMCommand__Alternatives )
            // InternalSeleniumDsl.g:144:4: rule__DOMCommand__Alternatives
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
    // InternalSeleniumDsl.g:153:1: entryRuleGoTo : ruleGoTo EOF ;
    public final void entryRuleGoTo() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:154:1: ( ruleGoTo EOF )
            // InternalSeleniumDsl.g:155:1: ruleGoTo EOF
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
    // InternalSeleniumDsl.g:162:1: ruleGoTo : ( ( rule__GoTo__Group__0 ) ) ;
    public final void ruleGoTo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:166:2: ( ( ( rule__GoTo__Group__0 ) ) )
            // InternalSeleniumDsl.g:167:2: ( ( rule__GoTo__Group__0 ) )
            {
            // InternalSeleniumDsl.g:167:2: ( ( rule__GoTo__Group__0 ) )
            // InternalSeleniumDsl.g:168:3: ( rule__GoTo__Group__0 )
            {
             before(grammarAccess.getGoToAccess().getGroup()); 
            // InternalSeleniumDsl.g:169:3: ( rule__GoTo__Group__0 )
            // InternalSeleniumDsl.g:169:4: rule__GoTo__Group__0
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
    // InternalSeleniumDsl.g:178:1: entryRuleClick : ruleClick EOF ;
    public final void entryRuleClick() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:179:1: ( ruleClick EOF )
            // InternalSeleniumDsl.g:180:1: ruleClick EOF
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
    // InternalSeleniumDsl.g:187:1: ruleClick : ( ( rule__Click__Group__0 ) ) ;
    public final void ruleClick() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:191:2: ( ( ( rule__Click__Group__0 ) ) )
            // InternalSeleniumDsl.g:192:2: ( ( rule__Click__Group__0 ) )
            {
            // InternalSeleniumDsl.g:192:2: ( ( rule__Click__Group__0 ) )
            // InternalSeleniumDsl.g:193:3: ( rule__Click__Group__0 )
            {
             before(grammarAccess.getClickAccess().getGroup()); 
            // InternalSeleniumDsl.g:194:3: ( rule__Click__Group__0 )
            // InternalSeleniumDsl.g:194:4: rule__Click__Group__0
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
    // InternalSeleniumDsl.g:203:1: entryRuleCopy : ruleCopy EOF ;
    public final void entryRuleCopy() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:204:1: ( ruleCopy EOF )
            // InternalSeleniumDsl.g:205:1: ruleCopy EOF
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
    // InternalSeleniumDsl.g:212:1: ruleCopy : ( ( rule__Copy__Group__0 ) ) ;
    public final void ruleCopy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:216:2: ( ( ( rule__Copy__Group__0 ) ) )
            // InternalSeleniumDsl.g:217:2: ( ( rule__Copy__Group__0 ) )
            {
            // InternalSeleniumDsl.g:217:2: ( ( rule__Copy__Group__0 ) )
            // InternalSeleniumDsl.g:218:3: ( rule__Copy__Group__0 )
            {
             before(grammarAccess.getCopyAccess().getGroup()); 
            // InternalSeleniumDsl.g:219:3: ( rule__Copy__Group__0 )
            // InternalSeleniumDsl.g:219:4: rule__Copy__Group__0
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
    // InternalSeleniumDsl.g:228:1: entryRulePaste : rulePaste EOF ;
    public final void entryRulePaste() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:229:1: ( rulePaste EOF )
            // InternalSeleniumDsl.g:230:1: rulePaste EOF
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
    // InternalSeleniumDsl.g:237:1: rulePaste : ( ( rule__Paste__Group__0 ) ) ;
    public final void rulePaste() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:241:2: ( ( ( rule__Paste__Group__0 ) ) )
            // InternalSeleniumDsl.g:242:2: ( ( rule__Paste__Group__0 ) )
            {
            // InternalSeleniumDsl.g:242:2: ( ( rule__Paste__Group__0 ) )
            // InternalSeleniumDsl.g:243:3: ( rule__Paste__Group__0 )
            {
             before(grammarAccess.getPasteAccess().getGroup()); 
            // InternalSeleniumDsl.g:244:3: ( rule__Paste__Group__0 )
            // InternalSeleniumDsl.g:244:4: rule__Paste__Group__0
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
    // InternalSeleniumDsl.g:253:1: entryRuleInsert : ruleInsert EOF ;
    public final void entryRuleInsert() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:254:1: ( ruleInsert EOF )
            // InternalSeleniumDsl.g:255:1: ruleInsert EOF
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
    // InternalSeleniumDsl.g:262:1: ruleInsert : ( ( rule__Insert__Group__0 ) ) ;
    public final void ruleInsert() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:266:2: ( ( ( rule__Insert__Group__0 ) ) )
            // InternalSeleniumDsl.g:267:2: ( ( rule__Insert__Group__0 ) )
            {
            // InternalSeleniumDsl.g:267:2: ( ( rule__Insert__Group__0 ) )
            // InternalSeleniumDsl.g:268:3: ( rule__Insert__Group__0 )
            {
             before(grammarAccess.getInsertAccess().getGroup()); 
            // InternalSeleniumDsl.g:269:3: ( rule__Insert__Group__0 )
            // InternalSeleniumDsl.g:269:4: rule__Insert__Group__0
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
    // InternalSeleniumDsl.g:278:1: entryRuleSelector : ruleSelector EOF ;
    public final void entryRuleSelector() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:279:1: ( ruleSelector EOF )
            // InternalSeleniumDsl.g:280:1: ruleSelector EOF
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
    // InternalSeleniumDsl.g:287:1: ruleSelector : ( ( rule__Selector__Group__0 ) ) ;
    public final void ruleSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:291:2: ( ( ( rule__Selector__Group__0 ) ) )
            // InternalSeleniumDsl.g:292:2: ( ( rule__Selector__Group__0 ) )
            {
            // InternalSeleniumDsl.g:292:2: ( ( rule__Selector__Group__0 ) )
            // InternalSeleniumDsl.g:293:3: ( rule__Selector__Group__0 )
            {
             before(grammarAccess.getSelectorAccess().getGroup()); 
            // InternalSeleniumDsl.g:294:3: ( rule__Selector__Group__0 )
            // InternalSeleniumDsl.g:294:4: rule__Selector__Group__0
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
    // InternalSeleniumDsl.g:303:1: entryRuleAttributes : ruleAttributes EOF ;
    public final void entryRuleAttributes() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:304:1: ( ruleAttributes EOF )
            // InternalSeleniumDsl.g:305:1: ruleAttributes EOF
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
    // InternalSeleniumDsl.g:312:1: ruleAttributes : ( ( rule__Attributes__Group__0 ) ) ;
    public final void ruleAttributes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:316:2: ( ( ( rule__Attributes__Group__0 ) ) )
            // InternalSeleniumDsl.g:317:2: ( ( rule__Attributes__Group__0 ) )
            {
            // InternalSeleniumDsl.g:317:2: ( ( rule__Attributes__Group__0 ) )
            // InternalSeleniumDsl.g:318:3: ( rule__Attributes__Group__0 )
            {
             before(grammarAccess.getAttributesAccess().getGroup()); 
            // InternalSeleniumDsl.g:319:3: ( rule__Attributes__Group__0 )
            // InternalSeleniumDsl.g:319:4: rule__Attributes__Group__0
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
    // InternalSeleniumDsl.g:328:1: entryRuleElementAttribute : ruleElementAttribute EOF ;
    public final void entryRuleElementAttribute() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:329:1: ( ruleElementAttribute EOF )
            // InternalSeleniumDsl.g:330:1: ruleElementAttribute EOF
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
    // InternalSeleniumDsl.g:337:1: ruleElementAttribute : ( ( rule__ElementAttribute__Group__0 ) ) ;
    public final void ruleElementAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:341:2: ( ( ( rule__ElementAttribute__Group__0 ) ) )
            // InternalSeleniumDsl.g:342:2: ( ( rule__ElementAttribute__Group__0 ) )
            {
            // InternalSeleniumDsl.g:342:2: ( ( rule__ElementAttribute__Group__0 ) )
            // InternalSeleniumDsl.g:343:3: ( rule__ElementAttribute__Group__0 )
            {
             before(grammarAccess.getElementAttributeAccess().getGroup()); 
            // InternalSeleniumDsl.g:344:3: ( rule__ElementAttribute__Group__0 )
            // InternalSeleniumDsl.g:344:4: rule__ElementAttribute__Group__0
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
    // InternalSeleniumDsl.g:353:1: entryRuleContent : ruleContent EOF ;
    public final void entryRuleContent() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:354:1: ( ruleContent EOF )
            // InternalSeleniumDsl.g:355:1: ruleContent EOF
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
    // InternalSeleniumDsl.g:362:1: ruleContent : ( ( rule__Content__Alternatives ) ) ;
    public final void ruleContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:366:2: ( ( ( rule__Content__Alternatives ) ) )
            // InternalSeleniumDsl.g:367:2: ( ( rule__Content__Alternatives ) )
            {
            // InternalSeleniumDsl.g:367:2: ( ( rule__Content__Alternatives ) )
            // InternalSeleniumDsl.g:368:3: ( rule__Content__Alternatives )
            {
             before(grammarAccess.getContentAccess().getAlternatives()); 
            // InternalSeleniumDsl.g:369:3: ( rule__Content__Alternatives )
            // InternalSeleniumDsl.g:369:4: rule__Content__Alternatives
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
    // InternalSeleniumDsl.g:378:1: entryRuleClipboardContent : ruleClipboardContent EOF ;
    public final void entryRuleClipboardContent() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:379:1: ( ruleClipboardContent EOF )
            // InternalSeleniumDsl.g:380:1: ruleClipboardContent EOF
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
    // InternalSeleniumDsl.g:387:1: ruleClipboardContent : ( ( rule__ClipboardContent__Group__0 ) ) ;
    public final void ruleClipboardContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:391:2: ( ( ( rule__ClipboardContent__Group__0 ) ) )
            // InternalSeleniumDsl.g:392:2: ( ( rule__ClipboardContent__Group__0 ) )
            {
            // InternalSeleniumDsl.g:392:2: ( ( rule__ClipboardContent__Group__0 ) )
            // InternalSeleniumDsl.g:393:3: ( rule__ClipboardContent__Group__0 )
            {
             before(grammarAccess.getClipboardContentAccess().getGroup()); 
            // InternalSeleniumDsl.g:394:3: ( rule__ClipboardContent__Group__0 )
            // InternalSeleniumDsl.g:394:4: rule__ClipboardContent__Group__0
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
    // InternalSeleniumDsl.g:403:1: entryRuleStringContent : ruleStringContent EOF ;
    public final void entryRuleStringContent() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:404:1: ( ruleStringContent EOF )
            // InternalSeleniumDsl.g:405:1: ruleStringContent EOF
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
    // InternalSeleniumDsl.g:412:1: ruleStringContent : ( ( rule__StringContent__ValueAssignment ) ) ;
    public final void ruleStringContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:416:2: ( ( ( rule__StringContent__ValueAssignment ) ) )
            // InternalSeleniumDsl.g:417:2: ( ( rule__StringContent__ValueAssignment ) )
            {
            // InternalSeleniumDsl.g:417:2: ( ( rule__StringContent__ValueAssignment ) )
            // InternalSeleniumDsl.g:418:3: ( rule__StringContent__ValueAssignment )
            {
             before(grammarAccess.getStringContentAccess().getValueAssignment()); 
            // InternalSeleniumDsl.g:419:3: ( rule__StringContent__ValueAssignment )
            // InternalSeleniumDsl.g:419:4: rule__StringContent__ValueAssignment
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
    // InternalSeleniumDsl.g:428:1: entryRuleProperties : ruleProperties EOF ;
    public final void entryRuleProperties() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:429:1: ( ruleProperties EOF )
            // InternalSeleniumDsl.g:430:1: ruleProperties EOF
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
    // InternalSeleniumDsl.g:437:1: ruleProperties : ( ( rule__Properties__Group__0 ) ) ;
    public final void ruleProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:441:2: ( ( ( rule__Properties__Group__0 ) ) )
            // InternalSeleniumDsl.g:442:2: ( ( rule__Properties__Group__0 ) )
            {
            // InternalSeleniumDsl.g:442:2: ( ( rule__Properties__Group__0 ) )
            // InternalSeleniumDsl.g:443:3: ( rule__Properties__Group__0 )
            {
             before(grammarAccess.getPropertiesAccess().getGroup()); 
            // InternalSeleniumDsl.g:444:3: ( rule__Properties__Group__0 )
            // InternalSeleniumDsl.g:444:4: rule__Properties__Group__0
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
    // InternalSeleniumDsl.g:453:1: entryRuleElementProperty : ruleElementProperty EOF ;
    public final void entryRuleElementProperty() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:454:1: ( ruleElementProperty EOF )
            // InternalSeleniumDsl.g:455:1: ruleElementProperty EOF
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
    // InternalSeleniumDsl.g:462:1: ruleElementProperty : ( ( rule__ElementProperty__Group__0 ) ) ;
    public final void ruleElementProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:466:2: ( ( ( rule__ElementProperty__Group__0 ) ) )
            // InternalSeleniumDsl.g:467:2: ( ( rule__ElementProperty__Group__0 ) )
            {
            // InternalSeleniumDsl.g:467:2: ( ( rule__ElementProperty__Group__0 ) )
            // InternalSeleniumDsl.g:468:3: ( rule__ElementProperty__Group__0 )
            {
             before(grammarAccess.getElementPropertyAccess().getGroup()); 
            // InternalSeleniumDsl.g:469:3: ( rule__ElementProperty__Group__0 )
            // InternalSeleniumDsl.g:469:4: rule__ElementProperty__Group__0
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
    // InternalSeleniumDsl.g:478:1: entryRuleSelectorPredicate : ruleSelectorPredicate EOF ;
    public final void entryRuleSelectorPredicate() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:479:1: ( ruleSelectorPredicate EOF )
            // InternalSeleniumDsl.g:480:1: ruleSelectorPredicate EOF
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
    // InternalSeleniumDsl.g:487:1: ruleSelectorPredicate : ( ( rule__SelectorPredicate__Alternatives ) ) ;
    public final void ruleSelectorPredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:491:2: ( ( ( rule__SelectorPredicate__Alternatives ) ) )
            // InternalSeleniumDsl.g:492:2: ( ( rule__SelectorPredicate__Alternatives ) )
            {
            // InternalSeleniumDsl.g:492:2: ( ( rule__SelectorPredicate__Alternatives ) )
            // InternalSeleniumDsl.g:493:3: ( rule__SelectorPredicate__Alternatives )
            {
             before(grammarAccess.getSelectorPredicateAccess().getAlternatives()); 
            // InternalSeleniumDsl.g:494:3: ( rule__SelectorPredicate__Alternatives )
            // InternalSeleniumDsl.g:494:4: rule__SelectorPredicate__Alternatives
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


    // $ANTLR start "entryRuleAllCondition"
    // InternalSeleniumDsl.g:503:1: entryRuleAllCondition : ruleAllCondition EOF ;
    public final void entryRuleAllCondition() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:504:1: ( ruleAllCondition EOF )
            // InternalSeleniumDsl.g:505:1: ruleAllCondition EOF
            {
             before(grammarAccess.getAllConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleAllCondition();

            state._fsp--;

             after(grammarAccess.getAllConditionRule()); 
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
    // $ANTLR end "entryRuleAllCondition"


    // $ANTLR start "ruleAllCondition"
    // InternalSeleniumDsl.g:512:1: ruleAllCondition : ( ( rule__AllCondition__Group__0 ) ) ;
    public final void ruleAllCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:516:2: ( ( ( rule__AllCondition__Group__0 ) ) )
            // InternalSeleniumDsl.g:517:2: ( ( rule__AllCondition__Group__0 ) )
            {
            // InternalSeleniumDsl.g:517:2: ( ( rule__AllCondition__Group__0 ) )
            // InternalSeleniumDsl.g:518:3: ( rule__AllCondition__Group__0 )
            {
             before(grammarAccess.getAllConditionAccess().getGroup()); 
            // InternalSeleniumDsl.g:519:3: ( rule__AllCondition__Group__0 )
            // InternalSeleniumDsl.g:519:4: rule__AllCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AllCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAllConditionAccess().getGroup()); 

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
    // $ANTLR end "ruleAllCondition"


    // $ANTLR start "entryRuleIntWithSuffix"
    // InternalSeleniumDsl.g:528:1: entryRuleIntWithSuffix : ruleIntWithSuffix EOF ;
    public final void entryRuleIntWithSuffix() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:529:1: ( ruleIntWithSuffix EOF )
            // InternalSeleniumDsl.g:530:1: ruleIntWithSuffix EOF
            {
             before(grammarAccess.getIntWithSuffixRule()); 
            pushFollow(FOLLOW_1);
            ruleIntWithSuffix();

            state._fsp--;

             after(grammarAccess.getIntWithSuffixRule()); 
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
    // $ANTLR end "entryRuleIntWithSuffix"


    // $ANTLR start "ruleIntWithSuffix"
    // InternalSeleniumDsl.g:537:1: ruleIntWithSuffix : ( ( rule__IntWithSuffix__Group__0 ) ) ;
    public final void ruleIntWithSuffix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:541:2: ( ( ( rule__IntWithSuffix__Group__0 ) ) )
            // InternalSeleniumDsl.g:542:2: ( ( rule__IntWithSuffix__Group__0 ) )
            {
            // InternalSeleniumDsl.g:542:2: ( ( rule__IntWithSuffix__Group__0 ) )
            // InternalSeleniumDsl.g:543:3: ( rule__IntWithSuffix__Group__0 )
            {
             before(grammarAccess.getIntWithSuffixAccess().getGroup()); 
            // InternalSeleniumDsl.g:544:3: ( rule__IntWithSuffix__Group__0 )
            // InternalSeleniumDsl.g:544:4: rule__IntWithSuffix__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntWithSuffix__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntWithSuffixAccess().getGroup()); 

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
    // $ANTLR end "ruleIntWithSuffix"


    // $ANTLR start "entryRuleOrdinalCondition"
    // InternalSeleniumDsl.g:553:1: entryRuleOrdinalCondition : ruleOrdinalCondition EOF ;
    public final void entryRuleOrdinalCondition() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:554:1: ( ruleOrdinalCondition EOF )
            // InternalSeleniumDsl.g:555:1: ruleOrdinalCondition EOF
            {
             before(grammarAccess.getOrdinalConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleOrdinalCondition();

            state._fsp--;

             after(grammarAccess.getOrdinalConditionRule()); 
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
    // $ANTLR end "entryRuleOrdinalCondition"


    // $ANTLR start "ruleOrdinalCondition"
    // InternalSeleniumDsl.g:562:1: ruleOrdinalCondition : ( ( rule__OrdinalCondition__Group__0 ) ) ;
    public final void ruleOrdinalCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:566:2: ( ( ( rule__OrdinalCondition__Group__0 ) ) )
            // InternalSeleniumDsl.g:567:2: ( ( rule__OrdinalCondition__Group__0 ) )
            {
            // InternalSeleniumDsl.g:567:2: ( ( rule__OrdinalCondition__Group__0 ) )
            // InternalSeleniumDsl.g:568:3: ( rule__OrdinalCondition__Group__0 )
            {
             before(grammarAccess.getOrdinalConditionAccess().getGroup()); 
            // InternalSeleniumDsl.g:569:3: ( rule__OrdinalCondition__Group__0 )
            // InternalSeleniumDsl.g:569:4: rule__OrdinalCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrdinalCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrdinalConditionAccess().getGroup()); 

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
    // $ANTLR end "ruleOrdinalCondition"


    // $ANTLR start "entryRuleLastCondition"
    // InternalSeleniumDsl.g:578:1: entryRuleLastCondition : ruleLastCondition EOF ;
    public final void entryRuleLastCondition() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:579:1: ( ruleLastCondition EOF )
            // InternalSeleniumDsl.g:580:1: ruleLastCondition EOF
            {
             before(grammarAccess.getLastConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleLastCondition();

            state._fsp--;

             after(grammarAccess.getLastConditionRule()); 
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
    // $ANTLR end "entryRuleLastCondition"


    // $ANTLR start "ruleLastCondition"
    // InternalSeleniumDsl.g:587:1: ruleLastCondition : ( ( rule__LastCondition__Group__0 ) ) ;
    public final void ruleLastCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:591:2: ( ( ( rule__LastCondition__Group__0 ) ) )
            // InternalSeleniumDsl.g:592:2: ( ( rule__LastCondition__Group__0 ) )
            {
            // InternalSeleniumDsl.g:592:2: ( ( rule__LastCondition__Group__0 ) )
            // InternalSeleniumDsl.g:593:3: ( rule__LastCondition__Group__0 )
            {
             before(grammarAccess.getLastConditionAccess().getGroup()); 
            // InternalSeleniumDsl.g:594:3: ( rule__LastCondition__Group__0 )
            // InternalSeleniumDsl.g:594:4: rule__LastCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LastCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLastConditionAccess().getGroup()); 

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
    // $ANTLR end "ruleLastCondition"


    // $ANTLR start "entryRuleFirstCondition"
    // InternalSeleniumDsl.g:603:1: entryRuleFirstCondition : ruleFirstCondition EOF ;
    public final void entryRuleFirstCondition() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:604:1: ( ruleFirstCondition EOF )
            // InternalSeleniumDsl.g:605:1: ruleFirstCondition EOF
            {
             before(grammarAccess.getFirstConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleFirstCondition();

            state._fsp--;

             after(grammarAccess.getFirstConditionRule()); 
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
    // $ANTLR end "entryRuleFirstCondition"


    // $ANTLR start "ruleFirstCondition"
    // InternalSeleniumDsl.g:612:1: ruleFirstCondition : ( ( rule__FirstCondition__Group__0 ) ) ;
    public final void ruleFirstCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:616:2: ( ( ( rule__FirstCondition__Group__0 ) ) )
            // InternalSeleniumDsl.g:617:2: ( ( rule__FirstCondition__Group__0 ) )
            {
            // InternalSeleniumDsl.g:617:2: ( ( rule__FirstCondition__Group__0 ) )
            // InternalSeleniumDsl.g:618:3: ( rule__FirstCondition__Group__0 )
            {
             before(grammarAccess.getFirstConditionAccess().getGroup()); 
            // InternalSeleniumDsl.g:619:3: ( rule__FirstCondition__Group__0 )
            // InternalSeleniumDsl.g:619:4: rule__FirstCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FirstCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFirstConditionAccess().getGroup()); 

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
    // $ANTLR end "ruleFirstCondition"


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


    // $ANTLR start "entryRuleDynamicURL"
    // InternalSeleniumDsl.g:678:1: entryRuleDynamicURL : ruleDynamicURL EOF ;
    public final void entryRuleDynamicURL() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:679:1: ( ruleDynamicURL EOF )
            // InternalSeleniumDsl.g:680:1: ruleDynamicURL EOF
            {
             before(grammarAccess.getDynamicURLRule()); 
            pushFollow(FOLLOW_1);
            ruleDynamicURL();

            state._fsp--;

             after(grammarAccess.getDynamicURLRule()); 
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
    // $ANTLR end "entryRuleDynamicURL"


    // $ANTLR start "ruleDynamicURL"
    // InternalSeleniumDsl.g:687:1: ruleDynamicURL : ( ( rule__DynamicURL__Alternatives ) ) ;
    public final void ruleDynamicURL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:691:2: ( ( ( rule__DynamicURL__Alternatives ) ) )
            // InternalSeleniumDsl.g:692:2: ( ( rule__DynamicURL__Alternatives ) )
            {
            // InternalSeleniumDsl.g:692:2: ( ( rule__DynamicURL__Alternatives ) )
            // InternalSeleniumDsl.g:693:3: ( rule__DynamicURL__Alternatives )
            {
             before(grammarAccess.getDynamicURLAccess().getAlternatives()); 
            // InternalSeleniumDsl.g:694:3: ( rule__DynamicURL__Alternatives )
            // InternalSeleniumDsl.g:694:4: rule__DynamicURL__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DynamicURL__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDynamicURLAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDynamicURL"


    // $ANTLR start "rule__Command__Alternatives"
    // InternalSeleniumDsl.g:702:1: rule__Command__Alternatives : ( ( ruleOpenBrowser ) | ( ruleGoTo ) | ( ruleDOMCommand ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:706:1: ( ( ruleOpenBrowser ) | ( ruleGoTo ) | ( ruleDOMCommand ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt2=1;
                }
                break;
            case 26:
                {
                alt2=2;
                }
                break;
            case 16:
            case 28:
            case 30:
            case 35:
            case 39:
            case 52:
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
    // InternalSeleniumDsl.g:729:1: rule__DOMCommand__Alternatives : ( ( ruleClick ) | ( ruleCopy ) | ( rulePaste ) | ( ruleVerify ) | ( ruleInsert ) );
    public final void rule__DOMCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:733:1: ( ( ruleClick ) | ( ruleCopy ) | ( rulePaste ) | ( ruleVerify ) | ( ruleInsert ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 16:
            case 28:
                {
                alt3=1;
                }
                break;
            case 30:
                {
                alt3=2;
                }
                break;
            case 35:
                {
                alt3=3;
                }
                break;
            case 52:
                {
                alt3=4;
                }
                break;
            case 39:
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
                    // InternalSeleniumDsl.g:740:2: ( ruleCopy )
                    {
                    // InternalSeleniumDsl.g:740:2: ( ruleCopy )
                    // InternalSeleniumDsl.g:741:3: ruleCopy
                    {
                     before(grammarAccess.getDOMCommandAccess().getCopyParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCopy();

                    state._fsp--;

                     after(grammarAccess.getDOMCommandAccess().getCopyParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSeleniumDsl.g:746:2: ( rulePaste )
                    {
                    // InternalSeleniumDsl.g:746:2: ( rulePaste )
                    // InternalSeleniumDsl.g:747:3: rulePaste
                    {
                     before(grammarAccess.getDOMCommandAccess().getPasteParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePaste();

                    state._fsp--;

                     after(grammarAccess.getDOMCommandAccess().getPasteParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSeleniumDsl.g:752:2: ( ruleVerify )
                    {
                    // InternalSeleniumDsl.g:752:2: ( ruleVerify )
                    // InternalSeleniumDsl.g:753:3: ruleVerify
                    {
                     before(grammarAccess.getDOMCommandAccess().getVerifyParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleVerify();

                    state._fsp--;

                     after(grammarAccess.getDOMCommandAccess().getVerifyParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSeleniumDsl.g:758:2: ( ruleInsert )
                    {
                    // InternalSeleniumDsl.g:758:2: ( ruleInsert )
                    // InternalSeleniumDsl.g:759:3: ruleInsert
                    {
                     before(grammarAccess.getDOMCommandAccess().getInsertParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleInsert();

                    state._fsp--;

                     after(grammarAccess.getDOMCommandAccess().getInsertParserRuleCall_4()); 

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


    // $ANTLR start "rule__GoTo__Alternatives_2"
    // InternalSeleniumDsl.g:768:1: rule__GoTo__Alternatives_2 : ( ( ( rule__GoTo__UrlAssignment_2_0 ) ) | ( 'URL' ) );
    public final void rule__GoTo__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:772:1: ( ( ( rule__GoTo__UrlAssignment_2_0 ) ) | ( 'URL' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_URL && LA4_0<=RULE_STRING)) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSeleniumDsl.g:773:2: ( ( rule__GoTo__UrlAssignment_2_0 ) )
                    {
                    // InternalSeleniumDsl.g:773:2: ( ( rule__GoTo__UrlAssignment_2_0 ) )
                    // InternalSeleniumDsl.g:774:3: ( rule__GoTo__UrlAssignment_2_0 )
                    {
                     before(grammarAccess.getGoToAccess().getUrlAssignment_2_0()); 
                    // InternalSeleniumDsl.g:775:3: ( rule__GoTo__UrlAssignment_2_0 )
                    // InternalSeleniumDsl.g:775:4: rule__GoTo__UrlAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GoTo__UrlAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGoToAccess().getUrlAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDsl.g:779:2: ( 'URL' )
                    {
                    // InternalSeleniumDsl.g:779:2: ( 'URL' )
                    // InternalSeleniumDsl.g:780:3: 'URL'
                    {
                     before(grammarAccess.getGoToAccess().getURLKeyword_2_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getGoToAccess().getURLKeyword_2_1()); 

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
    // $ANTLR end "rule__GoTo__Alternatives_2"


    // $ANTLR start "rule__Click__Alternatives_1"
    // InternalSeleniumDsl.g:789:1: rule__Click__Alternatives_1 : ( ( ( rule__Click__Group_1_0__0 ) ) | ( 'select' ) );
    public final void rule__Click__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:793:1: ( ( ( rule__Click__Group_1_0__0 ) ) | ( 'select' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSeleniumDsl.g:794:2: ( ( rule__Click__Group_1_0__0 ) )
                    {
                    // InternalSeleniumDsl.g:794:2: ( ( rule__Click__Group_1_0__0 ) )
                    // InternalSeleniumDsl.g:795:3: ( rule__Click__Group_1_0__0 )
                    {
                     before(grammarAccess.getClickAccess().getGroup_1_0()); 
                    // InternalSeleniumDsl.g:796:3: ( rule__Click__Group_1_0__0 )
                    // InternalSeleniumDsl.g:796:4: rule__Click__Group_1_0__0
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
                    // InternalSeleniumDsl.g:800:2: ( 'select' )
                    {
                    // InternalSeleniumDsl.g:800:2: ( 'select' )
                    // InternalSeleniumDsl.g:801:3: 'select'
                    {
                     before(grammarAccess.getClickAccess().getSelectKeyword_1_1()); 
                    match(input,16,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:810:1: rule__Content__Alternatives : ( ( ruleClipboardContent ) | ( ruleStringContent ) );
    public final void rule__Content__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:814:1: ( ( ruleClipboardContent ) | ( ruleStringContent ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==31) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_STRING) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSeleniumDsl.g:815:2: ( ruleClipboardContent )
                    {
                    // InternalSeleniumDsl.g:815:2: ( ruleClipboardContent )
                    // InternalSeleniumDsl.g:816:3: ruleClipboardContent
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
                    // InternalSeleniumDsl.g:821:2: ( ruleStringContent )
                    {
                    // InternalSeleniumDsl.g:821:2: ( ruleStringContent )
                    // InternalSeleniumDsl.g:822:3: ruleStringContent
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
    // InternalSeleniumDsl.g:831:1: rule__ElementProperty__PropertyAlternatives_1_0 : ( ( 'selected' ) | ( 'visible' ) | ( 'enabled' ) );
    public final void rule__ElementProperty__PropertyAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:835:1: ( ( 'selected' ) | ( 'visible' ) | ( 'enabled' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case 19:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSeleniumDsl.g:836:2: ( 'selected' )
                    {
                    // InternalSeleniumDsl.g:836:2: ( 'selected' )
                    // InternalSeleniumDsl.g:837:3: 'selected'
                    {
                     before(grammarAccess.getElementPropertyAccess().getPropertySelectedKeyword_1_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getElementPropertyAccess().getPropertySelectedKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDsl.g:842:2: ( 'visible' )
                    {
                    // InternalSeleniumDsl.g:842:2: ( 'visible' )
                    // InternalSeleniumDsl.g:843:3: 'visible'
                    {
                     before(grammarAccess.getElementPropertyAccess().getPropertyVisibleKeyword_1_0_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getElementPropertyAccess().getPropertyVisibleKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSeleniumDsl.g:848:2: ( 'enabled' )
                    {
                    // InternalSeleniumDsl.g:848:2: ( 'enabled' )
                    // InternalSeleniumDsl.g:849:3: 'enabled'
                    {
                     before(grammarAccess.getElementPropertyAccess().getPropertyEnabledKeyword_1_0_2()); 
                    match(input,19,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:858:1: rule__SelectorPredicate__Alternatives : ( ( ruleAllCondition ) | ( ruleOrdinalCondition ) | ( ruleLastCondition ) | ( ruleFirstCondition ) );
    public final void rule__SelectorPredicate__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:862:1: ( ( ruleAllCondition ) | ( ruleOrdinalCondition ) | ( ruleLastCondition ) | ( ruleFirstCondition ) )
            int alt8=4;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==48) ) {
                alt8=1;
            }
            else if ( (LA8_0==31) ) {
                switch ( input.LA(2) ) {
                case RULE_INT:
                    {
                    alt8=2;
                    }
                    break;
                case EOF:
                case RULE_STRING:
                    {
                    alt8=4;
                    }
                    break;
                case 51:
                    {
                    alt8=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSeleniumDsl.g:863:2: ( ruleAllCondition )
                    {
                    // InternalSeleniumDsl.g:863:2: ( ruleAllCondition )
                    // InternalSeleniumDsl.g:864:3: ruleAllCondition
                    {
                     before(grammarAccess.getSelectorPredicateAccess().getAllConditionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAllCondition();

                    state._fsp--;

                     after(grammarAccess.getSelectorPredicateAccess().getAllConditionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDsl.g:869:2: ( ruleOrdinalCondition )
                    {
                    // InternalSeleniumDsl.g:869:2: ( ruleOrdinalCondition )
                    // InternalSeleniumDsl.g:870:3: ruleOrdinalCondition
                    {
                     before(grammarAccess.getSelectorPredicateAccess().getOrdinalConditionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOrdinalCondition();

                    state._fsp--;

                     after(grammarAccess.getSelectorPredicateAccess().getOrdinalConditionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSeleniumDsl.g:875:2: ( ruleLastCondition )
                    {
                    // InternalSeleniumDsl.g:875:2: ( ruleLastCondition )
                    // InternalSeleniumDsl.g:876:3: ruleLastCondition
                    {
                     before(grammarAccess.getSelectorPredicateAccess().getLastConditionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLastCondition();

                    state._fsp--;

                     after(grammarAccess.getSelectorPredicateAccess().getLastConditionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSeleniumDsl.g:881:2: ( ruleFirstCondition )
                    {
                    // InternalSeleniumDsl.g:881:2: ( ruleFirstCondition )
                    // InternalSeleniumDsl.g:882:3: ruleFirstCondition
                    {
                     before(grammarAccess.getSelectorPredicateAccess().getFirstConditionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleFirstCondition();

                    state._fsp--;

                     after(grammarAccess.getSelectorPredicateAccess().getFirstConditionParserRuleCall_3()); 

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
    // InternalSeleniumDsl.g:891:1: rule__Matcher__Alternatives : ( ( 'containing' ) | ( 'matching' ) );
    public final void rule__Matcher__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:895:1: ( ( 'containing' ) | ( 'matching' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            else if ( (LA9_0==21) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSeleniumDsl.g:896:2: ( 'containing' )
                    {
                    // InternalSeleniumDsl.g:896:2: ( 'containing' )
                    // InternalSeleniumDsl.g:897:3: 'containing'
                    {
                     before(grammarAccess.getMatcherAccess().getContainingKeyword_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getMatcherAccess().getContainingKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDsl.g:902:2: ( 'matching' )
                    {
                    // InternalSeleniumDsl.g:902:2: ( 'matching' )
                    // InternalSeleniumDsl.g:903:3: 'matching'
                    {
                     before(grammarAccess.getMatcherAccess().getMatchingKeyword_1()); 
                    match(input,21,FOLLOW_2); 
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


    // $ANTLR start "rule__DynamicURL__Alternatives"
    // InternalSeleniumDsl.g:912:1: rule__DynamicURL__Alternatives : ( ( RULE_URL ) | ( RULE_STRING ) );
    public final void rule__DynamicURL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:916:1: ( ( RULE_URL ) | ( RULE_STRING ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_URL) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_STRING) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSeleniumDsl.g:917:2: ( RULE_URL )
                    {
                    // InternalSeleniumDsl.g:917:2: ( RULE_URL )
                    // InternalSeleniumDsl.g:918:3: RULE_URL
                    {
                     before(grammarAccess.getDynamicURLAccess().getURLTerminalRuleCall_0()); 
                    match(input,RULE_URL,FOLLOW_2); 
                     after(grammarAccess.getDynamicURLAccess().getURLTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDsl.g:923:2: ( RULE_STRING )
                    {
                    // InternalSeleniumDsl.g:923:2: ( RULE_STRING )
                    // InternalSeleniumDsl.g:924:3: RULE_STRING
                    {
                     before(grammarAccess.getDynamicURLAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getDynamicURLAccess().getSTRINGTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__DynamicURL__Alternatives"


    // $ANTLR start "rule__OpenBrowser__Group__0"
    // InternalSeleniumDsl.g:933:1: rule__OpenBrowser__Group__0 : rule__OpenBrowser__Group__0__Impl rule__OpenBrowser__Group__1 ;
    public final void rule__OpenBrowser__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:937:1: ( rule__OpenBrowser__Group__0__Impl rule__OpenBrowser__Group__1 )
            // InternalSeleniumDsl.g:938:2: rule__OpenBrowser__Group__0__Impl rule__OpenBrowser__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSeleniumDsl.g:945:1: rule__OpenBrowser__Group__0__Impl : ( () ) ;
    public final void rule__OpenBrowser__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:949:1: ( ( () ) )
            // InternalSeleniumDsl.g:950:1: ( () )
            {
            // InternalSeleniumDsl.g:950:1: ( () )
            // InternalSeleniumDsl.g:951:2: ()
            {
             before(grammarAccess.getOpenBrowserAccess().getOpenBrowserAction_0()); 
            // InternalSeleniumDsl.g:952:2: ()
            // InternalSeleniumDsl.g:952:3: 
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
    // InternalSeleniumDsl.g:960:1: rule__OpenBrowser__Group__1 : rule__OpenBrowser__Group__1__Impl rule__OpenBrowser__Group__2 ;
    public final void rule__OpenBrowser__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:964:1: ( rule__OpenBrowser__Group__1__Impl rule__OpenBrowser__Group__2 )
            // InternalSeleniumDsl.g:965:2: rule__OpenBrowser__Group__1__Impl rule__OpenBrowser__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalSeleniumDsl.g:972:1: rule__OpenBrowser__Group__1__Impl : ( 'open' ) ;
    public final void rule__OpenBrowser__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:976:1: ( ( 'open' ) )
            // InternalSeleniumDsl.g:977:1: ( 'open' )
            {
            // InternalSeleniumDsl.g:977:1: ( 'open' )
            // InternalSeleniumDsl.g:978:2: 'open'
            {
             before(grammarAccess.getOpenBrowserAccess().getOpenKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:987:1: rule__OpenBrowser__Group__2 : rule__OpenBrowser__Group__2__Impl rule__OpenBrowser__Group__3 ;
    public final void rule__OpenBrowser__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:991:1: ( rule__OpenBrowser__Group__2__Impl rule__OpenBrowser__Group__3 )
            // InternalSeleniumDsl.g:992:2: rule__OpenBrowser__Group__2__Impl rule__OpenBrowser__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalSeleniumDsl.g:999:1: rule__OpenBrowser__Group__2__Impl : ( 'a' ) ;
    public final void rule__OpenBrowser__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1003:1: ( ( 'a' ) )
            // InternalSeleniumDsl.g:1004:1: ( 'a' )
            {
            // InternalSeleniumDsl.g:1004:1: ( 'a' )
            // InternalSeleniumDsl.g:1005:2: 'a'
            {
             before(grammarAccess.getOpenBrowserAccess().getAKeyword_2()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1014:1: rule__OpenBrowser__Group__3 : rule__OpenBrowser__Group__3__Impl rule__OpenBrowser__Group__4 ;
    public final void rule__OpenBrowser__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1018:1: ( rule__OpenBrowser__Group__3__Impl rule__OpenBrowser__Group__4 )
            // InternalSeleniumDsl.g:1019:2: rule__OpenBrowser__Group__3__Impl rule__OpenBrowser__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalSeleniumDsl.g:1026:1: rule__OpenBrowser__Group__3__Impl : ( 'browser' ) ;
    public final void rule__OpenBrowser__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1030:1: ( ( 'browser' ) )
            // InternalSeleniumDsl.g:1031:1: ( 'browser' )
            {
            // InternalSeleniumDsl.g:1031:1: ( 'browser' )
            // InternalSeleniumDsl.g:1032:2: 'browser'
            {
             before(grammarAccess.getOpenBrowserAccess().getBrowserKeyword_3()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1041:1: rule__OpenBrowser__Group__4 : rule__OpenBrowser__Group__4__Impl ;
    public final void rule__OpenBrowser__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1045:1: ( rule__OpenBrowser__Group__4__Impl )
            // InternalSeleniumDsl.g:1046:2: rule__OpenBrowser__Group__4__Impl
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
    // InternalSeleniumDsl.g:1052:1: rule__OpenBrowser__Group__4__Impl : ( 'window' ) ;
    public final void rule__OpenBrowser__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1056:1: ( ( 'window' ) )
            // InternalSeleniumDsl.g:1057:1: ( 'window' )
            {
            // InternalSeleniumDsl.g:1057:1: ( 'window' )
            // InternalSeleniumDsl.g:1058:2: 'window'
            {
             before(grammarAccess.getOpenBrowserAccess().getWindowKeyword_4()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1068:1: rule__GoTo__Group__0 : rule__GoTo__Group__0__Impl rule__GoTo__Group__1 ;
    public final void rule__GoTo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1072:1: ( rule__GoTo__Group__0__Impl rule__GoTo__Group__1 )
            // InternalSeleniumDsl.g:1073:2: rule__GoTo__Group__0__Impl rule__GoTo__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalSeleniumDsl.g:1080:1: rule__GoTo__Group__0__Impl : ( 'go' ) ;
    public final void rule__GoTo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1084:1: ( ( 'go' ) )
            // InternalSeleniumDsl.g:1085:1: ( 'go' )
            {
            // InternalSeleniumDsl.g:1085:1: ( 'go' )
            // InternalSeleniumDsl.g:1086:2: 'go'
            {
             before(grammarAccess.getGoToAccess().getGoKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1095:1: rule__GoTo__Group__1 : rule__GoTo__Group__1__Impl rule__GoTo__Group__2 ;
    public final void rule__GoTo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1099:1: ( rule__GoTo__Group__1__Impl rule__GoTo__Group__2 )
            // InternalSeleniumDsl.g:1100:2: rule__GoTo__Group__1__Impl rule__GoTo__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalSeleniumDsl.g:1107:1: rule__GoTo__Group__1__Impl : ( 'to' ) ;
    public final void rule__GoTo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1111:1: ( ( 'to' ) )
            // InternalSeleniumDsl.g:1112:1: ( 'to' )
            {
            // InternalSeleniumDsl.g:1112:1: ( 'to' )
            // InternalSeleniumDsl.g:1113:2: 'to'
            {
             before(grammarAccess.getGoToAccess().getToKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1122:1: rule__GoTo__Group__2 : rule__GoTo__Group__2__Impl ;
    public final void rule__GoTo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1126:1: ( rule__GoTo__Group__2__Impl )
            // InternalSeleniumDsl.g:1127:2: rule__GoTo__Group__2__Impl
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
    // InternalSeleniumDsl.g:1133:1: rule__GoTo__Group__2__Impl : ( ( rule__GoTo__Alternatives_2 )? ) ;
    public final void rule__GoTo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1137:1: ( ( ( rule__GoTo__Alternatives_2 )? ) )
            // InternalSeleniumDsl.g:1138:1: ( ( rule__GoTo__Alternatives_2 )? )
            {
            // InternalSeleniumDsl.g:1138:1: ( ( rule__GoTo__Alternatives_2 )? )
            // InternalSeleniumDsl.g:1139:2: ( rule__GoTo__Alternatives_2 )?
            {
             before(grammarAccess.getGoToAccess().getAlternatives_2()); 
            // InternalSeleniumDsl.g:1140:2: ( rule__GoTo__Alternatives_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_URL && LA11_0<=RULE_STRING)||LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSeleniumDsl.g:1140:3: rule__GoTo__Alternatives_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__GoTo__Alternatives_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGoToAccess().getAlternatives_2()); 

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
    // InternalSeleniumDsl.g:1149:1: rule__Click__Group__0 : rule__Click__Group__0__Impl rule__Click__Group__1 ;
    public final void rule__Click__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1153:1: ( rule__Click__Group__0__Impl rule__Click__Group__1 )
            // InternalSeleniumDsl.g:1154:2: rule__Click__Group__0__Impl rule__Click__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalSeleniumDsl.g:1161:1: rule__Click__Group__0__Impl : ( () ) ;
    public final void rule__Click__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1165:1: ( ( () ) )
            // InternalSeleniumDsl.g:1166:1: ( () )
            {
            // InternalSeleniumDsl.g:1166:1: ( () )
            // InternalSeleniumDsl.g:1167:2: ()
            {
             before(grammarAccess.getClickAccess().getClickAction_0()); 
            // InternalSeleniumDsl.g:1168:2: ()
            // InternalSeleniumDsl.g:1168:3: 
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
    // InternalSeleniumDsl.g:1176:1: rule__Click__Group__1 : rule__Click__Group__1__Impl rule__Click__Group__2 ;
    public final void rule__Click__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1180:1: ( rule__Click__Group__1__Impl rule__Click__Group__2 )
            // InternalSeleniumDsl.g:1181:2: rule__Click__Group__1__Impl rule__Click__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalSeleniumDsl.g:1188:1: rule__Click__Group__1__Impl : ( ( rule__Click__Alternatives_1 ) ) ;
    public final void rule__Click__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1192:1: ( ( ( rule__Click__Alternatives_1 ) ) )
            // InternalSeleniumDsl.g:1193:1: ( ( rule__Click__Alternatives_1 ) )
            {
            // InternalSeleniumDsl.g:1193:1: ( ( rule__Click__Alternatives_1 ) )
            // InternalSeleniumDsl.g:1194:2: ( rule__Click__Alternatives_1 )
            {
             before(grammarAccess.getClickAccess().getAlternatives_1()); 
            // InternalSeleniumDsl.g:1195:2: ( rule__Click__Alternatives_1 )
            // InternalSeleniumDsl.g:1195:3: rule__Click__Alternatives_1
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
    // InternalSeleniumDsl.g:1203:1: rule__Click__Group__2 : rule__Click__Group__2__Impl ;
    public final void rule__Click__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1207:1: ( rule__Click__Group__2__Impl )
            // InternalSeleniumDsl.g:1208:2: rule__Click__Group__2__Impl
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
    // InternalSeleniumDsl.g:1214:1: rule__Click__Group__2__Impl : ( ( rule__Click__ElementAssignment_2 ) ) ;
    public final void rule__Click__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1218:1: ( ( ( rule__Click__ElementAssignment_2 ) ) )
            // InternalSeleniumDsl.g:1219:1: ( ( rule__Click__ElementAssignment_2 ) )
            {
            // InternalSeleniumDsl.g:1219:1: ( ( rule__Click__ElementAssignment_2 ) )
            // InternalSeleniumDsl.g:1220:2: ( rule__Click__ElementAssignment_2 )
            {
             before(grammarAccess.getClickAccess().getElementAssignment_2()); 
            // InternalSeleniumDsl.g:1221:2: ( rule__Click__ElementAssignment_2 )
            // InternalSeleniumDsl.g:1221:3: rule__Click__ElementAssignment_2
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
    // InternalSeleniumDsl.g:1230:1: rule__Click__Group_1_0__0 : rule__Click__Group_1_0__0__Impl rule__Click__Group_1_0__1 ;
    public final void rule__Click__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1234:1: ( rule__Click__Group_1_0__0__Impl rule__Click__Group_1_0__1 )
            // InternalSeleniumDsl.g:1235:2: rule__Click__Group_1_0__0__Impl rule__Click__Group_1_0__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalSeleniumDsl.g:1242:1: rule__Click__Group_1_0__0__Impl : ( 'click' ) ;
    public final void rule__Click__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1246:1: ( ( 'click' ) )
            // InternalSeleniumDsl.g:1247:1: ( 'click' )
            {
            // InternalSeleniumDsl.g:1247:1: ( 'click' )
            // InternalSeleniumDsl.g:1248:2: 'click'
            {
             before(grammarAccess.getClickAccess().getClickKeyword_1_0_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1257:1: rule__Click__Group_1_0__1 : rule__Click__Group_1_0__1__Impl ;
    public final void rule__Click__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1261:1: ( rule__Click__Group_1_0__1__Impl )
            // InternalSeleniumDsl.g:1262:2: rule__Click__Group_1_0__1__Impl
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
    // InternalSeleniumDsl.g:1268:1: rule__Click__Group_1_0__1__Impl : ( 'on' ) ;
    public final void rule__Click__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1272:1: ( ( 'on' ) )
            // InternalSeleniumDsl.g:1273:1: ( 'on' )
            {
            // InternalSeleniumDsl.g:1273:1: ( 'on' )
            // InternalSeleniumDsl.g:1274:2: 'on'
            {
             before(grammarAccess.getClickAccess().getOnKeyword_1_0_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1284:1: rule__Copy__Group__0 : rule__Copy__Group__0__Impl rule__Copy__Group__1 ;
    public final void rule__Copy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1288:1: ( rule__Copy__Group__0__Impl rule__Copy__Group__1 )
            // InternalSeleniumDsl.g:1289:2: rule__Copy__Group__0__Impl rule__Copy__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalSeleniumDsl.g:1296:1: rule__Copy__Group__0__Impl : ( () ) ;
    public final void rule__Copy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1300:1: ( ( () ) )
            // InternalSeleniumDsl.g:1301:1: ( () )
            {
            // InternalSeleniumDsl.g:1301:1: ( () )
            // InternalSeleniumDsl.g:1302:2: ()
            {
             before(grammarAccess.getCopyAccess().getCopyAction_0()); 
            // InternalSeleniumDsl.g:1303:2: ()
            // InternalSeleniumDsl.g:1303:3: 
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
    // InternalSeleniumDsl.g:1311:1: rule__Copy__Group__1 : rule__Copy__Group__1__Impl rule__Copy__Group__2 ;
    public final void rule__Copy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1315:1: ( rule__Copy__Group__1__Impl rule__Copy__Group__2 )
            // InternalSeleniumDsl.g:1316:2: rule__Copy__Group__1__Impl rule__Copy__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalSeleniumDsl.g:1323:1: rule__Copy__Group__1__Impl : ( 'copy' ) ;
    public final void rule__Copy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1327:1: ( ( 'copy' ) )
            // InternalSeleniumDsl.g:1328:1: ( 'copy' )
            {
            // InternalSeleniumDsl.g:1328:1: ( 'copy' )
            // InternalSeleniumDsl.g:1329:2: 'copy'
            {
             before(grammarAccess.getCopyAccess().getCopyKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1338:1: rule__Copy__Group__2 : rule__Copy__Group__2__Impl rule__Copy__Group__3 ;
    public final void rule__Copy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1342:1: ( rule__Copy__Group__2__Impl rule__Copy__Group__3 )
            // InternalSeleniumDsl.g:1343:2: rule__Copy__Group__2__Impl rule__Copy__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalSeleniumDsl.g:1350:1: rule__Copy__Group__2__Impl : ( 'the' ) ;
    public final void rule__Copy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1354:1: ( ( 'the' ) )
            // InternalSeleniumDsl.g:1355:1: ( 'the' )
            {
            // InternalSeleniumDsl.g:1355:1: ( 'the' )
            // InternalSeleniumDsl.g:1356:2: 'the'
            {
             before(grammarAccess.getCopyAccess().getTheKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1365:1: rule__Copy__Group__3 : rule__Copy__Group__3__Impl rule__Copy__Group__4 ;
    public final void rule__Copy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1369:1: ( rule__Copy__Group__3__Impl rule__Copy__Group__4 )
            // InternalSeleniumDsl.g:1370:2: rule__Copy__Group__3__Impl rule__Copy__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalSeleniumDsl.g:1377:1: rule__Copy__Group__3__Impl : ( 'property' ) ;
    public final void rule__Copy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1381:1: ( ( 'property' ) )
            // InternalSeleniumDsl.g:1382:1: ( 'property' )
            {
            // InternalSeleniumDsl.g:1382:1: ( 'property' )
            // InternalSeleniumDsl.g:1383:2: 'property'
            {
             before(grammarAccess.getCopyAccess().getPropertyKeyword_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1392:1: rule__Copy__Group__4 : rule__Copy__Group__4__Impl rule__Copy__Group__5 ;
    public final void rule__Copy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1396:1: ( rule__Copy__Group__4__Impl rule__Copy__Group__5 )
            // InternalSeleniumDsl.g:1397:2: rule__Copy__Group__4__Impl rule__Copy__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalSeleniumDsl.g:1404:1: rule__Copy__Group__4__Impl : ( ( rule__Copy__PropertyAssignment_4 ) ) ;
    public final void rule__Copy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1408:1: ( ( ( rule__Copy__PropertyAssignment_4 ) ) )
            // InternalSeleniumDsl.g:1409:1: ( ( rule__Copy__PropertyAssignment_4 ) )
            {
            // InternalSeleniumDsl.g:1409:1: ( ( rule__Copy__PropertyAssignment_4 ) )
            // InternalSeleniumDsl.g:1410:2: ( rule__Copy__PropertyAssignment_4 )
            {
             before(grammarAccess.getCopyAccess().getPropertyAssignment_4()); 
            // InternalSeleniumDsl.g:1411:2: ( rule__Copy__PropertyAssignment_4 )
            // InternalSeleniumDsl.g:1411:3: rule__Copy__PropertyAssignment_4
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
    // InternalSeleniumDsl.g:1419:1: rule__Copy__Group__5 : rule__Copy__Group__5__Impl rule__Copy__Group__6 ;
    public final void rule__Copy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1423:1: ( rule__Copy__Group__5__Impl rule__Copy__Group__6 )
            // InternalSeleniumDsl.g:1424:2: rule__Copy__Group__5__Impl rule__Copy__Group__6
            {
            pushFollow(FOLLOW_11);
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
    // InternalSeleniumDsl.g:1431:1: rule__Copy__Group__5__Impl : ( 'of' ) ;
    public final void rule__Copy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1435:1: ( ( 'of' ) )
            // InternalSeleniumDsl.g:1436:1: ( 'of' )
            {
            // InternalSeleniumDsl.g:1436:1: ( 'of' )
            // InternalSeleniumDsl.g:1437:2: 'of'
            {
             before(grammarAccess.getCopyAccess().getOfKeyword_5()); 
            match(input,33,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1446:1: rule__Copy__Group__6 : rule__Copy__Group__6__Impl rule__Copy__Group__7 ;
    public final void rule__Copy__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1450:1: ( rule__Copy__Group__6__Impl rule__Copy__Group__7 )
            // InternalSeleniumDsl.g:1451:2: rule__Copy__Group__6__Impl rule__Copy__Group__7
            {
            pushFollow(FOLLOW_18);
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
    // InternalSeleniumDsl.g:1458:1: rule__Copy__Group__6__Impl : ( ( rule__Copy__ElementAssignment_6 ) ) ;
    public final void rule__Copy__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1462:1: ( ( ( rule__Copy__ElementAssignment_6 ) ) )
            // InternalSeleniumDsl.g:1463:1: ( ( rule__Copy__ElementAssignment_6 ) )
            {
            // InternalSeleniumDsl.g:1463:1: ( ( rule__Copy__ElementAssignment_6 ) )
            // InternalSeleniumDsl.g:1464:2: ( rule__Copy__ElementAssignment_6 )
            {
             before(grammarAccess.getCopyAccess().getElementAssignment_6()); 
            // InternalSeleniumDsl.g:1465:2: ( rule__Copy__ElementAssignment_6 )
            // InternalSeleniumDsl.g:1465:3: rule__Copy__ElementAssignment_6
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
    // InternalSeleniumDsl.g:1473:1: rule__Copy__Group__7 : rule__Copy__Group__7__Impl rule__Copy__Group__8 ;
    public final void rule__Copy__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1477:1: ( rule__Copy__Group__7__Impl rule__Copy__Group__8 )
            // InternalSeleniumDsl.g:1478:2: rule__Copy__Group__7__Impl rule__Copy__Group__8
            {
            pushFollow(FOLLOW_19);
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
    // InternalSeleniumDsl.g:1485:1: rule__Copy__Group__7__Impl : ( 'as' ) ;
    public final void rule__Copy__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1489:1: ( ( 'as' ) )
            // InternalSeleniumDsl.g:1490:1: ( 'as' )
            {
            // InternalSeleniumDsl.g:1490:1: ( 'as' )
            // InternalSeleniumDsl.g:1491:2: 'as'
            {
             before(grammarAccess.getCopyAccess().getAsKeyword_7()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1500:1: rule__Copy__Group__8 : rule__Copy__Group__8__Impl ;
    public final void rule__Copy__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1504:1: ( rule__Copy__Group__8__Impl )
            // InternalSeleniumDsl.g:1505:2: rule__Copy__Group__8__Impl
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
    // InternalSeleniumDsl.g:1511:1: rule__Copy__Group__8__Impl : ( ( rule__Copy__KeyAssignment_8 ) ) ;
    public final void rule__Copy__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1515:1: ( ( ( rule__Copy__KeyAssignment_8 ) ) )
            // InternalSeleniumDsl.g:1516:1: ( ( rule__Copy__KeyAssignment_8 ) )
            {
            // InternalSeleniumDsl.g:1516:1: ( ( rule__Copy__KeyAssignment_8 ) )
            // InternalSeleniumDsl.g:1517:2: ( rule__Copy__KeyAssignment_8 )
            {
             before(grammarAccess.getCopyAccess().getKeyAssignment_8()); 
            // InternalSeleniumDsl.g:1518:2: ( rule__Copy__KeyAssignment_8 )
            // InternalSeleniumDsl.g:1518:3: rule__Copy__KeyAssignment_8
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
    // InternalSeleniumDsl.g:1527:1: rule__Paste__Group__0 : rule__Paste__Group__0__Impl rule__Paste__Group__1 ;
    public final void rule__Paste__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1531:1: ( rule__Paste__Group__0__Impl rule__Paste__Group__1 )
            // InternalSeleniumDsl.g:1532:2: rule__Paste__Group__0__Impl rule__Paste__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalSeleniumDsl.g:1539:1: rule__Paste__Group__0__Impl : ( 'paste' ) ;
    public final void rule__Paste__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1543:1: ( ( 'paste' ) )
            // InternalSeleniumDsl.g:1544:1: ( 'paste' )
            {
            // InternalSeleniumDsl.g:1544:1: ( 'paste' )
            // InternalSeleniumDsl.g:1545:2: 'paste'
            {
             before(grammarAccess.getPasteAccess().getPasteKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1554:1: rule__Paste__Group__1 : rule__Paste__Group__1__Impl rule__Paste__Group__2 ;
    public final void rule__Paste__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1558:1: ( rule__Paste__Group__1__Impl rule__Paste__Group__2 )
            // InternalSeleniumDsl.g:1559:2: rule__Paste__Group__1__Impl rule__Paste__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalSeleniumDsl.g:1566:1: rule__Paste__Group__1__Impl : ( 'the' ) ;
    public final void rule__Paste__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1570:1: ( ( 'the' ) )
            // InternalSeleniumDsl.g:1571:1: ( 'the' )
            {
            // InternalSeleniumDsl.g:1571:1: ( 'the' )
            // InternalSeleniumDsl.g:1572:2: 'the'
            {
             before(grammarAccess.getPasteAccess().getTheKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1581:1: rule__Paste__Group__2 : rule__Paste__Group__2__Impl rule__Paste__Group__3 ;
    public final void rule__Paste__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1585:1: ( rule__Paste__Group__2__Impl rule__Paste__Group__3 )
            // InternalSeleniumDsl.g:1586:2: rule__Paste__Group__2__Impl rule__Paste__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalSeleniumDsl.g:1593:1: rule__Paste__Group__2__Impl : ( 'content' ) ;
    public final void rule__Paste__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1597:1: ( ( 'content' ) )
            // InternalSeleniumDsl.g:1598:1: ( 'content' )
            {
            // InternalSeleniumDsl.g:1598:1: ( 'content' )
            // InternalSeleniumDsl.g:1599:2: 'content'
            {
             before(grammarAccess.getPasteAccess().getContentKeyword_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1608:1: rule__Paste__Group__3 : rule__Paste__Group__3__Impl rule__Paste__Group__4 ;
    public final void rule__Paste__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1612:1: ( rule__Paste__Group__3__Impl rule__Paste__Group__4 )
            // InternalSeleniumDsl.g:1613:2: rule__Paste__Group__3__Impl rule__Paste__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalSeleniumDsl.g:1620:1: rule__Paste__Group__3__Impl : ( 'of' ) ;
    public final void rule__Paste__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1624:1: ( ( 'of' ) )
            // InternalSeleniumDsl.g:1625:1: ( 'of' )
            {
            // InternalSeleniumDsl.g:1625:1: ( 'of' )
            // InternalSeleniumDsl.g:1626:2: 'of'
            {
             before(grammarAccess.getPasteAccess().getOfKeyword_3()); 
            match(input,33,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1635:1: rule__Paste__Group__4 : rule__Paste__Group__4__Impl rule__Paste__Group__5 ;
    public final void rule__Paste__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1639:1: ( rule__Paste__Group__4__Impl rule__Paste__Group__5 )
            // InternalSeleniumDsl.g:1640:2: rule__Paste__Group__4__Impl rule__Paste__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalSeleniumDsl.g:1647:1: rule__Paste__Group__4__Impl : ( 'the' ) ;
    public final void rule__Paste__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1651:1: ( ( 'the' ) )
            // InternalSeleniumDsl.g:1652:1: ( 'the' )
            {
            // InternalSeleniumDsl.g:1652:1: ( 'the' )
            // InternalSeleniumDsl.g:1653:2: 'the'
            {
             before(grammarAccess.getPasteAccess().getTheKeyword_4()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1662:1: rule__Paste__Group__5 : rule__Paste__Group__5__Impl rule__Paste__Group__6 ;
    public final void rule__Paste__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1666:1: ( rule__Paste__Group__5__Impl rule__Paste__Group__6 )
            // InternalSeleniumDsl.g:1667:2: rule__Paste__Group__5__Impl rule__Paste__Group__6
            {
            pushFollow(FOLLOW_22);
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
    // InternalSeleniumDsl.g:1674:1: rule__Paste__Group__5__Impl : ( 'clipboard' ) ;
    public final void rule__Paste__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1678:1: ( ( 'clipboard' ) )
            // InternalSeleniumDsl.g:1679:1: ( 'clipboard' )
            {
            // InternalSeleniumDsl.g:1679:1: ( 'clipboard' )
            // InternalSeleniumDsl.g:1680:2: 'clipboard'
            {
             before(grammarAccess.getPasteAccess().getClipboardKeyword_5()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1689:1: rule__Paste__Group__6 : rule__Paste__Group__6__Impl rule__Paste__Group__7 ;
    public final void rule__Paste__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1693:1: ( rule__Paste__Group__6__Impl rule__Paste__Group__7 )
            // InternalSeleniumDsl.g:1694:2: rule__Paste__Group__6__Impl rule__Paste__Group__7
            {
            pushFollow(FOLLOW_11);
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
    // InternalSeleniumDsl.g:1701:1: rule__Paste__Group__6__Impl : ( 'in' ) ;
    public final void rule__Paste__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1705:1: ( ( 'in' ) )
            // InternalSeleniumDsl.g:1706:1: ( 'in' )
            {
            // InternalSeleniumDsl.g:1706:1: ( 'in' )
            // InternalSeleniumDsl.g:1707:2: 'in'
            {
             before(grammarAccess.getPasteAccess().getInKeyword_6()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1716:1: rule__Paste__Group__7 : rule__Paste__Group__7__Impl ;
    public final void rule__Paste__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1720:1: ( rule__Paste__Group__7__Impl )
            // InternalSeleniumDsl.g:1721:2: rule__Paste__Group__7__Impl
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
    // InternalSeleniumDsl.g:1727:1: rule__Paste__Group__7__Impl : ( ( rule__Paste__ElementAssignment_7 ) ) ;
    public final void rule__Paste__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1731:1: ( ( ( rule__Paste__ElementAssignment_7 ) ) )
            // InternalSeleniumDsl.g:1732:1: ( ( rule__Paste__ElementAssignment_7 ) )
            {
            // InternalSeleniumDsl.g:1732:1: ( ( rule__Paste__ElementAssignment_7 ) )
            // InternalSeleniumDsl.g:1733:2: ( rule__Paste__ElementAssignment_7 )
            {
             before(grammarAccess.getPasteAccess().getElementAssignment_7()); 
            // InternalSeleniumDsl.g:1734:2: ( rule__Paste__ElementAssignment_7 )
            // InternalSeleniumDsl.g:1734:3: rule__Paste__ElementAssignment_7
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
    // InternalSeleniumDsl.g:1743:1: rule__Insert__Group__0 : rule__Insert__Group__0__Impl rule__Insert__Group__1 ;
    public final void rule__Insert__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1747:1: ( rule__Insert__Group__0__Impl rule__Insert__Group__1 )
            // InternalSeleniumDsl.g:1748:2: rule__Insert__Group__0__Impl rule__Insert__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalSeleniumDsl.g:1755:1: rule__Insert__Group__0__Impl : ( 'fill' ) ;
    public final void rule__Insert__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1759:1: ( ( 'fill' ) )
            // InternalSeleniumDsl.g:1760:1: ( 'fill' )
            {
            // InternalSeleniumDsl.g:1760:1: ( 'fill' )
            // InternalSeleniumDsl.g:1761:2: 'fill'
            {
             before(grammarAccess.getInsertAccess().getFillKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1770:1: rule__Insert__Group__1 : rule__Insert__Group__1__Impl rule__Insert__Group__2 ;
    public final void rule__Insert__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1774:1: ( rule__Insert__Group__1__Impl rule__Insert__Group__2 )
            // InternalSeleniumDsl.g:1775:2: rule__Insert__Group__1__Impl rule__Insert__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalSeleniumDsl.g:1782:1: rule__Insert__Group__1__Impl : ( ( rule__Insert__ElementAssignment_1 ) ) ;
    public final void rule__Insert__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1786:1: ( ( ( rule__Insert__ElementAssignment_1 ) ) )
            // InternalSeleniumDsl.g:1787:1: ( ( rule__Insert__ElementAssignment_1 ) )
            {
            // InternalSeleniumDsl.g:1787:1: ( ( rule__Insert__ElementAssignment_1 ) )
            // InternalSeleniumDsl.g:1788:2: ( rule__Insert__ElementAssignment_1 )
            {
             before(grammarAccess.getInsertAccess().getElementAssignment_1()); 
            // InternalSeleniumDsl.g:1789:2: ( rule__Insert__ElementAssignment_1 )
            // InternalSeleniumDsl.g:1789:3: rule__Insert__ElementAssignment_1
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
    // InternalSeleniumDsl.g:1797:1: rule__Insert__Group__2 : rule__Insert__Group__2__Impl rule__Insert__Group__3 ;
    public final void rule__Insert__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1801:1: ( rule__Insert__Group__2__Impl rule__Insert__Group__3 )
            // InternalSeleniumDsl.g:1802:2: rule__Insert__Group__2__Impl rule__Insert__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalSeleniumDsl.g:1809:1: rule__Insert__Group__2__Impl : ( 'with' ) ;
    public final void rule__Insert__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1813:1: ( ( 'with' ) )
            // InternalSeleniumDsl.g:1814:1: ( 'with' )
            {
            // InternalSeleniumDsl.g:1814:1: ( 'with' )
            // InternalSeleniumDsl.g:1815:2: 'with'
            {
             before(grammarAccess.getInsertAccess().getWithKeyword_2()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1824:1: rule__Insert__Group__3 : rule__Insert__Group__3__Impl ;
    public final void rule__Insert__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1828:1: ( rule__Insert__Group__3__Impl )
            // InternalSeleniumDsl.g:1829:2: rule__Insert__Group__3__Impl
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
    // InternalSeleniumDsl.g:1835:1: rule__Insert__Group__3__Impl : ( ( rule__Insert__ContentAssignment_3 ) ) ;
    public final void rule__Insert__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1839:1: ( ( ( rule__Insert__ContentAssignment_3 ) ) )
            // InternalSeleniumDsl.g:1840:1: ( ( rule__Insert__ContentAssignment_3 ) )
            {
            // InternalSeleniumDsl.g:1840:1: ( ( rule__Insert__ContentAssignment_3 ) )
            // InternalSeleniumDsl.g:1841:2: ( rule__Insert__ContentAssignment_3 )
            {
             before(grammarAccess.getInsertAccess().getContentAssignment_3()); 
            // InternalSeleniumDsl.g:1842:2: ( rule__Insert__ContentAssignment_3 )
            // InternalSeleniumDsl.g:1842:3: rule__Insert__ContentAssignment_3
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
    // InternalSeleniumDsl.g:1851:1: rule__Selector__Group__0 : rule__Selector__Group__0__Impl rule__Selector__Group__1 ;
    public final void rule__Selector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1855:1: ( rule__Selector__Group__0__Impl rule__Selector__Group__1 )
            // InternalSeleniumDsl.g:1856:2: rule__Selector__Group__0__Impl rule__Selector__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalSeleniumDsl.g:1863:1: rule__Selector__Group__0__Impl : ( ( rule__Selector__PredicateAssignment_0 ) ) ;
    public final void rule__Selector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1867:1: ( ( ( rule__Selector__PredicateAssignment_0 ) ) )
            // InternalSeleniumDsl.g:1868:1: ( ( rule__Selector__PredicateAssignment_0 ) )
            {
            // InternalSeleniumDsl.g:1868:1: ( ( rule__Selector__PredicateAssignment_0 ) )
            // InternalSeleniumDsl.g:1869:2: ( rule__Selector__PredicateAssignment_0 )
            {
             before(grammarAccess.getSelectorAccess().getPredicateAssignment_0()); 
            // InternalSeleniumDsl.g:1870:2: ( rule__Selector__PredicateAssignment_0 )
            // InternalSeleniumDsl.g:1870:3: rule__Selector__PredicateAssignment_0
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
    // InternalSeleniumDsl.g:1878:1: rule__Selector__Group__1 : rule__Selector__Group__1__Impl rule__Selector__Group__2 ;
    public final void rule__Selector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1882:1: ( rule__Selector__Group__1__Impl rule__Selector__Group__2 )
            // InternalSeleniumDsl.g:1883:2: rule__Selector__Group__1__Impl rule__Selector__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalSeleniumDsl.g:1890:1: rule__Selector__Group__1__Impl : ( ( rule__Selector__DomTypeAssignment_1 ) ) ;
    public final void rule__Selector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1894:1: ( ( ( rule__Selector__DomTypeAssignment_1 ) ) )
            // InternalSeleniumDsl.g:1895:1: ( ( rule__Selector__DomTypeAssignment_1 ) )
            {
            // InternalSeleniumDsl.g:1895:1: ( ( rule__Selector__DomTypeAssignment_1 ) )
            // InternalSeleniumDsl.g:1896:2: ( rule__Selector__DomTypeAssignment_1 )
            {
             before(grammarAccess.getSelectorAccess().getDomTypeAssignment_1()); 
            // InternalSeleniumDsl.g:1897:2: ( rule__Selector__DomTypeAssignment_1 )
            // InternalSeleniumDsl.g:1897:3: rule__Selector__DomTypeAssignment_1
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
    // InternalSeleniumDsl.g:1905:1: rule__Selector__Group__2 : rule__Selector__Group__2__Impl rule__Selector__Group__3 ;
    public final void rule__Selector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1909:1: ( rule__Selector__Group__2__Impl rule__Selector__Group__3 )
            // InternalSeleniumDsl.g:1910:2: rule__Selector__Group__2__Impl rule__Selector__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalSeleniumDsl.g:1917:1: rule__Selector__Group__2__Impl : ( ( rule__Selector__Group_2__0 )? ) ;
    public final void rule__Selector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1921:1: ( ( ( rule__Selector__Group_2__0 )? ) )
            // InternalSeleniumDsl.g:1922:1: ( ( rule__Selector__Group_2__0 )? )
            {
            // InternalSeleniumDsl.g:1922:1: ( ( rule__Selector__Group_2__0 )? )
            // InternalSeleniumDsl.g:1923:2: ( rule__Selector__Group_2__0 )?
            {
             before(grammarAccess.getSelectorAccess().getGroup_2()); 
            // InternalSeleniumDsl.g:1924:2: ( rule__Selector__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==40) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==41) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // InternalSeleniumDsl.g:1924:3: rule__Selector__Group_2__0
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
    // InternalSeleniumDsl.g:1932:1: rule__Selector__Group__3 : rule__Selector__Group__3__Impl rule__Selector__Group__4 ;
    public final void rule__Selector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1936:1: ( rule__Selector__Group__3__Impl rule__Selector__Group__4 )
            // InternalSeleniumDsl.g:1937:2: rule__Selector__Group__3__Impl rule__Selector__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalSeleniumDsl.g:1944:1: rule__Selector__Group__3__Impl : ( ( rule__Selector__Group_3__0 )? ) ;
    public final void rule__Selector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1948:1: ( ( ( rule__Selector__Group_3__0 )? ) )
            // InternalSeleniumDsl.g:1949:1: ( ( rule__Selector__Group_3__0 )? )
            {
            // InternalSeleniumDsl.g:1949:1: ( ( rule__Selector__Group_3__0 )? )
            // InternalSeleniumDsl.g:1950:2: ( rule__Selector__Group_3__0 )?
            {
             before(grammarAccess.getSelectorAccess().getGroup_3()); 
            // InternalSeleniumDsl.g:1951:2: ( rule__Selector__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==40) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==42) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // InternalSeleniumDsl.g:1951:3: rule__Selector__Group_3__0
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
    // InternalSeleniumDsl.g:1959:1: rule__Selector__Group__4 : rule__Selector__Group__4__Impl rule__Selector__Group__5 ;
    public final void rule__Selector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1963:1: ( rule__Selector__Group__4__Impl rule__Selector__Group__5 )
            // InternalSeleniumDsl.g:1964:2: rule__Selector__Group__4__Impl rule__Selector__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalSeleniumDsl.g:1971:1: rule__Selector__Group__4__Impl : ( ( rule__Selector__Group_4__0 )? ) ;
    public final void rule__Selector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1975:1: ( ( ( rule__Selector__Group_4__0 )? ) )
            // InternalSeleniumDsl.g:1976:1: ( ( rule__Selector__Group_4__0 )? )
            {
            // InternalSeleniumDsl.g:1976:1: ( ( rule__Selector__Group_4__0 )? )
            // InternalSeleniumDsl.g:1977:2: ( rule__Selector__Group_4__0 )?
            {
             before(grammarAccess.getSelectorAccess().getGroup_4()); 
            // InternalSeleniumDsl.g:1978:2: ( rule__Selector__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==44) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSeleniumDsl.g:1978:3: rule__Selector__Group_4__0
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
    // InternalSeleniumDsl.g:1986:1: rule__Selector__Group__5 : rule__Selector__Group__5__Impl ;
    public final void rule__Selector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1990:1: ( rule__Selector__Group__5__Impl )
            // InternalSeleniumDsl.g:1991:2: rule__Selector__Group__5__Impl
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
    // InternalSeleniumDsl.g:1997:1: rule__Selector__Group__5__Impl : ( ( rule__Selector__Group_5__0 )? ) ;
    public final void rule__Selector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2001:1: ( ( ( rule__Selector__Group_5__0 )? ) )
            // InternalSeleniumDsl.g:2002:1: ( ( rule__Selector__Group_5__0 )? )
            {
            // InternalSeleniumDsl.g:2002:1: ( ( rule__Selector__Group_5__0 )? )
            // InternalSeleniumDsl.g:2003:2: ( rule__Selector__Group_5__0 )?
            {
             before(grammarAccess.getSelectorAccess().getGroup_5()); 
            // InternalSeleniumDsl.g:2004:2: ( rule__Selector__Group_5__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==38) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSeleniumDsl.g:2004:3: rule__Selector__Group_5__0
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
    // InternalSeleniumDsl.g:2013:1: rule__Selector__Group_2__0 : rule__Selector__Group_2__0__Impl rule__Selector__Group_2__1 ;
    public final void rule__Selector__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2017:1: ( rule__Selector__Group_2__0__Impl rule__Selector__Group_2__1 )
            // InternalSeleniumDsl.g:2018:2: rule__Selector__Group_2__0__Impl rule__Selector__Group_2__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalSeleniumDsl.g:2025:1: rule__Selector__Group_2__0__Impl : ( 'with' ) ;
    public final void rule__Selector__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2029:1: ( ( 'with' ) )
            // InternalSeleniumDsl.g:2030:1: ( 'with' )
            {
            // InternalSeleniumDsl.g:2030:1: ( 'with' )
            // InternalSeleniumDsl.g:2031:2: 'with'
            {
             before(grammarAccess.getSelectorAccess().getWithKeyword_2_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:2040:1: rule__Selector__Group_2__1 : rule__Selector__Group_2__1__Impl rule__Selector__Group_2__2 ;
    public final void rule__Selector__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2044:1: ( rule__Selector__Group_2__1__Impl rule__Selector__Group_2__2 )
            // InternalSeleniumDsl.g:2045:2: rule__Selector__Group_2__1__Impl rule__Selector__Group_2__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalSeleniumDsl.g:2052:1: rule__Selector__Group_2__1__Impl : ( 'properties' ) ;
    public final void rule__Selector__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2056:1: ( ( 'properties' ) )
            // InternalSeleniumDsl.g:2057:1: ( 'properties' )
            {
            // InternalSeleniumDsl.g:2057:1: ( 'properties' )
            // InternalSeleniumDsl.g:2058:2: 'properties'
            {
             before(grammarAccess.getSelectorAccess().getPropertiesKeyword_2_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:2067:1: rule__Selector__Group_2__2 : rule__Selector__Group_2__2__Impl ;
    public final void rule__Selector__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2071:1: ( rule__Selector__Group_2__2__Impl )
            // InternalSeleniumDsl.g:2072:2: rule__Selector__Group_2__2__Impl
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
    // InternalSeleniumDsl.g:2078:1: rule__Selector__Group_2__2__Impl : ( ( rule__Selector__AttributesAssignment_2_2 ) ) ;
    public final void rule__Selector__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2082:1: ( ( ( rule__Selector__AttributesAssignment_2_2 ) ) )
            // InternalSeleniumDsl.g:2083:1: ( ( rule__Selector__AttributesAssignment_2_2 ) )
            {
            // InternalSeleniumDsl.g:2083:1: ( ( rule__Selector__AttributesAssignment_2_2 ) )
            // InternalSeleniumDsl.g:2084:2: ( rule__Selector__AttributesAssignment_2_2 )
            {
             before(grammarAccess.getSelectorAccess().getAttributesAssignment_2_2()); 
            // InternalSeleniumDsl.g:2085:2: ( rule__Selector__AttributesAssignment_2_2 )
            // InternalSeleniumDsl.g:2085:3: rule__Selector__AttributesAssignment_2_2
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
    // InternalSeleniumDsl.g:2094:1: rule__Selector__Group_3__0 : rule__Selector__Group_3__0__Impl rule__Selector__Group_3__1 ;
    public final void rule__Selector__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2098:1: ( rule__Selector__Group_3__0__Impl rule__Selector__Group_3__1 )
            // InternalSeleniumDsl.g:2099:2: rule__Selector__Group_3__0__Impl rule__Selector__Group_3__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalSeleniumDsl.g:2106:1: rule__Selector__Group_3__0__Impl : ( 'with' ) ;
    public final void rule__Selector__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2110:1: ( ( 'with' ) )
            // InternalSeleniumDsl.g:2111:1: ( 'with' )
            {
            // InternalSeleniumDsl.g:2111:1: ( 'with' )
            // InternalSeleniumDsl.g:2112:2: 'with'
            {
             before(grammarAccess.getSelectorAccess().getWithKeyword_3_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:2121:1: rule__Selector__Group_3__1 : rule__Selector__Group_3__1__Impl rule__Selector__Group_3__2 ;
    public final void rule__Selector__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2125:1: ( rule__Selector__Group_3__1__Impl rule__Selector__Group_3__2 )
            // InternalSeleniumDsl.g:2126:2: rule__Selector__Group_3__1__Impl rule__Selector__Group_3__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalSeleniumDsl.g:2133:1: rule__Selector__Group_3__1__Impl : ( 'associated' ) ;
    public final void rule__Selector__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2137:1: ( ( 'associated' ) )
            // InternalSeleniumDsl.g:2138:1: ( 'associated' )
            {
            // InternalSeleniumDsl.g:2138:1: ( 'associated' )
            // InternalSeleniumDsl.g:2139:2: 'associated'
            {
             before(grammarAccess.getSelectorAccess().getAssociatedKeyword_3_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:2148:1: rule__Selector__Group_3__2 : rule__Selector__Group_3__2__Impl rule__Selector__Group_3__3 ;
    public final void rule__Selector__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2152:1: ( rule__Selector__Group_3__2__Impl rule__Selector__Group_3__3 )
            // InternalSeleniumDsl.g:2153:2: rule__Selector__Group_3__2__Impl rule__Selector__Group_3__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalSeleniumDsl.g:2160:1: rule__Selector__Group_3__2__Impl : ( 'label' ) ;
    public final void rule__Selector__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2164:1: ( ( 'label' ) )
            // InternalSeleniumDsl.g:2165:1: ( 'label' )
            {
            // InternalSeleniumDsl.g:2165:1: ( 'label' )
            // InternalSeleniumDsl.g:2166:2: 'label'
            {
             before(grammarAccess.getSelectorAccess().getLabelKeyword_3_2()); 
            match(input,43,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:2175:1: rule__Selector__Group_3__3 : rule__Selector__Group_3__3__Impl ;
    public final void rule__Selector__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2179:1: ( rule__Selector__Group_3__3__Impl )
            // InternalSeleniumDsl.g:2180:2: rule__Selector__Group_3__3__Impl
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
    // InternalSeleniumDsl.g:2186:1: rule__Selector__Group_3__3__Impl : ( ( rule__Selector__LabelAssignment_3_3 ) ) ;
    public final void rule__Selector__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2190:1: ( ( ( rule__Selector__LabelAssignment_3_3 ) ) )
            // InternalSeleniumDsl.g:2191:1: ( ( rule__Selector__LabelAssignment_3_3 ) )
            {
            // InternalSeleniumDsl.g:2191:1: ( ( rule__Selector__LabelAssignment_3_3 ) )
            // InternalSeleniumDsl.g:2192:2: ( rule__Selector__LabelAssignment_3_3 )
            {
             before(grammarAccess.getSelectorAccess().getLabelAssignment_3_3()); 
            // InternalSeleniumDsl.g:2193:2: ( rule__Selector__LabelAssignment_3_3 )
            // InternalSeleniumDsl.g:2193:3: rule__Selector__LabelAssignment_3_3
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
    // InternalSeleniumDsl.g:2202:1: rule__Selector__Group_4__0 : rule__Selector__Group_4__0__Impl rule__Selector__Group_4__1 ;
    public final void rule__Selector__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2206:1: ( rule__Selector__Group_4__0__Impl rule__Selector__Group_4__1 )
            // InternalSeleniumDsl.g:2207:2: rule__Selector__Group_4__0__Impl rule__Selector__Group_4__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalSeleniumDsl.g:2214:1: rule__Selector__Group_4__0__Impl : ( 'that' ) ;
    public final void rule__Selector__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2218:1: ( ( 'that' ) )
            // InternalSeleniumDsl.g:2219:1: ( 'that' )
            {
            // InternalSeleniumDsl.g:2219:1: ( 'that' )
            // InternalSeleniumDsl.g:2220:2: 'that'
            {
             before(grammarAccess.getSelectorAccess().getThatKeyword_4_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:2229:1: rule__Selector__Group_4__1 : rule__Selector__Group_4__1__Impl rule__Selector__Group_4__2 ;
    public final void rule__Selector__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2233:1: ( rule__Selector__Group_4__1__Impl rule__Selector__Group_4__2 )
            // InternalSeleniumDsl.g:2234:2: rule__Selector__Group_4__1__Impl rule__Selector__Group_4__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalSeleniumDsl.g:2241:1: rule__Selector__Group_4__1__Impl : ( 'is' ) ;
    public final void rule__Selector__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2245:1: ( ( 'is' ) )
            // InternalSeleniumDsl.g:2246:1: ( 'is' )
            {
            // InternalSeleniumDsl.g:2246:1: ( 'is' )
            // InternalSeleniumDsl.g:2247:2: 'is'
            {
             before(grammarAccess.getSelectorAccess().getIsKeyword_4_1()); 
            match(input,45,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:2256:1: rule__Selector__Group_4__2 : rule__Selector__Group_4__2__Impl ;
    public final void rule__Selector__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2260:1: ( rule__Selector__Group_4__2__Impl )
            // InternalSeleniumDsl.g:2261:2: rule__Selector__Group_4__2__Impl
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
    // InternalSeleniumDsl.g:2267:1: rule__Selector__Group_4__2__Impl : ( ( rule__Selector__PropertiesAssignment_4_2 ) ) ;
    public final void rule__Selector__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2271:1: ( ( ( rule__Selector__PropertiesAssignment_4_2 ) ) )
            // InternalSeleniumDsl.g:2272:1: ( ( rule__Selector__PropertiesAssignment_4_2 ) )
            {
            // InternalSeleniumDsl.g:2272:1: ( ( rule__Selector__PropertiesAssignment_4_2 ) )
            // InternalSeleniumDsl.g:2273:2: ( rule__Selector__PropertiesAssignment_4_2 )
            {
             before(grammarAccess.getSelectorAccess().getPropertiesAssignment_4_2()); 
            // InternalSeleniumDsl.g:2274:2: ( rule__Selector__PropertiesAssignment_4_2 )
            // InternalSeleniumDsl.g:2274:3: rule__Selector__PropertiesAssignment_4_2
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
    // InternalSeleniumDsl.g:2283:1: rule__Selector__Group_5__0 : rule__Selector__Group_5__0__Impl rule__Selector__Group_5__1 ;
    public final void rule__Selector__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2287:1: ( rule__Selector__Group_5__0__Impl rule__Selector__Group_5__1 )
            // InternalSeleniumDsl.g:2288:2: rule__Selector__Group_5__0__Impl rule__Selector__Group_5__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalSeleniumDsl.g:2295:1: rule__Selector__Group_5__0__Impl : ( 'in' ) ;
    public final void rule__Selector__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2299:1: ( ( 'in' ) )
            // InternalSeleniumDsl.g:2300:1: ( 'in' )
            {
            // InternalSeleniumDsl.g:2300:1: ( 'in' )
            // InternalSeleniumDsl.g:2301:2: 'in'
            {
             before(grammarAccess.getSelectorAccess().getInKeyword_5_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:2310:1: rule__Selector__Group_5__1 : rule__Selector__Group_5__1__Impl ;
    public final void rule__Selector__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2314:1: ( rule__Selector__Group_5__1__Impl )
            // InternalSeleniumDsl.g:2315:2: rule__Selector__Group_5__1__Impl
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
    // InternalSeleniumDsl.g:2321:1: rule__Selector__Group_5__1__Impl : ( ( rule__Selector__ParentAssignment_5_1 ) ) ;
    public final void rule__Selector__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2325:1: ( ( ( rule__Selector__ParentAssignment_5_1 ) ) )
            // InternalSeleniumDsl.g:2326:1: ( ( rule__Selector__ParentAssignment_5_1 ) )
            {
            // InternalSeleniumDsl.g:2326:1: ( ( rule__Selector__ParentAssignment_5_1 ) )
            // InternalSeleniumDsl.g:2327:2: ( rule__Selector__ParentAssignment_5_1 )
            {
             before(grammarAccess.getSelectorAccess().getParentAssignment_5_1()); 
            // InternalSeleniumDsl.g:2328:2: ( rule__Selector__ParentAssignment_5_1 )
            // InternalSeleniumDsl.g:2328:3: rule__Selector__ParentAssignment_5_1
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
    // InternalSeleniumDsl.g:2337:1: rule__Attributes__Group__0 : rule__Attributes__Group__0__Impl rule__Attributes__Group__1 ;
    public final void rule__Attributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2341:1: ( rule__Attributes__Group__0__Impl rule__Attributes__Group__1 )
            // InternalSeleniumDsl.g:2342:2: rule__Attributes__Group__0__Impl rule__Attributes__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalSeleniumDsl.g:2349:1: rule__Attributes__Group__0__Impl : ( ( rule__Attributes__AttributesAssignment_0 ) ) ;
    public final void rule__Attributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2353:1: ( ( ( rule__Attributes__AttributesAssignment_0 ) ) )
            // InternalSeleniumDsl.g:2354:1: ( ( rule__Attributes__AttributesAssignment_0 ) )
            {
            // InternalSeleniumDsl.g:2354:1: ( ( rule__Attributes__AttributesAssignment_0 ) )
            // InternalSeleniumDsl.g:2355:2: ( rule__Attributes__AttributesAssignment_0 )
            {
             before(grammarAccess.getAttributesAccess().getAttributesAssignment_0()); 
            // InternalSeleniumDsl.g:2356:2: ( rule__Attributes__AttributesAssignment_0 )
            // InternalSeleniumDsl.g:2356:3: rule__Attributes__AttributesAssignment_0
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
    // InternalSeleniumDsl.g:2364:1: rule__Attributes__Group__1 : rule__Attributes__Group__1__Impl ;
    public final void rule__Attributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2368:1: ( rule__Attributes__Group__1__Impl )
            // InternalSeleniumDsl.g:2369:2: rule__Attributes__Group__1__Impl
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
    // InternalSeleniumDsl.g:2375:1: rule__Attributes__Group__1__Impl : ( ( rule__Attributes__Group_1__0 )? ) ;
    public final void rule__Attributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2379:1: ( ( ( rule__Attributes__Group_1__0 )? ) )
            // InternalSeleniumDsl.g:2380:1: ( ( rule__Attributes__Group_1__0 )? )
            {
            // InternalSeleniumDsl.g:2380:1: ( ( rule__Attributes__Group_1__0 )? )
            // InternalSeleniumDsl.g:2381:2: ( rule__Attributes__Group_1__0 )?
            {
             before(grammarAccess.getAttributesAccess().getGroup_1()); 
            // InternalSeleniumDsl.g:2382:2: ( rule__Attributes__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==46) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSeleniumDsl.g:2382:3: rule__Attributes__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attributes__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

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
    // InternalSeleniumDsl.g:2391:1: rule__Attributes__Group_1__0 : rule__Attributes__Group_1__0__Impl rule__Attributes__Group_1__1 ;
    public final void rule__Attributes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2395:1: ( rule__Attributes__Group_1__0__Impl rule__Attributes__Group_1__1 )
            // InternalSeleniumDsl.g:2396:2: rule__Attributes__Group_1__0__Impl rule__Attributes__Group_1__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalSeleniumDsl.g:2403:1: rule__Attributes__Group_1__0__Impl : ( 'and' ) ;
    public final void rule__Attributes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2407:1: ( ( 'and' ) )
            // InternalSeleniumDsl.g:2408:1: ( 'and' )
            {
            // InternalSeleniumDsl.g:2408:1: ( 'and' )
            // InternalSeleniumDsl.g:2409:2: 'and'
            {
             before(grammarAccess.getAttributesAccess().getAndKeyword_1_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:2418:1: rule__Attributes__Group_1__1 : rule__Attributes__Group_1__1__Impl ;
    public final void rule__Attributes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2422:1: ( rule__Attributes__Group_1__1__Impl )
            // InternalSeleniumDsl.g:2423:2: rule__Attributes__Group_1__1__Impl
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
    // InternalSeleniumDsl.g:2429:1: rule__Attributes__Group_1__1__Impl : ( ( rule__Attributes__AttributesAssignment_1_1 ) ) ;
    public final void rule__Attributes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2433:1: ( ( ( rule__Attributes__AttributesAssignment_1_1 ) ) )
            // InternalSeleniumDsl.g:2434:1: ( ( rule__Attributes__AttributesAssignment_1_1 ) )
            {
            // InternalSeleniumDsl.g:2434:1: ( ( rule__Attributes__AttributesAssignment_1_1 ) )
            // InternalSeleniumDsl.g:2435:2: ( rule__Attributes__AttributesAssignment_1_1 )
            {
             before(grammarAccess.getAttributesAccess().getAttributesAssignment_1_1()); 
            // InternalSeleniumDsl.g:2436:2: ( rule__Attributes__AttributesAssignment_1_1 )
            // InternalSeleniumDsl.g:2436:3: rule__Attributes__AttributesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Attributes__AttributesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributesAccess().getAttributesAssignment_1_1()); 

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
    // InternalSeleniumDsl.g:2445:1: rule__ElementAttribute__Group__0 : rule__ElementAttribute__Group__0__Impl rule__ElementAttribute__Group__1 ;
    public final void rule__ElementAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2449:1: ( rule__ElementAttribute__Group__0__Impl rule__ElementAttribute__Group__1 )
            // InternalSeleniumDsl.g:2450:2: rule__ElementAttribute__Group__0__Impl rule__ElementAttribute__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalSeleniumDsl.g:2457:1: rule__ElementAttribute__Group__0__Impl : ( ( rule__ElementAttribute__NameAssignment_0 ) ) ;
    public final void rule__ElementAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2461:1: ( ( ( rule__ElementAttribute__NameAssignment_0 ) ) )
            // InternalSeleniumDsl.g:2462:1: ( ( rule__ElementAttribute__NameAssignment_0 ) )
            {
            // InternalSeleniumDsl.g:2462:1: ( ( rule__ElementAttribute__NameAssignment_0 ) )
            // InternalSeleniumDsl.g:2463:2: ( rule__ElementAttribute__NameAssignment_0 )
            {
             before(grammarAccess.getElementAttributeAccess().getNameAssignment_0()); 
            // InternalSeleniumDsl.g:2464:2: ( rule__ElementAttribute__NameAssignment_0 )
            // InternalSeleniumDsl.g:2464:3: rule__ElementAttribute__NameAssignment_0
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
    // InternalSeleniumDsl.g:2472:1: rule__ElementAttribute__Group__1 : rule__ElementAttribute__Group__1__Impl rule__ElementAttribute__Group__2 ;
    public final void rule__ElementAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2476:1: ( rule__ElementAttribute__Group__1__Impl rule__ElementAttribute__Group__2 )
            // InternalSeleniumDsl.g:2477:2: rule__ElementAttribute__Group__1__Impl rule__ElementAttribute__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalSeleniumDsl.g:2484:1: rule__ElementAttribute__Group__1__Impl : ( ( rule__ElementAttribute__MatcherAssignment_1 ) ) ;
    public final void rule__ElementAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2488:1: ( ( ( rule__ElementAttribute__MatcherAssignment_1 ) ) )
            // InternalSeleniumDsl.g:2489:1: ( ( rule__ElementAttribute__MatcherAssignment_1 ) )
            {
            // InternalSeleniumDsl.g:2489:1: ( ( rule__ElementAttribute__MatcherAssignment_1 ) )
            // InternalSeleniumDsl.g:2490:2: ( rule__ElementAttribute__MatcherAssignment_1 )
            {
             before(grammarAccess.getElementAttributeAccess().getMatcherAssignment_1()); 
            // InternalSeleniumDsl.g:2491:2: ( rule__ElementAttribute__MatcherAssignment_1 )
            // InternalSeleniumDsl.g:2491:3: rule__ElementAttribute__MatcherAssignment_1
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
    // InternalSeleniumDsl.g:2499:1: rule__ElementAttribute__Group__2 : rule__ElementAttribute__Group__2__Impl ;
    public final void rule__ElementAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2503:1: ( rule__ElementAttribute__Group__2__Impl )
            // InternalSeleniumDsl.g:2504:2: rule__ElementAttribute__Group__2__Impl
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
    // InternalSeleniumDsl.g:2510:1: rule__ElementAttribute__Group__2__Impl : ( ( rule__ElementAttribute__ValueAssignment_2 ) ) ;
    public final void rule__ElementAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2514:1: ( ( ( rule__ElementAttribute__ValueAssignment_2 ) ) )
            // InternalSeleniumDsl.g:2515:1: ( ( rule__ElementAttribute__ValueAssignment_2 ) )
            {
            // InternalSeleniumDsl.g:2515:1: ( ( rule__ElementAttribute__ValueAssignment_2 ) )
            // InternalSeleniumDsl.g:2516:2: ( rule__ElementAttribute__ValueAssignment_2 )
            {
             before(grammarAccess.getElementAttributeAccess().getValueAssignment_2()); 
            // InternalSeleniumDsl.g:2517:2: ( rule__ElementAttribute__ValueAssignment_2 )
            // InternalSeleniumDsl.g:2517:3: rule__ElementAttribute__ValueAssignment_2
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
    // InternalSeleniumDsl.g:2526:1: rule__ClipboardContent__Group__0 : rule__ClipboardContent__Group__0__Impl rule__ClipboardContent__Group__1 ;
    public final void rule__ClipboardContent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2530:1: ( rule__ClipboardContent__Group__0__Impl rule__ClipboardContent__Group__1 )
            // InternalSeleniumDsl.g:2531:2: rule__ClipboardContent__Group__0__Impl rule__ClipboardContent__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalSeleniumDsl.g:2538:1: rule__ClipboardContent__Group__0__Impl : ( 'the' ) ;
    public final void rule__ClipboardContent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2542:1: ( ( 'the' ) )
            // InternalSeleniumDsl.g:2543:1: ( 'the' )
            {
            // InternalSeleniumDsl.g:2543:1: ( 'the' )
            // InternalSeleniumDsl.g:2544:2: 'the'
            {
             before(grammarAccess.getClipboardContentAccess().getTheKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:2553:1: rule__ClipboardContent__Group__1 : rule__ClipboardContent__Group__1__Impl rule__ClipboardContent__Group__2 ;
    public final void rule__ClipboardContent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2557:1: ( rule__ClipboardContent__Group__1__Impl rule__ClipboardContent__Group__2 )
            // InternalSeleniumDsl.g:2558:2: rule__ClipboardContent__Group__1__Impl rule__ClipboardContent__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalSeleniumDsl.g:2565:1: rule__ClipboardContent__Group__1__Impl : ( 'saved' ) ;
    public final void rule__ClipboardContent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2569:1: ( ( 'saved' ) )
            // InternalSeleniumDsl.g:2570:1: ( 'saved' )
            {
            // InternalSeleniumDsl.g:2570:1: ( 'saved' )
            // InternalSeleniumDsl.g:2571:2: 'saved'
            {
             before(grammarAccess.getClipboardContentAccess().getSavedKeyword_1()); 
            match(input,47,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:2580:1: rule__ClipboardContent__Group__2 : rule__ClipboardContent__Group__2__Impl rule__ClipboardContent__Group__3 ;
    public final void rule__ClipboardContent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2584:1: ( rule__ClipboardContent__Group__2__Impl rule__ClipboardContent__Group__3 )
            // InternalSeleniumDsl.g:2585:2: rule__ClipboardContent__Group__2__Impl rule__ClipboardContent__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalSeleniumDsl.g:2592:1: rule__ClipboardContent__Group__2__Impl : ( 'content' ) ;
    public final void rule__ClipboardContent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2596:1: ( ( 'content' ) )
            // InternalSeleniumDsl.g:2597:1: ( 'content' )
            {
            // InternalSeleniumDsl.g:2597:1: ( 'content' )
            // InternalSeleniumDsl.g:2598:2: 'content'
            {
             before(grammarAccess.getClipboardContentAccess().getContentKeyword_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:2607:1: rule__ClipboardContent__Group__3 : rule__ClipboardContent__Group__3__Impl ;
    public final void rule__ClipboardContent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2611:1: ( rule__ClipboardContent__Group__3__Impl )
            // InternalSeleniumDsl.g:2612:2: rule__ClipboardContent__Group__3__Impl
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
    // InternalSeleniumDsl.g:2618:1: rule__ClipboardContent__Group__3__Impl : ( ( rule__ClipboardContent__KeyAssignment_3 ) ) ;
    public final void rule__ClipboardContent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2622:1: ( ( ( rule__ClipboardContent__KeyAssignment_3 ) ) )
            // InternalSeleniumDsl.g:2623:1: ( ( rule__ClipboardContent__KeyAssignment_3 ) )
            {
            // InternalSeleniumDsl.g:2623:1: ( ( rule__ClipboardContent__KeyAssignment_3 ) )
            // InternalSeleniumDsl.g:2624:2: ( rule__ClipboardContent__KeyAssignment_3 )
            {
             before(grammarAccess.getClipboardContentAccess().getKeyAssignment_3()); 
            // InternalSeleniumDsl.g:2625:2: ( rule__ClipboardContent__KeyAssignment_3 )
            // InternalSeleniumDsl.g:2625:3: rule__ClipboardContent__KeyAssignment_3
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
    // InternalSeleniumDsl.g:2634:1: rule__Properties__Group__0 : rule__Properties__Group__0__Impl rule__Properties__Group__1 ;
    public final void rule__Properties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2638:1: ( rule__Properties__Group__0__Impl rule__Properties__Group__1 )
            // InternalSeleniumDsl.g:2639:2: rule__Properties__Group__0__Impl rule__Properties__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalSeleniumDsl.g:2646:1: rule__Properties__Group__0__Impl : ( ( rule__Properties__PropertiesAssignment_0 ) ) ;
    public final void rule__Properties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2650:1: ( ( ( rule__Properties__PropertiesAssignment_0 ) ) )
            // InternalSeleniumDsl.g:2651:1: ( ( rule__Properties__PropertiesAssignment_0 ) )
            {
            // InternalSeleniumDsl.g:2651:1: ( ( rule__Properties__PropertiesAssignment_0 ) )
            // InternalSeleniumDsl.g:2652:2: ( rule__Properties__PropertiesAssignment_0 )
            {
             before(grammarAccess.getPropertiesAccess().getPropertiesAssignment_0()); 
            // InternalSeleniumDsl.g:2653:2: ( rule__Properties__PropertiesAssignment_0 )
            // InternalSeleniumDsl.g:2653:3: rule__Properties__PropertiesAssignment_0
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
    // InternalSeleniumDsl.g:2661:1: rule__Properties__Group__1 : rule__Properties__Group__1__Impl ;
    public final void rule__Properties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2665:1: ( rule__Properties__Group__1__Impl )
            // InternalSeleniumDsl.g:2666:2: rule__Properties__Group__1__Impl
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
    // InternalSeleniumDsl.g:2672:1: rule__Properties__Group__1__Impl : ( ( rule__Properties__Group_1__0 )? ) ;
    public final void rule__Properties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2676:1: ( ( ( rule__Properties__Group_1__0 )? ) )
            // InternalSeleniumDsl.g:2677:1: ( ( rule__Properties__Group_1__0 )? )
            {
            // InternalSeleniumDsl.g:2677:1: ( ( rule__Properties__Group_1__0 )? )
            // InternalSeleniumDsl.g:2678:2: ( rule__Properties__Group_1__0 )?
            {
             before(grammarAccess.getPropertiesAccess().getGroup_1()); 
            // InternalSeleniumDsl.g:2679:2: ( rule__Properties__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==46) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSeleniumDsl.g:2679:3: rule__Properties__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Properties__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

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
    // InternalSeleniumDsl.g:2688:1: rule__Properties__Group_1__0 : rule__Properties__Group_1__0__Impl rule__Properties__Group_1__1 ;
    public final void rule__Properties__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2692:1: ( rule__Properties__Group_1__0__Impl rule__Properties__Group_1__1 )
            // InternalSeleniumDsl.g:2693:2: rule__Properties__Group_1__0__Impl rule__Properties__Group_1__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalSeleniumDsl.g:2700:1: rule__Properties__Group_1__0__Impl : ( 'and' ) ;
    public final void rule__Properties__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2704:1: ( ( 'and' ) )
            // InternalSeleniumDsl.g:2705:1: ( 'and' )
            {
            // InternalSeleniumDsl.g:2705:1: ( 'and' )
            // InternalSeleniumDsl.g:2706:2: 'and'
            {
             before(grammarAccess.getPropertiesAccess().getAndKeyword_1_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:2715:1: rule__Properties__Group_1__1 : rule__Properties__Group_1__1__Impl ;
    public final void rule__Properties__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2719:1: ( rule__Properties__Group_1__1__Impl )
            // InternalSeleniumDsl.g:2720:2: rule__Properties__Group_1__1__Impl
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
    // InternalSeleniumDsl.g:2726:1: rule__Properties__Group_1__1__Impl : ( ( rule__Properties__PropertiesAssignment_1_1 ) ) ;
    public final void rule__Properties__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2730:1: ( ( ( rule__Properties__PropertiesAssignment_1_1 ) ) )
            // InternalSeleniumDsl.g:2731:1: ( ( rule__Properties__PropertiesAssignment_1_1 ) )
            {
            // InternalSeleniumDsl.g:2731:1: ( ( rule__Properties__PropertiesAssignment_1_1 ) )
            // InternalSeleniumDsl.g:2732:2: ( rule__Properties__PropertiesAssignment_1_1 )
            {
             before(grammarAccess.getPropertiesAccess().getPropertiesAssignment_1_1()); 
            // InternalSeleniumDsl.g:2733:2: ( rule__Properties__PropertiesAssignment_1_1 )
            // InternalSeleniumDsl.g:2733:3: rule__Properties__PropertiesAssignment_1_1
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
    // InternalSeleniumDsl.g:2742:1: rule__ElementProperty__Group__0 : rule__ElementProperty__Group__0__Impl rule__ElementProperty__Group__1 ;
    public final void rule__ElementProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2746:1: ( rule__ElementProperty__Group__0__Impl rule__ElementProperty__Group__1 )
            // InternalSeleniumDsl.g:2747:2: rule__ElementProperty__Group__0__Impl rule__ElementProperty__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalSeleniumDsl.g:2754:1: rule__ElementProperty__Group__0__Impl : ( ( rule__ElementProperty__NegatedAssignment_0 )? ) ;
    public final void rule__ElementProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2758:1: ( ( ( rule__ElementProperty__NegatedAssignment_0 )? ) )
            // InternalSeleniumDsl.g:2759:1: ( ( rule__ElementProperty__NegatedAssignment_0 )? )
            {
            // InternalSeleniumDsl.g:2759:1: ( ( rule__ElementProperty__NegatedAssignment_0 )? )
            // InternalSeleniumDsl.g:2760:2: ( rule__ElementProperty__NegatedAssignment_0 )?
            {
             before(grammarAccess.getElementPropertyAccess().getNegatedAssignment_0()); 
            // InternalSeleniumDsl.g:2761:2: ( rule__ElementProperty__NegatedAssignment_0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==53) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSeleniumDsl.g:2761:3: rule__ElementProperty__NegatedAssignment_0
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
    // InternalSeleniumDsl.g:2769:1: rule__ElementProperty__Group__1 : rule__ElementProperty__Group__1__Impl ;
    public final void rule__ElementProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2773:1: ( rule__ElementProperty__Group__1__Impl )
            // InternalSeleniumDsl.g:2774:2: rule__ElementProperty__Group__1__Impl
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
    // InternalSeleniumDsl.g:2780:1: rule__ElementProperty__Group__1__Impl : ( ( rule__ElementProperty__PropertyAssignment_1 ) ) ;
    public final void rule__ElementProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2784:1: ( ( ( rule__ElementProperty__PropertyAssignment_1 ) ) )
            // InternalSeleniumDsl.g:2785:1: ( ( rule__ElementProperty__PropertyAssignment_1 ) )
            {
            // InternalSeleniumDsl.g:2785:1: ( ( rule__ElementProperty__PropertyAssignment_1 ) )
            // InternalSeleniumDsl.g:2786:2: ( rule__ElementProperty__PropertyAssignment_1 )
            {
             before(grammarAccess.getElementPropertyAccess().getPropertyAssignment_1()); 
            // InternalSeleniumDsl.g:2787:2: ( rule__ElementProperty__PropertyAssignment_1 )
            // InternalSeleniumDsl.g:2787:3: rule__ElementProperty__PropertyAssignment_1
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


    // $ANTLR start "rule__AllCondition__Group__0"
    // InternalSeleniumDsl.g:2796:1: rule__AllCondition__Group__0 : rule__AllCondition__Group__0__Impl rule__AllCondition__Group__1 ;
    public final void rule__AllCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2800:1: ( rule__AllCondition__Group__0__Impl rule__AllCondition__Group__1 )
            // InternalSeleniumDsl.g:2801:2: rule__AllCondition__Group__0__Impl rule__AllCondition__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__AllCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllCondition__Group__1();

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
    // $ANTLR end "rule__AllCondition__Group__0"


    // $ANTLR start "rule__AllCondition__Group__0__Impl"
    // InternalSeleniumDsl.g:2808:1: rule__AllCondition__Group__0__Impl : ( () ) ;
    public final void rule__AllCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2812:1: ( ( () ) )
            // InternalSeleniumDsl.g:2813:1: ( () )
            {
            // InternalSeleniumDsl.g:2813:1: ( () )
            // InternalSeleniumDsl.g:2814:2: ()
            {
             before(grammarAccess.getAllConditionAccess().getAllConditionAction_0()); 
            // InternalSeleniumDsl.g:2815:2: ()
            // InternalSeleniumDsl.g:2815:3: 
            {
            }

             after(grammarAccess.getAllConditionAccess().getAllConditionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllCondition__Group__0__Impl"


    // $ANTLR start "rule__AllCondition__Group__1"
    // InternalSeleniumDsl.g:2823:1: rule__AllCondition__Group__1 : rule__AllCondition__Group__1__Impl rule__AllCondition__Group__2 ;
    public final void rule__AllCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2827:1: ( rule__AllCondition__Group__1__Impl rule__AllCondition__Group__2 )
            // InternalSeleniumDsl.g:2828:2: rule__AllCondition__Group__1__Impl rule__AllCondition__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__AllCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllCondition__Group__2();

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
    // $ANTLR end "rule__AllCondition__Group__1"


    // $ANTLR start "rule__AllCondition__Group__1__Impl"
    // InternalSeleniumDsl.g:2835:1: rule__AllCondition__Group__1__Impl : ( 'all' ) ;
    public final void rule__AllCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2839:1: ( ( 'all' ) )
            // InternalSeleniumDsl.g:2840:1: ( 'all' )
            {
            // InternalSeleniumDsl.g:2840:1: ( 'all' )
            // InternalSeleniumDsl.g:2841:2: 'all'
            {
             before(grammarAccess.getAllConditionAccess().getAllKeyword_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getAllConditionAccess().getAllKeyword_1()); 

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
    // $ANTLR end "rule__AllCondition__Group__1__Impl"


    // $ANTLR start "rule__AllCondition__Group__2"
    // InternalSeleniumDsl.g:2850:1: rule__AllCondition__Group__2 : rule__AllCondition__Group__2__Impl rule__AllCondition__Group__3 ;
    public final void rule__AllCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2854:1: ( rule__AllCondition__Group__2__Impl rule__AllCondition__Group__3 )
            // InternalSeleniumDsl.g:2855:2: rule__AllCondition__Group__2__Impl rule__AllCondition__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__AllCondition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllCondition__Group__3();

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
    // $ANTLR end "rule__AllCondition__Group__2"


    // $ANTLR start "rule__AllCondition__Group__2__Impl"
    // InternalSeleniumDsl.g:2862:1: rule__AllCondition__Group__2__Impl : ( 'elements' ) ;
    public final void rule__AllCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2866:1: ( ( 'elements' ) )
            // InternalSeleniumDsl.g:2867:1: ( 'elements' )
            {
            // InternalSeleniumDsl.g:2867:1: ( 'elements' )
            // InternalSeleniumDsl.g:2868:2: 'elements'
            {
             before(grammarAccess.getAllConditionAccess().getElementsKeyword_2()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getAllConditionAccess().getElementsKeyword_2()); 

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
    // $ANTLR end "rule__AllCondition__Group__2__Impl"


    // $ANTLR start "rule__AllCondition__Group__3"
    // InternalSeleniumDsl.g:2877:1: rule__AllCondition__Group__3 : rule__AllCondition__Group__3__Impl rule__AllCondition__Group__4 ;
    public final void rule__AllCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2881:1: ( rule__AllCondition__Group__3__Impl rule__AllCondition__Group__4 )
            // InternalSeleniumDsl.g:2882:2: rule__AllCondition__Group__3__Impl rule__AllCondition__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__AllCondition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllCondition__Group__4();

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
    // $ANTLR end "rule__AllCondition__Group__3"


    // $ANTLR start "rule__AllCondition__Group__3__Impl"
    // InternalSeleniumDsl.g:2889:1: rule__AllCondition__Group__3__Impl : ( 'of' ) ;
    public final void rule__AllCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2893:1: ( ( 'of' ) )
            // InternalSeleniumDsl.g:2894:1: ( 'of' )
            {
            // InternalSeleniumDsl.g:2894:1: ( 'of' )
            // InternalSeleniumDsl.g:2895:2: 'of'
            {
             before(grammarAccess.getAllConditionAccess().getOfKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAllConditionAccess().getOfKeyword_3()); 

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
    // $ANTLR end "rule__AllCondition__Group__3__Impl"


    // $ANTLR start "rule__AllCondition__Group__4"
    // InternalSeleniumDsl.g:2904:1: rule__AllCondition__Group__4 : rule__AllCondition__Group__4__Impl ;
    public final void rule__AllCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2908:1: ( rule__AllCondition__Group__4__Impl )
            // InternalSeleniumDsl.g:2909:2: rule__AllCondition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllCondition__Group__4__Impl();

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
    // $ANTLR end "rule__AllCondition__Group__4"


    // $ANTLR start "rule__AllCondition__Group__4__Impl"
    // InternalSeleniumDsl.g:2915:1: rule__AllCondition__Group__4__Impl : ( 'type' ) ;
    public final void rule__AllCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2919:1: ( ( 'type' ) )
            // InternalSeleniumDsl.g:2920:1: ( 'type' )
            {
            // InternalSeleniumDsl.g:2920:1: ( 'type' )
            // InternalSeleniumDsl.g:2921:2: 'type'
            {
             before(grammarAccess.getAllConditionAccess().getTypeKeyword_4()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getAllConditionAccess().getTypeKeyword_4()); 

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
    // $ANTLR end "rule__AllCondition__Group__4__Impl"


    // $ANTLR start "rule__IntWithSuffix__Group__0"
    // InternalSeleniumDsl.g:2931:1: rule__IntWithSuffix__Group__0 : rule__IntWithSuffix__Group__0__Impl rule__IntWithSuffix__Group__1 ;
    public final void rule__IntWithSuffix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2935:1: ( rule__IntWithSuffix__Group__0__Impl rule__IntWithSuffix__Group__1 )
            // InternalSeleniumDsl.g:2936:2: rule__IntWithSuffix__Group__0__Impl rule__IntWithSuffix__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__IntWithSuffix__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntWithSuffix__Group__1();

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
    // $ANTLR end "rule__IntWithSuffix__Group__0"


    // $ANTLR start "rule__IntWithSuffix__Group__0__Impl"
    // InternalSeleniumDsl.g:2943:1: rule__IntWithSuffix__Group__0__Impl : ( ( rule__IntWithSuffix__ValueAssignment_0 ) ) ;
    public final void rule__IntWithSuffix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2947:1: ( ( ( rule__IntWithSuffix__ValueAssignment_0 ) ) )
            // InternalSeleniumDsl.g:2948:1: ( ( rule__IntWithSuffix__ValueAssignment_0 ) )
            {
            // InternalSeleniumDsl.g:2948:1: ( ( rule__IntWithSuffix__ValueAssignment_0 ) )
            // InternalSeleniumDsl.g:2949:2: ( rule__IntWithSuffix__ValueAssignment_0 )
            {
             before(grammarAccess.getIntWithSuffixAccess().getValueAssignment_0()); 
            // InternalSeleniumDsl.g:2950:2: ( rule__IntWithSuffix__ValueAssignment_0 )
            // InternalSeleniumDsl.g:2950:3: rule__IntWithSuffix__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__IntWithSuffix__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIntWithSuffixAccess().getValueAssignment_0()); 

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
    // $ANTLR end "rule__IntWithSuffix__Group__0__Impl"


    // $ANTLR start "rule__IntWithSuffix__Group__1"
    // InternalSeleniumDsl.g:2958:1: rule__IntWithSuffix__Group__1 : rule__IntWithSuffix__Group__1__Impl ;
    public final void rule__IntWithSuffix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2962:1: ( rule__IntWithSuffix__Group__1__Impl )
            // InternalSeleniumDsl.g:2963:2: rule__IntWithSuffix__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntWithSuffix__Group__1__Impl();

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
    // $ANTLR end "rule__IntWithSuffix__Group__1"


    // $ANTLR start "rule__IntWithSuffix__Group__1__Impl"
    // InternalSeleniumDsl.g:2969:1: rule__IntWithSuffix__Group__1__Impl : ( RULE_SUFFIX ) ;
    public final void rule__IntWithSuffix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2973:1: ( ( RULE_SUFFIX ) )
            // InternalSeleniumDsl.g:2974:1: ( RULE_SUFFIX )
            {
            // InternalSeleniumDsl.g:2974:1: ( RULE_SUFFIX )
            // InternalSeleniumDsl.g:2975:2: RULE_SUFFIX
            {
             before(grammarAccess.getIntWithSuffixAccess().getSuffixTerminalRuleCall_1()); 
            match(input,RULE_SUFFIX,FOLLOW_2); 
             after(grammarAccess.getIntWithSuffixAccess().getSuffixTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__IntWithSuffix__Group__1__Impl"


    // $ANTLR start "rule__OrdinalCondition__Group__0"
    // InternalSeleniumDsl.g:2985:1: rule__OrdinalCondition__Group__0 : rule__OrdinalCondition__Group__0__Impl rule__OrdinalCondition__Group__1 ;
    public final void rule__OrdinalCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2989:1: ( rule__OrdinalCondition__Group__0__Impl rule__OrdinalCondition__Group__1 )
            // InternalSeleniumDsl.g:2990:2: rule__OrdinalCondition__Group__0__Impl rule__OrdinalCondition__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__OrdinalCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrdinalCondition__Group__1();

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
    // $ANTLR end "rule__OrdinalCondition__Group__0"


    // $ANTLR start "rule__OrdinalCondition__Group__0__Impl"
    // InternalSeleniumDsl.g:2997:1: rule__OrdinalCondition__Group__0__Impl : ( 'the' ) ;
    public final void rule__OrdinalCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3001:1: ( ( 'the' ) )
            // InternalSeleniumDsl.g:3002:1: ( 'the' )
            {
            // InternalSeleniumDsl.g:3002:1: ( 'the' )
            // InternalSeleniumDsl.g:3003:2: 'the'
            {
             before(grammarAccess.getOrdinalConditionAccess().getTheKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getOrdinalConditionAccess().getTheKeyword_0()); 

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
    // $ANTLR end "rule__OrdinalCondition__Group__0__Impl"


    // $ANTLR start "rule__OrdinalCondition__Group__1"
    // InternalSeleniumDsl.g:3012:1: rule__OrdinalCondition__Group__1 : rule__OrdinalCondition__Group__1__Impl ;
    public final void rule__OrdinalCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3016:1: ( rule__OrdinalCondition__Group__1__Impl )
            // InternalSeleniumDsl.g:3017:2: rule__OrdinalCondition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrdinalCondition__Group__1__Impl();

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
    // $ANTLR end "rule__OrdinalCondition__Group__1"


    // $ANTLR start "rule__OrdinalCondition__Group__1__Impl"
    // InternalSeleniumDsl.g:3023:1: rule__OrdinalCondition__Group__1__Impl : ( ( rule__OrdinalCondition__OrdinalAssignment_1 ) ) ;
    public final void rule__OrdinalCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3027:1: ( ( ( rule__OrdinalCondition__OrdinalAssignment_1 ) ) )
            // InternalSeleniumDsl.g:3028:1: ( ( rule__OrdinalCondition__OrdinalAssignment_1 ) )
            {
            // InternalSeleniumDsl.g:3028:1: ( ( rule__OrdinalCondition__OrdinalAssignment_1 ) )
            // InternalSeleniumDsl.g:3029:2: ( rule__OrdinalCondition__OrdinalAssignment_1 )
            {
             before(grammarAccess.getOrdinalConditionAccess().getOrdinalAssignment_1()); 
            // InternalSeleniumDsl.g:3030:2: ( rule__OrdinalCondition__OrdinalAssignment_1 )
            // InternalSeleniumDsl.g:3030:3: rule__OrdinalCondition__OrdinalAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OrdinalCondition__OrdinalAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOrdinalConditionAccess().getOrdinalAssignment_1()); 

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
    // $ANTLR end "rule__OrdinalCondition__Group__1__Impl"


    // $ANTLR start "rule__LastCondition__Group__0"
    // InternalSeleniumDsl.g:3039:1: rule__LastCondition__Group__0 : rule__LastCondition__Group__0__Impl rule__LastCondition__Group__1 ;
    public final void rule__LastCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3043:1: ( rule__LastCondition__Group__0__Impl rule__LastCondition__Group__1 )
            // InternalSeleniumDsl.g:3044:2: rule__LastCondition__Group__0__Impl rule__LastCondition__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__LastCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LastCondition__Group__1();

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
    // $ANTLR end "rule__LastCondition__Group__0"


    // $ANTLR start "rule__LastCondition__Group__0__Impl"
    // InternalSeleniumDsl.g:3051:1: rule__LastCondition__Group__0__Impl : ( () ) ;
    public final void rule__LastCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3055:1: ( ( () ) )
            // InternalSeleniumDsl.g:3056:1: ( () )
            {
            // InternalSeleniumDsl.g:3056:1: ( () )
            // InternalSeleniumDsl.g:3057:2: ()
            {
             before(grammarAccess.getLastConditionAccess().getLastConditionAction_0()); 
            // InternalSeleniumDsl.g:3058:2: ()
            // InternalSeleniumDsl.g:3058:3: 
            {
            }

             after(grammarAccess.getLastConditionAccess().getLastConditionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LastCondition__Group__0__Impl"


    // $ANTLR start "rule__LastCondition__Group__1"
    // InternalSeleniumDsl.g:3066:1: rule__LastCondition__Group__1 : rule__LastCondition__Group__1__Impl rule__LastCondition__Group__2 ;
    public final void rule__LastCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3070:1: ( rule__LastCondition__Group__1__Impl rule__LastCondition__Group__2 )
            // InternalSeleniumDsl.g:3071:2: rule__LastCondition__Group__1__Impl rule__LastCondition__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__LastCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LastCondition__Group__2();

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
    // $ANTLR end "rule__LastCondition__Group__1"


    // $ANTLR start "rule__LastCondition__Group__1__Impl"
    // InternalSeleniumDsl.g:3078:1: rule__LastCondition__Group__1__Impl : ( 'the' ) ;
    public final void rule__LastCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3082:1: ( ( 'the' ) )
            // InternalSeleniumDsl.g:3083:1: ( 'the' )
            {
            // InternalSeleniumDsl.g:3083:1: ( 'the' )
            // InternalSeleniumDsl.g:3084:2: 'the'
            {
             before(grammarAccess.getLastConditionAccess().getTheKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getLastConditionAccess().getTheKeyword_1()); 

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
    // $ANTLR end "rule__LastCondition__Group__1__Impl"


    // $ANTLR start "rule__LastCondition__Group__2"
    // InternalSeleniumDsl.g:3093:1: rule__LastCondition__Group__2 : rule__LastCondition__Group__2__Impl ;
    public final void rule__LastCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3097:1: ( rule__LastCondition__Group__2__Impl )
            // InternalSeleniumDsl.g:3098:2: rule__LastCondition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LastCondition__Group__2__Impl();

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
    // $ANTLR end "rule__LastCondition__Group__2"


    // $ANTLR start "rule__LastCondition__Group__2__Impl"
    // InternalSeleniumDsl.g:3104:1: rule__LastCondition__Group__2__Impl : ( 'last' ) ;
    public final void rule__LastCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3108:1: ( ( 'last' ) )
            // InternalSeleniumDsl.g:3109:1: ( 'last' )
            {
            // InternalSeleniumDsl.g:3109:1: ( 'last' )
            // InternalSeleniumDsl.g:3110:2: 'last'
            {
             before(grammarAccess.getLastConditionAccess().getLastKeyword_2()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getLastConditionAccess().getLastKeyword_2()); 

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
    // $ANTLR end "rule__LastCondition__Group__2__Impl"


    // $ANTLR start "rule__FirstCondition__Group__0"
    // InternalSeleniumDsl.g:3120:1: rule__FirstCondition__Group__0 : rule__FirstCondition__Group__0__Impl rule__FirstCondition__Group__1 ;
    public final void rule__FirstCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3124:1: ( rule__FirstCondition__Group__0__Impl rule__FirstCondition__Group__1 )
            // InternalSeleniumDsl.g:3125:2: rule__FirstCondition__Group__0__Impl rule__FirstCondition__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__FirstCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FirstCondition__Group__1();

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
    // $ANTLR end "rule__FirstCondition__Group__0"


    // $ANTLR start "rule__FirstCondition__Group__0__Impl"
    // InternalSeleniumDsl.g:3132:1: rule__FirstCondition__Group__0__Impl : ( () ) ;
    public final void rule__FirstCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3136:1: ( ( () ) )
            // InternalSeleniumDsl.g:3137:1: ( () )
            {
            // InternalSeleniumDsl.g:3137:1: ( () )
            // InternalSeleniumDsl.g:3138:2: ()
            {
             before(grammarAccess.getFirstConditionAccess().getFirstConditionAction_0()); 
            // InternalSeleniumDsl.g:3139:2: ()
            // InternalSeleniumDsl.g:3139:3: 
            {
            }

             after(grammarAccess.getFirstConditionAccess().getFirstConditionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FirstCondition__Group__0__Impl"


    // $ANTLR start "rule__FirstCondition__Group__1"
    // InternalSeleniumDsl.g:3147:1: rule__FirstCondition__Group__1 : rule__FirstCondition__Group__1__Impl ;
    public final void rule__FirstCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3151:1: ( rule__FirstCondition__Group__1__Impl )
            // InternalSeleniumDsl.g:3152:2: rule__FirstCondition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FirstCondition__Group__1__Impl();

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
    // $ANTLR end "rule__FirstCondition__Group__1"


    // $ANTLR start "rule__FirstCondition__Group__1__Impl"
    // InternalSeleniumDsl.g:3158:1: rule__FirstCondition__Group__1__Impl : ( 'the' ) ;
    public final void rule__FirstCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3162:1: ( ( 'the' ) )
            // InternalSeleniumDsl.g:3163:1: ( 'the' )
            {
            // InternalSeleniumDsl.g:3163:1: ( 'the' )
            // InternalSeleniumDsl.g:3164:2: 'the'
            {
             before(grammarAccess.getFirstConditionAccess().getTheKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFirstConditionAccess().getTheKeyword_1()); 

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
    // $ANTLR end "rule__FirstCondition__Group__1__Impl"


    // $ANTLR start "rule__Verify__Group__0"
    // InternalSeleniumDsl.g:3174:1: rule__Verify__Group__0 : rule__Verify__Group__0__Impl rule__Verify__Group__1 ;
    public final void rule__Verify__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3178:1: ( rule__Verify__Group__0__Impl rule__Verify__Group__1 )
            // InternalSeleniumDsl.g:3179:2: rule__Verify__Group__0__Impl rule__Verify__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalSeleniumDsl.g:3186:1: rule__Verify__Group__0__Impl : ( 'verify' ) ;
    public final void rule__Verify__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3190:1: ( ( 'verify' ) )
            // InternalSeleniumDsl.g:3191:1: ( 'verify' )
            {
            // InternalSeleniumDsl.g:3191:1: ( 'verify' )
            // InternalSeleniumDsl.g:3192:2: 'verify'
            {
             before(grammarAccess.getVerifyAccess().getVerifyKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:3201:1: rule__Verify__Group__1 : rule__Verify__Group__1__Impl rule__Verify__Group__2 ;
    public final void rule__Verify__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3205:1: ( rule__Verify__Group__1__Impl rule__Verify__Group__2 )
            // InternalSeleniumDsl.g:3206:2: rule__Verify__Group__1__Impl rule__Verify__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalSeleniumDsl.g:3213:1: rule__Verify__Group__1__Impl : ( 'that' ) ;
    public final void rule__Verify__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3217:1: ( ( 'that' ) )
            // InternalSeleniumDsl.g:3218:1: ( 'that' )
            {
            // InternalSeleniumDsl.g:3218:1: ( 'that' )
            // InternalSeleniumDsl.g:3219:2: 'that'
            {
             before(grammarAccess.getVerifyAccess().getThatKeyword_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:3228:1: rule__Verify__Group__2 : rule__Verify__Group__2__Impl rule__Verify__Group__3 ;
    public final void rule__Verify__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3232:1: ( rule__Verify__Group__2__Impl rule__Verify__Group__3 )
            // InternalSeleniumDsl.g:3233:2: rule__Verify__Group__2__Impl rule__Verify__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalSeleniumDsl.g:3240:1: rule__Verify__Group__2__Impl : ( ( rule__Verify__SelectorAssignment_2 ) ) ;
    public final void rule__Verify__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3244:1: ( ( ( rule__Verify__SelectorAssignment_2 ) ) )
            // InternalSeleniumDsl.g:3245:1: ( ( rule__Verify__SelectorAssignment_2 ) )
            {
            // InternalSeleniumDsl.g:3245:1: ( ( rule__Verify__SelectorAssignment_2 ) )
            // InternalSeleniumDsl.g:3246:2: ( rule__Verify__SelectorAssignment_2 )
            {
             before(grammarAccess.getVerifyAccess().getSelectorAssignment_2()); 
            // InternalSeleniumDsl.g:3247:2: ( rule__Verify__SelectorAssignment_2 )
            // InternalSeleniumDsl.g:3247:3: rule__Verify__SelectorAssignment_2
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
    // InternalSeleniumDsl.g:3255:1: rule__Verify__Group__3 : rule__Verify__Group__3__Impl rule__Verify__Group__4 ;
    public final void rule__Verify__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3259:1: ( rule__Verify__Group__3__Impl rule__Verify__Group__4 )
            // InternalSeleniumDsl.g:3260:2: rule__Verify__Group__3__Impl rule__Verify__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalSeleniumDsl.g:3267:1: rule__Verify__Group__3__Impl : ( 'is' ) ;
    public final void rule__Verify__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3271:1: ( ( 'is' ) )
            // InternalSeleniumDsl.g:3272:1: ( 'is' )
            {
            // InternalSeleniumDsl.g:3272:1: ( 'is' )
            // InternalSeleniumDsl.g:3273:2: 'is'
            {
             before(grammarAccess.getVerifyAccess().getIsKeyword_3()); 
            match(input,45,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:3282:1: rule__Verify__Group__4 : rule__Verify__Group__4__Impl rule__Verify__Group__5 ;
    public final void rule__Verify__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3286:1: ( rule__Verify__Group__4__Impl rule__Verify__Group__5 )
            // InternalSeleniumDsl.g:3287:2: rule__Verify__Group__4__Impl rule__Verify__Group__5
            {
            pushFollow(FOLLOW_31);
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
    // InternalSeleniumDsl.g:3294:1: rule__Verify__Group__4__Impl : ( ( rule__Verify__PropertiesAssignment_4 ) ) ;
    public final void rule__Verify__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3298:1: ( ( ( rule__Verify__PropertiesAssignment_4 ) ) )
            // InternalSeleniumDsl.g:3299:1: ( ( rule__Verify__PropertiesAssignment_4 ) )
            {
            // InternalSeleniumDsl.g:3299:1: ( ( rule__Verify__PropertiesAssignment_4 ) )
            // InternalSeleniumDsl.g:3300:2: ( rule__Verify__PropertiesAssignment_4 )
            {
             before(grammarAccess.getVerifyAccess().getPropertiesAssignment_4()); 
            // InternalSeleniumDsl.g:3301:2: ( rule__Verify__PropertiesAssignment_4 )
            // InternalSeleniumDsl.g:3301:3: rule__Verify__PropertiesAssignment_4
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
    // InternalSeleniumDsl.g:3309:1: rule__Verify__Group__5 : rule__Verify__Group__5__Impl ;
    public final void rule__Verify__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3313:1: ( rule__Verify__Group__5__Impl )
            // InternalSeleniumDsl.g:3314:2: rule__Verify__Group__5__Impl
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
    // InternalSeleniumDsl.g:3320:1: rule__Verify__Group__5__Impl : ( ( rule__Verify__Group_5__0 )? ) ;
    public final void rule__Verify__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3324:1: ( ( ( rule__Verify__Group_5__0 )? ) )
            // InternalSeleniumDsl.g:3325:1: ( ( rule__Verify__Group_5__0 )? )
            {
            // InternalSeleniumDsl.g:3325:1: ( ( rule__Verify__Group_5__0 )? )
            // InternalSeleniumDsl.g:3326:2: ( rule__Verify__Group_5__0 )?
            {
             before(grammarAccess.getVerifyAccess().getGroup_5()); 
            // InternalSeleniumDsl.g:3327:2: ( rule__Verify__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==46) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSeleniumDsl.g:3327:3: rule__Verify__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Verify__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

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
    // InternalSeleniumDsl.g:3336:1: rule__Verify__Group_5__0 : rule__Verify__Group_5__0__Impl rule__Verify__Group_5__1 ;
    public final void rule__Verify__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3340:1: ( rule__Verify__Group_5__0__Impl rule__Verify__Group_5__1 )
            // InternalSeleniumDsl.g:3341:2: rule__Verify__Group_5__0__Impl rule__Verify__Group_5__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalSeleniumDsl.g:3348:1: rule__Verify__Group_5__0__Impl : ( 'and' ) ;
    public final void rule__Verify__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3352:1: ( ( 'and' ) )
            // InternalSeleniumDsl.g:3353:1: ( 'and' )
            {
            // InternalSeleniumDsl.g:3353:1: ( 'and' )
            // InternalSeleniumDsl.g:3354:2: 'and'
            {
             before(grammarAccess.getVerifyAccess().getAndKeyword_5_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:3363:1: rule__Verify__Group_5__1 : rule__Verify__Group_5__1__Impl ;
    public final void rule__Verify__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3367:1: ( rule__Verify__Group_5__1__Impl )
            // InternalSeleniumDsl.g:3368:2: rule__Verify__Group_5__1__Impl
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
    // InternalSeleniumDsl.g:3374:1: rule__Verify__Group_5__1__Impl : ( ( rule__Verify__PropertiesAssignment_5_1 ) ) ;
    public final void rule__Verify__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3378:1: ( ( ( rule__Verify__PropertiesAssignment_5_1 ) ) )
            // InternalSeleniumDsl.g:3379:1: ( ( rule__Verify__PropertiesAssignment_5_1 ) )
            {
            // InternalSeleniumDsl.g:3379:1: ( ( rule__Verify__PropertiesAssignment_5_1 ) )
            // InternalSeleniumDsl.g:3380:2: ( rule__Verify__PropertiesAssignment_5_1 )
            {
             before(grammarAccess.getVerifyAccess().getPropertiesAssignment_5_1()); 
            // InternalSeleniumDsl.g:3381:2: ( rule__Verify__PropertiesAssignment_5_1 )
            // InternalSeleniumDsl.g:3381:3: rule__Verify__PropertiesAssignment_5_1
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


    // $ANTLR start "rule__BrowserDsl__CommandsAssignment"
    // InternalSeleniumDsl.g:3390:1: rule__BrowserDsl__CommandsAssignment : ( ruleCommand ) ;
    public final void rule__BrowserDsl__CommandsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3394:1: ( ( ruleCommand ) )
            // InternalSeleniumDsl.g:3395:2: ( ruleCommand )
            {
            // InternalSeleniumDsl.g:3395:2: ( ruleCommand )
            // InternalSeleniumDsl.g:3396:3: ruleCommand
            {
             before(grammarAccess.getBrowserDslAccess().getCommandsCommandParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getBrowserDslAccess().getCommandsCommandParserRuleCall_0()); 

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
    // $ANTLR end "rule__BrowserDsl__CommandsAssignment"


    // $ANTLR start "rule__GoTo__UrlAssignment_2_0"
    // InternalSeleniumDsl.g:3405:1: rule__GoTo__UrlAssignment_2_0 : ( ruleDynamicURL ) ;
    public final void rule__GoTo__UrlAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3409:1: ( ( ruleDynamicURL ) )
            // InternalSeleniumDsl.g:3410:2: ( ruleDynamicURL )
            {
            // InternalSeleniumDsl.g:3410:2: ( ruleDynamicURL )
            // InternalSeleniumDsl.g:3411:3: ruleDynamicURL
            {
             before(grammarAccess.getGoToAccess().getUrlDynamicURLParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDynamicURL();

            state._fsp--;

             after(grammarAccess.getGoToAccess().getUrlDynamicURLParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__GoTo__UrlAssignment_2_0"


    // $ANTLR start "rule__Click__ElementAssignment_2"
    // InternalSeleniumDsl.g:3420:1: rule__Click__ElementAssignment_2 : ( ruleSelector ) ;
    public final void rule__Click__ElementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3424:1: ( ( ruleSelector ) )
            // InternalSeleniumDsl.g:3425:2: ( ruleSelector )
            {
            // InternalSeleniumDsl.g:3425:2: ( ruleSelector )
            // InternalSeleniumDsl.g:3426:3: ruleSelector
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
    // InternalSeleniumDsl.g:3435:1: rule__Copy__PropertyAssignment_4 : ( RULE_HTML_ATTRIBUTE ) ;
    public final void rule__Copy__PropertyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3439:1: ( ( RULE_HTML_ATTRIBUTE ) )
            // InternalSeleniumDsl.g:3440:2: ( RULE_HTML_ATTRIBUTE )
            {
            // InternalSeleniumDsl.g:3440:2: ( RULE_HTML_ATTRIBUTE )
            // InternalSeleniumDsl.g:3441:3: RULE_HTML_ATTRIBUTE
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
    // InternalSeleniumDsl.g:3450:1: rule__Copy__ElementAssignment_6 : ( ruleSelector ) ;
    public final void rule__Copy__ElementAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3454:1: ( ( ruleSelector ) )
            // InternalSeleniumDsl.g:3455:2: ( ruleSelector )
            {
            // InternalSeleniumDsl.g:3455:2: ( ruleSelector )
            // InternalSeleniumDsl.g:3456:3: ruleSelector
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
    // InternalSeleniumDsl.g:3465:1: rule__Copy__KeyAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Copy__KeyAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3469:1: ( ( RULE_STRING ) )
            // InternalSeleniumDsl.g:3470:2: ( RULE_STRING )
            {
            // InternalSeleniumDsl.g:3470:2: ( RULE_STRING )
            // InternalSeleniumDsl.g:3471:3: RULE_STRING
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
    // InternalSeleniumDsl.g:3480:1: rule__Paste__ElementAssignment_7 : ( ruleSelector ) ;
    public final void rule__Paste__ElementAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3484:1: ( ( ruleSelector ) )
            // InternalSeleniumDsl.g:3485:2: ( ruleSelector )
            {
            // InternalSeleniumDsl.g:3485:2: ( ruleSelector )
            // InternalSeleniumDsl.g:3486:3: ruleSelector
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
    // InternalSeleniumDsl.g:3495:1: rule__Insert__ElementAssignment_1 : ( ruleSelector ) ;
    public final void rule__Insert__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3499:1: ( ( ruleSelector ) )
            // InternalSeleniumDsl.g:3500:2: ( ruleSelector )
            {
            // InternalSeleniumDsl.g:3500:2: ( ruleSelector )
            // InternalSeleniumDsl.g:3501:3: ruleSelector
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
    // InternalSeleniumDsl.g:3510:1: rule__Insert__ContentAssignment_3 : ( ruleContent ) ;
    public final void rule__Insert__ContentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3514:1: ( ( ruleContent ) )
            // InternalSeleniumDsl.g:3515:2: ( ruleContent )
            {
            // InternalSeleniumDsl.g:3515:2: ( ruleContent )
            // InternalSeleniumDsl.g:3516:3: ruleContent
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
    // InternalSeleniumDsl.g:3525:1: rule__Selector__PredicateAssignment_0 : ( ruleSelectorPredicate ) ;
    public final void rule__Selector__PredicateAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3529:1: ( ( ruleSelectorPredicate ) )
            // InternalSeleniumDsl.g:3530:2: ( ruleSelectorPredicate )
            {
            // InternalSeleniumDsl.g:3530:2: ( ruleSelectorPredicate )
            // InternalSeleniumDsl.g:3531:3: ruleSelectorPredicate
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
    // InternalSeleniumDsl.g:3540:1: rule__Selector__DomTypeAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Selector__DomTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3544:1: ( ( RULE_STRING ) )
            // InternalSeleniumDsl.g:3545:2: ( RULE_STRING )
            {
            // InternalSeleniumDsl.g:3545:2: ( RULE_STRING )
            // InternalSeleniumDsl.g:3546:3: RULE_STRING
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
    // InternalSeleniumDsl.g:3555:1: rule__Selector__AttributesAssignment_2_2 : ( ruleAttributes ) ;
    public final void rule__Selector__AttributesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3559:1: ( ( ruleAttributes ) )
            // InternalSeleniumDsl.g:3560:2: ( ruleAttributes )
            {
            // InternalSeleniumDsl.g:3560:2: ( ruleAttributes )
            // InternalSeleniumDsl.g:3561:3: ruleAttributes
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
    // InternalSeleniumDsl.g:3570:1: rule__Selector__LabelAssignment_3_3 : ( RULE_STRING ) ;
    public final void rule__Selector__LabelAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3574:1: ( ( RULE_STRING ) )
            // InternalSeleniumDsl.g:3575:2: ( RULE_STRING )
            {
            // InternalSeleniumDsl.g:3575:2: ( RULE_STRING )
            // InternalSeleniumDsl.g:3576:3: RULE_STRING
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
    // InternalSeleniumDsl.g:3585:1: rule__Selector__PropertiesAssignment_4_2 : ( ruleProperties ) ;
    public final void rule__Selector__PropertiesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3589:1: ( ( ruleProperties ) )
            // InternalSeleniumDsl.g:3590:2: ( ruleProperties )
            {
            // InternalSeleniumDsl.g:3590:2: ( ruleProperties )
            // InternalSeleniumDsl.g:3591:3: ruleProperties
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
    // InternalSeleniumDsl.g:3600:1: rule__Selector__ParentAssignment_5_1 : ( ruleSelector ) ;
    public final void rule__Selector__ParentAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3604:1: ( ( ruleSelector ) )
            // InternalSeleniumDsl.g:3605:2: ( ruleSelector )
            {
            // InternalSeleniumDsl.g:3605:2: ( ruleSelector )
            // InternalSeleniumDsl.g:3606:3: ruleSelector
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
    // InternalSeleniumDsl.g:3615:1: rule__Attributes__AttributesAssignment_0 : ( ruleElementAttribute ) ;
    public final void rule__Attributes__AttributesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3619:1: ( ( ruleElementAttribute ) )
            // InternalSeleniumDsl.g:3620:2: ( ruleElementAttribute )
            {
            // InternalSeleniumDsl.g:3620:2: ( ruleElementAttribute )
            // InternalSeleniumDsl.g:3621:3: ruleElementAttribute
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


    // $ANTLR start "rule__Attributes__AttributesAssignment_1_1"
    // InternalSeleniumDsl.g:3630:1: rule__Attributes__AttributesAssignment_1_1 : ( ruleElementAttribute ) ;
    public final void rule__Attributes__AttributesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3634:1: ( ( ruleElementAttribute ) )
            // InternalSeleniumDsl.g:3635:2: ( ruleElementAttribute )
            {
            // InternalSeleniumDsl.g:3635:2: ( ruleElementAttribute )
            // InternalSeleniumDsl.g:3636:3: ruleElementAttribute
            {
             before(grammarAccess.getAttributesAccess().getAttributesElementAttributeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElementAttribute();

            state._fsp--;

             after(grammarAccess.getAttributesAccess().getAttributesElementAttributeParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Attributes__AttributesAssignment_1_1"


    // $ANTLR start "rule__ElementAttribute__NameAssignment_0"
    // InternalSeleniumDsl.g:3645:1: rule__ElementAttribute__NameAssignment_0 : ( RULE_HTML_ATTRIBUTE ) ;
    public final void rule__ElementAttribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3649:1: ( ( RULE_HTML_ATTRIBUTE ) )
            // InternalSeleniumDsl.g:3650:2: ( RULE_HTML_ATTRIBUTE )
            {
            // InternalSeleniumDsl.g:3650:2: ( RULE_HTML_ATTRIBUTE )
            // InternalSeleniumDsl.g:3651:3: RULE_HTML_ATTRIBUTE
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
    // InternalSeleniumDsl.g:3660:1: rule__ElementAttribute__MatcherAssignment_1 : ( ruleMatcher ) ;
    public final void rule__ElementAttribute__MatcherAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3664:1: ( ( ruleMatcher ) )
            // InternalSeleniumDsl.g:3665:2: ( ruleMatcher )
            {
            // InternalSeleniumDsl.g:3665:2: ( ruleMatcher )
            // InternalSeleniumDsl.g:3666:3: ruleMatcher
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
    // InternalSeleniumDsl.g:3675:1: rule__ElementAttribute__ValueAssignment_2 : ( ruleContent ) ;
    public final void rule__ElementAttribute__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3679:1: ( ( ruleContent ) )
            // InternalSeleniumDsl.g:3680:2: ( ruleContent )
            {
            // InternalSeleniumDsl.g:3680:2: ( ruleContent )
            // InternalSeleniumDsl.g:3681:3: ruleContent
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
    // InternalSeleniumDsl.g:3690:1: rule__ClipboardContent__KeyAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ClipboardContent__KeyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3694:1: ( ( RULE_STRING ) )
            // InternalSeleniumDsl.g:3695:2: ( RULE_STRING )
            {
            // InternalSeleniumDsl.g:3695:2: ( RULE_STRING )
            // InternalSeleniumDsl.g:3696:3: RULE_STRING
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
    // InternalSeleniumDsl.g:3705:1: rule__StringContent__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringContent__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3709:1: ( ( RULE_STRING ) )
            // InternalSeleniumDsl.g:3710:2: ( RULE_STRING )
            {
            // InternalSeleniumDsl.g:3710:2: ( RULE_STRING )
            // InternalSeleniumDsl.g:3711:3: RULE_STRING
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
    // InternalSeleniumDsl.g:3720:1: rule__Properties__PropertiesAssignment_0 : ( ruleElementProperty ) ;
    public final void rule__Properties__PropertiesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3724:1: ( ( ruleElementProperty ) )
            // InternalSeleniumDsl.g:3725:2: ( ruleElementProperty )
            {
            // InternalSeleniumDsl.g:3725:2: ( ruleElementProperty )
            // InternalSeleniumDsl.g:3726:3: ruleElementProperty
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
    // InternalSeleniumDsl.g:3735:1: rule__Properties__PropertiesAssignment_1_1 : ( ruleElementProperty ) ;
    public final void rule__Properties__PropertiesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3739:1: ( ( ruleElementProperty ) )
            // InternalSeleniumDsl.g:3740:2: ( ruleElementProperty )
            {
            // InternalSeleniumDsl.g:3740:2: ( ruleElementProperty )
            // InternalSeleniumDsl.g:3741:3: ruleElementProperty
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
    // InternalSeleniumDsl.g:3750:1: rule__ElementProperty__NegatedAssignment_0 : ( ( 'not' ) ) ;
    public final void rule__ElementProperty__NegatedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3754:1: ( ( ( 'not' ) ) )
            // InternalSeleniumDsl.g:3755:2: ( ( 'not' ) )
            {
            // InternalSeleniumDsl.g:3755:2: ( ( 'not' ) )
            // InternalSeleniumDsl.g:3756:3: ( 'not' )
            {
             before(grammarAccess.getElementPropertyAccess().getNegatedNotKeyword_0_0()); 
            // InternalSeleniumDsl.g:3757:3: ( 'not' )
            // InternalSeleniumDsl.g:3758:4: 'not'
            {
             before(grammarAccess.getElementPropertyAccess().getNegatedNotKeyword_0_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:3769:1: rule__ElementProperty__PropertyAssignment_1 : ( ( rule__ElementProperty__PropertyAlternatives_1_0 ) ) ;
    public final void rule__ElementProperty__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3773:1: ( ( ( rule__ElementProperty__PropertyAlternatives_1_0 ) ) )
            // InternalSeleniumDsl.g:3774:2: ( ( rule__ElementProperty__PropertyAlternatives_1_0 ) )
            {
            // InternalSeleniumDsl.g:3774:2: ( ( rule__ElementProperty__PropertyAlternatives_1_0 ) )
            // InternalSeleniumDsl.g:3775:3: ( rule__ElementProperty__PropertyAlternatives_1_0 )
            {
             before(grammarAccess.getElementPropertyAccess().getPropertyAlternatives_1_0()); 
            // InternalSeleniumDsl.g:3776:3: ( rule__ElementProperty__PropertyAlternatives_1_0 )
            // InternalSeleniumDsl.g:3776:4: rule__ElementProperty__PropertyAlternatives_1_0
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


    // $ANTLR start "rule__IntWithSuffix__ValueAssignment_0"
    // InternalSeleniumDsl.g:3784:1: rule__IntWithSuffix__ValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__IntWithSuffix__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3788:1: ( ( RULE_INT ) )
            // InternalSeleniumDsl.g:3789:2: ( RULE_INT )
            {
            // InternalSeleniumDsl.g:3789:2: ( RULE_INT )
            // InternalSeleniumDsl.g:3790:3: RULE_INT
            {
             before(grammarAccess.getIntWithSuffixAccess().getValueINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntWithSuffixAccess().getValueINTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__IntWithSuffix__ValueAssignment_0"


    // $ANTLR start "rule__OrdinalCondition__OrdinalAssignment_1"
    // InternalSeleniumDsl.g:3799:1: rule__OrdinalCondition__OrdinalAssignment_1 : ( ruleIntWithSuffix ) ;
    public final void rule__OrdinalCondition__OrdinalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3803:1: ( ( ruleIntWithSuffix ) )
            // InternalSeleniumDsl.g:3804:2: ( ruleIntWithSuffix )
            {
            // InternalSeleniumDsl.g:3804:2: ( ruleIntWithSuffix )
            // InternalSeleniumDsl.g:3805:3: ruleIntWithSuffix
            {
             before(grammarAccess.getOrdinalConditionAccess().getOrdinalIntWithSuffixParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIntWithSuffix();

            state._fsp--;

             after(grammarAccess.getOrdinalConditionAccess().getOrdinalIntWithSuffixParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__OrdinalCondition__OrdinalAssignment_1"


    // $ANTLR start "rule__Verify__SelectorAssignment_2"
    // InternalSeleniumDsl.g:3814:1: rule__Verify__SelectorAssignment_2 : ( ruleSelector ) ;
    public final void rule__Verify__SelectorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3818:1: ( ( ruleSelector ) )
            // InternalSeleniumDsl.g:3819:2: ( ruleSelector )
            {
            // InternalSeleniumDsl.g:3819:2: ( ruleSelector )
            // InternalSeleniumDsl.g:3820:3: ruleSelector
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
    // InternalSeleniumDsl.g:3829:1: rule__Verify__PropertiesAssignment_4 : ( ruleElementProperty ) ;
    public final void rule__Verify__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3833:1: ( ( ruleElementProperty ) )
            // InternalSeleniumDsl.g:3834:2: ( ruleElementProperty )
            {
            // InternalSeleniumDsl.g:3834:2: ( ruleElementProperty )
            // InternalSeleniumDsl.g:3835:3: ruleElementProperty
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
    // InternalSeleniumDsl.g:3844:1: rule__Verify__PropertiesAssignment_5_1 : ( ruleElementProperty ) ;
    public final void rule__Verify__PropertiesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3848:1: ( ( ruleElementProperty ) )
            // InternalSeleniumDsl.g:3849:2: ( ruleElementProperty )
            {
            // InternalSeleniumDsl.g:3849:2: ( ruleElementProperty )
            // InternalSeleniumDsl.g:3850:3: ruleElementProperty
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0010008854410002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0001000080000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000114000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00200000000E0000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000100000000000L});

}