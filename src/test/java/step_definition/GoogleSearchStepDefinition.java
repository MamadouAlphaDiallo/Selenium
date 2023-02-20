package step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import static modules.Hooks.driver;
import static org.junit.Assert.assertTrue;
import static page_objects.GoogleSearchPage.searchFor;

public class GoogleSearchStepDefinition {
    @Given("I open google search page")
    public void iOpenGoogleSearchPage() {

        // Ouvrir la page Web de google
        driver.get("https://www.google.com/");
    }

    @When("I lookup the word {string}")
    public void iLookupTheWord(String arg0) throws InterruptedException {
        searchFor(arg0);
    }
    @Then("search results display the word {string}")
    public void searchResultsDisplayTheWord(String arg0) {
        // Vérifie que dans le titre de ma page, que j'ai selenium for test
        assertTrue(driver.getTitle().contains(arg0));
    }
}
