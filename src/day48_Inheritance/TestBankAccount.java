package day48_Inheritance;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount customer1 = new BankAccount("Anam","Masroor");
        customer1.setAccountHolder(customer1.firstName+" "+customer1.lastName);
        customer1.setAccountNumber(14789632);
        customer1.setBalance(1000);
        System.out.println(customer1);
       //let's deposit $500
        customer1.deposit(500);
        System.out.println("Available balance: $"+customer1.getBalance());
        //let's withdraw $1000
        customer1.withDraw(1050);
        System.out.println("Available balance: $"+customer1.getBalance());
       //let's withdraw $400
        customer1.withDraw(400);
        //let's check available balance
        System.out.println("Available balance: $"+customer1.getBalance());
      // let's withdraw $50
        customer1.withDraw(50);
        System.out.println("Available balance: $"+customer1.getBalance());
        //let's withdraw $45
        customer1.withDraw(45);
        System.out.println("Available balance: $"+customer1.getBalance());


    }
}
