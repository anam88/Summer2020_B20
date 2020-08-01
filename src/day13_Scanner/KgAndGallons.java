package day13_Scanner;

import java.util.Scanner;

public class KgAndGallons {
    /*
    1 kg = 2.2lb
     3. write a program that can convert Kg to lb
                MUST use Scanner
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the kg value");
        int kilos = input.nextInt();

        double pounds = kilos * 2.2;
        System.out.println(kilos+" kg"+" is equal to "+pounds+" lb");
        System.out.println("**********************************");
        /*
        write a program that can convert gallons to litters
                MUST use scanner
                1 gallon = 3.785 liters
         */
        System.out.println("Enter the gallon value");
        int gal = input.nextInt();
        double liter = gal * 3.785;
        System.out.println(gal+" gal"+" is equal to "+liter+"l");


    }
}
