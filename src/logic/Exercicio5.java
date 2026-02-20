package logic;/*Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
calcule quantos salários mínimos esse
usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).*/

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final double MINIMUM_WAGE = 1293.20;
        System.out.println("Enter the user's salary:");
        double userSalary = scan.nextDouble();
        double totalWages = userSalary / MINIMUM_WAGE;
        System.out.printf(
                "The user earns %.2f minimum wages%n",
                totalWages
        );
        System.out.println(
                "Whole minimum wages: " + (int) totalWages
        );
        scan.close();
    }
}
