package day46_ConstructorCalls;

public class ConstructorCall {

    public ConstructorCall(){//constructor
        method1();
        method2();
        method3();

    }

    public static void method1(){
        method2();//static method ONLY

    }
    public static void method2(){//static method
        method1();
    }
    public void method3(){
        //instance method
    }

}
