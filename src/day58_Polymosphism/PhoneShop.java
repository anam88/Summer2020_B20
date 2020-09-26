package day58_Polymosphism;

import day57_Polymorphism.PhoneTask.Iphone;
import day57_Polymorphism.PhoneTask.Phone;
import day57_Polymorphism.PhoneTask.Samsung;

import java.util.ArrayList;
import java.util.Arrays;

/*
  (Phone is imported from day57 package)
        create an arrayList called phoneShop and store all phone objects from array of phone
        write a program that can count the total number of Iphone, Samsung and Huawei from the list

 */
public class PhoneShop {
    public static void main(String[] args) {

        Phone[] phones = {
                new Iphone("12", 1000,"6.1"),
                new Samsung("S20",  1100,"7"),
                new Iphone("12",  1000,"6.1"),
                new Samsung("S20", 1100,"7"),
                new Iphone("12", 1000,"6.1"),
                new Samsung("S20",  1100,"7"),
                new Iphone("12", 1000,"6.1"),
                new Samsung("S20", 1100,"7"),
                new Iphone("12", 1000,"6.1"),
                new Samsung("S20", 1100,"7"),
                new Iphone("12", 1000,"6.1"),
                new Samsung("S20", 1100,"7"),
                new Samsung("S20", 1100,"7"),
                new Samsung("S20", 1100,"7"),
                new Samsung("S20", 1100,"7")
        };
        ArrayList<Phone> phoneShop = new ArrayList<>(Arrays.asList(phones));
        int countIphone = 0;
        int countSamsung = 0;
        int countHuawei = 0;

        //first approach using for loop

     /* for(int i = 0; i < phoneShop.size(); i++){
            Phone eachPhone = phoneShop.get(i); //get each objects from Array
            if(eachPhone instanceof Iphone){//check if the object is Iphone
                countIphone++;
            }else if(eachPhone instanceof Samsung){//check if the object is Samsung
                countSamsung++;
            }else {
                countHuawei++;
            }

        }
        System.out.println("Total # of Iphone: "+ countIphone);
        System.out.println("Total # of Samsung: "+countSamsung);
        System.out.println("Total # of Huawei: "+countHuawei);

      */



        //second approach using for-each loop
        for(Phone each : phoneShop){
            if(each instanceof Iphone){
                countIphone++;
            }else if(each instanceof Samsung){
                countSamsung++;
            }else{
                countHuawei++;
            }
        }
        System.out.println("Total number of Iphones: "+countIphone+"" +
                "\nTotal number of Samsungs: "+countSamsung+"" +
                "\nTotal number of Huawei: "+countHuawei);
    }
}
