package main.java.set.Ordenacao;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciarAlunos {

    private Set<Aluno> alunoSet;

    public GerenciarAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno (String nome, Long matricula, double nota) {
        alunoSet.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula) {
        Aluno alunoParaRemover = null;
        for (Aluno a : alunoSet) {
            if (a.getMatricula() == matricula) {
                alunoParaRemover = a;
                break;
            }
        }
        alunoSet.remove(alunoParaRemover);
    }


    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new Aluno.ComparatorPorNota());
        alunosPorNota.addAll(alunoSet);
        return alunosPorNota;
    }

    public void exibirAlunos() {
        System.out.println(alunoSet);
    }

    public static void main(String[] args) {

        GerenciarAlunos gerenciarAlunos = new GerenciarAlunos();

        gerenciarAlunos.adicionarAluno("Juliano", 12341234214L, 10.0);
        gerenciarAlunos.adicionarAluno("Natalia", 12346645214L, 9.2);
        gerenciarAlunos.adicionarAluno("Pedro", 1999934214L, 6.0);
        gerenciarAlunos.adicionarAluno("Augusto", 9876541214L, 7.5);

        gerenciarAlunos.removerAluno(9876541214L);

        gerenciarAlunos.exibirAlunos();

        System.out.println(gerenciarAlunos.exibirAlunosPorNome());
        System.out.println(gerenciarAlunos.exibirAlunosPorNota());
    }
}
