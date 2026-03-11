/*
Soma de Matrizes:
Escreva um programa que leia duas matrizes, A e B, de dimensão 4x2. Construa uma matriz C de mesma dimensão, onde cada elemento de C seja a soma dos elementos correspondentes (mesma posição) de A e B.
*/

package fundamentals.matrices;

import java.util.Scanner;

public class Exercicio52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] matrixA = new double[4][2];
        double[][] matrixB = new double[4][2];
        double[][] matrixC = new double[4][2];

        System.out.println("Enter matrix A (4x2):");
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                matrixA[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Enter matrix B (4x2):");
        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                matrixB[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < matrixC.length; i++) {
            for (int j = 0; j < matrixC[0].length; j++) {
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        System.out.println("\nMatrix C (A + B):");
        for (double[] row : matrixC) {
            for (double v : row) {
                System.out.printf("%.2f ", v);
            }
            System.out.println();
        }
        scanner.close();
    }
}
