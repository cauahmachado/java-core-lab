package opp.seminarioassociation.test;


import opp.seminarioassociation.domain.Estudante;
import opp.seminarioassociation.domain.Local;
import opp.seminarioassociation.domain.Professor;
import opp.seminarioassociation.domain.Seminario;

/**
 * Classe de teste para o sistema de gerenciamento de seminários.
 *
 * Associações praticadas:
 * - Estudante -> Seminario     (muitos estudantes para um seminário)
 * - Seminario -> Estudante[]   (um seminário tem vários estudantes)
 * - Seminario -> Local         (um seminário tem um local obrigatório)
 * - Professor -> Seminario[]   (um professor ministra vários seminários)
 */
public class GerenciadorSeminario {

    public static void main(String[] args) {

        // --- Criação dos objetos ---
        Local sala8 = new Local("Sala 8, Bloco A");

        Estudante marcos = new Estudante("Marcos", 23);
        Estudante ana = new Estudante("Ana", 21);

        Seminario seminarioPoo = new Seminario("Ensinando POO de forma fácil");
        Seminario seminarioSql = new Seminario("Ensinando SQL de forma fácil");

        Professor pedro = new Professor("Pedro", "ADS");

        // --- Montando as associações ---

        // Seminário de POO recebe local e estudantes
        seminarioPoo.setLocal(sala8);
        seminarioPoo.setEstudantes(new Estudante[]{marcos, ana});

        // Cada estudante é matriculado no seu seminário (um por vez)
        marcos.setSeminario(seminarioPoo);
        ana.setSeminario(seminarioPoo);

        // Seminário de SQL recebe local (sem estudantes ainda)
        seminarioSql.setLocal(new Local("Sala 12, Bloco B"));

        // Professor ministra os dois seminários
        pedro.setSeminarios(new Seminario[]{seminarioPoo, seminarioSql});

        // --- Exibindo os resultados ---
        System.out.println("===== SEMINÁRIOS =====");
        System.out.println(seminarioPoo);
        System.out.println();
        System.out.println(seminarioSql);

        System.out.println("\n===== ESTUDANTES =====");
        System.out.println(marcos);
        System.out.println(ana);

        System.out.println("\n===== PROFESSOR =====");
        System.out.println(pedro);
    }
}

