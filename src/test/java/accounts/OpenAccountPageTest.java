package accounts;

import base.BaseTest;
import data.UserData;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.HomePage;
import pages.LogInPage;

import static org.testng.Assert.assertEquals;

public class OpenAccountPageTest extends BaseTest {
    public LogInPage logInPage;
    public HomePage homePage;
    public AccountPage accountPage;

    @BeforeTest
    public void Login() throws InterruptedException {
        logInPage = base.openPlayGroundPage();
        homePage = logInPage.logInPlayGround(UserData.ADMIN_USER_EMAIL, UserData.ADMIN_USER_PASSWORD);
        Thread.sleep(5000);
    }

    @Test
    public void openAccountPageTest() {
        assertEquals(homePage.getNavBarText(), "Home", "Nav Bar should contain 'Home' text.");
        accountPage = homePage.openAccountPage();
        assertEquals(accountPage.getAccountsPageName(), "Accounts", "Accounts Page should have name 'Accounts'.");
    }
}