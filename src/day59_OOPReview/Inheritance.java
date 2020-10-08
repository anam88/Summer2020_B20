package day59_OOPReview;

class A{
    private  int a = 200;
    int b = 200;
    protected int c = 300;
    public int d = 400;

    private void method(){}
    void method2(){}
    protected void method3(){System.out.println("Hello World");}
    public void method4(){ }
}
public class Inheritance extends A{

    public void method3(){//override method3
        System.out.println("Hello Universe");
    }

    public static void main(String[] args) {

        Inheritance obj = new Inheritance();
      //  obj.a private var - not accessible outside the class
        System.out.println(obj.b); //default accessible if ONLY in same package
        System.out.println(obj.c);//protected accessible if ONLY inheritance take place
        System.out.println(obj.d); // public accessible anywhere

      //  obj.method();private method - not accessible outside the class
        obj.method2(); //default accessible if ONLY in same package
        obj.method3(); //protected accessible if ONLY inheritance take place
        obj.method4(); // public accessible anywhere
    }


}
