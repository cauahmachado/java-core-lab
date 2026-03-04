package fundamentals.controlstructures;/*Um programa para calcular o preço final de uma compra. O usuário deve inserir
o valor total da compra e o tipo de cliente (1-Regular, 2-Bronze, 3-Prata, 4-Ouro).
O tipo de cliente determina o desconto: Regular (0%), Bronze (5%), Prata (10%) e
Ouro (15%). Adicionalmente, se o valor da compra for superior a R$ 500,00, um
desconto adicional de 5% é aplicado sobre o valor já com o primeiro desconto.
Use switch para o desconto do cliente e if para o desconto adicional.*/

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double discountedPrice;
        double finalPrice;

        System.out.println("Enter the total purchase value:");
        double totalPurchaseValue = scan.nextDouble();

        System.out.println("Enter the customer type (1-Regular, 2-Bronze, 3-Silver, 4-Gold):");
        int customerType = scan.nextInt();

        switch (customerType) {
            case 1:
                discountedPrice = totalPurchaseValue;
                break;
            case 2:
                discountedPrice = totalPurchaseValue - (totalPurchaseValue * 0.05);
                break;
            case 3:
                discountedPrice = totalPurchaseValue - (totalPurchaseValue * 0.10);
                break;
            case 4:
                discountedPrice = totalPurchaseValue - (totalPurchaseValue * 0.15);
                break;
            default:
                System.out.println("Invalid customer type");
                scan.close();
                return;
        }

        if (totalPurchaseValue > 500) {
            finalPrice = discountedPrice - (discountedPrice * 0.05);
        } else {
            finalPrice = discountedPrice;
        }

        System.out.printf("Final price: R$ %.2f%n", finalPrice);

        scan.close();
    }
}
