package day19_ForLoop;

public class AllTheLetters {
    public static void main(String[] args) {
        /*5. Write a program that will print out all letters in English alphabet in ascending order
        6. Write a program that will print out all letters in English alphabet in descending order*/

        //task 5 --ascending order
        System.out.println("Ascending Order by using character");
        for(char ch = 'A'; ch <= 'Z'; ch++ ){
            System.out.print(ch+ " ");//ascending order
        }
        System.out.println();
        //lowercase
        for(char ch = 'a'; ch <= 'z'; ch++){
            System.out.print(ch+" ");//ascending order
        }
        System.out.println();
        //*******************************************************
        //another way to print by using the value of the character
        //for uppercase
        System.out.println("Ascending Order by using the char value");
        for (int i = 65; i <= 90; i++){
            char ch = (char)i;//another way of doing explicit casting
            System.out.print(ch+" ");
        }
        System.out.println();
        //for lowercase
        for (int i = 97; i <= 122; i++){
            System.out.print((char)i+" ");//we are doing explicit casting by converting int to char
        }
        System.out.println();
        System.out.println("Descending Order by using character");
        //task 6 descending order
        //uppercase
        for (char ch = 'Z'; ch >= 'A'; ch--){
            System.out.print(ch+" ");
        }
        System.out.println();
        //lowercase
        for (char ch = 'z'; ch >= 'a'; ch--){
            System.out.print(ch+" ");
        }
        System.out.println();
        //*******************************************************
        //another way to print by using the value of the character
        //for uppercase
        System.out.println("Descending Order by using the char value");
        for(int i = 90; i >= 65; i--){
            char ch = (char)i;
            System.out.print(ch + " ");
        }
        System.out.println();
        //lowercase
        for(int i = 122; i >= 97; i--){
            char ch = (char)i;
            System.out.print(ch+" ");
        }
       System.out.println();
//        System.out.println("******Printing all letters***********");
//        for(int i = 0; i < 65000; i++){
//            System.out.print((char)i+" ");
//        }
    }
}
