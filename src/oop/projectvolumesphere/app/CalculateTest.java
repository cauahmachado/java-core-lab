package oop.projectvolumesphere.app;

import oop.projectvolumesphere.entities.Sphere;

import java.util.Scanner;

public class CalculateTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sphere sphere = new Sphere();

        System.out.println("Digite o valor do raio: ");
        sphere.setRadius(Double.parseDouble(sc.nextLine()));

        System.out.println("Volume da esfera: ");
        System.out.println(sphere.calculateVolume());

    }
}
