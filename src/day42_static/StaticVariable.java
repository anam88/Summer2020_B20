package day42_static;

class Test{
    int a; //instance variable
    static int b; //static variable
}

public class StaticVariable {
    public static void main(String[] args) {
        Test obj1 = new Test();
        obj1.a = 5;
        obj1.b = 20; //same value applies to obj2 also | one copy for static variable


        Test obj2 = new Test();
        obj2.a = 10;
       //
        System.out.println(obj1.a);//5
        System.out.println(obj2.a);//10
        System.out.println(obj1.b);
        System.out.println(obj2.b);
    }
}
