package day39_CustomClass;

public class CarMax {
    /*
    first we create an object of the class car, and refer to car1
    then we call the instance method setInfo to set the car info object reference name.InstanceMethod
    then we initialize the instance method getInfo to get the car info
     */
    public static void main(String[] args) {
        Cars car1 = new Cars();
        car1.setInfo("Toyota","Corolla",2018,19000.50,
                "Black",19000.50);
        car1.getInfo();

        Cars car2 = new Cars();
        car2.setInfo("Lexus","RX350",2020,200,
                "Red",72000.45);
        car2.getInfo();

        Cars car3 = new Cars();
        car3.setInfo("Honda","Civic",2017,45000.50,
                "Silver",52000.45);
        car3.getInfo();

        car3.startCar();
    }
}
