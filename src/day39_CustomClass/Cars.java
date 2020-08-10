package day39_CustomClass;

//access modifier public on class level
//custom class Cars
public class Cars {
    /*
    Attributes: model, brand, year, mileage, color
     */
    /*
    data/attributes: instance variable
    instance variable are non-static
    instance variable declare outside the method, within the class
    Instance Variable can be accessed only by creating objects.
    each object will have its own copies of instance variables
     */

    //these are instance variable,
    String brand;
    String model;
    int year;
    double mileage;
    String color;
    double price;

    /*
    function/actions: instance methods
    instance methods are non-static
    instance methods are declare inside a class
    method requires an object of its class to created before it can be called
     */

    public void setInfo(String carBrand, String carModel, int carYear, double carMileage,
                        String carColor, double carPrice){
        brand = carBrand;
        model = carModel;
        year = carYear;
        mileage = carMileage;
        color = carColor;
        price = carPrice;

    }
    //2012 Toyota Corolla, Red, 10000, $45000
    public void getInfo(){
        System.out.println(year+" "+brand+" "+model+", "+color+", "+mileage+", $"+price);
    }

    public void startCar(){
        System.out.println(brand+" "+model+" is started");
    }


}
