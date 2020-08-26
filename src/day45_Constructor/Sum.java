package day45_Constructor;

public class Sum {
    /*
    create a class called Sum
     */
    public Sum(){
        //no parameter constructor
    }
    public Sum(int a, int b){
        System.out.println(a+b);
    }
    public Sum(double a, double b){
        System.out.println(a+b);
    }
    public Sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public Sum(double a, double b, double c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        Sum obj1 = new Sum(5,10);
        Sum obj2 = new Sum(4.5,6.3,8.9);
        Sum obj3 = new Sum(4,6,5);
        Sum obj4 = new Sum(1.0,5.8,4.25);

    }

}
