package org.example;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static final int OPCAO_DEPOSITO = 1;
    private static final int OPCAO_SACAR = 2;
    private static final int OPCAO_CONSULTAR_SALDO = 3;
    private static final int OPCAO_SAIR = 0;

    public static double saldoAtual = 0.0;
    private static double vlrDeposito = 0.0;
    private static double vlrSaque = 0.0;
    private static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    private static boolean continuar = true;
    private static int opcao;

    public static void main(String[] args) {

        Main main = new Main();

        while (continuar) {
            opcao = scanner.nextInt();
            switch (opcao) {
                case OPCAO_DEPOSITO:
                    depositar();
                    break;
                case OPCAO_SACAR:
                    sacar();
                    break;
                case OPCAO_CONSULTAR_SALDO:
                    mostrarSaldo();
                    break;
                case OPCAO_SAIR:
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }

    private static void mostrarSaldo() {
        System.out.println("Saldo atual: " + saldoAtual);
    }

    private static void depositar() {
        vlrDeposito = scanner.nextDouble();
        saldoAtual += vlrDeposito;
        mostrarSaldo();
    }

    private static void sacar() {
        vlrSaque = scanner.nextDouble();
        if (vlrSaque > saldoAtual) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldoAtual -= vlrSaque;
            mostrarSaldo();
        }
    }
}