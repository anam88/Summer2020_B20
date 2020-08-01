package day04_Variables;

public class Variables_Practice2 {

    public static void main(String[] args) {

        int iNum = 50; //iNum can be reassign to the data type larger than int (long, float, double) but not to
        //short or byte.
        long lNum = iNum; //output will be 50

        // int iNum2 = lNum;

        float fNum = lNum; //output will be 50.0

        System.out.println(lNum);
        System.out.println(fNum);
        //****************************************//
        /*the output of the num2 will be 2000, because it is about order of code execution. Java execute from
        top to bottom */
        int num2;
        num2 = 1000;
        num2 = 2000;
        System.out.println(num2);




    }


}
