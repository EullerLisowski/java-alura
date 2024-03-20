package br.com.alura.minhasmusicas.main;

import java.util.ArrayList;

import br.com.alura.minhasmusicas.models.Album;
import br.com.alura.minhasmusicas.models.Artista;
import br.com.alura.minhasmusicas.models.Musica;
import br.com.alura.minhasmusicas.models.Playlist;
import br.com.alura.minhasmusicas.models.Podcast;

public class Main {
    public static void main(String[] args) {
        Artista michaelJackson = new Artista("Michael Jackson");
        ArrayList<Artista> artistas = new ArrayList<>();
        artistas.add(michaelJackson);

        Musica thriller = new Musica("Thriller", 258, artistas);
        Musica billieJean = new Musica("Billie Jean", 294, artistas);
        Musica beatIt = new Musica("Beat It", 258, artistas);
        Musica smoothCriminal = new Musica("Smooth Criminal", 258, artistas);

        ArrayList<Musica> musicas = new ArrayList<>();
        musicas.add(thriller);
        musicas.add(billieJean);
        musicas.add(beatIt);
        musicas.add(smoothCriminal);
        musicas.get(0).curtir();
        musicas.get(0).reproduzir();
        musicas.get(1).curtir();
        musicas.get(1).curtir();
        musicas.get(1).reproduzir();
        musicas.get(1).reproduzir();
        musicas.get(1).reproduzir();
        musicas.get(2).curtir();
        musicas.get(3).curtir();

        michaelJackson.lancaAlbum(new Album("Thriller", michaelJackson, musicas));

        System.out.println(michaelJackson.getAlbums().get(0).getTitulo());
        System.out.println(michaelJackson.getAlbums().get(0).getMusicas().get(1).getTitulo());
        System.out.println(michaelJackson.getAlbums().get(0).getMusicas().get(1).getDuracao());
        System.out.println(michaelJackson.getAlbums().get(0).getMusicas().get(1).getCurtidas());
        System.out.println(michaelJackson.getAlbums().get(0).getMusicas().get(1).getTotalDeReproducoes());

        Artista host = new Artista("Host");
        Artista participante = new Artista("Participante");
        ArrayList<Artista> participantes = new ArrayList<>();
        participantes.add(host);
        participantes.add(participante);
        Podcast nerdTech = new Podcast("Nerd Tech", 60, host, participantes);
        nerdTech.curtir();
        nerdTech.curtir();
        nerdTech.reproduzir();
        nerdTech.reproduzir();
        nerdTech.reproduzir();
        nerdTech.reproduzir();
        nerdTech.reproduzir();
        
        System.out.println(nerdTech.getTitulo());
        System.out.println(nerdTech.getDuracao());
        System.out.println(nerdTech.getCurtidas());

        Playlist playlist = new Playlist("Minha Playlist");
        playlist.adicionaAudio(thriller);
        playlist.adicionaAudio(nerdTech);
        
        System.out.println(playlist.getAudios().get(0).getTitulo());
        System.out.println(playlist.getAudios().get(1).getTitulo());

        playlist.removeAudio(thriller);
        System.out.println(playlist.getAudios().get(0).getTitulo());
    }
}
