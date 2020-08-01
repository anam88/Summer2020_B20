package day14_Recap;

import java.util.Scanner;

public class ScannerMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Double num = input.nextDouble(); //IF I ENTER 2 ==>OUTPUT WILL BE 2.0
//        System.out.println("you have enter "+num);
//        int num1 = input.nextInt();//IF I ENTER 2.5==>INPUT MISS MATCH ERROR
//        System.out.println("you have enter another "+num1);
        System.out.println("Do you want to learn Java?");
//        String num = input.next(); //==>will only take the first word.
        //let me think about it..==> output: let
        String num = input.nextLine();
        System.out.println("you have enter "+num);

    }
}
