package day31_Recap;

public class WarmupTasks {

/*
1.  write a return method called frequency that accepts two parameters:
 string str and char ch, the method returns the frequency of the ch from the str as an int
Ex:
    frequency("AAA", 'A') ==>  3
//compare each character of array with char
    frequency("ABAB", 'B') ==> 2
Note: MUST use Arrays and for each loop
please copy paste the method to the util class

*/
    public static void main(String[] args) {
        String str = "abcDaaafmOO";
        String uniques = "";//lets use string str to find unique characters
    //    int count = frequency(str,'a');//return type is int, therefore assign to int variable
     //   System.out.println(count);//print the frequency of char 'a'
//This step is use to identify if the character is unique, let's use loop for this
        for (char each : str.toCharArray()){
  //          char ch = str.charAt(i); //to get char as a data type
            int count = frequency(str, each);
            //this is a frequency
            if(count == 1){//if count is equal to 1, concat it to unique variable
                uniques += each;
            }
        }
        System.out.println("unique values are: "+uniques);
        System.out.println("========================");
        String str2 = "ppppoifugggggsxL";
        String uniques2 = uniques(str2);
        System.out.println("unique values are: "+uniques2);
    }
    //method type is int because char will return an integer
    public static int frequency(String str, char ch){
//will return frequency of char from the string
        int count = 0; //to save the frequency of char
/*each character is a char : and need to compare it with str.
every time it matches we add frequency to count*/

        for(char each : str.toCharArray() ){
            if(each == ch){//every time this is true, count will increase to 1
                count++;
            }
        }
        //return the frequency of one character from the string
        return count;
    }
//try to find unique value from given string
//THIS METHOD CAN BE REUSED TO FIND THE UNIQUE VALUE
    public static String uniques(String str){
        String uniques = "";//lets use string str to find unique characters
        //    int count = frequency(str,'a');//return type is int, therefore assign to int variable
        //   System.out.println(count);//print the frequency of char 'a'
//This step is use to identify if the character is unique, let's use loop for this
        for (char each : str.toCharArray()){
            //          char ch = str.charAt(i); //to get char as a data type
            int count = frequency(str, each);
            //this is a frequency
            if(count == 1){//if count is equal to 1, concat it to unique variable
                uniques += each;
            }
        }
        return uniques;

    }

}
