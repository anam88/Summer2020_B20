package day17_StringReview;

public class StringMethods1 {
    public static void main(String[] args) {
        //charAt
        String str = "Cybertek"; //01234567 (index start at 0)
        /*calling a method charAt by using the variable(str)just like Scanner class (input or scan)
        whenever use charAt method, you need to give index charAt(index),and charAt method
        returns you a character(char), and you can assign it to a char variable, so we can reuse it*/
        char ch1 = str.charAt(1);//to get y
        System.out.println(ch1);
//**********************************************************************
        //concat
        String str2 = "Cybertek";
               str2   = str2 + " School";
        System.out.println(str2);
//********************************************************************
        /*length starts from 1 but index start from 0
        returns as int */
        String str3 = "Cybertek School";//space also count as index
        int l = str3.length();
        System.out.println("The length of string "+l);

        //inorder to get the number of index we will do length()-1 because index start at 0
        //lastIndex: length -1
//        int l1 = str3.length()-1;
        char ch2 = str3.charAt(l-1);//line 25 and 26 is doing same process
        System.out.println("The last index: "+(l-1));
//*******************************************************************
        /*upperCase & lowerCase
        cannot modify the string, will create a new string
         */
        String str4 = "cybertek";
        str4 = str4.toUpperCase();
        System.out.println("Change the string to uppercase "+str4);

        String str5 = "JAVA IS FUN";
          str5 = str5.toLowerCase();
        System.out.println("change the string to lowercase "+str5);
//***************************************************************
        //trim method removes the white space, and create a new string
        String str6 = "          Cyber tek       ";
        str6 = str6.trim();
        System.out.println("remove the whitespace by using trim method: "+str6);
//***********************************************************************
        //subString - use if you wanna get a portion of string
        String str7 = "Java is fun";
/*      str7 = str7.substring(8);we can assign it to str7, but the object will change to fun,
       therefore we will create a new variable. So str7 refer to still Java is fun
       /only reassign to the new variable if you wont be using it again
 */
        String word = str7.substring(8);
        System.out.println("subString to get fun:"+word);
//********************************************************************
        //indexOf -use for returning the index number as int
        String str8 = "Hello Batch 20, Have a Wonderful day, We are happy to see you";
       int n1 = str8.indexOf("W");//to get the index of W
        System.out.println("The index of W is: "+n1);//23
        System.out.println(str8.charAt(n1));//W
        //index is 23 we can confirm that by using charAt
        //because charAt method will take index number and will return char
        int n2 = str8.indexOf("We");
        System.out.println("The index of second W is: "+n2);//38
//*********************************************************************
        //lastIndexOf-return last matching index
        int n3 = str8.lastIndexOf("y");
        System.out.println("The index of last y in the string: "+n3);
//        //to confirm the index lets use charAt
//        System.out.println(str8.charAt(n3));

//*************************************************************************
        //replace - will replace all the words or string
        String s1 = "I like Java, Java is a programming language.";
        s1 = s1.replace("Java","Python");
        System.out.println("Replaced all the word Java: "+"\n"+s1);

        //replaceFirst
        //"I like Python, Python is a programming language."
        String s2 = s1.replaceFirst("Python","HTML");
        System.out.println("Replace the first Python: "+"\n"+s2);




    }
}
