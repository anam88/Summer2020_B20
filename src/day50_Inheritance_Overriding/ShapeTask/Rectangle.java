package day50_Inheritance_Overriding.ShapeTask;
import day50_Inheritance_Overriding.ShapeTask.Shape;
/*
rectangle
    area(): a*b;
 */
public class Rectangle extends Shape{
    public double l;
    public double w;

    public Rectangle(double l, double w){
        this.l = l;
        this.w = w;
        area = calculateArea();
        area = calculatePerimeter();
    }

    public double calculateArea(){
        return l * w;
    }
    public double calculatePerimeter(){
        return 2 * (l + w );
    }

}
