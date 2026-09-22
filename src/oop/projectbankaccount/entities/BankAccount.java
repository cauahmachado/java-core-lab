package oop.projectbankaccount.entities;

public class BankAccount {
    private final int idAccount;
    private String accountUsername;
    private double accountBalance;

    public BankAccount(int idAccount, String accountUsername) {
        this.idAccount = idAccount;
        this.accountUsername = accountUsername;
    }

    public BankAccount(int idAccount, String accountUsername, double initialDeposit) {
        this.idAccount = idAccount;
        this.accountUsername = accountUsername;
        this.accountBalance = initialDeposit;
    }

    public boolean deposit(double amount){
        if (amount <= 0){
            System.out.println("ERROR! Only positive values are allowed");
            return false;
        }
        accountBalance += amount;
        return true;
    }

    public boolean withdraw(double amount){
        if (amount <= 0){
            System.out.println("ERROR! Only positive values are allowed");
            return false;
        }
        if (accountBalance < amount + 5.00){
            System.out.println("ERROR! Insufficient balance for this withdrawal (includes R$5.00 fee)");
            return false;
        }
        accountBalance = accountBalance - amount - 5.00;
        return true;
    }

    public void changeName(String newName){
        this.accountUsername = newName;
    }


    @Override
    public String toString() {
        return "Account data: \n" +
                "Account = " + idAccount +
                ", Holder ='" + accountUsername + '\'' +
                ", Balance = " + accountBalance ;
    }
}
