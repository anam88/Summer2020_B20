package day58_Polymosphism.AnimalTask;
/*
 1. creat a class Animal
            variables: age, gender
            methods: eat, sleep, toString
        DO NOT make it abstract yet we need this for today's example
 */
public class Animal {
    public int age;
    public char gender;

    public Animal(int age, char gender) {
        this.age = age;
        this.gender = gender;
    }
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void sleep(){
        System.out.println("Animal is sleeping");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "Animal age=" + age +
                ", Animal gender=" + gender +
                '}';
    }
}
