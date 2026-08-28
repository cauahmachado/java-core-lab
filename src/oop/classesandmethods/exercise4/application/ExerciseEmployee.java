/*Fazer um programa para ler os dados de um funcionário(name,salário bruto e imposto).
* Em seguida, mostrar os dados do funcionário(name e salário líquido).
* Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada(somente o salário bruto é afetada pela porcentagem)
* e mostrar novamente os dados do funcionário. Use a classe projetada abaixo
* */
package oop.classesandmethods.exercise4.application;

import oop.classesandmethods.exercise4.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class ExerciseEmployee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = scanner.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = scanner.nextDouble();
        System.out.print("Tax: ");
        employee.tax = scanner.nextDouble();

        System.out.println();
        System.out.print("Employee: " );
        System.out.print(employee.name+", ");
        System.out.println("$"+employee.calculateNetSalary());

        System.out.println("Which percentage to increase salary? ");
        employee.increaseSalary(scanner.nextDouble());

        System.out.print("Updated data: ");
        System.out.print(employee.name+", ");
        System.out.println("$"+employee.calculateNetSalary());

    }
}
