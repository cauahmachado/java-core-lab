package oop.projectshoppingcartmanagement.entities;

public class Produto {
    private int idProduto;
    private String nome;
    private double preco;

    public Produto(int idProduto, String nome, double preco) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.preco = preco;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return String.format("%d | %-20s | %.2f",idProduto, nome,preco);
    }
}
