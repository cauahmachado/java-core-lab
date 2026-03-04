package fundamentals.logic;/*Faça um algoritmo que leia uma temperatura em Fahrenheit e
calcule a temperatura correspondente em grau Celsius.
Imprima na tela as duas temperaturas.

Fórmula: C = (5 * (F-32) / 9)*/

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit:");
        double temperatureF = scan.nextDouble();
        double temperatureC = (5 * (temperatureF - 32) / 9);
        System.out.printf("The temperature %.2f °F in Celsius is %.2f °C%n", temperatureF, temperatureC);
        scan.close();
    }
}
