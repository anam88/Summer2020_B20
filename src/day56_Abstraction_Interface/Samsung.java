package day56_Abstraction_Interface;

public class Samsung extends Phone {

    public static String brand = "Samsung";
    Samsung(String brand, String model, double price, double screenSize) {
        super("Samsung",model, price, screenSize);
        if (price <= 0 || price > 1200) {
            throw new RuntimeException("Invalid Price: $"+ price);
        }
    }

    @Override
    void calling() {
        System.out.println("I use Samsung to call my family");
    }

    @Override
    void texting(long num1, long num2) {
        System.out.println("Group text to: "+ num1 +" & "+num2);
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price= $" + price +
                ", screenSize=" + screenSize +
                '}';
    }
}
