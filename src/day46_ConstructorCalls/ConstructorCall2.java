package day46_ConstructorCalls;

import day45_Constructor.Constructor;

public class ConstructorCall2 {
    public ConstructorCall2(){//default constructor
        System.out.println("A");


    }
    public ConstructorCall2(int a){//constructor with one parameter
        //(ConstructorCall2);
        this();//default constructor so A will be printed
        System.out.println("B");

    }
    public ConstructorCall2(String str){//constructor with two parameter
        this(4);// A B
        System.out.println("C");

    }
    public ConstructorCall2(char a){
        this();//A
        System.out.println("D");

    }
    public ConstructorCall2(double a){
        this("apple");//calling constructor MUST be a at the FIRST STEP
        System.out.println("E");//if i do line 29 first and than line 28 i will get error
    }

    public static void main(String[] args) {
        ConstructorCall2 objA = new ConstructorCall2();//A
        ConstructorCall2 objB = new ConstructorCall2(4); //A (this) | B
        ConstructorCall2 objC = new ConstructorCall2("apple");//A, B | C
        ConstructorCall2 objD = new ConstructorCall2('D');

    }
}
