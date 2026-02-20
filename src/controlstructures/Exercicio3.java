package controlstructures;/*Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais,
deverá somar os dois valores, caso contrário devera multiplicar A por B.
Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
imprimir seu valor na tela.*/

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int numberA = scan.nextInt();
        System.out.println("Enter the second number:");
        int numberB = scan.nextInt();
        int numberC;
        if (numberA == numberB) {
            numberC = numberA + numberB;
        } else {
            numberC = numberA * numberB;
        }
        System.out.println("Final result: " + numberC);

        scan.close();
    }
}
