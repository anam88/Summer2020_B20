package day51_Exceptions;
class X{
    public X(){
        System.out.println("X");
    }
}

class Y extends X{
    public Y(){
        System.out.println("Y");//parent class is X
    }
}

class Z extends Y{
    public Z(){
        System.out.println("Z");
    }
}
public class Practice {
    public static void main(String[] args) {
        new X(); //print X because it is a super class
        System.out.println("********");
        new Y(); //prints X from super class, than Y from child Class Y
        System.out.println("********");
        new Z(); //prints X and Y from parent class, and Z from child class
    }
}
