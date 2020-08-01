package day34_WrapperClass;

import java.util.Arrays;

public class WrapperClass {
    public static void main(String[] args) {
        Integer num = 100; //not a primitive it is a class. Class that is dedicated to primitive int

        byte b2 = 40;
      //  Integer n2 = b2;
        //you cannot do that because the Integer wrapper class is only dedicated to its own primitive

        int[] arr = new int[3];//complier will give the default values
        System.out.println(Arrays.toString(arr));//[0, 0, 0]

        int p1 = 300;
        Integer p2 = p1; //auto boxing, done automatically

        Integer q1 = 500;
        int q2 = q1; //un boxing, done automatically

        Double r1 = 7.0;
        double r2 = r1; //unboxing

        int n1 = 40;
        Integer n2 = n1; //autoboxing

    }
}
