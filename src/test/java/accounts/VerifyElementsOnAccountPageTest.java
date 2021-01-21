package accounts;

import base.BaseTest;
import base.PropertyFileReader;
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

    PropertyFileReader fileReader = new PropertyFileReader();
    private String userEmail = fileReader.getPropertyValue("ADMIN_USER_EMAIL");
    private String userPassword = fileReader.getPropertyValue("ADMIN_USER_PASSWORD");

    @BeforeTest
    public void login() {
        logInPage = base.openPlayGroundPage();
        homePage = logInPage.logInPlayGround(userEmail,userPassword);
    }

    @Test(description = "Verify opening Account Page")
    public void accountsPageIsOpenedTest() {
        accountPage = homePage.openAccountPage();
        assertEquals(accountPage.getAccountsPageName(), "Accounts", "Accounts Page should have name 'Accounts'.");
    }
}