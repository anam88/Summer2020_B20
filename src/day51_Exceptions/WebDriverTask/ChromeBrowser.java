package day51_Exceptions.WebDriverTask;
/*
2. create a class called ChromeBrowser
    actions: get(URL): opens the URL in chrome browser
             close(): closes the chrome browser
*/
public class ChromeBrowser extends WebDriver{

    public void get(String url) {
        System.out.println("opening the "+url+ " in Chrome browser");
    }
    public void close() {
        System.out.println("closing the Chrome browser");
    }
}
