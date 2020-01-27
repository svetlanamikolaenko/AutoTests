package base;

import configurationManager.BaseConfiguration;
import pages.LogInPage;

public class Base {
    private static String originUrl = "https://brave-panda-n9jnts-dev-ed.lightning.force.com/";
    public LogInPage openPlayGroundPage() {
        BaseConfiguration.getDriver().get(originUrl);
        return new LogInPage();
    }
}