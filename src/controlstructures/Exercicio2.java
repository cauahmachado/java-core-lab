package controlstructures;//Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é
// par ou ímpar, positivo ou negativo.

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter any number:");
            int number = scan.nextInt();

            if (number > 0) {
                System.out.println("Positive");
            } else if (number < 0) {
                System.out.println("Negative");
            }

            System.out.println(number % 2 == 0 ? "Even" : "Odd");

            scan.close();
        }
    }

