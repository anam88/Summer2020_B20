package day27_recap;
import java.util.Scanner;
import java.util.Arrays;

//Array practice

public class Array_Practice {
    public static void main(String[] args) {

        String names[] = {"Anam", "Ayse", "Nurbiye", "Muhtar", "Hamza","Ali"};

        //how to print Nurbiya
        System.out.println(names[2]);
        //Nurbiye
        System.out.println(Arrays.toString(names));//to print array as String
        //[Anam, Ayse, Nurbiye, Muhtar, Hamza, Ali]
        System.out.println("======================================");

        //use loop to iterate through indexes to print the each element
        //print Anam, Ayse, Nurbiya
        for(int i = 0; i <= names.length-1; i++){
            System.out.println(names[i]);
//        Anam
//        Ayse
//        Nurbiye
//        Muhtar
//        Hamza
//        Ali

        }
        System.out.println("======================================");
        //use a loop to print the name that does  starts with A
        //i: each name
        for(int i = 0; i <=names.length-1; i++){
            if(names[i].charAt(0) != 'A'){//if charAt(0) == A, than print those else skip
                continue;
            }
            System.out.println(names[i]);
//            Anam
//            Ayse
//            Ali

        }
        System.out.println("======================================");
        //print names that does not start with A
        for(int i = 0; i <= names.length-1 ; i++){
            if(!(names[i].charAt(0) != 'A')){
                continue;
            }
            System.out.println(names[i]);
            //Nurbiye
            //Muhtar
            //Hamza
        }
//==============================================================================
        System.out.println("======================================");

//boolean default value is FALSE
        boolean numbers1[] = new boolean[5];
        System.out.println(Arrays.toString(numbers1));
        //  [false, false, false, false, false]

  //int default value is 0
        int numbers[] = new int[5]; //array size is fixed
        System.out.println(numbers);//[I@1b6d3586
        System.out.println(Arrays.toString(numbers)); //[0, 0, 0, 0, 0]

        //in order to assign something to the array index
        numbers[3] = 25;
        //[0, 0, 0, 25, 0]
        numbers[0] = 100;
        numbers[3] = 300;
     // [100, 0, 0, 300, 0]
        System.out.println(Arrays.toString(numbers));

        System.out.println("======================================");

        //ask user to enter 5 names, and assign it to the index of array

        Scanner input = new Scanner(System.in);
        //lets get array size from user
        System.out.println("How many names you want to enter?");
        String students[]= new String[input.nextInt()];
//depending on the number we enter the loop will execute that many time
        //lets use loop to assign the name to array string
        input.nextLine();//take out the enter from the scanner memory
        for(int i = 0; i <= students.length-1 ; i++){
            System.out.println("Enter a name");
            students[i] = input.nextLine();
        }
//        System.out.println("Enter a name");
//        students[0] = input.nextLine(); //Kim
//        System.out.println("Enter a name");
//        students[1] = input.nextLine();

        System.out.println(Arrays.toString(students));
        //[Kim, null, null, null, null] String default value is: null




    }
}
