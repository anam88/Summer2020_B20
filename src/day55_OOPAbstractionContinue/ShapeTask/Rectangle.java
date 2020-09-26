package day55_OOPAbstractionContinue.ShapeTask;
/*
1.create a sub class of shape called Rectangle
    attributes: width, length, name(static), area, perimeter,
    hasVolume(static), volume
    override the abstract methods

add a constructor that takes two arguments for W & L of rectangle the and initialize the instance variables: width, length, area, perimeter, volume
add a static block that can initialize the static variables of the rectangle

 */
public class Rectangle extends Shape{
    public double length;
    public double width;
    public double height;
    static {
        name = "Rectangle";
        hasVolume = true;
    }
    public Rectangle(double length, double width, double height){
        if(length <= 0 || width <= 0 || height <= 0){
            throw new RuntimeException(
                    "Length, Height, & Width of Rectangle cannot be 0 or negative");
        }
        this.length = length;
        this.width = width;
        this.height = height;
        area = calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();
    }

    @Override //area = l * w
    public double calculateArea() {
        return length * width;
    }

    @Override //P = 2(l + w)
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override //V = L * H * W.
    public double calculateVolume() {
        return length * width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }
}
