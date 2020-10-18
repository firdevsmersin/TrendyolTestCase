package utils;

import org.openqa.selenium.WebDriver;
import java.util.logging.Logger;

public class BaseTest {
    public static WebDriver webDriver;
    public String baseUrl = "https://www.trendyol.com/";
    public static  Logger log = Logger.getLogger("org.openqa.selenium.WebDriver");
    private StringBuffer verificationErrors = new StringBuffer();

}
