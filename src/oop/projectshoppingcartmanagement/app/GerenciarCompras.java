package oop.projectshoppingcartmanagement.app;

import oop.projectshoppingcartmanagement.entities.Carrinho;
import oop.projectshoppingcartmanagement.entities.Cliente;
import oop.projectshoppingcartmanagement.entities.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarCompras {
    static List<Produto> catalogoProdutos = new ArrayList<>();
    Carrinho carrinhoAtivo = null;
    Scanner scanner = new Scanner(System.in);
    Produto detergente = new Produto(1, "Detergente", 5.00);
    Produto sabonete = new Produto(2, "Sabonete", 3.00);
    Produto sabao = new Produto(3, "Sabão", 7.00);
    Produto fioDental = new Produto(4, "Fio dental", 8.00);
    Produto escovaDentes = new Produto(5, "Escova de dentes", 10.00);


    static void main() {
        GerenciarCompras gc = new GerenciarCompras();
        catalogoProdutos.add(gc.detergente);
        catalogoProdutos.add(gc.sabonete);
        catalogoProdutos.add(gc.sabao);
        catalogoProdutos.add(gc.fioDental);
        catalogoProdutos.add(gc.escovaDentes);
        int opcao = -1;
        do {
            menu();
            opcao = gc.scanner.nextInt();
            gc.scanner.nextLine();
            switch (opcao) {
                case 1 -> gc.iniciarNovoCarrinho();
                case 2 -> gc.verCatalogo();
                case 3 -> {
                    if (gc.estaAtivo()) {
                        gc.adicionarProduto();
                    } else {
                        System.out.println("Inicie um novo carrinho primeiro!!");
                    }
                }
                case 4 -> {
                    if (gc.estaAtivo()) {
                        gc.consultarCarrinho();
                    } else {
                        System.out.println("Inicie um novo carrinho primeiro!!");
                    }
                }
                case 5 -> {
                    if (gc.estaAtivo()) {
                        gc.removerProduto();
                    } else {
                        System.out.println("Inicie um novo carrinho primeiro!!");
                    }
                }
                case 6 -> {
                    if (gc.estaAtivo()) {
                        gc.finalizarCompra();
                    } else {
                        System.out.println("Inicie um novo carrinho primeiro!!");
                    }
                }
                case 0 -> System.out.println("SAINDO...OBRIGADO");
                default -> System.out.println("Digite uma opção existente");
            }
        } while (opcao != 0);

    }

    public static void menu() {
        System.out.println("=============== SISTEMA DE COMPRAS ===============");
        System.out.println("1. Iniciar Novo Carrinho");
        System.out.println("2. Ver Catálogo de Produtos");
        System.out.println("3. Adicionar Produto ao Carrinho");
        System.out.println("4. Consultar Carrinho");
        System.out.println("5. Remover Produto Carrinho");
        System.out.println("6. Finalizar Compras");
        System.out.println("0. Sair");
        System.out.println("==================================================");
    }

    public void iniciarNovoCarrinho() {
        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite CPF: ");
        String cpf = scanner.nextLine();
        System.out.println("Digite email: ");
        String email = scanner.nextLine();

        Cliente cliente = new Cliente(cpf, nome, email);
        carrinhoAtivo = new Carrinho(cliente);
        System.out.println("Novo carrinho confirmado");
    }

    public void verCatalogo() {
        System.out.println("=================== Catálogo =====================");
        for (Produto produto : catalogoProdutos) {
            System.out.print(produto);
        }
        System.out.println("==================================================");
    }

    public void adicionarProduto() {
        System.out.print(catalogoProdutos);
        System.out.println("Digite o ID do produto: ");
        int escolhido;
        Produto produtoEscolhido = null;
        while (produtoEscolhido == null) {
            escolhido = Integer.parseInt(scanner.nextLine());
            for (Produto produto : catalogoProdutos) {
                if (produto.getIdProduto() == escolhido) {
                    produtoEscolhido = produto;
                    break;
                }
            }
            System.out.println("Produto não encontrado");
        }

        System.out.println("Digite a quantidade: ");
        int quantidade;
        while (true) {
            try {
                quantidade = Integer.parseInt(scanner.nextLine());
                if (quantidade <= 0) {
                    System.out.println("ERRO! A quantidade deve ser maior que zero");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number");
            }
        }

        carrinhoAtivo.adicionarProduto(produtoEscolhido, quantidade);

    }

    public void consultarCarrinho() {
        System.out.println(carrinhoAtivo.getCliente());

        if (carrinhoAtivo.estaVazio()) {
            System.out.println("Carrinho esta vazio.");
            return;
        }

        System.out.println(carrinhoAtivo.getItens());
    }

    public void removerProduto() {
        if (carrinhoAtivo.estaVazio()) {
            System.out.println("Carrinho vazio, não há nada para remover.");
        } else {
            System.out.println(carrinhoAtivo.getItens());
            System.out.println("Digite o ID do produto que deseja remover:");
            int escolhido = Integer.parseInt(scanner.nextLine());

            boolean removido = carrinhoAtivo.removerProduto(escolhido);

            if (removido) {
                System.out.println("Produto removido com sucesso.");
            } else {
                System.out.println("Produto não encontrado no carrinho.");
            }
        }
    }

    public void finalizarCompra() {
        if (carrinhoAtivo.estaVazio()) {
            System.out.println("Carrinho vazio, não há como finalizar compra.");
        } else {
            System.out.println(carrinhoAtivo.getItens().toString());
            System.out.print("Valor total à ser pago: "+ carrinhoAtivo.calcularTotal()+"\n");
            System.out.println("Recibo será enviado ao seu email. Obrigado!!");
            carrinhoAtivo = null;
        }
    }


    public boolean estaAtivo() {
        return (carrinhoAtivo != null);
    }
}
