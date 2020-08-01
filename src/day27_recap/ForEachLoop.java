package day27_recap;

public class ForEachLoop {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};

        for(int i = 0; i <= arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("===================================");

        for(int each : arr){
            System.out.print(each+" ");
        }
        System.out.println();
        System.out.println("===================================");
        //print array in reverse order

        for(int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("===================================");
//print out the data that is NOT divisble by 3 skip it,
// print divisible by 3 use for each loop and continue
        int scores[] = {10,20,30,40,50,60,70,80,90,100,110,60,9};
        int countDivisbleby3 = 0;
        for(int each : scores){
            if(each % 3 != 0){//if not divisible by 3 skip it, if it is than print it
                continue; //skip the iterator
            }
            countDivisbleby3++;
            System.out.print(each+" ");
        }
        System.out.println();
        System.out.println("The number divisible by 3 are: "+countDivisbleby3);

        System.out.println("===================================");
        //print out the strings that contain C
        String names[] = {"AB","ABC","A","AB","ABCD"};

        for(String each : names){
            if(each.contains("C")){//if string contain C print it
                System.out.println(each);
            }
        }
        System.out.println("===================================");
        //find min and max

        int scores1[] = {80,75,15,5,900,104,56,4,10};
        int max = scores1[0]; //temp, we will compare this with all elements in array
        int min = scores1[0];
//each represent all the element in the array
        for(int each : scores1){
            if(each > max){//if each is greater than max, than assign it to max
                max = each;
            }
            if(each < min){//if each is smaller than min, than assign it to min
                min = each;
            }
        }
        System.out.println("Max number is: "+max);
        System.out.println("Min number is: "+min);





    }
}
