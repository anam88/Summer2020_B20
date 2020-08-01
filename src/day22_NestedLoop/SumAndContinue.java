package day22_NestedLoop;

import java.util.Scanner;

public class SumAndContinue {
    public static void main(String[] args) {
        /*
write a program that ill ask user to enter two numbers and
    calculates the sum of those two numbers.
then it asks the user if he/she wants to continue
    if the answer is yes, repeat the whole process again
    if the answer is no, only return the addition
but while the answer is not a valid answer (not yes or no),
    the the program should repeatedly ask the user re-enter
HINT: nested loop task, outer loop need to be an infinite loop
 */
        Scanner input = new Scanner(System.in);
        //ask user to enter two numbers
//since below steps needed to be repeated if the user says Yes on line 29, we will use loop
        while(true){

            System.out.println("Enter two numbers");
            int n1 = input.nextInt();
            int n2 = input.nextInt();
            //sum of two numbers
            int sum = n1 + n2;
            System.out.println("The sum of two numbers are: "+sum);
//if user want to continue repeat the above process
//if not than return the sum online
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
