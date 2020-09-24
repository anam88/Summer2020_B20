package day57_Polymorphism.PhoneTask;

public class PhoneObject {
    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("iPhone 7",449, "4.7");
        System.out.println(iphone1);
        iphone1.calling(7731231233L);
        iphone1.faceTiming(8471231478L);
        System.out.println("************************");
        Samsung samsung1 = new Samsung("Galaxy Note 20",1100,"6.7");
        System.out.println(samsung1);
        samsung1.texting(7731479865L,7732589634L);
        samsung1.downloadable();
        samsung1.freezing();
        System.out.println("*****************************");
        Huawei huawei1 = new Huawei("Robbery",300,"5.3");
        System.out.println(huawei1);

        System.out.println("***********************");
        //polymorphism
        Phone phone1 = new Iphone("11",1200,"6");
        Phone phone2 = new Samsung("S8",900,"6.5");





    }
}
