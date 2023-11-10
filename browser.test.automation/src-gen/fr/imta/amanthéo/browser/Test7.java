package fr.imta.amanthéo.browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import dev.failsafe.internal.util.Assert;
import java.util.*;
public class Test7 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // Go to URL
        driver.get("http://www.imt-atlantique.fr/fr");

        // Read elements of the link: /fr/actualites
        WebElement link = driver.findElements(By.xpath("//a[starts-with(@href, '/fr/actualites')]")).get(1);
        // Read title
        String title = link.getText();
        // Read URL
        String url = link.getAttribute("href");
        // Open the URL specified in the variable 'url'
        driver.get(url);
        // Verify that the page contains the specified title
        assert driver.getPageSource().contains(title);
        driver.quit();
    }
}
