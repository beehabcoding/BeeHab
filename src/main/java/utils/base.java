package utils;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.AmazonHome;

import java.util.concurrent.TimeUnit;

import static DriverManager.Driver.driver;

public abstract class base {

    private static WebDriver driver;

   public base(){
       PageFactory.initElements(driver, this);
    }



    // add nav utils
}
