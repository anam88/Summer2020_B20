package day22_NestedLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {
        /*
        username: cyber
        password: tek123
        locked the account if user enter invalid input 3 times
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String u = input.next();

        System.out.println("Enter your password: ");
        String p = input.next();

        int attempt = 0;

        while( !(u.equals("cyber") && p.equals("tek123")) ){

            if(attempt == 3){//0,1,2
                System.out.println("Account Locked");
                System.exit(0);
            }

            System.out.println("Invalid username or password, please re-enter");
            System.out.println("Enter your username: ");
            u = input.next();
            System.out.println("Enter your password: ");
            p = input.next();

            attempt++; //if the attempt number increase than 2,
        }

            System.out.println("Logged in");

    }
}
