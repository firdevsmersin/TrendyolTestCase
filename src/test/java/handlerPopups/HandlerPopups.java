package handlerPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;
public class HandlerPopups extends BaseClass {

    public HandlerPopups(WebDriver webDriver) {
        super(webDriver);
    }

    public void handleMainPagePopups(){

        try{
            Thread.sleep(10000);
            webElement(By.xpath("//html")).click();
        } catch (Exception ex){
            System.out.println("handler hatası");
        }
    }
    public void handlePopupsAfterLogin(){
        try{
            webElement(By.id("emailPreference")).click();
            //webElement(By.className("popup-button-box")).click();
        } catch (Exception ex){
            System.out.println("handler hatası 2");
        }
    }
}
