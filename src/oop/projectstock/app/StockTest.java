package oop.projectstock.app;

import oop.projectstock.service.ProductService;


import java.util.Scanner;

public class StockTest {

   static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductService productService = new ProductService();
        int option = -1;
        do {
            menu();
            System.out.println("Choose an option");
            option = scanner.nextInt();
            switch (option){
                case 1 -> productService.execRegister();
                case 2 -> {
                    if (productService.exists()){
                        productService.execAddProduct();
                    }else {
                        System.out.println("Register product first!");
                    }
                }
                case 3 -> {
                    if (productService.exists()){
                        productService.execRemoveProduct();
                    }else {
                        System.out.println("Register product first!");
                    }
                }
                case 4 -> productService.execQuery();
                case 0 -> System.out.println("EXITING, THANK YOU");
            }

        }while (option!=0);
    }

    public static void menu(){
        System.out.println("=======MENU=======");
        System.out.println("1 - Register");
        System.out.println("2 - Add Product");
        System.out.println("3 - Remove Product");
        System.out.println("4 - Query");
        System.out.println("0 - Exit");
        System.out.println("==================");
    }
}