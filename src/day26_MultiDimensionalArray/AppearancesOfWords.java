package day26_MultiDimensionalArray;

import java.util.Arrays;

public class AppearancesOfWords {
    public static void main(String[] args) {
/*
write a program that can return the number of appearances of "java" and "python" in the sentence
input: Java Java Python Python Python
          output: 2 Java 3 Python  */

        String sentence = "Java Java Python Python Python Python Python Python Javascript";
       String words[]= sentence.split(" ");
        System.out.println(Arrays.toString(words));
        //[Java, Java, Python, Python, Python]
        int countJava = 0;
        int countPython = 0;

        for(String each : words){
            if(each.toLowerCase().contains("java")){
                countJava++;
            }else if(each.toLowerCase().contains("python")){
                countPython++;
            }
        }
        System.out.println("Number of times Java occurs in the sentence: "+countJava);
        System.out.println("Number of times Python occurs in the sentence: "+countPython);
    }
}
