package day43_static;

public class StaticBlock {


    static{
        /*static block, whatever code fragment we give in the block,
        is a first thing that get executed
        even before the main method.
        */
        System.out.println("Static Block");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
    }
}
