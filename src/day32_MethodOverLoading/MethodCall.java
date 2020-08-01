package day32_MethodOverLoading;
import Library.Util;

import java.util.Arrays;

public class MethodCall {

    public static void main(String[] args) {

        String firstName = "elKEm";
        String lastName = "emEt";
        String fullName = Util.FormatFullName(firstName, lastName);
        System.out.println(fullName);

        String uniques = Util.uniques(fullName);
        System.out.println(uniques);

        String reverseName = Util.reverse(fullName);
        System.out.println(reverseName);

        System.out.println("=======================================");

        int arr[] = {10,5,20,45,100,30,40,50};
        int num = 250;

        int arr1[] = Util.addElements(arr,num);
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));


    }

}
