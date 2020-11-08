package DriverManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Driver {

    private static WebDriver driver; // one and only driver obj


    public static WebDriver driver(String browser){
        if (browser.equals("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if (browser.equals("firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        else if (browser.equals("edge"))
        {
            // There is microsoft webdriver to download.
            // Share it in the description.
            // Also here: dism /Online /Add-Capability /CapabilityName:Microsoft.WebDriver~~~~0.0.1.0
           // WebDriverManager.edgedriver().setup();
            System.setProperty("webdriver.edge.driver", "src/main/resources/msedgedriver.exe");
            driver = new EdgeDriver();
        }
        else if (browser.equals("headless"))
        {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver(new FirefoxOptions().setHeadless(true));
        }

        else
        {
            driver("chrome");
        }


        return driver;
    }
//    static {
//        // this is only for chrome driver setup
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//    }

    public static WebDriver getDriver() {
        return driver;
    }
}
