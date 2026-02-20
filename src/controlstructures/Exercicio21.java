package controlstructures;/* Crie um programa que calcule o imposto de renda de uma pessoa
física baseado na tabela progressiva brasileira (versão simplificada). O programa
deve receber o salário bruto mensal e calcular o imposto devido.
Tabela de Alíquotas:
• Até R$ 1.903,98: Isento
• De R$ 1.903,99 até R$ 2.826,65: 7,5%
• De R$ 2.826,66 até R$ 3.751,05: 15%
• De R$ 3.751,06 até R$ 4.664,68: 22,5%
• Acima de R$ 4.664,68: 27,5%
Desafio adicional: Calcule também o valor líquido a receber e mostre uma
mensagem personalizada baseada na faixa de renda.
*/

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Gross salary:");
        double grossSalary = scan.nextDouble();

        double taxRate = 0;
        double taxAmount;
        double netSalary;
        String message;

        if (grossSalary <= 1903.98) {
            taxRate = 0;
            message = "You are exempt from income tax.";
        } else if (grossSalary <= 2826.65) {
            taxRate = 0.075;
            message = "Low tax rate applied.";
        } else if (grossSalary <= 3751.05) {
            taxRate = 0.15;
            message = "Medium tax rate applied.";
        } else if (grossSalary <= 4664.68) {
            taxRate = 0.225;
            message = "High tax rate applied.";
        } else {
            taxRate = 0.275;
            message = "Highest tax rate applied.";
        }

        taxAmount = grossSalary * taxRate;
        netSalary = grossSalary - taxAmount;

        System.out.printf("Tax amount: R$ %.2f%n", taxAmount);
        System.out.printf("Net salary: R$ %.2f%n", netSalary);
        System.out.println(message);

        scan.close();
    }
}
