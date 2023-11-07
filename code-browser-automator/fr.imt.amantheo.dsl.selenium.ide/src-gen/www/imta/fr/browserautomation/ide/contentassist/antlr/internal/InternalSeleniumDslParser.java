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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_URL", "RULE_STRING", "RULE_INT", "RULE_DOMAIN", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'URL'", "'link'", "'button'", "'image'", "'url'", "'title'", "'open'", "'a'", "'browser'", "'window'", "'go'", "'to'", "'click'", "'on'", "'the'", "'variable'", "'fill'", "'text'", "'field'", "'with'", "'select'", "'checkbox'", "'values'", "','", "'verify'", "'that'", "'page'", "'contains'", "'string'", "'read'", "'of'", "'number'", "'uncheck'", "'all'", "'checkboxes'", "'choose'", "'option'", "'in'", "'combobox'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
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
    public static final int T__49=49;
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

                if ( (LA1_0==19||LA1_0==23||LA1_0==25||LA1_0==29||LA1_0==33||LA1_0==37||LA1_0==42||LA1_0==45||LA1_0==48) ) {
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


    // $ANTLR start "entryRuleSelect"
    // InternalSeleniumDsl.g:203:1: entryRuleSelect : ruleSelect EOF ;
    public final void entryRuleSelect() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:204:1: ( ruleSelect EOF )
            // InternalSeleniumDsl.g:205:1: ruleSelect EOF
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
    // InternalSeleniumDsl.g:212:1: ruleSelect : ( ( rule__Select__Group__0 ) ) ;
    public final void ruleSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:216:2: ( ( ( rule__Select__Group__0 ) ) )
            // InternalSeleniumDsl.g:217:2: ( ( rule__Select__Group__0 ) )
            {
            // InternalSeleniumDsl.g:217:2: ( ( rule__Select__Group__0 ) )
            // InternalSeleniumDsl.g:218:3: ( rule__Select__Group__0 )
            {
             before(grammarAccess.getSelectAccess().getGroup()); 
            // InternalSeleniumDsl.g:219:3: ( rule__Select__Group__0 )
            // InternalSeleniumDsl.g:219:4: rule__Select__Group__0
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
    // InternalSeleniumDsl.g:228:1: entryRuleVerify : ruleVerify EOF ;
    public final void entryRuleVerify() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:229:1: ( ruleVerify EOF )
            // InternalSeleniumDsl.g:230:1: ruleVerify EOF
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
    // InternalSeleniumDsl.g:237:1: ruleVerify : ( ( rule__Verify__Group__0 ) ) ;
    public final void ruleVerify() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:241:2: ( ( ( rule__Verify__Group__0 ) ) )
            // InternalSeleniumDsl.g:242:2: ( ( rule__Verify__Group__0 ) )
            {
            // InternalSeleniumDsl.g:242:2: ( ( rule__Verify__Group__0 ) )
            // InternalSeleniumDsl.g:243:3: ( rule__Verify__Group__0 )
            {
             before(grammarAccess.getVerifyAccess().getGroup()); 
            // InternalSeleniumDsl.g:244:3: ( rule__Verify__Group__0 )
            // InternalSeleniumDsl.g:244:4: rule__Verify__Group__0
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
    // InternalSeleniumDsl.g:253:1: entryRuleRead : ruleRead EOF ;
    public final void entryRuleRead() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:254:1: ( ruleRead EOF )
            // InternalSeleniumDsl.g:255:1: ruleRead EOF
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
    // InternalSeleniumDsl.g:262:1: ruleRead : ( ( rule__Read__Group__0 ) ) ;
    public final void ruleRead() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:266:2: ( ( ( rule__Read__Group__0 ) ) )
            // InternalSeleniumDsl.g:267:2: ( ( rule__Read__Group__0 ) )
            {
            // InternalSeleniumDsl.g:267:2: ( ( rule__Read__Group__0 ) )
            // InternalSeleniumDsl.g:268:3: ( rule__Read__Group__0 )
            {
             before(grammarAccess.getReadAccess().getGroup()); 
            // InternalSeleniumDsl.g:269:3: ( rule__Read__Group__0 )
            // InternalSeleniumDsl.g:269:4: rule__Read__Group__0
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
    // InternalSeleniumDsl.g:278:1: entryRuleUncheck : ruleUncheck EOF ;
    public final void entryRuleUncheck() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:279:1: ( ruleUncheck EOF )
            // InternalSeleniumDsl.g:280:1: ruleUncheck EOF
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
    // InternalSeleniumDsl.g:287:1: ruleUncheck : ( ( rule__Uncheck__Group__0 ) ) ;
    public final void ruleUncheck() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:291:2: ( ( ( rule__Uncheck__Group__0 ) ) )
            // InternalSeleniumDsl.g:292:2: ( ( rule__Uncheck__Group__0 ) )
            {
            // InternalSeleniumDsl.g:292:2: ( ( rule__Uncheck__Group__0 ) )
            // InternalSeleniumDsl.g:293:3: ( rule__Uncheck__Group__0 )
            {
             before(grammarAccess.getUncheckAccess().getGroup()); 
            // InternalSeleniumDsl.g:294:3: ( rule__Uncheck__Group__0 )
            // InternalSeleniumDsl.g:294:4: rule__Uncheck__Group__0
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
    // InternalSeleniumDsl.g:303:1: entryRuleCombobox : ruleCombobox EOF ;
    public final void entryRuleCombobox() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:304:1: ( ruleCombobox EOF )
            // InternalSeleniumDsl.g:305:1: ruleCombobox EOF
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
    // InternalSeleniumDsl.g:312:1: ruleCombobox : ( ( rule__Combobox__Group__0 ) ) ;
    public final void ruleCombobox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:316:2: ( ( ( rule__Combobox__Group__0 ) ) )
            // InternalSeleniumDsl.g:317:2: ( ( rule__Combobox__Group__0 ) )
            {
            // InternalSeleniumDsl.g:317:2: ( ( rule__Combobox__Group__0 ) )
            // InternalSeleniumDsl.g:318:3: ( rule__Combobox__Group__0 )
            {
             before(grammarAccess.getComboboxAccess().getGroup()); 
            // InternalSeleniumDsl.g:319:3: ( rule__Combobox__Group__0 )
            // InternalSeleniumDsl.g:319:4: rule__Combobox__Group__0
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


    // $ANTLR start "entryRuleDOMELEMENT"
    // InternalSeleniumDsl.g:328:1: entryRuleDOMELEMENT : ruleDOMELEMENT EOF ;
    public final void entryRuleDOMELEMENT() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:329:1: ( ruleDOMELEMENT EOF )
            // InternalSeleniumDsl.g:330:1: ruleDOMELEMENT EOF
            {
             before(grammarAccess.getDOMELEMENTRule()); 
            pushFollow(FOLLOW_1);
            ruleDOMELEMENT();

            state._fsp--;

             after(grammarAccess.getDOMELEMENTRule()); 
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
    // $ANTLR end "entryRuleDOMELEMENT"


    // $ANTLR start "ruleDOMELEMENT"
    // InternalSeleniumDsl.g:337:1: ruleDOMELEMENT : ( ( rule__DOMELEMENT__Alternatives ) ) ;
    public final void ruleDOMELEMENT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:341:2: ( ( ( rule__DOMELEMENT__Alternatives ) ) )
            // InternalSeleniumDsl.g:342:2: ( ( rule__DOMELEMENT__Alternatives ) )
            {
            // InternalSeleniumDsl.g:342:2: ( ( rule__DOMELEMENT__Alternatives ) )
            // InternalSeleniumDsl.g:343:3: ( rule__DOMELEMENT__Alternatives )
            {
             before(grammarAccess.getDOMELEMENTAccess().getAlternatives()); 
            // InternalSeleniumDsl.g:344:3: ( rule__DOMELEMENT__Alternatives )
            // InternalSeleniumDsl.g:344:4: rule__DOMELEMENT__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DOMELEMENT__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDOMELEMENTAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDOMELEMENT"


    // $ANTLR start "entryRuleDynamicURL"
    // InternalSeleniumDsl.g:353:1: entryRuleDynamicURL : ruleDynamicURL EOF ;
    public final void entryRuleDynamicURL() throws RecognitionException {
        try {
            // InternalSeleniumDsl.g:354:1: ( ruleDynamicURL EOF )
            // InternalSeleniumDsl.g:355:1: ruleDynamicURL EOF
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
    // InternalSeleniumDsl.g:362:1: ruleDynamicURL : ( ( rule__DynamicURL__Alternatives ) ) ;
    public final void ruleDynamicURL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:366:2: ( ( ( rule__DynamicURL__Alternatives ) ) )
            // InternalSeleniumDsl.g:367:2: ( ( rule__DynamicURL__Alternatives ) )
            {
            // InternalSeleniumDsl.g:367:2: ( ( rule__DynamicURL__Alternatives ) )
            // InternalSeleniumDsl.g:368:3: ( rule__DynamicURL__Alternatives )
            {
             before(grammarAccess.getDynamicURLAccess().getAlternatives()); 
            // InternalSeleniumDsl.g:369:3: ( rule__DynamicURL__Alternatives )
            // InternalSeleniumDsl.g:369:4: rule__DynamicURL__Alternatives
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
    // InternalSeleniumDsl.g:377:1: rule__Command__Alternatives : ( ( ruleOpenBrowser ) | ( ruleGoTo ) | ( ruleClick ) | ( ruleFill ) | ( ruleSelect ) | ( ruleVerify ) | ( ruleRead ) | ( ruleUncheck ) | ( ruleCombobox ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:381:1: ( ( ruleOpenBrowser ) | ( ruleGoTo ) | ( ruleClick ) | ( ruleFill ) | ( ruleSelect ) | ( ruleVerify ) | ( ruleRead ) | ( ruleUncheck ) | ( ruleCombobox ) )
            int alt2=9;
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
            case 25:
                {
                alt2=3;
                }
                break;
            case 29:
                {
                alt2=4;
                }
                break;
            case 33:
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
            case 48:
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
                    // InternalSeleniumDsl.g:382:2: ( ruleOpenBrowser )
                    {
                    // InternalSeleniumDsl.g:382:2: ( ruleOpenBrowser )
                    // InternalSeleniumDsl.g:383:3: ruleOpenBrowser
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
                    // InternalSeleniumDsl.g:388:2: ( ruleGoTo )
                    {
                    // InternalSeleniumDsl.g:388:2: ( ruleGoTo )
                    // InternalSeleniumDsl.g:389:3: ruleGoTo
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
                    // InternalSeleniumDsl.g:394:2: ( ruleClick )
                    {
                    // InternalSeleniumDsl.g:394:2: ( ruleClick )
                    // InternalSeleniumDsl.g:395:3: ruleClick
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
                    // InternalSeleniumDsl.g:400:2: ( ruleFill )
                    {
                    // InternalSeleniumDsl.g:400:2: ( ruleFill )
                    // InternalSeleniumDsl.g:401:3: ruleFill
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
                    // InternalSeleniumDsl.g:406:2: ( ruleSelect )
                    {
                    // InternalSeleniumDsl.g:406:2: ( ruleSelect )
                    // InternalSeleniumDsl.g:407:3: ruleSelect
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
                    // InternalSeleniumDsl.g:412:2: ( ruleVerify )
                    {
                    // InternalSeleniumDsl.g:412:2: ( ruleVerify )
                    // InternalSeleniumDsl.g:413:3: ruleVerify
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
                    // InternalSeleniumDsl.g:418:2: ( ruleRead )
                    {
                    // InternalSeleniumDsl.g:418:2: ( ruleRead )
                    // InternalSeleniumDsl.g:419:3: ruleRead
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
                    // InternalSeleniumDsl.g:424:2: ( ruleUncheck )
                    {
                    // InternalSeleniumDsl.g:424:2: ( ruleUncheck )
                    // InternalSeleniumDsl.g:425:3: ruleUncheck
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
                    // InternalSeleniumDsl.g:430:2: ( ruleCombobox )
                    {
                    // InternalSeleniumDsl.g:430:2: ( ruleCombobox )
                    // InternalSeleniumDsl.g:431:3: ruleCombobox
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


    // $ANTLR start "rule__GoTo__Alternatives_3"
    // InternalSeleniumDsl.g:440:1: rule__GoTo__Alternatives_3 : ( ( ( rule__GoTo__UrlAssignment_3_0 ) ) | ( 'URL' ) );
    public final void rule__GoTo__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:444:1: ( ( ( rule__GoTo__UrlAssignment_3_0 ) ) | ( 'URL' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_URL && LA3_0<=RULE_STRING)) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSeleniumDsl.g:445:2: ( ( rule__GoTo__UrlAssignment_3_0 ) )
                    {
                    // InternalSeleniumDsl.g:445:2: ( ( rule__GoTo__UrlAssignment_3_0 ) )
                    // InternalSeleniumDsl.g:446:3: ( rule__GoTo__UrlAssignment_3_0 )
                    {
                     before(grammarAccess.getGoToAccess().getUrlAssignment_3_0()); 
                    // InternalSeleniumDsl.g:447:3: ( rule__GoTo__UrlAssignment_3_0 )
                    // InternalSeleniumDsl.g:447:4: rule__GoTo__UrlAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GoTo__UrlAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGoToAccess().getUrlAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDsl.g:451:2: ( 'URL' )
                    {
                    // InternalSeleniumDsl.g:451:2: ( 'URL' )
                    // InternalSeleniumDsl.g:452:3: 'URL'
                    {
                     before(grammarAccess.getGoToAccess().getURLKeyword_3_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getGoToAccess().getURLKeyword_3_1()); 

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
    // $ANTLR end "rule__GoTo__Alternatives_3"


    // $ANTLR start "rule__Click__Alternatives_4"
    // InternalSeleniumDsl.g:461:1: rule__Click__Alternatives_4 : ( ( ( rule__Click__Group_4_0__0 ) ) | ( ( rule__Click__Group_4_1__0 ) ) | ( ( rule__Click__Group_4_2__0 ) ) | ( ( rule__Click__Group_4_3__0 ) ) );
    public final void rule__Click__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:465:1: ( ( ( rule__Click__Group_4_0__0 ) ) | ( ( rule__Click__Group_4_1__0 ) ) | ( ( rule__Click__Group_4_2__0 ) ) | ( ( rule__Click__Group_4_3__0 ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            case 28:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSeleniumDsl.g:466:2: ( ( rule__Click__Group_4_0__0 ) )
                    {
                    // InternalSeleniumDsl.g:466:2: ( ( rule__Click__Group_4_0__0 ) )
                    // InternalSeleniumDsl.g:467:3: ( rule__Click__Group_4_0__0 )
                    {
                     before(grammarAccess.getClickAccess().getGroup_4_0()); 
                    // InternalSeleniumDsl.g:468:3: ( rule__Click__Group_4_0__0 )
                    // InternalSeleniumDsl.g:468:4: rule__Click__Group_4_0__0
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
                    // InternalSeleniumDsl.g:472:2: ( ( rule__Click__Group_4_1__0 ) )
                    {
                    // InternalSeleniumDsl.g:472:2: ( ( rule__Click__Group_4_1__0 ) )
                    // InternalSeleniumDsl.g:473:3: ( rule__Click__Group_4_1__0 )
                    {
                     before(grammarAccess.getClickAccess().getGroup_4_1()); 
                    // InternalSeleniumDsl.g:474:3: ( rule__Click__Group_4_1__0 )
                    // InternalSeleniumDsl.g:474:4: rule__Click__Group_4_1__0
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
                    // InternalSeleniumDsl.g:478:2: ( ( rule__Click__Group_4_2__0 ) )
                    {
                    // InternalSeleniumDsl.g:478:2: ( ( rule__Click__Group_4_2__0 ) )
                    // InternalSeleniumDsl.g:479:3: ( rule__Click__Group_4_2__0 )
                    {
                     before(grammarAccess.getClickAccess().getGroup_4_2()); 
                    // InternalSeleniumDsl.g:480:3: ( rule__Click__Group_4_2__0 )
                    // InternalSeleniumDsl.g:480:4: rule__Click__Group_4_2__0
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
                    // InternalSeleniumDsl.g:484:2: ( ( rule__Click__Group_4_3__0 ) )
                    {
                    // InternalSeleniumDsl.g:484:2: ( ( rule__Click__Group_4_3__0 ) )
                    // InternalSeleniumDsl.g:485:3: ( rule__Click__Group_4_3__0 )
                    {
                     before(grammarAccess.getClickAccess().getGroup_4_3()); 
                    // InternalSeleniumDsl.g:486:3: ( rule__Click__Group_4_3__0 )
                    // InternalSeleniumDsl.g:486:4: rule__Click__Group_4_3__0
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


    // $ANTLR start "rule__Fill__Alternatives_7"
    // InternalSeleniumDsl.g:494:1: rule__Fill__Alternatives_7 : ( ( ( rule__Fill__Group_7_0__0 ) ) | ( ( rule__Fill__Group_7_1__0 ) ) );
    public final void rule__Fill__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:498:1: ( ( ( rule__Fill__Group_7_0__0 ) ) | ( ( rule__Fill__Group_7_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==30) ) {
                alt5=1;
            }
            else if ( (LA5_0==28) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSeleniumDsl.g:499:2: ( ( rule__Fill__Group_7_0__0 ) )
                    {
                    // InternalSeleniumDsl.g:499:2: ( ( rule__Fill__Group_7_0__0 ) )
                    // InternalSeleniumDsl.g:500:3: ( rule__Fill__Group_7_0__0 )
                    {
                     before(grammarAccess.getFillAccess().getGroup_7_0()); 
                    // InternalSeleniumDsl.g:501:3: ( rule__Fill__Group_7_0__0 )
                    // InternalSeleniumDsl.g:501:4: rule__Fill__Group_7_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Fill__Group_7_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFillAccess().getGroup_7_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDsl.g:505:2: ( ( rule__Fill__Group_7_1__0 ) )
                    {
                    // InternalSeleniumDsl.g:505:2: ( ( rule__Fill__Group_7_1__0 ) )
                    // InternalSeleniumDsl.g:506:3: ( rule__Fill__Group_7_1__0 )
                    {
                     before(grammarAccess.getFillAccess().getGroup_7_1()); 
                    // InternalSeleniumDsl.g:507:3: ( rule__Fill__Group_7_1__0 )
                    // InternalSeleniumDsl.g:507:4: rule__Fill__Group_7_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Fill__Group_7_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFillAccess().getGroup_7_1()); 

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
    // $ANTLR end "rule__Fill__Alternatives_7"


    // $ANTLR start "rule__Verify__Alternatives_7"
    // InternalSeleniumDsl.g:515:1: rule__Verify__Alternatives_7 : ( ( ( rule__Verify__Group_7_0__0 ) ) | ( ( rule__Verify__Group_7_1__0 ) ) | ( ( rule__Verify__Group_7_2__0 ) ) );
    public final void rule__Verify__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:519:1: ( ( ( rule__Verify__Group_7_0__0 ) ) | ( ( rule__Verify__Group_7_1__0 ) ) | ( ( rule__Verify__Group_7_2__0 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt6=1;
                }
                break;
            case 14:
                {
                alt6=2;
                }
                break;
            case 28:
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
                    // InternalSeleniumDsl.g:520:2: ( ( rule__Verify__Group_7_0__0 ) )
                    {
                    // InternalSeleniumDsl.g:520:2: ( ( rule__Verify__Group_7_0__0 ) )
                    // InternalSeleniumDsl.g:521:3: ( rule__Verify__Group_7_0__0 )
                    {
                     before(grammarAccess.getVerifyAccess().getGroup_7_0()); 
                    // InternalSeleniumDsl.g:522:3: ( rule__Verify__Group_7_0__0 )
                    // InternalSeleniumDsl.g:522:4: rule__Verify__Group_7_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Verify__Group_7_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVerifyAccess().getGroup_7_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDsl.g:526:2: ( ( rule__Verify__Group_7_1__0 ) )
                    {
                    // InternalSeleniumDsl.g:526:2: ( ( rule__Verify__Group_7_1__0 ) )
                    // InternalSeleniumDsl.g:527:3: ( rule__Verify__Group_7_1__0 )
                    {
                     before(grammarAccess.getVerifyAccess().getGroup_7_1()); 
                    // InternalSeleniumDsl.g:528:3: ( rule__Verify__Group_7_1__0 )
                    // InternalSeleniumDsl.g:528:4: rule__Verify__Group_7_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Verify__Group_7_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVerifyAccess().getGroup_7_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSeleniumDsl.g:532:2: ( ( rule__Verify__Group_7_2__0 ) )
                    {
                    // InternalSeleniumDsl.g:532:2: ( ( rule__Verify__Group_7_2__0 ) )
                    // InternalSeleniumDsl.g:533:3: ( rule__Verify__Group_7_2__0 )
                    {
                     before(grammarAccess.getVerifyAccess().getGroup_7_2()); 
                    // InternalSeleniumDsl.g:534:3: ( rule__Verify__Group_7_2__0 )
                    // InternalSeleniumDsl.g:534:4: rule__Verify__Group_7_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Verify__Group_7_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVerifyAccess().getGroup_7_2()); 

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
    // $ANTLR end "rule__Verify__Alternatives_7"


    // $ANTLR start "rule__DOMELEMENT__Alternatives"
    // InternalSeleniumDsl.g:542:1: rule__DOMELEMENT__Alternatives : ( ( 'link' ) | ( 'button' ) | ( 'image' ) | ( 'url' ) | ( ( rule__DOMELEMENT__Group_4__0 ) ) | ( 'title' ) );
    public final void rule__DOMELEMENT__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:546:1: ( ( 'link' ) | ( 'button' ) | ( 'image' ) | ( 'url' ) | ( ( rule__DOMELEMENT__Group_4__0 ) ) | ( 'title' ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt7=1;
                }
                break;
            case 15:
                {
                alt7=2;
                }
                break;
            case 16:
                {
                alt7=3;
                }
                break;
            case 17:
                {
                alt7=4;
                }
                break;
            case 30:
                {
                alt7=5;
                }
                break;
            case 18:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSeleniumDsl.g:547:2: ( 'link' )
                    {
                    // InternalSeleniumDsl.g:547:2: ( 'link' )
                    // InternalSeleniumDsl.g:548:3: 'link'
                    {
                     before(grammarAccess.getDOMELEMENTAccess().getLinkKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getDOMELEMENTAccess().getLinkKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDsl.g:553:2: ( 'button' )
                    {
                    // InternalSeleniumDsl.g:553:2: ( 'button' )
                    // InternalSeleniumDsl.g:554:3: 'button'
                    {
                     before(grammarAccess.getDOMELEMENTAccess().getButtonKeyword_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getDOMELEMENTAccess().getButtonKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSeleniumDsl.g:559:2: ( 'image' )
                    {
                    // InternalSeleniumDsl.g:559:2: ( 'image' )
                    // InternalSeleniumDsl.g:560:3: 'image'
                    {
                     before(grammarAccess.getDOMELEMENTAccess().getImageKeyword_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getDOMELEMENTAccess().getImageKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSeleniumDsl.g:565:2: ( 'url' )
                    {
                    // InternalSeleniumDsl.g:565:2: ( 'url' )
                    // InternalSeleniumDsl.g:566:3: 'url'
                    {
                     before(grammarAccess.getDOMELEMENTAccess().getUrlKeyword_3()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getDOMELEMENTAccess().getUrlKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSeleniumDsl.g:571:2: ( ( rule__DOMELEMENT__Group_4__0 ) )
                    {
                    // InternalSeleniumDsl.g:571:2: ( ( rule__DOMELEMENT__Group_4__0 ) )
                    // InternalSeleniumDsl.g:572:3: ( rule__DOMELEMENT__Group_4__0 )
                    {
                     before(grammarAccess.getDOMELEMENTAccess().getGroup_4()); 
                    // InternalSeleniumDsl.g:573:3: ( rule__DOMELEMENT__Group_4__0 )
                    // InternalSeleniumDsl.g:573:4: rule__DOMELEMENT__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DOMELEMENT__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDOMELEMENTAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSeleniumDsl.g:577:2: ( 'title' )
                    {
                    // InternalSeleniumDsl.g:577:2: ( 'title' )
                    // InternalSeleniumDsl.g:578:3: 'title'
                    {
                     before(grammarAccess.getDOMELEMENTAccess().getTitleKeyword_5()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getDOMELEMENTAccess().getTitleKeyword_5()); 

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
    // $ANTLR end "rule__DOMELEMENT__Alternatives"


    // $ANTLR start "rule__DynamicURL__Alternatives"
    // InternalSeleniumDsl.g:587:1: rule__DynamicURL__Alternatives : ( ( RULE_URL ) | ( RULE_STRING ) );
    public final void rule__DynamicURL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:591:1: ( ( RULE_URL ) | ( RULE_STRING ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_URL) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_STRING) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSeleniumDsl.g:592:2: ( RULE_URL )
                    {
                    // InternalSeleniumDsl.g:592:2: ( RULE_URL )
                    // InternalSeleniumDsl.g:593:3: RULE_URL
                    {
                     before(grammarAccess.getDynamicURLAccess().getURLTerminalRuleCall_0()); 
                    match(input,RULE_URL,FOLLOW_2); 
                     after(grammarAccess.getDynamicURLAccess().getURLTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDsl.g:598:2: ( RULE_STRING )
                    {
                    // InternalSeleniumDsl.g:598:2: ( RULE_STRING )
                    // InternalSeleniumDsl.g:599:3: RULE_STRING
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
    // InternalSeleniumDsl.g:608:1: rule__OpenBrowser__Group__0 : rule__OpenBrowser__Group__0__Impl rule__OpenBrowser__Group__1 ;
    public final void rule__OpenBrowser__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:612:1: ( rule__OpenBrowser__Group__0__Impl rule__OpenBrowser__Group__1 )
            // InternalSeleniumDsl.g:613:2: rule__OpenBrowser__Group__0__Impl rule__OpenBrowser__Group__1
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
    // InternalSeleniumDsl.g:620:1: rule__OpenBrowser__Group__0__Impl : ( () ) ;
    public final void rule__OpenBrowser__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:624:1: ( ( () ) )
            // InternalSeleniumDsl.g:625:1: ( () )
            {
            // InternalSeleniumDsl.g:625:1: ( () )
            // InternalSeleniumDsl.g:626:2: ()
            {
             before(grammarAccess.getOpenBrowserAccess().getOpenBrowserAction_0()); 
            // InternalSeleniumDsl.g:627:2: ()
            // InternalSeleniumDsl.g:627:3: 
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
    // InternalSeleniumDsl.g:635:1: rule__OpenBrowser__Group__1 : rule__OpenBrowser__Group__1__Impl rule__OpenBrowser__Group__2 ;
    public final void rule__OpenBrowser__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:639:1: ( rule__OpenBrowser__Group__1__Impl rule__OpenBrowser__Group__2 )
            // InternalSeleniumDsl.g:640:2: rule__OpenBrowser__Group__1__Impl rule__OpenBrowser__Group__2
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
    // InternalSeleniumDsl.g:647:1: rule__OpenBrowser__Group__1__Impl : ( 'open' ) ;
    public final void rule__OpenBrowser__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:651:1: ( ( 'open' ) )
            // InternalSeleniumDsl.g:652:1: ( 'open' )
            {
            // InternalSeleniumDsl.g:652:1: ( 'open' )
            // InternalSeleniumDsl.g:653:2: 'open'
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
    // InternalSeleniumDsl.g:662:1: rule__OpenBrowser__Group__2 : rule__OpenBrowser__Group__2__Impl rule__OpenBrowser__Group__3 ;
    public final void rule__OpenBrowser__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:666:1: ( rule__OpenBrowser__Group__2__Impl rule__OpenBrowser__Group__3 )
            // InternalSeleniumDsl.g:667:2: rule__OpenBrowser__Group__2__Impl rule__OpenBrowser__Group__3
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
    // InternalSeleniumDsl.g:674:1: rule__OpenBrowser__Group__2__Impl : ( 'a' ) ;
    public final void rule__OpenBrowser__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:678:1: ( ( 'a' ) )
            // InternalSeleniumDsl.g:679:1: ( 'a' )
            {
            // InternalSeleniumDsl.g:679:1: ( 'a' )
            // InternalSeleniumDsl.g:680:2: 'a'
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
    // InternalSeleniumDsl.g:689:1: rule__OpenBrowser__Group__3 : rule__OpenBrowser__Group__3__Impl rule__OpenBrowser__Group__4 ;
    public final void rule__OpenBrowser__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:693:1: ( rule__OpenBrowser__Group__3__Impl rule__OpenBrowser__Group__4 )
            // InternalSeleniumDsl.g:694:2: rule__OpenBrowser__Group__3__Impl rule__OpenBrowser__Group__4
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
    // InternalSeleniumDsl.g:701:1: rule__OpenBrowser__Group__3__Impl : ( 'browser' ) ;
    public final void rule__OpenBrowser__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:705:1: ( ( 'browser' ) )
            // InternalSeleniumDsl.g:706:1: ( 'browser' )
            {
            // InternalSeleniumDsl.g:706:1: ( 'browser' )
            // InternalSeleniumDsl.g:707:2: 'browser'
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
    // InternalSeleniumDsl.g:716:1: rule__OpenBrowser__Group__4 : rule__OpenBrowser__Group__4__Impl ;
    public final void rule__OpenBrowser__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:720:1: ( rule__OpenBrowser__Group__4__Impl )
            // InternalSeleniumDsl.g:721:2: rule__OpenBrowser__Group__4__Impl
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
    // InternalSeleniumDsl.g:727:1: rule__OpenBrowser__Group__4__Impl : ( 'window' ) ;
    public final void rule__OpenBrowser__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:731:1: ( ( 'window' ) )
            // InternalSeleniumDsl.g:732:1: ( 'window' )
            {
            // InternalSeleniumDsl.g:732:1: ( 'window' )
            // InternalSeleniumDsl.g:733:2: 'window'
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
    // InternalSeleniumDsl.g:743:1: rule__GoTo__Group__0 : rule__GoTo__Group__0__Impl rule__GoTo__Group__1 ;
    public final void rule__GoTo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:747:1: ( rule__GoTo__Group__0__Impl rule__GoTo__Group__1 )
            // InternalSeleniumDsl.g:748:2: rule__GoTo__Group__0__Impl rule__GoTo__Group__1
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
    // InternalSeleniumDsl.g:755:1: rule__GoTo__Group__0__Impl : ( 'go' ) ;
    public final void rule__GoTo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:759:1: ( ( 'go' ) )
            // InternalSeleniumDsl.g:760:1: ( 'go' )
            {
            // InternalSeleniumDsl.g:760:1: ( 'go' )
            // InternalSeleniumDsl.g:761:2: 'go'
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
    // InternalSeleniumDsl.g:770:1: rule__GoTo__Group__1 : rule__GoTo__Group__1__Impl rule__GoTo__Group__2 ;
    public final void rule__GoTo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:774:1: ( rule__GoTo__Group__1__Impl rule__GoTo__Group__2 )
            // InternalSeleniumDsl.g:775:2: rule__GoTo__Group__1__Impl rule__GoTo__Group__2
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
    // InternalSeleniumDsl.g:782:1: rule__GoTo__Group__1__Impl : ( 'to' ) ;
    public final void rule__GoTo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:786:1: ( ( 'to' ) )
            // InternalSeleniumDsl.g:787:1: ( 'to' )
            {
            // InternalSeleniumDsl.g:787:1: ( 'to' )
            // InternalSeleniumDsl.g:788:2: 'to'
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
    // InternalSeleniumDsl.g:797:1: rule__GoTo__Group__2 : rule__GoTo__Group__2__Impl rule__GoTo__Group__3 ;
    public final void rule__GoTo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:801:1: ( rule__GoTo__Group__2__Impl rule__GoTo__Group__3 )
            // InternalSeleniumDsl.g:802:2: rule__GoTo__Group__2__Impl rule__GoTo__Group__3
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
    // InternalSeleniumDsl.g:809:1: rule__GoTo__Group__2__Impl : ( 'url' ) ;
    public final void rule__GoTo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:813:1: ( ( 'url' ) )
            // InternalSeleniumDsl.g:814:1: ( 'url' )
            {
            // InternalSeleniumDsl.g:814:1: ( 'url' )
            // InternalSeleniumDsl.g:815:2: 'url'
            {
             before(grammarAccess.getGoToAccess().getUrlKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:824:1: rule__GoTo__Group__3 : rule__GoTo__Group__3__Impl ;
    public final void rule__GoTo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:828:1: ( rule__GoTo__Group__3__Impl )
            // InternalSeleniumDsl.g:829:2: rule__GoTo__Group__3__Impl
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
    // InternalSeleniumDsl.g:835:1: rule__GoTo__Group__3__Impl : ( ( rule__GoTo__Alternatives_3 )? ) ;
    public final void rule__GoTo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:839:1: ( ( ( rule__GoTo__Alternatives_3 )? ) )
            // InternalSeleniumDsl.g:840:1: ( ( rule__GoTo__Alternatives_3 )? )
            {
            // InternalSeleniumDsl.g:840:1: ( ( rule__GoTo__Alternatives_3 )? )
            // InternalSeleniumDsl.g:841:2: ( rule__GoTo__Alternatives_3 )?
            {
             before(grammarAccess.getGoToAccess().getAlternatives_3()); 
            // InternalSeleniumDsl.g:842:2: ( rule__GoTo__Alternatives_3 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_URL && LA9_0<=RULE_STRING)||LA9_0==13) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSeleniumDsl.g:842:3: rule__GoTo__Alternatives_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__GoTo__Alternatives_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGoToAccess().getAlternatives_3()); 

            }


            }

        }
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
    // InternalSeleniumDsl.g:851:1: rule__Click__Group__0 : rule__Click__Group__0__Impl rule__Click__Group__1 ;
    public final void rule__Click__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:855:1: ( rule__Click__Group__0__Impl rule__Click__Group__1 )
            // InternalSeleniumDsl.g:856:2: rule__Click__Group__0__Impl rule__Click__Group__1
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
    // InternalSeleniumDsl.g:863:1: rule__Click__Group__0__Impl : ( () ) ;
    public final void rule__Click__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:867:1: ( ( () ) )
            // InternalSeleniumDsl.g:868:1: ( () )
            {
            // InternalSeleniumDsl.g:868:1: ( () )
            // InternalSeleniumDsl.g:869:2: ()
            {
             before(grammarAccess.getClickAccess().getClickAction_0()); 
            // InternalSeleniumDsl.g:870:2: ()
            // InternalSeleniumDsl.g:870:3: 
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
    // InternalSeleniumDsl.g:878:1: rule__Click__Group__1 : rule__Click__Group__1__Impl rule__Click__Group__2 ;
    public final void rule__Click__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:882:1: ( rule__Click__Group__1__Impl rule__Click__Group__2 )
            // InternalSeleniumDsl.g:883:2: rule__Click__Group__1__Impl rule__Click__Group__2
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
    // InternalSeleniumDsl.g:890:1: rule__Click__Group__1__Impl : ( 'click' ) ;
    public final void rule__Click__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:894:1: ( ( 'click' ) )
            // InternalSeleniumDsl.g:895:1: ( 'click' )
            {
            // InternalSeleniumDsl.g:895:1: ( 'click' )
            // InternalSeleniumDsl.g:896:2: 'click'
            {
             before(grammarAccess.getClickAccess().getClickKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:905:1: rule__Click__Group__2 : rule__Click__Group__2__Impl rule__Click__Group__3 ;
    public final void rule__Click__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:909:1: ( rule__Click__Group__2__Impl rule__Click__Group__3 )
            // InternalSeleniumDsl.g:910:2: rule__Click__Group__2__Impl rule__Click__Group__3
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
    // InternalSeleniumDsl.g:917:1: rule__Click__Group__2__Impl : ( 'on' ) ;
    public final void rule__Click__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:921:1: ( ( 'on' ) )
            // InternalSeleniumDsl.g:922:1: ( 'on' )
            {
            // InternalSeleniumDsl.g:922:1: ( 'on' )
            // InternalSeleniumDsl.g:923:2: 'on'
            {
             before(grammarAccess.getClickAccess().getOnKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:932:1: rule__Click__Group__3 : rule__Click__Group__3__Impl rule__Click__Group__4 ;
    public final void rule__Click__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:936:1: ( rule__Click__Group__3__Impl rule__Click__Group__4 )
            // InternalSeleniumDsl.g:937:2: rule__Click__Group__3__Impl rule__Click__Group__4
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
    // InternalSeleniumDsl.g:944:1: rule__Click__Group__3__Impl : ( 'the' ) ;
    public final void rule__Click__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:948:1: ( ( 'the' ) )
            // InternalSeleniumDsl.g:949:1: ( 'the' )
            {
            // InternalSeleniumDsl.g:949:1: ( 'the' )
            // InternalSeleniumDsl.g:950:2: 'the'
            {
             before(grammarAccess.getClickAccess().getTheKeyword_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:959:1: rule__Click__Group__4 : rule__Click__Group__4__Impl ;
    public final void rule__Click__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:963:1: ( rule__Click__Group__4__Impl )
            // InternalSeleniumDsl.g:964:2: rule__Click__Group__4__Impl
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
    // InternalSeleniumDsl.g:970:1: rule__Click__Group__4__Impl : ( ( rule__Click__Alternatives_4 ) ) ;
    public final void rule__Click__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:974:1: ( ( ( rule__Click__Alternatives_4 ) ) )
            // InternalSeleniumDsl.g:975:1: ( ( rule__Click__Alternatives_4 ) )
            {
            // InternalSeleniumDsl.g:975:1: ( ( rule__Click__Alternatives_4 ) )
            // InternalSeleniumDsl.g:976:2: ( rule__Click__Alternatives_4 )
            {
             before(grammarAccess.getClickAccess().getAlternatives_4()); 
            // InternalSeleniumDsl.g:977:2: ( rule__Click__Alternatives_4 )
            // InternalSeleniumDsl.g:977:3: rule__Click__Alternatives_4
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
    // InternalSeleniumDsl.g:986:1: rule__Click__Group_4_0__0 : rule__Click__Group_4_0__0__Impl rule__Click__Group_4_0__1 ;
    public final void rule__Click__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:990:1: ( rule__Click__Group_4_0__0__Impl rule__Click__Group_4_0__1 )
            // InternalSeleniumDsl.g:991:2: rule__Click__Group_4_0__0__Impl rule__Click__Group_4_0__1
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
    // InternalSeleniumDsl.g:998:1: rule__Click__Group_4_0__0__Impl : ( 'link' ) ;
    public final void rule__Click__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1002:1: ( ( 'link' ) )
            // InternalSeleniumDsl.g:1003:1: ( 'link' )
            {
            // InternalSeleniumDsl.g:1003:1: ( 'link' )
            // InternalSeleniumDsl.g:1004:2: 'link'
            {
             before(grammarAccess.getClickAccess().getLinkKeyword_4_0_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1013:1: rule__Click__Group_4_0__1 : rule__Click__Group_4_0__1__Impl ;
    public final void rule__Click__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1017:1: ( rule__Click__Group_4_0__1__Impl )
            // InternalSeleniumDsl.g:1018:2: rule__Click__Group_4_0__1__Impl
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
    // InternalSeleniumDsl.g:1024:1: rule__Click__Group_4_0__1__Impl : ( ( rule__Click__LinkTextAssignment_4_0_1 ) ) ;
    public final void rule__Click__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1028:1: ( ( ( rule__Click__LinkTextAssignment_4_0_1 ) ) )
            // InternalSeleniumDsl.g:1029:1: ( ( rule__Click__LinkTextAssignment_4_0_1 ) )
            {
            // InternalSeleniumDsl.g:1029:1: ( ( rule__Click__LinkTextAssignment_4_0_1 ) )
            // InternalSeleniumDsl.g:1030:2: ( rule__Click__LinkTextAssignment_4_0_1 )
            {
             before(grammarAccess.getClickAccess().getLinkTextAssignment_4_0_1()); 
            // InternalSeleniumDsl.g:1031:2: ( rule__Click__LinkTextAssignment_4_0_1 )
            // InternalSeleniumDsl.g:1031:3: rule__Click__LinkTextAssignment_4_0_1
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
    // InternalSeleniumDsl.g:1040:1: rule__Click__Group_4_1__0 : rule__Click__Group_4_1__0__Impl rule__Click__Group_4_1__1 ;
    public final void rule__Click__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1044:1: ( rule__Click__Group_4_1__0__Impl rule__Click__Group_4_1__1 )
            // InternalSeleniumDsl.g:1045:2: rule__Click__Group_4_1__0__Impl rule__Click__Group_4_1__1
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
    // InternalSeleniumDsl.g:1052:1: rule__Click__Group_4_1__0__Impl : ( 'button' ) ;
    public final void rule__Click__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1056:1: ( ( 'button' ) )
            // InternalSeleniumDsl.g:1057:1: ( 'button' )
            {
            // InternalSeleniumDsl.g:1057:1: ( 'button' )
            // InternalSeleniumDsl.g:1058:2: 'button'
            {
             before(grammarAccess.getClickAccess().getButtonKeyword_4_1_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1067:1: rule__Click__Group_4_1__1 : rule__Click__Group_4_1__1__Impl ;
    public final void rule__Click__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1071:1: ( rule__Click__Group_4_1__1__Impl )
            // InternalSeleniumDsl.g:1072:2: rule__Click__Group_4_1__1__Impl
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
    // InternalSeleniumDsl.g:1078:1: rule__Click__Group_4_1__1__Impl : ( ( rule__Click__ButtonTextAssignment_4_1_1 ) ) ;
    public final void rule__Click__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1082:1: ( ( ( rule__Click__ButtonTextAssignment_4_1_1 ) ) )
            // InternalSeleniumDsl.g:1083:1: ( ( rule__Click__ButtonTextAssignment_4_1_1 ) )
            {
            // InternalSeleniumDsl.g:1083:1: ( ( rule__Click__ButtonTextAssignment_4_1_1 ) )
            // InternalSeleniumDsl.g:1084:2: ( rule__Click__ButtonTextAssignment_4_1_1 )
            {
             before(grammarAccess.getClickAccess().getButtonTextAssignment_4_1_1()); 
            // InternalSeleniumDsl.g:1085:2: ( rule__Click__ButtonTextAssignment_4_1_1 )
            // InternalSeleniumDsl.g:1085:3: rule__Click__ButtonTextAssignment_4_1_1
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
    // InternalSeleniumDsl.g:1094:1: rule__Click__Group_4_2__0 : rule__Click__Group_4_2__0__Impl rule__Click__Group_4_2__1 ;
    public final void rule__Click__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1098:1: ( rule__Click__Group_4_2__0__Impl rule__Click__Group_4_2__1 )
            // InternalSeleniumDsl.g:1099:2: rule__Click__Group_4_2__0__Impl rule__Click__Group_4_2__1
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
    // InternalSeleniumDsl.g:1106:1: rule__Click__Group_4_2__0__Impl : ( 'image' ) ;
    public final void rule__Click__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1110:1: ( ( 'image' ) )
            // InternalSeleniumDsl.g:1111:1: ( 'image' )
            {
            // InternalSeleniumDsl.g:1111:1: ( 'image' )
            // InternalSeleniumDsl.g:1112:2: 'image'
            {
             before(grammarAccess.getClickAccess().getImageKeyword_4_2_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1121:1: rule__Click__Group_4_2__1 : rule__Click__Group_4_2__1__Impl ;
    public final void rule__Click__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1125:1: ( rule__Click__Group_4_2__1__Impl )
            // InternalSeleniumDsl.g:1126:2: rule__Click__Group_4_2__1__Impl
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
    // InternalSeleniumDsl.g:1132:1: rule__Click__Group_4_2__1__Impl : ( ( rule__Click__AltAssignment_4_2_1 ) ) ;
    public final void rule__Click__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1136:1: ( ( ( rule__Click__AltAssignment_4_2_1 ) ) )
            // InternalSeleniumDsl.g:1137:1: ( ( rule__Click__AltAssignment_4_2_1 ) )
            {
            // InternalSeleniumDsl.g:1137:1: ( ( rule__Click__AltAssignment_4_2_1 ) )
            // InternalSeleniumDsl.g:1138:2: ( rule__Click__AltAssignment_4_2_1 )
            {
             before(grammarAccess.getClickAccess().getAltAssignment_4_2_1()); 
            // InternalSeleniumDsl.g:1139:2: ( rule__Click__AltAssignment_4_2_1 )
            // InternalSeleniumDsl.g:1139:3: rule__Click__AltAssignment_4_2_1
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
    // InternalSeleniumDsl.g:1148:1: rule__Click__Group_4_3__0 : rule__Click__Group_4_3__0__Impl rule__Click__Group_4_3__1 ;
    public final void rule__Click__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1152:1: ( rule__Click__Group_4_3__0__Impl rule__Click__Group_4_3__1 )
            // InternalSeleniumDsl.g:1153:2: rule__Click__Group_4_3__0__Impl rule__Click__Group_4_3__1
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
    // InternalSeleniumDsl.g:1160:1: rule__Click__Group_4_3__0__Impl : ( 'variable' ) ;
    public final void rule__Click__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1164:1: ( ( 'variable' ) )
            // InternalSeleniumDsl.g:1165:1: ( 'variable' )
            {
            // InternalSeleniumDsl.g:1165:1: ( 'variable' )
            // InternalSeleniumDsl.g:1166:2: 'variable'
            {
             before(grammarAccess.getClickAccess().getVariableKeyword_4_3_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1175:1: rule__Click__Group_4_3__1 : rule__Click__Group_4_3__1__Impl ;
    public final void rule__Click__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1179:1: ( rule__Click__Group_4_3__1__Impl )
            // InternalSeleniumDsl.g:1180:2: rule__Click__Group_4_3__1__Impl
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
    // InternalSeleniumDsl.g:1186:1: rule__Click__Group_4_3__1__Impl : ( ( rule__Click__VariableAssignment_4_3_1 ) ) ;
    public final void rule__Click__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1190:1: ( ( ( rule__Click__VariableAssignment_4_3_1 ) ) )
            // InternalSeleniumDsl.g:1191:1: ( ( rule__Click__VariableAssignment_4_3_1 ) )
            {
            // InternalSeleniumDsl.g:1191:1: ( ( rule__Click__VariableAssignment_4_3_1 ) )
            // InternalSeleniumDsl.g:1192:2: ( rule__Click__VariableAssignment_4_3_1 )
            {
             before(grammarAccess.getClickAccess().getVariableAssignment_4_3_1()); 
            // InternalSeleniumDsl.g:1193:2: ( rule__Click__VariableAssignment_4_3_1 )
            // InternalSeleniumDsl.g:1193:3: rule__Click__VariableAssignment_4_3_1
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
    // InternalSeleniumDsl.g:1202:1: rule__Fill__Group__0 : rule__Fill__Group__0__Impl rule__Fill__Group__1 ;
    public final void rule__Fill__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1206:1: ( rule__Fill__Group__0__Impl rule__Fill__Group__1 )
            // InternalSeleniumDsl.g:1207:2: rule__Fill__Group__0__Impl rule__Fill__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalSeleniumDsl.g:1214:1: rule__Fill__Group__0__Impl : ( 'fill' ) ;
    public final void rule__Fill__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1218:1: ( ( 'fill' ) )
            // InternalSeleniumDsl.g:1219:1: ( 'fill' )
            {
            // InternalSeleniumDsl.g:1219:1: ( 'fill' )
            // InternalSeleniumDsl.g:1220:2: 'fill'
            {
             before(grammarAccess.getFillAccess().getFillKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:1229:1: rule__Fill__Group__1 : rule__Fill__Group__1__Impl rule__Fill__Group__2 ;
    public final void rule__Fill__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1233:1: ( rule__Fill__Group__1__Impl rule__Fill__Group__2 )
            // InternalSeleniumDsl.g:1234:2: rule__Fill__Group__1__Impl rule__Fill__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalSeleniumDsl.g:1241:1: rule__Fill__Group__1__Impl : ( 'the' ) ;
    public final void rule__Fill__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1245:1: ( ( 'the' ) )
            // InternalSeleniumDsl.g:1246:1: ( 'the' )
            {
            // InternalSeleniumDsl.g:1246:1: ( 'the' )
            // InternalSeleniumDsl.g:1247:2: 'the'
            {
             before(grammarAccess.getFillAccess().getTheKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFillAccess().getTheKeyword_1()); 

            }


            }

        }
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
    // InternalSeleniumDsl.g:1256:1: rule__Fill__Group__2 : rule__Fill__Group__2__Impl rule__Fill__Group__3 ;
    public final void rule__Fill__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1260:1: ( rule__Fill__Group__2__Impl rule__Fill__Group__3 )
            // InternalSeleniumDsl.g:1261:2: rule__Fill__Group__2__Impl rule__Fill__Group__3
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
    // InternalSeleniumDsl.g:1268:1: rule__Fill__Group__2__Impl : ( 'text' ) ;
    public final void rule__Fill__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1272:1: ( ( 'text' ) )
            // InternalSeleniumDsl.g:1273:1: ( 'text' )
            {
            // InternalSeleniumDsl.g:1273:1: ( 'text' )
            // InternalSeleniumDsl.g:1274:2: 'text'
            {
             before(grammarAccess.getFillAccess().getTextKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFillAccess().getTextKeyword_2()); 

            }


            }

        }
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
    // InternalSeleniumDsl.g:1283:1: rule__Fill__Group__3 : rule__Fill__Group__3__Impl rule__Fill__Group__4 ;
    public final void rule__Fill__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1287:1: ( rule__Fill__Group__3__Impl rule__Fill__Group__4 )
            // InternalSeleniumDsl.g:1288:2: rule__Fill__Group__3__Impl rule__Fill__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalSeleniumDsl.g:1295:1: rule__Fill__Group__3__Impl : ( 'field' ) ;
    public final void rule__Fill__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1299:1: ( ( 'field' ) )
            // InternalSeleniumDsl.g:1300:1: ( 'field' )
            {
            // InternalSeleniumDsl.g:1300:1: ( 'field' )
            // InternalSeleniumDsl.g:1301:2: 'field'
            {
             before(grammarAccess.getFillAccess().getFieldKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFillAccess().getFieldKeyword_3()); 

            }


            }

        }
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
    // InternalSeleniumDsl.g:1310:1: rule__Fill__Group__4 : rule__Fill__Group__4__Impl rule__Fill__Group__5 ;
    public final void rule__Fill__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1314:1: ( rule__Fill__Group__4__Impl rule__Fill__Group__5 )
            // InternalSeleniumDsl.g:1315:2: rule__Fill__Group__4__Impl rule__Fill__Group__5
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
    // InternalSeleniumDsl.g:1322:1: rule__Fill__Group__4__Impl : ( ( rule__Fill__FieldNameAssignment_4 ) ) ;
    public final void rule__Fill__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1326:1: ( ( ( rule__Fill__FieldNameAssignment_4 ) ) )
            // InternalSeleniumDsl.g:1327:1: ( ( rule__Fill__FieldNameAssignment_4 ) )
            {
            // InternalSeleniumDsl.g:1327:1: ( ( rule__Fill__FieldNameAssignment_4 ) )
            // InternalSeleniumDsl.g:1328:2: ( rule__Fill__FieldNameAssignment_4 )
            {
             before(grammarAccess.getFillAccess().getFieldNameAssignment_4()); 
            // InternalSeleniumDsl.g:1329:2: ( rule__Fill__FieldNameAssignment_4 )
            // InternalSeleniumDsl.g:1329:3: rule__Fill__FieldNameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Fill__FieldNameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFillAccess().getFieldNameAssignment_4()); 

            }


            }

        }
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
    // InternalSeleniumDsl.g:1337:1: rule__Fill__Group__5 : rule__Fill__Group__5__Impl rule__Fill__Group__6 ;
    public final void rule__Fill__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1341:1: ( rule__Fill__Group__5__Impl rule__Fill__Group__6 )
            // InternalSeleniumDsl.g:1342:2: rule__Fill__Group__5__Impl rule__Fill__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Fill__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fill__Group__6();

            state._fsp--;


            }

        }
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
    // InternalSeleniumDsl.g:1349:1: rule__Fill__Group__5__Impl : ( 'with' ) ;
    public final void rule__Fill__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1353:1: ( ( 'with' ) )
            // InternalSeleniumDsl.g:1354:1: ( 'with' )
            {
            // InternalSeleniumDsl.g:1354:1: ( 'with' )
            // InternalSeleniumDsl.g:1355:2: 'with'
            {
             before(grammarAccess.getFillAccess().getWithKeyword_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFillAccess().getWithKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Fill__Group__6"
    // InternalSeleniumDsl.g:1364:1: rule__Fill__Group__6 : rule__Fill__Group__6__Impl rule__Fill__Group__7 ;
    public final void rule__Fill__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1368:1: ( rule__Fill__Group__6__Impl rule__Fill__Group__7 )
            // InternalSeleniumDsl.g:1369:2: rule__Fill__Group__6__Impl rule__Fill__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__Fill__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fill__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__6"


    // $ANTLR start "rule__Fill__Group__6__Impl"
    // InternalSeleniumDsl.g:1376:1: rule__Fill__Group__6__Impl : ( 'the' ) ;
    public final void rule__Fill__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1380:1: ( ( 'the' ) )
            // InternalSeleniumDsl.g:1381:1: ( 'the' )
            {
            // InternalSeleniumDsl.g:1381:1: ( 'the' )
            // InternalSeleniumDsl.g:1382:2: 'the'
            {
             before(grammarAccess.getFillAccess().getTheKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFillAccess().getTheKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__6__Impl"


    // $ANTLR start "rule__Fill__Group__7"
    // InternalSeleniumDsl.g:1391:1: rule__Fill__Group__7 : rule__Fill__Group__7__Impl ;
    public final void rule__Fill__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1395:1: ( rule__Fill__Group__7__Impl )
            // InternalSeleniumDsl.g:1396:2: rule__Fill__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fill__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__7"


    // $ANTLR start "rule__Fill__Group__7__Impl"
    // InternalSeleniumDsl.g:1402:1: rule__Fill__Group__7__Impl : ( ( rule__Fill__Alternatives_7 ) ) ;
    public final void rule__Fill__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1406:1: ( ( ( rule__Fill__Alternatives_7 ) ) )
            // InternalSeleniumDsl.g:1407:1: ( ( rule__Fill__Alternatives_7 ) )
            {
            // InternalSeleniumDsl.g:1407:1: ( ( rule__Fill__Alternatives_7 ) )
            // InternalSeleniumDsl.g:1408:2: ( rule__Fill__Alternatives_7 )
            {
             before(grammarAccess.getFillAccess().getAlternatives_7()); 
            // InternalSeleniumDsl.g:1409:2: ( rule__Fill__Alternatives_7 )
            // InternalSeleniumDsl.g:1409:3: rule__Fill__Alternatives_7
            {
            pushFollow(FOLLOW_2);
            rule__Fill__Alternatives_7();

            state._fsp--;


            }

             after(grammarAccess.getFillAccess().getAlternatives_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__7__Impl"


    // $ANTLR start "rule__Fill__Group_7_0__0"
    // InternalSeleniumDsl.g:1418:1: rule__Fill__Group_7_0__0 : rule__Fill__Group_7_0__0__Impl rule__Fill__Group_7_0__1 ;
    public final void rule__Fill__Group_7_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1422:1: ( rule__Fill__Group_7_0__0__Impl rule__Fill__Group_7_0__1 )
            // InternalSeleniumDsl.g:1423:2: rule__Fill__Group_7_0__0__Impl rule__Fill__Group_7_0__1
            {
            pushFollow(FOLLOW_15);
            rule__Fill__Group_7_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fill__Group_7_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group_7_0__0"


    // $ANTLR start "rule__Fill__Group_7_0__0__Impl"
    // InternalSeleniumDsl.g:1430:1: rule__Fill__Group_7_0__0__Impl : ( 'text' ) ;
    public final void rule__Fill__Group_7_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1434:1: ( ( 'text' ) )
            // InternalSeleniumDsl.g:1435:1: ( 'text' )
            {
            // InternalSeleniumDsl.g:1435:1: ( 'text' )
            // InternalSeleniumDsl.g:1436:2: 'text'
            {
             before(grammarAccess.getFillAccess().getTextKeyword_7_0_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFillAccess().getTextKeyword_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group_7_0__0__Impl"


    // $ANTLR start "rule__Fill__Group_7_0__1"
    // InternalSeleniumDsl.g:1445:1: rule__Fill__Group_7_0__1 : rule__Fill__Group_7_0__1__Impl ;
    public final void rule__Fill__Group_7_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1449:1: ( rule__Fill__Group_7_0__1__Impl )
            // InternalSeleniumDsl.g:1450:2: rule__Fill__Group_7_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fill__Group_7_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group_7_0__1"


    // $ANTLR start "rule__Fill__Group_7_0__1__Impl"
    // InternalSeleniumDsl.g:1456:1: rule__Fill__Group_7_0__1__Impl : ( ( rule__Fill__TextToFillAssignment_7_0_1 ) ) ;
    public final void rule__Fill__Group_7_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1460:1: ( ( ( rule__Fill__TextToFillAssignment_7_0_1 ) ) )
            // InternalSeleniumDsl.g:1461:1: ( ( rule__Fill__TextToFillAssignment_7_0_1 ) )
            {
            // InternalSeleniumDsl.g:1461:1: ( ( rule__Fill__TextToFillAssignment_7_0_1 ) )
            // InternalSeleniumDsl.g:1462:2: ( rule__Fill__TextToFillAssignment_7_0_1 )
            {
             before(grammarAccess.getFillAccess().getTextToFillAssignment_7_0_1()); 
            // InternalSeleniumDsl.g:1463:2: ( rule__Fill__TextToFillAssignment_7_0_1 )
            // InternalSeleniumDsl.g:1463:3: rule__Fill__TextToFillAssignment_7_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Fill__TextToFillAssignment_7_0_1();

            state._fsp--;


            }

             after(grammarAccess.getFillAccess().getTextToFillAssignment_7_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group_7_0__1__Impl"


    // $ANTLR start "rule__Fill__Group_7_1__0"
    // InternalSeleniumDsl.g:1472:1: rule__Fill__Group_7_1__0 : rule__Fill__Group_7_1__0__Impl rule__Fill__Group_7_1__1 ;
    public final void rule__Fill__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1476:1: ( rule__Fill__Group_7_1__0__Impl rule__Fill__Group_7_1__1 )
            // InternalSeleniumDsl.g:1477:2: rule__Fill__Group_7_1__0__Impl rule__Fill__Group_7_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Fill__Group_7_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fill__Group_7_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group_7_1__0"


    // $ANTLR start "rule__Fill__Group_7_1__0__Impl"
    // InternalSeleniumDsl.g:1484:1: rule__Fill__Group_7_1__0__Impl : ( 'variable' ) ;
    public final void rule__Fill__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1488:1: ( ( 'variable' ) )
            // InternalSeleniumDsl.g:1489:1: ( 'variable' )
            {
            // InternalSeleniumDsl.g:1489:1: ( 'variable' )
            // InternalSeleniumDsl.g:1490:2: 'variable'
            {
             before(grammarAccess.getFillAccess().getVariableKeyword_7_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getFillAccess().getVariableKeyword_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group_7_1__0__Impl"


    // $ANTLR start "rule__Fill__Group_7_1__1"
    // InternalSeleniumDsl.g:1499:1: rule__Fill__Group_7_1__1 : rule__Fill__Group_7_1__1__Impl ;
    public final void rule__Fill__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1503:1: ( rule__Fill__Group_7_1__1__Impl )
            // InternalSeleniumDsl.g:1504:2: rule__Fill__Group_7_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fill__Group_7_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group_7_1__1"


    // $ANTLR start "rule__Fill__Group_7_1__1__Impl"
    // InternalSeleniumDsl.g:1510:1: rule__Fill__Group_7_1__1__Impl : ( ( rule__Fill__VariableAssignment_7_1_1 ) ) ;
    public final void rule__Fill__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1514:1: ( ( ( rule__Fill__VariableAssignment_7_1_1 ) ) )
            // InternalSeleniumDsl.g:1515:1: ( ( rule__Fill__VariableAssignment_7_1_1 ) )
            {
            // InternalSeleniumDsl.g:1515:1: ( ( rule__Fill__VariableAssignment_7_1_1 ) )
            // InternalSeleniumDsl.g:1516:2: ( rule__Fill__VariableAssignment_7_1_1 )
            {
             before(grammarAccess.getFillAccess().getVariableAssignment_7_1_1()); 
            // InternalSeleniumDsl.g:1517:2: ( rule__Fill__VariableAssignment_7_1_1 )
            // InternalSeleniumDsl.g:1517:3: rule__Fill__VariableAssignment_7_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Fill__VariableAssignment_7_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFillAccess().getVariableAssignment_7_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group_7_1__1__Impl"


    // $ANTLR start "rule__Select__Group__0"
    // InternalSeleniumDsl.g:1526:1: rule__Select__Group__0 : rule__Select__Group__0__Impl rule__Select__Group__1 ;
    public final void rule__Select__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1530:1: ( rule__Select__Group__0__Impl rule__Select__Group__1 )
            // InternalSeleniumDsl.g:1531:2: rule__Select__Group__0__Impl rule__Select__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalSeleniumDsl.g:1538:1: rule__Select__Group__0__Impl : ( 'select' ) ;
    public final void rule__Select__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1542:1: ( ( 'select' ) )
            // InternalSeleniumDsl.g:1543:1: ( 'select' )
            {
            // InternalSeleniumDsl.g:1543:1: ( 'select' )
            // InternalSeleniumDsl.g:1544:2: 'select'
            {
             before(grammarAccess.getSelectAccess().getSelectKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getSelectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__0__Impl"


    // $ANTLR start "rule__Select__Group__1"
    // InternalSeleniumDsl.g:1553:1: rule__Select__Group__1 : rule__Select__Group__1__Impl rule__Select__Group__2 ;
    public final void rule__Select__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1557:1: ( rule__Select__Group__1__Impl rule__Select__Group__2 )
            // InternalSeleniumDsl.g:1558:2: rule__Select__Group__1__Impl rule__Select__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalSeleniumDsl.g:1565:1: rule__Select__Group__1__Impl : ( 'the' ) ;
    public final void rule__Select__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1569:1: ( ( 'the' ) )
            // InternalSeleniumDsl.g:1570:1: ( 'the' )
            {
            // InternalSeleniumDsl.g:1570:1: ( 'the' )
            // InternalSeleniumDsl.g:1571:2: 'the'
            {
             before(grammarAccess.getSelectAccess().getTheKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getTheKeyword_1()); 

            }


            }

        }
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
    // InternalSeleniumDsl.g:1580:1: rule__Select__Group__2 : rule__Select__Group__2__Impl rule__Select__Group__3 ;
    public final void rule__Select__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1584:1: ( rule__Select__Group__2__Impl rule__Select__Group__3 )
            // InternalSeleniumDsl.g:1585:2: rule__Select__Group__2__Impl rule__Select__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalSeleniumDsl.g:1592:1: rule__Select__Group__2__Impl : ( 'checkbox' ) ;
    public final void rule__Select__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1596:1: ( ( 'checkbox' ) )
            // InternalSeleniumDsl.g:1597:1: ( 'checkbox' )
            {
            // InternalSeleniumDsl.g:1597:1: ( 'checkbox' )
            // InternalSeleniumDsl.g:1598:2: 'checkbox'
            {
             before(grammarAccess.getSelectAccess().getCheckboxKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getCheckboxKeyword_2()); 

            }


            }

        }
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
    // InternalSeleniumDsl.g:1607:1: rule__Select__Group__3 : rule__Select__Group__3__Impl rule__Select__Group__4 ;
    public final void rule__Select__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1611:1: ( rule__Select__Group__3__Impl rule__Select__Group__4 )
            // InternalSeleniumDsl.g:1612:2: rule__Select__Group__3__Impl rule__Select__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalSeleniumDsl.g:1619:1: rule__Select__Group__3__Impl : ( 'with' ) ;
    public final void rule__Select__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1623:1: ( ( 'with' ) )
            // InternalSeleniumDsl.g:1624:1: ( 'with' )
            {
            // InternalSeleniumDsl.g:1624:1: ( 'with' )
            // InternalSeleniumDsl.g:1625:2: 'with'
            {
             before(grammarAccess.getSelectAccess().getWithKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getWithKeyword_3()); 

            }


            }

        }
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
    // InternalSeleniumDsl.g:1634:1: rule__Select__Group__4 : rule__Select__Group__4__Impl rule__Select__Group__5 ;
    public final void rule__Select__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1638:1: ( rule__Select__Group__4__Impl rule__Select__Group__5 )
            // InternalSeleniumDsl.g:1639:2: rule__Select__Group__4__Impl rule__Select__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Select__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__5();

            state._fsp--;


            }

        }
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
    // InternalSeleniumDsl.g:1646:1: rule__Select__Group__4__Impl : ( 'values' ) ;
    public final void rule__Select__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1650:1: ( ( 'values' ) )
            // InternalSeleniumDsl.g:1651:1: ( 'values' )
            {
            // InternalSeleniumDsl.g:1651:1: ( 'values' )
            // InternalSeleniumDsl.g:1652:2: 'values'
            {
             before(grammarAccess.getSelectAccess().getValuesKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getValuesKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Select__Group__5"
    // InternalSeleniumDsl.g:1661:1: rule__Select__Group__5 : rule__Select__Group__5__Impl rule__Select__Group__6 ;
    public final void rule__Select__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1665:1: ( rule__Select__Group__5__Impl rule__Select__Group__6 )
            // InternalSeleniumDsl.g:1666:2: rule__Select__Group__5__Impl rule__Select__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Select__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__5"


    // $ANTLR start "rule__Select__Group__5__Impl"
    // InternalSeleniumDsl.g:1673:1: rule__Select__Group__5__Impl : ( ( rule__Select__ValuesAssignment_5 ) ) ;
    public final void rule__Select__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1677:1: ( ( ( rule__Select__ValuesAssignment_5 ) ) )
            // InternalSeleniumDsl.g:1678:1: ( ( rule__Select__ValuesAssignment_5 ) )
            {
            // InternalSeleniumDsl.g:1678:1: ( ( rule__Select__ValuesAssignment_5 ) )
            // InternalSeleniumDsl.g:1679:2: ( rule__Select__ValuesAssignment_5 )
            {
             before(grammarAccess.getSelectAccess().getValuesAssignment_5()); 
            // InternalSeleniumDsl.g:1680:2: ( rule__Select__ValuesAssignment_5 )
            // InternalSeleniumDsl.g:1680:3: rule__Select__ValuesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Select__ValuesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getValuesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__5__Impl"


    // $ANTLR start "rule__Select__Group__6"
    // InternalSeleniumDsl.g:1688:1: rule__Select__Group__6 : rule__Select__Group__6__Impl ;
    public final void rule__Select__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1692:1: ( rule__Select__Group__6__Impl )
            // InternalSeleniumDsl.g:1693:2: rule__Select__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__6"


    // $ANTLR start "rule__Select__Group__6__Impl"
    // InternalSeleniumDsl.g:1699:1: rule__Select__Group__6__Impl : ( ( rule__Select__Group_6__0 )* ) ;
    public final void rule__Select__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1703:1: ( ( ( rule__Select__Group_6__0 )* ) )
            // InternalSeleniumDsl.g:1704:1: ( ( rule__Select__Group_6__0 )* )
            {
            // InternalSeleniumDsl.g:1704:1: ( ( rule__Select__Group_6__0 )* )
            // InternalSeleniumDsl.g:1705:2: ( rule__Select__Group_6__0 )*
            {
             before(grammarAccess.getSelectAccess().getGroup_6()); 
            // InternalSeleniumDsl.g:1706:2: ( rule__Select__Group_6__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==36) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSeleniumDsl.g:1706:3: rule__Select__Group_6__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Select__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getSelectAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__6__Impl"


    // $ANTLR start "rule__Select__Group_6__0"
    // InternalSeleniumDsl.g:1715:1: rule__Select__Group_6__0 : rule__Select__Group_6__0__Impl rule__Select__Group_6__1 ;
    public final void rule__Select__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1719:1: ( rule__Select__Group_6__0__Impl rule__Select__Group_6__1 )
            // InternalSeleniumDsl.g:1720:2: rule__Select__Group_6__0__Impl rule__Select__Group_6__1
            {
            pushFollow(FOLLOW_15);
            rule__Select__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_6__0"


    // $ANTLR start "rule__Select__Group_6__0__Impl"
    // InternalSeleniumDsl.g:1727:1: rule__Select__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Select__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1731:1: ( ( ',' ) )
            // InternalSeleniumDsl.g:1732:1: ( ',' )
            {
            // InternalSeleniumDsl.g:1732:1: ( ',' )
            // InternalSeleniumDsl.g:1733:2: ','
            {
             before(grammarAccess.getSelectAccess().getCommaKeyword_6_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_6__0__Impl"


    // $ANTLR start "rule__Select__Group_6__1"
    // InternalSeleniumDsl.g:1742:1: rule__Select__Group_6__1 : rule__Select__Group_6__1__Impl ;
    public final void rule__Select__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1746:1: ( rule__Select__Group_6__1__Impl )
            // InternalSeleniumDsl.g:1747:2: rule__Select__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_6__1"


    // $ANTLR start "rule__Select__Group_6__1__Impl"
    // InternalSeleniumDsl.g:1753:1: rule__Select__Group_6__1__Impl : ( ( rule__Select__ValuesAssignment_6_1 ) ) ;
    public final void rule__Select__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1757:1: ( ( ( rule__Select__ValuesAssignment_6_1 ) ) )
            // InternalSeleniumDsl.g:1758:1: ( ( rule__Select__ValuesAssignment_6_1 ) )
            {
            // InternalSeleniumDsl.g:1758:1: ( ( rule__Select__ValuesAssignment_6_1 ) )
            // InternalSeleniumDsl.g:1759:2: ( rule__Select__ValuesAssignment_6_1 )
            {
             before(grammarAccess.getSelectAccess().getValuesAssignment_6_1()); 
            // InternalSeleniumDsl.g:1760:2: ( rule__Select__ValuesAssignment_6_1 )
            // InternalSeleniumDsl.g:1760:3: rule__Select__ValuesAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Select__ValuesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getValuesAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_6__1__Impl"


    // $ANTLR start "rule__Verify__Group__0"
    // InternalSeleniumDsl.g:1769:1: rule__Verify__Group__0 : rule__Verify__Group__0__Impl rule__Verify__Group__1 ;
    public final void rule__Verify__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1773:1: ( rule__Verify__Group__0__Impl rule__Verify__Group__1 )
            // InternalSeleniumDsl.g:1774:2: rule__Verify__Group__0__Impl rule__Verify__Group__1
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
    // InternalSeleniumDsl.g:1781:1: rule__Verify__Group__0__Impl : ( () ) ;
    public final void rule__Verify__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1785:1: ( ( () ) )
            // InternalSeleniumDsl.g:1786:1: ( () )
            {
            // InternalSeleniumDsl.g:1786:1: ( () )
            // InternalSeleniumDsl.g:1787:2: ()
            {
             before(grammarAccess.getVerifyAccess().getVerifyAction_0()); 
            // InternalSeleniumDsl.g:1788:2: ()
            // InternalSeleniumDsl.g:1788:3: 
            {
            }

             after(grammarAccess.getVerifyAccess().getVerifyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__0__Impl"


    // $ANTLR start "rule__Verify__Group__1"
    // InternalSeleniumDsl.g:1796:1: rule__Verify__Group__1 : rule__Verify__Group__1__Impl rule__Verify__Group__2 ;
    public final void rule__Verify__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1800:1: ( rule__Verify__Group__1__Impl rule__Verify__Group__2 )
            // InternalSeleniumDsl.g:1801:2: rule__Verify__Group__1__Impl rule__Verify__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalSeleniumDsl.g:1808:1: rule__Verify__Group__1__Impl : ( 'verify' ) ;
    public final void rule__Verify__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1812:1: ( ( 'verify' ) )
            // InternalSeleniumDsl.g:1813:1: ( 'verify' )
            {
            // InternalSeleniumDsl.g:1813:1: ( 'verify' )
            // InternalSeleniumDsl.g:1814:2: 'verify'
            {
             before(grammarAccess.getVerifyAccess().getVerifyKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getVerifyAccess().getVerifyKeyword_1()); 

            }


            }

        }
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
    // InternalSeleniumDsl.g:1823:1: rule__Verify__Group__2 : rule__Verify__Group__2__Impl rule__Verify__Group__3 ;
    public final void rule__Verify__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1827:1: ( rule__Verify__Group__2__Impl rule__Verify__Group__3 )
            // InternalSeleniumDsl.g:1828:2: rule__Verify__Group__2__Impl rule__Verify__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalSeleniumDsl.g:1835:1: rule__Verify__Group__2__Impl : ( 'that' ) ;
    public final void rule__Verify__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1839:1: ( ( 'that' ) )
            // InternalSeleniumDsl.g:1840:1: ( 'that' )
            {
            // InternalSeleniumDsl.g:1840:1: ( 'that' )
            // InternalSeleniumDsl.g:1841:2: 'that'
            {
             before(grammarAccess.getVerifyAccess().getThatKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getVerifyAccess().getThatKeyword_2()); 

            }


            }

        }
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
    // InternalSeleniumDsl.g:1850:1: rule__Verify__Group__3 : rule__Verify__Group__3__Impl rule__Verify__Group__4 ;
    public final void rule__Verify__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1854:1: ( rule__Verify__Group__3__Impl rule__Verify__Group__4 )
            // InternalSeleniumDsl.g:1855:2: rule__Verify__Group__3__Impl rule__Verify__Group__4
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
    // InternalSeleniumDsl.g:1862:1: rule__Verify__Group__3__Impl : ( 'the' ) ;
    public final void rule__Verify__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1866:1: ( ( 'the' ) )
            // InternalSeleniumDsl.g:1867:1: ( 'the' )
            {
            // InternalSeleniumDsl.g:1867:1: ( 'the' )
            // InternalSeleniumDsl.g:1868:2: 'the'
            {
             before(grammarAccess.getVerifyAccess().getTheKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getVerifyAccess().getTheKeyword_3()); 

            }


            }

        }
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
    // InternalSeleniumDsl.g:1877:1: rule__Verify__Group__4 : rule__Verify__Group__4__Impl rule__Verify__Group__5 ;
    public final void rule__Verify__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1881:1: ( rule__Verify__Group__4__Impl rule__Verify__Group__5 )
            // InternalSeleniumDsl.g:1882:2: rule__Verify__Group__4__Impl rule__Verify__Group__5
            {
            pushFollow(FOLLOW_28);
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
    // InternalSeleniumDsl.g:1889:1: rule__Verify__Group__4__Impl : ( 'page' ) ;
    public final void rule__Verify__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1893:1: ( ( 'page' ) )
            // InternalSeleniumDsl.g:1894:1: ( 'page' )
            {
            // InternalSeleniumDsl.g:1894:1: ( 'page' )
            // InternalSeleniumDsl.g:1895:2: 'page'
            {
             before(grammarAccess.getVerifyAccess().getPageKeyword_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getVerifyAccess().getPageKeyword_4()); 

            }


            }

        }
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
    // InternalSeleniumDsl.g:1904:1: rule__Verify__Group__5 : rule__Verify__Group__5__Impl rule__Verify__Group__6 ;
    public final void rule__Verify__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1908:1: ( rule__Verify__Group__5__Impl rule__Verify__Group__6 )
            // InternalSeleniumDsl.g:1909:2: rule__Verify__Group__5__Impl rule__Verify__Group__6
            {
            pushFollow(FOLLOW_13);
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
    // InternalSeleniumDsl.g:1916:1: rule__Verify__Group__5__Impl : ( 'contains' ) ;
    public final void rule__Verify__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1920:1: ( ( 'contains' ) )
            // InternalSeleniumDsl.g:1921:1: ( 'contains' )
            {
            // InternalSeleniumDsl.g:1921:1: ( 'contains' )
            // InternalSeleniumDsl.g:1922:2: 'contains'
            {
             before(grammarAccess.getVerifyAccess().getContainsKeyword_5()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getVerifyAccess().getContainsKeyword_5()); 

            }


            }

        }
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
    // InternalSeleniumDsl.g:1931:1: rule__Verify__Group__6 : rule__Verify__Group__6__Impl rule__Verify__Group__7 ;
    public final void rule__Verify__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1935:1: ( rule__Verify__Group__6__Impl rule__Verify__Group__7 )
            // InternalSeleniumDsl.g:1936:2: rule__Verify__Group__6__Impl rule__Verify__Group__7
            {
            pushFollow(FOLLOW_29);
            rule__Verify__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Verify__Group__7();

            state._fsp--;


            }

        }
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
    // InternalSeleniumDsl.g:1943:1: rule__Verify__Group__6__Impl : ( 'the' ) ;
    public final void rule__Verify__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1947:1: ( ( 'the' ) )
            // InternalSeleniumDsl.g:1948:1: ( 'the' )
            {
            // InternalSeleniumDsl.g:1948:1: ( 'the' )
            // InternalSeleniumDsl.g:1949:2: 'the'
            {
             before(grammarAccess.getVerifyAccess().getTheKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getVerifyAccess().getTheKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Verify__Group__7"
    // InternalSeleniumDsl.g:1958:1: rule__Verify__Group__7 : rule__Verify__Group__7__Impl ;
    public final void rule__Verify__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1962:1: ( rule__Verify__Group__7__Impl )
            // InternalSeleniumDsl.g:1963:2: rule__Verify__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Verify__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__7"


    // $ANTLR start "rule__Verify__Group__7__Impl"
    // InternalSeleniumDsl.g:1969:1: rule__Verify__Group__7__Impl : ( ( rule__Verify__Alternatives_7 ) ) ;
    public final void rule__Verify__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1973:1: ( ( ( rule__Verify__Alternatives_7 ) ) )
            // InternalSeleniumDsl.g:1974:1: ( ( rule__Verify__Alternatives_7 ) )
            {
            // InternalSeleniumDsl.g:1974:1: ( ( rule__Verify__Alternatives_7 ) )
            // InternalSeleniumDsl.g:1975:2: ( rule__Verify__Alternatives_7 )
            {
             before(grammarAccess.getVerifyAccess().getAlternatives_7()); 
            // InternalSeleniumDsl.g:1976:2: ( rule__Verify__Alternatives_7 )
            // InternalSeleniumDsl.g:1976:3: rule__Verify__Alternatives_7
            {
            pushFollow(FOLLOW_2);
            rule__Verify__Alternatives_7();

            state._fsp--;


            }

             after(grammarAccess.getVerifyAccess().getAlternatives_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__7__Impl"


    // $ANTLR start "rule__Verify__Group_7_0__0"
    // InternalSeleniumDsl.g:1985:1: rule__Verify__Group_7_0__0 : rule__Verify__Group_7_0__0__Impl rule__Verify__Group_7_0__1 ;
    public final void rule__Verify__Group_7_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:1989:1: ( rule__Verify__Group_7_0__0__Impl rule__Verify__Group_7_0__1 )
            // InternalSeleniumDsl.g:1990:2: rule__Verify__Group_7_0__0__Impl rule__Verify__Group_7_0__1
            {
            pushFollow(FOLLOW_15);
            rule__Verify__Group_7_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Verify__Group_7_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group_7_0__0"


    // $ANTLR start "rule__Verify__Group_7_0__0__Impl"
    // InternalSeleniumDsl.g:1997:1: rule__Verify__Group_7_0__0__Impl : ( 'string' ) ;
    public final void rule__Verify__Group_7_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2001:1: ( ( 'string' ) )
            // InternalSeleniumDsl.g:2002:1: ( 'string' )
            {
            // InternalSeleniumDsl.g:2002:1: ( 'string' )
            // InternalSeleniumDsl.g:2003:2: 'string'
            {
             before(grammarAccess.getVerifyAccess().getStringKeyword_7_0_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getVerifyAccess().getStringKeyword_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group_7_0__0__Impl"


    // $ANTLR start "rule__Verify__Group_7_0__1"
    // InternalSeleniumDsl.g:2012:1: rule__Verify__Group_7_0__1 : rule__Verify__Group_7_0__1__Impl ;
    public final void rule__Verify__Group_7_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2016:1: ( rule__Verify__Group_7_0__1__Impl )
            // InternalSeleniumDsl.g:2017:2: rule__Verify__Group_7_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Verify__Group_7_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group_7_0__1"


    // $ANTLR start "rule__Verify__Group_7_0__1__Impl"
    // InternalSeleniumDsl.g:2023:1: rule__Verify__Group_7_0__1__Impl : ( ( rule__Verify__TextToVerifyAssignment_7_0_1 ) ) ;
    public final void rule__Verify__Group_7_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2027:1: ( ( ( rule__Verify__TextToVerifyAssignment_7_0_1 ) ) )
            // InternalSeleniumDsl.g:2028:1: ( ( rule__Verify__TextToVerifyAssignment_7_0_1 ) )
            {
            // InternalSeleniumDsl.g:2028:1: ( ( rule__Verify__TextToVerifyAssignment_7_0_1 ) )
            // InternalSeleniumDsl.g:2029:2: ( rule__Verify__TextToVerifyAssignment_7_0_1 )
            {
             before(grammarAccess.getVerifyAccess().getTextToVerifyAssignment_7_0_1()); 
            // InternalSeleniumDsl.g:2030:2: ( rule__Verify__TextToVerifyAssignment_7_0_1 )
            // InternalSeleniumDsl.g:2030:3: rule__Verify__TextToVerifyAssignment_7_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Verify__TextToVerifyAssignment_7_0_1();

            state._fsp--;


            }

             after(grammarAccess.getVerifyAccess().getTextToVerifyAssignment_7_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group_7_0__1__Impl"


    // $ANTLR start "rule__Verify__Group_7_1__0"
    // InternalSeleniumDsl.g:2039:1: rule__Verify__Group_7_1__0 : rule__Verify__Group_7_1__0__Impl rule__Verify__Group_7_1__1 ;
    public final void rule__Verify__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2043:1: ( rule__Verify__Group_7_1__0__Impl rule__Verify__Group_7_1__1 )
            // InternalSeleniumDsl.g:2044:2: rule__Verify__Group_7_1__0__Impl rule__Verify__Group_7_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Verify__Group_7_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Verify__Group_7_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group_7_1__0"


    // $ANTLR start "rule__Verify__Group_7_1__0__Impl"
    // InternalSeleniumDsl.g:2051:1: rule__Verify__Group_7_1__0__Impl : ( 'link' ) ;
    public final void rule__Verify__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2055:1: ( ( 'link' ) )
            // InternalSeleniumDsl.g:2056:1: ( 'link' )
            {
            // InternalSeleniumDsl.g:2056:1: ( 'link' )
            // InternalSeleniumDsl.g:2057:2: 'link'
            {
             before(grammarAccess.getVerifyAccess().getLinkKeyword_7_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getVerifyAccess().getLinkKeyword_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group_7_1__0__Impl"


    // $ANTLR start "rule__Verify__Group_7_1__1"
    // InternalSeleniumDsl.g:2066:1: rule__Verify__Group_7_1__1 : rule__Verify__Group_7_1__1__Impl ;
    public final void rule__Verify__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2070:1: ( rule__Verify__Group_7_1__1__Impl )
            // InternalSeleniumDsl.g:2071:2: rule__Verify__Group_7_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Verify__Group_7_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group_7_1__1"


    // $ANTLR start "rule__Verify__Group_7_1__1__Impl"
    // InternalSeleniumDsl.g:2077:1: rule__Verify__Group_7_1__1__Impl : ( ( rule__Verify__LinkToVerifyAssignment_7_1_1 ) ) ;
    public final void rule__Verify__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2081:1: ( ( ( rule__Verify__LinkToVerifyAssignment_7_1_1 ) ) )
            // InternalSeleniumDsl.g:2082:1: ( ( rule__Verify__LinkToVerifyAssignment_7_1_1 ) )
            {
            // InternalSeleniumDsl.g:2082:1: ( ( rule__Verify__LinkToVerifyAssignment_7_1_1 ) )
            // InternalSeleniumDsl.g:2083:2: ( rule__Verify__LinkToVerifyAssignment_7_1_1 )
            {
             before(grammarAccess.getVerifyAccess().getLinkToVerifyAssignment_7_1_1()); 
            // InternalSeleniumDsl.g:2084:2: ( rule__Verify__LinkToVerifyAssignment_7_1_1 )
            // InternalSeleniumDsl.g:2084:3: rule__Verify__LinkToVerifyAssignment_7_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Verify__LinkToVerifyAssignment_7_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVerifyAccess().getLinkToVerifyAssignment_7_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group_7_1__1__Impl"


    // $ANTLR start "rule__Verify__Group_7_2__0"
    // InternalSeleniumDsl.g:2093:1: rule__Verify__Group_7_2__0 : rule__Verify__Group_7_2__0__Impl rule__Verify__Group_7_2__1 ;
    public final void rule__Verify__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2097:1: ( rule__Verify__Group_7_2__0__Impl rule__Verify__Group_7_2__1 )
            // InternalSeleniumDsl.g:2098:2: rule__Verify__Group_7_2__0__Impl rule__Verify__Group_7_2__1
            {
            pushFollow(FOLLOW_16);
            rule__Verify__Group_7_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Verify__Group_7_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group_7_2__0"


    // $ANTLR start "rule__Verify__Group_7_2__0__Impl"
    // InternalSeleniumDsl.g:2105:1: rule__Verify__Group_7_2__0__Impl : ( 'variable' ) ;
    public final void rule__Verify__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2109:1: ( ( 'variable' ) )
            // InternalSeleniumDsl.g:2110:1: ( 'variable' )
            {
            // InternalSeleniumDsl.g:2110:1: ( 'variable' )
            // InternalSeleniumDsl.g:2111:2: 'variable'
            {
             before(grammarAccess.getVerifyAccess().getVariableKeyword_7_2_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getVerifyAccess().getVariableKeyword_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group_7_2__0__Impl"


    // $ANTLR start "rule__Verify__Group_7_2__1"
    // InternalSeleniumDsl.g:2120:1: rule__Verify__Group_7_2__1 : rule__Verify__Group_7_2__1__Impl ;
    public final void rule__Verify__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2124:1: ( rule__Verify__Group_7_2__1__Impl )
            // InternalSeleniumDsl.g:2125:2: rule__Verify__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Verify__Group_7_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group_7_2__1"


    // $ANTLR start "rule__Verify__Group_7_2__1__Impl"
    // InternalSeleniumDsl.g:2131:1: rule__Verify__Group_7_2__1__Impl : ( ( rule__Verify__VariableAssignment_7_2_1 ) ) ;
    public final void rule__Verify__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2135:1: ( ( ( rule__Verify__VariableAssignment_7_2_1 ) ) )
            // InternalSeleniumDsl.g:2136:1: ( ( rule__Verify__VariableAssignment_7_2_1 ) )
            {
            // InternalSeleniumDsl.g:2136:1: ( ( rule__Verify__VariableAssignment_7_2_1 ) )
            // InternalSeleniumDsl.g:2137:2: ( rule__Verify__VariableAssignment_7_2_1 )
            {
             before(grammarAccess.getVerifyAccess().getVariableAssignment_7_2_1()); 
            // InternalSeleniumDsl.g:2138:2: ( rule__Verify__VariableAssignment_7_2_1 )
            // InternalSeleniumDsl.g:2138:3: rule__Verify__VariableAssignment_7_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Verify__VariableAssignment_7_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVerifyAccess().getVariableAssignment_7_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group_7_2__1__Impl"


    // $ANTLR start "rule__Read__Group__0"
    // InternalSeleniumDsl.g:2147:1: rule__Read__Group__0 : rule__Read__Group__0__Impl rule__Read__Group__1 ;
    public final void rule__Read__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2151:1: ( rule__Read__Group__0__Impl rule__Read__Group__1 )
            // InternalSeleniumDsl.g:2152:2: rule__Read__Group__0__Impl rule__Read__Group__1
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
    // InternalSeleniumDsl.g:2159:1: rule__Read__Group__0__Impl : ( 'read' ) ;
    public final void rule__Read__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2163:1: ( ( 'read' ) )
            // InternalSeleniumDsl.g:2164:1: ( 'read' )
            {
            // InternalSeleniumDsl.g:2164:1: ( 'read' )
            // InternalSeleniumDsl.g:2165:2: 'read'
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
    // InternalSeleniumDsl.g:2174:1: rule__Read__Group__1 : rule__Read__Group__1__Impl rule__Read__Group__2 ;
    public final void rule__Read__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2178:1: ( rule__Read__Group__1__Impl rule__Read__Group__2 )
            // InternalSeleniumDsl.g:2179:2: rule__Read__Group__1__Impl rule__Read__Group__2
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
    // InternalSeleniumDsl.g:2186:1: rule__Read__Group__1__Impl : ( 'the' ) ;
    public final void rule__Read__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2190:1: ( ( 'the' ) )
            // InternalSeleniumDsl.g:2191:1: ( 'the' )
            {
            // InternalSeleniumDsl.g:2191:1: ( 'the' )
            // InternalSeleniumDsl.g:2192:2: 'the'
            {
             before(grammarAccess.getReadAccess().getTheKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:2201:1: rule__Read__Group__2 : rule__Read__Group__2__Impl rule__Read__Group__3 ;
    public final void rule__Read__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2205:1: ( rule__Read__Group__2__Impl rule__Read__Group__3 )
            // InternalSeleniumDsl.g:2206:2: rule__Read__Group__2__Impl rule__Read__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalSeleniumDsl.g:2213:1: rule__Read__Group__2__Impl : ( ( rule__Read__ElementsAssignment_2 ) ) ;
    public final void rule__Read__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2217:1: ( ( ( rule__Read__ElementsAssignment_2 ) ) )
            // InternalSeleniumDsl.g:2218:1: ( ( rule__Read__ElementsAssignment_2 ) )
            {
            // InternalSeleniumDsl.g:2218:1: ( ( rule__Read__ElementsAssignment_2 ) )
            // InternalSeleniumDsl.g:2219:2: ( rule__Read__ElementsAssignment_2 )
            {
             before(grammarAccess.getReadAccess().getElementsAssignment_2()); 
            // InternalSeleniumDsl.g:2220:2: ( rule__Read__ElementsAssignment_2 )
            // InternalSeleniumDsl.g:2220:3: rule__Read__ElementsAssignment_2
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
    // InternalSeleniumDsl.g:2228:1: rule__Read__Group__3 : rule__Read__Group__3__Impl rule__Read__Group__4 ;
    public final void rule__Read__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2232:1: ( rule__Read__Group__3__Impl rule__Read__Group__4 )
            // InternalSeleniumDsl.g:2233:2: rule__Read__Group__3__Impl rule__Read__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalSeleniumDsl.g:2240:1: rule__Read__Group__3__Impl : ( ( rule__Read__Group_3__0 )* ) ;
    public final void rule__Read__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2244:1: ( ( ( rule__Read__Group_3__0 )* ) )
            // InternalSeleniumDsl.g:2245:1: ( ( rule__Read__Group_3__0 )* )
            {
            // InternalSeleniumDsl.g:2245:1: ( ( rule__Read__Group_3__0 )* )
            // InternalSeleniumDsl.g:2246:2: ( rule__Read__Group_3__0 )*
            {
             before(grammarAccess.getReadAccess().getGroup_3()); 
            // InternalSeleniumDsl.g:2247:2: ( rule__Read__Group_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==36) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSeleniumDsl.g:2247:3: rule__Read__Group_3__0
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
    // InternalSeleniumDsl.g:2255:1: rule__Read__Group__4 : rule__Read__Group__4__Impl rule__Read__Group__5 ;
    public final void rule__Read__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2259:1: ( rule__Read__Group__4__Impl rule__Read__Group__5 )
            // InternalSeleniumDsl.g:2260:2: rule__Read__Group__4__Impl rule__Read__Group__5
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
    // InternalSeleniumDsl.g:2267:1: rule__Read__Group__4__Impl : ( 'of' ) ;
    public final void rule__Read__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2271:1: ( ( 'of' ) )
            // InternalSeleniumDsl.g:2272:1: ( 'of' )
            {
            // InternalSeleniumDsl.g:2272:1: ( 'of' )
            // InternalSeleniumDsl.g:2273:2: 'of'
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
    // InternalSeleniumDsl.g:2282:1: rule__Read__Group__5 : rule__Read__Group__5__Impl rule__Read__Group__6 ;
    public final void rule__Read__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2286:1: ( rule__Read__Group__5__Impl rule__Read__Group__6 )
            // InternalSeleniumDsl.g:2287:2: rule__Read__Group__5__Impl rule__Read__Group__6
            {
            pushFollow(FOLLOW_31);
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
    // InternalSeleniumDsl.g:2294:1: rule__Read__Group__5__Impl : ( 'the' ) ;
    public final void rule__Read__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2298:1: ( ( 'the' ) )
            // InternalSeleniumDsl.g:2299:1: ( 'the' )
            {
            // InternalSeleniumDsl.g:2299:1: ( 'the' )
            // InternalSeleniumDsl.g:2300:2: 'the'
            {
             before(grammarAccess.getReadAccess().getTheKeyword_5()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:2309:1: rule__Read__Group__6 : rule__Read__Group__6__Impl rule__Read__Group__7 ;
    public final void rule__Read__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2313:1: ( rule__Read__Group__6__Impl rule__Read__Group__7 )
            // InternalSeleniumDsl.g:2314:2: rule__Read__Group__6__Impl rule__Read__Group__7
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
    // InternalSeleniumDsl.g:2321:1: rule__Read__Group__6__Impl : ( 'link' ) ;
    public final void rule__Read__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2325:1: ( ( 'link' ) )
            // InternalSeleniumDsl.g:2326:1: ( 'link' )
            {
            // InternalSeleniumDsl.g:2326:1: ( 'link' )
            // InternalSeleniumDsl.g:2327:2: 'link'
            {
             before(grammarAccess.getReadAccess().getLinkKeyword_6()); 
            match(input,14,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:2336:1: rule__Read__Group__7 : rule__Read__Group__7__Impl rule__Read__Group__8 ;
    public final void rule__Read__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2340:1: ( rule__Read__Group__7__Impl rule__Read__Group__8 )
            // InternalSeleniumDsl.g:2341:2: rule__Read__Group__7__Impl rule__Read__Group__8
            {
            pushFollow(FOLLOW_32);
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
    // InternalSeleniumDsl.g:2348:1: rule__Read__Group__7__Impl : ( ( rule__Read__LinkTextAssignment_7 ) ) ;
    public final void rule__Read__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2352:1: ( ( ( rule__Read__LinkTextAssignment_7 ) ) )
            // InternalSeleniumDsl.g:2353:1: ( ( rule__Read__LinkTextAssignment_7 ) )
            {
            // InternalSeleniumDsl.g:2353:1: ( ( rule__Read__LinkTextAssignment_7 ) )
            // InternalSeleniumDsl.g:2354:2: ( rule__Read__LinkTextAssignment_7 )
            {
             before(grammarAccess.getReadAccess().getLinkTextAssignment_7()); 
            // InternalSeleniumDsl.g:2355:2: ( rule__Read__LinkTextAssignment_7 )
            // InternalSeleniumDsl.g:2355:3: rule__Read__LinkTextAssignment_7
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
    // InternalSeleniumDsl.g:2363:1: rule__Read__Group__8 : rule__Read__Group__8__Impl rule__Read__Group__9 ;
    public final void rule__Read__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2367:1: ( rule__Read__Group__8__Impl rule__Read__Group__9 )
            // InternalSeleniumDsl.g:2368:2: rule__Read__Group__8__Impl rule__Read__Group__9
            {
            pushFollow(FOLLOW_33);
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
    // InternalSeleniumDsl.g:2375:1: rule__Read__Group__8__Impl : ( 'number' ) ;
    public final void rule__Read__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2379:1: ( ( 'number' ) )
            // InternalSeleniumDsl.g:2380:1: ( 'number' )
            {
            // InternalSeleniumDsl.g:2380:1: ( 'number' )
            // InternalSeleniumDsl.g:2381:2: 'number'
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
    // InternalSeleniumDsl.g:2390:1: rule__Read__Group__9 : rule__Read__Group__9__Impl ;
    public final void rule__Read__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2394:1: ( rule__Read__Group__9__Impl )
            // InternalSeleniumDsl.g:2395:2: rule__Read__Group__9__Impl
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
    // InternalSeleniumDsl.g:2401:1: rule__Read__Group__9__Impl : ( ( rule__Read__NumberAssignment_9 ) ) ;
    public final void rule__Read__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2405:1: ( ( ( rule__Read__NumberAssignment_9 ) ) )
            // InternalSeleniumDsl.g:2406:1: ( ( rule__Read__NumberAssignment_9 ) )
            {
            // InternalSeleniumDsl.g:2406:1: ( ( rule__Read__NumberAssignment_9 ) )
            // InternalSeleniumDsl.g:2407:2: ( rule__Read__NumberAssignment_9 )
            {
             before(grammarAccess.getReadAccess().getNumberAssignment_9()); 
            // InternalSeleniumDsl.g:2408:2: ( rule__Read__NumberAssignment_9 )
            // InternalSeleniumDsl.g:2408:3: rule__Read__NumberAssignment_9
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
    // InternalSeleniumDsl.g:2417:1: rule__Read__Group_3__0 : rule__Read__Group_3__0__Impl rule__Read__Group_3__1 ;
    public final void rule__Read__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2421:1: ( rule__Read__Group_3__0__Impl rule__Read__Group_3__1 )
            // InternalSeleniumDsl.g:2422:2: rule__Read__Group_3__0__Impl rule__Read__Group_3__1
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
    // InternalSeleniumDsl.g:2429:1: rule__Read__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Read__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2433:1: ( ( ',' ) )
            // InternalSeleniumDsl.g:2434:1: ( ',' )
            {
            // InternalSeleniumDsl.g:2434:1: ( ',' )
            // InternalSeleniumDsl.g:2435:2: ','
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
    // InternalSeleniumDsl.g:2444:1: rule__Read__Group_3__1 : rule__Read__Group_3__1__Impl ;
    public final void rule__Read__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2448:1: ( rule__Read__Group_3__1__Impl )
            // InternalSeleniumDsl.g:2449:2: rule__Read__Group_3__1__Impl
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
    // InternalSeleniumDsl.g:2455:1: rule__Read__Group_3__1__Impl : ( ( rule__Read__ElementsAssignment_3_1 ) ) ;
    public final void rule__Read__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2459:1: ( ( ( rule__Read__ElementsAssignment_3_1 ) ) )
            // InternalSeleniumDsl.g:2460:1: ( ( rule__Read__ElementsAssignment_3_1 ) )
            {
            // InternalSeleniumDsl.g:2460:1: ( ( rule__Read__ElementsAssignment_3_1 ) )
            // InternalSeleniumDsl.g:2461:2: ( rule__Read__ElementsAssignment_3_1 )
            {
             before(grammarAccess.getReadAccess().getElementsAssignment_3_1()); 
            // InternalSeleniumDsl.g:2462:2: ( rule__Read__ElementsAssignment_3_1 )
            // InternalSeleniumDsl.g:2462:3: rule__Read__ElementsAssignment_3_1
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
    // InternalSeleniumDsl.g:2471:1: rule__Uncheck__Group__0 : rule__Uncheck__Group__0__Impl rule__Uncheck__Group__1 ;
    public final void rule__Uncheck__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2475:1: ( rule__Uncheck__Group__0__Impl rule__Uncheck__Group__1 )
            // InternalSeleniumDsl.g:2476:2: rule__Uncheck__Group__0__Impl rule__Uncheck__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalSeleniumDsl.g:2483:1: rule__Uncheck__Group__0__Impl : ( () ) ;
    public final void rule__Uncheck__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2487:1: ( ( () ) )
            // InternalSeleniumDsl.g:2488:1: ( () )
            {
            // InternalSeleniumDsl.g:2488:1: ( () )
            // InternalSeleniumDsl.g:2489:2: ()
            {
             before(grammarAccess.getUncheckAccess().getUncheckAction_0()); 
            // InternalSeleniumDsl.g:2490:2: ()
            // InternalSeleniumDsl.g:2490:3: 
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
    // InternalSeleniumDsl.g:2498:1: rule__Uncheck__Group__1 : rule__Uncheck__Group__1__Impl rule__Uncheck__Group__2 ;
    public final void rule__Uncheck__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2502:1: ( rule__Uncheck__Group__1__Impl rule__Uncheck__Group__2 )
            // InternalSeleniumDsl.g:2503:2: rule__Uncheck__Group__1__Impl rule__Uncheck__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalSeleniumDsl.g:2510:1: rule__Uncheck__Group__1__Impl : ( 'uncheck' ) ;
    public final void rule__Uncheck__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2514:1: ( ( 'uncheck' ) )
            // InternalSeleniumDsl.g:2515:1: ( 'uncheck' )
            {
            // InternalSeleniumDsl.g:2515:1: ( 'uncheck' )
            // InternalSeleniumDsl.g:2516:2: 'uncheck'
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
    // InternalSeleniumDsl.g:2525:1: rule__Uncheck__Group__2 : rule__Uncheck__Group__2__Impl rule__Uncheck__Group__3 ;
    public final void rule__Uncheck__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2529:1: ( rule__Uncheck__Group__2__Impl rule__Uncheck__Group__3 )
            // InternalSeleniumDsl.g:2530:2: rule__Uncheck__Group__2__Impl rule__Uncheck__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalSeleniumDsl.g:2537:1: rule__Uncheck__Group__2__Impl : ( 'all' ) ;
    public final void rule__Uncheck__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2541:1: ( ( 'all' ) )
            // InternalSeleniumDsl.g:2542:1: ( 'all' )
            {
            // InternalSeleniumDsl.g:2542:1: ( 'all' )
            // InternalSeleniumDsl.g:2543:2: 'all'
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
    // InternalSeleniumDsl.g:2552:1: rule__Uncheck__Group__3 : rule__Uncheck__Group__3__Impl ;
    public final void rule__Uncheck__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2556:1: ( rule__Uncheck__Group__3__Impl )
            // InternalSeleniumDsl.g:2557:2: rule__Uncheck__Group__3__Impl
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
    // InternalSeleniumDsl.g:2563:1: rule__Uncheck__Group__3__Impl : ( 'checkboxes' ) ;
    public final void rule__Uncheck__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2567:1: ( ( 'checkboxes' ) )
            // InternalSeleniumDsl.g:2568:1: ( 'checkboxes' )
            {
            // InternalSeleniumDsl.g:2568:1: ( 'checkboxes' )
            // InternalSeleniumDsl.g:2569:2: 'checkboxes'
            {
             before(grammarAccess.getUncheckAccess().getCheckboxesKeyword_3()); 
            match(input,47,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:2579:1: rule__Combobox__Group__0 : rule__Combobox__Group__0__Impl rule__Combobox__Group__1 ;
    public final void rule__Combobox__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2583:1: ( rule__Combobox__Group__0__Impl rule__Combobox__Group__1 )
            // InternalSeleniumDsl.g:2584:2: rule__Combobox__Group__0__Impl rule__Combobox__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalSeleniumDsl.g:2591:1: rule__Combobox__Group__0__Impl : ( 'choose' ) ;
    public final void rule__Combobox__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2595:1: ( ( 'choose' ) )
            // InternalSeleniumDsl.g:2596:1: ( 'choose' )
            {
            // InternalSeleniumDsl.g:2596:1: ( 'choose' )
            // InternalSeleniumDsl.g:2597:2: 'choose'
            {
             before(grammarAccess.getComboboxAccess().getChooseKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalSeleniumDsl.g:2606:1: rule__Combobox__Group__1 : rule__Combobox__Group__1__Impl rule__Combobox__Group__2 ;
    public final void rule__Combobox__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2610:1: ( rule__Combobox__Group__1__Impl rule__Combobox__Group__2 )
            // InternalSeleniumDsl.g:2611:2: rule__Combobox__Group__1__Impl rule__Combobox__Group__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalSeleniumDsl.g:2618:1: rule__Combobox__Group__1__Impl : ( 'the' ) ;
    public final void rule__Combobox__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2622:1: ( ( 'the' ) )
            // InternalSeleniumDsl.g:2623:1: ( 'the' )
            {
            // InternalSeleniumDsl.g:2623:1: ( 'the' )
            // InternalSeleniumDsl.g:2624:2: 'the'
            {
             before(grammarAccess.getComboboxAccess().getTheKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComboboxAccess().getTheKeyword_1()); 

            }


            }

        }
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
    // InternalSeleniumDsl.g:2633:1: rule__Combobox__Group__2 : rule__Combobox__Group__2__Impl rule__Combobox__Group__3 ;
    public final void rule__Combobox__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2637:1: ( rule__Combobox__Group__2__Impl rule__Combobox__Group__3 )
            // InternalSeleniumDsl.g:2638:2: rule__Combobox__Group__2__Impl rule__Combobox__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalSeleniumDsl.g:2645:1: rule__Combobox__Group__2__Impl : ( 'option' ) ;
    public final void rule__Combobox__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2649:1: ( ( 'option' ) )
            // InternalSeleniumDsl.g:2650:1: ( 'option' )
            {
            // InternalSeleniumDsl.g:2650:1: ( 'option' )
            // InternalSeleniumDsl.g:2651:2: 'option'
            {
             before(grammarAccess.getComboboxAccess().getOptionKeyword_2()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getComboboxAccess().getOptionKeyword_2()); 

            }


            }

        }
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
    // InternalSeleniumDsl.g:2660:1: rule__Combobox__Group__3 : rule__Combobox__Group__3__Impl rule__Combobox__Group__4 ;
    public final void rule__Combobox__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2664:1: ( rule__Combobox__Group__3__Impl rule__Combobox__Group__4 )
            // InternalSeleniumDsl.g:2665:2: rule__Combobox__Group__3__Impl rule__Combobox__Group__4
            {
            pushFollow(FOLLOW_38);
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
    // InternalSeleniumDsl.g:2672:1: rule__Combobox__Group__3__Impl : ( ( rule__Combobox__OptionAssignment_3 ) ) ;
    public final void rule__Combobox__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2676:1: ( ( ( rule__Combobox__OptionAssignment_3 ) ) )
            // InternalSeleniumDsl.g:2677:1: ( ( rule__Combobox__OptionAssignment_3 ) )
            {
            // InternalSeleniumDsl.g:2677:1: ( ( rule__Combobox__OptionAssignment_3 ) )
            // InternalSeleniumDsl.g:2678:2: ( rule__Combobox__OptionAssignment_3 )
            {
             before(grammarAccess.getComboboxAccess().getOptionAssignment_3()); 
            // InternalSeleniumDsl.g:2679:2: ( rule__Combobox__OptionAssignment_3 )
            // InternalSeleniumDsl.g:2679:3: rule__Combobox__OptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Combobox__OptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getComboboxAccess().getOptionAssignment_3()); 

            }


            }

        }
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
    // InternalSeleniumDsl.g:2687:1: rule__Combobox__Group__4 : rule__Combobox__Group__4__Impl rule__Combobox__Group__5 ;
    public final void rule__Combobox__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2691:1: ( rule__Combobox__Group__4__Impl rule__Combobox__Group__5 )
            // InternalSeleniumDsl.g:2692:2: rule__Combobox__Group__4__Impl rule__Combobox__Group__5
            {
            pushFollow(FOLLOW_13);
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
    // InternalSeleniumDsl.g:2699:1: rule__Combobox__Group__4__Impl : ( 'in' ) ;
    public final void rule__Combobox__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2703:1: ( ( 'in' ) )
            // InternalSeleniumDsl.g:2704:1: ( 'in' )
            {
            // InternalSeleniumDsl.g:2704:1: ( 'in' )
            // InternalSeleniumDsl.g:2705:2: 'in'
            {
             before(grammarAccess.getComboboxAccess().getInKeyword_4()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getComboboxAccess().getInKeyword_4()); 

            }


            }

        }
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
    // InternalSeleniumDsl.g:2714:1: rule__Combobox__Group__5 : rule__Combobox__Group__5__Impl rule__Combobox__Group__6 ;
    public final void rule__Combobox__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2718:1: ( rule__Combobox__Group__5__Impl rule__Combobox__Group__6 )
            // InternalSeleniumDsl.g:2719:2: rule__Combobox__Group__5__Impl rule__Combobox__Group__6
            {
            pushFollow(FOLLOW_39);
            rule__Combobox__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Combobox__Group__6();

            state._fsp--;


            }

        }
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
    // InternalSeleniumDsl.g:2726:1: rule__Combobox__Group__5__Impl : ( 'the' ) ;
    public final void rule__Combobox__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2730:1: ( ( 'the' ) )
            // InternalSeleniumDsl.g:2731:1: ( 'the' )
            {
            // InternalSeleniumDsl.g:2731:1: ( 'the' )
            // InternalSeleniumDsl.g:2732:2: 'the'
            {
             before(grammarAccess.getComboboxAccess().getTheKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComboboxAccess().getTheKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Combobox__Group__6"
    // InternalSeleniumDsl.g:2741:1: rule__Combobox__Group__6 : rule__Combobox__Group__6__Impl rule__Combobox__Group__7 ;
    public final void rule__Combobox__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2745:1: ( rule__Combobox__Group__6__Impl rule__Combobox__Group__7 )
            // InternalSeleniumDsl.g:2746:2: rule__Combobox__Group__6__Impl rule__Combobox__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__Combobox__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Combobox__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Combobox__Group__6"


    // $ANTLR start "rule__Combobox__Group__6__Impl"
    // InternalSeleniumDsl.g:2753:1: rule__Combobox__Group__6__Impl : ( 'combobox' ) ;
    public final void rule__Combobox__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2757:1: ( ( 'combobox' ) )
            // InternalSeleniumDsl.g:2758:1: ( 'combobox' )
            {
            // InternalSeleniumDsl.g:2758:1: ( 'combobox' )
            // InternalSeleniumDsl.g:2759:2: 'combobox'
            {
             before(grammarAccess.getComboboxAccess().getComboboxKeyword_6()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getComboboxAccess().getComboboxKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Combobox__Group__6__Impl"


    // $ANTLR start "rule__Combobox__Group__7"
    // InternalSeleniumDsl.g:2768:1: rule__Combobox__Group__7 : rule__Combobox__Group__7__Impl ;
    public final void rule__Combobox__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2772:1: ( rule__Combobox__Group__7__Impl )
            // InternalSeleniumDsl.g:2773:2: rule__Combobox__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Combobox__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Combobox__Group__7"


    // $ANTLR start "rule__Combobox__Group__7__Impl"
    // InternalSeleniumDsl.g:2779:1: rule__Combobox__Group__7__Impl : ( ( rule__Combobox__LabelAssignment_7 ) ) ;
    public final void rule__Combobox__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2783:1: ( ( ( rule__Combobox__LabelAssignment_7 ) ) )
            // InternalSeleniumDsl.g:2784:1: ( ( rule__Combobox__LabelAssignment_7 ) )
            {
            // InternalSeleniumDsl.g:2784:1: ( ( rule__Combobox__LabelAssignment_7 ) )
            // InternalSeleniumDsl.g:2785:2: ( rule__Combobox__LabelAssignment_7 )
            {
             before(grammarAccess.getComboboxAccess().getLabelAssignment_7()); 
            // InternalSeleniumDsl.g:2786:2: ( rule__Combobox__LabelAssignment_7 )
            // InternalSeleniumDsl.g:2786:3: rule__Combobox__LabelAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Combobox__LabelAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getComboboxAccess().getLabelAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Combobox__Group__7__Impl"


    // $ANTLR start "rule__DOMELEMENT__Group_4__0"
    // InternalSeleniumDsl.g:2795:1: rule__DOMELEMENT__Group_4__0 : rule__DOMELEMENT__Group_4__0__Impl rule__DOMELEMENT__Group_4__1 ;
    public final void rule__DOMELEMENT__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2799:1: ( rule__DOMELEMENT__Group_4__0__Impl rule__DOMELEMENT__Group_4__1 )
            // InternalSeleniumDsl.g:2800:2: rule__DOMELEMENT__Group_4__0__Impl rule__DOMELEMENT__Group_4__1
            {
            pushFollow(FOLLOW_31);
            rule__DOMELEMENT__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DOMELEMENT__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOMELEMENT__Group_4__0"


    // $ANTLR start "rule__DOMELEMENT__Group_4__0__Impl"
    // InternalSeleniumDsl.g:2807:1: rule__DOMELEMENT__Group_4__0__Impl : ( 'text' ) ;
    public final void rule__DOMELEMENT__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2811:1: ( ( 'text' ) )
            // InternalSeleniumDsl.g:2812:1: ( 'text' )
            {
            // InternalSeleniumDsl.g:2812:1: ( 'text' )
            // InternalSeleniumDsl.g:2813:2: 'text'
            {
             before(grammarAccess.getDOMELEMENTAccess().getTextKeyword_4_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDOMELEMENTAccess().getTextKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOMELEMENT__Group_4__0__Impl"


    // $ANTLR start "rule__DOMELEMENT__Group_4__1"
    // InternalSeleniumDsl.g:2822:1: rule__DOMELEMENT__Group_4__1 : rule__DOMELEMENT__Group_4__1__Impl ;
    public final void rule__DOMELEMENT__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2826:1: ( rule__DOMELEMENT__Group_4__1__Impl )
            // InternalSeleniumDsl.g:2827:2: rule__DOMELEMENT__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DOMELEMENT__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOMELEMENT__Group_4__1"


    // $ANTLR start "rule__DOMELEMENT__Group_4__1__Impl"
    // InternalSeleniumDsl.g:2833:1: rule__DOMELEMENT__Group_4__1__Impl : ( 'link' ) ;
    public final void rule__DOMELEMENT__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2837:1: ( ( 'link' ) )
            // InternalSeleniumDsl.g:2838:1: ( 'link' )
            {
            // InternalSeleniumDsl.g:2838:1: ( 'link' )
            // InternalSeleniumDsl.g:2839:2: 'link'
            {
             before(grammarAccess.getDOMELEMENTAccess().getLinkKeyword_4_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDOMELEMENTAccess().getLinkKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOMELEMENT__Group_4__1__Impl"


    // $ANTLR start "rule__BrowserDsl__CommandsAssignment"
    // InternalSeleniumDsl.g:2849:1: rule__BrowserDsl__CommandsAssignment : ( ruleCommand ) ;
    public final void rule__BrowserDsl__CommandsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2853:1: ( ( ruleCommand ) )
            // InternalSeleniumDsl.g:2854:2: ( ruleCommand )
            {
            // InternalSeleniumDsl.g:2854:2: ( ruleCommand )
            // InternalSeleniumDsl.g:2855:3: ruleCommand
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


    // $ANTLR start "rule__GoTo__UrlAssignment_3_0"
    // InternalSeleniumDsl.g:2864:1: rule__GoTo__UrlAssignment_3_0 : ( ruleDynamicURL ) ;
    public final void rule__GoTo__UrlAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2868:1: ( ( ruleDynamicURL ) )
            // InternalSeleniumDsl.g:2869:2: ( ruleDynamicURL )
            {
            // InternalSeleniumDsl.g:2869:2: ( ruleDynamicURL )
            // InternalSeleniumDsl.g:2870:3: ruleDynamicURL
            {
             before(grammarAccess.getGoToAccess().getUrlDynamicURLParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDynamicURL();

            state._fsp--;

             after(grammarAccess.getGoToAccess().getUrlDynamicURLParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__UrlAssignment_3_0"


    // $ANTLR start "rule__Click__LinkTextAssignment_4_0_1"
    // InternalSeleniumDsl.g:2879:1: rule__Click__LinkTextAssignment_4_0_1 : ( RULE_STRING ) ;
    public final void rule__Click__LinkTextAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2883:1: ( ( RULE_STRING ) )
            // InternalSeleniumDsl.g:2884:2: ( RULE_STRING )
            {
            // InternalSeleniumDsl.g:2884:2: ( RULE_STRING )
            // InternalSeleniumDsl.g:2885:3: RULE_STRING
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
    // InternalSeleniumDsl.g:2894:1: rule__Click__ButtonTextAssignment_4_1_1 : ( RULE_STRING ) ;
    public final void rule__Click__ButtonTextAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2898:1: ( ( RULE_STRING ) )
            // InternalSeleniumDsl.g:2899:2: ( RULE_STRING )
            {
            // InternalSeleniumDsl.g:2899:2: ( RULE_STRING )
            // InternalSeleniumDsl.g:2900:3: RULE_STRING
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
    // InternalSeleniumDsl.g:2909:1: rule__Click__AltAssignment_4_2_1 : ( RULE_STRING ) ;
    public final void rule__Click__AltAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2913:1: ( ( RULE_STRING ) )
            // InternalSeleniumDsl.g:2914:2: ( RULE_STRING )
            {
            // InternalSeleniumDsl.g:2914:2: ( RULE_STRING )
            // InternalSeleniumDsl.g:2915:3: RULE_STRING
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
    // InternalSeleniumDsl.g:2924:1: rule__Click__VariableAssignment_4_3_1 : ( ruleDOMELEMENT ) ;
    public final void rule__Click__VariableAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2928:1: ( ( ruleDOMELEMENT ) )
            // InternalSeleniumDsl.g:2929:2: ( ruleDOMELEMENT )
            {
            // InternalSeleniumDsl.g:2929:2: ( ruleDOMELEMENT )
            // InternalSeleniumDsl.g:2930:3: ruleDOMELEMENT
            {
             before(grammarAccess.getClickAccess().getVariableDOMELEMENTParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDOMELEMENT();

            state._fsp--;

             after(grammarAccess.getClickAccess().getVariableDOMELEMENTParserRuleCall_4_3_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Fill__FieldNameAssignment_4"
    // InternalSeleniumDsl.g:2939:1: rule__Fill__FieldNameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Fill__FieldNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2943:1: ( ( RULE_STRING ) )
            // InternalSeleniumDsl.g:2944:2: ( RULE_STRING )
            {
            // InternalSeleniumDsl.g:2944:2: ( RULE_STRING )
            // InternalSeleniumDsl.g:2945:3: RULE_STRING
            {
             before(grammarAccess.getFillAccess().getFieldNameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFillAccess().getFieldNameSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__FieldNameAssignment_4"


    // $ANTLR start "rule__Fill__TextToFillAssignment_7_0_1"
    // InternalSeleniumDsl.g:2954:1: rule__Fill__TextToFillAssignment_7_0_1 : ( RULE_STRING ) ;
    public final void rule__Fill__TextToFillAssignment_7_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2958:1: ( ( RULE_STRING ) )
            // InternalSeleniumDsl.g:2959:2: ( RULE_STRING )
            {
            // InternalSeleniumDsl.g:2959:2: ( RULE_STRING )
            // InternalSeleniumDsl.g:2960:3: RULE_STRING
            {
             before(grammarAccess.getFillAccess().getTextToFillSTRINGTerminalRuleCall_7_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFillAccess().getTextToFillSTRINGTerminalRuleCall_7_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__TextToFillAssignment_7_0_1"


    // $ANTLR start "rule__Fill__VariableAssignment_7_1_1"
    // InternalSeleniumDsl.g:2969:1: rule__Fill__VariableAssignment_7_1_1 : ( ruleDOMELEMENT ) ;
    public final void rule__Fill__VariableAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2973:1: ( ( ruleDOMELEMENT ) )
            // InternalSeleniumDsl.g:2974:2: ( ruleDOMELEMENT )
            {
            // InternalSeleniumDsl.g:2974:2: ( ruleDOMELEMENT )
            // InternalSeleniumDsl.g:2975:3: ruleDOMELEMENT
            {
             before(grammarAccess.getFillAccess().getVariableDOMELEMENTParserRuleCall_7_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDOMELEMENT();

            state._fsp--;

             after(grammarAccess.getFillAccess().getVariableDOMELEMENTParserRuleCall_7_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__VariableAssignment_7_1_1"


    // $ANTLR start "rule__Select__ValuesAssignment_5"
    // InternalSeleniumDsl.g:2984:1: rule__Select__ValuesAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Select__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:2988:1: ( ( RULE_STRING ) )
            // InternalSeleniumDsl.g:2989:2: ( RULE_STRING )
            {
            // InternalSeleniumDsl.g:2989:2: ( RULE_STRING )
            // InternalSeleniumDsl.g:2990:3: RULE_STRING
            {
             before(grammarAccess.getSelectAccess().getValuesSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getValuesSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__ValuesAssignment_5"


    // $ANTLR start "rule__Select__ValuesAssignment_6_1"
    // InternalSeleniumDsl.g:2999:1: rule__Select__ValuesAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__Select__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3003:1: ( ( RULE_STRING ) )
            // InternalSeleniumDsl.g:3004:2: ( RULE_STRING )
            {
            // InternalSeleniumDsl.g:3004:2: ( RULE_STRING )
            // InternalSeleniumDsl.g:3005:3: RULE_STRING
            {
             before(grammarAccess.getSelectAccess().getValuesSTRINGTerminalRuleCall_6_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getValuesSTRINGTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__ValuesAssignment_6_1"


    // $ANTLR start "rule__Verify__TextToVerifyAssignment_7_0_1"
    // InternalSeleniumDsl.g:3014:1: rule__Verify__TextToVerifyAssignment_7_0_1 : ( RULE_STRING ) ;
    public final void rule__Verify__TextToVerifyAssignment_7_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3018:1: ( ( RULE_STRING ) )
            // InternalSeleniumDsl.g:3019:2: ( RULE_STRING )
            {
            // InternalSeleniumDsl.g:3019:2: ( RULE_STRING )
            // InternalSeleniumDsl.g:3020:3: RULE_STRING
            {
             before(grammarAccess.getVerifyAccess().getTextToVerifySTRINGTerminalRuleCall_7_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVerifyAccess().getTextToVerifySTRINGTerminalRuleCall_7_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__TextToVerifyAssignment_7_0_1"


    // $ANTLR start "rule__Verify__LinkToVerifyAssignment_7_1_1"
    // InternalSeleniumDsl.g:3029:1: rule__Verify__LinkToVerifyAssignment_7_1_1 : ( RULE_STRING ) ;
    public final void rule__Verify__LinkToVerifyAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3033:1: ( ( RULE_STRING ) )
            // InternalSeleniumDsl.g:3034:2: ( RULE_STRING )
            {
            // InternalSeleniumDsl.g:3034:2: ( RULE_STRING )
            // InternalSeleniumDsl.g:3035:3: RULE_STRING
            {
             before(grammarAccess.getVerifyAccess().getLinkToVerifySTRINGTerminalRuleCall_7_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVerifyAccess().getLinkToVerifySTRINGTerminalRuleCall_7_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__LinkToVerifyAssignment_7_1_1"


    // $ANTLR start "rule__Verify__VariableAssignment_7_2_1"
    // InternalSeleniumDsl.g:3044:1: rule__Verify__VariableAssignment_7_2_1 : ( ruleDOMELEMENT ) ;
    public final void rule__Verify__VariableAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3048:1: ( ( ruleDOMELEMENT ) )
            // InternalSeleniumDsl.g:3049:2: ( ruleDOMELEMENT )
            {
            // InternalSeleniumDsl.g:3049:2: ( ruleDOMELEMENT )
            // InternalSeleniumDsl.g:3050:3: ruleDOMELEMENT
            {
             before(grammarAccess.getVerifyAccess().getVariableDOMELEMENTParserRuleCall_7_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDOMELEMENT();

            state._fsp--;

             after(grammarAccess.getVerifyAccess().getVariableDOMELEMENTParserRuleCall_7_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__VariableAssignment_7_2_1"


    // $ANTLR start "rule__Read__ElementsAssignment_2"
    // InternalSeleniumDsl.g:3059:1: rule__Read__ElementsAssignment_2 : ( ruleDOMELEMENT ) ;
    public final void rule__Read__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3063:1: ( ( ruleDOMELEMENT ) )
            // InternalSeleniumDsl.g:3064:2: ( ruleDOMELEMENT )
            {
            // InternalSeleniumDsl.g:3064:2: ( ruleDOMELEMENT )
            // InternalSeleniumDsl.g:3065:3: ruleDOMELEMENT
            {
             before(grammarAccess.getReadAccess().getElementsDOMELEMENTParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDOMELEMENT();

            state._fsp--;

             after(grammarAccess.getReadAccess().getElementsDOMELEMENTParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalSeleniumDsl.g:3074:1: rule__Read__ElementsAssignment_3_1 : ( ruleDOMELEMENT ) ;
    public final void rule__Read__ElementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3078:1: ( ( ruleDOMELEMENT ) )
            // InternalSeleniumDsl.g:3079:2: ( ruleDOMELEMENT )
            {
            // InternalSeleniumDsl.g:3079:2: ( ruleDOMELEMENT )
            // InternalSeleniumDsl.g:3080:3: ruleDOMELEMENT
            {
             before(grammarAccess.getReadAccess().getElementsDOMELEMENTParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDOMELEMENT();

            state._fsp--;

             after(grammarAccess.getReadAccess().getElementsDOMELEMENTParserRuleCall_3_1_0()); 

            }


            }

        }
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
    // InternalSeleniumDsl.g:3089:1: rule__Read__LinkTextAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Read__LinkTextAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3093:1: ( ( RULE_STRING ) )
            // InternalSeleniumDsl.g:3094:2: ( RULE_STRING )
            {
            // InternalSeleniumDsl.g:3094:2: ( RULE_STRING )
            // InternalSeleniumDsl.g:3095:3: RULE_STRING
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
    // InternalSeleniumDsl.g:3104:1: rule__Read__NumberAssignment_9 : ( RULE_INT ) ;
    public final void rule__Read__NumberAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3108:1: ( ( RULE_INT ) )
            // InternalSeleniumDsl.g:3109:2: ( RULE_INT )
            {
            // InternalSeleniumDsl.g:3109:2: ( RULE_INT )
            // InternalSeleniumDsl.g:3110:3: RULE_INT
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


    // $ANTLR start "rule__Combobox__OptionAssignment_3"
    // InternalSeleniumDsl.g:3119:1: rule__Combobox__OptionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Combobox__OptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3123:1: ( ( RULE_STRING ) )
            // InternalSeleniumDsl.g:3124:2: ( RULE_STRING )
            {
            // InternalSeleniumDsl.g:3124:2: ( RULE_STRING )
            // InternalSeleniumDsl.g:3125:3: RULE_STRING
            {
             before(grammarAccess.getComboboxAccess().getOptionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getComboboxAccess().getOptionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Combobox__OptionAssignment_3"


    // $ANTLR start "rule__Combobox__LabelAssignment_7"
    // InternalSeleniumDsl.g:3134:1: rule__Combobox__LabelAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Combobox__LabelAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDsl.g:3138:1: ( ( RULE_STRING ) )
            // InternalSeleniumDsl.g:3139:2: ( RULE_STRING )
            {
            // InternalSeleniumDsl.g:3139:2: ( RULE_STRING )
            // InternalSeleniumDsl.g:3140:3: RULE_STRING
            {
             before(grammarAccess.getComboboxAccess().getLabelSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getComboboxAccess().getLabelSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Combobox__LabelAssignment_7"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0001242222880002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000001001C000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000004007C000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000020010004000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000081000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0008000000000000L});

}