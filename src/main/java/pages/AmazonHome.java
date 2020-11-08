package pages;

import DriverManager.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utils.base;

public class AmazonHome {
    public static WebDriver driver = Driver.driver("");
 //   public  AmazonHome(){super();}

    public AmazonHome(WebDriver driver){
        AmazonHome.driver = driver;
        PageFactory.initElements(driver, this);
       // System.out.println("Constructor called, driver initialized");
    }

    @FindBy(id = "login")
    public WebElement login;

    @FindBy(id = "password")
    public static WebElement password;

    @FindBy(css = "#nav-xshop>a.nav-a")
    public static WebElement navBarElements;


    @FindBy(xpath = "//a[contains(text(),'Best Sellers')]")
    public static WebElement bestSellers;


    @FindBy(xpath = "//a[contains(text(),'Blog')]")
    public static WebElement blog;


    @FindBy(css = "#nav-logo-sprites")
    public static WebElement dashboard;
}
