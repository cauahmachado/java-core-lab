/*
Matriz Triangular:
Faça um programa para gerar e imprimir uma matriz quadrada de ordem 5 (5x5) cujos valores preenchidos representem uma matriz triangular superior (elementos abaixo da diagonal principal devem ser zero).
*/
package fundamentals.matrices;

public class Exercicio51 {
    public static void main(String[] args) {
            int[][] matrix = new int[5][5];

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[i][j] = (j >= i) ? 1 : 0;
                }
            }

        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
