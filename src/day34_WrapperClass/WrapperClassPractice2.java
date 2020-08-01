package day34_WrapperClass;

import java.util.Scanner;

public class WrapperClassPractice2 {
    public static void main(String[] args) {

        int a = Integer.MAX_VALUE;
        System.out.println(a);//2147483647 gives primitive data type int max value

        double d = Double.MIN_VALUE;
        System.out.println(d);//4.9E-324 gives primitive data type double min value

        System.out.println("=========================");
        Scanner input = new Scanner(System.in);
        int max = Integer.MIN_VALUE; //smallest integer value (-2147483647)

       //<=5 because we will ask use to enter number 5 times
        for(int i = 1; i <= 5; i++){
            //will repeat 5 times to ask use to enter 5 numbers
            System.out.println("Enter a number");
            int num = input.nextInt();//10,15,5,12,0
//whatever user enter will be greater than Integer.MIN_VALUE, & than we will compare
// max = Integer.MIN_VALUE, whatever is the bigger value will get assign to max
//is 10 > -2147483647, Yes; so the max value is 10
//is 15 > 10, yes; so the max value is 15
//is 5 > 15; no, so max value stay 15
//is 12 > 15, no so max value stay 15
//is 0 > 15, no so max value stay 15
            if(num > max){
                max = num;
            }
        }
        System.out.println("Max Num: "+max);
    }
}
