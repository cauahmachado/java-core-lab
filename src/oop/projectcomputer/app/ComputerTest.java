package oop.projectcomputer.app;

import oop.projectcomputer.entities.Computer;

import java.math.BigDecimal;

public class ComputerTest {
    static void main() {
        Computer computer1 = new Computer("HP", "Azul", "DS231S", 231354, BigDecimal.valueOf(33.22));
        System.out.println(computer1);
        computer1.calculateValue();
        System.out.println(computer1);

        Computer computer2 = new Computer("ibm", "Preto", "FDSJN23", 23131, BigDecimal.valueOf(56.21));
        System.out.println(computer2);
        computer2.calculateValue();
        System.out.println(computer2);

        if (computer2.changeValue(BigDecimal.valueOf(22.43)) == 1){
            System.out.println("Valor alterado");
        }else {
            System.out.println("Valor não alterado");
        }
        System.out.println(computer2);
    }
}