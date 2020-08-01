package day29_CustomMethods;

public class EligibleToVote {
/*task: check eligibility to vote
  age: 18 or older
  citizen
  Name of user
 */
public static void main(String[] args) {
    vote("John", 16, true, "Donald Trump" );
}

    public static void vote(String name, int age, boolean citizenship, String candidateName  ){
        boolean eligibleToVote = age >= 18 && citizenship == true;
        if(eligibleToVote){
            System.out.println(name+" is eligible to vote for "+candidateName+"!");
        }else{
            System.out.println(name+" is not eligible to vote!");
        }

    }


}
