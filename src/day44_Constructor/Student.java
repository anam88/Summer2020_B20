package day44_Constructor;

public class Student {
   String name;
   int age;
   char gender;
   static String schoolName = "Cybertek University";

   //constructor (no specifier, no return type) class name is same as constructor
    public Student(String name,int age,char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
/*
   public void setStudentInfo(String name,int age,char gender){
       this.name = name;
       this.age = age;
       this.gender = gender;
   }
   */

   public String toString(){
       return "School name is: "+schoolName+"\nName: "+name+"\nAge: "+age+"\nGender: "+gender;
   }
}
