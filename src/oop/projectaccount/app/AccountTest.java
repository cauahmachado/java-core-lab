package oop.projectaccount.app;

import oop.projectaccount.entities.Account;

import java.util.Scanner;

public class AccountTest {
    Scanner scanner = new Scanner(System.in);
    Account account = new Account();

    static void main() {
        AccountTest test = new AccountTest();
        int opcao = -1;

        do {
            test.menu();
            opcao = test.scanner.nextInt();

            switch (opcao) {
                case 1 -> test.execRegister();
                case 2 -> {
                    if (test.isRegistered()) test.execDeposite();
                }
                case 3 -> {
                    if (test.isRegistered()) test.execWithdraw();
                }
                case 4 -> {
                    if (test.isRegistered()) test.execQuery();
                }
                case 0 -> System.out.println("!SAINDO, OBRIGADO!");
            }
        } while (opcao != 0);

    }

    public void execRegister() {
        System.out.println("Insiras as informações para cadastro: ");
        System.out.println("Conta ID: ");
        scanner.nextLine();
        String accountId = scanner.nextLine();
        account.setAccountId(accountId);
        System.out.println("Nome do Cliente: ");
        String clientName = scanner.nextLine();
        account.setClientName(clientName);
        System.out.println("Agência: ");
        String agency = scanner.nextLine();
        account.setAgency(agency);

    }

    public void execQuery() {
        System.out.println("Informações sobre a conta: ");
        System.out.println(account);
    }

    public void execWithdraw() {
        System.out.println("Digite o valor que deseja sacar :");
        double value = scanner.nextDouble();
        if (account.withdraw(value) == 1) {
            System.out.println("Valor R$" + value + " sacado com sucesso!!");
        } else {
            System.out.println("Erro ao sacar o valor, verifique se há saldo o suficiente");
        }
    }

    public void execDeposite() {
        System.out.println("Digite o valor que deseja depositar: ");
        double value = scanner.nextDouble();
        account.deposit(value);
        System.out.println("Deposito realizado!");
    }

    public void menu() {
        System.out.println("========MENU========");
        System.out.println("1. Cadastrar");
        System.out.println("2. Depositar");
        System.out.println("3. Sacar");
        System.out.println("4. Informações");
        System.out.println("0. Sair");
        System.out.println("====================");
    }

    private boolean isRegistered() {
        if (account.getAccountId() == null) {
            System.out.println("Cadastre-se primeiro!");
            return false;
        }
        return true;
    }
}
