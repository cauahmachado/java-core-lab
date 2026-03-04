package fundamentals.controlstructures;/* Faça um algoritmo que leia o valor de um produto e
determine o valor que deve ser pago, conforme a escolha da forma de pagamento
pelo comprador e imprima na tela o valor final do produto a ser pago.
Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
Tabela de Código de Condições de Pagamento
1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
2 - À Vista no cartão de crédito, recebe 10% de desconto
3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%*/

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final double DISCOUNT_PIX = 0.15;
        final double DISCOUNT_CREDIT = 0.10;
        final double INTEREST_RATE = 0.10;

        System.out.println("Product price:");
        double productPrice = scan.nextDouble();

        System.out.println("Payment method:");
        System.out.println("1 - Cash or Pix (15% discount)");
        System.out.println("2 - Credit card (10% discount)");
        System.out.println("3 - Credit card in 2 installments (no discount)");
        System.out.println("4 - Credit card in 3 or more installments (10% interest)");

        int paymentMethod = scan.nextInt();
        double finalPrice;

        switch (paymentMethod) {
            case 1:
                finalPrice = productPrice - (productPrice * DISCOUNT_PIX);
                break;
            case 2:
                finalPrice = productPrice - (productPrice * DISCOUNT_CREDIT);
                break;
            case 3:
                finalPrice = productPrice;
                break;
            case 4:
                finalPrice = productPrice + (productPrice * INTEREST_RATE);
                break;
            default:
                System.out.println("Invalid option");
                scan.close();
                return;
        }

        System.out.printf("Final price: %.2f%n", finalPrice);

        scan.close();
    }
}
