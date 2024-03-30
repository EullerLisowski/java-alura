package desafio.principal;

import desafio.leitor.Leitor;
import desafio.models.Cartao;
import desafio.models.Compra;
import desafio.models.ResultadoCompra;

public class App {
    public static void main(String[] args) {
        int continuar = 1;
        Leitor leitor = new Leitor();

        DesafioMenu.pedeLimiteCartao();
        Cartao cartao = new Cartao(leitor.leDouble());

        while (continuar == 1) {
            DesafioMenu.pedeDescricaoCompra();
            String descricao = leitor.leString();

            DesafioMenu.pedeValorCompra();
            double valor = leitor.leDouble();

            ResultadoCompra resultadoCompra = cartao.comprar(new Compra(descricao, valor));

            if (resultadoCompra.isOk()) {
                DesafioMenu.compraRealizada();
                DesafioMenu.proximaAcao();
                continuar = leitor.leInt();
            } else {
                System.out.println(resultadoCompra.getDescricao());
                continuar = 0;
            }

            if (continuar == 0) {
                DesafioMenu.comprasRealizadas(cartao.getCompras());
                DesafioMenu.saldoAtual(cartao.getLimite());
            }
        }
    }

}
