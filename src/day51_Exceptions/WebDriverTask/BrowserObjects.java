package day51_Exceptions.WebDriverTask;

public class BrowserObjects {
    public static void main(String[] args) {
        ChromeBrowser chrome = new ChromeBrowser();
        chrome.get("https://www.google.com/");
        chrome.close();

        FirefoxBrowser fireFox = new FirefoxBrowser();
        fireFox.get("https://www.firefox.com/");
        fireFox.close();

        OperaBrowser opera = new OperaBrowser();
        opera.get("https://www.opera.com/");
        opera.close();
    }
}
