/*
 * generated by Xtext 2.32.0
 */
package www.imta.fr.browserautomation.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractSeleniumDslValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(www.imta.fr.browserautomation.seleniumDsl.SeleniumDslPackage.eINSTANCE);
		return result;
	}
}