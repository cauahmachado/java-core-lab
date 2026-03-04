package fundamentals.logic;//Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scan.nextInt();
        System.out.println("Predecessor: " + (number - 1));
        System.out.println("Successor: " + (number + 1));
        scan.close();
    }
}
