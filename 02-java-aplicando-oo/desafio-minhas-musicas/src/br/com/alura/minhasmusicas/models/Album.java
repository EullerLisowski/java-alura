package br.com.alura.minhasmusicas.models;

import java.util.ArrayList;

public class Album {
    private String titulo;
    private Artista artista;
    private ArrayList<Musica> musicas;

    public Album(String titulo, Artista artista, ArrayList<Musica> musicas) {
        this.titulo = titulo;
        this.artista = artista;
        this.musicas = musicas;
    }

    public String getTitulo() {
        return titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    public void adicionaMusica(Musica musica) {
        musicas.add(musica);
    }
}
