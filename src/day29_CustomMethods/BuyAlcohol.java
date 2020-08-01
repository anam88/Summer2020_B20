package day29_CustomMethods;

public class BuyAlcohol {
    /*
    check eligibility to buy alcohol
    name
    age
    identification
     */
    public static void main(String[] args) {
        buyAlcohol("John", 20, false);
    }
    public static void buyAlcohol(String name, int age, boolean identification){
        boolean eligible = age >= 18 && identification == true;
        if(eligible == true){
            System.out.println(name+" is eligible to purchase alcohol!");
        }else{
            System.out.println(name+" not eligible to purchase alcohol!");
        }
    }
}
