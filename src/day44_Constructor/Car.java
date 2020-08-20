package day44_Constructor;

public class Car {
    String brand;
    String model;
    int year;
    double mileage;
    String color;
    double price;

    public Car(String brand,String model, int year, double mileage, String color, double price){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.color = color;
        this.price = price;
    }
    public String toString(){
        return "Brand: "+brand+"\nModel: "+model+"\nYear: "+year+"\nMileage: "+mileage+
                "\nColor: "+color+"\nPrice: $"+price;
    }
}
