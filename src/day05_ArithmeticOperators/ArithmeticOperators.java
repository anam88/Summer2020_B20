package day05_ArithmeticOperators;

public class ArithmeticOperators {


    public static void main(String[] args) {
        System.out.println(20 + 3 - 2 + 1);
        System.out.println(20 * 3);
        System.out.println(2 + 3 - 1 * 4);
        //1 * 4 = 4
        //2 + 3 = 5
        //5 - 4 = 1 output

        System.out.println(10 / 3); //output: 3 //int / int = int
        System.out.println(10 / 3.3); //output: 3.03 //int / double = double
        System.out.println(20.5 / 4); //output: 5.125 //double / int = double
        System.out.println(10.0 / 3.33); //output: 3.00 //double / double = double
        System.out.println(10 % 4); // 10 / 4 = 2 | 10 - (4 *2) = 2 |
        System.out.println(30 % 8); //6
            // remainder = numerator - (denominator * whole number of result)
            //      0     =   30 - (8 * 3) //whole # result 30 / 8 = 3
        System.out.println(99 % 4); // 3
        // 99/4 = 24
        // remainder = numerator - (denominator * whole number of result)
        //    3       =   99 - (4 * 24)

        int y = 5 * 2 / 3 + (4 * 3);
        // ( 4 * 3 ) = 12
        // 5 * 2 = 10
        //10 / 3 + 12
        // 10 / 3 = 3 + 12 = 15
        //output 15
        System.out.println(y);
        //***********//

        double t = 10/3.0;
        System.out.println(t); //3.3333

        double x = 10/3;
        System.out.println(x); // 3.0







    }



}
