package day28_Recap;

public class frequencyWordInArray {
    public static void main(String[] args) {
/*
  2. write a program that can count the frequency of a word from an array of string
    Ex:
        arr: {"Java", "C#", "Python", "Java"};
        word: "java"
        output:
                2
                MUST USE FOR EACH LOOP & CONTINUE statement
*/
        String arr[] = {"Java","JAVA","Python","JaVa","java"};
        String word = "java";

        int count = 0; //for frequency

        for (String each : arr ){
            if(!word.equalsIgnoreCase(each)){//
                continue;
            }
            count++;
        }
        System.out.println(count);

    }
}
