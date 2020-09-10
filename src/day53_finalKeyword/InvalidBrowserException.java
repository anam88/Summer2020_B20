package day53_finalKeyword;

public class InvalidBrowserException extends RuntimeException { //custom exception by inherit Runtime
    public InvalidBrowserException(){
        super("Browser name is not matching!");
    }
    public InvalidBrowserException(String str){
        super(str);
        System.err.println("Invalid browser name given");

    }


}
class Test2{
    public static void main(String[] args) {
        String name = "batch20";
        switch (name.toLowerCase()){
            case "chrome":
                System.out.println("Chrome browser is selected");
                break;
            case "firefox":
                System.out.println("Firefox browser is selected");
                break;
            case "safari":
                System.out.println("Safari browser is selected");
                break;
            default:
                throw new InvalidBrowserException("Please enter a valid browser name");//object of custom exception

        }

    }
}
