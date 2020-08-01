package day08_LogicalOperators;

public class Warmup_Task {

    /*1. write a java program that converts gallons to liters
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
 */
    public static void main(String[] args) {
        double gallon = 5;
        double liters = (gallon * 3.785);
        System.out.println("********Warm Up Task1********");
        System.out.println(gallon+" gallon"+" amount is equal to: "+liters+"L");

         /*1. write a java program that converts liters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
 */
        double lit = 10;
        double gal = (lit/ 3.785);
        System.out.println("********Warm Up Task2********");
        System.out.println(lit +" liters"+" amount is equal to: "+(int)gal+"gal");

        /*manually calculate the following code fragments:
                1. int a = 200;
                    int b = -a++ + - --a * a-- % 2
                    b = ?
                2. int x = 300;
                   int y = 400;
                   int z = x + y - x * y +x / y; */
        int a = 200;
        int b = -a++ + - --a * a-- % 2;
        //-a: current value -200, post increment 201
        //--a: pre-decrement makes it 200 | current value 200
        //a--: current value 200 | post-decrement makes value 198
        // -200 - 200 * 200 % 2; (first we will do multiplication because * and %
        // have some precedence level, there we will do the function that comes first from LT to RT)
        //-200 - 40000 % 2;
        // -200 - 0
        //-200
        System.out.println("********Warm Up Task3********");
        System.out.println("The value of b is: "+b);

        int x = 300;
        int y = 400;
        int z = x + y - x * y + x / y;
        //300 + 400 - 300 * 400 + 300 / 400
        //300 * 400 = 120000 -first multiply
        //300/400 = 0, because int/int = 0 (in math it will give 0.75) -second divide
        //300 + 400 - 120000 + 0
        //700 - 120000
        //-11930
        System.out.println("********Warm Up Task4********");
        System.out.println("The value of z is: "+z);






    }
}
