package day44_Constructor;

public class PizzaObject {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("Medium",2,5);
        Pizza pizza2 = new Pizza("Large",1,2);
        System.out.println(pizza1);
        System.out.println(pizza2);
    }
}
