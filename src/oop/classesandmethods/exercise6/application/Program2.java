package oop.classesandmethods.exercise6.application;

import oop.classesandmethods.exercise6.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

import static oop.classesandmethods.exercise6.application.Program.*;

public class Program2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        //Agora que membros da classe calculator não são estáticos, eu tenho que instanciar o objeto
        Calculator calculator = new Calculator();

        System.out.println("Enter radius");
        double radius = scanner.nextDouble();

        double c = calculator.circumference(radius);

        double v= calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", PI);
    }
}
