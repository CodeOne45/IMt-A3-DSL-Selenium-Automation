/*
 * generated by Xtext 2.32.0
 */
package www.imta.fr.browserautomation.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class SeleniumDslGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class BrowserDslElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "www.imta.fr.browserautomation.SeleniumDsl.BrowserDsl");
		private final Assignment cCommandsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cCommandsCommandParserRuleCall_0 = (RuleCall)cCommandsAssignment.eContents().get(0);
		
		//BrowserDsl:
		//    commands+=Command*;
		@Override public ParserRule getRule() { return rule; }
		
		//commands+=Command*
		public Assignment getCommandsAssignment() { return cCommandsAssignment; }
		
		//Command
		public RuleCall getCommandsCommandParserRuleCall_0() { return cCommandsCommandParserRuleCall_0; }
	}
	public class CommandElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "www.imta.fr.browserautomation.SeleniumDsl.Command");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cOpenBrowserParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cGoToParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cClickParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cFillParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cSelectParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cVerifyParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cReadParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final RuleCall cUncheckParserRuleCall_7 = (RuleCall)cAlternatives.eContents().get(7);
		private final RuleCall cComboboxParserRuleCall_8 = (RuleCall)cAlternatives.eContents().get(8);
		
		//Command:
		//    OpenBrowser | GoTo | Click | Fill | Select | Verify | Read | Uncheck | Combobox;
		@Override public ParserRule getRule() { return rule; }
		
		//OpenBrowser | GoTo | Click | Fill | Select | Verify | Read | Uncheck | Combobox
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//OpenBrowser
		public RuleCall getOpenBrowserParserRuleCall_0() { return cOpenBrowserParserRuleCall_0; }
		
		//GoTo
		public RuleCall getGoToParserRuleCall_1() { return cGoToParserRuleCall_1; }
		
		//Click
		public RuleCall getClickParserRuleCall_2() { return cClickParserRuleCall_2; }
		
		//Fill
		public RuleCall getFillParserRuleCall_3() { return cFillParserRuleCall_3; }
		
		//Select
		public RuleCall getSelectParserRuleCall_4() { return cSelectParserRuleCall_4; }
		
		//Verify
		public RuleCall getVerifyParserRuleCall_5() { return cVerifyParserRuleCall_5; }
		
		//Read
		public RuleCall getReadParserRuleCall_6() { return cReadParserRuleCall_6; }
		
		//Uncheck
		public RuleCall getUncheckParserRuleCall_7() { return cUncheckParserRuleCall_7; }
		
		//Combobox
		public RuleCall getComboboxParserRuleCall_8() { return cComboboxParserRuleCall_8; }
	}
	public class OpenBrowserElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "www.imta.fr.browserautomation.SeleniumDsl.OpenBrowser");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cOpenBrowserAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cOpenKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cAKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cBrowserKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cWindowKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//OpenBrowser:
		//    {OpenBrowser} 'open' 'a' 'browser' 'window';
		@Override public ParserRule getRule() { return rule; }
		
		//{OpenBrowser} 'open' 'a' 'browser' 'window'
		public Group getGroup() { return cGroup; }
		
		//{OpenBrowser}
		public Action getOpenBrowserAction_0() { return cOpenBrowserAction_0; }
		
		//'open'
		public Keyword getOpenKeyword_1() { return cOpenKeyword_1; }
		
		//'a'
		public Keyword getAKeyword_2() { return cAKeyword_2; }
		
		//'browser'
		public Keyword getBrowserKeyword_3() { return cBrowserKeyword_3; }
		
		//'window'
		public Keyword getWindowKeyword_4() { return cWindowKeyword_4; }
	}
	public class GoToElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "www.imta.fr.browserautomation.SeleniumDsl.GoTo");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGoKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cToKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cUrlKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Assignment cUrlAssignment_3_0 = (Assignment)cAlternatives_3.eContents().get(0);
		private final RuleCall cUrlDynamicURLParserRuleCall_3_0_0 = (RuleCall)cUrlAssignment_3_0.eContents().get(0);
		private final Keyword cURLKeyword_3_1 = (Keyword)cAlternatives_3.eContents().get(1);
		
		//GoTo:
		//    'go' 'to' 'url' (url=DynamicURL | 'URL')?;
		@Override public ParserRule getRule() { return rule; }
		
		//'go' 'to' 'url' (url=DynamicURL | 'URL')?
		public Group getGroup() { return cGroup; }
		
		//'go'
		public Keyword getGoKeyword_0() { return cGoKeyword_0; }
		
		//'to'
		public Keyword getToKeyword_1() { return cToKeyword_1; }
		
		//'url'
		public Keyword getUrlKeyword_2() { return cUrlKeyword_2; }
		
		//(url=DynamicURL | 'URL')?
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//url=DynamicURL
		public Assignment getUrlAssignment_3_0() { return cUrlAssignment_3_0; }
		
		//DynamicURL
		public RuleCall getUrlDynamicURLParserRuleCall_3_0_0() { return cUrlDynamicURLParserRuleCall_3_0_0; }
		
		//'URL'
		public Keyword getURLKeyword_3_1() { return cURLKeyword_3_1; }
	}
	public class ClickElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "www.imta.fr.browserautomation.SeleniumDsl.Click");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cClickAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cClickKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cOnKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cTheKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Alternatives cAlternatives_4 = (Alternatives)cGroup.eContents().get(4);
		private final Group cGroup_4_0 = (Group)cAlternatives_4.eContents().get(0);
		private final Keyword cLinkKeyword_4_0_0 = (Keyword)cGroup_4_0.eContents().get(0);
		private final Assignment cLinkTextAssignment_4_0_1 = (Assignment)cGroup_4_0.eContents().get(1);
		private final RuleCall cLinkTextSTRINGTerminalRuleCall_4_0_1_0 = (RuleCall)cLinkTextAssignment_4_0_1.eContents().get(0);
		private final Group cGroup_4_1 = (Group)cAlternatives_4.eContents().get(1);
		private final Keyword cButtonKeyword_4_1_0 = (Keyword)cGroup_4_1.eContents().get(0);
		private final Assignment cButtonTextAssignment_4_1_1 = (Assignment)cGroup_4_1.eContents().get(1);
		private final RuleCall cButtonTextSTRINGTerminalRuleCall_4_1_1_0 = (RuleCall)cButtonTextAssignment_4_1_1.eContents().get(0);
		private final Group cGroup_4_2 = (Group)cAlternatives_4.eContents().get(2);
		private final Keyword cImageKeyword_4_2_0 = (Keyword)cGroup_4_2.eContents().get(0);
		private final Assignment cAltAssignment_4_2_1 = (Assignment)cGroup_4_2.eContents().get(1);
		private final RuleCall cAltSTRINGTerminalRuleCall_4_2_1_0 = (RuleCall)cAltAssignment_4_2_1.eContents().get(0);
		private final Group cGroup_4_3 = (Group)cAlternatives_4.eContents().get(3);
		private final Keyword cVariableKeyword_4_3_0 = (Keyword)cGroup_4_3.eContents().get(0);
		private final Assignment cVariableAssignment_4_3_1 = (Assignment)cGroup_4_3.eContents().get(1);
		private final RuleCall cVariableDOMELEMENTParserRuleCall_4_3_1_0 = (RuleCall)cVariableAssignment_4_3_1.eContents().get(0);
		
		//Click:
		//    {Click} 'click' 'on' 'the' ('link' linkText=STRING | 'button' buttonText=STRING | 'image' alt=STRING | 'variable' variable=DOMELEMENT);
		@Override public ParserRule getRule() { return rule; }
		
		//{Click} 'click' 'on' 'the' ('link' linkText=STRING | 'button' buttonText=STRING | 'image' alt=STRING | 'variable' variable=DOMELEMENT)
		public Group getGroup() { return cGroup; }
		
		//{Click}
		public Action getClickAction_0() { return cClickAction_0; }
		
		//'click'
		public Keyword getClickKeyword_1() { return cClickKeyword_1; }
		
		//'on'
		public Keyword getOnKeyword_2() { return cOnKeyword_2; }
		
		//'the'
		public Keyword getTheKeyword_3() { return cTheKeyword_3; }
		
		//('link' linkText=STRING | 'button' buttonText=STRING | 'image' alt=STRING | 'variable' variable=DOMELEMENT)
		public Alternatives getAlternatives_4() { return cAlternatives_4; }
		
		//'link' linkText=STRING
		public Group getGroup_4_0() { return cGroup_4_0; }
		
		//'link'
		public Keyword getLinkKeyword_4_0_0() { return cLinkKeyword_4_0_0; }
		
		//linkText=STRING
		public Assignment getLinkTextAssignment_4_0_1() { return cLinkTextAssignment_4_0_1; }
		
		//STRING
		public RuleCall getLinkTextSTRINGTerminalRuleCall_4_0_1_0() { return cLinkTextSTRINGTerminalRuleCall_4_0_1_0; }
		
		//'button' buttonText=STRING
		public Group getGroup_4_1() { return cGroup_4_1; }
		
		//'button'
		public Keyword getButtonKeyword_4_1_0() { return cButtonKeyword_4_1_0; }
		
		//buttonText=STRING
		public Assignment getButtonTextAssignment_4_1_1() { return cButtonTextAssignment_4_1_1; }
		
		//STRING
		public RuleCall getButtonTextSTRINGTerminalRuleCall_4_1_1_0() { return cButtonTextSTRINGTerminalRuleCall_4_1_1_0; }
		
		//'image' alt=STRING
		public Group getGroup_4_2() { return cGroup_4_2; }
		
		//'image'
		public Keyword getImageKeyword_4_2_0() { return cImageKeyword_4_2_0; }
		
		//alt=STRING
		public Assignment getAltAssignment_4_2_1() { return cAltAssignment_4_2_1; }
		
		//STRING
		public RuleCall getAltSTRINGTerminalRuleCall_4_2_1_0() { return cAltSTRINGTerminalRuleCall_4_2_1_0; }
		
		//'variable' variable=DOMELEMENT
		public Group getGroup_4_3() { return cGroup_4_3; }
		
		//'variable'
		public Keyword getVariableKeyword_4_3_0() { return cVariableKeyword_4_3_0; }
		
		//variable=DOMELEMENT
		public Assignment getVariableAssignment_4_3_1() { return cVariableAssignment_4_3_1; }
		
		//DOMELEMENT
		public RuleCall getVariableDOMELEMENTParserRuleCall_4_3_1_0() { return cVariableDOMELEMENTParserRuleCall_4_3_1_0; }
	}
	public class FillElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "www.imta.fr.browserautomation.SeleniumDsl.Fill");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFillKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cTheKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cTextKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cFieldKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFieldNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFieldNameSTRINGTerminalRuleCall_4_0 = (RuleCall)cFieldNameAssignment_4.eContents().get(0);
		private final Keyword cWithKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cTheKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Alternatives cAlternatives_7 = (Alternatives)cGroup.eContents().get(7);
		private final Group cGroup_7_0 = (Group)cAlternatives_7.eContents().get(0);
		private final Keyword cTextKeyword_7_0_0 = (Keyword)cGroup_7_0.eContents().get(0);
		private final Assignment cTextToFillAssignment_7_0_1 = (Assignment)cGroup_7_0.eContents().get(1);
		private final RuleCall cTextToFillSTRINGTerminalRuleCall_7_0_1_0 = (RuleCall)cTextToFillAssignment_7_0_1.eContents().get(0);
		private final Group cGroup_7_1 = (Group)cAlternatives_7.eContents().get(1);
		private final Keyword cVariableKeyword_7_1_0 = (Keyword)cGroup_7_1.eContents().get(0);
		private final Assignment cVariableAssignment_7_1_1 = (Assignment)cGroup_7_1.eContents().get(1);
		private final RuleCall cVariableDOMELEMENTParserRuleCall_7_1_1_0 = (RuleCall)cVariableAssignment_7_1_1.eContents().get(0);
		
		//Fill:
		//    'fill' 'the' 'text' 'field' fieldName=STRING 'with' 'the' ( 'text' textToFill=STRING | 'variable' variable=DOMELEMENT);
		@Override public ParserRule getRule() { return rule; }
		
		//'fill' 'the' 'text' 'field' fieldName=STRING 'with' 'the' ( 'text' textToFill=STRING | 'variable' variable=DOMELEMENT)
		public Group getGroup() { return cGroup; }
		
		//'fill'
		public Keyword getFillKeyword_0() { return cFillKeyword_0; }
		
		//'the'
		public Keyword getTheKeyword_1() { return cTheKeyword_1; }
		
		//'text'
		public Keyword getTextKeyword_2() { return cTextKeyword_2; }
		
		//'field'
		public Keyword getFieldKeyword_3() { return cFieldKeyword_3; }
		
		//fieldName=STRING
		public Assignment getFieldNameAssignment_4() { return cFieldNameAssignment_4; }
		
		//STRING
		public RuleCall getFieldNameSTRINGTerminalRuleCall_4_0() { return cFieldNameSTRINGTerminalRuleCall_4_0; }
		
		//'with'
		public Keyword getWithKeyword_5() { return cWithKeyword_5; }
		
		//'the'
		public Keyword getTheKeyword_6() { return cTheKeyword_6; }
		
		//( 'text' textToFill=STRING | 'variable' variable=DOMELEMENT)
		public Alternatives getAlternatives_7() { return cAlternatives_7; }
		
		//'text' textToFill=STRING
		public Group getGroup_7_0() { return cGroup_7_0; }
		
		//'text'
		public Keyword getTextKeyword_7_0_0() { return cTextKeyword_7_0_0; }
		
		//textToFill=STRING
		public Assignment getTextToFillAssignment_7_0_1() { return cTextToFillAssignment_7_0_1; }
		
		//STRING
		public RuleCall getTextToFillSTRINGTerminalRuleCall_7_0_1_0() { return cTextToFillSTRINGTerminalRuleCall_7_0_1_0; }
		
		//'variable' variable=DOMELEMENT
		public Group getGroup_7_1() { return cGroup_7_1; }
		
		//'variable'
		public Keyword getVariableKeyword_7_1_0() { return cVariableKeyword_7_1_0; }
		
		//variable=DOMELEMENT
		public Assignment getVariableAssignment_7_1_1() { return cVariableAssignment_7_1_1; }
		
		//DOMELEMENT
		public RuleCall getVariableDOMELEMENTParserRuleCall_7_1_1_0() { return cVariableDOMELEMENTParserRuleCall_7_1_1_0; }
	}
	public class SelectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "www.imta.fr.browserautomation.SeleniumDsl.Select");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSelectKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cTheKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cCheckboxKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cWithKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cValuesKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cValuesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cValuesSTRINGTerminalRuleCall_5_0 = (RuleCall)cValuesAssignment_5.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cCommaKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cValuesAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cValuesSTRINGTerminalRuleCall_6_1_0 = (RuleCall)cValuesAssignment_6_1.eContents().get(0);
		
		//Select:
		//    'select' 'the' 'checkbox' 'with' 'values' values+=STRING (',' values+=STRING)*;
		@Override public ParserRule getRule() { return rule; }
		
		//'select' 'the' 'checkbox' 'with' 'values' values+=STRING (',' values+=STRING)*
		public Group getGroup() { return cGroup; }
		
		//'select'
		public Keyword getSelectKeyword_0() { return cSelectKeyword_0; }
		
		//'the'
		public Keyword getTheKeyword_1() { return cTheKeyword_1; }
		
		//'checkbox'
		public Keyword getCheckboxKeyword_2() { return cCheckboxKeyword_2; }
		
		//'with'
		public Keyword getWithKeyword_3() { return cWithKeyword_3; }
		
		//'values'
		public Keyword getValuesKeyword_4() { return cValuesKeyword_4; }
		
		//values+=STRING
		public Assignment getValuesAssignment_5() { return cValuesAssignment_5; }
		
		//STRING
		public RuleCall getValuesSTRINGTerminalRuleCall_5_0() { return cValuesSTRINGTerminalRuleCall_5_0; }
		
		//(',' values+=STRING)*
		public Group getGroup_6() { return cGroup_6; }
		
		//','
		public Keyword getCommaKeyword_6_0() { return cCommaKeyword_6_0; }
		
		//values+=STRING
		public Assignment getValuesAssignment_6_1() { return cValuesAssignment_6_1; }
		
		//STRING
		public RuleCall getValuesSTRINGTerminalRuleCall_6_1_0() { return cValuesSTRINGTerminalRuleCall_6_1_0; }
	}
	public class VerifyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "www.imta.fr.browserautomation.SeleniumDsl.Verify");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVerifyAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cVerifyKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cThatKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cTheKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cPageKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cContainsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cTheKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Alternatives cAlternatives_7 = (Alternatives)cGroup.eContents().get(7);
		private final Group cGroup_7_0 = (Group)cAlternatives_7.eContents().get(0);
		private final Keyword cStringKeyword_7_0_0 = (Keyword)cGroup_7_0.eContents().get(0);
		private final Assignment cTextToVerifyAssignment_7_0_1 = (Assignment)cGroup_7_0.eContents().get(1);
		private final RuleCall cTextToVerifySTRINGTerminalRuleCall_7_0_1_0 = (RuleCall)cTextToVerifyAssignment_7_0_1.eContents().get(0);
		private final Group cGroup_7_1 = (Group)cAlternatives_7.eContents().get(1);
		private final Keyword cLinkKeyword_7_1_0 = (Keyword)cGroup_7_1.eContents().get(0);
		private final Assignment cLinkToVerifyAssignment_7_1_1 = (Assignment)cGroup_7_1.eContents().get(1);
		private final RuleCall cLinkToVerifySTRINGTerminalRuleCall_7_1_1_0 = (RuleCall)cLinkToVerifyAssignment_7_1_1.eContents().get(0);
		private final Group cGroup_7_2 = (Group)cAlternatives_7.eContents().get(2);
		private final Keyword cVariableKeyword_7_2_0 = (Keyword)cGroup_7_2.eContents().get(0);
		private final Assignment cVariableAssignment_7_2_1 = (Assignment)cGroup_7_2.eContents().get(1);
		private final RuleCall cVariableDOMELEMENTParserRuleCall_7_2_1_0 = (RuleCall)cVariableAssignment_7_2_1.eContents().get(0);
		
		//Verify:
		//    {Verify} 'verify' 'that' 'the' 'page' 'contains' 'the' ( 'string' textToVerify=STRING | 'link' linkToVerify=STRING | 'variable' variable=DOMELEMENT);
		@Override public ParserRule getRule() { return rule; }
		
		//{Verify} 'verify' 'that' 'the' 'page' 'contains' 'the' ( 'string' textToVerify=STRING | 'link' linkToVerify=STRING | 'variable' variable=DOMELEMENT)
		public Group getGroup() { return cGroup; }
		
		//{Verify}
		public Action getVerifyAction_0() { return cVerifyAction_0; }
		
		//'verify'
		public Keyword getVerifyKeyword_1() { return cVerifyKeyword_1; }
		
		//'that'
		public Keyword getThatKeyword_2() { return cThatKeyword_2; }
		
		//'the'
		public Keyword getTheKeyword_3() { return cTheKeyword_3; }
		
		//'page'
		public Keyword getPageKeyword_4() { return cPageKeyword_4; }
		
		//'contains'
		public Keyword getContainsKeyword_5() { return cContainsKeyword_5; }
		
		//'the'
		public Keyword getTheKeyword_6() { return cTheKeyword_6; }
		
		//( 'string' textToVerify=STRING | 'link' linkToVerify=STRING | 'variable' variable=DOMELEMENT)
		public Alternatives getAlternatives_7() { return cAlternatives_7; }
		
		//'string' textToVerify=STRING
		public Group getGroup_7_0() { return cGroup_7_0; }
		
		//'string'
		public Keyword getStringKeyword_7_0_0() { return cStringKeyword_7_0_0; }
		
		//textToVerify=STRING
		public Assignment getTextToVerifyAssignment_7_0_1() { return cTextToVerifyAssignment_7_0_1; }
		
		//STRING
		public RuleCall getTextToVerifySTRINGTerminalRuleCall_7_0_1_0() { return cTextToVerifySTRINGTerminalRuleCall_7_0_1_0; }
		
		//'link' linkToVerify=STRING
		public Group getGroup_7_1() { return cGroup_7_1; }
		
		//'link'
		public Keyword getLinkKeyword_7_1_0() { return cLinkKeyword_7_1_0; }
		
		//linkToVerify=STRING
		public Assignment getLinkToVerifyAssignment_7_1_1() { return cLinkToVerifyAssignment_7_1_1; }
		
		//STRING
		public RuleCall getLinkToVerifySTRINGTerminalRuleCall_7_1_1_0() { return cLinkToVerifySTRINGTerminalRuleCall_7_1_1_0; }
		
		//'variable' variable=DOMELEMENT
		public Group getGroup_7_2() { return cGroup_7_2; }
		
		//'variable'
		public Keyword getVariableKeyword_7_2_0() { return cVariableKeyword_7_2_0; }
		
		//variable=DOMELEMENT
		public Assignment getVariableAssignment_7_2_1() { return cVariableAssignment_7_2_1; }
		
		//DOMELEMENT
		public RuleCall getVariableDOMELEMENTParserRuleCall_7_2_1_0() { return cVariableDOMELEMENTParserRuleCall_7_2_1_0; }
	}
	public class ReadElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "www.imta.fr.browserautomation.SeleniumDsl.Read");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cReadKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cTheKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cElementsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cElementsDOMELEMENTParserRuleCall_2_0 = (RuleCall)cElementsAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cCommaKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cElementsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cElementsDOMELEMENTParserRuleCall_3_1_0 = (RuleCall)cElementsAssignment_3_1.eContents().get(0);
		private final Keyword cOfKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cTheKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cLinkKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cLinkTextAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cLinkTextSTRINGTerminalRuleCall_7_0 = (RuleCall)cLinkTextAssignment_7.eContents().get(0);
		private final Keyword cNumberKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cNumberAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cNumberINTTerminalRuleCall_9_0 = (RuleCall)cNumberAssignment_9.eContents().get(0);
		
		//Read:
		//    'read' 'the' elements+=DOMELEMENT (',' elements+=DOMELEMENT)* 'of' 'the' 'link' linkText=STRING 'number' number=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'read' 'the' elements+=DOMELEMENT (',' elements+=DOMELEMENT)* 'of' 'the' 'link' linkText=STRING 'number' number=INT
		public Group getGroup() { return cGroup; }
		
		//'read'
		public Keyword getReadKeyword_0() { return cReadKeyword_0; }
		
		//'the'
		public Keyword getTheKeyword_1() { return cTheKeyword_1; }
		
		//elements+=DOMELEMENT
		public Assignment getElementsAssignment_2() { return cElementsAssignment_2; }
		
		//DOMELEMENT
		public RuleCall getElementsDOMELEMENTParserRuleCall_2_0() { return cElementsDOMELEMENTParserRuleCall_2_0; }
		
		//(',' elements+=DOMELEMENT)*
		public Group getGroup_3() { return cGroup_3; }
		
		//','
		public Keyword getCommaKeyword_3_0() { return cCommaKeyword_3_0; }
		
		//elements+=DOMELEMENT
		public Assignment getElementsAssignment_3_1() { return cElementsAssignment_3_1; }
		
		//DOMELEMENT
		public RuleCall getElementsDOMELEMENTParserRuleCall_3_1_0() { return cElementsDOMELEMENTParserRuleCall_3_1_0; }
		
		//'of'
		public Keyword getOfKeyword_4() { return cOfKeyword_4; }
		
		//'the'
		public Keyword getTheKeyword_5() { return cTheKeyword_5; }
		
		//'link'
		public Keyword getLinkKeyword_6() { return cLinkKeyword_6; }
		
		//linkText=STRING
		public Assignment getLinkTextAssignment_7() { return cLinkTextAssignment_7; }
		
		//STRING
		public RuleCall getLinkTextSTRINGTerminalRuleCall_7_0() { return cLinkTextSTRINGTerminalRuleCall_7_0; }
		
		//'number'
		public Keyword getNumberKeyword_8() { return cNumberKeyword_8; }
		
		//number=INT
		public Assignment getNumberAssignment_9() { return cNumberAssignment_9; }
		
		//INT
		public RuleCall getNumberINTTerminalRuleCall_9_0() { return cNumberINTTerminalRuleCall_9_0; }
	}
	public class UncheckElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "www.imta.fr.browserautomation.SeleniumDsl.Uncheck");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cUncheckAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cUncheckKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cAllKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cCheckboxesKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Uncheck:
		//    {Uncheck} 'uncheck' 'all' 'checkboxes';
		@Override public ParserRule getRule() { return rule; }
		
		//{Uncheck} 'uncheck' 'all' 'checkboxes'
		public Group getGroup() { return cGroup; }
		
		//{Uncheck}
		public Action getUncheckAction_0() { return cUncheckAction_0; }
		
		//'uncheck'
		public Keyword getUncheckKeyword_1() { return cUncheckKeyword_1; }
		
		//'all'
		public Keyword getAllKeyword_2() { return cAllKeyword_2; }
		
		//'checkboxes'
		public Keyword getCheckboxesKeyword_3() { return cCheckboxesKeyword_3; }
	}
	public class ComboboxElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "www.imta.fr.browserautomation.SeleniumDsl.Combobox");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cChooseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cTheKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cOptionKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cOptionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cOptionSTRINGTerminalRuleCall_3_0 = (RuleCall)cOptionAssignment_3.eContents().get(0);
		private final Keyword cInKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cTheKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cComboboxKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cLabelAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cLabelSTRINGTerminalRuleCall_7_0 = (RuleCall)cLabelAssignment_7.eContents().get(0);
		
		//Combobox:
		//    'choose' 'the' 'option' option=STRING 'in' 'the' 'combobox' label=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'choose' 'the' 'option' option=STRING 'in' 'the' 'combobox' label=STRING
		public Group getGroup() { return cGroup; }
		
		//'choose'
		public Keyword getChooseKeyword_0() { return cChooseKeyword_0; }
		
		//'the'
		public Keyword getTheKeyword_1() { return cTheKeyword_1; }
		
		//'option'
		public Keyword getOptionKeyword_2() { return cOptionKeyword_2; }
		
		//option=STRING
		public Assignment getOptionAssignment_3() { return cOptionAssignment_3; }
		
		//STRING
		public RuleCall getOptionSTRINGTerminalRuleCall_3_0() { return cOptionSTRINGTerminalRuleCall_3_0; }
		
		//'in'
		public Keyword getInKeyword_4() { return cInKeyword_4; }
		
		//'the'
		public Keyword getTheKeyword_5() { return cTheKeyword_5; }
		
		//'combobox'
		public Keyword getComboboxKeyword_6() { return cComboboxKeyword_6; }
		
		//label=STRING
		public Assignment getLabelAssignment_7() { return cLabelAssignment_7; }
		
		//STRING
		public RuleCall getLabelSTRINGTerminalRuleCall_7_0() { return cLabelSTRINGTerminalRuleCall_7_0; }
	}
	public class DOMELEMENTElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "www.imta.fr.browserautomation.SeleniumDsl.DOMELEMENT");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cLinkKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cButtonKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cImageKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cUrlKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Group cGroup_4 = (Group)cAlternatives.eContents().get(4);
		private final Keyword cTextKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cLinkKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Keyword cTitleKeyword_5 = (Keyword)cAlternatives.eContents().get(5);
		
		//DOMELEMENT:
		//    ('link' | 'button' | 'image' | 'url' | 'text' 'link' | 'title');
		@Override public ParserRule getRule() { return rule; }
		
		//('link' | 'button' | 'image' | 'url' | 'text' 'link' | 'title')
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'link'
		public Keyword getLinkKeyword_0() { return cLinkKeyword_0; }
		
		//'button'
		public Keyword getButtonKeyword_1() { return cButtonKeyword_1; }
		
		//'image'
		public Keyword getImageKeyword_2() { return cImageKeyword_2; }
		
		//'url'
		public Keyword getUrlKeyword_3() { return cUrlKeyword_3; }
		
		//'text' 'link'
		public Group getGroup_4() { return cGroup_4; }
		
		//'text'
		public Keyword getTextKeyword_4_0() { return cTextKeyword_4_0; }
		
		//'link'
		public Keyword getLinkKeyword_4_1() { return cLinkKeyword_4_1; }
		
		//'title'
		public Keyword getTitleKeyword_5() { return cTitleKeyword_5; }
	}
	public class DynamicURLElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "www.imta.fr.browserautomation.SeleniumDsl.DynamicURL");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cURLTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cSTRINGTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//DynamicURL: (URL | STRING);
		@Override public ParserRule getRule() { return rule; }
		
		//(URL | STRING)
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//URL
		public RuleCall getURLTerminalRuleCall_0() { return cURLTerminalRuleCall_0; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_1() { return cSTRINGTerminalRuleCall_1; }
	}
	
	
	private final BrowserDslElements pBrowserDsl;
	private final TerminalRule tURL;
	private final TerminalRule tDOMAIN;
	private final CommandElements pCommand;
	private final OpenBrowserElements pOpenBrowser;
	private final GoToElements pGoTo;
	private final ClickElements pClick;
	private final FillElements pFill;
	private final SelectElements pSelect;
	private final VerifyElements pVerify;
	private final ReadElements pRead;
	private final UncheckElements pUncheck;
	private final ComboboxElements pCombobox;
	private final DOMELEMENTElements pDOMELEMENT;
	private final DynamicURLElements pDynamicURL;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SeleniumDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pBrowserDsl = new BrowserDslElements();
		this.tURL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "www.imta.fr.browserautomation.SeleniumDsl.URL");
		this.tDOMAIN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "www.imta.fr.browserautomation.SeleniumDsl.DOMAIN");
		this.pCommand = new CommandElements();
		this.pOpenBrowser = new OpenBrowserElements();
		this.pGoTo = new GoToElements();
		this.pClick = new ClickElements();
		this.pFill = new FillElements();
		this.pSelect = new SelectElements();
		this.pVerify = new VerifyElements();
		this.pRead = new ReadElements();
		this.pUncheck = new UncheckElements();
		this.pCombobox = new ComboboxElements();
		this.pDOMELEMENT = new DOMELEMENTElements();
		this.pDynamicURL = new DynamicURLElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("www.imta.fr.browserautomation.SeleniumDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//BrowserDsl:
	//    commands+=Command*;
	public BrowserDslElements getBrowserDslAccess() {
		return pBrowserDsl;
	}
	
	public ParserRule getBrowserDslRule() {
		return getBrowserDslAccess().getRule();
	}
	
	//terminal URL: ('http' 's'? '://')? (DOMAIN) (':' DOMAIN)* ('.' DOMAIN)* ('/' ('~' | DOMAIN))* ('?' ('~' | DOMAIN))* ('#' ('~' | DOMAIN))?;
	public TerminalRule getURLRule() {
		return tURL;
	}
	
	//terminal DOMAIN: ('a'..'z'|'A'..'Z'|'_'|'-') ('a'..'z'|'A'..'Z'|'_'|'0'..'9'|'-')*;
	public TerminalRule getDOMAINRule() {
		return tDOMAIN;
	}
	
	//Command:
	//    OpenBrowser | GoTo | Click | Fill | Select | Verify | Read | Uncheck | Combobox;
	public CommandElements getCommandAccess() {
		return pCommand;
	}
	
	public ParserRule getCommandRule() {
		return getCommandAccess().getRule();
	}
	
	//OpenBrowser:
	//    {OpenBrowser} 'open' 'a' 'browser' 'window';
	public OpenBrowserElements getOpenBrowserAccess() {
		return pOpenBrowser;
	}
	
	public ParserRule getOpenBrowserRule() {
		return getOpenBrowserAccess().getRule();
	}
	
	//GoTo:
	//    'go' 'to' 'url' (url=DynamicURL | 'URL')?;
	public GoToElements getGoToAccess() {
		return pGoTo;
	}
	
	public ParserRule getGoToRule() {
		return getGoToAccess().getRule();
	}
	
	//Click:
	//    {Click} 'click' 'on' 'the' ('link' linkText=STRING | 'button' buttonText=STRING | 'image' alt=STRING | 'variable' variable=DOMELEMENT);
	public ClickElements getClickAccess() {
		return pClick;
	}
	
	public ParserRule getClickRule() {
		return getClickAccess().getRule();
	}
	
	//Fill:
	//    'fill' 'the' 'text' 'field' fieldName=STRING 'with' 'the' ( 'text' textToFill=STRING | 'variable' variable=DOMELEMENT);
	public FillElements getFillAccess() {
		return pFill;
	}
	
	public ParserRule getFillRule() {
		return getFillAccess().getRule();
	}
	
	//Select:
	//    'select' 'the' 'checkbox' 'with' 'values' values+=STRING (',' values+=STRING)*;
	public SelectElements getSelectAccess() {
		return pSelect;
	}
	
	public ParserRule getSelectRule() {
		return getSelectAccess().getRule();
	}
	
	//Verify:
	//    {Verify} 'verify' 'that' 'the' 'page' 'contains' 'the' ( 'string' textToVerify=STRING | 'link' linkToVerify=STRING | 'variable' variable=DOMELEMENT);
	public VerifyElements getVerifyAccess() {
		return pVerify;
	}
	
	public ParserRule getVerifyRule() {
		return getVerifyAccess().getRule();
	}
	
	//Read:
	//    'read' 'the' elements+=DOMELEMENT (',' elements+=DOMELEMENT)* 'of' 'the' 'link' linkText=STRING 'number' number=INT;
	public ReadElements getReadAccess() {
		return pRead;
	}
	
	public ParserRule getReadRule() {
		return getReadAccess().getRule();
	}
	
	//Uncheck:
	//    {Uncheck} 'uncheck' 'all' 'checkboxes';
	public UncheckElements getUncheckAccess() {
		return pUncheck;
	}
	
	public ParserRule getUncheckRule() {
		return getUncheckAccess().getRule();
	}
	
	//Combobox:
	//    'choose' 'the' 'option' option=STRING 'in' 'the' 'combobox' label=STRING;
	public ComboboxElements getComboboxAccess() {
		return pCombobox;
	}
	
	public ParserRule getComboboxRule() {
		return getComboboxAccess().getRule();
	}
	
	//DOMELEMENT:
	//    ('link' | 'button' | 'image' | 'url' | 'text' 'link' | 'title');
	public DOMELEMENTElements getDOMELEMENTAccess() {
		return pDOMELEMENT;
	}
	
	public ParserRule getDOMELEMENTRule() {
		return getDOMELEMENTAccess().getRule();
	}
	
	//DynamicURL: (URL | STRING);
	public DynamicURLElements getDynamicURLAccess() {
		return pDynamicURL;
	}
	
	public ParserRule getDynamicURLRule() {
		return getDynamicURLAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
