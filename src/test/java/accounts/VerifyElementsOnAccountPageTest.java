package accounts;

import base.BaseTest;
import data.UserData;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.HomePage;
import pages.LogInPage;
import static org.testng.Assert.assertEquals;

public class VerifyElementsOnAccountPageTest extends BaseTest {
    public LogInPage logInPage;
    public HomePage homePage;
    public AccountPage accountPage;

    @BeforeTest
    public void login() {
        logInPage = base.openPlayGroundPage();
        homePage = logInPage.logInPlayGround(UserData.ADMIN_USER_EMAIL, UserData.ADMIN_USER_PASSWORD);
    }

    @Test(description = "Verify opening Account Page")
    public void accountsPageIsOpenedTest() {
        accountPage = homePage.openAccountPage();
        assertEquals(accountPage.getAccountsPageName(), "Accounts", "Accounts Page should have name 'Accounts'.");
    }
}