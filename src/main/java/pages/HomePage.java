package pages;

import base.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage homePage;

    final String accounts = "Accounts";
    @FindBy(xpath = "//div[@class='bBottom']//a[@title='Home']")
    public WebElement homeNavBar;

    @FindBy(xpath = "//div[@class='slds-icon-waffle']")
    public WebElement iconAppLouncher;

    @FindBy(xpath = "//input[@type='search'][@class='slds-input']")
    public WebElement searchAppsField;

    public String getNavBarText(){
        return homeNavBar.getText();
    }

    public AccountPage openAccountPage(){
        iconAppLouncher.click();
        searchAppsField.sendKeys(accounts);
        searchAppsField.sendKeys(Keys.ENTER);
    return new AccountPage();
    }

}
