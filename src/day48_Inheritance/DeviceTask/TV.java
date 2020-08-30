package day48_Inheritance.DeviceTask;
/*
2. create a sub class of Device called TV:
attributes: brand, model, price, MadeIn, hasBattery, hasMemory
methods: watch, setInfo, toString
add a constructor that can set the fileds

 */
public class TV extends Device{

    public boolean deviceHasRemoteControl = true;
    public TV(String deviceBrand, String deviceModel,double deviceScreenSize,
              double devicePrice,boolean deviceHasBattery,
              boolean deviceHasMemory,boolean deviceHasRemoteControl){
        setDeviceInfo(deviceBrand,deviceModel,deviceScreenSize,devicePrice,deviceHasBattery,
                deviceHasMemory);
        this.deviceHasRemoteControl = deviceHasRemoteControl;
    }

    public void watch(){
        System.out.println("I am watching movies on my "+deviceBrand+" "+deviceModel);
    }
    public String toString(){
       return  "\nBrand: "+deviceBrand+"\nModel: "+deviceModel+"\nScreen Size: "+deviceScreenSize+" inches"+
        "\nPrice: $"+devicePrice+"\nMade in: "+deviceMadeIn+
                "\nDoes device have battery? "+deviceHasBattery+
                "\nDoes device have memory? "+deviceHasMemory+
               "\nDoes device have remote control? "+deviceHasRemoteControl;
    }

}
