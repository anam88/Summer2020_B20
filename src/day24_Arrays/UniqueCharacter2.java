package day24_Arrays;
import java.util.Scanner;
public class UniqueCharacter2 {
    public static void main(String[] args) {
/*
Second approach to find the unique word by using nested loop
 */
//if number of the occurrence is 1 it means it only occurs once
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = input.next();
        String unique = "";//empty string so we can store unique value in it
//lets create another loop so it can iterate through all the characters instead of just index 0
        for (int j = 0; j <= str.length()-1; j++){
            char ch1 = str.charAt(j);//how many times the first character occur in the string //a
            int count1 = 0;//so we can store frequency of the ch1 in it

//using for loop to finding the frequency of ch and assign it to each
//we are going to compare str with ch1 and store the value in count, to do that we will use loop
            for(int i = 0; i <= str.length()-1; i++){
                char each  = str.charAt(i);//will check the EACH index of all character in the string and will store them in count
//if this ch1 == each how many times it occurs in the string, increase the count by 1
                if(ch1 == each){
                    count1 += 1;
//this will tell how many times a occur in the string because at ch1 we are using 0 index
                }
            }
//if the frequency is 1 means it is unique
            if(count1 == 1){
                unique += ch1;
            }
        }
        System.out.println("the unique character in the string is: "+ unique);

    }
}
