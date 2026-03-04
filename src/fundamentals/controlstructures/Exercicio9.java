package fundamentals.controlstructures;/* Faça um algoritmo que calcule o IMC (Índice de Massa Corporal)
de uma pessoa, leia o seu peso e a sua altura e imprima na tela sua condição
de acordo com a tabela abaixo:
Fórmula do IMC = peso / (altura) ²
Tabela Condições IMC
 Abaixo de 18,5 | Abaixo do peso
 Entre 18,6 e 24,9 | Peso ideal (parabéns)
 Entre 25,0 e 29,9 | Levemente acima do peso
 Entre 30,0 e 34,9 | Obesidade grau I
 Entre 35,0 e 39,9 | Obesidade grau II (severa)
 Maior ou igual a 40 | Obesidade grau III (mórbida)*/

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your weight (kg):");
        double weight = scan.nextDouble();
        System.out.println("Enter your height (m):");
        double height = scan.nextDouble();
        double bmi = weight / (height * height);
        System.out.printf("BMI: %.2f%n", bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25.0) {
            System.out.println("Normal weight");
        } else if (bmi < 30.0) {
            System.out.println("Overweight");
        } else if (bmi < 35.0) {
            System.out.println("Obesity class I");
        } else if (bmi < 40.0) {
            System.out.println("Obesity class II (severe)");
        } else {
            System.out.println("Obesity class III (morbid)");
        }
        scan.close();
    }
}
