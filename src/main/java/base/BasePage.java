package base;

import configurationManager.BaseConfiguration;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends Base{
    public WebDriver driver = BaseConfiguration.getDriver();

    public void waitUntilVisible(WebElement element, int timeout){
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    protected BasePage() {
        PageFactory.initElements(driver, this);
    }
}