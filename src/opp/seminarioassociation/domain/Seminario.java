package opp.seminarioassociation.domain;
/**
 * Representa um seminário que possui um local obrigatório
 * e pode ter zero ou vários estudantes matriculados.
 */
public class Seminario {

    private String titulo;
    private Local local;
    private Estudante[] estudantes;


    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Cria um seminário completo.
     *
     *  titulo     Título do seminário
     *  local      Local onde será realizado
     *  estudantes Estudantes matriculados (pode ser null ou vazio)
     */
    public Seminario(String titulo, Local local, Estudante[] estudantes) {
        this.titulo = titulo;
        this.local = local;
        this.estudantes = estudantes;
    }

    /**
     * Retorna uma representação textual do seminário,
     * listando local e estudantes matriculados.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Seminário: ").append(titulo).append("\n");

        sb.append("  ").append(local != null ? local : "Local não definido").append("\n");

        if (estudantes == null || estudantes.length == 0) {
            sb.append("  Nenhum estudante matriculado.");
        } else {
            sb.append("  Estudantes matriculados:\n");
            for (Estudante estudante : estudantes) {
                sb.append("    - ").append(estudante.getNome())
                        .append(" (").append(estudante.getIdade()).append(" anos)\n");
            }
        }

        return sb.toString().trim();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }
}
