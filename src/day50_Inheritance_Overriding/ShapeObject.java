package day50_Inheritance_Overriding;


import day50_Inheritance_Overriding.ShapeTask.Circle;
import day50_Inheritance_Overriding.ShapeTask.Rectangle;

public class ShapeObject {
    public static void main(String[] args) {
        Circle circle1 = new Circle(4);
        System.out.println(circle1.calculateArea());
        System.out.println(circle1.calculatePerimeter());
        System.out.println("******************");
        Rectangle rectangle1 = new Rectangle(6,4);
        System.out.println(rectangle1.calculateArea());
        System.out.println(rectangle1.calculatePerimeter());
        System.out.println("*****************");
        Square square1 = new Square(5);
        System.out.println(square1.calculateArea());
        System.out.println(square1.calculatePerimeter());

    }
}
