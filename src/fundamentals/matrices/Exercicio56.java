package fundamentals.matrices;

import java.util.Arrays;
import java.util.Random;

public class Exercicio56 {
    public static void main(String[] args) {
        int[][] matrix = new int[9][9];
        int[] vector = new int[81];
        Random random = new Random();

        //preencher matriz com ímpares aleatórios
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; ) {
                int number = random.nextInt(100);
                if (number % 2 != 0) {
                    matrix[i][j] = number;
                    j++;
                }
            }
        }

        // transferir para vetor
        int index = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                vector[index] = matrix[i][j];
                index++;
            }
        }

         // ordenar
        Arrays.sort(vector);


        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }


        System.out.println("\nSorted vector:");
        for (int value : vector) {
            System.out.printf("%4d", value);
        }
        System.out.println();
    }
}
