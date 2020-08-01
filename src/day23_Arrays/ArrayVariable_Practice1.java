package day23_Arrays;

public class ArrayVariable_Practice1 {
    public static void main(String[] args) {

        //give an array variable that prints students name

        String[] groupGirls = {"Anam", "Iman", "Fatma","Alena","Zarina" };
        // index:                0       1       2       3         4
        //in this array i have 4 data and each data have their own indexes

        String name0 =  groupGirls[4];
        System.out.println(name0);
//if the index does not exist in the array, will get IndexOutOfBound erro

//task create two arrays: name and scores
        String names[] = {"Mike", "Adam","Tonny","John","Ammy" };
        int scores[] = {85, 70, 95, 90, 100};
        //size of array is 5 in both array

       /* System.out.println(names[1] + " : " + scores[1]);
        System.out.println(names[4] + " : " + scores[4]); */

        for(int i = 0; i <= 4; i++){
            System.out.println((names[i]) + " : " + (scores[i]));
        }

        System.out.println("============================");
        //other way to assign index

        String[] classMates = new String[5];//fix number of data size = 5
        classMates[0] = "Fatih";
        classMates[2] = "Hazel";
        classMates[1] = "Viorel";
        classMates[3] = "Iman";
        classMates[4] = "Adam";
//        classMates[5] = "Anam"; ArrayIndexOutOfBoundsException: 5

        for(int i = 0; i <= classMates.length-1; i++){
            System.out.println(classMates[i]);
        }

    }
}
