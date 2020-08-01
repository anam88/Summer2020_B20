package day24_Arrays;
import java.util.Scanner;
public class FindAverage {
    public static void main(String[] args) {
/*
 3. Write a program that can return the average number from an array of integers
    ex: [1,2,3]
    average: 2
    [10, 15, 5, 6]
    average: 9
 */
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers you want to enter?");
        int n = input.nextInt();
        int arr[] = new int[n];
 //       int arr[] = {10, 15, 5, 6};
        int sum = 0;

//for loop to enter the numbers
        for(int i = 0; i < n; i++) {//get user input and store them in the array
            System.out.println("Enter a number");
            int num = input.nextInt();//num: the numbers user will enter and it will be assign to index
            arr[i] = num;
        }

        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
/*
arr.length returns the number of elements present in the array
 */
        double average = sum / (double)arr.length;
        System.out.println("The sum of the array is: "+sum);
        System.out.println("Average number in the given array is: "+average);

    }
}
