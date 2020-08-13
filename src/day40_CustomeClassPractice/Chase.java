package day40_CustomeClassPractice;

public class Chase {
    public static void main(String[] args) {
/*
  1. user should be able to deposit money into their account
2. user should be able to withdraw money from their account
2.1 if the withdrawing account is greater than available balance,
35$ penalty charge will be added
2.2 if the balance is less than or equal to 0,
user should not be able to withdraw money
3. user should be able to see their balance
 */
        BankAccount John = new BankAccount();
        John.setAccountInfo("Checking","John Smith","147896323");
        John.getAccountInfo();
        John.deposit(100);
        John.checkBalance();
        John.withDraw(50);
        John.checkBalance();
        John.withDraw(60);

    }
}
