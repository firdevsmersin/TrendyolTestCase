package testCaseFunctions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

import java.util.concurrent.TimeUnit;

public class LoginTest extends BaseClass {
    public LoginTest(WebDriver driver) {
        super(driver);
    }

    public void ClickLoginButton(){

        try{
            webElement(By.id("not-logged-in-container")).click();

        } catch (Exception exception){
            log.info("WebElement is not clickable !!");
        }

    }
    public void LoginAsUser(){
        try {
            webDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
            webElement(By.id("login-email")).sendKeys("firdevsmersin35@gmail.com");
            webElement(By.id("login-password-input")).sendKeys("test1234");
            Thread.sleep(2000);
            webElement(By.xpath("//button[@class='q-primary q-fluid q-button-medium q-button submit'][.//span[contains(text(), 'Giriş Yap')]]")).click();
            Thread.sleep(2000);
            AssertionOfPageLoading("https://www.trendyol.com/butik/liste/kadin");

        }catch (Exception exception) {
            log.info("Username or Password is not correct !!");
        }
    }
}
