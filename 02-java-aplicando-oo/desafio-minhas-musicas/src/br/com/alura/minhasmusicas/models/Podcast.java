package br.com.alura.minhasmusicas.models;

import java.util.ArrayList;

public class Podcast extends Audio implements Classificavel {
    private Artista hostArtista;
    private ArrayList<Artista> participantes;
    private int totalCurtidas = 0;

    public Podcast(String titulo, int duracao, Artista hostArtista, ArrayList<Artista> participantes) {
        super(titulo, duracao);
        this.hostArtista = hostArtista;
        this.participantes = participantes;
    }

    public Artista getHostArtista() {
        return hostArtista;
    }

    public ArrayList<Artista> getParticipantes() {
        return participantes;
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
