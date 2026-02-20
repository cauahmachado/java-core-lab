package loops;/*Peça ao usuário para digitar um número inteiro positivo (ex: 29384). O programa deve percorrer cada dígito
desse número e contar quantos dígitos são pares e quantos são ímpares. (No exemplo 29384, seriam 3 pares
e 2 ímpares).
Restrição: Não use strings ou vetores.
Dica de "pensar": Use um loop while que execute enquanto o número for maior que 0.
Dentro do loop, use o operador módulo (% 10) para obter o último dígito.
Use um if (ou um if ternário como desafio) para verificar se o dígito (digito % 2) é par ou ímpar e
incrementar o contador correspondente.
Use a divisão inteira (/ 10) para "remover" o último dígito do número antes da próxima iteração.*/

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdpar=0;
        int qtdimpar=0;

        System.out.println("Digite um número inteiro positivo");
        int numero = scan.nextInt();
        while(numero>0) {
            int ultimoDigito = numero % 10;

            if (ultimoDigito % 2 == 0) {
                qtdpar++;
            } else {
                qtdimpar++;
            }
            numero = numero / 10;
        }
        System.out.println("Quantidade de numeros pares: "+qtdpar);
        System.out.println("Quantidade de números impares: "+qtdimpar);
        scan.close();
    }
}
