package day06_ComparisonOperators;

public class Swap1 {
    /*  task03:
            create a class called Swap, and write a program that can swap two variables' values without using temporary variable
                    Ex:
                        int a =10;
                        int b= 15;
                    output:
                        System.out.println(a); ===> 15
                        System.out.println(b); ===> 10
                       we will use temporary variable for this example
*/
    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        int c = b; //c = 15 c is a temporary variable

        b = a; //a value assign to b = 10
        a = c; //b value assign to a = 15

//        a = a + b;
//        b = a - b;
//        a = a - b;

        System.out.println(a);
        System.out.println(b);

    }
}
