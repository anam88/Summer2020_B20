package day58_Polymosphism;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import day55_OOPAbstractionContinue.ShapeTask.*;
import day58_Polymosphism.AnimalTask.Animal;
import day58_Polymosphism.AnimalTask.Cat;
import day58_Polymosphism.AnimalTask.Dog;

public class InstanceOf_Keyword {
    public static void main(String[] args) {
        Animal animal1 = new Animal(10, 'F');
        Animal animal2 = new Dog("Dama", 2, 'F');
        Animal animal3 = new Cat("Kiko", 2, 'M');

        //verify animal3 is the object of Animal class
        boolean re1 = animal3 instanceof Animal;
        //   animal3(Cat) IS-A Animal
        System.out.println(re1); //true

        //verify animal3 is a object of cat class
        boolean re2 = animal3 instanceof Cat;
        // animal3(Cat) IS-A Cat
        System.out.println(re2);//true

        //verify animal3 is a object of dog class
        boolean r3 = animal3 instanceof Dog;
        //animal3(Cat) IS-NOT-A Dog
        System.out.println(r3);//false

        System.out.println(animal2 instanceof Animal); //Dog IS-A Animal

        //child class cannot be reference of parent class
        System.out.println(animal1 instanceof Dog); //false not every animal is a Dog

        System.out.println(animal1 instanceof Cat);//false not every animal is a Cat
        System.out.println("*****************************************");
        Shape shape1 = new Circle(3);
        identifyShape(shape1);
        System.out.println("*****************************************");

        Shape c1 = new Circle(3);
        Shape c2 = new Circle(5);
        System.out.println("Circle: "+equalShapes(c1, c2));

        Shape r1 = new Rectangle(4,5,4);
        Shape r2 = new Rectangle(4,5,4);
        System.out.println("Rectangle: "+equalShapes(r1,r2));

        Shape cy1 = new Cylinder(4,3);
        Shape cy2 = new Cylinder(2,6);
        System.out.println("Cylinder: "+equalShapes(cy1,cy2));

    }

    public static void identifyShape(Shape shape) {
        if (shape instanceof Circle) {
            System.out.println("The shape is Circle");
        } else if (shape instanceof Rectangle) {
            System.out.println("The shape is Rectangle");
        } else {
            System.out.println("The shape is Cylinder");
        }
    }


    //create a custom method that compare two shapes
    public static boolean equalShapes(Shape shape1, Shape shape2) {
        boolean result = false;
        boolean bothCircle = shape1 instanceof Circle && shape2 instanceof Circle;
        boolean bothRectangle = shape1 instanceof Rectangle && shape2 instanceof Rectangle;
        boolean bothCylinder = shape1 instanceof Cylinder && shape2 instanceof Cylinder;
        if (bothCircle) {
            Circle c1 = (Circle) shape1;
            Circle c2 = (Circle) shape2;
            if (c1.radius == c2.radius) {
                result = true;
            }
                }
        else if (bothRectangle){
            Rectangle r1 = (Rectangle) shape1;
            Rectangle r2 = (Rectangle) shape2;
            if((r1.length == r2.length) && (r1.width == r2.width) && (r1.height == r2.height)){
                result = true;
            }
        }
        else if (bothCylinder){
            Cylinder cy1 = (Cylinder) shape1;
            Cylinder cy2 = (Cylinder) shape2;
            if( (cy1.height == cy2.height) && (cy1.radius == cy2.radius));
            {
                result = true;
            }
        }
        else{
            System.out.println("Matching Shape not found!");
        }
        return result;
            }
        }




