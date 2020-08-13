package day40_CustomeClassPractice;

public class BankAccount {

/*
Task1
create a custom class for BankAccount
attributes/data that can have are:
        1. AccountHolder, 2. AccountNumber, 3. Balance
Actions: showBalance, deposit, withdraw
  requirements:
    1. user should be able to deposit money into their account
    2. user should be able to withdraw money from their account
        2.1 if the withdrawing account is greater than available balance,
        35$ penalty charge will be added
        2.2 if the balance is less than or equal to 0,
        user should not be able to withdraw money
    3. user should be able to see their balance

 */

    String accountType;
    String accountHolder;
    String accountNumber;
    double balance;

    public void setAccountInfo(String accountType, String accountHolder,
                               String accountNumber){ // sets the info
/*
Keyword 'THIS' in Java is a reference variable that refers to the current object.
It can be used to refer current class instance variable.
It can be used to invoke or initiate current class constructor.
It can be passed as an argument in the method call.
 */
/*
if the local variable and instance variable has same name, we use the 'this' keyword to refer
to instance variable.
 */
        this.accountType = accountType;
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public void getAccountInfo(){ // displays account info
        System.out.println("============================");
        System.out.println("Account Type: "+accountType);
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Available Balance: "+balance);
        System.out.println("============================");
    }

    public void checkBalance(){
        System.out.println("Available Balance: "+balance);
    }

    public void deposit(double amount){
        System.out.println("Depositing $"+amount+" to "+accountNumber);
        balance += amount;
    }

    public void withDraw(double amount){
        if(amount > balance){
            System.out.println("Not enough money in your account!");
            return;
        }
        System.out.println("Withdrawing $"+amount+" from "+accountNumber);
        balance -= amount;
    }

}

