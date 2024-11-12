package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Menu {
    private static final int OPCAO_DEPOSITO = 1;
    private static final int OPCAO_SACAR = 2;
    private static final int OPCAO_CONSULTAR_SALDO = 3;
    private static final int OPCAO_SAIR = 0;

    public static void apresentacaoBanco() {
        System.out.println("Bem vindo ao ByteBank");
    }

    public static void menuPrincipal() {
        System.out.println("Escolha uma opção:");
        System.out.println("1: Depositar");
        System.out.println("2: Sacar");
        System.out.println("3: Consultar Saldo");
        System.out.println("0: Sair");
    }

    public static boolean loopSistema(int opcao, Scanner scanner) {
        Conta conta = new Conta();
        boolean resposta = true;

        switch (opcao) {
            case OPCAO_DEPOSITO:
                System.out.println("Digite o valor à ser depositado.");
                conta.setDeposito(scanner.nextDouble());
                if (conta.depositar()) {
                    System.out.println("Saldo atualizado para R$: " + conta.getSaldo());
                }
                System.out.println("O que deseja fazer agora?");
                break;
            case OPCAO_SACAR:
                System.out.println("Digite o valor à ser sacado.");
                conta.setSaque(scanner.nextDouble());
                if (conta.sacar()) {
                    System.out.println("Saldo atualizado para R$: " + conta.getSaldo());
                }
                System.out.println("O que deseja fazer agora?");
                break;
            case OPCAO_CONSULTAR_SALDO:
                System.out.println("O seu saldo é de R$: " + conta.getSaldo());
                System.out.println("O que deseja fazer agora?");
                break;
            case OPCAO_SAIR:
                System.out.println("Programa encerrado.");
                resposta = false;
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }

        return resposta;
    }
}
