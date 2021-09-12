package GroupProjectSep11.Task4;

public class ChromeDriver implements RemoteWebDriver{

    @Override
    public void open(){
        System.out.println("Open the Chrome browser.");
    }
    @Override
   public void close(){
        System.out.println("Close the Chrome browser");
    }
    @Override
    public String getTitle(){
        String title = null;
        return title;
    }
    @Override
    public void getScreenshot(){
        System.out.println("Take a screen shot for the Chrome browser.");
    }
    @Override
    public void navigate(){
        System.out.println("Navigate through the Chrome Browser.");
    }
}
