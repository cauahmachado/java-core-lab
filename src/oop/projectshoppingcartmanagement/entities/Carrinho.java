package oop.projectshoppingcartmanagement.entities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Carrinho {
    private Cliente cliente;
    private List<ItemCarrinho> itens; //itens do carrinho

    public Carrinho(Cliente cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        for (ItemCarrinho item : itens) {
            if (item.getProduto().getIdProduto() == produto.getIdProduto()) {
                item.adicionarQuantidade(quantidade);
                return;
            }
        }
        ItemCarrinho itemNoCarrinho = new ItemCarrinho(produto, quantidade);
        itens.add(itemNoCarrinho);
    }

    public boolean removerProduto(int idProduto) {
        Iterator<ItemCarrinho> iterator = itens.iterator();

        while (iterator.hasNext()) {
            ItemCarrinho item = iterator.next();

            if (item.getProduto().getIdProduto() == idProduto) {
                iterator.remove();
                return true;
            }
        }

        return false;
    }

    public double calcularTotal(){
        double total=0.0;
        for (ItemCarrinho item : itens){
            total += item.getSubTotal();
        }
        return total;
    }

    public boolean estaVazio(){
        return itens.isEmpty();
    }

    public List<ItemCarrinho> getItens() {
        return itens;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
