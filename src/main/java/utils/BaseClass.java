package utils;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class BaseClass {
    public  WebDriver webDriver;
    public static Logger log = Logger.getLogger("org.openqa.selenium.WebDriver");

    public BaseClass(WebDriver driver){
        this.webDriver = driver;
    }

    public WebElement webElement(By locator){

        try{
            webDriver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
            webDriver.getPageSource();
            return webDriver.findElement(locator);
        } catch (Exception ex){
            log.info("WebElement is not found!!");
        }
        return null;
    }
    public void AssertionOfPageLoading(String expected){
        try {
            Assert.assertEquals(expected,webDriver.getCurrentUrl());
        }catch (Exception e) {
            log.info("Page is not loaded correctly !!");
        }
    }
}

