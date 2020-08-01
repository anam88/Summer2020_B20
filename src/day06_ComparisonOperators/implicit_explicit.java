package day06_ComparisonOperators;

public class implicit_explicit {
//Implicit casting: casting smaller primitive to larger
    public static void main(String[] args) {
        short s1 = 100;
        long l1 = s1;// implicit casting: automatically done

        long l2 = (long)s1; //manually not necessary but implicit happen automatically |
        //long is in gray color because it means it is an extra step

        int i1 = 300;
        double d1 = i1; //automatically implicit casting done //output 300.0
        System.out.println("This is implicit casting: " +d1);

        System.out.println("****************************");

        //Explicit casting: to assign a value of larger data type to a smaller
        // data type we perform explicit type casting |
        // automatic conversion cannot be done. We have to do manually

        double num1 = 40.52;
        int num2 = (int) num1; //manually explicit casting //outcome will be in int
        System.out.println("This is explicit casting: " +num2);

        System.out.println("****************************");

        long L1 = 4400;
        short sh1 = (short)L1; //explicit
        System.out.println("This is explicit casting: " +sh1);

        System.out.println("****************************");

        int n1 = 1000;
        byte b1 = (byte)n1;
        System.out.println("Negative number will print "+b1);

        System.out.println("****************************");

        double m1 = 34.5;
        float f1 = (float)m1; //out 34.5
        float f2 = (long)m1; //output 34.0 //double cast to long which automatically cast to float — decimal number
        float f3 = (int)m1; // 34.0//double cast to int which automatically cast to float — decimal number
        System.out.println("The value will not change "+f1);
        System.out.println("using long data primitive " +f2);
        System.out.println("using int data primitive " +f3);



    }
}
