package day26_MultiDimensionalArray;

import java.util.Arrays;

public class MultiD_Array {
    public static void main(String[] args) {
/*
A 2D array has a type such as int[][] or String[][], with two pairs of square brackets.
- contains multiple arrays
- Array that contains Array
*/
         char ch1[] = {'A','B'}; //single dimensional array
         char ch2[] = {'C','D'};//single dimensional array
         char ch3[] = {'F','G','H'};//single dimensional array
//                           0   1       0   1   2       0   1   2
        char arr2D[][] = { {'A','B'} , {'C','D','E'} , {'F','G','H'} };
        //index                0            1            2

        System.out.println(Arrays.toString(arr2D[2]));
        //to.String is used to print arrays

        //print H & C
    // char ch = arr2D[2][2]; extra step, you can just print it on console by using print statement
        System.out.println( arr2D[2][2] );
        System.out.println( arr2D[1][0] );

        //print G B
        System.out.println( arr2D[2][1]+" "+arr2D[0][1]);

        System.out.println("==============================================================");
        //{1,2,3} , {4}, {5,6}, {7,8,9,10}

//use below 2d array to print it by using for loop and for each loop

        int nums[][] = { {1,2,3} , {4}, {5,6}, {7,8,9,10} };

        //print {7,8,9,10}

        System.out.println( Arrays.toString(nums[3]));
        System.out.println("==============================================================");
        //use for loop
        for (int i = 0; i <= nums.length-1; i++){
            System.out.println( Arrays.toString(nums[i]));
        }
        System.out.println("==============================================================");

        //use for each loop
        for(int each[] : nums){
            System.out.println(Arrays.toString(each));
        }



    }
}
