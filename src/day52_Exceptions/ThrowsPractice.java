package day52_Exceptions;

public class ThrowsPractice {
    public static void m1() throws InterruptedException{
        Thread.sleep(2000);
    }
    public static void m2() throws InterruptedException{
        m1();
    }
    public static void m3(){
        try{
        m2();
        }catch (InterruptedException e){
            System.out.println("Interrupted Exception Handled");
        }
    }
    public static void m4(){
        m3();
    }
}
