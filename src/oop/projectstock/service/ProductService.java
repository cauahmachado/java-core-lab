package oop.projectstock.service;

import oop.projectstock.entities.Product;

import java.util.Scanner;

public class ProductService {
    Scanner scanner = new Scanner(System.in);
    Product product = new Product();

    public void execRegister(){
        System.out.println("Enter the product code: ");
        int codeProduct = scanner.nextInt();
        System.out.println("Enter the product description: ");
        scanner.nextLine();
        String descriptionProduct = scanner.nextLine();
        System.out.println("Enter the quantity in stock: ");
        int quantityProduct = scanner.nextInt();
        System.out.println("Enter the manufacturer: ");
        scanner.nextLine();
        String manufacturer = scanner.nextLine();

        product.setCode(codeProduct);
        product.setDescription(descriptionProduct);
        product.setQuantity(quantityProduct);
        product.setManufacturer(manufacturer);
    }

    public void execAddProduct(){
        System.out.println("Enter the quantity to add: ");
        int quantity = scanner.nextInt();
        product.addProduct(quantity);
    }

    public void execRemoveProduct(){
        System.out.println("Enter the quantity to remove: ");
        int quantity = scanner.nextInt();
        if (product.removeProduct(quantity)){
            System.out.println("Product removed successfully");
        }else {
            System.out.println("Product not removed. Check if the quantity is correct.");
        }
    }

    public void execQuery(){
        System.out.println("!!INFORMATIONS!!");
        System.out.println(product);
        System.out.println("================");
    }

    public boolean exists(){
        return product.getManufacturer() != null;
    }
}
