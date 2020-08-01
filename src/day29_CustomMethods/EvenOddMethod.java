package day29_CustomMethods;

public class EvenOddMethod {
// Print EVEN and ODD number between 1 - 100 and print them on one line with space
    public static void main(String[] args) {
        EvenNum();
        System.out.println();
        OddNum();
    }

    public static void EvenNum(){
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                System.out.print(i+" ");
            }
        }
    }

    public static void OddNum(){
        for(int i = 1; i <= 100; i++){
            if(i % 2 != 0){
                System.out.print(i+" ");
            }
        }
    }
}
