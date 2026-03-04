package fundamentals.controlstructures;/*Receba três números inteiros: dia, mês e ano. Valide se a data é válida. Considere
anos bissextos (divisível por 4, mas não por 100, a menos que seja divisível por
400). Use switch para determinar o número de dias em cada mês e if para as
verificações adicionais.*/
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Day:");
        int day = scan.nextInt();

        System.out.println("Month:");
        int month = scan.nextInt();

        System.out.println("Year:");
        int year = scan.nextInt();

        boolean isValidDate = true;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day < 1 || day > 31) {
                    isValidDate = false;
                }
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                if (day < 1 || day > 30) {
                    isValidDate = false;
                }
                break;

            case 2:
                boolean isLeapYear = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));

                if (isLeapYear) {
                    if (day < 1 || day > 29) {
                        isValidDate = false;
                    }
                } else {
                    if (day < 1 || day > 28) {
                        isValidDate = false;
                    }
                }
                break;

            default:
                isValidDate = false;
        }

        if (isValidDate) {
            System.out.println("Valid date");
        } else {
            System.out.println("Invalid date");
        }

        scan.close();
    }
}
