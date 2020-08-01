package day14_Recap;

import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        task:
            1. gender (next() )
            2. age (nextInt())
            3. country name  ( nextLine() )
            4. zipcode  ( nextInt()  )
            5. full name (nextLine() )
            6. full company name ( nextLine() )

         */
        System.out.println("Enter gender");
        String gender = input.next();

        System.out.println("Enter age");
        int age = input.nextInt();
        input.nextLine();

        System.out.println("Enter country name");
        String countryName = input.nextLine();

        System.out.println("Enter the zipcode");
        int zipCode = input.nextInt();
        input.nextLine();

        System.out.println("Enter full name");
        String fullName = input.nextLine();

        System.out.println("Enter company name");
        String companyName = input.nextLine();

        System.out.println("Full Name is: "+fullName+"\nGender is: "+gender+"\nAge is: "+age
        +"\nCountry Name is: "+countryName+"\nCompany Name is: "+companyName+"\nZipcode is: "+zipCode);
    }
}
