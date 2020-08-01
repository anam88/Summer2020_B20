package day28_Recap;

import java.util.Arrays;

public class MultiD_Array {
    public static void main(String[] args) {

        int arr2D[][] = {{1,2,3} , {4,5,6,7,8} , {9,10,11,12,13}};
        //write a program that returns all the int array
//outer loop iterate get each 1D array from arr2D
        for(int i = 0; i <= arr2D.length-1; i++){//returns all the int array
         int each1DArray[] =   arr2D[i];
            System.out.println(Arrays.toString(each1DArray));
//inner loop iterate all the elements of each 1D array
            for (int j = 0; j <= each1DArray.length-1; j++){
                int eachNum = each1DArray[j];
                //now only iterate EVEN numbers
                if(eachNum % 2 == 0){
                    System.out.print(eachNum+" ");
                }

            }
            System.out.println();
        }
    }
}
