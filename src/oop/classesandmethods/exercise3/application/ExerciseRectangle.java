/*Fazer um programa para ler os valores da largura e altura de um retângulo.
* Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal
* Usar uma classe como mostrado no projeto ao lado
*/

package oop.classesandmethods.exercise3.application;

import oop.classesandmethods.exercise3.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class ExerciseRectangle {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle.width = scanner.nextDouble();
        rectangle.height = scanner.nextDouble();

        //System.out.println(rectangle);


        System.out.printf("AREA = %.2f%n",rectangle.calculateArea());
        System.out.printf("PERIMETER = %.2f%n", rectangle.calculatePerimeter());
        System.out.printf("DIAGONAL = %.2f%n",rectangle.calculateDiagonal());

        scanner.close();

    }
}
