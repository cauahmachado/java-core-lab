package loops;/*Peça ao usuário para digitar 10 números inteiros. O programa deve calcular e mostrar:
1. A soma de todos os números.
2. A soma apenas dos números pares.
3. A soma apenas dos números com valor superior a 100.
Use um único loop for que rode 10 vezes.
Dentro do loop, use um if para verificar se o número é ímpar (numero % 2 != 0). Se for, use
continue para pular o resto do código referente à soma dos pares e ir para a próxima iteração.
Use outro if para a soma dos maiores que 100*/

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        int somaTodos = 0;
        int somaPar = 0;
        int somaAcimaCem = 0;
        Scanner scan = new Scanner(System.in);
        for (int i=0; i<10;i++){
            System.out.println("Digite um número");
            int numero = scan.nextInt();
            somaTodos +=numero;
            if (numero%2==0){
                somaPar+=numero;
            }
            if (numero>100){
                somaAcimaCem+=numero;
            }
        }
        System.out.println(somaTodos);
        System.out.println(somaPar);
        System.out.println(somaAcimaCem);
    }
}
