package day61_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *  1. write a program that can remove the palindrome string from a list of String
*             DO NOT use Lambda expressions
 */
public class RemovePalindrome {
    public static void main(String[] args) {
        String[] words = {"Level","Java","Kayak","Zaman","Cybertek","Madam"};
        //add array to the list, by using bulk operations of the collections
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(words));
        System.out.println("list = " + list);
        //list = [Level, Java, Kayak, Zaman, Cybertek, Madam]
        //use the iterator using interface iterator
       Iterator<String> it =  list.iterator();
      while(it.hasNext()) {//has long as this condition is true, there is a obj. that can be accessible
         String eachWord = it.next();//returns the obj. assign it to the String
          //remove eachWord if it is palindrome
          String reverse = "";
          for(int i = eachWord.length()-1; i >= 0; i--){
              reverse += eachWord.charAt(i);
          }
          System.out.println(eachWord+" : "+reverse);

          if(eachWord.equalsIgnoreCase(reverse)){
              it.remove();
          }
      }
        System.out.println(list);
    }
}
