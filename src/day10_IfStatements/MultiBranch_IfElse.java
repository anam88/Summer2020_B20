package day10_IfStatements;

public class MultiBranch_IfElse {
    /* identify if number is +ve or -ve or 0 */
    public static void main(String[] args) {
        int number = -2;
        //single if statement
        if(number > 0){
            System.out.println(number+" is positive.");
        }
        if(number < 0){
            System.out.println(number+" is negative.");
        }
        if(number == 0){
            System.out.println(number+" is zero.");
        }
        System.out.println("***************************");
        //if else statement cannot be use because we have more than 2 options
        //Multi Branch if statement

        if(number > 0){
            System.out.println(number+" is positive.");
        }else if (number < 0){
            System.out.println(number+" is negative.");
        }else{ //number == 0
            System.out.println(number+ " is Zero.");
        }
        System.out.println("***************************");

       
    }
}
