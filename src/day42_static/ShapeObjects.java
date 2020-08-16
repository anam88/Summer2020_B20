package day42_static;

public class ShapeObjects {
    public static void main(String[] args) {
        //if the radius of the circle is 25, what would be the area
        Circle areaOfCircle1 = new Circle();
        areaOfCircle1.setCircleInfo(25);
        System.out.println(areaOfCircle1.radius);
        System.out.println(areaOfCircle1.diameter);
        System.out.println(areaOfCircle1.calcArea());
        System.out.println(areaOfCircle1.calPerimeter());


    }
}
