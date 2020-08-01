package day28_Recap;

import java.util.Scanner;

public class frequencyWord2 {
    public static void main(String[] args) {
        //how to find frequency of ANY word in ANY string
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your input: ");
        String str = input.nextLine(); //catCatdogCATDOGBULLCOWCAT
        System.out.print("Enter the word you want to find the frequency:");
        String word = input.next(); //cat
        int l = word.length(); //cat == > 3


        int count = 0;
/*find out how many cat we have in the string
cat: need to compare this word with every word in the str
str.substring(0,3);
*/

        for(int i = 0; i <= str.length()-l; i++){
            if(str.substring(i, i + l).equalsIgnoreCase(word)){//word
                //we are using 3 because the length of the word is 3
                count++;
            }
        }
        System.out.println("The frequency of word is: "+count);


    }
}
