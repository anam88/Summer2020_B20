package day51_Exceptions.PetsTask;

public class Tiger extends Pet{
    public String tigerSound;
    public Tiger(String name, int age, char gender, String breed, String color,String tigerSound){
        super(name,age,gender,breed,color);
        this.tigerSound = tigerSound;
    }

    @Override
    protected void eat() {
        System.out.println(name+ " is eating steak");
    }

    @Override
    protected void drink() {
        System.out.println(name+" is drinking energy drink");
    }

    @Override
    protected void sleep() {
        System.out.println(name+ " is sleeping under the tree");
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "tigerSound='" + tigerSound + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
