package modules;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page_objects.GoogleSearchPage;

import static utils.BrowserFactory.getFactoryDriver;

public class Hooks {
    // Todo: Configure actions to be run before and after each scenario
    public static WebDriver driver;
    private GoogleSearchPage googleSearchPage = new GoogleSearchPage();
    @Before
    public void setUp() {
        driver = getFactoryDriver();
        // On recherchera les objets de googleSearchPage dans le driver
        PageFactory.initElements(driver, googleSearchPage);
    }
    @After
    public void tearDown() {
        driver.quit();
    }
}
