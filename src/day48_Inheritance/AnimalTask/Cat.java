package day48_Inheritance.AnimalTask;
//methods: eat, sleep inherits from Animal class
//fields: name, age, size, gender inherits from Animal class
public class Cat extends Animal{
    //Cat Constructor
    public Cat(String animalType, String animalName, String animalSize, int animalAge, char animalGender){
        setAnimalInfo(animalType,animalName,animalSize,animalAge,animalGender);
    }
    public void meow(){
        System.out.println(animalName+" is meowing");
    }

}
