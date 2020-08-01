package day26_MultiDimensionalArray;

import java.util.Arrays;

public class MultiD_ArrayPractice {
    public static void main(String[] args) {
        /*
        tester: {"Lilia", "Odina","Cristina","Elken"}
        dev: {"Ahmet", "Erfan","Anam", "Sarah"}
        SM: {"Nurmamet"}
        PO: {"Nadir"}
        Ba: {"Alex"}

         */
        String testers[] = {"Lilia", "Odina","Cristina","Elken"};
        String dev[] = {"Ahmet", "Erfan","Anam", "Sarah"};
        String scrumMaster[] = {"Nurmamet"};
        String productOwner[] = {"Nadir"};
        String ba [] = {"Alex"};

        String scrumTeam[][] = {testers, dev, scrumMaster, productOwner, ba };
        scrumTeam[4][0] = "Adam";//how to change the value
        scrumTeam[1][0] = "Oybek";
        String testers2[] = {"Irene", "Aslan","Nazar"};
        scrumTeam[0] = testers2;
        System.out.println(Arrays.deepToString(scrumTeam));//prints the whole team
        System.out.println("=====================================================");

        for(String each[] : scrumTeam){
            for(String name : each){//name represent each name in the list
                System.out.println(name);//will print all the names
            }
            //System.out.println(Arrays.toString(each));//will print arrays
        }
        System.out.println("=====================================================");
//print the number that are divisible by 3 OR 5 | use the loop
        int nums[][] = {{10,20, 30, 45,1} , {60, 55, 75, 105, 82},{93, 48, 125, 135}};
        for(int each[] : nums){//nums: all array
            for(int scores : each){//scores: all scores inside the singleD
                if(scores % 3 == 0 || scores % 5 == 0){
                    System.out.println(scores+" ");
                }else{
                    System.out.println("Not divisible by 3 OR 5");
                }
            }
        }
        System.out.println("=====================================================");
        int a1[][] = {{1,2,3}, {3,4,5}};
        int a2[][] = {{6,7},{8,9,10}};

        int arr3D[][][]  = { {{1,2,3}, {3,4,5}} , {{6,7},{8,9,10}} };
        //index                      0                   1

    }
}
