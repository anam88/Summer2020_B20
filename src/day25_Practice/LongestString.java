package day25_Practice;

public class LongestString {
    public static void main(String[] args) {
        /*
         1. Write a program that can return the longest string of text from a String array

         */
//Solve the task by using for loops

        String arr[] = {"Anam", "Nickolas", "Amir", "Nurmamet", "Meerim Moidin Kyzy"};
        //you assign the length method to str because you cannot assign string variable to int datatype
        int maxLength = arr[0].length();
        //create a loop that can iterate to all the strings to get the max length in the array
        for(int i = 0; i <= arr.length-1; i++){
            int l = arr[i].length();//string.length
            if(l > maxLength){
                maxLength = l;
            }
        }
        System.out.println("The maximum length of the string in given array is: "+maxLength);

        for(int i = 0; i <= arr.length-1; i++){
            if(arr[i].length() == maxLength){
                System.out.println(arr[i]);
            }
        }
    }
}
