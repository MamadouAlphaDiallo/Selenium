package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class GoogleSearchStepDefinition {
    WebDriver driver;
    @Given("I open google search page")
    public void iOpenGoogleSearchPage() {
        // Initiation driver
        System.setProperty("webdriver.chrome.driver", "src/test/java/org/example/chromedriver.exe");

        // Instanciation du driver
        driver = new ChromeDriver();

        // Ouvrir la page Web de google
        driver.get("https://www.google.com/");
    }

    @When("I lookup the word {string}")
    public void iLookupTheWord(String arg0) throws InterruptedException {
        //driver.findElement(By.name("q"))
        driver.findElement(By.name("q")).clear();
        // Accepter les cookies
        driver.findElement(By.id("W0wltc")).click();
        driver.findElement(By.name("q")).sendKeys(arg0);
        driver.findElement(By.name("btnK")).submit();
    }
    @Then("search results display the word {string}")
    public void searchResultsDisplayTheWord(String arg0) {
        // Vérifie que dans le titre de ma page, que j'ai selenium for test
        assertTrue(driver.getTitle().contains(arg0));
        // Fermer le browser
        driver.quit();
    }
}
