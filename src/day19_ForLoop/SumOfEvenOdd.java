package day19_ForLoop;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        /*
         3. write a program that can calculate the sum of all the even numbers between 1 ~ 100
         4. write a program that can calculate the sum of all the odd numbers between 1 ~ 100

         */

        //Task # 3 first way
        int sumOfEven = 0; //declaring a variable for sum
        for(int i = 0; i <= 100; i+=2){
            sumOfEven += i;//sum of all even numbers
        }
        System.out.println("The sum of all th even numbers: "+sumOfEven);
        /*print statement is outside of the loop because we are printing the sum.
        if it is inside the loop it will print all the even numbers not the sum. */

        System.out.println();

        //nested if- second way

        int sumOfEvenNum = 0;
        for (int i = 0; i <= 100; i++){
            if(i % 2 == 0){
                sumOfEvenNum += i;
            }
        }
        System.out.println("The sum of all the even numbers: "+sumOfEvenNum);
        System.out.println("**************");


        //Task # 4 Odd Number Nested if way
        int sumOfOddNum = 0;
        for (int i = 0; i <= 100; i++){
            if(i % 2 != 0){
                sumOfOddNum += i;
            }
        }
        System.out.println("The sum of all odd numbers: "+sumOfOddNum);

        // mathematical way
        int sumOfOdd = 0;
        for(int i = 1; i <= 99; i+=2){
            sumOfOdd += i;
        }
        System.out.println("The sum of all odd numbers: "+sumOfOdd);

    }
}
