package day07_Unary_Shorthand;

public class Positive_Negative_0 {
    //write a program that can verify if a number is positive, negative, 0
    public static void main(String[] args) {
                int num1 = -40;

        boolean positive = num1 > 0;
        boolean negative = num1 <0;
        boolean zero = num1 == 0;

        System.out.println(num1+" Is a positive number? "+positive);
        System.out.println(num1+" Is a negative number? "+negative);
        System.out.println(num1+" Is 0 number? "+zero);

    }

}
