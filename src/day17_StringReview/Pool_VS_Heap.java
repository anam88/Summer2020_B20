package day17_StringReview;

public class Pool_VS_Heap {
    public static void main(String[] args) {

        String s1 = "Cybertek"; //this object will be in String pool
        String s2 = "Cybertek"; //this one is also in String pool
        /*in the above example there is ONLY one object that is created and shared by s1 & s2
        variable, therefore s1 == s2 (true)*/
        System.out.println(s1 == s2);//true

        String s3 = new String("Cybertek");//heap memory

        System.out.println(s1 == s3);//false
        //false because by using NEW key word for s3 a new object was created//
        String s4 = new String("Cybertek");
        System.out.println(s3 == s4);//false because 2 objects are created for variable s3 & s4
        String s5 = "cybertek";//Java is case sensitive
        System.out.println(s5 == s2 );//false because of case sensitivity









    }

}
