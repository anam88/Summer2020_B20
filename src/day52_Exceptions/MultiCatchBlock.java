package day52_Exceptions;

public class MultiCatchBlock {
    public static void main(String[] args) {
        int[] arr = {10,20};
        try {
            System.out.println(arr[20]); //ArrayIndexOutOfBound
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException is handled");
        }catch (ClassCastException e) {
            System.out.println("Class cast exception");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index out of bound exception");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Index out of bound");
        }
        System.out.println("******************************");
        String str = "Cybertek";
        try {
            System.out.println(str.charAt(200));
        }catch (RuntimeException e){
            System.out.println("String Index Out of Bound handled");
        }
        System.out.println("********************");
        try {
            Thread.sleep(1000);
        }catch (Exception e){

        }
        System.out.println("*********************************");
        try{
            System.out.println(8/0);
            System.out.println("try block");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("catch block");
        }finally {
            System.out.println("finally block");
        }
        System.out.println("Completed");
    }
}
