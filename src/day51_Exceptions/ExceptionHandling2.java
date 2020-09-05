package day51_Exceptions;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        //unchecked exception, handled by try and catch
        String exceptionResult = "";
        try{
            System.out.println(10 / 0);
        }catch (ArithmeticException e){
            exceptionResult = e.getMessage();
        }
        System.out.println(exceptionResult);

    }

}
