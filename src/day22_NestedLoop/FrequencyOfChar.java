package day22_NestedLoop;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {
      /*  2. Write a program that can asks user to enter one string and one char
      and then returns the frequency of str2 in str1
        Ex
        Input: AABAAC
                A
        Output: 4
        Input: ABCC
                C
        Output: 2 */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();

        System.out.println("Enter the character you want to know the frequency of in the String: ");
        char ch = input.next().charAt(0);//this is a string by using charAt(0),
        // it will be assign to first index
        int count = 0; //frequency of char in str 1+1 = 2

//uses a for loop, to get the char of the string
      for(int i = 0; i <= str.length()-1; i++){
            char each = str.charAt(i);//will give each of the character
           if(each == ch){
               count++;
           }
        }
        System.out.println("The frequency of the char letter in the String is : "+count);



//use While loop
/*        int i = 0;
        while(i <= str.length()-1){
            char each = str.charAt(i);
            if(each == ch){
                count++;
            }
            i++;
        }


        System.out.println("The frequency of the char letter in the String is : "+count); */


    }
}
