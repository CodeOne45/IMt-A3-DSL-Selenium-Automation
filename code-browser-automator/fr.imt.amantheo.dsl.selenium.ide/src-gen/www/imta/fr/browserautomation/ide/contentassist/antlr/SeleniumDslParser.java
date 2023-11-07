/*
 * generated by Xtext 2.32.0
 */
package www.imta.fr.browserautomation.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import www.imta.fr.browserautomation.ide.contentassist.antlr.internal.InternalSeleniumDslParser;
import www.imta.fr.browserautomation.services.SeleniumDslGrammarAccess;

public class SeleniumDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(SeleniumDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, SeleniumDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getCommandAccess().getAlternatives(), "rule__Command__Alternatives");
			builder.put(grammarAccess.getGoToAccess().getAlternatives_3(), "rule__GoTo__Alternatives_3");
			builder.put(grammarAccess.getClickAccess().getAlternatives_4(), "rule__Click__Alternatives_4");
			builder.put(grammarAccess.getFillAccess().getAlternatives_7(), "rule__Fill__Alternatives_7");
			builder.put(grammarAccess.getVerifyAccess().getAlternatives_7(), "rule__Verify__Alternatives_7");
			builder.put(grammarAccess.getDOMELEMENTAccess().getAlternatives(), "rule__DOMELEMENT__Alternatives");
			builder.put(grammarAccess.getDynamicURLAccess().getAlternatives(), "rule__DynamicURL__Alternatives");
			builder.put(grammarAccess.getOpenBrowserAccess().getGroup(), "rule__OpenBrowser__Group__0");
			builder.put(grammarAccess.getGoToAccess().getGroup(), "rule__GoTo__Group__0");
			builder.put(grammarAccess.getClickAccess().getGroup(), "rule__Click__Group__0");
			builder.put(grammarAccess.getClickAccess().getGroup_4_0(), "rule__Click__Group_4_0__0");
			builder.put(grammarAccess.getClickAccess().getGroup_4_1(), "rule__Click__Group_4_1__0");
			builder.put(grammarAccess.getClickAccess().getGroup_4_2(), "rule__Click__Group_4_2__0");
			builder.put(grammarAccess.getClickAccess().getGroup_4_3(), "rule__Click__Group_4_3__0");
			builder.put(grammarAccess.getFillAccess().getGroup(), "rule__Fill__Group__0");
			builder.put(grammarAccess.getFillAccess().getGroup_7_0(), "rule__Fill__Group_7_0__0");
			builder.put(grammarAccess.getFillAccess().getGroup_7_1(), "rule__Fill__Group_7_1__0");
			builder.put(grammarAccess.getSelectAccess().getGroup(), "rule__Select__Group__0");
			builder.put(grammarAccess.getSelectAccess().getGroup_6(), "rule__Select__Group_6__0");
			builder.put(grammarAccess.getVerifyAccess().getGroup(), "rule__Verify__Group__0");
			builder.put(grammarAccess.getVerifyAccess().getGroup_7_0(), "rule__Verify__Group_7_0__0");
			builder.put(grammarAccess.getVerifyAccess().getGroup_7_1(), "rule__Verify__Group_7_1__0");
			builder.put(grammarAccess.getVerifyAccess().getGroup_7_2(), "rule__Verify__Group_7_2__0");
			builder.put(grammarAccess.getReadAccess().getGroup(), "rule__Read__Group__0");
			builder.put(grammarAccess.getReadAccess().getGroup_3(), "rule__Read__Group_3__0");
			builder.put(grammarAccess.getUncheckAccess().getGroup(), "rule__Uncheck__Group__0");
			builder.put(grammarAccess.getComboboxAccess().getGroup(), "rule__Combobox__Group__0");
			builder.put(grammarAccess.getDOMELEMENTAccess().getGroup_4(), "rule__DOMELEMENT__Group_4__0");
			builder.put(grammarAccess.getBrowserDslAccess().getCommandsAssignment(), "rule__BrowserDsl__CommandsAssignment");
			builder.put(grammarAccess.getGoToAccess().getUrlAssignment_3_0(), "rule__GoTo__UrlAssignment_3_0");
			builder.put(grammarAccess.getClickAccess().getLinkTextAssignment_4_0_1(), "rule__Click__LinkTextAssignment_4_0_1");
			builder.put(grammarAccess.getClickAccess().getButtonTextAssignment_4_1_1(), "rule__Click__ButtonTextAssignment_4_1_1");
			builder.put(grammarAccess.getClickAccess().getAltAssignment_4_2_1(), "rule__Click__AltAssignment_4_2_1");
			builder.put(grammarAccess.getClickAccess().getVariableAssignment_4_3_1(), "rule__Click__VariableAssignment_4_3_1");
			builder.put(grammarAccess.getFillAccess().getFieldNameAssignment_4(), "rule__Fill__FieldNameAssignment_4");
			builder.put(grammarAccess.getFillAccess().getTextToFillAssignment_7_0_1(), "rule__Fill__TextToFillAssignment_7_0_1");
			builder.put(grammarAccess.getFillAccess().getVariableAssignment_7_1_1(), "rule__Fill__VariableAssignment_7_1_1");
			builder.put(grammarAccess.getSelectAccess().getValuesAssignment_5(), "rule__Select__ValuesAssignment_5");
			builder.put(grammarAccess.getSelectAccess().getValuesAssignment_6_1(), "rule__Select__ValuesAssignment_6_1");
			builder.put(grammarAccess.getVerifyAccess().getTextToVerifyAssignment_7_0_1(), "rule__Verify__TextToVerifyAssignment_7_0_1");
			builder.put(grammarAccess.getVerifyAccess().getLinkToVerifyAssignment_7_1_1(), "rule__Verify__LinkToVerifyAssignment_7_1_1");
			builder.put(grammarAccess.getVerifyAccess().getVariableAssignment_7_2_1(), "rule__Verify__VariableAssignment_7_2_1");
			builder.put(grammarAccess.getReadAccess().getElementsAssignment_2(), "rule__Read__ElementsAssignment_2");
			builder.put(grammarAccess.getReadAccess().getElementsAssignment_3_1(), "rule__Read__ElementsAssignment_3_1");
			builder.put(grammarAccess.getReadAccess().getLinkTextAssignment_7(), "rule__Read__LinkTextAssignment_7");
			builder.put(grammarAccess.getReadAccess().getNumberAssignment_9(), "rule__Read__NumberAssignment_9");
			builder.put(grammarAccess.getComboboxAccess().getOptionAssignment_3(), "rule__Combobox__OptionAssignment_3");
			builder.put(grammarAccess.getComboboxAccess().getLabelAssignment_7(), "rule__Combobox__LabelAssignment_7");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private SeleniumDslGrammarAccess grammarAccess;

	@Override
	protected InternalSeleniumDslParser createParser() {
		InternalSeleniumDslParser result = new InternalSeleniumDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SeleniumDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SeleniumDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
