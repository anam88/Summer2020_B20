package day29_CustomMethods;

public class UniqueWord {
    /*
    8. write a method that can print out the unique elements from an array of string

     */
    public static void main(String[] args) {
        String words[] = {"Java","JAVA","Python","JaVa","java"};
        unique(words);
    }

    public static void unique(String arr[]){

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
