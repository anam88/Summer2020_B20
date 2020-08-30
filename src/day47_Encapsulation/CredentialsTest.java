package day47_Encapsulation;

public class CredentialsTest {
    public static void main(String[] args) {
        Credentials user1 = new Credentials("John",32);
        user1.setUsername("john.123");
        user1.setPassword("passworD123");
        System.out.println(user1);
    }
}
