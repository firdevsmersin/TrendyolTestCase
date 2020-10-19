package testCaseFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

import java.util.concurrent.TimeUnit;

public class BuyAProductTest extends BaseClass {

    public BuyAProductTest(WebDriver webDriver) {
        super(webDriver);
    }
    public  void SearchAProduct(){
        try {
            webDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
            webElement(By.className("search-box")).sendKeys("çim tohumu");
            Thread.sleep(2000);
            webElement(By.className("suggestion")).click();
            Thread.sleep(2000);
            AssertionOfPageLoading("https://www.trendyol.com/tum--urunler?q=%C3%A7im%20tohumu&qt=%C3%A7im%20tohumu&st=%25C3%25A7im%2520tohumu");
        } catch (Exception exception) {
            log.info("Error: Can't search any products  !!");
        }
    }
    public void GoToProductDetails(){
        try {
            webDriver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
            webElement(By.className("image-container")).click();
        } catch (Exception exception) {
            log.info("Error: Can't go product details!!");
        }
    }
    public void AddToBasket(){

        try {
            webDriver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
            webElement(By.className("add-to-bs-tx")).click();
        } catch (Exception exception) {
            log.info("Error: Can't added any products!!");
        }
    }
    public void CompleteTheOrder(){
        try {
            webDriver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
            webElement(By.id("myBasketListItem")).click();
            Thread.sleep(3000);
            AssertionOfPageLoading("https://www.trendyol.com/sepetim#/basket");
            webElement(By.linkText("Sepeti Onayla")).click();
            Thread.sleep(2000);
            AssertionOfPageLoading("https://www.trendyol.com/sepetim#/payment");
        } catch (Exception exception) {
            log.info("Error: Can't complete the order !");
        }
    }
}
