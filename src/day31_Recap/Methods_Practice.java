package day31_Recap;

public class Methods_Practice {
    public static void main(String[] args) {
        //void method
        biggerNum(5,9);
//return type method (you can assign it to a different variable to re use it later or print it)
        System.out.println("The max number is"+maxNum(40, 5));
    }

    /*
    create a method that can verify the bigger number between two numbers
     */
    //lets do it with void method first
    public static void biggerNum(int n1, int n2){
        int biggerNum = n1 > n2 ? n1 : n2;
        System.out.println(biggerNum+ " is a bigger number");
/*output is 9, we cannot reuse a value, it is just one time thing. it cannot do anything extra
*/
    }
    //let's do it with return type
    public static int maxNum(int n1, int n2){
        int maxNum = n1 > n2 ? n1 : n2;
        return maxNum;
    }
}
