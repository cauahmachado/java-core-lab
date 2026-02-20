package controlstructures;//Faça um algoritmo que leia os valores de A, B, C e em seguida
//imprima na tela a soma entre A e B é mostre se a soma é menor que C.

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite A");
        double numeroA = scan.nextDouble();
        System.out.println("Digite B");
        double numeroB = scan.nextDouble();
        System.out.println("Digite C");
        double numeroC = scan.nextDouble();
        double soma = numeroA + numeroB;
        System.out.println("Soma de A + B = " + (soma));
        System.out.println(soma > numeroC ? "A soma não é menor que " + numeroC : "A soma é igual ou menor que " + numeroC);
        scan.close();
    }
}
