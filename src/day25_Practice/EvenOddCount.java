package day25_Practice;

public class EvenOddCount {
    public static void main(String[] args) {
/*
4. Write a program that can count the
    even and odd number from an array of integers
*/
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11};
//whenever there is a even OR odd number occur we will increase the frequency by 1 in the below variables
        int countEven = 0;
        int countOdd = 0;
        String even = "";
        String odd = "";

        for(int each : arr){
            if(each % 2 == 0){
                countEven += 1; //will give the total count of even numbers in the given array
                even += each + " ";//will print the even numbers
            }else{
                countOdd++;
                odd += each + " ";
            }
        }
        System.out.println("The count of Even Numbers are: "+countEven+
                "\nThe even numbers are: "+even);
        System.out.println("The count of Odd Numbers are: "+countOdd+
                "\nThe odd numbers are: "+odd);


    }
}
