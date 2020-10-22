package pages;

import base.BasePage;
import com.sun.org.glassfish.external.probe.provider.annotations.ProbeListener;
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
        waitUntilVisible(iconAppLouncher, 3000);
        iconAppLouncher.click();
        waitUntilVisible(searchAppsField, 3000);
        searchAppsField.sendKeys(accounts);
        searchAppsField.sendKeys(Keys.ENTER);
    return new AccountPage();
    }

}
