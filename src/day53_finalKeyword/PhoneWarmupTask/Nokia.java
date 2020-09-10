package day53_finalKeyword.PhoneWarmupTask;
/*
4. creata a subclass of Phone called Nokia
initialize all the variables using constructor & static block
if price is higher that $50, throw a runtime exception with a message of
"Nokia Phone' price cannot be higher than $50"
methods: call, text, toString, breakTheFloor
*/
public class Nokia extends Phone{
    static {
        brand = "Nokia";
        operatingSystem = "Symbian";
        madeIn = "Finland";
    }
    public Nokia(String model, double price, double screenSize, boolean isTouchScreen){
        super(model, price, screenSize,isTouchScreen);
        if(price > 50)throw new RuntimeException("Nokia Phone' price cannot be higher than $50");
    }
    public void call() {
        super.call();
    }

    public void text() {
        super.text();
    }
    public void breakTheFloor(){
        System.out.println(brand+" can break the floor.");
    }


    public String toString() {
        return "\nNokia Information: "+"Brand: "+brand+"\nOperating System: "+operatingSystem+
                "\nModel: "+model+"\nScreen Size: "+screenSize+ "inches"+
                "\nPrice: $"+price+"\nisTouchScreen=" + isTouchScreen+
                "\nMade In: "+madeIn;
    }
}
