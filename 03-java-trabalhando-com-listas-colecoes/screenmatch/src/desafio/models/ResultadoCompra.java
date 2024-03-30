package desafio.models;

public class ResultadoCompra {
    private boolean status;
    private int indiceDescricao;

    public ResultadoCompra() {
    }

    public ResultadoCompra setStatusCompra(boolean status) {
        this.status = status;
        return this;
    }

    public ResultadoCompra indiceDescricao(int indiceDescricao) {
        this.indiceDescricao = indiceDescricao;
        return this;
    }

    public String getDescricao() {
        return EnumResultadosCompra.values()[indiceDescricao].descricao();
    }

    public boolean isOk() {
        return status;
    }

}
