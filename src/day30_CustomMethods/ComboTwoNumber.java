package day30_CustomMethods;

import java.util.Arrays;

public class ComboTwoNumber {
    /*
     3. create a function that can print out the combination of two integer arrays
     */
    public static void main(String[] args) {
        int arr1[] = {1,2,3};
        int arr2[] = {4,5,6,7,8,9};
        combineTwoArrays(arr1, arr2);

    }

    public static void combineTwoArrays(int arr1[], int arr2[]){
        //add both arr1 and arr2 that we define in the parameter
        int arr3[] = new int[arr1.length + arr2.length];
        int i = 0; // each is equal to 0 right now
        for(int each : arr1){
            arr3[i] = each;
            i++;
        }
        for(int each : arr2){
            arr3[i] = each;
            i++;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
