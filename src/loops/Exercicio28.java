package loops;/*Crie um programa que defina uma senha numérica (ex: int senhaCorreta = 1234;). O programa deve
pedir ao usuário que digite a senha.
O usuário tem no máximo 3 tentativas.
Use um loop for (de i = 1 até 3) para controlar as tentativas.
Dentro do loop, peça a senha. Use um if para verificar se a senha digitada é igual à senhaCorreta.
Se a senha estiver correta, imprima "Acesso permitido" e use o comando break para sair do loop for
imediatamente.
Se a senha estiver incorreta, informe "Senha incorreta. Tentativas restantes: [X]".
Desafio: Após o loop, use um if para verificar se o usuário gastou todas as tentativas (ex: se i > 3) e,
nesse caso, imprima "Acesso bloqueado".
*/

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final int correctPassword = 1234;
        boolean accessGranted = false;


        for (int attempt = 1; attempt <= 3; attempt++) {

            System.out.println("Enter the password (Attempt " + attempt + "° of 3):");
            int enteredPassword = scan.nextInt();

            if (enteredPassword == correctPassword) {
                System.out.println("Access granted");
                accessGranted = true;
                break;
            }else {
                System.out.println("Wrong password");
                System.out.println("Remaining attempts: " + (3 - attempt));
            }
        }
        if (!accessGranted) {
            System.out.println("All attempts used");
            System.out.println("Access blocked");
        }

        scan.close();



    }
}
