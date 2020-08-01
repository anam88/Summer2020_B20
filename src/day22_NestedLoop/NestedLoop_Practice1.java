package day22_NestedLoop;

public class NestedLoop_Practice1 {
    public static void main(String[] args) {
        /*
        write a program that can print 1 to 5 in same line separated by space 5 times using
        NESTED LOOP
         */

        for (int j = 1; j <= 5; j++){
            for(int i = 1; i <= 5; i++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("==========================");



    }

}




