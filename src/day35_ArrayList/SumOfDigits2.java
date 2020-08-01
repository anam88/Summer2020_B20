package day35_ArrayList;

public class SumOfDigits2 {
    public static void main(String[] args) {
/*SECOND WAY OF DOING THE TASK
2. write a program that can return the sum of all the digits from a string
    ex:
        input: "a1b2c3"
        output: 6
            (1+2+3= 6)
    HINT: on ascii table, the characters between #48 ~ #57 are digits
 */
        String str = "a1b2c3";
        int sum = 0;
        for(char each : str.toCharArray()){//each element in this array is char
    //now verify if each char is a digit or not by using Character class, and digital method
            if(Character.isDigit(each)){
                sum +=   Integer.parseInt(""+ each);
            }
        }
        System.out.println(sum);
    }
}
