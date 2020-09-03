package day50_Inheritance_Overriding;

import day50_Inheritance_Overriding.ShapeTask.Shape;

/*
Square
    area(): a*a;
 */
public class Square extends Shape {
    public double side;

    public Square(double length){
        this.side = length;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    public double calculateArea(){
        return side * side;
    }
    public double calculatePerimeter(){
        return 4 * (side + side);
    }
}
