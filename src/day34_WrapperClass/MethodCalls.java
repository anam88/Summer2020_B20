package day34_WrapperClass;

import Library.Util;

import java.util.Arrays;

public class MethodCalls {

    public static void main(String[] args) {
        //combine two arrays
        Integer[] arr1 = {1,2,3,4};
        Integer[] arr2 = {5,6,7,8};
        Integer[] arr3 = Util.combine2Arrays(arr1, arr2);
        System.out.println(Arrays.toString(arr3));

        Integer max = Util.maxNum(arr3);
        System.out.println(max);


        String[] s1 = {"A","B","C"};
        String[] s2 = {"D","E","F"};
        String[] s3 = Util.combine2Arrays(s1,s2);
        System.out.println(Arrays.toString(s3));

        Character[] ch = {'X','A','Z','O'};
        ch = Util.sortDescendingArray(ch);
        System.out.println(Arrays.toString(ch));
    }
}
