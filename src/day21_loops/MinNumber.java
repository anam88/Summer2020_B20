package day21_loops;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
         2. write a program that asks user to enter 5 numbers and returns the minimum number

         */

        int minValue = Integer.MAX_VALUE;

        for( int i = 0; i < 5; i++ )
        {

            System.out.print( "Enter a number: " );

            int n1 = input.nextInt( );

            if( n1 < minValue )

                minValue = n1;

        }

        System.out.println( "The minimum number is " + minValue );



    }
}
