package day57_Polymorphism.PhoneTask;
/*

6. create a class named Samsung that can inherit from AndroidApps and Phone
actions: texting(), calling(), freezing()
if the price of Samsung is more than 1200, the system should throw an exception with a message of:
 */
public class Samsung extends Phone implements AndroidApp, Downloadable{

    public Samsung(String model, double price, String size){
        super("Android", model, price, size);
        if(price > 1200){
            throw new RuntimeException("Invalid Price, Samsung' price cannot more than $1200!");
        }
    }

    @Override
    public void downloadable() {
        System.out.println("Downloading facebook app using "+AppStoreName);
    }

    @Override
    void calling(long phoneNumber) {
        System.out.println(model+"is freezing, during call "+phoneNumber);
    }

    @Override
    void texting(long phoneNumber1, long phoneNumber2) {
        System.out.println();
    }
    public void freezing(){
        System.out.println(brand+" is always freezing");
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price= $" + price +
                ", size='" + size + '\'' +
                '}';
    }
}
