package day12_Switch_Scanner;


//import statement goes above the className and under the package name
// syntax of import statement:
//import packageName.ClassName;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        //Scanner Declaration | scanner class must be initiated before it can be use
        Scanner input = new Scanner(System.in);//scannerclass variableName(can be anything) =
        //Object of Scanner: new Scanner(represent input)
        System.out.println("Enter the number");//to print the message

        //assign it to new variable so we can use data reusable = waiting for me to assign int
//          int num1 = input.nextInt();
//          long num2 = input.nextLong();
            double num3 = input.nextDouble();


//        System.out.println("You entered int primitive " +num1);
//        System.out.println("you entered long primitive"+num2);
          System.out.println("you entered double primitive "+num3);

    }




    }
