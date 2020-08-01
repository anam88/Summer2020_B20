package day30_CustomMethods;

public class ReturnMethod2 {
    public static void main(String[] args) {
       //task1 reverse it
        String name = "muhtar";
        revStr1(name);
        //task 2 if the string is palindrome or not
        String reverseName = revStr2(name);
        System.out.println(name.equalsIgnoreCase(revStr2(name)));

    }




    //void method FIRST reverse the string
    public static void revStr1(String str){

        String result = "";//to store the reverse order
        for(int i = str.length()-1; i >= 0; i--){
            result += str.charAt(i);
        }
        System.out.println(result);
    }
    //return type method
    //if the string is palindrome or not
    public static String revStr2(String str){
        String result = "";//to store the reverse order
        for(int i = str.length()-1; i >= 0; i--){
            result += str.charAt(i);
        }
        return(result);
        //this value will return a data that we can reuse to check if the original value is palindrome
    }
}
