package day24_Arrays;
import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
/*
 2. write a program that asks user how many numbers he wants to enter,
 and get all the user inputs and store them into an array variable,
 and then write the program that can return maximum and minimum numbers
 */
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers you want to enter?");
        int n = input.nextInt();// 5 or 10
        int arr[] = new int[n];//n because we dont know how many numbers user want to enter

//since we are asking user to enter the number multiple times, that is why we use loop
        for(int i = 0; i < n; i++){//get user input and store them in the array
            System.out.println("Enter a number");
            int num = input.nextInt();//num: the numbers user will enter and it will be assign to index
            arr[i] = num;//arr[i] represent index of num
        }
//assume first index in the given array is max
        int max = arr[0];
//assume first index in the given array is min
        int min = arr[0];
//since we need to iterate through all the numbers to check which is max or min, we use Loop
        for(int i = 0; i <= arr.length-1; i++){//to get all index we use arr.length-1
//            System.out.print(arr[i]+" ");
//compare line 21 with the remaining array, and whichever is greater assign it to max variable
            if(arr[i] > max){
                max = arr[i];
            }
//compare line 23 with the remaining array, and whichever is lesser assign it to max variable
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Max Value is: "+max);
        System.out.println("Min Value is: "+min);
    }
}
