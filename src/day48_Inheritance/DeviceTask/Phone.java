package day48_Inheritance.DeviceTask;

public class Phone extends Device{
/*
3. create a sub class of device called phone:
attributes: brand, model, price, MadeIn, screenSize, hasBattery, hasMemory, hasSimCard, OS
methods: call, text, setInfo, toString
add a constructor that can set the fields
*/
    public boolean deviceHasSimCard = true;
    public String deviceOS;
    public Phone(String deviceBrand, String deviceModel,double deviceScreenSize,
                 double devicePrice,boolean deviceHasBattery,
                 boolean deviceHasMemory,boolean deviceHasSimCard,String deviceOS){
        setDeviceInfo(deviceBrand,deviceModel,deviceScreenSize,devicePrice,deviceHasBattery,
                deviceHasMemory);
        this.deviceHasSimCard = deviceHasSimCard;
        this.deviceOS = deviceOS;
    }
    public void callText(long phoneNumber){
        System.out.println("Calling or Texting to: "+phoneNumber);
    }
    public String toString(){
        return "\nBrand: "+deviceBrand+"\nModel: "+deviceModel+"\nScreen Size: "
                +deviceScreenSize+" inches"+
        "\nPrice: $"+devicePrice+"\nMade in: "+deviceMadeIn+
                "\nDoes device have battery? "+deviceHasBattery+
                "\nDoes device have memory? "+deviceHasMemory+
                "\nDoes device have sim card? "+deviceHasSimCard+
                "\nDevice iOS? "+deviceOS;
    }




}
