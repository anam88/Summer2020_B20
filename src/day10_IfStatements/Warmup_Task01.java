package day10_IfStatements;



public class Warmup_Task01 {
    /*
    1. write a program that can identify if the given character character is Alphabetic
            ex:
                character = 'a'
            output:
                a is an Alphabetic
                character  = '!'
            output:
                ! is not  anAlphabetic
        Hint:
                ascii table:
                        65 ~ 90 ==> A~Z
                        97 ~ 122 ==> a~z
     */
    public static void main(String[] args) {

        char ch = 'm';
        if((ch >= 97 && ch <= 122)){

            System.out.println(ch+" is an Alphabetic character");
        }
        else{
            System.out.println(ch+" is not an Alphabetic character");
        }

     /*
     2. write a program that can identify if the given character character is Digit
                ex:
                    character = '1'
                output:
                    1 is a Digit
                    character  = '!'
                output:
                    ! is not a digit
      */
        System.out.println("*********************");

        char ch1 = '8';
        if((ch1 >= 40 && ch1 <= 60)){
            System.out.println(ch1+" is a digit.");
        }else{
            System.out.println(ch1+" is not a digit.");
        }
        /*
        3. write a program that can identify if the given character is a symbol
                ex:
                    character = '!'
                output:
                    ! is a symbol
                    character  = 'a'
                output:
                    a is not a symbol

         */
        System.out.println("*********************");
        char ch2 = '$';
        if(ch2 >=30 && ch2 <= 64){
            System.out.println(ch2+" is a symbol.");
        }else{
            System.out.println(ch2+" is not a symbol.");
        }
    }
}