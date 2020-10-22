package accounts;

import base.BaseTest;
import data.UserData;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AccountPage;
import pages.HomePage;
import pages.LogInPage;

public class OpenAccountPageTest extends BaseTest {
    public LogInPage logInPage;
    public HomePage homePage;
    public AccountPage accountPage;

    @BeforeTest
    public void login() {
        logInPage = base.openPlayGroundPage();
        homePage = logInPage.logInPlayGround(UserData.ADMIN_USER_EMAIL, UserData.ADMIN_USER_PASSWORD);

    }

    @Test
    public void openAccountPageTest() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.getNavBarText(), "Home", "Nav Bar should contain 'Home' text.":);
        accountPage = homePage.openAccountPage();
        softAssert.assertEquals(accountPage.getAccountsPageName(), "Accounts", "Accounts Page should have name 'Accounts'.");
        softAssert.assertAll();
    }
}