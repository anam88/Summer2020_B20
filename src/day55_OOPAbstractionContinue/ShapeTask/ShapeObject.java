package day55_OOPAbstractionContinue.ShapeTask;

/*
 5. create a class called shape objects:
 create objects of each shapes and calculate their area, perimeter, and volume

 */
public class ShapeObject {
    public static void main(String[] args) {

        Circle circle1 = new Circle(2.5);
        System.out.println(circle1);
        System.out.println(Circle.hasVolume);

        System.out.println("**************************************************");
        Rectangle rectangle1 = new Rectangle(3.1,4.0,3.0);
        System.out.println(rectangle1);
        System.out.println(Circle.hasVolume);
        System.out.println("****************************************************");
        Cylinder cylinder1 = new Cylinder(2.4, 4.3);
        System.out.println(cylinder1);
        System.out.println(Circle.hasVolume);



    }
}
