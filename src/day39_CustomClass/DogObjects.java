package day39_CustomClass;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.setDogInfo("Bullet","German Shepherd","Large",5,
                "Black");
        dog2.setDogInfo("Snowy","Siberian Husky","Medium",7,
        "White");
        dog3.setDogInfo("Roofus","Argentinian Dogo","Large",1,
                "Mix");

        dog1.getDogInfo();
        dog2.getDogInfo();
        dog3.getDogInfo();

        dog1.eat("Kelle Paca");

    }
}
