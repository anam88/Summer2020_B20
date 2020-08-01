package day22_NestedLoop;

public class NestedLoop_Practice2 {
    public static void main(String[] args) {
        /*
        write a program that can print 5 stars in the single line by using for loop
        *****
        *****
        *****
        *****
        *****

        */

        int j = 1;
        while(j <= 4){//outer loop repeats the inner loop
            for(int i = 1; i <= 10; i++){//this step will run over and over again until j = 4
                System.out.print("*");
            }
            System.out.println();//append a new line
            j++; //iterator
        }
        System.out.println("=====================");



    }
}
