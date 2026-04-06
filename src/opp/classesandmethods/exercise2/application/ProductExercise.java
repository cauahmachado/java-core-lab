package opp.classesandmethods.exercise2.application;

import opp.classesandmethods.exercise2.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProductExercise {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Product product = new Product();
        System.out.println("Enter product data:");
        System.out.print("Name: ");
        product.nome = scanner.nextLine();
        System.out.print("Price: ");
        product.preco = scanner.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantidade = scanner.nextInt();

        System.out.println("Product data: "+product);

        System.out.println();
        System.out.print("Quantity of products to be added in stock: ");
        int quantity = scanner.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: "+product);

        System.out.println();
        System.out.println("Quantity of products to be removed in stock: ");
        quantity = scanner.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: "+product);

        scanner.close();
    }
}
