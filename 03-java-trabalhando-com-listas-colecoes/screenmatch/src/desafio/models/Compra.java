package desafio.models;

public class Compra {
    String descricao;
    double valor = 0;

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        if (valor > 0) {
            this.valor = valor;
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return String.format("%s - %.2f", descricao, valor);
    }

}
