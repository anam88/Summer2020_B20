package day24_Arrays;
import java.util.Scanner;
public class UniqueCharacters {
    public static void main(String[] args) {
/*
1. write a program that can find the unique characters from a String
Ex:
    input: aabccd
    output: bd

 */
//we will use loop so it can iterate through every character
//two ways to do it | Easy approach finding unique STRINGS only
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = input.next();
//        String str = "aabcc";
        String uniques = ""; //we will store unique character in this string

        for(int i = 0; i <= str.length()-1; i++){
        //using charAt method to get the index value of every string
            char ch = str.charAt(i);
            //indexOf will return the first occur character index number
            int first = str.indexOf(ch);
            //lastIndexOf will return the occurrence of character last time
            int last = str.lastIndexOf(ch);
//so if first == last that means the character is unique
            if(first == last){
        //if first == true, than concat the character with empty unique variable
                uniques += ch;
            }
        }
        System.out.println("The unique character in the given string is: "+uniques);
    }
}
