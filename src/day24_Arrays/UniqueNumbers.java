package day24_Arrays;

public class UniqueNumbers {
    public static void main(String[] args) {
/*
1. write a program that can print out the unique numbers from an array of integers
Ex:
    int[] arr ={1,1,2,3,3,4}
    output:2 4
*/
        int[] arr ={1,1,2,3,3,4,9,10,50,50,6,0,95};//find unique number in the given array of integers

        for(int j = 0; j <= arr.length-1; j++){
            //let's verify if the first element is unique
            int n1 = arr[j]; //returns int, therefore assign it to datatype int//output: 1
//we will store the frequency of array in this variable
            int count = 0;
//let's use for loop to find the frequency of each int
            for(int i = 0; i <= arr.length-1; i++){//only calculate frequency of n1
                int each = arr[i];//returns integer. for loop will execute 6 times//1 1 2 3 3 4
                if(each == n1){//if the number is unique than print it
                    count += 1;
                }
            }
            if(count == 1){
                System.out.print(n1+" ");
            }
        }
    }
}
