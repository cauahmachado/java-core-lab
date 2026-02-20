package loops;/*Peça ao usuário dois números inteiros positivos, A e B. Calcule o Máximo Divisor Comum (MDC) entre eles
usando o algoritmo de Euclides (subtrações sucessivas ou módulo).
Metodo do Módulo (Recomendado):
Use um loop while que execute enquanto B for diferente de 0.
Dentro do loop:
1. Armazene B em uma variável temporária (ex: temp = B).
2. Atualize B para ser o resto da divisão de A por B (B = A % B).
3. Atualize A para ser o valor de temp (A = temp).
Quando o loop terminar (quando B for 0), o valor de A será o MDC.*/

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a positive integer (A):");
        int a = scan.nextInt();

        System.out.println("Enter another positive integer (B):");
        int b = scan.nextInt();

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("GCD (Greatest Common Divisor): " + a);

        scan.close();
    }
}

