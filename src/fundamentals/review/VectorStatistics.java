/*
Estatísticas de um Vetor: Crie uma função que receba um vetor de números inteiros e o
seu tamanho. A função deve retornar a média aritmética dos elementos do vetor, mas desconsiderando o maior e o menor valor encontrados. No programa principal (main), solicite
ao usuário os elementos do vetor, chame a função e exiba o resultado.
*/
package fundamentals.review;

import java.util.Scanner;

public class VectorStatistics {

    public static double calculateTrimmedAverage(double[] vector) {
        double highest = vector[0];
        double lowest = vector[0];

        // Find highest and lowest
        for (double value : vector) {
            if (value > highest) highest = value;
            if (value < lowest) lowest = value;
        }

        // Sum excluding highest and lowest
        double sum = 0;
        int count = 0;
        for (double value : vector) {
            if (value != lowest && value != highest) {
                sum += value;
                count++;
            }
        }

        return count > 0 ? sum / count : 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter the vector size: ");
        int size = scanner.nextInt();
        double[] vector = new double[size];

        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            vector[i] = scanner.nextDouble();
        }

        // Output
        System.out.printf("%nTrimmed average: %.2f%n", calculateTrimmedAverage(vector));

        scanner.close();
    }
}