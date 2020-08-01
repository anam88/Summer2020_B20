package day19_ForLoop;

public class OddEven {
    public static void main(String[] args) {
        /*
         1. write a program that can print all even numbers between 0 ~ 100
         that can be divisible by 3 & 5
            2. write a program that can print all odd numbers between 0 ~ 100
            that can be divisible by 3 & 5
         */
        //Odd Numbers

        for (int i = 1; i < 100; i += 2) {
            //odd number start at 1 | i get increase by 2 | i: 1,3,5,7,9,11......
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("The odd numbers are: " + i);
            }
        }
        System.out.println();

        //another way to find odd numbers by using NESTED IF
        for (int i = 0; i <= 100; i++) {//for loop
            if (i % 2 != 0) {//pre condition: i MUST be odd number
                if (i % 3 == 0 && i % 5 == 0) {//nested if sub condition: Must be divisible by 3 & 5
                    System.out.println("The odd numbers are: " + i);
                }
            }
        }

        System.out.println("*********************");
        //Even Numbers by NESTED IF
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("The even numbers are: " + i);
                }
            }

        }
    }
}