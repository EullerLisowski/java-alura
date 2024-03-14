package desafio;

import java.util.Scanner;

public class Contabilizador {

    private Conta conta;
    private Scanner scannerInt;
    private Scanner scannerDouble;

    public Contabilizador(Conta conta) {
        this.conta = conta;
        scannerInt = new Scanner(System.in);
        scannerDouble = new Scanner(System.in);
    }

    public static void main(String[] args) {

        Conta contaEuller = new Conta(new Titular("Euller"), 0, TipoConta.CONTA_CORRENTE);
        Contabilizador contabilizador = new Contabilizador(contaEuller);
        contabilizador.exibeConta();
        contabilizador.leOperacao();
    }

    private void exibeConta() {
        System.out.println("**************************************************");
        System.out.printf("Nome do titular: %s\n", this.conta.getTitular().getNome());
        System.out.printf("Tipo de conta: %s\n", this.conta.getTipoConta());
        System.out.printf("Saldo inicial: %.2f\n", this.conta.getSaldo());
        System.out.println("**************************************************");
        System.out.println();
    }

    private void exibeMenu() {
        System.out.println();
        System.out.println("Operações: ");
        System.out.println("1 - Consultar saldos");
        System.out.println("2 - Receber valor");
        System.out.println("3 - Transferir valor");
        System.out.println("4 - Sair");
    }

    private void leOperacao() {
        this.exibeMenu();

        int opcao = leOpcao();

        switch (opcao) {
            case 1:
                imprimirSaldoAtualizado();
                leOperacao();
                break;
            case 2:
                receberValor();
                leOperacao();
                break;
            case 3:
                transferirValor();
                leOperacao();
                break;
            case 4:
                encerrar();
                break;
            default:
                System.out.println("Opção inválida!");
                leOperacao();
                break;
        }
    }

    private int leOpcao() {
        String input = scannerInt.nextLine();
        try {
            int opcao = Integer.parseInt(input);
            return opcao;
        } catch (Exception e) {
            System.out.println("Valor inválido! Digite um número.");
            return leOpcao();
        }
    }

    private double leValores() {
        System.out.println("Informe o valor: ");
        String input = scannerDouble.nextLine();
        try {
            double valor = Double.parseDouble(input);
            return valor;
        } catch (Exception e) {
            System.out.println("Valor inválido! Digite um número.");
            return leValores();
        }
    }

    private void imprimirSaldoAtualizado() {
        System.out.printf("Saldo atualizado: %.2f\n", consultaSaldo());
    }

    private double consultaSaldo() {
        return this.conta.getSaldo();
    }

    private void receberValor() {
        double valorRecebido = leValores();
        this.conta.setSaldo(valorRecebido);
        imprimirSaldoAtualizado();
    }

    private void transferirValor() {
        double valorTransferir = leValores();
        if (valorTransferir <= consultaSaldo()) {
            this.conta.setSaldo(consultaSaldo() - valorTransferir);
            imprimirSaldoAtualizado();
        } else {
            System.out.println("Não há saldo suficiente para fazer essa transferência.");
            System.out.println("Valor máximo a ser transferido: R$" + this.consultaSaldo());
        }
    }

    private void encerrar() {
        scannerInt.close();
        scannerDouble.close();
        return;
    }
}
