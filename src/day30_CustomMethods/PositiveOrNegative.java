package day30_CustomMethods;

public class PositiveOrNegative {

/*
4.
step1: create a function that can check if the given integer is positive, negative or zero
step2: Use the above method to  write a program that can check every single
elements of an array of Integers
MUST use for each loop

*/
   public static void main(String[] args) {
       //step 1
    PosNegZero(-20);
       System.out.println("===================");
       //step 2
       int arr[] = {100, -100, -200, 0};
       for(int each : arr){
           PosNegZero(each);

       }
   }

    public static void PosNegZero(int num){

        if(num > 0){
            System.out.println(num+" is positive");
        }else if(num < 0){
            System.out.println(num+" is negative");
        }else{
            System.out.println(num+" is zero");
        }
    }
}
