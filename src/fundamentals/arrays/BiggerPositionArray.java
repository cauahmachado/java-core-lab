package fundamentals.arrays;

import java.util.Scanner;

public class BiggerPositionArray {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tamanho da array: ");
        int tamanho = Integer.parseInt(scanner.nextLine());

        double[] array = new double[tamanho];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Digite o número da posição "+(i+1)+"°: ");
            array[i] = Double.parseDouble(scanner.nextLine());
        }

        double maior = 0;
        int posicao = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maior){
                maior = array[i];
                posicao = i;
            }
        }
        System.out.println("Maior valor: "+ maior );
        System.out.println("Posição do maior valor: "+posicao);


    }
}
