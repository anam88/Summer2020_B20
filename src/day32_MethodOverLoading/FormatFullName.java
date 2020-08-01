package day32_MethodOverLoading;

import java.util.Scanner;

public class FormatFullName {
/*
1. write a method that can return the full name of a person in regular format
        ex:
            fullName("cYbErTeK", "SCHOOL"); ==> "Cybertek School"
 */
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the first name");
    String f_Name = input.nextLine();
    System.out.println("Enter the last name");
    String l_Name = input.nextLine();
/*    String f_name = "cYbErTek";
//    String l_name = "SCHOOL";

   f_name =  f_name.substring(0,1).toUpperCase() + f_name.substring(1).toLowerCase();
//convert first char to uppercase + concat rest of the string & to lowercase,and assign it back to string
    l_name = l_name.substring(0,1).toUpperCase() + l_name.substring(1).toLowerCase();
    String fullName = f_name+" "+l_name;

 */
    String fullName = FormatFullName(f_Name,l_Name);
    System.out.println(fullName);



}
//=============================================================================================//

    public static String FormatFullName(String f_Name, String l_Name){
        f_Name =  f_Name.substring(0,1).toUpperCase() + f_Name.substring(1).toLowerCase();
//convert first char to uppercase + concat rest of the string & to lowercase,and assign it back to string
        l_Name = l_Name.substring(0,1).toUpperCase() + l_Name.substring(1).toLowerCase();
        String fullName = f_Name+" "+l_Name;

        return fullName;
    }

}
