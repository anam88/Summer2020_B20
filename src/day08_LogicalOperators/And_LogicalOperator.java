package day08_LogicalOperators;

public class And_LogicalOperator {
    public static void main(String[] args) {

        boolean r5 = 9 > 5 && 9 > 10;
        //9 > 5 = true | 9 > 10 = false
        //true & false
        System.out.println(r5);

        System.out.println("*******************************");

        /* is the person eligible to vote */
        int age = 19;
        String country = "USA";;
        boolean eligibleToVote = age >= 18 && country == "Russia";

        System.out.println("Is the person eligible to vote? "+eligibleToVote); //true


        System.out.println("*******************************");

        String f_Name = "John";
        String l_name = "Smith";
        int howOld = 34;
        String citizen = "USA";
        boolean canVote = howOld >= 18 && citizen == "USA";
        String fullName = f_Name +" " +l_name;
        System.out.println(fullName+" is eligible to vote: "+canVote);





    }
}
