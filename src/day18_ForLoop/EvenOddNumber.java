package day18_ForLoop;

public class EvenOddNumber {
    public static void main(String[] args) {

        int n = 1000;
        System.out.print("Even Numbers from 1 to " + n + " are: ");
        for (int i = 1; i <= n; i++) {
            //if number%2 == 0 it means its an even number
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("***********************************");

        int n1 = 1000;
        System.out.println("Odd Numbers from 1 to " + n1 + " are: ");
        for(int x = 1; x <= n1; x++){
        //    if (number%2) != 0 it means its an odd number
            if(x % 2 != 0){
                System.out.print(x+ " ");
            }
        }


    }
}