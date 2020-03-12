package pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {
    public AccountPage accountPage;
    @FindBy(xpath = "//li/span[contains(.,'Accounts')]")
    public WebElement accountsPageName;

    public String getAccountsPageName(){
        return accountsPageName.getText();
    }
}
