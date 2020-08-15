package day41_toString;

import java.text.DecimalFormat;

public class Carpet {
/*
warmup tasks:
1. create a custom class for the Carpet class that should contain the following:

instance variables:
        width, length, unitPrice, isPersian (boolean)
instance methods:
customOrder(): sets the carpet' width, length, unitPrice, & isPersian
calcCost(): should be able to calculate the total cost of the carpet and return it as double
getCarpetInfo(): should be able to display all the info of the carpet
including the total cost of the carpet as calculated by calcCost() total price of carpet= (width*length)*unitPrice
if the carpet is persian  carpet that's came from Turkey, add 200$ to the totalPrice


 */
    double width;
    double length;
    double unitPrice;
    boolean isPersian;

    public void customOrder(double width, double length, double unitPrice, boolean isPersian){
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }
    public double calcCost(){
        double totalPrice = 0;
        totalPrice = (width * length) * unitPrice;
//return if carpet is persian add 200 in total price else return regular total price
        return (isPersian) ? totalPrice + 200 : totalPrice;
    }
    public void getCarpetInfo(){
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("======================================");
        System.out.println("Carpet Width is: "+width+"\nCarpet Length is: "+length+
                "\nUnit Price of the carpet: $"+df.format(unitPrice)+ "\nIs Carpet Persian?: "+isPersian+
                "\nCarpet Total Cost: $"+df.format(calcCost()));
        System.out.println("======================================");
    }
    public String toString(){
        return "Width: "+width+"\nlength: "+length+"\nUnit Price: $"+unitPrice+
                "\nIs the carpet Persian? "+isPersian+"\nTotal Cost: $"+calcCost();
    }



}
