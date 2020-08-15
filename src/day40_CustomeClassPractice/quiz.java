package day40_CustomeClassPractice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class quiz {
  /*  public static void main(String[] args) {
        method1();
    }
    public static void method1(){
        int n = -5;
        for(int i = 1; i < 5 ; i++){
            n *= 1;
        }
        System.out.println(n);
    }

   */
  /*public static void main(String[] args) {
      method2("The sun set quickly and created a shadow");
  }
  public static void method2(String s){
      String a = s.substring(10);
      if(a.length() > s.length()){
          System.out.println(a);
      }else{
          System.out.println(s);
      }
  }

   */
 /* public static void main(String[] args) {
      method3(50);
  }
  public static String method3(int num){
      if(num < 0){
          return  "Less than 0";
      }else if(num < 50){
          return "Less than 50";
      }else if(num < 100){
          return "Less than 100";
      }else{
          return "other";
      }
  }

  */


 /* public static void main(String[] args) {
      int result = method4("z","zebra");
      System.out.println("result");
  }
  public static int method4(char c, String s){
      if(s.contains("" + c)){
          return 1;
      }else{
          return 0;
      }
  }

  */
 /*   public static boolean method5(String str){
        boolean check = true;
        if(str.isEmpty()){
            check = false;
        }
        if(!str.contains("a")){
            check = false;
        }else if(str.contains("z")){

        }
        check = str.substring(0,1).equals("a") ? check : false;
        return check;
    }

    public static void main(String[] args) {
        System.out.println(method5("apple"));
    }

  */
 /*   public static int[] method6(String str){
        int[] arr = new int[str.length()];
        int n = 10;
        for(int i = 0; i < arr.length; i++){
            if(n == 20 || n == 50 || n == 70){
                continue;
            }
            arr[i] = n;
            n *= 10;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("mark");
    }

  */
 /* public static void main(String[] args) {
      String str = method7("on the weekend", 20);
      System.out.println(str);
  }
  public static String method7(String str, int s){
      str = str.substring(6);
      if(s < 10){
          str= str.substring(8);
      }else{
          if(str.length() > s){
              str = "weekday";
          }else if(s > 10 || s == -10){
              str = str.substring(5);
          }
      }
      return str;
  }

  */
  /*public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int size = input.nextInt();
      int[] a = new int[size];
      int i = 0;
      while(i < size){
          a[i++] = input.nextInt();
      }
      method8(a);
  }
  public static void method8(int[] arr){
      for(int n: arr){
          if(n % 4 == 0){
              continue;
          }
          System.out.print(n);
      }
  }

   */
 /*   public static String method9(String one, String two, String three){
        return  "" + middle(one) + middle(two) + middle(three);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = method9(scan.next(),scan.next(),scan.next());
        System.out.print(str);
    }
    public static char middle(String s){
        return s.charAt(s.length()/2);
    }

  */
  /*public static void main(String[] args) {
      double number = add(3.4);
      number += add("dual");
      number += add(Integer.parseInt("100"));
      number += add(11341L);
      number += add(Float.parseFloat("50.8"));
      System.out.print(number);
  }
  public static int add(int n){
      return 5;
  }
  public static double add(double d){
      return 2.5;
  }
  public static long add(String s){
      return 10;
  }

   */
  /*  public static int action(){
        return 0;
    }
    public static int action(int i){
        return i * 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        total += action(input.nextBoolean());
        total += action(input.nextInt());
        total += action();
        total += action(input.next());
        total += action(input.next());
        System.out.println(total);
    }
    public static int action(String s){
        return s.length();
    }
    public static int action(boolean b){
        if(!b){
            return 5;
        }else{
            return 10;
        }
    }

   */
  //public static void main(String[] args) {
     /* LocalTime time = LocalTime.now();
      DateTimeFormatter format = DateTimeFormatter.ofPattern("h:mm a");
      time.plusHours(2);
      System.out.println(time.format(format));

      */
   /*   LocalDate date = LocalDate.now();
      DateTimeFormatter format = DateTimeFormatter.ofPattern("M/d/yy");
      date = date.plusDays(1).minusYears(2).minusWeeks(1);
      System.out.println(date.format(format));
  }

    */
  /*   Scanner in = new Scanner(System.in);
     ArrayList<Integer> nums = new ArrayList<>();
     int run = in.nextInt();
     while(run > 0){
         run--;
         switch (in.nextInt()){
             case 1:
                 nums.add(1);
             case 5:
                 nums.add(50);
                 break;
             case 4:
                 break;
             case 8:
                 nums.remove(0);
                 break;
             case 10:
             case -1:
             case -42:
                 nums.add(1,0);
                 break;
             case 55:
                 nums.add(105);
                 break;
             case 2:
                 nums.add(20_000);
                 break;
             default:
                 nums.add(null);

         }
     }


      System.out.println(nums);

   */
    /*
      String[] cities = {"Boston","Houston","Austin","Lincoln","Tulsa"};
      ArrayList<String> list = new ArrayList<>(Arrays.asList(cities));
      int a = list.size();
      for(String str : list){
          String rev = "";
          for(int i = str.length()-1; i>=0; i--){
              rev += str.charAt(i);
          }
          list.set(--a, rev);
      }
      System.out.println(list);

     */
      /*
      LocalDate date = LocalDate.of(2018,1,18);
      LocalTime time = LocalTime.of(14,42);
      LocalDateTime dateTime = LocalDateTime.of(date,time);
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy | hh:mm");
      System.out.println(dateTime);

       */


}
