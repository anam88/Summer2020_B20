package day03_sequences_Variables;

public class Variables_Practice {

    public static void main(String[] args) {
        //sum

        int num1 = 300;
        int num2 = 200000;
        int sum = num1+num2;

        System.out.println("The sum is " + sum);
//***********************************************************//
        long x = 100;
        float y = x;
        double z = x;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        float b = 100; /*do not need f in the end because the value is in integer.
        the output for this one will be 100.0 because the data-type is float(decimal numbers)*/
        float c = 100.02f; //need f in the end because compiler need to know that datatype is float
        System.out.println(b);
        System.out.println(c);
        //*******************************************************************//


    }



}
