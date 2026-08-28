package fundamentals.matrices;

import java.util.Scanner;

public class QuadradoMagico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a proporção de N da matriz quadrada");
        int n = scanner.nextInt();
        double[][] matriz = new double[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Digite a posição [%d][%d]", i, j);
                matriz[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

/*
    public static boolean quadradoMagico(double[][] matriz) {
        double reference = 0;//referencia a soma da primeira linha
        for (int j = 0; j < matriz.length; j++) {
            reference += matriz[0][j];
        }
        for (int i = 0; i < matriz.length; i++) {
            double somalinha = 0;
            for (int j = 0; j < matriz.length; j++) {
                somalinha += matriz[i][j];
            }
            if (somalinha != reference) return false;
        }
        for (int j = 0; j < matriz[0].length; j++) {
            double somacolunas = 0;
            for (int i = 0; i < matriz[0].length; i++) {
                somacolunas += matriz[i][j];
            }
            if (somacolunas != reference) return false;
        }

        for (int i = 0; i < n; i++) {
            diagonal1 += matrix[i][i];  // i e j são o mesmo valor
        }

        for (int i = 0; i < n; i++) {
            diagonal2 += matrix[i][n - 1 - i];
        }
    }*/
}