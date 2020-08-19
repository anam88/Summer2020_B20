package day43_static;

public class StaticBlock2 {
    static int a = 100;
    static String b = "Cybertek";

    static {
        a = 100;
        b = "Cybertek";
    }

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
    }
}
