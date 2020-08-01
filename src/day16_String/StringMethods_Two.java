package day16_String;

public class StringMethods_Two {
    public static void main(String[] args) {
//isEmpty Method
        String name1 = "Cybertek";
        System.out.println(name1.isEmpty());

        String name2 = "";
        System.out.println(name2.isEmpty());
        //=======================
//isEqual Method
        String str1 = "Java";
        String str2 = new String("Java");

        System.out.println(str1+" : "+str2);
        System.out.println(str1.equals(str2));

        String str3 = new String("Java");
        String str4 = new String("Java");
        System.out.println(str3 == str4);//false because every time we use new keyword, 2
        //different objects are created, that's why when we use == we get false
        System.out.println(str3.equals(str4));//returns true because equals method compare the value of
        //string.

        String str5 = "Java";
        String str6 = "Java";
        System.out.println(str5 == str6);//true because only ONE object is created in string pool memory
        System.out.println(str5.equals(str6));//true because the text is SAME

        String str7 = "Java";
        String str8 = "java";
        System.out.println(str7.equalsIgnoreCase(str8));//true
//=====================================================================
//contains Method

        String str = "I like to lear Java programming";
        System.out.println(str.contains("Python")); //false
        System.out.println(!str.contains("Python")); //true
        System.out.println(str.contains("java"));//false case sensitive
//startsWith

        String s1 = "Anam";
        System.out.println(s1.startsWith("A")); //true
        System.out.println(s1.startsWith("a")); //false
        System.out.println(s1.startsWith("An"));//true






    }






}
