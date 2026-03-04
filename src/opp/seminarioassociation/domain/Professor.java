package opp.seminarioassociation.domain;
/**
 * Representa um professor que pode ministrar vários seminários.
 */
public class Professor {

    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    /**
     * Retorna uma representação textual do professor e seus seminários.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Professor: ").append(nome)
                .append(" | Especialidade: ").append(especialidade)
                .append("\n");

        if (seminarios == null || seminarios.length == 0) {
            sb.append("  Nenhum seminário registrado para este professor.");
        } else {
            sb.append("  Seminários ministrados:\n");
            for (Seminario seminario : seminarios) {
                sb.append("    - ").append(seminario.getTitulo()).append("\n");
            }
        }

        return sb.toString().trim();
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    /**
     * Define os seminários que este professor ministrará.
     */
    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
