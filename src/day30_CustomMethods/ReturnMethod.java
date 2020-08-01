package day30_CustomMethods;

public class ReturnMethod {
    public static void main(String[] args) {
        addition1(3,4);
        //Task 2
       int sum =  addition2(10, 5);
        System.out.println(sum);
    }

    public static void addition1(int a, int b){
 //void: method does not return any value
        int sum = a + b;
        System.out.println(sum);
    }
    //task 2
    public static int addition2(int a, int b){
        int sum = a + b;
        return a+b;
    }
}
