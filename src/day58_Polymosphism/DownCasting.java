package day58_Polymosphism;


import day57_Polymorphism.PhoneTask.Iphone;
import day57_Polymorphism.PhoneTask.Phone;
import day57_Polymorphism.PhoneTask.Samsung;

public class DownCasting {
    public static void main(String[] args) {
        Phone phone1 = new Iphone("11",1000,"6");
        Iphone iphone = (Iphone) phone1;
        System.out.println(phone1);
        System.out.println(iphone);

        //phone1.faceTiming(123546);
        iphone.faceTiming(12345678L);
        //second way
        ((Iphone) phone1).faceTiming(4565656565L);
        System.out.println("****************************************");

        Phone phone2 = new Samsung("12",500,"6.5");
        Samsung samsung = (Samsung) phone2;
        System.out.println(phone2);
        System.out.println(samsung);

        samsung.freezing();
        ((Samsung) phone2).freezing();
    }
}
