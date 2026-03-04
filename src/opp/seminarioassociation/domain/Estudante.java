package opp.seminarioassociation.domain;

/**
 * Representa um estudante que pode estar matriculado em no máximo um seminário.
 */
public class Estudante {

    private String nome;
    private int idade;
    private Seminario seminario;

    public Estudante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    /**
     * Retorna uma representação textual do estudante,
     * incluindo o seminário em que está matriculado, se houver.
     */
    @Override
    public String toString() {
        String matricula = (seminario != null)
                ? "Matriculado em: " + seminario.getTitulo()
                : "Não está matriculado em nenhum seminário";

        return "Estudante: " + nome
                + " | Idade: " + idade
                + " | " + matricula;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    /**
     * Matricula o estudante em um seminário.
     * Um estudante só pode estar em um seminário por vez.
     */
    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

