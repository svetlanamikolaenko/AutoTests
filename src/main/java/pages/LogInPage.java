package pages;

import base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage {

    @FindBy(id = "username")
    private WebElement emailField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "Login")
    private WebElement logInButton;

    @Step ("Login to Salesforce PlayGround")
    public HomePage logInPlayGround(String emailData, String passwordData) {
        emailField.clear();
        emailField.sendKeys(emailData);
        passwordField.clear();
        passwordField.sendKeys(passwordData);
        logInButton.click();
        return new HomePage();
    }
}
