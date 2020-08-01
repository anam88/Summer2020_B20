package day25_Practice;


import java.util.Arrays;

//practice for STRING METHODS, ARRAYS, AND LOOPS
public class ShortestString {
    public static void main(String[] args) {
        /*
         1. Write a program that can return the Shortest string of text from a String array
         */
        String arr[] = {"Anam", "Nickolas", "Amir", "Nurmamet", "Ali", "Ian", "Joe"};
        //you assign the length method to str because you cannot assign string variable to int datatype
        int minLength = arr[0].length();
        //create a loop that can iterate to all the strings to get the min length in the array
        for(int i = 0; i <= arr.length-1; i++){
            int l = arr[i].length();//string.length
    //when i is 0=>l=4 | i is 1==>l=8 |i is 2=>l=4 |i is 3==>l=8
            if(l < minLength){
                minLength = l;
            }
        }
        System.out.println("The minimum length of the string in given array is: "+minLength);
        //now need to print the string that has the length of 4
        for(int i = 0; i <= arr.length-1; i++){
            if(arr[i].length() == minLength){//strings == 4(minLength)
                System.out.print(arr[i]+"  ");
            }
        }


    }
}
