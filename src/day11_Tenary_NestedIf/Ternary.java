package day11_Tenary_NestedIf;

public class Ternary {
    //ternary statement
    /*
    Ternary: short cut of if & else Statements
    ? represent if keyword
Condition need to be place before if statement
: represent else keyword
Example:
(num%2==0) ? "Even" : "Odd";
condition If  if(value) else else(value)
The return type data has to match (string == string || int == int)
String result2 = (num%2==0) ? "Even" : "Odd";
     */
    public static void main(String[] args) {
        //one way to do it
        int num = 100;
        String result = "";

        if(num % 2 == 0){
            result = "Even";
        }else{
            result = "Odd";
        }
        System.out.println(result);
        System.out.println("*****Ternary Way ******");
        String result2 = (num % 2 == 0) ? "Even" : "Odd"; //returns a string therefore, assign it to
        //string
        System.out.println(result2);
        System.out.println("*****************************************");

        int num1 = 1000;
        int num2 = 20;
        int max1 = 0;
        //write a condition to find out max number, and assign it to new variable (max1)
        //first try with if else block

        if(num1 > num2){
            max1 = num1; //assigning max1 to num1 if num1 is maximum number
        }else{//this block execute if, IF statement is false
            max1 = num2;
        }
        System.out.println(max1);

        System.out.println("*****Ternary Way ******");

        int max2 = (num1 > num2) ? num1 : num2;//since the return value is in int-we assign it to int
        //variable int max2
        System.out.println(max2);

    }
}
