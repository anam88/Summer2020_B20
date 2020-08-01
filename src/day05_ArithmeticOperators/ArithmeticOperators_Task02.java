package day05_ArithmeticOperators;
//slide 12 day05
public class ArithmeticOperators_Task02 {
    public static void main(String[] args) {
        //(5 + 2) * 4
        int num1 = (5 + 2); //first this process = 7
        int num2 = 4;
        int task0 = (num1) * num2;
        System.out.println("Task0 = " +task0);
        //**********************//
        // 10 / (5 - 3)
        int num3 = 10;
        int num4 = (5-3); //first this took place = 2
        int task1 = num3 / num4;
        System.out.println("Task1 = "+task1);
        //**********************//
        // 8 + 12 * (6 -2 )
        int num5 = 8; //last this
        int num6 = 12; // second this 12*4
        int num7 = (6-2); //first this process = 4
        int task2 = num5 + num6 * (num7);
        System.out.println("Task 2 = "+task2);
        //**********************//
        //(4 + 17) % 2 - 1
        int num8 = (4 + 17); //first this = 21
        int num9 = 2; //second this 21 % 2 = 1
        int num0 = 1; // 1-1 = 0
        int task3 = (num8) % num9 - num0;
        System.out.println("Task3 = "+task3);
        //**************************//
        //(6 - 3) * (2 + 7)/ 3
        int numA = (6 - 3); //last this 3 * 3 = 9
        int numB = (2 + 7); //first this 9
        int numC = 3; //second this 9/3 = 3
        int task4 = (numA) * (numB) / numC;
        System.out.println("Task4 = "+task4);



    }


}
