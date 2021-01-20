package pages;

import base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {
    public AccountPage accountPage;

    @FindBy(xpath = "//li/span[contains(.,'Accounts')]")
    public WebElement accountsPageName;

    @Step ("Get Accounts Page Name")
    public String  getAccountsPageName(){
        return accountsPageName.getText();
    }
}
