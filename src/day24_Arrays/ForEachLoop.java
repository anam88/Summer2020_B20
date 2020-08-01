package day24_Arrays;

public class ForEachLoop {
    public static void main(String[] args) {


        //first create an array
        int arr[] = {1,2,3,4,5,6,7,8,9,-1,-2,-3};
//print this array by using loop
        for(int i = 0; i <= arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("============================================================");

//FOR EACH LOOP
/* Syantax:
for(DataType variable : Collection Of Data){
}
 */
        int arr1[] = {1,2,3,4,5,6,7,8,9,-1,-2,-3};
        for(int each : arr1){//each represent the elements
            System.out.print(each+" ");
        }
        System.out.println();
        System.out.println("============================================================");

        String groupGirls[] = {"Fatma","Iman","Alena","Zarina","Anam"};
        for(String each : groupGirls){
            System.out.println(each+" ");
        }




    }
}
