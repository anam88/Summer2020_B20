package day43_static;

public class Variables {
/*local variable: only valid within the block of method

 */
    int d; //instance var
    static int s;

    public void method2(){
        System.out.println(d);
        System.out.println(s);
    }

    public static void main(String[] args) {
        System.out.println(s);
        //System.out.println(d); instance var you need object
        Variables obj = new Variables();
        System.out.println(obj.d);//only way to call instance var, in static method

    }
    public static void method1(){
        int a;//local variable
        if(true){//local variable only within if block
            int b = 20;
        }
     //   System.out.println(a); //local variable need to be initialized before using
    }

}
