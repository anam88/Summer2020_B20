package day17_StringReview;

public class StringMethods2 {
    public static void main(String[] args) {
        //equals ==> return boolean and compare TEXT, and is CASE SENSITIVE
        String s1 = "Cat"; //string pool
        String s2 = new String("Cat");//heap
        //two different object
        System.out.println(s1 == s2);//returns false because two different object memory location
        System.out.println(s1.equals(s2));
        //returns true because we are comparing text NOT the location of object
        String s4 = "java";
        String s5 = "Java";
        System.out.println(s4.equals(s5));
        //returns false because equals()method is case sensitive
        System.out.println(s4 == s5);
        //return false also because case sensitive

//***************************************************
        //equalsIgnoreCase ==> return boolean and compare TEXT, and is NOT CASE SENSITIVE
        String s6 = "John";
        String s7 = "john";
        System.out.println(s6.equalsIgnoreCase(s7));
        //returns true because it IGNORES the case sensitivity

        String s8 = "MuHtAr";
        String s9 = "muhtar";
        System.out.println(s8.equalsIgnoreCase(s9));//true


//************************************************
        //isEmpty ==>check if length is 0, if it is return true, if not than false
        String a1 = " ";

        System.out.println(a1.isEmpty());//return false, space is a index
        a1 = a1.trim();//trims the empty space
        System.out.println(a1.isEmpty());//true
//************************************************
        //contains ==> checks included it or not
        String str = "Java, Pyhton, C#, Ruby, C++";
        System.out.println(str.contains("Java"));//true
        System.out.println(str.contains("java"));//false case sensitive
        System.out.println(str.toLowerCase().contains("java"));//return true because we change it to
        //lowercase first and than do contain method
        System.out.println(str.contains("+"));//true

        String str1 = "ABCD";
        System.out.println(str1.contains("D"));//true==>D is included in given String
//********************************************
        //startsWith ==>

        String str2 = "Cybertek";
        System.out.println(str2.startsWith("Cyb")); //true
        System.out.println(str2.startsWith("CybABC"));//false ABC not matching with given String
        System.out.println(str2.startsWith("E") || str2.startsWith("C"));
        //returns True because || logic apply if first condition is false, second can be TRUE.







    }
}

