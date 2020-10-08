package day60_Collection;

import sun.awt.image.ImageWatched;

import java.util.*;

public class SetPractice {
    public static void main(String[] args) {
        /**
        Convert the String in to Array of string
         remove the duplicates from the array of string using one of the SetInterface classes
         */
        String str = "aaaaaaabbbbbbbbbbbcccccccccccccddddddddeeeeeeee"; //remove duplicate
        String[] arr = str.split("");
        System.out.println("arr = " + Arrays.toString(arr));
//arr = [a, a, a, a, a, a, a, b, b, b, b, b, b, b, b, b, b, b, c, c, c, c, c, c, c, c, c, c, c, c, c, d, d, d, d, d, d, d, d, e, e, e, e, e, e, e, e]

        Set<String> s1 = new HashSet<>();
        //convert array to collection type using Arrays.asList
        s1.addAll(Arrays.asList(arr));
        System.out.println(s1); //[a, b, c, d, e]
        System.out.println("*********************************");

        /**output should be same as the insertion order
         * remove duplicates
         */
        String str1 = "zzzzyyyyxxxlllmmmm";
        str1 = new LinkedHashSet<>( Arrays.asList( str1.split("") ) ).toString();
        System.out.println("str1 = " + str1);
        System.out.println("*********************************");

/**
* write a program that can identify if two strings are build out of same characters
* ex: str1 = "xyzxyz";
* str2 = "xyz";
* output: true if build on same characters
*/

    String firstStr = "xyzxyz";
    String secondStr = "xyzzxyz";
    //use the to.String method to convert Array to the string
    firstStr = new LinkedHashSet<>( Arrays.asList( firstStr.split("") ) ).toString();
    secondStr = new LinkedHashSet<>( Arrays.asList(secondStr.split(""))).toString();
    System.out.println("firstStr = " + firstStr);
    System.out.println("secondStr = " + secondStr);
    System.out.println("Are both strings build out of same characters: "+firstStr.equals(secondStr));

        System.out.println("************************************");
        //array of fruits
        String[] names = {"Apple","Orange","Pear","Apple","Apple","Peach"};
        //created a set of LinkedHashSet to remove dup and keep the insertion order
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        //use Arrays.asList to to convert array to collection type
        set1.addAll( Arrays.asList( names ));
        //converting collection type to an array
        names = set1.toArray(new String[0]);
        //To print array Arrays.toString method
        System.out.println(Arrays.toString(names));
        System.out.println("************************************");

        String[] names1 = {"Almonds","Figs","Cashew","Walnuts","Peanuts","Cashew","Cashew"};
        /**
         * convert array to collection type to remove duplicates,
         * Then convert it back to array using toArray() method
         * so we can assign it back to array variable names1
         */
       names1 =  new LinkedHashSet<>( Arrays.asList(names1)).toArray(new String[0]);
        System.out.println(Arrays.toString(names1));


    }
}
