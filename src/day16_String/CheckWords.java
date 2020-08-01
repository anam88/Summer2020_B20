package day16_String;

public class CheckWords {
    public static void main(String[] args) {

        /*
3. write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself

 */
        String str = "Java is fun";//string
//        String message = "";
        //last index = length - 1
        //second last index = length - 2
        //third last index = length - 3

        //if else statement

//        if(str.length() == 0){
//            message = "String is empty";
//        }else if(str.length() > 3){
//            message = str.substring(str.length() - 3);
//        }else{
//            message = str;
//        }
//        System.out.println(message);

        //Ternary
       String message = (str.length() == 0) ? "String is empty" : (str.length() > 3) ? str.substring(str.length() - 3)
                : str;
        System.out.println(message);

        System.out.println("***************************");


        /*
         2. Write a program  CheckWords:
        Program accepts 3 words and :
        - if they are same length:      print "All words are same length"
        - if some same length and others not:    print "Not Same nor Different lengths"
        - if all different length :  print "All different length"

       */


        String word1 = "Apple";
        String word2 = "Orange";
        String word3 = "Apple";

        int l1 = word1.length();
        int l2 = word2.length();
        int l3 = word3.length();

        boolean sameLength = l1 == l2 && l1 == l3;
        boolean allDifferentLength = l1 != l2 && l2 != l3 && l1 != l3;


        String length = (sameLength) ? "All words are same length" : (allDifferentLength) ?
                "All different length" : "Not same nor different lengths";

        System.out.println(length);



    }
}
