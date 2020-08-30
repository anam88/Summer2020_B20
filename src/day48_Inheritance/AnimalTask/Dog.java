package day48_Inheritance.AnimalTask;

//methods: eat, sleep inherits from Animal class
//fields: name, age, size, gender inherits from Animal class
public class Dog extends Animal {

    //Dog Constructor
    public Dog(String animalType,String animalName, String animalSize, int animalAge, char animalGender){
        setAnimalInfo(animalType,animalName, animalSize, animalAge,animalGender);
    }

    public void bark(){//action
        System.out.println(animalName+" is barking!");
    }


}

