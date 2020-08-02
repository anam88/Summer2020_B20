package day37_ArrayList;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;


public class Lambda_Expression {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,2,3,4,4,4,5,6,7,8,9));
        Predicate<Integer> lessThan5 = p -> p < 5;
        list.removeIf(lessThan5);
        System.out.println(list);
        System.out.println("=============================================");

//create a predicate that can be applicable to all the odd numbers, and remove all OddNum
        Predicate<Integer> oddNum = p -> (p % 2 != 0);
        ArrayList<Integer> num = new ArrayList<>();
        for(int i = 0; i <= 100; i++){
            num.add(i);
        }
        num.removeIf(oddNum);
        //num.removeIf(p -> (p % 2 == 0));
        System.out.println(num);
        System.out.println("=============================================");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Mary","Monica","Mehray","Muhtar","Mosa","Hasan","Beril"));
        names.removeIf(p -> (p.startsWith("M"))&& (p.endsWith("y")));
        System.out.println(names);
        System.out.println("=============================================");

//task: write a program that can remove the elements that are not unique from the ArrayList
        ArrayList<Integer> n1 = new ArrayList<>();
        n1.addAll(Arrays.asList(1,1,1,2,2,2,3,3,3,4,5,6,7,8,8,9,10,11));
//the frequency of element is not unique
        n1.removeIf(p ->Collections.frequency(n1,p)  != 1 );
        System.out.println(n1);
        System.out.println("=============================================");

//write a program that can remove digits and letters for an ArrayList of characters.
        //list: {'a','b','c',3,4,5,6,'&','%','@','#','*'}
        //output: {'&','%','@','#','*}
        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('a','b','c','3','4','5','6','&','%','@','#','*'));
        chars.removeIf(p -> (Character.isLetter(p) ));
        chars.removeIf((p -> (Character.isDigit(p)) ));
        System.out.println(chars);
        System.out.println("=============================================");
//write a program that separately add digits, letters, and special character in separate ArrayList
        ArrayList<Character> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList('a','1','b','2','c','d','$','#','@','?','*','&'));

        ArrayList<Character> digits = new ArrayList<>();
        digits.addAll(list1);
        digits.removeIf(p -> !Character.isDigit(p));//if character is not digit, remove it
        System.out.println("Digits: "+digits);

        ArrayList<Character> letters = new ArrayList<>();
        letters.addAll(list1);
        letters.removeIf((p -> !Character.isLetter(p)));//if character is not letter, remove it
        System.out.println("Letters: "+letters);

        ArrayList<Character> specialChars = new ArrayList<>();
        specialChars.addAll(list1);
        specialChars.removeAll(letters);
        specialChars.removeAll(digits);
        System.out.println("Special Character: "+specialChars);



    }
}
