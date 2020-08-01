package day20_whileLoops;

public class WhileLoop {
    public static void main(String[] args) {

        if(true){
            System.out.println("Hello World");//only executed one time
        }
        System.out.println("**************");

        while(true){//true == boolean condition
            System.out.println("Hello World");//the statement will keep getting printed
        }

        //while loop is a repeated if statement, until the condition becomes false
    }
}
