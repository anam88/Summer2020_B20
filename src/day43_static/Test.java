package day43_static;

import Library.Resources;

import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import static Library.Resources.*;//import all static from resources class
import static Library.Resources.a;//import static variable a

public class Test {
    public static void main(String[] args) {
        System.out.println(StaticBlock3.a);
        System.out.println(StaticBlock3.b);
        System.out.println(StaticBlock3.c);

        System.out.println(Arrays.toString(Data.arr));//[1, 2, 3]
        System.out.println(Data.list);//[4, 5, 6]
        System.out.println("============================================");
        System.out.println(a);
        method1();


    }

}
