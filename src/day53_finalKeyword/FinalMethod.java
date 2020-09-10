package day53_finalKeyword;
/*
•	If you make any method as final, you cannot override it.
o	Since we cannot override, inheritance cannot take place
 */

class A{
    public final void method1(){
        System.out.println("enter username and password");
    }
}
public class FinalMethod extends A{

 /*   @Override  //--to check if the method is overridden
    public void method1() { cannot override due to final word
        System.out.println("Enter something else");
    }

  */
}
