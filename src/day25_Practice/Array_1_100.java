package day25_Practice;

import java.util.Arrays;

public class Array_1_100 {
    public static void main(String[] args) {
/*
3. Create an int array called numbers that has length of 100 and Assign 1-100 to each index
 of the array.  then print out all the even numbers. MUST use continue statement
*/

/*Create an int array called numbers that has length of 100 and Assign 1-100 to each index
 of the array.
fixed length of array 100, but have not initiazled the value yet,
so the compiler will print default value 0. Integer default value is 0
 */
        int arr[] = new int[100];
/*        System.out.println(Arrays.toString(arr)); will print 0 ==> 100 times
        arr[0] = 1;//at the index 0 i am assigning 1
        System.out.println(Arrays.toString(arr));

 */
        //lets declare a loop, that starts from 0 index and stops at last index of arr
        for(int i = 0; i <= arr.length-1; i++){
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
//print out all the even numbers. MUST use continue statement
        for(int each: arr){
            if(each % 2 != 0){
                continue;
            }
            System.out.print(each+" ");
        }





    }
}
