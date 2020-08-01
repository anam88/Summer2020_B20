package day21_loops;

public class DoWhileLoops {
    public static void main(String[] args) {

        boolean result = false;

        while(result){
            System.out.println("Hello");//will not print because condition is false
            //while loop checks the condition first, if the condition is true it will execute the
            //code OR statement
        }
        System.out.println("==========================");

        do{//just do it
            System.out.println("Hello");//first print the statement, than check the condition
            //if the condition is false it will not do it again, if it is true it will print again
        }while(result);
    }



}
