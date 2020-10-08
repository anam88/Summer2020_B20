package day59_OOPReview;

import day55_OOPAbstractionContinue.ShapeTask.Circle;
import day55_OOPAbstractionContinue.ShapeTask.Shape;

public class Polymorphism {
    public static void main(String[] args) {
        Shape shape1 = new Circle(3);
        System.out.println( (  (Circle)shape1  ));

    }
}
