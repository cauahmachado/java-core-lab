/*
Decomposição Numérica: Peça ao usuário dois números inteiros positivos (a e b) menores que 10.000.
Crie dois vetores (va e vb) onde cada posição armazene um algarismo do número.
A posição 0 deve conter o algarismo menos significativo (unidade).
*/
package fundamentals.arrays;

import java.util.Scanner;

public class Exercicio53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //9.999 ⇾ max = 4 dígitos
        int[] va = new int[4];
        int[] vb = new int[4];

        System.out.println("Enter two positive integers (max 9999):");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = 0; i < va.length; i++) {
            va[i] = a % 10;
            a /= 10;
        }
        for (int i = 0; i < vb.length; i++) {
            vb[i] = b % 10;
            b /= 10;
        }

        System.out.println("\nVector A:");
        for (int i = 0; i < va.length; i++) {
            System.out.println("  va[" + i + "] = " + va[i]);
        }

        System.out.println("Vector B:");
        for (int i = 0; i < vb.length; i++) {
            System.out.println("  vb[" + i + "] = " + vb[i]);
        }

        scanner.close();
    }
}