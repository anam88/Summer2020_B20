package day24_Arrays;

import java.util.Arrays;

public class String_Methods {
    public static void main(String[] args) {
//	.toCharArray(): convert string in to array format, returns char format
        String str = "ABCD";
//take each of the string and store them in the data structure we can use array to do that
        char ch[] = str.toCharArray();//returns array of char, therefore assign it to char variable

        System.out.println(Arrays.toString(ch));
        System.out.println("==============================");

        String str1 = "DCEBA";
        String str2 = "ADCBE";
        //convert the string to array
        char ch1[] = str1.toCharArray();//[D,C,E,B,A]
        char ch2[] = str2.toCharArray();//[A,D,C,B,E]
        //sort the arrays
        Arrays.sort(ch1);//[A,B,C,D,E]
        Arrays.sort(ch2);//[A,B,C,D,E]
        //compare the arrays | the length of array must be same
        boolean result = Arrays.equals(ch1, ch2);
        System.out.println(result);

        System.out.println("===================================================================");
//.split(value): split the string by given value, and returns string array
        String sentence = "Java is very fun";
        //since we are converting string to the array; assign it to the new variable
//if you want to reverse, give a value to split than covert string to charArray
        String words[]= sentence.split(" ");//{Java, is, very, fun}
        System.out.println(Arrays.toString(words));//[Java, is, very, fun]
// lets reverse sentence by words [Java, is, very, fun]
        for(int i = words.length-1; i>= 0; i--){
            System.out.print(words[i]+" "); //fun very is Java
        }
        System.out.println();
        System.out.println("===================================================================");
        String s = "Java";
        //having the empty split will break the char by char in to array
        String arr[] = s.split("");
        System.out.println(Arrays.toString(arr));//[J, a, v, a]//prints String Array

        //prints the every single element as char array
        char c[] = s.toCharArray();
        System.out.println(Arrays.toString(c));//prints Char Array
    }
}
