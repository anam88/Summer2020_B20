package day15_String;
import java.util.Scanner;
public class String_Methods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String name = "Cybertek";
////                     01234567
//        //char is design for single data type character
//        //charAt(index):
//        char ch1 = name.charAt(0);
//        //char is method name | ch1 is variable
//        //name = String variable | charAt = method of string
//        char ch2 = name.charAt(4);
//        System.out.println(ch1);
//        System.out.println(ch2);
//write a program that ask for first name and last name
        String fullName = "John Smith is a good person";//10 character
        System.out.println("Enter your first name");
        String f_Name = input.next();
        System.out.println("Enter your last name");
        String l_name = input.next();


        char fName = f_Name.charAt(0);
        char lName = l_name.charAt(0);
        System.out.println("What is John Smith initial? "+fName+"."+lName);

        //length
        int l = fullName.length();
        System.out.println("Total # of characters: "+l);

        //last index number = length of String - 1
        int lastIndexNumber = fullName.length() - 1;
        System.out.println("Last Index Number is: "+lastIndexNumber);
        System.out.println("==========================================");
        // write a program that ask user to enter a sentence.
        // print first and last characters

        System.out.println("Enter a sentence");
        input.nextLine();
        String sentence = input.nextLine();
        char f_letter = sentence.charAt(0);
        char l_letter = sentence.charAt(sentence.length() -1);
        System.out.println("The first letter is: "+f_letter+" and the last" +
                " letter is: "+l_letter);



    }
}
