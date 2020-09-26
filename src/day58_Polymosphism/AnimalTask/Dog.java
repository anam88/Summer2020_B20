package day58_Polymosphism.AnimalTask;
/*
 3. create subclass of Animal named Dog
            variable: dogName
            methods: bark, toString
 */
public class Dog extends Animal{
    public String dogName;
    public Dog(String dogName, int age, char gender) {
        super(age, gender);
        this.dogName = dogName;
    }
    public void bark(){
        System.out.println(dogName+" is barking at strangers!");
    }
    @Override
    public void eat(){
        System.out.println(dogName+" is eating dog food!");
    }

    @Override
    public void sleep() {
        System.out.println(dogName+" is sleeping in dog bed.");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", Dog age=" + age +
                ", Dog gender=" + gender +
                '}';
    }
}
