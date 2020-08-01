package day15_String;
import java.util.Scanner;
public class String_MethodsPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //concat String

        String schoolName = "Cybertek";//this object is not modified
        //no need to create new variable, use assignment operator to assign schoolName to schoolName
        schoolName = schoolName.concat(" School"); //Cybertek School

        System.out.println(schoolName);//

        System.out.println("************************");

        //write a program that ask for first and last name
        System.out.println("Enter the first name");
        String fName = input.next();
        System.out.println("Enter the last name");
        String lName = input.next();

        String fullName = fName.concat(" ".concat(lName) );
        System.out.println("Your full name is: "+fullName);

        System.out.println("**********************************");
        //toLowerCase():
        String name1 = "JOHN SMITH";
         name1 = name1.toLowerCase();
        System.out.println(name1);
        //toUpperCase():
        String flower = "rose";
        flower = flower.toUpperCase();
        System.out.println(flower);

        //trim():
        String p = "    John Smith     ";
        p = p.trim();//if the spaces are not between the words than they will be removed
        System.out.println(p);
    }
}
