package fundamentals.loops;/*Peça ao usuário um número ímpar N. Use loops for aninhados para desenhar um losango de asteriscos com
altura N.
Exemplo se N=5:
  *
 ***
*****
 ***
  *
Dica de "pensar": Você precisará dividir o problema em duas partes (a parte de cima, incluindo o meio,
e a parte de baixo), cada uma com seus loops aninhados.
Para cada parte, você precisará de um loop for para os espaços em branco e outro loop for para os
asteriscos.
A lógica de quantos espaços e quantos asteriscos imprimir muda a cada linha (iteração do loop
externo).*/
import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an odd integer number:");
        int n = scan.nextInt();

        for (int line = 0; line <= n / 2; line++) {
            for (int space = 0; space < (n / 2) - line; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < 2 * line + 1; star++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int line = n / 2 - 1; line >= 0; line--) {
            for (int space = 0; space < (n / 2) - line; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < 2 * line + 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scan.close();

    }

}
