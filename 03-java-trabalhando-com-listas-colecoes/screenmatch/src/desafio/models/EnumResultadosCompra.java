package desafio.models;

public enum EnumResultadosCompra {
    COMPRA_REALIZADA(0, "Compra realizada!"),
    COMPRA_NAO_REALIZADA_LIMITE(1, "Saldo insuficiente!"),
    COMPRA_NAO_REALIZADA_VALOR(2, "Compra não realizada. Valor inválido!");

    private final int codigo;
    private final String descricao;

    EnumResultadosCompra(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String descricao() {
        return descricao;
    }

    public int codigo() {
        return codigo;
    }

}
