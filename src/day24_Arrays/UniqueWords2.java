package day24_Arrays;

public class UniqueWords2 {
    public static void main(String[] args) {
         /*
        write a program that can find the unique words from an array of string
         */

        //use the for each loop

        String words[] = {"C#","C#","Java","Python","HTML","Python","C++"};

        for(String each : words){
            int count = 0;

            for(String b : words){//words represent every element in the array
                if(each.equals(b)){//if s equals b than line 17
                    count++;//i can increase by 1
                }
            }
            if(count == 1){//if the frequency equals to 1, than print the word
                System.out.print(each+" ");
            }
        }
    }
}
