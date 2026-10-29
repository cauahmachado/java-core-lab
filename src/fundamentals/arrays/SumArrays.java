package fundamentals.arrays;

import java.util.Scanner;

public class SumArrays {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho da array: ");
        int tamanho = Integer.parseInt(scanner.nextLine());

        double[] arrayA = new double[tamanho];
        double[] arrayB = new double[tamanho];
        double[] arrayC = new double[tamanho];

        System.out.println("Inserindo valores na Array A");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print("Insira valor na "+(i+1)+"° posição: ");
           arrayA[i] = Double.parseDouble(scanner.nextLine());
        }

        System.out.println("Inserindo valores na Array B");
        for (int i = 0; i < arrayB.length; i++) {
            System.out.print("Insira valor na "+(i+1)+"° posição: ");
            arrayB[i] = Double.parseDouble(scanner.nextLine());
        }

        //somando na C
        for (int i = 0; i < arrayC.length; i++) {
            arrayC[i] = arrayA[i]+arrayB[i];
        }

        //print array C
        System.out.println("Valor da soma das arrays: ");
        for (Double valor : arrayC){
            System.out.println(valor);
        }
    }
}
