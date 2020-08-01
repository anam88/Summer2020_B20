package day35_ArrayList;

public class SumOfDigits {
    public static void main(String[] args) {
/*
2. write a program that can return the sum of all the digits from a string
    ex:
        input: "a1b2c3"
        output: 6
            (1+2+3= 6)
    HINT: on ascii table, the characters between #48 ~ #57 are digits
 */
        String str = "a1b2c3";
        int sum = 0;
//check all character, if it is a digit add it to the sum variable
        for(int i = 0; i <= str.length()-1; i++){
            char each = str.charAt(i);//to get all index, and assign them to variable each
            if(each >= 48 && each <= 57){
//if char is between 48 - 57 than it is digit,
// if the statement is TRUE than convert each character to integer
                sum +=   Integer.parseInt(""+ each);
//first we convert(1,2,3) each to a string, than convert it to int using parseInt method
//since it will return us int, we will add it to sum
            }
        }
        System.out.println(sum);
    }
}
