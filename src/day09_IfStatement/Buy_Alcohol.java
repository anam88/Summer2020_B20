package day09_IfStatement;

public class Buy_Alcohol {
    /*
        4. write a java program that can identify if a person is eligible to buy alcohol
        we will use && logic, because for && logic both condition has to be TRUE
     */
    public static void main(String[] args) {
        int age = 16;
        boolean hasID = true;
        String full_Name = "John Smith";

        if (age >= 21 && !hasID){
            //one condition is TRUE | no ID proof
            System.out.println(full_Name+" Sorry! cannot purchase alcohol, No ID proof!");
        }

        if (age < 21 && hasID){
            //one condition is TRUE | under age
            System.out.println(full_Name+" is under age, and cannot purchase alcohol.");
        }
        if (age >= 21 && hasID){
            //both condition are TRUE
            System.out.println(full_Name+" Yes, you can purchase alcohol.");

        }

    }
}
