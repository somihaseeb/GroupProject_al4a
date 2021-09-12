package GroupProjectSep11.Task4;

import java.util.concurrent.Callable;

public class DriverTester {
    public static void main(String[] args) {
        RemoteWebDriver safariDriver = new SafariDriver();
        safariDriver.getScreenshot();
        safariDriver.close();
        safariDriver.open();
        safariDriver.navigate();

       RemoteWebDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.open();
        firefoxDriver.close();
        firefoxDriver.getScreenshot();
        firefoxDriver.navigate();

       RemoteWebDriver chromeDriver = new ChromeDriver();
        chromeDriver.open();
        chromeDriver.close();
        chromeDriver.getScreenshot();
        chromeDriver.navigate();

    }
}
