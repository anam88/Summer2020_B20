package day51_Exceptions;

import javax.crypto.spec.PSource;

class B{
    public B() {//default constructor
        System.out.println("super class has default constructor");
    }
}
public class SuperKeyWord2 extends B{
    public SuperKeyWord2(){//it is mandatory for a subClass to call superClass constructor
// super(); this is given implicitly because the parent class has default constructor to call parent class constructor
        System.out.println("sub class default constructor");
    }

    public static void main(String[] args) {
        new SuperKeyWord2();
    }
}
