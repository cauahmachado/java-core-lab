package oop.projectcamp.app;

import oop.projectcamp.entities.Camper;

public class CamperTest {
    static void main() {
        try {
            Camper camperService = new Camper("Pedro", -50);
            System.out.println(camperService);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar participante: " + e.getMessage());
        }

        try {
            Camper camperService = new Camper("Pedro", 50);
            System.out.println(camperService);
            camperService.separateGroup();
            System.out.println(camperService);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar participante: " + e.getMessage());
        }
    }
}
