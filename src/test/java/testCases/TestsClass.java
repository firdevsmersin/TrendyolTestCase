package testCases;

import listener.Listener;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testCaseFunctions.BoutiqueImageTest;
import testCaseFunctions.BuyAProductTest;
import testCaseFunctions.LoginTest;
import utils.BaseTest;

@Listeners(Listener.class)
public class TestsClass extends BaseTest {

    @Test(priority = 2)
    public void ClickLoginButtonTest() {

        LoginTest loginTest = new LoginTest(webDriver);
        loginTest.ClickLoginButton();
    }

    @Test(priority = 3)
    public void LoginAsUserTest() {
        LoginTest loginTest = new LoginTest(webDriver);
        loginTest.LoginAsUser();

    }
    @Test(priority = 1)
    public void BoutiqueImageTest() {
        BoutiqueImageTest boutiqueImageTest = new BoutiqueImageTest(webDriver);
        boutiqueImageTest.BoutiqueImageTestAllCategories();
        boutiqueImageTest.BoutiqueImageTestForImageContents();
    }

    @Test(priority = 4)
    public void BuyAProductProcessTest() {

        BuyAProductTest buyAProductTest = new BuyAProductTest(webDriver);
        buyAProductTest.SearchAProduct();
        buyAProductTest.GoToProductDetails();
        buyAProductTest.AddToBasket();
        buyAProductTest.CompleteTheOrder();
    }

}
