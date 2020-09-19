package day54_OOPAbstraction_Intro.carTask;

public class BMW extends Car{
    //subclass of abstract class Car, implement all the abstract methods of abstract parent class


    @Override
    public void start() {
        System.out.println("Start BMW by: push start");
    }
}
