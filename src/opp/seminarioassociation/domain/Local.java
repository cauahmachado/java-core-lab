package opp.seminarioassociation.domain;

/**
 * Representa o local onde um seminário será realizado.
 */
public class Local {

    private String endereco;

    public Local(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Local: " + endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}

