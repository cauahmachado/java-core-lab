package fundamentals.loops;//Faça um algoritmo que imprima na tela a tabuada de 1 até 10.
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual número você quer a tabuada?");
        int num = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", num, i, num * i);
        }
        scan.close();
    }
}
