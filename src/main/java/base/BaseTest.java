package base;

import configurationManager.BaseConfiguration;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest extends BaseConfiguration {
    public final Base base = new Base();

    @BeforeSuite(alwaysRun = true)
    protected void setUp() {

        System.setProperty("webdriver.chrome.driver", "/Users/mikolaenko/Documents/Tests/AutoTests/chromedriver");
    }


    @AfterSuite(alwaysRun = true)
    protected void afterSuiteActions() {
        BaseConfiguration.getDriver().quit();
    }
}