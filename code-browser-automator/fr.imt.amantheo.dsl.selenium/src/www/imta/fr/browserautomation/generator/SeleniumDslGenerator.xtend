/*
 * generated by Xtext 2.32.0
 */
package www.imta.fr.browserautomation.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import www.imta.fr.browserautomation.seleniumDsl.BrowserDsl
import www.imta.fr.browserautomation.seleniumDsl.Command
import www.imta.fr.browserautomation.seleniumDsl.OpenBrowser
import www.imta.fr.browserautomation.seleniumDsl.GoTo
import www.imta.fr.browserautomation.seleniumDsl.Click
import www.imta.fr.browserautomation.seleniumDsl.Fill
import www.imta.fr.browserautomation.seleniumDsl.Select
import www.imta.fr.browserautomation.seleniumDsl.Verify
import www.imta.fr.browserautomation.seleniumDsl.Read
import www.imta.fr.browserautomation.seleniumDsl.Uncheck
import www.imta.fr.browserautomation.seleniumDsl.Combobox

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class SeleniumDslGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        val model = resource.getContents().get(0) as BrowserDsl;

        if (model !== null) {
            val inputFileName = resource.URI.lastSegment.toString();

	        	
        	var name = inputFileName.replaceFirst(".selenium", ".java");
	    		    
		    var className = resource.URI.lastSegment.toString().replaceFirst(".selenium", "")
		    
		    className = Character.toUpperCase(className.charAt(0)) + className.substring(1);
		    
		    name = Character.toUpperCase(name.charAt(0)) + name.substring(1) ;

            val generatedCode = generateSeleniumCode(model, className);
            fsa.generateFile("fr/imta/amanthéo/browser/" + name, generatedCode);
        }
    }

    def String generateSeleniumCode(BrowserDsl model, String className) {
        var code = ""
        code += generateImportStatements()
        code += "public class " + className + " {\n"
        code += "    public static void main(String[] args) {\n"

        for (Command command : model.getCommands()) {
            code += processCommand(command)
        }

        code += "        driver.quit();\n"
        code += "    }\n"
        code += "}\n"

        return code.toString();
    }

    def String generateImportStatements() {
        return '''
package fr.imta.amanthéo.browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import dev.failsafe.internal.util.Assert;
import java.util.*;
'''
    }

    def String processCommand(Command command) {
        if (command instanceof OpenBrowser) {
            return "        WebDriver driver = new ChromeDriver();\n\n"
        } else if (command instanceof GoTo) {
            return "        // Go to URL\n" + "        driver.get(\"" + command.getUrl() + "\");\n\n"
        } else if (command instanceof Click) {
            return processClickCommand(command)
        } else if (command instanceof Fill) {
            return processFillCommand(command)
        } else if (command instanceof Select) {
            return processSelectCommand(command)
        } else if (command instanceof Verify) {
            return processVerifyCommand(command)
        } else if (command instanceof Read) {
            return processReadCommand(command)
        } else if (command instanceof Uncheck) {
            return "        // Uncheck all checkboxes\n"
                    + "        List<WebElement> checkboxes = driver.findElements(By.xpath(\"//input[@type='checkbox']\"));\n"
                    + "        for (WebElement checkbox : checkboxes) {\n"
                    + "            if (checkbox.isSelected()) {\n"
                    + "                checkbox.click();\n"
                    + "            }\n"
                    + "        }\n";
        } else if (command instanceof Combobox) {
            return "        // Combobox\n";
        } else {
            return "";
        }
    }

    def String processClickCommand(Click command) {
        if (command.linkText !== null) {
            return "        // Click on the link with text: " + command.linkText + "\n"
                    + "        WebElement e = driver.findElement(By.xpath(\"//a[text()='" + command.linkText + "']\"));\n"
                    + "        driver.get(e.getAttribute(\"href\"));\n";
        } else if (command.buttonText !== null) {
            return "        // Click on a button with value: " + command.buttonText + "\n"
                    + "        driver.findElement(By.xpath(\"//input[@value='" + command.buttonText + "']\")).click();\n";
        } else if (command.alt !== null) {
            return "        // Click on an image with alt text: " + command.alt + "\n"
                    + "        driver.findElement(By.xpath(\"//img[@alt='" + command.alt + "']\")).click();\n";
        } else if (command.variable !== null) {
            if (command.variable == "url") {
                return "        // Open the URL specified in the variable 'url'\n"
                        + "        driver.get(" + command.variable + ");\n";
            }
        }
        return "";
    }

    def String processFillCommand(Fill command) {
        return "        // Fill the text field: " + command.fieldName + "\n"
                + "        WebElement labelElement = driver.findElements(By.xpath(\"//label[text()='" + command.fieldName + "']\")).get(1);\n"
                + "        WebElement inputElement = driver.findElement(By.id(labelElement.getAttribute(\"for\")));\n"
                + (command.textToFill !== null
                        ? "        inputElement.sendKeys(\"" + command.textToFill + "\");\n"
                        : "        inputElement.sendKeys(" + command.variable + ");\n");
    }

    def String processSelectCommand(Select command) {
        val values = command.values.map[v | "\"" + v + "\""].join(", ");
        return "        // Select values in the element: " + command.elementType + "\n"
                + "        List<String> valuesToCheck = Arrays.asList(" + values + ");\n"
                + "        JavascriptExecutor js = (JavascriptExecutor) driver;\n"
                + "        js.executeScript(\"window.scrollTo(0, 340);\");\n"
                + "        for(String value: valuesToCheck) {\n"
                + "            WebElement labelElement = driver.findElement(By.xpath(\"//label[text()='\" + value + \"']\"));\n"
                + "            WebElement inputElement = driver.findElement(By.id(labelElement.getAttribute(\"for\")));\n"
                + "            inputElement.click();\n"
                + "        }\n";
    }

    def String processVerifyCommand(Verify command) {
        if (command.textToVerify !== null) {
            return "        // Verify that the page contains text: " + command.textToVerify + "\n"
                    + "        assert driver.getPageSource().contains(\"" + command.textToVerify + "\");\n";
        } else if (command.linkToVerify !== null) {
            return "        // Verify that the page contains a link with text: " + command.linkToVerify + "\n"
                    + "        assert driver.findElements(By.partialLinkText(\"" + command.linkToVerify + "\")).size() > 0;\n";
        } else if (command.variable !== null) {
            if (command.variable == "url") {
                return "        // Verify that the page contains a link with the specified URL\n"
                        + "        WebElement foundLink = driver.findElement(By.xpath(\"//a[@href=\\\"\"+ url +\"\\\"]\"));\n"
                        + "        Assert.notNull(link, \"Link is not found.\");\n";
            } else if (command.variable == "title") {
                return "        // Verify that the page contains the specified title\n"
                        + "        assert driver.getPageSource().contains(title);\n";
            }
        }
        return "";
    }
    
   def String processReadCommand(Read command) {
        var code = "        // Read elements of the link: " + command.linkText + "\n"
                + "        WebElement link = driver.findElements(By.xpath(\"//a[starts-with(@href, '" + command.linkText + "')]\")).get(" + command.number + ");\n";

        if (command.elements.contains("title")) {
            code += "        // Read title\n        String title = link.getText();\n";
        }
        if (command.elements.contains("url")) {
            code += "        // Read URL\n        String url = link.getAttribute(\"href\");\n";
        }
        if (command.elements.contains("text link")) {
            code += "        // Read text link\n        String title = link.getText();\n";
        }
        return code;
    }
}