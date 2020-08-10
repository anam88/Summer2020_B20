package day39_CustomClass;

public class Dog {

    //give instance variable
    String name;
    String breed;
    String size;
    int age;
    String color;

    //create instance method
    public void setDogInfo(String dogName, String dogBreed, String dogSize, int dogAge, String dogColor){
        name = dogName;
        breed = dogBreed;
        size = dogSize;
        age = dogAge;
        color = dogColor;
        //this method sets the dog info
    }

    //another instance method
    public void getDogInfo(){
        System.out.println("Name: "+name+" "+"Breed: "+breed+" "+"Size: "+size+" "+"Age: "+age+" "+
                "Color: "+color);
        //this method prints the dog infor that we set in the above method
    }

    //another instance method (action) eat
    public void eat(String food){
        System.out.println(name+" is eating "+food);
    }

    //another instance method (action)
    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }

    //another instance method
    public void play(String play){
        System.out.println(name+" is playing "+play);
    }
}
