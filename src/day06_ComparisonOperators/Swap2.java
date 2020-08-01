package day06_ComparisonOperators;

public class Swap2 {

    /*  task03:
            create a class called Swap, and write a program that can swap
            two variables' values without using temporary variable
                    Ex:
                        int a =10;
                        int b= 15;
                    output:
                        System.out.println(a); ===> 15
                        System.out.println(b); ===> 10

*/
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        //without using temporary variable
        //add a + b = 25
        //a = a + b //final value of a is 25
        //b = a(25) - b(15) = 10 //b final value is 10
        //a = a(25) - b(10) = 15 // a final value is 15

          a = a + b; //a = 25, b = 15
          b = a - b; // b = 10, a = 25
          a = a - b; // a = 15, b = 10

        System.out.println("Value of a is: "+a);
        System.out.println("Value of b is: "+b);

    }
}
