package fundamentals.controlstructures;/*Faça um algoritmo que leia quatro notas obtidas por um aluno,
 calcule a média das nota obtidas, imprima na tela o nome do aluno e
 se o aluno foi aprovado ou reprovado.
 Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.*/


import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Student name:");
        String name = scan.nextLine();

        System.out.println("Enter the first grade:");
        double firstGrade = scan.nextDouble();

        System.out.println("Enter the second grade:");
        double secondGrade = scan.nextDouble();

        System.out.println("Enter the third grade:");
        double thirdGrade = scan.nextDouble();

        System.out.println("Enter the fourth grade:");
        double fourthGrade = scan.nextDouble();

        double average = (firstGrade + secondGrade + thirdGrade + fourthGrade) / 4;

        if (average >= 7) {
            System.out.printf("The student %s was approved with an average of %.2f%n", name, average);
        } else {
            System.out.printf("The student %s was not approved and has an average of %.2f%n", name, average);
        }

        scan.close();
    }
}
