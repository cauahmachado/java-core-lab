package fundamentals.matrices;/*
Matriz Transposta: Implemente uma função que receba uma matriz de números reais de dimensões N x M.
A função deve gerar e imprimir a matriz transposta (invertendo as linhas e colunas).
Peça ao usuário para preencher a matriz original no programa principal antes de chamar a função.
*/


import java.util.Scanner;

public class TransposeMatrix {

    public static double[][] transpose(double[][] matrix) {
        double[][] transposed = new double[matrix[0].length][matrix.length];
        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[0].length; j++) {
                transposed[i][j] = matrix[j][i];
            }
        }
        return transposed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter N (rows): ");
        int n = scanner.nextInt();
        System.out.print("Enter M (columns): ");
        int m = scanner.nextInt();

        double[][] matrix = new double[n][m];

        System.out.println("\nFill the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("Position [%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextDouble();
            }
        }

        // Processing
        double[][] transposed = transpose(matrix);

        // Output
        System.out.println("\nOriginal matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%8.2f", matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nTransposed matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%8.2f", transposed[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}