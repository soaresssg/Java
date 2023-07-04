package br.com.alura.modelos;

public class Audio {

    private String titulo;
    private int duracao;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void reproduz() {
        this.totalReproducoes++;
    }

    public void curte()  {
        this.totalCurtidas++;
    }

}
