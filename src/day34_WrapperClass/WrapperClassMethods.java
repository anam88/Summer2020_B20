package day34_WrapperClass;

public class WrapperClassMethods {
    public static void main(String[] args) {
        String str = "123";
//we can convert "123" which is a string to int by using wrapper class method
          int n1 = Integer.parseInt(str);//returns a primitive at end
//since it convert the string value to primitive therefore, we can assign it to the int variable
        System.out.println(str);//123 String, if does concat mean string
        System.out.println(n1);//123 int, if it does addition mean int

        String str1 = "7.5";
        Double d1 = Double.parseDouble(str1);//autoboxing
        System.out.println(str1);

        String str2 = "true";
        boolean b1 = Boolean.parseBoolean(str2);
//parse method ignore case sensitivity
        System.out.println(b1);
        System.out.println("=========================================");

        //valueOf()

        String s = "500";
        //convert s to Double wrapper class
        Double d = Double.valueOf(s); //unboxing
    //valueOf() will always return wrapper class value
        System.out.println(d);






    }
}
