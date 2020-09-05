package day51_Exceptions.WebDriverTask;
/*
3. creata a class called FirefoxBrowser
actions: get(URL): opens the URL in Firefox browser
 close(): closes the Firefox browser
 */
public class FirefoxBrowser extends WebDriver{
    @Override
    public void get(String url) {
        System.out.println("opening the "+url+  "in Firefox browser");
    }

    @Override
    public void close() {
        System.out.println("closing the Firefox browser");
    }
}
