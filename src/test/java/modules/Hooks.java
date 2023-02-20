package modules;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import page_objects.GoogleSearchPage;

public class Hooks {
    // Todo: Configure actions to be run before and after each scenario
    public static WebDriver driver;
    private GoogleSearchPage googleSearchPage = new GoogleSearchPage();
    // A Exécuter avant chaque scénario
    @Before
    public void setUp() {
        // Initiation driver
        System.setProperty("webdriver.chrome.driver", "src/test/ressources/drivers/chromedriver.exe");

        // Instanciation du driver
        driver = new ChromeDriver();
        // On recherchera les objets de googleSearchPage dans le driver
        PageFactory.initElements(driver, googleSearchPage);
    }

    // Fonction permettant de liberer la memoire à la fin
    @After
    public void tearDown() {
        // Fermer le browser
        driver.quit();
    }
}
