package pages;

import base.BasePage;
import base.WebElementUtils;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static base.WebElementUtils.clickJS;

public class HomePage extends BasePage {
    public HomePage homePage;

    final String accounts = "Accounts";
    @FindBy(xpath = "//div[@class='bBottom']//a[@title='Home']")
    public WebElement homeNavBar;

    @FindBy(xpath = "//div[@class='slds-icon-waffle']")
    public WebElement iconAppLouncher;

    @FindBy(xpath = "//lightning-button")
    public WebElement viewAllAppsButton;

    @FindBy(xpath = "//div[contains(@class,'modal-container')]//input[@type='search']")
    public WebElement searchAppsField;

    @FindBy(xpath = "//a[@data-label='Accounts']")
    public WebElement accountsAppLink;

    @Step("Open Account Page")
    public AccountPage openAccountPage(){
        waitUntilVisible(iconAppLouncher, 3);
        iconAppLouncher.click();
        viewAllAppsButton.click();
        searchAppsField.sendKeys(accounts);
        clickJS(accountsAppLink);
        return new AccountPage();
    }

    @Step ("Get Home Page NavBar Text")
    public String getHomePageNavBarText(){
        return homeNavBar.getText();
    }
}
