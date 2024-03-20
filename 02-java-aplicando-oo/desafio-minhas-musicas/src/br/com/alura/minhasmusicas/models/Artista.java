package br.com.alura.minhasmusicas.models;

import java.util.ArrayList;

public class Artista {
    private ArrayList<Album> albums;
    private String name;

    public Artista(String name) {
        this.albums = new ArrayList<>();
        this.name = name;
    }

    public Artista(ArrayList<Album> albums, String name) {
        this.albums = albums;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void lancaAlbum(Album album) {
        this.albums.add(album);
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

}
