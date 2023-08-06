package br.edu.ifba.saj.ads.poo.model.exception;

public class Livroexception extends Exception {
    private String mensssagem;
    public String getMensssagem() {
        return mensssagem;
    }
    public void setMensssagem(String mensssagem) {
        this.mensssagem = mensssagem;
    }
    public Livroexception (String mensssagem){
        setMensssagem(mensssagem);
    }
}
