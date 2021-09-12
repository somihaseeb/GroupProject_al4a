package GroupProjectSep11.Task4;
//Implement Code for Diagram:
//WebDriver InterFace
//TakeScreenShot Interface
//RemoteWebDriver Interface
//ChromeDriver Class, FirefoxDriver Class, SafariDriver Class

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}

interface TakeScreenshot{
    void getScreenshot();
}
interface RemoteWebDriver extends WebDriver , TakeScreenshot{
    void navigate();
}





