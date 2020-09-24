package day57_Polymorphism.PhoneTask;
/*
5. create a class named iPhone that can inherit from AppleApp and Phone
actions: texting(), calling(), faceTiming()
if the price of Iphoen is more than 1500, the system should throw an exception with a message of:
    Invalid Price, Iphone' price cannot more than 1500
 */
public class Iphone extends Phone implements AppleApp, Downloadable{

    public Iphone( String model, double price, String size){
        super("Iphone", model, price, size);
        if (price > 1500) {
            throw new RuntimeException("Invalid Price, Iphone' price cannot more than $1500!");
        }
    }

    @Override
    public void downloadable() {
        System.out.println("downloading games from");
    }

    @Override
    void texting(long phoneNumber1, long phoneNumber2) {
        System.out.println("Texting to my friends "+phoneNumber1+" & "+phoneNumber2);
    }

    @Override
    void calling(long phoneNumber) {
        System.out.println("Calling husband: "+phoneNumber);
    }

    public void faceTiming(long phoneNumber){
        System.out.println("Face-timing with sister "+phoneNumber);

    }

    @Override
    public String toString() {
        return "Iphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price= $" + price +
                ", size='" + size + '\'' +
                '}';
    }
}
