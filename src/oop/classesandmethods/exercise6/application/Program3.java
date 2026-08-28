package oop.classesandmethods.exercise6.application;

import oop.classesandmethods.exercise6.util.Calculator2;

import java.util.Locale;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter radius");
        double radius = scanner.nextDouble();

        double c = Calculator2.circumference(radius);

        double v= Calculator2.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculator2.PI);
    }
}
