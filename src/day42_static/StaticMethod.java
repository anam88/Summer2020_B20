package day42_static;

public class StaticMethod {
    int a = 200;
    static int b = 400;
    public static void main(String[] args) {
        System.out.println(b);
        //System.out.println(a); need to create an object in order to use instance variable

        StaticMethod obj = new StaticMethod();
        System.out.println(obj.a);

        staticMethod();
       // instanceMethod(); error static ONLY accepts it's own kind, the only way you can call it
        //is by creating it's object
    }

    public static void staticMethod(){

    }
    public void instanceMethod(){

    }
}
