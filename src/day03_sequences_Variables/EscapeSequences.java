package day03_sequences_Variables;

public class EscapeSequences {

    public static void main(String[]args){
        // \n: appends new line to the message, must be in double quotes
        System.out.println("Hello Everyone!\nToday is June 06,2020.");
        /* \t: will do a horizontal tab OR paragraph space.
        Adding \n in the end of sentence will create a empty line space before
        the next statement starts
         */
        System.out.println(("\tI live in Chicago.\n"));
        // create 2 empty line
        System.out.println("\n\nI love programming!");
        /*how to print backslash \ (backslash is part of escape sequences therefore a \ is use with
        all the escape sequence. Same rule applies for forward slash //
         */
        System.out.println("\\\\//"); //this will print two backslash and one forward slash
        //
        System.out.println("My name is \'Anam\'"); //this will append the single quote
        System.out.println("I am in Cybertek 'Batch-20'."); //this will also print in single quote

        System.out.println("\"I love to bake.\""); //this will print the sentence in double quote.
        // The use of backslash is a MUST.


    }



}
