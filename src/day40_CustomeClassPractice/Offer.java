package day40_CustomeClassPractice;

public class Offer {
/*
Offer
    Attribute:
        salary, Location, hasPTO, isFullTime, WFH, jobTitle, Hasbenefit
    Actions:
        setOfferInfo
        getOfferInfo
    MUST use this keyword

 */
    double salary;
    String state;
    boolean hasPTO;
    boolean isFullTime;
    boolean isWFH;
    String jobTitle;
    boolean hasBenefit;

    public void setOfferInfo(double salary,String state,boolean hasPTO,boolean isFullTime,
                             boolean isWFH,String jobTitle,boolean hasBenefit ){
        this.salary = salary;
        this.state = state;
        this.hasPTO = hasPTO;
        this.isFullTime = isFullTime;
        this.isWFH = isWFH;
        this.jobTitle = jobTitle;
        this.hasBenefit = hasBenefit;
    }

    public void getOfferInfo(){//display information
        System.out.println("============================");
        System.out.println("Job Title is: "+jobTitle+"\nSalary Offer: $"+salary+"\nJob Location:"
        +state+"\nDoes job offer benefits? "+hasBenefit+"\nJob offers PTO: "+hasPTO+
                "\nIs offer full-time? "+isFullTime+"\nDoes offer have WFH option? "+isWFH);
        System.out.println("============================");

    }

}

