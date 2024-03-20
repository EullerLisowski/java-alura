package br.com.alura.minhasmusicas.models;

public class Audio {
    private String titulo;
    private int duracao;
    private int totalDeReproducoes;

    public Audio(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.totalDeReproducoes = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public void reproduzir() {
        this.totalDeReproducoes++;
    }

}
