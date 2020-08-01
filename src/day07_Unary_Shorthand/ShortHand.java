package day07_Unary_Shorthand;

public class ShortHand {
    public static void main(String[] args) {

        int a = 100;
        a *= a; // a = a * a
        System.out.println(a);

        int b = 2;
        b *= 3; // b = 2 * 3
        System.out.println(b);//6
        //*********************************************//
        //+=:
            int z = 300;
            z += 200;
        System.out.println("the value of z is: "+z);

        String fl_name = "John";
//            fl_name = fl_name+" Smith"; //one way to do it
            fl_name += " Smith";
        System.out.println(fl_name);

        //*********************************************//

        String fullName = "Anam";
        fullName += " Masroor";
        System.out.println(fullName);
        //*********************************************//

        int c = 5;
        c *= 2;
        System.out.println("The value of c is: "+c);
        //*********************************************//
        int budget = 100000;
        budget /= 2;
        System.out.println("The value of budget is: "+budget);

        //*****************************/
        int x = 100;
        x %= 3; //remainder of 100/3 = 1
        System.out.println("the value of x is: "+x);

        double num = 400.5;
            num %= 2;
        System.out.println("the value of num is: "+num);


    }
}
