package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra {
    private List<Item> itemList;

    public CarrinhoCompra() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidadeItem) {
        itemList.add(new Item(nome, preco, quantidadeItem));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            itemList.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia");
        }
    }
    public double calcularValorTotal() {
        double total = 0.0;
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                double valorItem = i.getPreco() * i.getQuantidadeItem();
                total += valorItem;
            }
            return total;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirItens() {
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itens=" + itemList +
                '}';
    }

    public static void main(String[] args) {
        CarrinhoCompra carrinhoDeCompra = new CarrinhoCompra();

        carrinhoDeCompra.adicionarItem("Caneta", 1.5, 2);
        carrinhoDeCompra.adicionarItem("Lapis", 1.5, 3);
        carrinhoDeCompra.adicionarItem("Apontador", 3.0, 1);
        carrinhoDeCompra.adicionarItem("Borracha", 2.0, 4);

        carrinhoDeCompra.exibirItens();
        carrinhoDeCompra.removerItem("Caneta");
        carrinhoDeCompra.exibirItens();

        System.out.println("O valor total de itens no carrinho é: " + carrinhoDeCompra.calcularValorTotal());
    }
}

