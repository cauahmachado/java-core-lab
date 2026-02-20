package loops;/*Escreva um programa que lê as notas de um número indeterminado de alunos. O programa deve parar de ler
notas quando o usuário digitar -1.
Use um loop while (a condição pode ser while (nota != -1) ou while(1) com break).
Você precisará de duas variáveis de acumulação: somaDasNotas e contadorDeAlunos.
Dica de "pensar": O scanf deve vir antes da verificação do loop (se usar while(nota != -1)) ou
dentro do loop (se usar while(1) com break).
Ao final, fora do loop, use um if para verificar se contadorDeAlunos é maior que zero (para evitar
divisão por zero) antes de calcular e imprimir a média.
*/

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double grade = 0;
        double sumGrades = 0;
        int studentCount = 0;

        while (grade != -1) {

            System.out.println("Enter a grade or type -1 to finish:");
            grade = scan.nextDouble();

            if (grade != -1) {
                sumGrades += grade;
                studentCount++;
            }
        }

        if (studentCount > 0) {
            double classAverage = sumGrades / studentCount;
            System.out.println("Class average: " + classAverage);
        } else {
            System.out.println("Error: No students were entered");
        }

        scan.close();
    }
}
