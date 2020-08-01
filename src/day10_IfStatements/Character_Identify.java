package day10_IfStatements;

public class Character_Identify {
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

          char character ='v';
          //first we will create boolean
          // we have two conditions because the character can be uppercase OR lowercase

          boolean isAlphabetic = (character >= 65 && character <=90) || (character >=97 && character <=122);
          //                                 uppercase Letters       ||  lowercase letters
          //                 && logic use because we are giving range
          if(isAlphabetic) {
              System.out.println(character + " is an Alphabetic character.");
          }else {
              System.out.println(character + " is not an Alphabetic character.");
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
      */ //in the below example we used an empty string so we can re assign the value
          char character1 = '7';
          //ascii table:
          // 0 ~ 9 ==> 48 ~ 57
          boolean isDigit = (character1 >= 48 && character1 <= 57);
          String digit = ""; //empty string

          if(isDigit == true){
              digit = character1 + " is a digit.";
          }else {
              digit = character1 + " is not a digit.";
          }
          System.out.println(digit);
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
          char character2 = '@';

          boolean specialChar  = isAlphabetic == false && isDigit == false;
          String specialCharacter = "";

          if(specialChar == false){ // true not right output //blank not right output
              specialCharacter = character2 + " is a Symbol.";
          }else{
              specialCharacter = character2 + " is not a symbol.";
          }
          System.out.println(specialCharacter);
      }
}
