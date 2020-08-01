package day30_CustomMethods;

import java.util.Arrays;

public class ArrayInDescending {
    /*
     2. create a function that can print out the array of integers in descending order

     */
    public static void main(String[] args) {
        int arr[] = {5,-6,7,9,10,20,30};
        numbers(arr);
    }

    public static void numbers(int arr[]){
        Arrays.sort(arr); //{5,6,7,9,10,20,30}

        for(int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i]+" ");
        }



    }
}
