/*
Média Escolar:
Escreva um programa para ler a nota da prova de 15 alunos e armazene-as em um vetor. Calcule e imprima a média geral da turma.
*/
package fundamentals.arrays;

import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] grades = new double[15];
        double totalSum = 0;

        System.out.println("Enter the grade for each of the 15 students:");
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
        }

        for (double grade : grades) {
            totalSum += grade;
        }
        double classAverage = totalSum / grades.length;

        System.out.printf("%nClass average: %.2f%n", classAverage);

        scanner.close();
    }
}
