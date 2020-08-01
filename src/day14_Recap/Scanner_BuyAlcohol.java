package day14_Recap;
import java.util.Scanner;
public class Scanner_BuyAlcohol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          /*
        3. write a program that asked the user enter the age and based on the input the program should
         be able to check if the person is eligible to buy alcohol
                if age is > 21 , print "here is your wine"
                if age is < 21, print "get out kid"
                if age is invalid, print "Invalid Entry"
                MUST use Scanner and nested IF

         */

        System.out.println("Enter your age: ");
        int age = input.nextInt();
        String message = "";

        if(age >= 0 && age <= 150 ){
            if(age >= 21){
                message = "Here is your wine";
            }else{
                message = "Get out kid";
            }

        }else{
            message = "Invalid Entry";
        }
        System.out.println(message);
    }
}//WORKED
