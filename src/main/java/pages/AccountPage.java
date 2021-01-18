package pages;

import base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.testng.Assert.assertEquals;

public class AccountPage extends BasePage {
    public AccountPage accountPage;

    @FindBy(xpath = "//li/span[contains(.,'Accounts')]")
    public WebElement accountsPageName;

    //ASSERT STEPS
    @Step ("Verify Accounts Page Name")
    public AccountPage checkAccountsPageName(){
        assertEquals(accountsPageName.getText(), "Accounts", "Accounts Page should have name 'Accounts'.");
        return this;
    }
}
