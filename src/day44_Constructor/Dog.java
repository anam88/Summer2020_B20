package day44_Constructor;

public class Dog {
    String name;
    String breed;
    String size;
    int age;
    String color;

    //constructor
    public Dog(String name, String breed, String size, int age, String color){
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
    }
    public String toString(){
        return "Name: "+name+"\nBreed: "+breed+"\nSize: "+size+"\nAge: "+age+"\nColor: "+color;
    }
}
