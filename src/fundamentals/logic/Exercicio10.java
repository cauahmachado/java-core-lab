package fundamentals.logic;//Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first grade:");
        double firstGrade = scan.nextDouble();

        System.out.println("Enter the second grade:");
        double secondGrade = scan.nextDouble();

        System.out.println("Enter the third grade:");
        double thirdGrade = scan.nextDouble();

        double average = (firstGrade + secondGrade + thirdGrade) / 3;

        System.out.printf("The average grade is: %.2f%n", average);

        scan.close();
    }
}
