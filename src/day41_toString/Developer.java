package day41_toString;

import java.util.ArrayList;
import java.util.Arrays;

public class Developer {
    //attributes: name, salary, years of experience, gender
    String name;
    double salary;
    char gender;
    int age;

    public void setInfo(String name, double salary,char gender,int age){
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.age = age;
    }
    public String toString(){
        return "\nName: "+name+"\nSalary: $"+salary+"\nGender: "+gender+"\nAge: "+age+"\n";
    }

    public void coding(){
        System.out.println(name+" is coding");
    }
    public void fixBugs(){
        System.out.println(name+" is crying, because he needs to fix the bug");
    }
}

class DeveloperObject{
    public static void main(String[] args) {
        Developer[] developers = {new Developer(), new Developer(), new Developer(), new Developer()};
        developers[0].setInfo("Billy",160450,'M',25);
        developers[1].setInfo("Anna",165987,'F',30);
        developers[2].setInfo("Mary",170478,'M',29);
        developers[3].setInfo("Shelby",175356,'F',28);
        //System.out.println(Arrays.toString(developers));
        //use foreach loop to print all developers information
        for(Developer eachDeveloper : developers){
            System.out.println(eachDeveloper);
        }
        System.out.println("===========================================");
        //print the size of M and F developers
        ArrayList<Developer> maleDeveloper = new ArrayList<>();
        maleDeveloper.addAll(Arrays.asList(developers));
        maleDeveloper.removeIf(p -> p.gender != 'M');
        System.out.println("Number of male developers: "+maleDeveloper.size());
        ArrayList<Developer> femaleDeveloper = new ArrayList<>();
        femaleDeveloper.addAll(Arrays.asList(developers));
        femaleDeveloper.removeAll(maleDeveloper);
        System.out.println("Number of female developers: "+femaleDeveloper.size());
        System.out.println("===========================================");
        developers[0].fixBugs();
        developers[3].coding();

        System.out.println("===========================================");
        //remove the developer who is making less than 165k
        ArrayList<Developer> lessThan165Salary = new ArrayList<>();
        lessThan165Salary.addAll(Arrays.asList(developers));
        lessThan165Salary.removeIf(p -> p.salary < 165000);
        System.out.println("Developers who are making salary less than 165k are: "+lessThan165Salary);
        System.out.println("===========================================");
        //let's remove the developer who name ends with y
        ArrayList<Developer> nameEndsWithY = new ArrayList<>();
        nameEndsWithY.addAll(Arrays.asList(developers));
        nameEndsWithY.removeIf(p -> p.name.endsWith("y"));
        System.out.println(nameEndsWithY);


    }

}

