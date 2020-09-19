package day56_Abstraction_Interface;

public class Iphone extends Phone{


    Iphone(String brand, String model, double price, double screenSize){
        super("Iphone",model, price, screenSize);
        if(price <= 0 || price > 2000){
            throw new RuntimeException("Invalid Price: $"+ price);
        }
    }

    @Override
    void calling() {
        System.out.println("Use your Iphone to call me");
    }

    @Override
    void texting(long num1, long num2) {
        System.out.println("Group text to: "+ num1 +" & "+num2);
    }

    public void faceTime(long num1){
        System.out.println("Face timing with my buddy: "+ num1);
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price= $" + price +
                ", screenSize=" + screenSize +
                '}';
    }
}
