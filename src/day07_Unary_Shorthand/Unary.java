package day07_Unary_Shorthand;

public class Unary {

    public static void main(String[] args) {
        System.out.println(-1 + -10); // -1 - 10 === -11 (- - = +)

        System.out.println(-11 - -10); //-11 + 10 = -1


        // -- decrement

        int a = 20;
        //a - a - 1; //19
        /* --a; // 19 //less line of code . when we apply decrement in-front of value it will
        decrease the value by 1 */
        --a;
        System.out.println(a); //19

        // ++ increment
        int b = 11;
//        b = b + 1; //12
        ++b; // 12
        System.out.println(b);

        //************************//

        int x = 20;//21
        System.out.println(++x); //pre-increment

        int y = 10; //9
        System.out.println(--y);//pre-decrement

    }

}
