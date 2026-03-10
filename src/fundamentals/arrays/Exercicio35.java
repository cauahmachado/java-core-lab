/*Inversão Simples: 
Crie um programa que leia 10 valores inteiros e os armazene em um vetor. 
Em seguida, exiba os valores na tela exatamente na ordem inversa à que foram digitados.
*/
package fundamentals.arrays;

import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] elements = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < elements.length; i++) {
            elements[i] = scanner.nextInt();
        }

        System.out.print("\nReversed: { ");
        for (int i = elements.length - 1; i >= 0; i--) {
            System.out.print(elements[i] + " ");
        }
        System.out.println("}");

        scanner.close();
    }
}
