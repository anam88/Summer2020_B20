package day40_CustomeClassPractice;

import sun.security.x509.IssuerAlternativeNameExtension;

import java.util.ArrayList;
import java.util.Arrays;

public class OfferInfo {
    public static void main(String[] args) {
        //create an object
        Offer offer1 = new Offer();
        Offer offer2 = new Offer();
        Offer offer3 = new Offer();
        Offer offer4 = new Offer();
        Offer offer5 = new Offer();
        Offer offer6 = new Offer();
        Offer offer7 = new Offer();

        offer1.setOfferInfo(100000, "VA", true, true,
                true, "SDET", true);
        offer2.setOfferInfo(175_000,"VA",true,true,
                false, "SDET", true);
        offer3.setOfferInfo(125000,"VA", true, true,
                true, "SDET", true);
        offer4.setOfferInfo(130_000,"PA",true,false,
                false, "QA", true);
        offer5.setOfferInfo(100_000,"CA",true,false,
                false, "QA", true);
        offer6.setOfferInfo(120000,"CO",true,true,
                true,"Senior SDET",true);
        offer7.setOfferInfo(110_000,"GA",true,false,
                false, "QA", true);

        ArrayList<Offer> jobOffers = new ArrayList<>();
        //add all offers in arrayList
        jobOffers.addAll(Arrays.asList(offer1,offer2,offer3,offer4,offer5,offer6,offer7));
        //get all offer info
        for(Offer eachOffer : jobOffers){
            eachOffer.getOfferInfo();
        }
        /*remove offers that are less than 120k
        p stands for salary that are less than 120k
        jobOffers.removeIf( p -> p.salary < 120000);
        System.out.println("Numbers of offers: "+jobOffers.size());
        */

     /*   String myLocation = "VA";
//if the offer is less than 120 OR not from local area VA
        jobOffers.removeIf(p -> p.salary < 120000 || p.state.equals(myLocation));
        System.out.println("Numbers of offers: "+jobOffers.size());

      */
        //does not have PTO or does not have benefits or is not full time or less than 120 salary
        jobOffers.removeIf((p -> p.hasPTO == false || p.hasBenefit == false
                || p.isFullTime == false || p.salary < 120000));
        System.out.println("Numbers of offers: "+jobOffers.size());




    }
}
