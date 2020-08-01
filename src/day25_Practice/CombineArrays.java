package day25_Practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CombineArrays {
    public static void main(String[] args) {
/*
6. write a program that can combine two arrays of integers and then print out the maximum number
Ex:
arr1 = { 1,2,3,4}
arr2 = {5,6,7,8}
output:
    arr3 = {1,2,3,4,5,6,7,8}
    max: 8
*/

        int arr1[] = {1,2,3,45,89,100,150};
        int arr2[] = {4,5,200,9,6,358,2000,400,799,455};


        int size = arr1.length + arr2.length;//arr3 ==> arr1 + arr 2 length
        int arr3[] = new int[size];//5

        /*assiging the values manually of arr1 and arr 2 to arr3
        arr3[0] = arr1[0];
        arr3[1] = arr1[1];
        arr3[2] = arr1[2];

        arr3[3] = arr2[0];
        arr3[4] = arr2[1];
*/

        int index = 0;
        for (int each : arr1){
            arr3[index] = each;
            index++;
        }

        for(int each : arr2){
            arr3[index] = each;
            index++;
        }
        //sort the Array before getting the max number
        Arrays.sort(arr3);


        System.out.println("final value of index is: "+index);
        System.out.println(Arrays.toString(arr3));
        System.out.println("Maximum value is: "+arr3[arr3.length-1]);

    }
}
