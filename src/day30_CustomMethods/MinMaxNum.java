package day30_CustomMethods;

import java.util.Arrays;

public class MinMaxNum {
    public static void main(String[] args) {
        int arr[] = {5,1,10,2,200,80,7,95};
        int num = max(arr);
        System.out.println(Arrays.toString(arr));//[1, 2, 5, 7, 10, 80, 95, 200]
        System.out.println(num);//200 can be re assign
        max2(arr);//200 cannot be reassign
        int num1 = min(arr);
        System.out.println(num1); //1

    }
    //find min and max number with  return type
    public static int max(int arr[]){
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        return(max);

    }

    //use void method
    public static void max2(int arr[]){
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        System.out.println(max);
    }

    //find min with return type

    public static int min(int arr[]){
        Arrays.sort(arr);
        int min = arr[0];
        return(min);
    }
}
