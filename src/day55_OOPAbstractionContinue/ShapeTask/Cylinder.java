package day55_OOPAbstractionContinue.ShapeTask;



/*
4. create a sub class of shape called Cylinder
attributes: radius, height, name(static), area, perimeter, hasVolume(static), volume
override the abstrat methods
add a constructor that takes two arguments for r & h of the cylinder  and initialize the instance variables: radius, height, perimeter, area, and volume
add a static block that can initialize the static variables of the cylinder
 */
public class Cylinder extends Shape {
    public double radius;
    public double height;

    static {
        name = "Cylinder";
        hasVolume = true;
    }
    public Cylinder(double radius, double height){
        if(radius <= 0 || height <=0 ){//creating a manual exception by using throw keyword
            throw new RuntimeException("Radius & Height of Cylinder cannot be 0 or negative");
        }
        this.radius = radius;
        this.height = height;
        area = calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();

    }

    @Override //A=2πrh+2πr2
    public double calculateArea() {
        return ((2 * (Math.PI * radius * height)) + (2 * Math.PI * radius * 2));
    }

    @Override //p is 2·Pi·r
    public double calculatePerimeter() {
        return 2 * (Math.PI * radius);
    }

    @Override //V=πr2h
    public double calculateVolume() {
        return Math.PI * radius * (2 * height);
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }
}
