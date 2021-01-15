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
    SoftAssert softAssert = new SoftAssert();

    @BeforeTest
    public void login() {
        logInPage = base.openPlayGroundPage();
        homePage = logInPage.logInPlayGround(UserData.ADMIN_USER_EMAIL, UserData.ADMIN_USER_PASSWORD);
    }

    @Test(priority = 1, description = "Verify opening Home Page")
    public void homePageIsOpenedTest() {
        softAssert.assertEquals(homePage.getNavBarText(), "Home", "Nav Bar should contain 'Home' text.");
    }

    @Test(priority = 2, description = "Verify opening Account Page")
    public void accountsPageIsOpenedTest() {
        accountPage = homePage.openAccountPage();
        softAssert.assertEquals(accountPage.getAccountsPageName(), "Accounts", "Accounts Page should have name 'Accounts'.");
        softAssert.assertAll();
    }
}