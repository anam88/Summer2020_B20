package day46_ConstructorCalls;

public class CarObject {
    public static void main(String[] args) {
        Car car1 = new Car("Lexus");
        Car car2 = new Car("Lexus","RX 350");
        Car car3 = new Car("Lexus","RX 350",2016);
        Car car4 = new Car("Lexus","RC 350",2016,30998);
        Car car5 = new Car("Lexus","RC 350",2016,30998,"Black");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}
