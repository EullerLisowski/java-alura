package br.com.alura.screenmatch.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.alura.screenmatch.models.Filme;
import br.com.alura.screenmatch.models.Serie;
import br.com.alura.screenmatch.models.Titulo;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme titanic = new Filme("Titanic", 1997);
        Filme avatar = new Filme("Avatar", 2009);
        Filme topGun = new Filme("Top Gun", 1986);

        Serie lost = new Serie("Lost", 2004);
        Serie breakingBad = new Serie("Breaking Bad", 2008);

        titanic.avalia(10);
        avatar.avalia(9);
        topGun.avalia(8);
        lost.avalia(7);
        breakingBad.avalia(10);

        ArrayList<Titulo> titulos = new ArrayList<>();
        titulos.add(titanic);
        titulos.add(avatar);
        titulos.add(topGun);
        titulos.add(lost);
        titulos.add(breakingBad);

        titulos.forEach(System.out::println);
        titulos.forEach(titulo -> {
            if (titulo instanceof Filme filme) {
                System.out.println(filme.getClassificacao());
            }
        });

        ArrayList<String> buscaPorArtistas = new ArrayList<>();
        buscaPorArtistas.add("Tom Cruise");
        buscaPorArtistas.add("Leonardo DiCaprio");
        buscaPorArtistas.add("Kate Winslet");

        System.out.println(buscaPorArtistas);
        Collections.sort(buscaPorArtistas);
        System.out.println(buscaPorArtistas);

        System.out.println(titulos);
        Collections.sort(titulos);
        System.out.println(titulos);
        
        titulos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(titulos);
        
    }
}
