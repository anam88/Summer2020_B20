package day42_static;

/*
create a class called MyScrumTeam:
1. create an array of Testers and store the testers info in your group
2. create an array of developers store the developers info in your group
3. create an object of ScrumTeam and store the testers & developers above to the scrum team
Answer the interview question "Tell me about your scrum team"
*/

public class CapitalOne {
    public static void main(String[] args) {
        //array of testers
        Tester[] testerTeam1 = {new Tester(), new Tester(), new Tester() };
        testerTeam1[0].setInfo("Anam",'F',0123L,"Senior Automation Tester"
        ,170000);
        testerTeam1[1].setInfo("Naz",'F',15222L,"Tester", 180000);
        testerTeam1[2].setInfo("Kalbinur",  'F', 15333L, "Tester", 210000);
        //array of developers
        Developer[] developerTeam1 = {new Developer(), new Developer(), new Developer(),
        new Developer(), new Developer()};
        developerTeam1[0].setInfo("Waqar", 'M', 2111L, "Dev Lead" , 180000);
        developerTeam1[1].setInfo("Roza", 'F', 3222L, "Dev", 150000);
        developerTeam1[2].setInfo("Burak", 'M', 43333L, "Dev", 160000);
        developerTeam1[3].setInfo("Viriginia",'F',76543L,"Senior Dev",130000);
        developerTeam1[4].setInfo("Akbar",'M',98756L,"Lead Dev",170000);
        //scrumTeam
        ScrumTeam team1 = new ScrumTeam();
        team1.setInfo("Ramazan","Hamit","Ismail");
        //add testers & developers in the scrumTeam now
        team1.addTesters(testerTeam1);
        team1.addDeveloper(developerTeam1);
        //print the team
        System.out.println(team1);
        System.out.println("===================================");
        //printing out the names of the Tester & their salary
        for(Tester eachTester : team1.testers){
            System.out.println("Tester in the team 1: "+eachTester.name + " and their salary: $"+eachTester.salary);
        }
        System.out.println("====================================");
        //print out the name of the developers & their salary
        for(Developer eachDeveloper : team1.developers){
            System.out.println("Developer in the team 1: "+eachDeveloper.name + " and their salary: $"+eachDeveloper.salary);
        }
        System.out.println("===================================");
        //let's remove the tester //lets remove the developer
        team1.removeTester(15333L);
        team1.removeDeveloper(43333L);
        team1.removeDeveloper(2111L);
        System.out.println(team1);
        System.out.println("===================================");
        //now add a new developer
        Developer newDeveloper1 = new Developer();
        newDeveloper1.setInfo("Luisa",'F',2113L,"Dev Lead",150000);
        team1.addDeveloper(newDeveloper1);
        System.out.println(team1);
//===============================================================================================
        //add 2 new scrumTeams
        //add new PO, BA, SM, developers and tester and that team
        //print all developers and tester from scrum team
        //find the max salary from the tester team and from the developer team
        ScrumTeam[] scrumTeams = {team1, new ScrumTeam(), new ScrumTeam()};

        scrumTeams[1].setInfo("Smith","Billy","Micheal");
        Tester[] testerTeam2 = {new Tester(), new Tester(), new Tester() };
        testerTeam2[0].setInfo("Sarab", 'F', 14786L, "Tester I",140000);
        testerTeam2[1].setInfo("Ali", 'M', 78962L, "Tester II",135000);
        testerTeam2[2].setInfo("Sara", 'F', 98745L, "Tester III",145000);

        System.out.println("===================================");




        scrumTeams[2].setInfo("Ali","Raza","Bill");








    }
}
