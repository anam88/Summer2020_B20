package day44_Constructor;

public class CarObject {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota","Corolla",2018,19000.50,
                "Black",19000.50);
        Car car2 = new Car("Honda","Civic",2017,45000.50,
                "Silver",52000.45);
        Car car3 = new Car("Lexus","Hybrid",2020,200,
                "Red",72000.45);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}
