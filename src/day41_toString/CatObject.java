package day41_toString;

import java.util.ArrayList;

public class CatObject {
/*
CatObjects:
create 5 objects of Cat and store them into an array variable
print out the informations of every single cat
    (DO NOT use getInfo method)

*/
    public static void main(String[] args) {
        Cat[] cats = { new Cat(), new Cat(), new Cat(), new Cat(), new Cat()};
        cats[0].setCatInfo("Kitty",2,'F', "Mix","Aegean");
        cats[1].setCatInfo("Snowy",3, 'M',"Brown","American Bobtail");
        cats[2].setCatInfo("Whisker",4, 'F', "White", "American Shorthair");
        cats[3].setCatInfo("Milo", 3, 'M', "Black", "Asian Cat");
        cats[4].setCatInfo("Simba",1,'F',"Gray","Australian Mist");
        //let's print all cats
        for(Cat eachCat : cats){
            System.out.println(eachCat);
        }
        System.out.println("===============================");
        cats[1].drink("Milk");
        cats[4].eat("Cooked beef");
        System.out.println("===============================");
/*
 ArrayList:
maleCats
femaleCats
first approach: apply loop ( both for each loop and for loop)
second approach: do not use loop
*/
        ArrayList<Cat> maleCats = new ArrayList<>();
        ArrayList<Cat> femaleCats = new ArrayList<>();
        //forloop
       /* for(int i = 0; i < cats.length; i++){
            if(cats[i].gender == 'M'){
                maleCats.add(cats[i]);
            }else{
                femaleCats.add(cats[i]);
            }
        }

        */
        //foreach loop
        for(Cat eachCat : cats){
            if(eachCat.gender == 'M') {
                maleCats.add(eachCat);
            }else{
                femaleCats.add(eachCat);
            }
        }
        System.out.println("===============================");
        System.out.println("Number of male cats: "+maleCats.size());
        System.out.println("Number of female cats: "+femaleCats.size());
        System.out.println("===============================");





    }


}
