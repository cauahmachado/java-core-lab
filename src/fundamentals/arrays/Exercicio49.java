/*
Extremos e Média: Escreva um programa para ler 5 valores e,
em seguida, mostre todos os valores lidos acompanhados pelo maior valor,
pelo menor valor e pela média aritmética do conjunto.
*/
package fundamentals.arrays;

import java.util.Scanner;

public class Exercicio49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] elements = new double[5];
        double totalSum = 0;

        System.out.println("Enter 5 values:");
        for (int i = 0; i < elements.length; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            elements[i] = scanner.nextDouble();
        }

        double highest = elements[0];
        double lowest = elements[0];

        for (double element : elements) {
            if (element > highest) highest = element;
            if (element < lowest) lowest = element;
            totalSum += element;
        }

        double average = totalSum / elements.length;

        System.out.print("\nValues: { ");
        for (double element : elements) {
            System.out.print(element + " ");
        }
        System.out.println("}");

        System.out.printf("Highest: %.2f%n", highest);
        System.out.printf("Lowest:  %.2f%n", lowest);
        System.out.printf("Average: %.2f%n", average);

        scanner.close();
    }
}
