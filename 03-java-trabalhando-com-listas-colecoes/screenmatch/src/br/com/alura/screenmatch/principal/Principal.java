package br.com.alura.screenmatch.principal;
import java.util.ArrayList;

import br.com.alura.screenmatch.calculadora.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculadora.FiltroRecomendacao;
import br.com.alura.screenmatch.models.Episodio;
import br.com.alura.screenmatch.models.Filme;
import br.com.alura.screenmatch.models.Serie;

public class Principal {
    public static void main(String[] args) throws Exception {
        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setMinutosPorEpisodio(10);
        lost.setEpisodiosPorTemporada(50);
        System.out.println("Duração da série: " + lost.getDuracaoEmMinutos());

        Filme topGun = new Filme("Top Gun", 2020);
        topGun.setDuracaoEmMinutos(180);

        Filme avatar = new Filme("Avatar", 2022);
        avatar.setDuracaoEmMinutos(180);

        CalculadoraDeTempo calc = new CalculadoraDeTempo();
        calc.inclui(topGun);
        calc.inclui(avatar);
        calc.inclui(lost);
        System.out.println("Tempo total: " + calc.getTempoTotal());

        Episodio episodio1 = new Episodio();
        episodio1.setTotalDeVisualizacoes(0);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(episodio1);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(avatar);
        listaDeFilmes.add(topGun);

        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.getFirst().getNome());

        System.out.println(listaDeFilmes);

        System.out.println(listaDeFilmes.getFirst().toString());
    }
}
