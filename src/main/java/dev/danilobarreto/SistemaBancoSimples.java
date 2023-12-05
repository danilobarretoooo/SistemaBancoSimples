package dev.danilobarreto;

import java.util.Scanner;

public class SistemaBancoSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do titular da conta: ");
        String titular = scanner.nextLine();

        ContaBancaria conta = new ContaBancaria(titular);

        int opcao;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Depositar ");
            System.out.println("2. Sacar");
            System.out.println("3. Verificar Saldo");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a depositar: R$ ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;

                case 2:
                    System.out.print("Digite o valor a sacar: R$ ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;

                case 3:
                    conta.verificarSaldo();
                    break;

                case 0:
                    System.out.println("Sistema encerrado. ");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente. ");
            }

        } while (opcao != 0);

        scanner.close();
    }
}