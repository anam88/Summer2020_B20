package day50_Inheritance_Overriding.ShapeTask;
import day50_Inheritance_Overriding.ShapeTask.Shape;
/*
circle
    area(): r*r*3.14
 */
public class Circle extends Shape{
    public double radius;
    public double diameter;
    static double PI = 3.14;

    public Circle(double radius){
        this.radius = radius;
        diameter = radius * 2;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    public double calculateArea() {
        return PI * radius * radius ;
    }
    public double calculatePerimeter(){
        return diameter * PI;
    }
}
