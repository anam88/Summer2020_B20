package day14_Recap;

import java.util.Scanner;

public class ShippingInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*write a program for the shipping info that, the program should ask:
                    building number
                    Street address (Assume it has more than one word)
                    city name
                    state name
                    zip code
                    full name of the person:
            and prints the ship to info in the following format:
            ex output:
                    Ship To:  Jimmy joe
                              7925 Jones Branch Dr
                              MCLean, VA 22102
 */
        System.out.println("Enter the building number:");
        int buildingNum = input.nextInt();
        input.nextLine();//will take space
        System.out.println("Enter the Street address");
        String streetAddress = input.nextLine();
        System.out.println("Enter the city name");
        String cityName = input.next();
        System.out.println("Enter the state name");
        String stateName = input.next();
        System.out.println("Enter the zipcode");
        int zipCode = input.nextInt();
        input.nextLine();
        System.out.println("Enter the Full Name");
        String fullName = input.nextLine();

        System.out.println("Ship To: "+fullName+"\n\t\t "+buildingNum+" "+streetAddress+
                "\n\t\t "+cityName+", "+stateName+" "+zipCode);



    }//WORKED
}
