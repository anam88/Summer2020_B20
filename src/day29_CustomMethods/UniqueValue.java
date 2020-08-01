package day29_CustomMethods;

public class UniqueValue {
    public static void main(String[] args) {
        /*
        write a program to output the unique frequency
        USE FOR : EACH LOOP
                 */
        String arr[] = {"A","B","C","C","D","a","f","L","L"};

        //String a = "A"; use to check A frequency ONLY

        for(String a : arr){
           int count = 0;

           for(String each : arr){
               if(a.equalsIgnoreCase(each)){
                   count++;
               }
           }
           if(count == 1){
               System.out.println("The unique elements are: "+a);
           }
       }



    }
}
