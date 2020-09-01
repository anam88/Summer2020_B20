package day49_Inheritance.PersonTask;
/*
create a subclass of Employee called called Developer
Attributes:
    ame, age, gender, Salary, ID, jobTitle
Actions:
    setInfo(), coding(),  fixBug(), toString()
 */
public class Developer extends Employee{

    public Developer(String name, int age, char gender,
                     double salary, int ID, String jobTitle){
        setInfo(name, age, gender, salary, ID, jobTitle);
    }
    public void coding(){
        System.out.println(name+" is coding using JAVA");
    }
    public void fixBugs(){
        System.out.println(name+" is fixing bugs, and crying about it");
    }


}
