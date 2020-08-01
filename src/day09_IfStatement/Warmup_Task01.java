package day09_IfStatement;

public class Warmup_Task01 {
    // write a program that can check if number is positive negative or equals to zero.
    //        for example:
    //            num  = 1
    //            prints:
    //                1 is positive number
    //            num = -6
    //            print:
    //                6 is negative number
    //            num = 0
    //            print:
    //                zero
    public static void main(String[] args) {
        int num = 1;
        int num1 = -6;
        int num2 = 0;

        if( num > 0){
            System.out.println(num+" is positive number");
        }
        if (num1 < 0){
            System.out.println(num1+" is negative number");
        }
        if (num2 == 0){
            System.out.println(num2);
        }


    }
}
