package oop.classesandmethods.exercise7.application;

import oop.classesandmethods.exercise7.util.CurrencyConverter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double price = scanner.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double amount = scanner.nextDouble();

        double result = CurrencyConverter.converter(amount, price);

        System.out.printf("Amount to be paid in reais = %.2f%n", result);

        scanner.close();
    }
}