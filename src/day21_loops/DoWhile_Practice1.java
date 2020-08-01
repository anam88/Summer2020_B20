package day21_loops;

public class DoWhile_Practice1 {
    public static void main(String[] args) {

        //print 1 - 10 using do while loop

        int num = 1; //initialization

        do{
            System.out.print(num+" ");
            num++;//iterator
        }while(num <= 10);//condition
    //while(num >= 10)//output: 1 because do-while loop print the code first than check the condition

        System.out.println();

        System.out.println(num);//11 - loop stops when the num = 11 and condition becomes false
        System.out.println("==================");
//print the alphabet backwards using do-while loop

        char ch = 'Z';

        do{
            System.out.print(ch+" ");
            ch--;

        }while(ch >= 'A');


    }
}
