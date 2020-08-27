package day46_ConstructorCalls;

public class ConstructorCall3 {
    public ConstructorCall3(){
        //default
        System.out.println("X");
    }
    public void method1(){ // non-static method
        //this(); cannot use this inside a method
    }
    public ConstructorCall3(int a){
        System.out.println("Y");
    }
    public ConstructorCall3(double a){
        this();
       // this(3); we can ONLY call one constructor inside the other constructor

    }
}
