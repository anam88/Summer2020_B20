package day08_LogicalOperators;

public class Logical {
    // ! logical NOT operator, will always return opposite boolean value
    public static void main(String[] args) {
        boolean r1 = 9 > 7; //true
        boolean r2 = !r1; //false

        System.out.println(r1+" : "+r2);
        System.out.println("What will be the opposite of false: "+!false);

        boolean r3 = !false == true;
        //!false opposite is true
        //true == true //true
        System.out.println(r3);//output true

        boolean r4 = true == !true;
        //!true  opposite is false
        //true == false //false
        System.out.println(r4);

        System.out.println("**************************************");


    }
}
