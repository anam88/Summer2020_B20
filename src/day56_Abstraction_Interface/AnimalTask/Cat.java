package day56_Abstraction_Interface.AnimalTask;

public class Cat extends Animal implements Playable{
    //Cat IS-A Animal
    //Cat IS-A Playable

    public String catName;

    Cat(String catName){
        this.catName = catName;
    }

    @Override
    public void eat() {
        System.out.println(catName+ " is eating tuna");
    }

    @Override
    public void drink() {
        System.out.println(catName+ " is drinking milk");
    }

    @Override
    public void sleep() {
        System.out.println(catName+ " is not sleeping currently");
    }

    @Override
    public void sound() {
        System.out.println(catName+ " sound is Meow!");
    }

    @Override
    public void play() {
        System.out.println(catName+ " likes to play with ball");
    }
}
