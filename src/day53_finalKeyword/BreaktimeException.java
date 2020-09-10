package day53_finalKeyword;
//custom exception creation
public class BreaktimeException extends RuntimeException { //custom unchecked exception
    public BreaktimeException() {
        super("It's Time for a break");
        System.err.println("Time to go home");

    }
    public BreaktimeException(String str){
        super(str);
        System.err.println("Time for 15 min break");
    }

}
class Test{
    public static void main(String[] args) {
    //   throw new RuntimeException("Runtime Exception");
       throw new BreaktimeException("you need to give us Break");
    }
}

