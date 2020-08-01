package day06_ComparisonOperators;

public class RelationalOperators {

          /*  > greater than
            < less than
            >= greater or equal
            <= less or equal
            == equal
            != not equal
            relational operator need to apply to same data type
            mean you cannot apply relation data type to int and string, it has to be int and int*/

    public static void main(String[] args) {

        boolean r1 = 10 > 9;
        boolean r2 = 100 < 9;
        System.out.println(r1);
        System.out.println(r2);

        // >= greater than OR equal to (if one condition is true it will return true)
        // <= less than OR equal to
        //(if one condition is true it will return true)
        // if neither situation is true you will get False

        boolean r3 = 87 >= 85; //one condition is true
        boolean r4 = 55 <= 20; //both condition are false
        System.out.println(r3);
        System.out.println(r4);

        // == equals -is use to check if two data are equal or not
        boolean r6 = 900 == 50; //false
        System.out.println(r6);
        boolean r7 = "Anam" == "Anam"; //true
        System.out.println(r7);

        // != not equal
        boolean r8 = "Anam" != "Mohammad"; //true
        System.out.println(r8);

        boolean r9 = 'A' == 65; //will not give error-corresponding number for A is 65, that is why it is true
        System.out.println(r9);
        boolean r0 = 'A' == 65 + 1 + 2; // false
        System.out.println(r0);

        boolean result1 = 100 == 100.0; //true because the 0 in the end does not change the value of 100
        System.out.println(result1);

        boolean result2 = 100 == 100.1; //false because the value change
        System.out.println(result2);

        boolean result3 = 10 == 10.9999999;//false but can we make it true by using casting
        System.out.println(result3);

        boolean result4 = 10 == (int) 10.99999; //true casting applied
        System.out.println(result4);

        boolean result5 = "100" == "100.0"; //string false due to number of character 3 vs 5
        System.out.println(result5);

        System.out.println("*******************");
        //write a statement that print true if 100 is a even number OR false if odd
        int num = 100;
        int num1 = 101;
        boolean num2 = (num % 2) == 0;
        boolean num3 = (num1 % 2) != 0;
        System.out.println("Is 100 even? "+num2);
        System.out.println("Is 101 odd? "+num3);

        System.out.println("*******************");

        int x = 1000;
        //is 1000 odd or even?
        boolean a = (x % 2) == 0;
        System.out.println("Is 1000 even number? "+a);//true //remainder is 0
        //divisible by 3: if the remainder equals to 0 that mean it is divisible to 0
        //1000 % 3 == 0
        boolean z = (x % 3) == 0;
        System.out.println("is x divisible by 3? "+z); //false //remainder not 0
        //divisible by 5: 1000 % 5 == 0
        boolean y = (x % 5) == 0;
        System.out.println("is x divisible by 5? "+y); //true //remainder is 0







    }



}
