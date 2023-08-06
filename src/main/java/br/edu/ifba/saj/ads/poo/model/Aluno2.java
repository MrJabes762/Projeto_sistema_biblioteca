package br.edu.ifba.saj.ads.poo.model;

import br.edu.ifba.saj.ads.poo.data.Mochilha2;
import br.edu.ifba.saj.ads.poo.model.exception.Livroexception;

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
    public void adicionarLivronaMochila(Livro2 pegarLivro2daestante) {
        try {
            getMochilaAluno().adicionarNaMochila(pegarLivro2daestante);
        } catch (Livroexception e) {
            System.out.println(e.getMessage());
        }
    }
    public Livro2 removerLivrodaMochila(String codigo) {
        try {
           return getMochilaAluno().pegarLivronaMochila(codigo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
