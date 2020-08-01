package day15_String;

//import java.lang.String; //this is how we import String class, but not necessary because
//String class is part of java.lang package and automatically import also.
//java.lang is a special package in java library
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class String_Intro {
    public static void main(String[] args) {
        String name = "Hello";//
        String name1 = new String("Cybertek");
//        Scanner input = new Scanner(System.in);//rt side is declaring the object

        //s1 and s2 there is only ONE object created. because s1 = s2. There is no duplication
        String s1 = "Cat";//string literal
        String s2 = "Cat";//string literal

        System.out.println(s1 == s2);// true because s1 = s2 //there is one memory location for them
        //DOES NOT ACCEPT DUPLICATE CREATED OBJECT

        //one object DOG is share by two variable d1 and d2
        String d1 = "Dog";
        String d2 = "Dog";
        System.out.println(d1 == d2);// true
        //two object Apple, apple is share by two different variable a1 and a2
        //Java is case sensitive
        String a1 = "Apple";
        String a2 = "apple";
        System.out.println(a1 == a2);//false
//=====================================================================================//
        //Another way to create STRING OBJECT by using new keyword
        /*two different object because we are using NEW keyword, and it will be outside of the
        String Pool */
        //Tiger ==> visible text
        String t1 = new String("Tiger");
        String t2 = new String("Tiger");
        System.out.println(t1 == t2);
        //output is FALSE==> because both two different objects are saved in two different places
        System.out.println("===============================================");

        String c1 = "Cybertek";//object is created in String pool
        String c2 = new String("Cybertek");//object created in the heap
        //they are not in the same memory location
        String c3 = new String("Cybertek");
        String c4 = "Cybertek";
        String c5 = "cybertek";
        System.out.println(c1 == c2);
        //output is false even though they have same visible text; memory location is DIFFERENT
        System.out.println(c1 == c5);
        //output is false; Java is case sensitve, two different object will be created

    }


}
