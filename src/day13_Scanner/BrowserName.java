package day13_Scanner;

public class BrowserName {
    /*
     6. write a program that can display the selected browser
            1.1  declare a String variable called browserName
            1.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            1.3. if the browser name does not match with the valid browsers' names,
                    out put should be: Invalid Browser Name
        Do Not use: scanner, if statement, and ternary
     */
    public static void main(String[] args) {


        String browserName = "cat";
        String message = "";

        switch (browserName){
            case "Chrome":
            case "Firefox":
            case "Opera":
            case "Safari":
            case "Edge":
                message = "Browser Name is: "+browserName;
                break;
            default:
                message = "Invalid Browser Name!";
                break;
        }
        System.out.println(message);

    }
}
