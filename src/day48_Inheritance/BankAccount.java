package day48_Inheritance;
/*
create costum class called BankAccount for Bank of America
public variables:  bankName, firstName, lastName
private variables: accountHolder, accountNumber, balance
encapsulate all the private data
        (DO NOT USE SHORTCUT)
create a constructor that can initialize firstName and lastName
        (DO NOT USE SHORTCUT)

*/
public class BankAccount {
    public static String bankName;

    static {
        bankName = " Bank of America";
    }
    public String firstName;
    public String lastName;

    public BankAccount(String firstName,String lastName ){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    private String accountHolder;
    private long accountNumber;
    private double balance;

    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    public void setAccountNumber(long accountNumber){
        this.accountNumber = accountNumber;
    }
    public long getAccountNumber(){
        return accountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
/*
action:
deposit
withdraw
availableBalance
*/
    public void deposit(double amount) {
        System.out.println("Depositing $" + amount + " to " + accountNumber);
        balance += amount;
    }
    public void withDraw(double amount){
        if(amount <= 0){
            System.out.println("Invalid amount");
            return;
        }
        if(amount > balance){
            System.out.println("Not enough balance in the account!");
            return;
        }
        System.out.println("Withdraw: $"+amount);
        balance -= amount;
        }

    public double availableBalance(){
        return getBalance();
    }

    public String toString(){
        return "\nBank Name: "+bankName+"\nFirst Name: "+firstName+"\nLast Name: "+lastName+
                "\nAccount Holder: "+getAccountHolder()+"\nAccount Number: "+getAccountNumber()+
                "\nBalance: $"+getBalance();



    }



}
