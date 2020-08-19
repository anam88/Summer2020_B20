package day43_static;

public class Static_Vs_Instance {
    static int staticVariable;
    int instanceVariable;

    public static void main(String[] args) {
        Static_Vs_Instance obj1 = new Static_Vs_Instance();
        obj1.instanceVariable = 100;
        obj1.staticVariable = 500;
        Static_Vs_Instance obj2 = new Static_Vs_Instance();
        obj2.instanceVariable = 200;
        obj2.staticVariable = 400;

        System.out.println(obj1.instanceVariable);
        System.out.println(obj2.instanceVariable);

        System.out.println("======================================");
        System.out.println(obj1.staticVariable); //500 than 400 because we gave new value
        System.out.println(obj2.staticVariable); //500 than 400 because we gave new value
        System.out.println(Static_Vs_Instance.staticVariable);

    }
}
