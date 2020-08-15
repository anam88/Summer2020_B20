package day41_toString;
/*
Task:
Cat:
attributes:
        name, age, gender, color, breed
Actions:
        setInfo, eat, drink, toString
        use this. keyword

*/
public class Cat {
    String name;
    int age;
    char gender;
    String color;
    String breed;

    public void setCatInfo(String name, int age, char gender, String color, String breed){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.color = color;
        this.breed = breed;
    }
    public void eat(String food){
        System.out.println(name+" is eating "+food);
    }
    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }
    public String toString(){//will be executed automatically when the
        // object is passed in the print statement
        return "\nName: "+name+"\nAge: "+age+"\nGender: "+gender
                +"\nColor: "+color+"\nBreed: "+breed;
    }

}
