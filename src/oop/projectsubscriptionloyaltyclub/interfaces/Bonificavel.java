package oop.projectsubscriptionloyaltyclub.interfaces;

import oop.projectsubscriptionloyaltyclub.excecoes.PontuacaoInsuficienteException;

/**
 * Contrato de negócio para quem acumula e resgata pontos de fidelidade.
 */
public interface Bonificavel {

    void acumularPontos(int pontos);

    void resgatarPontos(int pontos) throws PontuacaoInsuficienteException;

    /**
     * Método default de apoio: 1 ponto base para cada real inteiro gasto.
     */
    default int calcularPontosCompra(double valorCompra) {
        return (int) valorCompra;
    }
}

