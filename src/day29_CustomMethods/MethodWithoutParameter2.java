package day29_CustomMethods;

public class MethodWithoutParameter2 {
    /*
Access-Modifier Specifiers return-type name(){
            statements
}
     */
/*
step1: print hello 5 times
step2: print your school name
step3: print hello 5 times
step4: print your name
step5: print hello 5 times
 */

    public static void main(String[] args) {
        printHello5x();
        System.out.println("Cybertek");
        printHello5x();
        System.out.println("Anam");
        printHello5x();
    }

    public static void printHello5x(){
        for(int i = 10; i >= 6; i--){
            System.out.println("Hello World");
        }
    }
}
