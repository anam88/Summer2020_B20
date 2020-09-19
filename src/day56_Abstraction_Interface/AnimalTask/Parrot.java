package day56_Abstraction_Interface.AnimalTask;

public class Parrot extends Animal implements Flyable, Playable, Talkative {
    /*
    Parrot IS-A Animal
    Parrot IS flyable & playbale
     */
    public String parrotName;
    Parrot(String parrotName){
        this.parrotName = parrotName;
    }

    @Override
    public void eat() {
        System.out.println(parrotName+" is eating nuts");
    }

    @Override
    public void drink() {
        System.out.println(parrotName+" is eating water");
    }

    @Override
    public void sleep() {
        System.out.println(parrotName+" sleeps at night time");
    }

    @Override
    public void sound() {
        System.out.println(parrotName+ " sound is squawks");
    }

    @Override
    public void fly() {
        System.out.println(parrotName+" is flying");
    }

    @Override
    public void play() {
        System.out.println(parrotName+" is playing peekaboo ");
    }

    @Override
    public void talk() {
        System.out.println(parrotName+ " is talking a lot today");
    }
}
