package day44_Constructor;

public class DogObject {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bullet","German Shepherd","Large",5,
                "Black");
        Dog dog2 = new Dog("Snowy","Siberian Husky","Medium",7,
                "White");
        Dog dog3 = new Dog("Roofus","Argentinian Dogo","Large",1,
                "Mix");
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
    }
}
