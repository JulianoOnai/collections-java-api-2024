package main.java.set.Pesquisa;

public class Tarefa {

    private String descricao;
    private boolean conclusao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConclusao() {
        return conclusao;
    }

    public boolean setConclusao(boolean conclusao) {
        this.conclusao = conclusao;
        return conclusao;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", conclusao=" + conclusao +
                '}';
    }


}
