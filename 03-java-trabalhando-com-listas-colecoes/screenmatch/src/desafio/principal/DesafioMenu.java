package desafio.principal;

import desafio.models.Compra;

import java.util.Comparator;
import java.util.List;

final class DesafioMenu {

    private static final String DIGITE_O_LIMITE_DO_CARTAO = "Digite o limite do cartão: ";
    private static final String DIGITE_A_DESCRICAO_DA_COMPRA = "Digite a descrição da compra: ";
    private static final String DIGITE_O_VALOR_DA_COMPRA = "Digite o valor da compra: ";
    private static final String COMPRA_REALIZADA = "Compra realizada!";
    private static final String DIGITE_0_PARA_SAIR_OU_1_PARA_CONTINUAR = "Digite 0 para sair ou 1 para continuar";
    private static final String SALDO_INSUFICIENTE = "Saldo insuficiente!";
    private static final String NENHUMA_COMPRA_REALIZADA = "Nenhuma compra realizada!";
    private static final String COMPRAS_REALIZADAS = "COMPRAS REALIZADAS: ";
    private static final String SALDO_DO_CARTAO = "Saldo do cartão: %.2f ";

    public static void pedeLimiteCartao() {
        System.out.println(DIGITE_O_LIMITE_DO_CARTAO);
    }

    public static void pedeDescricaoCompra() {
        System.out.println(DIGITE_A_DESCRICAO_DA_COMPRA);
    }

    public static void pedeValorCompra() {
        System.out.println(DIGITE_O_VALOR_DA_COMPRA);
    }

    public static void compraRealizada() {
        System.out.println(COMPRA_REALIZADA);
    }

    public static void proximaAcao() {
        System.out.println(DIGITE_0_PARA_SAIR_OU_1_PARA_CONTINUAR);
    }

    public static void saldoInsuficiente() {
        System.out.println(SALDO_INSUFICIENTE);
    }

    public static void comprasRealizadas(List<Compra> compras) {
        if (compras.isEmpty()) {
            System.out.println(NENHUMA_COMPRA_REALIZADA);
            return;
        }
        System.out.println(COMPRAS_REALIZADAS);
        compras.sort(Comparator.comparing(Compra::getValor));
        compras.forEach(System.out::println);
    }

    public static void saldoAtual(Double saldo) {
        System.out.printf(SALDO_DO_CARTAO, saldo);
    }
}
