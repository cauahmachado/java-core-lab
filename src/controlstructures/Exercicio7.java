package controlstructures;//Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean firstValue = scanner.nextBoolean();
        boolean secondValue = scanner.nextBoolean();
        if (firstValue && secondValue) {
            System.out.println("Both are true");
        } else if (!firstValue && !secondValue) {
            System.out.println("Both are false");
        }
        scanner.close();
    }
}
