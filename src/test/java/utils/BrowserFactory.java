package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;

public class BrowserFactory {
    //Todo: Configure browsers
    public static WebDriver factoryDriver;
    private static HashMap<String,String> configProperties = PropertiesFile.readConfigProperties("src/test/ressources/environnement/config.properties");
    static String webBrowserType = configProperties.get("browser");
    public static WebDriver getFactoryDriver() {
        switch (webBrowserType) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src/test/ressources/drivers/chromedriver.exe");
                factoryDriver = new ChromeDriver();
                break;
            case "ie":
                break;
            case "firefox":
                break;
            default:
                break;
        }
        // Internet explorer

        // Firefox

        return factoryDriver;
    }
}
