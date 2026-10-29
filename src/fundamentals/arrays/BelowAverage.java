package fundamentals.arrays;

import java.util.Scanner;

public class BelowAverage {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantidade de elementos do vetor: ");
        int tamanho = Integer.parseInt(scanner.nextLine());

        double[] array = new double[tamanho];

        System.out.println("Digite os elementos: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Digite o elemento da " + (i + 1) + "° posição: ");
            array[i] = Double.parseDouble(scanner.nextLine());
        }

        //media
        double soma = 0;
        for (Double valor : array) {
            soma += valor;

        }
        double media = soma / tamanho;

        System.out.println("Media do vetor: " + media);

        System.out.println("Valores abaixo da média: ");
        for (Double valor : array) {
            if (valor < media) {
                System.out.println(valor);
            }
        }

    }
}
