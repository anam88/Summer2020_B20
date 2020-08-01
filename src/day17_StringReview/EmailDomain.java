package day17_StringReview;
import java.util.Scanner;
public class EmailDomain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        6. write a program that will return the domain of an email address:
            Ex:
                input: test@gmail.com
                output: the domain of the email is: gmail
                inputL: Cybertek@yahoo.com
                output: the domain of the email is: yahoo
         */
        System.out.println("Enter your email address:");
//        String email = "Cybertek@yahoo.com";
        String email = input.next();
    //we get index of @ and . because domain are always between @ and . in the email
        //how can we get index of @
        int index1 = email.indexOf("@"); //using indexOf method will give us the index of the string
//        System.out.println(index1); //8
        //how can we get index of .com
        int index2 = email.lastIndexOf(".");
//        System.out.println(index2);//14
      String  domain = email.substring(index1+1, index2);
//on line 20 we use the index 9, 14 because the index of g is 9, and . is 14 because
//the beginning index is not excluded but the ending is.
        System.out.println(domain);
    }
}
