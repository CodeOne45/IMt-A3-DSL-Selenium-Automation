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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ORDINAL_SUFFIX", "RULE_STRING", "RULE_HTML_ATTRIBUTE", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'select'", "'selected'", "'visible'", "'enabled'", "'containing'", "'matching'", "'open'", "'a'", "'browser'", "'window'", "'go'", "'to'", "'click'", "'on'", "'copy'", "'the'", "'property'", "'of'", "'as'", "'paste'", "'content'", "'clipboard'", "'in'", "'fill'", "'with'", "'properties'", "'associated'", "'label'", "'that'", "'is'", "'and'", "'saved'", "'all'", "'elements'", "'type'", "'last'", "'verify'", "'not'"
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

                if ( (LA1_0==13||LA1_0==19||LA1_0==23||LA1_0==25||LA1_0==27||LA1_0==32||LA1_0==36||LA1_0==49) ) {
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


    // $ANTLR start "entryRuleAllPredicate"
    // InternalSeleniumDsl.g:503:1: entryRuleAllPredicate : ruleAllPredicate EOF ;
    public final void entryRuleAllPredicate() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:504:1: ( ruleAllPredicate EOF )
            // InternalSeleniumDsl.g:505:1: ruleAllPredicate EOF
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
    // InternalSeleniumDsl.g:512:1: ruleAllPredicate : ( ( rule__AllPredicate__Group__0 ) ) ;
    public final void ruleAllPredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:516:2: ( ( ( rule__AllPredicate__Group__0 ) ) )
            // InternalSeleniumDsl.g:517:2: ( ( rule__AllPredicate__Group__0 ) )
            {
            // InternalSeleniumDsl.g:517:2: ( ( rule__AllPredicate__Group__0 ) )
            // InternalSeleniumDsl.g:518:3: ( rule__AllPredicate__Group__0 )
            {
             before(grammarAccess.getAllPredicateAccess().getGroup()); 
            // InternalSeleniumDsl.g:519:3: ( rule__AllPredicate__Group__0 )
            // InternalSeleniumDsl.g:519:4: rule__AllPredicate__Group__0
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
    // InternalSeleniumDsl.g:528:1: entryRuleOrdinalPredicate : ruleOrdinalPredicate EOF ;
    public final void entryRuleOrdinalPredicate() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:529:1: ( ruleOrdinalPredicate EOF )
            // InternalSeleniumDsl.g:530:1: ruleOrdinalPredicate EOF
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
    // InternalSeleniumDsl.g:537:1: ruleOrdinalPredicate : ( ( rule__OrdinalPredicate__Group__0 ) ) ;
    public final void ruleOrdinalPredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:541:2: ( ( ( rule__OrdinalPredicate__Group__0 ) ) )
            // InternalSeleniumDsl.g:542:2: ( ( rule__OrdinalPredicate__Group__0 ) )
            {
            // InternalSeleniumDsl.g:542:2: ( ( rule__OrdinalPredicate__Group__0 ) )
            // InternalSeleniumDsl.g:543:3: ( rule__OrdinalPredicate__Group__0 )
            {
             before(grammarAccess.getOrdinalPredicateAccess().getGroup()); 
            // InternalSeleniumDsl.g:544:3: ( rule__OrdinalPredicate__Group__0 )
            // InternalSeleniumDsl.g:544:4: rule__OrdinalPredicate__Group__0
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
    // InternalSeleniumDsl.g:553:1: entryRuleLastPredicate : ruleLastPredicate EOF ;
    public final void entryRuleLastPredicate() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:554:1: ( ruleLastPredicate EOF )
            // InternalSeleniumDsl.g:555:1: ruleLastPredicate EOF
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
    // InternalSeleniumDsl.g:562:1: ruleLastPredicate : ( ( rule__LastPredicate__Group__0 ) ) ;
    public final void ruleLastPredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:566:2: ( ( ( rule__LastPredicate__Group__0 ) ) )
            // InternalSeleniumDsl.g:567:2: ( ( rule__LastPredicate__Group__0 ) )
            {
            // InternalSeleniumDsl.g:567:2: ( ( rule__LastPredicate__Group__0 ) )
            // InternalSeleniumDsl.g:568:3: ( rule__LastPredicate__Group__0 )
            {
             before(grammarAccess.getLastPredicateAccess().getGroup()); 
            // InternalSeleniumDsl.g:569:3: ( rule__LastPredicate__Group__0 )
            // InternalSeleniumDsl.g:569:4: rule__LastPredicate__Group__0
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
    // InternalSeleniumDsl.g:578:1: entryRuleDefaultFirstPredicate : ruleDefaultFirstPredicate EOF ;
    public final void entryRuleDefaultFirstPredicate() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:579:1: ( ruleDefaultFirstPredicate EOF )
            // InternalSeleniumDsl.g:580:1: ruleDefaultFirstPredicate EOF
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
    // InternalSeleniumDsl.g:587:1: ruleDefaultFirstPredicate : ( ( rule__DefaultFirstPredicate__Group__0 ) ) ;
    public final void ruleDefaultFirstPredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:591:2: ( ( ( rule__DefaultFirstPredicate__Group__0 ) ) )
            // InternalSeleniumDsl.g:592:2: ( ( rule__DefaultFirstPredicate__Group__0 ) )
            {
            // InternalSeleniumDsl.g:592:2: ( ( rule__DefaultFirstPredicate__Group__0 ) )
            // InternalSeleniumDsl.g:593:3: ( rule__DefaultFirstPredicate__Group__0 )
            {
             before(grammarAccess.getDefaultFirstPredicateAccess().getGroup()); 
            // InternalSeleniumDsl.g:594:3: ( rule__DefaultFirstPredicate__Group__0 )
            // InternalSeleniumDsl.g:594:4: rule__DefaultFirstPredicate__Group__0
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
    // InternalSeleniumDsl.g:603:1: entryRuleMatcher : ruleMatcher EOF ;
    public final void entryRuleMatcher() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:604:1: ( ruleMatcher EOF )
            // InternalSeleniumDsl.g:605:1: ruleMatcher EOF
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
    // InternalSeleniumDsl.g:612:1: ruleMatcher : ( ( rule__Matcher__Alternatives ) ) ;
    public final void ruleMatcher() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:616:2: ( ( ( rule__Matcher__Alternatives ) ) )
            // InternalSeleniumDsl.g:617:2: ( ( rule__Matcher__Alternatives ) )
            {
            // InternalSeleniumDsl.g:617:2: ( ( rule__Matcher__Alternatives ) )
            // InternalSeleniumDsl.g:618:3: ( rule__Matcher__Alternatives )
            {
             before(grammarAccess.getMatcherAccess().getAlternatives()); 
            // InternalSeleniumDsl.g:619:3: ( rule__Matcher__Alternatives )
            // InternalSeleniumDsl.g:619:4: rule__Matcher__Alternatives
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
    // InternalSeleniumDsl.g:628:1: entryRuleVerify : ruleVerify EOF ;
    public final void entryRuleVerify() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:629:1: ( ruleVerify EOF )
            // InternalSeleniumDsl.g:630:1: ruleVerify EOF
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
    // InternalSeleniumDsl.g:637:1: ruleVerify : ( ( rule__Verify__Group__0 ) ) ;
    public final void ruleVerify() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:641:2: ( ( ( rule__Verify__Group__0 ) ) )
            // InternalSeleniumDsl.g:642:2: ( ( rule__Verify__Group__0 ) )
            {
            // InternalSeleniumDsl.g:642:2: ( ( rule__Verify__Group__0 ) )
            // InternalSeleniumDsl.g:643:3: ( rule__Verify__Group__0 )
            {
             before(grammarAccess.getVerifyAccess().getGroup()); 
            // InternalSeleniumDsl.g:644:3: ( rule__Verify__Group__0 )
            // InternalSeleniumDsl.g:644:4: rule__Verify__Group__0
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
    // InternalSeleniumDsl.g:653:1: entryRuleOrdinalInteger : ruleOrdinalInteger EOF ;
    public final void entryRuleOrdinalInteger() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:654:1: ( ruleOrdinalInteger EOF )
            // InternalSeleniumDsl.g:655:1: ruleOrdinalInteger EOF
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
    // InternalSeleniumDsl.g:662:1: ruleOrdinalInteger : ( ( rule__OrdinalInteger__Group__0 ) ) ;
    public final void ruleOrdinalInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:666:2: ( ( ( rule__OrdinalInteger__Group__0 ) ) )
            // InternalSeleniumDsl.g:667:2: ( ( rule__OrdinalInteger__Group__0 ) )
            {
            // InternalSeleniumDsl.g:667:2: ( ( rule__OrdinalInteger__Group__0 ) )
            // InternalSeleniumDsl.g:668:3: ( rule__OrdinalInteger__Group__0 )
            {
             before(grammarAccess.getOrdinalIntegerAccess().getGroup()); 
            // InternalSeleniumDsl.g:669:3: ( rule__OrdinalInteger__Group__0 )
            // InternalSeleniumDsl.g:669:4: rule__OrdinalInteger__Group__0
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
    // InternalSeleniumDsl.g:677:1: rule__Command__Alternatives : ( ( ruleOpenBrowser ) | ( ruleGoTo ) | ( ruleDOMCommand ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:681:1: ( ( ruleOpenBrowser ) | ( ruleGoTo ) | ( ruleDOMCommand ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt2=1;
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            case 13:
            case 25:
            case 27:
            case 32:
            case 36:
            case 49:
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
                    // InternalSeleniumDsl.g:682:2: ( ruleOpenBrowser )
                    {
                    // InternalSeleniumDsl.g:682:2: ( ruleOpenBrowser )
                    // InternalSeleniumDsl.g:683:3: ruleOpenBrowser
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
                    // InternalSeleniumDsl.g:688:2: ( ruleGoTo )
                    {
                    // InternalSeleniumDsl.g:688:2: ( ruleGoTo )
                    // InternalSeleniumDsl.g:689:3: ruleGoTo
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
                    // InternalSeleniumDsl.g:694:2: ( ruleDOMCommand )
                    {
                    // InternalSeleniumDsl.g:694:2: ( ruleDOMCommand )
                    // InternalSeleniumDsl.g:695:3: ruleDOMCommand
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
    // InternalSeleniumDsl.g:704:1: rule__DOMCommand__Alternatives : ( ( ruleClick ) | ( ruleInsert ) | ( ruleCopy ) | ( rulePaste ) | ( ruleVerify ) );
    public final void rule__DOMCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:708:1: ( ( ruleClick ) | ( ruleInsert ) | ( ruleCopy ) | ( rulePaste ) | ( ruleVerify ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 13:
            case 25:
                {
                alt3=1;
                }
                break;
            case 36:
                {
                alt3=2;
                }
                break;
            case 27:
                {
                alt3=3;
                }
                break;
            case 32:
                {
                alt3=4;
                }
                break;
            case 49:
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
                    // InternalSeleniumDsl.g:709:2: ( ruleClick )
                    {
                    // InternalSeleniumDsl.g:709:2: ( ruleClick )
                    // InternalSeleniumDsl.g:710:3: ruleClick
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
                    // InternalSeleniumDsl.g:715:2: ( ruleInsert )
                    {
                    // InternalSeleniumDsl.g:715:2: ( ruleInsert )
                    // InternalSeleniumDsl.g:716:3: ruleInsert
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
                    // InternalSeleniumDsl.g:721:2: ( ruleCopy )
                    {
                    // InternalSeleniumDsl.g:721:2: ( ruleCopy )
                    // InternalSeleniumDsl.g:722:3: ruleCopy
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
                    // InternalSeleniumDsl.g:727:2: ( rulePaste )
                    {
                    // InternalSeleniumDsl.g:727:2: ( rulePaste )
                    // InternalSeleniumDsl.g:728:3: rulePaste
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
                    // InternalSeleniumDsl.g:733:2: ( ruleVerify )
                    {
                    // InternalSeleniumDsl.g:733:2: ( ruleVerify )
                    // InternalSeleniumDsl.g:734:3: ruleVerify
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
    // InternalSeleniumDsl.g:743:1: rule__Click__Alternatives_1 : ( ( ( rule__Click__Group_1_0__0 ) ) | ( 'select' ) );
    public final void rule__Click__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:747:1: ( ( ( rule__Click__Group_1_0__0 ) ) | ( 'select' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
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
                    // InternalSeleniumDsl.g:748:2: ( ( rule__Click__Group_1_0__0 ) )
                    {
                    // InternalSeleniumDsl.g:748:2: ( ( rule__Click__Group_1_0__0 ) )
                    // InternalSeleniumDsl.g:749:3: ( rule__Click__Group_1_0__0 )
                    {
                     before(grammarAccess.getClickAccess().getGroup_1_0()); 
                    // InternalSeleniumDsl.g:750:3: ( rule__Click__Group_1_0__0 )
                    // InternalSeleniumDsl.g:750:4: rule__Click__Group_1_0__0
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
                    // InternalSeleniumDsl.g:754:2: ( 'select' )
                    {
                    // InternalSeleniumDsl.g:754:2: ( 'select' )
                    // InternalSeleniumDsl.g:755:3: 'select'
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
    // InternalSeleniumDsl.g:764:1: rule__Content__Alternatives : ( ( ruleClipboardContent ) | ( ruleStringContent ) );
    public final void rule__Content__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:768:1: ( ( ruleClipboardContent ) | ( ruleStringContent ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
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
                    // InternalSeleniumDsl.g:769:2: ( ruleClipboardContent )
                    {
                    // InternalSeleniumDsl.g:769:2: ( ruleClipboardContent )
                    // InternalSeleniumDsl.g:770:3: ruleClipboardContent
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
                    // InternalSeleniumDsl.g:775:2: ( ruleStringContent )
                    {
                    // InternalSeleniumDsl.g:775:2: ( ruleStringContent )
                    // InternalSeleniumDsl.g:776:3: ruleStringContent
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
    // InternalSeleniumDsl.g:785:1: rule__ElementProperty__PropertyAlternatives_1_0 : ( ( 'selected' ) | ( 'visible' ) | ( 'enabled' ) );
    public final void rule__ElementProperty__PropertyAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:789:1: ( ( 'selected' ) | ( 'visible' ) | ( 'enabled' ) )
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
                    // InternalSeleniumDsl.g:790:2: ( 'selected' )
                    {
                    // InternalSeleniumDsl.g:790:2: ( 'selected' )
                    // InternalSeleniumDsl.g:791:3: 'selected'
                    {
                     before(grammarAccess.getElementPropertyAccess().getPropertySelectedKeyword_1_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getElementPropertyAccess().getPropertySelectedKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDsl.g:796:2: ( 'visible' )
                    {
                    // InternalSeleniumDsl.g:796:2: ( 'visible' )
                    // InternalSeleniumDsl.g:797:3: 'visible'
                    {
                     before(grammarAccess.getElementPropertyAccess().getPropertyVisibleKeyword_1_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getElementPropertyAccess().getPropertyVisibleKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSeleniumDsl.g:802:2: ( 'enabled' )
                    {
                    // InternalSeleniumDsl.g:802:2: ( 'enabled' )
                    // InternalSeleniumDsl.g:803:3: 'enabled'
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
    // InternalSeleniumDsl.g:812:1: rule__SelectorPredicate__Alternatives : ( ( ruleAllPredicate ) | ( ruleOrdinalPredicate ) | ( ruleLastPredicate ) | ( ruleDefaultFirstPredicate ) );
    public final void rule__SelectorPredicate__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:816:1: ( ( ruleAllPredicate ) | ( ruleOrdinalPredicate ) | ( ruleLastPredicate ) | ( ruleDefaultFirstPredicate ) )
            int alt7=4;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==45) ) {
                alt7=1;
            }
            else if ( (LA7_0==28) ) {
                switch ( input.LA(2) ) {
                case 48:
                    {
                    alt7=3;
                    }
                    break;
                case RULE_INT:
                    {
                    alt7=2;
                    }
                    break;
                case EOF:
                case RULE_STRING:
                    {
                    alt7=4;
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
                    // InternalSeleniumDsl.g:817:2: ( ruleAllPredicate )
                    {
                    // InternalSeleniumDsl.g:817:2: ( ruleAllPredicate )
                    // InternalSeleniumDsl.g:818:3: ruleAllPredicate
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
                    // InternalSeleniumDsl.g:823:2: ( ruleOrdinalPredicate )
                    {
                    // InternalSeleniumDsl.g:823:2: ( ruleOrdinalPredicate )
                    // InternalSeleniumDsl.g:824:3: ruleOrdinalPredicate
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
                    // InternalSeleniumDsl.g:829:2: ( ruleLastPredicate )
                    {
                    // InternalSeleniumDsl.g:829:2: ( ruleLastPredicate )
                    // InternalSeleniumDsl.g:830:3: ruleLastPredicate
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
                    // InternalSeleniumDsl.g:835:2: ( ruleDefaultFirstPredicate )
                    {
                    // InternalSeleniumDsl.g:835:2: ( ruleDefaultFirstPredicate )
                    // InternalSeleniumDsl.g:836:3: ruleDefaultFirstPredicate
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
    // InternalSeleniumDsl.g:845:1: rule__Matcher__Alternatives : ( ( 'containing' ) | ( 'matching' ) );
    public final void rule__Matcher__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:849:1: ( ( 'containing' ) | ( 'matching' ) )
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
                    // InternalSeleniumDsl.g:850:2: ( 'containing' )
                    {
                    // InternalSeleniumDsl.g:850:2: ( 'containing' )
                    // InternalSeleniumDsl.g:851:3: 'containing'
                    {
                     before(grammarAccess.getMatcherAccess().getContainingKeyword_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getMatcherAccess().getContainingKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDsl.g:856:2: ( 'matching' )
                    {
                    // InternalSeleniumDsl.g:856:2: ( 'matching' )
                    // InternalSeleniumDsl.g:857:3: 'matching'
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


    // $ANTLR start "rule__OpenBrowser__Group__0"
    // InternalSeleniumDsl.g:866:1: rule__OpenBrowser__Group__0 : rule__OpenBrowser__Group__0__Impl rule__OpenBrowser__Group__1 ;
    public final void rule__OpenBrowser__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:870:1: ( rule__OpenBrowser__Group__0__Impl rule__OpenBrowser__Group__1 )
            // InternalSeleniumDsl.g:871:2: rule__OpenBrowser__Group__0__Impl rule__OpenBrowser__Group__1
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
    // InternalSeleniumDsl.g:878:1: rule__OpenBrowser__Group__0__Impl : ( () ) ;
    public final void rule__OpenBrowser__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:882:1: ( ( () ) )
            // InternalSeleniumDsl.g:883:1: ( () )
            {
            // InternalSeleniumDsl.g:883:1: ( () )
            // InternalSeleniumDsl.g:884:2: ()
            {
             before(grammarAccess.getOpenBrowserAccess().getOpenBrowserAction_0()); 
            // InternalSeleniumDsl.g:885:2: ()
            // InternalSeleniumDsl.g:885:3: 
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
    // InternalSeleniumDsl.g:893:1: rule__OpenBrowser__Group__1 : rule__OpenBrowser__Group__1__Impl rule__OpenBrowser__Group__2 ;
    public final void rule__OpenBrowser__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:897:1: ( rule__OpenBrowser__Group__1__Impl rule__OpenBrowser__Group__2 )
            // InternalSeleniumDsl.g:898:2: rule__OpenBrowser__Group__1__Impl rule__OpenBrowser__Group__2
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
    // InternalSeleniumDsl.g:905:1: rule__OpenBrowser__Group__1__Impl : ( 'open' ) ;
    public final void rule__OpenBrowser__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:909:1: ( ( 'open' ) )
            // InternalSeleniumDsl.g:910:1: ( 'open' )
            {
            // InternalSeleniumDsl.g:910:1: ( 'open' )
            // InternalSeleniumDsl.g:911:2: 'open'
            {
             before(grammarAccess.getOpenBrowserAccess().getOpenKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:920:1: rule__OpenBrowser__Group__2 : rule__OpenBrowser__Group__2__Impl rule__OpenBrowser__Group__3 ;
    public final void rule__OpenBrowser__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:924:1: ( rule__OpenBrowser__Group__2__Impl rule__OpenBrowser__Group__3 )
            // InternalSeleniumDsl.g:925:2: rule__OpenBrowser__Group__2__Impl rule__OpenBrowser__Group__3
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
    // InternalSeleniumDsl.g:932:1: rule__OpenBrowser__Group__2__Impl : ( 'a' ) ;
    public final void rule__OpenBrowser__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:936:1: ( ( 'a' ) )
            // InternalSeleniumDsl.g:937:1: ( 'a' )
            {
            // InternalSeleniumDsl.g:937:1: ( 'a' )
            // InternalSeleniumDsl.g:938:2: 'a'
            {
             before(grammarAccess.getOpenBrowserAccess().getAKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:947:1: rule__OpenBrowser__Group__3 : rule__OpenBrowser__Group__3__Impl rule__OpenBrowser__Group__4 ;
    public final void rule__OpenBrowser__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:951:1: ( rule__OpenBrowser__Group__3__Impl rule__OpenBrowser__Group__4 )
            // InternalSeleniumDsl.g:952:2: rule__OpenBrowser__Group__3__Impl rule__OpenBrowser__Group__4
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
    // InternalSeleniumDsl.g:959:1: rule__OpenBrowser__Group__3__Impl : ( 'browser' ) ;
    public final void rule__OpenBrowser__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:963:1: ( ( 'browser' ) )
            // InternalSeleniumDsl.g:964:1: ( 'browser' )
            {
            // InternalSeleniumDsl.g:964:1: ( 'browser' )
            // InternalSeleniumDsl.g:965:2: 'browser'
            {
             before(grammarAccess.getOpenBrowserAccess().getBrowserKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:974:1: rule__OpenBrowser__Group__4 : rule__OpenBrowser__Group__4__Impl ;
    public final void rule__OpenBrowser__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:978:1: ( rule__OpenBrowser__Group__4__Impl )
            // InternalSeleniumDsl.g:979:2: rule__OpenBrowser__Group__4__Impl
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
    // InternalSeleniumDsl.g:985:1: rule__OpenBrowser__Group__4__Impl : ( 'window' ) ;
    public final void rule__OpenBrowser__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:989:1: ( ( 'window' ) )
            // InternalSeleniumDsl.g:990:1: ( 'window' )
            {
            // InternalSeleniumDsl.g:990:1: ( 'window' )
            // InternalSeleniumDsl.g:991:2: 'window'
            {
             before(grammarAccess.getOpenBrowserAccess().getWindowKeyword_4()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1001:1: rule__GoTo__Group__0 : rule__GoTo__Group__0__Impl rule__GoTo__Group__1 ;
    public final void rule__GoTo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1005:1: ( rule__GoTo__Group__0__Impl rule__GoTo__Group__1 )
            // InternalSeleniumDsl.g:1006:2: rule__GoTo__Group__0__Impl rule__GoTo__Group__1
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
    // InternalSeleniumDsl.g:1013:1: rule__GoTo__Group__0__Impl : ( 'go' ) ;
    public final void rule__GoTo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1017:1: ( ( 'go' ) )
            // InternalSeleniumDsl.g:1018:1: ( 'go' )
            {
            // InternalSeleniumDsl.g:1018:1: ( 'go' )
            // InternalSeleniumDsl.g:1019:2: 'go'
            {
             before(grammarAccess.getGoToAccess().getGoKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1028:1: rule__GoTo__Group__1 : rule__GoTo__Group__1__Impl rule__GoTo__Group__2 ;
    public final void rule__GoTo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1032:1: ( rule__GoTo__Group__1__Impl rule__GoTo__Group__2 )
            // InternalSeleniumDsl.g:1033:2: rule__GoTo__Group__1__Impl rule__GoTo__Group__2
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
    // InternalSeleniumDsl.g:1040:1: rule__GoTo__Group__1__Impl : ( 'to' ) ;
    public final void rule__GoTo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1044:1: ( ( 'to' ) )
            // InternalSeleniumDsl.g:1045:1: ( 'to' )
            {
            // InternalSeleniumDsl.g:1045:1: ( 'to' )
            // InternalSeleniumDsl.g:1046:2: 'to'
            {
             before(grammarAccess.getGoToAccess().getToKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1055:1: rule__GoTo__Group__2 : rule__GoTo__Group__2__Impl ;
    public final void rule__GoTo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1059:1: ( rule__GoTo__Group__2__Impl )
            // InternalSeleniumDsl.g:1060:2: rule__GoTo__Group__2__Impl
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
    // InternalSeleniumDsl.g:1066:1: rule__GoTo__Group__2__Impl : ( ( rule__GoTo__UrlAssignment_2 ) ) ;
    public final void rule__GoTo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1070:1: ( ( ( rule__GoTo__UrlAssignment_2 ) ) )
            // InternalSeleniumDsl.g:1071:1: ( ( rule__GoTo__UrlAssignment_2 ) )
            {
            // InternalSeleniumDsl.g:1071:1: ( ( rule__GoTo__UrlAssignment_2 ) )
            // InternalSeleniumDsl.g:1072:2: ( rule__GoTo__UrlAssignment_2 )
            {
             before(grammarAccess.getGoToAccess().getUrlAssignment_2()); 
            // InternalSeleniumDsl.g:1073:2: ( rule__GoTo__UrlAssignment_2 )
            // InternalSeleniumDsl.g:1073:3: rule__GoTo__UrlAssignment_2
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
    // InternalSeleniumDsl.g:1082:1: rule__Click__Group__0 : rule__Click__Group__0__Impl rule__Click__Group__1 ;
    public final void rule__Click__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1086:1: ( rule__Click__Group__0__Impl rule__Click__Group__1 )
            // InternalSeleniumDsl.g:1087:2: rule__Click__Group__0__Impl rule__Click__Group__1
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
    // InternalSeleniumDsl.g:1094:1: rule__Click__Group__0__Impl : ( () ) ;
    public final void rule__Click__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1098:1: ( ( () ) )
            // InternalSeleniumDsl.g:1099:1: ( () )
            {
            // InternalSeleniumDsl.g:1099:1: ( () )
            // InternalSeleniumDsl.g:1100:2: ()
            {
             before(grammarAccess.getClickAccess().getClickAction_0()); 
            // InternalSeleniumDsl.g:1101:2: ()
            // InternalSeleniumDsl.g:1101:3: 
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
    // InternalSeleniumDsl.g:1109:1: rule__Click__Group__1 : rule__Click__Group__1__Impl rule__Click__Group__2 ;
    public final void rule__Click__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1113:1: ( rule__Click__Group__1__Impl rule__Click__Group__2 )
            // InternalSeleniumDsl.g:1114:2: rule__Click__Group__1__Impl rule__Click__Group__2
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
    // InternalSeleniumDsl.g:1121:1: rule__Click__Group__1__Impl : ( ( rule__Click__Alternatives_1 ) ) ;
    public final void rule__Click__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1125:1: ( ( ( rule__Click__Alternatives_1 ) ) )
            // InternalSeleniumDsl.g:1126:1: ( ( rule__Click__Alternatives_1 ) )
            {
            // InternalSeleniumDsl.g:1126:1: ( ( rule__Click__Alternatives_1 ) )
            // InternalSeleniumDsl.g:1127:2: ( rule__Click__Alternatives_1 )
            {
             before(grammarAccess.getClickAccess().getAlternatives_1()); 
            // InternalSeleniumDsl.g:1128:2: ( rule__Click__Alternatives_1 )
            // InternalSeleniumDsl.g:1128:3: rule__Click__Alternatives_1
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
    // InternalSeleniumDsl.g:1136:1: rule__Click__Group__2 : rule__Click__Group__2__Impl ;
    public final void rule__Click__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1140:1: ( rule__Click__Group__2__Impl )
            // InternalSeleniumDsl.g:1141:2: rule__Click__Group__2__Impl
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
    // InternalSeleniumDsl.g:1147:1: rule__Click__Group__2__Impl : ( ( rule__Click__ElementAssignment_2 ) ) ;
    public final void rule__Click__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1151:1: ( ( ( rule__Click__ElementAssignment_2 ) ) )
            // InternalSeleniumDsl.g:1152:1: ( ( rule__Click__ElementAssignment_2 ) )
            {
            // InternalSeleniumDsl.g:1152:1: ( ( rule__Click__ElementAssignment_2 ) )
            // InternalSeleniumDsl.g:1153:2: ( rule__Click__ElementAssignment_2 )
            {
             before(grammarAccess.getClickAccess().getElementAssignment_2()); 
            // InternalSeleniumDsl.g:1154:2: ( rule__Click__ElementAssignment_2 )
            // InternalSeleniumDsl.g:1154:3: rule__Click__ElementAssignment_2
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
    // InternalSeleniumDsl.g:1163:1: rule__Click__Group_1_0__0 : rule__Click__Group_1_0__0__Impl rule__Click__Group_1_0__1 ;
    public final void rule__Click__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1167:1: ( rule__Click__Group_1_0__0__Impl rule__Click__Group_1_0__1 )
            // InternalSeleniumDsl.g:1168:2: rule__Click__Group_1_0__0__Impl rule__Click__Group_1_0__1
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
    // InternalSeleniumDsl.g:1175:1: rule__Click__Group_1_0__0__Impl : ( 'click' ) ;
    public final void rule__Click__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1179:1: ( ( 'click' ) )
            // InternalSeleniumDsl.g:1180:1: ( 'click' )
            {
            // InternalSeleniumDsl.g:1180:1: ( 'click' )
            // InternalSeleniumDsl.g:1181:2: 'click'
            {
             before(grammarAccess.getClickAccess().getClickKeyword_1_0_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1190:1: rule__Click__Group_1_0__1 : rule__Click__Group_1_0__1__Impl ;
    public final void rule__Click__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1194:1: ( rule__Click__Group_1_0__1__Impl )
            // InternalSeleniumDsl.g:1195:2: rule__Click__Group_1_0__1__Impl
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
    // InternalSeleniumDsl.g:1201:1: rule__Click__Group_1_0__1__Impl : ( 'on' ) ;
    public final void rule__Click__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1205:1: ( ( 'on' ) )
            // InternalSeleniumDsl.g:1206:1: ( 'on' )
            {
            // InternalSeleniumDsl.g:1206:1: ( 'on' )
            // InternalSeleniumDsl.g:1207:2: 'on'
            {
             before(grammarAccess.getClickAccess().getOnKeyword_1_0_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1217:1: rule__Copy__Group__0 : rule__Copy__Group__0__Impl rule__Copy__Group__1 ;
    public final void rule__Copy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1221:1: ( rule__Copy__Group__0__Impl rule__Copy__Group__1 )
            // InternalSeleniumDsl.g:1222:2: rule__Copy__Group__0__Impl rule__Copy__Group__1
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
    // InternalSeleniumDsl.g:1229:1: rule__Copy__Group__0__Impl : ( () ) ;
    public final void rule__Copy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1233:1: ( ( () ) )
            // InternalSeleniumDsl.g:1234:1: ( () )
            {
            // InternalSeleniumDsl.g:1234:1: ( () )
            // InternalSeleniumDsl.g:1235:2: ()
            {
             before(grammarAccess.getCopyAccess().getCopyAction_0()); 
            // InternalSeleniumDsl.g:1236:2: ()
            // InternalSeleniumDsl.g:1236:3: 
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
    // InternalSeleniumDsl.g:1244:1: rule__Copy__Group__1 : rule__Copy__Group__1__Impl rule__Copy__Group__2 ;
    public final void rule__Copy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1248:1: ( rule__Copy__Group__1__Impl rule__Copy__Group__2 )
            // InternalSeleniumDsl.g:1249:2: rule__Copy__Group__1__Impl rule__Copy__Group__2
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
    // InternalSeleniumDsl.g:1256:1: rule__Copy__Group__1__Impl : ( 'copy' ) ;
    public final void rule__Copy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1260:1: ( ( 'copy' ) )
            // InternalSeleniumDsl.g:1261:1: ( 'copy' )
            {
            // InternalSeleniumDsl.g:1261:1: ( 'copy' )
            // InternalSeleniumDsl.g:1262:2: 'copy'
            {
             before(grammarAccess.getCopyAccess().getCopyKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1271:1: rule__Copy__Group__2 : rule__Copy__Group__2__Impl rule__Copy__Group__3 ;
    public final void rule__Copy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1275:1: ( rule__Copy__Group__2__Impl rule__Copy__Group__3 )
            // InternalSeleniumDsl.g:1276:2: rule__Copy__Group__2__Impl rule__Copy__Group__3
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
    // InternalSeleniumDsl.g:1283:1: rule__Copy__Group__2__Impl : ( 'the' ) ;
    public final void rule__Copy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1287:1: ( ( 'the' ) )
            // InternalSeleniumDsl.g:1288:1: ( 'the' )
            {
            // InternalSeleniumDsl.g:1288:1: ( 'the' )
            // InternalSeleniumDsl.g:1289:2: 'the'
            {
             before(grammarAccess.getCopyAccess().getTheKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1298:1: rule__Copy__Group__3 : rule__Copy__Group__3__Impl rule__Copy__Group__4 ;
    public final void rule__Copy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1302:1: ( rule__Copy__Group__3__Impl rule__Copy__Group__4 )
            // InternalSeleniumDsl.g:1303:2: rule__Copy__Group__3__Impl rule__Copy__Group__4
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
    // InternalSeleniumDsl.g:1310:1: rule__Copy__Group__3__Impl : ( 'property' ) ;
    public final void rule__Copy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1314:1: ( ( 'property' ) )
            // InternalSeleniumDsl.g:1315:1: ( 'property' )
            {
            // InternalSeleniumDsl.g:1315:1: ( 'property' )
            // InternalSeleniumDsl.g:1316:2: 'property'
            {
             before(grammarAccess.getCopyAccess().getPropertyKeyword_3()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1325:1: rule__Copy__Group__4 : rule__Copy__Group__4__Impl rule__Copy__Group__5 ;
    public final void rule__Copy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1329:1: ( rule__Copy__Group__4__Impl rule__Copy__Group__5 )
            // InternalSeleniumDsl.g:1330:2: rule__Copy__Group__4__Impl rule__Copy__Group__5
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
    // InternalSeleniumDsl.g:1337:1: rule__Copy__Group__4__Impl : ( ( rule__Copy__PropertyAssignment_4 ) ) ;
    public final void rule__Copy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1341:1: ( ( ( rule__Copy__PropertyAssignment_4 ) ) )
            // InternalSeleniumDsl.g:1342:1: ( ( rule__Copy__PropertyAssignment_4 ) )
            {
            // InternalSeleniumDsl.g:1342:1: ( ( rule__Copy__PropertyAssignment_4 ) )
            // InternalSeleniumDsl.g:1343:2: ( rule__Copy__PropertyAssignment_4 )
            {
             before(grammarAccess.getCopyAccess().getPropertyAssignment_4()); 
            // InternalSeleniumDsl.g:1344:2: ( rule__Copy__PropertyAssignment_4 )
            // InternalSeleniumDsl.g:1344:3: rule__Copy__PropertyAssignment_4
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
    // InternalSeleniumDsl.g:1352:1: rule__Copy__Group__5 : rule__Copy__Group__5__Impl rule__Copy__Group__6 ;
    public final void rule__Copy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1356:1: ( rule__Copy__Group__5__Impl rule__Copy__Group__6 )
            // InternalSeleniumDsl.g:1357:2: rule__Copy__Group__5__Impl rule__Copy__Group__6
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
    // InternalSeleniumDsl.g:1364:1: rule__Copy__Group__5__Impl : ( 'of' ) ;
    public final void rule__Copy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1368:1: ( ( 'of' ) )
            // InternalSeleniumDsl.g:1369:1: ( 'of' )
            {
            // InternalSeleniumDsl.g:1369:1: ( 'of' )
            // InternalSeleniumDsl.g:1370:2: 'of'
            {
             before(grammarAccess.getCopyAccess().getOfKeyword_5()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1379:1: rule__Copy__Group__6 : rule__Copy__Group__6__Impl rule__Copy__Group__7 ;
    public final void rule__Copy__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1383:1: ( rule__Copy__Group__6__Impl rule__Copy__Group__7 )
            // InternalSeleniumDsl.g:1384:2: rule__Copy__Group__6__Impl rule__Copy__Group__7
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
    // InternalSeleniumDsl.g:1391:1: rule__Copy__Group__6__Impl : ( ( rule__Copy__ElementAssignment_6 ) ) ;
    public final void rule__Copy__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1395:1: ( ( ( rule__Copy__ElementAssignment_6 ) ) )
            // InternalSeleniumDsl.g:1396:1: ( ( rule__Copy__ElementAssignment_6 ) )
            {
            // InternalSeleniumDsl.g:1396:1: ( ( rule__Copy__ElementAssignment_6 ) )
            // InternalSeleniumDsl.g:1397:2: ( rule__Copy__ElementAssignment_6 )
            {
             before(grammarAccess.getCopyAccess().getElementAssignment_6()); 
            // InternalSeleniumDsl.g:1398:2: ( rule__Copy__ElementAssignment_6 )
            // InternalSeleniumDsl.g:1398:3: rule__Copy__ElementAssignment_6
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
    // InternalSeleniumDsl.g:1406:1: rule__Copy__Group__7 : rule__Copy__Group__7__Impl rule__Copy__Group__8 ;
    public final void rule__Copy__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1410:1: ( rule__Copy__Group__7__Impl rule__Copy__Group__8 )
            // InternalSeleniumDsl.g:1411:2: rule__Copy__Group__7__Impl rule__Copy__Group__8
            {
            pushFollow(FOLLOW_9);
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
    // InternalSeleniumDsl.g:1418:1: rule__Copy__Group__7__Impl : ( 'as' ) ;
    public final void rule__Copy__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1422:1: ( ( 'as' ) )
            // InternalSeleniumDsl.g:1423:1: ( 'as' )
            {
            // InternalSeleniumDsl.g:1423:1: ( 'as' )
            // InternalSeleniumDsl.g:1424:2: 'as'
            {
             before(grammarAccess.getCopyAccess().getAsKeyword_7()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1433:1: rule__Copy__Group__8 : rule__Copy__Group__8__Impl ;
    public final void rule__Copy__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1437:1: ( rule__Copy__Group__8__Impl )
            // InternalSeleniumDsl.g:1438:2: rule__Copy__Group__8__Impl
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
    // InternalSeleniumDsl.g:1444:1: rule__Copy__Group__8__Impl : ( ( rule__Copy__KeyAssignment_8 ) ) ;
    public final void rule__Copy__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1448:1: ( ( ( rule__Copy__KeyAssignment_8 ) ) )
            // InternalSeleniumDsl.g:1449:1: ( ( rule__Copy__KeyAssignment_8 ) )
            {
            // InternalSeleniumDsl.g:1449:1: ( ( rule__Copy__KeyAssignment_8 ) )
            // InternalSeleniumDsl.g:1450:2: ( rule__Copy__KeyAssignment_8 )
            {
             before(grammarAccess.getCopyAccess().getKeyAssignment_8()); 
            // InternalSeleniumDsl.g:1451:2: ( rule__Copy__KeyAssignment_8 )
            // InternalSeleniumDsl.g:1451:3: rule__Copy__KeyAssignment_8
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
    // InternalSeleniumDsl.g:1460:1: rule__Paste__Group__0 : rule__Paste__Group__0__Impl rule__Paste__Group__1 ;
    public final void rule__Paste__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1464:1: ( rule__Paste__Group__0__Impl rule__Paste__Group__1 )
            // InternalSeleniumDsl.g:1465:2: rule__Paste__Group__0__Impl rule__Paste__Group__1
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
    // InternalSeleniumDsl.g:1472:1: rule__Paste__Group__0__Impl : ( 'paste' ) ;
    public final void rule__Paste__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1476:1: ( ( 'paste' ) )
            // InternalSeleniumDsl.g:1477:1: ( 'paste' )
            {
            // InternalSeleniumDsl.g:1477:1: ( 'paste' )
            // InternalSeleniumDsl.g:1478:2: 'paste'
            {
             before(grammarAccess.getPasteAccess().getPasteKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1487:1: rule__Paste__Group__1 : rule__Paste__Group__1__Impl rule__Paste__Group__2 ;
    public final void rule__Paste__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1491:1: ( rule__Paste__Group__1__Impl rule__Paste__Group__2 )
            // InternalSeleniumDsl.g:1492:2: rule__Paste__Group__1__Impl rule__Paste__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalSeleniumDsl.g:1499:1: rule__Paste__Group__1__Impl : ( 'the' ) ;
    public final void rule__Paste__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1503:1: ( ( 'the' ) )
            // InternalSeleniumDsl.g:1504:1: ( 'the' )
            {
            // InternalSeleniumDsl.g:1504:1: ( 'the' )
            // InternalSeleniumDsl.g:1505:2: 'the'
            {
             before(grammarAccess.getPasteAccess().getTheKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1514:1: rule__Paste__Group__2 : rule__Paste__Group__2__Impl rule__Paste__Group__3 ;
    public final void rule__Paste__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1518:1: ( rule__Paste__Group__2__Impl rule__Paste__Group__3 )
            // InternalSeleniumDsl.g:1519:2: rule__Paste__Group__2__Impl rule__Paste__Group__3
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
    // InternalSeleniumDsl.g:1526:1: rule__Paste__Group__2__Impl : ( 'content' ) ;
    public final void rule__Paste__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1530:1: ( ( 'content' ) )
            // InternalSeleniumDsl.g:1531:1: ( 'content' )
            {
            // InternalSeleniumDsl.g:1531:1: ( 'content' )
            // InternalSeleniumDsl.g:1532:2: 'content'
            {
             before(grammarAccess.getPasteAccess().getContentKeyword_2()); 
            match(input,33,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1541:1: rule__Paste__Group__3 : rule__Paste__Group__3__Impl rule__Paste__Group__4 ;
    public final void rule__Paste__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1545:1: ( rule__Paste__Group__3__Impl rule__Paste__Group__4 )
            // InternalSeleniumDsl.g:1546:2: rule__Paste__Group__3__Impl rule__Paste__Group__4
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
    // InternalSeleniumDsl.g:1553:1: rule__Paste__Group__3__Impl : ( 'of' ) ;
    public final void rule__Paste__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1557:1: ( ( 'of' ) )
            // InternalSeleniumDsl.g:1558:1: ( 'of' )
            {
            // InternalSeleniumDsl.g:1558:1: ( 'of' )
            // InternalSeleniumDsl.g:1559:2: 'of'
            {
             before(grammarAccess.getPasteAccess().getOfKeyword_3()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1568:1: rule__Paste__Group__4 : rule__Paste__Group__4__Impl rule__Paste__Group__5 ;
    public final void rule__Paste__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1572:1: ( rule__Paste__Group__4__Impl rule__Paste__Group__5 )
            // InternalSeleniumDsl.g:1573:2: rule__Paste__Group__4__Impl rule__Paste__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalSeleniumDsl.g:1580:1: rule__Paste__Group__4__Impl : ( 'the' ) ;
    public final void rule__Paste__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1584:1: ( ( 'the' ) )
            // InternalSeleniumDsl.g:1585:1: ( 'the' )
            {
            // InternalSeleniumDsl.g:1585:1: ( 'the' )
            // InternalSeleniumDsl.g:1586:2: 'the'
            {
             before(grammarAccess.getPasteAccess().getTheKeyword_4()); 
            match(input,28,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1595:1: rule__Paste__Group__5 : rule__Paste__Group__5__Impl rule__Paste__Group__6 ;
    public final void rule__Paste__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1599:1: ( rule__Paste__Group__5__Impl rule__Paste__Group__6 )
            // InternalSeleniumDsl.g:1600:2: rule__Paste__Group__5__Impl rule__Paste__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalSeleniumDsl.g:1607:1: rule__Paste__Group__5__Impl : ( 'clipboard' ) ;
    public final void rule__Paste__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1611:1: ( ( 'clipboard' ) )
            // InternalSeleniumDsl.g:1612:1: ( 'clipboard' )
            {
            // InternalSeleniumDsl.g:1612:1: ( 'clipboard' )
            // InternalSeleniumDsl.g:1613:2: 'clipboard'
            {
             before(grammarAccess.getPasteAccess().getClipboardKeyword_5()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1622:1: rule__Paste__Group__6 : rule__Paste__Group__6__Impl rule__Paste__Group__7 ;
    public final void rule__Paste__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1626:1: ( rule__Paste__Group__6__Impl rule__Paste__Group__7 )
            // InternalSeleniumDsl.g:1627:2: rule__Paste__Group__6__Impl rule__Paste__Group__7
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
    // InternalSeleniumDsl.g:1634:1: rule__Paste__Group__6__Impl : ( 'in' ) ;
    public final void rule__Paste__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1638:1: ( ( 'in' ) )
            // InternalSeleniumDsl.g:1639:1: ( 'in' )
            {
            // InternalSeleniumDsl.g:1639:1: ( 'in' )
            // InternalSeleniumDsl.g:1640:2: 'in'
            {
             before(grammarAccess.getPasteAccess().getInKeyword_6()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1649:1: rule__Paste__Group__7 : rule__Paste__Group__7__Impl ;
    public final void rule__Paste__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1653:1: ( rule__Paste__Group__7__Impl )
            // InternalSeleniumDsl.g:1654:2: rule__Paste__Group__7__Impl
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
    // InternalSeleniumDsl.g:1660:1: rule__Paste__Group__7__Impl : ( ( rule__Paste__ElementAssignment_7 ) ) ;
    public final void rule__Paste__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1664:1: ( ( ( rule__Paste__ElementAssignment_7 ) ) )
            // InternalSeleniumDsl.g:1665:1: ( ( rule__Paste__ElementAssignment_7 ) )
            {
            // InternalSeleniumDsl.g:1665:1: ( ( rule__Paste__ElementAssignment_7 ) )
            // InternalSeleniumDsl.g:1666:2: ( rule__Paste__ElementAssignment_7 )
            {
             before(grammarAccess.getPasteAccess().getElementAssignment_7()); 
            // InternalSeleniumDsl.g:1667:2: ( rule__Paste__ElementAssignment_7 )
            // InternalSeleniumDsl.g:1667:3: rule__Paste__ElementAssignment_7
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
    // InternalSeleniumDsl.g:1676:1: rule__Insert__Group__0 : rule__Insert__Group__0__Impl rule__Insert__Group__1 ;
    public final void rule__Insert__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1680:1: ( rule__Insert__Group__0__Impl rule__Insert__Group__1 )
            // InternalSeleniumDsl.g:1681:2: rule__Insert__Group__0__Impl rule__Insert__Group__1
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
    // InternalSeleniumDsl.g:1688:1: rule__Insert__Group__0__Impl : ( 'fill' ) ;
    public final void rule__Insert__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1692:1: ( ( 'fill' ) )
            // InternalSeleniumDsl.g:1693:1: ( 'fill' )
            {
            // InternalSeleniumDsl.g:1693:1: ( 'fill' )
            // InternalSeleniumDsl.g:1694:2: 'fill'
            {
             before(grammarAccess.getInsertAccess().getFillKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1703:1: rule__Insert__Group__1 : rule__Insert__Group__1__Impl rule__Insert__Group__2 ;
    public final void rule__Insert__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1707:1: ( rule__Insert__Group__1__Impl rule__Insert__Group__2 )
            // InternalSeleniumDsl.g:1708:2: rule__Insert__Group__1__Impl rule__Insert__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalSeleniumDsl.g:1715:1: rule__Insert__Group__1__Impl : ( ( rule__Insert__ElementAssignment_1 ) ) ;
    public final void rule__Insert__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1719:1: ( ( ( rule__Insert__ElementAssignment_1 ) ) )
            // InternalSeleniumDsl.g:1720:1: ( ( rule__Insert__ElementAssignment_1 ) )
            {
            // InternalSeleniumDsl.g:1720:1: ( ( rule__Insert__ElementAssignment_1 ) )
            // InternalSeleniumDsl.g:1721:2: ( rule__Insert__ElementAssignment_1 )
            {
             before(grammarAccess.getInsertAccess().getElementAssignment_1()); 
            // InternalSeleniumDsl.g:1722:2: ( rule__Insert__ElementAssignment_1 )
            // InternalSeleniumDsl.g:1722:3: rule__Insert__ElementAssignment_1
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
    // InternalSeleniumDsl.g:1730:1: rule__Insert__Group__2 : rule__Insert__Group__2__Impl rule__Insert__Group__3 ;
    public final void rule__Insert__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1734:1: ( rule__Insert__Group__2__Impl rule__Insert__Group__3 )
            // InternalSeleniumDsl.g:1735:2: rule__Insert__Group__2__Impl rule__Insert__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalSeleniumDsl.g:1742:1: rule__Insert__Group__2__Impl : ( 'with' ) ;
    public final void rule__Insert__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1746:1: ( ( 'with' ) )
            // InternalSeleniumDsl.g:1747:1: ( 'with' )
            {
            // InternalSeleniumDsl.g:1747:1: ( 'with' )
            // InternalSeleniumDsl.g:1748:2: 'with'
            {
             before(grammarAccess.getInsertAccess().getWithKeyword_2()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1757:1: rule__Insert__Group__3 : rule__Insert__Group__3__Impl ;
    public final void rule__Insert__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1761:1: ( rule__Insert__Group__3__Impl )
            // InternalSeleniumDsl.g:1762:2: rule__Insert__Group__3__Impl
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
    // InternalSeleniumDsl.g:1768:1: rule__Insert__Group__3__Impl : ( ( rule__Insert__ContentAssignment_3 ) ) ;
    public final void rule__Insert__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1772:1: ( ( ( rule__Insert__ContentAssignment_3 ) ) )
            // InternalSeleniumDsl.g:1773:1: ( ( rule__Insert__ContentAssignment_3 ) )
            {
            // InternalSeleniumDsl.g:1773:1: ( ( rule__Insert__ContentAssignment_3 ) )
            // InternalSeleniumDsl.g:1774:2: ( rule__Insert__ContentAssignment_3 )
            {
             before(grammarAccess.getInsertAccess().getContentAssignment_3()); 
            // InternalSeleniumDsl.g:1775:2: ( rule__Insert__ContentAssignment_3 )
            // InternalSeleniumDsl.g:1775:3: rule__Insert__ContentAssignment_3
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
    // InternalSeleniumDsl.g:1784:1: rule__Selector__Group__0 : rule__Selector__Group__0__Impl rule__Selector__Group__1 ;
    public final void rule__Selector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1788:1: ( rule__Selector__Group__0__Impl rule__Selector__Group__1 )
            // InternalSeleniumDsl.g:1789:2: rule__Selector__Group__0__Impl rule__Selector__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalSeleniumDsl.g:1796:1: rule__Selector__Group__0__Impl : ( ( rule__Selector__PredicateAssignment_0 ) ) ;
    public final void rule__Selector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1800:1: ( ( ( rule__Selector__PredicateAssignment_0 ) ) )
            // InternalSeleniumDsl.g:1801:1: ( ( rule__Selector__PredicateAssignment_0 ) )
            {
            // InternalSeleniumDsl.g:1801:1: ( ( rule__Selector__PredicateAssignment_0 ) )
            // InternalSeleniumDsl.g:1802:2: ( rule__Selector__PredicateAssignment_0 )
            {
             before(grammarAccess.getSelectorAccess().getPredicateAssignment_0()); 
            // InternalSeleniumDsl.g:1803:2: ( rule__Selector__PredicateAssignment_0 )
            // InternalSeleniumDsl.g:1803:3: rule__Selector__PredicateAssignment_0
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
    // InternalSeleniumDsl.g:1811:1: rule__Selector__Group__1 : rule__Selector__Group__1__Impl rule__Selector__Group__2 ;
    public final void rule__Selector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1815:1: ( rule__Selector__Group__1__Impl rule__Selector__Group__2 )
            // InternalSeleniumDsl.g:1816:2: rule__Selector__Group__1__Impl rule__Selector__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalSeleniumDsl.g:1823:1: rule__Selector__Group__1__Impl : ( ( rule__Selector__DomTypeAssignment_1 ) ) ;
    public final void rule__Selector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1827:1: ( ( ( rule__Selector__DomTypeAssignment_1 ) ) )
            // InternalSeleniumDsl.g:1828:1: ( ( rule__Selector__DomTypeAssignment_1 ) )
            {
            // InternalSeleniumDsl.g:1828:1: ( ( rule__Selector__DomTypeAssignment_1 ) )
            // InternalSeleniumDsl.g:1829:2: ( rule__Selector__DomTypeAssignment_1 )
            {
             before(grammarAccess.getSelectorAccess().getDomTypeAssignment_1()); 
            // InternalSeleniumDsl.g:1830:2: ( rule__Selector__DomTypeAssignment_1 )
            // InternalSeleniumDsl.g:1830:3: rule__Selector__DomTypeAssignment_1
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
    // InternalSeleniumDsl.g:1838:1: rule__Selector__Group__2 : rule__Selector__Group__2__Impl rule__Selector__Group__3 ;
    public final void rule__Selector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1842:1: ( rule__Selector__Group__2__Impl rule__Selector__Group__3 )
            // InternalSeleniumDsl.g:1843:2: rule__Selector__Group__2__Impl rule__Selector__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalSeleniumDsl.g:1850:1: rule__Selector__Group__2__Impl : ( ( rule__Selector__Group_2__0 )? ) ;
    public final void rule__Selector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1854:1: ( ( ( rule__Selector__Group_2__0 )? ) )
            // InternalSeleniumDsl.g:1855:1: ( ( rule__Selector__Group_2__0 )? )
            {
            // InternalSeleniumDsl.g:1855:1: ( ( rule__Selector__Group_2__0 )? )
            // InternalSeleniumDsl.g:1856:2: ( rule__Selector__Group_2__0 )?
            {
             before(grammarAccess.getSelectorAccess().getGroup_2()); 
            // InternalSeleniumDsl.g:1857:2: ( rule__Selector__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==37) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==38) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // InternalSeleniumDsl.g:1857:3: rule__Selector__Group_2__0
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
    // InternalSeleniumDsl.g:1865:1: rule__Selector__Group__3 : rule__Selector__Group__3__Impl rule__Selector__Group__4 ;
    public final void rule__Selector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1869:1: ( rule__Selector__Group__3__Impl rule__Selector__Group__4 )
            // InternalSeleniumDsl.g:1870:2: rule__Selector__Group__3__Impl rule__Selector__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalSeleniumDsl.g:1877:1: rule__Selector__Group__3__Impl : ( ( rule__Selector__Group_3__0 )? ) ;
    public final void rule__Selector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1881:1: ( ( ( rule__Selector__Group_3__0 )? ) )
            // InternalSeleniumDsl.g:1882:1: ( ( rule__Selector__Group_3__0 )? )
            {
            // InternalSeleniumDsl.g:1882:1: ( ( rule__Selector__Group_3__0 )? )
            // InternalSeleniumDsl.g:1883:2: ( rule__Selector__Group_3__0 )?
            {
             before(grammarAccess.getSelectorAccess().getGroup_3()); 
            // InternalSeleniumDsl.g:1884:2: ( rule__Selector__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==37) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==39) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // InternalSeleniumDsl.g:1884:3: rule__Selector__Group_3__0
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
    // InternalSeleniumDsl.g:1892:1: rule__Selector__Group__4 : rule__Selector__Group__4__Impl rule__Selector__Group__5 ;
    public final void rule__Selector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1896:1: ( rule__Selector__Group__4__Impl rule__Selector__Group__5 )
            // InternalSeleniumDsl.g:1897:2: rule__Selector__Group__4__Impl rule__Selector__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalSeleniumDsl.g:1904:1: rule__Selector__Group__4__Impl : ( ( rule__Selector__Group_4__0 )? ) ;
    public final void rule__Selector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1908:1: ( ( ( rule__Selector__Group_4__0 )? ) )
            // InternalSeleniumDsl.g:1909:1: ( ( rule__Selector__Group_4__0 )? )
            {
            // InternalSeleniumDsl.g:1909:1: ( ( rule__Selector__Group_4__0 )? )
            // InternalSeleniumDsl.g:1910:2: ( rule__Selector__Group_4__0 )?
            {
             before(grammarAccess.getSelectorAccess().getGroup_4()); 
            // InternalSeleniumDsl.g:1911:2: ( rule__Selector__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==41) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSeleniumDsl.g:1911:3: rule__Selector__Group_4__0
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
    // InternalSeleniumDsl.g:1919:1: rule__Selector__Group__5 : rule__Selector__Group__5__Impl ;
    public final void rule__Selector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1923:1: ( rule__Selector__Group__5__Impl )
            // InternalSeleniumDsl.g:1924:2: rule__Selector__Group__5__Impl
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
    // InternalSeleniumDsl.g:1930:1: rule__Selector__Group__5__Impl : ( ( rule__Selector__Group_5__0 )? ) ;
    public final void rule__Selector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1934:1: ( ( ( rule__Selector__Group_5__0 )? ) )
            // InternalSeleniumDsl.g:1935:1: ( ( rule__Selector__Group_5__0 )? )
            {
            // InternalSeleniumDsl.g:1935:1: ( ( rule__Selector__Group_5__0 )? )
            // InternalSeleniumDsl.g:1936:2: ( rule__Selector__Group_5__0 )?
            {
             before(grammarAccess.getSelectorAccess().getGroup_5()); 
            // InternalSeleniumDsl.g:1937:2: ( rule__Selector__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==35) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSeleniumDsl.g:1937:3: rule__Selector__Group_5__0
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
    // InternalSeleniumDsl.g:1946:1: rule__Selector__Group_2__0 : rule__Selector__Group_2__0__Impl rule__Selector__Group_2__1 ;
    public final void rule__Selector__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1950:1: ( rule__Selector__Group_2__0__Impl rule__Selector__Group_2__1 )
            // InternalSeleniumDsl.g:1951:2: rule__Selector__Group_2__0__Impl rule__Selector__Group_2__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalSeleniumDsl.g:1958:1: rule__Selector__Group_2__0__Impl : ( 'with' ) ;
    public final void rule__Selector__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1962:1: ( ( 'with' ) )
            // InternalSeleniumDsl.g:1963:1: ( 'with' )
            {
            // InternalSeleniumDsl.g:1963:1: ( 'with' )
            // InternalSeleniumDsl.g:1964:2: 'with'
            {
             before(grammarAccess.getSelectorAccess().getWithKeyword_2_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1973:1: rule__Selector__Group_2__1 : rule__Selector__Group_2__1__Impl rule__Selector__Group_2__2 ;
    public final void rule__Selector__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1977:1: ( rule__Selector__Group_2__1__Impl rule__Selector__Group_2__2 )
            // InternalSeleniumDsl.g:1978:2: rule__Selector__Group_2__1__Impl rule__Selector__Group_2__2
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
    // InternalSeleniumDsl.g:1985:1: rule__Selector__Group_2__1__Impl : ( 'properties' ) ;
    public final void rule__Selector__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1989:1: ( ( 'properties' ) )
            // InternalSeleniumDsl.g:1990:1: ( 'properties' )
            {
            // InternalSeleniumDsl.g:1990:1: ( 'properties' )
            // InternalSeleniumDsl.g:1991:2: 'properties'
            {
             before(grammarAccess.getSelectorAccess().getPropertiesKeyword_2_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:2000:1: rule__Selector__Group_2__2 : rule__Selector__Group_2__2__Impl ;
    public final void rule__Selector__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2004:1: ( rule__Selector__Group_2__2__Impl )
            // InternalSeleniumDsl.g:2005:2: rule__Selector__Group_2__2__Impl
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
    // InternalSeleniumDsl.g:2011:1: rule__Selector__Group_2__2__Impl : ( ( rule__Selector__AttributesAssignment_2_2 ) ) ;
    public final void rule__Selector__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2015:1: ( ( ( rule__Selector__AttributesAssignment_2_2 ) ) )
            // InternalSeleniumDsl.g:2016:1: ( ( rule__Selector__AttributesAssignment_2_2 ) )
            {
            // InternalSeleniumDsl.g:2016:1: ( ( rule__Selector__AttributesAssignment_2_2 ) )
            // InternalSeleniumDsl.g:2017:2: ( rule__Selector__AttributesAssignment_2_2 )
            {
             before(grammarAccess.getSelectorAccess().getAttributesAssignment_2_2()); 
            // InternalSeleniumDsl.g:2018:2: ( rule__Selector__AttributesAssignment_2_2 )
            // InternalSeleniumDsl.g:2018:3: rule__Selector__AttributesAssignment_2_2
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
    // InternalSeleniumDsl.g:2027:1: rule__Selector__Group_3__0 : rule__Selector__Group_3__0__Impl rule__Selector__Group_3__1 ;
    public final void rule__Selector__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2031:1: ( rule__Selector__Group_3__0__Impl rule__Selector__Group_3__1 )
            // InternalSeleniumDsl.g:2032:2: rule__Selector__Group_3__0__Impl rule__Selector__Group_3__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalSeleniumDsl.g:2039:1: rule__Selector__Group_3__0__Impl : ( 'with' ) ;
    public final void rule__Selector__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2043:1: ( ( 'with' ) )
            // InternalSeleniumDsl.g:2044:1: ( 'with' )
            {
            // InternalSeleniumDsl.g:2044:1: ( 'with' )
            // InternalSeleniumDsl.g:2045:2: 'with'
            {
             before(grammarAccess.getSelectorAccess().getWithKeyword_3_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:2054:1: rule__Selector__Group_3__1 : rule__Selector__Group_3__1__Impl rule__Selector__Group_3__2 ;
    public final void rule__Selector__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2058:1: ( rule__Selector__Group_3__1__Impl rule__Selector__Group_3__2 )
            // InternalSeleniumDsl.g:2059:2: rule__Selector__Group_3__1__Impl rule__Selector__Group_3__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalSeleniumDsl.g:2066:1: rule__Selector__Group_3__1__Impl : ( 'associated' ) ;
    public final void rule__Selector__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2070:1: ( ( 'associated' ) )
            // InternalSeleniumDsl.g:2071:1: ( 'associated' )
            {
            // InternalSeleniumDsl.g:2071:1: ( 'associated' )
            // InternalSeleniumDsl.g:2072:2: 'associated'
            {
             before(grammarAccess.getSelectorAccess().getAssociatedKeyword_3_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:2081:1: rule__Selector__Group_3__2 : rule__Selector__Group_3__2__Impl rule__Selector__Group_3__3 ;
    public final void rule__Selector__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2085:1: ( rule__Selector__Group_3__2__Impl rule__Selector__Group_3__3 )
            // InternalSeleniumDsl.g:2086:2: rule__Selector__Group_3__2__Impl rule__Selector__Group_3__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalSeleniumDsl.g:2093:1: rule__Selector__Group_3__2__Impl : ( 'label' ) ;
    public final void rule__Selector__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2097:1: ( ( 'label' ) )
            // InternalSeleniumDsl.g:2098:1: ( 'label' )
            {
            // InternalSeleniumDsl.g:2098:1: ( 'label' )
            // InternalSeleniumDsl.g:2099:2: 'label'
            {
             before(grammarAccess.getSelectorAccess().getLabelKeyword_3_2()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:2108:1: rule__Selector__Group_3__3 : rule__Selector__Group_3__3__Impl ;
    public final void rule__Selector__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2112:1: ( rule__Selector__Group_3__3__Impl )
            // InternalSeleniumDsl.g:2113:2: rule__Selector__Group_3__3__Impl
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
    // InternalSeleniumDsl.g:2119:1: rule__Selector__Group_3__3__Impl : ( ( rule__Selector__LabelAssignment_3_3 ) ) ;
    public final void rule__Selector__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2123:1: ( ( ( rule__Selector__LabelAssignment_3_3 ) ) )
            // InternalSeleniumDsl.g:2124:1: ( ( rule__Selector__LabelAssignment_3_3 ) )
            {
            // InternalSeleniumDsl.g:2124:1: ( ( rule__Selector__LabelAssignment_3_3 ) )
            // InternalSeleniumDsl.g:2125:2: ( rule__Selector__LabelAssignment_3_3 )
            {
             before(grammarAccess.getSelectorAccess().getLabelAssignment_3_3()); 
            // InternalSeleniumDsl.g:2126:2: ( rule__Selector__LabelAssignment_3_3 )
            // InternalSeleniumDsl.g:2126:3: rule__Selector__LabelAssignment_3_3
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
    // InternalSeleniumDsl.g:2135:1: rule__Selector__Group_4__0 : rule__Selector__Group_4__0__Impl rule__Selector__Group_4__1 ;
    public final void rule__Selector__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2139:1: ( rule__Selector__Group_4__0__Impl rule__Selector__Group_4__1 )
            // InternalSeleniumDsl.g:2140:2: rule__Selector__Group_4__0__Impl rule__Selector__Group_4__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalSeleniumDsl.g:2147:1: rule__Selector__Group_4__0__Impl : ( 'that' ) ;
    public final void rule__Selector__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2151:1: ( ( 'that' ) )
            // InternalSeleniumDsl.g:2152:1: ( 'that' )
            {
            // InternalSeleniumDsl.g:2152:1: ( 'that' )
            // InternalSeleniumDsl.g:2153:2: 'that'
            {
             before(grammarAccess.getSelectorAccess().getThatKeyword_4_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:2162:1: rule__Selector__Group_4__1 : rule__Selector__Group_4__1__Impl rule__Selector__Group_4__2 ;
    public final void rule__Selector__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2166:1: ( rule__Selector__Group_4__1__Impl rule__Selector__Group_4__2 )
            // InternalSeleniumDsl.g:2167:2: rule__Selector__Group_4__1__Impl rule__Selector__Group_4__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalSeleniumDsl.g:2174:1: rule__Selector__Group_4__1__Impl : ( 'is' ) ;
    public final void rule__Selector__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2178:1: ( ( 'is' ) )
            // InternalSeleniumDsl.g:2179:1: ( 'is' )
            {
            // InternalSeleniumDsl.g:2179:1: ( 'is' )
            // InternalSeleniumDsl.g:2180:2: 'is'
            {
             before(grammarAccess.getSelectorAccess().getIsKeyword_4_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:2189:1: rule__Selector__Group_4__2 : rule__Selector__Group_4__2__Impl ;
    public final void rule__Selector__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2193:1: ( rule__Selector__Group_4__2__Impl )
            // InternalSeleniumDsl.g:2194:2: rule__Selector__Group_4__2__Impl
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
    // InternalSeleniumDsl.g:2200:1: rule__Selector__Group_4__2__Impl : ( ( rule__Selector__PropertiesAssignment_4_2 ) ) ;
    public final void rule__Selector__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2204:1: ( ( ( rule__Selector__PropertiesAssignment_4_2 ) ) )
            // InternalSeleniumDsl.g:2205:1: ( ( rule__Selector__PropertiesAssignment_4_2 ) )
            {
            // InternalSeleniumDsl.g:2205:1: ( ( rule__Selector__PropertiesAssignment_4_2 ) )
            // InternalSeleniumDsl.g:2206:2: ( rule__Selector__PropertiesAssignment_4_2 )
            {
             before(grammarAccess.getSelectorAccess().getPropertiesAssignment_4_2()); 
            // InternalSeleniumDsl.g:2207:2: ( rule__Selector__PropertiesAssignment_4_2 )
            // InternalSeleniumDsl.g:2207:3: rule__Selector__PropertiesAssignment_4_2
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
    // InternalSeleniumDsl.g:2216:1: rule__Selector__Group_5__0 : rule__Selector__Group_5__0__Impl rule__Selector__Group_5__1 ;
    public final void rule__Selector__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2220:1: ( rule__Selector__Group_5__0__Impl rule__Selector__Group_5__1 )
            // InternalSeleniumDsl.g:2221:2: rule__Selector__Group_5__0__Impl rule__Selector__Group_5__1
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
    // InternalSeleniumDsl.g:2228:1: rule__Selector__Group_5__0__Impl : ( 'in' ) ;
    public final void rule__Selector__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2232:1: ( ( 'in' ) )
            // InternalSeleniumDsl.g:2233:1: ( 'in' )
            {
            // InternalSeleniumDsl.g:2233:1: ( 'in' )
            // InternalSeleniumDsl.g:2234:2: 'in'
            {
             before(grammarAccess.getSelectorAccess().getInKeyword_5_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:2243:1: rule__Selector__Group_5__1 : rule__Selector__Group_5__1__Impl ;
    public final void rule__Selector__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2247:1: ( rule__Selector__Group_5__1__Impl )
            // InternalSeleniumDsl.g:2248:2: rule__Selector__Group_5__1__Impl
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
    // InternalSeleniumDsl.g:2254:1: rule__Selector__Group_5__1__Impl : ( ( rule__Selector__ParentAssignment_5_1 ) ) ;
    public final void rule__Selector__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2258:1: ( ( ( rule__Selector__ParentAssignment_5_1 ) ) )
            // InternalSeleniumDsl.g:2259:1: ( ( rule__Selector__ParentAssignment_5_1 ) )
            {
            // InternalSeleniumDsl.g:2259:1: ( ( rule__Selector__ParentAssignment_5_1 ) )
            // InternalSeleniumDsl.g:2260:2: ( rule__Selector__ParentAssignment_5_1 )
            {
             before(grammarAccess.getSelectorAccess().getParentAssignment_5_1()); 
            // InternalSeleniumDsl.g:2261:2: ( rule__Selector__ParentAssignment_5_1 )
            // InternalSeleniumDsl.g:2261:3: rule__Selector__ParentAssignment_5_1
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
    // InternalSeleniumDsl.g:2270:1: rule__Attributes__Group__0 : rule__Attributes__Group__0__Impl rule__Attributes__Group__1 ;
    public final void rule__Attributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2274:1: ( rule__Attributes__Group__0__Impl rule__Attributes__Group__1 )
            // InternalSeleniumDsl.g:2275:2: rule__Attributes__Group__0__Impl rule__Attributes__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalSeleniumDsl.g:2282:1: rule__Attributes__Group__0__Impl : ( ( rule__Attributes__AttributesAssignment_0 ) ) ;
    public final void rule__Attributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2286:1: ( ( ( rule__Attributes__AttributesAssignment_0 ) ) )
            // InternalSeleniumDsl.g:2287:1: ( ( rule__Attributes__AttributesAssignment_0 ) )
            {
            // InternalSeleniumDsl.g:2287:1: ( ( rule__Attributes__AttributesAssignment_0 ) )
            // InternalSeleniumDsl.g:2288:2: ( rule__Attributes__AttributesAssignment_0 )
            {
             before(grammarAccess.getAttributesAccess().getAttributesAssignment_0()); 
            // InternalSeleniumDsl.g:2289:2: ( rule__Attributes__AttributesAssignment_0 )
            // InternalSeleniumDsl.g:2289:3: rule__Attributes__AttributesAssignment_0
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
    // InternalSeleniumDsl.g:2297:1: rule__Attributes__Group__1 : rule__Attributes__Group__1__Impl ;
    public final void rule__Attributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2301:1: ( rule__Attributes__Group__1__Impl )
            // InternalSeleniumDsl.g:2302:2: rule__Attributes__Group__1__Impl
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
    // InternalSeleniumDsl.g:2308:1: rule__Attributes__Group__1__Impl : ( ( rule__Attributes__Group_1__0 )* ) ;
    public final void rule__Attributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2312:1: ( ( ( rule__Attributes__Group_1__0 )* ) )
            // InternalSeleniumDsl.g:2313:1: ( ( rule__Attributes__Group_1__0 )* )
            {
            // InternalSeleniumDsl.g:2313:1: ( ( rule__Attributes__Group_1__0 )* )
            // InternalSeleniumDsl.g:2314:2: ( rule__Attributes__Group_1__0 )*
            {
             before(grammarAccess.getAttributesAccess().getGroup_1()); 
            // InternalSeleniumDsl.g:2315:2: ( rule__Attributes__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==43) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSeleniumDsl.g:2315:3: rule__Attributes__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Attributes__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalSeleniumDsl.g:2324:1: rule__Attributes__Group_1__0 : rule__Attributes__Group_1__0__Impl rule__Attributes__Group_1__1 ;
    public final void rule__Attributes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2328:1: ( rule__Attributes__Group_1__0__Impl rule__Attributes__Group_1__1 )
            // InternalSeleniumDsl.g:2329:2: rule__Attributes__Group_1__0__Impl rule__Attributes__Group_1__1
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
    // InternalSeleniumDsl.g:2336:1: rule__Attributes__Group_1__0__Impl : ( 'and' ) ;
    public final void rule__Attributes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2340:1: ( ( 'and' ) )
            // InternalSeleniumDsl.g:2341:1: ( 'and' )
            {
            // InternalSeleniumDsl.g:2341:1: ( 'and' )
            // InternalSeleniumDsl.g:2342:2: 'and'
            {
             before(grammarAccess.getAttributesAccess().getAndKeyword_1_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:2351:1: rule__Attributes__Group_1__1 : rule__Attributes__Group_1__1__Impl ;
    public final void rule__Attributes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2355:1: ( rule__Attributes__Group_1__1__Impl )
            // InternalSeleniumDsl.g:2356:2: rule__Attributes__Group_1__1__Impl
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
    // InternalSeleniumDsl.g:2362:1: rule__Attributes__Group_1__1__Impl : ( ( rule__Attributes__PropertiesAssignment_1_1 ) ) ;
    public final void rule__Attributes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2366:1: ( ( ( rule__Attributes__PropertiesAssignment_1_1 ) ) )
            // InternalSeleniumDsl.g:2367:1: ( ( rule__Attributes__PropertiesAssignment_1_1 ) )
            {
            // InternalSeleniumDsl.g:2367:1: ( ( rule__Attributes__PropertiesAssignment_1_1 ) )
            // InternalSeleniumDsl.g:2368:2: ( rule__Attributes__PropertiesAssignment_1_1 )
            {
             before(grammarAccess.getAttributesAccess().getPropertiesAssignment_1_1()); 
            // InternalSeleniumDsl.g:2369:2: ( rule__Attributes__PropertiesAssignment_1_1 )
            // InternalSeleniumDsl.g:2369:3: rule__Attributes__PropertiesAssignment_1_1
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
    // InternalSeleniumDsl.g:2378:1: rule__ElementAttribute__Group__0 : rule__ElementAttribute__Group__0__Impl rule__ElementAttribute__Group__1 ;
    public final void rule__ElementAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2382:1: ( rule__ElementAttribute__Group__0__Impl rule__ElementAttribute__Group__1 )
            // InternalSeleniumDsl.g:2383:2: rule__ElementAttribute__Group__0__Impl rule__ElementAttribute__Group__1
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
    // InternalSeleniumDsl.g:2390:1: rule__ElementAttribute__Group__0__Impl : ( ( rule__ElementAttribute__NameAssignment_0 ) ) ;
    public final void rule__ElementAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2394:1: ( ( ( rule__ElementAttribute__NameAssignment_0 ) ) )
            // InternalSeleniumDsl.g:2395:1: ( ( rule__ElementAttribute__NameAssignment_0 ) )
            {
            // InternalSeleniumDsl.g:2395:1: ( ( rule__ElementAttribute__NameAssignment_0 ) )
            // InternalSeleniumDsl.g:2396:2: ( rule__ElementAttribute__NameAssignment_0 )
            {
             before(grammarAccess.getElementAttributeAccess().getNameAssignment_0()); 
            // InternalSeleniumDsl.g:2397:2: ( rule__ElementAttribute__NameAssignment_0 )
            // InternalSeleniumDsl.g:2397:3: rule__ElementAttribute__NameAssignment_0
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
    // InternalSeleniumDsl.g:2405:1: rule__ElementAttribute__Group__1 : rule__ElementAttribute__Group__1__Impl rule__ElementAttribute__Group__2 ;
    public final void rule__ElementAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2409:1: ( rule__ElementAttribute__Group__1__Impl rule__ElementAttribute__Group__2 )
            // InternalSeleniumDsl.g:2410:2: rule__ElementAttribute__Group__1__Impl rule__ElementAttribute__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalSeleniumDsl.g:2417:1: rule__ElementAttribute__Group__1__Impl : ( ( rule__ElementAttribute__MatcherAssignment_1 ) ) ;
    public final void rule__ElementAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2421:1: ( ( ( rule__ElementAttribute__MatcherAssignment_1 ) ) )
            // InternalSeleniumDsl.g:2422:1: ( ( rule__ElementAttribute__MatcherAssignment_1 ) )
            {
            // InternalSeleniumDsl.g:2422:1: ( ( rule__ElementAttribute__MatcherAssignment_1 ) )
            // InternalSeleniumDsl.g:2423:2: ( rule__ElementAttribute__MatcherAssignment_1 )
            {
             before(grammarAccess.getElementAttributeAccess().getMatcherAssignment_1()); 
            // InternalSeleniumDsl.g:2424:2: ( rule__ElementAttribute__MatcherAssignment_1 )
            // InternalSeleniumDsl.g:2424:3: rule__ElementAttribute__MatcherAssignment_1
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
    // InternalSeleniumDsl.g:2432:1: rule__ElementAttribute__Group__2 : rule__ElementAttribute__Group__2__Impl ;
    public final void rule__ElementAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2436:1: ( rule__ElementAttribute__Group__2__Impl )
            // InternalSeleniumDsl.g:2437:2: rule__ElementAttribute__Group__2__Impl
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
    // InternalSeleniumDsl.g:2443:1: rule__ElementAttribute__Group__2__Impl : ( ( rule__ElementAttribute__ValueAssignment_2 ) ) ;
    public final void rule__ElementAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2447:1: ( ( ( rule__ElementAttribute__ValueAssignment_2 ) ) )
            // InternalSeleniumDsl.g:2448:1: ( ( rule__ElementAttribute__ValueAssignment_2 ) )
            {
            // InternalSeleniumDsl.g:2448:1: ( ( rule__ElementAttribute__ValueAssignment_2 ) )
            // InternalSeleniumDsl.g:2449:2: ( rule__ElementAttribute__ValueAssignment_2 )
            {
             before(grammarAccess.getElementAttributeAccess().getValueAssignment_2()); 
            // InternalSeleniumDsl.g:2450:2: ( rule__ElementAttribute__ValueAssignment_2 )
            // InternalSeleniumDsl.g:2450:3: rule__ElementAttribute__ValueAssignment_2
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
    // InternalSeleniumDsl.g:2459:1: rule__ClipboardContent__Group__0 : rule__ClipboardContent__Group__0__Impl rule__ClipboardContent__Group__1 ;
    public final void rule__ClipboardContent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2463:1: ( rule__ClipboardContent__Group__0__Impl rule__ClipboardContent__Group__1 )
            // InternalSeleniumDsl.g:2464:2: rule__ClipboardContent__Group__0__Impl rule__ClipboardContent__Group__1
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
    // InternalSeleniumDsl.g:2471:1: rule__ClipboardContent__Group__0__Impl : ( 'the' ) ;
    public final void rule__ClipboardContent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2475:1: ( ( 'the' ) )
            // InternalSeleniumDsl.g:2476:1: ( 'the' )
            {
            // InternalSeleniumDsl.g:2476:1: ( 'the' )
            // InternalSeleniumDsl.g:2477:2: 'the'
            {
             before(grammarAccess.getClipboardContentAccess().getTheKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:2486:1: rule__ClipboardContent__Group__1 : rule__ClipboardContent__Group__1__Impl rule__ClipboardContent__Group__2 ;
    public final void rule__ClipboardContent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2490:1: ( rule__ClipboardContent__Group__1__Impl rule__ClipboardContent__Group__2 )
            // InternalSeleniumDsl.g:2491:2: rule__ClipboardContent__Group__1__Impl rule__ClipboardContent__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalSeleniumDsl.g:2498:1: rule__ClipboardContent__Group__1__Impl : ( 'saved' ) ;
    public final void rule__ClipboardContent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2502:1: ( ( 'saved' ) )
            // InternalSeleniumDsl.g:2503:1: ( 'saved' )
            {
            // InternalSeleniumDsl.g:2503:1: ( 'saved' )
            // InternalSeleniumDsl.g:2504:2: 'saved'
            {
             before(grammarAccess.getClipboardContentAccess().getSavedKeyword_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:2513:1: rule__ClipboardContent__Group__2 : rule__ClipboardContent__Group__2__Impl rule__ClipboardContent__Group__3 ;
    public final void rule__ClipboardContent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2517:1: ( rule__ClipboardContent__Group__2__Impl rule__ClipboardContent__Group__3 )
            // InternalSeleniumDsl.g:2518:2: rule__ClipboardContent__Group__2__Impl rule__ClipboardContent__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalSeleniumDsl.g:2525:1: rule__ClipboardContent__Group__2__Impl : ( 'content' ) ;
    public final void rule__ClipboardContent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2529:1: ( ( 'content' ) )
            // InternalSeleniumDsl.g:2530:1: ( 'content' )
            {
            // InternalSeleniumDsl.g:2530:1: ( 'content' )
            // InternalSeleniumDsl.g:2531:2: 'content'
            {
             before(grammarAccess.getClipboardContentAccess().getContentKeyword_2()); 
            match(input,33,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:2540:1: rule__ClipboardContent__Group__3 : rule__ClipboardContent__Group__3__Impl ;
    public final void rule__ClipboardContent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2544:1: ( rule__ClipboardContent__Group__3__Impl )
            // InternalSeleniumDsl.g:2545:2: rule__ClipboardContent__Group__3__Impl
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
    // InternalSeleniumDsl.g:2551:1: rule__ClipboardContent__Group__3__Impl : ( ( rule__ClipboardContent__KeyAssignment_3 ) ) ;
    public final void rule__ClipboardContent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2555:1: ( ( ( rule__ClipboardContent__KeyAssignment_3 ) ) )
            // InternalSeleniumDsl.g:2556:1: ( ( rule__ClipboardContent__KeyAssignment_3 ) )
            {
            // InternalSeleniumDsl.g:2556:1: ( ( rule__ClipboardContent__KeyAssignment_3 ) )
            // InternalSeleniumDsl.g:2557:2: ( rule__ClipboardContent__KeyAssignment_3 )
            {
             before(grammarAccess.getClipboardContentAccess().getKeyAssignment_3()); 
            // InternalSeleniumDsl.g:2558:2: ( rule__ClipboardContent__KeyAssignment_3 )
            // InternalSeleniumDsl.g:2558:3: rule__ClipboardContent__KeyAssignment_3
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
    // InternalSeleniumDsl.g:2567:1: rule__Properties__Group__0 : rule__Properties__Group__0__Impl rule__Properties__Group__1 ;
    public final void rule__Properties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2571:1: ( rule__Properties__Group__0__Impl rule__Properties__Group__1 )
            // InternalSeleniumDsl.g:2572:2: rule__Properties__Group__0__Impl rule__Properties__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalSeleniumDsl.g:2579:1: rule__Properties__Group__0__Impl : ( ( rule__Properties__PropertiesAssignment_0 ) ) ;
    public final void rule__Properties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2583:1: ( ( ( rule__Properties__PropertiesAssignment_0 ) ) )
            // InternalSeleniumDsl.g:2584:1: ( ( rule__Properties__PropertiesAssignment_0 ) )
            {
            // InternalSeleniumDsl.g:2584:1: ( ( rule__Properties__PropertiesAssignment_0 ) )
            // InternalSeleniumDsl.g:2585:2: ( rule__Properties__PropertiesAssignment_0 )
            {
             before(grammarAccess.getPropertiesAccess().getPropertiesAssignment_0()); 
            // InternalSeleniumDsl.g:2586:2: ( rule__Properties__PropertiesAssignment_0 )
            // InternalSeleniumDsl.g:2586:3: rule__Properties__PropertiesAssignment_0
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
    // InternalSeleniumDsl.g:2594:1: rule__Properties__Group__1 : rule__Properties__Group__1__Impl ;
    public final void rule__Properties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2598:1: ( rule__Properties__Group__1__Impl )
            // InternalSeleniumDsl.g:2599:2: rule__Properties__Group__1__Impl
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
    // InternalSeleniumDsl.g:2605:1: rule__Properties__Group__1__Impl : ( ( rule__Properties__Group_1__0 )* ) ;
    public final void rule__Properties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2609:1: ( ( ( rule__Properties__Group_1__0 )* ) )
            // InternalSeleniumDsl.g:2610:1: ( ( rule__Properties__Group_1__0 )* )
            {
            // InternalSeleniumDsl.g:2610:1: ( ( rule__Properties__Group_1__0 )* )
            // InternalSeleniumDsl.g:2611:2: ( rule__Properties__Group_1__0 )*
            {
             before(grammarAccess.getPropertiesAccess().getGroup_1()); 
            // InternalSeleniumDsl.g:2612:2: ( rule__Properties__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==43) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSeleniumDsl.g:2612:3: rule__Properties__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Properties__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalSeleniumDsl.g:2621:1: rule__Properties__Group_1__0 : rule__Properties__Group_1__0__Impl rule__Properties__Group_1__1 ;
    public final void rule__Properties__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2625:1: ( rule__Properties__Group_1__0__Impl rule__Properties__Group_1__1 )
            // InternalSeleniumDsl.g:2626:2: rule__Properties__Group_1__0__Impl rule__Properties__Group_1__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalSeleniumDsl.g:2633:1: rule__Properties__Group_1__0__Impl : ( 'and' ) ;
    public final void rule__Properties__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2637:1: ( ( 'and' ) )
            // InternalSeleniumDsl.g:2638:1: ( 'and' )
            {
            // InternalSeleniumDsl.g:2638:1: ( 'and' )
            // InternalSeleniumDsl.g:2639:2: 'and'
            {
             before(grammarAccess.getPropertiesAccess().getAndKeyword_1_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:2648:1: rule__Properties__Group_1__1 : rule__Properties__Group_1__1__Impl ;
    public final void rule__Properties__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2652:1: ( rule__Properties__Group_1__1__Impl )
            // InternalSeleniumDsl.g:2653:2: rule__Properties__Group_1__1__Impl
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
    // InternalSeleniumDsl.g:2659:1: rule__Properties__Group_1__1__Impl : ( ( rule__Properties__PropertiesAssignment_1_1 ) ) ;
    public final void rule__Properties__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2663:1: ( ( ( rule__Properties__PropertiesAssignment_1_1 ) ) )
            // InternalSeleniumDsl.g:2664:1: ( ( rule__Properties__PropertiesAssignment_1_1 ) )
            {
            // InternalSeleniumDsl.g:2664:1: ( ( rule__Properties__PropertiesAssignment_1_1 ) )
            // InternalSeleniumDsl.g:2665:2: ( rule__Properties__PropertiesAssignment_1_1 )
            {
             before(grammarAccess.getPropertiesAccess().getPropertiesAssignment_1_1()); 
            // InternalSeleniumDsl.g:2666:2: ( rule__Properties__PropertiesAssignment_1_1 )
            // InternalSeleniumDsl.g:2666:3: rule__Properties__PropertiesAssignment_1_1
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
    // InternalSeleniumDsl.g:2675:1: rule__ElementProperty__Group__0 : rule__ElementProperty__Group__0__Impl rule__ElementProperty__Group__1 ;
    public final void rule__ElementProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2679:1: ( rule__ElementProperty__Group__0__Impl rule__ElementProperty__Group__1 )
            // InternalSeleniumDsl.g:2680:2: rule__ElementProperty__Group__0__Impl rule__ElementProperty__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalSeleniumDsl.g:2687:1: rule__ElementProperty__Group__0__Impl : ( ( rule__ElementProperty__NegatedAssignment_0 )? ) ;
    public final void rule__ElementProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2691:1: ( ( ( rule__ElementProperty__NegatedAssignment_0 )? ) )
            // InternalSeleniumDsl.g:2692:1: ( ( rule__ElementProperty__NegatedAssignment_0 )? )
            {
            // InternalSeleniumDsl.g:2692:1: ( ( rule__ElementProperty__NegatedAssignment_0 )? )
            // InternalSeleniumDsl.g:2693:2: ( rule__ElementProperty__NegatedAssignment_0 )?
            {
             before(grammarAccess.getElementPropertyAccess().getNegatedAssignment_0()); 
            // InternalSeleniumDsl.g:2694:2: ( rule__ElementProperty__NegatedAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==50) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSeleniumDsl.g:2694:3: rule__ElementProperty__NegatedAssignment_0
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
    // InternalSeleniumDsl.g:2702:1: rule__ElementProperty__Group__1 : rule__ElementProperty__Group__1__Impl ;
    public final void rule__ElementProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2706:1: ( rule__ElementProperty__Group__1__Impl )
            // InternalSeleniumDsl.g:2707:2: rule__ElementProperty__Group__1__Impl
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
    // InternalSeleniumDsl.g:2713:1: rule__ElementProperty__Group__1__Impl : ( ( rule__ElementProperty__PropertyAssignment_1 ) ) ;
    public final void rule__ElementProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2717:1: ( ( ( rule__ElementProperty__PropertyAssignment_1 ) ) )
            // InternalSeleniumDsl.g:2718:1: ( ( rule__ElementProperty__PropertyAssignment_1 ) )
            {
            // InternalSeleniumDsl.g:2718:1: ( ( rule__ElementProperty__PropertyAssignment_1 ) )
            // InternalSeleniumDsl.g:2719:2: ( rule__ElementProperty__PropertyAssignment_1 )
            {
             before(grammarAccess.getElementPropertyAccess().getPropertyAssignment_1()); 
            // InternalSeleniumDsl.g:2720:2: ( rule__ElementProperty__PropertyAssignment_1 )
            // InternalSeleniumDsl.g:2720:3: rule__ElementProperty__PropertyAssignment_1
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
    // InternalSeleniumDsl.g:2729:1: rule__AllPredicate__Group__0 : rule__AllPredicate__Group__0__Impl rule__AllPredicate__Group__1 ;
    public final void rule__AllPredicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2733:1: ( rule__AllPredicate__Group__0__Impl rule__AllPredicate__Group__1 )
            // InternalSeleniumDsl.g:2734:2: rule__AllPredicate__Group__0__Impl rule__AllPredicate__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalSeleniumDsl.g:2741:1: rule__AllPredicate__Group__0__Impl : ( () ) ;
    public final void rule__AllPredicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2745:1: ( ( () ) )
            // InternalSeleniumDsl.g:2746:1: ( () )
            {
            // InternalSeleniumDsl.g:2746:1: ( () )
            // InternalSeleniumDsl.g:2747:2: ()
            {
             before(grammarAccess.getAllPredicateAccess().getAllPredicateAction_0()); 
            // InternalSeleniumDsl.g:2748:2: ()
            // InternalSeleniumDsl.g:2748:3: 
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
    // InternalSeleniumDsl.g:2756:1: rule__AllPredicate__Group__1 : rule__AllPredicate__Group__1__Impl rule__AllPredicate__Group__2 ;
    public final void rule__AllPredicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2760:1: ( rule__AllPredicate__Group__1__Impl rule__AllPredicate__Group__2 )
            // InternalSeleniumDsl.g:2761:2: rule__AllPredicate__Group__1__Impl rule__AllPredicate__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalSeleniumDsl.g:2768:1: rule__AllPredicate__Group__1__Impl : ( 'all' ) ;
    public final void rule__AllPredicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2772:1: ( ( 'all' ) )
            // InternalSeleniumDsl.g:2773:1: ( 'all' )
            {
            // InternalSeleniumDsl.g:2773:1: ( 'all' )
            // InternalSeleniumDsl.g:2774:2: 'all'
            {
             before(grammarAccess.getAllPredicateAccess().getAllKeyword_1()); 
            match(input,45,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:2783:1: rule__AllPredicate__Group__2 : rule__AllPredicate__Group__2__Impl rule__AllPredicate__Group__3 ;
    public final void rule__AllPredicate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2787:1: ( rule__AllPredicate__Group__2__Impl rule__AllPredicate__Group__3 )
            // InternalSeleniumDsl.g:2788:2: rule__AllPredicate__Group__2__Impl rule__AllPredicate__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalSeleniumDsl.g:2795:1: rule__AllPredicate__Group__2__Impl : ( 'elements' ) ;
    public final void rule__AllPredicate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2799:1: ( ( 'elements' ) )
            // InternalSeleniumDsl.g:2800:1: ( 'elements' )
            {
            // InternalSeleniumDsl.g:2800:1: ( 'elements' )
            // InternalSeleniumDsl.g:2801:2: 'elements'
            {
             before(grammarAccess.getAllPredicateAccess().getElementsKeyword_2()); 
            match(input,46,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:2810:1: rule__AllPredicate__Group__3 : rule__AllPredicate__Group__3__Impl rule__AllPredicate__Group__4 ;
    public final void rule__AllPredicate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2814:1: ( rule__AllPredicate__Group__3__Impl rule__AllPredicate__Group__4 )
            // InternalSeleniumDsl.g:2815:2: rule__AllPredicate__Group__3__Impl rule__AllPredicate__Group__4
            {
            pushFollow(FOLLOW_36);
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
    // InternalSeleniumDsl.g:2822:1: rule__AllPredicate__Group__3__Impl : ( 'of' ) ;
    public final void rule__AllPredicate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2826:1: ( ( 'of' ) )
            // InternalSeleniumDsl.g:2827:1: ( 'of' )
            {
            // InternalSeleniumDsl.g:2827:1: ( 'of' )
            // InternalSeleniumDsl.g:2828:2: 'of'
            {
             before(grammarAccess.getAllPredicateAccess().getOfKeyword_3()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:2837:1: rule__AllPredicate__Group__4 : rule__AllPredicate__Group__4__Impl ;
    public final void rule__AllPredicate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2841:1: ( rule__AllPredicate__Group__4__Impl )
            // InternalSeleniumDsl.g:2842:2: rule__AllPredicate__Group__4__Impl
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
    // InternalSeleniumDsl.g:2848:1: rule__AllPredicate__Group__4__Impl : ( 'type' ) ;
    public final void rule__AllPredicate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2852:1: ( ( 'type' ) )
            // InternalSeleniumDsl.g:2853:1: ( 'type' )
            {
            // InternalSeleniumDsl.g:2853:1: ( 'type' )
            // InternalSeleniumDsl.g:2854:2: 'type'
            {
             before(grammarAccess.getAllPredicateAccess().getTypeKeyword_4()); 
            match(input,47,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:2864:1: rule__OrdinalPredicate__Group__0 : rule__OrdinalPredicate__Group__0__Impl rule__OrdinalPredicate__Group__1 ;
    public final void rule__OrdinalPredicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2868:1: ( rule__OrdinalPredicate__Group__0__Impl rule__OrdinalPredicate__Group__1 )
            // InternalSeleniumDsl.g:2869:2: rule__OrdinalPredicate__Group__0__Impl rule__OrdinalPredicate__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalSeleniumDsl.g:2876:1: rule__OrdinalPredicate__Group__0__Impl : ( 'the' ) ;
    public final void rule__OrdinalPredicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2880:1: ( ( 'the' ) )
            // InternalSeleniumDsl.g:2881:1: ( 'the' )
            {
            // InternalSeleniumDsl.g:2881:1: ( 'the' )
            // InternalSeleniumDsl.g:2882:2: 'the'
            {
             before(grammarAccess.getOrdinalPredicateAccess().getTheKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:2891:1: rule__OrdinalPredicate__Group__1 : rule__OrdinalPredicate__Group__1__Impl ;
    public final void rule__OrdinalPredicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2895:1: ( rule__OrdinalPredicate__Group__1__Impl )
            // InternalSeleniumDsl.g:2896:2: rule__OrdinalPredicate__Group__1__Impl
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
    // InternalSeleniumDsl.g:2902:1: rule__OrdinalPredicate__Group__1__Impl : ( ( rule__OrdinalPredicate__OrdinalAssignment_1 ) ) ;
    public final void rule__OrdinalPredicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2906:1: ( ( ( rule__OrdinalPredicate__OrdinalAssignment_1 ) ) )
            // InternalSeleniumDsl.g:2907:1: ( ( rule__OrdinalPredicate__OrdinalAssignment_1 ) )
            {
            // InternalSeleniumDsl.g:2907:1: ( ( rule__OrdinalPredicate__OrdinalAssignment_1 ) )
            // InternalSeleniumDsl.g:2908:2: ( rule__OrdinalPredicate__OrdinalAssignment_1 )
            {
             before(grammarAccess.getOrdinalPredicateAccess().getOrdinalAssignment_1()); 
            // InternalSeleniumDsl.g:2909:2: ( rule__OrdinalPredicate__OrdinalAssignment_1 )
            // InternalSeleniumDsl.g:2909:3: rule__OrdinalPredicate__OrdinalAssignment_1
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
    // InternalSeleniumDsl.g:2918:1: rule__LastPredicate__Group__0 : rule__LastPredicate__Group__0__Impl rule__LastPredicate__Group__1 ;
    public final void rule__LastPredicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2922:1: ( rule__LastPredicate__Group__0__Impl rule__LastPredicate__Group__1 )
            // InternalSeleniumDsl.g:2923:2: rule__LastPredicate__Group__0__Impl rule__LastPredicate__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalSeleniumDsl.g:2930:1: rule__LastPredicate__Group__0__Impl : ( () ) ;
    public final void rule__LastPredicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2934:1: ( ( () ) )
            // InternalSeleniumDsl.g:2935:1: ( () )
            {
            // InternalSeleniumDsl.g:2935:1: ( () )
            // InternalSeleniumDsl.g:2936:2: ()
            {
             before(grammarAccess.getLastPredicateAccess().getLastPredicateAction_0()); 
            // InternalSeleniumDsl.g:2937:2: ()
            // InternalSeleniumDsl.g:2937:3: 
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
    // InternalSeleniumDsl.g:2945:1: rule__LastPredicate__Group__1 : rule__LastPredicate__Group__1__Impl rule__LastPredicate__Group__2 ;
    public final void rule__LastPredicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2949:1: ( rule__LastPredicate__Group__1__Impl rule__LastPredicate__Group__2 )
            // InternalSeleniumDsl.g:2950:2: rule__LastPredicate__Group__1__Impl rule__LastPredicate__Group__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalSeleniumDsl.g:2957:1: rule__LastPredicate__Group__1__Impl : ( 'the' ) ;
    public final void rule__LastPredicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2961:1: ( ( 'the' ) )
            // InternalSeleniumDsl.g:2962:1: ( 'the' )
            {
            // InternalSeleniumDsl.g:2962:1: ( 'the' )
            // InternalSeleniumDsl.g:2963:2: 'the'
            {
             before(grammarAccess.getLastPredicateAccess().getTheKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:2972:1: rule__LastPredicate__Group__2 : rule__LastPredicate__Group__2__Impl ;
    public final void rule__LastPredicate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2976:1: ( rule__LastPredicate__Group__2__Impl )
            // InternalSeleniumDsl.g:2977:2: rule__LastPredicate__Group__2__Impl
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
    // InternalSeleniumDsl.g:2983:1: rule__LastPredicate__Group__2__Impl : ( 'last' ) ;
    public final void rule__LastPredicate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2987:1: ( ( 'last' ) )
            // InternalSeleniumDsl.g:2988:1: ( 'last' )
            {
            // InternalSeleniumDsl.g:2988:1: ( 'last' )
            // InternalSeleniumDsl.g:2989:2: 'last'
            {
             before(grammarAccess.getLastPredicateAccess().getLastKeyword_2()); 
            match(input,48,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:2999:1: rule__DefaultFirstPredicate__Group__0 : rule__DefaultFirstPredicate__Group__0__Impl rule__DefaultFirstPredicate__Group__1 ;
    public final void rule__DefaultFirstPredicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3003:1: ( rule__DefaultFirstPredicate__Group__0__Impl rule__DefaultFirstPredicate__Group__1 )
            // InternalSeleniumDsl.g:3004:2: rule__DefaultFirstPredicate__Group__0__Impl rule__DefaultFirstPredicate__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalSeleniumDsl.g:3011:1: rule__DefaultFirstPredicate__Group__0__Impl : ( () ) ;
    public final void rule__DefaultFirstPredicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3015:1: ( ( () ) )
            // InternalSeleniumDsl.g:3016:1: ( () )
            {
            // InternalSeleniumDsl.g:3016:1: ( () )
            // InternalSeleniumDsl.g:3017:2: ()
            {
             before(grammarAccess.getDefaultFirstPredicateAccess().getDefaultFirstPredicateAction_0()); 
            // InternalSeleniumDsl.g:3018:2: ()
            // InternalSeleniumDsl.g:3018:3: 
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
    // InternalSeleniumDsl.g:3026:1: rule__DefaultFirstPredicate__Group__1 : rule__DefaultFirstPredicate__Group__1__Impl ;
    public final void rule__DefaultFirstPredicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3030:1: ( rule__DefaultFirstPredicate__Group__1__Impl )
            // InternalSeleniumDsl.g:3031:2: rule__DefaultFirstPredicate__Group__1__Impl
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
    // InternalSeleniumDsl.g:3037:1: rule__DefaultFirstPredicate__Group__1__Impl : ( 'the' ) ;
    public final void rule__DefaultFirstPredicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3041:1: ( ( 'the' ) )
            // InternalSeleniumDsl.g:3042:1: ( 'the' )
            {
            // InternalSeleniumDsl.g:3042:1: ( 'the' )
            // InternalSeleniumDsl.g:3043:2: 'the'
            {
             before(grammarAccess.getDefaultFirstPredicateAccess().getTheKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:3053:1: rule__Verify__Group__0 : rule__Verify__Group__0__Impl rule__Verify__Group__1 ;
    public final void rule__Verify__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3057:1: ( rule__Verify__Group__0__Impl rule__Verify__Group__1 )
            // InternalSeleniumDsl.g:3058:2: rule__Verify__Group__0__Impl rule__Verify__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalSeleniumDsl.g:3065:1: rule__Verify__Group__0__Impl : ( 'verify' ) ;
    public final void rule__Verify__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3069:1: ( ( 'verify' ) )
            // InternalSeleniumDsl.g:3070:1: ( 'verify' )
            {
            // InternalSeleniumDsl.g:3070:1: ( 'verify' )
            // InternalSeleniumDsl.g:3071:2: 'verify'
            {
             before(grammarAccess.getVerifyAccess().getVerifyKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:3080:1: rule__Verify__Group__1 : rule__Verify__Group__1__Impl rule__Verify__Group__2 ;
    public final void rule__Verify__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3084:1: ( rule__Verify__Group__1__Impl rule__Verify__Group__2 )
            // InternalSeleniumDsl.g:3085:2: rule__Verify__Group__1__Impl rule__Verify__Group__2
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
    // InternalSeleniumDsl.g:3092:1: rule__Verify__Group__1__Impl : ( 'that' ) ;
    public final void rule__Verify__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3096:1: ( ( 'that' ) )
            // InternalSeleniumDsl.g:3097:1: ( 'that' )
            {
            // InternalSeleniumDsl.g:3097:1: ( 'that' )
            // InternalSeleniumDsl.g:3098:2: 'that'
            {
             before(grammarAccess.getVerifyAccess().getThatKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:3107:1: rule__Verify__Group__2 : rule__Verify__Group__2__Impl rule__Verify__Group__3 ;
    public final void rule__Verify__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3111:1: ( rule__Verify__Group__2__Impl rule__Verify__Group__3 )
            // InternalSeleniumDsl.g:3112:2: rule__Verify__Group__2__Impl rule__Verify__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalSeleniumDsl.g:3119:1: rule__Verify__Group__2__Impl : ( ( rule__Verify__SelectorAssignment_2 ) ) ;
    public final void rule__Verify__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3123:1: ( ( ( rule__Verify__SelectorAssignment_2 ) ) )
            // InternalSeleniumDsl.g:3124:1: ( ( rule__Verify__SelectorAssignment_2 ) )
            {
            // InternalSeleniumDsl.g:3124:1: ( ( rule__Verify__SelectorAssignment_2 ) )
            // InternalSeleniumDsl.g:3125:2: ( rule__Verify__SelectorAssignment_2 )
            {
             before(grammarAccess.getVerifyAccess().getSelectorAssignment_2()); 
            // InternalSeleniumDsl.g:3126:2: ( rule__Verify__SelectorAssignment_2 )
            // InternalSeleniumDsl.g:3126:3: rule__Verify__SelectorAssignment_2
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
    // InternalSeleniumDsl.g:3134:1: rule__Verify__Group__3 : rule__Verify__Group__3__Impl rule__Verify__Group__4 ;
    public final void rule__Verify__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3138:1: ( rule__Verify__Group__3__Impl rule__Verify__Group__4 )
            // InternalSeleniumDsl.g:3139:2: rule__Verify__Group__3__Impl rule__Verify__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalSeleniumDsl.g:3146:1: rule__Verify__Group__3__Impl : ( 'is' ) ;
    public final void rule__Verify__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3150:1: ( ( 'is' ) )
            // InternalSeleniumDsl.g:3151:1: ( 'is' )
            {
            // InternalSeleniumDsl.g:3151:1: ( 'is' )
            // InternalSeleniumDsl.g:3152:2: 'is'
            {
             before(grammarAccess.getVerifyAccess().getIsKeyword_3()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:3161:1: rule__Verify__Group__4 : rule__Verify__Group__4__Impl rule__Verify__Group__5 ;
    public final void rule__Verify__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3165:1: ( rule__Verify__Group__4__Impl rule__Verify__Group__5 )
            // InternalSeleniumDsl.g:3166:2: rule__Verify__Group__4__Impl rule__Verify__Group__5
            {
            pushFollow(FOLLOW_30);
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
    // InternalSeleniumDsl.g:3173:1: rule__Verify__Group__4__Impl : ( ( rule__Verify__PropertiesAssignment_4 ) ) ;
    public final void rule__Verify__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3177:1: ( ( ( rule__Verify__PropertiesAssignment_4 ) ) )
            // InternalSeleniumDsl.g:3178:1: ( ( rule__Verify__PropertiesAssignment_4 ) )
            {
            // InternalSeleniumDsl.g:3178:1: ( ( rule__Verify__PropertiesAssignment_4 ) )
            // InternalSeleniumDsl.g:3179:2: ( rule__Verify__PropertiesAssignment_4 )
            {
             before(grammarAccess.getVerifyAccess().getPropertiesAssignment_4()); 
            // InternalSeleniumDsl.g:3180:2: ( rule__Verify__PropertiesAssignment_4 )
            // InternalSeleniumDsl.g:3180:3: rule__Verify__PropertiesAssignment_4
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
    // InternalSeleniumDsl.g:3188:1: rule__Verify__Group__5 : rule__Verify__Group__5__Impl ;
    public final void rule__Verify__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3192:1: ( rule__Verify__Group__5__Impl )
            // InternalSeleniumDsl.g:3193:2: rule__Verify__Group__5__Impl
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
    // InternalSeleniumDsl.g:3199:1: rule__Verify__Group__5__Impl : ( ( rule__Verify__Group_5__0 )* ) ;
    public final void rule__Verify__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3203:1: ( ( ( rule__Verify__Group_5__0 )* ) )
            // InternalSeleniumDsl.g:3204:1: ( ( rule__Verify__Group_5__0 )* )
            {
            // InternalSeleniumDsl.g:3204:1: ( ( rule__Verify__Group_5__0 )* )
            // InternalSeleniumDsl.g:3205:2: ( rule__Verify__Group_5__0 )*
            {
             before(grammarAccess.getVerifyAccess().getGroup_5()); 
            // InternalSeleniumDsl.g:3206:2: ( rule__Verify__Group_5__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==43) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSeleniumDsl.g:3206:3: rule__Verify__Group_5__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Verify__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalSeleniumDsl.g:3215:1: rule__Verify__Group_5__0 : rule__Verify__Group_5__0__Impl rule__Verify__Group_5__1 ;
    public final void rule__Verify__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3219:1: ( rule__Verify__Group_5__0__Impl rule__Verify__Group_5__1 )
            // InternalSeleniumDsl.g:3220:2: rule__Verify__Group_5__0__Impl rule__Verify__Group_5__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalSeleniumDsl.g:3227:1: rule__Verify__Group_5__0__Impl : ( 'and' ) ;
    public final void rule__Verify__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3231:1: ( ( 'and' ) )
            // InternalSeleniumDsl.g:3232:1: ( 'and' )
            {
            // InternalSeleniumDsl.g:3232:1: ( 'and' )
            // InternalSeleniumDsl.g:3233:2: 'and'
            {
             before(grammarAccess.getVerifyAccess().getAndKeyword_5_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:3242:1: rule__Verify__Group_5__1 : rule__Verify__Group_5__1__Impl ;
    public final void rule__Verify__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3246:1: ( rule__Verify__Group_5__1__Impl )
            // InternalSeleniumDsl.g:3247:2: rule__Verify__Group_5__1__Impl
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
    // InternalSeleniumDsl.g:3253:1: rule__Verify__Group_5__1__Impl : ( ( rule__Verify__PropertiesAssignment_5_1 ) ) ;
    public final void rule__Verify__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3257:1: ( ( ( rule__Verify__PropertiesAssignment_5_1 ) ) )
            // InternalSeleniumDsl.g:3258:1: ( ( rule__Verify__PropertiesAssignment_5_1 ) )
            {
            // InternalSeleniumDsl.g:3258:1: ( ( rule__Verify__PropertiesAssignment_5_1 ) )
            // InternalSeleniumDsl.g:3259:2: ( rule__Verify__PropertiesAssignment_5_1 )
            {
             before(grammarAccess.getVerifyAccess().getPropertiesAssignment_5_1()); 
            // InternalSeleniumDsl.g:3260:2: ( rule__Verify__PropertiesAssignment_5_1 )
            // InternalSeleniumDsl.g:3260:3: rule__Verify__PropertiesAssignment_5_1
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
    // InternalSeleniumDsl.g:3269:1: rule__OrdinalInteger__Group__0 : rule__OrdinalInteger__Group__0__Impl rule__OrdinalInteger__Group__1 ;
    public final void rule__OrdinalInteger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3273:1: ( rule__OrdinalInteger__Group__0__Impl rule__OrdinalInteger__Group__1 )
            // InternalSeleniumDsl.g:3274:2: rule__OrdinalInteger__Group__0__Impl rule__OrdinalInteger__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalSeleniumDsl.g:3281:1: rule__OrdinalInteger__Group__0__Impl : ( ( rule__OrdinalInteger__ValueAssignment_0 ) ) ;
    public final void rule__OrdinalInteger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3285:1: ( ( ( rule__OrdinalInteger__ValueAssignment_0 ) ) )
            // InternalSeleniumDsl.g:3286:1: ( ( rule__OrdinalInteger__ValueAssignment_0 ) )
            {
            // InternalSeleniumDsl.g:3286:1: ( ( rule__OrdinalInteger__ValueAssignment_0 ) )
            // InternalSeleniumDsl.g:3287:2: ( rule__OrdinalInteger__ValueAssignment_0 )
            {
             before(grammarAccess.getOrdinalIntegerAccess().getValueAssignment_0()); 
            // InternalSeleniumDsl.g:3288:2: ( rule__OrdinalInteger__ValueAssignment_0 )
            // InternalSeleniumDsl.g:3288:3: rule__OrdinalInteger__ValueAssignment_0
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
    // InternalSeleniumDsl.g:3296:1: rule__OrdinalInteger__Group__1 : rule__OrdinalInteger__Group__1__Impl ;
    public final void rule__OrdinalInteger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3300:1: ( rule__OrdinalInteger__Group__1__Impl )
            // InternalSeleniumDsl.g:3301:2: rule__OrdinalInteger__Group__1__Impl
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
    // InternalSeleniumDsl.g:3307:1: rule__OrdinalInteger__Group__1__Impl : ( RULE_ORDINAL_SUFFIX ) ;
    public final void rule__OrdinalInteger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3311:1: ( ( RULE_ORDINAL_SUFFIX ) )
            // InternalSeleniumDsl.g:3312:1: ( RULE_ORDINAL_SUFFIX )
            {
            // InternalSeleniumDsl.g:3312:1: ( RULE_ORDINAL_SUFFIX )
            // InternalSeleniumDsl.g:3313:2: RULE_ORDINAL_SUFFIX
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


    // $ANTLR start "rule__BrowserDsl__CommandsAssignment"
    // InternalSeleniumDsl.g:3323:1: rule__BrowserDsl__CommandsAssignment : ( ruleCommand ) ;
    public final void rule__BrowserDsl__CommandsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3327:1: ( ( ruleCommand ) )
            // InternalSeleniumDsl.g:3328:2: ( ruleCommand )
            {
            // InternalSeleniumDsl.g:3328:2: ( ruleCommand )
            // InternalSeleniumDsl.g:3329:3: ruleCommand
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


    // $ANTLR start "rule__GoTo__UrlAssignment_2"
    // InternalSeleniumDsl.g:3338:1: rule__GoTo__UrlAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GoTo__UrlAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3342:1: ( ( RULE_STRING ) )
            // InternalSeleniumDsl.g:3343:2: ( RULE_STRING )
            {
            // InternalSeleniumDsl.g:3343:2: ( RULE_STRING )
            // InternalSeleniumDsl.g:3344:3: RULE_STRING
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
    // InternalSeleniumDsl.g:3353:1: rule__Click__ElementAssignment_2 : ( ruleSelector ) ;
    public final void rule__Click__ElementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3357:1: ( ( ruleSelector ) )
            // InternalSeleniumDsl.g:3358:2: ( ruleSelector )
            {
            // InternalSeleniumDsl.g:3358:2: ( ruleSelector )
            // InternalSeleniumDsl.g:3359:3: ruleSelector
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
    // InternalSeleniumDsl.g:3368:1: rule__Copy__PropertyAssignment_4 : ( RULE_HTML_ATTRIBUTE ) ;
    public final void rule__Copy__PropertyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3372:1: ( ( RULE_HTML_ATTRIBUTE ) )
            // InternalSeleniumDsl.g:3373:2: ( RULE_HTML_ATTRIBUTE )
            {
            // InternalSeleniumDsl.g:3373:2: ( RULE_HTML_ATTRIBUTE )
            // InternalSeleniumDsl.g:3374:3: RULE_HTML_ATTRIBUTE
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
    // InternalSeleniumDsl.g:3383:1: rule__Copy__ElementAssignment_6 : ( ruleSelector ) ;
    public final void rule__Copy__ElementAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3387:1: ( ( ruleSelector ) )
            // InternalSeleniumDsl.g:3388:2: ( ruleSelector )
            {
            // InternalSeleniumDsl.g:3388:2: ( ruleSelector )
            // InternalSeleniumDsl.g:3389:3: ruleSelector
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
    // InternalSeleniumDsl.g:3398:1: rule__Copy__KeyAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Copy__KeyAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3402:1: ( ( RULE_STRING ) )
            // InternalSeleniumDsl.g:3403:2: ( RULE_STRING )
            {
            // InternalSeleniumDsl.g:3403:2: ( RULE_STRING )
            // InternalSeleniumDsl.g:3404:3: RULE_STRING
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
    // InternalSeleniumDsl.g:3413:1: rule__Paste__ElementAssignment_7 : ( ruleSelector ) ;
    public final void rule__Paste__ElementAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3417:1: ( ( ruleSelector ) )
            // InternalSeleniumDsl.g:3418:2: ( ruleSelector )
            {
            // InternalSeleniumDsl.g:3418:2: ( ruleSelector )
            // InternalSeleniumDsl.g:3419:3: ruleSelector
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
    // InternalSeleniumDsl.g:3428:1: rule__Insert__ElementAssignment_1 : ( ruleSelector ) ;
    public final void rule__Insert__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3432:1: ( ( ruleSelector ) )
            // InternalSeleniumDsl.g:3433:2: ( ruleSelector )
            {
            // InternalSeleniumDsl.g:3433:2: ( ruleSelector )
            // InternalSeleniumDsl.g:3434:3: ruleSelector
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
    // InternalSeleniumDsl.g:3443:1: rule__Insert__ContentAssignment_3 : ( ruleContent ) ;
    public final void rule__Insert__ContentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3447:1: ( ( ruleContent ) )
            // InternalSeleniumDsl.g:3448:2: ( ruleContent )
            {
            // InternalSeleniumDsl.g:3448:2: ( ruleContent )
            // InternalSeleniumDsl.g:3449:3: ruleContent
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
    // InternalSeleniumDsl.g:3458:1: rule__Selector__PredicateAssignment_0 : ( ruleSelectorPredicate ) ;
    public final void rule__Selector__PredicateAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3462:1: ( ( ruleSelectorPredicate ) )
            // InternalSeleniumDsl.g:3463:2: ( ruleSelectorPredicate )
            {
            // InternalSeleniumDsl.g:3463:2: ( ruleSelectorPredicate )
            // InternalSeleniumDsl.g:3464:3: ruleSelectorPredicate
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
    // InternalSeleniumDsl.g:3473:1: rule__Selector__DomTypeAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Selector__DomTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3477:1: ( ( RULE_STRING ) )
            // InternalSeleniumDsl.g:3478:2: ( RULE_STRING )
            {
            // InternalSeleniumDsl.g:3478:2: ( RULE_STRING )
            // InternalSeleniumDsl.g:3479:3: RULE_STRING
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
    // InternalSeleniumDsl.g:3488:1: rule__Selector__AttributesAssignment_2_2 : ( ruleAttributes ) ;
    public final void rule__Selector__AttributesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3492:1: ( ( ruleAttributes ) )
            // InternalSeleniumDsl.g:3493:2: ( ruleAttributes )
            {
            // InternalSeleniumDsl.g:3493:2: ( ruleAttributes )
            // InternalSeleniumDsl.g:3494:3: ruleAttributes
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
    // InternalSeleniumDsl.g:3503:1: rule__Selector__LabelAssignment_3_3 : ( RULE_STRING ) ;
    public final void rule__Selector__LabelAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3507:1: ( ( RULE_STRING ) )
            // InternalSeleniumDsl.g:3508:2: ( RULE_STRING )
            {
            // InternalSeleniumDsl.g:3508:2: ( RULE_STRING )
            // InternalSeleniumDsl.g:3509:3: RULE_STRING
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
    // InternalSeleniumDsl.g:3518:1: rule__Selector__PropertiesAssignment_4_2 : ( ruleProperties ) ;
    public final void rule__Selector__PropertiesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3522:1: ( ( ruleProperties ) )
            // InternalSeleniumDsl.g:3523:2: ( ruleProperties )
            {
            // InternalSeleniumDsl.g:3523:2: ( ruleProperties )
            // InternalSeleniumDsl.g:3524:3: ruleProperties
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
    // InternalSeleniumDsl.g:3533:1: rule__Selector__ParentAssignment_5_1 : ( ruleSelector ) ;
    public final void rule__Selector__ParentAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3537:1: ( ( ruleSelector ) )
            // InternalSeleniumDsl.g:3538:2: ( ruleSelector )
            {
            // InternalSeleniumDsl.g:3538:2: ( ruleSelector )
            // InternalSeleniumDsl.g:3539:3: ruleSelector
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
    // InternalSeleniumDsl.g:3548:1: rule__Attributes__AttributesAssignment_0 : ( ruleElementAttribute ) ;
    public final void rule__Attributes__AttributesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3552:1: ( ( ruleElementAttribute ) )
            // InternalSeleniumDsl.g:3553:2: ( ruleElementAttribute )
            {
            // InternalSeleniumDsl.g:3553:2: ( ruleElementAttribute )
            // InternalSeleniumDsl.g:3554:3: ruleElementAttribute
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
    // InternalSeleniumDsl.g:3563:1: rule__Attributes__PropertiesAssignment_1_1 : ( ruleElementAttribute ) ;
    public final void rule__Attributes__PropertiesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3567:1: ( ( ruleElementAttribute ) )
            // InternalSeleniumDsl.g:3568:2: ( ruleElementAttribute )
            {
            // InternalSeleniumDsl.g:3568:2: ( ruleElementAttribute )
            // InternalSeleniumDsl.g:3569:3: ruleElementAttribute
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
    // InternalSeleniumDsl.g:3578:1: rule__ElementAttribute__NameAssignment_0 : ( RULE_HTML_ATTRIBUTE ) ;
    public final void rule__ElementAttribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3582:1: ( ( RULE_HTML_ATTRIBUTE ) )
            // InternalSeleniumDsl.g:3583:2: ( RULE_HTML_ATTRIBUTE )
            {
            // InternalSeleniumDsl.g:3583:2: ( RULE_HTML_ATTRIBUTE )
            // InternalSeleniumDsl.g:3584:3: RULE_HTML_ATTRIBUTE
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
    // InternalSeleniumDsl.g:3593:1: rule__ElementAttribute__MatcherAssignment_1 : ( ruleMatcher ) ;
    public final void rule__ElementAttribute__MatcherAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3597:1: ( ( ruleMatcher ) )
            // InternalSeleniumDsl.g:3598:2: ( ruleMatcher )
            {
            // InternalSeleniumDsl.g:3598:2: ( ruleMatcher )
            // InternalSeleniumDsl.g:3599:3: ruleMatcher
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
    // InternalSeleniumDsl.g:3608:1: rule__ElementAttribute__ValueAssignment_2 : ( ruleContent ) ;
    public final void rule__ElementAttribute__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3612:1: ( ( ruleContent ) )
            // InternalSeleniumDsl.g:3613:2: ( ruleContent )
            {
            // InternalSeleniumDsl.g:3613:2: ( ruleContent )
            // InternalSeleniumDsl.g:3614:3: ruleContent
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
    // InternalSeleniumDsl.g:3623:1: rule__ClipboardContent__KeyAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ClipboardContent__KeyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3627:1: ( ( RULE_STRING ) )
            // InternalSeleniumDsl.g:3628:2: ( RULE_STRING )
            {
            // InternalSeleniumDsl.g:3628:2: ( RULE_STRING )
            // InternalSeleniumDsl.g:3629:3: RULE_STRING
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
    // InternalSeleniumDsl.g:3638:1: rule__StringContent__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringContent__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3642:1: ( ( RULE_STRING ) )
            // InternalSeleniumDsl.g:3643:2: ( RULE_STRING )
            {
            // InternalSeleniumDsl.g:3643:2: ( RULE_STRING )
            // InternalSeleniumDsl.g:3644:3: RULE_STRING
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
    // InternalSeleniumDsl.g:3653:1: rule__Properties__PropertiesAssignment_0 : ( ruleElementProperty ) ;
    public final void rule__Properties__PropertiesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3657:1: ( ( ruleElementProperty ) )
            // InternalSeleniumDsl.g:3658:2: ( ruleElementProperty )
            {
            // InternalSeleniumDsl.g:3658:2: ( ruleElementProperty )
            // InternalSeleniumDsl.g:3659:3: ruleElementProperty
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
    // InternalSeleniumDsl.g:3668:1: rule__Properties__PropertiesAssignment_1_1 : ( ruleElementProperty ) ;
    public final void rule__Properties__PropertiesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3672:1: ( ( ruleElementProperty ) )
            // InternalSeleniumDsl.g:3673:2: ( ruleElementProperty )
            {
            // InternalSeleniumDsl.g:3673:2: ( ruleElementProperty )
            // InternalSeleniumDsl.g:3674:3: ruleElementProperty
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
    // InternalSeleniumDsl.g:3683:1: rule__ElementProperty__NegatedAssignment_0 : ( ( 'not' ) ) ;
    public final void rule__ElementProperty__NegatedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3687:1: ( ( ( 'not' ) ) )
            // InternalSeleniumDsl.g:3688:2: ( ( 'not' ) )
            {
            // InternalSeleniumDsl.g:3688:2: ( ( 'not' ) )
            // InternalSeleniumDsl.g:3689:3: ( 'not' )
            {
             before(grammarAccess.getElementPropertyAccess().getNegatedNotKeyword_0_0()); 
            // InternalSeleniumDsl.g:3690:3: ( 'not' )
            // InternalSeleniumDsl.g:3691:4: 'not'
            {
             before(grammarAccess.getElementPropertyAccess().getNegatedNotKeyword_0_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:3702:1: rule__ElementProperty__PropertyAssignment_1 : ( ( rule__ElementProperty__PropertyAlternatives_1_0 ) ) ;
    public final void rule__ElementProperty__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3706:1: ( ( ( rule__ElementProperty__PropertyAlternatives_1_0 ) ) )
            // InternalSeleniumDsl.g:3707:2: ( ( rule__ElementProperty__PropertyAlternatives_1_0 ) )
            {
            // InternalSeleniumDsl.g:3707:2: ( ( rule__ElementProperty__PropertyAlternatives_1_0 ) )
            // InternalSeleniumDsl.g:3708:3: ( rule__ElementProperty__PropertyAlternatives_1_0 )
            {
             before(grammarAccess.getElementPropertyAccess().getPropertyAlternatives_1_0()); 
            // InternalSeleniumDsl.g:3709:3: ( rule__ElementProperty__PropertyAlternatives_1_0 )
            // InternalSeleniumDsl.g:3709:4: rule__ElementProperty__PropertyAlternatives_1_0
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
    // InternalSeleniumDsl.g:3717:1: rule__OrdinalPredicate__OrdinalAssignment_1 : ( ruleOrdinalInteger ) ;
    public final void rule__OrdinalPredicate__OrdinalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3721:1: ( ( ruleOrdinalInteger ) )
            // InternalSeleniumDsl.g:3722:2: ( ruleOrdinalInteger )
            {
            // InternalSeleniumDsl.g:3722:2: ( ruleOrdinalInteger )
            // InternalSeleniumDsl.g:3723:3: ruleOrdinalInteger
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
    // InternalSeleniumDsl.g:3732:1: rule__Verify__SelectorAssignment_2 : ( ruleSelector ) ;
    public final void rule__Verify__SelectorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3736:1: ( ( ruleSelector ) )
            // InternalSeleniumDsl.g:3737:2: ( ruleSelector )
            {
            // InternalSeleniumDsl.g:3737:2: ( ruleSelector )
            // InternalSeleniumDsl.g:3738:3: ruleSelector
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
    // InternalSeleniumDsl.g:3747:1: rule__Verify__PropertiesAssignment_4 : ( ruleElementProperty ) ;
    public final void rule__Verify__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3751:1: ( ( ruleElementProperty ) )
            // InternalSeleniumDsl.g:3752:2: ( ruleElementProperty )
            {
            // InternalSeleniumDsl.g:3752:2: ( ruleElementProperty )
            // InternalSeleniumDsl.g:3753:3: ruleElementProperty
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
    // InternalSeleniumDsl.g:3762:1: rule__Verify__PropertiesAssignment_5_1 : ( ruleElementProperty ) ;
    public final void rule__Verify__PropertiesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3766:1: ( ( ruleElementProperty ) )
            // InternalSeleniumDsl.g:3767:2: ( ruleElementProperty )
            {
            // InternalSeleniumDsl.g:3767:2: ( ruleElementProperty )
            // InternalSeleniumDsl.g:3768:3: ruleElementProperty
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
    // InternalSeleniumDsl.g:3777:1: rule__OrdinalInteger__ValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__OrdinalInteger__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3781:1: ( ( RULE_INT ) )
            // InternalSeleniumDsl.g:3782:2: ( RULE_INT )
            {
            // InternalSeleniumDsl.g:3782:2: ( RULE_INT )
            // InternalSeleniumDsl.g:3783:3: RULE_INT
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000200110A882002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000200010000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000022800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000400000001C000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000010L});

}