package accounts;

import base.BaseTest;
import data.UserData;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LogInPage;

public class OpenAccountPageTest extends BaseTest {
    public LogInPage logInPage;
    public HomePage homePage;

    @Test
    public void openAccountPageTest() throws InterruptedException {
        logInPage = base.openPlayGroundPage();
        homePage = logInPage.logInPlayGround(UserData.ADMIN_USER_EMAIL, UserData.ADMIN_USER_PASSWORD);
        Thread.sleep(5000);
    }
}
