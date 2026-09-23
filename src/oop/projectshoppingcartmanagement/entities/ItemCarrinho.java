package oop.projectshoppingcartmanagement.entities;

public class ItemCarrinho {
    private Produto produto;
    private int quantidade;

    public ItemCarrinho(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public void adicionarQuantidade(int qtd){
        quantidade += qtd;
    }

    public double getSubTotal(){
        return produto.getPreco() * quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return String.format("%s | %d | %.2f | %.2f", produto.getNome(), quantidade, produto.getPreco(), getSubTotal());
    }
}
