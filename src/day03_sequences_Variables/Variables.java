package day03_sequences_Variables;
/* declare variables:
    DataType variableName = Data;
    for numbers - preferred one is int
    for decimal - preferred one is double
 */
public class Variables {

    public static void main(String[]args){

        //length: 11, width: 12

        int length = 11;
        int width = 12;
        System.out.println("Area = " +  length * width);
        //(byte, short, int, long,)whole numbers
        //(float, double) decimal numbers

        long num = 2147483648L;
        long num1 = 456456454545454L; /* the purpose of using L in the end of data,
        is the compiler automatically reads it as an integer, that is why we need to tell the
        compiler it is long datatype by using L in the end*/

        System.out.println("long data type " + num + num1);

        //PI = 3.14
        float PI = 3.14f; /*why are we using f in the end of date value. We are using f in the end because the default
        java type is double. we use f in the end to tell the compiler to treat the value as float. */
        double pie = 3.14;
        System.out.println("The value of PI is " + PI);
        System.out.println("The value of pie is " + PI);

    }

}
// double > float > long > int > short > byte
//double and int are preferred for compiler
//larger primitive CANNOT be assigned to smaller primitive
//smaller primitive CAN be assigned to the larger primitive