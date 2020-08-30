package day47_Encapsulation;

public class Credentials {
    /*
    create class Credentials
    instance variables: name| age | username | password
     */
    public String name;
    public int age;
    private String userName;
    private String password;

    //constructor for name and age
    public Credentials(String name, int age){
        this.name = name;
        this.age = age;
    }
    //setter
    public void setUsername(String userName){
        this.userName = userName;
    }
    public void setPassword(String password){
        this.password = password;
    }
    //getter
    public String getUserName(){
        return userName;
    }
    public String getPassword(){
        return password;
    }
    public String toString(){
        return "Name of user: "+name+"\nAge of user: "+age+"\nUsername of user: "+getUserName()+
                "\nPassword of user: "+getPassword();
    }

}
