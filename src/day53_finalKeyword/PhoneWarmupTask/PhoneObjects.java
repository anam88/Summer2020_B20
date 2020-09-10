package day53_finalKeyword.PhoneWarmupTask;

import java.util.ArrayList;
import java.util.Arrays;

/*
 5. create a class called phone objects:
 create three objects of each phone and test everything out

 */
public class PhoneObjects {
    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("iPhone 7",449, 4.7, true);
        Iphone iphone2 = new Iphone("iPhone xs",999,6.5,true);
        Iphone iphone3 = new Iphone("iPhone SE",1250,4.7, true);

        ArrayList<Iphone> allIphones = new ArrayList<>();
        allIphones.addAll(Arrays.asList(iphone1, iphone2, iphone3));

        //printing all iphone information
        for (Iphone eachIphone : allIphones){
            System.out.println(eachIphone.toString());
        }
        System.out.println("************************************************");

        SamSung samsung1 = new SamSung("Galaxy Note 20",349.99,6.7,true);
        SamSung samsung2 = new SamSung("Galaxy Fold",699.99,7.30,true);
        SamSung samSung3 = new SamSung("Galaxy Z Flip",799.99,6.7,true);
        ArrayList<SamSung> allSamsungs = new ArrayList<>();
        allSamsungs.addAll(Arrays.asList(samsung1,samsung2,samSung3));

        //let's print Samsung phone information whose screenSize == 6.7
        for(SamSung eachSamsung : allSamsungs){
            if(eachSamsung.screenSize == 6.7){
                System.out.println(eachSamsung.toString());
            }
        }

        System.out.println("************************************************");
        Nokia nokia1 = new Nokia("Nokia 9 Pure View",34.99,5.99,true);
        Nokia nokia2 = new Nokia("Nokia 3.1 Plus",45.99,6.0, false);
        Nokia nokia3 = new Nokia("Nokia 3.1 C",49.99,5.45,false);

        ArrayList<Nokia> allNokias = new ArrayList<>();
        allNokias.addAll(Arrays.asList(nokia1,nokia2,nokia3));

        //let's print the information for Nokia phone that has touch screen
        for(Nokia eachNokia : allNokias){
            if(eachNokia.isTouchScreen == true){
                System.out.println(eachNokia);
            }
        }
        System.out.println("**************************************************");




    }
}
