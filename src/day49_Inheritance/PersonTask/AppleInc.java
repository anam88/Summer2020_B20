package day49_Inheritance.PersonTask;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import day00.Test;

/*
create a class called AppleInc:
1. create an array of Testers and store the testers info in your group
2. create an array of developers store the developers info in your group
3. create an object of ScrumTeam and store the testers & developers above to the scrum team
 */
public class AppleInc {
    public static void main(String[] args) {
        Tester[] testersTeam1 =
                {new Tester("Anam",32,'F',156999, 1478,"QA"),
                new Tester("Luisa",25,'F',155999,1468,"QA"),
                new Tester("Rakhat", 30, 'F', 125000, 1458, "SDET")};
        Developer[] developersTeam1 = {
                new Developer("Ahmet",30,'M',150_000,1071, "Lead Developer"),
                new Developer("Fatime",30,'F', 150000,1234,"Software Engineer"),
                new Developer("Martin",95,'M', 135000,4567,"Developer"),
                new Developer("Ebrahim", 31, 'M', 130000, 8765, "Senior Developer")};

        //create the object of scrumTeam
        ScrumTeam scrumTeam1 = new ScrumTeam(testersTeam1, developersTeam1);
        System.out.println(scrumTeam1);

        Tester[] testersTeam2 = {
                new Tester("Mehary", 35, 'M', 1300000, 123456, "SDET"),
                new Tester("Alex", 35, 'F', 135000, 9112356, "SDET")};
        Developer[] developersTeam2 = {new Developer("Aidana", 24, 'F', 160000, 123456, "softwareEngineer"),
        new Developer("Noza",22,'f',150_000,107114,"LeadDeveloper")};

        ScrumTeam scrumTeam2 = new ScrumTeam(testersTeam2, developersTeam2);
        System.out.println(scrumTeam2);
        System.out.println("****************************************");

        ScrumTeam[] allScrumTeam = {scrumTeam1, scrumTeam2};
        //looping to get testers from both team
        for(ScrumTeam eachScrumTeam : allScrumTeam){
            for(Tester eachTester : eachScrumTeam.testers){
                System.out.println(eachTester.name+ " "+eachTester.salary);
            }
        }
        System.out.println("****************************************");
        //looping to get developers from both team
        for(ScrumTeam eachScrumTeam : allScrumTeam){
            for(Developer eachDeveloper : eachScrumTeam.developers){
                System.out.println(eachDeveloper.name+" "+eachDeveloper.salary);
            }
        }
        System.out.println("****************************************");
        //let's remove some tester and developers
        scrumTeam1.removeDeveloper(8765);
        scrumTeam2.removeTester(9112356);

        System.out.println(scrumTeam1);
        System.out.println(scrumTeam2);

    }



}
