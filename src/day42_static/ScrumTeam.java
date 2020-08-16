package day42_static;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
/*
create a class called ScrumTeam
Attributes:
        PO, BA, SM,
        ArrayList<Tester> testers = new ArrayList<>(),
        ArrayList<Developer> testers = new ArrayList<>(),
Actions:
        setInfo(): sets the names of: PO, BA, SM
        addTester(Tester tester): adds the given tester to the testers arraylist
        addTesters(Tester[] testers): adds the given testers to the testers arraylist
        addDeveloper(Developer developer): adds the given developer to the developers arraylist
        addDevelopers(Developer[] developers): adds the given developers to the developers arraylist
        removeTester(long employeeID): removes the given tester from the testers arraylist
        removeDeveloper(long employeeID): removes the developer from the developers arraylist

*/
    /*why arrayList as instance? so you can call it in another class, so each scrumTeam can have
    their own testing team */
        ArrayList<Tester> testers = new ArrayList<Tester>();
        ArrayList<Developer> developers = new ArrayList<>();
        String PO;
        String BA;
        String SM;

        public void setInfo(String PO,String BA,String SM){
            this.PO = PO;
            this.BA = BA;
            this.SM = SM;
        }
        public void addTester(Tester tester){//add tester in the tester arraylist
            testers.add(tester);
        }
        public void addTesters(Tester[] testers){
            if(testers.length == 0){
/* we are adding from array to array list , and if the array is empty,
we don’t have anything to add to the list.
we don't want to add Array that is empty!)) we want add Array that is contain some people
array should be pre-fill, so if no testers are added already, it should exit the statement */
                return;
            }
//using this keyword because the testers name can reference to the instance variable not to locale
            //because they both have same name
            this.testers.addAll(Arrays.asList(testers));
        }
        public void addDeveloper(Developer developer){
            developers.add(developer);
        }
        public void addDeveloper(Developer[] developers){
            if(developers.length == 0){
                return;
            }
            this.developers.addAll(Arrays.asList(developers));
        }
        public void removeTester(long employeeID){//this is argument
//p.employeeID will check each employee ID and if the employee ID on right side matches with LT side
            //it will remove it
            testers.removeIf(p -> p.employeeID == employeeID);
        }
        public void removeDeveloper(long employeeID){
            developers.removeIf(p -> p.employeeID == employeeID);
        }
        public String toString(){
            return "\nNumber of testers: "+testers.size()+"\nNumber of developers: "+developers.size()+
                    "\nName of the PO: "+PO+"\nName of BA: "+BA+"\nName of SM: "+SM;
        }

}
