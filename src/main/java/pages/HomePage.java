package pages;

import base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

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

    //ACTION STEPS
    @Step("Open Account Page")
    public AccountPage openAccountPage(){
        waitUntilVisible(iconAppLouncher, 3000);
        iconAppLouncher.click();
        viewAllAppsButton.click();
        searchAppsField.sendKeys(accounts);
        waitUntilVisible(accountsAppLink,3000);
        accountsAppLink.sendKeys(Keys.ENTER);
        return new AccountPage();
    }

    //ASSERT STEPS
    @Step ("Verify Home Page NavBar Text")
    public HomePage checkNavBarText(){
        assertEquals(homeNavBar.getText(), "Home", "Text is not matching:");
        return this;
    }
}
