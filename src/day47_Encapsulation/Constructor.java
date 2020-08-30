package day47_Encapsulation;

public class Constructor {
    static {
        System.out.println("static block execute first and only one");
    }
    public Constructor(int a){
      //  this("apple");
        System.out.println("int argument");
    }
    public Constructor(double a){
        this(10);
        System.out.println("double arg");
    }
    public Constructor(String str){
        this(5.5);
        System.out.println("string argument");
    }

    public static void main(String[] args) {
        new Constructor("A");


    }

}
