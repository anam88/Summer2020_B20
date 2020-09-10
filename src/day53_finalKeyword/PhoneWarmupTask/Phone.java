package day53_finalKeyword.PhoneWarmupTask;
/*
2. create a sub class of Device called Phone
static variables: brand , OperatingSystem, made in(do not initialize them)
instance variables:  Model, price, screenSize, touchScreen(boolean)
add a constructor that can initialize all instances (this is should be the only constructor)
if price is lower than $0 throw a runtime exception with a message of "Invalid Price"
methods: call, text, toString
*/
public class Phone extends Device{
    static String brand;
    static String operatingSystem;
    static String madeIn;

    public boolean isTouchScreen;
    public Phone(String model, double price, double screenSize, boolean isTouchScreen){
        super(model, price, screenSize);
        this.isTouchScreen = isTouchScreen;
        if (price < 0 ) throw new RuntimeException("Invalid Price");
    }
    public void call(){
        System.out.println(brand+ " is use to call people");
    }
    public void text(){
        System.out.println(brand+ " is use to text friends and family");
    }


    public String toString() {
        return "\nPhone: "+"\nModel: "+model+"\nScreen Size: "+screenSize+ "inches"+
                "\nPrice: $"+price+"\nisTouchScreen=" + isTouchScreen;
    }
}
