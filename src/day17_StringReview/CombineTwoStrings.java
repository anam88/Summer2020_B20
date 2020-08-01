package day17_StringReview;
import java.util.Scanner;
public class CombineTwoStrings {
    public static void main(String[] args) {
        /*
        3. Ask user to enter two words. Then add them together and print.
        But if the last letter if the first word and the first letter of the last letter is the same,
        print that character once.
                    Input:
                        one
                        eight
                    Output:
                        oneight
*/
        //without SCANNER
        Scanner input = new Scanner(System.in);
       // System.out.println("Enter the first word");
        String str1 = "ten";
       // System.out.println("Enter the second word");
        String str2 = "nine";


  /*      first solution
        String str1 = "ten";//first word
        String str2 = "nine"; //second word
        //add them together if the LAST letter of the first word and the FIRST letter of the
        //second word is SAME. PRINT that letter ONCE only.
        char ch1 = str1.charAt(str1.length()-1);//will allow us to retrieve the last character
        //we are using length method what if we don't know the length of the string
        char ch2 = str2.charAt(0); //finding the first character

        if(ch1 == ch2){
            System.out.println(str1+str2.substring(1));
        }else{
            System.out.println(str1+str2);
        }
*/
        //Second solution
        String s1 = str1.substring(str1.length()-1);//beginning index is included, in order to get
        //last index we will use length method



    }
}
