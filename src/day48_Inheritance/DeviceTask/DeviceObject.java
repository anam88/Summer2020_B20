package day48_Inheritance.DeviceTask;

public class DeviceObject {
    public static void main(String[] args) {
        System.out.println("Welcome to Anam's Electronics Store");
        //TV
        TV TV1 = new TV("Sony Bravia","XBR65A8H",65,2299,
                false,false,true);

        System.out.println(TV1);
        TV1.watch();
        System.out.println("**********************");
        Phone phone1 = new Phone("Apple","iPhone 11 Pro",5.8,
                719,true, true,
                true, "ios 13");
        System.out.println(phone1);
        phone1.callText(7732133345L);
        System.out.println("**********************");
        Laptop laptop1 = new Laptop("Lenovo","Legion 5",15,
                899,true,true,"Intel Core i7",
                true,true,true);
        System.out.println(laptop1);
        laptop1.coding();
        laptop1.watching();



    }

}
