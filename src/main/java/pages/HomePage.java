package pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "//*[@id='oneHeader']//a[@href='/lightning/setup/SetupOneHome/home']")
    public WebElement homeNavBar;




}
