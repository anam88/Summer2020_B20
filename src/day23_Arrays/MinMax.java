package day23_Arrays;

import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        /*
        write a program that can return min and max number from given array
        {10, 20, 3, 4, 5, 6, 7, -10, -100, 300, 400}
         */

        int nums[] = {10, 20, 3, 4, 5, 6, 7, -10, -100, 300, 400};
        int max = nums[0];
        int min = nums[0];

        for(int i = 1; i <= nums.length-1;i++){
            if(nums[i] > max){
                max = nums[i];
            }
            if(nums[i] < min){
                min = nums[i];
            }
        }


        System.out.println("Minimum Valus is: "+min);


        System.out.println("Maximum value is: "+max);

    }
}