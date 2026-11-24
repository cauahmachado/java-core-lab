package oop.projectsubscriptionloyaltyclub.model;

import oop.projectsubscriptionloyaltyclub.excecoes.PontuacaoInsuficienteException;
import oop.projectsubscriptionloyaltyclub.interfaces.Bonificavel;

import java.util.Comparator;
import java.util.Objects;

public class MembroClube implements Bonificavel, Comparable<MembroClube> {
    /**
     * Ordenação alternativa (botão Ordenar): por ID crescente.
     */
    public static final Comparator<MembroClube> POR_ID =
            Comparator.comparingInt(MembroClube::getId);

    private final int id;
    private String nome;
    private int pontos;
    private NivelMembro nivel;

    public MembroClube(int id, String nome, NivelMembro nivel) {
        this.id = id;
        this.nome = nome;
        this.nivel = nivel;
        this.pontos = 0;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public NivelMembro getNivel() {
        return nivel;
    }

    public void setNivel(NivelMembro nivel) {
        this.nivel = nivel;
    }

    @Override
    public void acumularPontos(int pontos) {
        if (pontos <= 0) {
            throw new IllegalArgumentException("Os pontos devem ser maiores que zero.");
        }
        this.pontos += pontos * nivel.getMultiplicador();
    }

    @Override
    public void resgatarPontos(int pontos) throws PontuacaoInsuficienteException {
        if (pontos <= 0) {
            throw new IllegalArgumentException("Os pontos devem ser maiores que zero.");
        }
        if (pontos > this.pontos) {
            throw new PontuacaoInsuficienteException(this.pontos, pontos);
        }
        this.pontos -= pontos;
    }

    /**
     * Ordem natural: ranking (mais pontos primeiro); empate desempata pelo ID.
     */
    @Override
    public int compareTo(MembroClube outro) {
        int resultado = Integer.compare(outro.pontos, this.pontos);
        return resultado != 0 ? resultado : Integer.compare(this.id, outro.id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MembroClube)) return false;
        MembroClube outro = (MembroClube) o;
        return id == outro.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return String.format("ID %d | %s | %s | %d pontos", id, nome, nivel, pontos);
    }


}

