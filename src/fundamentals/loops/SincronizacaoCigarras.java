package fundamentals.loops;

import java.util.Scanner;

public class SincronizacaoCigarras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ano inicial (>=2021 e <= 3000)");
        int startYear = scanner.nextInt();

        if (startYear < 2021 || startYear > 3000) {
            System.out.println("Ano Invalido");
            return;
        }

        int cigarra1 = startYear + 13;
        int cigarra2 = startYear + 17;
        int qtdCigarra1 = 1;
        int qtdCigarra2 = 1;
        int qtdAchado = 0;
        do {
            if (cigarra1 < cigarra2) {
                cigarra1 += 13;
                qtdCigarra1++;
            } else {
                cigarra2 += 17;
                qtdCigarra2++;
            }
            if (cigarra1 == cigarra2) {
                System.out.println(cigarra1);
                System.out.println("Elemento: " + qtdCigarra1);
                System.out.println(cigarra2);
                System.out.println("Elemento: " + qtdCigarra2);
                qtdAchado++;
            }
        } while (qtdAchado < 3);
    }
}