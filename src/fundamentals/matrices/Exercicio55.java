/*
Matriz Identidade: Gere e imprima uma matriz de ordem 7 (7x7) do tipo Identidade (1 na diagonal principal e 0 nas demais posições).

*/
package fundamentals.matrices;

public class Exercicio55 {
    public static void main(String[] args) {
        int[][] matrix = new int[7][7];


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (i == j) ? 1 : 0;
            }
        }

        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}