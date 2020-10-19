package listener;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.BaseTest;
import java.util.concurrent.TimeUnit;

public class Listener extends BaseTest implements ITestListener {
    public void onTestStart(ITestResult iTestResult) {
        try{
            webDriver.get(baseUrl);
            webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        } catch (Exception ex){
            log.info("Error: WebDriver can't get the base url !");
        }
    }

    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("test is successful !");
    }

    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("test is failed !");
    }

    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("test is skipped !");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\z5070\\Desktop\\TrendyolTestCase\\drivers\\chromedriver.exe");

        try{

            webDriver = new ChromeDriver();
            webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            webDriver.manage().window().maximize();

        } catch (Exception ex){
            log.info("Error: WebDriver can't open !");
        }


    }

    public void onFinish(ITestContext iTestContext) {
        try{
            webDriver.quit();
        } catch (Exception ex){
            log.info("Error: WebDriver can't quit !");
        }
    }
}
