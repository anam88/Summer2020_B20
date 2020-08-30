package day47_Encapsulation;

import java.time.LocalDate;

public class Person {
    public String name;
    public int age;
    public char gender;
    public LocalDate dateOfBirth;
    public Person(String name, int age, char gender, LocalDate dateOfBirth) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    private long ssn;
    private int ID;
    private String address;

    public long getSsn() {
        return ssn;
    }
    public void setSsn(long ssn) {
        this.ssn = ssn;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String toString(){
        return "Name: "+name+
                "\nAge: "+age+
                "\nGender: "+gender+
                "\nDOB: "+dateOfBirth;
    }


}
