package day14_Recap;
import java.util.Scanner;
public class Scanner_Words {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
         1. write a java program that can convert any given
          numbers between 0 ~ 9 to words, if the number is greater than 9 or less than zero,
          out put should be "Invalid".
            MUST use Scanner and nested IF
         */
        System.out.println("Enter the Number: ");
        int number = input.nextInt();
        String message = "";

        if(number >= 0 && number < 10){
            if(number == 0){
                message = "Zero";
            }else if(number == 1){
                message = "One";
            }else if(number == 2){
                message = "Two";
            }else if(number == 3){
                message = "Three";
            }else if(number == 4){
                message = "Four";
            }else if(number == 5){
                message = "Five";
            }else if(number == 6){
                message = "Six";
            }else if (number == 7){
                message = "Seven";
            }else if(number == 8){
                message = "Eight";
            }else{
                message = "Nine";
            }
        }else{
            message = "Invalid";
        }
        System.out.println(message);
    }
}//WORKED
