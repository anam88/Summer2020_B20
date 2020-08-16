package day42_static;

public class Student {
    String name;
    String age;
    char gender;
    int groupNumber;
    static String schoolName;
    static String favoriteTeacher = "Gurhan";

    public void setStudentInfo(String name,String age,char gender,int groupNumber){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.groupNumber = groupNumber;
    }
    public String toString(){
        return "\nSchool name: "+schoolName+"\nStudent name: "+name+"\nStudent Age: "+age+
                "\nGender of student: "+gender+"\nGroup Number: "+groupNumber
                +"\nFav. Teacher: "+favoriteTeacher;
    }
}
