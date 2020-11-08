package tests.bestsellers;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.AmazonHome;

import java.util.concurrent.TimeUnit;

import static DriverManager.Driver.driver;

public class ConnectionTest {
    // "https://www.amazon.com/"
  static  WebDriver driver;

    @BeforeAll
    public static void setup(){
       // driver = driver("chrome");
        driver = AmazonHome.driver;
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void chromeTest()
    {
       // WebDriver driver = driver("");
        driver.get("https://www.amazon.com/");
    }

    @Test
    public void firefoxTest()
    {
        driver("firefox").get("https://www.amazon.com/");
    }

    // Go to Settings > Update and Security > For Developer and then select "Developer mode".
    // DISM.exe /Online /Add-Capability /CapabilityName:Microsoft.WebDriver~~~~0.0.1.0
    @Test
    public void edgeTest()
    {
        driver("edge").get("https://www.amazon.com/");
    }

    @Test
    public void headlessTest()
    {
       // WebDriver driver = driver("");
        driver.get("https://www.amazon.com/");
        System.out.println(driver.getTitle());
    }

    @Test
    public void headlessTest2()
    {
      //  WebDriver driver = driver("headless");
        driver.get("https://www.amazon.com/");
        System.out.println(driver.getTitle());
    }


    public void testWebElements(){
        AmazonHome a = new AmazonHome(driver);

        a.login.click();

       AmazonHome.password.clear();
    }

}
