package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleSearchPage {
    @FindBy(name = "q")
    private static WebElement searchBar;

    @FindBy(id = "W0wltc")
    private static WebElement acceptCookie;

    @FindBy(name = "btnK")
    private static WebElement searchButton;

    public static void searchFor(String keyword) {
        searchBar.clear();
        acceptCookie.click();
        searchBar.sendKeys(keyword);
        searchButton.submit();
    }
}
