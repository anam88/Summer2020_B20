package day17_StringReview;
import java.util.Scanner;
public class ReverseIt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        5. write a program that can put first character to the end of the string:
                String str = "Java";
                output: avaJ
            please provide two solutions:
         */
//first solution, you MUST use substring method
//        String str = "Java";
        System.out.println("Enter the String");
       String str = input.next();
       String s1=  str.substring(0,1);
       String s2 = str.substring(1);
       System.out.println(s2+s1);
//second solution, you MUST use charAt method
        String str1 = "Python";
        char ch1 = str1.charAt(0);
        String s3 = str1.substring(1);
        System.out.println(s3+ch1);


    }
}
