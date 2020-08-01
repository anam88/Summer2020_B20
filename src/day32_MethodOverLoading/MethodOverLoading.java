package day32_MethodOverLoading;

import java.util.Arrays;

public class MethodOverLoading {
  //same method name, datatype MUST be different for method over loading
  //can make the parameter different by giving different datatype or more than one data type
    public static void method(int a) {
        int[] arr = {9,8,7};
        Arrays.sort(arr);

        String[] name  = {"D","C","A"};
        Arrays.sort(name);
    }

    public static void method(String str){

    }
}
