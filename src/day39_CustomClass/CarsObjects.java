package day39_CustomClass;

public class CarsObjects {
    public static void main(String[] args) {
//creating object of the Cars class
        Cars car1= new Cars();
//calling the instance variable by referring to the reference of the object and instance variable name
    /*    car1.brand = "Toyota";
        car1.color = "Black";
        car1.mileage = 20000;
        car1.model = "Corolla";
        car1.price = 19000.50;
        car1.year = 2018;

     */
//instance method calling by referring to object reference name.methodName
        car1.setInfo("Toyota","Corolla",2018,19000.50,
                "Black",19000.50);
        System.out.println(car1.year+" "+car1.model+" "+car1.year+" "+car1.mileage+" "+ car1.color+
                " "+car1.price);

        System.out.println("=============================");

        Cars car2 = new Cars();
        car2.setInfo("Mercedes","G-550",2020,30000.50,
                "White",50000.45);
  /*    car2.brand = "Mercedes";
        car2.color = "White";
        car2.mileage = 30000;
        car2.model = "G-550";
        car2.price = 50000.45;
        car2.year = 2020;
*/
        System.out.println(car2.brand+" "+car2.model+" "+car2.year+" "+car2.mileage+" "+ car2.color+
                " "+car2.price);

        System.out.println("=============================");

        Cars car3 = new Cars();
        car3.setInfo("Honda","Civic",2017,45000.50,
                "Silver",52000.45);
        System.out.println(car3.brand+" "+car3.model+" "+car3.year+" "+car3.mileage+" "+ car3.color+
                " "+car3.price);

        System.out.println("=============================");

        Cars car4 = new Cars();
        car4.setInfo("Lexus","Hybrid",2020,200,
                "Red",72000.45);
      /*  System.out.println(car4.brand+" "+car4.model+" "+car4.year+" "+car4.mileage+" "+ car4.color+
                " "+car4.price);

       */
        car4.getInfo();








    }
}
