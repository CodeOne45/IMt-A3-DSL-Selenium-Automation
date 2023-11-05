package fr.imta.amanthéo.browser;
	
	                import org.openqa.selenium.By;
	                import org.openqa.selenium.WebDriver;
	                import org.openqa.selenium.WebElement;
	                import org.openqa.selenium.chrome.ChromeDriver;
	                import org.openqa.selenium.WebDriverException;
	                import org.openqa.selenium.JavascriptExecutor;
	                import java.util.stream.Collectors;
	                import java.util.function.Predicate;
	
	                import java.time.Duration;
	                import java.util.List;
	                import java.util.Map;
	                import java.util.HashMap;
	
	                public class Test5 {
	
	                    private static Map<String, String> savedData = new HashMap();
	
	                    public static String getSavedData(String key) {
	                        if (!savedData.containsKey(key)) {
	                            throw new RuntimeException("No saved data named " + key);
	                        }
	                        return savedData.get(key);
	                    }
	                    
	                    public static List<WebElement> findElementsStable(WebDriver driver, By locator, Predicate<WebElement> filter, int maxAttempts, int retryCountIfZero) {
	                        int lastCount = -1;
	                        int retryZero = 0;
	                        for (int attempt = 0; attempt < maxAttempts; attempt++) {
	                            List<WebElement> current = driver.findElements(locator).stream().filter(filter).collect(Collectors.toList());
	                            if (current.size() == lastCount && (lastCount != 0 || retryZero == retryCountIfZero)) {
	                                return current;
	                            } else {
	                                lastCount = current.size();
	                                if (lastCount == 0) {
	                                    retryZero++;
	                                }
	                            }
	                            try {
	                                if (lastCount == 0) {
	                                    Thread.sleep(1000); // Wait for 1s
	                                } else {
	                                    Thread.sleep(100); // Wait for 1s
	                                }
	                            } catch (InterruptedException e) {
	                                Thread.currentThread().interrupt();
	                            }
	                        }
	                        throw new RuntimeException("Amount of web elements not stable");
	                    }
	
	                    public static List<WebElement> findElementsStable(WebDriver driver, By locator, int maxAttempts, int retryCountIfZero) {
	                        return findElementsStable(driver, locator, elt -> true, maxAttempts, retryCountIfZero);
	                    }
	
	                    public static void main(String[] args) throws Exception {
	                        WebDriver driver;
driver = new ChromeDriver();
driver.manage().window().maximize();


driver.get("http://www.imt-atlantique.fr/fr/formation/trouver-ma-formation");


{
    String xpath = "//input[@type='checkbox']";
    String labelFor = findElementsStable(driver, By.xpath("//label[contains(text(), 'Anglais')]"), 10, 3)
        .get(0)
        .getAttribute("for");
    xpath += "[@id='" + labelFor + "']";
    List<WebElement> current = findElementsStable(driver, By.xpath(xpath), 10, 5);
    if (current.isEmpty()) {
        throw new WebDriverException("could not find any element matching xpath " + xpath);
    }
    int index = 0;
    
    if (index == -1) {
        for (WebElement e : current) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'auto',block: 'center',inline: 'center'});", e);
            try {
                Thread.sleep(100);
            }  catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            e.click();
        }    ;
    } else {
        if (index < current.size()) {
            WebElement e  = current.get(index);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'auto',block: 'center',inline: 'center'});", e);
            try {
                Thread.sleep(100);
            }  catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            e.click();
        } else {
            throw new RuntimeException("No element found");
        }
    }
}

{
    String xpath = "//input[@type='checkbox']";
    String labelFor = findElementsStable(driver, By.xpath("//label[contains(text(), 'Temps plein')]"), 10, 3)
        .get(0)
        .getAttribute("for");
    xpath += "[@id='" + labelFor + "']";
    List<WebElement> current = findElementsStable(driver, By.xpath(xpath), 10, 5);
    if (current.isEmpty()) {
        throw new WebDriverException("could not find any element matching xpath " + xpath);
    }
    int index = 0;
    
    if (index == -1) {
        for (WebElement e : current) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'auto',block: 'center',inline: 'center'});", e);
            try {
                Thread.sleep(100);
            }  catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            e.click();
        }    ;
    } else {
        if (index < current.size()) {
            WebElement e  = current.get(index);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'auto',block: 'center',inline: 'center'});", e);
            try {
                Thread.sleep(100);
            }  catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            e.click();
        } else {
            throw new RuntimeException("No element found");
        }
    }
}

{
    String xpath = "//input[@type='checkbox']";
    String labelFor = findElementsStable(driver, By.xpath("//label[contains(text(), 'A domicile')]"), 10, 3)
        .get(0)
        .getAttribute("for");
    xpath += "[@id='" + labelFor + "']";
    List<WebElement> current = findElementsStable(driver, By.xpath(xpath), 10, 5);
    if (current.isEmpty()) {
        throw new WebDriverException("could not find any element matching xpath " + xpath);
    }
    int index = 0;
    
    if (index == -1) {
        for (WebElement e : current) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'auto',block: 'center',inline: 'center'});", e);
            try {
                Thread.sleep(100);
            }  catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            e.click();
        }    ;
    } else {
        if (index < current.size()) {
            WebElement e  = current.get(index);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'auto',block: 'center',inline: 'center'});", e);
            try {
                Thread.sleep(100);
            }  catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            e.click();
        } else {
            throw new RuntimeException("No element found");
        }
    }
}

{
    String xpath = "//*[self::button or self::input[@type='button'] or self::input[@type='submit']][@value='Appliquer les critères']";
    List<WebElement> current = findElementsStable(driver, By.xpath(xpath), 10, 5);
    if (current.isEmpty()) {
        throw new WebDriverException("could not find any element matching xpath " + xpath);
    }
    int index = 0;
    
    if (index == -1) {
        for (WebElement e : current) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'auto',block: 'center',inline: 'center'});", e);
            try {
                Thread.sleep(100);
            }  catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            e.click();
        }    ;
    } else {
        if (index < current.size()) {
            WebElement e  = current.get(index);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'auto',block: 'center',inline: 'center'});", e);
            try {
                Thread.sleep(100);
            }  catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            e.click();
        } else {
            throw new RuntimeException("No element found");
        }
    }
}

{
    String xpath = "//*[contains(text(), 'No found course matching your criteria.')]";
    List<WebElement> current = findElementsStable(driver, By.xpath(xpath), 10, 5);
    if (current.isEmpty()) {
        throw new WebDriverException("could not find any element matching xpath " + xpath);
    }
    int index = 0;
    
    if (index == -1) {
        for (WebElement e : current) {
            boolean validated = true;
            validated &= e.isDisplayed();
        }    ;
    } else {
        if (index < current.size()) {
            WebElement e  = current.get(index);
            boolean validated = true;
            validated &= e.isDisplayed();
        } else {
            throw new RuntimeException("No element found");
        }
    }
}        if (driver == null) {
            throw new RuntimeException("Cannot find a reference to the web driver. Has it been opened?");
        }
        driver.quit();
    }
}
