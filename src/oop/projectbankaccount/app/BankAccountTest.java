package oop.projectbankaccount.app;

import oop.projectbankaccount.entities.BankAccount;

import java.util.Scanner;

public class BankAccountTest {
    Scanner scanner = new Scanner(System.in);

    static void main() {
        BankAccountTest banktest = new BankAccountTest();
        BankAccount bankAccount;

        System.out.println("Enter account number: ");
        int accountNumber = Integer.parseInt(banktest.scanner.nextLine());
        System.out.println("Enter account holder: ");
        String accountHolder = banktest.scanner.nextLine();
        System.out.println("Is there an initial deposit (y/n)? ");
        char initialDeposit = banktest.scanner.nextLine().toLowerCase().charAt(0);

        if (initialDeposit == 'y') {
            System.out.println("Enter initial deposit value");
            double initialValue = Double.parseDouble(banktest.scanner.nextLine());
            bankAccount = new BankAccount(accountNumber, accountHolder, initialValue);
        } else {
            bankAccount = new BankAccount(accountNumber, accountHolder);
        }

        int option = -1;
        do {
            menu();
            option = Integer.parseInt(banktest.scanner.nextLine());
            switch (option) {
                case 1:
                    System.out.println("Enter a deposit value: ");
                    double depositValue = Double.parseDouble(banktest.scanner.nextLine());
                    bankAccount.deposit(depositValue);
                    break;
                case 2:
                    System.out.println("Enter a withdraw value: ");
                    double withdrawValue = Double.parseDouble(banktest.scanner.nextLine());
                    bankAccount.withdraw(withdrawValue);
                    break;
                case 3:
                    System.out.println("Qual o novo nome que deseja escolher? ");
                    String novoNome = banktest.scanner.nextLine();
                    bankAccount.alterarNome(novoNome);
                    break;
                case 4:
                    System.out.println("Data");
                    System.out.println(bankAccount);
                    break;
                case 0:
                    System.out.println("SAINDO...");
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        } while (option != 0);


    }

    public static void menu() {
        System.out.println("== Menu == ");
        System.out.println("1. Depositar");
        System.out.println("2. Sacar");
        System.out.println("3. Alterar nome");
        System.out.println("4. Informações");
        System.out.println("0. Exit");
    }
}
