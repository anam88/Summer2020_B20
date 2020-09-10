package day53_finalKeyword.PhoneWarmupTask;
/*
3. creata a subclass of Phone called Samsung
initialize all the variables using constructor & static block
if price is higher than $1000, throw a runtime exception with a message of
"Samsung phone' price cannot be higher than $1000"
methods: call, text, toString, freeze

 */
public class SamSung extends Phone{
    static {
        brand = "Samsung";
        operatingSystem = "Android";
        madeIn = "South Korea";
    }
    public SamSung(String model, double price, double screenSize, boolean isTouchScreen){
        super(model, price, screenSize,isTouchScreen);
        if(price > 1000) throw new RuntimeException("Samsung phone' price cannot be higher than $1000");
    }

    public void call() {
        super.call();
    }
    public void text() {
        super.text();
    }
    public void freeze(){
        System.out.println(brand+" freeze all the time!");
    }

    public String toString() {
        return "\nSamsung Information: "+"Brand: "+brand+"\nOperating System: "+operatingSystem+
                "\nModel: "+model+"\nScreen Size: "+screenSize+ "inches"+
                "\nPrice: $"+price+"\nisTouchScreen=" + isTouchScreen+
                "\nMade In: "+madeIn;
    }
}
