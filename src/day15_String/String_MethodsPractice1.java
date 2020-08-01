package day15_String;
import java.util.Scanner;
public class String_MethodsPractice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //write a program to enter sentence and print first and last letter
        System.out.println("Enter a sentence");
        String sentence = input.nextLine();
        char fLetter= sentence.charAt(0);
        char lLetter = sentence.charAt(sentence.length()-1);
        System.out.println("First Letter is: "+fLetter+" Last letter is: "+lLetter);
        System.out.println("***********************************");

        //print first and last name, than full name in uppercase
        System.out.println("Enter your first name");
        String fName = input.next();
        System.out.println("Enter your last name");
        String lName = input.next();

        String fullName = (fName+" "+lName).toUpperCase();
        System.out.println(fullName);
        System.out.println("***********************************");

//write a program that ask user to enter two string then print the longest string
        System.out.println("Enter the first text");
        String text1 = input.next();
        System.out.println("Enter the second text");
        String text2 = input.next();

        int txt1 = text1.length();
        int txt2 = text2.length();

        String longest = (txt1 > txt2) ? "First String is longer" : "Second String is the longest";
        System.out.println(longest);

        System.out.println("***********************************");
//ask the user to enter 2 words. then add them together and print
//        ex: input one eight
//            output: oneeight
        System.out.println("Enter 2 words:");
        String word1 = input.next();
        String word2 = input.next();
        String togetherWords = word1.concat(word2);
        System.out.println(togetherWords);







    }
}
