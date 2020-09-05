package day51_Exceptions.PetsTask;
/*
2. create a sub class of Pet called Dog
override the instance methods:
eat(): dog eats Chicken
drink(): dog drinks water
sleep(): dog sleeps on the bed
*/
//Dog is a pet | Cat is a pet
public class Dog extends Pet{
   public Dog(String name, int age, char gender, String breed, String color){
       super(name,age,gender,breed,color);
   }

    @Override
    protected void eat() {
        System.out.println(name+ " is eating chicken.");
    }

    @Override
    protected void drink() {
        System.out.println(name+" is drinking water.");
    }

    @Override
    protected void sleep() {
        System.out.println(name+" sleeps on the bed.");
    }
}
