package day58_Polymosphism;


import day57_Polymorphism.PhoneTask.Iphone;
import day57_Polymorphism.PhoneTask.Phone;
import day57_Polymorphism.PhoneTask.Samsung;
import day58_Polymosphism.AnimalTask.Animal;
import day58_Polymosphism.AnimalTask.Cat;
import day58_Polymosphism.AnimalTask.Dog;

public class TypeCasting {
    public static void main(String[] args) {
        Dog dog1 = new Dog("A",2,'F');
        Cat cat1 = new Cat("A",2,'F');

        Animal animal = dog1; //done implicitly
        Animal animal2 = cat1;//converting child class type to parent class type (done manually)

        //********************************************************************
        //reference casting
        //long x = 10000L; int y = (int) x;
        Animal animal3 = new Dog("A",2,'F');
        //animal3.bark();
        Dog dog2 = (Dog) animal3;//down-casting
        dog2.bark();//because of down-casting I was able to call the method

        Animal animal4 = new Cat("A",2,'F');
     //   Dog dog3 = (Dog)animal4;//java.lang.ClassCastException because Dog IS-NOT-A Cat

        System.out.println("*******************************************");
        //casting parent class to child class - upcasting
        Phone phone1 = new Iphone("ABC",100,"6.5"); //upcasting
        Iphone phone2 = new Iphone("XYZ",200,"7.0"); //upcasting
        //casting child class to parent class - down-casting
        Iphone phone3 = (Iphone) phone1;

        Phone phone4 = new Samsung("S20",500,"9");
        Samsung phone5 = (Samsung)phone4;//upcasting

    //    Iphone phone6 = (Iphone) phone4;//java.lang.ClassCastException because Iphone IS-NOT-A Samsung




    }

}
