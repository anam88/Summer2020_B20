package day32_MethodOverLoading;

import Library.Util;

public class MethodOverLoading2 {
/*
1. create a method that can find the addition of two numbers
                    addition2Numbers
2. create a method that can find the addition of three numbers
                    addition3Numbers
3. create a method that can find the addition of four numbers
                    addition4Numbers

*/
public static void main(String[] args) {
    addition2Numbers(10, 5);
    addition3Numbers(10,5,5);
    addition4Numbers(10,10,5,5);

    System.out.println("===============================");

    addition(2,2);
    addition(2,2,2);
    addition(2,2,2,2);
}

//=====================================================================
    public static void addition2Numbers(double a, double b){
        System.out.println(a + b);
    }

    public static void addition3Numbers(double a, double b, double c){
        System.out.println(a + b + c);
    }

    public static void addition4Numbers(double a, double b, double c, double d){
        System.out.println(a + b + c + d);
    }



    //==================METHOD OVER LOADING========================================
/*
multiple methods have same method name
parameter MUST be different(either datatype or number of parameters)
return types does not matter CAN BE VOID OR DATATYPE
*/
    public static void addition(double a, double b){
        System.out.println(a + b);
    }

    public static void addition(double a, double b, double c){
        System.out.println(a + b + c);
    }

    public static void addition(double a, double b, double c, int d){
        System.out.println(a + b + c + d);
    }

}
