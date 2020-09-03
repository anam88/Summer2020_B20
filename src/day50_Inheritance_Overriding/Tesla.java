package day50_Inheritance_Overriding;
import day50_Inheritance_Overriding.CarTask.Car;
/*
Tesla:
    start(): voice control
 */
public class Tesla extends Car{
    public void start() {
        System.out.println("Voice Control");
    }
}
