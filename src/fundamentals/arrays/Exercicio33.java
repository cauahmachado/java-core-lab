/*
Estatísticas de Vetor:
Desenvolva um programa que leia 5 elementos inteiros em um vetor A. Ao final, o programa deve calcular e exibir:
A soma de todos os valores ímpares.
A soma de todos os valores pares.
A soma total de todos os elementos.
A porcentagem de números ímpares em relação aos pares.
*/

package fundamentals.arrays;
import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] elements = new int[5];

        int evenSum = 0, oddSum = 0, totalSum = 0, evenCount = 0, oddCount = 0;

        for (int i = 0; i < elements.length; i++) {
            elements[i] = scanner.nextInt();
        }

        for (int element : elements) {
            totalSum += element;
            if (element % 2 == 0) {
                evenSum += element;
                evenCount++;
            } else {
                oddSum += element;
                oddCount++;
            }
        }

        System.out.println("\nElements: ");
        for (int element : elements) {
            System.out.print(element + " ");
        }

        System.out.println("\n");

        if (evenCount <= 0) {
            System.out.println("Cannot calculate percentage: even count is zero.");
        } else {
            double ratio = ((double) oddCount / evenCount) * 100;
            System.out.println("Percentage of odd numbers relative to even: " + ratio + "%");
        }

        System.out.println("Sum of odd numbers: " + oddSum);
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of all elements: " + totalSum);

        scanner.close();
    }
}