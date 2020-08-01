package day08_LogicalOperators;

public class Or_LogicalOperators {
    //OR logical operators ||
    //as long as one statement is TRUE -- it will return TRUE
    public static void main(String[] args) {

        boolean r1 = true == !false || false == true; //one condition true
                      //true == true || false == true; //
        System.out.println(r1); //return true

        boolean r2 = 9 >= 10 || 1 >= 9; //both conditions are false
        System.out.println(r2);//output false

        System.out.println("***********************************");

        String f_Name = "John";
        String l_name = "Smith";
        int age = 40;
        String citizen1 = "Ireland";
        String citizen2 = "France";

        boolean eligibleAge = age >=18;
                    // 40 >= 18 //true
        boolean usCitizenship = citizen1 == "USA" || citizen2 == "USA";
                    // Ireland == "USA" || France == "USA"
                    //   false || false ==> both condition false
        String fullName = f_Name +" " +l_name; //concate of first & last name
        boolean canVote = eligibleAge && usCitizenship;
                            //true   && false
            //under && logic as long as one statement is false - it will return false
        System.out.println("Is "+fullName+ " eligible to vote for Trump? "+canVote);//false
    }
}
