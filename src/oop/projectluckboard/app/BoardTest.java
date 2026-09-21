/*A loteca Boa Sorte para entreter os seus clientes necessita de um programa em
Java que enquanto os clientes aguardam na fila possam se distrair jogando no
tabuleiro da sorte.
 O Tabuleiro da sorte é um jogo simples, que consistem em uma matriz de 10 x 10 [Bi
dimensional] que cada elemento é um número inteiro entre 0 e 100.
 Esses elementos são gerados aleatoriamente e o usuário deve digitar dois números
também entre 0 e 100.
 A regra para a vitória e prêmio:
◼ Caso um dos números digitados pelo usuário tenha aparecido 3 ou mais vezes no tabuleiro o
usuário é um feliz ganhador.
◼ Prêmio: o valor é de R$ 1000,00 por número encontrado, supondo que no tabuleiro seja
encontrado quatro números iguais a um dos que o usuário tenha digitado, o seu prêmio é de
R$ 4.0000,00.
 Sua missão: desenvolver um programa em Java (Orientado a Objetos) que solucione este
cenário
*/
package oop.projectluckboard.app;

import oop.projectluckboard.entities.Board;

import java.util.Scanner;

public class BoardTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p1 = readNumber(sc, "Digite o palpite 1 do jogo [0..100]: ");
        int p2;
        do {
            p2 = readNumber(sc, "Digite o palpite 2 do jogo [0..100] (diferente do 1): ");
        } while (p2 == p1);

        Board board = new Board();
        double prize = board.play(p1, p2);

        if (prize > 0.0) {
            System.out.printf("Parabéns, você ganhou R$ %,.2f%n", prize);
        } else {
            System.out.println("Infelizmente não foi dessa vez!");
        }
    }

    private static int readNumber(Scanner sc, String message) {
        while (true) {
            System.out.print(message);
            try {
                int n = Integer.parseInt(sc.nextLine().trim());
                if (n >= 0 && n <= 100) return n;
            } catch (NumberFormatException ignored) {
            }
            System.out.println("Entrada inválida. Digite um inteiro entre 0 e 100.");
        }
    }
}