package br.com.alura.minhasmusicas.models;

import java.util.ArrayList;

public class Musica extends Audio implements Classificavel {
    private ArrayList<Artista> artistas;
    private int totalCurtidas = 0;

    public Musica(String titulo, int duracao, ArrayList<Artista> artistas) {
        super(titulo, duracao);
        this.artistas = artistas;
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    @Override
    public void curtir() {
        totalCurtidas++;
    }

    @Override
    public int getCurtidas() {
        return totalCurtidas;
    }

}
