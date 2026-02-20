package controlstructures;//Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número");
        int numeroA = scan.nextInt();
        System.out.println("Digite outro número");
        int numeroB = scan.nextInt();
        System.out.println("Digite outro número");
        int numeroC = scan.nextInt();

        if (numeroA>numeroB){
            if (numeroA>numeroC){
                if (numeroB>numeroC){
                    System.out.println(numeroA+ " " + numeroB+ " " + numeroC);
                }else {
                    System.out.println(numeroA+ " " + numeroC+ " " + numeroB);
                }
            }else {
                System.out.println(numeroC+ " " + numeroA+ " " + numeroB);
            }
        } else if (numeroB>numeroC) {
            if (numeroA>numeroC){
                System.out.println(numeroB+ " " + numeroA+ " " + numeroC);
            }else {
                System.out.println(numeroB+ " " + numeroC+ " " + numeroA);
            }

        }else {
            System.out.println(numeroC+ " " + numeroB+ " " + numeroA);
        }
    }
}
