package day22_NestedLoop;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
//calculator
/*
ask user to enter two number and a operator
if valid operator give them the result and ask to continue, if answer yes repeat the above step
if answer no exit the loop
if invalid operator print 0 and ask to enter valid input yes or no
 */
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("Enter two numbers");
            double n1 = input.nextInt();
            double n2 = input.nextInt();
            System.out.println("Enter the math operator");
//user can enter any operator (+ - * / %) or if invalid operator assign 0
            //6 possible outcome
            char operator = input.next().charAt(0);
//ternary statement
            double result = (operator == '+') ? n1+n2 : (operator == '-') ? n1-n2 : (operator == '*')
                    ? n1*n2 : (operator == '/') ? n1/n2 : (operator == '%') ? n1%n2
                    : 0 ;

            System.out.println(result);
//if user want to continue repeat the above process
//if not than return the result
            System.out.println("Do you want to continue:");
            String userAnswer = input.next();
            //Not valid answer expression
//using while loop because even if the statement is not valid the print statement will execute
            while(! (userAnswer.equalsIgnoreCase("yes") ||
                    userAnswer.equalsIgnoreCase("no")) ){
//below lines will keep repeating until the user give valid answer
                System.out.println("Invalid input, please enter yes OR no");
                System.out.println("Do you want to continue?");
                userAnswer = input.next();
            }
//if the answer is no, while loop will exit and line 41, 42 will run and will exit loop
            if(userAnswer.equalsIgnoreCase("No")){
                break;
            }
        }
    }
}


