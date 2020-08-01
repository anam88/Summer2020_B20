package day22_NestedLoop;

public class NestedLoop_Practice3 {
    public static void main(String[] args) {
        /* print this shape
         *******
         ******
         *****
         ****
         ***
         **
         *
         */

        int a = 1;
        while (a <= 7) {
            for (int i = 7; i >= a; i--) {
                System.out.print("*");
            }
            System.out.println();
            a++;
        }
        System.out.println("=====================");
         /*
        print this shape
      *
      **
      ***
      ****
      *****
      ******
      *******
         */
        for(int j = 1; j <= 7; j++){//j: 1 2 3 4 5 6 7
//when j value is 3, the inner loop should ONLY print 3 stars
            for(int k = 1; k <= j; k++){//k: 1 2 3 4 5 6 7
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
