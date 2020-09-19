package day56_Abstraction_Interface;

public class PhoneObject {
    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("Iphone","iPhone 7",449, 4.7);
        System.out.println(iphone1);
        iphone1.texting(7731112222L,7732221111L);
        iphone1.faceTime(7734445555L);


        System.out.println("**********************************************");
        Samsung samsung1 = new Samsung("Samsung","Galaxy Note 20",1500,6.7);
        System.out.println(samsung1);
        samsung1.calling();
    }
}
