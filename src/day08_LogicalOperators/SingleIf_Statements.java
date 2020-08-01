package day08_LogicalOperators;

public class SingleIf_Statements {

    public static void main(String[] args) {

// Alcohol example
        int age = 16;

        if (age >= 21){
            System.out.println("You can buy alcohol.");
        }
        if (age < 21){
            System.out.println("You cannot buy alcohol.");
        }
        System.out.println("*************************************");
        /*Write a program that can identify the largest number between two numbers
        2 possibilities ( a can be larger number OR b can be larger number)
         */
        int a =10;
        int b =20;
        if (a>b) {
            System.out.println(a + " is largest number");
        }
        if (b>a) {
            System.out.println(b + " is largest number.");
        }
        if (a == b){
            System.out.println("Both are equals.");
        }
        System.out.println("*************************************");
        //write a program that tell you if it is break time or not
        boolean breakTime = false;
        if(breakTime == true){
            System.out.println("Yayy! Take 15 minutes break.");
        }
        if(breakTime == false){
            System.out.println("Keep learning IF statements.");
        }
        System.out.println("*************************************");
        //write a program that identify the smallest number between two numbers
        //2 possibilities ( i can be smaller number OR j can be smaller number)
        int i = 15;
        int j = 25;
        if(i < j){
            System.out.println(i + " is smallest number");
        }
        if(i > j){
            System.out.println(j + " is smallest number");
        }
        if (i == j){
            System.out.println("Both are equals.");
        }
        System.out.println("*************************************");
        /*a triangle is valid if the sum of 3 angles are equal to 180. Write a program
        that check whether a triangle is valid or not. If valid print valid, otherwise print invalid
         */
        int side1 = 160;
        int side2 = 60;
        int side3 = 60;
        int sumOfSides = side1 + side2 + side3;

        if (sumOfSides == 180){
            System.out.println("Valid Triangle");
        }
        if (sumOfSides != 180){
            System.out.println("Invalid Triangle");
        }
        System.out.println("*************************************");
        boolean corona = true;
        if(corona == true){
            System.out.println("Use hand sanitizer.");
            System.out.println("14 days quarantine.");
            System.out.println("Practice Social Distancing.");
        }
        System.out.println("*************************************");
        //write a program that check if a given number is odd or even
        int x = 25;
        int evenNum = x / 2;

        if(evenNum == 0){
            System.out.println(x+" is an even number");
        }
        if (evenNum != 0){
            System.out.println(x+" is an odd number");
        }

        /* write a program that can check if the person is eligible to vote
        if eligible: print "You are eligible to vote."
        otherwise print: "you are not eligible to vote"
         */
        System.out.println("*************************************");
        int howOld = 20;
        String citizenship = "USA";

        if (howOld >= 18 && citizenship == "USA"){
            System.out.println("You are eligible to vote.");
        }
        if(howOld < 18 && citizenship == "Japan"){
            System.out.println("You are not eligible to vote.");
        }
    }
}
