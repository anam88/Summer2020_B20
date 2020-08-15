package day41_toString;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObjects2 {
    public static void main(String[] args) {
        //creating array with size of 5
        Carpet[] carpets = {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};

        carpets[0].customOrder(10.5,15.5,40.49,false);
        carpets[1].customOrder(15.5,10.5,30.20,true);
        carpets[2].customOrder(4.5,3.5,7.5,false);
        carpets[3].customOrder(12.5,20.5,100.50,true);
        carpets[4].customOrder(6.5,5.5,7.5,true);

/*
create two ArrayList of carpets:
persianCarpets
        regularCarpets
write a program to store all the persian Carpets into the list of persianCarpets,
and store all regular carpets into the list of regularCarpets
use for each loop to print out all the persian carpets
        */

        ArrayList<Carpet> persianCarpet = new ArrayList<>();
        persianCarpet.addAll(Arrays.asList(carpets));//adding all carpets
        persianCarpet.removeIf(p -> !p.isPersian) ;//removing the carpets that are not persian
        ArrayList<Carpet> regularCarpet = new ArrayList<>();
        regularCarpet.addAll(Arrays.asList(carpets)); //adding all carpets
        regularCarpet.removeAll(persianCarpet);//removing the carpets that are persian

        System.out.println("Number of persian carpets: "+persianCarpet.size());
        System.out.println("Number of regular carpets: "+regularCarpet.size());

    }
}
