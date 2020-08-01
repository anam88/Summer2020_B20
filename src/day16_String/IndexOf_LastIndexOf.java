package day16_String;

public class IndexOf_LastIndexOf {
    public static void main(String[] args) {
       //indexOf==> returns the first occur character

        String s1 = "I like to stay in Cybertek, we are learning Java";
        int r1 = s1.indexOf("r"); //return value will be int that is why using data type int
        int r2 = s1.indexOf("re");//make it unique
        int r3 = s1.indexOf("rn");//make it unique
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
//        System.out.println(s1.charAt(r1));//to confirm with the index of r1 is 22 or not

        //lastIndexOf ==>returns the last occur character

        String str1 = "Java is a programming language, and Java is fun";
        int j1 = str1.lastIndexOf("J");
        System.out.println(j1);

        String s7 = "Java";
        int a1 = s7.indexOf("A");//value does not exist in the string
        System.out.println(a1);//that is why output is in negative -1

        //can you get the value in double
//        String s2 = "Java";
//        double a = s2.indexOf("a");
//        char ch = s2.charAt(a)//index cannot be decimal therefore we are getting error
// char method only accept integer


    }
}
