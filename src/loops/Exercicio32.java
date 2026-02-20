package loops;/*Peça ao usuário um número inteiro (ex: 4521). O programa deve inverter esse número e imprimi-lo (ex: 1254).
Restrição: Sem strings ou vetores.
Dica de "pensar": Você precisará usar o operador de módulo (% 10) para "arrancar" o último dígito e a
divisão inteira (/ 10) para "remover" o último dígito.
Use um loop while que continue enquanto o número original for maior que 0.
Crie uma variável numeroInvertido = 0.
Dentro do loop:
1. digito = numero % 10;
2. numeroInvertido = (numeroInvertido * 10) + digito;
3. numero = numero / 10;
Imprima numeroInvertido após o loop*/

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer number:");
        int originalNumber = scan.nextInt();

        int lastDigit;
        int reversedNumber = 0;

        while (originalNumber > 0) {
            lastDigit = originalNumber % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            originalNumber = originalNumber / 10;
        }

        System.out.println("Reversed number: " + reversedNumber);
    }
}

