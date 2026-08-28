package fundamentals.loops;

import java.util.Scanner;

public class ControleQualidadePecas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sizePeca = 0;
        int answer = 2;
        int qtdAnalisada = 0, qtdAprovada = 0, qtdReprovada = 0;
        do {
            System.out.println("Tamanho da peça em mm: ");
            sizePeca = scanner.nextDouble();
            if (sizePeca <= 0) {
                System.out.println("ERRO! Digite um valor valido");
            } else {
                qtdAnalisada++;
                if (sizePeca >= 10 && sizePeca <= 12) {
                    System.out.println("Aprovado");
                    qtdAprovada++;
                } else {
                    System.out.println("Reprovado");
                    qtdReprovada++;
                }
                System.out.println("Deseja analisar outra peça: 1-SIM / 0-NÃO");
                answer = scanner.nextInt();
            }
        } while (sizePeca <= 0 || answer == 1);
        System.out.println("Quantidade analisadas: " + qtdAnalisada);
        System.out.println("Quantidade Aprovadas: " + qtdAprovada);
        System.out.println("Quantidade reprovadas: " + qtdReprovada);
    }
}