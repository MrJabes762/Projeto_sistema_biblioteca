package sistema.data;

import sistema.model.Aluno2;
import sistema.model.Livro2;
import sistema.model.Professor2;
import sistema.model.exception.Livroexception;
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
