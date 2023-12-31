package sistema.model;

import sistema.data.Mochilha2;
import sistema.model.exception.Livroexception;

public class Aluno2 extends Pessoa implements Operacoes {
    private Mochilha2 mochilaAluno;
    public Aluno2(String nome, String matricula) {
        super(nome, matricula);
        setMochilaAluno ();
    }
    public Mochilha2 getMochilaAluno() {
        return mochilaAluno;
    }
    private void setMochilaAluno() {
        this.mochilaAluno = new Mochilha2();
    }
    @Override
    public void adicionarLivronaMochila(Livro2 pegarLivro2daestante) {
        try {
            getMochilaAluno().adicionarNaMochila(pegarLivro2daestante);
        } catch (Livroexception e) {
            System.out.println(e.getMessage());
        }
    }
    @Override
    public Livro2 removerLivrodaMochila(String codigo) {
        try {
           return getMochilaAluno().pegarLivronaMochila(codigo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
