package day28_Recap;

public class frequencyWord {
    public static void main(String[] args) {
/*
 1. write a program return the frequency of a word from a string
    ex:
        str = "JavajavaJAVA";
        word = "java";
        output:
            3
 */
        String str = "javaJAVA";
/*                     01234567
iterate through all letters by using substring methods
    substring (0,4) to get java
    substring (1,5) to get avaj
    substring (2,6) to get vaja
    substring (3,7) to get ajav
    substring (4,8) to get java ( index number 8 is excluded. substring method will stop at 7)
substring(i, i+4) the difference between first index and last index is 4 therefore
        we are doing i + 4
    String a = str.substring(i , i + 4); if we are adding 4 in to i, than the length has to be
    length()-4


 */

        int count = 0; //if the string has the word, the frequency will add

        for (int i = 0; i <= str.length()-4; i++){//i: 0 1 2 3 4 5 6 7
            String s = str.substring(i, i+4);
            if(s.equalsIgnoreCase("java")){
                count++;
            }
        }
        System.out.println("The frequqncy of word Java is "+count);//print frequency of java is 2





    }
}
