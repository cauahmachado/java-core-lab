package oop.projectsubscriptionloyaltyclub.excecoes;

/**
 * Checked Exception: lançada quando o membro tenta resgatar mais pontos
 * do que possui. Herda diretamente de Exception (obrigatório tratar ou declarar).
 */
public class PontuacaoInsuficienteException extends Exception {

    private final int saldo;
    private final int solicitado;

    public PontuacaoInsuficienteException(int saldo, int solicitado) {
        super("Pontuação insuficiente! Saldo: " + saldo
                + " pontos | Resgate solicitado: " + solicitado + " pontos.");
        this.saldo = saldo;
        this.solicitado = solicitado;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getSolicitado() {
        return solicitado;
    }
}