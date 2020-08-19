package day43_static;

class A{
    static int a = 200;
}

public class CybertekStudent {
    String studentName;
    int age;
    char gender;
    static String schoolName = "Cybertek School";

    public void getInfo(){
        System.out.println("Name: "+studentName);
    }
    public static void printSchool(){
        System.out.println("School Name: "+schoolName);
    }
}


