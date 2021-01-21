package base;

import configurationManager.BaseConfiguration;
import pages.LogInPage;

public class Base {
    private PropertyFileReader fileReader = new PropertyFileReader();
    private final String originUrl = fileReader.getPropertyValue("URL");

    public LogInPage openPlayGroundPage() {
        BaseConfiguration.getDriver().get(originUrl);
        return new LogInPage();
    }
}