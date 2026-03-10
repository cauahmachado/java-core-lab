/*
Processamento de Índices:
Escreva um programa que leia 10 valores em um vetor A. Construa um vetor B de mesmo tamanho seguindo a regra:
Se o índice do elemento for par, o valor de B deve ser o valor de A multiplicado por 5.
Se o índice do elemento for ímpar, o valor de B deve ser o valor de A somado com 5.
Ao final, imprima ambos os vetores na ordem inversa (do último ao primeiro elemento).
*/

package fundamentals.arrays;

import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            b[i] = (i % 2 == 0) ? a[i] * 5 : a[i] + 5;
        }

        System.out.print("\nA: { ");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println("}");

        System.out.print("B: { ");
        for (int i = b.length - 1; i >= 0; i--) {
            System.out.print(b[i] + " ");
        }
        System.out.println("}");

        scanner.close();
    }
}
