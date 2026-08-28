/*
Análise de Texto: Escreva uma função que receba uma string (vetor de caracteres) como parâmetro
e retorne a quantity total de vogais nela contidas. Crie uma segunda função que receba a mesma
string e retorne a quantity de consoantes. No programa principal, leia uma frase digitada pelo
usuário e exiba o número de vogais, de consoantes e o tamanho total da string (desconsiderando espaços em branco).
*/
package fundamentals.strings;

import java.util.Scanner;

public class TextAnalysis {

    public static int countVowels(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            switch (current) {
                case 'a': case 'A':
                case 'e': case 'E':
                case 'i': case 'I':
                case 'o': case 'O':
                case 'u': case 'U':
                    count++;
            }
        }
        return count;
    }

    public static int countConsonants(String text) {
        int count = 0;
        String vowels = "aAeEiIoOuU";
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            if (vowels.indexOf(current) == -1 && !Character.isWhitespace(current)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();

        // Processing
        int vowels = countVowels(text);
        int consonants = countConsonants(text);
        int total = vowels + consonants;

        // Output
        System.out.println("\nVowels:     " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Total size: " + total);

        scanner.close();
    }
}