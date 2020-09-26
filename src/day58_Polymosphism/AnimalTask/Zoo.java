package day58_Polymosphism.AnimalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Winston",4, 'M');
        dog1.sleep(); //inherited override method
        dog1.eat();//inherited override method
        dog1.bark();//method in dog class
        System.out.println(dog1.dogName);
        System.out.println(dog1.age);
        System.out.println(dog1.gender);

        System.out.println("***************************************");

        //polymorphism
        Animal dog2 = new Dog("Dama",2, 'F');
        dog2.eat(); //inherited override method
        dog2.sleep(); //inherited override method
    // dog2.bark(); Reference type decide what can be called or accessible. cannot call bark method
        System.out.println(dog2.age);
        System.out.println(dog2.gender);
//      System.out.println(dog2.dogName);Reference type decide what can be called or accessible. cannot call dogName variable
        System.out.println(dog2);


    }
}
