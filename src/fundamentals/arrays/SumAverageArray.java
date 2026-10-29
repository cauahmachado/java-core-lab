package fundamentals.arrays;

import java.util.Scanner;

public class SumAverageArray {
    static void main() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Tamanho do vetor");
        int tamanho = Integer.parseInt(scanner.nextLine());

        double[] array = new double[tamanho];

        //inserção dos valores
        for (int i = 0; i < array.length; i++) {
            System.out.println("Digite o "+(i+1)+"° termo");
            array[i] = Double.parseDouble(scanner.nextLine());
        }

        //print valores
        System.out.print("Valores: ");
        for (Double v : array){
            System.out.print(v+" ");
        }
        System.out.println();

        //soma
        double soma =0;
        for (Double v : array){
            soma+=v;
        }
        System.out.println("Soma: "+soma);

        //media
        double media = soma/array.length;
        System.out.println("Média: "+media);
    }
}
