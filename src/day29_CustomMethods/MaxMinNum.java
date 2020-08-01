package day29_CustomMethods;

public class MaxMinNum {
    /*
   11. write a method that can print out the maximum number from any array of integers
    12. write a method that can print out the minimum number from any array of integer
     */
    public static void main(String[] args) {
        int arr[] = {500, 4, 0, 10, -2};
        maxNum(arr);
        minNum(arr);
    }
    public static void maxNum(int[] arr){
        int max = arr[0];
        for(int i = 1; i <= arr.length-1;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The max number is: "+max);
    }

    public static void minNum(int[] arr ){

        int min = arr[0];
        for(int i = 1; i <= arr.length-1; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The min number is: "+min);
    }
}
