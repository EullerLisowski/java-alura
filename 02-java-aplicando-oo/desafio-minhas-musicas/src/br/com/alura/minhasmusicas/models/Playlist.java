package br.com.alura.minhasmusicas.models;

import java.util.ArrayList;

public class Playlist {
    private String nome;
    private ArrayList<Audio> audios;

    public Playlist(String nome) {
        this.nome = nome;
        this.audios = new ArrayList<Audio>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Audio> getAudios() {
        return audios;
    }

    public void adicionaAudio(Audio audio) {
        if (audio.getTotalDeReproducoes() >= 5) {
            audios.addFirst(audio);
        } else {
            audios.add(audio);
        }
    }

    public void removeAudio(Audio audio) {
        this.audios.remove(audio);
    }

}
