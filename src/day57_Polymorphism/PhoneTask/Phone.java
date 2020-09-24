package day57_Polymorphism.PhoneTask;
/*
 4. create an abstract class named Phone
instance variables: brand, model, price, size
abstract methods: texting(), calling()
add constructor that can initialize the fields
if the price is set to negative, the system should throw an exception with a message of:
Invalid Price, cannot be negative
 */
public abstract class Phone {
    public String brand;
    public String model;
    public double price;
    public String size;


    abstract void texting(long phoneNumber1, long phoneNumber2);
    abstract void calling(long phoneNumber);

    public Phone(String brand, String model, double price, String size){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.size = size;
        if (price <= 0 ) {
            throw new RuntimeException("Invalid Price, cannot be negative: $" + price);
        }

    }

}
