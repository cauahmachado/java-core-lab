package oop.classesandmethods.exercise5.application;

import oop.classesandmethods.exercise5.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class ExerciseStudent {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Student student = new Student();

        student.nome = scanner.nextLine();
        student.nota1 = scanner.nextDouble();
        student.nota2 = scanner.nextDouble();
        student.nota3 = scanner.nextDouble();

        System.out.printf("FINAL GRADE = %.2f%n ", student.calculateFinalGrade());

        if (student.calculateFinalGrade() < 60){
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        }else {
            System.out.println("PASS");
        }
        scanner.close();
    }
}
