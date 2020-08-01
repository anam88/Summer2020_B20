package day25_Practice;

public class LongestString2 {
    public static void main(String[] args) {
        /*
         1. Write a program that can return the longest string of text from a String array

         */
        //solve the task by using for each loop

        String arr[] = {"Anam", "Nickolas", "Amir", "Nurmamet"};
        //you assign the length method to str because you cannot assign string variable to int datatype
        int maxLength = arr[0].length();
        //create a loop that can iterate to all the strings to get the min length in the array
        for(String each : arr){//datatype of arr is String
            int l = each.length();//string.length

            if(l > maxLength){
                maxLength = l;
            }
        }
        System.out.println("The maximum length of the string in given array is: "+maxLength);
        //now need to print the string that has the length of max string
        for(String each : arr){
            if(each.length() == maxLength){//strings == 8(maxLength)
                System.out.print(each+"  ");
            }
        }
    }
}
