package day51_Exceptions;

import Library.Util;

public class ExceptionPractice {
    public static void main(String[] args) {

        System.out.println("Hello");
        sleep(3);

        System.out.println("World");
        Util.sleep(5.2);//import custom method from Util package

        System.out.println("How are you?");
    }
    //custom static method sleep
    //instead of creating try and catch block separately for all exceptions, we created a custom method
    public static void sleep(int seconds){
        try{
            Thread.sleep(seconds * 1000);
        }catch (InterruptedException e){

        }

    }
}
