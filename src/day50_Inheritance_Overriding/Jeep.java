package day50_Inheritance_Overriding;

import day50_Inheritance_Overriding.CarTask.Car;
/*
start(): Call Mechanic
             Oil Change
             jump start

 */
public class Jeep extends Car {

    public void start() {
        System.out.println("Call Mechanic");
        System.out.println("Oil Change");
        System.out.println("Jump Start");
    }
}
