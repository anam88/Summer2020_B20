package day62_Maps;

import day55_OOPAbstractionContinue.ShapeTask.Circle;
import day55_OOPAbstractionContinue.ShapeTask.Rectangle;

public class GarbageCollectionReview {
    public static void main(String[] args) {
        String str1 = "Cybertek"; //gc
        str1 = null;

        System.out.println(str1);

        String s1 = new String("John");
        String s2 = new String("Aaron");
        s1 = s2; //s1 is referring to Aaron now, and John is ready for gc
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("****************************");
        Circle c1 = new Circle(3);
        c1 = null;
        System.out.println(c1);

        Rectangle r1 = new Rectangle(5,10,10);// eligible for GC
        Rectangle r2 = new Rectangle(2,4,4);
        r1 = r2;
        System.out.println(r1);
        System.out.println(r2);

        String a1 = new String("MIT");
        String a2 = new String("Harvard");
        String a3 = new String("Yale");
        a1 = a2;
        a3 = a2;


        /*
        driver.close();
        driver = null;
         */

    }
}
