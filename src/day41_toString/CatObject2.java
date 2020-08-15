package day41_toString;

import java.util.ArrayList;
import java.util.Arrays;

public class CatObject2 {
    public static void main(String[] args) {
        Cat[] cats = { new Cat(), new Cat(), new Cat(), new Cat(), new Cat()};
        cats[0].setCatInfo("Kitty",2,'F', "Mix","Aegean");
        cats[1].setCatInfo("Snowy",3, 'M',"Brown","American Bobtail");
        cats[2].setCatInfo("Whisker",4, 'F', "White", "American Shorthair");
        cats[3].setCatInfo("Milo", 3, 'M', "Black", "Asian Cat");
        cats[4].setCatInfo("Simba",1,'F',"Gray","Australian Mist");

//approach without loop
        ArrayList<Cat> maleCats = new ArrayList<>();
        maleCats.addAll(Arrays.asList(cats));
        maleCats.removeIf(p -> p.gender != 'M') ;
        System.out.println(maleCats);
        ArrayList<Cat> femaleCats = new ArrayList<>();
        femaleCats.addAll(Arrays.asList(cats));
        femaleCats.removeAll(maleCats);
        System.out.println(femaleCats);

        System.out.println("=====Size of Male & Female Cats in the ArrayList======");
        System.out.println("Number of male cats: "+maleCats.size());
        System.out.println("Number of female cats: "+femaleCats.size());


    }
}
