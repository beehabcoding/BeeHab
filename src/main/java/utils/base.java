package utils;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.AmazonHome;

public abstract class base {

    private static WebDriver driver = AmazonHome.driver;

//   public base(){
//       PageFactory.initElements(driver, this);
//    }

    // add nav utils
    public static class InnerBase{
        public InnerBase refresh(){ driver.navigate().refresh();
            return this;
        }

        public InnerBase returnHome(){
            //   driver.navigate().back();
            driver.navigate().to("https://www.amazon.com/");
            return this;
        }

        public InnerBase scrollDown(){
            Actions builder = new Actions(driver);
            builder.sendKeys(Keys.PAGE_DOWN).build().perform();
            builder.sendKeys(Keys.PAGE_DOWN).build().perform();
            return this;
        }

        public InnerBase scrollDownTo(WebElement element){
            Actions builder = new Actions(driver);
            builder.sendKeys(Keys.PAGE_DOWN)
                    .moveToElement(element).build().perform();
            return this;
        }
        public InnerBase scrollUp(){
            Actions builder = new Actions(driver);
            builder.sendKeys(Keys.PAGE_UP)
                    .moveToElement(AmazonHome.dashboard)
                    .build().perform();
            return this;
        }

    }


}
