package fundamentals.loops;

/*Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano.
Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que
Francisco seja maior que Sara.*/
public class Exercicio15 {
    public static void main(String[] args) {

        double franciscoHeight = 1.50;
        double saraHeight = 1.10;

        final double francisco_growth = 0.02;
        final double sara_growth = 0.03;

        int years = 0;

        while (saraHeight < franciscoHeight) {
            franciscoHeight += francisco_growth;
            saraHeight += sara_growth;
            years++;
        }

        System.out.println("Years needed: " + years);
    }
}
