package testCaseFunctions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BoutiqueImageTest extends BaseClass {
    public BoutiqueImageTest(WebDriver webDriver) {
        super(webDriver);
    }

    public void BoutiqueImageTestAllCategories(){
        List<String> categories = Arrays.asList("KADIN","ERKEK","ÇOCUK","EV & YAŞAM","SÜPERMARKET",
                "KOZMETİK","AYAKKABI & ÇANTA","SAAT & AKSESUAR","ELEKTRONİK");

        for(String cat: categories){
            try {
                webDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
                webElement(By.linkText(cat)).click();

            } catch (Exception exception) {
                log.info("Category is not clickable  !!");
            }
        }
    }
    public void BoutiqueImageTestForImageContents(){
        try {
            webDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
            webElement(By.linkText("KOZMETİK")).click();
            try {
                Assert.assertEquals("https://www.trendyol.com/butik/liste/kozmetik",webDriver.getCurrentUrl());

            }catch (Exception e){
                log.info("Assertion error");
            }

        } catch (Exception exception) {
            log.info("Category is not clickable  !!");
        }

    }
}
