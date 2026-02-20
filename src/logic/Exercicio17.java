package logic;/* Faça um algoritmo que efetue o cálculo do salário líquido de um professor.
As informações fornecidas serão: valor da hora aula,
número de aulas lecionadas no mês e percentual de desconto do INSS.
Imprima na tela o salário líquido final.*/
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Hourly wage: ");
        double hourlyWage = scan.nextDouble();

        System.out.print("Number of classes taught in the month: ");
        int monthlyClasses = scan.nextInt();

        System.out.print("INSS discount percentage: ");
        double inssPercentage = scan.nextDouble();

        double grossSalary = hourlyWage * monthlyClasses;
        double inssDiscount = grossSalary * (inssPercentage / 100);
        double netSalary = grossSalary - inssDiscount;

        System.out.printf("Net salary: %.2f%n", netSalary);

        scan.close();
    }
}
