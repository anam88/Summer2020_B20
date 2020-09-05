package day51_Exceptions;

class Test{
    int a; //200
    public void method(){
        System.out.println("Hello");
    }
    public void m(){
        this.method();
      //  super.method(); cannot use super keyword in the superClass
    }
}

public class SuperKeyword extends Test{
    //a = 300
    public void print1(){
      //  System.out.println(this.a);
        System.out.println(a); //  a ==> 300 calling the local instance
    }
    public void print2(){
        System.out.println(super.a); //calling the instance from superClass and prints a = 200

    }
    public void method2(){
        super.method(); //Hello
        System.out.println("Hola");
    }
    public void method3(){
        this.method2();
        super.method();
    }

    public static void main(String[] args) {
         Test testObj1 = new Test();
        testObj1.a = 200; //superClass

        SuperKeyword testObj2 = new SuperKeyword();
        testObj2.a = 300; //subClass

        testObj2.print1(); //300
        testObj2.print2();

        testObj2.method2(); //Hello | Hola
        System.out.println("*************************");
        testObj2.method3(); //Hello | Hola | Hello



    }
}
