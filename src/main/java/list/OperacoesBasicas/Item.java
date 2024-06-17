package main.java.list.OperacoesBasicas;

public class Item {
    private String nome;
    private Double preco;
    private int quantidadeItem;

    public Item(String nome, Double preco, int quantidadeItem) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeItem = quantidadeItem;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", quantidade=" + quantidadeItem +
                ", preco=" + preco +
                '}';
    }
}
