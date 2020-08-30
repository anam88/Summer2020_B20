package day48_Inheritance.DeviceTask;

public class Laptop extends Device{
    /*
create a sub class of Device called Laptop:
    attributes: brand, model, price, MadeIn, hasBattery, hasMemory, screenSize, hasCPU,
    hasMouse, hasKeyBoard, OS
    methods: coding, watching, setInfo, toString
    add a constructor that can set the fields
     */
    public String deviceOS;
    public static boolean deviceHasCPU = true;
    public static boolean deviceHasMouse = true;
    public static boolean deviceHasKeyBoard = true;

    public Laptop(String deviceBrand, String deviceModel, double deviceScreenSize,
                  double devicePrice, boolean deviceHasBattery, boolean deviceHasMemory,
                  String deviceOS, boolean deviceHasCPU,
                  boolean deviceHasMouse,boolean deviceHasKeyBoard){
        setDeviceInfo(deviceBrand,deviceModel,deviceScreenSize,devicePrice,deviceHasBattery,
                deviceHasMemory);
        this.deviceOS = deviceOS;
    }
    public void coding(){
        System.out.println(deviceBrand+" "+deviceModel+" is use to do computer programming");
    }
    public void watching(){
        System.out.println("Watching Netflix on: "+deviceBrand+" "+deviceModel);
    }
    public String toString(){
        return "\nBrand: "+deviceBrand+"\nModel: "+deviceModel+
                "\nScreen Size: "+deviceScreenSize+" inches"+
                "\nPrice: $"+devicePrice+"\nMade in: "+deviceMadeIn+
                "\nDoes device have battery? "+deviceHasBattery+
                "\nDoes device have memory? "+deviceHasMemory+
                "\nDevice Operating System? "+deviceOS+
                "\nDoes device have CPU?"+deviceHasCPU+
                "\nDoes device comes with mouse?"+deviceHasMouse+
                "\nDoes device have keyboard? "+deviceHasKeyBoard;
    }
}
