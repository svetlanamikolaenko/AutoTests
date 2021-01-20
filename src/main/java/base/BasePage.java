package base;

import configurationManager.BaseConfiguration;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BasePage extends Base{
    public WebDriver driver = BaseConfiguration.getDriver();
    private FluentWait<WebDriver> waiter;

    public void waitUntilVisible(WebElement element, long timeoutInSeconds){
        getWebDriverWait(timeoutInSeconds).until(ExpectedConditions.visibilityOf(element));
    }

    protected FluentWait<WebDriver> getWebDriverWait(long timeoutInSeconds) {
        if (waiter == null) {
            waiter = new WebDriverWait(driver, timeoutInSeconds);
        }
        waiter.withTimeout(Duration.ofSeconds(timeoutInSeconds)).ignoring(StaleElementReferenceException.class);

        return waiter;
    }

    protected BasePage() {
        PageFactory.initElements(driver, this);
    }
}