package day56_Abstraction_Interface;
/*
  1. create an abstract class called Phone
            attributes: brand, model, price, size
            abstract methods: calling(), texting();
            instance method: toString()
            add a constructor that can initialize all the instances
 */
abstract class Phone {
    public String brand;
    public String model;
    public double price;
    public double screenSize;

   abstract void calling();
   abstract void texting(long num1, long num2);
    Phone(String brand,String model, double price, double screenSize){
        this.brand = brand;
        this.model =model;
        this.price = price;
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "Brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price= $" + price +
                ", screenSize=" + screenSize +
                '}';
    }
}
