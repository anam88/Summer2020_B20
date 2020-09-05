package day51_Exceptions.PetsTask;
//house has a Dog and Cat
public class House {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Fluffy",4,'M',"Maltese","White");
        System.out.println(dog1);
        dog1.eat();
        dog1.drink();
        dog1.sleep();
        System.out.println("******************************");
        Cat cat1 = new Cat("Snowy",5,'F',"Abyssinian","White");
        System.out.println(cat1);
        cat1.eat();
        cat1.drink();
        cat1.sleep();
        System.out.println("******************************");
        Tiger tiger1 = new Tiger("Ryker",15,'M',"Bengal tiger","Golden",
        "Roar");
        System.out.println(tiger1);
        tiger1.eat();
        tiger1.drink();
        tiger1.sleep();

    }
}
