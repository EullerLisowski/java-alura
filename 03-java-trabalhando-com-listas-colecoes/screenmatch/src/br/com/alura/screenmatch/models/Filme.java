package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculadora.Classificavel;

public class Filme extends Titulo implements Classificavel {

    private String diretor;

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) (obtemMediaAvaliacoes() / 2);
    }

    @Override
    public String toString() {
        return "Filme: " + getNome() + " - Ano: " + getAnoDeLancamento();
    }

}
