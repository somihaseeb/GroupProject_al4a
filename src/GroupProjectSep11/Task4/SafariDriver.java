package GroupProjectSep11.Task4;


public class SafariDriver implements RemoteWebDriver{
    @Override
        public void open(){
            System.out.println("Open Safari browser");
        }
        @Override
       public void close(){
            System.out.println("Close the Safari browser");
        }

        @Override
        public String getTitle(){
            String title = null;
            return title;
        }
    @Override
       public  void getScreenshot(){
            System.out.println("Take a screenshot of the Safari browser.");
        }
        @Override
       public  void navigate(){
            System.out.println("Navigate through the Safari browser.");
        }
}
