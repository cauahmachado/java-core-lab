package fundamentals.arrays;

import java.util.Scanner;

public class ArrayNegative {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tamanho da array: ");
        int tamanho = Integer.parseInt(scanner.nextLine());
        double[] array = new double[tamanho];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Digite o "+(i+1)+"° valor");
            array[i] = Double.parseDouble(scanner.nextLine());
        }

        System.out.println("Números ímpares da array");
        for (double v : array) {
            if (v < 0) {
                System.out.println(v);
            }
        }

    }
}
