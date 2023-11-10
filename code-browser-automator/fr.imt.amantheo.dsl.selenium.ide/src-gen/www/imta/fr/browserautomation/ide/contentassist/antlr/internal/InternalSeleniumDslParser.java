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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_URL", "RULE_STRING", "RULE_INT", "RULE_DOMAIN", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'checkboxes'", "'combobox'", "'option'", "'link'", "'button'", "'image'", "'url'", "'title'", "'open'", "'a'", "'browser'", "'window'", "'go'", "'to'", "'click'", "'on'", "'the'", "'variable'", "'fill'", "'with'", "'text'", "'field'", "'check'", "','", "'verify'", "'that'", "'page'", "'contains'", "'string'", "'read'", "'of'", "'number'", "'uncheck'", "'all'", "'choose'", "'in'"
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
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int RULE_URL=4;
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

                if ( (LA1_0==21||LA1_0==25||LA1_0==27||LA1_0==31||LA1_0==35||LA1_0==37||LA1_0==42||LA1_0==45||LA1_0==47) ) {
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


    // $ANTLR start "entryRuleGoTo"
    // InternalSeleniumDsl.g:128:1: entryRuleGoTo : ruleGoTo EOF ;
    public final void entryRuleGoTo() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:129:1: ( ruleGoTo EOF )
            // InternalSeleniumDsl.g:130:1: ruleGoTo EOF
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
    // InternalSeleniumDsl.g:137:1: ruleGoTo : ( ( rule__GoTo__Group__0 ) ) ;
    public final void ruleGoTo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:141:2: ( ( ( rule__GoTo__Group__0 ) ) )
            // InternalSeleniumDsl.g:142:2: ( ( rule__GoTo__Group__0 ) )
            {
            // InternalSeleniumDsl.g:142:2: ( ( rule__GoTo__Group__0 ) )
            // InternalSeleniumDsl.g:143:3: ( rule__GoTo__Group__0 )
            {
             before(grammarAccess.getGoToAccess().getGroup()); 
            // InternalSeleniumDsl.g:144:3: ( rule__GoTo__Group__0 )
            // InternalSeleniumDsl.g:144:4: rule__GoTo__Group__0
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
    // InternalSeleniumDsl.g:153:1: entryRuleClick : ruleClick EOF ;
    public final void entryRuleClick() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:154:1: ( ruleClick EOF )
            // InternalSeleniumDsl.g:155:1: ruleClick EOF
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
    // InternalSeleniumDsl.g:162:1: ruleClick : ( ( rule__Click__Group__0 ) ) ;
    public final void ruleClick() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:166:2: ( ( ( rule__Click__Group__0 ) ) )
            // InternalSeleniumDsl.g:167:2: ( ( rule__Click__Group__0 ) )
            {
            // InternalSeleniumDsl.g:167:2: ( ( rule__Click__Group__0 ) )
            // InternalSeleniumDsl.g:168:3: ( rule__Click__Group__0 )
            {
             before(grammarAccess.getClickAccess().getGroup()); 
            // InternalSeleniumDsl.g:169:3: ( rule__Click__Group__0 )
            // InternalSeleniumDsl.g:169:4: rule__Click__Group__0
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


    // $ANTLR start "entryRuleFill"
    // InternalSeleniumDsl.g:178:1: entryRuleFill : ruleFill EOF ;
    public final void entryRuleFill() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:179:1: ( ruleFill EOF )
            // InternalSeleniumDsl.g:180:1: ruleFill EOF
            {
             before(grammarAccess.getFillRule()); 
            pushFollow(FOLLOW_1);
            ruleFill();

            state._fsp--;

             after(grammarAccess.getFillRule()); 
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
    // $ANTLR end "entryRuleFill"


    // $ANTLR start "ruleFill"
    // InternalSeleniumDsl.g:187:1: ruleFill : ( ( rule__Fill__Group__0 ) ) ;
    public final void ruleFill() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:191:2: ( ( ( rule__Fill__Group__0 ) ) )
            // InternalSeleniumDsl.g:192:2: ( ( rule__Fill__Group__0 ) )
            {
            // InternalSeleniumDsl.g:192:2: ( ( rule__Fill__Group__0 ) )
            // InternalSeleniumDsl.g:193:3: ( rule__Fill__Group__0 )
            {
             before(grammarAccess.getFillAccess().getGroup()); 
            // InternalSeleniumDsl.g:194:3: ( rule__Fill__Group__0 )
            // InternalSeleniumDsl.g:194:4: rule__Fill__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Fill__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFillAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFill"


    // $ANTLR start "entryRuleSelector"
    // InternalSeleniumDsl.g:203:1: entryRuleSelector : ruleSelector EOF ;
    public final void entryRuleSelector() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:204:1: ( ruleSelector EOF )
            // InternalSeleniumDsl.g:205:1: ruleSelector EOF
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
    // InternalSeleniumDsl.g:212:1: ruleSelector : ( ( rule__Selector__Group__0 ) ) ;
    public final void ruleSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:216:2: ( ( ( rule__Selector__Group__0 ) ) )
            // InternalSeleniumDsl.g:217:2: ( ( rule__Selector__Group__0 ) )
            {
            // InternalSeleniumDsl.g:217:2: ( ( rule__Selector__Group__0 ) )
            // InternalSeleniumDsl.g:218:3: ( rule__Selector__Group__0 )
            {
             before(grammarAccess.getSelectorAccess().getGroup()); 
            // InternalSeleniumDsl.g:219:3: ( rule__Selector__Group__0 )
            // InternalSeleniumDsl.g:219:4: rule__Selector__Group__0
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


    // $ANTLR start "entryRuleElementType"
    // InternalSeleniumDsl.g:228:1: entryRuleElementType : ruleElementType EOF ;
    public final void entryRuleElementType() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:229:1: ( ruleElementType EOF )
            // InternalSeleniumDsl.g:230:1: ruleElementType EOF
            {
             before(grammarAccess.getElementTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleElementType();

            state._fsp--;

             after(grammarAccess.getElementTypeRule()); 
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
    // $ANTLR end "entryRuleElementType"


    // $ANTLR start "ruleElementType"
    // InternalSeleniumDsl.g:237:1: ruleElementType : ( ( rule__ElementType__Alternatives ) ) ;
    public final void ruleElementType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:241:2: ( ( ( rule__ElementType__Alternatives ) ) )
            // InternalSeleniumDsl.g:242:2: ( ( rule__ElementType__Alternatives ) )
            {
            // InternalSeleniumDsl.g:242:2: ( ( rule__ElementType__Alternatives ) )
            // InternalSeleniumDsl.g:243:3: ( rule__ElementType__Alternatives )
            {
             before(grammarAccess.getElementTypeAccess().getAlternatives()); 
            // InternalSeleniumDsl.g:244:3: ( rule__ElementType__Alternatives )
            // InternalSeleniumDsl.g:244:4: rule__ElementType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ElementType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElementType"


    // $ANTLR start "entryRuleSelect"
    // InternalSeleniumDsl.g:253:1: entryRuleSelect : ruleSelect EOF ;
    public final void entryRuleSelect() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:254:1: ( ruleSelect EOF )
            // InternalSeleniumDsl.g:255:1: ruleSelect EOF
            {
             before(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_1);
            ruleSelect();

            state._fsp--;

             after(grammarAccess.getSelectRule()); 
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
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // InternalSeleniumDsl.g:262:1: ruleSelect : ( ( rule__Select__Group__0 ) ) ;
    public final void ruleSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:266:2: ( ( ( rule__Select__Group__0 ) ) )
            // InternalSeleniumDsl.g:267:2: ( ( rule__Select__Group__0 ) )
            {
            // InternalSeleniumDsl.g:267:2: ( ( rule__Select__Group__0 ) )
            // InternalSeleniumDsl.g:268:3: ( rule__Select__Group__0 )
            {
             before(grammarAccess.getSelectAccess().getGroup()); 
            // InternalSeleniumDsl.g:269:3: ( rule__Select__Group__0 )
            // InternalSeleniumDsl.g:269:4: rule__Select__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleVerify"
    // InternalSeleniumDsl.g:278:1: entryRuleVerify : ruleVerify EOF ;
    public final void entryRuleVerify() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:279:1: ( ruleVerify EOF )
            // InternalSeleniumDsl.g:280:1: ruleVerify EOF
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
    // InternalSeleniumDsl.g:287:1: ruleVerify : ( ( rule__Verify__Group__0 ) ) ;
    public final void ruleVerify() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:291:2: ( ( ( rule__Verify__Group__0 ) ) )
            // InternalSeleniumDsl.g:292:2: ( ( rule__Verify__Group__0 ) )
            {
            // InternalSeleniumDsl.g:292:2: ( ( rule__Verify__Group__0 ) )
            // InternalSeleniumDsl.g:293:3: ( rule__Verify__Group__0 )
            {
             before(grammarAccess.getVerifyAccess().getGroup()); 
            // InternalSeleniumDsl.g:294:3: ( rule__Verify__Group__0 )
            // InternalSeleniumDsl.g:294:4: rule__Verify__Group__0
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


    // $ANTLR start "entryRuleRead"
    // InternalSeleniumDsl.g:303:1: entryRuleRead : ruleRead EOF ;
    public final void entryRuleRead() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:304:1: ( ruleRead EOF )
            // InternalSeleniumDsl.g:305:1: ruleRead EOF
            {
             before(grammarAccess.getReadRule()); 
            pushFollow(FOLLOW_1);
            ruleRead();

            state._fsp--;

             after(grammarAccess.getReadRule()); 
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
    // $ANTLR end "entryRuleRead"


    // $ANTLR start "ruleRead"
    // InternalSeleniumDsl.g:312:1: ruleRead : ( ( rule__Read__Group__0 ) ) ;
    public final void ruleRead() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:316:2: ( ( ( rule__Read__Group__0 ) ) )
            // InternalSeleniumDsl.g:317:2: ( ( rule__Read__Group__0 ) )
            {
            // InternalSeleniumDsl.g:317:2: ( ( rule__Read__Group__0 ) )
            // InternalSeleniumDsl.g:318:3: ( rule__Read__Group__0 )
            {
             before(grammarAccess.getReadAccess().getGroup()); 
            // InternalSeleniumDsl.g:319:3: ( rule__Read__Group__0 )
            // InternalSeleniumDsl.g:319:4: rule__Read__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Read__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReadAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRead"


    // $ANTLR start "entryRuleUncheck"
    // InternalSeleniumDsl.g:328:1: entryRuleUncheck : ruleUncheck EOF ;
    public final void entryRuleUncheck() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:329:1: ( ruleUncheck EOF )
            // InternalSeleniumDsl.g:330:1: ruleUncheck EOF
            {
             before(grammarAccess.getUncheckRule()); 
            pushFollow(FOLLOW_1);
            ruleUncheck();

            state._fsp--;

             after(grammarAccess.getUncheckRule()); 
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
    // $ANTLR end "entryRuleUncheck"


    // $ANTLR start "ruleUncheck"
    // InternalSeleniumDsl.g:337:1: ruleUncheck : ( ( rule__Uncheck__Group__0 ) ) ;
    public final void ruleUncheck() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:341:2: ( ( ( rule__Uncheck__Group__0 ) ) )
            // InternalSeleniumDsl.g:342:2: ( ( rule__Uncheck__Group__0 ) )
            {
            // InternalSeleniumDsl.g:342:2: ( ( rule__Uncheck__Group__0 ) )
            // InternalSeleniumDsl.g:343:3: ( rule__Uncheck__Group__0 )
            {
             before(grammarAccess.getUncheckAccess().getGroup()); 
            // InternalSeleniumDsl.g:344:3: ( rule__Uncheck__Group__0 )
            // InternalSeleniumDsl.g:344:4: rule__Uncheck__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Uncheck__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUncheckAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUncheck"


    // $ANTLR start "entryRuleCombobox"
    // InternalSeleniumDsl.g:353:1: entryRuleCombobox : ruleCombobox EOF ;
    public final void entryRuleCombobox() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:354:1: ( ruleCombobox EOF )
            // InternalSeleniumDsl.g:355:1: ruleCombobox EOF
            {
             before(grammarAccess.getComboboxRule()); 
            pushFollow(FOLLOW_1);
            ruleCombobox();

            state._fsp--;

             after(grammarAccess.getComboboxRule()); 
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
    // $ANTLR end "entryRuleCombobox"


    // $ANTLR start "ruleCombobox"
    // InternalSeleniumDsl.g:362:1: ruleCombobox : ( ( rule__Combobox__Group__0 ) ) ;
    public final void ruleCombobox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:366:2: ( ( ( rule__Combobox__Group__0 ) ) )
            // InternalSeleniumDsl.g:367:2: ( ( rule__Combobox__Group__0 ) )
            {
            // InternalSeleniumDsl.g:367:2: ( ( rule__Combobox__Group__0 ) )
            // InternalSeleniumDsl.g:368:3: ( rule__Combobox__Group__0 )
            {
             before(grammarAccess.getComboboxAccess().getGroup()); 
            // InternalSeleniumDsl.g:369:3: ( rule__Combobox__Group__0 )
            // InternalSeleniumDsl.g:369:4: rule__Combobox__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Combobox__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComboboxAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCombobox"


    // $ANTLR start "entryRuleDynamicURL"
    // InternalSeleniumDsl.g:378:1: entryRuleDynamicURL : ruleDynamicURL EOF ;
    public final void entryRuleDynamicURL() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:379:1: ( ruleDynamicURL EOF )
            // InternalSeleniumDsl.g:380:1: ruleDynamicURL EOF
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
    // InternalSeleniumDsl.g:387:1: ruleDynamicURL : ( ( rule__DynamicURL__Alternatives ) ) ;
    public final void ruleDynamicURL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:391:2: ( ( ( rule__DynamicURL__Alternatives ) ) )
            // InternalSeleniumDsl.g:392:2: ( ( rule__DynamicURL__Alternatives ) )
            {
            // InternalSeleniumDsl.g:392:2: ( ( rule__DynamicURL__Alternatives ) )
            // InternalSeleniumDsl.g:393:3: ( rule__DynamicURL__Alternatives )
            {
             before(grammarAccess.getDynamicURLAccess().getAlternatives()); 
            // InternalSeleniumDsl.g:394:3: ( rule__DynamicURL__Alternatives )
            // InternalSeleniumDsl.g:394:4: rule__DynamicURL__Alternatives
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
    // InternalSeleniumDsl.g:402:1: rule__Command__Alternatives : ( ( ruleOpenBrowser ) | ( ruleGoTo ) | ( ruleClick ) | ( ruleFill ) | ( ruleSelect ) | ( ruleVerify ) | ( ruleRead ) | ( ruleUncheck ) | ( ruleCombobox ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:406:1: ( ( ruleOpenBrowser ) | ( ruleGoTo ) | ( ruleClick ) | ( ruleFill ) | ( ruleSelect ) | ( ruleVerify ) | ( ruleRead ) | ( ruleUncheck ) | ( ruleCombobox ) )
            int alt2=9;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt2=1;
                }
                break;
            case 25:
                {
                alt2=2;
                }
                break;
            case 27:
                {
                alt2=3;
                }
                break;
            case 31:
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
                    // InternalSeleniumDsl.g:407:2: ( ruleOpenBrowser )
                    {
                    // InternalSeleniumDsl.g:407:2: ( ruleOpenBrowser )
                    // InternalSeleniumDsl.g:408:3: ruleOpenBrowser
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
                    // InternalSeleniumDsl.g:413:2: ( ruleGoTo )
                    {
                    // InternalSeleniumDsl.g:413:2: ( ruleGoTo )
                    // InternalSeleniumDsl.g:414:3: ruleGoTo
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
                    // InternalSeleniumDsl.g:419:2: ( ruleClick )
                    {
                    // InternalSeleniumDsl.g:419:2: ( ruleClick )
                    // InternalSeleniumDsl.g:420:3: ruleClick
                    {
                     before(grammarAccess.getCommandAccess().getClickParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleClick();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getClickParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSeleniumDsl.g:425:2: ( ruleFill )
                    {
                    // InternalSeleniumDsl.g:425:2: ( ruleFill )
                    // InternalSeleniumDsl.g:426:3: ruleFill
                    {
                     before(grammarAccess.getCommandAccess().getFillParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleFill();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getFillParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSeleniumDsl.g:431:2: ( ruleSelect )
                    {
                    // InternalSeleniumDsl.g:431:2: ( ruleSelect )
                    // InternalSeleniumDsl.g:432:3: ruleSelect
                    {
                     before(grammarAccess.getCommandAccess().getSelectParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleSelect();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getSelectParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSeleniumDsl.g:437:2: ( ruleVerify )
                    {
                    // InternalSeleniumDsl.g:437:2: ( ruleVerify )
                    // InternalSeleniumDsl.g:438:3: ruleVerify
                    {
                     before(grammarAccess.getCommandAccess().getVerifyParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleVerify();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getVerifyParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSeleniumDsl.g:443:2: ( ruleRead )
                    {
                    // InternalSeleniumDsl.g:443:2: ( ruleRead )
                    // InternalSeleniumDsl.g:444:3: ruleRead
                    {
                     before(grammarAccess.getCommandAccess().getReadParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleRead();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getReadParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSeleniumDsl.g:449:2: ( ruleUncheck )
                    {
                    // InternalSeleniumDsl.g:449:2: ( ruleUncheck )
                    // InternalSeleniumDsl.g:450:3: ruleUncheck
                    {
                     before(grammarAccess.getCommandAccess().getUncheckParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleUncheck();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getUncheckParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSeleniumDsl.g:455:2: ( ruleCombobox )
                    {
                    // InternalSeleniumDsl.g:455:2: ( ruleCombobox )
                    // InternalSeleniumDsl.g:456:3: ruleCombobox
                    {
                     before(grammarAccess.getCommandAccess().getComboboxParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleCombobox();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getComboboxParserRuleCall_8()); 

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


    // $ANTLR start "rule__Click__Alternatives_4"
    // InternalSeleniumDsl.g:465:1: rule__Click__Alternatives_4 : ( ( ( rule__Click__Group_4_0__0 ) ) | ( ( rule__Click__Group_4_1__0 ) ) | ( ( rule__Click__Group_4_2__0 ) ) | ( ( rule__Click__Group_4_3__0 ) ) );
    public final void rule__Click__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:469:1: ( ( ( rule__Click__Group_4_0__0 ) ) | ( ( rule__Click__Group_4_1__0 ) ) | ( ( rule__Click__Group_4_2__0 ) ) | ( ( rule__Click__Group_4_3__0 ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            case 30:
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
                    // InternalSeleniumDsl.g:470:2: ( ( rule__Click__Group_4_0__0 ) )
                    {
                    // InternalSeleniumDsl.g:470:2: ( ( rule__Click__Group_4_0__0 ) )
                    // InternalSeleniumDsl.g:471:3: ( rule__Click__Group_4_0__0 )
                    {
                     before(grammarAccess.getClickAccess().getGroup_4_0()); 
                    // InternalSeleniumDsl.g:472:3: ( rule__Click__Group_4_0__0 )
                    // InternalSeleniumDsl.g:472:4: rule__Click__Group_4_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Click__Group_4_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClickAccess().getGroup_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDsl.g:476:2: ( ( rule__Click__Group_4_1__0 ) )
                    {
                    // InternalSeleniumDsl.g:476:2: ( ( rule__Click__Group_4_1__0 ) )
                    // InternalSeleniumDsl.g:477:3: ( rule__Click__Group_4_1__0 )
                    {
                     before(grammarAccess.getClickAccess().getGroup_4_1()); 
                    // InternalSeleniumDsl.g:478:3: ( rule__Click__Group_4_1__0 )
                    // InternalSeleniumDsl.g:478:4: rule__Click__Group_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Click__Group_4_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClickAccess().getGroup_4_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSeleniumDsl.g:482:2: ( ( rule__Click__Group_4_2__0 ) )
                    {
                    // InternalSeleniumDsl.g:482:2: ( ( rule__Click__Group_4_2__0 ) )
                    // InternalSeleniumDsl.g:483:3: ( rule__Click__Group_4_2__0 )
                    {
                     before(grammarAccess.getClickAccess().getGroup_4_2()); 
                    // InternalSeleniumDsl.g:484:3: ( rule__Click__Group_4_2__0 )
                    // InternalSeleniumDsl.g:484:4: rule__Click__Group_4_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Click__Group_4_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClickAccess().getGroup_4_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSeleniumDsl.g:488:2: ( ( rule__Click__Group_4_3__0 ) )
                    {
                    // InternalSeleniumDsl.g:488:2: ( ( rule__Click__Group_4_3__0 ) )
                    // InternalSeleniumDsl.g:489:3: ( rule__Click__Group_4_3__0 )
                    {
                     before(grammarAccess.getClickAccess().getGroup_4_3()); 
                    // InternalSeleniumDsl.g:490:3: ( rule__Click__Group_4_3__0 )
                    // InternalSeleniumDsl.g:490:4: rule__Click__Group_4_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Click__Group_4_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClickAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__Click__Alternatives_4"


    // $ANTLR start "rule__Fill__Alternatives_5"
    // InternalSeleniumDsl.g:498:1: rule__Fill__Alternatives_5 : ( ( ( rule__Fill__Group_5_0__0 ) ) | ( ( rule__Fill__Group_5_1__0 ) ) );
    public final void rule__Fill__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:502:1: ( ( ( rule__Fill__Group_5_0__0 ) ) | ( ( rule__Fill__Group_5_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==33) ) {
                alt4=1;
            }
            else if ( (LA4_0==30) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSeleniumDsl.g:503:2: ( ( rule__Fill__Group_5_0__0 ) )
                    {
                    // InternalSeleniumDsl.g:503:2: ( ( rule__Fill__Group_5_0__0 ) )
                    // InternalSeleniumDsl.g:504:3: ( rule__Fill__Group_5_0__0 )
                    {
                     before(grammarAccess.getFillAccess().getGroup_5_0()); 
                    // InternalSeleniumDsl.g:505:3: ( rule__Fill__Group_5_0__0 )
                    // InternalSeleniumDsl.g:505:4: rule__Fill__Group_5_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Fill__Group_5_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFillAccess().getGroup_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDsl.g:509:2: ( ( rule__Fill__Group_5_1__0 ) )
                    {
                    // InternalSeleniumDsl.g:509:2: ( ( rule__Fill__Group_5_1__0 ) )
                    // InternalSeleniumDsl.g:510:3: ( rule__Fill__Group_5_1__0 )
                    {
                     before(grammarAccess.getFillAccess().getGroup_5_1()); 
                    // InternalSeleniumDsl.g:511:3: ( rule__Fill__Group_5_1__0 )
                    // InternalSeleniumDsl.g:511:4: rule__Fill__Group_5_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Fill__Group_5_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFillAccess().getGroup_5_1()); 

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
    // $ANTLR end "rule__Fill__Alternatives_5"


    // $ANTLR start "rule__ElementType__Alternatives"
    // InternalSeleniumDsl.g:519:1: rule__ElementType__Alternatives : ( ( ( rule__ElementType__Group_0__0 ) ) | ( 'checkboxes' ) | ( 'combobox' ) | ( 'option' ) | ( 'link' ) | ( 'button' ) | ( 'image' ) | ( 'url' ) | ( ( rule__ElementType__Group_8__0 ) ) | ( 'title' ) );
    public final void rule__ElementType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:523:1: ( ( ( rule__ElementType__Group_0__0 ) ) | ( 'checkboxes' ) | ( 'combobox' ) | ( 'option' ) | ( 'link' ) | ( 'button' ) | ( 'image' ) | ( 'url' ) | ( ( rule__ElementType__Group_8__0 ) ) | ( 'title' ) )
            int alt5=10;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalSeleniumDsl.g:524:2: ( ( rule__ElementType__Group_0__0 ) )
                    {
                    // InternalSeleniumDsl.g:524:2: ( ( rule__ElementType__Group_0__0 ) )
                    // InternalSeleniumDsl.g:525:3: ( rule__ElementType__Group_0__0 )
                    {
                     before(grammarAccess.getElementTypeAccess().getGroup_0()); 
                    // InternalSeleniumDsl.g:526:3: ( rule__ElementType__Group_0__0 )
                    // InternalSeleniumDsl.g:526:4: rule__ElementType__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ElementType__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getElementTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDsl.g:530:2: ( 'checkboxes' )
                    {
                    // InternalSeleniumDsl.g:530:2: ( 'checkboxes' )
                    // InternalSeleniumDsl.g:531:3: 'checkboxes'
                    {
                     before(grammarAccess.getElementTypeAccess().getCheckboxesKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getElementTypeAccess().getCheckboxesKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSeleniumDsl.g:536:2: ( 'combobox' )
                    {
                    // InternalSeleniumDsl.g:536:2: ( 'combobox' )
                    // InternalSeleniumDsl.g:537:3: 'combobox'
                    {
                     before(grammarAccess.getElementTypeAccess().getComboboxKeyword_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getElementTypeAccess().getComboboxKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSeleniumDsl.g:542:2: ( 'option' )
                    {
                    // InternalSeleniumDsl.g:542:2: ( 'option' )
                    // InternalSeleniumDsl.g:543:3: 'option'
                    {
                     before(grammarAccess.getElementTypeAccess().getOptionKeyword_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getElementTypeAccess().getOptionKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSeleniumDsl.g:548:2: ( 'link' )
                    {
                    // InternalSeleniumDsl.g:548:2: ( 'link' )
                    // InternalSeleniumDsl.g:549:3: 'link'
                    {
                     before(grammarAccess.getElementTypeAccess().getLinkKeyword_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getElementTypeAccess().getLinkKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSeleniumDsl.g:554:2: ( 'button' )
                    {
                    // InternalSeleniumDsl.g:554:2: ( 'button' )
                    // InternalSeleniumDsl.g:555:3: 'button'
                    {
                     before(grammarAccess.getElementTypeAccess().getButtonKeyword_5()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getElementTypeAccess().getButtonKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSeleniumDsl.g:560:2: ( 'image' )
                    {
                    // InternalSeleniumDsl.g:560:2: ( 'image' )
                    // InternalSeleniumDsl.g:561:3: 'image'
                    {
                     before(grammarAccess.getElementTypeAccess().getImageKeyword_6()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getElementTypeAccess().getImageKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSeleniumDsl.g:566:2: ( 'url' )
                    {
                    // InternalSeleniumDsl.g:566:2: ( 'url' )
                    // InternalSeleniumDsl.g:567:3: 'url'
                    {
                     before(grammarAccess.getElementTypeAccess().getUrlKeyword_7()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getElementTypeAccess().getUrlKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSeleniumDsl.g:572:2: ( ( rule__ElementType__Group_8__0 ) )
                    {
                    // InternalSeleniumDsl.g:572:2: ( ( rule__ElementType__Group_8__0 ) )
                    // InternalSeleniumDsl.g:573:3: ( rule__ElementType__Group_8__0 )
                    {
                     before(grammarAccess.getElementTypeAccess().getGroup_8()); 
                    // InternalSeleniumDsl.g:574:3: ( rule__ElementType__Group_8__0 )
                    // InternalSeleniumDsl.g:574:4: rule__ElementType__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ElementType__Group_8__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getElementTypeAccess().getGroup_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalSeleniumDsl.g:578:2: ( 'title' )
                    {
                    // InternalSeleniumDsl.g:578:2: ( 'title' )
                    // InternalSeleniumDsl.g:579:3: 'title'
                    {
                     before(grammarAccess.getElementTypeAccess().getTitleKeyword_9()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getElementTypeAccess().getTitleKeyword_9()); 

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
    // $ANTLR end "rule__ElementType__Alternatives"


    // $ANTLR start "rule__Verify__Alternatives_6"
    // InternalSeleniumDsl.g:588:1: rule__Verify__Alternatives_6 : ( ( ( rule__Verify__Group_6_0__0 ) ) | ( ( rule__Verify__Group_6_1__0 ) ) | ( ( rule__Verify__Group_6_2__0 ) ) );
    public final void rule__Verify__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:592:1: ( ( ( rule__Verify__Group_6_0__0 ) ) | ( ( rule__Verify__Group_6_1__0 ) ) | ( ( rule__Verify__Group_6_2__0 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt6=1;
                }
                break;
            case 16:
                {
                alt6=2;
                }
                break;
            case 30:
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
                    // InternalSeleniumDsl.g:593:2: ( ( rule__Verify__Group_6_0__0 ) )
                    {
                    // InternalSeleniumDsl.g:593:2: ( ( rule__Verify__Group_6_0__0 ) )
                    // InternalSeleniumDsl.g:594:3: ( rule__Verify__Group_6_0__0 )
                    {
                     before(grammarAccess.getVerifyAccess().getGroup_6_0()); 
                    // InternalSeleniumDsl.g:595:3: ( rule__Verify__Group_6_0__0 )
                    // InternalSeleniumDsl.g:595:4: rule__Verify__Group_6_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Verify__Group_6_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVerifyAccess().getGroup_6_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDsl.g:599:2: ( ( rule__Verify__Group_6_1__0 ) )
                    {
                    // InternalSeleniumDsl.g:599:2: ( ( rule__Verify__Group_6_1__0 ) )
                    // InternalSeleniumDsl.g:600:3: ( rule__Verify__Group_6_1__0 )
                    {
                     before(grammarAccess.getVerifyAccess().getGroup_6_1()); 
                    // InternalSeleniumDsl.g:601:3: ( rule__Verify__Group_6_1__0 )
                    // InternalSeleniumDsl.g:601:4: rule__Verify__Group_6_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Verify__Group_6_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVerifyAccess().getGroup_6_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSeleniumDsl.g:605:2: ( ( rule__Verify__Group_6_2__0 ) )
                    {
                    // InternalSeleniumDsl.g:605:2: ( ( rule__Verify__Group_6_2__0 ) )
                    // InternalSeleniumDsl.g:606:3: ( rule__Verify__Group_6_2__0 )
                    {
                     before(grammarAccess.getVerifyAccess().getGroup_6_2()); 
                    // InternalSeleniumDsl.g:607:3: ( rule__Verify__Group_6_2__0 )
                    // InternalSeleniumDsl.g:607:4: rule__Verify__Group_6_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Verify__Group_6_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVerifyAccess().getGroup_6_2()); 

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
    // $ANTLR end "rule__Verify__Alternatives_6"


    // $ANTLR start "rule__DynamicURL__Alternatives"
    // InternalSeleniumDsl.g:615:1: rule__DynamicURL__Alternatives : ( ( RULE_URL ) | ( RULE_STRING ) );
    public final void rule__DynamicURL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:619:1: ( ( RULE_URL ) | ( RULE_STRING ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_URL) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_STRING) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSeleniumDsl.g:620:2: ( RULE_URL )
                    {
                    // InternalSeleniumDsl.g:620:2: ( RULE_URL )
                    // InternalSeleniumDsl.g:621:3: RULE_URL
                    {
                     before(grammarAccess.getDynamicURLAccess().getURLTerminalRuleCall_0()); 
                    match(input,RULE_URL,FOLLOW_2); 
                     after(grammarAccess.getDynamicURLAccess().getURLTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDsl.g:626:2: ( RULE_STRING )
                    {
                    // InternalSeleniumDsl.g:626:2: ( RULE_STRING )
                    // InternalSeleniumDsl.g:627:3: RULE_STRING
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
    // InternalSeleniumDsl.g:636:1: rule__OpenBrowser__Group__0 : rule__OpenBrowser__Group__0__Impl rule__OpenBrowser__Group__1 ;
    public final void rule__OpenBrowser__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:640:1: ( rule__OpenBrowser__Group__0__Impl rule__OpenBrowser__Group__1 )
            // InternalSeleniumDsl.g:641:2: rule__OpenBrowser__Group__0__Impl rule__OpenBrowser__Group__1
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
    // InternalSeleniumDsl.g:648:1: rule__OpenBrowser__Group__0__Impl : ( () ) ;
    public final void rule__OpenBrowser__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:652:1: ( ( () ) )
            // InternalSeleniumDsl.g:653:1: ( () )
            {
            // InternalSeleniumDsl.g:653:1: ( () )
            // InternalSeleniumDsl.g:654:2: ()
            {
             before(grammarAccess.getOpenBrowserAccess().getOpenBrowserAction_0()); 
            // InternalSeleniumDsl.g:655:2: ()
            // InternalSeleniumDsl.g:655:3: 
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
    // InternalSeleniumDsl.g:663:1: rule__OpenBrowser__Group__1 : rule__OpenBrowser__Group__1__Impl rule__OpenBrowser__Group__2 ;
    public final void rule__OpenBrowser__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:667:1: ( rule__OpenBrowser__Group__1__Impl rule__OpenBrowser__Group__2 )
            // InternalSeleniumDsl.g:668:2: rule__OpenBrowser__Group__1__Impl rule__OpenBrowser__Group__2
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
    // InternalSeleniumDsl.g:675:1: rule__OpenBrowser__Group__1__Impl : ( 'open' ) ;
    public final void rule__OpenBrowser__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:679:1: ( ( 'open' ) )
            // InternalSeleniumDsl.g:680:1: ( 'open' )
            {
            // InternalSeleniumDsl.g:680:1: ( 'open' )
            // InternalSeleniumDsl.g:681:2: 'open'
            {
             before(grammarAccess.getOpenBrowserAccess().getOpenKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:690:1: rule__OpenBrowser__Group__2 : rule__OpenBrowser__Group__2__Impl rule__OpenBrowser__Group__3 ;
    public final void rule__OpenBrowser__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:694:1: ( rule__OpenBrowser__Group__2__Impl rule__OpenBrowser__Group__3 )
            // InternalSeleniumDsl.g:695:2: rule__OpenBrowser__Group__2__Impl rule__OpenBrowser__Group__3
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
    // InternalSeleniumDsl.g:702:1: rule__OpenBrowser__Group__2__Impl : ( 'a' ) ;
    public final void rule__OpenBrowser__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:706:1: ( ( 'a' ) )
            // InternalSeleniumDsl.g:707:1: ( 'a' )
            {
            // InternalSeleniumDsl.g:707:1: ( 'a' )
            // InternalSeleniumDsl.g:708:2: 'a'
            {
             before(grammarAccess.getOpenBrowserAccess().getAKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:717:1: rule__OpenBrowser__Group__3 : rule__OpenBrowser__Group__3__Impl rule__OpenBrowser__Group__4 ;
    public final void rule__OpenBrowser__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:721:1: ( rule__OpenBrowser__Group__3__Impl rule__OpenBrowser__Group__4 )
            // InternalSeleniumDsl.g:722:2: rule__OpenBrowser__Group__3__Impl rule__OpenBrowser__Group__4
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
    // InternalSeleniumDsl.g:729:1: rule__OpenBrowser__Group__3__Impl : ( 'browser' ) ;
    public final void rule__OpenBrowser__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:733:1: ( ( 'browser' ) )
            // InternalSeleniumDsl.g:734:1: ( 'browser' )
            {
            // InternalSeleniumDsl.g:734:1: ( 'browser' )
            // InternalSeleniumDsl.g:735:2: 'browser'
            {
             before(grammarAccess.getOpenBrowserAccess().getBrowserKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:744:1: rule__OpenBrowser__Group__4 : rule__OpenBrowser__Group__4__Impl ;
    public final void rule__OpenBrowser__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:748:1: ( rule__OpenBrowser__Group__4__Impl )
            // InternalSeleniumDsl.g:749:2: rule__OpenBrowser__Group__4__Impl
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
    // InternalSeleniumDsl.g:755:1: rule__OpenBrowser__Group__4__Impl : ( 'window' ) ;
    public final void rule__OpenBrowser__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:759:1: ( ( 'window' ) )
            // InternalSeleniumDsl.g:760:1: ( 'window' )
            {
            // InternalSeleniumDsl.g:760:1: ( 'window' )
            // InternalSeleniumDsl.g:761:2: 'window'
            {
             before(grammarAccess.getOpenBrowserAccess().getWindowKeyword_4()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:771:1: rule__GoTo__Group__0 : rule__GoTo__Group__0__Impl rule__GoTo__Group__1 ;
    public final void rule__GoTo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:775:1: ( rule__GoTo__Group__0__Impl rule__GoTo__Group__1 )
            // InternalSeleniumDsl.g:776:2: rule__GoTo__Group__0__Impl rule__GoTo__Group__1
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
    // InternalSeleniumDsl.g:783:1: rule__GoTo__Group__0__Impl : ( 'go' ) ;
    public final void rule__GoTo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:787:1: ( ( 'go' ) )
            // InternalSeleniumDsl.g:788:1: ( 'go' )
            {
            // InternalSeleniumDsl.g:788:1: ( 'go' )
            // InternalSeleniumDsl.g:789:2: 'go'
            {
             before(grammarAccess.getGoToAccess().getGoKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:798:1: rule__GoTo__Group__1 : rule__GoTo__Group__1__Impl rule__GoTo__Group__2 ;
    public final void rule__GoTo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:802:1: ( rule__GoTo__Group__1__Impl rule__GoTo__Group__2 )
            // InternalSeleniumDsl.g:803:2: rule__GoTo__Group__1__Impl rule__GoTo__Group__2
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
    // InternalSeleniumDsl.g:810:1: rule__GoTo__Group__1__Impl : ( 'to' ) ;
    public final void rule__GoTo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:814:1: ( ( 'to' ) )
            // InternalSeleniumDsl.g:815:1: ( 'to' )
            {
            // InternalSeleniumDsl.g:815:1: ( 'to' )
            // InternalSeleniumDsl.g:816:2: 'to'
            {
             before(grammarAccess.getGoToAccess().getToKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:825:1: rule__GoTo__Group__2 : rule__GoTo__Group__2__Impl rule__GoTo__Group__3 ;
    public final void rule__GoTo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:829:1: ( rule__GoTo__Group__2__Impl rule__GoTo__Group__3 )
            // InternalSeleniumDsl.g:830:2: rule__GoTo__Group__2__Impl rule__GoTo__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__GoTo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoTo__Group__3();

            state._fsp--;


            }

        }
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
    // InternalSeleniumDsl.g:837:1: rule__GoTo__Group__2__Impl : ( 'url' ) ;
    public final void rule__GoTo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:841:1: ( ( 'url' ) )
            // InternalSeleniumDsl.g:842:1: ( 'url' )
            {
            // InternalSeleniumDsl.g:842:1: ( 'url' )
            // InternalSeleniumDsl.g:843:2: 'url'
            {
             before(grammarAccess.getGoToAccess().getUrlKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getGoToAccess().getUrlKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__GoTo__Group__3"
    // InternalSeleniumDsl.g:852:1: rule__GoTo__Group__3 : rule__GoTo__Group__3__Impl ;
    public final void rule__GoTo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:856:1: ( rule__GoTo__Group__3__Impl )
            // InternalSeleniumDsl.g:857:2: rule__GoTo__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GoTo__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__3"


    // $ANTLR start "rule__GoTo__Group__3__Impl"
    // InternalSeleniumDsl.g:863:1: rule__GoTo__Group__3__Impl : ( ( rule__GoTo__UrlAssignment_3 ) ) ;
    public final void rule__GoTo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:867:1: ( ( ( rule__GoTo__UrlAssignment_3 ) ) )
            // InternalSeleniumDsl.g:868:1: ( ( rule__GoTo__UrlAssignment_3 ) )
            {
            // InternalSeleniumDsl.g:868:1: ( ( rule__GoTo__UrlAssignment_3 ) )
            // InternalSeleniumDsl.g:869:2: ( rule__GoTo__UrlAssignment_3 )
            {
             before(grammarAccess.getGoToAccess().getUrlAssignment_3()); 
            // InternalSeleniumDsl.g:870:2: ( rule__GoTo__UrlAssignment_3 )
            // InternalSeleniumDsl.g:870:3: rule__GoTo__UrlAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__GoTo__UrlAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGoToAccess().getUrlAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__3__Impl"


    // $ANTLR start "rule__Click__Group__0"
    // InternalSeleniumDsl.g:879:1: rule__Click__Group__0 : rule__Click__Group__0__Impl rule__Click__Group__1 ;
    public final void rule__Click__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:883:1: ( rule__Click__Group__0__Impl rule__Click__Group__1 )
            // InternalSeleniumDsl.g:884:2: rule__Click__Group__0__Impl rule__Click__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalSeleniumDsl.g:891:1: rule__Click__Group__0__Impl : ( () ) ;
    public final void rule__Click__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:895:1: ( ( () ) )
            // InternalSeleniumDsl.g:896:1: ( () )
            {
            // InternalSeleniumDsl.g:896:1: ( () )
            // InternalSeleniumDsl.g:897:2: ()
            {
             before(grammarAccess.getClickAccess().getClickAction_0()); 
            // InternalSeleniumDsl.g:898:2: ()
            // InternalSeleniumDsl.g:898:3: 
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
    // InternalSeleniumDsl.g:906:1: rule__Click__Group__1 : rule__Click__Group__1__Impl rule__Click__Group__2 ;
    public final void rule__Click__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:910:1: ( rule__Click__Group__1__Impl rule__Click__Group__2 )
            // InternalSeleniumDsl.g:911:2: rule__Click__Group__1__Impl rule__Click__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalSeleniumDsl.g:918:1: rule__Click__Group__1__Impl : ( 'click' ) ;
    public final void rule__Click__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:922:1: ( ( 'click' ) )
            // InternalSeleniumDsl.g:923:1: ( 'click' )
            {
            // InternalSeleniumDsl.g:923:1: ( 'click' )
            // InternalSeleniumDsl.g:924:2: 'click'
            {
             before(grammarAccess.getClickAccess().getClickKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getClickAccess().getClickKeyword_1()); 

            }


            }

        }
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
    // InternalSeleniumDsl.g:933:1: rule__Click__Group__2 : rule__Click__Group__2__Impl rule__Click__Group__3 ;
    public final void rule__Click__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:937:1: ( rule__Click__Group__2__Impl rule__Click__Group__3 )
            // InternalSeleniumDsl.g:938:2: rule__Click__Group__2__Impl rule__Click__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Click__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Click__Group__3();

            state._fsp--;


            }

        }
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
    // InternalSeleniumDsl.g:945:1: rule__Click__Group__2__Impl : ( 'on' ) ;
    public final void rule__Click__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:949:1: ( ( 'on' ) )
            // InternalSeleniumDsl.g:950:1: ( 'on' )
            {
            // InternalSeleniumDsl.g:950:1: ( 'on' )
            // InternalSeleniumDsl.g:951:2: 'on'
            {
             before(grammarAccess.getClickAccess().getOnKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getClickAccess().getOnKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Click__Group__3"
    // InternalSeleniumDsl.g:960:1: rule__Click__Group__3 : rule__Click__Group__3__Impl rule__Click__Group__4 ;
    public final void rule__Click__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:964:1: ( rule__Click__Group__3__Impl rule__Click__Group__4 )
            // InternalSeleniumDsl.g:965:2: rule__Click__Group__3__Impl rule__Click__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Click__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Click__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__3"


    // $ANTLR start "rule__Click__Group__3__Impl"
    // InternalSeleniumDsl.g:972:1: rule__Click__Group__3__Impl : ( 'the' ) ;
    public final void rule__Click__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:976:1: ( ( 'the' ) )
            // InternalSeleniumDsl.g:977:1: ( 'the' )
            {
            // InternalSeleniumDsl.g:977:1: ( 'the' )
            // InternalSeleniumDsl.g:978:2: 'the'
            {
             before(grammarAccess.getClickAccess().getTheKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getClickAccess().getTheKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__3__Impl"


    // $ANTLR start "rule__Click__Group__4"
    // InternalSeleniumDsl.g:987:1: rule__Click__Group__4 : rule__Click__Group__4__Impl ;
    public final void rule__Click__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:991:1: ( rule__Click__Group__4__Impl )
            // InternalSeleniumDsl.g:992:2: rule__Click__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Click__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__4"


    // $ANTLR start "rule__Click__Group__4__Impl"
    // InternalSeleniumDsl.g:998:1: rule__Click__Group__4__Impl : ( ( rule__Click__Alternatives_4 ) ) ;
    public final void rule__Click__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1002:1: ( ( ( rule__Click__Alternatives_4 ) ) )
            // InternalSeleniumDsl.g:1003:1: ( ( rule__Click__Alternatives_4 ) )
            {
            // InternalSeleniumDsl.g:1003:1: ( ( rule__Click__Alternatives_4 ) )
            // InternalSeleniumDsl.g:1004:2: ( rule__Click__Alternatives_4 )
            {
             before(grammarAccess.getClickAccess().getAlternatives_4()); 
            // InternalSeleniumDsl.g:1005:2: ( rule__Click__Alternatives_4 )
            // InternalSeleniumDsl.g:1005:3: rule__Click__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__Click__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getClickAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__4__Impl"


    // $ANTLR start "rule__Click__Group_4_0__0"
    // InternalSeleniumDsl.g:1014:1: rule__Click__Group_4_0__0 : rule__Click__Group_4_0__0__Impl rule__Click__Group_4_0__1 ;
    public final void rule__Click__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1018:1: ( rule__Click__Group_4_0__0__Impl rule__Click__Group_4_0__1 )
            // InternalSeleniumDsl.g:1019:2: rule__Click__Group_4_0__0__Impl rule__Click__Group_4_0__1
            {
            pushFollow(FOLLOW_15);
            rule__Click__Group_4_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Click__Group_4_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group_4_0__0"


    // $ANTLR start "rule__Click__Group_4_0__0__Impl"
    // InternalSeleniumDsl.g:1026:1: rule__Click__Group_4_0__0__Impl : ( 'link' ) ;
    public final void rule__Click__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1030:1: ( ( 'link' ) )
            // InternalSeleniumDsl.g:1031:1: ( 'link' )
            {
            // InternalSeleniumDsl.g:1031:1: ( 'link' )
            // InternalSeleniumDsl.g:1032:2: 'link'
            {
             before(grammarAccess.getClickAccess().getLinkKeyword_4_0_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getClickAccess().getLinkKeyword_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group_4_0__0__Impl"


    // $ANTLR start "rule__Click__Group_4_0__1"
    // InternalSeleniumDsl.g:1041:1: rule__Click__Group_4_0__1 : rule__Click__Group_4_0__1__Impl ;
    public final void rule__Click__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1045:1: ( rule__Click__Group_4_0__1__Impl )
            // InternalSeleniumDsl.g:1046:2: rule__Click__Group_4_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Click__Group_4_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group_4_0__1"


    // $ANTLR start "rule__Click__Group_4_0__1__Impl"
    // InternalSeleniumDsl.g:1052:1: rule__Click__Group_4_0__1__Impl : ( ( rule__Click__LinkTextAssignment_4_0_1 ) ) ;
    public final void rule__Click__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1056:1: ( ( ( rule__Click__LinkTextAssignment_4_0_1 ) ) )
            // InternalSeleniumDsl.g:1057:1: ( ( rule__Click__LinkTextAssignment_4_0_1 ) )
            {
            // InternalSeleniumDsl.g:1057:1: ( ( rule__Click__LinkTextAssignment_4_0_1 ) )
            // InternalSeleniumDsl.g:1058:2: ( rule__Click__LinkTextAssignment_4_0_1 )
            {
             before(grammarAccess.getClickAccess().getLinkTextAssignment_4_0_1()); 
            // InternalSeleniumDsl.g:1059:2: ( rule__Click__LinkTextAssignment_4_0_1 )
            // InternalSeleniumDsl.g:1059:3: rule__Click__LinkTextAssignment_4_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Click__LinkTextAssignment_4_0_1();

            state._fsp--;


            }

             after(grammarAccess.getClickAccess().getLinkTextAssignment_4_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group_4_0__1__Impl"


    // $ANTLR start "rule__Click__Group_4_1__0"
    // InternalSeleniumDsl.g:1068:1: rule__Click__Group_4_1__0 : rule__Click__Group_4_1__0__Impl rule__Click__Group_4_1__1 ;
    public final void rule__Click__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1072:1: ( rule__Click__Group_4_1__0__Impl rule__Click__Group_4_1__1 )
            // InternalSeleniumDsl.g:1073:2: rule__Click__Group_4_1__0__Impl rule__Click__Group_4_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Click__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Click__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group_4_1__0"


    // $ANTLR start "rule__Click__Group_4_1__0__Impl"
    // InternalSeleniumDsl.g:1080:1: rule__Click__Group_4_1__0__Impl : ( 'button' ) ;
    public final void rule__Click__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1084:1: ( ( 'button' ) )
            // InternalSeleniumDsl.g:1085:1: ( 'button' )
            {
            // InternalSeleniumDsl.g:1085:1: ( 'button' )
            // InternalSeleniumDsl.g:1086:2: 'button'
            {
             before(grammarAccess.getClickAccess().getButtonKeyword_4_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getClickAccess().getButtonKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group_4_1__0__Impl"


    // $ANTLR start "rule__Click__Group_4_1__1"
    // InternalSeleniumDsl.g:1095:1: rule__Click__Group_4_1__1 : rule__Click__Group_4_1__1__Impl ;
    public final void rule__Click__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1099:1: ( rule__Click__Group_4_1__1__Impl )
            // InternalSeleniumDsl.g:1100:2: rule__Click__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Click__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group_4_1__1"


    // $ANTLR start "rule__Click__Group_4_1__1__Impl"
    // InternalSeleniumDsl.g:1106:1: rule__Click__Group_4_1__1__Impl : ( ( rule__Click__ButtonTextAssignment_4_1_1 ) ) ;
    public final void rule__Click__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1110:1: ( ( ( rule__Click__ButtonTextAssignment_4_1_1 ) ) )
            // InternalSeleniumDsl.g:1111:1: ( ( rule__Click__ButtonTextAssignment_4_1_1 ) )
            {
            // InternalSeleniumDsl.g:1111:1: ( ( rule__Click__ButtonTextAssignment_4_1_1 ) )
            // InternalSeleniumDsl.g:1112:2: ( rule__Click__ButtonTextAssignment_4_1_1 )
            {
             before(grammarAccess.getClickAccess().getButtonTextAssignment_4_1_1()); 
            // InternalSeleniumDsl.g:1113:2: ( rule__Click__ButtonTextAssignment_4_1_1 )
            // InternalSeleniumDsl.g:1113:3: rule__Click__ButtonTextAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Click__ButtonTextAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getClickAccess().getButtonTextAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group_4_1__1__Impl"


    // $ANTLR start "rule__Click__Group_4_2__0"
    // InternalSeleniumDsl.g:1122:1: rule__Click__Group_4_2__0 : rule__Click__Group_4_2__0__Impl rule__Click__Group_4_2__1 ;
    public final void rule__Click__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1126:1: ( rule__Click__Group_4_2__0__Impl rule__Click__Group_4_2__1 )
            // InternalSeleniumDsl.g:1127:2: rule__Click__Group_4_2__0__Impl rule__Click__Group_4_2__1
            {
            pushFollow(FOLLOW_15);
            rule__Click__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Click__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group_4_2__0"


    // $ANTLR start "rule__Click__Group_4_2__0__Impl"
    // InternalSeleniumDsl.g:1134:1: rule__Click__Group_4_2__0__Impl : ( 'image' ) ;
    public final void rule__Click__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1138:1: ( ( 'image' ) )
            // InternalSeleniumDsl.g:1139:1: ( 'image' )
            {
            // InternalSeleniumDsl.g:1139:1: ( 'image' )
            // InternalSeleniumDsl.g:1140:2: 'image'
            {
             before(grammarAccess.getClickAccess().getImageKeyword_4_2_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getClickAccess().getImageKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group_4_2__0__Impl"


    // $ANTLR start "rule__Click__Group_4_2__1"
    // InternalSeleniumDsl.g:1149:1: rule__Click__Group_4_2__1 : rule__Click__Group_4_2__1__Impl ;
    public final void rule__Click__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1153:1: ( rule__Click__Group_4_2__1__Impl )
            // InternalSeleniumDsl.g:1154:2: rule__Click__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Click__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group_4_2__1"


    // $ANTLR start "rule__Click__Group_4_2__1__Impl"
    // InternalSeleniumDsl.g:1160:1: rule__Click__Group_4_2__1__Impl : ( ( rule__Click__AltAssignment_4_2_1 ) ) ;
    public final void rule__Click__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1164:1: ( ( ( rule__Click__AltAssignment_4_2_1 ) ) )
            // InternalSeleniumDsl.g:1165:1: ( ( rule__Click__AltAssignment_4_2_1 ) )
            {
            // InternalSeleniumDsl.g:1165:1: ( ( rule__Click__AltAssignment_4_2_1 ) )
            // InternalSeleniumDsl.g:1166:2: ( rule__Click__AltAssignment_4_2_1 )
            {
             before(grammarAccess.getClickAccess().getAltAssignment_4_2_1()); 
            // InternalSeleniumDsl.g:1167:2: ( rule__Click__AltAssignment_4_2_1 )
            // InternalSeleniumDsl.g:1167:3: rule__Click__AltAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Click__AltAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getClickAccess().getAltAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group_4_2__1__Impl"


    // $ANTLR start "rule__Click__Group_4_3__0"
    // InternalSeleniumDsl.g:1176:1: rule__Click__Group_4_3__0 : rule__Click__Group_4_3__0__Impl rule__Click__Group_4_3__1 ;
    public final void rule__Click__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1180:1: ( rule__Click__Group_4_3__0__Impl rule__Click__Group_4_3__1 )
            // InternalSeleniumDsl.g:1181:2: rule__Click__Group_4_3__0__Impl rule__Click__Group_4_3__1
            {
            pushFollow(FOLLOW_16);
            rule__Click__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Click__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group_4_3__0"


    // $ANTLR start "rule__Click__Group_4_3__0__Impl"
    // InternalSeleniumDsl.g:1188:1: rule__Click__Group_4_3__0__Impl : ( 'variable' ) ;
    public final void rule__Click__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1192:1: ( ( 'variable' ) )
            // InternalSeleniumDsl.g:1193:1: ( 'variable' )
            {
            // InternalSeleniumDsl.g:1193:1: ( 'variable' )
            // InternalSeleniumDsl.g:1194:2: 'variable'
            {
             before(grammarAccess.getClickAccess().getVariableKeyword_4_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getClickAccess().getVariableKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group_4_3__0__Impl"


    // $ANTLR start "rule__Click__Group_4_3__1"
    // InternalSeleniumDsl.g:1203:1: rule__Click__Group_4_3__1 : rule__Click__Group_4_3__1__Impl ;
    public final void rule__Click__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1207:1: ( rule__Click__Group_4_3__1__Impl )
            // InternalSeleniumDsl.g:1208:2: rule__Click__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Click__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group_4_3__1"


    // $ANTLR start "rule__Click__Group_4_3__1__Impl"
    // InternalSeleniumDsl.g:1214:1: rule__Click__Group_4_3__1__Impl : ( ( rule__Click__VariableAssignment_4_3_1 ) ) ;
    public final void rule__Click__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1218:1: ( ( ( rule__Click__VariableAssignment_4_3_1 ) ) )
            // InternalSeleniumDsl.g:1219:1: ( ( rule__Click__VariableAssignment_4_3_1 ) )
            {
            // InternalSeleniumDsl.g:1219:1: ( ( rule__Click__VariableAssignment_4_3_1 ) )
            // InternalSeleniumDsl.g:1220:2: ( rule__Click__VariableAssignment_4_3_1 )
            {
             before(grammarAccess.getClickAccess().getVariableAssignment_4_3_1()); 
            // InternalSeleniumDsl.g:1221:2: ( rule__Click__VariableAssignment_4_3_1 )
            // InternalSeleniumDsl.g:1221:3: rule__Click__VariableAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Click__VariableAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClickAccess().getVariableAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group_4_3__1__Impl"


    // $ANTLR start "rule__Fill__Group__0"
    // InternalSeleniumDsl.g:1230:1: rule__Fill__Group__0 : rule__Fill__Group__0__Impl rule__Fill__Group__1 ;
    public final void rule__Fill__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1234:1: ( rule__Fill__Group__0__Impl rule__Fill__Group__1 )
            // InternalSeleniumDsl.g:1235:2: rule__Fill__Group__0__Impl rule__Fill__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Fill__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fill__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__0"


    // $ANTLR start "rule__Fill__Group__0__Impl"
    // InternalSeleniumDsl.g:1242:1: rule__Fill__Group__0__Impl : ( 'fill' ) ;
    public final void rule__Fill__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1246:1: ( ( 'fill' ) )
            // InternalSeleniumDsl.g:1247:1: ( 'fill' )
            {
            // InternalSeleniumDsl.g:1247:1: ( 'fill' )
            // InternalSeleniumDsl.g:1248:2: 'fill'
            {
             before(grammarAccess.getFillAccess().getFillKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFillAccess().getFillKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__0__Impl"


    // $ANTLR start "rule__Fill__Group__1"
    // InternalSeleniumDsl.g:1257:1: rule__Fill__Group__1 : rule__Fill__Group__1__Impl rule__Fill__Group__2 ;
    public final void rule__Fill__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1261:1: ( rule__Fill__Group__1__Impl rule__Fill__Group__2 )
            // InternalSeleniumDsl.g:1262:2: rule__Fill__Group__1__Impl rule__Fill__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Fill__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fill__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__1"


    // $ANTLR start "rule__Fill__Group__1__Impl"
    // InternalSeleniumDsl.g:1269:1: rule__Fill__Group__1__Impl : ( ( rule__Fill__ElementAssignment_1 ) ) ;
    public final void rule__Fill__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1273:1: ( ( ( rule__Fill__ElementAssignment_1 ) ) )
            // InternalSeleniumDsl.g:1274:1: ( ( rule__Fill__ElementAssignment_1 ) )
            {
            // InternalSeleniumDsl.g:1274:1: ( ( rule__Fill__ElementAssignment_1 ) )
            // InternalSeleniumDsl.g:1275:2: ( rule__Fill__ElementAssignment_1 )
            {
             before(grammarAccess.getFillAccess().getElementAssignment_1()); 
            // InternalSeleniumDsl.g:1276:2: ( rule__Fill__ElementAssignment_1 )
            // InternalSeleniumDsl.g:1276:3: rule__Fill__ElementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Fill__ElementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFillAccess().getElementAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__1__Impl"


    // $ANTLR start "rule__Fill__Group__2"
    // InternalSeleniumDsl.g:1284:1: rule__Fill__Group__2 : rule__Fill__Group__2__Impl rule__Fill__Group__3 ;
    public final void rule__Fill__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1288:1: ( rule__Fill__Group__2__Impl rule__Fill__Group__3 )
            // InternalSeleniumDsl.g:1289:2: rule__Fill__Group__2__Impl rule__Fill__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Fill__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fill__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__2"


    // $ANTLR start "rule__Fill__Group__2__Impl"
    // InternalSeleniumDsl.g:1296:1: rule__Fill__Group__2__Impl : ( ( rule__Fill__FieldNameAssignment_2 ) ) ;
    public final void rule__Fill__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1300:1: ( ( ( rule__Fill__FieldNameAssignment_2 ) ) )
            // InternalSeleniumDsl.g:1301:1: ( ( rule__Fill__FieldNameAssignment_2 ) )
            {
            // InternalSeleniumDsl.g:1301:1: ( ( rule__Fill__FieldNameAssignment_2 ) )
            // InternalSeleniumDsl.g:1302:2: ( rule__Fill__FieldNameAssignment_2 )
            {
             before(grammarAccess.getFillAccess().getFieldNameAssignment_2()); 
            // InternalSeleniumDsl.g:1303:2: ( rule__Fill__FieldNameAssignment_2 )
            // InternalSeleniumDsl.g:1303:3: rule__Fill__FieldNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Fill__FieldNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFillAccess().getFieldNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__2__Impl"


    // $ANTLR start "rule__Fill__Group__3"
    // InternalSeleniumDsl.g:1311:1: rule__Fill__Group__3 : rule__Fill__Group__3__Impl rule__Fill__Group__4 ;
    public final void rule__Fill__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1315:1: ( rule__Fill__Group__3__Impl rule__Fill__Group__4 )
            // InternalSeleniumDsl.g:1316:2: rule__Fill__Group__3__Impl rule__Fill__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Fill__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fill__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__3"


    // $ANTLR start "rule__Fill__Group__3__Impl"
    // InternalSeleniumDsl.g:1323:1: rule__Fill__Group__3__Impl : ( 'with' ) ;
    public final void rule__Fill__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1327:1: ( ( 'with' ) )
            // InternalSeleniumDsl.g:1328:1: ( 'with' )
            {
            // InternalSeleniumDsl.g:1328:1: ( 'with' )
            // InternalSeleniumDsl.g:1329:2: 'with'
            {
             before(grammarAccess.getFillAccess().getWithKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFillAccess().getWithKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__3__Impl"


    // $ANTLR start "rule__Fill__Group__4"
    // InternalSeleniumDsl.g:1338:1: rule__Fill__Group__4 : rule__Fill__Group__4__Impl rule__Fill__Group__5 ;
    public final void rule__Fill__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1342:1: ( rule__Fill__Group__4__Impl rule__Fill__Group__5 )
            // InternalSeleniumDsl.g:1343:2: rule__Fill__Group__4__Impl rule__Fill__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Fill__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fill__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__4"


    // $ANTLR start "rule__Fill__Group__4__Impl"
    // InternalSeleniumDsl.g:1350:1: rule__Fill__Group__4__Impl : ( 'the' ) ;
    public final void rule__Fill__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1354:1: ( ( 'the' ) )
            // InternalSeleniumDsl.g:1355:1: ( 'the' )
            {
            // InternalSeleniumDsl.g:1355:1: ( 'the' )
            // InternalSeleniumDsl.g:1356:2: 'the'
            {
             before(grammarAccess.getFillAccess().getTheKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getFillAccess().getTheKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__4__Impl"


    // $ANTLR start "rule__Fill__Group__5"
    // InternalSeleniumDsl.g:1365:1: rule__Fill__Group__5 : rule__Fill__Group__5__Impl ;
    public final void rule__Fill__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1369:1: ( rule__Fill__Group__5__Impl )
            // InternalSeleniumDsl.g:1370:2: rule__Fill__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fill__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__5"


    // $ANTLR start "rule__Fill__Group__5__Impl"
    // InternalSeleniumDsl.g:1376:1: rule__Fill__Group__5__Impl : ( ( rule__Fill__Alternatives_5 ) ) ;
    public final void rule__Fill__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1380:1: ( ( ( rule__Fill__Alternatives_5 ) ) )
            // InternalSeleniumDsl.g:1381:1: ( ( rule__Fill__Alternatives_5 ) )
            {
            // InternalSeleniumDsl.g:1381:1: ( ( rule__Fill__Alternatives_5 ) )
            // InternalSeleniumDsl.g:1382:2: ( rule__Fill__Alternatives_5 )
            {
             before(grammarAccess.getFillAccess().getAlternatives_5()); 
            // InternalSeleniumDsl.g:1383:2: ( rule__Fill__Alternatives_5 )
            // InternalSeleniumDsl.g:1383:3: rule__Fill__Alternatives_5
            {
            pushFollow(FOLLOW_2);
            rule__Fill__Alternatives_5();

            state._fsp--;


            }

             after(grammarAccess.getFillAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__5__Impl"


    // $ANTLR start "rule__Fill__Group_5_0__0"
    // InternalSeleniumDsl.g:1392:1: rule__Fill__Group_5_0__0 : rule__Fill__Group_5_0__0__Impl rule__Fill__Group_5_0__1 ;
    public final void rule__Fill__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1396:1: ( rule__Fill__Group_5_0__0__Impl rule__Fill__Group_5_0__1 )
            // InternalSeleniumDsl.g:1397:2: rule__Fill__Group_5_0__0__Impl rule__Fill__Group_5_0__1
            {
            pushFollow(FOLLOW_15);
            rule__Fill__Group_5_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fill__Group_5_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group_5_0__0"


    // $ANTLR start "rule__Fill__Group_5_0__0__Impl"
    // InternalSeleniumDsl.g:1404:1: rule__Fill__Group_5_0__0__Impl : ( 'text' ) ;
    public final void rule__Fill__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1408:1: ( ( 'text' ) )
            // InternalSeleniumDsl.g:1409:1: ( 'text' )
            {
            // InternalSeleniumDsl.g:1409:1: ( 'text' )
            // InternalSeleniumDsl.g:1410:2: 'text'
            {
             before(grammarAccess.getFillAccess().getTextKeyword_5_0_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFillAccess().getTextKeyword_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group_5_0__0__Impl"


    // $ANTLR start "rule__Fill__Group_5_0__1"
    // InternalSeleniumDsl.g:1419:1: rule__Fill__Group_5_0__1 : rule__Fill__Group_5_0__1__Impl ;
    public final void rule__Fill__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1423:1: ( rule__Fill__Group_5_0__1__Impl )
            // InternalSeleniumDsl.g:1424:2: rule__Fill__Group_5_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fill__Group_5_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group_5_0__1"


    // $ANTLR start "rule__Fill__Group_5_0__1__Impl"
    // InternalSeleniumDsl.g:1430:1: rule__Fill__Group_5_0__1__Impl : ( ( rule__Fill__TextToFillAssignment_5_0_1 ) ) ;
    public final void rule__Fill__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1434:1: ( ( ( rule__Fill__TextToFillAssignment_5_0_1 ) ) )
            // InternalSeleniumDsl.g:1435:1: ( ( rule__Fill__TextToFillAssignment_5_0_1 ) )
            {
            // InternalSeleniumDsl.g:1435:1: ( ( rule__Fill__TextToFillAssignment_5_0_1 ) )
            // InternalSeleniumDsl.g:1436:2: ( rule__Fill__TextToFillAssignment_5_0_1 )
            {
             before(grammarAccess.getFillAccess().getTextToFillAssignment_5_0_1()); 
            // InternalSeleniumDsl.g:1437:2: ( rule__Fill__TextToFillAssignment_5_0_1 )
            // InternalSeleniumDsl.g:1437:3: rule__Fill__TextToFillAssignment_5_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Fill__TextToFillAssignment_5_0_1();

            state._fsp--;


            }

             after(grammarAccess.getFillAccess().getTextToFillAssignment_5_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group_5_0__1__Impl"


    // $ANTLR start "rule__Fill__Group_5_1__0"
    // InternalSeleniumDsl.g:1446:1: rule__Fill__Group_5_1__0 : rule__Fill__Group_5_1__0__Impl rule__Fill__Group_5_1__1 ;
    public final void rule__Fill__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1450:1: ( rule__Fill__Group_5_1__0__Impl rule__Fill__Group_5_1__1 )
            // InternalSeleniumDsl.g:1451:2: rule__Fill__Group_5_1__0__Impl rule__Fill__Group_5_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Fill__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fill__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group_5_1__0"


    // $ANTLR start "rule__Fill__Group_5_1__0__Impl"
    // InternalSeleniumDsl.g:1458:1: rule__Fill__Group_5_1__0__Impl : ( 'variable' ) ;
    public final void rule__Fill__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1462:1: ( ( 'variable' ) )
            // InternalSeleniumDsl.g:1463:1: ( 'variable' )
            {
            // InternalSeleniumDsl.g:1463:1: ( 'variable' )
            // InternalSeleniumDsl.g:1464:2: 'variable'
            {
             before(grammarAccess.getFillAccess().getVariableKeyword_5_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFillAccess().getVariableKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group_5_1__0__Impl"


    // $ANTLR start "rule__Fill__Group_5_1__1"
    // InternalSeleniumDsl.g:1473:1: rule__Fill__Group_5_1__1 : rule__Fill__Group_5_1__1__Impl ;
    public final void rule__Fill__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1477:1: ( rule__Fill__Group_5_1__1__Impl )
            // InternalSeleniumDsl.g:1478:2: rule__Fill__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fill__Group_5_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group_5_1__1"


    // $ANTLR start "rule__Fill__Group_5_1__1__Impl"
    // InternalSeleniumDsl.g:1484:1: rule__Fill__Group_5_1__1__Impl : ( ( rule__Fill__VariableAssignment_5_1_1 ) ) ;
    public final void rule__Fill__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1488:1: ( ( ( rule__Fill__VariableAssignment_5_1_1 ) ) )
            // InternalSeleniumDsl.g:1489:1: ( ( rule__Fill__VariableAssignment_5_1_1 ) )
            {
            // InternalSeleniumDsl.g:1489:1: ( ( rule__Fill__VariableAssignment_5_1_1 ) )
            // InternalSeleniumDsl.g:1490:2: ( rule__Fill__VariableAssignment_5_1_1 )
            {
             before(grammarAccess.getFillAccess().getVariableAssignment_5_1_1()); 
            // InternalSeleniumDsl.g:1491:2: ( rule__Fill__VariableAssignment_5_1_1 )
            // InternalSeleniumDsl.g:1491:3: rule__Fill__VariableAssignment_5_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Fill__VariableAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFillAccess().getVariableAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group_5_1__1__Impl"


    // $ANTLR start "rule__Selector__Group__0"
    // InternalSeleniumDsl.g:1500:1: rule__Selector__Group__0 : rule__Selector__Group__0__Impl rule__Selector__Group__1 ;
    public final void rule__Selector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1504:1: ( rule__Selector__Group__0__Impl rule__Selector__Group__1 )
            // InternalSeleniumDsl.g:1505:2: rule__Selector__Group__0__Impl rule__Selector__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalSeleniumDsl.g:1512:1: rule__Selector__Group__0__Impl : ( ( rule__Selector__Group_0__0 )? ) ;
    public final void rule__Selector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1516:1: ( ( ( rule__Selector__Group_0__0 )? ) )
            // InternalSeleniumDsl.g:1517:1: ( ( rule__Selector__Group_0__0 )? )
            {
            // InternalSeleniumDsl.g:1517:1: ( ( rule__Selector__Group_0__0 )? )
            // InternalSeleniumDsl.g:1518:2: ( rule__Selector__Group_0__0 )?
            {
             before(grammarAccess.getSelectorAccess().getGroup_0()); 
            // InternalSeleniumDsl.g:1519:2: ( rule__Selector__Group_0__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSeleniumDsl.g:1519:3: rule__Selector__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selector__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectorAccess().getGroup_0()); 

            }


            }

        }
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
    // InternalSeleniumDsl.g:1527:1: rule__Selector__Group__1 : rule__Selector__Group__1__Impl ;
    public final void rule__Selector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1531:1: ( rule__Selector__Group__1__Impl )
            // InternalSeleniumDsl.g:1532:2: rule__Selector__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalSeleniumDsl.g:1538:1: rule__Selector__Group__1__Impl : ( ( rule__Selector__ElementTypeAssignment_1 )? ) ;
    public final void rule__Selector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1542:1: ( ( ( rule__Selector__ElementTypeAssignment_1 )? ) )
            // InternalSeleniumDsl.g:1543:1: ( ( rule__Selector__ElementTypeAssignment_1 )? )
            {
            // InternalSeleniumDsl.g:1543:1: ( ( rule__Selector__ElementTypeAssignment_1 )? )
            // InternalSeleniumDsl.g:1544:2: ( rule__Selector__ElementTypeAssignment_1 )?
            {
             before(grammarAccess.getSelectorAccess().getElementTypeAssignment_1()); 
            // InternalSeleniumDsl.g:1545:2: ( rule__Selector__ElementTypeAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=13 && LA9_0<=20)||LA9_0==33) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSeleniumDsl.g:1545:3: rule__Selector__ElementTypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selector__ElementTypeAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectorAccess().getElementTypeAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Selector__Group_0__0"
    // InternalSeleniumDsl.g:1554:1: rule__Selector__Group_0__0 : rule__Selector__Group_0__0__Impl rule__Selector__Group_0__1 ;
    public final void rule__Selector__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1558:1: ( rule__Selector__Group_0__0__Impl rule__Selector__Group_0__1 )
            // InternalSeleniumDsl.g:1559:2: rule__Selector__Group_0__0__Impl rule__Selector__Group_0__1
            {
            pushFollow(FOLLOW_16);
            rule__Selector__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_0__0"


    // $ANTLR start "rule__Selector__Group_0__0__Impl"
    // InternalSeleniumDsl.g:1566:1: rule__Selector__Group_0__0__Impl : ( 'the' ) ;
    public final void rule__Selector__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1570:1: ( ( 'the' ) )
            // InternalSeleniumDsl.g:1571:1: ( 'the' )
            {
            // InternalSeleniumDsl.g:1571:1: ( 'the' )
            // InternalSeleniumDsl.g:1572:2: 'the'
            {
             before(grammarAccess.getSelectorAccess().getTheKeyword_0_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getTheKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_0__0__Impl"


    // $ANTLR start "rule__Selector__Group_0__1"
    // InternalSeleniumDsl.g:1581:1: rule__Selector__Group_0__1 : rule__Selector__Group_0__1__Impl ;
    public final void rule__Selector__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1585:1: ( rule__Selector__Group_0__1__Impl )
            // InternalSeleniumDsl.g:1586:2: rule__Selector__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_0__1"


    // $ANTLR start "rule__Selector__Group_0__1__Impl"
    // InternalSeleniumDsl.g:1592:1: rule__Selector__Group_0__1__Impl : ( ( rule__Selector__ElementTypeAssignment_0_1 ) ) ;
    public final void rule__Selector__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1596:1: ( ( ( rule__Selector__ElementTypeAssignment_0_1 ) ) )
            // InternalSeleniumDsl.g:1597:1: ( ( rule__Selector__ElementTypeAssignment_0_1 ) )
            {
            // InternalSeleniumDsl.g:1597:1: ( ( rule__Selector__ElementTypeAssignment_0_1 ) )
            // InternalSeleniumDsl.g:1598:2: ( rule__Selector__ElementTypeAssignment_0_1 )
            {
             before(grammarAccess.getSelectorAccess().getElementTypeAssignment_0_1()); 
            // InternalSeleniumDsl.g:1599:2: ( rule__Selector__ElementTypeAssignment_0_1 )
            // InternalSeleniumDsl.g:1599:3: rule__Selector__ElementTypeAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Selector__ElementTypeAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getElementTypeAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_0__1__Impl"


    // $ANTLR start "rule__ElementType__Group_0__0"
    // InternalSeleniumDsl.g:1608:1: rule__ElementType__Group_0__0 : rule__ElementType__Group_0__0__Impl rule__ElementType__Group_0__1 ;
    public final void rule__ElementType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1612:1: ( rule__ElementType__Group_0__0__Impl rule__ElementType__Group_0__1 )
            // InternalSeleniumDsl.g:1613:2: rule__ElementType__Group_0__0__Impl rule__ElementType__Group_0__1
            {
            pushFollow(FOLLOW_20);
            rule__ElementType__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementType__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementType__Group_0__0"


    // $ANTLR start "rule__ElementType__Group_0__0__Impl"
    // InternalSeleniumDsl.g:1620:1: rule__ElementType__Group_0__0__Impl : ( 'text' ) ;
    public final void rule__ElementType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1624:1: ( ( 'text' ) )
            // InternalSeleniumDsl.g:1625:1: ( 'text' )
            {
            // InternalSeleniumDsl.g:1625:1: ( 'text' )
            // InternalSeleniumDsl.g:1626:2: 'text'
            {
             before(grammarAccess.getElementTypeAccess().getTextKeyword_0_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getElementTypeAccess().getTextKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementType__Group_0__0__Impl"


    // $ANTLR start "rule__ElementType__Group_0__1"
    // InternalSeleniumDsl.g:1635:1: rule__ElementType__Group_0__1 : rule__ElementType__Group_0__1__Impl ;
    public final void rule__ElementType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1639:1: ( rule__ElementType__Group_0__1__Impl )
            // InternalSeleniumDsl.g:1640:2: rule__ElementType__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementType__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementType__Group_0__1"


    // $ANTLR start "rule__ElementType__Group_0__1__Impl"
    // InternalSeleniumDsl.g:1646:1: rule__ElementType__Group_0__1__Impl : ( 'field' ) ;
    public final void rule__ElementType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1650:1: ( ( 'field' ) )
            // InternalSeleniumDsl.g:1651:1: ( 'field' )
            {
            // InternalSeleniumDsl.g:1651:1: ( 'field' )
            // InternalSeleniumDsl.g:1652:2: 'field'
            {
             before(grammarAccess.getElementTypeAccess().getFieldKeyword_0_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getElementTypeAccess().getFieldKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementType__Group_0__1__Impl"


    // $ANTLR start "rule__ElementType__Group_8__0"
    // InternalSeleniumDsl.g:1662:1: rule__ElementType__Group_8__0 : rule__ElementType__Group_8__0__Impl rule__ElementType__Group_8__1 ;
    public final void rule__ElementType__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1666:1: ( rule__ElementType__Group_8__0__Impl rule__ElementType__Group_8__1 )
            // InternalSeleniumDsl.g:1667:2: rule__ElementType__Group_8__0__Impl rule__ElementType__Group_8__1
            {
            pushFollow(FOLLOW_21);
            rule__ElementType__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementType__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementType__Group_8__0"


    // $ANTLR start "rule__ElementType__Group_8__0__Impl"
    // InternalSeleniumDsl.g:1674:1: rule__ElementType__Group_8__0__Impl : ( 'text' ) ;
    public final void rule__ElementType__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1678:1: ( ( 'text' ) )
            // InternalSeleniumDsl.g:1679:1: ( 'text' )
            {
            // InternalSeleniumDsl.g:1679:1: ( 'text' )
            // InternalSeleniumDsl.g:1680:2: 'text'
            {
             before(grammarAccess.getElementTypeAccess().getTextKeyword_8_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getElementTypeAccess().getTextKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementType__Group_8__0__Impl"


    // $ANTLR start "rule__ElementType__Group_8__1"
    // InternalSeleniumDsl.g:1689:1: rule__ElementType__Group_8__1 : rule__ElementType__Group_8__1__Impl ;
    public final void rule__ElementType__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1693:1: ( rule__ElementType__Group_8__1__Impl )
            // InternalSeleniumDsl.g:1694:2: rule__ElementType__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementType__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementType__Group_8__1"


    // $ANTLR start "rule__ElementType__Group_8__1__Impl"
    // InternalSeleniumDsl.g:1700:1: rule__ElementType__Group_8__1__Impl : ( 'link' ) ;
    public final void rule__ElementType__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1704:1: ( ( 'link' ) )
            // InternalSeleniumDsl.g:1705:1: ( 'link' )
            {
            // InternalSeleniumDsl.g:1705:1: ( 'link' )
            // InternalSeleniumDsl.g:1706:2: 'link'
            {
             before(grammarAccess.getElementTypeAccess().getLinkKeyword_8_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getElementTypeAccess().getLinkKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementType__Group_8__1__Impl"


    // $ANTLR start "rule__Select__Group__0"
    // InternalSeleniumDsl.g:1716:1: rule__Select__Group__0 : rule__Select__Group__0__Impl rule__Select__Group__1 ;
    public final void rule__Select__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1720:1: ( rule__Select__Group__0__Impl rule__Select__Group__1 )
            // InternalSeleniumDsl.g:1721:2: rule__Select__Group__0__Impl rule__Select__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Select__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__0"


    // $ANTLR start "rule__Select__Group__0__Impl"
    // InternalSeleniumDsl.g:1728:1: rule__Select__Group__0__Impl : ( () ) ;
    public final void rule__Select__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1732:1: ( ( () ) )
            // InternalSeleniumDsl.g:1733:1: ( () )
            {
            // InternalSeleniumDsl.g:1733:1: ( () )
            // InternalSeleniumDsl.g:1734:2: ()
            {
             before(grammarAccess.getSelectAccess().getSelectAction_0()); 
            // InternalSeleniumDsl.g:1735:2: ()
            // InternalSeleniumDsl.g:1735:3: 
            {
            }

             after(grammarAccess.getSelectAccess().getSelectAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__0__Impl"


    // $ANTLR start "rule__Select__Group__1"
    // InternalSeleniumDsl.g:1743:1: rule__Select__Group__1 : rule__Select__Group__1__Impl rule__Select__Group__2 ;
    public final void rule__Select__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1747:1: ( rule__Select__Group__1__Impl rule__Select__Group__2 )
            // InternalSeleniumDsl.g:1748:2: rule__Select__Group__1__Impl rule__Select__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Select__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__1"


    // $ANTLR start "rule__Select__Group__1__Impl"
    // InternalSeleniumDsl.g:1755:1: rule__Select__Group__1__Impl : ( 'check' ) ;
    public final void rule__Select__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1759:1: ( ( 'check' ) )
            // InternalSeleniumDsl.g:1760:1: ( 'check' )
            {
            // InternalSeleniumDsl.g:1760:1: ( 'check' )
            // InternalSeleniumDsl.g:1761:2: 'check'
            {
             before(grammarAccess.getSelectAccess().getCheckKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getCheckKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__1__Impl"


    // $ANTLR start "rule__Select__Group__2"
    // InternalSeleniumDsl.g:1770:1: rule__Select__Group__2 : rule__Select__Group__2__Impl rule__Select__Group__3 ;
    public final void rule__Select__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1774:1: ( rule__Select__Group__2__Impl rule__Select__Group__3 )
            // InternalSeleniumDsl.g:1775:2: rule__Select__Group__2__Impl rule__Select__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Select__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__2"


    // $ANTLR start "rule__Select__Group__2__Impl"
    // InternalSeleniumDsl.g:1782:1: rule__Select__Group__2__Impl : ( ( rule__Select__ElementTypeAssignment_2 ) ) ;
    public final void rule__Select__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1786:1: ( ( ( rule__Select__ElementTypeAssignment_2 ) ) )
            // InternalSeleniumDsl.g:1787:1: ( ( rule__Select__ElementTypeAssignment_2 ) )
            {
            // InternalSeleniumDsl.g:1787:1: ( ( rule__Select__ElementTypeAssignment_2 ) )
            // InternalSeleniumDsl.g:1788:2: ( rule__Select__ElementTypeAssignment_2 )
            {
             before(grammarAccess.getSelectAccess().getElementTypeAssignment_2()); 
            // InternalSeleniumDsl.g:1789:2: ( rule__Select__ElementTypeAssignment_2 )
            // InternalSeleniumDsl.g:1789:3: rule__Select__ElementTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Select__ElementTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getElementTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__2__Impl"


    // $ANTLR start "rule__Select__Group__3"
    // InternalSeleniumDsl.g:1797:1: rule__Select__Group__3 : rule__Select__Group__3__Impl rule__Select__Group__4 ;
    public final void rule__Select__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1801:1: ( rule__Select__Group__3__Impl rule__Select__Group__4 )
            // InternalSeleniumDsl.g:1802:2: rule__Select__Group__3__Impl rule__Select__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Select__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__3"


    // $ANTLR start "rule__Select__Group__3__Impl"
    // InternalSeleniumDsl.g:1809:1: rule__Select__Group__3__Impl : ( ( rule__Select__ValuesAssignment_3 ) ) ;
    public final void rule__Select__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1813:1: ( ( ( rule__Select__ValuesAssignment_3 ) ) )
            // InternalSeleniumDsl.g:1814:1: ( ( rule__Select__ValuesAssignment_3 ) )
            {
            // InternalSeleniumDsl.g:1814:1: ( ( rule__Select__ValuesAssignment_3 ) )
            // InternalSeleniumDsl.g:1815:2: ( rule__Select__ValuesAssignment_3 )
            {
             before(grammarAccess.getSelectAccess().getValuesAssignment_3()); 
            // InternalSeleniumDsl.g:1816:2: ( rule__Select__ValuesAssignment_3 )
            // InternalSeleniumDsl.g:1816:3: rule__Select__ValuesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Select__ValuesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getValuesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__3__Impl"


    // $ANTLR start "rule__Select__Group__4"
    // InternalSeleniumDsl.g:1824:1: rule__Select__Group__4 : rule__Select__Group__4__Impl ;
    public final void rule__Select__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1828:1: ( rule__Select__Group__4__Impl )
            // InternalSeleniumDsl.g:1829:2: rule__Select__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__4"


    // $ANTLR start "rule__Select__Group__4__Impl"
    // InternalSeleniumDsl.g:1835:1: rule__Select__Group__4__Impl : ( ( rule__Select__Group_4__0 )* ) ;
    public final void rule__Select__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1839:1: ( ( ( rule__Select__Group_4__0 )* ) )
            // InternalSeleniumDsl.g:1840:1: ( ( rule__Select__Group_4__0 )* )
            {
            // InternalSeleniumDsl.g:1840:1: ( ( rule__Select__Group_4__0 )* )
            // InternalSeleniumDsl.g:1841:2: ( rule__Select__Group_4__0 )*
            {
             before(grammarAccess.getSelectAccess().getGroup_4()); 
            // InternalSeleniumDsl.g:1842:2: ( rule__Select__Group_4__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==36) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSeleniumDsl.g:1842:3: rule__Select__Group_4__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Select__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getSelectAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__4__Impl"


    // $ANTLR start "rule__Select__Group_4__0"
    // InternalSeleniumDsl.g:1851:1: rule__Select__Group_4__0 : rule__Select__Group_4__0__Impl rule__Select__Group_4__1 ;
    public final void rule__Select__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1855:1: ( rule__Select__Group_4__0__Impl rule__Select__Group_4__1 )
            // InternalSeleniumDsl.g:1856:2: rule__Select__Group_4__0__Impl rule__Select__Group_4__1
            {
            pushFollow(FOLLOW_15);
            rule__Select__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_4__0"


    // $ANTLR start "rule__Select__Group_4__0__Impl"
    // InternalSeleniumDsl.g:1863:1: rule__Select__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Select__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1867:1: ( ( ',' ) )
            // InternalSeleniumDsl.g:1868:1: ( ',' )
            {
            // InternalSeleniumDsl.g:1868:1: ( ',' )
            // InternalSeleniumDsl.g:1869:2: ','
            {
             before(grammarAccess.getSelectAccess().getCommaKeyword_4_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_4__0__Impl"


    // $ANTLR start "rule__Select__Group_4__1"
    // InternalSeleniumDsl.g:1878:1: rule__Select__Group_4__1 : rule__Select__Group_4__1__Impl ;
    public final void rule__Select__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1882:1: ( rule__Select__Group_4__1__Impl )
            // InternalSeleniumDsl.g:1883:2: rule__Select__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_4__1"


    // $ANTLR start "rule__Select__Group_4__1__Impl"
    // InternalSeleniumDsl.g:1889:1: rule__Select__Group_4__1__Impl : ( ( rule__Select__ValuesAssignment_4_1 ) ) ;
    public final void rule__Select__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1893:1: ( ( ( rule__Select__ValuesAssignment_4_1 ) ) )
            // InternalSeleniumDsl.g:1894:1: ( ( rule__Select__ValuesAssignment_4_1 ) )
            {
            // InternalSeleniumDsl.g:1894:1: ( ( rule__Select__ValuesAssignment_4_1 ) )
            // InternalSeleniumDsl.g:1895:2: ( rule__Select__ValuesAssignment_4_1 )
            {
             before(grammarAccess.getSelectAccess().getValuesAssignment_4_1()); 
            // InternalSeleniumDsl.g:1896:2: ( rule__Select__ValuesAssignment_4_1 )
            // InternalSeleniumDsl.g:1896:3: rule__Select__ValuesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Select__ValuesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getValuesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_4__1__Impl"


    // $ANTLR start "rule__Verify__Group__0"
    // InternalSeleniumDsl.g:1905:1: rule__Verify__Group__0 : rule__Verify__Group__0__Impl rule__Verify__Group__1 ;
    public final void rule__Verify__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1909:1: ( rule__Verify__Group__0__Impl rule__Verify__Group__1 )
            // InternalSeleniumDsl.g:1910:2: rule__Verify__Group__0__Impl rule__Verify__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalSeleniumDsl.g:1917:1: rule__Verify__Group__0__Impl : ( 'verify' ) ;
    public final void rule__Verify__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1921:1: ( ( 'verify' ) )
            // InternalSeleniumDsl.g:1922:1: ( 'verify' )
            {
            // InternalSeleniumDsl.g:1922:1: ( 'verify' )
            // InternalSeleniumDsl.g:1923:2: 'verify'
            {
             before(grammarAccess.getVerifyAccess().getVerifyKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1932:1: rule__Verify__Group__1 : rule__Verify__Group__1__Impl rule__Verify__Group__2 ;
    public final void rule__Verify__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1936:1: ( rule__Verify__Group__1__Impl rule__Verify__Group__2 )
            // InternalSeleniumDsl.g:1937:2: rule__Verify__Group__1__Impl rule__Verify__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalSeleniumDsl.g:1944:1: rule__Verify__Group__1__Impl : ( 'that' ) ;
    public final void rule__Verify__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1948:1: ( ( 'that' ) )
            // InternalSeleniumDsl.g:1949:1: ( 'that' )
            {
            // InternalSeleniumDsl.g:1949:1: ( 'that' )
            // InternalSeleniumDsl.g:1950:2: 'that'
            {
             before(grammarAccess.getVerifyAccess().getThatKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1959:1: rule__Verify__Group__2 : rule__Verify__Group__2__Impl rule__Verify__Group__3 ;
    public final void rule__Verify__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1963:1: ( rule__Verify__Group__2__Impl rule__Verify__Group__3 )
            // InternalSeleniumDsl.g:1964:2: rule__Verify__Group__2__Impl rule__Verify__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalSeleniumDsl.g:1971:1: rule__Verify__Group__2__Impl : ( 'the' ) ;
    public final void rule__Verify__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1975:1: ( ( 'the' ) )
            // InternalSeleniumDsl.g:1976:1: ( 'the' )
            {
            // InternalSeleniumDsl.g:1976:1: ( 'the' )
            // InternalSeleniumDsl.g:1977:2: 'the'
            {
             before(grammarAccess.getVerifyAccess().getTheKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getVerifyAccess().getTheKeyword_2()); 

            }


            }

        }
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
    // InternalSeleniumDsl.g:1986:1: rule__Verify__Group__3 : rule__Verify__Group__3__Impl rule__Verify__Group__4 ;
    public final void rule__Verify__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1990:1: ( rule__Verify__Group__3__Impl rule__Verify__Group__4 )
            // InternalSeleniumDsl.g:1991:2: rule__Verify__Group__3__Impl rule__Verify__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalSeleniumDsl.g:1998:1: rule__Verify__Group__3__Impl : ( 'page' ) ;
    public final void rule__Verify__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2002:1: ( ( 'page' ) )
            // InternalSeleniumDsl.g:2003:1: ( 'page' )
            {
            // InternalSeleniumDsl.g:2003:1: ( 'page' )
            // InternalSeleniumDsl.g:2004:2: 'page'
            {
             before(grammarAccess.getVerifyAccess().getPageKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getVerifyAccess().getPageKeyword_3()); 

            }


            }

        }
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
    // InternalSeleniumDsl.g:2013:1: rule__Verify__Group__4 : rule__Verify__Group__4__Impl rule__Verify__Group__5 ;
    public final void rule__Verify__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2017:1: ( rule__Verify__Group__4__Impl rule__Verify__Group__5 )
            // InternalSeleniumDsl.g:2018:2: rule__Verify__Group__4__Impl rule__Verify__Group__5
            {
            pushFollow(FOLLOW_13);
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
    // InternalSeleniumDsl.g:2025:1: rule__Verify__Group__4__Impl : ( 'contains' ) ;
    public final void rule__Verify__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2029:1: ( ( 'contains' ) )
            // InternalSeleniumDsl.g:2030:1: ( 'contains' )
            {
            // InternalSeleniumDsl.g:2030:1: ( 'contains' )
            // InternalSeleniumDsl.g:2031:2: 'contains'
            {
             before(grammarAccess.getVerifyAccess().getContainsKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getVerifyAccess().getContainsKeyword_4()); 

            }


            }

        }
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
    // InternalSeleniumDsl.g:2040:1: rule__Verify__Group__5 : rule__Verify__Group__5__Impl rule__Verify__Group__6 ;
    public final void rule__Verify__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2044:1: ( rule__Verify__Group__5__Impl rule__Verify__Group__6 )
            // InternalSeleniumDsl.g:2045:2: rule__Verify__Group__5__Impl rule__Verify__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__Verify__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Verify__Group__6();

            state._fsp--;


            }

        }
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
    // InternalSeleniumDsl.g:2052:1: rule__Verify__Group__5__Impl : ( 'the' ) ;
    public final void rule__Verify__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2056:1: ( ( 'the' ) )
            // InternalSeleniumDsl.g:2057:1: ( 'the' )
            {
            // InternalSeleniumDsl.g:2057:1: ( 'the' )
            // InternalSeleniumDsl.g:2058:2: 'the'
            {
             before(grammarAccess.getVerifyAccess().getTheKeyword_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getVerifyAccess().getTheKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Verify__Group__6"
    // InternalSeleniumDsl.g:2067:1: rule__Verify__Group__6 : rule__Verify__Group__6__Impl ;
    public final void rule__Verify__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2071:1: ( rule__Verify__Group__6__Impl )
            // InternalSeleniumDsl.g:2072:2: rule__Verify__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Verify__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__6"


    // $ANTLR start "rule__Verify__Group__6__Impl"
    // InternalSeleniumDsl.g:2078:1: rule__Verify__Group__6__Impl : ( ( rule__Verify__Alternatives_6 ) ) ;
    public final void rule__Verify__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2082:1: ( ( ( rule__Verify__Alternatives_6 ) ) )
            // InternalSeleniumDsl.g:2083:1: ( ( rule__Verify__Alternatives_6 ) )
            {
            // InternalSeleniumDsl.g:2083:1: ( ( rule__Verify__Alternatives_6 ) )
            // InternalSeleniumDsl.g:2084:2: ( rule__Verify__Alternatives_6 )
            {
             before(grammarAccess.getVerifyAccess().getAlternatives_6()); 
            // InternalSeleniumDsl.g:2085:2: ( rule__Verify__Alternatives_6 )
            // InternalSeleniumDsl.g:2085:3: rule__Verify__Alternatives_6
            {
            pushFollow(FOLLOW_2);
            rule__Verify__Alternatives_6();

            state._fsp--;


            }

             after(grammarAccess.getVerifyAccess().getAlternatives_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__6__Impl"


    // $ANTLR start "rule__Verify__Group_6_0__0"
    // InternalSeleniumDsl.g:2094:1: rule__Verify__Group_6_0__0 : rule__Verify__Group_6_0__0__Impl rule__Verify__Group_6_0__1 ;
    public final void rule__Verify__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2098:1: ( rule__Verify__Group_6_0__0__Impl rule__Verify__Group_6_0__1 )
            // InternalSeleniumDsl.g:2099:2: rule__Verify__Group_6_0__0__Impl rule__Verify__Group_6_0__1
            {
            pushFollow(FOLLOW_15);
            rule__Verify__Group_6_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Verify__Group_6_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group_6_0__0"


    // $ANTLR start "rule__Verify__Group_6_0__0__Impl"
    // InternalSeleniumDsl.g:2106:1: rule__Verify__Group_6_0__0__Impl : ( 'string' ) ;
    public final void rule__Verify__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2110:1: ( ( 'string' ) )
            // InternalSeleniumDsl.g:2111:1: ( 'string' )
            {
            // InternalSeleniumDsl.g:2111:1: ( 'string' )
            // InternalSeleniumDsl.g:2112:2: 'string'
            {
             before(grammarAccess.getVerifyAccess().getStringKeyword_6_0_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getVerifyAccess().getStringKeyword_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group_6_0__0__Impl"


    // $ANTLR start "rule__Verify__Group_6_0__1"
    // InternalSeleniumDsl.g:2121:1: rule__Verify__Group_6_0__1 : rule__Verify__Group_6_0__1__Impl ;
    public final void rule__Verify__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2125:1: ( rule__Verify__Group_6_0__1__Impl )
            // InternalSeleniumDsl.g:2126:2: rule__Verify__Group_6_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Verify__Group_6_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group_6_0__1"


    // $ANTLR start "rule__Verify__Group_6_0__1__Impl"
    // InternalSeleniumDsl.g:2132:1: rule__Verify__Group_6_0__1__Impl : ( ( rule__Verify__TextToVerifyAssignment_6_0_1 ) ) ;
    public final void rule__Verify__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2136:1: ( ( ( rule__Verify__TextToVerifyAssignment_6_0_1 ) ) )
            // InternalSeleniumDsl.g:2137:1: ( ( rule__Verify__TextToVerifyAssignment_6_0_1 ) )
            {
            // InternalSeleniumDsl.g:2137:1: ( ( rule__Verify__TextToVerifyAssignment_6_0_1 ) )
            // InternalSeleniumDsl.g:2138:2: ( rule__Verify__TextToVerifyAssignment_6_0_1 )
            {
             before(grammarAccess.getVerifyAccess().getTextToVerifyAssignment_6_0_1()); 
            // InternalSeleniumDsl.g:2139:2: ( rule__Verify__TextToVerifyAssignment_6_0_1 )
            // InternalSeleniumDsl.g:2139:3: rule__Verify__TextToVerifyAssignment_6_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Verify__TextToVerifyAssignment_6_0_1();

            state._fsp--;


            }

             after(grammarAccess.getVerifyAccess().getTextToVerifyAssignment_6_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group_6_0__1__Impl"


    // $ANTLR start "rule__Verify__Group_6_1__0"
    // InternalSeleniumDsl.g:2148:1: rule__Verify__Group_6_1__0 : rule__Verify__Group_6_1__0__Impl rule__Verify__Group_6_1__1 ;
    public final void rule__Verify__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2152:1: ( rule__Verify__Group_6_1__0__Impl rule__Verify__Group_6_1__1 )
            // InternalSeleniumDsl.g:2153:2: rule__Verify__Group_6_1__0__Impl rule__Verify__Group_6_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Verify__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Verify__Group_6_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group_6_1__0"


    // $ANTLR start "rule__Verify__Group_6_1__0__Impl"
    // InternalSeleniumDsl.g:2160:1: rule__Verify__Group_6_1__0__Impl : ( 'link' ) ;
    public final void rule__Verify__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2164:1: ( ( 'link' ) )
            // InternalSeleniumDsl.g:2165:1: ( 'link' )
            {
            // InternalSeleniumDsl.g:2165:1: ( 'link' )
            // InternalSeleniumDsl.g:2166:2: 'link'
            {
             before(grammarAccess.getVerifyAccess().getLinkKeyword_6_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVerifyAccess().getLinkKeyword_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group_6_1__0__Impl"


    // $ANTLR start "rule__Verify__Group_6_1__1"
    // InternalSeleniumDsl.g:2175:1: rule__Verify__Group_6_1__1 : rule__Verify__Group_6_1__1__Impl ;
    public final void rule__Verify__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2179:1: ( rule__Verify__Group_6_1__1__Impl )
            // InternalSeleniumDsl.g:2180:2: rule__Verify__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Verify__Group_6_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group_6_1__1"


    // $ANTLR start "rule__Verify__Group_6_1__1__Impl"
    // InternalSeleniumDsl.g:2186:1: rule__Verify__Group_6_1__1__Impl : ( ( rule__Verify__LinkToVerifyAssignment_6_1_1 ) ) ;
    public final void rule__Verify__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2190:1: ( ( ( rule__Verify__LinkToVerifyAssignment_6_1_1 ) ) )
            // InternalSeleniumDsl.g:2191:1: ( ( rule__Verify__LinkToVerifyAssignment_6_1_1 ) )
            {
            // InternalSeleniumDsl.g:2191:1: ( ( rule__Verify__LinkToVerifyAssignment_6_1_1 ) )
            // InternalSeleniumDsl.g:2192:2: ( rule__Verify__LinkToVerifyAssignment_6_1_1 )
            {
             before(grammarAccess.getVerifyAccess().getLinkToVerifyAssignment_6_1_1()); 
            // InternalSeleniumDsl.g:2193:2: ( rule__Verify__LinkToVerifyAssignment_6_1_1 )
            // InternalSeleniumDsl.g:2193:3: rule__Verify__LinkToVerifyAssignment_6_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Verify__LinkToVerifyAssignment_6_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVerifyAccess().getLinkToVerifyAssignment_6_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group_6_1__1__Impl"


    // $ANTLR start "rule__Verify__Group_6_2__0"
    // InternalSeleniumDsl.g:2202:1: rule__Verify__Group_6_2__0 : rule__Verify__Group_6_2__0__Impl rule__Verify__Group_6_2__1 ;
    public final void rule__Verify__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2206:1: ( rule__Verify__Group_6_2__0__Impl rule__Verify__Group_6_2__1 )
            // InternalSeleniumDsl.g:2207:2: rule__Verify__Group_6_2__0__Impl rule__Verify__Group_6_2__1
            {
            pushFollow(FOLLOW_16);
            rule__Verify__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Verify__Group_6_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group_6_2__0"


    // $ANTLR start "rule__Verify__Group_6_2__0__Impl"
    // InternalSeleniumDsl.g:2214:1: rule__Verify__Group_6_2__0__Impl : ( 'variable' ) ;
    public final void rule__Verify__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2218:1: ( ( 'variable' ) )
            // InternalSeleniumDsl.g:2219:1: ( 'variable' )
            {
            // InternalSeleniumDsl.g:2219:1: ( 'variable' )
            // InternalSeleniumDsl.g:2220:2: 'variable'
            {
             before(grammarAccess.getVerifyAccess().getVariableKeyword_6_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getVerifyAccess().getVariableKeyword_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group_6_2__0__Impl"


    // $ANTLR start "rule__Verify__Group_6_2__1"
    // InternalSeleniumDsl.g:2229:1: rule__Verify__Group_6_2__1 : rule__Verify__Group_6_2__1__Impl ;
    public final void rule__Verify__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2233:1: ( rule__Verify__Group_6_2__1__Impl )
            // InternalSeleniumDsl.g:2234:2: rule__Verify__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Verify__Group_6_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group_6_2__1"


    // $ANTLR start "rule__Verify__Group_6_2__1__Impl"
    // InternalSeleniumDsl.g:2240:1: rule__Verify__Group_6_2__1__Impl : ( ( rule__Verify__VariableAssignment_6_2_1 ) ) ;
    public final void rule__Verify__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2244:1: ( ( ( rule__Verify__VariableAssignment_6_2_1 ) ) )
            // InternalSeleniumDsl.g:2245:1: ( ( rule__Verify__VariableAssignment_6_2_1 ) )
            {
            // InternalSeleniumDsl.g:2245:1: ( ( rule__Verify__VariableAssignment_6_2_1 ) )
            // InternalSeleniumDsl.g:2246:2: ( rule__Verify__VariableAssignment_6_2_1 )
            {
             before(grammarAccess.getVerifyAccess().getVariableAssignment_6_2_1()); 
            // InternalSeleniumDsl.g:2247:2: ( rule__Verify__VariableAssignment_6_2_1 )
            // InternalSeleniumDsl.g:2247:3: rule__Verify__VariableAssignment_6_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Verify__VariableAssignment_6_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVerifyAccess().getVariableAssignment_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group_6_2__1__Impl"


    // $ANTLR start "rule__Read__Group__0"
    // InternalSeleniumDsl.g:2256:1: rule__Read__Group__0 : rule__Read__Group__0__Impl rule__Read__Group__1 ;
    public final void rule__Read__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2260:1: ( rule__Read__Group__0__Impl rule__Read__Group__1 )
            // InternalSeleniumDsl.g:2261:2: rule__Read__Group__0__Impl rule__Read__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Read__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Read__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__0"


    // $ANTLR start "rule__Read__Group__0__Impl"
    // InternalSeleniumDsl.g:2268:1: rule__Read__Group__0__Impl : ( 'read' ) ;
    public final void rule__Read__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2272:1: ( ( 'read' ) )
            // InternalSeleniumDsl.g:2273:1: ( 'read' )
            {
            // InternalSeleniumDsl.g:2273:1: ( 'read' )
            // InternalSeleniumDsl.g:2274:2: 'read'
            {
             before(grammarAccess.getReadAccess().getReadKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getReadAccess().getReadKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__0__Impl"


    // $ANTLR start "rule__Read__Group__1"
    // InternalSeleniumDsl.g:2283:1: rule__Read__Group__1 : rule__Read__Group__1__Impl rule__Read__Group__2 ;
    public final void rule__Read__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2287:1: ( rule__Read__Group__1__Impl rule__Read__Group__2 )
            // InternalSeleniumDsl.g:2288:2: rule__Read__Group__1__Impl rule__Read__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Read__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Read__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__1"


    // $ANTLR start "rule__Read__Group__1__Impl"
    // InternalSeleniumDsl.g:2295:1: rule__Read__Group__1__Impl : ( 'the' ) ;
    public final void rule__Read__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2299:1: ( ( 'the' ) )
            // InternalSeleniumDsl.g:2300:1: ( 'the' )
            {
            // InternalSeleniumDsl.g:2300:1: ( 'the' )
            // InternalSeleniumDsl.g:2301:2: 'the'
            {
             before(grammarAccess.getReadAccess().getTheKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getReadAccess().getTheKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__1__Impl"


    // $ANTLR start "rule__Read__Group__2"
    // InternalSeleniumDsl.g:2310:1: rule__Read__Group__2 : rule__Read__Group__2__Impl rule__Read__Group__3 ;
    public final void rule__Read__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2314:1: ( rule__Read__Group__2__Impl rule__Read__Group__3 )
            // InternalSeleniumDsl.g:2315:2: rule__Read__Group__2__Impl rule__Read__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__Read__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Read__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__2"


    // $ANTLR start "rule__Read__Group__2__Impl"
    // InternalSeleniumDsl.g:2322:1: rule__Read__Group__2__Impl : ( ( rule__Read__ElementsAssignment_2 ) ) ;
    public final void rule__Read__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2326:1: ( ( ( rule__Read__ElementsAssignment_2 ) ) )
            // InternalSeleniumDsl.g:2327:1: ( ( rule__Read__ElementsAssignment_2 ) )
            {
            // InternalSeleniumDsl.g:2327:1: ( ( rule__Read__ElementsAssignment_2 ) )
            // InternalSeleniumDsl.g:2328:2: ( rule__Read__ElementsAssignment_2 )
            {
             before(grammarAccess.getReadAccess().getElementsAssignment_2()); 
            // InternalSeleniumDsl.g:2329:2: ( rule__Read__ElementsAssignment_2 )
            // InternalSeleniumDsl.g:2329:3: rule__Read__ElementsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Read__ElementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReadAccess().getElementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__2__Impl"


    // $ANTLR start "rule__Read__Group__3"
    // InternalSeleniumDsl.g:2337:1: rule__Read__Group__3 : rule__Read__Group__3__Impl rule__Read__Group__4 ;
    public final void rule__Read__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2341:1: ( rule__Read__Group__3__Impl rule__Read__Group__4 )
            // InternalSeleniumDsl.g:2342:2: rule__Read__Group__3__Impl rule__Read__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__Read__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Read__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__3"


    // $ANTLR start "rule__Read__Group__3__Impl"
    // InternalSeleniumDsl.g:2349:1: rule__Read__Group__3__Impl : ( ( rule__Read__Group_3__0 )* ) ;
    public final void rule__Read__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2353:1: ( ( ( rule__Read__Group_3__0 )* ) )
            // InternalSeleniumDsl.g:2354:1: ( ( rule__Read__Group_3__0 )* )
            {
            // InternalSeleniumDsl.g:2354:1: ( ( rule__Read__Group_3__0 )* )
            // InternalSeleniumDsl.g:2355:2: ( rule__Read__Group_3__0 )*
            {
             before(grammarAccess.getReadAccess().getGroup_3()); 
            // InternalSeleniumDsl.g:2356:2: ( rule__Read__Group_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==36) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSeleniumDsl.g:2356:3: rule__Read__Group_3__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Read__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getReadAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__3__Impl"


    // $ANTLR start "rule__Read__Group__4"
    // InternalSeleniumDsl.g:2364:1: rule__Read__Group__4 : rule__Read__Group__4__Impl rule__Read__Group__5 ;
    public final void rule__Read__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2368:1: ( rule__Read__Group__4__Impl rule__Read__Group__5 )
            // InternalSeleniumDsl.g:2369:2: rule__Read__Group__4__Impl rule__Read__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Read__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Read__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__4"


    // $ANTLR start "rule__Read__Group__4__Impl"
    // InternalSeleniumDsl.g:2376:1: rule__Read__Group__4__Impl : ( 'of' ) ;
    public final void rule__Read__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2380:1: ( ( 'of' ) )
            // InternalSeleniumDsl.g:2381:1: ( 'of' )
            {
            // InternalSeleniumDsl.g:2381:1: ( 'of' )
            // InternalSeleniumDsl.g:2382:2: 'of'
            {
             before(grammarAccess.getReadAccess().getOfKeyword_4()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getReadAccess().getOfKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__4__Impl"


    // $ANTLR start "rule__Read__Group__5"
    // InternalSeleniumDsl.g:2391:1: rule__Read__Group__5 : rule__Read__Group__5__Impl rule__Read__Group__6 ;
    public final void rule__Read__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2395:1: ( rule__Read__Group__5__Impl rule__Read__Group__6 )
            // InternalSeleniumDsl.g:2396:2: rule__Read__Group__5__Impl rule__Read__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__Read__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Read__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__5"


    // $ANTLR start "rule__Read__Group__5__Impl"
    // InternalSeleniumDsl.g:2403:1: rule__Read__Group__5__Impl : ( 'the' ) ;
    public final void rule__Read__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2407:1: ( ( 'the' ) )
            // InternalSeleniumDsl.g:2408:1: ( 'the' )
            {
            // InternalSeleniumDsl.g:2408:1: ( 'the' )
            // InternalSeleniumDsl.g:2409:2: 'the'
            {
             before(grammarAccess.getReadAccess().getTheKeyword_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getReadAccess().getTheKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__5__Impl"


    // $ANTLR start "rule__Read__Group__6"
    // InternalSeleniumDsl.g:2418:1: rule__Read__Group__6 : rule__Read__Group__6__Impl rule__Read__Group__7 ;
    public final void rule__Read__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2422:1: ( rule__Read__Group__6__Impl rule__Read__Group__7 )
            // InternalSeleniumDsl.g:2423:2: rule__Read__Group__6__Impl rule__Read__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__Read__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Read__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__6"


    // $ANTLR start "rule__Read__Group__6__Impl"
    // InternalSeleniumDsl.g:2430:1: rule__Read__Group__6__Impl : ( 'link' ) ;
    public final void rule__Read__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2434:1: ( ( 'link' ) )
            // InternalSeleniumDsl.g:2435:1: ( 'link' )
            {
            // InternalSeleniumDsl.g:2435:1: ( 'link' )
            // InternalSeleniumDsl.g:2436:2: 'link'
            {
             before(grammarAccess.getReadAccess().getLinkKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getReadAccess().getLinkKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__6__Impl"


    // $ANTLR start "rule__Read__Group__7"
    // InternalSeleniumDsl.g:2445:1: rule__Read__Group__7 : rule__Read__Group__7__Impl rule__Read__Group__8 ;
    public final void rule__Read__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2449:1: ( rule__Read__Group__7__Impl rule__Read__Group__8 )
            // InternalSeleniumDsl.g:2450:2: rule__Read__Group__7__Impl rule__Read__Group__8
            {
            pushFollow(FOLLOW_30);
            rule__Read__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Read__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__7"


    // $ANTLR start "rule__Read__Group__7__Impl"
    // InternalSeleniumDsl.g:2457:1: rule__Read__Group__7__Impl : ( ( rule__Read__LinkTextAssignment_7 ) ) ;
    public final void rule__Read__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2461:1: ( ( ( rule__Read__LinkTextAssignment_7 ) ) )
            // InternalSeleniumDsl.g:2462:1: ( ( rule__Read__LinkTextAssignment_7 ) )
            {
            // InternalSeleniumDsl.g:2462:1: ( ( rule__Read__LinkTextAssignment_7 ) )
            // InternalSeleniumDsl.g:2463:2: ( rule__Read__LinkTextAssignment_7 )
            {
             before(grammarAccess.getReadAccess().getLinkTextAssignment_7()); 
            // InternalSeleniumDsl.g:2464:2: ( rule__Read__LinkTextAssignment_7 )
            // InternalSeleniumDsl.g:2464:3: rule__Read__LinkTextAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Read__LinkTextAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getReadAccess().getLinkTextAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__7__Impl"


    // $ANTLR start "rule__Read__Group__8"
    // InternalSeleniumDsl.g:2472:1: rule__Read__Group__8 : rule__Read__Group__8__Impl rule__Read__Group__9 ;
    public final void rule__Read__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2476:1: ( rule__Read__Group__8__Impl rule__Read__Group__9 )
            // InternalSeleniumDsl.g:2477:2: rule__Read__Group__8__Impl rule__Read__Group__9
            {
            pushFollow(FOLLOW_31);
            rule__Read__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Read__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__8"


    // $ANTLR start "rule__Read__Group__8__Impl"
    // InternalSeleniumDsl.g:2484:1: rule__Read__Group__8__Impl : ( 'number' ) ;
    public final void rule__Read__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2488:1: ( ( 'number' ) )
            // InternalSeleniumDsl.g:2489:1: ( 'number' )
            {
            // InternalSeleniumDsl.g:2489:1: ( 'number' )
            // InternalSeleniumDsl.g:2490:2: 'number'
            {
             before(grammarAccess.getReadAccess().getNumberKeyword_8()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getReadAccess().getNumberKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__8__Impl"


    // $ANTLR start "rule__Read__Group__9"
    // InternalSeleniumDsl.g:2499:1: rule__Read__Group__9 : rule__Read__Group__9__Impl ;
    public final void rule__Read__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2503:1: ( rule__Read__Group__9__Impl )
            // InternalSeleniumDsl.g:2504:2: rule__Read__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Read__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__9"


    // $ANTLR start "rule__Read__Group__9__Impl"
    // InternalSeleniumDsl.g:2510:1: rule__Read__Group__9__Impl : ( ( rule__Read__NumberAssignment_9 ) ) ;
    public final void rule__Read__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2514:1: ( ( ( rule__Read__NumberAssignment_9 ) ) )
            // InternalSeleniumDsl.g:2515:1: ( ( rule__Read__NumberAssignment_9 ) )
            {
            // InternalSeleniumDsl.g:2515:1: ( ( rule__Read__NumberAssignment_9 ) )
            // InternalSeleniumDsl.g:2516:2: ( rule__Read__NumberAssignment_9 )
            {
             before(grammarAccess.getReadAccess().getNumberAssignment_9()); 
            // InternalSeleniumDsl.g:2517:2: ( rule__Read__NumberAssignment_9 )
            // InternalSeleniumDsl.g:2517:3: rule__Read__NumberAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Read__NumberAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getReadAccess().getNumberAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__9__Impl"


    // $ANTLR start "rule__Read__Group_3__0"
    // InternalSeleniumDsl.g:2526:1: rule__Read__Group_3__0 : rule__Read__Group_3__0__Impl rule__Read__Group_3__1 ;
    public final void rule__Read__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2530:1: ( rule__Read__Group_3__0__Impl rule__Read__Group_3__1 )
            // InternalSeleniumDsl.g:2531:2: rule__Read__Group_3__0__Impl rule__Read__Group_3__1
            {
            pushFollow(FOLLOW_16);
            rule__Read__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Read__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group_3__0"


    // $ANTLR start "rule__Read__Group_3__0__Impl"
    // InternalSeleniumDsl.g:2538:1: rule__Read__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Read__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2542:1: ( ( ',' ) )
            // InternalSeleniumDsl.g:2543:1: ( ',' )
            {
            // InternalSeleniumDsl.g:2543:1: ( ',' )
            // InternalSeleniumDsl.g:2544:2: ','
            {
             before(grammarAccess.getReadAccess().getCommaKeyword_3_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getReadAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group_3__0__Impl"


    // $ANTLR start "rule__Read__Group_3__1"
    // InternalSeleniumDsl.g:2553:1: rule__Read__Group_3__1 : rule__Read__Group_3__1__Impl ;
    public final void rule__Read__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2557:1: ( rule__Read__Group_3__1__Impl )
            // InternalSeleniumDsl.g:2558:2: rule__Read__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Read__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group_3__1"


    // $ANTLR start "rule__Read__Group_3__1__Impl"
    // InternalSeleniumDsl.g:2564:1: rule__Read__Group_3__1__Impl : ( ( rule__Read__ElementsAssignment_3_1 ) ) ;
    public final void rule__Read__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2568:1: ( ( ( rule__Read__ElementsAssignment_3_1 ) ) )
            // InternalSeleniumDsl.g:2569:1: ( ( rule__Read__ElementsAssignment_3_1 ) )
            {
            // InternalSeleniumDsl.g:2569:1: ( ( rule__Read__ElementsAssignment_3_1 ) )
            // InternalSeleniumDsl.g:2570:2: ( rule__Read__ElementsAssignment_3_1 )
            {
             before(grammarAccess.getReadAccess().getElementsAssignment_3_1()); 
            // InternalSeleniumDsl.g:2571:2: ( rule__Read__ElementsAssignment_3_1 )
            // InternalSeleniumDsl.g:2571:3: rule__Read__ElementsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Read__ElementsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getReadAccess().getElementsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group_3__1__Impl"


    // $ANTLR start "rule__Uncheck__Group__0"
    // InternalSeleniumDsl.g:2580:1: rule__Uncheck__Group__0 : rule__Uncheck__Group__0__Impl rule__Uncheck__Group__1 ;
    public final void rule__Uncheck__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2584:1: ( rule__Uncheck__Group__0__Impl rule__Uncheck__Group__1 )
            // InternalSeleniumDsl.g:2585:2: rule__Uncheck__Group__0__Impl rule__Uncheck__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Uncheck__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uncheck__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uncheck__Group__0"


    // $ANTLR start "rule__Uncheck__Group__0__Impl"
    // InternalSeleniumDsl.g:2592:1: rule__Uncheck__Group__0__Impl : ( () ) ;
    public final void rule__Uncheck__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2596:1: ( ( () ) )
            // InternalSeleniumDsl.g:2597:1: ( () )
            {
            // InternalSeleniumDsl.g:2597:1: ( () )
            // InternalSeleniumDsl.g:2598:2: ()
            {
             before(grammarAccess.getUncheckAccess().getUncheckAction_0()); 
            // InternalSeleniumDsl.g:2599:2: ()
            // InternalSeleniumDsl.g:2599:3: 
            {
            }

             after(grammarAccess.getUncheckAccess().getUncheckAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uncheck__Group__0__Impl"


    // $ANTLR start "rule__Uncheck__Group__1"
    // InternalSeleniumDsl.g:2607:1: rule__Uncheck__Group__1 : rule__Uncheck__Group__1__Impl rule__Uncheck__Group__2 ;
    public final void rule__Uncheck__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2611:1: ( rule__Uncheck__Group__1__Impl rule__Uncheck__Group__2 )
            // InternalSeleniumDsl.g:2612:2: rule__Uncheck__Group__1__Impl rule__Uncheck__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__Uncheck__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uncheck__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uncheck__Group__1"


    // $ANTLR start "rule__Uncheck__Group__1__Impl"
    // InternalSeleniumDsl.g:2619:1: rule__Uncheck__Group__1__Impl : ( 'uncheck' ) ;
    public final void rule__Uncheck__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2623:1: ( ( 'uncheck' ) )
            // InternalSeleniumDsl.g:2624:1: ( 'uncheck' )
            {
            // InternalSeleniumDsl.g:2624:1: ( 'uncheck' )
            // InternalSeleniumDsl.g:2625:2: 'uncheck'
            {
             before(grammarAccess.getUncheckAccess().getUncheckKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getUncheckAccess().getUncheckKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uncheck__Group__1__Impl"


    // $ANTLR start "rule__Uncheck__Group__2"
    // InternalSeleniumDsl.g:2634:1: rule__Uncheck__Group__2 : rule__Uncheck__Group__2__Impl rule__Uncheck__Group__3 ;
    public final void rule__Uncheck__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2638:1: ( rule__Uncheck__Group__2__Impl rule__Uncheck__Group__3 )
            // InternalSeleniumDsl.g:2639:2: rule__Uncheck__Group__2__Impl rule__Uncheck__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__Uncheck__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uncheck__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uncheck__Group__2"


    // $ANTLR start "rule__Uncheck__Group__2__Impl"
    // InternalSeleniumDsl.g:2646:1: rule__Uncheck__Group__2__Impl : ( 'all' ) ;
    public final void rule__Uncheck__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2650:1: ( ( 'all' ) )
            // InternalSeleniumDsl.g:2651:1: ( 'all' )
            {
            // InternalSeleniumDsl.g:2651:1: ( 'all' )
            // InternalSeleniumDsl.g:2652:2: 'all'
            {
             before(grammarAccess.getUncheckAccess().getAllKeyword_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getUncheckAccess().getAllKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uncheck__Group__2__Impl"


    // $ANTLR start "rule__Uncheck__Group__3"
    // InternalSeleniumDsl.g:2661:1: rule__Uncheck__Group__3 : rule__Uncheck__Group__3__Impl ;
    public final void rule__Uncheck__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2665:1: ( rule__Uncheck__Group__3__Impl )
            // InternalSeleniumDsl.g:2666:2: rule__Uncheck__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Uncheck__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uncheck__Group__3"


    // $ANTLR start "rule__Uncheck__Group__3__Impl"
    // InternalSeleniumDsl.g:2672:1: rule__Uncheck__Group__3__Impl : ( 'checkboxes' ) ;
    public final void rule__Uncheck__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2676:1: ( ( 'checkboxes' ) )
            // InternalSeleniumDsl.g:2677:1: ( 'checkboxes' )
            {
            // InternalSeleniumDsl.g:2677:1: ( 'checkboxes' )
            // InternalSeleniumDsl.g:2678:2: 'checkboxes'
            {
             before(grammarAccess.getUncheckAccess().getCheckboxesKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getUncheckAccess().getCheckboxesKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uncheck__Group__3__Impl"


    // $ANTLR start "rule__Combobox__Group__0"
    // InternalSeleniumDsl.g:2688:1: rule__Combobox__Group__0 : rule__Combobox__Group__0__Impl rule__Combobox__Group__1 ;
    public final void rule__Combobox__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2692:1: ( rule__Combobox__Group__0__Impl rule__Combobox__Group__1 )
            // InternalSeleniumDsl.g:2693:2: rule__Combobox__Group__0__Impl rule__Combobox__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Combobox__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Combobox__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Combobox__Group__0"


    // $ANTLR start "rule__Combobox__Group__0__Impl"
    // InternalSeleniumDsl.g:2700:1: rule__Combobox__Group__0__Impl : ( 'choose' ) ;
    public final void rule__Combobox__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2704:1: ( ( 'choose' ) )
            // InternalSeleniumDsl.g:2705:1: ( 'choose' )
            {
            // InternalSeleniumDsl.g:2705:1: ( 'choose' )
            // InternalSeleniumDsl.g:2706:2: 'choose'
            {
             before(grammarAccess.getComboboxAccess().getChooseKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getComboboxAccess().getChooseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Combobox__Group__0__Impl"


    // $ANTLR start "rule__Combobox__Group__1"
    // InternalSeleniumDsl.g:2715:1: rule__Combobox__Group__1 : rule__Combobox__Group__1__Impl rule__Combobox__Group__2 ;
    public final void rule__Combobox__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2719:1: ( rule__Combobox__Group__1__Impl rule__Combobox__Group__2 )
            // InternalSeleniumDsl.g:2720:2: rule__Combobox__Group__1__Impl rule__Combobox__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Combobox__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Combobox__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Combobox__Group__1"


    // $ANTLR start "rule__Combobox__Group__1__Impl"
    // InternalSeleniumDsl.g:2727:1: rule__Combobox__Group__1__Impl : ( ( rule__Combobox__ElementsAssignment_1 ) ) ;
    public final void rule__Combobox__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2731:1: ( ( ( rule__Combobox__ElementsAssignment_1 ) ) )
            // InternalSeleniumDsl.g:2732:1: ( ( rule__Combobox__ElementsAssignment_1 ) )
            {
            // InternalSeleniumDsl.g:2732:1: ( ( rule__Combobox__ElementsAssignment_1 ) )
            // InternalSeleniumDsl.g:2733:2: ( rule__Combobox__ElementsAssignment_1 )
            {
             before(grammarAccess.getComboboxAccess().getElementsAssignment_1()); 
            // InternalSeleniumDsl.g:2734:2: ( rule__Combobox__ElementsAssignment_1 )
            // InternalSeleniumDsl.g:2734:3: rule__Combobox__ElementsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Combobox__ElementsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComboboxAccess().getElementsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Combobox__Group__1__Impl"


    // $ANTLR start "rule__Combobox__Group__2"
    // InternalSeleniumDsl.g:2742:1: rule__Combobox__Group__2 : rule__Combobox__Group__2__Impl rule__Combobox__Group__3 ;
    public final void rule__Combobox__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2746:1: ( rule__Combobox__Group__2__Impl rule__Combobox__Group__3 )
            // InternalSeleniumDsl.g:2747:2: rule__Combobox__Group__2__Impl rule__Combobox__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__Combobox__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Combobox__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Combobox__Group__2"


    // $ANTLR start "rule__Combobox__Group__2__Impl"
    // InternalSeleniumDsl.g:2754:1: rule__Combobox__Group__2__Impl : ( ( rule__Combobox__OptionAssignment_2 ) ) ;
    public final void rule__Combobox__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2758:1: ( ( ( rule__Combobox__OptionAssignment_2 ) ) )
            // InternalSeleniumDsl.g:2759:1: ( ( rule__Combobox__OptionAssignment_2 ) )
            {
            // InternalSeleniumDsl.g:2759:1: ( ( rule__Combobox__OptionAssignment_2 ) )
            // InternalSeleniumDsl.g:2760:2: ( rule__Combobox__OptionAssignment_2 )
            {
             before(grammarAccess.getComboboxAccess().getOptionAssignment_2()); 
            // InternalSeleniumDsl.g:2761:2: ( rule__Combobox__OptionAssignment_2 )
            // InternalSeleniumDsl.g:2761:3: rule__Combobox__OptionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Combobox__OptionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComboboxAccess().getOptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Combobox__Group__2__Impl"


    // $ANTLR start "rule__Combobox__Group__3"
    // InternalSeleniumDsl.g:2769:1: rule__Combobox__Group__3 : rule__Combobox__Group__3__Impl rule__Combobox__Group__4 ;
    public final void rule__Combobox__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2773:1: ( rule__Combobox__Group__3__Impl rule__Combobox__Group__4 )
            // InternalSeleniumDsl.g:2774:2: rule__Combobox__Group__3__Impl rule__Combobox__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Combobox__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Combobox__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Combobox__Group__3"


    // $ANTLR start "rule__Combobox__Group__3__Impl"
    // InternalSeleniumDsl.g:2781:1: rule__Combobox__Group__3__Impl : ( 'in' ) ;
    public final void rule__Combobox__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2785:1: ( ( 'in' ) )
            // InternalSeleniumDsl.g:2786:1: ( 'in' )
            {
            // InternalSeleniumDsl.g:2786:1: ( 'in' )
            // InternalSeleniumDsl.g:2787:2: 'in'
            {
             before(grammarAccess.getComboboxAccess().getInKeyword_3()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getComboboxAccess().getInKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Combobox__Group__3__Impl"


    // $ANTLR start "rule__Combobox__Group__4"
    // InternalSeleniumDsl.g:2796:1: rule__Combobox__Group__4 : rule__Combobox__Group__4__Impl rule__Combobox__Group__5 ;
    public final void rule__Combobox__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2800:1: ( rule__Combobox__Group__4__Impl rule__Combobox__Group__5 )
            // InternalSeleniumDsl.g:2801:2: rule__Combobox__Group__4__Impl rule__Combobox__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Combobox__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Combobox__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Combobox__Group__4"


    // $ANTLR start "rule__Combobox__Group__4__Impl"
    // InternalSeleniumDsl.g:2808:1: rule__Combobox__Group__4__Impl : ( ( rule__Combobox__ElementsAssignment_4 ) ) ;
    public final void rule__Combobox__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2812:1: ( ( ( rule__Combobox__ElementsAssignment_4 ) ) )
            // InternalSeleniumDsl.g:2813:1: ( ( rule__Combobox__ElementsAssignment_4 ) )
            {
            // InternalSeleniumDsl.g:2813:1: ( ( rule__Combobox__ElementsAssignment_4 ) )
            // InternalSeleniumDsl.g:2814:2: ( rule__Combobox__ElementsAssignment_4 )
            {
             before(grammarAccess.getComboboxAccess().getElementsAssignment_4()); 
            // InternalSeleniumDsl.g:2815:2: ( rule__Combobox__ElementsAssignment_4 )
            // InternalSeleniumDsl.g:2815:3: rule__Combobox__ElementsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Combobox__ElementsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getComboboxAccess().getElementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Combobox__Group__4__Impl"


    // $ANTLR start "rule__Combobox__Group__5"
    // InternalSeleniumDsl.g:2823:1: rule__Combobox__Group__5 : rule__Combobox__Group__5__Impl ;
    public final void rule__Combobox__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2827:1: ( rule__Combobox__Group__5__Impl )
            // InternalSeleniumDsl.g:2828:2: rule__Combobox__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Combobox__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Combobox__Group__5"


    // $ANTLR start "rule__Combobox__Group__5__Impl"
    // InternalSeleniumDsl.g:2834:1: rule__Combobox__Group__5__Impl : ( ( rule__Combobox__LabelAssignment_5 ) ) ;
    public final void rule__Combobox__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2838:1: ( ( ( rule__Combobox__LabelAssignment_5 ) ) )
            // InternalSeleniumDsl.g:2839:1: ( ( rule__Combobox__LabelAssignment_5 ) )
            {
            // InternalSeleniumDsl.g:2839:1: ( ( rule__Combobox__LabelAssignment_5 ) )
            // InternalSeleniumDsl.g:2840:2: ( rule__Combobox__LabelAssignment_5 )
            {
             before(grammarAccess.getComboboxAccess().getLabelAssignment_5()); 
            // InternalSeleniumDsl.g:2841:2: ( rule__Combobox__LabelAssignment_5 )
            // InternalSeleniumDsl.g:2841:3: rule__Combobox__LabelAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Combobox__LabelAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getComboboxAccess().getLabelAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Combobox__Group__5__Impl"


    // $ANTLR start "rule__BrowserDsl__CommandsAssignment"
    // InternalSeleniumDsl.g:2850:1: rule__BrowserDsl__CommandsAssignment : ( ruleCommand ) ;
    public final void rule__BrowserDsl__CommandsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2854:1: ( ( ruleCommand ) )
            // InternalSeleniumDsl.g:2855:2: ( ruleCommand )
            {
            // InternalSeleniumDsl.g:2855:2: ( ruleCommand )
            // InternalSeleniumDsl.g:2856:3: ruleCommand
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


    // $ANTLR start "rule__GoTo__UrlAssignment_3"
    // InternalSeleniumDsl.g:2865:1: rule__GoTo__UrlAssignment_3 : ( ruleDynamicURL ) ;
    public final void rule__GoTo__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2869:1: ( ( ruleDynamicURL ) )
            // InternalSeleniumDsl.g:2870:2: ( ruleDynamicURL )
            {
            // InternalSeleniumDsl.g:2870:2: ( ruleDynamicURL )
            // InternalSeleniumDsl.g:2871:3: ruleDynamicURL
            {
             before(grammarAccess.getGoToAccess().getUrlDynamicURLParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDynamicURL();

            state._fsp--;

             after(grammarAccess.getGoToAccess().getUrlDynamicURLParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__UrlAssignment_3"


    // $ANTLR start "rule__Click__LinkTextAssignment_4_0_1"
    // InternalSeleniumDsl.g:2880:1: rule__Click__LinkTextAssignment_4_0_1 : ( RULE_STRING ) ;
    public final void rule__Click__LinkTextAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2884:1: ( ( RULE_STRING ) )
            // InternalSeleniumDsl.g:2885:2: ( RULE_STRING )
            {
            // InternalSeleniumDsl.g:2885:2: ( RULE_STRING )
            // InternalSeleniumDsl.g:2886:3: RULE_STRING
            {
             before(grammarAccess.getClickAccess().getLinkTextSTRINGTerminalRuleCall_4_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getClickAccess().getLinkTextSTRINGTerminalRuleCall_4_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__LinkTextAssignment_4_0_1"


    // $ANTLR start "rule__Click__ButtonTextAssignment_4_1_1"
    // InternalSeleniumDsl.g:2895:1: rule__Click__ButtonTextAssignment_4_1_1 : ( RULE_STRING ) ;
    public final void rule__Click__ButtonTextAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2899:1: ( ( RULE_STRING ) )
            // InternalSeleniumDsl.g:2900:2: ( RULE_STRING )
            {
            // InternalSeleniumDsl.g:2900:2: ( RULE_STRING )
            // InternalSeleniumDsl.g:2901:3: RULE_STRING
            {
             before(grammarAccess.getClickAccess().getButtonTextSTRINGTerminalRuleCall_4_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getClickAccess().getButtonTextSTRINGTerminalRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__ButtonTextAssignment_4_1_1"


    // $ANTLR start "rule__Click__AltAssignment_4_2_1"
    // InternalSeleniumDsl.g:2910:1: rule__Click__AltAssignment_4_2_1 : ( RULE_STRING ) ;
    public final void rule__Click__AltAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2914:1: ( ( RULE_STRING ) )
            // InternalSeleniumDsl.g:2915:2: ( RULE_STRING )
            {
            // InternalSeleniumDsl.g:2915:2: ( RULE_STRING )
            // InternalSeleniumDsl.g:2916:3: RULE_STRING
            {
             before(grammarAccess.getClickAccess().getAltSTRINGTerminalRuleCall_4_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getClickAccess().getAltSTRINGTerminalRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__AltAssignment_4_2_1"


    // $ANTLR start "rule__Click__VariableAssignment_4_3_1"
    // InternalSeleniumDsl.g:2925:1: rule__Click__VariableAssignment_4_3_1 : ( ruleElementType ) ;
    public final void rule__Click__VariableAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2929:1: ( ( ruleElementType ) )
            // InternalSeleniumDsl.g:2930:2: ( ruleElementType )
            {
            // InternalSeleniumDsl.g:2930:2: ( ruleElementType )
            // InternalSeleniumDsl.g:2931:3: ruleElementType
            {
             before(grammarAccess.getClickAccess().getVariableElementTypeParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElementType();

            state._fsp--;

             after(grammarAccess.getClickAccess().getVariableElementTypeParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__VariableAssignment_4_3_1"


    // $ANTLR start "rule__Fill__ElementAssignment_1"
    // InternalSeleniumDsl.g:2940:1: rule__Fill__ElementAssignment_1 : ( ruleSelector ) ;
    public final void rule__Fill__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2944:1: ( ( ruleSelector ) )
            // InternalSeleniumDsl.g:2945:2: ( ruleSelector )
            {
            // InternalSeleniumDsl.g:2945:2: ( ruleSelector )
            // InternalSeleniumDsl.g:2946:3: ruleSelector
            {
             before(grammarAccess.getFillAccess().getElementSelectorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getFillAccess().getElementSelectorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__ElementAssignment_1"


    // $ANTLR start "rule__Fill__FieldNameAssignment_2"
    // InternalSeleniumDsl.g:2955:1: rule__Fill__FieldNameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Fill__FieldNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2959:1: ( ( RULE_STRING ) )
            // InternalSeleniumDsl.g:2960:2: ( RULE_STRING )
            {
            // InternalSeleniumDsl.g:2960:2: ( RULE_STRING )
            // InternalSeleniumDsl.g:2961:3: RULE_STRING
            {
             before(grammarAccess.getFillAccess().getFieldNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFillAccess().getFieldNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__FieldNameAssignment_2"


    // $ANTLR start "rule__Fill__TextToFillAssignment_5_0_1"
    // InternalSeleniumDsl.g:2970:1: rule__Fill__TextToFillAssignment_5_0_1 : ( RULE_STRING ) ;
    public final void rule__Fill__TextToFillAssignment_5_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2974:1: ( ( RULE_STRING ) )
            // InternalSeleniumDsl.g:2975:2: ( RULE_STRING )
            {
            // InternalSeleniumDsl.g:2975:2: ( RULE_STRING )
            // InternalSeleniumDsl.g:2976:3: RULE_STRING
            {
             before(grammarAccess.getFillAccess().getTextToFillSTRINGTerminalRuleCall_5_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFillAccess().getTextToFillSTRINGTerminalRuleCall_5_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__TextToFillAssignment_5_0_1"


    // $ANTLR start "rule__Fill__VariableAssignment_5_1_1"
    // InternalSeleniumDsl.g:2985:1: rule__Fill__VariableAssignment_5_1_1 : ( ruleElementType ) ;
    public final void rule__Fill__VariableAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2989:1: ( ( ruleElementType ) )
            // InternalSeleniumDsl.g:2990:2: ( ruleElementType )
            {
            // InternalSeleniumDsl.g:2990:2: ( ruleElementType )
            // InternalSeleniumDsl.g:2991:3: ruleElementType
            {
             before(grammarAccess.getFillAccess().getVariableElementTypeParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElementType();

            state._fsp--;

             after(grammarAccess.getFillAccess().getVariableElementTypeParserRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__VariableAssignment_5_1_1"


    // $ANTLR start "rule__Selector__ElementTypeAssignment_0_1"
    // InternalSeleniumDsl.g:3000:1: rule__Selector__ElementTypeAssignment_0_1 : ( ruleElementType ) ;
    public final void rule__Selector__ElementTypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3004:1: ( ( ruleElementType ) )
            // InternalSeleniumDsl.g:3005:2: ( ruleElementType )
            {
            // InternalSeleniumDsl.g:3005:2: ( ruleElementType )
            // InternalSeleniumDsl.g:3006:3: ruleElementType
            {
             before(grammarAccess.getSelectorAccess().getElementTypeElementTypeParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElementType();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getElementTypeElementTypeParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__ElementTypeAssignment_0_1"


    // $ANTLR start "rule__Selector__ElementTypeAssignment_1"
    // InternalSeleniumDsl.g:3015:1: rule__Selector__ElementTypeAssignment_1 : ( ruleElementType ) ;
    public final void rule__Selector__ElementTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3019:1: ( ( ruleElementType ) )
            // InternalSeleniumDsl.g:3020:2: ( ruleElementType )
            {
            // InternalSeleniumDsl.g:3020:2: ( ruleElementType )
            // InternalSeleniumDsl.g:3021:3: ruleElementType
            {
             before(grammarAccess.getSelectorAccess().getElementTypeElementTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElementType();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getElementTypeElementTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__ElementTypeAssignment_1"


    // $ANTLR start "rule__Select__ElementTypeAssignment_2"
    // InternalSeleniumDsl.g:3030:1: rule__Select__ElementTypeAssignment_2 : ( ruleSelector ) ;
    public final void rule__Select__ElementTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3034:1: ( ( ruleSelector ) )
            // InternalSeleniumDsl.g:3035:2: ( ruleSelector )
            {
            // InternalSeleniumDsl.g:3035:2: ( ruleSelector )
            // InternalSeleniumDsl.g:3036:3: ruleSelector
            {
             before(grammarAccess.getSelectAccess().getElementTypeSelectorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getSelectAccess().getElementTypeSelectorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__ElementTypeAssignment_2"


    // $ANTLR start "rule__Select__ValuesAssignment_3"
    // InternalSeleniumDsl.g:3045:1: rule__Select__ValuesAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Select__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3049:1: ( ( RULE_STRING ) )
            // InternalSeleniumDsl.g:3050:2: ( RULE_STRING )
            {
            // InternalSeleniumDsl.g:3050:2: ( RULE_STRING )
            // InternalSeleniumDsl.g:3051:3: RULE_STRING
            {
             before(grammarAccess.getSelectAccess().getValuesSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getValuesSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__ValuesAssignment_3"


    // $ANTLR start "rule__Select__ValuesAssignment_4_1"
    // InternalSeleniumDsl.g:3060:1: rule__Select__ValuesAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Select__ValuesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3064:1: ( ( RULE_STRING ) )
            // InternalSeleniumDsl.g:3065:2: ( RULE_STRING )
            {
            // InternalSeleniumDsl.g:3065:2: ( RULE_STRING )
            // InternalSeleniumDsl.g:3066:3: RULE_STRING
            {
             before(grammarAccess.getSelectAccess().getValuesSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getValuesSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__ValuesAssignment_4_1"


    // $ANTLR start "rule__Verify__TextToVerifyAssignment_6_0_1"
    // InternalSeleniumDsl.g:3075:1: rule__Verify__TextToVerifyAssignment_6_0_1 : ( RULE_STRING ) ;
    public final void rule__Verify__TextToVerifyAssignment_6_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3079:1: ( ( RULE_STRING ) )
            // InternalSeleniumDsl.g:3080:2: ( RULE_STRING )
            {
            // InternalSeleniumDsl.g:3080:2: ( RULE_STRING )
            // InternalSeleniumDsl.g:3081:3: RULE_STRING
            {
             before(grammarAccess.getVerifyAccess().getTextToVerifySTRINGTerminalRuleCall_6_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVerifyAccess().getTextToVerifySTRINGTerminalRuleCall_6_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__TextToVerifyAssignment_6_0_1"


    // $ANTLR start "rule__Verify__LinkToVerifyAssignment_6_1_1"
    // InternalSeleniumDsl.g:3090:1: rule__Verify__LinkToVerifyAssignment_6_1_1 : ( RULE_STRING ) ;
    public final void rule__Verify__LinkToVerifyAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3094:1: ( ( RULE_STRING ) )
            // InternalSeleniumDsl.g:3095:2: ( RULE_STRING )
            {
            // InternalSeleniumDsl.g:3095:2: ( RULE_STRING )
            // InternalSeleniumDsl.g:3096:3: RULE_STRING
            {
             before(grammarAccess.getVerifyAccess().getLinkToVerifySTRINGTerminalRuleCall_6_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVerifyAccess().getLinkToVerifySTRINGTerminalRuleCall_6_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__LinkToVerifyAssignment_6_1_1"


    // $ANTLR start "rule__Verify__VariableAssignment_6_2_1"
    // InternalSeleniumDsl.g:3105:1: rule__Verify__VariableAssignment_6_2_1 : ( ruleElementType ) ;
    public final void rule__Verify__VariableAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3109:1: ( ( ruleElementType ) )
            // InternalSeleniumDsl.g:3110:2: ( ruleElementType )
            {
            // InternalSeleniumDsl.g:3110:2: ( ruleElementType )
            // InternalSeleniumDsl.g:3111:3: ruleElementType
            {
             before(grammarAccess.getVerifyAccess().getVariableElementTypeParserRuleCall_6_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElementType();

            state._fsp--;

             after(grammarAccess.getVerifyAccess().getVariableElementTypeParserRuleCall_6_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__VariableAssignment_6_2_1"


    // $ANTLR start "rule__Read__ElementsAssignment_2"
    // InternalSeleniumDsl.g:3120:1: rule__Read__ElementsAssignment_2 : ( ruleElementType ) ;
    public final void rule__Read__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3124:1: ( ( ruleElementType ) )
            // InternalSeleniumDsl.g:3125:2: ( ruleElementType )
            {
            // InternalSeleniumDsl.g:3125:2: ( ruleElementType )
            // InternalSeleniumDsl.g:3126:3: ruleElementType
            {
             before(grammarAccess.getReadAccess().getElementsElementTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleElementType();

            state._fsp--;

             after(grammarAccess.getReadAccess().getElementsElementTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__ElementsAssignment_2"


    // $ANTLR start "rule__Read__ElementsAssignment_3_1"
    // InternalSeleniumDsl.g:3135:1: rule__Read__ElementsAssignment_3_1 : ( ruleElementType ) ;
    public final void rule__Read__ElementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3139:1: ( ( ruleElementType ) )
            // InternalSeleniumDsl.g:3140:2: ( ruleElementType )
            {
            // InternalSeleniumDsl.g:3140:2: ( ruleElementType )
            // InternalSeleniumDsl.g:3141:3: ruleElementType
            {
             before(grammarAccess.getReadAccess().getElementsElementTypeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElementType();

            state._fsp--;

             after(grammarAccess.getReadAccess().getElementsElementTypeParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__ElementsAssignment_3_1"


    // $ANTLR start "rule__Read__LinkTextAssignment_7"
    // InternalSeleniumDsl.g:3150:1: rule__Read__LinkTextAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Read__LinkTextAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3154:1: ( ( RULE_STRING ) )
            // InternalSeleniumDsl.g:3155:2: ( RULE_STRING )
            {
            // InternalSeleniumDsl.g:3155:2: ( RULE_STRING )
            // InternalSeleniumDsl.g:3156:3: RULE_STRING
            {
             before(grammarAccess.getReadAccess().getLinkTextSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getReadAccess().getLinkTextSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__LinkTextAssignment_7"


    // $ANTLR start "rule__Read__NumberAssignment_9"
    // InternalSeleniumDsl.g:3165:1: rule__Read__NumberAssignment_9 : ( RULE_INT ) ;
    public final void rule__Read__NumberAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3169:1: ( ( RULE_INT ) )
            // InternalSeleniumDsl.g:3170:2: ( RULE_INT )
            {
            // InternalSeleniumDsl.g:3170:2: ( RULE_INT )
            // InternalSeleniumDsl.g:3171:3: RULE_INT
            {
             before(grammarAccess.getReadAccess().getNumberINTTerminalRuleCall_9_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getReadAccess().getNumberINTTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__NumberAssignment_9"


    // $ANTLR start "rule__Combobox__ElementsAssignment_1"
    // InternalSeleniumDsl.g:3180:1: rule__Combobox__ElementsAssignment_1 : ( ruleSelector ) ;
    public final void rule__Combobox__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3184:1: ( ( ruleSelector ) )
            // InternalSeleniumDsl.g:3185:2: ( ruleSelector )
            {
            // InternalSeleniumDsl.g:3185:2: ( ruleSelector )
            // InternalSeleniumDsl.g:3186:3: ruleSelector
            {
             before(grammarAccess.getComboboxAccess().getElementsSelectorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getComboboxAccess().getElementsSelectorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Combobox__ElementsAssignment_1"


    // $ANTLR start "rule__Combobox__OptionAssignment_2"
    // InternalSeleniumDsl.g:3195:1: rule__Combobox__OptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Combobox__OptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3199:1: ( ( RULE_STRING ) )
            // InternalSeleniumDsl.g:3200:2: ( RULE_STRING )
            {
            // InternalSeleniumDsl.g:3200:2: ( RULE_STRING )
            // InternalSeleniumDsl.g:3201:3: RULE_STRING
            {
             before(grammarAccess.getComboboxAccess().getOptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getComboboxAccess().getOptionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Combobox__OptionAssignment_2"


    // $ANTLR start "rule__Combobox__ElementsAssignment_4"
    // InternalSeleniumDsl.g:3210:1: rule__Combobox__ElementsAssignment_4 : ( ruleSelector ) ;
    public final void rule__Combobox__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3214:1: ( ( ruleSelector ) )
            // InternalSeleniumDsl.g:3215:2: ( ruleSelector )
            {
            // InternalSeleniumDsl.g:3215:2: ( ruleSelector )
            // InternalSeleniumDsl.g:3216:3: ruleSelector
            {
             before(grammarAccess.getComboboxAccess().getElementsSelectorParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getComboboxAccess().getElementsSelectorParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Combobox__ElementsAssignment_4"


    // $ANTLR start "rule__Combobox__LabelAssignment_5"
    // InternalSeleniumDsl.g:3225:1: rule__Combobox__LabelAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Combobox__LabelAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3229:1: ( ( RULE_STRING ) )
            // InternalSeleniumDsl.g:3230:2: ( RULE_STRING )
            {
            // InternalSeleniumDsl.g:3230:2: ( RULE_STRING )
            // InternalSeleniumDsl.g:3231:3: RULE_STRING
            {
             before(grammarAccess.getComboboxAccess().getLabelSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getComboboxAccess().getLabelSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Combobox__LabelAssignment_5"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\15\1\20\12\uffff";
    static final String dfa_3s = "\1\41\1\42\12\uffff";
    static final String dfa_4s = "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\12\1\1\1\11";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\14\uffff\1\1",
            "\1\13\21\uffff\1\12",
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

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "519:1: rule__ElementType__Alternatives : ( ( ( rule__ElementType__Group_0__0 ) ) | ( 'checkboxes' ) | ( 'combobox' ) | ( 'option' ) | ( 'link' ) | ( 'button' ) | ( 'image' ) | ( 'url' ) | ( ( rule__ElementType__Group_8__0 ) ) | ( 'title' ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000A4288A200002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040070000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000002001FE000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000002201FE000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000240000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020040010000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000081000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0001000000000000L});

}