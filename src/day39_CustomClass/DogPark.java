package day39_CustomClass;

public class DogPark {
    public static void main(String[] args) {
        //dogPark
//Array variable=Dog[] array that can hold multiple objects in it, just like array
        Dog[] dogPark = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};

        //setting the dog info
        dogPark[0].setDogInfo("Karaoglan","German Shepperd","Medium",
                6,"Black");
        dogPark[1].setDogInfo("Akbas", "Anatolian Sheppard", "Large",
                2, "White");
        dogPark[2].setDogInfo("Red", "Golden", "Medium",  4,
                "Yellow");
        dogPark[3].setDogInfo("Roko", "German Sheperd", "Medium", 3,
                "Brown");
        dogPark[4].setDogInfo("Champ","Retriver", "small", 5,
                "Black");

        for(int i = 0; i <= dogPark.length-1; i++){
            dogPark[i].getDogInfo();
            //i represent each object in the array, than we call the instance method
        }
        System.out.println("==========================");

        for(Dog eachDog : dogPark){
            eachDog.getDogInfo();
        }
        System.out.println("==========================");
        String food = "treats";

        for(Dog eachDog : dogPark){
            eachDog.eat(food);
        }

        System.out.println("==========================");
        String drink = "milk";
        for(Dog eachDog : dogPark){
            eachDog.drink(drink);
        }
        System.out.println("==========================");
        String play = "with ball";
        for(Dog eachDog : dogPark){
            eachDog.play(play);
        }


    }
}
