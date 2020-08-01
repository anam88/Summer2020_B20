package day34_WrapperClass;

import java.util.Arrays;

public class WrapperClass_Practice {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};//primitive

        Integer[] arr2 = {1,2,3,4}; //wrapper class
        for(Integer each : arr2){
            System.out.print(each+" ");
        }
        System.out.println();

        Double[] arr3 = {2.5,1.8,1.5,0.2};
        for(Double each : arr3){
            System.out.print(each+" ");
        }

        System.out.println();

        char[] arr5 = {65,75,68,69};
        System.out.println(Arrays.toString(arr5));

        char ch = 79;
        Character ch2 = 79;
        System.out.println(ch2);

        String[] nums1 = {"12", "13.5", "14", "15"};
//take all the elements from this array and put it in to new array that has a length of nums1 size
        double[] nums2 = new double[nums1.length];//created a new object

        for(int i = 0; i <= nums1.length-1; i++){
//how will we convert nums1 (string) to nums2(double)
//we will use parse method because it will return us primitive value
          nums2[i] =  Double.parseDouble(nums1[i]);
        }
        System.out.println(Arrays.toString(nums2));


    }
}
