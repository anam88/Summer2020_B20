package day48_Inheritance.AnimalTask;

public class AnimalObject{
    public static void main(String[] args) {
        Dog dog1 = new Dog("Maltese","Fluffy",
                "Small",4,'M');
        System.out.println(dog1);
        dog1.sleep();
        System.out.println("*****************************");
        Bird bird1 = new Bird("Northern mockingbirds","Rosy",
                "Small",1,'F');
        System.out.println(bird1);
        bird1.singing();
        System.out.println("*****************************");
        Cat cat1 = new Cat("Abyssinian","Snowy",
                "Medium",5,'F');
        System.out.println(cat1);
        cat1.eat();
        cat1.meow();

    }
}
