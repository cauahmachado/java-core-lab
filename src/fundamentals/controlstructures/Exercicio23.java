package fundamentals.controlstructures;/* Descrição: Crie um sistema completo para processar notas de alunos que
funcione com diferentes escalas de avaliação e faça múltiplas análises.
Funcionalidades:
1. Receba 4 notas de um aluno (podem estar em escalas diferentes)
2. Converta todas para escala 0-10 se necessário
3. Calcule a média ponderada (pesos: 2, 2, 3, 3)
4. Determine o conceito final
5. Verifique se precisa de recuperação
6. Calcule quanto precisa tirar na prova final
Escalas suportadas:
• Escala A: 0-10
• Escala B: 0-100
• Escala C: A, B, C, D, F (A=10, B=8, C=6, D=4, F=0)
Conceitos:
• A: 9.0-10.0 (Excelente)
• B: 7.0-8.9 (Bom)
• C: 5.0-6.9 (Regular)
• D: 3.0-4.9 (Insuficiente)
• F: 0.0-2.9 (Reprovado)*/

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] weights = {2, 2, 3, 3};
        double weightedSum = 0;
        double convertedGrade;
        double finalAverage;

        for (int i = 0; i < 4; i++) {

            System.out.println("Enter the scale (A, B or C):");
            String scale = scan.next().toLowerCase();

            switch (scale) {

                case "a" -> {
                    System.out.println("Enter the grade (0-10):");
                    double grade = scan.nextDouble();

                    if (grade < 0 || grade > 10) {
                        System.out.println("Invalid value for this scale.");
                        return;
                    }

                    convertedGrade = grade;
                }

                case "b" -> {
                    System.out.println("Enter the grade (0-100):");
                    double grade = scan.nextDouble();

                    if (grade < 0 || grade > 100) {
                        System.out.println("Invalid value for this scale.");
                        return;
                    }

                    convertedGrade = grade / 10.0;
                }

                case "c" -> {
                    System.out.println("Enter the grade (A, B, C, D, F):");
                    String grade = scan.next().toUpperCase();

                    switch (grade) {
                        case "A" -> convertedGrade = 10;
                        case "B" -> convertedGrade = 8;
                        case "C" -> convertedGrade = 6;
                        case "D" -> convertedGrade = 4;
                        case "F" -> convertedGrade = 0;
                        default -> {
                            System.out.println("Invalid letter grade.");
                            return;
                        }
                    }
                }

                default -> {
                    System.out.println("Invalid scale.");
                    return;
                }
            }

            weightedSum += convertedGrade * weights[i];
        }

        finalAverage = weightedSum / 10.0;

        System.out.printf("Final average: %.2f%n", finalAverage);

        // Final concept
        if (finalAverage >= 9) {
            System.out.println("Concept A - Excellent");
        } else if (finalAverage >= 7) {
            System.out.println("Concept B - Good");
        } else if (finalAverage >= 5) {
            System.out.println("Concept C - Regular");
        } else if (finalAverage >= 3) {
            System.out.println("Concept D - Insufficient");
        } else {
            System.out.println("Concept F - Failed");
        }

        // Recovery check
        if (finalAverage < 7) {

            System.out.println("Student needs final exam.");

            // Rule: (finalAverage + finalExam) / 2 >= 6
            double requiredFinalExam = 12 - finalAverage;

            if (requiredFinalExam > 10) {
                System.out.println("Even scoring 10, the student cannot reach average 6.");
            } else {
                System.out.printf("Needs at least %.2f in the final exam.%n", requiredFinalExam);
            }

        } else {
            System.out.println("Student approved without final exam.");
        }

        scan.close();
    }
}