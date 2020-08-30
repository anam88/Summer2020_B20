package day48_Inheritance;

class A {
    //parent class cannot inherit child
}
class B extends A{
    //One class can only extend one class
    //One child can have one parent
}
class C extends B{
    //C is grandKid of class A
}

public class Inheritance1 extends A{
    //parent can have multiple childs

}

