package day20_whileLoops;

public class WhileLoop_Practice1 {
    public static void main(String[] args) {
        /*
        print the number from 1 to 10 by using for and while loop
         */
        //using for loop
        for(int i = 1; i <= 10; i++){
            System.out.print(i+" ");
        }
        System.out.println();


        //using while loop
        int num = 1; //initialization

        while(num <= 10){//condition
            System.out.print(num+" "); //loop body statement
            //if there is no iterator the loop will run infinite
            num++;//iterator
        }
        System.out.println();

        //print your name 10 times using while loop
        int n = 1;//variable is declared outside of the loop
        while(n <= 10){//as long as condition is true, the code will execute top to bottom
            //condition has to be boolean
            System.out.print("Anam"+" ");
            n++;
        }
        System.out.println();
        //write a program that can reverse a string
            String str = "Cybertek";
            int index = str.length()-1;
            String result = "";

            while(index >= 0){
                result += str.charAt(index);

                index--;
            }
        System.out.println(result);
    }
}
