package fundamentals.loops;/*Peça ao usuário um número N e imprima os N primeiros termos da sequência de Fibonacci (0, 1, 1, 2, 3, 5, 8...).
Restrição: Você não pode usar vetores.
Dica de "pensar": Você só precisa de três variáveis: anterior, atual e proximo.
Use um loop for que rode N vezes.
Dentro do loop, imprima o valor anterior. Calcule proximo = anterior + atual. Atualize as
variáveis: anterior = atual e atual = proximo.
Use if para tratar os casos base (os dois primeiros números).
*/


import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int previous = 0;
        int current = 1;
        int next;

        System.out.println("How many Fibonacci numbers do you want to print?");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(previous);

            next = previous + current;
            previous = current;
            current = next;
        }

        scan.close();
    }
}

