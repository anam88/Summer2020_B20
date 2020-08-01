package day09_IfStatement;

public class MaxNumber {
    /*
    1. write a java program that accepts three numbers and return the maximum number
                (assume that none of them are equal)
        use && logic
     */
    //My way of doing it //
    public static void main(String[] args) {
//        int num1 = 100;
//        int num2 = 50;
//        int num3 = 250;
//        if (num1 > num2 && num1 > num3) {
//            System.out.println(num1 + " is the maximum number");
//        }
//        if (num2 > num1 && num2 > num3) {
//            System.out.println(num2 + " is the maximum number");
//        }
//        if (num3 > num1 && num3 > num2) {
//            System.out.println(num3 + " is the maximum number");
//        }

        // Muhtar way of solving the problem//
        double a = 500;
        double b = 200;
        double c = 7000;

        boolean aIsMax = a > b && a > c;
        //           500 > 200 && 500 > 7000
        //               True  &&  False //false
        boolean bIsMax = b > a && b > c;
        //             200 > 500 && 200 > 7000
        //                false && false // false
        boolean cIsMax = c > a && c > b;
        //          7000 > 500 && 7000 > 200;
        //             True    && True // True
        double max = 0; //local variable | we want to assign the max. number to variable max
        //that is why this variable was declared

        if (aIsMax){
            //System.out.println(a+" is the max. number");
            max = a; //initializing the variable
        }
        if (bIsMax){
//            System.out.println(b+" is the max. number");
            max = b;
        }
        if (cIsMax){
//            System.out.println(c+" is the max. number");
            max = c;
        }
        System.out.println(max+" is the maximum number.");

    }
}
