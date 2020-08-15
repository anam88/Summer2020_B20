package day41_toString;

public class PrintingCustomClassObjects {
    public static void main(String[] args) {
        String str = new String("Cybertek");
        System.out.println(str.toString());//different object
        System.out.println(new String("School").toString()); //different object
        System.out.println("=====================================");
        Carpet c1 = new Carpet();
        c1.customOrder(5,6,19, true);
        System.out.println(c1.toString());

    }
}
