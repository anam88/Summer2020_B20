package day28_Recap;

import java.util.Arrays;

public class MultiD_ArrayPractice3 {
    public static void main(String[] args) {

        int arr2D[][] = {{1,2,3} , {4,5}}; //2D array

        int arr3D [][][] = { {{1,2,3} , {4,5}} , {{6,7,8} , {9,10}} };//3D array
        System.out.println(Arrays.deepToString(arr3D));//print all arrays
        System.out.println(Arrays.deepToString(arr3D[1]));//print 1 array

        //how to retrieve singleD from multiD
        System.out.println(Arrays.toString(arr3D[0][1]));
    }
}
