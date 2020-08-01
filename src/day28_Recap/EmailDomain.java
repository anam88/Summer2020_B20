package day28_Recap;

import java.util.Scanner;

public class EmailDomain {
    public static void main(String[] args) {
        /*
         3. write a program that can get the name and domain of any given email address
        Ex:
            cybertek@gmail.com
            output:
                name: cybertek
                domain: gmail

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the email address:");
        String email = input.nextLine();

        int atSign = email.indexOf("@");
        int dot = email.indexOf(".");

        String name = email.substring(0,atSign);
        String domain = email.substring(atSign+1,dot);

        System.out.println("The name is: "+name+"\nThe domain is: "+domain);

    }
}
