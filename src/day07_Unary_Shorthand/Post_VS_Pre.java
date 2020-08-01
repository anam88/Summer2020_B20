package day07_Unary_Shorthand;

public class Post_VS_Pre {

    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a);//11 //increase the value immediately
        System.out.println(a);// 11
        System.out.println(--a);//10 //decrease the value immediately

        System.out.println("*****************");

        int b = 10;
        System.out.println(b++);//output 10
        System.out.println(b); //output 11

        System.out.println("********task*********");

        int c = 25; //c = 26
        int d = c++; // d = 25
        System.out.println("Post Increment value "+c);
        System.out.println(d);

        System.out.println("********task*********");
        int e = 25;
        e++;
        System.out.println("Post Increment value of e is "+e);

        System.out.println("********task*********");
        int x = 8;
        //first step x = 8
        int y = x--; //final value of y = 8
        System.out.println("the value of y is "+y);
        System.out.println("the value of x is "+x); //7 // 8 - 1 = 7 //second step

        System.out.println("********task*********");

        int i = 1;
        i = -i-- + i++ / -i-- * --i;
        //-i-- current value of i = -1 (since we are post-decrementing, the value of i in
        //next step will be -1 - 1 = 0)
        //i++ current value of i = 0 (since we are post incrementing, the value of i in
        //next step will be 1)
        //-i-- current value of i = -1 (since we are post-decrementing, the value of i in
        //next step will be -1 - 1 = 0
        //--i current value of i  = 0
        //i = -1 + 0 / -1 * 0
        //i = -1 + 0 * 0 | -1 + 0 = -1 | final value of i = -1
        System.out.println("The value of i is: "+i);


        int z = 50;
        z = --z + z++ + z-- + z++;
        // --z = pre-decrement z = 49
        // z++ = current value of z = 49 (since we are post incrementing, the value of z
        //in the next step will be 50
        //z-- = current value of z = 50 (since we are post decrementing, the value of z
        //in the next step will be 49
        //z++ = current value 49
        // 49 + 49 + 50 + 49
        System.out.println("the value of z is: "+z);

        System.out.println("********task*********");
        int j = 4;
        int m = j * 4 - j++;
        // 4 * 4 = 16
        //m = 16 - j++ (j++-current value of j = 4)
        //m = 16 - 4
        System.out.println("the value of m is: "+m);






    }
}
