package day26_MultiDimensionalArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortDescending {
    public static void main(String[] args) {
/*
 7. write a program that can sort the array in descending order
ex:
    arr1: { 10, 11, 8, 9, 12, 5, 15};
    output:
        arr2: {15, 12, 11, 10, 9, 8, 5}
    NOTE: at the end, you must have have an array that contains
     the descending order of the original array
 */
        int arr[] = { 10, 11, 8, 9, 12, 5, 15};
        Arrays.sort(arr);//this will sort the array
        System.out.println(Arrays.toString(arr));
        int desc[] = new int[arr.length];
/*since we have 3 elements in array, we can do it manually
        desc[0] = arr[2];
        desc[1] = arr[1];
        desc[2] = arr[0];
        */
//since it is a repeated step we will use loop
        int k = arr.length-1;//regardless of the length of the array, it will start from last index

        for(int i = 0; i <= desc.length-1; i++){//i: 0, 1, 2
            desc[i] = arr[k]; //
            k--; // k: 2, 1, 0
        }

        System.out.println(Arrays.toString(desc));



    }
}
