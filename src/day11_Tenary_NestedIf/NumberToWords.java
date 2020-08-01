package day11_Tenary_NestedIf;

public class NumberToWords {
    /*     1. write a java program that can convert numbers between 0 ~ 9 to words,
     if the number is greater than 9 or less than zero, out put should be "Invalid". */
    public static void main(String[] args) {
        //we will have 11 possible outcome (0 - 9) and less than 0
        int num = 20; //we will use multi branch if statement
        String result = ""; //we need to initialize the local variable before we can use it.

        if(num == 0){
            result = "zero";//only time this code get executed if condition is true
        }else if(num == 1){
            result = "one";
        }else if(num == 2){
            result ="two";
        }else if(num == 3){
            result = "three";
        }else if(num == 4){
            result = "four";
        }else if(num == 5){
            result = "five";
        }else if(num == 6){
            result = "six";
        }else if(num == 7){
            result = "seven";
        }else if(num == 8){
            result = "eight";
        }else if (num == 9){
            result = "nine";
        }else{
            result = "Invalid";
        }
        System.out.println(result);
    }
}
