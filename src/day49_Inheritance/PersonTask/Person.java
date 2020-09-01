package day49_Inheritance.PersonTask;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Person {
/*
create a class called Person
attributes:  name, age, gender
methods: eat, walk, sleep, setPersonInfo

*/
    public String name;
    public  int age;
    public char gender;

    private long ssn;
    //set the getter and setter for the ssn
    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public void setInfo(String name, int age, char gender){//ONLY sets, name, age, & gender
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    private void eat(){//we are not inheriting these private methods to subclass
        System.out.println(name+" is eating");
    }
    private void walk(){//we are not inheriting these private methods to subclass
        System.out.println(name+" is walking towards work");
    }
    public void sleep(){//setting this method as public just to see difference when we inherit it
        System.out.println(name+" is sleeping");
    }
}
