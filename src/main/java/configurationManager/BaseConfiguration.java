package configurationManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BaseConfiguration {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver != null) {
            return driver;
        }
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--profile-directory=Default");
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
}