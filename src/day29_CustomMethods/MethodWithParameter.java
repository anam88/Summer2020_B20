package day29_CustomMethods;

public class MethodWithParameter {

    public static void main(String[] args) {
        printHello(5);
        myName("anam");
    }

    public static void printHello(int n){
        for(int i = 0; i < n; i++){
            System.out.println("Hello");
        }
    }

    public static void myName(String n){
        System.out.println(n);
    }

}
