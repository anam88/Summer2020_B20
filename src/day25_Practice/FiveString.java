package day25_Practice;
import java.util.Scanner;
public class FiveString {
    public static void main(String[] args) {
/*
5. Write a program that will take five Strings and
save them into an array called arr.
Use for loop to print out the first three letter of each element of arr, one per line.
You can assume that every element of arr is at least 3 letters long.
Example: arr -> ["apple", "banana"]
        prints:  appban
 */
//step 1: write a program that will take five strings and save them in array called arr
        String arr[] = {"Apple", "Banana","Orange","Pear","Lemon"};
  //      System.out.println(arr[0].substring(0,3)); will print the App for the first index

//for loop
        for(int i = 0; i <= arr.length-1; i++){
            System.out.print(arr[i].substring(0,3));
        }
        System.out.println();
        System.out.println("=========================");
//for each loop
        for(String each : arr){
            System.out.print(each.substring(0,3));
        }




    }
}
