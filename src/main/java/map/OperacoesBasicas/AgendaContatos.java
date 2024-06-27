package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        } else {
            throw new RuntimeException("A agenda está vazia");
        }
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        } else {
            throw new RuntimeException("A agenda está vazia");
        }
        return numeroPorNome;
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Juliano", 2313123);
        agendaContatos.adicionarContato("Juliano", 2313123);
        agendaContatos.adicionarContato("Juliano Henrique", 2313333);
        agendaContatos.adicionarContato("Juliano Motta", 2313111);
        agendaContatos.adicionarContato("Juliano Barbosa", 2313129);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Juliano Barbosa");

        agendaContatos.exibirContatos();

        System.out.println("O numero é: " + agendaContatos.pesquisarPorNome("Juliano Motta"));
    }
}
