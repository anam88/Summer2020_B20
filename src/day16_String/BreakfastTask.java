package day16_String;

import java.util.Scanner;

public class BreakfastTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
         2. Write a Java method to display the middle character of a string
        a) If the length of the string is even there will be two middle characters.
        b) If the length of the string is odd there will be one middle character.
                Input :
                    Orange
                Output:
                    The middle character in the string: an */
        System.out.println("Enter a word");
        String word = input.next();

        int l = word.length(); //find the length of word
        int middle = l/2; //to get the middle part divide length by 2
        System.out.println(l);
        System.out.println(middle);
        String message = "";
        char evenLetters = word.charAt(middle);
        char oddLetters = word.charAt(middle - 1);

        if(l % 2 == 0){//if the remainder is == 0 then even
            message = "The length of string is even: "+ oddLetters + evenLetters;//we are printing the
            //middle two numbers that is why concating the odd and even letters
        }else{
            message = "The length of string is odd: "+ oddLetters;
        }
        System.out.println(message);


    }
}
