/*
 * generated by Xtext 2.32.0
 */
package www.imta.fr.browserautomation.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SeleniumDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("www/imta/fr/browserautomation/parser/antlr/internal/InternalSeleniumDsl.tokens");
	}
}
