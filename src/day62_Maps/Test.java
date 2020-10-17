package day62_Maps;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
       Color favColor = Color.GREEN;
        System.out.println(favColor);
        Browser browserName = Browser.CHROME;
        //System.out.println(browserName);
        switch(browserName){
            case CHROME:
                System.out.println("CHROME browser is set");
                break;
            case FIREFOX:
                System.out.println("FIREFOX browser is set");
                break;
            case EDGE:
                System.out.println("EDGE browser is set");
                break;
            case OPERA:
                System.out.println("OPERA browser is set");
                break;
        }
        Days dayName = Days.SATURDAY;
        switch (dayName){
            case FRIDAY:
                System.out.println("Today is FRIDAY");
                break;
            case MONDAY:
                System.out.println("Today is MONDAY");
                break;
            case TUESDAY:
                System.out.println("Today is TUESDAY");
                break;
            case WEDNESDAY:
                System.out.println("Today is WEDNESDAY");
                break;
            case THURSDAY:
                System.out.println("Today is THURSDAY ");
                break;
            case SATURDAY:
                System.out.println("Today is SATURDAY");
                break;
            case SUNDAY:
                System.out.println("Today is SUNDAY");
                break;
        }
        Month monthName = Month.OCT;
        System.out.println(monthName);


    }
}
