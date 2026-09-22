package oop.projectbankaccount.app;

import oop.projectbankaccount.entities.BankAccount;

import java.util.Scanner;

public class BankAccountTest {
    Scanner scanner = new Scanner(System.in);

    static void main() {
        BankAccountTest banktest = new BankAccountTest();
        BankAccount bankAccount;
        int accountNumber;
        String accountHolder;


        System.out.println("Enter account number: ");
        while (true) {
            try {
                accountNumber = Integer.parseInt(banktest.scanner.nextLine());

                if (accountNumber <= 0) {
                    System.out.println("ERROR! Number cannot be negative");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number");
            }
        }


        System.out.println("Enter account holder: ");
        while (true) {
            accountHolder = banktest.scanner.nextLine();
            if (accountHolder.isBlank()) {
                System.out.println("ERROR! The holder cannot be empty.");
                continue;
            }

            if (!accountHolder.matches("[a-zA-ZÀ-ÿ ]+")) {
                System.out.println("ERROR! The holder can only contain letters.");
                continue;
            }
            break;
        }

        System.out.println("Is there an initial deposit (y/n)? ");
        char initialDeposit = banktest.scanner.nextLine().toLowerCase().charAt(0);

        if (initialDeposit == 'y') {
            System.out.println("Enter initial deposit value");

            while (true){
                try {
                    double initialValue = Double.parseDouble(banktest.scanner.nextLine());
                    if (initialValue <= 0){
                        System.out.println("ERROR! Deposit cannot be negative");
                        continue;
                    }
                    bankAccount = new BankAccount(accountNumber, accountHolder, initialValue);
                    break;
                }catch (NumberFormatException e){
                    System.out.println(	"ERROR! Enter a valid value");
                }


            }
        } else {
            bankAccount = new BankAccount(accountNumber, accountHolder);
        }



        int option = -1;
        do {
            menu();
            try {
                option = Integer.parseInt(banktest.scanner.nextLine());
                switch (option) {
                    case 1:
                        System.out.println("Enter a deposit value: ");
                        double depositValue = Double.parseDouble(banktest.scanner.nextLine());
                        if (bankAccount.deposit(depositValue)) {
                            System.out.println("Deposit completed successfully");
                        } else {
                            System.out.println("Deposit not completed");
                        }
                        break;
                    case 2:
                        System.out.println("Enter a withdraw value: ");
                        double withdrawValue = Double.parseDouble(banktest.scanner.nextLine());
                        if (bankAccount.withdraw(withdrawValue)) {
                            System.out.println("Withdrawal completed successfully");
                        } else {
                            System.out.println("Withdrawal not completed");
                        }
                        break;
                    case 3:
                        String newName;
                        System.out.println("Enter the new name you want to choose: ");
                        while (true) {
                            newName = banktest.scanner.nextLine();
                            if (newName.isBlank()) {
                                System.out.println("ERROR! New name cannot be empty.");
                                continue;
                            }
                            if (!newName.matches("[a-zA-ZÀ-ÿ ]+")) {
                                System.out.println("ERROR! New name can only contain letters.");
                                continue;
                            }
                            break;
                        }
                        bankAccount.changeName(newName);
                        break;
                    case 4:
                        System.out.println("Account Information:");
                        System.out.println(bankAccount);
                        break;
                    case 0:
                        System.out.println("EXITING...");
                        break;
                    default:
                        System.out.println("ERROR! Invalid option, enter only valid numbers");
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR! Enter numbers only");
            }

        } while (option != 0);


    }

    public static void menu() {
        System.out.println("== Menu == ");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Change name");
        System.out.println("4. Information");
        System.out.println("0. Exit");
    }
}
