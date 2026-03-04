package fundamentals.loops;/*Crie um programa que funcione como uma calculadora. Ele deve apresentar um menu ao usuário e repetir a
operação até que o usuário escolha a opção "Sair" (por exemplo, opção 0).
Use um loop do...while para garantir que o menu seja exibido pelo menos uma vez e continue
repetindo.
Use um switch para tratar as opções do menu (Ex: 1. Somar, 2. Subtrair, 3. Multiplicar, 4. Dividir, 0.
Sair).
Dentro da opção de divisão (no switch), use um if para verificar se o divisor é zero. Se for, informe o
usuário que a divisão por zero é impossível.
Use o comando break para sair do loop do...while quando a opção 0 for escolhida.
*/

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int option;
        double result = 0;

        System.out.println("Enter the first number:");
        double firstNumber = scan.nextDouble();

        do {
            System.out.println("\nChoose the operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("0. Exit");

            option = scan.nextInt();

            if (option == 0) {
                break;
            }

            if (option < 0 || option > 4) {
                System.out.println("Invalid option!");
                continue;
            }

            System.out.println("Enter the second number:");
            double secondNumber = scan.nextDouble();

            switch (option) {
                case 1:
                    result = firstNumber + secondNumber;
                    break;

                case 2:
                    result = firstNumber - secondNumber;
                    break;

                case 3:
                    result = firstNumber * secondNumber;
                    break;

                case 4:
                    if (secondNumber == 0) {
                        System.out.println("Division by zero is impossible!");
                        continue;
                    }
                    result = firstNumber / secondNumber;
                    break;
            }

            firstNumber = result;
            System.out.println("Current result: " + result);

        } while (option != 0);

        System.out.println("Final result: " + firstNumber);
        scan.close();
    }
}
