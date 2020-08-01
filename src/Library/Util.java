package Library;

import java.util.Arrays;
import java.util.Scanner;

public class Util {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string:");
        duplicates(input.nextLine());
    }


//remove duplicate and return string value
    public static String duplicates(String str){
        String result = "";
        for(int i = 0; i <= str.length()-1; i++){
             /*starting point is 0 because index start from 0
        ending point we are using length method because we don't know the length of string
        increment because indexes are increasing by 1 point
         */
            String s = ""+str.charAt(i);
        /*using charAt method to get the index, charAt method return int. therefore did the concating
        so it returns the string and assign it to the string s.
         */
            if(!result.contains(s)){/*if the character already contain in the result,
            it will not be concat to the result
                */
                result += s;
            }
        }
        return (result);
    }

//reverse the string and return the reverse the value
    public static String reverse(String str){
        String result = "";
        for(int i = str.length()-1; i >= 0; i--){
            result += str.charAt(i);
        }
        return result;
    }

//find the frequency of char from string str, & return it as int
    public static int frequency(String str, char ch){
//will return frequency of char from the string
        int count = 0; //to save the frequency of char
/*each character is a char : and need to compare it with str.
every time it matches we add frequency to count*/

        for(char each : str.toCharArray() ){
            if(each == ch){//every time this is true, count will increase to 1
                count++;
            }
        }
        //return the frequency of one character from the string
        return count;
    }

//find the unique value from string str
    public static String uniques(String str){
        String uniques = "";//lets use string str to find unique characters
        //    int count = frequency(str,'a');//return type is int, therefore assign to int variable
        //   System.out.println(count);//print the frequency of char 'a'
//This step is use to identify if the character is unique, let's use loop for this
        for (char each : str.toCharArray()){
            //          char ch = str.charAt(i); //to get char as a data type
            int count = frequency(str, each);
            //this is a frequency
            if(count == 1){//if count is equal to 1, concat it to unique variable
                uniques += each;
            }
        }
        return uniques;

    }

//return the frequency of every single character from the string
    public static String frequencyOfChars(String str) {
        String expectedResult = "";//store the result of str in this variable A2B3C3
        //remove dup from str and store in this variable
        String nonDup = Util.duplicates(str);
        //call className.methodName(variable)


        for (char each : nonDup.toCharArray()) {
            int count = Util.frequency(str, each);
            expectedResult += "" + each + count;
        }

        return expectedResult;
    }

//format the full name
    public static String FormatFullName(String f_Name, String l_Name){
        f_Name =  f_Name.substring(0,1).toUpperCase() + f_Name.substring(1).toLowerCase();
//convert first char to uppercase + concat rest of the string & to lowercase,and assign it back to string
        l_Name = l_Name.substring(0,1).toUpperCase() + l_Name.substring(1).toLowerCase();
        String fullName = f_Name+" "+l_Name;

        return fullName;
    }

//find the max number in the int array, return the max number
    public static int maxNum(int[] arr){
        int max = arr[0];
        for(int i = 1; i <= arr.length-1;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return(max);
    }

//find the max number in the array using Integer wrapper class, return the max number
    public static Integer maxNum(Integer[] arr){
        int max = arr[0];
        for(int i = 1; i <= arr.length-1;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return(max);
    }

//find the max number in the double array, return the max number
    public static double maxNum(double[] arr){
        double max = arr[0];
    for(int i = 1; i <= arr.length-1;i++){
        if(arr[i] > max){
            max = arr[i];
        }
    }
    return(max);
}

//find the max number in the array using Double wrapper class, return the max number
    public static Double maxNum(Double[] arr){
        Double max = arr[0];
        for(int i = 1; i <= arr.length-1;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return(max);
    }

//find the min number in the array, return the min number
    public static int minNum(int[] arr, double[] arr1 ) {

        int min = arr[0];
        for (int i = 1; i <= arr.length - 1; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;

    }

//insert the element to the array
    public static int[] addElements(int arr[], int n1){
        int arr1[] = new int[arr.length + 1];
        arr1[arr1.length-1] = n1;


        int i = 0;
        for(int each : arr){
            arr1[i] =  each;
            i++;
        }
        return arr1;
    }

//combine two int array and return it as combine array
    public static int[] combine2Arrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0;
        for(int each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(int each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
    }

//combine two String array and return it as combine array
    public static String[] combine2Arrays(String[] arr1, String[] arr2){
        String[] arr3 = new String[arr1.length + arr2.length];

        int i = 0;
        for(String each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(String each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
    }

//combine two char array and return it as combine array
    public static char[] combine2Arrays(char[] arr1, char[] arr2){
        char[] arr3 = new char[arr1.length + arr2.length];

        int i = 0;
        for(char each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(char each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
    }

//combine two Integer array in wrapper class and return it as combine array
    public static Integer[] combine2Arrays(Integer[] arr1, Integer[] arr2){
        Integer[] arr3 = new Integer[arr1.length + arr2.length];

        int i = 0;
        for(Integer each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(Integer each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
    }

//combine two DOUBLE array in wrapper class and return it as combine array
    public static Double[] combine2Arrays(Double[] arr1, Double[] arr2){
        Double[] arr3 = new Double[arr1.length + arr2.length];

        int i = 0;
        for(Double each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(Double each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
    }

//combine two Character array in wrapper class and return it as combine array
    public static Character[] combine2Arrays(Character[] arr1, Character[] arr2){
        Character[] arr3 = new Character[arr1.length + arr2.length];

        int i = 0;
        for(Character each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(Character each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
    }

//sort an int array in descending order
    public static int[] sortDescendingArray(int[] arr){
        Arrays.sort(arr);
        int[] arr2 =  new int[arr.length]; //initialize the size, have not assign the value
        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++){
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }

//sort a double array in descending order
    public static double[] sortDescendingArray(double[] arr){
        Arrays.sort(arr);
        double[] arr2 =  new double[arr.length]; //initialize the size, have not assign the value
        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++){
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }

//sort a char array in descending order
    public static char[] sortDescendingArray(char[] arr){
        Arrays.sort(arr);
        char[] arr2 =  new char[arr.length]; //initialize the size, have not assign the value
        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++){
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }

//sort a string array in descending order
    public static String[] sortDescendingArray(String[] arr){
        Arrays.sort(arr);
        String[] arr2 = new String[arr.length];
        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++){
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }

//sort an Integer wrapper class array to descending array
    public static Integer[] sortDescendingArray(Integer[] arr){
        Arrays.sort(arr);
        Integer[] arr2 =  new Integer[arr.length]; //initialize the size, have not assign the value
        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++){
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }

//sort an Double wrapper class array to descending array
    public static Double[] sortDescendingArray(Double[] arr){
        Arrays.sort(arr);
        Double[] arr2 =  new Double[arr.length]; //initialize the size, have not assign the value
        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++){
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }

//sort an Character wrapper class array to descending array
    public static Character[] sortDescendingArray(Character[] arr){
        Arrays.sort(arr);
        Character[] arr2 =  new Character[arr.length]; //initialize the size, have not assign the value
        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++){
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }



}
