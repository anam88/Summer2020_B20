package day07_Unary_Shorthand;

public class LeapYear {
    /*
    1. create a class called LeapYear, and write a program
    that can identify if the given is Leap Year,
    print true if it's leap year, otherwise print false
		Ex:
			year = 2020  ==> short;

			LeapYear =true/false;

		output:
			2020 is leap year: true

			Assume that any year that can be divisible by 4 is leap year

     */
    public static void main(String[] args) {

        short year1 = 2020;
        int year2 = 1987;
        int year3 = 2000;
        boolean leapYear1 = (year1 % 4) == 0;
        boolean leapYear2 = (year2 % 4) == 0;
        boolean leapYear3 = (year3 % 4) == 0;

        System.out.println("Year "+year1+" is a leap year: "+leapYear1);
        System.out.println(year2+" is a leap year: "+leapYear2);
        System.out.println(year3+" is a leap year: "+leapYear3);


    }
}
