package br.com.alura.screenmatch.calculadora;

import br.com.alura.screenmatch.models.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo filme) {
        tempoTotal += filme.getDuracaoEmMinutos();
    }
}
