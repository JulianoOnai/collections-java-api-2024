package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa (String descricao) {
        this.tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa (String descricao) {
        Tarefa tarefaParaRemover = null;
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaRemover = t;
                break;
            }
        }
        tarefaSet.remove(tarefaParaRemover);
    }

    public void exibirTarefas() {
        System.out.println(tarefaSet);
    }

    public int contarTarefas() {
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (t.isConclusao()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;

    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (!t.isConclusao()) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }


    public void marcarTarefaConcluida (String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConclusao(true);
            }
        }
    }

    public void marcarTarefaPendente (String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConclusao(false);
            }
        }
    }

    public void limparListaTarefas() {
        tarefaSet.clear();
    }

    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.exibirTarefas();
        System.out.println(listaTarefas.contarTarefas());

        listaTarefas.adicionarTarefa("Limpar a casa");
        listaTarefas.adicionarTarefa("Arrumar o quarto");
        listaTarefas.adicionarTarefa("Almoço");
        listaTarefas.adicionarTarefa("Escovar os dentes");

        listaTarefas.exibirTarefas();
        System.out.println(listaTarefas.contarTarefas());

        listaTarefas.marcarTarefaConcluida("Escovar os dentes");
        listaTarefas.marcarTarefaConcluida("Almoço");
        listaTarefas.marcarTarefaPendente("Arrumar o quarto");
        listaTarefas.marcarTarefaPendente("Limpar a casa");

        System.out.println(listaTarefas.obterTarefasConcluidas());
        System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.removerTarefa("Almoço");

        listaTarefas.exibirTarefas();
        System.out.println(listaTarefas.contarTarefas());

        listaTarefas.limparListaTarefas();
    }
}
