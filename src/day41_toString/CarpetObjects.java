package day41_toString;


import java.util.ArrayList;

public class CarpetObjects {
/*  create a class called carpetObjects, and create an array of the carpet
that contains 5 carpet objects
(make sure you set the instance variables of those objects)
================================

*/
    public static void main(String[] args) {
        //creating array with size of 5
        Carpet[] carpets = {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};

        carpets[0].customOrder(10.5,15.5,40.49,false);
        carpets[1].customOrder(15.5,10.5,30.20,true);
        carpets[2].customOrder(4.5,3.5,7.5,false);
        carpets[3].customOrder(12.5,20.5,100.50,true);
        carpets[4].customOrder(6.5,5.5,7.5,true);

        //to get carpetInfo of carpet objects of all carpet use for each loop
        for(Carpet eachCarpet : carpets){
            eachCarpet.getCarpetInfo();
        }
/*
create two ArrayList of carpets:
persianCarpets
regularCarpets
write a program to store all the persian Carpets into the list of persianCarpets,
and store all regular carpets into the list of regularCarpets
use for each loop to print out all the persian carpets
         */

        ArrayList<Carpet> persianCarpet = new ArrayList<>();
        ArrayList<Carpet> regularCarpet = new ArrayList<>();

        for(int i = 0; i < carpets.length; i++){
            if(carpets[i].isPersian == true){
                persianCarpet.add(carpets[i]);
            }else{
                regularCarpet.add(carpets[i]);
            }
        }
        System.out.println("Number of persian carpets: "+persianCarpet.size());
        System.out.println("Number of regular carpets: "+regularCarpet.size());


 }



}
