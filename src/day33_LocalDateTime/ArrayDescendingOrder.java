package day33_LocalDateTime;

import java.util.Arrays;

public class ArrayDescendingOrder {
/*
Task02:
    1. create a return method that can return an int array in descending order
    2. create a return method that can return a double array in descending order
    3. create a return method that can return a String array in descending order
    4. create a return method that can return a char array in descending order

 */
    public static void main(String[] args) {
        int[] arr = {1,4,3,2,5};
        Arrays.sort(arr); //{1,2,3,4,5}
        int[] arr2 =  new int[arr.length]; //initialize the size, have not assign the value
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5] sorted

//need to make arr in descending order and assign it to arr2
//how can we get a last element of arr using length-1

 /*        i       k
        arr2[0] = arr[arr.length-1];
        arr2[1] = arr[3];
        arr2[2] = arr[2];
        arr2[3] = arr[1];
        arr2[arr2.length-1] = arr[0];

  */



        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++){
            arr2[i] = arr[k];
            k--;
        }
        System.out.println(Arrays.toString(arr2));//[5, 4, 3, 2, 1]
        System.out.println("=====================================");

        int[] scores = {100,75,85,95,65,55};
       scores =  sortDescendingArray(scores);
        System.out.println(Arrays.toString(scores));
        System.out.println("=====================================");

        double[] scores1 = {2.0,5.0,10.0,8.0,4.0};
        scores1 = sortDescendingArray(scores1);
        System.out.println(Arrays.toString(scores1));
        System.out.println("=====================================");

        char[] ch = {'A','F','X','M','Z'};
        ch = sortDescendingArray((ch));
        System.out.println(Arrays.toString(ch));
        System.out.println("=====================================");

        String[] str = {"C","L","B","O"};
        str = sortDescendingArray(str);
        System.out.println(Arrays.toString(str));
        System.out.println("====================================");
    }


    public static int[] sortDescendingArray(int[] arr){
        Arrays.sort(arr);
        int[] arr2 =  new int[arr.length]; //initialize the size, have not assign the value
        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++){
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }

    public static double[] sortDescendingArray(double[] arr){
        Arrays.sort(arr);
        double[] arr2 =  new double[arr.length]; //initialize the size, have not assign the value
        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++){
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }

    public static char[] sortDescendingArray(char[] arr){
        Arrays.sort(arr);
        char[] arr2 =  new char[arr.length]; //initialize the size, have not assign the value
        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++){
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }

    public static String[] sortDescendingArray(String[] arr){
        Arrays.sort(arr);
        String[] arr2 = new String[arr.length];
        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++){
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }
}
