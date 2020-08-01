package day11_Tenary_NestedIf;

public class TernaryPractice {
    //is the person eligible to buy alcohol| use ternary statement
    public static void main(String[] args) {
        int age = 15;
        boolean eligible = false;

        //use if else statement
        if(age >= 21){
            eligible = true;
        }else{
            eligible = false;
        }
        System.out.println("***********");
        System.out.println(eligible);
        System.out.println("***********");

      boolean canBuyAlcohol  = (age >= 21) ? true : false;
        System.out.println(canBuyAlcohol);
//=============================================================================================

        //is the person eligible to vote| use ternary statement

        int age1 = 13;
        String citizen = "USA";

       String eligibleToVote = (age1 >= 18 && citizen == "USA") ? "Can Vote" : "Cannot Vote";
        System.out.println("***********");
        System.out.println(eligibleToVote);
        //=============================================================================
        //write a task that can check if two numbers are equal or not

        int x = 50;
        int y = 25;


       String equalOrNot = (x == y) ? "Both Numbers are Equal" : "Both Numbers are NOT Equal";
        System.out.println("***********");
        System.out.println(equalOrNot);
    }
}
