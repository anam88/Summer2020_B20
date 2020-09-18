package day56_OOPAbstractionContinue.ShapeTask;
/*
1. create a sub class of shape called Circle (meant to be subclass ONLY)
attributes: radius, name(static), area, perimeter, hasVolume(static), volume
override the abstract methods
(if the shape does not have volume, return 0 for the colume)

add a constructor that takes an argument
for radius of the circle and
initialize the instance variables: radius, area, perimeter, volume
add a static block that can initialize the static variables of the circle

 */
public class Circle extends Shape{

    public double radius;
    /*
    6 variable: 2 static (name, hasVolume)
               4 instance (radius, area, perimeter, volume)
     */
    static { //static block for static fields
        name = "Circle";
        hasVolume = false;
    }
    Circle(double radius){
        if(radius <= 0){//creating a manual exception by using throw keyword
           throw new RuntimeException("Radius of Circle cannot be 0 or negative");
        }
/*constructor for instance variable radius ONLY, because we only need radius to
calculate area, and perimeter */
        this.radius = radius;
//initializing the instance variable by assigning them to the method that we created
        area = calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();
    }

    @Override //area = radius * radius
    public double calculateArea() {
        return Math.pow(radius,2) * Math.PI;
    }

    @Override //perimeter = radius * 2 * pi;
    public double calculatePerimeter() {
        return radius * 2 * Math.PI;
    }

    @Override
    public double calculateVolume() {
        return 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }
}
