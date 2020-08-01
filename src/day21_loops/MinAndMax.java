package day21_loops;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++){
            System.out.print("Enter a number: ");
            int num = input.nextInt();

            if(num < minValue){//n1 is less than minValue
                minValue = num;
            }
            if(num > maxValue){//n1 is greater than maxValue
                maxValue = num;
            }
        }
        System.out.println("The min value is: "+minValue+"\nThe max value is: "+maxValue);
    }
}
