package day32_MethodOverLoading;
import Library.Util;

import java.util.Arrays;

public class AddElement {
/*
 3. write a method that can add element to an array,
 the method accepts an array and and a number, t
 hen returns the new array by appending the number to the last index of the given array
    Ex:
        int[] arr = {1,2,3};
        int num = 4;
        addElement(arr, num); ===> {1,2,3,4}
        USE for each loop
 */

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int n1 = 4;
/*
        int arr1[] = new int[arr.length + 1];

        arr1[arr1.length-1] = n1;
//4 will be added as a last index

        int i = 0;
        for(int each : arr){
            arr1[i] =  each;
            i++;
        }

        System.out.println(Arrays.toString(arr1));
         */
        int scores [] = {85, 65, 45, 55, 95};
        int num = 87;

        scores = addElements(scores,num);
        System.out.println(Arrays.toString(scores));
    }

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
}
