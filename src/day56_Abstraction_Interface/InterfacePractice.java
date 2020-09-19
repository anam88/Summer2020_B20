package day56_Abstraction_Interface;

public interface InterfacePractice {
    int a = 200; //public static final variable by default
    public static void method1(){ //static method ONLY accepts static
        System.out.println(a);
    } //static method
    public default void method2(){
        //default method - default keyword is a must
    } //default method
    public abstract void iAmAbstractMethod(); //abstract method
    void method4(); //also an abstract method by default

    //public void method3(){ //cannot have instance method}

  /*  public InterfacePractice(){
        //cannot have a constructor
    }

   */
}
