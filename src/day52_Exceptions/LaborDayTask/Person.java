package day52_Exceptions.LaborDayTask;

public class Person {
    public String name;
    public int age;
    public char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String toString() {
        return "\nPerson: "+
                "\nName: "+name+
                "\nAge: "+age+
                "\nGender: "+gender;
    }





}
