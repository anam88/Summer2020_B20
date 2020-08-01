package day05_ArithmeticOperators;

public class ArithmeticOperators_Task01 {
    public static void main(String[] args) {

    //slide 9 from day 05
        // 5 + 2 * 4
        int num1 = 5;
        int num2 = 2;
        int num3 = 4;
        int task1 = num1 + num2 * num3;
        System.out.println("Task1 = " + task1); // 13
        //*************************//
        // 10 / 2 - 3
        // 10 / 2 = 5
        // 5 - 3 = 2
        int num4 = 10;
        int num5 = 2;
        int num6 = 3; //
        int task2 = num4 / num5 - num6;
//
        System.out.println("Task2 = " + task2); // 2
        //***********************//
        //8 + 12 * 2 - 4
        // 12 * 2 = 24 | 8 + 24 = 32 | 32 - 4 = 28
        int num7 = 8;
        int num8 = 12;
        int num9 = 2;
        int num0 = 4;
        int task3 = num7 + num8 * num9 - num0;
        System.out.println("Task3 = " + task3);
        //*******************//
        // 4 + 17 % 2 - 1
        //17 % 2 = 1 -use remainder formula
        //4 + 1 = 5 | 5 - 1 = 4
        int numA = 4;
        int numB = 17;
        int numC = 2;
        int numD = 1;
        int task4 = numA + numB % numC - numD;
        System.out.println("Task4 = " + task4);
        //****************************//
        //6 - 3 * 2 + 7 - 1
        // 3 * 2 = 6
        // 6 + 7 = 13
        // 13 - 6 = 7
        // 7 - 1 = 6
        int numE = 6;
        int numF = 3;
        int numG = 2;
        int numH = 7;
        int numI = 1;
        int task5 = numE - numF * numG + numH - numI;
        System.out.println("Task5 = " + task5);

    }

}
