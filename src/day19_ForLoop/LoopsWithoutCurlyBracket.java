package day19_ForLoop;

public class LoopsWithoutCurlyBracket {
    public static void main(String[] args) {

        for(int i = 5; i < 10; i++){
            //both print statement will execute 5 times because they are inside the loop
            System.out.println("Hello");
            System.out.println("How are you");
        }
        System.out.println("******************");

        for(int i = 1; i <= 5; i++)
            //if there is no curly brackets the first statement belongs to the loop
            //the second statement will be printed only ONCE, because it does not belong to the loop
            //without the brackets for loop can ONLY execute ONE statement
            System.out.println("Hello");//loop apply to this statement
            System.out.println("How are you");
    }
}
