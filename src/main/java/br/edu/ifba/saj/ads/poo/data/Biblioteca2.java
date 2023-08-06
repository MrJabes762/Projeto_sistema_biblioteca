package br.edu.ifba.saj.ads.poo.data;

import br.edu.ifba.saj.ads.poo.model.Aluno2;
import br.edu.ifba.saj.ads.poo.model.Livro2;
import br.edu.ifba.saj.ads.poo.model.Professor2;
import br.edu.ifba.saj.ads.poo.model.exception.Livroexception;
public class Biblioteca2 {
    private Estante2 estantedabiblioteca;
    
    public Biblioteca2() {
        setEstantedabiblioteca();
    }
    public void adicionarLivro(Livro2 livro2) throws Livroexception {
        try {
            getEstantedabiblioteca().adicionarLivronaestante(livro2);
        } catch (Livroexception e) {
           System.out.println(e.getMessage ());
        }
    }
    public void solicitaEmprestimo(Aluno2 aluno, String codigo) {
        try {
            aluno.adicionarLivronaMochila(getEstantedabiblioteca().pegarLivro2daestante(codigo));
        } catch (Livroexception e){
            System.out.println(e.getMessage());
        }
    }
    public void soliticaDevolucao(Aluno2 aluno, String codigo) throws Livroexception {
        getEstantedabiblioteca().adicionarLivronaestante(aluno.removerLivrodaMochila(codigo));
    }
    public void soliticaEmprestimo(Professor2 professor, String codigo) {
        try {
            professor.adicionarLivronaMochila(getEstantedabiblioteca().pegarLivro2daestante(codigo));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Estante2 getEstantedabiblioteca() {
        return this.estantedabiblioteca;
    }

    public void setEstantedabiblioteca() {
        this.estantedabiblioteca = new Estante2();
    }
}
