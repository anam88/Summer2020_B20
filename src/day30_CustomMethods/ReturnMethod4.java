package day30_CustomMethods;

import java.util.Arrays;

public class ReturnMethod4 {

    public static void main(String[] args) {
        int arr1[] = {1,2,3};
        int arr2[] = {4,5,6,7,8,9};
        int arr3 [] = combineTwoArrays(arr1, arr2);
        System.out.println(Arrays.toString(arr3));//[1, 2, 3, 4, 5, 6, 7, 8, 9]
        System.out.println(arr3[5]);//6

    }

    public static int [] combineTwoArrays(int arr1[], int arr2[]){
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
        return arr3;
    }

}
