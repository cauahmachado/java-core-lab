package fundamentals.logic;//Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final double INCREASE_RATE = 0.05;
        System.out.println("Enter the current salary:");
        double salary = scan.nextDouble();
        double adjustedSalary = salary + (salary * INCREASE_RATE);
        System.out.printf(
                "The adjusted salary is: %.2f%n",
                adjustedSalary
        );
        scan.close();
    }
}
