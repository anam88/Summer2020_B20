package day22_NestedLoop;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        /*
2. write a program for the room reservation:
King Bed ==> 120$
Queen Bed ==> 100$
single Bed ==> 80$
the program asks the user which bedroom does he/she wants to reserve and calculate the total price
and then the program will ask:
    do you want to reserve another room:
                if yes ==> repeat the previous steps
                if no ==> your total price is: $$$
                while answer is neither yes or no ==> please re-enter
HINT: nested loop task, outer loop need to be an infinite loop
*/
        Scanner input = new Scanner(System.in);
        int total = 0;
        System.out.println("Welcome to Comfy Inn Resort");
//choose the bedroom options
        //if the user says Yes to continue we will repeat above steps | If NO exit the loop
        while(true){
            System.out.println("Please choose from the following: ");
            System.out.println("1. King Bed: $120");
            System.out.println("2. Queen Bed: $100");
            System.out.println("3. Single Bed: $80");
            int bedOption = input.nextInt();

            switch (bedOption){
                case 1: total += 120; break;
                case 2: total += 100; break;
                case 3: total += 80; break;
            }
            System.out.println("Do you want to reserve another room?");
            String userAnswer = input.next(); //yes or no
//if the user answer is not yes or no, than print invalid response
            while(! (userAnswer.equalsIgnoreCase("yes") ||
                    userAnswer.equalsIgnoreCase("no")) ){
                System.out.println("Invalid response, please enter yes OR no");
                System.out.println("Do you want to continue?");
                userAnswer = input.next();
            }
            if(userAnswer.equalsIgnoreCase("No")){
                break;
            }
        }
        System.out.println("Your total price is: $"+total);
    }
}
