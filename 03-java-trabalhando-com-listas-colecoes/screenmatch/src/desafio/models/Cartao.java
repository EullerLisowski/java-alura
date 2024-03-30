package desafio.models;

import java.util.ArrayList;
import java.util.List;

public class Cartao {
    double limite;
    List<Compra> compras = new ArrayList<>();

    public Cartao(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    private double descontar(double valor) {
        limite -= valor;
        return limite;
    }

    public ResultadoCompra comprar(Compra compra) {
        ResultadoCompra resultadoCompra = new ResultadoCompra();
        Double valorCompra = compra.getValor();

        if (valorCompra > limite) {
            resultadoCompra
                    .setStatusCompra(false)
                    .indiceDescricao(1);
        } else if (valorCompra < 0) {
            resultadoCompra
                    .setStatusCompra(false)
                    .indiceDescricao(2);
        } else {
            descontar(valorCompra);
            compras.add(compra);
            resultadoCompra
                    .setStatusCompra(true);
        }

        return resultadoCompra;
    }

}
