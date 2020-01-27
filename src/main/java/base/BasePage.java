package base;

import configurationManager.BaseConfiguration;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import static configurationManager.BaseConfiguration.getDriver;

public class BasePage extends Base{
    public WebDriver driver = BaseConfiguration.getDriver();

    public void waitUntilLoading(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, 1000);
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
    }

    protected BasePage() {
        PageFactory.initElements(driver, this);
    }
}