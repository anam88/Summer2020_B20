package day09_IfStatement;

public class MedianNumber {
    /* write a java program that accepts three numbers and return the median number
            (assume that none of them are equal)

     */
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 30;
        int num3 = 14;

        int medianNum = 0;

        //Checking for num1 is middle number or not
        if( num2>num1 && num1>num3 || num3 > num1 && num1 > num2 )
        {
//            System.out.println(num1+" is the middle number");
            medianNum = num1;
        }

        //Checking for num2 is middle number or not
        if( num1>num2 && num2>num3 || num3>num2 && num2>num1 )
        {
//            System.out.println(num2+" is the middle number");
            medianNum = num2;
        }

        //Checking for num3 is middle number or not
        if( num1>num3 && num3>num2 || num2>num3 && num3>num1 )
        {
//            System.out.println(num3+" is the middle number");
            medianNum = num3;
        }
        System.out.println(medianNum+" is a median number.");
    }

}
