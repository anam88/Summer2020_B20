package day51_Exceptions.WebDriverTask;
/*
4. create a class called Opera browser
actions: get(URL): opens the URL in Opera browser
 close(): closes the Opera browser
 */
public class OperaBrowser extends WebDriver{
    @Override
    public void get(String url) {
        System.out.println("opening the "+url+  "in Opera browser");
    }

    @Override
    public void close() {
        System.out.println("closing the Opera browser");
    }
}
