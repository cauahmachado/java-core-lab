package oop.projectaverageheightvector.app;

import oop.projectaverageheightvector.entities.Person;

import java.util.Scanner;

public class AverageHeightVector {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tamanho da array: ");
        int tamanho = Integer.parseInt(scanner.nextLine());

        Person[] people = new Person[tamanho];
        Person person = new Person();
        for (int i = 0; i < people.length; i++) {

            System.out.println("Dados da " + (i + 1) + "° pessoa");
            System.out.print("Nome: ");
            person.setNome(scanner.nextLine());
            System.out.print("Idade: ");
            person.setIdade(Integer.parseInt(scanner.nextLine()));
            System.out.print("Altura: ");
            person.setAltura(Double.parseDouble(scanner.nextLine()));
            people[i] = person;
        }

        //Altura média
        double somaAltura = 0;
        for (Person value : people) {
            somaAltura += value.getAltura();
        }
        double media = somaAltura / people.length;
        System.out.println("Altura média: " + media);

        //% de pessoas < 16 anos
        int qtd = 0;
        for (Person value : people) {
            if (value.getIdade() < 16) {
                qtd += 1;
            }
        }
        double  porcentagem = (double) (qtd * 100) /people.length;
        System.out.println("Pessoas com menos de 16 anos: "+porcentagem+"%");
        for (Person value : people) {
            if (value.getIdade() < 16) {
                System.out.println(value.getNome());
            }

        }
        scanner.close();


    }
}
