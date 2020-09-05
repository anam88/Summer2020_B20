package day51_Exceptions.WebDriverTask;
/*
1. create a class called WebDriver
actions: get(URL): prints "opening the URL in the default browser"
 close(): closes the default browser
 */
public class WebDriver {
    public void get(String url){//this method pass the parameter
        System.out.println("opening the "+url+ " in default browser");
    }

    public void close() {
        System.out.println("closing the default browser");
    }


}
