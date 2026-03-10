/*
Análise de Reais:
Faça um programa que preencha um vetor com 10 números reais (float/double). O programa deve calcular e mostrar:
A quantidade de números negativos presentes no vetor.
A soma de todos os números positivos
*/

package fundamentals.arrays;

import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        double positiveSum = 0;
        int negativeCount = 0;

        System.out.println("Enter 10 real numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        for (double number : numbers) {
            if (number > 0) {
                positiveSum += number;
            } else if (number < 0) {
                negativeCount++;
            }
        }

        System.out.println("\nNegative count: " + negativeCount);
        System.out.printf("Sum of positive numbers: %.2f%n", positiveSum);

        scanner.close();
    }
}
