package day24_Arrays;

import java.util.Arrays;

public class ArrayUtility {
    public static void main(String[] args) {
//tostring Method of Array

        int[] arr = {1,2,3};
//        System.out.println(arr);//prints hashcode
        System.out.println(Arrays.toString(arr));// [1,2,3]
        String s1 = Arrays.toString(arr); //assign it to string because we are printing string
        System.out.println(s1);

        System.out.println("==================");
//print group mates name using array
        String names[] = {"Iman", "Zarina","Alena","Anam","Fatma"};
//        System.out.println(names); print hashcodes
        System.out.println(Arrays.toString(names));

        System.out.println("==============================================");
//SORT Method of Array

       int nums[] = {1,2,4,78,45,0,2,63};
       Arrays.sort(nums);//sort method to print in ascending order
       System.out.println(Arrays.toString(nums));//prints in string format
//to get min & max value, we can sort the array first
        System.out.println("Max value: "+nums[nums.length-1]);
        System.out.println("Min value: "+nums[0]);
        System.out.println("==============================================");

//sort by alphabetic
        String students[] = {"Iman", "Zarina","Alena","Anam","Fatma"};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
        System.out.println("==============================================");

//.equal Method
        int arr1[] = {1,2,3};
        int arr2[] = {1,2,3};
       boolean result = Arrays.equals(arr1,arr2);
        System.out.println(result);

        int arr3[] = {2,1,3};
//        boolean result1 = Arrays.equals(arr3, arr2);
//        System.out.println(result1);//false
//we can sort arr3 and than compare also
        Arrays.sort(arr3);
        boolean result1 = Arrays.equals(arr3,arr2);
        System.out.println(result1);//after sorting output: true



    }

}
