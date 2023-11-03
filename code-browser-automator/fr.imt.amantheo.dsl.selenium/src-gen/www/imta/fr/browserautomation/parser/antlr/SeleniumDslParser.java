/*
 * generated by Xtext 2.32.0
 */
package www.imta.fr.browserautomation.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import www.imta.fr.browserautomation.parser.antlr.internal.InternalSeleniumDslParser;
import www.imta.fr.browserautomation.services.SeleniumDslGrammarAccess;

public class SeleniumDslParser extends AbstractAntlrParser {

	@Inject
	private SeleniumDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalSeleniumDslParser createParser(XtextTokenStream stream) {
		return new InternalSeleniumDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "BrowserDsl";
	}

	public SeleniumDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SeleniumDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}