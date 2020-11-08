package tests.bestsellers;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.AmazonHome;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BestSellersTest {
    // "https://www.amazon.com/"
    static WebDriver driver;

    @BeforeAll
    public static void setup() {
        // driver = driver("chrome");
        driver = AmazonHome.driver;
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterAll
    public static void tearDown(){
        if(driver != null)
        {
           driver.quit();
        }
    }
    @Test
    public void navBarTest(){
        driver.get("https://www.amazon.com/");

        List<String> navElementsText = new ArrayList<>();
        List<WebElement> navElements = driver.findElements(By.cssSelector("#nav-xshop>a.nav-a"));

        // Add nav elements into navElementsText list as String
        for (WebElement each : navElements)
        {
            navElementsText.add(each.getText());
        }

        // Print out each nav elements
        for (String each : navElementsText)
        {
           // System.out.println(each + "\n");
        }
    }

    @Test
    public void navBarTest2(){
        AmazonHome anObj = new AmazonHome(driver);
        driver.get("https://www.amazon.com/");

        List<WebElement> navElements = driver.findElements(By.cssSelector("#nav-xshop>a.nav-a"));

        for (WebElement each : navElements)
        {
            if(each.getText().equalsIgnoreCase("Best Sellers"))
            {
                each.click();

                List<WebElement> cameraProducts=
                        driver.findElements(By.xpath("//div[contains(text(), 'Camera')]"));
                //cameraProducts.forEach(System.out::println) ;
                cameraProducts.forEach(webElement -> System.out.println(webElement.getText())) ;


            }

        }

    }


    @Test
    public void navBarTest3(){
        AmazonHome anObj = new AmazonHome(driver);
        driver.get("https://www.amazon.com/");
        anObj.bestSellers.click();
        List<WebElement> cameraProducts=
                driver.findElements(
                        By.xpath("//div[contains(text(), 'Camera')]"));
        //cameraProducts.forEach(System.out::println) ;
        cameraProducts.forEach(webElement -> {
            System.out.println(webElement.getText());
            Assert.assertTrue(webElement.getText().contains("Smart"));
        }) ;

    }


 

}