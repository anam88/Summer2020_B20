package day15_String;

import java.util.Scanner;

public class SubStringMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //MOST IMPORTANT METHOD: substring():
//
//        String sentence = "Java is fun";
//        //                 012345678910
//
//        String word = sentence.substring(0 , 4);//0 beginning index, 4 ending index
//        System.out.println(word);
//
//
//        //by assigning a new String you create a substring; String word2 = sentence.substring(8,11);
//        // and this will give you “fun” if you print it.!
//        String word1 = sentence.substring(8, 11);
//        System.out.println(word1);
//
//        System.out.println("****************************");
//        String sentence2 = "I like Movies and TV series";
//
//        String word3 = sentence2.substring(7, 12);
//        System.out.println(word3);
//
//        System.out.println("*********************************");
//        //output: Schwarzenegger // task: SCHWARZENEGGER
//        String fName = "SCHWARZENEGGER";
//        String fLetter = fName.substring(0,1);
//        System.out.println(fLetter);
//        String rest = fName.substring(1,fName.length());//use length because what if we dont know
//        //the total # of index
////        String rest = fName.substring(1,4);
//        System.out.println(rest);
//         rest = rest.toLowerCase();
//        System.out.println(rest);
//        System.out.println(fLetter+rest);
        System.out.println("*****************************");
        String lastName = "scHOol";
        String firstChar = (lastName.substring(0,1)).toUpperCase();//getting first letter ONLY //S
        String remaining = (lastName.substring(1)).toLowerCase();//by default will print chool
        lastName = firstChar + remaining;
        System.out.println(lastName);
        System.out.println("*****************************");
        //create substring Game of Thrones
        String s = "I like Game of Thrones";
        String s1 = s.substring(7);
        System.out.println(s1);//

        System.out.println("*****************************");
        //create substring Java Programming Lanuguage
        String s2 = "I like Java Programming Language";
        String lang = s2.substring(7);
        System.out.println(lang);
    }

}
