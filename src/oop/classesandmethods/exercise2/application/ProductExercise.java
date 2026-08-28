package oop.classesandmethods.exercise2.application;

import oop.classesandmethods.exercise2.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProductExercise {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Product product = new Product();
        System.out.println("Enter product data:");
        System.out.print("Name: ");
        product.name = scanner.nextLine();
        System.out.print("Price: ");
        product.price = scanner.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Product data: "+product);

        System.out.println();
        System.out.print("Quantity of products to be added in stock: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: "+product);

        System.out.println();
        System.out.println("Quantity of products to be removed in stock: ");
        quantity = scanner.nextInt();
        scanner.nextLine();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: "+product);

        scanner.close();
    }
}
