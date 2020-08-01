package day14_Recap;
import java.util.Scanner;

public class Scanner_Address {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
 3. write a program that asks the user to enter:
                        1. building number
                        2. street name (assume it has one word only)
                        3. road name (assume it has one word only)
                        4. city name (assume it has one word only)
                        5. state
                        6. zipcode

 */
        System.out.println("Enter the building number");
        int buildingNumber = input.nextInt();
        System.out.println("Enter the Street Name: ");
        String streetName = input.next();
        System.out.println("Enter the Road Name: ");
        String roadName = input.next();
        System.out.println("Enter the City Name: ");
        String cityName = input.next();
        System.out.println("Enter the State: ");
        String state = input.next();
        System.out.println("Enter the Zipcode: ");
        int zipCode = input.nextInt();

        System.out.println("Address: "+buildingNumber+" "+streetName+" "+roadName+", "+cityName+" "+state
                +", "+zipCode);

    }
}//WORKED
