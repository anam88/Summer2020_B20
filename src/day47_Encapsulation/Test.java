package day47_Encapsulation;

public class Test {
    public static void main(String[] args) {
        //public
        System.out.println(AccessModifiers.publicVariable);
        AccessModifiers.publicMethod();

        //default
        System.out.println(AccessModifiers.defaultVariable);
        AccessModifiers.defaultMethod();

        //private
     // System.out.println(AccessModifiers.privateVariable); not accessible outside the class
     // AccessModifiers.privateMethod(); not accessible outside the class
//*********************************************************************************
        Encapsulation ssnObj = new Encapsulation();
        System.out.println(ssnObj.getSsn());
        ssnObj.setSsn(123456789);
        System.out.println(ssnObj.getSsn());


    }
}
