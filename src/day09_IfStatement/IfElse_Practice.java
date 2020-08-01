package day09_IfStatement;

public class IfElse_Practice {
    public static void main(String[] args) {
        //can person vote Example
        int age = 20;
        boolean usCitizen = true;
        boolean eligibleToVote = true;

        if (age >= 18 && usCitizen) {
            System.out.println("Eligible to vote for President.");

        } else {
            System.out.println("Not eligible to vote for President.");
        }

        System.out.println("******************************");
        //can person buy alcohol

        int age1 = 17;
        boolean hasID = true;

        if (age >= 21 && hasID) {
            System.out.println("Person can by alcohol.");
        } else { //age < 21
            System.out.println("Cannot buy alcohol.");
        }
        System.out.println("******************************");
        //Is number an Odd or Even number

        int num = 21;

        if (num / 2 == 0) {
            System.out.println(num + " is an Even number.");
        } else {
            System.out.println(num + " is an Odd number.");
        }
        System.out.println("******************************");

        // Is it time for break

        String timeForBreak = "no";
        if (timeForBreak == "yes") {
            System.out.println("Yes, let's drink coffee.");
        } else {
            System.out.println("Keep learning If/Else statement.");

        }
        System.out.println("******************************");
        //find a max number
        int a = 100;
        int b = 2500;

        if(a > b){
            System.out.println(a+" is a greater number");
        }else{
            System.out.println(b+" is a greater number");
        }
    }
}
