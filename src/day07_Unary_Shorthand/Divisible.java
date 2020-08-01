package day07_Unary_Shorthand;

public class Divisible {
    /*2. write a program that can check if a number is evenly divisible by 2, 3, 5
    Ex:
    number = 65;

    output:
            65 is divisible by 2: false
            65 is divisible by 3: false
            65 is divisible by 5: true*/
    public static void main(String[] args) {
        int num = 65;
        boolean divisibleBy2 = (num % 2) == 0;
        boolean divisibleBy3 = (num % 3) == 0;
        boolean divisibleBy5 = (num % 5) == 0;
        System.out.println(num+" is divisible by 2: "+divisibleBy2);
        System.out.println(num+" is divisible by 3: "+divisibleBy3);
        System.out.println(num+" is divisible by 5: "+divisibleBy5);
    }
}
