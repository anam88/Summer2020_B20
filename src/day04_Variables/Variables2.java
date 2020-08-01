package day04_Variables;

public class Variables2 {

    public static void main(String[] args) {

        char ch1 = 'A'; //assigning the char variable
        char ch2 = 65; //output will be A because 65 is assigning number for character A
//        char ch2 = '5'; // this is also a character
        char ch3 = 35000;

        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);

        //*************************//

        char c1 = 'A';
        char c2 = 'B';
        int result = c1 + c2; //output 131
        double c3 = c1 + c2; //output 131.0

        System.out.println(result);
        System.out.println(c3);

        //*******************//
        //we can assign char value to to int data type//
        int num1 = 'C';
        System.out.println(num1); //output 67 as a integer
//***********************************//
        char c5 = 'Z';
        System.out.println(c5); //output Z as a char
        //lets use the above example but output should be in int
        int num2 = 'Z';
        System.out.println(num2); //output is 90
        ///**********************//
        char c6 = 897;
        System.out.println(c6);

        //****************//
        char c7 = '1'; //49
        System.out.println(c7);
        System.out.println(c7 + 1); //'1' = 49 + 1 = 50 output

        //********************//
        char a = 77; //output M
        System.out.println(a);

        //***********************************//
        char c = 'B'+32; // value of B as per ascii table is 66 + 32 = 98 / output will not be 98, it will be 'b'
        // because character b has a value of 98.
        System.out.println(c);

        //*********************//

        char x = 40;
        System.out.println(x); //output will be (

        //***********************************************//
        char a1 = 'A'; //the datatype is char therefore, output will be char
        System.out.println(a1);
        int num3 = 'A' + 2;
        System.out.println(num3); //the datatype is int therefore, output will be int

    }




}
