/*
Filtro de Pares:
Crie um programa que solicite ao usuário 10 números inteiros, mas aceite apenas números pares. Caso o usuário digite um ímpar, o programa deve ignorar e pedir o número novamente até completar 10 pares. Ao final, mostre-os na ordem inversa.
*/

package fundamentals.arrays;

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 even numbers:");
        for (int i = 0; i < numbers.length; ) {
            int input = scanner.nextInt();
            if (input % 2 == 0) {
                numbers[i] = input;
                i++;
            } else {
                System.out.println("Odd number ignored, enter an even number:");
            }
        }

        System.out.print("\nNumbers (reversed): { ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("}");

        scanner.close();
    }
}
