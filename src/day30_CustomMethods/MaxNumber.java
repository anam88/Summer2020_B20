package day30_CustomMethods;

public class MaxNumber {
    /*
    create a function that can print out the max number between two numbers
     */
    public static void main(String[] args) {
        task1(10, 25);
    }
    public static void task1(int n1, int n2){
        //we need to know the two number, define them in parameter
        //declaration of method
        if(n1 == n2){
            System.out.println("Equal");
            return;
        }
        if(n1 >= n2){
            System.out.println(n1+" is a max number.");
        }else{
            System.out.println(n2+" is a max number.");
        }

    }
}
