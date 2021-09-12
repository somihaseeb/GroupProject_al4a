package GroupProjectSep11.Task4;


    class FirefoxDriver implements RemoteWebDriver{
        @Override
        public void open(){
            System.out.println("Open the Firefox browser.");
        }
        @Override
        public void close(){
            System.out.println("Close the Firefox browser.");
        }
        @Override
        public String getTitle(){
            String title = null;
            return title;
        }
        @Override
        public void getScreenshot(){
            System.out.println("Get the screenshot of Firefox browser.");
        }
        @Override
        public void navigate(){
            System.out.println("Navigate through the Firefox browser");
        }
    }

