package fr.imta.amanthéo.browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import dev.failsafe.internal.util.Assert;
import java.util.*;
public class Test4 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // Go to URL
        driver.get("http://www.imt-atlantique.fr/fr/rechercher");

        // Fill the text field: Rechercher
        WebElement labelElement = driver.findElements(By.xpath("//label[text()='Rechercher']")).get(1);
        WebElement inputElement = driver.findElement(By.id(labelElement.getAttribute("for")));
        inputElement.sendKeys("Donald Trump");
        // Click on a button with value: Appliquer les filtres
        driver.findElement(By.xpath("//input[@value='Appliquer les filtres']")).click();
        // Verify that the page contains text: Aucun résultat ne correspond à votre recherche
        assert driver.getPageSource().contains("Aucun résultat ne correspond à votre recherche");
        driver.quit();
    }
}
