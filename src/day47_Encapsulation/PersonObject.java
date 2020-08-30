package day47_Encapsulation;

import java.time.LocalDate;

public class PersonObject {
    public static void main(String[] args) {
        Person groupMember1 = new Person("Anam",32,'F',
                LocalDate.of(1988,1,9));
        System.out.println(groupMember1);
        groupMember1.setID(1234);
        groupMember1.setSsn(123456789);
        groupMember1.setAddress("123 Main Street Chicago IL 00000");
        System.out.println("SSN: "+groupMember1.getSsn()+"\nID: "+groupMember1.getID()+
                "\nAddress: "+groupMember1.getAddress());


    }
}
