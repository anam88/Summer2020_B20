package day46_ConstructorCalls;

public class Employee {
//     instance variables:
//     name, jobTitle, ID, salary
    String name;
    String jobTitle;
    int id;
    double salary;

    //1st constructor: initialize the name of the employee
    public Employee(String name){
        this.name = name;
    }
    //2d constructor: initialize the name, jobTitle of the employee
    //                (MUST apply constructor Call)
    public Employee(String name, String jobTitle){
        this(name);
        this.jobTitle = jobTitle;
    }
    //3rd Constructor: initialize the name, jobTitle, ID of the employee
    //                (MUST apply constructor Call)
    public Employee(String name, String jobTitle, int id){
        this(name,jobTitle);
        this.id = id;
    }
    //4th Constructor: initialize all the instance of the employee
    //                    (MUST apply constructor Call)
    public Employee(String name, String jobTitle, int id, double salary){
            this(name, jobTitle, id);
            this.salary = salary;
    }
    //Instance methods:
    //    toString()
    public String toString(){
        return "\nName: "+name+"\nJob Title: "+jobTitle+"\nEmployee ID: "+id+
                "\nSalary: $ "+salary;
    }

}
