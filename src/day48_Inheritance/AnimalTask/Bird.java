package day48_Inheritance.AnimalTask;

//methods: eat, sleep inherits from Animal class
//fields: name, age, size, gender inherits from Animal class
public class Bird extends Animal{
    //Bird Constructor
    public Bird(String animalType,String animalName, String animalSize, int animalAge, char animalGender){
        setAnimalInfo(animalType,animalName,animalSize,animalAge,animalGender);
    }
    //childClass method
    public void singing(){
        System.out.println(animalName+" is singing");
    }
}
