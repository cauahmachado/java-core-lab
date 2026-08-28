package oop.classesandmethods.exercise6.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static final double PI= 3.14159;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius");
        double radius = scanner.nextDouble();

        double c = circumference(radius);

        double v= volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", PI);
    }

    public static double circumference(double radius){
        return 2.0 * PI * radius;
    }


    public static double volume(double radius){
        return 4 * PI *radius * radius * radius / 3.0;

    }
}
