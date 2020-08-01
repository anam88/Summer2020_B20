package day19_ForLoop;

public class ContinueStatement {
    public static void main(String[] args) {
        for(int i = 1; i <=5; i++){
            if(i == 3){
                continue;
            }
            System.out.println(i+" ");
        }
        System.out.println("****************");
        //create a condition for skipping a char and print the rest
        for (char ch = 'A'; ch <= 'F'; ch++) {//ch: A B C D E F
            if (ch == 'C' || ch == 'F'){
                continue;//if we put break instead of continue onle A B will be printed
            }
            System.out.print(ch+" ");
        }
        System.out.println();

        System.out.println("****************");



    }
}
