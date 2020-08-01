package day33_LocalDateTime;

public class Calculate {
    /*
    Task01:
        1. create a method that can calculate the addition of two integers
        2. create a method that can calculate the addition of two decimals
        3. create a method that can calculate the multiplication of two integers
        4. create a method that can calculate the multiplication of two decimals
     */
    public static void main(String[] args) {
//if one value is int and one is double, in order to get output in int, we can use casting
        int n1 = 10;
        double n2 = 5;
        System.out.println(addition(n1, n2));
//float value can be assign to double because of casting, that is why second method will run
        float a = 10;
        float b = 2;
        System.out.println(addition(a , b));

        long l1 = 5;
        long l2 = 2;
        System.out.println(multiply(l1, l2));
    }

//=========================================================================================
//int will look for int and double will look for double
    public static int addition(int n1, int n2){
        return n1 + n2;
    }
    public static double addition(double n1, double n2){
        return n1 + n2;
    }
    public static double addition(double n1, int n2){
        return n1 + n2;
    }

    public static int multiply(int n1, int n2){
        return n1 * n2;
    }
    public static double multiply(double n1, double n2){
        return n1 * n2;
    }
    public static double multiply(double n1, int n2){
        return  n1 * n2;
    }


}
