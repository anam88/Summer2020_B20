package day47_Encapsulation;

public class Encapsulation {
    private long ssn = 147896352; //privateVariable, only accessible in the Class
    /*
    let's set setter and getter method to access the private variable
     */
    public long getSsn(){
        return ssn;
    }
    public void setSsn(long ssn){
        this.ssn = ssn;
    }



}
