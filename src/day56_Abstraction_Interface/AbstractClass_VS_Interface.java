package day56_Abstraction_Interface;

public abstract class AbstractClass_VS_Interface {

    int a; //instance variable
    protected static int b; //static variable

    public void method1() {
    }//regular method

    public static void method2() {
    }//static method

    public abstract void method3(); //abstract method

    public AbstractClass_VS_Interface(int a) {//constructor
        this.a = a;
    }

    static {
        b = 30;
    } //static block

    {}//instance block

    }
    interface A{
        int a = 10; //public static final

        public static void method1(){} //static method}
        public default void method2(){} //default method
        void method3();//abstract method


        }



