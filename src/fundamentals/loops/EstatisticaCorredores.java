package fundamentals.loops;

import java.util.Scanner;

public class EstatisticaCorredores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qtdVeteranos = 0;
        int menor = 0;
        int media = 0;
        int total = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Tempo da corrida");
            int tempo = scanner.nextInt();
            System.out.println("Idade");
            int idade = scanner.nextInt();
            total += tempo;
            media = total / 5;
            if (idade > 50) {
                qtdVeteranos++;
            }
            if (i == 0) {
                menor = tempo;
            }
            if (tempo < menor) {
                menor = tempo;
            }
        }

        System.out.println("Media: " + media);
        System.out.println("Quantidade de veteranos: " + qtdVeteranos);
        System.out.println("Menor tempo: " + menor);
    }
}