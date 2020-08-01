package day24_Arrays;

public class UniqueWords {
    public static void main(String[] args) {
        /*
        write a program that can find the unique words from an array of string
         */
        String arr[] = {"C#","C#","Java","Python","HTML","Python","C++"};

       for(int j = 0; j <= arr.length-1; j++){
           String s = arr[j];//how many types the word on 0 index occur
           int count = 0;//to store the frequency of s

           for(int i = 0; i <= arr.length-1; i++) {
               String each = arr[i];
               if (s.equals(each)) {//if the word is unique than add the frequency to 1
                   count += 1;
               }
           }
           if(count == 1){
               System.out.print(s+" ");
           }
       }
    }
}

