package desafio;

public class Conta {
    private Titular titular;
    private double saldo;
    private TipoConta tipoConta;

    public Conta(Titular titular, double saldo, TipoConta tipoConta) {
        this.titular = titular;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    public Titular getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
