package day04_Variables;

public class Concate_Add {

    public static void main(String[] args) {

        //addition: number + number
        System.out.println(12 + 13); //25
        System.out.println('A' + 2); //A = 65 + 2 = 67
        System.out.println('A' + 'B'); // 65 + 66 = 131

        //concatenation: append
        System.out.println("My age is " + 32);// My age is 32
        System.out.println("12" + 13); //1213
        System.out.println("Gender: " + 'M'); //this is concatenation output Gender: M
        System.out.println("Tax: " + 3.5 + "%" ); //Tax: 3.5% | first concat happen because left to right
        System.out.println(3.5 + '%' + " Tax"); // 3.5 + 37 = 40.5 Tax | first addition and than concat

    /* task: car information Year, Model, Type, Miles, Price. Print the output in one line using concate */

        int year = 2020;
        String brand = "Lexus";
        String model = "LC";
        short mileage = 30000;
        double price = 92950;
        String color = "Black";

        System.out.println(year + ", "+brand+" "+model+", "+ color+", "+mileage + " miles"+", "+"$"+price);

    }



}
