package dev.danilobarreto;
import java.util.Scanner;

class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso. Novo saldo: R$" + saldo);
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso. Novo saldo: R$" + saldo);
        }
    }

    public void verificarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }
}