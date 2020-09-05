package day51_Exceptions.PetsTask;

public class Pet {
    //attributes: name, age, gender, breed, color
    public String name;
    public int age;
    public char gender;
    public String breed;
    public String color;
    //create a constructor that can initialize the instances
    public Pet(String name, int age, char gender, String breed, String color){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.breed = breed;
        this.color = color;
    }
    /*
instance methods (with protected access modifiers):
eat(): by default assume all Pets eat  chocolate
drink(): by default assume all Pets drink milk
sleep(): by default assume all Pet sleep on the floor
toString():
 */
    protected void eat(){
        System.out.println(name+ " eating chocolate");
    }
    protected void drink(){
        System.out.println(name+ " drink milk");
    }
    protected void sleep(){
        System.out.println(name+" sleep on floor");
    }
    public String toString(){
        return "\nName: "+name+
                "\nAge: "+age+
                "\nGender: "+gender+
                "\nBreed: "+breed+
                "\nColor: "+color;



    }




}
