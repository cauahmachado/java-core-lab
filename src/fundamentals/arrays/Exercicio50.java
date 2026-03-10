/*
Localização de Memória: Desenvolva um programa para ler 5 valores inteiros e, em seguida,
informe ao usuário em qual posição (índice) do vetor se encontram o maior e o menor valor digitados.
*/
package fundamentals.arrays;

import java.util.Scanner;

public class Exercicio50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] elements = new int[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < elements.length; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            elements[i] = scanner.nextInt();
        }

        int highestIndex = 0;
        int lowestIndex = 0;

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] > elements[highestIndex]) highestIndex = i;
            if (elements[i] < elements[lowestIndex]) lowestIndex = i;
        }

        System.out.println("\nHighest value: " + elements[highestIndex] + " at index [" + highestIndex + "]");
        System.out.println("Lowest value:  " + elements[lowestIndex]  + " at index [" + lowestIndex  + "]");

        scanner.close();
    }
}