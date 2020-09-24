package day57_Polymorphism.PhoneTask;
/*
2. create an interface named AndroidApp that can inherit from Downloadable
            variable: AppStoreName
 */
public interface AndroidApp extends Downloadable { // 1 abstract method
    String AppStoreName = "Google Play"; //by default public static final
}
