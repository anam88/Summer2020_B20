package day48_Inheritance.AnimalTask;

public class Animal {
        public String animalType;
        public String animalName;
        public String animalSize;
        public int animalAge;
        public char animalGender;

    public void setAnimalInfo(String animalType,String animalName,
                              String animalSize, int animalAge, char animalGender) {
        this.animalType = animalType;
        this.animalName = animalName;
        this.animalSize = animalSize;
        this.animalAge = animalAge;
        this.animalGender = animalGender;
    }

        public void eat(){//action
            System.out.println(animalName+" is eating");
        }
        public void sleep(){//action
            System.out.println(animalName+" is sleeping");
        }
        public String toString(){
        return "\n***Welcome to Animal Store***"+"\nAnimal Type: "+animalType+
                "\nName: "+animalName+"\nSize: "+animalSize+
                "\nAge: "+animalAge+"\nGender: "+animalGender;
        }

}
