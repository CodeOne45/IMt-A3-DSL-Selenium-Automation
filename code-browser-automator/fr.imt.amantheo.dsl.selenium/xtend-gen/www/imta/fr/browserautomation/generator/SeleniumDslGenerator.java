/**
 * generated by Xtext 2.32.0
 */
package www.imta.fr.browserautomation.generator;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import www.imta.fr.browserautomation.seleniumDsl.BrowserDsl;
import www.imta.fr.browserautomation.seleniumDsl.Click;
import www.imta.fr.browserautomation.seleniumDsl.Combobox;
import www.imta.fr.browserautomation.seleniumDsl.Command;
import www.imta.fr.browserautomation.seleniumDsl.Fill;
import www.imta.fr.browserautomation.seleniumDsl.GoTo;
import www.imta.fr.browserautomation.seleniumDsl.OpenBrowser;
import www.imta.fr.browserautomation.seleniumDsl.Read;
import www.imta.fr.browserautomation.seleniumDsl.Select;
import www.imta.fr.browserautomation.seleniumDsl.Uncheck;
import www.imta.fr.browserautomation.seleniumDsl.Verify;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class SeleniumDslGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _get = resource.getContents().get(0);
    final BrowserDsl model = ((BrowserDsl) _get);
    if ((model != null)) {
      final String inputFileName = resource.getURI().lastSegment().toString();
      String name = inputFileName.replaceFirst(".selenium", ".java");
      String className = resource.getURI().lastSegment().toString().replaceFirst(".selenium", "");
      char _upperCase = Character.toUpperCase(className.charAt(0));
      String _substring = className.substring(1);
      String _plus = (Character.valueOf(_upperCase) + _substring);
      className = _plus;
      char _upperCase_1 = Character.toUpperCase(name.charAt(0));
      String _substring_1 = name.substring(1);
      String _plus_1 = (Character.valueOf(_upperCase_1) + _substring_1);
      name = _plus_1;
      final String generatedCode = this.generateSeleniumCode(model, className);
      fsa.generateFile(("fr/imta/amanthéo/browser/" + name), generatedCode);
    }
  }

  public String generateSeleniumCode(final BrowserDsl model, final String className) {
    String code = "";
    String _code = code;
    String _generateImportStatements = this.generateImportStatements();
    code = (_code + _generateImportStatements);
    String _code_1 = code;
    code = (_code_1 + (("public class " + className) + " {\n"));
    String _code_2 = code;
    code = (_code_2 + "    public static void main(String[] args) {\n");
    EList<Command> _commands = model.getCommands();
    for (final Command command : _commands) {
      String _code_3 = code;
      String _processCommand = this.processCommand(command);
      code = (_code_3 + _processCommand);
    }
    String _code_4 = code;
    code = (_code_4 + "        driver.quit();\n");
    String _code_5 = code;
    code = (_code_5 + "    }\n");
    String _code_6 = code;
    code = (_code_6 + "}\n");
    return code.toString();
  }

  public String generateImportStatements() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package fr.imta.amanthéo.browser;");
    _builder.newLine();
    _builder.append("import org.openqa.selenium.By;");
    _builder.newLine();
    _builder.append("import org.openqa.selenium.WebDriver;");
    _builder.newLine();
    _builder.append("import org.openqa.selenium.WebElement;");
    _builder.newLine();
    _builder.append("import org.openqa.selenium.chrome.ChromeDriver;");
    _builder.newLine();
    _builder.append("import org.openqa.selenium.JavascriptExecutor;");
    _builder.newLine();
    _builder.append("import org.openqa.selenium.interactions.Actions;");
    _builder.newLine();
    _builder.append("import dev.failsafe.internal.util.Assert;");
    _builder.newLine();
    _builder.append("import java.util.*;");
    _builder.newLine();
    return _builder.toString();
  }

  public String processCommand(final Command command) {
    if ((command instanceof OpenBrowser)) {
      return "        WebDriver driver = new ChromeDriver();\n\n";
    } else {
      if ((command instanceof GoTo)) {
        String _url = ((GoTo)command).getUrl();
        String _plus = (("        // Go to URL\n" + "        driver.get(\"") + _url);
        return (_plus + "\");\n\n");
      } else {
        if ((command instanceof Click)) {
          return this.processClickCommand(((Click)command));
        } else {
          if ((command instanceof Fill)) {
            return this.processFillCommand(((Fill)command));
          } else {
            if ((command instanceof Select)) {
              return this.processSelectCommand(((Select)command));
            } else {
              if ((command instanceof Verify)) {
                return this.processVerifyCommand(((Verify)command));
              } else {
                if ((command instanceof Read)) {
                  return this.processReadCommand(((Read)command));
                } else {
                  if ((command instanceof Uncheck)) {
                    return (((((("        // Uncheck checkboxes\n" + 
                      "        List<WebElement> checkboxes = driver.findElements(By.xpath(\"//input[@type=\'checkbox\']\"));\n") + 
                      "        for (WebElement checkbox : checkboxes) {\n") + 
                      "            if (checkbox.isSelected()) {\n") + 
                      "                checkbox.click();\n") + 
                      "            }\n") + 
                      "        }\n\n");
                  } else {
                    if ((command instanceof Combobox)) {
                      return "        // Combobox command processing\n";
                    } else {
                      return "";
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  public String processClickCommand(final Click command) {
    String _linkText = command.getLinkText();
    boolean _tripleNotEquals = (_linkText != null);
    if (_tripleNotEquals) {
      String _linkText_1 = command.getLinkText();
      String _plus = ("         WebElement e = driver.findElement(By.xpath(\"//a[text()=\'" + _linkText_1);
      String _plus_1 = (_plus + "\']\"));\n");
      return (_plus_1 + 
        "        driver.get(e.getAttribute(\"href\"));\n");
    } else {
      String _buttonText = command.getButtonText();
      boolean _tripleNotEquals_1 = (_buttonText != null);
      if (_tripleNotEquals_1) {
        String _buttonText_1 = command.getButtonText();
        String _plus_2 = (("        // Click on a button\n" + 
          "        driver.findElement(By.xpath(\"//input[@value=\'") + _buttonText_1);
        return (_plus_2 + "\']\")).click();\n\n");
      } else {
        String _alt = command.getAlt();
        boolean _tripleNotEquals_2 = (_alt != null);
        if (_tripleNotEquals_2) {
          String _alt_1 = command.getAlt();
          String _plus_3 = ("        driver.findElement(By.xpath(\"//img[@alt=\'" + _alt_1);
          return (_plus_3 + "\']\")).click();\n\n");
        } else {
          String _variable = command.getVariable();
          boolean _tripleNotEquals_3 = (_variable != null);
          if (_tripleNotEquals_3) {
            String _variable_1 = command.getVariable();
            boolean _equals = Objects.equal(_variable_1, "url");
            if (_equals) {
              String _variable_2 = command.getVariable();
              String _plus_4 = ("        driver.get(" + _variable_2);
              return (_plus_4 + ");\n\n");
            }
          } else {
            return "";
          }
        }
      }
    }
    return null;
  }

  public String processFillCommand(final Fill command) {
    String _fieldName = command.getFieldName();
    String _plus = ("        WebElement labelElement = driver.findElements(By.xpath(\"//label[text()=\'" + _fieldName);
    String _plus_1 = (_plus + "\']\")).get(1);\n");
    String _plus_2 = (_plus_1 + 
      "        WebElement inputElement = driver.findElement(By.id(labelElement.getAttribute(\"for\")));\n");
    String _xifexpression = null;
    String _textToFill = command.getTextToFill();
    boolean _tripleNotEquals = (_textToFill != null);
    if (_tripleNotEquals) {
      String _textToFill_1 = command.getTextToFill();
      String _plus_3 = ("        inputElement.sendKeys(\"" + _textToFill_1);
      _xifexpression = (_plus_3 + "\");\n\n");
    } else {
      String _variable = command.getVariable();
      String _plus_4 = ("        inputElement.sendKeys(" + _variable);
      _xifexpression = (_plus_4 + ");\n\n");
    }
    return (_plus_2 + _xifexpression);
  }

  public String processSelectCommand(final Select command) {
    final Function1<String, String> _function = (String v) -> {
      return (("\"" + v) + "\"");
    };
    final String values = IterableExtensions.join(ListExtensions.<String, String>map(command.getValues(), _function), ", ");
    return ((((((((("         List<String> valuesToCheck = Arrays.asList(" + values) + ");\n") + 
      "        JavascriptExecutor js = (JavascriptExecutor) driver;\n") + 
      "        js.executeScript(\"window.scrollTo(0, 340);\");\n") + 
      "        for(String value: valuesToCheck) {\n") + 
      "            WebElement labelElement = driver.findElement(By.xpath(\"//label[text=\'\" + value + \"\']\"));\n") + 
      "            WebElement inputElement = driver.findElement(By.id(labelElement.getAttribute(\"for\")));\n") + 
      "            inputElement.click();\n") + 
      "        }\n");
  }

  public String processVerifyCommand(final Verify command) {
    String _textToVerify = command.getTextToVerify();
    boolean _tripleNotEquals = (_textToVerify != null);
    if (_tripleNotEquals) {
      String _textToVerify_1 = command.getTextToVerify();
      String _plus = (("        // Verify that the page contains text\n" + 
        "        assert driver.getPageSource().contains(\"") + _textToVerify_1);
      return (_plus + "\");\n\n");
    } else {
      String _linkToVerify = command.getLinkToVerify();
      boolean _tripleNotEquals_1 = (_linkToVerify != null);
      if (_tripleNotEquals_1) {
        String _linkToVerify_1 = command.getLinkToVerify();
        String _plus_1 = (("        // Verify that the page contains link\n" + 
          "        assert driver.findElements(By.partialLinkText(\"") + _linkToVerify_1);
        return (_plus_1 + "\")).size() > 0;\n\n");
      } else {
        String _variable = command.getVariable();
        boolean _tripleNotEquals_2 = (_variable != null);
        if (_tripleNotEquals_2) {
          String _variable_1 = command.getVariable();
          boolean _equals = Objects.equal(_variable_1, "url");
          if (_equals) {
            return (("        // Verify that the page countains the url\n" + 
              "        WebElement foundLink = driver.findElement(By.xpath(\"//a[@href=\\\"\"+ url +\"\\\"]\"));\n") + 
              "        Assert.notNull(link, \"Link is not found.\");\n");
          } else {
            String _variable_2 = command.getVariable();
            boolean _equals_1 = Objects.equal(_variable_2, "title");
            if (_equals_1) {
              return ("        // Verify that the page countains the title\n" + 
                "        assert driver.getPageSource().contains(title);\n");
            } else {
              return "";
            }
          }
        }
      }
    }
    return null;
  }

  public String processReadCommand(final Read command) {
    String _linkText = command.getLinkText();
    String _plus = (("        // Get the link to a news\n" + 
      "        WebElement link = driver.findElements(By.xpath(\"//a[starts-with(@href, \'") + _linkText);
    String _plus_1 = (_plus + "\')]\")).get(");
    int _number = command.getNumber();
    String _plus_2 = (_plus_1 + Integer.valueOf(_number));
    String code = (_plus_2 + ");\n");
    boolean _contains = command.getElements().contains("title");
    if (_contains) {
      String _code = code;
      code = (_code + "        String title = link.getText();\n");
    }
    boolean _contains_1 = command.getElements().contains("url");
    if (_contains_1) {
      String _code_1 = code;
      code = (_code_1 + "        String url = link.getAttribute(\"href\");\n");
    }
    boolean _contains_2 = command.getElements().contains("text link");
    if (_contains_2) {
      String _code_2 = code;
      code = (_code_2 + "        String title = link.getText();\n");
    }
    return code;
  }
}
