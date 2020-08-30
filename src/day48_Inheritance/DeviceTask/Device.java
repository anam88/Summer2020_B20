package day48_Inheritance.DeviceTask;

public class Device {
/*
1. create a class called Device
attributes: brand, model, price, MadeIn, hasBattery, hasMemory
methods: setInfo, toString
 */
    public String deviceBrand;
    public String deviceModel;
    public double deviceScreenSize;
    public double devicePrice;
    public boolean deviceHasBattery;
    public boolean deviceHasMemory;

    public static String deviceMadeIn;
    public static boolean isElectronic;

    static {
        deviceMadeIn = "China";
        isElectronic = true;
    }

    public void setDeviceInfo(String deviceBrand, String deviceModel, double deviceScreenSize,
                  double devicePrice, boolean deviceHasBattery, boolean deviceHasMemory) {
        this.deviceBrand = deviceBrand;
        this.deviceModel = deviceModel;
        this.deviceScreenSize = deviceScreenSize;
        this.devicePrice = devicePrice;
        this.deviceHasBattery = deviceHasBattery;
        this.deviceHasMemory = deviceHasMemory;
    }
    public String toString(){
        return "\nBrand: "+deviceBrand+"\nModel: "+deviceModel+"\nScreen Size: "+deviceScreenSize+" inches"+
                "\nPrice: $"+devicePrice+"\nMade in: "+deviceMadeIn+
                "\nDoes device have battery? "+deviceHasBattery+
                "\nDoes device have memory? "+deviceHasMemory;

    }
}
