package oop.projectbankaccount.entities;

import java.util.Scanner;

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

    public void deposit(double amount){
        if (amount<=0){
            System.out.println("ERRO! Apenas valores positivos permitidos");
            return;
        }
        accountBalance += amount;
        System.out.println("Deposito realizado com sucesso");
    }

    public void withdraw(double amount){
        if (amount<=0){
            System.out.println("ERRO! Apenas valores positivos permitidos");
            return;
        }
        accountBalance = accountBalance - amount - 5.00;
        System.out.println("Saque realizado com sucesso");
    }

    public void alterarNome(String novoNome){
        this.accountUsername = novoNome;
    }


    @Override
    public String toString() {
        return "Account data: \n" +
                "Account = " + idAccount +
                ", Holder ='" + accountUsername + '\'' +
                ", Balance = " + accountBalance ;
    }
}
