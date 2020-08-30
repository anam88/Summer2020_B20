package day47_Encapsulation;

public class AccessModifiers {

    //public
   public static int publicVariable = 100; //static variable - we can apply access modifier to the variable also

    public static void publicMethod(){ //public method
        System.out.println("public method");
    }
    //default
    static int defaultVariable = 200; //default access modifier (if no modifier given)
    static void defaultMethod(){
        System.out.println("default method");
    }
    //private ONLY accessible WITHIN the same class
    private static int privateVariable = 300;
    private static void privateMethod(){
        System.out.println("private method");
    }

    public static void main(String[] args) {
        //all the variable and method are static therefore we were able to call them in the main method
        System.out.println("public variable: "+publicVariable);
        publicMethod();
        System.out.println("default variable: "+defaultVariable);
        defaultMethod();
        System.out.println("private variable: "+privateVariable);
        privateMethod();
    }


}
