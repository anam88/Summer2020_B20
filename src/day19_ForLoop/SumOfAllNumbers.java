package day19_ForLoop;

import java.util.Scanner;

public class SumOfAllNumbers {
    public static void main(String[] args) {
     /*   7. write a program that can calculate the sum of all numbers between 1 to any given number
        ex:
        input: 100
        output: 5050
        input: 50
        output: 1275 */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();//user enter a number
        int sum = 0;


        if(num > 0){
            for(int i = 1; i <= num; i++){
                sum += i;//sum of all num between 1 to any given num
            }
            System.out.println(sum);

        }else{
            System.out.println("Invalid Entry");
        }


    }
}
