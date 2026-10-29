package oop.projectolderarray.app;

import oop.projectolderarray.entities.Person;

import java.util.Scanner;

public class OlderArray {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas pessoas vai digitar? ");
        int tamanho = Integer.parseInt(scanner.nextLine());

        Person[] pessoas = new Person[tamanho];
        for (int i = 0; i < pessoas.length; i++) {
            Person pessoa = new Person();
            System.out.print("Digite o nome da " + (i + 1) + "° pessoa: ");
            pessoa.setNome(scanner.nextLine());
            System.out.print("Digite a idade da " + (i + 1) + "° pessoa: ");
            pessoa.setIdade(Integer.parseInt(scanner.nextLine()));
            pessoas[i] = pessoa;
        }
        //mais velho
        int maior = 0;
        for (Person pessoa : pessoas) {
            if (pessoa.getIdade() > maior) {
                maior = pessoa.getIdade();
            }
        }
        System.out.println("Pessoa mais velha: ");
        for (Person pessoa : pessoas){
            if (pessoa.getIdade()==maior){
                System.out.println(pessoa.getNome());
            }
        }
    }
}
