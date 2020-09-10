package day53_finalKeyword.PhoneWarmupTask;
/*
2. creata a subclass of Phone called iPhone
initialize all the variables using constructor & static block
if price is higher than $1500, throw a runtime exception with a
message of "Iphone' price cannot be higher than $1500"
methods: call, text, toString, faceTime
 */
public class Iphone extends Phone{

   static {
       brand = "iPhone";
       operatingSystem = "iOS";
       madeIn = "California, U.S.A";
   }
   public Iphone(String model, double price, double screenSize, boolean isTouchScreen){
       super(model, price, screenSize,isTouchScreen);
       if(price > 1500) throw new RuntimeException("Iphone price cannot be higher than $1500");
   }
    public void call() {
        super.call();
    }

    public void text() {
        super.text();
    }

    public void faceTime(){
        System.out.println(brand+ " can be use to do face time with love ones");
    }


    public String toString() {
        return "\niPhone Information: "+"Brand: "+brand+"\nOperating System: "+operatingSystem+
                "\nModel: "+model+"\nScreen Size: "+screenSize+ "inches"+
                "\nPrice: $"+price+"\nisTouchScreen=" + isTouchScreen+
                "\nMade In: "+madeIn;
    }
}
