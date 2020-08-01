package day19_ForLoop;
/*
print the even OR odd numbers by using continue statement
 */
public class OddEven2 {
    public static void main(String[] args) {
        System.out.println("Odd Numbers between 0 to 50");
        for (int i = 0; i <= 50; i++){
            if(i % 2 == 0){//skip the even numbers
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("Even Numbers between 0 to 50");
        for (int i = 0; i <= 50; i++){
            if(i % 2 != 0){//skip the odd numbers
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
