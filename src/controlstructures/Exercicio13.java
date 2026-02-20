package controlstructures;/*Faça um algoritmo que leia três valores que
representam os três lados de um triângulo e verifique se são válidos,
determine se o triângulo é
equilátero, isósceles ou escaleno.*/

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first side of the triangle:");
        double sideA = scan.nextDouble();

        System.out.println("Enter the second side of the triangle:");
        double sideB = scan.nextDouble();

        System.out.println("Enter the third side of the triangle:");
        double sideC = scan.nextDouble();

        // Triangle validity check
        if (sideA + sideB > sideC &&
                sideA + sideC > sideB &&
                sideB + sideC > sideA) {

            if (sideA == sideB && sideA == sideC) {
                System.out.println("Equilateral triangle");
            } else if (sideA == sideB || sideA == sideC || sideB == sideC) {
                System.out.println("Isosceles triangle");
            } else {
                System.out.println("Scalene triangle");
            }

        } else {
            System.out.println("Based on the given measurements, the triangle is not valid");
        }

        scan.close();
    }
}
