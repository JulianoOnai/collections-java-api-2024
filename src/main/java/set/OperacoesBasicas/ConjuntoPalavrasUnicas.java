package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavraSet;

    public ConjuntoPalavrasUnicas() {
        this.palavraSet = new HashSet<>();
    }

    public void adicionarPalavra (String palavra) {
        this.palavraSet.add(palavra);
    }

    public void removerPalavra (String palavra) {
        this.palavraSet.remove(palavra);
    }

    public void verificarPalavra (String palavra) {
        if (this.palavraSet.contains(palavra)) {
            System.out.println("O set contém a palavra " + palavra);
        }
        else {
            System.out.println("O set não contem a palavra " + palavra);
        }
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavraSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 1");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 1");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 2");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 3");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 4");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.verificarPalavra("Palavra 1");

        conjuntoPalavrasUnicas.removerPalavra("Palavra 1");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.verificarPalavra("Palavra 1");
        conjuntoPalavrasUnicas.verificarPalavra("Palavra 2");
    }
}
