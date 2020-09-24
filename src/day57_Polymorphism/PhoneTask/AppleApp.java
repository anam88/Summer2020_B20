package day57_Polymorphism.PhoneTask;
/*
3. create an interface named AppleApp that can inherit from Downloadable
            variable: AppStoreName
 */
public interface AppleApp extends Downloadable {//1 abstract method

     String AppStoreName = "Apple Store";//by default public static final
}
