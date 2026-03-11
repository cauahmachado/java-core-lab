/*
Sistema de Correção: Leia uma matriz 5x10 representando as respostas de 10 questões de múltipla escolha de 5 alunos. Leia também um vetor de 10 posições contendo o gabarito oficial (caracteres 'a', 'b', 'c' ou 'd').
O programa deve comparar as respostas e gerar um vetor chamado resultado, contendo a pontuação final (0 a 10) de cada aluno.
*/
package fundamentals.matrices;



import java.util.Objects;
import java.util.Scanner;

public class Exercicio54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] answers = new char[5][10];
        char[] answerKey = new char[10];
        int[] results = new int[5];

        //respostas dos alunos
        System.out.println("Enter answers for each student (a, b, c or d):");
        for (int student = 0; student < answers.length; student++) {
            System.out.println("Student " + (student + 1) + ":");
            for (int question = 0; question < answers[0].length; question++) {
                answers[student][question] = scanner.next().charAt(0);
            }
        }

        //gabarito
        System.out.println("\nEnter the answer key:");
        for (int question = 0; question < answerKey.length; question++) {
            answerKey[question] = scanner.next().charAt(0);
        }

        for (int student = 0; student < answers.length; student++) {
            for (int question = 0; question < answers[0].length; question++) {
                if (answers[student][question] == answerKey[question]) {
                    results[student]++;
                }
            }
        }

        System.out.println("\n--- Results ---");
        for (int student = 0; student < results.length; student++) {
            System.out.println("Student " + (student + 1) + ": " + results[student] + "/10");
        }

        scanner.close();
    }
}
