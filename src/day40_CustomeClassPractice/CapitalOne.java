package day40_CustomeClassPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {
        BankAccount Will = new BankAccount();
        BankAccount Doug = new BankAccount();
        BankAccount Bill = new BankAccount();

        Will.setAccountInfo("Checking","Will","147523697");
        Doug.setAccountInfo("Saving","Doug","325896354");
        Bill.setAccountInfo("Checking","Bill","156897878");

        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.addAll(Arrays.asList(Will,Doug,Bill));
        for(BankAccount eachAccount : accounts){
            eachAccount.getAccountInfo();
        }
        //deposit money in all accounts
        for(BankAccount eachAccountDeposit : accounts){
            eachAccountDeposit.deposit(500);
            eachAccountDeposit.getAccountInfo();
        }
        //withdraw money from Bill account
        accounts.get(1).deposit(10000);
        accounts.get(1).checkBalance();
        accounts.get(1).withDraw(9000);
        accounts.get(1).checkBalance();

        accounts.get(2).deposit(600);
        accounts.get(2).checkBalance();

        System.out.println("=================================");
        //if each account balance is less than 1000 remove them from arrayList
        accounts.removeIf(eachAccount -> eachAccount.balance < 1000);
        //size of arrayList
        System.out.println(accounts.size());
        for(BankAccount eachBankAccount : accounts){
            eachBankAccount.getAccountInfo();
        }



    }
}
