package day46_ConstructorCalls;

public class Car {
//instance variables: brand, model, year, price, color
    String brand;
    String model;
    int year;
    double price;
    String color;
 //1st constructor: initialize the brand of the car
 public Car(String brand){
     this.brand = brand;
 }
 //2nd constructor: initialize the brand and model of the car |  (MUST apply constructor Call)
    public Car(String brand, String model){
     this(brand);
     this.model = model;
    }
// 3rd constructor: initialize the brand, model, year of the car | (MUST apply constructor Call)
    public Car(String brand, String model, int year){
     this(brand,model);
     this.year = year;
    }
//4th constructor: initialize the brand, model, year, price of the car | (MUST apply constructor Call)
    public Car(String brand, String model, int year, double price){
     this(brand, model, year);
     this.price = price;
    }
//5th Constructor: initialize all instances of the car| (MUST apply constructor Call)
    public Car(String brand, String model, int year, double price, String color){
     this(brand, model, year, price);
     this.color = color;
    }
    public String toString(){
     return "\nBrand: "+brand+"\nModel: "+"\nYear: "+year+"\nPrice: $"+price+"\nColor: "+color;
    }

}
