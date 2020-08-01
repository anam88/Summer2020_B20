package day33_LocalDateTime;

public class ArrayUniqueNumber {
/*
 Task03:
    1. create a method that can print out the unique numbers from an array of integer
    2. create a method that can print out the unique numbers from an array of double
    3. create a method that can print out the unique words from an array of String
    4. create a method that can print out the unique characters from an array of chars
    MUST USE FOR EACH LOOP
 */
    public static void main(String[] args) {
        int[] arr = {2,2,1,3,3,4,5,7,7,7};

        for(int element : arr){
            int count = 0; //to get the frequency

            for(int a : arr){
                if(element == a){
                    count++;
//if the element is equal to the element in the array than the count should increase by 1
                }
            }
//if the count is unique than print it out
            if(count == 1){
                System.out.println(element+" ");
            }
        }
        System.out.println();

        System.out.println("======================");
        int[] n1 = {10,20,101,10,10,40,30,701,85};
        uniqueElements(n1);
        System.out.println("======================");
        double[] d1 = {4.0,8.0,2.0,2.0,2.0,5.0,4.0,4.0,9.9,5.0};
        uniqueElements(d1);
        System.out.println("======================");
        char[] ch = {'A','B','B','C','D','D'};
        uniqueElements(ch);
        System.out.println("======================");
        String[] str = {"B","B","Z","X","A","A"};
        uniqueElements(str);


/*        int element = arr[0];
        int count = 0; //to get the frequency

        for(int a : arr){
            if(element == a){
                count++;
//if the element is equal to the element in the array than the count should increase by 1
            }
        }
//if the count is unique than print it out
        if(count == 1){
            System.out.println(element);
        }

 */
    }
    public static void uniqueElements(int[]arr){
        for(int element : arr){
            int count = 0; //to get the frequency

            for(int a : arr){
                if(element == a){
                    count++;
//if the element is equal to the element in the array than the count should increase by 1
                }
            }
//if the count is unique than print it out
            if(count == 1){
                System.out.print(element+" ");
            }
        }
        System.out.println();
    }

    public static void uniqueElements(double[]arr){
        for(double element : arr){
            int count = 0; //to get the frequency

            for(double a : arr){
                if(element == a){
                    count++;
//if the element is equal to the element in the array than the count should increase by 1
                }
            }
//if the count is unique than print it out
            if(count == 1){
                System.out.print(element+" ");
            }
        }
        System.out.println();
    }

    public static void uniqueElements(char[]arr){
        for(char element : arr){
            int count = 0; //to get the frequency

            for(char a : arr){
                if(element == a){
                    count++;
//if the element is equal to the element in the array than the count should increase by 1
                }
            }
//if the count is unique than print it out
            if(count == 1){
                System.out.print(element+" ");
            }
        }
        System.out.println();
    }

    public static void uniqueElements(String[]arr){
        for(String element : arr){
            int count = 0; //to get the frequency

            for(String a : arr){
                if(element.equals(a)){
                    count++;
//if the element is equal to the element in the array than the count should increase by 1
                }
            }
//if the count is unique than print it out
            if(count == 1){
                System.out.print(element+" ");
            }
        }
        System.out.println();
    }



}
