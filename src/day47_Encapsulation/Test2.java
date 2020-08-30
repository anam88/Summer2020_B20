package day47_Encapsulation;

public class Test2 {
    static  int a = 200;
    static {
        a = 300;
    }
    public Test2(){
        a = 400;
    }

    public static void main(String[] args) {
        //new Test2();
        a = 50;
        System.out.println(a);
    }
}
