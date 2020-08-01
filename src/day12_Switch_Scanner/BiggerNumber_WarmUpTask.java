package day12_Switch_Scanner;

public class BiggerNumber_WarmUpTask {
    /*
     1. write a program that checks for the bigger of 3 numbers.
        you get 3 int variables: n1 , n2 and n3 (none of them are equal)
            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"
            example:
                    n1 = -2
                    n2  = 2
                    n3  = 1
                output: "n2 is bigger"
            NOTE: DO NOT USE IF STATEMENT

     */
    public static void main(String[] args) {

        int n1 = 10;
        int  n2 = 250;
        int n3 = -8;
        String result = "";
        //if statement for practice
        if(n1 > n2 && n1 > n3){
            result = "n1 is bigger";
        }else if (n2 > n1 && n2 > n3){
            result = "n2 is bigger";
        }else{
            result = "n3 is bigger";
        }

        System.out.println(result);
        System.out.println("******************************");
        //Ternary Statement
       String r = (n1 > n2 && n1 > n3) ? "n1 is bigger" : (n2 > n1 && n2 > n3) ? "n2 is bigger"
                : "n3 is bigger";
        System.out.println(r);

    }
}
